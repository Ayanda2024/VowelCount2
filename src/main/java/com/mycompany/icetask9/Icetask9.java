/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask9;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Icetask9{

    public static void main(String[] args) {
        //Declarations
        String Sentence;
        String lastname;
        //creating an object for the Scanner
        Scanner sc=new Scanner(System.in);
        
        //Prompting the user
        System.out.print("Enter a sentence");
        Sentence=sc.next();
        int countVowels=countVowels(Sentence);
        int vowelCount = 0;
        System.out.println("Number of vowels:"+vowelCount);
        
        
    }
    public static int countVowels(String Sentence){
        int count=0;
        Sentence=Sentence.toLowerCase();
        
        for(int i=0;i<Sentence.length();i++){
            char ch=Sentence.charAt(i);
            if ("aeiou".indexOf(ch)!=-1){
                count++;
            }
            
            
        }
        return count;
        
    }
}