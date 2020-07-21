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
package com.tencentcloudapi.ams.v20200608;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ams.v20200608.models.*;

public class AmsClient extends AbstractClient{
    private static String endpoint = "ams.tencentcloudapi.com";
    private static String version = "2020-06-08";

    public AmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AmsClient(Credential credential, String region, ClientProfile profile) {
        super(AmsClient.endpoint, AmsClient.version, credential, region, profile);
    }

    /**
     *通过URL或存储通创建审核任务
     * @param req CreateAudioModerationTaskRequest
     * @return CreateAudioModerationTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAudioModerationTaskResponse CreateAudioModerationTask(CreateAudioModerationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAudioModerationTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAudioModerationTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAudioModerationTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看任务详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
