package DesingPatters.OOPs.Polym;

public class Client {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println(addition.add(2,4));
        System.out.println(addition.add(3,4,5));
        System.out.println(addition.add(1,2.8));
    }
}
