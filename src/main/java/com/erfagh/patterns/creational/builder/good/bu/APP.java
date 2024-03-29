package com.erfagh.patterns.creational.builder.good.bu;

import com.erfagh.patterns.creational.builder.bad.bu.PdfDocument;
import com.erfagh.patterns.creational.builder.bad.bu.Slide;

public class APP {
    public static void main(String[] args) {
        Presentation presentation = new Presentation();

        presentation.addSlide(new Slide("slide 1"));
        presentation.addSlide(new Slide("slide 2"));

        PdfDocument pdfDocument = new PdfDocument();
        DocumentPdfBuilder builder = new DocumentPdfBuilder(pdfDocument);

        presentation.export(builder);
        PdfDocument pdfDocument1 = builder.getPdfDocument();
    }
}
