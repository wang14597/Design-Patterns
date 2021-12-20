package SingleCaseMode;
/*
* 静态内部类
* 只适用于静态域的情况
* */
public class SingleStaticClass {

    private static class SingleStaticClassHolder {
        private static final SingleStaticClass instance = new SingleStaticClass();
    }

    private SingleStaticClass(){

    }

    public static SingleStaticClass getInstance(){
        return SingleStaticClassHolder.instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                SingleStaticClass instance = SingleStaticClass.getInstance();
                System.out.println(instance);
            });
            thread.start();
        }
    }
}
