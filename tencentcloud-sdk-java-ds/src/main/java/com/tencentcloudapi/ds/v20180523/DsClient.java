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
package com.tencentcloudapi.ds.v20180523;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ds.v20180523.models.*;

public class DsClient extends AbstractClient{
    private static String endpoint = "ds.tencentcloudapi.com";
    private static String version = "2018-05-23";

    public DsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DsClient(Credential credential, String region, ClientProfile profile) {
        super(DsClient.endpoint, DsClient.version, credential, region, profile);
    }

    /**
     *检测验证码接口。此接口用于企业电子合同平台通过给用户发送短信验证码，以短信授权方式签署合同。此接口配合发送验证码接口使用。

用户在企业电子合同平台输入收到的验证码后，由企业电子合同平台调用该接口向腾讯云提交确认受托签署合同验证码命令。验证码验证正确时，本次合同签署的授权成功。
     * @param req CheckVcodeRequest
     * @return CheckVcodeResponse
     * @throws TencentCloudSDKException
     */
    public CheckVcodeResponse CheckVcode(CheckVcodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckVcodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CheckVcodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckVcode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口适用于：客户平台通过上传PDF文件作为合同，以备未来进行签署。接口返回任务号，可调用DescribeTaskStatus接口查看任务执行结果。
     * @param req CreateContractByUploadRequest
     * @return CreateContractByUploadResponse
     * @throws TencentCloudSDKException
     */
    public CreateContractByUploadResponse CreateContractByUpload(CreateContractByUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateContractByUploadResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateContractByUploadResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateContractByUpload"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为企业电子合同平台的最终企业用户进行开户。在企业电子合同平台进行操作的企业用户，企业电子合同平台向腾讯云发送企业用户的信息，提交开户命令。腾讯云接到请求后，自动为企业电子合同平台的企业用户生成一张数字证书。
     * @param req CreateEnterpriseAccountRequest
     * @return CreateEnterpriseAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnterpriseAccountResponse CreateEnterpriseAccount(CreateEnterpriseAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEnterpriseAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEnterpriseAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateEnterpriseAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为企业电子合同平台的最终个人用户进行开户。在企业电子合同平台进行操作的个人用户，企业电子合同平台向腾讯云发送个人用户的信息，提交开户命令。腾讯云接到请求后，自动为企业电子合同平台的个人用户生成一张数字证书。
     * @param req CreatePersonalAccountRequest
     * @return CreatePersonalAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonalAccountResponse CreatePersonalAccount(CreatePersonalAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonalAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonalAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePersonalAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口用于客户电子合同平台增加某用户的印章图片。客户平台可以调用此接口增加某用户的印章图片。
     * @param req CreateSealRequest
     * @return CreateSealResponse
     * @throws TencentCloudSDKException
     */
    public CreateSealResponse CreateSeal(CreateSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSealResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSealResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateSeal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除企业电子合同平台的最终用户。调用该接口后，腾讯云将删除该用户账号。删除账号后，已经签名的合同不受影响。
     * @param req DeleteAccountRequest
     * @return DeleteAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountResponse DeleteAccount(DeleteAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteAccount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除印章接口，删除指定账号的某个印章
     * @param req DeleteSealRequest
     * @return DeleteSealResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSealResponse DeleteSeal(DeleteSealRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSealResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSealResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteSeal"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口使用于：客户平台可使用该接口查询任务执行状态或者执行结果
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
     *下载合同接口。调用该接口可以下载签署中和签署完成的合同。接口返回任务号，可调用DescribeTaskStatus接口查看任务执行结果。
     * @param req DownloadContractRequest
     * @return DownloadContractResponse
     * @throws TencentCloudSDKException
     */
    public DownloadContractResponse DownloadContract(DownloadContractRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadContractResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadContractResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadContract"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送验证码接口。此接口用于：企业电子合同平台需要腾讯云发送验证码对其用户进行验证时调用，腾讯云将向其用户联系手机(企业电子合同平台为用户开户时通过接口传入)发送验证码，以验证码授权方式签署合同。用户验证工作由企业电子合同平台自身完成。
     * @param req SendVcodeRequest
     * @return SendVcodeResponse
     * @throws TencentCloudSDKException
     */
    public SendVcodeResponse SendVcode(SendVcodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendVcodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SendVcodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SendVcode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口适用于：客户平台在创建好合同后，由合同签署方对创建的合同内容进行确认，无误后再进行签署。客户平台使用该接口提供详细的PDF文档签名坐标进行签署。
     * @param req SignContractByCoordinateRequest
     * @return SignContractByCoordinateResponse
     * @throws TencentCloudSDKException
     */
    public SignContractByCoordinateResponse SignContractByCoordinate(SignContractByCoordinateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SignContractByCoordinateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SignContractByCoordinateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SignContractByCoordinate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口适用于：客户平台在创建好合同后，由合同签署方对创建的合同内容进行确认，无误后再进行签署。客户平台使用该接口对PDF合同文档按照关键字和坐标进行签署。
     * @param req SignContractByKeywordRequest
     * @return SignContractByKeywordResponse
     * @throws TencentCloudSDKException
     */
    public SignContractByKeywordResponse SignContractByKeyword(SignContractByKeywordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SignContractByKeywordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SignContractByKeywordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SignContractByKeyword"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
