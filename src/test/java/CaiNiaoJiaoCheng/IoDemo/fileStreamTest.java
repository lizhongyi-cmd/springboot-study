package CaiNiaoJiaoCheng.IoDemo;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class fileStreamTest {
    public static void main(String[] args) {
        try {
            String bWrite[] = {"hello","java"};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x = 0;x < bWrite.length;x++){
                os.write(1);
            }
            os.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
