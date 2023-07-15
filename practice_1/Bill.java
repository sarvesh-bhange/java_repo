public class Bill{
    public static void main(){
        int four_burgers_total = 4*45;
        int Mcpuffs_total = 3*25;
        int discount = 50;
        
        int total_bill = four_burgers_total + Mcpuffs_total - discount;
        
        System.out.println("Bill: "+total_bill);
    }
}