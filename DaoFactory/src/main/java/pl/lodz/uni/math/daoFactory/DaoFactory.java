/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import pl.lodz.uni.math.user.User;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author micha
 */
public class DaoFactory {

    private ISource source=null;

    private final HashMap<Enum, ISource> sources = new HashMap<>();

    {
        sources.put(Source.DB, DB.getInstance());
        sources.put(Source.Xml, Xml.getInstance());
        sources.put(Source.WebService, WebService.getInstance());
    }

    public ArrayList<User> selectAllUsers() throws Exception {
        if (source == null) {
            throw new Exception("First set source");
        }

        ArrayList<User> userList = source.getUsers();

        return userList;
    }

    public User selectUserById(int userId) throws Exception {
        if (source == null) {
            throw new Exception("First set source");
        }

        ArrayList<User> userList = source.getUsers();

        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void setSourceOfData(Enum Source) {
        this.source = sources.get(Source);
    }
    
    public void setSourceForTests(ISource source){
        this.source=source;
    }
}
