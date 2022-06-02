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
    private static String service = "faceid";
    private static String version = "2018-03-01";

    public FaceidClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public FaceidClient(Credential credential, String region, ClientProfile profile) {
        super(FaceidClient.endpoint, FaceidClient.version, credential, region, profile);
    }

    /**
     *本接口用于校验姓名和银行卡号的真实性和一致性。
     * @param req BankCard2EVerificationRequest
     * @return BankCard2EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public BankCard2EVerificationResponse BankCard2EVerification(BankCard2EVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BankCard2EVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BankCard2EVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BankCard2EVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于输入银行卡号、姓名、开户证件号、开户手机号，校验信息的真实性和一致性。
     * @param req BankCard4EVerificationRequest
     * @return BankCard4EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public BankCard4EVerificationResponse BankCard4EVerification(BankCard4EVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BankCard4EVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BankCard4EVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BankCard4EVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于银行卡号、姓名、开户证件号信息的真实性和一致性。
     * @param req BankCardVerificationRequest
     * @return BankCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public BankCardVerificationResponse BankCardVerification(BankCardVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BankCardVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BankCardVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BankCardVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *银行卡基础信息查询
     * @param req CheckBankCardInformationRequest
     * @return CheckBankCardInformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckBankCardInformationResponse CheckBankCardInformation(CheckBankCardInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBankCardInformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBankCardInformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBankCardInformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于轮询E证通H5场景EidToken验证状态。
     * @param req CheckEidTokenStatusRequest
     * @return CheckEidTokenStatusResponse
     * @throws TencentCloudSDKException
     */
    public CheckEidTokenStatusResponse CheckEidTokenStatus(CheckEidTokenStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckEidTokenStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckEidTokenStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckEidTokenStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入身份证人像面照片，识别身份证照片上的信息，并将姓名、身份证号、身份证人像照片与权威库的证件照进行比对，是否属于同一个人，从而验证身份证信息的真实性。
     * @param req CheckIdCardInformationRequest
     * @return CheckIdCardInformationResponse
     * @throws TencentCloudSDKException
     */
    public CheckIdCardInformationResponse CheckIdCardInformation(CheckIdCardInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckIdCardInformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckIdCardInformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckIdCardInformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验姓名、身份证号、身份证有效期的真实性和一致性。
     * @param req CheckIdNameDateRequest
     * @return CheckIdNameDateResponse
     * @throws TencentCloudSDKException
     */
    public CheckIdNameDateResponse CheckIdNameDate(CheckIdNameDateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckIdNameDateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckIdNameDateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckIdNameDate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *手机号二要素核验接口用于校验手机号和姓名的真实性和一致性，支持的手机号段详情请查阅<a href="https://cloud.tencent.com/document/product/1007/46063">运营商类</a>文档。

     * @param req CheckPhoneAndNameRequest
     * @return CheckPhoneAndNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckPhoneAndNameResponse CheckPhoneAndName(CheckPhoneAndNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckPhoneAndNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckPhoneAndNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckPhoneAndName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *每次调用人脸核身SaaS化服务前，需先调用本接口获取BizToken，用来串联核身流程，在验证完成后，用于获取验证结果信息。
     * @param req DetectAuthRequest
     * @return DetectAuthResponse
     * @throws TencentCloudSDKException
     */
    public DetectAuthResponse DetectAuth(DetectAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectAuthResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetectAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *使用活体比对（光线）SDK生成的数据包检测活体，并和传入的图片进行比对。
图片和SDK生成的数据内容必须存储在腾讯云COS，COS Bucket所在的Region需要和本接口请求的Region保持一致，推荐使用生成上传链接接口来完成资源传递。
     * @param req DetectReflectLivenessAndCompareRequest
     * @return DetectReflectLivenessAndCompareResponse
     * @throws TencentCloudSDKException
     */
    public DetectReflectLivenessAndCompareResponse DetectReflectLivenessAndCompare(DetectReflectLivenessAndCompareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectReflectLivenessAndCompareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DetectReflectLivenessAndCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DetectReflectLivenessAndCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验手机号、姓名和身份证号的真实性和一致性，入参支持明文、MD5和SHA256加密传输。
     * @param req EncryptedPhoneVerificationRequest
     * @return EncryptedPhoneVerificationResponse
     * @throws TencentCloudSDKException
     */
    public EncryptedPhoneVerificationResponse EncryptedPhoneVerification(EncryptedPhoneVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EncryptedPhoneVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EncryptedPhoneVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EncryptedPhoneVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetActionSequenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetActionSequence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDetectInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDetectInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *完成验证后，用BizToken调用本接口获取结果信息，BizToken生成后三天内（3\*24\*3,600秒）可多次拉取。
     * @param req GetDetectInfoEnhancedRequest
     * @return GetDetectInfoEnhancedResponse
     * @throws TencentCloudSDKException
     */
    public GetDetectInfoEnhancedResponse GetDetectInfoEnhanced(GetDetectInfoEnhancedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDetectInfoEnhancedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDetectInfoEnhancedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDetectInfoEnhanced");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *完成验证后，用EidToken调用本接口获取结果信息，EidToken生成后三天内（3\*24\*3,600秒）可多次拉取。
     * @param req GetEidResultRequest
     * @return GetEidResultResponse
     * @throws TencentCloudSDKException
     */
    public GetEidResultResponse GetEidResult(GetEidResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetEidResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetEidResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetEidResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *每次调用E证通服务前，需先调用本接口获取EidToken，用来串联E证通流程，在验证完成后，用于获取E证通结果信息。
     * @param req GetEidTokenRequest
     * @return GetEidTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetEidTokenResponse GetEidToken(GetEidTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetEidTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetEidTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetEidToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *完成验证后，用FaceIdToken调用本接口获取结果信息，FaceIdToken生成后三天内（3\*24\*3,600秒）可多次拉取。
     * @param req GetFaceIdResultRequest
     * @return GetFaceIdResultResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdResultResponse GetFaceIdResult(GetFaceIdResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFaceIdResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFaceIdResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFaceIdResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *每次调用人脸核身SDK服务前，需先调用本接口获取SDKToken，用来串联核身流程，在验证完成后，用于获取验证结果信息，该token仅能核身一次。
     * @param req GetFaceIdTokenRequest
     * @return GetFaceIdTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetFaceIdTokenResponse GetFaceIdToken(GetFaceIdTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetFaceIdTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetFaceIdTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetFaceIdToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetLiveCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLiveCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取微信实名认证结果
     * @param req GetRealNameAuthResultRequest
     * @return GetRealNameAuthResultResponse
     * @throws TencentCloudSDKException
     */
    public GetRealNameAuthResultResponse GetRealNameAuthResult(GetRealNameAuthResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRealNameAuthResultResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRealNameAuthResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRealNameAuthResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口仅限微信公众号中使用，传入姓名和身份证号获取回调URL，在微信公众号中打开验证姓名和身份证号与微信实名的信息是否一致。

     * @param req GetRealNameAuthTokenRequest
     * @return GetRealNameAuthTokenResponse
     * @throws TencentCloudSDKException
     */
    public GetRealNameAuthTokenResponse GetRealNameAuthToken(GetRealNameAuthTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRealNameAuthTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRealNameAuthTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRealNameAuthToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询微信渠道服务（微信小程序、微信原生H5、微信普通H5）的账单明细及计费状态。
     * @param req GetWeChatBillDetailsRequest
     * @return GetWeChatBillDetailsResponse
     * @throws TencentCloudSDKException
     */
    public GetWeChatBillDetailsResponse GetWeChatBillDetails(GetWeChatBillDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetWeChatBillDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetWeChatBillDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetWeChatBillDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验姓名和身份证号的真实性和一致性，您可以通过输入姓名和身份证号或传入身份证人像面照片提供所需验证信息。
     * @param req IdCardOCRVerificationRequest
     * @return IdCardOCRVerificationResponse
     * @throws TencentCloudSDKException
     */
    public IdCardOCRVerificationResponse IdCardOCRVerification(IdCardOCRVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IdCardOCRVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IdCardOCRVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IdCardOCRVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IdCardVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IdCardVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入照片和身份信息，判断该照片与权威库的证件照是否属于同一个人。
     * @param req ImageRecognitionRequest
     * @return ImageRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public ImageRecognitionResponse ImageRecognition(ImageRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageRecognitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImageRecognitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImageRecognition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *活体检测
     * @param req LivenessRequest
     * @return LivenessResponse
     * @throws TencentCloudSDKException
     */
    public LivenessResponse Liveness(LivenessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LivenessResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LivenessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "Liveness");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
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
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LivenessCompareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LivenessCompare");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入视频和身份信息，先判断视频中是否为真人，判断为真人后，再判断该视频中的人与权威库的证件照是否属于同一个人。
     * @param req LivenessRecognitionRequest
     * @return LivenessRecognitionResponse
     * @throws TencentCloudSDKException
     */
    public LivenessRecognitionResponse LivenessRecognition(LivenessRecognitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LivenessRecognitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<LivenessRecognitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "LivenessRecognition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过传入手机号或姓名和身份证号，结合权威数据源和腾讯健康守护可信模型，判断该信息是否真实且年满18周岁。腾讯健康守护可信模型覆盖了上十亿手机库源，覆盖率高、准确率高，如果不在库中的手机号，还可以通过姓名+身份证进行兜底验证。
     * @param req MinorsVerificationRequest
     * @return MinorsVerificationResponse
     * @throws TencentCloudSDKException
     */
    public MinorsVerificationResponse MinorsVerification(MinorsVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MinorsVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MinorsVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MinorsVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询手机号在网时长，输入手机号进行查询。
     * @param req MobileNetworkTimeVerificationRequest
     * @return MobileNetworkTimeVerificationResponse
     * @throws TencentCloudSDKException
     */
    public MobileNetworkTimeVerificationResponse MobileNetworkTimeVerification(MobileNetworkTimeVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MobileNetworkTimeVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MobileNetworkTimeVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MobileNetworkTimeVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于验证手机号的状态，您可以输入手机号进行查询。
     * @param req MobileStatusRequest
     * @return MobileStatusResponse
     * @throws TencentCloudSDKException
     */
    public MobileStatusResponse MobileStatus(MobileStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MobileStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MobileStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MobileStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解析SDK获取到的证件NFC数据，接口传入SDK返回的ReqId，返回证件信息（个别字段为特定证件类型特有）。SDK生成的ReqId五分钟内有效，重复查询仅收一次费。支持身份证类证件（二代身份证、港澳居住证、台湾居住证、外国人永居证）以及旅行类证件（港澳通行证、台湾通行证、台胞证、回乡证）的NFC识别及核验。
     * @param req ParseNfcDataRequest
     * @return ParseNfcDataResponse
     * @throws TencentCloudSDKException
     */
    public ParseNfcDataResponse ParseNfcData(ParseNfcDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ParseNfcDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ParseNfcDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ParseNfcData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验手机号、姓名和身份证号的真实性和一致性。支持的手机号段详情请查阅<a href="https://cloud.tencent.com/document/product/1007/46063">运营商类</a>文档。
     * @param req PhoneVerificationRequest
     * @return PhoneVerificationResponse
     * @throws TencentCloudSDKException
     */
    public PhoneVerificationResponse PhoneVerification(PhoneVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PhoneVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PhoneVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PhoneVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验中国移动手机号、姓名和身份证号的真实性和一致性。中国移动支持的手机号段详情请查阅<a href="https://cloud.tencent.com/document/product/1007/46063">运营商类</a>文档。
     * @param req PhoneVerificationCMCCRequest
     * @return PhoneVerificationCMCCResponse
     * @throws TencentCloudSDKException
     */
    public PhoneVerificationCMCCResponse PhoneVerificationCMCC(PhoneVerificationCMCCRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PhoneVerificationCMCCResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PhoneVerificationCMCCResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PhoneVerificationCMCC");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验中国电信手机号、姓名和身份证号的真实性和一致性。中国电信支持的手机号段详情请查阅<a href="https://cloud.tencent.com/document/product/1007/46063">运营商类</a>文档。
     * @param req PhoneVerificationCTCCRequest
     * @return PhoneVerificationCTCCResponse
     * @throws TencentCloudSDKException
     */
    public PhoneVerificationCTCCResponse PhoneVerificationCTCC(PhoneVerificationCTCCRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PhoneVerificationCTCCResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PhoneVerificationCTCCResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PhoneVerificationCTCC");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于校验中国联通手机号、姓名和身份证号的真实性和一致性。中国联通支持的手机号段详情请查阅<a href="https://cloud.tencent.com/document/product/1007/46063">运营商类</a>文档。
     * @param req PhoneVerificationCUCCRequest
     * @return PhoneVerificationCUCCResponse
     * @throws TencentCloudSDKException
     */
    public PhoneVerificationCUCCResponse PhoneVerificationCUCC(PhoneVerificationCUCCRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PhoneVerificationCUCCResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PhoneVerificationCUCCResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PhoneVerificationCUCC");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
