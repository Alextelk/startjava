public class ConditionalStatement {
    
    public static void main(String[] args) {
        int age = 27;
        if (age > 20) {
            System.out.println("Вы взрослый");
        }

        char sex = 'M';
        if (sex == 'M') {
            System.out.println("Вы мужчина");
        } else if (sex != 'M') {
            System.out.println("Вы женщина");
        }

        double height = 1.80;
        if (height < 1.80) {
            System.out.println("Вам надо подрасти");
        } else {
            System.out.println("У вас нормальный рост");
        }

        char firstLetterOfName = 'M';
        if (firstLetterOfName == 'M') {
            System.out.println("Первая буква имени М");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Первая буква имени И");
        } else {
            System.out.println("Первая буква имени неизвестна");
        }
    }
}