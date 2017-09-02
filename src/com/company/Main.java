package com.company;

public class Main {

    public static void main(String[] args) {
        String var="genuine";
        char []temp = var.toCharArray();
        for (int i =0; i< var.length() ; i++){
            System.out.print(temp[var.length()-(1+i)]);
        }
    }
}
