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
    private static String service = "tci";
    private static String version = "2019-03-18";

    public TciClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AIAssistantResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AIAssistant");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于取消已经提交的任务，目前只支持图像任务。
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckFacePhotoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckFacePhoto");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLibraryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLibrary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建人员
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVocabLibResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVocabLib");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLibraryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLibrary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVocabLibResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVocabLib");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAITaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAITaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttendanceResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttendanceResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAudioTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAudioTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConversationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConversationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHighlightResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHighlightResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageTaskStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageTaskStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLibrariesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLibraries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePersonsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePersons");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVocabResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVocab");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVocabLibResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVocabLib");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLibraryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLibrary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPerson");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitAudioTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitAudioTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交人员考勤任务，支持包括点播和直播资源；支持通过DescribeAttendanceResult查询结果，也支持通过NoticeUrl设置考勤回调结果，回调结果结构如下：
##### 回调事件结构
 | 参数名称 | 类型 | 描述 | 
 | ----  | ---  | ------  |
 | jobid | Integer | 任务ID | 
 | person_info | array of PersonInfo | 识别到的人员列表 | 
#####子结构PersonInfo
 | 参数名称 | 类型 | 描述 | 
 | ----  | ---  | ------  |
 | traceid | String | 可用于区分同一路视频流下的不同陌生人 | 
 | personid | String | 识别到的人员ID，如果是陌生人则返回空串 | 
 | libid | String | 识别到的人员所在的库ID，如果是陌生人则返回空串 | 
 | timestamp | uint64 | 识别到人脸的绝对时间戳，单位ms | 
 | image_url | string | 识别到人脸的事件抓图的下载地址，不长期保存，需要请及时下载 | 
     * @param req SubmitCheckAttendanceTaskRequest
     * @return SubmitCheckAttendanceTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCheckAttendanceTaskResponse SubmitCheckAttendanceTask(SubmitCheckAttendanceTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCheckAttendanceTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCheckAttendanceTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitCheckAttendanceTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持多路视频流，提交高级人员考勤任务
     * @param req SubmitCheckAttendanceTaskPlusRequest
     * @return SubmitCheckAttendanceTaskPlusResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCheckAttendanceTaskPlusResponse SubmitCheckAttendanceTaskPlus(SubmitCheckAttendanceTaskPlusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCheckAttendanceTaskPlusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCheckAttendanceTaskPlusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitCheckAttendanceTaskPlus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对话任务分析接口
     * @param req SubmitConversationTaskRequest
     * @return SubmitConversationTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitConversationTaskResponse SubmitConversationTask(SubmitConversationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitConversationTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitConversationTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitConversationTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发起双路视频生成精彩集锦接口。该接口可以通过客户传入的学生音视频及老师视频两路Url，自动生成一堂课程的精彩集锦。需要通过DescribeHighlightResult
接口获取生成结果。
     * @param req SubmitDoubleVideoHighlightsRequest
     * @return SubmitDoubleVideoHighlightsResponse
     * @throws TencentCloudSDKException
     */
    public SubmitDoubleVideoHighlightsResponse SubmitDoubleVideoHighlights(SubmitDoubleVideoHighlightsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitDoubleVideoHighlightsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitDoubleVideoHighlightsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitDoubleVideoHighlights");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***传统课堂授课任务**：在此场景中，老师为站立授课，有白板或投影供老师展示课程内容，摄像头可以拍摄到老师的半身或者全身。拍摄视频为一路全局画面，且背景不动，要求画面稳定清晰。通过此接口可分析老师授课的行为及语音，以支持AI评教。  
  
**提供的功能接口有：**老师人脸识别、老师表情识别、老师肢体动作识别、语音识别。  可分析的指标维度包括：身份识别、正脸、侧脸、人脸坐标、人脸尺寸、高兴、中性、高兴、中性、惊讶、厌恶、恐惧、愤怒、蔑视、悲伤、正面讲解、写板书、指黑板、语音转文字、发音时长、非发音时长、音量、语速、指定关键词的使用等
  
**对场景的要求为：**真实场景老师1人出现在画面中，全局画面且背景不动；人脸上下角度在20度以内，左右角度在15度以内，歪头角度在15度以内；光照均匀，无遮挡，人脸清晰可见；像素最好在 100X100 像素以上，但是图像整体质量不能超过1080p。
    
**结果查询方式：**图像任务直接返回结果，点播及直播任务通过DescribeAITaskResult查询结果。
     * @param req SubmitFullBodyClassTaskRequest
     * @return SubmitFullBodyClassTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitFullBodyClassTaskResponse SubmitFullBodyClassTask(SubmitFullBodyClassTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitFullBodyClassTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitFullBodyClassTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitFullBodyClassTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitHighlightsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitHighlights");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitImageTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitImageTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *高级图像分析任务，开放了图像任务里的所有开关，可以根据场景深度定制图像分析任务。支持的图像类别有，图片链接、图片二进制数据、点播链接和直播链接。
     * @param req SubmitImageTaskPlusRequest
     * @return SubmitImageTaskPlusResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageTaskPlusResponse SubmitImageTaskPlus(SubmitImageTaskPlusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitImageTaskPlusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitImageTaskPlusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitImageTaskPlus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***提交在线1对1课堂任务**  
对于在线1对1课堂，老师通过视频向学生授课，并且学生人数为1人。通过上传学生端的图像信息，可以获取学生的听课情况分析。 具体指一路全局画面且背景不动，有1位学生的头像或上半身的画面，要求画面稳定清晰。
  
**提供的功能接口有：**学生人脸识别、学生表情识别、语音识别。可分析的指标维度包括：学生身份识别、正脸、侧脸、抬头、低头、人脸坐标、人脸尺寸、高兴、中性、高兴、中性、惊讶、厌恶、恐惧、愤怒、蔑视、悲伤、语音转文字、发音时长、非发音时长、音量、语速等。
  
**对场景的要求为：**真实常规1v1授课场景，学生2人以下，全局画面且背景不动；人脸上下角度在20度以内，左右角度在15度以内，歪头角度在15度以内；光照均匀，无遮挡，人脸清晰可见；像素最好在 100X100 像素以上，但是图像整体质量不能超过1080p。
    
**结果查询方式：**图像任务直接返回结果，点播及直播任务通过DescribeAITaskResult查询结果。
     * @param req SubmitOneByOneClassTaskRequest
     * @return SubmitOneByOneClassTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitOneByOneClassTaskResponse SubmitOneByOneClassTask(SubmitOneByOneClassTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitOneByOneClassTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitOneByOneClassTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitOneByOneClassTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***提交线下小班（无课桌）课任务**  
线下小班课是指有学生无课桌的课堂，满座15人以下，全局画面且背景不动，能清晰看到。  
  
**提供的功能接口有：**学生人脸识别、学生表情识别、学生肢体动作识别。  可分析的指标维度包括：身份识别、正脸、侧脸、抬头、低头、高兴、中性、高兴、中性、惊讶、厌恶、恐惧、愤怒、蔑视、悲伤、站立、举手、坐着等。
  
**对场景的要求为：**真实常规教室，满座15人以下，全局画面且背景不动；人脸上下角度在20度以内，左右角度在15度以内，歪头角度在15度以内；光照均匀，无遮挡，人脸清晰可见；像素最好在 100X100 像素以上但是图像整体质量不能超过1080p。
    
**结果查询方式：**图像任务直接返回结果，点播及直播任务通过DescribeAITaskResult查询结果。
     * @param req SubmitOpenClassTaskRequest
     * @return SubmitOpenClassTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitOpenClassTaskResponse SubmitOpenClassTask(SubmitOpenClassTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitOpenClassTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitOpenClassTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitOpenClassTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***在线小班课任务**：此场景是在线授课场景，老师一般为坐着授课，摄像头可以拍摄到老师的头部及上半身。拍摄视频为一路全局画面，且背景不动，要求画面稳定清晰。通过此接口可分析老师授课的行为及语音，以支持AI评教。    
  
**提供的功能接口有：**老师人脸识别、老师表情识别、老师手势识别、光线识别、语音识别。 可分析的指标维度包括：身份识别、正脸、侧脸、人脸坐标、人脸尺寸、高兴、中性、高兴、中性、惊讶、厌恶、恐惧、愤怒、蔑视、悲伤、点赞手势、听你说手势、听我说手势、拿教具行为、语音转文字、发音时长、非发音时长、音量、语速、指定关键词的使用等 
  
**对场景的要求为：**在线常规授课场景，全局画面且背景不动；人脸上下角度在20度以内，左右角度在15度以内，歪头角度在15度以内；光照均匀，无遮挡，人脸清晰可见；像素最好在 100X100 像素以上，但是图像整体质量不能超过1080p。
    
**结果查询方式：**图像任务直接返回结果，点播及直播任务通过DescribeAITaskResult查询结果。
     * @param req SubmitPartialBodyClassTaskRequest
     * @return SubmitPartialBodyClassTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitPartialBodyClassTaskResponse SubmitPartialBodyClassTask(SubmitPartialBodyClassTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitPartialBodyClassTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitPartialBodyClassTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitPartialBodyClassTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     ***提交线下传统面授大班课（含课桌）任务。**  
传统教室课堂是指有学生课堂有课桌的课堂，满座20-50人，全局画面且背景不动。  
  
**提供的功能接口有：**学生人脸识别、学生表情识别、学生肢体动作识别。可分析的指标维度包括：学生身份识别、正脸、侧脸、抬头、低头、高兴、中性、高兴、中性、惊讶、厌恶、恐惧、愤怒、蔑视、悲伤、举手、站立、坐着、趴桌子、玩手机等  
  
**对场景的要求为：**传统的学生上课教室，满座20-50人，全局画面且背景不动；人脸上下角度在20度以内，左右角度在15度以内，歪头角度在15度以内；光照均匀，无遮挡，人脸清晰可见；像素最好在 100X100 像素以上，但是图像整体质量不能超过1080p。
    
**结果查询方式：**图像任务直接返回结果，点播及直播任务通过DescribeAITaskResult查询结果。
  
     * @param req SubmitTraditionalClassTaskRequest
     * @return SubmitTraditionalClassTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTraditionalClassTaskResponse SubmitTraditionalClassTask(SubmitTraditionalClassTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitTraditionalClassTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitTraditionalClassTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitTraditionalClassTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TransmitAudioStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TransmitAudioStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
