package com.spread.ydy.thkinjava.chap18IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
//: io/GetChannel.java
// Getting channels from streams
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        // Write a file:
        FileChannel fc = new FileOutputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();
        // Add to the end of the file:
        fc = new RandomAccessFile(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data.txt", "rw").getChannel();
        fc.position(fc.size()); // Move to the end
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();
        // Read the file:
        fc = new FileInputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        while (buff.hasRemaining())
            System.out.print((char) buff.get());
    }
} /* Output:
Some text Some more
*///:~
