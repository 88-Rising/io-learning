package FileStudy;

import java.io.*;

public class CopyTest {


    public void test1(){
        try {
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                File f = new File("D:/HowComputersWork.zip");
                fis = new FileInputStream(f);
                File dest = new File("D:/1.zip");
                fos = new FileOutputStream(dest);
                byte[] bytes = new byte[1024];
                int len = 0;
                while((len=fis.read(bytes))!=-1){
                    fos.write(bytes, 0, len);
                }
            } finally {
                if(fis != null)
                    fis.close();
                if(fos != null)
                    fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
