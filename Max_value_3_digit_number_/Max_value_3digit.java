import java.lang.Math.*;

public class Max_value_3digit{
    
    public static void main(){
        /**statement to entre a four digit number(9736) and find sum of its digts(9+7+3+6=25)**/
        
        short num = 9736;
        
        short first = (short) (num/1000); //9
        
        short second = (short) ((num%1000)/100);//7
        
        short temp_1 = (short) ((num%1000)%100);//36
        
        short third = (short) (temp_1%10);//6
        
        short fourth = (short) (temp_1/10);//3
        
        int addition = first+second+third+fourth;
        
        System.out.println("Addition is :"+addition);//25 
    
    }

}