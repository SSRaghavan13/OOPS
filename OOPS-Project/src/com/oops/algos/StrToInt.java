package com.oops.algos;

public class StrToInt {

	public int myAtoi(String str) {
        str = str.trim();
        if(str.length() < 1)
        	return 0;
        char flag = '+';
        int i = 0;
        if(str.charAt(i) == '-') {
        	flag = '-';
            i++;
        }
        else if(str.charAt(i) == '+')
        	i++;
        
        double result = 0;
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
        	result = result * 10 + (str.charAt(i) - '0');
        	i++;
        }
        
        if (flag == '-')
        	result = -result;
        if(result > Integer.MAX_VALUE)
        	return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
        	return Integer.MIN_VALUE;
        
        return (int)result;
    }
	
	public static void main(String[] args) {
		StrToInt strToInt = new StrToInt();
		System.out.println(strToInt.myAtoi("42 dfshdk"));
		System.out.print('9' - '0');
	}

}
