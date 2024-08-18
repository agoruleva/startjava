package startjava.jaeger;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Coyote Tango");
        jaegerOne.setMark(1);
        jaegerOne.setHeight(85.34);
        jaegerOne.setWeight(7450);
        jaegerOne.setStatus("Active");
        jaegerOne.setOrigin("Japan");
        jaegerOne.setLaunchDate(LocalDate.of(2015, Month.DECEMBER, 30));
        jaegerOne.setKaijuKilled(2);

        printJaegerInfo(jaegerOne);

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
        jaegerOne.setKaijuKilled(9);

        System.out.println("\nAfter changing jaegerOne's parameters:");
        printJaegerInfo(jaegerOne);

        Jaeger jaegerTwo = new Jaeger("Cherno Alpha", 1, 85.34, 6912, "Active", "Russia",
                LocalDate.of(2015, Month.APRIL, 4), 6);
        printJaegerInfo(jaegerTwo);

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
        jaegerTwo.setKaijuKilled(11);

        System.out.println("\nAfter changing jaegerTwo's parameters:");
        printJaegerInfo(jaegerTwo);
    }

    private static void printJaegerInfo(Jaeger jaeger) {
        System.out.println("Model name: " + jaeger.getModelName());
        System.out.println("Mark-" + jaeger.getMark());
        System.out.println("Height: " + jaeger.getHeight());
        System.out.println("Weight: " + jaeger.getWeight());
        System.out.println("Status: " + jaeger.getStatus());
        System.out.println("Origin: " + jaeger.getOrigin());
        System.out.println("Launched: " + jaeger.getLaunchDate()
                .format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.US)));
        System.out.println("Kaiju killed: " + jaeger.getKaijuKilled());
        System.out.println();
    }
}