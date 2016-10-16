package com.basic;

public class CharCounter {
    private final String dnaString;
    private final String order;

    public CharCounter(String dnaString, String order) {
        this.dnaString = dnaString;
        this.order = order;
    }

    public String finalResult() {
        String count = "";

        for (int index = 0; index < order.length(); index++){
            int number = 0;
            int number1 = number;
            for(int sindex=0 ;sindex < dnaString.length(); sindex++){
                number1 = (order.charAt(index) == dnaString.charAt(sindex)) ? number1 + 1 : number1;
            }
            number = number1;
            count = count + number + " ";
        }

        return count.trim();
    }
}
