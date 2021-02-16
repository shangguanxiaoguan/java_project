package basicstudy;

public class OverloadDemo_17 {

    /**
     *   方法重载：方法名相同，参数列表不同（参数的个数不同，对应位置的参数类型不同）
     *
     *   方法签名：方法名 + 参数列表
     *
     *   为什么需要方法重载：
     *     当实现的功能相同，但具体的实现方式不同时，可以通过定义名称相同，参数不同的方法，
     *     来更好的识别和管理类中的方法
     *
     *   注意： 方法的重载与方法的返回值类型无关
     *
     */

    // 案例：比较两个int/long/double型的数据是否相同
    public static void main(String[] args) {
        System.out.println(compare(2, 4));
        System.out.println(compare(20L, 40L));
        System.out.println(compare(2.4, 2.4));
    }

    public static boolean compare(int a, int b){
        System.out.println("比较两个int类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(long a, long b){
        System.out.println("比较两个long类型的数据是否相同");
        return a == b;
    }

    public static boolean compare(double a, double b){
        System.out.println("比较两个double类型的数据是否相同");
        return a == b;
    }

    public static int compare(){
        return 10;
    }


}
