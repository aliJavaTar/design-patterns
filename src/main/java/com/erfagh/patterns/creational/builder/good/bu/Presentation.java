package com.erfagh.patterns.creational.builder.good.bu;

import com.erfagh.patterns.creational.builder.bad.bu.Slide;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private final List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
         builder.addSlide(new Slide("copy"));
        for (Slide s:slides)
        {
         builder.addSlide(s);
        }

    }
}
