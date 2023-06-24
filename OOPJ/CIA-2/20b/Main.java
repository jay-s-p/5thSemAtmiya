import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("numbers.txt");
            fw.write("0123456789");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        try {
            FileReader fr = new FileReader("numbers.txt");
            String data = "";
            int x = fr.read();
            while (x != -1) {
                data += (char) x;
                x = fr.read();
            }
            System.out.println(data);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
