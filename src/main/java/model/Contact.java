package model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Contact implements Serializable{

    private int id;
    private String name;

    public Contact() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
