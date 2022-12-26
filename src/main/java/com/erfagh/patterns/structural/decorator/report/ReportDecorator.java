package com.erfagh.patterns.structural.decorator.report;

public abstract class ReportDecorator implements ReportGenerator{

   private final ReportGenerator reportGenerator;

    protected ReportDecorator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }


}
