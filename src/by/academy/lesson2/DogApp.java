package by.academy.lesson2;
public class DogApp {
    public static void main(String[] args){



        Dog dog1 = new Dog("Дружок", 9, "Чёрный");
        Dog dog2 = new Dog("Гена", 12, "Коричневый");
        Dog dog3 = new Dog("Бен", 14, "Серый");

        System.out.println(dog1.nickname + " " + dog1.age + " " + dog1.color);
        System.out.println(dog2.nickname + " " + dog2.age + " " + dog2.color);
        System.out.println(dog3.nickname + " " + dog3.age + " " + dog3.color);

        System.out.println();

        dog1.eat();
        dog1.sleep();
        dog1.serve();

        System.out.println();

        dog2.eat();
        dog2.sleep();
        dog2.serve();

        System.out.println();

        dog3.eat();
        dog3.sleep();
        dog3.serve();

        String dogNickname = dog1.getNickname();
        System.out.println(dogNickname);

        int dogAge = dog1.getAge();
        System.out.println(dogAge);

        String dogColor = dog1.getColor();
        System.out.println(dogColor);

        dog1.setAge(0);
        System.out.println(dog1.nickname + " " + dog1.age + " " + dog1.color);

//        while (dog1.age < 7){
//            dog1.grow();
//            System.out.println(dog1.nickname + " " + dog1.age + " " + dog1.color);
//        }
//        System.out.println("Пора в школу");
        do {
            dog1.grow();
            System.out.println(dog1.nickname + " " + dog1.age);
        } while (dog1.age < 7 );
    }



}
