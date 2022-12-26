package com.erfagh.patterns.structural.decorator.report;

public class ReportHeader extends ReportDecorator {

    protected ReportHeader(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public String generate() {
        return"<H1>"+ reportGenerator.generate()+"</H1>";
    }
}
