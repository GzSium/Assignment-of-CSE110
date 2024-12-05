//task1
import java.util.*;
class task1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is : "+a);
        }else if(b>c && b>a){
               System.out.println("The largest number is : "+b);
        }else if(c>a && c>b){
               System.out.println("The largest number is : "+c);
        }
    }
}





//task2
import java.util.*;
class task2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark");
        int a = sc.nextInt();
        if(a<=100 && a>=0){
           if(a>=90 && a<=100){
                System.out.println("Your grade is A");
           }else if(a>=85 && a<=89){
               System.out.println("Your grade is A-");
           }else if(a>=70 && a<=84){
               System.out.println("Your grade is B");
           }else if(a>=57 && a<=69){
               System.out.println("Your grade is C");
           }else if(a>=50 && a<=56){
               System.out.println("Your grade is D");
           }else if(a<50){
               System.out.println("Your grade is F");
            }
            }else{
             System.out.println("The number is invalid");
        }
    }
}





//task3
import java.util.*;
class task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String oprtr = sc.next();
        if(oprtr.equals("+")){
            System.out.println(a+b);
        }else if(oprtr.equals("-")){
            System.out.println(a-b);
        }else if(oprtr.equals("*")){
            System.out.println(a*b);
        }else if(oprtr.equals("/")){
            if(b!=0){
            System.out.println(a/b);
            }else{
                System.out.print("Error");
            }
        }
        }
    }



//task4
import java.util.*;
class task4{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
if(a%5==0 && a%7==0){
System.out.println("Division by both");
}else if(a%5==0){
System.out.println("Invalid:Divisible by 5 only");
}else if(a%7==0){
System.out.println("Invalid:Divisible by 7 only");
}else{
System.out.println("No");
}
}
}




//task5
import java.util.*;
class task5{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
if(a%400 ==0){
System.out.println(+a+"year is a leap year");
}else if(a%100==0){
System.out.println(+a+" year is not a leap year");
}else if(a%4==0){
System.out.println(+a+" year is leap year");
}else{
System.out.println(+a+"year is not a leap year");
}
}
}




//Task6
import java.util.*;
class Task6{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
if(a>=0){
    if(a==0){
        System.out.println("Number is zero");
    }else if(a%2!=0) {
        System.out.println("Number is positive and odd");
    }else if(a%2==0){
           System.out.println("Number is positive and even");
    }
}else{
       System.out.println("Number is negative");
}
}
}



//Task7
import java.util.*;
class Task7{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int x = sc.nextInt();
int result;
if(x<5){
    if(x<0){
        result = 2*x;
        System.out.println("output:"+result);
    }else if(x>=0 && x<2) {
        result = x+1;
        System.out.println("output:"+result);
    }else if(x>=2 && x<=5){
        result = x*x -1;
           System.out.println("output:"+result);
    }
}else{
    result = (3*x*x)+2;
       System.out.println("output: "+result);
}
}
}




/Task8
import java.util.*;
class Task8{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
System.out.println("Enter your ID: ");
int x = sc.nextInt();
int first2 = x/1000000;
int mid = (x/100000)%10;
String session;
if(mid == 1){
    session = "Spring";
}else if(mid == 2){
    session ="Summer";
}else if(mid == 3){
    session ="Fall";
}else{
    session="Invalid";
}
System.out.println("Student joined Brac in "+session +first2);
}
}



//Task9
import java.util.*;
class Task9{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
double tk = sc.nextDouble();
double age = sc.nextDouble();
if(age>18){
if(tk<10000){ 
System.out.println("Your tax amount is 0TK");
}else if(tk>=10000 && tk<=20000){
double tk1 = tk*0.05;
System.out.println("Your tax amount is"+tk1);
}else if(tk>20000){
double tk2 = tk*0.1;
System.out.println("Your tax amount is "+tk2);
}
}else{
    System.out.println("Your tax amount is 0TK");
}
}
}




//Task10
import java.util.*;
class task10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double max,min;
        if(a>=b && a>=c){
            max=a;
        }else if(b>=c && b>=a){
            max=b;
        }else{
            max =c;
        }
        System.out.println("Maximum number is "+max);
        if(a<=b && a<=c){
            min=a;
        }else if(b<=c && b<=a){
            min=b;
        }else{
            min =c;
        }
        System.out.println("Minimum number is "+min);
        
    }
}



//Task11
import java.util.*;
class task10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a==b && a==c){
            System.out.println("This is a Equilateral triangle");
        }else if(b!=c && b!=a){
            System.out.println("This is a Scalene triangle");
        }else if(a!=b || a!=c){
            if( a==b || a==c){
              System.out.println("This is a Isosceles triangle");
            }
            }else{
            System.out.println("This is a Invalid triangle");
        }
    }
}





import java.util.*;
class task12{
public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the amount the customer need to pay(Taka): ");
    int cost = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka): ");
    int given = sc.nextInt();
    int back = given - cost;
    int temp,tk100,tk50,tk20,tk10,C5,C2,C1;
        if(back > 0){
            temp = back;
            System.out.println("The returned amount is "+ temp +" taka. ");

            tk100 = temp / 100;
            temp = temp % 100;
            
            tk50 = temp / 50;
            temp = temp % 50;
            
            tk20 = temp / 20;
            temp = temp % 20;
            
            tk10 = temp / 10;
            temp = temp % 10;
            
            C5 = temp / 5;
            temp = temp % 5;
            
            C2 = temp / 2;
            temp = temp % 2;
            
            C1 = temp / 1;
            System.out.println("100 taka note: " + tk100);
            System.out.println("50 taka note: " + tk50);
            System.out.println("20 taka note: " + tk20);
            System.out.println("10 taka note: " + tk10);
            System.out.println("5 taka coin: " + C5);
            System.out.println("2 taka coin: " + C2);
            System.out.println("1 taka coin: " + C1);
         }
        else 
        {
            temp = -back;
            System.out.println("Please pay "+ temp +" taka more.");
        }
  }
}





//Task13
import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int b = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int c = scanner.nextInt();
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal nor different");
        }
    }
}




