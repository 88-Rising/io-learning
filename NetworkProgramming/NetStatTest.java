package NetworkProgramming;

import java.net.InetSocketAddress;

public class NetStatTest {
    /*
    *  端口：区分软件 两个字节 同一个协议端口不能冲突 定义端口越大越好
    * IP地址用来标识一台计算机，但是一台计算机可能提供多种网络应用程序，如何来区分这些不同的程序呢
    *        这就要用到端口
    * 端口是一个虚拟的概念，并不是说在主机上真的有若干个端口，通过端口，可以在一个主机上运行多个网络程序
    *        端口表示的是一个16位的二进制整数，两个字节，对应十进制的0-65535
    *
    * */
    public static void main(String[] args) {
        InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress socketAddress2=new InetSocketAddress("localhost",9000);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress2.getAddress());
    }
}
