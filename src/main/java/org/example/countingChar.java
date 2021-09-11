package org.example;
import java.util.*;
public class countingChar {

    public static void main(String[] args){
System.out.print("What is the input string? ");

Scanner word = new Scanner(System.in);
String phrase = word.nextLine();
int length = phrase.length();

System.out.print(phrase + " has " +length+" characters. ");
    }



}
