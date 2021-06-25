/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.util.*;
import java.io.*;
/**
 *
 * @author Azeez
 */
public class student implements Serializable
{   private String name,dept,regno,batch,sec;
    private String year,sex;
    Sem sem[] = new Sem[8];

    public student(String name, String regno , String batch, String sec, String year, String sex) {
        this.name = name;
        this.dept = "CSE";
        this.regno = regno;
        this.batch = batch;
        this.sec = sec;
        this.year = year;
        this.sex=sex;
        for(int i=0;i<8;i++)
            sem[i] = new Sem();
    }

    public boolean equals(student st)
    {
        return(this.name.equals(st.name) &&
                this.year==st.year);
    }      

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

}
