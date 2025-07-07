/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.afc.v20200226;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.afc.v20200226.models.*;

public class AfcClient extends AbstractClient{
    private static String endpoint = "afc.tencentcloudapi.com";
    private static String service = "afc";
    private static String version = "2020-02-26";

    public AfcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AfcClient(Credential credential, String region, ClientProfile profile) {
        super(AfcClient.endpoint, AfcClient.version, credential, region, profile);
    }

    /**
     *反欺诈VIP评分接口
     * @param req GetAntiFraudVipRequest
     * @return GetAntiFraudVipResponse
     * @throws TencentCloudSDKException
     */
    public GetAntiFraudVipResponse GetAntiFraudVip(GetAntiFraudVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetAntiFraudVip", GetAntiFraudVipResponse.class);
    }

    /**
     *天御反欺诈服务，主要应用于银行、证券、保险、P2P等金融行业客户，通过腾讯的大数据风控能力，
可以准确识别恶意用户信息，解决客户在支付、活动、理财，风控等业务环节遇到的欺诈威胁，降低企业
的损失。
     * @param req QueryAntiFraudVipRequest
     * @return QueryAntiFraudVipResponse
     * @throws TencentCloudSDKException
     */
    public QueryAntiFraudVipResponse QueryAntiFraudVip(QueryAntiFraudVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryAntiFraudVip", QueryAntiFraudVipResponse.class);
    }

    /**
     *天御信鸽取数平台接口
     * @param req TransportGeneralInterfaceRequest
     * @return TransportGeneralInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public TransportGeneralInterfaceResponse TransportGeneralInterface(TransportGeneralInterfaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransportGeneralInterface", TransportGeneralInterfaceResponse.class);
    }

}
