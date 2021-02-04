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
package com.tencentcloudapi.cii.v20201210;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cii.v20201210.models.*;

public class CiiClient extends AbstractClient{
    private static String endpoint = "cii.tencentcloudapi.com";
    private static String service = "cii";
    private static String version = "2020-12-10";

    public CiiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CiiClient(Credential credential, String region, ClientProfile profile) {
        super(CiiClient.endpoint, CiiClient.version, credential, region, profile);
    }

    /**
     *基于提供的客户及保单信息，启动结构化识别任务。
     * @param req CreateStructureTaskRequest
     * @return CreateStructureTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateStructureTaskResponse CreateStructureTask(CreateStructureTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStructureTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStructureTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStructureTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *结构化对比查询接口，对比结构化复核前后数据差异，查询识别正确率，召回率。
     * @param req DescribeStructCompareDataRequest
     * @return DescribeStructCompareDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStructCompareDataResponse DescribeStructCompareData(DescribeStructCompareDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStructCompareDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStructCompareDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStructCompareData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *依据任务ID获取结构化结果接口。
     * @param req DescribeStructureTaskResultRequest
     * @return DescribeStructureTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStructureTaskResultResponse DescribeStructureTaskResult(DescribeStructureTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStructureTaskResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStructureTaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStructureTaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
