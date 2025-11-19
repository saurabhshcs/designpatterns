package com.saurabhshcs.adtech.designpatterns;

import com.saurabhshcs.adtech.designpatterns.factory.Region;
import com.saurabhshcs.adtech.designpatterns.factory.service.AdService;

public class CampaignService implements AdService {
    private final Region region;

    public CampaignService(Region region) {
        this.region = region;
    }

    @Override
    public String execute() {
        return "Campaign Service for " + region.name();
    }
}