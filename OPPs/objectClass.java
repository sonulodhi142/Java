import java.util.Scanner;

class Students{
    String name;
    int RollNo; 
    int clas;

    void Input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name::");
        name = s.nextLine();
        System.out.print("Enter the RollNo.::");
        RollNo = s.nextInt();
        System.out.print("Enter the class::");
        clas = s.nextInt();
    }

    void Display(){
        System.out.println("name = "+name);
        System.out.println("RollNo. = "+RollNo);
        System.out.println("Class = "+clas);
    }
}

public class objectClass {

    public static void main(String[] args) {
        Students std = new Students();
        std.Input();
        std.Display();
    }
}