package org.sys.Pets;

import java.util.Date;

public abstract class Pet {
    
    private int id;
    private String name;
    private char gender;
    private Date date;
    
    public Pet(int id,String nombre, char gender,Date date){
      this.id = id;  
      this.name = nombre;
      this.gender = gender;
      this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
