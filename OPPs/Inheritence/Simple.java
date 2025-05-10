package Inheritence;
class Parent{

    void Intro(){
        System.out.println("I am a parent class");
    }
}
class Child extends Parent{

    void dis(){
        System.out.println("I am a Child class");
    }
}

public class Simple{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.Intro();
        obj.dis();
    }
}


