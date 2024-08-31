package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "Person")
public class Person extends PanacheEntity {

    public String name;
    public int age;
}
