package objectorientedstudy.finalandstaticdemo;

public class Test {

    /**
     *
     * final的作用：
     *   修饰类：该类不能被继承，但是可以继承其他的类
     *   修饰方法： 该方法不能被重写，不能与abstract共存
     *   修饰变量： 最终变量，即常量，只能赋值一次
     *            不建议修饰引用类型数据，因为仍然可以通过引用修改对象的内部数据，意义不大（地址值不能改变，但是属性值可以改变）
     *
     *
     *
     */


    /**
     *
     * static的作用：
     *    用于修饰类的成员：
     *        成员变量：类变量
     *        成员方法：类方法
     *
     *    调用方式：
     *        类名.成员变量名
     *        类名.成员方法名（参数）
     *
     *  static修饰成员变量：
     *        被本类所有对象共享
     *    注意事项：
     *       随意修改静态变量的值是有风险的，为了降低风险，可以同时用final关键字修饰，即公有静态常量
     *
     *
     *  static修饰成员方法：
     *        静态方法：
     *                静态方法中没有对象this，所以不能访问非静态成员
     *        静态方法的使用场景：
     *              只需要访问静态成员
     *              不需要访问对象状态，所需参数都由参数列表显示提供
     *
     *  需求：定义静态方法，反转数组中的元素
     *     A：先明确定义方法的三要素：
     *        方法名：reverse(反转)
     *        参数列表：int[] arr
     *        返回值类型：void
     *     B:遍历数组，交换数组索引为 i 和 length-1-i
     *     C：当索引 i >= (length - 1 - i)时，停止交换元素   交换次数：数组的长度/2
     *     D：在测试类中创建对象并使用
     *
     *
     */


    public static void main(String[] args) {
        ReverseArray.testNum();

        System.out.println("----------------");

        int[] arr = {2, 3, 66, 56, 65};

        ReverseArray.reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
