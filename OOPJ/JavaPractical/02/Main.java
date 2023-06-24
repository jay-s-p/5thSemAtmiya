import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
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
