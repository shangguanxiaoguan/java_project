package objectorientedstudy;

public class TestJavaBean {

    public static void main(String[] args) {
        // 通过无参创建对象
        JavaBeanDemo_3 jb = new JavaBeanDemo_3();
        jb.setName("张三");
        jb.setAge(28);
        System.out.println(jb.getName());
        System.out.println(jb.getAge());

        // 通过全参创建对象
        JavaBeanDemo_3 jb2 = new JavaBeanDemo_3("里斯",20);
        System.out.println(jb2.getName());
        System.out.println(jb2.getAge());
    }
}
