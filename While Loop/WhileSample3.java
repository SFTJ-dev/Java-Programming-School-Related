public class WhileSample3 {
    
    public static void main(String[] args){
        int x = 1; //Starting value
        
        while (x<=10) {
            if (x == 1||x == 2||x == 10){
                int result = (x == 10) ? 20 : x;
                System.out.println("$ x " + "= " + (x*2));
            }
            x++;
        }
    }
}
