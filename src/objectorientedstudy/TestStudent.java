package objectorientedstudy;


/**
 *   成员位置：
 *       类中、方法外
 *
 *   局部位置：
 *       方法的参数列表  或者  方法体语句（方法内部）
 *
 *
 *   Java中使用变量的规则：*******
 *        使用变量遵循 "就近原则"，局部位置有，就使用
 *        没有就去类的成员位置找，有就使用，没有就报错
 *
 *
 *
 *    成员变量和局部变量的区别：
 *       1。定义位置：
 *                  成员变量：类中，方法外
 *                  局部变量：方法中，或形式参数
 *       2。初始化值：
 *                  成员变量：有默认初始化值
 *                  局部变量：无默认初始化值，必须先赋值再使用
 *
 *       3。作用范围：
 *                  成员变量：在类中
 *                  局部变量：在方法中
 *
 *       4。内存中的位置：
 *                  成员变量：堆内存
 *                  局部变量：栈内存
 *
 *       5。生命周期：
 *                  成员变量：随着对象的创建而存在，随着对象的消失而消失
 *                  局部变量：随着方法的调用而存在，随着方法调用完毕而消失
 *
 *       注意事项：
// *              局部变量和成员变量重名时，采用就近原则
 *
 */


/**
 *   private关键字的用法：
 *        特点：
 *            被修饰的成员只能在本类中使用
 *
 *        结论：
 *            private一般用于修饰成员变量
 *            public一般用于修饰成员方法
 *
 *
 */


/**
 *
 *   this关键字的用法：
 *        特点：
 *            每一个普通方法都有一个this，谁调用该方法，this就指向谁
 *
 *
 */



public class TestStudent {
    public static void main(String[] args) {
        StudentDemo_2 student = new StudentDemo_2();

//        student.name = "张三";
//        student.age = 23;
//
//        System.out.println(student.name);
//        System.out.println(student.age);

        // 设置值
        student.setAge(21);
        // 获取值
        System.out.println(student.getAge());

        System.out.println("-------------");


        student.setName("里斯");
        System.out.println(student.getName());

        System.out.println("--------------");

        // 调用成员方法
        student.study();


        System.out.println("--------------");
        student.show();

    }
}
