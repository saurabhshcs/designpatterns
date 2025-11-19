// src/test/java/com/adtech/patterns/factory/AdServiceFactoryTest.java
package com.saurabhshcs.adtech.designpatterns;

import com.saurabhshcs.adtech.designpatterns.factory.AdServiceFactory;
import com.saurabhshcs.adtech.designpatterns.factory.Region;
import com.saurabhshcs.adtech.designpatterns.factory.ServiceType;
import com.saurabhshcs.adtech.designpatterns.factory.service.AdService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdServiceFactoryTest {

    @Test
    void shouldCreateCampaignServiceForUK() {
        AdService service = AdServiceFactory.createService(ServiceType.CAMPAIGN, Region.REGION_UK);
        assertTrue(service.execute().contains("UK"));
    }

    @Test
    void shouldCreateReportingServiceForUS() {
        AdService service = AdServiceFactory.createService(ServiceType.REPORTING, Region.REGION_US);
        assertTrue(service.execute().contains("US"));
    }
}