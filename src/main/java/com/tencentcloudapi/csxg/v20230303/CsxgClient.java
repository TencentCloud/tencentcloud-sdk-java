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
package com.tencentcloudapi.csxg.v20230303;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.csxg.v20230303.models.*;

public class CsxgClient extends AbstractClient{
    private static String endpoint = "csxg.tencentcloudapi.com";
    private static String service = "csxg";
    private static String version = "2023-03-03";

    public CsxgClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CsxgClient(Credential credential, String region, ClientProfile profile) {
        super(CsxgClient.endpoint, CsxgClient.version, credential, region, profile);
    }

    /**
     *创建5G入云服务接口
     * @param req Create5GInstanceRequest
     * @return Create5GInstanceResponse
     * @throws TencentCloudSDKException
     */
    public Create5GInstanceResponse Create5GInstance(Create5GInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Create5GInstance", Create5GInstanceResponse.class);
    }

    /**
     *删除5G入云服务
     * @param req Delete5GInstanceRequest
     * @return Delete5GInstanceResponse
     * @throws TencentCloudSDKException
     */
    public Delete5GInstanceResponse Delete5GInstance(Delete5GInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Delete5GInstance", Delete5GInstanceResponse.class);
    }

    /**
     *查询APN信息
     * @param req Describe5GAPNsRequest
     * @return Describe5GAPNsResponse
     * @throws TencentCloudSDKException
     */
    public Describe5GAPNsResponse Describe5GAPNs(Describe5GAPNsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Describe5GAPNs", Describe5GAPNsResponse.class);
    }

    /**
     *查询5G入云服务
     * @param req Describe5GInstancesRequest
     * @return Describe5GInstancesResponse
     * @throws TencentCloudSDKException
     */
    public Describe5GInstancesResponse Describe5GInstances(Describe5GInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Describe5GInstances", Describe5GInstancesResponse.class);
    }

    /**
     *修改5G入云服务
     * @param req Modify5GInstanceAttributeRequest
     * @return Modify5GInstanceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public Modify5GInstanceAttributeResponse Modify5GInstanceAttribute(Modify5GInstanceAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "Modify5GInstanceAttribute", Modify5GInstanceAttributeResponse.class);
    }

}
