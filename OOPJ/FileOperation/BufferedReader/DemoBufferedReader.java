import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class DemoFileReader {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("name.txt");
        BufferedReader br = new BufferedReader(fr);

        /* Print text from file */

        /***** Method-1 *****/
        // String str = br.readLine();
        // while (str != null) {
        //     System.out.println(str);
        //     str = br.readLine();
        // }

        /***** Method-2 *****/
        // String str;
        // while ((str = br.readLine()) != null) {
        //     System.out.println(str);
        // }

        br.close();
    }
}