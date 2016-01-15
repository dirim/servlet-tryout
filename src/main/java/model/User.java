package model;

/**
 * Created by dirim on 12/16/2015.
 */
public class User {
    private String ID;
    private String name;
    private String username;
    private String password;
    private String address;
    private String telephone;

    public User() { }

    public User(String ID){
        this.ID = ID;
    }

    public User(String ID, String name, String username, String password, String address, String telephone) {
        this.ID = ID;
        this.name = name;
        this.username= username;
        this.password=password;
        this.address= address;
        this.telephone=telephone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
