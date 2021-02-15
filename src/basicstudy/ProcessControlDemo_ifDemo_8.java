package basicstudy;

import java.util.Scanner;

public class ProcessControlDemo_ifDemo_8 {

    /**
     * 1。流程控制结构的分类：
     *     顺序结构
     *       按照代码的顺序从上往上、从左往右执行
     *     选择（判断）结构
     *
     *     循环结构
     *
     *
     * 2.选择结构的分类：
     *   if语句（共有三种格式）；
     *     if一般用做区间值的判断
     *   switch语句：转换，切换
     *     switch一般用做固定值的判断
     *
     */

    public static void main(String[] args) {

        // if语句的第一种格式
        System.out.println("开始执行if语句的第一种格式");
        int a = 10;
        int b = 10;
        if (a == b){
            System.out.println("a 和 b 是相等的");
        }

        System.out.println("结束执行");

        // if语句的第二种格式
        System.out.println("开始执行if语句的第二种格式");
        if(a == b){
            System.out.println("a和b是相等的");
        }else{
            System.out.println("a和b不相等");
        }
        System.out.println("结束执行");

        // if语句的第三种格式
        System.out.println("开始执行if语句的第三种格式");

        int time = 9;
        if (time >= 0 && time <= 12){
            System.out.println("早上好");
        }else if (time >=13 && time <= 18){
            System.out.println("下上好");
        }else if (time >= 19 && time <= 24){
            System.out.println("晚上好");
        }else{
            System.out.println("系统没有这个时间");
        }

        System.out.println("结束执行");


        /**
         * 案例练习1：获取两个整数的较大值
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int input1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int input2 = scanner.nextInt();
        int max;
        if (input1 > input2){
            max = input1;
        }else{
            max = input2;
        }
        System.out.println("最大值是：" + max);

        int max2 = input1 > input2 ? input1 : input2;
        System.out.println("三元运算符求出的最大值是:" + max2);


        /**
         * 案例练习2：根据学生成绩输出对应级别
         */
        System.out.println("请输入学生成绩：");
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100){
            System.out.println("等级为皇帝");
        }else if(score < 90 && score >= 80){
            System.out.println("等级为宰相");
        }else if(score < 80 && score >= 70){
            System.out.println("等级为大臣");
        }else if(score < 70 & score >= 60){
            System.out.println("等级为县官");
        }else if(score < 60){
            System.out.println("等级为草民");
        }else{
            System.out.println("分数区间是1～100");
        }



    }

}
