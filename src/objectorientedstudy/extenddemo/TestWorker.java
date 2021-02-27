package objectorientedstudy.extenddemo;

public class TestWorker {

    public static void main(String[] args) {
        Worker worker = new Worker();

    }


    /**
     *
     *   结论：
     *       子类所有构造方法的第一行都有一个默认的super()用于访问父类的无参构造方法
     *       如果父类没有无参构造，可以通过super(参数)的方式访问父类的带参构造
     *
     */


    /**
     *  方法重写：
     *     注意事项：父类私有方法无法重写
     *             子类方法访问权限不能小于父类方法
     *             子类不能比父类方法抛出更大的异常
     *
     *
     *
     */


}
