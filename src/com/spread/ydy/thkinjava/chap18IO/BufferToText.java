package com.spread.ydy.thkinjava.chap18IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
//: io/BufferToText.java
// Converting text to and from ByteBuffers
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        FileChannel fc = new FileOutputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data2.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();
        fc = new FileInputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data2.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip();
        // Doesn't work:
        System.out.println(buff.asCharBuffer());
        System.out.println("========================");
        // Decode using this system's default Charset:
        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));
        System.out.println("========================");
        // Or, we could encode with something that will print:
        fc = new FileOutputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data2.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes("UTF-16BE")));
        fc.close();
        // Now try reading again:
        fc = new FileInputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        System.out.println("========================");
        // Use a CharBuffer to write through:
        fc = new FileOutputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data2.txt").getChannel();
        buff = ByteBuffer.allocate(24); // More than needed
        buff.asCharBuffer().put("Some text");
        fc.write(buff);
        fc.close();
        // Read and display:
        fc = new FileInputStream(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\data2.txt").getChannel();
        buff.clear();
        fc.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
    }
} /* Output:
????
Decoded using Cp1252: Some text
Some text
Some text
*///:~
