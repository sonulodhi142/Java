package polymorphizm;
class Operation{
    int sum(int a, int b){
        return a+b;
    }
    double sum(double a,double b){
        return a+b;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Operation obj = new Operation();
        System.out.println(obj.sum(6,7));
        System.out.println(obj.sum(5.5, 5.5));
    }
}
