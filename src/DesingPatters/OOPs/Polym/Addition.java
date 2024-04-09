package DesingPatters.OOPs.Polym;

public class Addition {
//    We basically have runtime and compile
//    time polymorphism which are method
//    overriding and method overloading respectively.
//    Here we are seeing method overloading first.
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(int a, double b){
        return a + b;
    }
}
