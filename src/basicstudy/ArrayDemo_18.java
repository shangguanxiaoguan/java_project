package basicstudy;

public class ArrayDemo_18 {

    /**
     *   数组： 用来存储同一种数据类型多个元素的容器
     *      数据类型：基本类型； 引用类型
     *
     *   注意：
     *       数组长度在定义时指定，不可更改
     *
     *   数组的访问： 通过数组的索引访问数组的元素  数组名[索引]
     *
     */

    public static void main(String[] args) {

        // 案例：定义一个长度为3的int类型的数组

        // 格式1：
        int[] arr1 = new int[3];

        // 格式2：
        int[] arr2 = new int[]{1, 2, 3};

        //格式3：
        int[] arr3 = {4, 5, 6};

        /**
         * 数组元素的访问
         */

        // 案例2： 打印数组中的指定元素
        System.out.println(arr3[2]);

        arr3[1] = 30;
        System.out.println(arr3[1]);


        /**
         * 数组的遍历
         *
         *   结论：1。数组的最大索引为数组长度-1
         *        2。数组中未手动赋值的元素，有默认值0；
         *        3。直接输入数组变量名，得到的是数组的内存地址值
         *
         */
        
        int[] arr4 = new int[5];
        arr4[0] = 10;
        arr4[1] = 30;
        arr4[2] = 40;

        System.out.println(arr4);

        for (int i = 0; i < arr4.length; i++) {
            System.out.println(arr4[i]);
        }


        /**
         *   Java程序的内存分配：
         *       方法区：存储可运行的class文件，包含方法，静态成员，常量等
         *       栈：方法运行时使用的内存，特点是 "后进先出"
         *       堆：存储new出来的数组或对象
         *
         *   数组类型： 变量arr通过内存地址引用堆内存中的数组，所以数组是引用类型
         *
         *
         */


        /**
         *   案例： 获取 int[] 的最大值
         *
         */


        int[] arr = {22, 12, 43, 32, 78};
        // 定义一个临时变量，用来表示最大值
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp){
                temp = arr[i];
            }
        }
        System.out.println("数组最大值是：" + temp);


        /**
         *    结论：
         *      引用类型的变量作为参数传递给方法时，传递的是地址值
         *      基本类型的变量作为参数传递时，传递的是 值，相当于把值复制了一份
         */

        int x = 3;
        int y = 4;
        int z = sum(3, 4);
        System.out.println(x);   // 3
        System.out.println(y);   //  4
        System.out.println(z);
    }
    public static int sum(int a, int b){
        int c = a + b;
        a++;
        b++;
        return c;
    }

}
