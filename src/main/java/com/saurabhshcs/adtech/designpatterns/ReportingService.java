package com.saurabhshcs.adtech.designpatterns;

import com.saurabhshcs.adtech.designpatterns.factory.Region;
import com.saurabhshcs.adtech.designpatterns.factory.service.AdService;

public class ReportingService implements AdService {

    private static final String REPORTING_SERVICE_FOR = "Reporting Service for ";
    private final Region region;

    public ReportingService(Region region) {
        this.region = region;
    }

    @Override
    public String execute() {
        return REPORTING_SERVICE_FOR + region.name();
    }
}