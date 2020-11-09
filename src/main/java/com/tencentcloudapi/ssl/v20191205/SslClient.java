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
package com.tencentcloudapi.ssl.v20191205;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ssl.v20191205.models.*;

public class SslClient extends AbstractClient{
    private static String endpoint = "ssl.tencentcloudapi.com";
    private static String service = "ssl";
    private static String version = "2019-12-05";

    public SslClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SslClient(Credential credential, String region, ClientProfile profile) {
        super(SslClient.endpoint, SslClient.version, credential, region, profile);
    }

    /**
     *本接口（ApplyCertificate）用于免费证书申请。
     * @param req ApplyCertificateRequest
     * @return ApplyCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ApplyCertificateResponse ApplyCertificate(ApplyCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消证书订单。
     * @param req CancelCertificateOrderRequest
     * @return CancelCertificateOrderResponse
     * @throws TencentCloudSDKException
     */
    public CancelCertificateOrderResponse CancelCertificateOrder(CancelCertificateOrderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelCertificateOrderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelCertificateOrderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelCertificateOrder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CheckCertificateChain）用于检查证书链是否完整。
     * @param req CheckCertificateChainRequest
     * @return CheckCertificateChainResponse
     * @throws TencentCloudSDKException
     */
    public CheckCertificateChainResponse CheckCertificateChain(CheckCertificateChainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckCertificateChainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckCertificateChainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckCertificateChain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交证书订单。
     * @param req CommitCertificateInformationRequest
     * @return CommitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public CommitCertificateInformationResponse CommitCertificateInformation(CommitCertificateInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommitCertificateInformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CommitCertificateInformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommitCertificateInformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CompleteCertificate）用于主动触发证书验证。
     * @param req CompleteCertificateRequest
     * @return CompleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CompleteCertificateResponse CompleteCertificate(CompleteCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CompleteCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CompleteCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateCertificate）用于创建付费证书。
     * @param req CreateCertificateRequest
     * @return CreateCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateResponse CreateCertificate(CreateCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DeleteCertificate）用于删除证书。
     * @param req DeleteCertificateRequest
     * @return DeleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertificateResponse DeleteCertificate(DeleteCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCertificate）用于获取证书信息。
     * @param req DescribeCertificateRequest
     * @return DescribeCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateResponse DescribeCertificate(DescribeCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取证书详情。
     * @param req DescribeCertificateDetailRequest
     * @return DescribeCertificateDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateDetailResponse DescribeCertificateDetail(DescribeCertificateDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificateDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificateDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户账号下有关证书的操作日志。
     * @param req DescribeCertificateOperateLogsRequest
     * @return DescribeCertificateOperateLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateOperateLogsResponse DescribeCertificateOperateLogs(DescribeCertificateOperateLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificateOperateLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateOperateLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificateOperateLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeCertificates）用于获取证书列表。
     * @param req DescribeCertificatesRequest
     * @return DescribeCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificatesResponse DescribeCertificates(DescribeCertificatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DownloadCertificate）用于下载证书。
     * @param req DownloadCertificateRequest
     * @return DownloadCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCertificateResponse DownloadCertificate(DownloadCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户传入证书id和备注来修改证书备注。
     * @param req ModifyCertificateAliasRequest
     * @return ModifyCertificateAliasResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateAliasResponse ModifyCertificateAlias(ModifyCertificateAliasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateAliasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateAliasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificateAlias");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改证书所属项目。
     * @param req ModifyCertificateProjectRequest
     * @return ModifyCertificateProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificateProjectResponse ModifyCertificateProject(ModifyCertificateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificateProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ReplaceCertificate）用于重颁发证书。已申请的免费证书仅支持 RSA 算法、密钥对参数为2048的证书重颁发，并且目前仅支持1次重颁发。
     * @param req ReplaceCertificateRequest
     * @return ReplaceCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceCertificateResponse ReplaceCertificate(ReplaceCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（RevokeCertificate）用于吊销证书。
     * @param req RevokeCertificateRequest
     * @return RevokeCertificateResponse
     * @throws TencentCloudSDKException
     */
    public RevokeCertificateResponse RevokeCertificate(RevokeCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RevokeCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RevokeCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RevokeCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交证书资料。
     * @param req SubmitCertificateInformationRequest
     * @return SubmitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCertificateInformationResponse SubmitCertificateInformation(SubmitCertificateInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCertificateInformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCertificateInformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitCertificateInformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadCertificate）用于上传证书。
     * @param req UploadCertificateRequest
     * @return UploadCertificateResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertificateResponse UploadCertificate(UploadCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadConfirmLetter）用于上传证书确认函。
     * @param req UploadConfirmLetterRequest
     * @return UploadConfirmLetterResponse
     * @throws TencentCloudSDKException
     */
    public UploadConfirmLetterResponse UploadConfirmLetter(UploadConfirmLetterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadConfirmLetterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadConfirmLetterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadConfirmLetter");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadRevokeLetter）用于上传证书吊销确认函。
     * @param req UploadRevokeLetterRequest
     * @return UploadRevokeLetterResponse
     * @throws TencentCloudSDKException
     */
    public UploadRevokeLetterResponse UploadRevokeLetter(UploadRevokeLetterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadRevokeLetterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadRevokeLetterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadRevokeLetter");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
