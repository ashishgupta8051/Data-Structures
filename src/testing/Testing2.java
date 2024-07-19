package testing;

public class Testing2 extends Thread{
    @Override
    public void run() {
        super.run();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("testing.thread.Task 2 is running.");
    }
}
