package lesson01.online;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Иванов Иван Иванович", "водитель", "+71111111",
                25000, 45);
        System.out.println(worker1.getFamily());
        System.out.println(worker1.getPost());


        Worker[] worker2 = new Worker[5];
        worker2[0] = new Worker("Иванов Иван Иванович", "водитель", "+71111111",
                25000, 34);
        worker2[1] = new Worker("Петров Петр Петрович", "грузчик", "+72222222",
                15000, 40);
        worker2[2] = new Worker("Сидоров Андрей Андреевич", "руководитель", "+73333333",
                75000, 36);
        worker2[3] = new Worker("Кузнецов Кузьма Иванович", "бухгалтер", "+74444444",
                25000, 33);
        worker2[4] = new Worker("Иванова Марья Ивановна", "секретарь", "+75555555",
                25000, 25);

        for (int i = 0; i < worker2.length; i++) {
            if (worker2[i].getAge() > 35) {
                System.out.print(worker2[i].getFamily() + ", ");
                System.out.print(worker2[i].getPost() + ", ");
                System.out.print(worker2[i].getTelephone() + ", ");
                System.out.print(worker2[i].getPay() + ", ");
                System.out.println(worker2[i].getAge());

            }

        }
        }

    }



