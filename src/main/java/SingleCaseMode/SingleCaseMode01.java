package SingleCaseMode;
/*
*   实例在初始化的时候就已经建好了，不管你有没有用到，都先建好了再说。
*   好处是没有线程安全的问题，坏处是浪费内存空间。
*/

public class SingleCaseMode01 {

    private static SingleCaseMode01 instance = new SingleCaseMode01();

    private SingleCaseMode01() {

    }

    public SingleCaseMode01 getInstance() {
        if (instance == null) {
            instance = new SingleCaseMode01();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleCaseMode01 instance1 = new SingleCaseMode01().getInstance();
        SingleCaseMode01 instance2 = new SingleCaseMode01().getInstance();
        SingleCaseMode01 instance3 = new SingleCaseMode01().getInstance();
        SingleCaseMode01 instance4 = new SingleCaseMode01().getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
        System.out.println(instance4);
    }
}
