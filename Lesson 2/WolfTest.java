public class WolfTest {

    public static void main(String[] args) {
        Wolf greyWolf = new Wolf();
        greyWolf.sex = 'M';
        greyWolf.name = "Серый";
        greyWolf.weight = 30;
        greyWolf.age = 3;
        greyWolf.color = "Серый";
        System.out.println(greyWolf.sex);
        System.out.println(greyWolf.name);
        System.out.println(greyWolf.weight);
        System.out.println(greyWolf.age);
        System.out.println(greyWolf.color);

        greyWolf.walk();
        greyWolf.sit();
        greyWolf.run();
        greyWolf.howl();
        greyWolf.hunt();
    }
}