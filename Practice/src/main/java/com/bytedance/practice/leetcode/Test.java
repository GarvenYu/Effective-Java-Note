package com.bytedance.practice.leetcode;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author freesia <yukaibo@bytedance.com>
 * @date 2021/1/23 11:09 上午 标题：查找两个字符串的最长公共子串的答案 描述信息 String A = "12ddd"
 * <p>
 * String B ="12hhh"
 * <p>
 * 当前字符串的公共子串“12”
 * <p>
 * String A = "12ddd"
 * <p>
 * String B ="12hhh12ddd"
 * <p>
 * 当前字符串的公共子串“12ddd”
 **/
public class Test {

    public static void main(String[] args) {
        String param1 = "12ddd12hhh";
        String param2 = "12ddd";
//        System.out.println(getCommonString(param1, param2));
//        getCommonString2(param1, param2);
        java.text.DecimalFormat format = new java.text.DecimalFormat("#.##");
        format.setRoundingMode(RoundingMode.HALF_UP);

        String a = format.format(new BigDecimal("0.1319222222")
            .multiply(new BigDecimal(100))) + "%";
        System.out.println(a);
    }

    /**
     * 方法1 实现复杂度O(n^2)
     */
    public static String getCommonString(String s1,
                                         String s2) {
        if (s1 == null || s1.length() == 0 || s2 == null || s2.length() == 0) {
            return null;
        }

        String longString = s1.length() > s2.length() ? s1 : s2;
        String shortString = s1.length() <= s2.length() ? s1 : s2;
        String result = "";

        for (int i = 0; i < shortString.length(); i++) {
            for (int j = i; j < shortString.length(); j++) {
                if (longString.contains(shortString.substring(i, j + 1))) {
                    result = result.length() > shortString.substring(i, j + 1).length() ? result
                        : shortString.substring(i, j + 1);
                }
            }
        }
        return result;
    }

    /**
     * 方法2 实现复杂度O(n)
     * 假设s1都是短字符串，s2都是长字符串
     */
//    public static String getCommonString2(String s1,
//                                          String s2) {
//        char[] str1 = s1.toCharArray();
//        char[] str2 = s2.toCharArray();
//        boolean[][] matrix = new boolean[Math.min(str1.length, str2.length)][Math
//            .max(str1.length, str2.length)];
//        // 初始化matrix
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[0].length; col++) {
//                matrix[row][col] = false;
//            }
//        }
//
//        // 遍历字符串
//        for(int i = 0; i < str1.length; i++){
//            for(int j = 0; j < str2.length; j++){
//                if(str1[i] == str2[j]){
//                    matrix[i][j] = true;
//                }
//            }
//        }
//
//        String result;
//        // 遍历matrix, 找到最长路径
//        for(int row = 0; row < matrix.length; row++){
//            String tmp = "";
//            for(int col = 0; col < matrix[0].length; col++){
//                if(matrix[row][col]){
//                    tmp += str2[col];
//                    matrix[row][col] = false;
//                }
//            }
//
//        }
//    }
}
