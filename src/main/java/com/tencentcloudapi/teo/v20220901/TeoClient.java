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
package com.tencentcloudapi.teo.v20220901;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.teo.v20220901.models.*;

public class TeoClient extends AbstractClient{
    private static String endpoint = "teo.tencentcloudapi.com";
    private static String service = "teo";
    private static String version = "2022-09-01";

    public TeoClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TeoClient(Credential credential, String region, ClientProfile profile) {
        super(TeoClient.endpoint, TeoClient.version, credential, region, profile);
    }

    /**
     *将未绑定套餐的站点绑定到已有套餐
     * @param req BindZoneToPlanRequest
     * @return BindZoneToPlanResponse
     * @throws TencentCloudSDKException
     */
    public BindZoneToPlanResponse BindZoneToPlan(BindZoneToPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindZoneToPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindZoneToPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindZoneToPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
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
     *创建别称域名。
     * @param req CreateAliasDomainRequest
     * @return CreateAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAliasDomainResponse CreateAliasDomain(CreateAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAliasDomain");
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
     *用于创建COS回源私有凭证
     * @param req CreateCredentialRequest
     * @return CreateCredentialResponse
     * @throws TencentCloudSDKException
     */
    public CreateCredentialResponse CreateCredential(CreateCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCredential");
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
     *创建IP黑白名单列表
     * @param req CreateIpTableListRequest
     * @return CreateIpTableListResponse
     * @throws TencentCloudSDKException
     */
    public CreateIpTableListResponse CreateIpTableList(CreateIpTableListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIpTableListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIpTableListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIpTableList");
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
     *本接口（CreateClsLog）用于创建CLS日志集。
     * @param req CreateLogSetRequest
     * @return CreateLogSetResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogSetResponse CreateLogSet(CreateLogSetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogSetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogSetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogSet");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateLogTopicTask）用于创建日志推送任务。
     * @param req CreateLogTopicTaskRequest
     * @return CreateLogTopicTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogTopicTaskResponse CreateLogTopicTask(CreateLogTopicTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogTopicTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogTopicTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogTopicTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建源站组
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
     *为未购买套餐的站点购买套餐
     * @param req CreatePlanForZoneRequest
     * @return CreatePlanForZoneResponse
     * @throws TencentCloudSDKException
     */
    public CreatePlanForZoneResponse CreatePlanForZone(CreatePlanForZoneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePlanForZoneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePlanForZoneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePlanForZone");
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
     *创建刷新/预热重放任务
     * @param req CreateReplayTaskRequest
     * @return CreateReplayTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateReplayTaskResponse CreateReplayTask(CreateReplayTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateReplayTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateReplayTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateReplayTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *规则引擎创建规则。
     * @param req CreateRuleRequest
     * @return CreateRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuleResponse CreateRule(CreateRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建自定义拦截页面。
     * @param req CreateSecurityDropPageRequest
     * @return CreateSecurityDropPageResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityDropPageResponse CreateSecurityDropPage(CreateSecurityDropPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityDropPageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityDropPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityDropPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对用户指定的域名进行一次站点拨测
     * @param req CreateSpeedTestingRequest
     * @return CreateSpeedTestingResponse
     * @throws TencentCloudSDKException
     */
    public CreateSpeedTestingResponse CreateSpeedTesting(CreateSpeedTestingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSpeedTestingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSpeedTestingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSpeedTesting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于用户接入新的站点。
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
     *删除别称域名。
     * @param req DeleteAliasDomainRequest
     * @return DeleteAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAliasDomainResponse DeleteAliasDomain(DeleteAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAliasDomain");
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
     *本接口（DeleteLogTopicTask）用于删除日志推送任务。
     * @param req DeleteLogTopicTaskRequest
     * @return DeleteLogTopicTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogTopicTaskResponse DeleteLogTopicTask(DeleteLogTopicTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogTopicTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogTopicTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogTopicTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除源站组
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
     *批量删除规则引擎规则。
     * @param req DeleteRulesRequest
     * @return DeleteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRulesResponse DeleteRules(DeleteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除站点。
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
     *本接口（DescribeAddableEntityList）用于查询剩余可添加的日志推送实体列表。
     * @param req DescribeAddableEntityListRequest
     * @return DescribeAddableEntityListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddableEntityListResponse DescribeAddableEntityList(DescribeAddableEntityListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddableEntityListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddableEntityListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddableEntityList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询别称域名信息列表。
     * @param req DescribeAliasDomainsRequest
     * @return DescribeAliasDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAliasDomainsResponse DescribeAliasDomains(DescribeAliasDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAliasDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAliasDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAliasDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用代理列表。
     * @param req DescribeApplicationProxiesRequest
     * @return DescribeApplicationProxiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationProxiesResponse DescribeApplicationProxies(DescribeApplicationProxiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationProxiesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationProxiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationProxies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询当前账户可用套餐信息列表
     * @param req DescribeAvailablePlansRequest
     * @return DescribeAvailablePlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailablePlansResponse DescribeAvailablePlans(DescribeAvailablePlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailablePlansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailablePlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailablePlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBotClientIpList）用于查询Bot攻击客户端Ip信息列表。
     * @param req DescribeBotClientIpListRequest
     * @return DescribeBotClientIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotClientIpListResponse DescribeBotClientIpList(DescribeBotClientIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotClientIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotClientIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotClientIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBotData）查询Bot攻击时序数据。
     * @param req DescribeBotDataRequest
     * @return DescribeBotDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotDataResponse DescribeBotData(DescribeBotDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBotHitRuleDetail）用于查询Bot攻击命中规则详情信息。
     * @param req DescribeBotHitRuleDetailRequest
     * @return DescribeBotHitRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotHitRuleDetailResponse DescribeBotHitRuleDetail(DescribeBotHitRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotHitRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotHitRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotHitRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBotLog）用于查询Bot攻击日志。
     * @param req DescribeBotLogRequest
     * @return DescribeBotLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotLogResponse DescribeBotLog(DescribeBotLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Bot托管规则
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
     *本接口（DescribeBotTopData）查询Bot攻击TopN数据。
     * @param req DescribeBotTopDataRequest
     * @return DescribeBotTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBotTopDataResponse DescribeBotTopData(DescribeBotTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBotTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBotTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBotTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeClientRuleList）用于查询封禁客户端信息列表。
     * @param req DescribeClientRuleListRequest
     * @return DescribeClientRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientRuleListResponse DescribeClientRuleList(DescribeClientRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientRuleListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClientRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询内容管理接口配额
     * @param req DescribeContentQuotaRequest
     * @return DescribeContentQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeContentQuotaResponse DescribeContentQuota(DescribeContentQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeContentQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeContentQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeContentQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSAttackData）用于查询DDoS攻击时序数据。
     * @param req DescribeDDoSAttackDataRequest
     * @return DescribeDDoSAttackDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackDataResponse DescribeDDoSAttackData(DescribeDDoSAttackDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSAttackEvent）用于查询DDoS攻击事件列表。
     * @param req DescribeDDoSAttackEventRequest
     * @return DescribeDDoSAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventResponse DescribeDDoSAttackEvent(DescribeDDoSAttackEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSAttackEventDetail）用于查询DDoS攻击事件详情。
     * @param req DescribeDDoSAttackEventDetailRequest
     * @return DescribeDDoSAttackEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackEventDetailResponse DescribeDDoSAttackEventDetail(DescribeDDoSAttackEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackEventDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackEventDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackEventDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSAttackSourceEvent）用于查询DDoS攻击源信息列表。
     * @param req DescribeDDoSAttackSourceEventRequest
     * @return DescribeDDoSAttackSourceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackSourceEventResponse DescribeDDoSAttackSourceEvent(DescribeDDoSAttackSourceEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackSourceEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackSourceEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackSourceEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSAttackTopData）用于查询DDoS攻击Top数据。
     * @param req DescribeDDoSAttackTopDataRequest
     * @return DescribeDDoSAttackTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackTopDataResponse DescribeDDoSAttackTopData(DescribeDDoSAttackTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSAttackTopData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSBlockList）用于查询DDoS封禁解封列表。
     * @param req DescribeDDoSBlockListRequest
     * @return DescribeDDoSBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSBlockListResponse DescribeDDoSBlockList(DescribeDDoSBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSBlockListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSBlockListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSBlockList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDDoSMajorAttackEvent）用于查询DDoS主攻击事件列表。
     * @param req DescribeDDoSMajorAttackEventRequest
     * @return DescribeDDoSMajorAttackEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSMajorAttackEventResponse DescribeDDoSMajorAttackEvent(DescribeDDoSMajorAttackEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSMajorAttackEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSMajorAttackEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDDoSMajorAttackEvent");
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
     *查询站点的验证信息。
     * @param req DescribeIdentificationsRequest
     * @return DescribeIdentificationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdentificationsResponse DescribeIdentifications(DescribeIdentificationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIdentificationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIdentificationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIdentifications");
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
     *本接口（DescribeLogSets）用于获取日志集列表。
     * @param req DescribeLogSetsRequest
     * @return DescribeLogSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogSetsResponse DescribeLogSets(DescribeLogSetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogSetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogSetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogSets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeLogTopicTaskDetail）用于获取日志推送任务详细信息。
     * @param req DescribeLogTopicTaskDetailRequest
     * @return DescribeLogTopicTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTopicTaskDetailResponse DescribeLogTopicTaskDetail(DescribeLogTopicTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogTopicTaskDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogTopicTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogTopicTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeLogTopicTasks）用于获取日志推送任务列表。
     * @param req DescribeLogTopicTasksRequest
     * @return DescribeLogTopicTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogTopicTasksResponse DescribeLogTopicTasks(DescribeLogTopicTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogTopicTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogTopicTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogTopicTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取源站组列表
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
     *本接口（DescribeOverviewL7Data）用于查询七层监控类时序流量数据。
     * @param req DescribeOverviewL7DataRequest
     * @return DescribeOverviewL7DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewL7DataResponse DescribeOverviewL7Data(DescribeOverviewL7DataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOverviewL7DataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOverviewL7DataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOverviewL7Data");
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
     *查询速率限制智能客户端过滤学习出来的规则
     * @param req DescribeRateLimitIntelligenceRuleRequest
     * @return DescribeRateLimitIntelligenceRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRateLimitIntelligenceRuleResponse DescribeRateLimitIntelligenceRule(DescribeRateLimitIntelligenceRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRateLimitIntelligenceRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRateLimitIntelligenceRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRateLimitIntelligenceRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则引擎规则。
     * @param req DescribeRulesRequest
     * @return DescribeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesResponse DescribeRules(DescribeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回规则引擎可应用匹配请求的设置列表及其详细建议配置信息
     * @param req DescribeRulesSettingRequest
     * @return DescribeRulesSettingResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRulesSettingResponse DescribeRulesSetting(DescribeRulesSettingRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRulesSettingResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRulesSettingResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRulesSetting");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取托管规则组
     * @param req DescribeSecurityGroupManagedRulesRequest
     * @return DescribeSecurityGroupManagedRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupManagedRulesResponse DescribeSecurityGroupManagedRules(DescribeSecurityGroupManagedRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupManagedRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupManagedRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupManagedRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全防护配置详情。请求参数中ZoneId+Entity或TemplateId至少填一项。
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
     *查询Bot用户画像规则
     * @param req DescribeSecurityPortraitRulesRequest
     * @return DescribeSecurityPortraitRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityPortraitRulesResponse DescribeSecurityPortraitRules(DescribeSecurityPortraitRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityPortraitRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityPortraitRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityPortraitRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全规则详情
     * @param req DescribeSecurityRuleIdRequest
     * @return DescribeSecurityRuleIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityRuleIdResponse DescribeSecurityRuleId(DescribeSecurityRuleIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityRuleIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityRuleIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityRuleId");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeSingleL7AnalysisData）用于查询七层数据分析类单值流量数据列表。
     * @param req DescribeSingleL7AnalysisDataRequest
     * @return DescribeSingleL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSingleL7AnalysisDataResponse DescribeSingleL7AnalysisData(DescribeSingleL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSingleL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSingleL7AnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSingleL7AnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询拨测分地区数据
     * @param req DescribeSpeedTestingDetailsRequest
     * @return DescribeSpeedTestingDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpeedTestingDetailsResponse DescribeSpeedTestingDetails(DescribeSpeedTestingDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpeedTestingDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpeedTestingDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpeedTestingDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询站点拨测结果
     * @param req DescribeSpeedTestingMetricDataRequest
     * @return DescribeSpeedTestingMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpeedTestingMetricDataResponse DescribeSpeedTestingMetricData(DescribeSpeedTestingMetricDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpeedTestingMetricDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpeedTestingMetricDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpeedTestingMetricData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询站点拨测配额
     * @param req DescribeSpeedTestingQuotaRequest
     * @return DescribeSpeedTestingQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpeedTestingQuotaResponse DescribeSpeedTestingQuota(DescribeSpeedTestingQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpeedTestingQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpeedTestingQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpeedTestingQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTimingL4Data）用于查询四层时序流量数据列表。
     * @param req DescribeTimingL4DataRequest
     * @return DescribeTimingL4DataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL4DataResponse DescribeTimingL4Data(DescribeTimingL4DataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL4DataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL4DataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL4Data");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTimingL7AnalysisData）查询七层数据分析类时序数据。
     * @param req DescribeTimingL7AnalysisDataRequest
     * @return DescribeTimingL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7AnalysisDataResponse DescribeTimingL7AnalysisData(DescribeTimingL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL7AnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL7AnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTimingL7CacheData）用于查询七层缓存分析时序类流量数据。
     * @param req DescribeTimingL7CacheDataRequest
     * @return DescribeTimingL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTimingL7CacheDataResponse DescribeTimingL7CacheData(DescribeTimingL7CacheDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTimingL7CacheDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTimingL7CacheDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTimingL7CacheData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTopL7AnalysisData）用于查询七层流量前topN的数据。
     * @param req DescribeTopL7AnalysisDataRequest
     * @return DescribeTopL7AnalysisDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7AnalysisDataResponse DescribeTopL7AnalysisData(DescribeTopL7AnalysisDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopL7AnalysisDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopL7AnalysisDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopL7AnalysisData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeTopL7CacheData）用于查询七层缓存分析topN流量数据。
     * @param req DescribeTopL7CacheDataRequest
     * @return DescribeTopL7CacheDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopL7CacheDataResponse DescribeTopL7CacheData(DescribeTopL7CacheDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopL7CacheDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopL7CacheDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopL7CacheData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebManagedRulesData）用于查询WAF攻击的时序数据。
     * @param req DescribeWebManagedRulesDataRequest
     * @return DescribeWebManagedRulesDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesDataResponse DescribeWebManagedRulesData(DescribeWebManagedRulesDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebManagedRulesDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebManagedRulesDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebManagedRulesData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebManagedRulesHitRuleDetail）用于查询WAF攻击命中规则详情。
     * @param req DescribeWebManagedRulesHitRuleDetailRequest
     * @return DescribeWebManagedRulesHitRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesHitRuleDetailResponse DescribeWebManagedRulesHitRuleDetail(DescribeWebManagedRulesHitRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebManagedRulesHitRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebManagedRulesHitRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebManagedRulesHitRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebManagedRulesLog）用于查询Web攻击日志。
     * @param req DescribeWebManagedRulesLogRequest
     * @return DescribeWebManagedRulesLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebManagedRulesLogResponse DescribeWebManagedRulesLog(DescribeWebManagedRulesLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebManagedRulesLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebManagedRulesLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebManagedRulesLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebProtectionAttackEvents）用于查询CC相关攻击事件列表。
     * @param req DescribeWebProtectionAttackEventsRequest
     * @return DescribeWebProtectionAttackEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionAttackEventsResponse DescribeWebProtectionAttackEvents(DescribeWebProtectionAttackEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionAttackEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionAttackEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionAttackEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebProtectionClientIpList）用于查询CC防护客户端（攻击源）IP信息。
     * @param req DescribeWebProtectionClientIpListRequest
     * @return DescribeWebProtectionClientIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionClientIpListResponse DescribeWebProtectionClientIpList(DescribeWebProtectionClientIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionClientIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionClientIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionClientIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebProtectionData）用于查询CC防护时序数据。
     * @param req DescribeWebProtectionDataRequest
     * @return DescribeWebProtectionDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionDataResponse DescribeWebProtectionData(DescribeWebProtectionDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebProtectionHitRuleDetail）用于查询CC防护命中规则详情列表。
     * @param req DescribeWebProtectionHitRuleDetailRequest
     * @return DescribeWebProtectionHitRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionHitRuleDetailResponse DescribeWebProtectionHitRuleDetail(DescribeWebProtectionHitRuleDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionHitRuleDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionHitRuleDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionHitRuleDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeWebProtectionTopData）用于查询CC防护的Top数据。
     * @param req DescribeWebProtectionTopDataRequest
     * @return DescribeWebProtectionTopDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWebProtectionTopDataResponse DescribeWebProtectionTopData(DescribeWebProtectionTopDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWebProtectionTopDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWebProtectionTopDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWebProtectionTopData");
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
     *用户查询用户站点信息列表，支持分页。
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
     *本接口（DownloadL4Logs）用于下载四层离线日志。
     * @param req DownloadL4LogsRequest
     * @return DownloadL4LogsResponse
     * @throws TencentCloudSDKException
     */
    public DownloadL4LogsResponse DownloadL4Logs(DownloadL4LogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadL4LogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DownloadL4LogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DownloadL4Logs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DownloadL7Logs）下载七层离线日志。
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
     *用于验证站点所有权。
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
     *本接口（ModifyAlarmConfig）用于修改用户告警配置。
     * @param req ModifyAlarmConfigRequest
     * @return ModifyAlarmConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmConfigResponse ModifyAlarmConfig(ModifyAlarmConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口（ModifyAlarmDefaultThreshold）用于修改告警默认阈值。
     * @param req ModifyAlarmDefaultThresholdRequest
     * @return ModifyAlarmDefaultThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAlarmDefaultThresholdResponse ModifyAlarmDefaultThreshold(ModifyAlarmDefaultThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAlarmDefaultThresholdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAlarmDefaultThresholdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAlarmDefaultThreshold");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改别称域名。
     * @param req ModifyAliasDomainRequest
     * @return ModifyAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainResponse ModifyAliasDomain(ModifyAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAliasDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改别称域名状态。
     * @param req ModifyAliasDomainStatusRequest
     * @return ModifyAliasDomainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAliasDomainStatusResponse ModifyAliasDomainStatus(ModifyAliasDomainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAliasDomainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAliasDomainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAliasDomainStatus");
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
     *设置站点DNSSEC状态
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
     *本接口（ModifyLogTopicTask）用于修改日志推送任务信息。
     * @param req ModifyLogTopicTaskRequest
     * @return ModifyLogTopicTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLogTopicTaskResponse ModifyLogTopicTask(ModifyLogTopicTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLogTopicTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLogTopicTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLogTopicTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改源站组
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
     *修改规则引擎规则。
     * @param req ModifyRuleRequest
     * @return ModifyRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRuleResponse ModifyRule(ModifyRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改规则引擎规则优先级
     * @param req ModifyRulePriorityRequest
     * @return ModifyRulePriorityResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRulePriorityResponse ModifyRulePriority(ModifyRulePriorityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRulePriorityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRulePriorityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRulePriority");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改Web&Bot安全配置。
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
     *修改安全配置托管规则
     * @param req ModifySecurityWafGroupPolicyRequest
     * @return ModifySecurityWafGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityWafGroupPolicyResponse ModifySecurityWafGroupPolicy(ModifySecurityWafGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityWafGroupPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityWafGroupPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityWafGroupPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改站点信息。
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
     *开启，关闭 CNAME 加速。
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
     *用于开启，关闭站点。
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
     *当客户取回站定的同时会取回此站点下关联的别称域名，此时入参为ZoneId；当客户接入站点发现已被别称域名接入时通过验证之后可取回域名，此时入参为ZoneName。
     * @param req ReclaimAliasDomainRequest
     * @return ReclaimAliasDomainResponse
     * @throws TencentCloudSDKException
     */
    public ReclaimAliasDomainResponse ReclaimAliasDomain(ReclaimAliasDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReclaimAliasDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReclaimAliasDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReclaimAliasDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *站点被其他用户接入后，验证了站点所有权之后，可以找回该站点。
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
     *本接口（SwitchLogTopicTask）用于开启/关闭推送任务。
     * @param req SwitchLogTopicTaskRequest
     * @return SwitchLogTopicTaskResponse
     * @throws TencentCloudSDKException
     */
    public SwitchLogTopicTaskResponse SwitchLogTopicTask(SwitchLogTopicTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchLogTopicTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchLogTopicTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchLogTopicTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
