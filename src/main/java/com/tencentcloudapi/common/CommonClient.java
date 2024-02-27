package com.tencentcloudapi.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;

import java.lang.reflect.Type;

public class CommonClient extends AbstractClient {
    public CommonClient(String productName, String version, Credential credential, String region) {
        this(productName, version, credential, region, new ClientProfile());
    }

    public CommonClient(String productName, String version,
                        Credential credential, String region, ClientProfile profile) {
        super(productName + ".tencentcloudapi.com", version, credential, region, profile);
    }

    public String commonRequest(AbstractModel req, String actionName) throws TencentCloudSDKException {
        return internalRequest(req, actionName);
    }

    public <T> T commonRequest(AbstractModel req, String actionName, Class<T> typeOfT) throws TencentCloudSDKException {
        return internalRequest(req, actionName, typeOfT);
    }
}