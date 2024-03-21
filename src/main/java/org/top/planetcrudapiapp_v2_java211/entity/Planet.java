package org.top.planetcrudapiapp_v2_java211.entity;

import jakarta.persistence.*;

// класс, соответствующий таблице Planet из БД
// класс хранит информацию об объекте "Планета", не реализует бизнес-логику
// класс является dataclass-ом
@Entity
@Table(name="planet_t")
public class Planet {
    // поля - соответствуют столбцам (атрибутам) БД
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_f", nullable = false)
    private String name;

    @Column(name="radius_f", nullable = false)
    private Integer radius;

    @Column(name="mass_f", nullable = false)
    private Integer mass;

    // конструкторы
    public Planet() {}

    public Planet(String name, Integer radius, Integer mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // getters & setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + radius + " - " + mass;
    }
}

