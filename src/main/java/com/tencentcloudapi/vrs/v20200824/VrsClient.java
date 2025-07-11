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
package com.tencentcloudapi.vrs.v20200824;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vrs.v20200824.models.*;

public class VrsClient extends AbstractClient{
    private static String endpoint = "vrs.tencentcloudapi.com";
    private static String service = "vrs";
    private static String version = "2020-08-24";

    public VrsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VrsClient(Credential credential, String region, ClientProfile profile) {
        super(VrsClient.endpoint, VrsClient.version, credential, region, profile);
    }

    /**
     *声音复刻取消任务接口
     * @param req CancelVRSTaskRequest
     * @return CancelVRSTaskResponse
     * @throws TencentCloudSDKException
     */
    public CancelVRSTaskResponse CancelVRSTask(CancelVRSTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelVRSTask", CancelVRSTaskResponse.class);
    }

    /**
     *本接口服务对提交音频进行声音复刻任务创建接口，异步返回复刻结果。
• 请求方法为 HTTP POST , Content-Type为"application/json; charset=utf-8"
• 签名方法参考 公共参数 中签名方法v3。
     * @param req CreateVRSTaskRequest
     * @return CreateVRSTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVRSTaskResponse CreateVRSTask(CreateVRSTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVRSTask", CreateVRSTaskResponse.class);
    }

    /**
     *在调用声音复刻创建任务请求接口后，有回调和轮询两种方式获取识别结果。（注意：回调方式目前仅支持轻量版声音复刻）
• 当采用回调方式时，识别完成后会将结果通过 POST 请求的形式通知到用户在请求时填写的回调 URL，具体请参见 [“声音复刻任务创建接口”](https://cloud.tencent.com/document/product/1283/90064) CallbackUrl参数说明 。
• 当采用轮询方式时，需要主动提交任务ID来轮询识别结果，共有任务成功、等待、执行中和失败四种结果，具体信息请参见下文说明。
• 请求方法为 HTTP POST , Content-Type为"application/json; charset=utf-8"
• 签名方法参考 公共参数 中签名方法v3。
     * @param req DescribeVRSTaskStatusRequest
     * @return DescribeVRSTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVRSTaskStatusResponse DescribeVRSTaskStatus(DescribeVRSTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVRSTaskStatus", DescribeVRSTaskStatusResponse.class);
    }

    /**
     *本接口用于检测音频的环境和音频质量。
对于一句话声音复刻，音频时长需大于5s，小于15s，文件大小不能超过2MB，音频需为单声道，位深为16bit。建议格式：wav、单声道、采样率48kHz或24kHz 
• 请求方法为 HTTP POST , Content-Type为"application/json; charset=utf-8"
• 签名方法参考 公共参数 中签名方法v3。
     * @param req DetectEnvAndSoundQualityRequest
     * @return DetectEnvAndSoundQualityResponse
     * @throws TencentCloudSDKException
     */
    public DetectEnvAndSoundQualityResponse DetectEnvAndSoundQuality(DetectEnvAndSoundQualityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DetectEnvAndSoundQuality", DetectEnvAndSoundQualityResponse.class);
    }

    /**
     *下载声音复刻离线模型
     * @param req DownloadVRSModelRequest
     * @return DownloadVRSModelResponse
     * @throws TencentCloudSDKException
     */
    public DownloadVRSModelResponse DownloadVRSModel(DownloadVRSModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadVRSModel", DownloadVRSModelResponse.class);
    }

    /**
     *本接口用于获取声音复刻训练文本信息。
 请求方法为 HTTP POST , Content-Type为"application/json; charset=utf-8"
• 签名方法参考 公共参数 中签名方法v3。
• 当复刻类型为一句话声音复刻时，生成的TextId有效期为7天，且在成功创建一次复刻任务后失效。
     * @param req GetTrainingTextRequest
     * @return GetTrainingTextResponse
     * @throws TencentCloudSDKException
     */
    public GetTrainingTextResponse GetTrainingText(GetTrainingTextRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTrainingText", GetTrainingTextResponse.class);
    }

    /**
     *该接口用于查询复刻音色详细信息。
     * @param req GetVRSVoiceTypeInfoRequest
     * @return GetVRSVoiceTypeInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetVRSVoiceTypeInfoResponse GetVRSVoiceTypeInfo(GetVRSVoiceTypeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVRSVoiceTypeInfo", GetVRSVoiceTypeInfoResponse.class);
    }

    /**
     *查询复刻音色
     * @param req GetVRSVoiceTypesRequest
     * @return GetVRSVoiceTypesResponse
     * @throws TencentCloudSDKException
     */
    public GetVRSVoiceTypesResponse GetVRSVoiceTypes(GetVRSVoiceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVRSVoiceTypes", GetVRSVoiceTypesResponse.class);
    }

}
