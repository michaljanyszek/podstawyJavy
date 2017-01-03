/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import pl.lodz.uni.math.user.User;
import java.util.ArrayList;

/**
 *
 * @author micha
 */
public interface ISource {
    public ArrayList<User> getUsers();
}
