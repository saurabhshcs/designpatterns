package com.saurabhshcs.adtech.designpatterns.abstractfactory;

import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.CampaignServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.ReportingServiceIfc;

public interface RegionalServiceFactoryIfc {
    CampaignServiceIfc createCampaignService();
    ReportingServiceIfc createReportingService();
}
