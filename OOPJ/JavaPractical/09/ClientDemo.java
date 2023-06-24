/*
 * Client Server using DatagramPacket and DatagramSocket (UDP).
 */

import java.net.*;
import java.util.Scanner;

class ClientDemo {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost();
        byte data[] = null;

        while (true) {
            String input = sc.nextLine();
            data = input.getBytes();
            DatagramPacket dp = new DatagramPacket(data, data.length, ip, 1234);
            ds.send(dp);
        }
    }
}