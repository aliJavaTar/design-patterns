package com.erfagh.patterns.structural.decorator.report;

public class ReportService implements ReportGenerator{
    @Override
    public String generate() {
        return "total amount : 1000 ";
    }
}
