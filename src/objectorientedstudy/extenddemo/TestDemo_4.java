package objectorientedstudy.extenddemo;

public class TestDemo_4 {

    public static void main(String[] args) {
        ChildDemo_4 c = new ChildDemo_4();

        c.setName("张三");
        System.out.println(c.getName());

//        c.name = "lisi";

        /**
         *
         * Java中，子类只能继承父类的非私有成员（成员变量、成员方法）
         *
         */

    }
}
