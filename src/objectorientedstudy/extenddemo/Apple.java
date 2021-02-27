package objectorientedstudy.extenddemo;

public class Apple extends Fruit{
    // 成员变量
    int price = 10;

    public void show(){
        //局部变量
        int price = 5;

        System.out.println(price);
        System.out.println(this.price);
        System.out.println(super.price);
    }
}
