package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // 1: Annotate with @Entity
public class Friend { // 0: Regula Java class with attributes, constructor, methods
    @Id // 2: Create class attribute for primary key and annotate with @Id
    private long id;
    private String fullName;
    private String phone;

    //Not relevant how the id attribute is specified
    
    public Friend (String fullName, String phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    public Friend() { // 3. Provide default constroctor if non-default is present

    }
    
    public String getName() {
        return this.fullName;
    }

    public String getPhone() {
        return phone;
    }
    // this.name in getName only because of company guidlines (not requiered), same function as getPhone - return phone;

    
}
