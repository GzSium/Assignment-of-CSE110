/*  task1 Write a Java program to take a positive integer N (where N > 0) as user input and print the first N prime numbers starting from 2.
Your code should check all the positive integers starting from 2 and determine whether they are prime or not until N prime numbers are found.   */

import java.util.Scanner;
class task1{
    public static void main(String[] args){
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num =2;
        int i = 0;
        while(i<n){
        sum =0;
            for(int j=1;j<=num;j++){
                if(num%j ==0){
                    sum = sum +1;
                }
            } 
            if(sum ==2){
            System.out.println(num);
            i++;
            }
             num++;
        }
        } 
    }




/* task2 Write a Java code of a program that reads the value of N (where N > 0) from the user and calculates the value of y if the expression of y is as follows:

              y = -(1)-(1+2)-(1+2+3)- . . . .- (1+2+3+ . . . +N)         */

import java.util.Scanner;
class task2{
    public static void main(String[] args){
        System.out.println("Enter a number ");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for(int out=1;out<=n;out++){
                for(int in=1;in<=out;in++){
                    sum =sum-in;
                }
            }
            System.out.println(sum);
    }



/* task3  Write a Java program that will keep taking even positive integer numbers as inputs from the user and print the number of divisors of those numbers until
it gets an odd number and then stops.       */

import java.util.Scanner;
class task3{
    public static void main(String[] args){
            while(true){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count =0;
                if(n%2 ==0){
                    for(int j=1;j<100;j++){
                       if(n%j ==0){
                          count++; 
                       }
                }
                System.out.println(n+" has "+count+" divisers");
                }else{
                    break;
                }
            }
        } 
    }


/* task4   Read an integer N that is the number of test cases that follow. Each test case contains two integers X and Y. Print one output line for each test case that 
the sum of Y odd numbers from X including it if is the case. For example:
For the input 4 5, the output must be 45, that is: 5 + 7 + 9 + 11 + 13
For the input 7 4, the output must be 40, that is: 7 + 9 + 11 + 13               */

import java.util.Scanner;
class task4{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                int start = sc.nextInt();
                int num = sc.nextInt();
                int sum = 0;
                int count =0;
                for(int j =start;j<=(j+2*num);j++){
                    if(j%2 != 0){
                       sum = sum + j;
                       count++;
                    }
                    if(count == num){
                        break;
                    }
                }
                System.out.println(sum);
            }
        } 
    }


/* task6) Take the height of a right-justified right triangle from the user and create the triangle according to the output below. 
Your output should match the specified output.
        1
      1 2
    1 2 3
  1 2 3 4      */

import java.util.Scanner;
class task6{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
            int star = sc.nextInt();
            for(int out =1;out<=star;out++){
                for(int in =star;in>out;in--){
                    System.out.print(" ");
                }
        
                for(int in1=1;in1<=out;in1++){
                    System.out.print(in1);
                }
                System.out.println("");
            }
        } 
    }


/* task7.  Take the height of an isosceles triangle from the user and create the triangle according to the output below. Your output should match the specified output.   */

import java.util.Scanner;
class task7{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
            int star = sc.nextInt();
            for(int out=1;out<=star;out++){
                for(int in=star;in>=out;in--){
                    System.out.print(" ");
                }
                for(int in1=1;in1<=(out*2 -1);in1++){
                    System.out.print(in1);
                }
                System.out.println("");
            }
        } 
    }



/*  task8  Write a Java program that will ask for a range (a starting number and an ending number) from the user and print all the Armstrong numbers between that range. 
    [Armstrong Number: An Armstrong number is a number whose sum of digits raised to the power the number of digits equals to that number. 
    For example, 371 is an Armstrong number because 33 + 73 + 13 = 371, here the total number of digits in 371 is 3 ]             */

import java.util.*;
class task8{
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Starting Number: ");
         int s = sc.nextInt();
         System.out.println("Ending Number: ");
         int e = sc.nextInt();
        /* digit count;
        int count=0,b=s;
        while(b!=0){
            b=b/10;
            count++;
        }     alternative way in short */
        for(int out = s;out<=e;out++){
            int num=0,sum=0;
            int b1=out;
            //for(int in=1;in<=count;in++){
            while(b1 !=0){
                num = b1%10;
                b1 = b1/10;
                sum = sum + (num*num*num);
            }
            if(sum == out){
                System.out.println(out);
            }
        }
    }
}
