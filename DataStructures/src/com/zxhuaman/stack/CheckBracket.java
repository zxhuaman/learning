package com.zxhuaman.stack;

/**
 * Created by zxhuaman on 2018/8/28.
 */
public class CheckBracket {
    public static void main(String[] args) {
        String bracket = "a{{c[k{b]}fd]fd}}";
        IStack<Character> mChars = new StackImpl<>(20);
        boolean match = true;
        for (char c : bracket.toCharArray()) {
            System.out.println(c);
            switch (c) {
                case '{':
                case '[':
                    mChars.push(c);
                    break;
                case '}':
                    if (mChars.isEmpty()) {
                        match = false;
                        break;
                    }
                    if (mChars.pop() != '{') {
                        match = false;
                        break;
                    }
                    break;
                case ']':
                    if (mChars.isEmpty()) {
                        match = false;
                        break;
                    }
                    if (mChars.pop() != '[') {
                        match = false;
                        break;
                    }
                    break;
            }
            if (!match) {
                break;
            }
        }
        System.out.println(match && mChars.isEmpty());
    }
}
