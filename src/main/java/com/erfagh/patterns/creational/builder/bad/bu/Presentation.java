package com.erfagh.patterns.creational.builder.bad.bu;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private final List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationFormat format) {
        if (format == PresentationFormat.PDF) {
            PdfDocument pdfDocument = new PdfDocument();
            for (Slide s : slides) {
                pdfDocument.addPage(s.text());
            }
        } else if (format == PresentationFormat.MOVE) {
            Movie movie = new Movie();
            for (Slide s : slides) {
                movie.addFrame(s.text(), 2);
            }
        }
    }
}
