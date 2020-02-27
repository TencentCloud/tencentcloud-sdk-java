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
package com.tencentcloudapi.asr.v20190614;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.asr.v20190614.models.*;

public class AsrClient extends AbstractClient{
    private static String endpoint = "asr.tencentcloudapi.com";
    private static String version = "2019-06-14";

    public AsrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AsrClient(Credential credential, String region, ClientProfile profile) {
        super(AsrClient.endpoint, AsrClient.version, credential, region, profile);
    }

    /**
     *用户通过本接口进行热词表的创建。
<br>•   默认最多可创建30个热词表。
<br>•   每个热词表最多可添加128个词，每个词最长10个字，不能超出限制。
<br>•   热词表可以通过数组或者本地文件形式上传。
<br>•   本地文件必须为UTF-8编码格式，每行仅添加一个热词且不能包含标点和特殊字符。
<br>•   热词权重取值范围为[1,10]之间的整数，权重越大代表该词被识别出来的概率越大。
     * @param req CreateAsrVocabRequest
     * @return CreateAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public CreateAsrVocabResponse CreateAsrVocab(CreateAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAsrVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAsrVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAsrVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口服务对录音时长1小时以内的录音文件进行识别，异步返回识别全部结果。
<br>• 接口是 HTTP RESTful 形式
<br>• 接口支持wav、mp3、silk、amr、m4a等主流音频格式
<br>• 支持语音 URL 和本地语音文件两种请求方式
<br>• 本地语音文件上传的文件不能大于5MB，语音 URL的音频时长不能长于1小时
<br>• 支持中文普通话、英语和粤语。
<br>• 支持回调或轮询的方式获取结果，结果获取请参考[ 录音文件识别结果查询](https://cloud.tencent.com/document/product/1093/37822)。
     * @param req CreateRecTaskRequest
     * @return CreateRecTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecTaskResponse CreateRecTask(CreateRecTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRecTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行热词表的删除。
     * @param req DeleteAsrVocabRequest
     * @return DeleteAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAsrVocabResponse DeleteAsrVocab(DeleteAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAsrVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAsrVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAsrVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在调用录音文件识别请求接口后，有回调和轮询两种方式获取识别结果。
<br>• 当采用回调方式时，识别完成后会将结果通过 POST 请求的形式通知到用户在请求时填写的回调 URL，具体请参见[ 录音识别结果回调 ](https://cloud.tencent.com/document/product/1093/37139#callback)。
<br>• 当采用轮询方式时，需要主动提交任务ID来轮询识别结果，共有任务成功、等待、执行中和失败四种结果，具体信息请参见下文说明。

     * @param req DescribeTaskStatusRequest
     * @return DescribeTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskStatusResponse DescribeTaskStatus(DescribeTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTaskStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行热词表的下载，获得词表权重文件形式的 base64 值，文件形式为通过 “|” 分割的词和权重，即 word|weight 的形式。
     * @param req DownloadAsrVocabRequest
     * @return DownloadAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public DownloadAsrVocabResponse DownloadAsrVocab(DownloadAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadAsrVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadAsrVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadAsrVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户根据词表的ID可以获取对应的热词表信息
     * @param req GetAsrVocabRequest
     * @return GetAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public GetAsrVocabResponse GetAsrVocab(GetAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAsrVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetAsrVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetAsrVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口，可获得所有的热词表及其信息。
     * @param req GetAsrVocabListRequest
     * @return GetAsrVocabListResponse
     * @throws TencentCloudSDKException
     */
    public GetAsrVocabListResponse GetAsrVocabList(GetAsrVocabListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAsrVocabListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetAsrVocabListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetAsrVocabList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于对60秒之内的短音频文件进行识别。
<br>•   支持中文普通话、英语、粤语。
<br>•   支持本地语音文件上传和语音URL上传两种请求方式。
<br>•   音频格式支持wav、mp3；采样率支持8000Hz或者16000Hz；采样精度支持16bits；声道支持单声道。
<br>•   当音频文件通过请求中body内容上传时，请求大小不能超过600KB；当音频以URL方式传输时，音频时长不可超过60s。
<br>•   所有请求参数放在POST请求的body中，编码类型采用x-www-form-urlencoded，参数进行urlencode编码后传输。
     * @param req SentenceRecognitionRequest
     * @return SentenceRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public SentenceRecognitionResponse SentenceRecognition(SentenceRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SentenceRecognitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SentenceRecognitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SentenceRecognition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过该接口可以设置热词表的默认状态。初始状态为0，用户可设置状态为1，即为默认状态。默认状态表示用户在请求识别时，如不设置热词表ID，则默认使用状态为1的热词表。
     * @param req SetVocabStateRequest
     * @return SetVocabStateResponse
     * @throws TencentCloudSDKException
     */
    public SetVocabStateResponse SetVocabState(SetVocabStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVocabStateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetVocabStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetVocabState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户通过本接口进行对应的词表信息更新。
     * @param req UpdateAsrVocabRequest
     * @return UpdateAsrVocabResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAsrVocabResponse UpdateAsrVocab(UpdateAsrVocabRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAsrVocabResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAsrVocabResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateAsrVocab"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
