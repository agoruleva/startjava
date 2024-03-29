import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Coyote Tango");
        jaegerOne.setLaunchDate(LocalDate.of(2015, Month.DECEMBER, 30));
        jaegerOne.setMark(1);
        jaegerOne.setOrigin("Japan");
        jaegerOne.setHeight(85.34);
        jaegerOne.setWeight(7450);
        jaegerOne.setSpeed(5);
        jaegerOne.setStrength(7);
        jaegerOne.setArmor(4);

        System.out.println("Model name: " + jaegerOne.getModelName());
        System.out.printf(Locale.US, "Launched: %1$tB %1$te, %1$tY%n", jaegerOne.getLaunchDate());
        System.out.println("Mark: Mark-" + jaegerOne.getMark());
        System.out.println("Origin: " + jaegerOne.getOrigin());
        System.out.println("Height: " + jaegerOne.getHeight());
        System.out.println("Weight: " + jaegerOne.getWeight());
        System.out.println("Speed: " + jaegerOne.getSpeed());
        System.out.println("Strength: " + jaegerOne.getStrength());
        System.out.printf("Armor: %d%n%n", jaegerOne.getArmor());

        jaegerOne.drift();
        jaegerOne.move();
        System.out.println(jaegerOne.scanKaiju());
        jaegerOne.fight();
        jaegerOne.useWeapon();

        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setLaunchDate(LocalDate.of(2017, Month.JULY, 10));
        jaegerOne.setMark(3);
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25);
        jaegerOne.setWeight(7080);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        System.out.println("\nAfter changing jaegerOne's parameters:");
        System.out.println("Model name: " + jaegerOne.getModelName());
        System.out.printf(Locale.US, "Launched: %1$tB %1$te, %1$tY%n", jaegerOne.getLaunchDate());
        System.out.println("Mark: Mark-" + jaegerOne.getMark());
        System.out.println("Origin: " + jaegerOne.getOrigin());
        System.out.println("Height: " + jaegerOne.getHeight());
        System.out.println("Weight: " + jaegerOne.getWeight());
        System.out.println("Speed: " + jaegerOne.getSpeed());
        System.out.println("Strength: " + jaegerOne.getStrength());
        System.out.printf("Armor: %d%n%n", jaegerOne.getArmor());

        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", LocalDate.of(2015, Month.APRIL, 4), 1, "Russia",
                85.34, 6912, 3, 10, 10);
        System.out.println("Model name: " + jaegerTwo.getModelName());
        System.out.printf(Locale.US, "Launched: %1$tB %1$te, %1$tY%n", jaegerTwo.getLaunchDate());
        System.out.println("Mark: Mark-" + jaegerTwo.getMark());
        System.out.println("Origin: " + jaegerTwo.getOrigin());
        System.out.println("Height: " + jaegerTwo.getHeight());
        System.out.println("Weight: " + jaegerTwo.getWeight());
        System.out.println("Speed: " + jaegerTwo.getSpeed());
        System.out.println("Strength: " + jaegerTwo.getStrength());
        System.out.printf("Armor: %d%n%n", jaegerTwo.getArmor());

        jaegerTwo.drift();
        jaegerTwo.move();
        System.out.println(jaegerTwo.scanKaiju());
        jaegerTwo.fight();
        jaegerTwo.useWeapon();

        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setLaunchDate(LocalDate.of(2019, Month.NOVEMBER, 2));
        jaegerTwo.setMark(5);
        jaegerTwo.setOrigin("Australia");
        jaegerTwo.setHeight(76.2);
        jaegerTwo.setWeight(6650);
        jaegerTwo.setSpeed(10);
        jaegerTwo.setStrength(10);
        jaegerTwo.setArmor(9);

        System.out.println("\nAfter changing jaegerTwo's parameters:");
        System.out.println("Model name: " + jaegerTwo.getModelName());
        System.out.printf(Locale.US, "Launched: %1$tB %1$te, %1$tY%n", jaegerTwo.getLaunchDate());
        System.out.println("Mark: Mark-" + jaegerTwo.getMark());
        System.out.println("Origin: " + jaegerTwo.getOrigin());
        System.out.println("Height: " + jaegerTwo.getHeight());
        System.out.println("Weight: " + jaegerTwo.getWeight());
        System.out.println("Speed: " + jaegerTwo.getSpeed());
        System.out.println("Strength: " + jaegerTwo.getStrength());
        System.out.printf("Armor: %d%n", jaegerTwo.getArmor());
    }
}