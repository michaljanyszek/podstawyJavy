/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.lodz.uni.math.packag;

import java.util.Date;

/**
 *
 * @author Comarch
 */
public class Package {
    private  Enum typeOfPackage;
    private String description;
    private Date addedDate;
    private int numberOfSwitching=0;
    private int packageNumber;
    private int priority;

    public Package(Enum typeOfPackage, String description, Date addedDate, int packageNumber, int priority) {
        this.typeOfPackage = typeOfPackage;
        this.description = description;
        this.addedDate = addedDate;
        this.packageNumber = packageNumber;
        this.priority = priority;
    }

    public Enum getTypeOfPackage() {
        return typeOfPackage;
    }

    public void setTypeOfPackage(Enum typeOfPackage) {
        this.typeOfPackage = typeOfPackage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public int getPackageNumber() {
        return packageNumber;
    }

    public void setPackageNumber(int packageNumber) {
        this.packageNumber = packageNumber;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}
