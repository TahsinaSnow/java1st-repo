
package MethodOverLoading;


public class Calculator {

   public int add(int a,int b){
     return a+b;
   }
   public double add(double a,int b){
     return a+b;
   }
   public double add(int a,double b){
     return a+b;
   }
   public double CalCulatePercantage(int a,int b){
     return (a*b)/100;
   }
   public double CalCulatePercantage(int a,double b){
     return a*b;
   }
  
    
   public int add(int a,int b,int c,int d){
     return a+b+c+d;
   }
    
}
