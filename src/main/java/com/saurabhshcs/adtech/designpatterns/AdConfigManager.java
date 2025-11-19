// src/main/java/com/adtech/patterns/singleton/AdConfigManager.java
package com.saurabhshcs.adtech.designpatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Singleton: Ad Configuration Manager
 * Ensures single point of configuration management across AdTech platform
 */
public class AdConfigManager {
    
    private static volatile AdConfigManager instance;
    private final Map<String, String> configMap;
    
    private AdConfigManager() {
        // Private constructor to prevent instantiation
        configMap = new HashMap<>();
        loadDefaultConfig();
    }
    
    public static AdConfigManager getInstance() {
        if (instance == null) {
            synchronized (AdConfigManager.class) {
                if (instance == null) {
                    instance = new AdConfigManager();
                }
            }
        }
        return instance;
    }
    
    public String getConfig(String key) {
        return configMap.get(key);
    }
    
    public void setConfig(String key, String value) {
        configMap.put(key, value);
    }
    
    public void refreshConfig() {
        configMap.clear();
        loadDefaultConfig();
    }

    private void loadDefaultConfig() {
        configMap.put("ad.timeout", "5000");
        configMap.put("ad.max_impressions", "1000000");
        configMap.put("ad.bid_timeout", "100");
        configMap.put("tracking.enabled", "true");
    }
}