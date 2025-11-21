package com.saurabhshcs.adtech.designpatterns.abstractfactory;

import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.CampaignServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.ReportingServiceIfc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class INServiceFactoryTest {

    private static final String LAUNCHING_IN_CAMPAIGN = "Launching IN Campaign";
    private static final String GENERATING_IN_REPORT = "Generating IN Report";
    private static final String LAUNCHING_US_CAMPAIGN = "Launching US Campaign";
    private static final String GENERATING_US_REPORT = "Generating US Report";

    @Test
    void shouldINFactoryProducesINServices() {
        RegionalServiceFactoryIfc factory = new INServiceFactory();
        CampaignServiceIfc campaignService = factory.createCampaignService();
        ReportingServiceIfc reportingService = factory.createReportingService();

        assertEquals(LAUNCHING_IN_CAMPAIGN, campaignService.launch());
        assertEquals(GENERATING_IN_REPORT, reportingService.generateReports());
    }

    @Test
    void shouldINFactoryNotProduceUSServices() {
        RegionalServiceFactoryIfc factory = new INServiceFactory();
        CampaignServiceIfc campaignService = factory.createCampaignService();
        ReportingServiceIfc reportingService = factory.createReportingService();

        assertNotEquals(LAUNCHING_US_CAMPAIGN, campaignService.launch());
        assertNotEquals(GENERATING_US_REPORT, reportingService.generateReports());
    }
}