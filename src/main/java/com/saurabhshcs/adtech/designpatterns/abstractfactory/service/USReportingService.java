package com.saurabhshcs.adtech.designpatterns.abstractfactory.service;

public class USReportingService implements ReportingServiceIfc{

    private static final String GENERATING_US_REPORT = "Generating US Report";

    @Override
    public String generateReports() {
        return GENERATING_US_REPORT;
    }
}
