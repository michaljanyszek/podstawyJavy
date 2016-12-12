/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import java.util.ArrayList;

/**
 *
 * @author micha
 */
public class DaoFactory {

    private Enum source;

    public ArrayList<User> selectAllUsers() {
        ArrayList<User> userList = null;

        initializeUsersList(userList);

        return userList;
    }

    public User selectUserById(int userId) {
        ArrayList<User> userList = null;

        initializeUsersList(userList);

        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void setSourceOfData(Enum Source) {
        this.source = Source;
    }

    public void initializeUsersList(ArrayList<User> users) {
        if (source == Source.DB) {
            users = DB.getInstance().getUsers();
        } else if (source == Source.WebService) {
            users = WebService.getInstance().getUsers();
        } else if (source == Source.Xml) {
            users = Xml.getInstance().getUsers();
        }
    }
}
