/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.taf.v20200210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.taf.v20200210.models.*;

public class TafClient extends AbstractClient{
    private static String endpoint = "taf.tencentcloudapi.com";
    private static String service = "taf";
    private static String version = "2020-02-10";
    
    public TafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TafClient(Credential credential, String region, ClientProfile profile) {
        super(TafClient.endpoint, TafClient.version, credential, region, profile);
    }

    /**
     *虚假流量识别
     * @param req ManagePortraitRiskRequest
     * @return ManagePortraitRiskResponse
     * @throws TencentCloudSDKException
     */
    public ManagePortraitRiskResponse ManagePortraitRisk(ManagePortraitRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ManagePortraitRisk", ManagePortraitRiskResponse.class);
    }

}
