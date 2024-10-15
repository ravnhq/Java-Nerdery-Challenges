package org.example;

public class Palindrome {

    public Boolean checkPalindromeString(String str) {
        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
    public Boolean checkPalindromeNumber(Integer str) {
        String reversed = new StringBuilder(String.valueOf(str)).reverse().toString();
        return reversed.equals(String.valueOf(str));
    }
}
