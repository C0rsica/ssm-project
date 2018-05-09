package top.yangluotong.io;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MyIOManager {

    //文件File 目录Directory 网页 URL   二进制

    public void writer() {
        Path path = Paths.get("~/Downloads");
        InputStream in = null;
        try {
            in = Files.newInputStream(path);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public void reader() throws IOException {
        //从文件获取流
        InputStream inputStream = Files.newInputStream(Paths.get(""));
        OutputStream outputStream = Files.newOutputStream(Paths.get(""));
        //从url获取流
        URL url = new URL("");
        InputStream inputWithUrl = url.openStream();
        //从字节数据读取流
        byte[] bytes = new byte[1024];
        InputStream byteInputStream = new ByteArrayInputStream(bytes);

        ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream(1024);
        byte[] output = byteOutputStream.toByteArray();

        int b = inputStream.read();







    }

    public static void main(String[] args) {
        getPath();
    }


    public static void getPath() {
        Path path = Paths.get("/Users/corsica/Downloads", "hello", "world");
        Path directories = null;
        try {
            directories = Files.createDirectories(path);
            Path filePath = Files.createFile(Paths.get("/Users/corsica/Downloads/简历.pdf"));
            System.out.println(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(directories);
    }

}
