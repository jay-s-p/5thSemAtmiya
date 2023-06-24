public class DestroyPC {
    public static void main(String[] args) {
        while (true) {
            new Thread() {
                @Override
                public void run() {
                    System.out.print(this.getId() + " ");
                    try {
                        Thread.sleep(999999999);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
