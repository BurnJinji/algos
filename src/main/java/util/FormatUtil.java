package util;

import java.util.Random;

/**
 * util.FormatUtil class
 *
 * @author : Pangxw
 * @date : 2018/10/8 13:16
 * @description :
 */
public class FormatUtil {
    /**
     * 生成一个指定行数和列数的随机数二维数组
     * @param row 行
     * @param column 列
     * @param seed 随机种子（未使用）
     * @return 二维数组
     */
    public static int[][] generateDyadicArray(int row, int column, int seed) {
        Random rand = new Random();
        int[][] array = new int[row][column];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }
        return array;
    }

    /**
     * 以二维表的形式打印二维数组
     * @param array 要打印的二维数组
     */
    public static void printDyadicArray(int[][] array) {
        int row = 0, column = 0;
        int rowLength = array.length, columnLength = array[0].length;

        printLinealSeries(columnLength);
        printHorizontalLine(columnLength);
        for (int i = 0; i < rowLength; i++) {
            StdOut.println();
            StdOut.print((i + 1) + "\t|\t");
            for (int j = 0; j < columnLength; j++) {
                StdOut.print(array[i][j] + "\t");
            }
            StdOut.print("|");
        }
        printHorizontalLine(columnLength);
    }

    /**
     * 打印列数
     * @param columns 列数
     */
    private static void printLinealSeries(int columns) {
        StdOut.print("\t\t");
        for (int i = 0; i < columns; i++) {
            StdOut.print((i + 1) + "\t");
        }
    }

    /**
     * 打印横向分割线
     * @param repeatFactor 重复因子
     */
    private static void printHorizontalLine(int repeatFactor) {
        StdOut.println();
        StdOut.print("\t\t");
        for (int i = 0; i < repeatFactor; i++) {
            StdOut.print("----");
        }
    }
}


