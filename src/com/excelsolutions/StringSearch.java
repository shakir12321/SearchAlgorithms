package com.excelsolutions;

public class StringSearch {
    public static void main(String[] args) {
        String name = "Shakir";
        char tar = 'z';
        boolean ans = linearSearch(name,tar);
        System.out.println(ans);
    }

    private static boolean linearSearch(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==target)return true;
        }
        return false;
        }
    }

