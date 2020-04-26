package kg.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Column(name = "num_place",nullable = false)
    private Integer numOfPlace;
    @Column(name = "price",nullable = false)
    private Double price;
    @ManyToOne
    @JoinColumn(name = "movies_id",nullable = false)
    private Movies movies;
}
