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
     *根据DevicceToken查询OpenID。
     * @param req GetOpenIdRequest
     * @return GetOpenIdResponse
     * @throws TencentCloudSDKException
     */
    public GetOpenIdResponse GetOpenId(GetOpenIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOpenIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetOpenIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetOpenId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取token接口。
     * @param req GetTokenRequest
     * @return GetTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetTokenResponse GetToken(GetTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *腾讯天御设备风险查询接口，输入由客户应用自主采集的设备信息， 通过腾讯大数据风控能力，可以准确根据输入设备信息，还原设备库中的设备ID，并且识别设备的风险，解决客户业务过程中的设备风险，降低企业损失。
     * @param req QueryDevAndRiskRequest
     * @return QueryDevAndRiskResponse
     * @throws TencentCloudSDKException
     */
    public QueryDevAndRiskResponse QueryDevAndRisk(QueryDevAndRiskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryDevAndRiskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryDevAndRiskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryDevAndRisk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
