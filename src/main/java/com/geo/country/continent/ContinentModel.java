package com.geo.country.continent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Continent")
public class ContinentModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nameOfContinent;
    private long surface;

    @Override
    public String toString() {
        return "ContinentModel{" +
                "id=" + id +
                ", nameOfContinent='" + nameOfContinent + '\'' +
                ", surface=" + surface +
                '}';
    }
}
