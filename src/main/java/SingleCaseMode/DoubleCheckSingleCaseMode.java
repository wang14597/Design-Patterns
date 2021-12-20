package SingleCaseMode;

/*
    双检锁在synchronized关键字内外都加了一层 if 条件判断，
    这样既保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间。
 */
public class DoubleCheckSingleCaseMode {

    private static DoubleCheckSingleCaseMode instance;

    private DoubleCheckSingleCaseMode() {
    }

    private static DoubleCheckSingleCaseMode getInstance() throws InterruptedException {
        if (null==instance){
            Thread.sleep(1);
            synchronized (DoubleCheckSingleCaseMode.class){
                if (null==instance){
                    instance = new DoubleCheckSingleCaseMode();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                DoubleCheckSingleCaseMode instance = null;
                try {
                    instance = DoubleCheckSingleCaseMode.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(instance);
            });
            thread.start();
        }
    }
}
