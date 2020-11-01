package model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity


public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long Id;

    private String model;
    private String color;
    private String series;
    private Date yearOfProduction;
    private double price;
    @NotNull
    private String status;

    @OneToOne
    @JoinColumn(name = "customers_id")  private Customers customers;

}
