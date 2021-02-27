package objectorientedstudy.duotaidemo.demo3;

public class Test {

    /**
     *
     * 多态的好处：
     *    可维护性
     *    可扩展性
     *
     * 多态的弊端：
     *    父类引用不能使用子类的特有成员
     *
     *     解决方案： 通过"类型转换"实现
     *
     *     注意：
     *         只能在继承层次内进行转换，否则会抛异常
     *         将父类对象转换成子类之前，使用instanceof进行检查
     *
     *         instanceof关键字的用法：
     *            对象名 instanceof 数据类型
     *            判断前边的对象是否是后边的数据类型
     *
     *
     */

    public static void main(String[] args) {
//        Animal an = new Animal();
        Animal an = new Dog();
        an.eat();

        // 调用watch方法，属于子类独有的方法
//        an.watch();

        // 正确的转换
//        Dog dog = (Dog) an;
//       dog.watch();

       //不正常的转换  ——》猫不是狗
        //Cat cat = (Cat) an;   // java.lang.ClassCastExceptio

        if (an instanceof Dog){
            Dog dog = (Dog) an;
            dog.watch();
        }



    }

}
