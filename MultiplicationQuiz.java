/***********************************************************************************************************************
 * @file  MultiplicationQuiz.java
 * @brief This program generates a quiz based on the number of questions & level of difficulty the user inputs
 * @author Heba Beshai
 * @date   February 19, 2016
 ***********************************************************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        int numofQ, smallestD, largestD, useranswer, h, i, answer;
        double w = 0;
        int counter = 0;

        System.out.println("Multiplication Quiz Wiz!");
        System.out.println();
        System.out.print("Please enter the number of practice questions you would like:");
        numofQ = keyboard.nextInt();
        System.out.print("Please enter the smallest digit followed by the largest digit you would like used: ");
        smallestD = keyboard.nextInt();
        largestD = keyboard.nextInt();


        while (counter < numofQ) {
            h = rand.nextInt(largestD - smallestD  + 1)+ smallestD;
            i = rand.nextInt(largestD - smallestD  + 1)+ smallestD;
            System.out.println();
            System.out.print("What is " + h + " x " + i+ "=? ");
            useranswer = input.nextInt();
            answer = h * i;
            if (useranswer == answer) {
                System.out.println("Correct!");
                w++;
            } else {
                System.out.println("The answer is " + answer);

            }

            counter++;

        }
        System.out.println();
        System.out.println("Your grade is " +(w/numofQ) * 100+ "%"+ " or "+ w+ "/" +numofQ);



}}

