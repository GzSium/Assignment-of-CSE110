/* Task1   Write a Java program that will take N integer numbers from the user and create an array of length N.  
Print the elements of the array with their indices. 
Take another integer input from the user, resize the array by length 1, and add the new integer value to the array. Print the resized array.  */

import java.util.Arrays;
import java.util.Scanner;
class task1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int []  arr1 = new int[size];
    String sum = "";
    for (int i =0;i<arr1.length;i++){
        System.out.println("Enter elements"); 
        int element = sc.nextInt();
        arr1[i] = element;
    }
    for(int j = 0; j<size;j++){
         System.out.println(+j+": "+arr1[j]); 
         sum = sum + " " + arr1[j];
    }
     System.out.println("After resizing the array: "); 
     System.out.println(sum); 
    }
}


/* Task2 You are given an integer array with duplicate values. Write a Java program to update the array by replacing the duplicate values of the array with zero.
Then print the updated array. [Your code should work for any given integer array]   */

import java.util.Arrays;
import java.util.Scanner;
class task2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int []  arr1 = new int[size];
    String sum = "";
    String sum1 = "";
    for (int i =0;i<arr1.length;i++){
        System.out.println("Enter elements"); 
        int element = sc.nextInt();
        arr1[i] = element;
    }
    for(int j = 0; j<size;j++){
         sum = sum + " " + arr1[j];
    }
    System.out.println("Before removing duplicates: "); 
    System.out.println(sum);
    //nested loop to check
    for(int out =0; out<arr1.length;out++){
        for(int in=(out + 1); in<arr1.length;in++){
            if(arr1[out] == arr1[in]){
                arr1[in] = arr1[in] - arr1[out];
            }
        }
    }
    for(int aftr = 0; aftr<size;aftr++){
         sum1 = sum1 + " " + arr1[aftr];
    }
    System.out.println("After removing duplicates: "); 
    System.out.println(sum1);
  }
}


/*Task3
3. Write a Java program that asks the user for the length of an array and then creates an integer array of that length by taking inputs from the user. Then,	
a. Reverse the array by creating a new array of the same length and print it. (Out-of Place) 
b. Reverse the array without creating any new arrays and print it. (In-Place)     */

import java.util.Arrays;
import java.util.Scanner;
class task3a{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int [] arrR = new int[size];
        String sum = "";
        String sumR = "";
        int count = size -1;
        for(int i= 0; i<size;i++){
             System.out.println("Enter a number: ");
             int element =  sc.nextInt();
             arr[i] = element;
        }
        for(int j= 0;j<size;j++){
            sum = sum + " "+arr[j];
        }
        System.out.println("Arrays: ");
        System.out.println(sum);
        for(int out=0;out<size;out++){
          
            arrR[count]= arr[out]; 
            count--;
            }
        for(int r= 0;r<size;r++){
            sumR = sumR + " "+arrR[r];
        }
        System.out.println("Reversed Arrays: ");
        System.out.println(sumR);
    }
}
 
 //Task (3) b.
import java.util.Arrays;
import java.util.Scanner;
class task3b{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        String sumR = "";
        for(int i= 0; i<size;i++){
             System.out.println("Enter a number: ");
             int element =  sc.nextInt();
             arr[i] = element;
        }
        int e=(size-1);
        for(int s= 0;s<e;s++){
            int t= arr[s];
            arr[s] = arr[e];
            arr[e]=t;
            e--;
        }
        for(int n = 0; n<size;n++){
         sumR = sumR + " " + arr[n];
    }
        System.out.println("Reversed Arrays: ");
        System.out.println(sumR);
    }
}

 
/*  task4  Take an integer N input from the user and create an integer array of N numbers by taking inputs from the user. Then, print the array. Next, modify the array by 
changing the positive numbers by 1 and the negative numbers by 0. If the element is zero, then it will be unchanged. Lastly, print the modified array.  */
import java.util.Arrays;
import java.util.Scanner;
class task4{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("N=");
    int size = sc.nextInt();
    int []  arr1 = new int[size];
    String sum = "";
    String sum1 = "";
    for (int i =0;i<arr1.length;i++){
        System.out.println("Enter elements"); 
        int element = sc.nextInt();
        arr1[i] = element;
    }
    for(int j = 0; j<size;j++){
         sum = sum + " " + arr1[j];
    }
    System.out.println("Original array: "); 
    System.out.println(sum);
    // loop for the change
    for(int check = 0; check<size;check++){
        if(arr1[check]<0){
            arr1[check] = 0;
        }
        else{
             arr1[check] = 1;
        }
    }
    //to print
    for(int aftr = 0; aftr<size;aftr++){
         sum1 = sum1 + " " + arr1[aftr];
    }
    System.out.println("After modifying: "); 
    System.out.println(sum1);
  }
}

/* Task5  Write a Java program that will take N integer numbers from the user and create an array of length N. Take another number from the user and print the index of the number where it is found first. If not found then print ‘Element not found’. 
Note: Think about how to apply the concept of flag and break in this task.  */

import java.util.Arrays;
import java.util.Scanner;
class task5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
    System.out.print("N=");
    int size = sc.nextInt();
    int []  arr1 = new int[size];
    String sum = "";
    int how = 0;
    for (int i =0;i<arr1.length;i++){
        System.out.println("Enter a number: "); 
        int element = sc.nextInt();
        arr1[i] = element;
    }
   int count = sc.nextInt(); //checking number
   for(int j =0;j<size;j++){
       if(arr1[j] == count){
           how =how+1;
       }
   }
   if(how>0){
   System.out.println(count+" is at index "+how);
   }
   else{
      System.out.println("Element not found");   
   }
  }
}


/* Task6   Write a Java program that asks the user for the length of an array then creates a double data-type array of that length by taking inputs from the user. 
Then do the following:
a. Show the maximum element and its index from the array.
b. Show the minimum element and its index from the array.
c. Show the summation of all the elements from the array.
d. Show the average of all the elements from the array.      */

import java.util.Arrays;
import java.util.Scanner;
class task6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int size = sc.nextInt();
        double [] arr = new double[size];
        for(int i= 0; i<size;i++){
             System.out.println("Enter a number: ");
             double element =  sc.nextDouble();
             arr[i] = element;
        }
      //to check max
        double num =0;
        int index_max=0;
        for(int max=0;max<size;max++){
             if(arr[max]>num){
                num = arr[max];
                index_max = max;
             } 
      }
    System.out.println("Maximum element "+num+" found at index "+index_max);
    //to check min
     double num_min = arr[0];
       int index_min=0;
        for(int min=0;min<size;min++){
             if(arr[min]<num_min){
                num_min = arr[min];
                index_min = min;
             } 
      }
    System.out.println("Minimum element "+num_min+" found at index "+index_min);
    // to make sum
    double sum =0;
    for(int index_sum=0;index_sum<size;index_sum++){
        sum= sum+arr[index_sum];
    }
        double avg = sum/size;
    System.out.println("Summation:"+sum);
    System.out.println("Average:"+avg);
    }
}


/* Task7  You are given an integer array. You need to create a new array that will contain only the unique elements of the given array. Finally, print the new array. 
Given Array:  int arr [] = {23,100,23,56,100};
Sample Output:
Input array: 
23 100 23 56 100
New array:
23 100 56       */

import java.util.Arrays;
class task7{
    public static void main(String [] args){
        int [] arr={-5,10,-7,-5};
        int [] newarr = new int[3];
        String sum ="";
         String sum1 ="";
        for(int i =0;i<arr.length;i++){
            sum = sum+" "+arr[i];
        }
        System.out.println("Input array: ");
          System.out.println(sum);
          for(int out=0;out<arr.length;out++){
              for(int in=(out+1);in<arr.length;in++){
              if(arr[out]==arr[in]){
                arr[in]= arr[out]-arr[in];  
              }
              else{
              }
          }
          } 
          int n=0;
          while(n<3){
            for(int o=0;o<arr.length;o++){
                if(arr[o]==0){
                    
                }
                else{
                    newarr[n] = arr[o];
                    n++;
                }
            }  
          }
        for(int i1 =0;i1<3;i1++){
            sum1 = sum1+" "+newarr[i1];
        }
        System.out.println("New array: ");
          System.out.println(sum1);  
    }
}


/* Task8   Write a Java program that will take input of two arrays and elements from the user and check whether the second array is a subset of the first array.
A subset is a set that contains only elements found in the original set.   */

import java.util.*;
  class task8{
      public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    // array1
    System.out.println("Please enter the length of array 1:");
        int leg1=sc.nextInt();
        int [] arr = new int[leg1];
        for(int e1=0;e1<leg1;e1++){
    System.out.println("Please enter the elements of the arr1:");
         arr[e1]= sc.nextInt();
         }
    //array2
    System.out.println("Please enter the length of array 2:");
        int leg2=sc.nextInt();
        int [] arr2 = new int[leg2];
        for(int e2=0;e2<leg2;e2++){
    System.out.println("Please enter the elements of the arr2:");
         arr2[e2]= sc.nextInt();
         }
        //arr2 ar prottek elemnt check
        int sum = 0;
        for(int out=0;out<leg2;out++){ //arr2
            for(int in =0;in<leg1;in++){  //arr1
               if(arr2[out] ==arr[in]){
                   sum =sum +1;
               } 
            }
        }
        if(sum == leg2){
        System.out.println("Array 2 is a subset of Array 1.");
        }
        else{
        System.out.println("Array 2 is not a subset of Array 1.");    
        }
      }
  }
