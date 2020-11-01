package model;

import com.sun.istack.NotNull;
import liquibase.pro.packaged.E;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Employers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String lastname;
    private String firstname;
    private String address;
    private String city;
    @ManyToOne
    @JoinColumn(name = "manager_id") private Manager manager;
}
