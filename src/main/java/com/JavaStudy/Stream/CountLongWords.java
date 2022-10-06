package com.JavaStudy.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * @作者: lizhongyi
 * @功能描述：
 * @日期: 2022/6/25 5:20 下午
 * @版本 1.0
 */
public class CountLongWords {
    public static void main(String[] args) {
        System.out.println("hello");
        List<String> words = new ArrayList<>();
        words.add("sdfsdfsd");
        words.add("sdfsdfsdjjjjjjg");
        words.forEach(System.out::println);
        long count = 0;
        for (String w: words){
            if(w.length()>12)
                count++;
        }
        System.out.println(count);
        long count2 = words.stream().filter(w -> w.length()>12).count();
        System.out.println(count2);

        words.stream().map(w -> w.toUpperCase()).forEach(System.out::println);

        Stream<Double> randoms = Stream.generate(Math::random).limit(10);
    }
    //test git



}
