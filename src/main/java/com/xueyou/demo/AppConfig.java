package com.xueyou.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by wuxueyou on 2017/5/23.
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public final class AppConfig {
    @Value("${app.name}")
    private String appName;

    @Value("${app.driver}")
    private String driverName;

    @Value("${app.profileType}")
    private String profileType;

    public String getAppName() {
        return appName;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getProfileType() {
        return profileType;
    }
}
