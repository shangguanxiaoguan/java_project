package basicstudy;

public class WhileDemo_11 {
    public static void main(String[] args) {
        // 打印五次
        int i = 1;
        while(i <= 5){
            System.out.println("Hello World!");
            i++;
        }

        System.out.println("---------------------");

        // 案例1：求 1-100的数据和
        int sum = 0;
        int j = 1;
        while (j <= 100){
            sum += j;
            j++;
        }
        System.out.println("1-100的数据和：" + sum);

    }
}
