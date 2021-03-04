package objectorientedstudy.abstractdemo2;

public class Cat extends Animal{

    /**
     * 小细节：在实际开发中，子类一般都有两个构造方法
     * 子类的空参构造访问父类的空参构造
     * 子类的全参构造访问父类的全参构造
     *
     * 这样方便快速实现实例化
     *
     */

    public Cat() {
    }

    public Cat(String name, String sex) {
        super(name, sex);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }
}
