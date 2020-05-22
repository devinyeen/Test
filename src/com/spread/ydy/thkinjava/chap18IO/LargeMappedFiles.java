package com.spread.ydy.thkinjava.chap18IO;

import static com.spread.ydy.thkinjava.utils.Print.print;
import static com.spread.ydy.thkinjava.utils.Print.printnb;

import java.io.RandomAccessFile;
//: io/LargeMappedFiles.java
// Creating a very large file using mapping.
// {RunByHand}
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class LargeMappedFiles {
    static int length = 0x8FFFFFF; // 128 MB

    public static void main(String[] args) throws Exception {
        MappedByteBuffer out = new RandomAccessFile(".\\src\\com\\spread\\ydy\\thkinjava\\chap18IO\\test.dat", "rw")
                .getChannel().map(FileChannel.MapMode.READ_WRITE, 0, length);
        for (int i = 0; i < length; i++)
            out.put((byte) 'x');
        print("Finished writing");
        for (int i = length / 2; i < length / 2 + 6; i++)
            printnb((char) out.get(i));
    }
} ///:~
