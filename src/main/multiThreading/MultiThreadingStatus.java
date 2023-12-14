package multiThreading;


public class MultiThreadingStatus {
    public static void main(String[] args) throws Exception {
        MultiThreadingStatus.newStatus();
        MultiThreadingStatus.runnableStatus();
        MultiThreadingStatus.blockedStatus();
        MultiThreadingStatus.timedWaitingStatus();
        MultiThreadingStatus.terminatedStatus();
    }

    public static void newStatus(){
        // 新建线程对象，未启动
        Thread newThread = new Thread(() -> System.out.println("new thread"));
        System.out.println(newThread.getState());
    }

    public static void runnableStatus() throws InterruptedException {
        // 线程启动后且没有被锁住
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        System.out.println(thread.getState());
    }


    private static void blockedStatus() throws InterruptedException {
        // 线程启动执行，但未获取锁资源，需等待上个有锁的线程释放锁，即被block
        Object o = new Object();
        Thread thread = new Thread(()->{
            synchronized (o) {
                System.out.println();
            }
        });

        synchronized (o){
            thread.start();
            Thread.sleep(500);
            System.out.println(thread.getState());
        }
    }

    private static void waitingStatus() throws Exception {
        // 程序执行调用wait(),处于wait状态，需要手动唤醒
        Object o = new Object();
        Thread thread = new Thread(() -> {
            synchronized (o) {
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        Thread.sleep(200);
        System.out.println(thread.getState());
    }

    private static void timedWaitingStatus() throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread.start();
        Thread.sleep(500);
        System.out.println(thread.getState());
    }

    private static void terminatedStatus() throws InterruptedException {
        // run方法执行完毕，线程生命周期到头了
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        Thread.sleep(1000);
        System.out.println(t1.getState());
    }
}
