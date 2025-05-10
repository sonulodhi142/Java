package Inheritence;

class Parent{

    void disP(){
        System.out.println("I am a parent class");
    }
}
class Child1 extends Parent{

    void dis1(){
        System.out.println("I am a Child 1 class");
    }
}
class Child2 extends Child1{

    void dis2(){
        System.out.println("I am a Child 2 class");
    }
}
class Child3 extends Child2{

    void dis3(){
        System.out.println("I am a Child 3 class");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Child3 obj = new Child3();
        obj.disP();
        obj.dis1();
        obj.dis2();
        obj.dis3();
    }
}
