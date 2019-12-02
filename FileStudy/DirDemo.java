package FileStudy;

import java.io.File;

/*
* 创建目录
* 1.mkdir();确保上级目录存在，不存在创建失败
* 2.mkdirs() 上级目录可以不存在 不存在一同来创建
*列出下一级
* 1.list() 列出下一级名称
* 2.listFiles() 列出下一级File对象
*
* */
public class DirDemo {
    public static void main(String[] args) {
//         File dir=new File("e:/IDEA/io-learning/dir/test");
////         boolean flag=dir.mkdir();
//        boolean flag=dir.mkdirs();
//        System.out.println(flag);
//
//        dir=new File("e:/IDEA/io-learning/dir/test1");
//        flag=dir.mkdir();
//        System.out.println(flag);
        File dir=new File("e:/IDEA/io-learning/");
       String[] subNames=dir.list();
       for(String temp:subNames){
           System.out.println(temp);

        }
       File[] subFiles=dir.listFiles();
       for(File s:subFiles){
           System.out.println(s);

       }

    }




}
