package kg.demo.services;

import kg.demo.entity.Movies;
import kg.demo.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServicesImpl implements MovieServices {
    @Autowired
    private MoviesRepository moviesRepository;
    @Override
    public Movies chekAge(Integer age) {
        if (age < 18) {
            System.out.println("It is not for you");
        }
        if (age > 18){
            System.out.println("lets watch movie");
        }
        return null;
    }

    @Override
    public Movies create(Movies movies) {
    return moviesRepository.save(movies);
    }

}
