package model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity


public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long Id;
    private String lastName;
    private String firstName;
    private String address;
    private String city;
    private String email;
    @OneToOne(mappedBy = "customers") private Vehicles vehicles;


}
