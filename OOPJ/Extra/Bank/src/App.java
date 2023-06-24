
/***************************************************************
 *
 * Bank program in JAVA
 * 
 * @author      Jay Parmar (@jay__s__p)
 * @version     5.0
 *
 ***************************************************************/

import java.util.Scanner;

import com.javabank.bank.User;
import com.javabank.bank.Account;
import com.javabank.bank.Captcha;
import com.javabank.bank.Database;
import com.javabank.bank.DatabaseError;

import java.util.InputMismatchException;

public class App {

    private static User user = null; /* for storing user data */
    private static Account account = null; /* for storing user's account data */
    private static String err = null; /* for storing error messages */
    private static Captcha c = new Captcha(); /* to generate and validate captcha */
    private static Database db = new Database(); /* to add/update user or account details in files(account.ser & user.ser) */
    private static final Scanner SC = new Scanner(System.in);

    private static byte choice;

    /* Different color style to apply in program */
    public static final String colorReset = "\033[0m"; /* Default Color */
    public static final String bgBlack = "\u001B[40m";
    public static final String bgRed = "\u001B[41m";
    public static final String colorBlue = "\033[0;94m";
    public static final String colorGreen = "\033[92m";
    public static final String colorGray = "\033[90m";
    public static final String grayStrike = "\033[9;30m";
    public static final String bgBlackYellowBold = "\033[1;93m\u001B[40m";
    public static final String cyanItalicUnderline = "\033[1;4;3;36m";

    /* Header Texts */
    private static final String WELCOME = "Welcome to the International bank,\n" + bgBlackYellowBold + """
            |                                                   |
            |                  => Java Bank <=                  |
            |                                                   |""" + colorReset;
    private static final String LOGIN = bgBlackYellowBold + """
            |                                                   |
            |                    => Login <=                    |
            |                                                   |""" + colorReset;
    private static final String REGISTER = bgBlackYellowBold + """
            |                                                  |
            |                  => Register <=                  |
            |                                                  |""" + colorReset;
    private static final String DASHBOARD = bgBlackYellowBold + """
            |                                                  |
            |                  => DashBoard <=                 |
            |                                                  |""" + colorReset;

    public static void main(String[] args) {

        /* user login/register page */
        loginRegister();

        /* After login/register goto home page */
        home();

    }

    private static void loginRegister() {

        Boolean success = false; /* flag to check if login/register is success or not */

        while (!success) {
            clrscr();
            println(WELCOME);

            /* If the any error generated this will show error message */
            if (err != null) {

                errorMessage(err);
                err = null;
            }

            println("\nPlease choose any option from this :");
            println(colorBlue + "1. Login");
            println("2. Register");
            println("3. Exit" + colorReset);
            inputPrint("\n\nEnter your choice here : ");

            choice = 0;
            try {
                choice = SC.nextByte();
            } catch (InputMismatchException e) {
                err = "Invalid input !";
                SC.nextLine(); /* clear the buffer */
            }

            clrscr();
            if (choice == 1) {
                success = login();
            } else if (choice == 2) {
                success = register();
            } else if (choice == 3) {
                exit(); /* Exit from the System. */
            } else {
                err = "Invalid input !";
            }

        }

    }

    private static Boolean login() {
        println(LOGIN);
        inputPrint("\nEnter username  : ");
        String username = SC.next();
        inputPrint("Enter password  : ");
        String password = SC.next();
        user = db.loginValidate(username, password);
        if (user == null) {
            err = ("Login details are Invalid");
            return false;
        }
        return true;
    }

    private static Boolean register() {

        println(REGISTER);

        String username, password, fName, lName;
        inputPrint("\nEnter your first name   : ");
        fName = SC.next();
        inputPrint("Enter your last name    : ");
        lName = SC.next();

        /* loop for checking username  */
        do {
            clrscr();
            println(REGISTER);
            if (err != null) {

                errorMessage(err);
                err = null;
            }
            inputPrint("\nEnter username          : ");
            username = SC.next();
            if (!db.usernameAvailable(username)) {
                err = "Username already taken!";
                continue;
            }
            break;
        } while (true);

        inputPrint("Enter password          : ");
        password = SC.next();

        try {
            user = new User(fName + " " + lName, username, password);
            if (user == null)
                return false;
            else {
                db.addData(user, null);
                return true;
            }
        } catch (DatabaseError e) {
            clrscr();
            errorMessage(e.getMessage());
            System.exit(1);
        }
        return true;
    }

    private static void home() {
        clrscr();
        println(DASHBOARD);

        /* If the user doesn't have an account... */
        if (user.getAccountCount() <= 0) {
            registerAccount();
            clrscr();
            println(DASHBOARD);
        }

        /* get the account details from database(from file "accounts.ser"))  */
        account = db.getAccount(user.getAccounts().get(0));

        if (account == null) {
            clrscr();
            errorMessage("account data damaged :(");
            System.exit(1);
        }

        long amount = 0;
        String msg = null;
        /* loop for account operations */
        while (true) {
            clrscr();
            println(DASHBOARD);
            if (err != null) {
                errorMessage(err);
                err = null;
            }
            if (msg != null) {
                successMessage(msg);
                msg = null;
            }
            println("\nHey " + cyanItalicUnderline + user.getName() + colorReset + ", welcome to Java Bank...");
            println("Please choose the operation you would like to perform :-");
            println(colorBlue + "1. Check balance");
            println("2. Deposit money");
            println("3. Withdrawal money");
            println("4. Exit" + colorReset);
            inputPrint("\nEnter your choice here : ");
            choice = 0;

            try {
                choice = SC.nextByte();
            } catch (InputMismatchException e) {
                SC.nextLine();
                err = "Invalid input !";
                continue;
            }

            switch (choice) {
                case 1:
                    amount = account.getBalance();
                    msg = "\nYour balance is " + String.format("%,d", account.getBalance()) + "rs";
                    continue;
                case 2:
                    clrscr();
                    if (!captchaVerification())
                        continue;
                    clrscr();
                    inputPrint("\nPlease enter the amount you wish to deposit : ");
                    try {
                        amount = SC.nextLong();
                        account.debitBalance(amount);
                        msg = "\nThe deposit amount has been added to your account SUCCESSFULLY !";
                    } catch (DatabaseError e) {
                        clrscr();
                        errorMessage(e.getMessage());
                        System.exit(1);
                    } catch (Exception e) {
                        SC.nextLine();
                        err = e.getMessage();
                    }
                    continue;
                case 3:
                    clrscr();
                    if (!captchaVerification())
                        continue;
                    clrscr();
                    inputPrint("\nPlease enter the amount you wish to withdrawal : ");
                    try {
                        amount = SC.nextLong();
                        account.creditBalance(amount);
                        msg = "\nYour withdrawal of " + amount + "rs has been SUCCESSFUL !";
                    } catch (DatabaseError e) {
                        clrscr();
                        errorMessage(e.getMessage());
                        System.exit(1);
                    } catch (Exception e) {
                        SC.nextLine();
                        err = e.getMessage();
                    }
                    continue;

                case 4:
                    exit();

                default:
                    err = "Invalid input !";
                    continue;
            }
        }

    }

    private static void registerAccount() {

        long money = 0;
        while (true) {

            clrscr();
            println(DASHBOARD);

            if (err != null) {
                errorMessage(err);
                err = null;
            }

            println("\nHey, " + cyanItalicUnderline + user.getName() + colorReset
                    + ",\nYou don't have any account...\n");
            println(colorBlue + "1. Create a account");
            println("2. Exit" + colorReset);
            inputPrint("\nEnter your choice here : ");

            choice = 0;
            try {
                choice = SC.nextByte();
            } catch (InputMismatchException e) {
                err = "Invalid input !";
                SC.nextLine(); /* clear the buffer */
            }

            clrscr();
            println(DASHBOARD);
            if (choice == 1) {
                print("\nPlease fill the following details to create your account...\n\n");
                inputPrint("Enter money more than " + Account.MIN_BALANCE + "rs to create account : ");
                try {
                    money = SC.nextLong();
                } catch (InputMismatchException e) {
                    SC.nextLine(); /* clears the buffer */
                    err = "Invalid value !";
                    continue;
                }
                if (money <= Account.MIN_BALANCE) {
                    clrscr();
                    println(DASHBOARD);
                    err = "Money must be grater than " + Account.MIN_BALANCE + " to create account !";
                    continue;
                }
                try {
                    account = user.createAccount(money, "saving");
                    return;
                } catch (DatabaseError e) {
                    clrscr();
                    errorMessage(e.getMessage());
                    System.exit(1);
                } catch (IllegalArgumentException e) {
                    err = e.getMessage();
                }
            } else if (choice == 2) {
                exit();
            } else {
                err = "Invalid input !"; /* set error message to print in above if block */
            }

        }
    }

    static void clrscr() {
        print("\033[H\033[2J");
    }

    static void print(String s) {
        System.out.print(s);
    }

    static void println(String s) {
        System.out.println(s);
    }

    static void inputPrint(String s) {
        System.out.print(colorGray + s + colorReset);
    }

    static void errorMessage(String s) {
        System.out.println("");
        println(bgRed + "     ERROR : " + s + "     " + colorReset);
    }

    static void successMessage(String s) {
        System.out.println("");
        println(colorGreen + s + colorReset);
    }

    static boolean captchaVerification() {
        System.out.println("\n");
        println(String.format("             %s-----------------%s", colorGray, colorReset));
        println(String.format("Captcha    : %s|     %s%s%s%s     |%s",
                colorGray, grayStrike, c.generateCaptcha(), colorReset, colorGray, colorReset));
        println(String.format("             %s-----------------%s", colorGray, colorReset));

        inputPrint("\n\nEnter Captcha : ");
        if (c.validateCaptcha(SC.next())) {
            return true;
        } else {
            err = "Invalid Captcha!!!";
            return false;
        }
    }

    private static void exit() {
        clrscr();
        System.out.println(
                "\n\n\n\n\n\033[1;90m\033[3;93mT\033[3;91m\033[3;92mh\033[3;93m\033[3;94ma\033[3;95mn\033[3;96mk \033[3;97my\033[3;96mo\033[3;95mu \033[3;94mf\033[3;93mo\033[3;92mr \033[3;91mv\033[3;90mi\033[3;94ms\033[3;92mi\033[3;93mt\033[3;94mi\033[3;95mn\033[3;96mg\033[3;90m :\033[3;92m)\033[0m\n\n\n\n\n");
        System.exit(0);
    }
}
