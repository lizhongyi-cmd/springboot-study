package CaiNiaoJiaoCheng;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springboot-study
 * @description:
 * @author: lizhongyi3
 * @create: 2021-12-26 18:28
 **/
public class DateDemo {
    public static void main(String[] args) {
        //初始化date对象
        Date dateNow = new Date();
        System.out.println(dateNow);
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为：" + ft.format(dateNow));

    }
}
