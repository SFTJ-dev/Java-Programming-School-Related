public class ArithmeticExample{
    
    public static void main(String[] args){
        
        int x = 10;
        int y = 5;
        int sum = 0;
        int diff = 0;
        int prod = 0;
        int quo = 0;
        int mod = 0;
        
        sum = x + y;
        diff = x - y;
        prod = x * y;
        quo = x / y;
        mod = x % y;
        
        System.out.println( x + "+" + y + "=" + sum );
        System.out.println( x + "-" + y + "=" + diff );
        System.out.println( x + "*" + y + "=" + prod );
        System.out.println( x + "/" + y + "=" + quo );
        System.out.print( x + "%" + y + "=" + mod );
        
    }
}
