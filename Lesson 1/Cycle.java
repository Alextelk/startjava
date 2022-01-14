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

        number = 10;
        int sumOdd = 0;
        do {
            if (number % 2 == 1) {
                sumOdd += number;
             }            
            number++;
        } while (number < 20);
        System.out.println(sumOdd);
    }    
}