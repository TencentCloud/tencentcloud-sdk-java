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
package com.tencentcloudapi.rkp.v20191209;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.rkp.v20191209.models.*;

public class RkpClient extends AbstractClient{
    private static String endpoint = "rkp.tencentcloudapi.com";
    private static String service = "rkp";
    private static String version = "2019-12-09";
    
    public RkpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public RkpClient(Credential credential, String region, ClientProfile profile) {
        super(RkpClient.endpoint, RkpClient.version, credential, region, profile);
    }

    /**
     *产品侧确认风险探针已停售，无收入，并且已经停服。目前服务使用自建redis，不符合规范需要整改下线。

根据DevicceToken查询OpenID。
     * @param req GetOpenIdRequest
     * @return GetOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public GetOpenIdResponse GetOpenId(GetOpenIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOpenId", GetOpenIdResponse.class);
    }

    /**
     *产品侧确认风险探针已停售，无收入，并且已经停服。目前服务使用自建redis，不符合规范需要整改下线。

获取token接口。
     * @param req GetTokenRequest
     * @return GetTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetTokenResponse GetToken(GetTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetToken", GetTokenResponse.class);
    }

    /**
     *产品侧确认风险探针已停售，无收入，并且已经停服。目前服务使用自建redis，不符合规范需要整改下线。

腾讯天御设备风险查询接口，输入由客户应用自主采集的设备信息， 通过腾讯大数据风控能力，可以准确根据输入设备信息，还原设备库中的设备ID，并且识别设备的风险，解决客户业务过程中的设备风险，降低企业损失。
     * @param req QueryDevAndRiskRequest
     * @return QueryDevAndRiskResponse
     * @throws TencentCloudSDKException
     */
    public QueryDevAndRiskResponse QueryDevAndRisk(QueryDevAndRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryDevAndRisk", QueryDevAndRiskResponse.class);
    }

}
