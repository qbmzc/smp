package com.congco.smp.nio;

/**
 * created on 2019/9/4 下午2:18
 *
 * @author congco
 */
public class CpuTest {

    public static void main(String[] args) {
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
