/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.sources;

import java.util.ArrayList;
import pl.lodz.uni.math.user.User;
import java.util.List;
import java.util.logging.Logger;
import org.easymock.EasyMock;

/**
 *
 * @author micha
 */
public class DB implements ISource{
    private static DB instance;
    private final User userMock=EasyMock.createMock(User.class);
    public static final Logger LOGGER = Logger.getLogger(DB.class.getName());
    
    private DB(){}
    
    public static DB getInstance(){
        if(instance==null)
            instance=new DB();
        return instance;
    }
    
    @Override
    public List<User> selectAllUsers() {
        List<User> mockList = EasyMock.createMock(ArrayList.class);
        EasyMock.expect(mockList.size()).andReturn(1);
        EasyMock.expect(mockList.get(0)).andReturn(userMock);
        EasyMock.replay(mockList);
        
        return mockList;
    }

    @Override
    public User selectUserById(int id) {
        EasyMock.expect(userMock.getId()).andReturn(id);
        EasyMock.expect(userMock.getFirstName()).andReturn("Jan");
        EasyMock.expect(userMock.getLastName()).andReturn("Kowalski");
        EasyMock.replay(userMock);
        
        LOGGER.info(userMock.getId() + " " + userMock.getFirstName() + " " + userMock.getLastName());
        return userMock;
    }
}
