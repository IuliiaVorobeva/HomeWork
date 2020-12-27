package lesson01.online;

public class Main5 {
    public static void main(String[] args) {
        Horse horse = new Horse("Horse", 1500, 3, 100);
        Cat cat = new Cat("Cat", 200, 2);
        Dog dog = new Dog("Dog", 500, 0.5, 10);
        Bird bird = new Bird("Bird", 5, 0.2);


        Animals[] animalsGroup = {horse, cat, dog, bird};
        for (int i = 0; i < animalsGroup.length; i++) {
            animalsGroup[i].run(160);
            animalsGroup[i].jump(0.3);
            animalsGroup[i].swim(11);

            // dog.run(700);

        }


    }
}
//кот бег: 200 м.,   ; прыжок: кот 2 м.; плавание: -
//собака 500 м.,          0.5 м.,                10
//Лошадь 1500 м.,         3м,                    100
//Птица 5 м.,             0.2 м                  -