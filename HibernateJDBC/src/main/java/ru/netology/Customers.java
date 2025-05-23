package ru.netology;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Table(name = "customers", schema = "netology")
@Entity
@Getter
@Setter
@EqualsAndHashCode

@NoArgsConstructor
@AllArgsConstructor
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Set<Orders> orders;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "age")
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", orders=" + orders +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age;

    }

}
