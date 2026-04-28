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
package com.tencentcloudapi.antiddos.v20250903;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.antiddos.v20250903.models.*;

public class AntiddosClient extends AbstractClient{
    private static String endpoint = "antiddos.tencentcloudapi.com";
    private static String service = "antiddos";
    private static String version = "2025-09-03";

    public AntiddosClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AntiddosClient(Credential credential, String region, ClientProfile profile) {
        super(AntiddosClient.endpoint, AntiddosClient.version, credential, region, profile);
    }

    /**
     *查询封堵解封记录和解封配额信息。
     * @param req DescribeDDoSBlockRecordsRequest
     * @return DescribeDDoSBlockRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSBlockRecordsResponse DescribeDDoSBlockRecords(DescribeDDoSBlockRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSBlockRecords", DescribeDDoSBlockRecordsResponse.class);
    }

    /**
     *申请解封资源，可通过 DescribeDDoSBlockRecords 接口获取资源的封堵解封状态。
     * @param req UnblockResourcesRequest
     * @return UnblockResourcesResponse
     * @throws TencentCloudSDKException
     */
    public UnblockResourcesResponse UnblockResources(UnblockResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnblockResources", UnblockResourcesResponse.class);
    }

}
