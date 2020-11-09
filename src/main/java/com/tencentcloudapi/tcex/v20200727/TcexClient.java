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
package com.tencentcloudapi.tcex.v20200727;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcex.v20200727.models.*;

public class TcexClient extends AbstractClient{
    private static String endpoint = "tcex.tencentcloudapi.com";
    private static String service = "tcex";
    private static String version = "2020-07-27";

    public TcexClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcexClient(Credential credential, String region, ClientProfile profile) {
        super(TcexClient.endpoint, TcexClient.version, credential, region, profile);
    }

    /**
     *获取服务调用结果。和InvokeService接口配置合适，其InvokeId参数为InvokeService接口返回的RequestId。
     * @param req DescribeInvocationResultRequest
     * @return DescribeInvocationResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInvocationResultResponse DescribeInvocationResult(DescribeInvocationResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInvocationResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInvocationResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInvocationResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过传入文档url，测试服务算法。此接口需要和DescribeInvocationResult接口配置使用，该接口使用InvokeService返回的RequestId作为InvokeId参数，用于查询调用结果。
     * @param req InvokeServiceRequest
     * @return InvokeServiceResponse
     * @throws TencentCloudSDKException
     */
    public InvokeServiceResponse InvokeService(InvokeServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvokeServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InvokeServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InvokeService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
