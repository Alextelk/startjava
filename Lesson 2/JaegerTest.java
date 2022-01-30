public class JaegerTest {

    public static void main(String[] args) {
        Jaeger typhoon = new Jaeger();
        typhoon.setModelName("Crimson Typhoon");
        typhoon.setMark("Mark-4");
        typhoon.setStrength(8);
        typhoon.setArmor(6);
        System.out.println(typhoon.getModelName());
        System.out.println(typhoon.getMark());
        System.out.println(typhoon.getStrength());
        System.out.println(typhoon.getArmor());

        typhoon.fight();
        typhoon.useWeapon();
        System.out.println(typhoon.scanKaiju() + "\n");

        Jaeger danger = new Jaeger();
        danger.setModelName("Gipsy Danger");
        danger.setMark("Mark-3");
        danger.setStrength(8);
        danger.setArmor(6);
        System.out.println(danger.getModelName());
        System.out.println(danger.getMark());
        System.out.println(danger.getStrength());
        System.out.println(danger.getArmor());

        danger.fight();
        danger.useWeapon();
        System.out.println(danger.scanKaiju());
    }
}