package objectorientedstudy;

public class TestPhone {
    public static void main(String[] args) {
        // 创建对象
        PhoneDemo_1 p = new PhoneDemo_1();

        // 调用成员变量，并打印
         // 给成员变量赋值
        p.brand = "iPhone";
        p.model = "SE Pro";
        p.name = "加班狗";

        System.out.println(p.brand);
        System.out.println(p.model);
        System.out.println(p.name);

        // 调用成员方法
        p.call("马云");
        p.send();
        p.playGame();

    }
}
