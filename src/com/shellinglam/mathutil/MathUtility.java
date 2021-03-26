/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shellinglam.mathutil;

/**
 *
 * @author NHULT
 */
public class MathUtility {
    //Ta sẽ tạo các hàm trong class này fake y chang class Math của JDK
    //Các hàm sẽ xài chung ở nhiều nơi, làm tiện ích dùng chung
    //Cái gì dùng chung --> STATIC

    public static final double PI = 3.1415; //y chang Math.PI

    //Hàm tính n!
    //21! tràn kiểu long (10^18 - 18 số 0 tối đa) nên ta sẽ khống chế n đầu vào của hàm từ 0..20 
//    public static long getFactorial(int n){
//        if (n<0||n>20) {
//                throw new IllegalArgumentException("Ïnvalid variable. "+
//                        "n must be a positive number between 0 and 20");
//            }
//        if (n==0 || n==1) {
//            return 1;
//        }
////        return n*getFactorial(n-1);
//        long result=1; //cố tình ó
//        for (int i = 2; i <= n; i++) {
//            result*=i;
//        }
//        return result;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Ïnvalid variable. "
                    + "n must be a positive number between 0 and 20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
        //aft + shift + f
    }

}
