package com.bridgelabz.JavaGenerics;

public class FindTheMaxStrings
{
    public static String compareTO(String x,String y,String z){

        int a = x.compareTo(y);
        int b = x.compareTo(z);
        int c = y.compareTo(z);

        if(a>b && a>c){
            return x;
        }else if(b>c){
            return y;
        }else {
            return z;
        }
    }

    public static void main(String[] args) {
        FindTheMaxStrings m = new FindTheMaxStrings();
        System.out.println("max Number for 1st test case="+m.compareTO("Apple","banana","peach"));//Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case="+m.compareTO("peach","banana","peach"));//Test case 2:given max number for 2nd position
        System.out.println("max Number for 3rd test case="+m.compareTO("banana","apple","orange"));//Test case 3:given max number for the 3rd position.
    }
}
