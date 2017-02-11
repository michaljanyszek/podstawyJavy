/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.daoFactory;

import pl.lodz.uni.math.sources.DB;
import pl.lodz.uni.math.sources.WebService;
import pl.lodz.uni.math.sources.ISource;
import pl.lodz.uni.math.sources.Source;
import pl.lodz.uni.math.sources.Xml;
import pl.lodz.uni.math.user.User;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author micha
 */
public class DaoFactory implements IDaoFactory{

    private static ISource source=null;
    private HashMap<Enum, ISource> sources = new HashMap<>();

    public DaoFactory()
    {
        sources.put(Source.DB, DB.getInstance());
        sources.put(Source.Xml, Xml.getInstance());
        sources.put(Source.WebService, WebService.getInstance());
    }

    @Override
    public void setSourceOfData(Source Source) {
        this.source = sources.get(Source);
    }
    
    @Override
    public ISource getSource(){
        return source;
    }
}
