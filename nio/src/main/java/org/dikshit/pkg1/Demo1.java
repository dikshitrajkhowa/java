package org.dikshit.pkg1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class Demo1 {
    public static void main(String[] args) {
        FileInputStream input = new FileInputStream("D:\\testin.txt"); // Path of Input text file
        ReadableByteChannel source = input.getChannel();
        FileOutputStream output = new FileOutputStream ("D:\\testout.txt"); // Path of Output text file  
        WritableByteChannel destination = output.getChannel();
        copyData(source, destination);
        source.close();
        destination.close();
    }

    private static void copyData(ReadableByteChannel source, WritableByteChannel destination)  {
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
        while (src.read(buffer) != -1)
        {
            // The buffer is used to drained
            buffer.flip();
            // keep sure that buffer was fully drained
            while (buffer.hasRemaining())
            {
                dest.write(buffer);
            }
            buffer.clear(); // Now the buffer is empty, ready for the filling
        }
    }
}
