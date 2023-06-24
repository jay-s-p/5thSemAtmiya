import java.io.*;

/*
 * Write a program to copy data from one file and
 * read from that file using BufferedWriter and BufferedReader.
 */

class Main {
    public static void main(String[] args) throws IOException {

        FileReader file1 = new FileReader("file-1.txt");
        BufferedReader br = new BufferedReader(file1);
        String data = "", x;
        x = br.readLine();
        while (x != null) {
            data += (x + "\n");
            x = br.readLine();
        }
        br.close();

        FileWriter file2 = new FileWriter("file-2.txt");
        BufferedWriter bw = new BufferedWriter(file2);
        bw.write(data);
        bw.close();

    }
}
