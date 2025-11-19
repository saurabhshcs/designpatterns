// src/test/java/com/adtech/patterns/singleton/FeatureFlagManagerTest.java
package com.saurabhshcs.adtech.designpatterns;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static com.saurabhshcs.adtech.designpatterns.FeatureFlag.*;
import static org.junit.jupiter.api.Assertions.*;

class FeatureFlagManagerTest {

    @Test
    void shouldReturnTrueForEnabledFeatureInUK() {
        FeatureFlagManager manager = FeatureFlagManager.getInstance();
        assertTrue(manager.isFeatureEnabled(REGION_UK, NEW_DASHBOARD));
    }

    @Test
    void shouldReturnFalseForDisabledFeatureInIN() {
        FeatureFlagManager manager = FeatureFlagManager.getInstance();
        assertFalse(manager.isFeatureEnabled(REGION_IN, NEW_DASHBOARD));
    }

    @Test
    void shouldReturnFalseForUnknownRegion() {
        FeatureFlagManager manager = FeatureFlagManager.getInstance();
        assertFalse(manager.isFeatureEnabled(FeatureFlag.valueOf("REGION_FR"), NEW_DASHBOARD));
    }

    @Test
    void shouldReturnImmutableRegionFlags() {
        FeatureFlagManager manager = FeatureFlagManager.getInstance();
        Map<FeatureFlag, Boolean> ukFlags = manager.getFlagsForRegion(REGION_UK);
        assertEquals(3, ukFlags.size());
        assertThrows(UnsupportedOperationException.class, () -> ukFlags.put(NEW_DASHBOARD, false));
    }
}
