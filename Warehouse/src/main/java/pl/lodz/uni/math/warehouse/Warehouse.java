/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.warehouse;

import java.util.ArrayList;

/**
 *
 * @author Comarch
 */
public class Warehouse {
    
    private final int fieldDepth;
    private final int fieldHeight;
    private final int fieldWidth;

    public Warehouse(int fieldDepth, int fieldHeight, int fieldWidth) {
        this.fieldDepth = fieldDepth;
        this.fieldHeight = fieldHeight;
        this.fieldWidth = fieldWidth;
    }

    public Package getPackageByNumber(String packageNumber){
        return null;
    }
    
    public ArrayList getAllPackagesByType(Enum TypeOfPackage){
        return new ArrayList();
    }
}
