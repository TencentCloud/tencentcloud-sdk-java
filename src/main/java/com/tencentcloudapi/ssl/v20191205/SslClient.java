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
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ApplyCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CancelCertificateOrderResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CancelCertificateOrder"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CommitCertificateInformationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CommitCertificateInformation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificateDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateOperateLogsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificateOperateLogs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificatesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertificates"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DownloadCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateAliasResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCertificateAlias"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificateProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCertificateProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReplaceCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCertificateInformationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SubmitCertificateInformation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<UploadCertificateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadCertificate"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
