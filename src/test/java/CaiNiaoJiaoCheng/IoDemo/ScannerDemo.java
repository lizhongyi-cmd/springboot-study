package CaiNiaoJiaoCheng.IoDemo;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //从键盘接受数据
        Scanner scan = new Scanner(System.in);

        //next方式接收字符串
        // next一定要读到有效字符串之后才可以结束输入

        System.out.println("next方式接收：");
        if(scan.hasNextLine()){
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();

    }
}
