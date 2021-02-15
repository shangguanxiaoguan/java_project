package basicstudy;

public class OperatorDemo_6 {
    /*
    1。运算符概述：对常量和变量进行运算操作的符号
    2。常见的运算符：算术运算符、赋值运算符、关系运算符、逻辑运算符、三元运算符
    3。表达式：用运算符把常量或变量连接起来的式子

    算术运算符：
       1，常见的算术运算符：+ - * / %
       2，Java中整数除以整数，结果还是整数
       3，/ 表示两数相除的商， % 表示两数相除的余数
       4，浮点数参与运算，结果是浮点数类型


    字符和字符串参与加法运算：
       'a'   97
       'A'   65
       '0'   48
      加法运算的特点：
        1。加号两边是数值型数据时，进行加法运算
        2。加号两边有任意一边是字符串时，进行字符串的拼接
        3。字符型数据参与算术运算，是用字符在计算机中存储的数据来运算


     自增和自减运算符：
        1。++自增1， --自减1
        2。单独使用时，放在变量前、后，效果一致
        3。与其他操作一起使用时：
                放在变量前，先自增或自减，再进行其他运算
                放在变量后，先以原值进行其他运算，再自增或自减


     赋值运算符：
        1。常见的赋值运算符： =、+=、*=、-=、/=、%=  （=是基本运算符）
        2。扩展赋值运算符的好处：自动强转（省略了强制类型转换的操作）
        3。注意：
              =表示赋值操作，不是相等
              ==用来表示相等

     关系运算符：
        1。关系运算符是用来描述两个变量的大小是否为相等关系的
        2。常见的关系运算符：> <  ==  !=  >= <=
        3.  注意：关系运算符== 和赋值运算符= 的区别

     逻辑运算符：
        1。用于判断"并且"、"或者"、"除非"等逻辑关系的运算符
        2。逻辑运算符两端连接关系表达式，或逻辑表达式
        3。逻辑运算符的运算结果为布尔值：true或false
        4。偶数个逻辑非！，结果不变

     三元运算符：
        1。格式：（关系表达式）? 表达式1 : 表达式2；
        2。执行流程：
             关系表达式结果为true，三元运算符结果为表达式1；
             关系表达式结果为false，三元运算符结果为表达式2；


     */

    public static void main(String[] args) {
        // 字符的加法运算
        int a = 10;
        char ch = 'a';
        System.out.println(a + ch);  // 107

        /** 字符串的加法运算*/
        System.out.println("hello" + "world");
        System.out.println("hello" + 10);      // "hello10"
        System.out.println("hello" + 10 + 20); // "hello1020"
        System.out.println(10 + 20 + "hello"); // "30hello"

        /**自增和自减运算*/
        int aa = 5;
         // 单独使用
//        aa++;
//        System.out.println("aa:" + aa);  //6

//        ++aa;
//        System.out.println("aa:" + aa);  //6

        //自增参与运算
        // ++在后
//        int bb = aa++;
//        System.out.println("aa:" + aa);  //6
//        System.out.println("bb:" + bb);  //5

        // ++ 在前
        int cc = ++aa;
        System.out.println("aa:" + aa);  //6
        System.out.println("cc:" + cc);  //6

        /**扩展赋值运算符*/

        int fz = 10;
        fz+=20;
        System.out.println(fz);

        // 扩展运算符的好处
        short fz2 = 2;
//        fz2 = fz2 + 3;   //会报错

//        //解决方案一：强制类型转换
//        fz2 = (short) (fz2 + 3);
//        System.out.println(fz2);

        //解决方案二：扩展运算符
        fz2 += 3;
        System.out.println(fz2);


        /**
         * 使用三元运算符求两个整数的最大值
         */
        int s1 = 10;
        int s2 = 20;
        int max = (s1 >= s2) ? s1 : s2;
        System.out.println("max:" + max);


    }
}
