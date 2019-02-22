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
package com.tencentcloudapi.faceid.v20180301;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.faceid.v20180301.models.*;

public class FaceidClient extends AbstractClient{
    private static String endpoint = "faceid.tencentcloudapi.com";
    private static String version = "2018-03-01";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public FaceidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public FaceidClient(Credential credential, String region, ClientProfile profile) {
        super(FaceidClient.endpoint, FaceidClient.version, credential, region, profile);
    }

    /**
     *每次开始核身前，需先调用本接口获取BizToken，用来串联核身流程，在核身完成后，用于获取验证结果信息。
     * @param req DetectAuthRequest
     * @return DetectAuthResponse
     * @throws TencentCloudSDKException
     */
    public DetectAuthResponse DetectAuth(DetectAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectAuthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectAuthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectAuth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用动作活体检测模式前，需调用本接口获取动作顺序。
     * @param req GetActionSequenceRequest
     * @return GetActionSequenceResponse
     * @throws TencentCloudSDKException
     */
    public GetActionSequenceResponse GetActionSequence(GetActionSequenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetActionSequenceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetActionSequenceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetActionSequence"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *完成验证后，用BizToken调用本接口获取结果信息，BizToken生成后三天内（3\*24\*3,600秒）可多次拉取。
     * @param req GetDetectInfoRequest
     * @return GetDetectInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetDetectInfoResponse GetDetectInfo(GetDetectInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDetectInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetDetectInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetDetectInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用数字活体检测模式前，需调用本接口获取数字验证码。
     * @param req GetLiveCodeRequest
     * @return GetLiveCodeResponse
     * @throws TencentCloudSDKException
     */
    public GetLiveCodeResponse GetLiveCode(GetLiveCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLiveCodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetLiveCodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetLiveCode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入姓名和身份证号，校验两者的真实性和一致性。
     * @param req IdCardVerificationRequest
     * @return IdCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public IdCardVerificationResponse IdCardVerification(IdCardVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IdCardVerificationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IdCardVerificationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IdCardVerification"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入照片和身份信息，判断该照片与公安权威库的证件照是否属于同一个人。
     * @param req ImageRecognitionRequest
     * @return ImageRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public ImageRecognitionResponse ImageRecognition(ImageRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageRecognitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImageRecognitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImageRecognition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入视频和照片，先判断视频中是否为真人，判断为真人后，再判断该视频中的人与上传照片是否属于同一个人。
     * @param req LivenessCompareRequest
     * @return LivenessCompareResponse
     * @throws TencentCloudSDKException
     */
    public LivenessCompareResponse LivenessCompare(LivenessCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LivenessCompareResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<LivenessCompareResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "LivenessCompare"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入视频和身份信息，先判断视频中是否为真人，判断为真人后，再判断该视频中的人与公安权威库的证件照是否属于同一个人。
     * @param req LivenessRecognitionRequest
     * @return LivenessRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public LivenessRecognitionResponse LivenessRecognition(LivenessRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LivenessRecognitionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<LivenessRecognitionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "LivenessRecognition"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
