package model;

import liquibase.pro.packaged.S;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity

public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String lastname;
    private String firstname;
    private String address;
    private String city;
    private String email;
    @OneToMany(mappedBy = "manager") private List<Employers> employers;
    @OneToOne
    @JoinColumn(name = "location_id") private Location location;
}
