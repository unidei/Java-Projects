package com.kcs.days.second;

public class FirstTask {
}
    private static final String PALINDROME_1 = "KOL EINU ŠUNIE LOK"; //t..konstanta - tai yra statinis nekintamas dydis. rasosi klases virsuje. vardas didziosiomis raidemis
    private static final String PALINDROME_2 = "argi ten ne tigra"; //t..konstanta
    private static final String PALINDROME_3 = "SĖDĖK UŽ KĖDĖS"; //t..konstanta

    public static void main(String[] args) {
        String[] palindromeMas = {PALINDROME_1, PALINDROME_2, PALINDROME_3};

        /* for(int i = 0; i < palindromeMas.length; i++) {
            String p = palindroMas[i];
         */

        for(String p : palindromeMas){ //sitas for ima reiksmes is masyvo - prasisuka per visus ir paima visas reiksmes. jam nereikia indekso.
            if(isWordIsPalindrome(p.replaceAll(" ", ""))){
                System.out.println("Polindromas");

            }else{
                System.out.println("Nepolindromas");
            }
        }

        /* boolean isPalindrome = isWordIsPalindrome("KOL EINU ŠUNIE LOK".replaceAll(" ", ""));

        if (isPalindrome) {
            System.out.println ("Tai yra polindromas");
        }else {
            System.out.println("Tai nera polindromas");
        } */

    }

    private static boolean isWordIsPalindrome(String word) {
        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            char a = word.charAt(i);
            int t = word.length() - 1 - i;
            char b = word.charAt(t);

            if(a != b) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }