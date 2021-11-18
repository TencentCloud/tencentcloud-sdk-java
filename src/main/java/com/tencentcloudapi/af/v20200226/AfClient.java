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
package com.tencentcloudapi.af.v20200226;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.af.v20200226.models.*;

public class AfClient extends AbstractClient{
    private static String endpoint = "af.tencentcloudapi.com";
    private static String service = "af";
    private static String version = "2020-02-26";

    public AfClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AfClient(Credential credential, String region, ClientProfile profile) {
        super(AfClient.endpoint, AfClient.version, credential, region, profile);
    }

    /**
     *天御反欺诈服务，主要应用于银行、证券、保险、消费金融等金融行业客户，通过腾讯的大数据风控能力，
可以准确识别恶意用户信息，解决客户在支付、活动、理财，风控等业务环节遇到的欺诈威胁，降低企业
的损失。
     * @param req DescribeAntiFraudRequest
     * @return DescribeAntiFraudResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiFraudResponse DescribeAntiFraud(DescribeAntiFraudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAntiFraudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAntiFraudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAntiFraud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *反欺诈评分接口
     * @param req GetAntiFraudRequest
     * @return GetAntiFraudResponse
     * @throws TencentCloudSDKException
     */
    public GetAntiFraudResponse GetAntiFraud(GetAntiFraudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAntiFraudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetAntiFraudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAntiFraud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *天御反欺诈服务，主要应用于银行、证券、保险、消费金融等金融行业客户，通过腾讯的大数据风控能力，
可以准确识别恶意用户信息，解决客户在支付、活动、理财，风控等业务环节遇到的欺诈威胁，降低企业
的损失。
     * @param req QueryAntiFraudRequest
     * @return QueryAntiFraudResponse
     * @throws TencentCloudSDKException
     */
    public QueryAntiFraudResponse QueryAntiFraud(QueryAntiFraudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryAntiFraudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QueryAntiFraudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QueryAntiFraud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
