import java.net.*;
import java.io.*;

class ServerDemo {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(4444);
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data1 = br.readLine();
            System.out.println("Client : " + data1);
            String data = br2.readLine();
            ps.println(data);
        }
    }
}