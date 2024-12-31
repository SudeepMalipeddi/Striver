package Strings;

import java.util.*;

public class validanagram {

    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : t.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) - 1);
        }

        System.out.println(map);
        return true;
    }

    public static void main(String[] args) {

    }
}
