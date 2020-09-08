package Math;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        StringBuilder builder = new StringBuilder();
        int value = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (value(s.charAt(i)) >= value(s.charAt(i + 1))) {
                    value += value(s.charAt(i));
                } else {
                    value -= value(s.charAt(i));
                }
            } else {
                value += value(s.charAt(i));
            }
        }
        return value;
    }

    private static int value(char ch) {
        if (ch == 'I')
            return 1;
        if (ch == 'V')
            return 5;
        if (ch == 'X')
            return 10;
        if (ch == 'L')
            return 50;
        if (ch == 'C')
            return 100;
        if (ch == 'D')
            return 500;
        if (ch == 'M')
            return 1000;
        return -1;
    }
}
