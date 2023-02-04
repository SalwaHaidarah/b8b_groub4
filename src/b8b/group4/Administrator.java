package b8b.group4;


import java.util.ArrayList;

public class Administrator {
    private String userName;
    private String password;
    private String name;
    static ArrayList<Item> items;
    private static Administrator admin = null; //Singlton

//CONSREUCTOR
    private Administrator(String userName, String password, String name) { //Singlton
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

//SETTERS AND GETTERS
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public static Administrator getInstace(){ //Singlton
        if (admin == null){
             admin = new Administrator("Kh_99", "1234", "Khadegah");
        }
        return admin;
    }
}
