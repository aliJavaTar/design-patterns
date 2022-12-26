package com.erfagh.patterns.structural.decorator.report;

public class ReportHeader extends ReportDecorator{
    protected ReportHeader(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }
}
