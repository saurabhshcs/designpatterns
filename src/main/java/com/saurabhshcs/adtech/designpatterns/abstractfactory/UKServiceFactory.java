package com.saurabhshcs.adtech.designpatterns.abstractfactory;

import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.CampaignServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.ReportingServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.UKCampaignService;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.UKReportingService;

public class UKServiceFactory implements RegionalServiceFactoryIfc{
    @Override
    public CampaignServiceIfc createCampaignService() {
        return new UKCampaignService();
    }

    @Override
    public ReportingServiceIfc createReportingService() {
        return new UKReportingService();
    }
}
