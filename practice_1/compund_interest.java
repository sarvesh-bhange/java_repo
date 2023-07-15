public class compund_interest{
    
    public static void main(){
        
        int P = 12000;
        int T = 3;
        int R = 5;
        
        int amount = P*(1+R/100)*T;
        int interest = amount-P ;
        
        System.out.println("Amount "+amount);
        System.out.println("Interest "+interest);
    
    }
}