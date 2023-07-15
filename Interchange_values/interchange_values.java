public class interchange_values{

    public static void main(byte a,byte b,byte c){

        System.out.println("first number:"+a+"\n"+b+"\n"+c);
        
        byte temp = a;//2
        a = c;//4
        c = b;//3
        b = temp;//2         
        
        System.out.println("swapped number:"+a+"\n"+b+"\n"+c);
    
    }

}