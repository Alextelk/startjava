public class Cycle {

    public static void main(String[] args) {

       for (int i = 0; i<=20; i++) {
            System.out.println(i);
        }
        
        System.out.println(" ");

        int number = 6;
        while (number >= -6) {
            System.out.println(number);
            number = number - 2;
        }
        
        System.out.println(" ");

        int oddNumber = 10;
        boolean isTrue;
        int sum = 0;
        do {
            isTrue = oddNumber % 2 == 1;
            if (isTrue) {
                sum = sum + oddNumber;
             }            
            oddNumber++;
        } while (oddNumber < 20);
        System.out.println(sum);
    }    
}