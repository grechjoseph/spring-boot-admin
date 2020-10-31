package com.jg.client;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class AdditionalInfoConfig implements InfoContributor {

    @Override
    public void contribute(final Info.Builder builder) {
        builder.withDetail("additionalInfo", new HashMap<>() {
            {
                put("info1", "value1");
                put("info2", "value2");
            }
        });
    }

}
