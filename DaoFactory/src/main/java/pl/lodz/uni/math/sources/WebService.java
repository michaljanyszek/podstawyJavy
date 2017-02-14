/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.sources;

import pl.lodz.uni.math.user.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.easymock.EasyMock;

/**
 *
 * @author micha
 */
public class WebService implements ISource{
    private static WebService instance;
    private User userMock=null;
    public static final Logger LOGGER = Logger.getLogger(WebService.class.getName());
    
    private WebService(){}
    
    public static WebService getInstance(){
        if(instance==null)
            instance=new WebService();
        return instance;
    }
    
    @Override
    public List<User> selectAllUsers() {
        userMock = EasyMock.createMock(User.class);
        List<User> mockList = EasyMock.createMock(ArrayList.class);
        EasyMock.expect(mockList.size()).andReturn(1);
        EasyMock.expect(mockList.get(0)).andReturn(userMock);
        EasyMock.replay(mockList);
        
        return mockList;
    }

    @Override
    public User selectUserById(int id) {
        userMock = EasyMock.createMock(User.class);
        EasyMock.expect(userMock.getId()).andReturn(id);
        EasyMock.expect(userMock.getFirstName()).andReturn("Adam");
        EasyMock.expect(userMock.getLastName()).andReturn("Nowak");
        EasyMock.replay(userMock);
        
        LOGGER.info(userMock.getId() + " " + userMock.getFirstName() + " " + userMock.getLastName());
        return userMock;
    }
}
