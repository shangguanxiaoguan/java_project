package basicstudy;

public class BreakDemo_13 {
    /*
    * break:
    *    中断，用于switch语句和循环语句
    *       在switch语句中，表示结束switch代码块
    *       在循环语句中，表示结束循环
    *
    * */

    public static void main(String[] args) {
        //案例：查找班级编号为3的同学
         for (int i = 1; i <= 15; i++){
             System.out.println("我是编号为" + i + "的同学");
             if (i == 3){
                 System.out.println("找到了编号为3的同学");
                 break;
             }
         }


        /**
         *   带标号的循环结束
         *
         */

        /*
        * 案例：现有3个班级，每班10个同学
        *      假设第2个班级的第5个同学叫程序员，找到该同学并打印
        *
        * */

        label_class:for (int i = 1; i < 4; i++) {  //外循环
            for (int j = 1; j < 11; j++) {  //内循环
                System.out.println("第"+ i + "个班级的第" + j + "个学生");
                if (i == 2 && j == 5){
                    System.out.println("找到程序员了！");
//                    break;    // 这样写只是结束了内循环
                    break label_class;  // 这样才是结束了整个循环
                }
            }
            System.out.println();  // 换行
        }

    }
}
