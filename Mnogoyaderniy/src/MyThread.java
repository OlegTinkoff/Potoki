public class MyThread extends Thread{
    String nameThread = "";

    MyThread(String nameThread) {
        this.nameThread = nameThread;
    }

    public synchronized void run() {
        for (int i = 0; i < 10000; i++) {
            Main.arr.add((byte)1);
        }
    }
}
