public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                try {
                    System.out.println("số lẻ "+i);
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
