package objectorientedstudy.duotaidemo;

public class Mouse extends Animal{
    @Override
    public void eat() {
        System.out.println(getName() + "吃大米");
    }
}
