/* Task1 Write a Java code that would print the following sequences using while loop:
         a) 24, 18, 12, 6, 0, -6
         b)  -10, -5, 0, 5, 10, 15, 20    */

class task1a{
    public static void main(String[] args){
        int a = 24;
        while(a>=-6){
            if(a>-6){
            System.out.print(a+",");
            }else{
                System.out.print(+a);
            }
         a = a-6;
        }
    }
}



/* Task1 (b)  
class task1b{
    public static void main(String[] args){
        int a = -10;
        while(a<=20){
            if(a<20){
                System.out.print(a+",");
            } else{ 
                System.out.print(+a);
        }
        a= a+5;
    }
}
}



/* Task2    Write a Java program that will take N numbers from the user and find their sum and average using a for loop.     */
import java.util.*;
class task2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
       int sum = 0;
       for(int i =0;i<=N;i++){
           sum = sum+i;
       }
       System.out.println("The sum of "+N+" no is: "+sum);
       double avg = sum/N;
       System.out.println("The Average is: "+avg);
    }
}




/* Task3  Write a Java program that will keep taking integer numbers as inputs from the user and print the square of those numbers until it gets a
negative number and then stop.     */
import java.util.*;
class task3{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){    //it will remain always true
       System.out.print("Enter Number: ");
        int a = sc.nextInt();
        if(a>=0){
          int c= a*a;
           System.out.println(+a+"^"+a+" = "+c);
        }else{ 
            break;
        }
       } 
    }
}




/*  Task4  Write a Java program that will take an integer as input and print all the divisors of that number.
Divisors of 6:
1
2
3
6
   */
import java.util.*;
class task4{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("The divisors of "+a+":");
    for(int b=1;a%b==0;b++){
        System.out.println(b);
    } 
    System.out.println(a);
    }
}



/* Task5  Write a Java code that asks an integer as input from the user and takes that many integer inputs. Your task is to count how many numbers are non-negative 
and negative.   */
import java.util.*;
class task5{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  System.out.print("Enter an integer:");
  int a = sc.nextInt();
  int pos =0;
  int neg=0;
  for(int i = 1;i<=a;i++){
      System.out.print("enter number "+i+":");
      int b = sc.nextInt();
      if(b>0){
          pos = pos+1;
      }else{
          neg = neg+1;
      }
  }
  System.out.println(pos+" Non-negative Numbers");
  System.out.println(neg+" Negative Numbers");
}
}



/* Task6  Write a Java program that displays the sum of first n odd natural numbers. 
Sample Input:
Input number of terms: 5
Expected Output:
The odd numbers are:                                                            
1                                                                                
3                                                                                
5                                                                                
7                                                                                
9      */

import java.util.*;
class task6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
 System.out.print("Input number of terms: ");
 int a =sc.nextInt();
 int sum =0;
 int b=1;
 System.out.println("The odd numbers are: ");
 for(int i = 1;i<=a;i++){
    System.out.println(b);
    sum= sum+b;
    b+=2;
}
System.out.print("The Sum of odd Natural Numbers up to "+a+" terms is: "+sum);
}
}




/* Task7   Write a Java program that will read 10 numbers from the user, and then print the first number, the sum of the first 2 numbers, the first 3 numbers, and 
so on up to the sum of 10 numbers.    */

import java.util.*;
class task7{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum=0;
    while(true){
System.out.print("Enter Number: ");
int a = sc.nextInt();
sum=sum+a;
System.out.println("Sum = "+sum);
}
}
}





/* Task8   Write a Java program that will take a positive integer n as input and print all the numbers from 0 to n which are divisible by 5 but not divisible by 3.
Sample Input
40
Sample Output
5
10
20
25
35
40            */

import java.util.*;
class task8{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
 for(int i=0;i<=a;i++){
     if(i%5==0 && i%3!=0){
         System.out.println(i);
     }
 }
}
}


/* task9 Write a program in Java that asks the user for an integer input and counts the number of digits in the number. 
Hint: You may keep dividing the number by ten and count how many times this can be done until the number becomes 0.

Sample Input
7546
Output
Total digits = 4   */

import java.util.*;
class Ques9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i =1;
        int b = n;
        int count= 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.print("Total digits ="+count);
    }
}





/* task10  Write a program in Java that asks the user for an integer input, and print the individual digits forward (From left to right). 

Sample Input
32768
Output 
3, 2, 7, 6, 8      */

import java.util.*;
class Ques10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double i =1;
        double b = n;
        double count= 0;
        while(n!=0){
            n=n/10;
            count++;
        }
        while(b!=0){
            double x = Math.pow(10,count-1);
           double c=b/x;
            b= b % x;
            count--;
            int m = (int)c;
            if(count ==0){
                System.out.print(m);
            }else{
            System.out.print(m+",");
            }
        }
    }
}



/* task11  
11. Write a Java program that will take an integer as input and - 
a) Find out if the number is a prime number or not.
b) Find out if the number is a perfect number or not.
[Prime Number: If a number has only two divisors, (1 and itself), then it is a prime number. Else, then it is not a prime number.
Perfect Number: A number is said to be a perfect number if the sum of its divisors, including 1 but not the number itself is equal to that number.]   */
 
import java.util.*;
class Que11{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count= 0;
        int sum = 0;
        for(int i =1; i<=n;i++){
            if(n%i==0){
                 count++;
                 sum = sum+i;
            }
        }
        if(count==2){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
}   if(sum==n){
     System.out.print(n+" is a perfect number");
}else{
     System.out.print(n+" is not a perfect number");
}
    }
}
