package objectorientedstudy.duotaidemo;

import com.sun.security.jgss.GSSUtil;

public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println(getName() + "吃骨头");
    }

}
