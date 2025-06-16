// package com.company; -. used to moke all classes into a single package optional
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");
        try (Scanner var = new Scanner(System.in)) {
        }
    }
}

// Anatomy of a Java Program

// Document Section -> Suggested -> Set of Comments like author,date,why code was written
// Package Statement -> Optional -> We have to tell which package classes belong to i.e group your classes in package
// Import Statements -> Optional -> use of Scanner Classes by importing
// Interface Statements -> Optional
// Class Definitions -> Optional -> Custom Classes 
// Main Method Class{ Main Method Definition } -> Essentional -> Entry Point
