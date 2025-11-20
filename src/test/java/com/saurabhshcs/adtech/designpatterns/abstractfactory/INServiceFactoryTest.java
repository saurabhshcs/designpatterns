package com.saurabhshcs.adtech.designpatterns.abstractfactory;

import com.saurabhshcs.adtech.designpatterns.CampaignService;
import com.saurabhshcs.adtech.designpatterns.ReportingService;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.CampaignServiceIfc;
import com.saurabhshcs.adtech.designpatterns.abstractfactory.service.ReportingServiceIfc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class INServiceFactoryTest {

    @Test
    void shouldINFactoryProducesINServices() {
        RegionalServiceFactoryIfc factory = new INServiceFactory();
        CampaignServiceIfc campaignService = factory.createCampaignService();
        ReportingServiceIfc reportingService = factory.createReportingService();

        assertEquals("Launching IN Campaign", campaignService.launch());
        assertEquals("Generating IN Report", reportingService.generateReports());
    }

    @Test
    void shouldINFactoryNotProduceUSServices() {
        RegionalServiceFactoryIfc factory = new INServiceFactory();
        CampaignServiceIfc campaignService = factory.createCampaignService();
        ReportingServiceIfc reportingService = factory.createReportingService();

        assertNotEquals("Launching US Campaign", campaignService.launch());
        assertNotEquals("Generating US Report", reportingService.generateReports());
    }
}