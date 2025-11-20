package com.saurabhshcs.adtech.designpatterns.abstractfactory.service;

public class INReportingService implements ReportingServiceIfc{

    private static final String GENERATING_IN_REPORT = "Generating IN Report";

    @Override
    public String generateReports() {
        return GENERATING_IN_REPORT;
    }
}
