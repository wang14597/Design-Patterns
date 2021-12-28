package SingleCaseMode;
/*
* 枚举单列 最优单列实现方式
**/
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