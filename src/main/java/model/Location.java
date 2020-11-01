package model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String address;
    private String city;
    @OneToOne(mappedBy = "location") private Manager manager;
}
