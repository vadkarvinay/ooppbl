class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread1: " + i);
            try {
                Thread.sleep(1000); // 1 second
            } catch (Exception e) {}
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread2: " + i);
            try {
                Thread.sleep(500); // 0.5 second
            } catch (Exception e) {}
        }
    }
}

public class practical_23 {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
