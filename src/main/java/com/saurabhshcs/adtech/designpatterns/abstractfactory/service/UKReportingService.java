package com.saurabhshcs.adtech.designpatterns.abstractfactory.service;

public class UKReportingService implements ReportingServiceIfc {

    private static final String GENERATING_UK_REPORT = "Generating UK Report";

    @Override
    public String generateReports() {
        return GENERATING_UK_REPORT;
    }
}
