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
package com.tencentcloudapi.essbasic.v20201222;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.essbasic.v20201222.models.*;

public class EssbasicClient extends AbstractClient{
    private static String endpoint = "essbasic.tencentcloudapi.com";
    private static String service = "essbasic";
    private static String version = "2020-12-22";

    public EssbasicClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EssbasicClient(Credential credential, String region, ClientProfile profile) {
        super(EssbasicClient.endpoint, EssbasicClient.version, credential, region, profile);
    }

    /**
     *此接口（ArchiveFlow）用于流程的归档。

注意：归档后的流程不可再进行发送、签署、拒签、撤回等一系列操作。
     * @param req ArchiveFlowRequest
     * @return ArchiveFlowResponse
     * @throws TencentCloudSDKException
     */
    public ArchiveFlowResponse ArchiveFlow(ArchiveFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ArchiveFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ArchiveFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ArchiveFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CancelFlow）用于撤销正在进行中的流程。

注：已归档流程不可完成撤销动作。
     * @param req CancelFlowRequest
     * @return CancelFlowResponse
     * @throws TencentCloudSDKException
     */
    public CancelFlowResponse CancelFlow(CancelFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证银行卡二要素
     * @param req CheckBankCard2EVerificationRequest
     * @return CheckBankCard2EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckBankCard2EVerificationResponse CheckBankCard2EVerification(CheckBankCard2EVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBankCard2EVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBankCard2EVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBankCard2EVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证银行卡三要素
     * @param req CheckBankCard3EVerificationRequest
     * @return CheckBankCard3EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckBankCard3EVerificationResponse CheckBankCard3EVerification(CheckBankCard3EVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBankCard3EVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBankCard3EVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBankCard3EVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证银行卡四要素
     * @param req CheckBankCard4EVerificationRequest
     * @return CheckBankCard4EVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckBankCard4EVerificationResponse CheckBankCard4EVerification(CheckBankCard4EVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBankCard4EVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBankCard4EVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBankCard4EVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证银行卡二/三/四要素
银行卡二要素(同CheckBankCard2EVerification): bank_card + name
银行卡三要素(同CheckBankCard3EVerification): bank_card + name + id_card_number
银行卡四要素(同CheckBankCard4EVerification): bank_card + name + id_card_number + mobile
     * @param req CheckBankCardVerificationRequest
     * @return CheckBankCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckBankCardVerificationResponse CheckBankCardVerification(CheckBankCardVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckBankCardVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckBankCardVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckBankCardVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台检测慧眼或腾讯电子签小程序人脸核身结果
     * @param req CheckFaceIdentifyRequest
     * @return CheckFaceIdentifyResponse
     * @throws TencentCloudSDKException
     */
    public CheckFaceIdentifyResponse CheckFaceIdentify(CheckFaceIdentifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckFaceIdentifyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckFaceIdentifyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckFaceIdentify");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证姓名和身份证信息
     * @param req CheckIdCardVerificationRequest
     * @return CheckIdCardVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckIdCardVerificationResponse CheckIdCardVerification(CheckIdCardVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckIdCardVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckIdCardVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckIdCardVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证手机号二要素
     * @param req CheckMobileAndNameRequest
     * @return CheckMobileAndNameResponse
     * @throws TencentCloudSDKException
     */
    public CheckMobileAndNameResponse CheckMobileAndName(CheckMobileAndNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckMobileAndNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckMobileAndNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckMobileAndName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台验证手机号三要素
     * @param req CheckMobileVerificationRequest
     * @return CheckMobileVerificationResponse
     * @throws TencentCloudSDKException
     */
    public CheckMobileVerificationResponse CheckMobileVerification(CheckMobileVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckMobileVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckMobileVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckMobileVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于确认验证码是否正确
     * @param req CheckVerifyCodeMatchFlowIdRequest
     * @return CheckVerifyCodeMatchFlowIdResponse
     * @throws TencentCloudSDKException
     */
    public CheckVerifyCodeMatchFlowIdResponse CheckVerifyCodeMatchFlowId(CheckVerifyCodeMatchFlowIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckVerifyCodeMatchFlowIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckVerifyCodeMatchFlowIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckVerifyCodeMatchFlowId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台获取慧眼慧眼API签名
     * @param req CreateFaceIdSignRequest
     * @return CreateFaceIdSignResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceIdSignResponse CreateFaceIdSign(CreateFaceIdSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFaceIdSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFaceIdSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFaceIdSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateFlowByFiles）用于通过PDF文件创建签署流程。

注意：调用此接口前，请先调用多文件上传接口 (UploadFiles)，提前上传合同文件。
     * @param req CreateFlowByFilesRequest
     * @return CreateFlowByFilesResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowByFilesResponse CreateFlowByFiles(CreateFlowByFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowByFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFlowByFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFlowByFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台获取慧眼H5人脸核身Url
     * @param req CreateH5FaceIdUrlRequest
     * @return CreateH5FaceIdUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateH5FaceIdUrlResponse CreateH5FaceIdUrl(CreateH5FaceIdUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateH5FaceIdUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateH5FaceIdUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateH5FaceIdUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreatePreviewSignUrl）用于生成生成预览签署URL。

注：调用此接口前，请确保您已提前调用了发送流程接口（SendFlow）指定相关签署方。
     * @param req CreatePreviewSignUrlRequest
     * @return CreatePreviewSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePreviewSignUrlResponse CreatePreviewSignUrl(CreatePreviewSignUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePreviewSignUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePreviewSignUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePreviewSignUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateSeal）用于创建个人/企业印章。

注意：使用FileId参数指定印章，需先调用多文件上传 (UploadFiles) 上传印章图片。
     * @param req CreateSealRequest
     * @return CreateSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealResponse CreateSeal(CreateSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateServerFlowSign）用于静默签署文件。

注：
1、此接口为白名单接口，调用前请提前与客服经理或邮件至e-contract@tencent.com进行联系。
2、仅合同发起者可使用流程静默签署能力。
     * @param req CreateServerFlowSignRequest
     * @return CreateServerFlowSignResponse
     * @throws TencentCloudSDKException
     */
    public CreateServerFlowSignResponse CreateServerFlowSign(CreateServerFlowSignRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServerFlowSignResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServerFlowSignResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateServerFlowSign");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateSignUrl）用于生成指定用户的签署URL。

注：调用此接口前，请确保您已提前调用了发送流程接口（SendFlow）指定相关签署方。
     * @param req CreateSignUrlRequest
     * @return CreateSignUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreateSignUrlResponse CreateSignUrl(CreateSignUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSignUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSignUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSignUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateSubOrganization）用于在腾讯电子签内注册子机构。
     * @param req CreateSubOrganizationRequest
     * @return CreateSubOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubOrganizationResponse CreateSubOrganization(CreateSubOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateSubOrganizationAndSeal）用于注册子机构，同时系统将为该子企业自动生成一个默认电子印章图片。

注意：
1. 在后续的签署流程中，若未指定签署使用的印章ID，则默认调用自动生成的印章图片进行签署。
2. 此接口为白名单接口，如您需要使用此能力，请提前与客户经理沟通或邮件至e-contract@tencent.com与我们联系。
     * @param req CreateSubOrganizationAndSealRequest
     * @return CreateSubOrganizationAndSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubOrganizationAndSealResponse CreateSubOrganizationAndSeal(CreateSubOrganizationAndSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubOrganizationAndSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSubOrganizationAndSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSubOrganizationAndSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（CreateUser）用于注册腾讯电子签个人用户。
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方应用可通过此接口（CreateUserAndSeal）注册腾讯电子签实名个人用户，同时系统将为该用户自动生成一个默认电子签名图片。

注意：
1. 在后续的签署流程中，若未指定签署使用的印章ID，则默认调用自动生成的签名图片进行签署。
2. 此接口为白名单接口，如您需要使用此能力，请提前与客户经理沟通或邮件至e-contract@tencent.com与我们联系。
     * @param req CreateUserAndSealRequest
     * @return CreateUserAndSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserAndSealResponse CreateUserAndSeal(CreateUserAndSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserAndSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserAndSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserAndSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口 (DeleteSeal) 用于删除指定ID的印章。

注意：默认印章不支持删除
     * @param req DeleteSealRequest
     * @return DeleteSealResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSealResponse DeleteSeal(DeleteSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方应用可通过此接口（DescribeCatalogApprovers）查询指定目录的参与者列表
     * @param req DescribeCatalogApproversRequest
     * @return DescribeCatalogApproversResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCatalogApproversResponse DescribeCatalogApprovers(DescribeCatalogApproversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCatalogApproversResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCatalogApproversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCatalogApprovers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方应用可通过此接口（DescribeCatalogSignComponents）拉取目录签署区
     * @param req DescribeCatalogSignComponentsRequest
     * @return DescribeCatalogSignComponentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCatalogSignComponentsResponse DescribeCatalogSignComponents(DescribeCatalogSignComponentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCatalogSignComponentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCatalogSignComponentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCatalogSignComponents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeCustomFlowIds）用于通过自定义流程id来查询对应的电子签流程id
     * @param req DescribeCustomFlowIdsRequest
     * @return DescribeCustomFlowIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomFlowIdsResponse DescribeCustomFlowIds(DescribeCustomFlowIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomFlowIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomFlowIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomFlowIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeCustomFlowIdsByFlowId）用于根据流程id反查自定义流程id
     * @param req DescribeCustomFlowIdsByFlowIdRequest
     * @return DescribeCustomFlowIdsByFlowIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomFlowIdsByFlowIdResponse DescribeCustomFlowIdsByFlowId(DescribeCustomFlowIdsByFlowIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomFlowIdsByFlowIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomFlowIdsByFlowIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomFlowIdsByFlowId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台获取慧眼人脸核身照片
     * @param req DescribeFaceIdPhotosRequest
     * @return DescribeFaceIdPhotosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFaceIdPhotosResponse DescribeFaceIdPhotos(DescribeFaceIdPhotosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFaceIdPhotosResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFaceIdPhotosResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFaceIdPhotos");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口为第三方平台向电子签平台获取慧眼人脸核身结果
     * @param req DescribeFaceIdResultsRequest
     * @return DescribeFaceIdResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFaceIdResultsResponse DescribeFaceIdResults(DescribeFaceIdResultsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFaceIdResultsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFaceIdResultsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFaceIdResults");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据用户自定义id查询文件id
     * @param req DescribeFileIdsByCustomIdsRequest
     * @return DescribeFileIdsByCustomIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileIdsByCustomIdsResponse DescribeFileIdsByCustomIds(DescribeFileIdsByCustomIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileIdsByCustomIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileIdsByCustomIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileIdsByCustomIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeFileUrls）用于获取签署文件下载的URL。
     * @param req DescribeFileUrlsRequest
     * @return DescribeFileUrlsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileUrlsResponse DescribeFileUrls(DescribeFileUrlsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileUrlsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileUrlsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileUrls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口（DescribeFlow）可查询签署流程的详细信息。
     * @param req DescribeFlowRequest
     * @return DescribeFlowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowResponse DescribeFlow(DescribeFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方应用可通过此接口（DescribeFlowApprovers）查询流程参与者信息。
     * @param req DescribeFlowApproversRequest
     * @return DescribeFlowApproversResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowApproversResponse DescribeFlowApprovers(DescribeFlowApproversRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowApproversResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowApproversResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowApprovers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询流程文件
     * @param req DescribeFlowFilesRequest
     * @return DescribeFlowFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowFilesResponse DescribeFlowFiles(DescribeFlowFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeSeals）用于查询指定ID的印章信息。
     * @param req DescribeSealsRequest
     * @return DescribeSealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSealsResponse DescribeSeals(DescribeSealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSealsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSealsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSeals");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeSubOrganizations）用于查询子机构信息。

注：此接口仅可查询您所属机构应用号创建的子机构信息，不可跨应用/跨机构查询。
     * @param req DescribeSubOrganizationsRequest
     * @return DescribeSubOrganizationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubOrganizationsResponse DescribeSubOrganizations(DescribeSubOrganizationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubOrganizationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubOrganizationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubOrganizations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（DescribeUsers）用于查询应用号下的个人用户信息。

注：此接口仅可查询您所属机构应用号创建的个人用户信息，不可跨应用/跨机构查询。
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过此接口（DestroyFlowFile）可删除指定流程中的合同文件。

注：调用此接口前，请确保此流程已属于归档状态。您可通过查询流程信息接口（DescribeFlow）进行查询。
     * @param req DestroyFlowFileRequest
     * @return DestroyFlowFileResponse
     * @throws TencentCloudSDKException
     */
    public DestroyFlowFileResponse DestroyFlowFile(DestroyFlowFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyFlowFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyFlowFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyFlowFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成企业电子印章
     * @param req GenerateOrganizationSealRequest
     * @return GenerateOrganizationSealResponse
     * @throws TencentCloudSDKException
     */
    public GenerateOrganizationSealResponse GenerateOrganizationSeal(GenerateOrganizationSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateOrganizationSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateOrganizationSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateOrganizationSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（GenerateUserSeal）用于生成个人签名图片。

注意：
1. 个人签名由用户注册时预留的姓名信息生成，不支持自定义签名内容。
2. 个人用户仅支持拥有一个系统生成的电子签名。
     * @param req GenerateUserSealRequest
     * @return GenerateUserSealResponse
     * @throws TencentCloudSDKException
     */
    public GenerateUserSealResponse GenerateUserSeal(GenerateUserSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateUserSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateUserSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateUserSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口 (ModifyOrganizationDefaultSeal) 用于重新指定企业默认印章。
     * @param req ModifyOrganizationDefaultSealRequest
     * @return ModifyOrganizationDefaultSealResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrganizationDefaultSealResponse ModifyOrganizationDefaultSeal(ModifyOrganizationDefaultSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyOrganizationDefaultSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyOrganizationDefaultSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyOrganizationDefaultSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ModifySeal）用于修改指定印章ID的印章图片和名称。

注：印章类型暂不支持修改，如需调整，请联系客服经理或通过创建印章接口（CreateSeal）进行创建新印章。
     * @param req ModifySealRequest
     * @return ModifySealResponse
     * @throws TencentCloudSDKException
     */
    public ModifySealResponse ModifySeal(ModifySealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ModifySubOrganizationInfo）用于更新子机构信息。

注：若修改子机构名称或更新机构证件照片，需要重新通过子机构实名接口（VerifySubOrganization）进行重新实名。
     * @param req ModifySubOrganizationInfoRequest
     * @return ModifySubOrganizationInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubOrganizationInfoResponse ModifySubOrganizationInfo(ModifySubOrganizationInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubOrganizationInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubOrganizationInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubOrganizationInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ModifyUser）用于更新个人用户信息。

注：若修改用户姓名，需要重新通过个人用户实名接口（VerifyUser）进行重新实名。
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口 (ModifyUserDefaultSeal) 用于重新指定个人默认印章。
     * @param req ModifyUserDefaultSealRequest
     * @return ModifyUserDefaultSealResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserDefaultSealResponse ModifyUserDefaultSeal(ModifyUserDefaultSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserDefaultSealResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserDefaultSealResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserDefaultSeal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（RejectFlow）用于用户拒绝签署合同流程。
     * @param req RejectFlowRequest
     * @return RejectFlowResponse
     * @throws TencentCloudSDKException
     */
    public RejectFlowResponse RejectFlow(RejectFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RejectFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RejectFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（SendFlow）用于指定签署者及签署内容，后续可通过生成签署接口（CreateSignUrl）获取签署url。
     * @param req SendFlowRequest
     * @return SendFlowResponse
     * @throws TencentCloudSDKException
     */
    public SendFlowResponse SendFlow(SendFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送流程并获取签署URL
     * @param req SendFlowUrlRequest
     * @return SendFlowUrlResponse
     * @throws TencentCloudSDKException
     */
    public SendFlowUrlResponse SendFlowUrl(SendFlowUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendFlowUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendFlowUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendFlowUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于发送签署验证码
     * @param req SendSignInnerVerifyCodeRequest
     * @return SendSignInnerVerifyCodeResponse
     * @throws TencentCloudSDKException
     */
    public SendSignInnerVerifyCodeResponse SendSignInnerVerifyCode(SendSignInnerVerifyCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendSignInnerVerifyCodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendSignInnerVerifyCodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendSignInnerVerifyCode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（SignFlow）可用于对流程文件进行签署。
     * @param req SignFlowRequest
     * @return SignFlowResponse
     * @throws TencentCloudSDKException
     */
    public SignFlowResponse SignFlow(SignFlowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SignFlowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SignFlowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SignFlow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（UploadFiles）用于文件上传。
     * @param req UploadFilesRequest
     * @return UploadFilesResponse
     * @throws TencentCloudSDKException
     */
    public UploadFilesResponse UploadFiles(UploadFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFilesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFilesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFiles");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（VerifySubOrganization）用于通过子机构的实名认证。

注：此接口为白名单接口，如您需要使用此能力，请提前与客户经理沟通或邮件至e-contract@tencent.com与我们联系。
     * @param req VerifySubOrganizationRequest
     * @return VerifySubOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public VerifySubOrganizationResponse VerifySubOrganization(VerifySubOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifySubOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifySubOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifySubOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *第三方应用可通过此接口（VerifyUser）将腾讯电子签个人用户的实名认证状态设为通过。

注：此接口为白名单接口，如您需要使用此能力，请提前与客户经理沟通或邮件至e-contract@tencent.com与我们联系。
     * @param req VerifyUserRequest
     * @return VerifyUserResponse
     * @throws TencentCloudSDKException
     */
    public VerifyUserResponse VerifyUser(VerifyUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
