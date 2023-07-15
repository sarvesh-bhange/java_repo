public class find_money_withdrawl{

    public static void main(short num){
        /** to find money withdrawl from bank if the chaser has denomisions of 500,200,100 **/
        
        int notes_of_500 = num/500;
        
        int notes_of_200 = (num%500)/200;
        
        int notes_of_100 = ((num%500)%200)/100;
        
        String to_print ="Your money:"+num+"\n"+"500 notes:"+notes_of_500+"\n"+"notes of 200:"+notes_of_200+"\n"+"notes of 100:"+notes_of_100;
        
        System.out.println(to_print);
    
    }
}