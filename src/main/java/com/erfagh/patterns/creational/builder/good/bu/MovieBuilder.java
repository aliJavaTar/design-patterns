package com.erfagh.patterns.creational.builder.good.bu;

import com.erfagh.patterns.creational.builder.bad.bu.Movie;
import com.erfagh.patterns.creational.builder.bad.bu.Slide;

public class MovieBuilder implements PresentationBuilder {

    private final Movie movie;

    public MovieBuilder(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void addSlide(Slide slide) {
      movie.addFrame(slide.text(),3);
    }
}
