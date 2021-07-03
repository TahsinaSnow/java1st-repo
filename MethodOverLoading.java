
package MethodOverLoading;


public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calculator1=new Calculator();
        int res=calculator1.add(150, 156);
        res = calculator1.add(res, 156);
        res = calculator1.add(res, 156);
        System.out.println("Sum Four : "+res);
        System.out.println("Sum Two : "+calculator1.add(150, 156));
        System.out.println("Sum Two : "+calculator1.add(150.8, 156));
        System.out.println("Sum Two : "+calculator1.add(150, 156.8));
        System.out.println("Sum Four : "+calculator1.add(150,156,30,10));
        
        Calculator c1=new Calculator();
        System.out.println(c1.CalCulatePercantage(150, 50));
        System.out.println(c1.CalCulatePercantage(150, .50));
    }   
}
