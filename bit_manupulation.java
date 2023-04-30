public class bit_manupulation{
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int mask = 1 << pos;
        if ((n & mask) != 0) {
            System.out.println("bit is a non-zero value");
        } else {
            System.out.println("Bit is a zero value");
        }

    }
    
}