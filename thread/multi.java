class multi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        multi t1 = new multi();
        multi t2 = new multi();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start(); // starts thread 1
        t2.start(); // starts thread 2
    }
}