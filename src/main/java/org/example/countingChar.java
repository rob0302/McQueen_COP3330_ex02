/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
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
