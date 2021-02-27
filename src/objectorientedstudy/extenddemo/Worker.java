package objectorientedstudy.extenddemo;

public class Worker extends Person{
    public Worker(){
//        super(); // 用于初始化父类成员的
        super("张三");
        System.out.println("Worker类的无参构造");
    }
}
