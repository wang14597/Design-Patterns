package SingleCaseMode;
/*
* 用的时候才去检查有没有实例，如果有则返回，没有则新建。
* 存在线程不安全的行为
*/
public class SingleCaseMode02 {

    private static SingleCaseMode02 instance;

    private SingleCaseMode02(){

    }

    public SingleCaseMode02 getInstance() throws InterruptedException {

        if (instance==null){
            Thread.sleep(1);
            instance = new SingleCaseMode02();
        }
        return instance;
    }

    public void run(){
        SingleCaseMode02 instance1 = null;
        try {
            instance1 = new SingleCaseMode02().getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(instance1);
    }


    public static void main(String[] args) {
//        SingleCaseMode02 instance1 = new SingleCaseMode02().getInstance();
//        SingleCaseMode02 instance2 = new SingleCaseMode02().getInstance();
//        SingleCaseMode02 instance3 = new SingleCaseMode02().getInstance();
//        System.out.println(instance1);
//        System.out.println(instance2);
//        System.out.println(instance3);
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(()->new SingleCaseMode02().run());
            thread.start();

        }

    }
}
