package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score;
        System.out.print("Enter your test score: ");
        score = scan.nextInt();
        String grade = "F";//I'm not hopeful

        if (score >96 )
            grade = "A+";

        else if (score >92 && score<96 )
            grade = "A";
        else if (score >89 && score<92 )
            grade = "A-";
        else if (score >86 )
            grade = "B+";
        else if (score >82 && score<86 )
            grade = "B";
        else if (score >79 && score<82 )
            grade = "B-";
        else if (score >76 )
            grade = "C+";
        else if (score >72 && score<76 )
            grade = "C";
        else if (score >69 && score<72 )
            grade = "C-";
        else if (score >66 )
            grade = "D+";
        else if (score >62 && score<66 )
            grade = "D";
        else if (score >59 && score<62 )
            grade = "D-";
        else if (score >56 )
            grade = "F+";
        else if (score >52 && score<56 )
            grade = "F";
        else if (score >=0 && score<52 )
            grade = "F-";

            System.out.println(grade);
        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");
    }
}
