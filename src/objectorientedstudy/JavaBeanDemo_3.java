package objectorientedstudy;

/**
 * 定义一个标准的JavaBean类
 */

public class JavaBeanDemo_3 {

    // 1、成员变量，全部用private修饰

    private String name;
    private int age;


    // 2、构造方法：无参构造、全参构造
    public JavaBeanDemo_3(){}

    public JavaBeanDemo_3(String name, int age){

    }


    // 3、公共的访问方式：getXX(),setXX()

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
