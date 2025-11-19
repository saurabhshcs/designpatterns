package com.saurabhshcs.adtech.designpatterns.factory;

import com.saurabhshcs.adtech.designpatterns.CampaignService;
import com.saurabhshcs.adtech.designpatterns.ReportingService;
import com.saurabhshcs.adtech.designpatterns.factory.service.AdService;

public class AdServiceFactory {
    private AdServiceFactory() {}

    public static AdService createService(ServiceType type, Region region) {
        return switch (type) {
            case CAMPAIGN -> new CampaignService(region);
            case REPORTING -> new ReportingService(region);
        };
    }
}
