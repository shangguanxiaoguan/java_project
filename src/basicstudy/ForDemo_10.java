package basicstudy;

public class ForDemo_10 {

    /**
     * 1.循环结构的分类：
     *    for循环
     *    while循环
     *    do...while循环
     *
     * 2。三种循环结构的区别：
     *    A。格式不同
     *    B。初始化语句不同
     *    C。循环体的执行次数不同
     *    D。使用场景不同
     *
     *
     * */

    public static void main(String[] args) {

        // 案例1：打印五次
        for (int i = 1; i <=5; i++){
            System.out.println("Hello World!");
        }
        System.out.println("---------------");
        // 案例2：在控制台输出1-5；在控制台输出5-1
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        System.out.println("---------------");
        // 在控制台输出5-1
        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }

        System.out.println("---------------");

        // 案例3：计算1-5之间的数据之和，并输出总和
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            sum += i;
        }
        System.out.println("1-5之间的数据之和为：" + sum);

        System.out.println("---------------");

        // 案例4：求出1-100之间的偶数和
        int sum2 = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                sum2 += i;
            }
        }
        System.out.println("1-100之间的偶数和为：" + sum2);

        // 案例4：在控制台输出所有的"水仙花数"
         // 分析：
           // 水仙花数；指一个三位数，其各位数字的立方和等于该数本身
           // 举例：153 = 1*1*1 + 5*5*5 + 3*3*3 = 1+125+27
           /*
             步骤：1。获取所有的三位数，即100-1000之间的数
                  2。获取每一个三位数的个位，十位，百位
                     个位：153 % 10 = 3
                     十位：153 / 10 % 10 = 5
                     百位：153 / 10 /10 % 10 = 1
                  3。拿个位，十位，百位的立方和与该数本身进行比较，如果相等，则打印出来
            */
        System.out.println("--------------");
        System.out.println("找出所有的水仙花数：");
        int count = 0;
        for (int i = 100; i <1000; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;

            if (ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("水仙花的总个数：" + count);

    }
}
