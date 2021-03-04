package objectorientedstudy.abstractdemo;

public class Test {

    /**
     *
     * 抽象类：
     *       有抽象方法的类就是抽象类
     * 抽象方法：
     *       没有方法体的方法
     * 抽象方法的由来：
     *       当需要定义一个方法，却不明确方法的具体实现时，可以将方法定义为abstract，具体实现延迟到子类
     *
     *
     */

    /**
     *
     *
     */


    public static void main(String[] args) {
        Animal an = new Dog();
        an.eat();
    }

}
