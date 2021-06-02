package com.jaz.pjatk.component.repository;

import com.jaz.pjatk.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Long> {

    @Override
    List<Movie> findAll();
    @Override
    <S extends Movie> S save(S entity);
    @Override
    void delete(Movie entity);

    @Transactional
    @Modifying
    @Query("update Movie u set u.isAvailable = true where u.id = ?1")
    void setAvailabilityOfMovieToTrue(Long id);

}
