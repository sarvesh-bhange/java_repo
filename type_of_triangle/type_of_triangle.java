public class type_of_triangle{

    public static void main(short angle_a,short angle_b,short angle_c){
    
        if(angle_a+angle_b+angle_c == 180){
            System.out.println("Triangle can be formed");
            if(angle_a ==90 || angle_b == 90 || angle_c == 90){
                System.out.println("The triangle formed is right angled triangle");            
            }
            
            else if(angle_a <90 || angle_b <90 || angle_c <90){
                System.out.println("The triangle formed is acute angled triangle");            
            }
            
            else{
                System.out.println("The triangle formed is otuse angled triangle");
            }    
        }
    
        else{
            System.out.println("Triangle can not be formed");
        }

}
}