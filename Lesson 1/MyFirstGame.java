public class MyFirstGame {
    
    public static void main(String[] args) {
        int randomNumber = 100;
        int userNumber = 50;
        while (userNumber != randomNumber) {
            userNumber--;
            if (userNumber > randomNumber) {
                System.out.println("Данное число " + userNumber + " больше того, что загадал компьютер");
            } else if (userNumber < randomNumber) {
                System.out.println("Данное число " + userNumber + " меньше того, что загадал компьютер");
                break;
            }
        }

        while (userNumber != randomNumber) {
            userNumber++;
            if (userNumber > randomNumber) {
                System.out.println("Данное число " + userNumber + " больше того, что загадал компьютер");
                break;
            } else if (userNumber < randomNumber) {
                System.out.println("Данное число " + userNumber + " меньше того, что загадал компьютер");
            }
        }
        System.out.println("Поздравляю, число " + randomNumber + " угадано!");
    }
}