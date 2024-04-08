package DesingPatters.Singleton;

import javax.lang.model.type.NullType;

public class dataBaseConnection {
    public static dataBaseConnection dbc = null;
    String url;
    int portNo;
    String username;
    String password;
    private dataBaseConnection(){
//        this.url = url;
//        this.portNo = portNo;
//        this.username = username;
//        this.password = password;
    }

    public static dataBaseConnection getInstance(){
        if (dbc == null){
            synchronized (dataBaseConnection.class){
                if (dbc == null){
                    dbc = new dataBaseConnection();
                }
            }
        }
        return dbc;
    }
}
