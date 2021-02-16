package objectorientedstudy;

/*
*
*   定义一个手机类
*
* */
public class PhoneDemo_1 {

    // 成员变量：定义在类中，方法外的变量

    String brand;
    String model;
    String name;

    //成员方法：先不写static修饰符
    public void call(String name){
        System.out.println("给" + name + "打电话");
    }

    public void send(){
        System.out.println("发短信");
    }

    public void playGame(){
        System.out.println("打游戏");
    }

}
