package com.tencentcloudapi.common;

import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;

public class CommonClient extends AbstractClient {
    public CommonClient(String productName, String version, Credential credential, String region) {
        this(productName, version, credential, region, new ClientProfile());
    }

    public CommonClient(String productName, String version,
                        Credential credential, String region, ClientProfile profile) {
        super(productName + ".tencentcloudapi.com", version, credential, region, profile);
    }

    public String commonRequest(AbstractModel req, String actionName) throws TencentCloudSDKException {
        String rspStr = "";
        rspStr = this.internalRequest(req, actionName);
        return rspStr;
    }
}