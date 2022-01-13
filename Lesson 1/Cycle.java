public class Cycle {

    public static void main(String[] args) {
       for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        
        System.out.println(" ");

        int number = 6;
        while (number >= -6) {
            System.out.println(number);
            number -= 2;
        }
        
        System.out.println(" ");

        int numbers = 10;
        int sumOdd = 0;
        do {
            if (numbers % 2 == 1) {
                sumOdd += numbers;
             }            
            numbers++;
        } while (numbers < 20);
        System.out.println(sumOdd);
    }    
}