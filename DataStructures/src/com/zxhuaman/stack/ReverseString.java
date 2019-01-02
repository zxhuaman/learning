package com.zxhuaman.stack;

/**
 * Created by zxhuaman on 2018/8/28.
 */
public class ReverseString {
    public static void main(String[] args) {
        String s = "hello world";
        IStack<Character> mChars = new StackImpl<>(20);
        for (char c : s.toCharArray()) {
            mChars.push(c);
        }
        StringBuffer sb = new StringBuffer();
        while (mChars.peek() != null) {
            sb.append(mChars.pop());
        }
        System.out.println(sb.toString());
    }
}
