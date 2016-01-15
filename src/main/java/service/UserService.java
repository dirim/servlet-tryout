package service;

import model.User;
import java.util.ArrayList;

/**
 * Created by dirim on 12/23/2015.
 */
public class UserService {
    private ArrayList<User> users;
    private static UserService instance = null;

    protected UserService(){
        this.users = new ArrayList<>();
    }

    public static UserService getInstance() {
        if(instance == null) {
            instance = new UserService();
        }
        return instance;
    }

    public void  addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser(String ID){
        for(User us: users) {
            if (us.getID().equals(ID)) {
                return us;
            }
        }
        return null;
    }


}
