import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Main {
    public static ArrayList<Byte> arr = new ArrayList<Byte>();
    public static void main(String args[]) throws InterruptedException {
        MyThread thread1 = new MyThread("thread1");
        MyThread2 thread2 = new MyThread2("thread2");
        thread1.start();
        thread2.start();
        while (true){
            System.out.println(" - " + arr.size());
//            arr.stream().forEach(System.out::print);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
