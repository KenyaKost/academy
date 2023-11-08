package by.academy.lesson2;

public class Dog {
    String nickname;
    int age;
    String color;

    public Dog() {
        super();
    }

    public Dog(String nickname){
        super();
        this.nickname = nickname;
    }

    public Dog(String nickname, int age, String color){
        super();
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }

    public String getNickname(){
        return nickname;
    }

    public int getAge(){
        return age;
    }

    public String getColor(){
        return color;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public void setColor(String Color){
        this.color = color;
    }

    void eat(){
        System.out.println(nickname + " Ест(" + age + " " + color + ")");
    }

    void sleep(){
        System.out.println(nickname + " Спит(" + age + " " + color + ")");
    }

    void serve(){
        System.out.println(nickname + " Гавкает(" + age + " " + color + ")");
    }


}
