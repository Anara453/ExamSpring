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
public class Seans {
    @Column(name = "is_3D",nullable = false)
     private Boolean is3D;
    @Column(name = "time_data",nullable = false)
     private String timeData;
    @ManyToOne
    @JoinColumn(name = "seances",nullable = false)
    private Movies movies;


}
