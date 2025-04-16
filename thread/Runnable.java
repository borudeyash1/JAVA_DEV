class runabble implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new runabble(), "Runnable-Thread-1");
        Thread t2 = new Thread(new runabble(), "Runnable-Thread-2");
        Thread t3 = new Thread(new runabble(), "Runnable-Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}