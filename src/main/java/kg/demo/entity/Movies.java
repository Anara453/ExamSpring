package kg.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "movie_name",nullable = false)
    private String movieName;
    @Column(name = "age",nullable = false)
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "seansy",nullable = false)
    private Seans seans;
}
