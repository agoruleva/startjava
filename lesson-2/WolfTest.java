public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = 'm';
        wolf.name = "Белый клык";
        wolf.weight = 92.3;
        wolf.age = 5;
        wolf.color = "серый";

        System.out.println("Волк");
        System.out.println("пол: " + wolf.sex);
        System.out.println("кличка: " + wolf.name);
        System.out.printf("вес: %.2f кг%n", wolf.weight);
        System.out.printf("возраст: %d лет%n", wolf.age);
        System.out.printf("окрас: %s%n%n", wolf.color);

        wolf.go();
        wolf.run();
        wolf.hunt();
        wolf.seat();
        wolf.howl();
    }
}