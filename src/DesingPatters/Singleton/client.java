package DesingPatters.Singleton;

public class client {
    public static void main(String[] args) {
        dataBaseConnection dbc1 = dataBaseConnection.getInstance();
        dataBaseConnection dbc2 = dataBaseConnection.getInstance();


        System.out.println("DEBUG");
    }
}
