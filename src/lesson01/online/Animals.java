package lesson01.online;

public class Animals {
    protected String name;
    protected int run;
    protected int swim;
    protected double jump;

    public Animals(String name, int run, double jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
    }

    public void run(int distanceRun) {
        if (distanceRun <= run) {
            System.out.println(name + " я побежал!");
        } else {
            System.out.println(name + " я не могу пробежать, слишком большое расстояние.");
        }
    }

    public void jump(double height) {
        if (height <= jump) {
            System.out.println(name + " я прыгнул!");
        } else {
            System.out.println(name + " я не могу прыгнуть, слишком большая высота.");
        }
    }
    public void swim(int distanceSwim) {
        if (distanceSwim <= swim) {
            System.out.println(name + " я проплыл!");
        } else {
            System.out.println(name + " я не могу проплыть, слишком большое расстояние.");
        }
    }

}
