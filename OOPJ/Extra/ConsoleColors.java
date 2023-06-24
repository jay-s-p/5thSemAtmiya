/*
 * 
 * https://www.codeproject.com/Tips/5255355/How-to-Put-Color-on-Windows-Console
 * 
 */

class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m"; // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m"; // BLACK
    public static final String RED = "\033[0;31m"; // RED
    public static final String GREEN = "\033[0;32m"; // GREEN
    public static final String YELLOW = "\033[0;33m"; // YELLOW
    public static final String BLUE = "\033[0;34m"; // BLUE
    public static final String PURPLE = "\033[0;35m"; // PURPLE
    public static final String CYAN = "\033[0;36m"; // CYAN
    public static final String WHITE = "\033[0;37m"; // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m"; // BLACK
    public static final String RED_BOLD = "\033[1;31m"; // RED
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m"; // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m"; // CYAN
    public static final String WHITE_BOLD = "\033[1;37m"; // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m"; // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m"; // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m"; // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m"; // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m"; // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m"; // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m"; // BLACK
    public static final String RED_BACKGROUND = "\033[41m"; // RED
    public static final String GREEN_BACKGROUND = "\033[42m"; // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m"; // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m"; // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m"; // BLACK
    public static final String RED_BRIGHT = "\033[0;91m"; // RED
    public static final String GREEN_BRIGHT = "\033[0;92m"; // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m"; // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m"; // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m"; // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m"; // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m"; // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m"; // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m"; // WHITE

    // JAVA terminal colors
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static void main(String[] args) {
        System.out.println(RESET + "RESET");
        System.out.println(BLACK + "BLACK");
        System.out.println(RED + "RED");
        System.out.println(GREEN + "GREEN");
        System.out.println(YELLOW + "YELLOW");
        System.out.println(BLUE + "BLUE");
        System.out.println(PURPLE + "PURPLE");
        System.out.println(CYAN + "CYAN");
        System.out.println(WHITE + "WHITE");
        System.out.println(BLACK_BOLD + "BLACK_BOLD");
        System.out.println(RED_BOLD + "RED_BOLD");
        System.out.println(GREEN_BOLD + "GREEN_BOLD");
        System.out.println(YELLOW_BOLD + "YELLOW_BOLD");
        System.out.println(BLUE_BOLD + "BLUE_BOLD");
        System.out.println(PURPLE_BOLD + "PURPLE_BOLD");
        System.out.println(CYAN_BOLD + "CYAN_BOLD");
        System.out.println(WHITE_BOLD + "WHITE_BOLD");
        System.out.println(BLACK_UNDERLINED + "BLACK_UNDERLINED");
        System.out.println(RED_UNDERLINED + "RED_UNDERLINED");
        System.out.println(GREEN_UNDERLINED + "GREEN_UNDERLINED");
        System.out.println(YELLOW_UNDERLINED + "YELLOW_UNDERLINED");
        System.out.println(BLUE_UNDERLINED + "BLUE_UNDERLINED");
        System.out.println(PURPLE_UNDERLINED + "PURPLE_UNDERLINED");
        System.out.println(CYAN_UNDERLINED + "CYAN_UNDERLINED");
        System.out.println(WHITE_UNDERLINED + "WHITE_UNDERLINED");
        System.out.println(BLACK_BACKGROUND + "BLACK_BACKGROUND");
        System.out.println(RED_BACKGROUND + "RED_BACKGROUND");
        System.out.println(GREEN_BACKGROUND + "GREEN_BACKGROUND");
        System.out.println(YELLOW_BACKGROUND + "YELLOW_BACKGROUND");
        System.out.println(BLUE_BACKGROUND + "BLUE_BACKGROUND");
        System.out.println(PURPLE_BACKGROUND + "PURPLE_BACKGROUND");
        System.out.println(CYAN_BACKGROUND + "CYAN_BACKGROUND");
        System.out.println(WHITE_BACKGROUND + "WHITE_BACKGROUND");
        System.out.println(BLACK_BRIGHT + "BLACK_BRIGHT");
        System.out.println(RED_BRIGHT + "RED_BRIGHT");
        System.out.println(GREEN_BRIGHT + "GREEN_BRIGHT");
        System.out.println(YELLOW_BRIGHT + "YELLOW_BRIGHT");
        System.out.println(BLUE_BRIGHT + "BLUE_BRIGHT");
        System.out.println(PURPLE_BRIGHT + "PURPLE_BRIGHT");
        System.out.println(CYAN_BRIGHT + "CYAN_BRIGHT");
        System.out.println(WHITE_BRIGHT + "WHITE_BRIGHT");
        System.out.println(BLACK_BOLD_BRIGHT + "BLACK_BOLD_BRIGHT");
        System.out.println(RED_BOLD_BRIGHT + "RED_BOLD_BRIGHT");
        System.out.println(GREEN_BOLD_BRIGHT + "GREEN_BOLD_BRIGHT");
        System.out.println(YELLOW_BOLD_BRIGHT + "YELLOW_BOLD_BRIGHT");
        System.out.println(BLUE_BOLD_BRIGHT + "BLUE_BOLD_BRIGHT");
        System.out.println(PURPLE_BOLD_BRIGHT + "PURPLE_BOLD_BRIGHT");
        System.out.println(CYAN_BOLD_BRIGHT + "CYAN_BOLD_BRIGHT");
        System.out.println(WHITE_BOLD_BRIGHT + "WHITE_BOLD_BRIGHT");
        System.out.println(BLACK_BACKGROUND_BRIGHT + "BLACK_BACKGROUND_BRIGHT");
        System.out.println(RED_BACKGROUND_BRIGHT + "RED_BACKGROUND_BRIGHT");
        System.out.println(GREEN_BACKGROUND_BRIGHT + "GREEN_BACKGROUND_BRIGHT");
        System.out.println(YELLOW_BACKGROUND_BRIGHT + "YELLOW_BACKGROUND_BRIGHT");
        System.out.println(BLUE_BACKGROUND_BRIGHT + "BLUE_BACKGROUND_BRIGHT");
        System.out.println(PURPLE_BACKGROUND_BRIGHT + "PURPLE_BACKGROUND_BRIGHT");
        System.out.println(CYAN_BACKGROUND_BRIGHT + "CYAN_BACKGROUND_BRIGHT");
        System.out.println(WHITE_BACKGROUND_BRIGHT + "WHITE_BACKGROUND_BRIGHT");
        System.out.println(ANSI_BLACK_BACKGROUND + "ANSI_BLACK_BACKGROUND");
        System.out.println(ANSI_RED_BACKGROUND + "ANSI_RED_BACKGROUND");
        System.out.println(ANSI_GREEN_BACKGROUND + "ANSI_GREEN_BACKGROUND");
        System.out.println(ANSI_YELLOW_BACKGROUND + "ANSI_YELLOW_BACKGROUND");
        System.out.println(ANSI_BLUE_BACKGROUND + "ANSI_BLUE_BACKGROUND");
        System.out.println(ANSI_PURPLE_BACKGROUND + "ANSI_PURPLE_BACKGROUND");
        System.out.println(ANSI_CYAN_BACKGROUND + "ANSI_CYAN_BACKGROUND");
        System.out.println(ANSI_WHITE_BACKGROUND + "ANSI_WHITE_BACKGROUND");
        System.out.println(RESET + "RESET");

    }
}