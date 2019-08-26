package com.congco.smp.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * created on 2019/8/23 下午8:12
 *
 * @author congco
 */
public class NioTest {
    /**
     * nio测试
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("/data/Keeep/docker-compose.yml");
        FileChannel channel = inputStream.getChannel();
        FileOutputStream outputStream = new FileOutputStream("/data/Keeep/testout.txt");
        FileChannel outputStreamChannel = outputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(20 * 1024);
        while (channel.read(byteBuffer)!=-1){
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()){
                outputStreamChannel.write(byteBuffer);
            }
            byteBuffer.clear();
        }
        channel.close();
        outputStreamChannel.close();
        System.out.println("end");
    }
}
