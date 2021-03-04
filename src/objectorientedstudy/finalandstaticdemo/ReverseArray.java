package objectorientedstudy.finalandstaticdemo;


/**
 *
 *  案例：反转数组
 *
 */
public class ReverseArray {

    int num1 = 20;
    static int num2 = 34;

    public static void testNum(){
        // 静态方法不能访问非静态成员
        //System.out.println(num1);
        System.out.println(num2);
    }

    public static void reverse(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 -i] = temp;
        }
    }

}
