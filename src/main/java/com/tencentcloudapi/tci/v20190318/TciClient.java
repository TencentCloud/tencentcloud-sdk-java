/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AIAssistant", AIAssistantResponse.class);
    }

    /**
     *用于取消已经提交的任务，目前只支持图像任务。
     * @param req CancelTaskRequest
     * @return CancelTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelTaskResponse CancelTask(CancelTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelTask", CancelTaskResponse.class);
    }

    /**
     *检查人脸图片是否合法
     * @param req CheckFacePhotoRequest
     * @return CheckFacePhotoResponse
     * @throws TencentCloudSDKException
     */
    public CheckFacePhotoResponse CheckFacePhoto(CheckFacePhotoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckFacePhoto", CheckFacePhotoResponse.class);
    }

    /**
     *创建人脸
     * @param req CreateFaceRequest
     * @return CreateFaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceResponse CreateFace(CreateFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFace", CreateFaceResponse.class);
    }

    /**
     *创建人员库
     * @param req CreateLibraryRequest
     * @return CreateLibraryResponse
     * @throws TencentCloudSDKException
     */
    public CreateLibraryResponse CreateLibrary(CreateLibraryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLibrary", CreateLibraryResponse.class);
    }

    /**
     *创建人员
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePerson", CreatePersonResponse.class);
    }

    /**
     *创建词汇
     * @param req CreateVocabRequest
     * @return CreateVocabResponse
     * @throws TencentCloudSDKException
     */
    public CreateVocabResponse CreateVocab(CreateVocabRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVocab", CreateVocabResponse.class);
    }

    /**
     *建立词汇库
     * @param req CreateVocabLibRequest
     * @return CreateVocabLibResponse
     * @throws TencentCloudSDKException
     */
    public CreateVocabLibResponse CreateVocabLib(CreateVocabLibRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVocabLib", CreateVocabLibResponse.class);
    }

    /**
     *删除人脸
     * @param req DeleteFaceRequest
     * @return DeleteFaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFaceResponse DeleteFace(DeleteFaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFace", DeleteFaceResponse.class);
    }

    /**
     *删除人员库
     * @param req DeleteLibraryRequest
     * @return DeleteLibraryResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLibraryResponse DeleteLibrary(DeleteLibraryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLibrary", DeleteLibraryResponse.class);
    }

    /**
     *删除人员
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePerson", DeletePersonResponse.class);
    }

    /**
     *删除词汇
     * @param req DeleteVocabRequest
     * @return DeleteVocabResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVocabResponse DeleteVocab(DeleteVocabRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVocab", DeleteVocabResponse.class);
    }

    /**
     *删除词汇库
     * @param req DeleteVocabLibRequest
     * @return DeleteVocabLibResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVocabLibResponse DeleteVocabLib(DeleteVocabLibRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVocabLib", DeleteVocabLibResponse.class);
    }

    /**
     *获取标准化接口任务结果
     * @param req DescribeAITaskResultRequest
     * @return DescribeAITaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITaskResultResponse DescribeAITaskResult(DescribeAITaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAITaskResult", DescribeAITaskResultResponse.class);
    }

    /**
     *人脸考勤查询结果
     * @param req DescribeAttendanceResultRequest
     * @return DescribeAttendanceResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttendanceResultResponse DescribeAttendanceResult(DescribeAttendanceResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAttendanceResult", DescribeAttendanceResultResponse.class);
    }

    /**
     *音频评估任务信息查询接口，异步查询客户提交的请求的结果。
     * @param req DescribeAudioTaskRequest
     * @return DescribeAudioTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAudioTaskResponse DescribeAudioTask(DescribeAudioTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAudioTask", DescribeAudioTaskResponse.class);
    }

    /**
     *音频对话任务评估任务信息查询接口，异步查询客户提交的请求的结果。
     * @param req DescribeConversationTaskRequest
     * @return DescribeConversationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConversationTaskResponse DescribeConversationTask(DescribeConversationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConversationTask", DescribeConversationTaskResponse.class);
    }

    /**
     *视频精彩集锦结果查询接口，异步查询客户提交的请求的结果。
     * @param req DescribeHighlightResultRequest
     * @return DescribeHighlightResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHighlightResultResponse DescribeHighlightResult(DescribeHighlightResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHighlightResult", DescribeHighlightResultResponse.class);
    }

    /**
     *拉取任务详情
     * @param req DescribeImageTaskRequest
     * @return DescribeImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageTaskResponse DescribeImageTask(DescribeImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageTask", DescribeImageTaskResponse.class);
    }

    /**
     *获取图像任务统计信息
     * @param req DescribeImageTaskStatisticRequest
     * @return DescribeImageTaskStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageTaskStatisticResponse DescribeImageTaskStatistic(DescribeImageTaskStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageTaskStatistic", DescribeImageTaskStatisticResponse.class);
    }

    /**
     *获取人员库列表
     * @param req DescribeLibrariesRequest
     * @return DescribeLibrariesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLibrariesResponse DescribeLibraries(DescribeLibrariesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLibraries", DescribeLibrariesResponse.class);
    }

    /**
     *获取人员详情
     * @param req DescribePersonRequest
     * @return DescribePersonResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonResponse DescribePerson(DescribePersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePerson", DescribePersonResponse.class);
    }

    /**
     *拉取人员列表
     * @param req DescribePersonsRequest
     * @return DescribePersonsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePersonsResponse DescribePersons(DescribePersonsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePersons", DescribePersonsResponse.class);
    }

    /**
     *查询词汇
     * @param req DescribeVocabRequest
     * @return DescribeVocabResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVocabResponse DescribeVocab(DescribeVocabRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVocab", DescribeVocabResponse.class);
    }

    /**
     *查询词汇库
     * @param req DescribeVocabLibRequest
     * @return DescribeVocabLibResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVocabLibResponse DescribeVocabLib(DescribeVocabLibRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVocabLib", DescribeVocabLibResponse.class);
    }

    /**
     *修改人员库信息
     * @param req ModifyLibraryRequest
     * @return ModifyLibraryResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLibraryResponse ModifyLibrary(ModifyLibraryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLibrary", ModifyLibraryResponse.class);
    }

    /**
     *修改人员信息
     * @param req ModifyPersonRequest
     * @return ModifyPersonResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonResponse ModifyPerson(ModifyPersonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPerson", ModifyPersonResponse.class);
    }

    /**
     *音频任务提交接口
     * @param req SubmitAudioTaskRequest
     * @return SubmitAudioTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitAudioTaskResponse SubmitAudioTask(SubmitAudioTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitAudioTask", SubmitAudioTaskResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitCheckAttendanceTask", SubmitCheckAttendanceTaskResponse.class);
    }

    /**
     *支持多路视频流，提交高级人员考勤任务
     * @param req SubmitCheckAttendanceTaskPlusRequest
     * @return SubmitCheckAttendanceTaskPlusResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCheckAttendanceTaskPlusResponse SubmitCheckAttendanceTaskPlus(SubmitCheckAttendanceTaskPlusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitCheckAttendanceTaskPlus", SubmitCheckAttendanceTaskPlusResponse.class);
    }

    /**
     *对话任务分析接口
     * @param req SubmitConversationTaskRequest
     * @return SubmitConversationTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitConversationTaskResponse SubmitConversationTask(SubmitConversationTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitConversationTask", SubmitConversationTaskResponse.class);
    }

    /**
     *发起双路视频生成精彩集锦接口。该接口可以通过客户传入的学生音视频及老师视频两路Url，自动生成一堂课程的精彩集锦。需要通过DescribeHighlightResult
接口获取生成结果。
     * @param req SubmitDoubleVideoHighlightsRequest
     * @return SubmitDoubleVideoHighlightsResponse
     * @throws TencentCloudSDKException
     */
    public SubmitDoubleVideoHighlightsResponse SubmitDoubleVideoHighlights(SubmitDoubleVideoHighlightsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitDoubleVideoHighlights", SubmitDoubleVideoHighlightsResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitFullBodyClassTask", SubmitFullBodyClassTaskResponse.class);
    }

    /**
     *发起视频生成精彩集锦接口。该接口可以通过客户传入的课程音频数据及相关策略（如微笑抽取，专注抽取等），自动生成一堂课程的精彩集锦。需要通过QueryHighlightResult接口获取生成结果。
     * @param req SubmitHighlightsRequest
     * @return SubmitHighlightsResponse
     * @throws TencentCloudSDKException
     */
    public SubmitHighlightsResponse SubmitHighlights(SubmitHighlightsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitHighlights", SubmitHighlightsResponse.class);
    }

    /**
     *提交图像分析任务
     * @param req SubmitImageTaskRequest
     * @return SubmitImageTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageTaskResponse SubmitImageTask(SubmitImageTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitImageTask", SubmitImageTaskResponse.class);
    }

    /**
     *高级图像分析任务，开放了图像任务里的所有开关，可以根据场景深度定制图像分析任务。支持的图像类别有，图片链接、图片二进制数据、点播链接和直播链接。
     * @param req SubmitImageTaskPlusRequest
     * @return SubmitImageTaskPlusResponse
     * @throws TencentCloudSDKException
     */
    public SubmitImageTaskPlusResponse SubmitImageTaskPlus(SubmitImageTaskPlusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitImageTaskPlus", SubmitImageTaskPlusResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitOneByOneClassTask", SubmitOneByOneClassTaskResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitOpenClassTask", SubmitOpenClassTaskResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitPartialBodyClassTask", SubmitPartialBodyClassTaskResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "SubmitTraditionalClassTask", SubmitTraditionalClassTaskResponse.class);
    }

    /**
     *分析音频信息
     * @param req TransmitAudioStreamRequest
     * @return TransmitAudioStreamResponse
     * @throws TencentCloudSDKException
     */
    public TransmitAudioStreamResponse TransmitAudioStream(TransmitAudioStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TransmitAudioStream", TransmitAudioStreamResponse.class);
    }

}
