/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author micha
 */
public class DaoFactory {

    private ArrayList<User> users = new ArrayList<>();
    private Enum source;

    public ArrayList<User> selectAllUsers() {
        return users;
    }

    public User selectUserById(int user) {
        return new User();
    }

    public void setSourceOfData(Enum Source) {
        this.source = Source;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void addUsers(ArrayList<User> users) {
        this.users.addAll(users);
    }
}
