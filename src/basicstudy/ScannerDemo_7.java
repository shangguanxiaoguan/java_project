package basicstudy;

// 第一步：导包
import java.util.Scanner;

public class ScannerDemo_7 {
    public static void main(String[] args) {
        // 第二步：创建scanner对象
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数：");

        //  第三步：接收数据
        int input = scanner.nextInt();

        System.out.println("您输入的数字是：" + input);
    }
}
