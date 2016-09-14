package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String s="aa";
        System.out.println(titleToNumber(s));
    }
    //Given a column title as appear in an Excel sheet,return its corresponding column number.
    public static int titleToNumber(String s){
        if(s==null||s.length()==0)return 0;
        int i=-1;
        int result=0;
        while(++i<s.length()){
            result*=26;                             //必须分两步，先乘再加；
            result+=s.charAt(i)-'a'+1;              //a对应1，不是0；
        }
        return result;
    }
}
