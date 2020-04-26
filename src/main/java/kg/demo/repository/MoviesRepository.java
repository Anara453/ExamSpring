package kg.demo.repository;

import kg.demo.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies,Long> {
}
