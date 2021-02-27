package objectorientedstudy.duotaidemo.demo3;



public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    public void watch(){
        System.out.println("狗会看家");
    }
}
