package com.oops.ds;

class IntArrToInt {
    public int[] plusOne(int[] digits) {
        int outArr[] = new int[digits.length];
        String s = "";
        int num;
        for(int i = 0; i < digits.length; i++) {
            s = s + Integer.toString(digits[i]);   
        }
        num = Integer.parseInt(s);
        String reqdNum = Integer.toString(++num);
        for(int i = 0; i < reqdNum.length(); i++) {
			outArr[i] = Character.getNumericValue(reqdNum.charAt(i));
		}
        return outArr;
    }
}