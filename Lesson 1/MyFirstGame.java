public class MyFirstGame {
    
    public static void main(String[] args) {
        int randomNumber = 50;
        int userNumber = 0;
        while (userNumber != randomNumber) {
            userNumber++;
            if (userNumber > randomNumber) {
                System.out.println("Данное число " + userNumber + " больше того, что загадал компьютер");
            } else if (userNumber < randomNumber) {
                System.out.println("Данное число " + userNumber + " меньше того, что загадал компьютер");
            } else if (userNumber == randomNumber) {
                System.out.println("Поздравляю, число " + randomNumber + " угадано!");
                break;
            }
        }
    }
}