import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class DemoBufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("name.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Jay Parmar");

        bw.close();

    }
}