package SingleCaseMode;

public enum SingleEnum {
    INSTANCE;

    public void doSomething(){
        System.out.println("do............");
    }
}

class Main{

    public static void main(String[] args) {
        SingleEnum instance = SingleEnum.INSTANCE;
        instance.doSomething();
    }
}