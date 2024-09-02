package startjava.jaeger;

import java.time.LocalDate;

public class Jaeger {
    private String modelName;
    private int mark;
    private double height;
    private double weight;
    private String status;
    private String origin;
    private LocalDate launchDate;
    private int kaijuKilled;

    public Jaeger(String modelName, int mark, double height, double weight, String status,
                  String origin, LocalDate launchDate, int kaijuKilled) {
        this.modelName = modelName;
        this.mark = mark;
        this.height = height;
        this.weight = weight;
        this.status = status;
        this.origin = origin;
        this.launchDate = launchDate;
        this.kaijuKilled = kaijuKilled;
    }

    public Jaeger() {
        this("", 0, 0, 0, "", "", LocalDate.now(), 0);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public void setLaunchDate(LocalDate launchDate) {
        this.launchDate = launchDate;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    void drift() {
        System.out.println("drifting is on");
    }

    void move() {
        System.out.println("moving");
    }

    String scanKaiju() {
        return "scanning";
    }

    void fight() {
        System.out.println("fighting");
    }

    void useWeapon() {
        System.out.println("use weapon");
    }
}