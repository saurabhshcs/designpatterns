package com.saurabhshcs.adtech.designpatterns.abstractfactory.service;

public class USCampaignService implements CampaignServiceIfc {

    private static final String LAUNCHING_US_CAMPAIGN = "Launching US Campaign";

    @Override
    public String launch() {
        return LAUNCHING_US_CAMPAIGN;
    }
}
