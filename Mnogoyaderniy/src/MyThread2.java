public class MyThread2 extends Thread{
    String nameThread = "";

    MyThread2(String nameThread) {
        this.nameThread = nameThread;
    }

    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            Main.arr.add((byte)0);
        }
    }
}
