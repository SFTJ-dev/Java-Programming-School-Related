public class Logical{
    
    public static void main(String[] args){
        
        int x = 70;
        int y = 5;
        
        System.out.println( x + ">=" + y + " && " + x + "!=" + y + "=" + ( x >= y && x != y ));
        System.out.println( x + ">" + y + " && " + x + "==" + y + "=" + ( x > y && x == y ));
        System.out.println( x + "<=" + y + " && " + x + ">=" + y + "=" + ( x >= y && x <= y ));
        System.out.println( x + "==" + y + " && " + x + "<=" + y + "=" + ( x == y && x <= y ));
        
        System.out.println( x + "!=" + y + " || " + x + ">" + y + "=" + ( x != y || x > y ));
        System.out.println( x + "!=" + y + " || " + x + "==" + y + "=" + ( x != y || x == y ));
        System.out.println( x + "==" + y + " || " + x + "!=" + y + "=" + ( x == y || x != y ));
        System.out.println( x + "==" + y + " || " + x + "<" + y + "=" + ( x == y || x < y ));
    }
}
