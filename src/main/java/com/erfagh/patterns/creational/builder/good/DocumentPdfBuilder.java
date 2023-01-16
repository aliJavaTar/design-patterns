package com.erfagh.patterns.creational.builder.good;

import com.erfagh.patterns.creational.builder.bad.PdfDocument;
import com.erfagh.patterns.creational.builder.bad.Slide;

public class DocumentPdfBuilder implements PresentationBuilder {

    private final PdfDocument document;

    public DocumentPdfBuilder(PdfDocument pdfDocument) {
        this.document = pdfDocument;
    }

    @Override
    public void addSlide(Slide slide) {
     document.addPage(slide.text());
    }
}
