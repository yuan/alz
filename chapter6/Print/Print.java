package im.alz.chapter6.Print;
import java.io.*;

public class Print {
    // Print with a newline:
    public static void print(Object obj) {
        System.out.println(obj);
    }
    // Print a newline by itself:
    public static void print() {
        System.out.println();
    }
    // Print with no line break:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    // The new Java SE5 printf() (from C):
    public static PrintStream
    printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
//此方法是用于减少print（）输入量的
//并且该方法内没有main（）方法，故而无法run，
//后面的其他java文件应该在代码首部添加import static im.alz.chapter6.Print.*;
//import应该写到待导入java类名才行，或者继续写路径直接确定到类中的方法名
//第一个print是文件夹名称，第二个print是类名称。