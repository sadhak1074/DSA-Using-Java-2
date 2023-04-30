public class clear_bit {
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int bit_mask = 1<<pos;

        int notBitmask = ~bit_mask;
        int new_number = notBitmask & n;
        System.out.println(new_number);
    }
}
