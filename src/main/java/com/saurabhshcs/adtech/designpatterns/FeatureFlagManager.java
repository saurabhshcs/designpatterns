package com.saurabhshcs.adtech.designpatterns;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static com.saurabhshcs.adtech.designpatterns.FeatureFlag.*;


/**
 * Singleton: Multi-Country Feature Flag Manager
 * Manages feature toggles per region across the AdTech platform
 */
public final class FeatureFlagManager {

    private static final FeatureFlagManager INSTANCE = new FeatureFlagManager();

    private final Map<FeatureFlag, Map<FeatureFlag, Boolean>> regionFeatureFlags;

    private FeatureFlagManager() {
        Map<FeatureFlag, Map<FeatureFlag, Boolean>> flags = new HashMap<>();

        flags.put(REGION_UK, Map.of(
            NEW_DASHBOARD, true,
            BETA_CAMPAIGN_FLOW, false,
            TRACKING_V2, true
        ));

        flags.put(REGION_US, Map.of(
            NEW_DASHBOARD, true,
            BETA_CAMPAIGN_FLOW, true,
            TRACKING_V2, false
        ));

        flags.put(REGION_IN, Map.of(
            NEW_DASHBOARD, false,
            BETA_CAMPAIGN_FLOW, false,
            TRACKING_V2, true
        ));

        this.regionFeatureFlags = Collections.unmodifiableMap(flags);
    }

    public static FeatureFlagManager getInstance() {
        return INSTANCE;
    }

    public boolean isFeatureEnabled(FeatureFlag region, FeatureFlag feature) {
        Map<FeatureFlag, Boolean> flags = regionFeatureFlags.getOrDefault(region, Map.of());
        return flags.getOrDefault(feature, false);
    }

    public Map<FeatureFlag, Boolean> getFlagsForRegion(FeatureFlag region) {
        return regionFeatureFlags.getOrDefault(region, Map.of());
    }

    public Map<FeatureFlag, Map<FeatureFlag, Boolean>> getAllFlags() {
        return regionFeatureFlags;
    }
}
