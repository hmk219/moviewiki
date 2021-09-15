package com.moviewiki.api.movie.repository;

import com.moviewiki.api.movie.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    /* 사용 금지 */
    public Movie findByMovieId(Long movieId);
}

