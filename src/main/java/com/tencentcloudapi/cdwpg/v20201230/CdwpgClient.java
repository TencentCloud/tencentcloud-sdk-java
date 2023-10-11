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
package com.tencentcloudapi.cdwpg.v20201230;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cdwpg.v20201230.models.*;

public class CdwpgClient extends AbstractClient{
    private static String endpoint = "cdwpg.tencentcloudapi.com";
    private static String service = "cdwpg";
    private static String version = "2020-12-30";
    
    public CdwpgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CdwpgClient(Credential credential, String region, ClientProfile profile) {
        super(CdwpgClient.endpoint, CdwpgClient.version, credential, region, profile);
    }

    /**
     *创建集群
     * @param req CreateInstanceByApiRequest
     * @return CreateInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceByApiResponse CreateInstanceByApi(CreateInstanceByApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceByApiResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceByApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstanceByApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群实例列表
     * @param req DescribeSimpleInstancesRequest
     * @return DescribeSimpleInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSimpleInstancesResponse DescribeSimpleInstances(DescribeSimpleInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSimpleInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSimpleInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSimpleInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁集群
     * @param req DestroyInstanceByApiRequest
     * @return DestroyInstanceByApiResponse
     * @throws TencentCloudSDKException
     */
    public DestroyInstanceByApiResponse DestroyInstanceByApi(DestroyInstanceByApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyInstanceByApiResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyInstanceByApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyInstanceByApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
