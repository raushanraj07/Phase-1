package oops;

public class Multiple {
    public int multiple(int x, int y) 
    { 
        return (x * y); 
    } 
    public int multiple(int x, int y, int z) 
    { 
        return (x * y * z); 
    } 
    public double multiple(double x, double y) 
    { 
        return (x * y); 
    } 
    public static void main(String args[]) 
    { 
        Multiple s = new Multiple(); 
        System.out.println(s.multiple(10, 20)); 
        System.out.println(s.multiple(10, 20, 30)); 
        System.out.println(s.multiple(10.5, 20.5)); 
    } 

}
