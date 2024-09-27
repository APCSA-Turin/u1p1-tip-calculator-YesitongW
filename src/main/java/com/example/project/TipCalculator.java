package com.example.project;

public class TipCalculator {
 //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) {
        double tip = (percent/100.0) * cost;
        double billTip = cost + tip;
        double beforeTip = cost/people;
        double tipPerson = tip/people;
        double totalCost = billTip/people;

        // DO NOT DELETE ANY OF THE CODE BELOW
        StringBuilder result = new StringBuilder();

        

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + (Math.round(cost * 100.0) / 100.0) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + (Math.round(tip * 100.0) / 100.0) + "\n");//https://www.youtube.com/watch?v=nLDWeTz3Zgc
        result.append("Total Bill with tip: $" + (Math.round(billTip * 100.0) / 100.0) + "\n");
        result.append("Per person cost before tip: $" + (Math.round(beforeTip * 100.0) / 100.0) + "\n");
        result.append("Tip per person: $" + (Math.round(tipPerson * 100.0) / 100.0) + "\n");
        result.append("Total cost per person: $" + (Math.round(totalCost * 100.0) / 100.0) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }

    public static void main(String[] args) {
        int people = 12;
        int percent = 15;
        double cost = 566.97;              
        System.out.println(calculateTip(people, percent, cost));
    }
}