package basicstudy;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo_15 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);  // 0-9
        System.out.println(num);


        // 案例：猜数字的游戏
        int a = random.nextInt(100) + 1; // 1-100
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜的数字：");
            int input = scanner.nextInt();
            if (input > a){
                System.out.println("猜大了");
            }else if (input < a){
                System.out.println("猜小了");
            }else{
                System.out.println("厉害了，猜对了！");
                break;
            }
        }



    }
}
