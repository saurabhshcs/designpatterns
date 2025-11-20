package com.saurabhshcs.adtech.designpatterns.abstractfactory.service;

public class UKCampaignService implements CampaignServiceIfc {

    private static final String LAUNCHING_UK_CAMPAIGN = "Launching UK Campaign";

    @Override
    public String launch() {
        return LAUNCHING_UK_CAMPAIGN;
    }
}
