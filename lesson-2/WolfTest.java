public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex('m');
        wolf.setName("Белый клык");
        wolf.setWeight(92.3);
        wolf.setAge(5);
        wolf.setColor("Серый");

        System.out.println("Волк");
        System.out.println("пол: " + wolf.getSex());
        System.out.println("кличка: " + wolf.getName());
        System.out.printf("вес: %.2f кг%n", wolf.getWeight());
        System.out.printf("возраст: %d лет%n", wolf.getAge());
        System.out.printf("окрас: %s%n%n", wolf.getColor());

        wolf.go();
        wolf.run();
        wolf.hunt();
        wolf.seat();
        wolf.howl();
    }
}