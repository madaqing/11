package chapter_01;

public class java03_datatype {
    public static void main(String[] args) {
        // todo 1，数据的存储单位
        // 1，比特（bit）：数据运算最小的存储单位
        // 2，字节（byte）：数据的最小存储单位
        // 字节和比特之间可以互相转换
        // 1byte = 8bit
        // todo 2，基本数据类型
        // todo 2.1，整数类型
        // byte : 8 位
        byte b = 10;
        // short : 16 位
        short s = 10;
        // int : 32 位
        int i = 10;
        // long : 64 位
        long l = 10;
        // todo 2.2，浮点类型：含有小数点的数据类型
        // 根据计算精度分为单精度浮点类型和双精度浮点类型，默认情况，小数点的数据会被识别为双精度double类型
        // float : 单精度浮点类型，数据需要使用F(f)结尾
        float f = 1.0f;
        // double : 双精度浮点类型
        double d =  2.0;
        // todo 2.3，字符类型
        char c = '@';
        // todo 2.4，布尔类型
        // true,false,标识符判断条件是否成立，如果成立，取值为true;不成立，取值位为false
        boolean bln = true;
        // todo 3，数据类型的转换
        // byte -> short -> int -> long -> float -> double
        // java中范围小的数据可以直接转换为范围大的数据，但是反过来不行
        // 如果想要将范围大的数据转换为范围小的数据，那么需要使用小括号进行强制转换
        int i1 = (int)d; // 从右往左看，将d这个数据，也就是double型的数据转换为了int型
        // todo 4，引用数据类型（类，String，接口。数组。枚举。特殊类型值：null）
        // 所谓的引用数据类型，就是可以被引用的数据类型
        String s1 = "abc";
    }
}