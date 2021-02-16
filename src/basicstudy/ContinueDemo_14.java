package basicstudy;

public class ContinueDemo_14 {
    /*
    * continue:
    *   继续，用于循环语句，表示结束本次循环，继续下次循环
    *
    * */

    public static void main(String[] args) {
        //案例：逢 7 必过的游戏（包含7 或者是7的倍数）
        for (int i = 1; i <= 100; i++){
            if (i%10==7 || i/10%10==7 || i%7==0){
                System.out.println(".....");
                continue;
            }
            System.out.println(i);
        }
    }
}
