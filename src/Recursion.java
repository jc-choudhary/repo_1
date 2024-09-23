import java.util.*;
public class Recursion {
//  PRINT NUMBERS FROM 1 TO 5:

//     public static void printNumb(int n){
//    if(n==6){
//     return ;
//    }

//     System.out.println(n);
//     printNumb(n+1);
// }
//     public static void main(String[]args){
//         int n = 1;
//         printNumb(n);
// ===================================================================================================================================

        // PRINT NUMBERS FROM 5 TO 1:

//    public static void printNumb(int n){
//     if(n==0){
//         return ;
//     }
//     System.out.println(n);
//     printNumb(n-1);
//    }
//     public static void main(String[]agrs){
//         int n = 5;
//         printNumb(n);

//     }
// =========================================================================================================================================================

    // PRINT SUM OF FIRST N NATURAL NUMBERS:

    // public static void printSum(int i,int n,int sum){
    //     if(i==n){
    //         sum = sum + i;
    //         System.out.println(sum);
    //         return ;
    //     }
    //     sum = sum+i;
    //     printSum(i+1,n,sum);
    // }
    // public static void main(String[]args){
    //    printSum(1,5,0);
    // }
// ======================================================================================================================================================================
 
        // PRINT FACTORIAL OF A NUMBER N:

    // public static int calFactorial(int n){
    //  if(n==1||n==0){
    //     return 1;
    //  }

    //  int fact_nm1 = calFactorial(n-1);
    //  int fact_n = n * fact_nm1;
    //  return fact_n;
    // }   
    //     public static void main(String[]args){
    //     int n=3;
    //     int ans = calFactorial(n);
    //     System.out.println(ans);
    //     }
// =======================================================================================================================================================================

        // PRINT THE FIBONACCI SEQUENCE TILL Nth TERM:
     
    // public static void printFibo(int a,int b,int n){
    // if(n==0){
    //     return ;
    // }
    // int c = a + b;
    // System.out.println(c);
    // printFibo(b,c,n-1);
    //    } 
    //     public static void main(String[]args){

    //         int a = 0;
    //         int b = 1;
    //         System.out.println(a);
    //         System.out.println(b);
    //         int n = 7;
    //         printFibo(a,b,n-2);
        // }
// =======================================================================================================================================================================
   
        // PRINT x^n(stack height=n):
    
// public static int calpowz(int x,int n){
// if(n==0){
// return 1;
// }
// int pownm1=calpowz(x,n-1);
// int pown=pownm1*x;
// return pown;
// }
// public static void main(String[]args){
// int x = 2 , n = 2;
// System.out.println(calpowz(x,n));
// }

// ======================================================================================================================================================================
    // TOWER OF HANOI: 

// public static void towerOfHanoi(int n,String src,String helper,String dest){
// if(n==1){
//     System.out.println("Transfer Disk " +n+ " from " +src+ " to " + dest );
//     return;
// }
// towerOfHanoi(n-1,src,dest,helper);
// System.out.println("Transfer Disk "  +n+ " from "  +src+ " to " + dest);
// towerOfHanoi(n-1,helper,src,dest);
// }
// public static void main(String[]args){
// int n=2;
// towerOfHanoi(n,"S","H","D");
// }
// =================================================================================================================================================================

    // PRINT A STRING IN REVERSE:
    
    // public static void printRev(String str,int idx){
    // if(idx==0){
    // System.out.println(str.charAt(idx));
    // return ;
    // }
    // System.out.println(str.charAt(idx));
    // printRev(str,idx-1);
// }
    // public static void main(String[]args){
    // String str = "mahbuhs udnag";
    // printRev(str,str.length()-1);
//    }
// ==========================================================================================================================================================================
   
    // CHECK IF AN ARRAY IS SORTED(STRICTLY INCREASING):


    //  public static boolean isSorted(int arr[],int idx){
    //     if(idx==arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx]<arr[idx+1]){
    //        return  isSorted(arr,idx+1);
    //     }else{
    //         return false;
    //     }
    //  }
    //  public static void main(String[]args){
    //     int arr[]={1,3,5};
    //     System.out.println(isSorted(arr,0));

//===============================================================================================================================================================================
 
    //  MOVE ALL 'X' TO THE END OF THE STRING: "axbcxxd"

// public static void moveAllX(String str,int idx,int count,String newstring){
//     if(idx==str.length()){
//         for(int i=0;i<count;i++){
//             newstring=newstring + 'x';
//         }
//             System.out.println(newstring);
//             return;
//     }
//     char currChar = str.charAt(idx);
//     if(currChar=='X'){
//     count++;
//     moveAllX(str,idx+1,count,newstring);
//     }else{
//         newstring=newstring + currChar; 
//         moveAllX(str,idx+1,count,newstring);
//     }
// }
// public static void main(String[]args){
//     String str = "axbcxxd";
//     moveAllX(str,0,0,"");
// }
// ========================================================================================================================================

    // PRINT ALL THE SUBSEQUENCES OF A STRING "abc"

    // public static void subsequences(String str,int idx,String newstring){
    //     if(idx==str.length()){
    //         System.out.println(newstring);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     subsequences(str,idx+1,newstring+currChar);
    //     subsequences(str,idx+1,newstring);
    // } 
    // public static void main(String[]args){
    //     String str = "abc";
    //     subsequences(str,0,"");
    // }

// ===========================================================================================================================================

  

}
  









   










