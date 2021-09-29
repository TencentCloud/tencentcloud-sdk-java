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
package com.tencentcloudapi.mna.v20210119;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mna.v20210119.models.*;

public class MnaClient extends AbstractClient{
    private static String endpoint = "mna.tencentcloudapi.com";
    private static String service = "mna";
    private static String version = "2021-01-19";

    public MnaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MnaClient(Credential credential, String region, ClientProfile profile) {
        super(MnaClient.endpoint, MnaClient.version, credential, region, profile);
    }

    /**
     *移动网络发起Qos加速过程
     * @param req CreateQosRequest
     * @return CreateQosResponse
     * @throws TencentCloudSDKException
     */
    public CreateQosResponse CreateQos(CreateQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动网络停止Qos加速过程
     * @param req DeleteQosRequest
     * @return DeleteQosResponse
     * @throws TencentCloudSDKException
     */
    public DeleteQosResponse DeleteQos(DeleteQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Qos加速状态
     * @param req DescribeQosRequest
     * @return DescribeQosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQosResponse DescribeQos(DescribeQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
