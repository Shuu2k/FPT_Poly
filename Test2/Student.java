/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test2;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Student implements Serializable {
    
    private int sID;
    private String name;
    private String gender;
    private double marks;

    public int getSID() {
        return sID;
    }

    public void setSID(int sID) {
        this.sID = sID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Student() {
    }
}
