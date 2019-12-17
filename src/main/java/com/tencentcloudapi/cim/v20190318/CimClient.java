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
package com.tencentcloudapi.cim.v20190318;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cim.v20190318.models.*;

public class CimClient extends AbstractClient{
    private static String endpoint = "cim.tencentcloudapi.com";
    private static String version = "2019-03-18";

    public CimClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CimClient(Credential credential, String region, ClientProfile profile) {
        super(CimClient.endpoint, CimClient.version, credential, region, profile);
    }

    /**
     *获取云通信IM中腾讯云账号对应的SDKAppID
     * @param req DescribeSdkAppidRequest
     * @return DescribeSdkAppidResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSdkAppidResponse DescribeSdkAppid(DescribeSdkAppidRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSdkAppidResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSdkAppidResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSdkAppid"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
