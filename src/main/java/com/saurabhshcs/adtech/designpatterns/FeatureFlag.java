package com.saurabhshcs.adtech.designpatterns;

/**
 * Enum: Feature Flags and Regions used across the AdTech platform
 */
public enum FeatureFlag {
    // Feature flags
    NEW_DASHBOARD("newDashboard"),
    BETA_CAMPAIGN_FLOW("betaCampaignFlow"),
    TRACKING_V2("trackingV2"),

    // Regions
    REGION_UK("UK"),
    REGION_US("US"),
    REGION_FR("FR"),
    REGION_IN("IN");

    private final String key;

    FeatureFlag(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }
}
