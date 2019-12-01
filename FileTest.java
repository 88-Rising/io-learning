import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileTest {

    @Test
    public void test1() throws IOException {
        File file = new File("D:/Workspaces/Java10\\fileTest.txt");
        System.out.println(file.exists());
        File f2 = new File("test1.txt");
        System.out.println("f2="+f2.exists());
        File f3 = new File("test2.txt");
        f3.createNewFile();

        File d = new File("d:/");
        for(File f : d.listFiles()){
            System.out.println(f.getPath());
        }
    }

    @Test
    public void test2(){
        // 实现一个方法，把某个目录所有子文件夹
        // 和子文件获取并打印
        File dir = new File("D:\\Workspaces\\Java10");
        List<File> files = listFiles(dir);
//        files.stream()
//                .forEach(System.out::println);
        files.stream()
                .forEach((f)->{
                    System.out.println(f.getPath());
                });
    }
    public List<File> listFiles(File file){
        List<File> list = new ArrayList<>();
        list.add(file);
//        System.out.println(file.getPath());
        if(file.isDirectory()){
            for (File f : file.listFiles()) {
                if (f.isDirectory()) {
                    list.addAll(listFiles(f));
                }else{
                    list.add(f);
//                    System.out.println(f.getPath());
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        test3();
    }

    public static void test3(){
        // 给定多个测试用例，每个测试用例输入如下：
        // 4
        // 5 6 7
        // 11
        // 输出是这样的：
        // abc
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
//            System.out.println("hasNext");
            int i1 = sc.nextInt();
//            System.out.println("i1");
            int i2 = sc.nextInt();
//            System.out.println("i2");
            int i3 = sc.nextInt();
//            System.out.println("i3");
            int i4 = sc.nextInt();
//            System.out.println("i4");
            int i5 = sc.nextInt();
//            System.out.println("i5");
            // 1.要么对于每个有明确结束标识api的api，需要
            // 明确返回这个标识，对于scanner就是换行符
            // 2.流关闭
            System.out.println("abc");
        }
    }
}
