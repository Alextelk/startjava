public class ConditionalStatement {
    
    public static void main (String[]args) {
        int age =27;
        char sex = 'M';
        double height = 1.80;
        char firstLetterOfName = 'M';
        char letterOfName = 'I';

        if (age > 20) {
            System.out.println("Вы взрослый");
        }
        if (sex == 'M') {
            System.out.println("Вы мужчина");
        } else if (sex != 'M') {
            System.out.println("Вы женщина");
        }
        if (height < 1.80) {
            System.out.println("Вам надо подрасти");
        } else {
            System.out.println("У вас нормальный рост");
        }
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (letterOfName == 'I') {
            System.out.println("Первая буква имени И");
        } else {
            System.out.println("Первая буква имени неизвестна");
        }

    }
}