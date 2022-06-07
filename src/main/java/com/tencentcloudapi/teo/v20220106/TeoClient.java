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
package com.tencentcloudapi.teo.v20220106;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220106.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-01-06";

    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *校验证书
     * @param req CheckCertificateRequest
     * @return CheckCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CheckCertificateResponse CheckCertificate(CheckCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建应用代理
     * @param req CreateApplicationProxyRequest
     * @return CreateApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyResponse CreateApplicationProxy(CreateApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建应用代理规则
     * @param req CreateApplicationProxyRuleRequest
     * @return CreateApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRuleResponse CreateApplicationProxyRule(CreateApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationProxyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationProxyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量创建应用代理规则
     * @param req CreateApplicationProxyRulesRequest
     * @return CreateApplicationProxyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationProxyRulesResponse CreateApplicationProxyRules(CreateApplicationProxyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationProxyRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationProxyRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationProxyRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义规则的自定义页
     * @param req CreateCustomErrorPageRequest
     * @return CreateCustomErrorPageResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomErrorPageResponse CreateCustomErrorPage(CreateCustomErrorPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomErrorPageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomErrorPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomErrorPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 DNS 记录
     * @param req CreateDnsRecordRequest
     * @return CreateDnsRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateDnsRecordResponse CreateDnsRecord(CreateDnsRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDnsRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDnsRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDnsRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建负载均衡
     * @param req CreateLoadBalancingRequest
     * @return CreateLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoadBalancingResponse CreateLoadBalancing(CreateLoadBalancingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLoadBalancingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoadBalancingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLoadBalancing");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *源站组创建
     * @param req CreateOriginGroupRequest
     * @return CreateOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateOriginGroupResponse CreateOriginGroup(CreateOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建预热任务
     * @param req CreatePrefetchTaskRequest
     * @return CreatePrefetchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrefetchTaskResponse CreatePrefetchTask(CreatePrefetchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrefetchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrefetchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrefetchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建清除缓存任务
     * @param req CreatePurgeTaskRequest
     * @return CreatePurgeTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreatePurgeTaskResponse CreatePurgeTask(CreatePurgeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePurgeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePurgeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePurgeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于用户接入新的站点
     * @param req CreateZoneRequest
     * @return CreateZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreateZoneResponse CreateZone(CreateZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用代理
     * @param req DeleteApplicationProxyRequest
     * @return DeleteApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyResponse DeleteApplicationProxy(DeleteApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用代理规则
     * @param req DeleteApplicationProxyRuleRequest
     * @return DeleteApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationProxyRuleResponse DeleteApplicationProxyRule(DeleteApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationProxyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplicationProxyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除 DNS 记录
     * @param req DeleteDnsRecordsRequest
     * @return DeleteDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDnsRecordsResponse DeleteDnsRecords(DeleteDnsRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDnsRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDnsRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDnsRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除负载均衡
     * @param req DeleteLoadBalancingRequest
     * @return DeleteLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoadBalancingResponse DeleteLoadBalancing(DeleteLoadBalancingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoadBalancingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoadBalancingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLoadBalancing");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *源站组删除
     * @param req DeleteOriginGroupRequest
     * @return DeleteOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOriginGroupResponse DeleteOriginGroup(DeleteOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除站点
     * @param req DeleteZoneRequest
     * @return DeleteZoneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteZoneResponse DeleteZone(DeleteZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用代理列表
     * @param req DescribeApplicationProxyRequest
     * @return DescribeApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxyResponse DescribeApplicationProxy(DescribeApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用代理详细信息
     * @param req DescribeApplicationProxyDetailRequest
     * @return DescribeApplicationProxyDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxyDetailResponse DescribeApplicationProxyDetail(DescribeApplicationProxyDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationProxyDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationProxyDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationProxyDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询Bot托管规则
     * @param req DescribeBotManagedRulesRequest
     * @return DescribeBotManagedRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotManagedRulesResponse DescribeBotManagedRules(DescribeBotManagedRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotManagedRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotManagedRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotManagedRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询域名 CNAME 状态
     * @param req DescribeCnameStatusRequest
     * @return DescribeCnameStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCnameStatusResponse DescribeCnameStatus(DescribeCnameStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCnameStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCnameStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCnameStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询DDoS防护配置详情
     * @param req DescribeDDoSPolicyRequest
     * @return DescribeDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSPolicyResponse DescribeDDoSPolicy(DescribeDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询默认证书列表
     * @param req DescribeDefaultCertificatesRequest
     * @return DescribeDefaultCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultCertificatesResponse DescribeDefaultCertificates(DescribeDefaultCertificatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDefaultCertificatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDefaultCertificatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDefaultCertificates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DNS请求数统计曲线
     * @param req DescribeDnsDataRequest
     * @return DescribeDnsDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsDataResponse DescribeDnsData(DescribeDnsDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDnsDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDnsDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDnsData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询 DNS 记录列表，支持搜索、分页、排序、过滤。
     * @param req DescribeDnsRecordsRequest
     * @return DescribeDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnsRecordsResponse DescribeDnsRecords(DescribeDnsRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDnsRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDnsRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDnsRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询 DNSSEC 相关信息
     * @param req DescribeDnssecRequest
     * @return DescribeDnssecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDnssecResponse DescribeDnssec(DescribeDnssecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDnssecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDnssecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDnssec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询域名证书列表，支持搜索、分页、排序、过滤。
     * @param req DescribeHostsCertificateRequest
     * @return DescribeHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsCertificateResponse DescribeHostsCertificate(DescribeHostsCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostsCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostsCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询域名配置信息
     * @param req DescribeHostsSettingRequest
     * @return DescribeHostsSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsSettingResponse DescribeHostsSetting(DescribeHostsSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostsSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostsSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询验证结果
     * @param req DescribeIdentificationRequest
     * @return DescribeIdentificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationResponse DescribeIdentification(DescribeIdentificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIdentificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIdentificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIdentification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取负载均衡列表
     * @param req DescribeLoadBalancingRequest
     * @return DescribeLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancingResponse DescribeLoadBalancing(DescribeLoadBalancingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLoadBalancing");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取负载均衡详细信息
     * @param req DescribeLoadBalancingDetailRequest
     * @return DescribeLoadBalancingDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoadBalancingDetailResponse DescribeLoadBalancingDetail(DescribeLoadBalancingDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoadBalancingDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoadBalancingDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLoadBalancingDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取源站组信息列表
     * @param req DescribeOriginGroupRequest
     * @return DescribeOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupResponse DescribeOriginGroup(DescribeOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取源站组详细信息
     * @param req DescribeOriginGroupDetailRequest
     * @return DescribeOriginGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOriginGroupDetailResponse DescribeOriginGroupDetail(DescribeOriginGroupDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOriginGroupDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOriginGroupDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOriginGroupDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询预热任务状态
     * @param req DescribePrefetchTasksRequest
     * @return DescribePrefetchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrefetchTasksResponse DescribePrefetchTasks(DescribePrefetchTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrefetchTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrefetchTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrefetchTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询清除缓存历史记录
     * @param req DescribePurgeTasksRequest
     * @return DescribePurgeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribePurgeTasksResponse DescribePurgeTasks(DescribePurgeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePurgeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePurgeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePurgeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全防护配置详情
     * @param req DescribeSecurityPolicyRequest
     * @return DescribeSecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyResponse DescribeSecurityPolicy(DescribeSecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询全部安全实例
     * @param req DescribeSecurityPolicyListRequest
     * @return DescribeSecurityPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyListResponse DescribeSecurityPolicyList(DescribeSecurityPolicyListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicyList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *分页查询门神规则
     * @param req DescribeSecurityPolicyManagedRulesRequest
     * @return DescribeSecurityPolicyManagedRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyManagedRulesResponse DescribeSecurityPolicyManagedRules(DescribeSecurityPolicyManagedRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyManagedRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyManagedRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicyManagedRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *规则id查询门神规则详情
     * @param req DescribeSecurityPolicyManagedRulesIdRequest
     * @return DescribeSecurityPolicyManagedRulesIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyManagedRulesIdResponse DescribeSecurityPolicyManagedRulesId(DescribeSecurityPolicyManagedRulesIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyManagedRulesIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyManagedRulesIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicyManagedRulesId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询所有地域信息
     * @param req DescribeSecurityPolicyRegionsRequest
     * @return DescribeSecurityPolicyRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPolicyRegionsResponse DescribeSecurityPolicyRegions(DescribeSecurityPolicyRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPolicyRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPolicyRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPolicyRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询所有DDoS防护分区
     * @param req DescribeZoneDDoSPolicyRequest
     * @return DescribeZoneDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneDDoSPolicyResponse DescribeZoneDDoSPolicy(DescribeZoneDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneDDoSPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZoneDDoSPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据站点 ID 查询站点的详细信息
     * @param req DescribeZoneDetailsRequest
     * @return DescribeZoneDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneDetailsResponse DescribeZoneDetails(DescribeZoneDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZoneDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询站点的所有配置信息。
     * @param req DescribeZoneSettingRequest
     * @return DescribeZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZoneSettingResponse DescribeZoneSetting(DescribeZoneSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZoneSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZoneSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZoneSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用户查询用户站点信息列表，支持分页
     * @param req DescribeZonesRequest
     * @return DescribeZonesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZonesResponse DescribeZones(DescribeZonesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZonesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZonesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZones");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询七层离线日志
     * @param req DownloadL7LogsRequest
     * @return DownloadL7LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL7LogsResponse DownloadL7Logs(DownloadL7LogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadL7LogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadL7LogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadL7Logs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于验证站点所有权
     * @param req IdentifyZoneRequest
     * @return IdentifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public IdentifyZoneResponse IdentifyZone(IdentifyZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IdentifyZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<IdentifyZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "IdentifyZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导入 DNS 记录
     * @param req ImportDnsRecordsRequest
     * @return ImportDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public ImportDnsRecordsResponse ImportDnsRecords(ImportDnsRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportDnsRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportDnsRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportDnsRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用代理
     * @param req ModifyApplicationProxyRequest
     * @return ModifyApplicationProxyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyResponse ModifyApplicationProxy(ModifyApplicationProxyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用代理规则
     * @param req ModifyApplicationProxyRuleRequest
     * @return ModifyApplicationProxyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleResponse ModifyApplicationProxyRule(ModifyApplicationProxyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用代理规则的状态
     * @param req ModifyApplicationProxyRuleStatusRequest
     * @return ModifyApplicationProxyRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyRuleStatusResponse ModifyApplicationProxyRuleStatus(ModifyApplicationProxyRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxyRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用代理的状态
     * @param req ModifyApplicationProxyStatusRequest
     * @return ModifyApplicationProxyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationProxyStatusResponse ModifyApplicationProxyStatus(ModifyApplicationProxyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationProxyStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationProxyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationProxyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS防护分区配置
     * @param req ModifyDDoSPolicyRequest
     * @return ModifyDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyResponse ModifyDDoSPolicy(ModifyDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDDoSPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *域名DDoS高可用开关
     * @param req ModifyDDoSPolicyHostRequest
     * @return ModifyDDoSPolicyHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyHostResponse ModifyDDoSPolicyHost(ModifyDDoSPolicyHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyHostResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDDoSPolicyHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改默认证书状态
     * @param req ModifyDefaultCertificateRequest
     * @return ModifyDefaultCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDefaultCertificateResponse ModifyDefaultCertificate(ModifyDefaultCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDefaultCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDefaultCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDefaultCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 DNS 记录
     * @param req ModifyDnsRecordRequest
     * @return ModifyDnsRecordResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnsRecordResponse ModifyDnsRecord(ModifyDnsRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDnsRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDnsRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDnsRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 DNSSEC 状态
     * @param req ModifyDnssecRequest
     * @return ModifyDnssecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDnssecResponse ModifyDnssec(ModifyDnssecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDnssecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDnssecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDnssec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改域名证书
     * @param req ModifyHostsCertificateRequest
     * @return ModifyHostsCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostsCertificateResponse ModifyHostsCertificate(ModifyHostsCertificateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostsCertificateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostsCertificateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHostsCertificate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改负载均衡
     * @param req ModifyLoadBalancingRequest
     * @return ModifyLoadBalancingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancingResponse ModifyLoadBalancing(ModifyLoadBalancingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoadBalancingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoadBalancing");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改负载均衡状态
     * @param req ModifyLoadBalancingStatusRequest
     * @return ModifyLoadBalancingStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoadBalancingStatusResponse ModifyLoadBalancingStatus(ModifyLoadBalancingStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoadBalancingStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoadBalancingStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoadBalancingStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *源站组修改
     * @param req ModifyOriginGroupRequest
     * @return ModifyOriginGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOriginGroupResponse ModifyOriginGroup(ModifyOriginGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyOriginGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyOriginGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyOriginGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改Web&Bot安全配置
     * @param req ModifySecurityPolicyRequest
     * @return ModifySecurityPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityPolicyResponse ModifySecurityPolicy(ModifySecurityPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用该站点信息
     * @param req ModifyZoneRequest
     * @return ModifyZoneResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneResponse ModifyZone(ModifyZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启，关闭 CNAME 加速
     * @param req ModifyZoneCnameSpeedUpRequest
     * @return ModifyZoneCnameSpeedUpResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneCnameSpeedUpResponse ModifyZoneCnameSpeedUp(ModifyZoneCnameSpeedUpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneCnameSpeedUpResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneCnameSpeedUpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZoneCnameSpeedUp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改站点配置
     * @param req ModifyZoneSettingRequest
     * @return ModifyZoneSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneSettingResponse ModifyZoneSetting(ModifyZoneSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZoneSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于开启，关闭站点
     * @param req ModifyZoneStatusRequest
     * @return ModifyZoneStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyZoneStatusResponse ModifyZoneStatus(ModifyZoneStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyZoneStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyZoneStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyZoneStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *站点被其他用户接入后，验证了站点所有权之后，可以找回该站点
     * @param req ReclaimZoneRequest
     * @return ReclaimZoneResponse
     * @throws TencentCloudSDKException
     */
    public ReclaimZoneResponse ReclaimZone(ReclaimZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReclaimZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReclaimZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReclaimZone");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扫描站点历史解析记录
     * @param req ScanDnsRecordsRequest
     * @return ScanDnsRecordsResponse
     * @throws TencentCloudSDKException
     */
    public ScanDnsRecordsResponse ScanDnsRecords(ScanDnsRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanDnsRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScanDnsRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScanDnsRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
