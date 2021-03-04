package objectorientedstudy.abstractdemo2;

public abstract class Animal {

    // 成员变量：其值可以改变
    String name = "哈士奇";

    String sex = "男";

    // 成员常量：其值不能发生改变
    final int AGE = 30;

    public Animal() {
    }

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public abstract void eat();

    public abstract void sleep();
}
