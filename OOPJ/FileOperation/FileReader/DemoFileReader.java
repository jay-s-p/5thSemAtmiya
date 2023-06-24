import java.io.FileReader;
import java.io.IOException;

class DemoFileReader {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("name.txt");

        /* Print text from file */

        /***** Method-1 *****/
        // int j = fr.read();
        // while (j != -1) {
        //     System.out.println((char) j);
        //     j = fr.read();
        // }

        /***** Method-2 *****/
        // int k;
        // while ((k = fr.read()) != -1) {
        //     System.out.println((char) k);
        // }

        /***** Method-3 *****/
        // char a[] = new char[100];
        // fr.read(a);
        // System.out.println(a);

        fr.close();
    }
}