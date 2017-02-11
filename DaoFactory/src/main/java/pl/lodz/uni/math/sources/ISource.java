/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.sources;

import pl.lodz.uni.math.user.User;
import java.util.List;

/**
 *
 * @author micha
 */
public interface ISource {
    public List<User> selectAllUsers();
    public User selectUserById(int id);
}
