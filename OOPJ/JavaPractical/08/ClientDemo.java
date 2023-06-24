/*
 * Client Server using Socket and ServerSocket (TCP).
 */

import java.net.*;
import java.io.*;

class ClientDemo {
    public static void main(String args[]) throws Exception {
        Socket s = new Socket("localhost", 4444);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        OutputStream os = s.getOutputStream();
        PrintStream ps = new PrintStream(os);

        InputStream is = s.getInputStream();
        BufferedReader br1 = new BufferedReader(new InputStreamReader(is));

        while (true) {
            String data = br.readLine();
            ps.println(data);
            String data1 = br1.readLine();
            System.out.println("Server : " + data1);
        }
    }
}