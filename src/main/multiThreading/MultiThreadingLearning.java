package multiThreading;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadingLearning {
    public static void main(String[] args) throws Exception {
//        MultiThreadingLearning.priority();
//        MultiThreadingLearning.joinLearn();
//        MultiThreadingLearning.daemon();
//        MultiThreadingLearning.main1();
//        MultiThreadingLearning.main2();
//        MultiThreadingLearning.CAS();
        MultiThreadingLearning.reentrantLock();

    }

    private static ReentrantLock reentrantLock = new ReentrantLock();

    private static void reentrantLock() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment2();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment2();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }

    public static void increment2() {
        reentrantLock.lock();
        try {
            count++;
        } finally {
            reentrantLock.unlock();
        }
    }

    private static void sout(String name, int nums) {
        System.out.println(name + ": " + nums);
    }

    private static void priority() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                MultiThreadingLearning.sout("t1", i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                MultiThreadingLearning.sout("t2", i);
            }
        });

        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

    private static void joinLearn() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 1) {
                try {
                    t1.join(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void daemon() throws InterruptedException {
        // 设置为守护线程，则主线程结束后直接推出，无需等待守护进程结束
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1:" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.setDaemon(true);
        t1.start();
    }

    private static int count;

    public static void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        synchronized (MultiThreadingLearning.class){
        count++;
//        }
    }

    public static void main1() throws InterruptedException {
        // 原子性 结果不等于200
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }

    private static AtomicInteger count2 = new AtomicInteger(0);

    public static void main2() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                count2.incrementAndGet();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                count2.incrementAndGet();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count2);
    }

    public static void CAS() throws Exception {
        AtomicStampedReference<String> reference = new AtomicStampedReference<>("AAA", 1);
        String oldValue = reference.getReference();
        int oldVersion = reference.getStamp();
        boolean b = reference.compareAndSet(oldValue, "BBB", oldVersion, oldVersion + 1);
        System.out.println(b);
        System.out.println(reference.getReference());
        boolean c = reference.compareAndSet("BBB", "CCC", 1, 2);
        System.out.println(c);
        System.out.println(reference.getReference());
    }
}

