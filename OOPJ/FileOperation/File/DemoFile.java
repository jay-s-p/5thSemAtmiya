import java.io.File;
import java.io.IOException;

class DemoFile {
    public static void main(String[] args) throws IOException {

        File f = new File("abc.txt");
        System.out.println("f.exists() = " + f.exists());
        if (!f.exists()) {
            f.createNewFile();
        }

    }
}
