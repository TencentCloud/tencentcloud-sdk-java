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
package com.tencentcloudapi.ie.v20200304;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ie.v20200304.models.*;

public class IeClient extends AbstractClient{
    private static String endpoint = "ie.tencentcloudapi.com";
    private static String version = "2020-03-04";

    public IeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IeClient(Credential credential, String region, ClientProfile profile) {
        super(IeClient.endpoint, IeClient.version, credential, region, profile);
    }

    /**
     *创建智能编辑任务，可以同时选择视频标签识别、分类识别、智能拆条、智能集锦、智能封面和片头片尾识别中的一项或者多项能力。
     * @param req CreateEditingTaskRequest
     * @return CreateEditingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateEditingTaskResponse CreateEditingTask(CreateEditingTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEditingTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEditingTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateEditingTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取智能编辑任务结果。
     * @param req DescribeEditingTaskResultRequest
     * @return DescribeEditingTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEditingTaskResultResponse DescribeEditingTaskResult(DescribeEditingTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEditingTaskResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEditingTaskResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEditingTaskResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
