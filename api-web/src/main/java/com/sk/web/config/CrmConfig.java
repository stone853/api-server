package com.sk.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author jinshi
 * @Date 2021/2/19 9:15
 * @Version 1.0
 */
@Component
public class CrmConfig {

    @Value("${crm.upload.image.url}")
    private String uploadUrl;

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }
}