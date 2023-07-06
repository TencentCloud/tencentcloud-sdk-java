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
package com.tencentcloudapi.goosefs.v20220519;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.goosefs.v20220519.models.*;

public class GoosefsClient extends AbstractClient{
    private static String endpoint = "goosefs.tencentcloudapi.com";
    private static String service = "goosefs";
    private static String version = "2022-05-19";
    
    public GoosefsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public GoosefsClient(Credential credential, String region, ClientProfile profile) {
        super(GoosefsClient.endpoint, GoosefsClient.version, credential, region, profile);
    }

    /**
     *创建数据流通任务,包括从将文件系统的数据上传到存储桶下, 以及从存储桶下载到文件系统里。
     * @param req CreateDataRepositoryTaskRequest
     * @return CreateDataRepositoryTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataRepositoryTaskResponse CreateDataRepositoryTask(CreateDataRepositoryTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataRepositoryTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDataRepositoryTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataRepositoryTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据流通任务实时状态，用作客户端控制
     * @param req DescribeDataRepositoryTaskStatusRequest
     * @return DescribeDataRepositoryTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataRepositoryTaskStatusResponse DescribeDataRepositoryTaskStatus(DescribeDataRepositoryTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataRepositoryTaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataRepositoryTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataRepositoryTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
