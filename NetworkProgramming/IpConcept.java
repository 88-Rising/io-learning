package NetworkProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpConcept {

    /*
    *
    * Ip地址（用来定位计算机）：用来表示网络中的一个通信实体的地址 通信实体可以是计算机，路由器等 比如
    *       互联网的每一个服务器，都要有自己的IP地址，而每一个局域网的计算机要通信也要配置IP地址。
    *       路由器是连接两个或多个网络的网络设备
    *
    * IP地址分类：
    *         IPV4：32位地址，以十进制表示
    *         IPV6：128位即16个字节写成8个16位的无符号整数，每个整数用四个十六位进制位表示
    * 特殊的IP：本机地址 私有地址（属于费非注册地址，专门位组织机构内部使用）
    *
    * */
    public static void main(String[] args) throws UnknownHostException {
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println(addr.getHostAddress());//返回 本机地址
        System.out.println(addr.getHostName());//输出计算机命
    }
}
