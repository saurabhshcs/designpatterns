package com.saurabhshcs.adtech.designpatterns.abstractfactory;

import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.CampaignServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.INCampaignService;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.INReportingService;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.ReportingServiceIfc;

public class INServiceFactory implements RegionalServiceFactoryIfc{
    @Override
    public CampaignServiceIfc createCampaignService() {
        return new INCampaignService();
    }

    @Override
    public ReportingServiceIfc createReportingService() {
        return new INReportingService();
    }
}
