
/*
 * Character.getNumericValue(int ascii);
 * returns the int value of the specified character.
 * as fileReader.read() return ascii
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("numbers.txt");
        FileWriter fileOdd = new FileWriter("odd.txt");
        FileWriter fileEven = new FileWriter("even.txt");

        int j;
        while ((j = fileReader.read()) != -1) {
            if (Character.getNumericValue(j) % 2 == 0) {
                fileEven.write(Character.getNumericValue(j) + "\n");
            } else {
                fileOdd.write(Character.getNumericValue(j) + "\n");
            }
        }

        fileEven.close();
        fileOdd.close();
        fileReader.close();
    }
}
