package objectorientedstudy.duotaidemo;

public class TestDog {

    public static void main(String[] args) {

        // 多态
        Animal a = new Dog();


        /**
         *
         * 测试成员方法的调用：
         *   结论：多态中调用成员方法是"编译看左"（左边的类型有没有这个成员）
         *        "运行看右"（运行时具体用的是右边类中的该成员）
         *
         *
         *  成员变量的使用：
         *        多态关系中，成员变量不能被重写
         *     结论：多态关系中，使用成员变量，遵循"编译看左，运行看左"
         *       编译看左：编译期间看左边的类型有没有这个变量，有就不报错，没有就报错
         *       运行看左：运行期间使用的是左边的类型中的变量
         *
         */
        a.setName("哈士奇");
        a.eat();

        Dog  dog = new Dog();
        dog.setName("二哈");
        showAnimal(dog);

        Mouse mouse = new Mouse();
        mouse.setName("Jerry");
        showAnimal(mouse);


    }

    /**
     * 多态的做法：
     *     多态的使用场景：父类型可以作为形参的参数类型
     *                  这样可以接收其任意的子类对象
     *
     *
     * @param animal
     */
    public static void showAnimal(Animal animal){
        animal.eat();
    }

//    //传统做法
//    public static void showAnimal(Dog dog){
//        dog.eat();
//    }
//
//    public static void showAnimal(Mouse mouse){
//        mouse.eat();
//    }
}
