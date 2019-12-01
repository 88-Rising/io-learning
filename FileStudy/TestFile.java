package FileStudy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
/*
* 测试File类的基本用法
* */
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File f=new File("e://a.txt");
        System.out.println(f);
        f.renameTo(new File("e://b.txt"));//更改文件名

        System.out.println(System.getProperty("user.dir"));//打印现在项目的路径
        f.delete();
        File f2=new File("gg.txt");
        try {
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File是否存在："+f2.exists());
        System.out.println("File是否是目录："+f2.isDirectory());
        System.out.println("File是否是文件："+f2.isFile());
        System.out.println("File最后修改时间："+new Date(f2.lastModified()));
        System.out.println("File的大小："+f2.length());
        System.out.println("File的文件名："+f2.getName());
        System.out.println("File的目录路径："+f2.getPath());
        System.out.println("File的绝对目录路径："+f2.getAbsolutePath());

        File f3=new File("e:/1111/222/222");
        boolean flag = f3.mkdir();//目录中有一个不存在 则不会完整的创建整个目录树
        System.out.println(flag);
        boolean flag1 = f3.mkdirs();//目录中又不存在的目录也没关系 创建整个目录树
        System.out.println(flag1);

    }
}
