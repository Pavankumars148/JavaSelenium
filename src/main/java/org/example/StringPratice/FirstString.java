package org.example.StringPratice;

import java.sql.SQLOutput;
import java.util.*;

public class FirstString {
//IP=aaaaabbdbgceycscddaasabbbcycddd
//OP=a5b4c3d2
//    aabbd
//a2a1b2b1d1
    public static void entireStringCount1(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase(Locale.ROOT);
        char x;
        int z;
        int i1;
        for (int i = 0; i < str.length(); i++) {
            x = str.charAt(i);
                z = sb.lastIndexOf(String.valueOf(x));
            if (z <= 0) {
                sb.append(x).append(1);
            } else {
                i1 = Integer.parseInt(String.valueOf(sb.charAt(z + 1))) + 1;
                sb.delete(z,z+2).replace(z,z, String.valueOf(x)).replace(z+1,z+1, String.valueOf(i1));
            }
        }
        System.out.println(sb);
    }

    public void entireStringCount(String str) {
        str = str.toLowerCase(Locale.ROOT);
        int x;
        Map map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                x = (Integer) map.get(str.charAt(i));
                map.put(str.charAt(i), x + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        map.forEach((key, value) -> {
            System.out.print(key + "" + value);
        });
    }

    //IP=aaaaabbdbgceycscddaasabbbcycddd
//OP=a5b4c3d2
    public void stringCountInSequence(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase(Locale.ROOT);
        char x;
        char y;
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            y = str.charAt(i);

            try {
                x = str.charAt(i + 1);
            } catch (Exception e) {
                x = str.charAt(i);
            }
            if (y == x && i != str.length() - 1) {
                k++;
            } else {
                k++;
                sb.append(y).append(k);
                k = 0;
            }

        }
        System.out.println();
        System.out.println(sb);

    }


    public static void main(String[] args) {
        FirstString fs = new FirstString();
//        fs.entireStringCount("aaaaabbdbgceycscddaasabbbcycddd");
        entireStringCount1("aaabbd");
//        fs.stringCountInSequence("aaaaabbdbgceycscddaasabbbcycddd");
        //a2b2d1b1g1c1e1
    }

}
