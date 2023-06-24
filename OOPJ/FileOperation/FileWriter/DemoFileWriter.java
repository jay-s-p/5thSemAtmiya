import java.io.FileWriter;
import java.io.IOException;

class DemoFileWriter {
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("name.txt");
        fw.write("Jay Parmar");
        fw.close();

    }
}