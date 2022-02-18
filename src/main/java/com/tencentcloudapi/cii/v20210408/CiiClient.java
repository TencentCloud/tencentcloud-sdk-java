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
package com.tencentcloudapi.cii.v20210408;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cii.v20210408.models.*;

public class CiiClient extends AbstractClient{
    private static String endpoint = "cii.tencentcloudapi.com";
    private static String service = "cii";
    private static String version = "2021-04-08";

    public CiiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CiiClient(Credential credential, String region, ClientProfile profile) {
        super(CiiClient.endpoint, CiiClient.version, credential, region, profile);
    }

    /**
     *如果主任务下的报告不满足需求，可以基于主任务批量添加子任务
     * @param req AddSubStructureTasksRequest
     * @return AddSubStructureTasksResponse
     * @throws TencentCloudSDKException
     */
    public AddSubStructureTasksResponse AddSubStructureTasks(AddSubStructureTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSubStructureTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddSubStructureTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSubStructureTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateAutoClassifyStructureTask)基于提供的客户及保单信息，创建并启动结构化识别任务。
     * @param req CreateAutoClassifyStructureTaskRequest
     * @return CreateAutoClassifyStructureTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAutoClassifyStructureTaskResponse CreateAutoClassifyStructureTask(CreateAutoClassifyStructureTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAutoClassifyStructureTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAutoClassifyStructureTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAutoClassifyStructureTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateStructureTask)基于提供的客户及保单信息，创建并启动结构化识别任务。
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
     *本接口(CreateUnderwriteTaskById)用于根据结构化任务ID创建核保任务
     * @param req CreateUnderwriteTaskByIdRequest
     * @return CreateUnderwriteTaskByIdResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnderwriteTaskByIdResponse CreateUnderwriteTaskById(CreateUnderwriteTaskByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUnderwriteTaskByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUnderwriteTaskByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUnderwriteTaskById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeMachineUnderwrite)用于查询机器核保任务数据
     * @param req DescribeMachineUnderwriteRequest
     * @return DescribeMachineUnderwriteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMachineUnderwriteResponse DescribeMachineUnderwrite(DescribeMachineUnderwriteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMachineUnderwriteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMachineUnderwriteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMachineUnderwrite");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取图片质量分
     * @param req DescribeQualityScoreRequest
     * @return DescribeQualityScoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQualityScoreResponse DescribeQualityScore(DescribeQualityScoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQualityScoreResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQualityScoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQualityScore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *辅助用户对批量报告自动分类
     * @param req DescribeReportClassifyRequest
     * @return DescribeReportClassifyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReportClassifyResponse DescribeReportClassify(DescribeReportClassifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeReportClassifyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeReportClassifyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeReportClassify");
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
     *结构化复核差异查询接口，对比结构化复核前后数据差异，返回差异的部分。
     * @param req DescribeStructureDifferenceRequest
     * @return DescribeStructureDifferenceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStructureDifferenceResponse DescribeStructureDifference(DescribeStructureDifferenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStructureDifferenceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStructureDifferenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStructureDifference");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeStructureResult)用于查询结构化结果接口
     * @param req DescribeStructureResultRequest
     * @return DescribeStructureResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStructureResultResponse DescribeStructureResult(DescribeStructureResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStructureResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStructureResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStructureResult");
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

    /**
     *本接口(DescribeUnderwriteTask)用于查询核保任务结果
     * @param req DescribeUnderwriteTaskRequest
     * @return DescribeUnderwriteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnderwriteTaskResponse DescribeUnderwriteTask(DescribeUnderwriteTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnderwriteTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnderwriteTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnderwriteTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传医疗影像文件，可以用来做结构化。
     * @param req UploadMedicalFileRequest
     * @return UploadMedicalFileResponse
     * @throws TencentCloudSDKException
     */
    public UploadMedicalFileResponse UploadMedicalFile(UploadMedicalFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadMedicalFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadMedicalFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadMedicalFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
