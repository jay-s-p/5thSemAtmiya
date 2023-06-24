import java.net.*;

class ServerDemo {
    public static void main(String args[]) throws Exception {
        DatagramSocket ds = new DatagramSocket(1234);
        byte data[] = new byte[65535];
        DatagramPacket packet;

        while (true) {
            packet = new DatagramPacket(data, data.length);
            ds.receive(packet);

            String str = "";
            for (int i = 0; data[i] != 0; i++) {
                str += ((char) data[i]);
            }

            System.out.println(str);
            data = new byte[65535];
        }
    }
}