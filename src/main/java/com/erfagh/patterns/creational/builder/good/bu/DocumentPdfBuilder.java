package com.erfagh.patterns.creational.builder.good.bu;

import com.erfagh.patterns.creational.builder.bad.bu.PdfDocument;
import com.erfagh.patterns.creational.builder.bad.bu.Slide;

public class DocumentPdfBuilder implements PresentationBuilder {

    private final PdfDocument document;

    public DocumentPdfBuilder(PdfDocument pdfDocument) {
        this.document = pdfDocument;
    }

    @Override
    public void addSlide(Slide slide) {
        document.addPage(slide.text());
    }

    public PdfDocument getPdfDocument() {

        return document;
    }
}
