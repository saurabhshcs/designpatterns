package com.saurabhshcs.adtech.designpatterns.abstractfactory.service;

public class INCampaignService implements CampaignServiceIfc {

    private static final String LAUNCHING_IN_CAMPAIGN = "Launching IN Campaign";

    @Override
    public String launch() {
        return LAUNCHING_IN_CAMPAIGN;
    }
}
