package com.saurabhshcs.adtech.designpatterns.singleton;

import com.saurabhshcs.adtech.designpatterns.AdConfigManager;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class AdConfigManagerTest {

    @Test
    void shouldReturnSameInstance() {
        AdConfigManager instance1 = AdConfigManager.getInstance();
        AdConfigManager instance2 = AdConfigManager.getInstance();
        
        assertThat(instance1).isSameAs(instance2);
    }
    
    @Test
    void shouldMaintainConfigState() {
        AdConfigManager manager = AdConfigManager.getInstance();
        
        manager.setConfig("test.key", "test_value");
        String value = manager.getConfig("test.key");
        
        assertThat(value).isEqualTo("test_value");
    }
    
    @Test
    void shouldLoadDefaultConfig() {
        AdConfigManager manager = AdConfigManager.getInstance();
        
        assertThat(manager.getConfig("ad.timeout")).isEqualTo("5000");
        assertThat(manager.getConfig("ad.max_impressions")).isEqualTo("1000000");
    }
}