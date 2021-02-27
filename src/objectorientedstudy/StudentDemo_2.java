package objectorientedstudy;

public class StudentDemo_2 {



    // 成员变量
    private String name = "戴琳";    // 验证 this 关键字
    private int age;  //验证 private 关键字

    /**
     *  提供公共的访问方式，分别设置值，获取值
     *
     */
    public void setAge(int a){
        age = a;
    }

    /**
     * 获取age的值
     * @return
     */
    public int getAge(){
        return age;
    }

    /**
     *  this关键字的用法
     * @param name
     */

    public void setName(String name){
//        this.name = name;
        name = name;
    }

    public String getName(){
        return name;
    }




    public void study(){

        // 局部变量
        String name = "小黑";
        System.out.println( name + "正在学习。。。");
    }


    public void show(){
        String name = "熊琳";
        System.out.println(name);
        System.out.println(this.name);
    }


    /**
     * 构造方法
     */

    // 无参构造
    public StudentDemo_2(){}

    // 有参构造
    public StudentDemo_2(String name, int age){
        this.name = name;
        this.age = age;
    }


}
