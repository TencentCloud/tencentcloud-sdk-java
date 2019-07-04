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
package com.tencentcloudapi.tci.v20190318;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tci.v20190318.models.*;

public class TciClient extends AbstractClient{
    private static String endpoint = "tci.tencentcloudapi.com";
    private static String version = "2019-03-18";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TciClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TciClient(Credential credential, String region, ClientProfile profile) {
        super(TciClient.endpoint, TciClient.version, credential, region, profile);
    }

    /**
     *提供 AI 助教基础版本功能接口
     * @param req AIAssistantRequest
     * @return AIAssistantResponse
     * @throws TencentCloudSDKException
     */
    public AIAssistantResponse AIAssistant(AIAssistantRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AIAssistantResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AIAssistantResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AIAssistant"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于取消已经提交的任务
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CancelTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *人员考勤
     * @param req CheckAttendanceRequest
     * @return CheckAttendanceResponse
     * @throws TencentCloudSDKException
     */
    public CheckAttendanceResponse CheckAttendance(CheckAttendanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAttendanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckAttendanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckAttendance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查人脸图片是否合法
     * @param req CheckFacePhotoRequest
     * @return CheckFacePhotoResponse
     * @throws TencentCloudSDKException
     */
    public CheckFacePhotoResponse CheckFacePhoto(CheckFacePhotoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckFacePhotoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckFacePhotoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckFacePhoto"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建人脸
     * @param req CreateFaceRequest
     * @return CreateFaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceResponse CreateFace(CreateFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建人员库
     * @param req CreateLibraryRequest
     * @return CreateLibraryResponse
     * @throws TencentCloudSDKException
     */
    public CreateLibraryResponse CreateLibrary(CreateLibraryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLibraryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLibraryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLibrary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建词汇
     * @param req CreateVocabRequest
     * @return CreateVocabResponse
     * @throws TencentCloudSDKException
     */
    public CreateVocabResponse CreateVocab(CreateVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *建立词汇库
     * @param req CreateVocabLibRequest
     * @return CreateVocabLibResponse
     * @throws TencentCloudSDKException
     */
    public CreateVocabLibResponse CreateVocabLib(CreateVocabLibRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVocabLibResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVocabLibResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateVocabLib"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除人脸
     * @param req DeleteFaceRequest
     * @return DeleteFaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFaceResponse DeleteFace(DeleteFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除人员库
     * @param req DeleteLibraryRequest
     * @return DeleteLibraryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLibraryResponse DeleteLibrary(DeleteLibraryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLibraryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLibraryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLibrary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除人员
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除词汇
     * @param req DeleteVocabRequest
     * @return DeleteVocabResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVocabResponse DeleteVocab(DeleteVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除词汇库
     * @param req DeleteVocabLibRequest
     * @return DeleteVocabLibResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVocabLibResponse DeleteVocabLib(DeleteVocabLibRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVocabLibResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVocabLibResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteVocabLib"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取标准化接口任务结果
     * @param req DescribeAITaskResultRequest
     * @return DescribeAITaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITaskResultResponse DescribeAITaskResult(DescribeAITaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAITaskResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAITaskResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAITaskResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *人脸考勤查询结果
     * @param req DescribeAttendanceResultRequest
     * @return DescribeAttendanceResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttendanceResultResponse DescribeAttendanceResult(DescribeAttendanceResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttendanceResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttendanceResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAttendanceResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *音频评估任务信息查询接口，异步查询客户提交的请求的结果。
     * @param req DescribeAudioTaskRequest
     * @return DescribeAudioTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAudioTaskResponse DescribeAudioTask(DescribeAudioTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAudioTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAudioTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAudioTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *音频对话任务评估任务信息查询接口，异步查询客户提交的请求的结果。
     * @param req DescribeConversationTaskRequest
     * @return DescribeConversationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationTaskResponse DescribeConversationTask(DescribeConversationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConversationTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConversationTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeConversationTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *视频精彩集锦结果查询接口，异步查询客户提交的请求的结果。
     * @param req DescribeHighlightResultRequest
     * @return DescribeHighlightResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHighlightResultResponse DescribeHighlightResult(DescribeHighlightResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHighlightResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHighlightResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHighlightResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取任务详情
     * @param req DescribeImageTaskRequest
     * @return DescribeImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageTaskResponse DescribeImageTask(DescribeImageTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取图像任务统计信息
     * @param req DescribeImageTaskStatisticRequest
     * @return DescribeImageTaskStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageTaskStatisticResponse DescribeImageTaskStatistic(DescribeImageTaskStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageTaskStatisticResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageTaskStatisticResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeImageTaskStatistic"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人员库列表
     * @param req DescribeLibrariesRequest
     * @return DescribeLibrariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibrariesResponse DescribeLibraries(DescribeLibrariesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLibrariesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLibrariesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLibraries"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人员详情
     * @param req DescribePersonRequest
     * @return DescribePersonResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonResponse DescribePerson(DescribePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取人员列表
     * @param req DescribePersonsRequest
     * @return DescribePersonsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonsResponse DescribePersons(DescribePersonsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePersonsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePersons"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询词汇
     * @param req DescribeVocabRequest
     * @return DescribeVocabResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVocabResponse DescribeVocab(DescribeVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询词汇库
     * @param req DescribeVocabLibRequest
     * @return DescribeVocabLibResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVocabLibResponse DescribeVocabLib(DescribeVocabLibRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVocabLibResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVocabLibResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeVocabLib"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员库信息
     * @param req ModifyLibraryRequest
     * @return ModifyLibraryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLibraryResponse ModifyLibrary(ModifyLibraryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLibraryResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLibraryResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLibrary"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员信息
     * @param req ModifyPersonRequest
     * @return ModifyPersonResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonResponse ModifyPerson(ModifyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *音频任务提交接口
     * @param req SubmitAudioTaskRequest
     * @return SubmitAudioTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitAudioTaskResponse SubmitAudioTask(SubmitAudioTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitAudioTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitAudioTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitAudioTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交人员考勤任务
     * @param req SubmitCheckAttendanceTaskRequest
     * @return SubmitCheckAttendanceTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCheckAttendanceTaskResponse SubmitCheckAttendanceTask(SubmitCheckAttendanceTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCheckAttendanceTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCheckAttendanceTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitCheckAttendanceTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起双路视频生成精彩集锦接口。该接口可以通过客户传入的学生音视频及老师视频两路Url，自动生成一堂课程的精彩集锦。需要通过SubmitDoubleVideoHighlights接口获取生成结果。
     * @param req SubmitDoubleVideoHighlightsRequest
     * @return SubmitDoubleVideoHighlightsResponse
     * @throws TencentCloudSDKException
     */
    public SubmitDoubleVideoHighlightsResponse SubmitDoubleVideoHighlights(SubmitDoubleVideoHighlightsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitDoubleVideoHighlightsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitDoubleVideoHighlightsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitDoubleVideoHighlights"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起视频生成精彩集锦接口。该接口可以通过客户传入的课程音频数据及相关策略（如微笑抽取，专注抽取等），自动生成一堂课程的精彩集锦。需要通过QueryHighlightResult接口获取生成结果。
     * @param req SubmitHighlightsRequest
     * @return SubmitHighlightsResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHighlightsResponse SubmitHighlights(SubmitHighlightsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitHighlightsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitHighlightsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitHighlights"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交图像分析任务
     * @param req SubmitImageTaskRequest
     * @return SubmitImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageTaskResponse SubmitImageTask(SubmitImageTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitImageTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitImageTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitImageTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分析音频信息
     * @param req TransmitAudioStreamRequest
     * @return TransmitAudioStreamResponse
     * @throws TencentCloudSDKException
     */
    public TransmitAudioStreamResponse TransmitAudioStream(TransmitAudioStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransmitAudioStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TransmitAudioStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TransmitAudioStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
