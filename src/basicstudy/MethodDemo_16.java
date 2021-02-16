package basicstudy;

import java.util.Scanner;

public class MethodDemo_16 {
    public static void main(String[] args) {

        int c = sum(2, 5);
        System.out.println(c);

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

    }

    /*
    * 注意：
    *     方法和方法是平级的关系，不能嵌套定义
    *
    *     要定义方法，注意三个明确：
    *       明确方法名
    *       明确返回值的类型
    *       明确参数列表
    *
    *
    * */

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }


    public static boolean compare(int a, int b){
        return a == b;
    }







}
