package com.erfagh.patterns.structural.decorator.report;

public class ReportWhitFooter extends ReportDecorator{
    protected ReportWhitFooter(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public String generate() {
        return "<footer>"+this.reportGenerator.generate()+"</footer>";
    }
}
