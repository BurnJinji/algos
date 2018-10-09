package util;

import java.io.PrintStream;
import java.util.Locale;

/**
 * util.StdOut class
 *
 * @author : Pangxw
 * @date : 2018/10/8 13:23
 * @description :
 */
public class StdOut {

    public static void print(boolean b) {
        System.out.print(b);
    }

    public static void print(char c) {
        System.out.print(c);
    }

    public static void print(int i) {
        System.out.print(i);
    }

    public static void print(long l) {
        System.out.print(l);
    }

    public static void  print(float f) {
        System.out.print(f);
    }

    public static void  print(double d) {
        System.out.print(d);
    }

    public static void  print(char s[]) {
        System.out.print(s);
    }

    public static void  print(String s) {
        System.out.print(s);
    }

    public static void  print(Object obj) {
        System.out.print(obj);
    }

    public static void  println() {
        System.out.println();
    }

    public static void println(boolean b) {
        System.out.println(b);
    }

    public static void println(char c) {
        System.out.println(c);
    }

    public static void println(int i) {
        System.out.println(i);
    }

    public static void println(long l) {
        System.out.println(l);
    }

    public static void  println(float f) {
        System.out.println(f);
    }

    public static void  println(double d) {
        System.out.println(d);
    }

    public static void  println(char s[]) {
        System.out.println(s);
    }

    public static void  println(String s) {
        System.out.println(s);
    }

    public static void  println(Object obj) {
        System.out.println(obj);
    }

    public PrintStream printf(String format, Object ... args) {
        return System.out.printf(format, args);
    }
    public PrintStream printf(Locale l, String format, Object ... args) {
        return System.out.printf(l, format, args);
    }
}
