package com.example.demo.model;

// import javax.persistence.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity
@Table(name = "config")
public class Config {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String apartment;
    private double percentage;
    private int id_building;

    // Default constructor
    public Config() {
    }

    // Constructor
    public Config(String apartment, double percentage, int id_building) {
        this.apartment = apartment;
        this.percentage = percentage;
        this.id_building = id_building;
    }

    // Getters and setters
    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_building() {
        return id_building;
    }

    public void setId_building(int id_building) {
        this.id_building = id_building;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", apartment='" + apartment + '\'' +
                ", percentage=" + percentage +
                ", id_building=" + id_building +
                '}';
    }
}
