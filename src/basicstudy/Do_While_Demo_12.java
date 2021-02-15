package basicstudy;

public class Do_While_Demo_12 {
    public static void main(String[] args) {
        // 案例1：学完一个知识，至少练习1次

        int count = 1;
        boolean isOk = false;  // 用来标记是否学会这个知识点
        do {
            System.out.println("正在进行第" + count + "次练习");
            if (count >= 3){
                isOk = true;
            }
            count++;
        }while(!isOk);

    }
}
