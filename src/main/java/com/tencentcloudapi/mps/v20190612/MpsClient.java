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
package com.tencentcloudapi.mps.v20190612;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mps.v20190612.models.*;

public class MpsClient extends AbstractClient{
    private static String endpoint = "mps.tencentcloudapi.com";
    private static String version = "2019-06-12";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public MpsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public MpsClient(Credential credential, String region, ClientProfile profile) {
        super(MpsClient.endpoint, MpsClient.version, credential, region, profile);
    }

    /**
     *创建用户自定义转动图模板，数量上限：16。
     * @param req CreateAnimatedGraphicsTemplateRequest
     * @return CreateAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAnimatedGraphicsTemplateResponse CreateAnimatedGraphicsTemplate(CreateAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAnimatedGraphicsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义雪碧图模板，数量上限：16。
     * @param req CreateImageSpriteTemplateRequest
     * @return CreateImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageSpriteTemplateResponse CreateImageSpriteTemplate(CreateImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageSpriteTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义采样截图模板，数量上限：16。
     * @param req CreateSampleSnapshotTemplateRequest
     * @return CreateSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSampleSnapshotTemplateResponse CreateSampleSnapshotTemplate(CreateSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSampleSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义指定时间点截图模板，数量上限：16。
     * @param req CreateSnapshotByTimeOffsetTemplateRequest
     * @return CreateSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotByTimeOffsetTemplateResponse CreateSnapshotByTimeOffsetTemplate(CreateSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义转码模板，数量上限：1000。
     * @param req CreateTranscodeTemplateRequest
     * @return CreateTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTranscodeTemplateResponse CreateTranscodeTemplate(CreateTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建用户自定义水印模板，数量上限：1000。
     * @param req CreateWatermarkTemplateRequest
     * @return CreateWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateWatermarkTemplateResponse CreateWatermarkTemplate(CreateWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWatermarkTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对 COS 中指定 Bucket 的目录下上传的媒体文件，设置处理规则，包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流。

注意：创建工作流成功后是禁用状态，需要手动启用。
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义转动图模板。
     * @param req DeleteAnimatedGraphicsTemplateRequest
     * @return DeleteAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAnimatedGraphicsTemplateResponse DeleteAnimatedGraphicsTemplate(DeleteAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除雪碧图模板。
     * @param req DeleteImageSpriteTemplateRequest
     * @return DeleteImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageSpriteTemplateResponse DeleteImageSpriteTemplate(DeleteImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageSpriteTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义采样截图模板。
     * @param req DeleteSampleSnapshotTemplateRequest
     * @return DeleteSampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSampleSnapshotTemplateResponse DeleteSampleSnapshotTemplate(DeleteSampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSampleSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义指定时间点截图模板。
     * @param req DeleteSnapshotByTimeOffsetTemplateRequest
     * @return DeleteSnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotByTimeOffsetTemplateResponse DeleteSnapshotByTimeOffsetTemplate(DeleteSnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义转码模板。
     * @param req DeleteTranscodeTemplateRequest
     * @return DeleteTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTranscodeTemplateResponse DeleteTranscodeTemplate(DeleteTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义水印模板。
     * @param req DeleteWatermarkTemplateRequest
     * @return DeleteWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWatermarkTemplateResponse DeleteWatermarkTemplate(DeleteWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWatermarkTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除工作流。对于已启用的工作流，需要禁用后才能删除。
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询转动图模板列表，支持根据条件，分页查询。
     * @param req DescribeAnimatedGraphicsTemplatesRequest
     * @return DescribeAnimatedGraphicsTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnimatedGraphicsTemplatesResponse DescribeAnimatedGraphicsTemplates(DescribeAnimatedGraphicsTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAnimatedGraphicsTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAnimatedGraphicsTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询雪碧图模板，支持根据条件，分页查询。
     * @param req DescribeImageSpriteTemplatesRequest
     * @return DescribeImageSpriteTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageSpriteTemplatesResponse DescribeImageSpriteTemplates(DescribeImageSpriteTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageSpriteTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageSpriteTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageSpriteTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询采样截图模板，支持根据条件，分页查询。
     * @param req DescribeSampleSnapshotTemplatesRequest
     * @return DescribeSampleSnapshotTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSampleSnapshotTemplatesResponse DescribeSampleSnapshotTemplates(DescribeSampleSnapshotTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSampleSnapshotTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSampleSnapshotTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSampleSnapshotTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定时间点截图模板，支持根据条件，分页查询。
     * @param req DescribeSnapshotByTimeOffsetTemplatesRequest
     * @return DescribeSnapshotByTimeOffsetTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotByTimeOffsetTemplatesResponse DescribeSnapshotByTimeOffsetTemplates(DescribeSnapshotByTimeOffsetTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSnapshotByTimeOffsetTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSnapshotByTimeOffsetTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过任务 ID 查询任务的执行状态和结果的详细信息（最多可以查询3天之内提交的任务）。
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

    /**
     ** 该接口用于查询任务列表；
* 当列表数据比较多时，单次接口调用无法拉取整个列表，可通过 ScrollToken 参数，分批拉取；
* 只能查询到最近三天（72 小时）内的任务。
     * @param req DescribeTasksRequest
     * @return DescribeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksResponse DescribeTasks(DescribeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTasks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据转码模板唯一标识，获取转码模板详情列表。返回结果包含符合条件的所有用户自定义模板及[系统预置转码模板](https://cloud.tencent.com/document/product/266/33476#.E9.A2.84.E7.BD.AE.E8.BD.AC.E7.A0.81.E6.A8.A1.E6.9D.BF)。
     * @param req DescribeTranscodeTemplatesRequest
     * @return DescribeTranscodeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTranscodeTemplatesResponse DescribeTranscodeTemplates(DescribeTranscodeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTranscodeTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTranscodeTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTranscodeTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户自定义水印模板，支持根据条件，分页查询。
     * @param req DescribeWatermarkTemplatesRequest
     * @return DescribeWatermarkTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWatermarkTemplatesResponse DescribeWatermarkTemplates(DescribeWatermarkTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWatermarkTemplatesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWatermarkTemplatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWatermarkTemplates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据工作流 ID，获取工作流详情列表。
     * @param req DescribeWorkflowsRequest
     * @return DescribeWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkflowsResponse DescribeWorkflows(DescribeWorkflowsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWorkflowsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWorkflowsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeWorkflows"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用工作流。
     * @param req DisableWorkflowRequest
     * @return DisableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DisableWorkflowResponse DisableWorkflow(DisableWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DisableWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DisableWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用工作流。
     * @param req EnableWorkflowRequest
     * @return EnableWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public EnableWorkflowResponse EnableWorkflow(EnableWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnableWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnableWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义转动图模板。
     * @param req ModifyAnimatedGraphicsTemplateRequest
     * @return ModifyAnimatedGraphicsTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAnimatedGraphicsTemplateResponse ModifyAnimatedGraphicsTemplate(ModifyAnimatedGraphicsTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAnimatedGraphicsTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyAnimatedGraphicsTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义雪碧图模板。
     * @param req ModifyImageSpriteTemplateRequest
     * @return ModifyImageSpriteTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyImageSpriteTemplateResponse ModifyImageSpriteTemplate(ModifyImageSpriteTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyImageSpriteTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyImageSpriteTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyImageSpriteTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义采样截图模板。
     * @param req ModifySampleSnapshotTemplateRequest
     * @return ModifySampleSnapshotTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySampleSnapshotTemplateResponse ModifySampleSnapshotTemplate(ModifySampleSnapshotTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySampleSnapshotTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySampleSnapshotTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySampleSnapshotTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义指定时间点截图模板。
     * @param req ModifySnapshotByTimeOffsetTemplateRequest
     * @return ModifySnapshotByTimeOffsetTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotByTimeOffsetTemplateResponse ModifySnapshotByTimeOffsetTemplate(ModifySnapshotByTimeOffsetTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySnapshotByTimeOffsetTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifySnapshotByTimeOffsetTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义转码模板信息。
     * @param req ModifyTranscodeTemplateRequest
     * @return ModifyTranscodeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTranscodeTemplateResponse ModifyTranscodeTemplate(ModifyTranscodeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTranscodeTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTranscodeTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyTranscodeTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户自定义水印模板，水印类型不允许修改。
     * @param req ModifyWatermarkTemplateRequest
     * @return ModifyWatermarkTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWatermarkTemplateResponse ModifyWatermarkTemplate(ModifyWatermarkTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWatermarkTemplateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWatermarkTemplateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyWatermarkTemplate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从 CMQ 获取到消息后，从消息的 msgBody 字段中解析出 MPS 直播流处理事件通知的内容。
该接口不用于发起网络调用，而是用来帮助生成各个语言平台的 SDK，您可以参考 SDK 的中解析函数的实现事件通知的解析。
     * @param req ParseLiveStreamProcessNotificationRequest
     * @return ParseLiveStreamProcessNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseLiveStreamProcessNotificationResponse ParseLiveStreamProcessNotification(ParseLiveStreamProcessNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseLiveStreamProcessNotificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ParseLiveStreamProcessNotificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ParseLiveStreamProcessNotification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从 CMQ 获取到消息后，从消息的 msgBody 字段中解析出 MPS 事件通知的内容。
该接口不用于发起网络调用，而是用来帮助生成各个语言平台的 SDK，您可以参考 SDK 的中解析函数的实现事件通知的解析。
     * @param req ParseNotificationRequest
     * @return ParseNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ParseNotificationResponse ParseNotification(ParseNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseNotificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ParseNotificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ParseNotification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对直播流媒体发起处理任务，功能包括：

1. 智能内容识别（人脸、文本全文、文本关键词、语音全文、语音关键词、物体）。
2. 智能内容分析（精彩集锦）。

直播流处理事件通知实时写入用户指定的消息队列 CMQ 中，用户需要从消息队列 CMQ 中获取事件通知结果，同时处理过程中存在输出文件的，会写入用户指定的输出文件的目标存储中。
     * @param req ProcessLiveMediaRequest
     * @return ProcessLiveMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessLiveMediaResponse ProcessLiveMedia(ProcessLiveMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessLiveMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessLiveMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessLiveMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对直播流媒体发起处理任务，功能包括：

* 智能内容审核（画面鉴黄、鉴政、鉴暴、声音鉴黄）。

直播流处理事件通知实时写入用户指定的消息队列 CMQ 中，用户需要从消息队列 CMQ 中获取事件通知结果，同时处理过程中存在输出文件的，会写入用户指定的输出文件的目标存储中。
     * @param req ProcessLiveStreamRequest
     * @return ProcessLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ProcessLiveStreamResponse ProcessLiveStream(ProcessLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对 COS 中的媒体文件发起处理任务，功能包括：
1. 视频转码（带水印）；
2. 视频转动图；
3. 对视频按指定时间点截图；
4. 对视频采样截图；
5. 对视频截图雪碧图；
6. 对视频转自适应码流。
     * @param req ProcessMediaRequest
     * @return ProcessMediaResponse
     * @throws TencentCloudSDKException
     */
    public ProcessMediaResponse ProcessMedia(ProcessMediaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ProcessMediaResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ProcessMediaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ProcessMedia"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新设置一个已经存在且处于禁用状态的工作流。
     * @param req ResetWorkflowRequest
     * @return ResetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public ResetWorkflowResponse ResetWorkflow(ResetWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetWorkflowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetWorkflowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResetWorkflow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
