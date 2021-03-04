package objectorientedstudy.abstractdemo2;

public class Test {

    /**
     *
     * 抽象类的特点：
     *    1。抽象类和抽象方法必须用abstract关键字修饰
     *    2。抽象方法不能实例化。
     *          要通过创建其子类对象来完成初始化操作
     *    3。抽象类的子类：
     *         如果是普通类：则必须重写所有的抽象方法
     *         如果是抽象类：则不用重写抽象方法
     *
     *  抽象类的成员特点：
     *      1。可以有普通的成员变量，也可以有成员常量
     *      2。可以有抽象方法，也可以有非抽象方法
     *      3。有构造方法，并且构造方法还可以重载
     *
     *   总结：
     *       抽象类的中的成员比普通类多一种：抽象方法
     *       其他和普通类一样
     *
     */

    public static void main(String[] args) {
        // 抽象类不能new（抽象类不能实例化）
        //Animal an = new Animal();

        // 初始化抽象类
        Animal an = new Cat();

        // 抽象类的成员特点
        an.name = "金毛";
        System.out.println(an.name);

        //an.AGE = 40;
        System.out.println(an.AGE);

        // 快速实例化对象
        Animal an2 = new Cat("牧羊犬", "女");
        System.out.println(an2.name);
        System.out.println(an2.sex);

    }

}
