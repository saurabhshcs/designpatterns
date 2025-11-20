package com.saurabhshcs.adtech.designpatterns.abstractfactory;

import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.CampaignServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.ReportingServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.USCampaignService;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.USReportingService;

public class USServiceFactory implements RegionalServiceFactoryIfc{
    @Override
    public CampaignServiceIfc createCampaignService() {
        return new USCampaignService();
    }

    @Override
    public ReportingServiceIfc createReportingService() {
        return new USReportingService();
    }
}
