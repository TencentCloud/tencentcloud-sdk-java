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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *本接口（CompleteCertificate）用于主动触发证书验证。仅非DNSPod和Wotrus品牌证书支持使用此接口。
     * @param req CompleteCertificateRequest
     * @return CompleteCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CompleteCertificateResponse CompleteCertificate(CompleteCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompleteCertificateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *使用权益点创建证书
     * @param req CreateCertificateByPackageRequest
     * @return CreateCertificateByPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCertificateByPackageResponse CreateCertificateByPackage(CreateCertificateByPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCertificateByPackageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCertificateByPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCertificateByPackage");
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
        req.setSkipSign(false);
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
     *删除管理人
     * @param req DeleteManagerRequest
     * @return DeleteManagerResponse
     * @throws TencentCloudSDKException
     */
    public DeleteManagerResponse DeleteManager(DeleteManagerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteManagerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteManagerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteManager");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *证书部署到云资源实例列表
     * @param req DeployCertificateInstanceRequest
     * @return DeployCertificateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeployCertificateInstanceResponse DeployCertificateInstance(DeployCertificateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployCertificateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeployCertificateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployCertificateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云资源部署重试部署记录
     * @param req DeployCertificateRecordRetryRequest
     * @return DeployCertificateRecordRetryResponse
     * @throws TencentCloudSDKException
     */
    public DeployCertificateRecordRetryResponse DeployCertificateRecordRetry(DeployCertificateRecordRetryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployCertificateRecordRetryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeployCertificateRecordRetryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployCertificateRecordRetry");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云资源部署一键回滚
     * @param req DeployCertificateRecordRollbackRequest
     * @return DeployCertificateRecordRollbackResponse
     * @throws TencentCloudSDKException
     */
    public DeployCertificateRecordRollbackResponse DeployCertificateRecordRollback(DeployCertificateRecordRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeployCertificateRecordRollbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeployCertificateRecordRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeployCertificateRecordRollback");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *查询公司列表
     * @param req DescribeCompaniesRequest
     * @return DescribeCompaniesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCompaniesResponse DescribeCompanies(DescribeCompaniesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCompaniesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCompaniesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCompanies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *证书查询关联资源
     * @param req DescribeDeployedResourcesRequest
     * @return DescribeDeployedResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeployedResourcesResponse DescribeDeployedResources(DescribeDeployedResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeployedResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeployedResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeployedResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书apiGateway云资源部署实例列表
     * @param req DescribeHostApiGatewayInstanceListRequest
     * @return DescribeHostApiGatewayInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostApiGatewayInstanceListResponse DescribeHostApiGatewayInstanceList(DescribeHostApiGatewayInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostApiGatewayInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostApiGatewayInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostApiGatewayInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书cdn云资源部署实例列表
     * @param req DescribeHostCdnInstanceListRequest
     * @return DescribeHostCdnInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostCdnInstanceListResponse DescribeHostCdnInstanceList(DescribeHostCdnInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostCdnInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostCdnInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostCdnInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书clb云资源部署实例列表
     * @param req DescribeHostClbInstanceListRequest
     * @return DescribeHostClbInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostClbInstanceListResponse DescribeHostClbInstanceList(DescribeHostClbInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostClbInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostClbInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostClbInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书cos云资源部署实例列表
     * @param req DescribeHostCosInstanceListRequest
     * @return DescribeHostCosInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostCosInstanceListResponse DescribeHostCosInstanceList(DescribeHostCosInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostCosInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostCosInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostCosInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书ddos云资源部署实例列表
     * @param req DescribeHostDdosInstanceListRequest
     * @return DescribeHostDdosInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostDdosInstanceListResponse DescribeHostDdosInstanceList(DescribeHostDdosInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostDdosInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostDdosInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostDdosInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书云资源部署记录列表
     * @param req DescribeHostDeployRecordRequest
     * @return DescribeHostDeployRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostDeployRecordResponse DescribeHostDeployRecord(DescribeHostDeployRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostDeployRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostDeployRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostDeployRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书云资源部署记录详情列表
     * @param req DescribeHostDeployRecordDetailRequest
     * @return DescribeHostDeployRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostDeployRecordDetailResponse DescribeHostDeployRecordDetail(DescribeHostDeployRecordDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostDeployRecordDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostDeployRecordDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostDeployRecordDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书Lighthouse云资源部署实例列表
     * @param req DescribeHostLighthouseInstanceListRequest
     * @return DescribeHostLighthouseInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLighthouseInstanceListResponse DescribeHostLighthouseInstanceList(DescribeHostLighthouseInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostLighthouseInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostLighthouseInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostLighthouseInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书live云资源部署实例列表
     * @param req DescribeHostLiveInstanceListRequest
     * @return DescribeHostLiveInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLiveInstanceListResponse DescribeHostLiveInstanceList(DescribeHostLiveInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostLiveInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostLiveInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostLiveInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书EdgeOne云资源部署实例列表
     * @param req DescribeHostTeoInstanceListRequest
     * @return DescribeHostTeoInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostTeoInstanceListResponse DescribeHostTeoInstanceList(DescribeHostTeoInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostTeoInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostTeoInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostTeoInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书tke云资源部署实例列表
     * @param req DescribeHostTkeInstanceListRequest
     * @return DescribeHostTkeInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostTkeInstanceListResponse DescribeHostTkeInstanceList(DescribeHostTkeInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostTkeInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostTkeInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostTkeInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书云资源更新记录列表
     * @param req DescribeHostUpdateRecordRequest
     * @return DescribeHostUpdateRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostUpdateRecordResponse DescribeHostUpdateRecord(DescribeHostUpdateRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostUpdateRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostUpdateRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostUpdateRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书云资源更新记录详情列表
     * @param req DescribeHostUpdateRecordDetailRequest
     * @return DescribeHostUpdateRecordDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostUpdateRecordDetailResponse DescribeHostUpdateRecordDetail(DescribeHostUpdateRecordDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostUpdateRecordDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostUpdateRecordDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostUpdateRecordDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书Vod云资源部署实例列表
     * @param req DescribeHostVodInstanceListRequest
     * @return DescribeHostVodInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostVodInstanceListResponse DescribeHostVodInstanceList(DescribeHostVodInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostVodInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostVodInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostVodInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询证书waf云资源部署实例列表
     * @param req DescribeHostWafInstanceListRequest
     * @return DescribeHostWafInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostWafInstanceListResponse DescribeHostWafInstanceList(DescribeHostWafInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostWafInstanceListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostWafInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostWafInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询管理人详情
     * @param req DescribeManagerDetailRequest
     * @return DescribeManagerDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeManagerDetailResponse DescribeManagerDetail(DescribeManagerDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeManagerDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeManagerDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeManagerDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询管理人列表
     * @param req DescribeManagersRequest
     * @return DescribeManagersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeManagersResponse DescribeManagers(DescribeManagersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeManagersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeManagersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeManagers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获得权益包列表
     * @param req DescribePackagesRequest
     * @return DescribePackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackagesResponse DescribePackages(DescribePackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePackages");
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
        req.setSkipSign(false);
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
     *云资源托管
     * @param req HostCertificateRequest
     * @return HostCertificateResponse
     * @throws TencentCloudSDKException
     */
    public HostCertificateResponse HostCertificate(HostCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HostCertificateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<HostCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "HostCertificate");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *修改忽略证书到期通知。打开或关闭证书到期通知。
     * @param req ModifyCertificatesExpiringNotificationSwitchRequest
     * @return ModifyCertificatesExpiringNotificationSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCertificatesExpiringNotificationSwitchResponse ModifyCertificatesExpiringNotificationSwitch(ModifyCertificatesExpiringNotificationSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCertificatesExpiringNotificationSwitchResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCertificatesExpiringNotificationSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCertificatesExpiringNotificationSwitch");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
     *重新提交审核管理人
     * @param req SubmitAuditManagerRequest
     * @return SubmitAuditManagerResponse
     * @throws TencentCloudSDKException
     */
    public SubmitAuditManagerResponse SubmitAuditManager(SubmitAuditManagerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitAuditManagerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitAuditManagerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitAuditManager");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交证书资料。输入参数信息可以分多次提交，但提交的证书资料应最低限度保持完整。
     * @param req SubmitCertificateInformationRequest
     * @return SubmitCertificateInformationResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCertificateInformationResponse SubmitCertificateInformation(SubmitCertificateInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCertificateInformationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *一键更新旧证书资源，本接口为异步接口， 调用之后DeployRecordId为0表示任务进行中， 当返回DeployRecordId大于0则表示任务创建成功。 未创建成功则会抛出异常
     * @param req UpdateCertificateInstanceRequest
     * @return UpdateCertificateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCertificateInstanceResponse UpdateCertificateInstance(UpdateCertificateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCertificateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCertificateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCertificateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云资源更新重试部署记录
     * @param req UpdateCertificateRecordRetryRequest
     * @return UpdateCertificateRecordRetryResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCertificateRecordRetryResponse UpdateCertificateRecordRetry(UpdateCertificateRecordRetryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCertificateRecordRetryResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCertificateRecordRetryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCertificateRecordRetry");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云资源更新一键回滚
     * @param req UpdateCertificateRecordRollbackRequest
     * @return UpdateCertificateRecordRollbackResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCertificateRecordRollbackResponse UpdateCertificateRecordRollback(UpdateCertificateRecordRollbackRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCertificateRecordRollbackResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCertificateRecordRollbackResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCertificateRecordRollback");
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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
        req.setSkipSign(false);
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

    /**
     *重新核验管理人
     * @param req VerifyManagerRequest
     * @return VerifyManagerResponse
     * @throws TencentCloudSDKException
     */
    public VerifyManagerResponse VerifyManager(VerifyManagerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyManagerResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyManagerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifyManager");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
