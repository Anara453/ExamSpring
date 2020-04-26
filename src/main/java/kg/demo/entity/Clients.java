package kg.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "clients")
@NoArgsConstructor
public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "age",nullable = false)
    private Integer age;

    public Clients(Integer age) {
        this.age = age;
    }
}
