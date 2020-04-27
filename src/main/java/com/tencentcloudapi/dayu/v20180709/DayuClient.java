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
package com.tencentcloudapi.dayu.v20180709;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dayu.v20180709.models.*;

public class DayuClient extends AbstractClient{
    private static String endpoint = "dayu.tencentcloudapi.com";
    private static String version = "2018-07-09";

    public DayuClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DayuClient(Credential credential, String region, ClientProfile profile) {
        super(DayuClient.endpoint, DayuClient.version, credential, region, profile);
    }

    /**
     *设置基础防护的DDoS告警阈值，只支持基础防护产品
     * @param req CreateBasicDDoSAlarmThresholdRequest
     * @return CreateBasicDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public CreateBasicDDoSAlarmThresholdResponse CreateBasicDDoSAlarmThreshold(CreateBasicDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBasicDDoSAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBasicDDoSAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateBasicDDoSAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定IP到高防包实例，支持独享包、共享包；需要注意的是此接口绑定或解绑IP是异步接口，当处于绑定或解绑中时，则不允许再进行绑定或解绑，需要等待当前绑定或解绑完成。
     * @param req CreateBoundIPRequest
     * @return CreateBoundIPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBoundIPResponse CreateBoundIP(CreateBoundIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBoundIPResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBoundIPResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateBoundIP"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加CC防护的访问频率控制规则
     * @param req CreateCCFrequencyRulesRequest
     * @return CreateCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCFrequencyRulesResponse CreateCCFrequencyRules(CreateCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建CC自定义策略
     * @param req CreateCCSelfDefinePolicyRequest
     * @return CreateCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCSelfDefinePolicyResponse CreateCCSelfDefinePolicy(CreateCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加DDoS高级策略
     * @param req CreateDDoSPolicyRequest
     * @return CreateDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSPolicyResponse CreateDDoSPolicy(CreateDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加策略场景
     * @param req CreateDDoSPolicyCaseRequest
     * @return CreateDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSPolicyCaseResponse CreateDDoSPolicyCase(CreateDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDDoSPolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDDoSPolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDDoSPolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源实例重命名，支持独享包、共享包、高防IP、高防IP专业版；
     * @param req CreateInstanceNameRequest
     * @return CreateInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceNameResponse CreateInstanceName(CreateInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateInstanceName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传四层健康检查配置
     * @param req CreateL4HealthConfigRequest
     * @return CreateL4HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4HealthConfigResponse CreateL4HealthConfig(CreateL4HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL4HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL4HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加L4转发规则
     * @param req CreateL4RulesRequest
     * @return CreateL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL4RulesResponse CreateL4Rules(CreateL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *此接口是7层CC的访问频控自定义规则（IP+Host维度，不支持具体的URI），此接口已弃用，请调用新接口CreateCCFrequencyRules，新接口同时支持IP+Host维度以及具体的URI；
     * @param req CreateL7CCRuleRequest
     * @return CreateL7CCRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7CCRuleResponse CreateL7CCRule(CreateL7CCRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7CCRuleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7CCRuleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7CCRule"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上传七层健康检查配置
     * @param req CreateL7HealthConfigRequest
     * @return CreateL7HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7HealthConfigResponse CreateL7HealthConfig(CreateL7HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置7层转发规则的证书
     * @param req CreateL7RuleCertRequest
     * @return CreateL7RuleCertResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RuleCertResponse CreateL7RuleCert(CreateL7RuleCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RuleCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RuleCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7RuleCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加7层(网站)转发规则
     * @param req CreateL7RulesRequest
     * @return CreateL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesResponse CreateL7Rules(CreateL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量上传7层转发规则
     * @param req CreateL7RulesUploadRequest
     * @return CreateL7RulesUploadResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RulesUploadResponse CreateL7RulesUpload(CreateL7RulesUploadRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateL7RulesUploadResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateL7RulesUploadResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateL7RulesUpload"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *高防IP专业版一键切回源站
     * @param req CreateNetReturnRequest
     * @return CreateNetReturnResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetReturnResponse CreateNetReturn(CreateNetReturnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetReturnResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNetReturnResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNetReturn"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加L4转发规则
     * @param req CreateNewL4RulesRequest
     * @return CreateNewL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNewL4RulesResponse CreateNewL4Rules(CreateNewL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNewL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNewL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNewL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加7层转发规则
     * @param req CreateNewL7RulesRequest
     * @return CreateNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNewL7RulesResponse CreateNewL7Rules(CreateNewL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNewL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNewL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateNewL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *IP解封操作
     * @param req CreateUnblockIpRequest
     * @return CreateUnblockIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateUnblockIpResponse CreateUnblockIp(CreateUnblockIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUnblockIpResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUnblockIpResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateUnblockIp"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除CC防护的访问频率控制规则
     * @param req DeleteCCFrequencyRulesRequest
     * @return DeleteCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCFrequencyRulesResponse DeleteCCFrequencyRules(DeleteCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除CC自定义策略
     * @param req DeleteCCSelfDefinePolicyRequest
     * @return DeleteCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCSelfDefinePolicyResponse DeleteCCSelfDefinePolicy(DeleteCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除DDoS高级策略
     * @param req DeleteDDoSPolicyRequest
     * @return DeleteDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSPolicyResponse DeleteDDoSPolicy(DeleteDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除策略场景
     * @param req DeleteDDoSPolicyCaseRequest
     * @return DeleteDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSPolicyCaseResponse DeleteDDoSPolicyCase(DeleteDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDDoSPolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDDoSPolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteDDoSPolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除四层转发规则
     * @param req DeleteL4RulesRequest
     * @return DeleteL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL4RulesResponse DeleteL4Rules(DeleteL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除七层转发规则
     * @param req DeleteL7RulesRequest
     * @return DeleteL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL7RulesResponse DeleteL7Rules(DeleteL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除L4转发规则
     * @param req DeleteNewL4RulesRequest
     * @return DeleteNewL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNewL4RulesResponse DeleteNewL4Rules(DeleteNewL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNewL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNewL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNewL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除L7转发规则
     * @param req DeleteNewL7RulesRequest
     * @return DeleteNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNewL7RulesResponse DeleteNewL7Rules(DeleteNewL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNewL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNewL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteNewL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取操作日志
     * @param req DescribeActionLogRequest
     * @return DescribeActionLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActionLogResponse DescribeActionLog(DescribeActionLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeActionLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeActionLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeActionLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP可添加的最多7层规则数量

     * @param req DescribeBGPIPL7RuleMaxCntRequest
     * @return DescribeBGPIPL7RuleMaxCntResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBGPIPL7RuleMaxCntResponse DescribeBGPIPL7RuleMaxCnt(DescribeBGPIPL7RuleMaxCntRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBGPIPL7RuleMaxCntResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBGPIPL7RuleMaxCntResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBGPIPL7RuleMaxCnt"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为大禹子产品提供业务转发指标数据的接口
     * @param req DescribeBaradDataRequest
     * @return DescribeBaradDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaradDataResponse DescribeBaradData(DescribeBaradDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBaradDataResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBaradDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBaradData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础防护CC防护阈值
     * @param req DescribeBasicCCThresholdRequest
     * @return DescribeBasicCCThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicCCThresholdResponse DescribeBasicCCThreshold(DescribeBasicCCThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicCCThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicCCThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBasicCCThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取基础防护黑洞阈值
     * @param req DescribeBasicDeviceThresholdRequest
     * @return DescribeBasicDeviceThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDeviceThresholdResponse DescribeBasicDeviceThreshold(DescribeBasicDeviceThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBasicDeviceThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBasicDeviceThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBasicDeviceThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防包、高防IP、高防IP专业版、棋牌盾产品设置CC攻击的告警通知阈值
     * @param req DescribeCCAlarmThresholdRequest
     * @return DescribeCCAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCAlarmThresholdResponse DescribeCCAlarmThreshold(DescribeCCAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC攻击事件列表
     * @param req DescribeCCEvListRequest
     * @return DescribeCCEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCEvListResponse DescribeCCEvList(DescribeCCEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCEvListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCEvListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCEvList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC防护的访问频率控制规则
     * @param req DescribeCCFrequencyRulesRequest
     * @return DescribeCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCFrequencyRulesResponse DescribeCCFrequencyRules(DescribeCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC的IP黑白名单
     * @param req DescribeCCIpAllowDenyRequest
     * @return DescribeCCIpAllowDenyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCIpAllowDenyResponse DescribeCCIpAllowDeny(DescribeCCIpAllowDenyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCIpAllowDenyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCIpAllowDenyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCIpAllowDeny"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC自定义策略
     * @param req DescribeCCSelfDefinePolicyRequest
     * @return DescribeCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCSelfDefinePolicyResponse DescribeCCSelfDefinePolicy(DescribeCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC攻击指标数据，包括总请求峰值(QPS)和攻击请求(QPS)
     * @param req DescribeCCTrendRequest
     * @return DescribeCCTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCTrendResponse DescribeCCTrend(DescribeCCTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取CC的Url白名单
     * @param req DescribeCCUrlAllowRequest
     * @return DescribeCCUrlAllowResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCUrlAllowResponse DescribeCCUrlAllow(DescribeCCUrlAllowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCUrlAllowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCUrlAllowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCCUrlAllow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防包、高防IP、高防IP专业版、棋牌盾产品设置DDoS攻击的告警通知阈值
     * @param req DescribeDDoSAlarmThresholdRequest
     * @return DescribeDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAlarmThresholdResponse DescribeDDoSAlarmThreshold(DescribeDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击源IP地域分布图，支持全球攻击分布和国内省份攻击分布；
     * @param req DescribeDDoSAttackIPRegionMapRequest
     * @return DescribeDDoSAttackIPRegionMapResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackIPRegionMapResponse DescribeDDoSAttackIPRegionMap(DescribeDDoSAttackIPRegionMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackIPRegionMapResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackIPRegionMapResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSAttackIPRegionMap"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击源列表
     * @param req DescribeDDoSAttackSourceRequest
     * @return DescribeDDoSAttackSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSAttackSourceResponse DescribeDDoSAttackSource(DescribeDDoSAttackSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSAttackSourceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSAttackSourceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSAttackSource"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击占比分析
     * @param req DescribeDDoSCountRequest
     * @return DescribeDDoSCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSCountResponse DescribeDDoSCount(DescribeDDoSCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSCountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSCountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSCount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS防护状态（临时关闭状态），支持产品：基础防护，独享包，共享包，高防IP，高防IP专业版；调用此接口是获取当前是否有设置临时关闭DDoS防护状态，如果有设置会返回临时关闭的时长等参数。
     * @param req DescribeDDoSDefendStatusRequest
     * @return DescribeDDoSDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSDefendStatusResponse DescribeDDoSDefendStatus(DescribeDDoSDefendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSDefendStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSDefendStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSDefendStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击事件详情
     * @param req DescribeDDoSEvInfoRequest
     * @return DescribeDDoSEvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSEvInfoResponse DescribeDDoSEvInfo(DescribeDDoSEvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSEvInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSEvInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSEvInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击事件列表
     * @param req DescribeDDoSEvListRequest
     * @return DescribeDDoSEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSEvListResponse DescribeDDoSEvList(DescribeDDoSEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSEvListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSEvListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSEvList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoSIP攻击日志
     * @param req DescribeDDoSIpLogRequest
     * @return DescribeDDoSIpLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSIpLogResponse DescribeDDoSIpLog(DescribeDDoSIpLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSIpLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSIpLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSIpLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP专业版资源的DDoS攻击占比分析
     * @param req DescribeDDoSNetCountRequest
     * @return DescribeDDoSNetCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetCountResponse DescribeDDoSNetCount(DescribeDDoSNetCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetCountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetCountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetCount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP专业版资源的DDoS攻击事件详情
     * @param req DescribeDDoSNetEvInfoRequest
     * @return DescribeDDoSNetEvInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetEvInfoResponse DescribeDDoSNetEvInfo(DescribeDDoSNetEvInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetEvInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetEvInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetEvInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP专业版资源的DDoS攻击事件列表
     * @param req DescribeDDoSNetEvListRequest
     * @return DescribeDDoSNetEvListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetEvListResponse DescribeDDoSNetEvList(DescribeDDoSNetEvListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetEvListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetEvListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetEvList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP专业版资源的DDoSIP攻击日志
     * @param req DescribeDDoSNetIpLogRequest
     * @return DescribeDDoSNetIpLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetIpLogResponse DescribeDDoSNetIpLog(DescribeDDoSNetIpLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetIpLogResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetIpLogResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetIpLog"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取高防IP专业版资源的DDoS攻击指标数据
     * @param req DescribeDDoSNetTrendRequest
     * @return DescribeDDoSNetTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSNetTrendResponse DescribeDDoSNetTrend(DescribeDDoSNetTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSNetTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSNetTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSNetTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS高级策略
     * @param req DescribeDDoSPolicyRequest
     * @return DescribeDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSPolicyResponse DescribeDDoSPolicy(DescribeDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取DDoS攻击流量带宽和攻击包速率数据
     * @param req DescribeDDoSTrendRequest
     * @return DescribeDDoSTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSTrendResponse DescribeDDoSTrend(DescribeDDoSTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSTrendResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSTrendResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSTrend"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *统计用户的高防资源的使用天数和DDoS攻击防护次数
     * @param req DescribeDDoSUsedStatisRequest
     * @return DescribeDDoSUsedStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSUsedStatisResponse DescribeDDoSUsedStatis(DescribeDDoSUsedStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDDoSUsedStatisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDDoSUsedStatisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDDoSUsedStatis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取独享包或共享包IP对应的云资产信息，只支持独享包和共享包的IP
     * @param req DescribeIPProductInfoRequest
     * @return DescribeIPProductInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPProductInfoResponse DescribeIPProductInfo(DescribeIPProductInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPProductInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPProductInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIPProductInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取保险包套餐列表
     * @param req DescribeInsurePacksRequest
     * @return DescribeInsurePacksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInsurePacksResponse DescribeInsurePacks(DescribeInsurePacksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInsurePacksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInsurePacksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInsurePacks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取IP封堵列表
     * @param req DescribeIpBlockListRequest
     * @return DescribeIpBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpBlockListResponse DescribeIpBlockList(DescribeIpBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpBlockListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpBlockListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpBlockList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取IP解封记录
     * @param req DescribeIpUnBlockListRequest
     * @return DescribeIpUnBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpUnBlockListResponse DescribeIpUnBlockList(DescribeIpUnBlockListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpUnBlockListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpUnBlockListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeIpUnBlockList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出四层健康检查配置
     * @param req DescribeL4HealthConfigRequest
     * @return DescribeL4HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4HealthConfigResponse DescribeL4HealthConfig(DescribeL4HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取L4转发规则健康检查异常结果
     * @param req DescribeL4RulesErrHealthRequest
     * @return DescribeL4RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL4RulesErrHealthResponse DescribeL4RulesErrHealth(DescribeL4RulesErrHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL4RulesErrHealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL4RulesErrHealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL4RulesErrHealth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导出七层健康检查配置
     * @param req DescribeL7HealthConfigRequest
     * @return DescribeL7HealthConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7HealthConfigResponse DescribeL7HealthConfig(DescribeL7HealthConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeL7HealthConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeL7HealthConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeL7HealthConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取L4转发规则
     * @param req DescribeNewL4RulesRequest
     * @return DescribeNewL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL4RulesResponse DescribeNewL4Rules(DescribeNewL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNewL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNewL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取L4转发规则健康检查异常结果
     * @param req DescribeNewL4RulesErrHealthRequest
     * @return DescribeNewL4RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL4RulesErrHealthResponse DescribeNewL4RulesErrHealth(DescribeNewL4RulesErrHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewL4RulesErrHealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNewL4RulesErrHealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNewL4RulesErrHealth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取L7转发规则健康检查异常结果
     * @param req DescribeNewL7RulesErrHealthRequest
     * @return DescribeNewL7RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL7RulesErrHealthResponse DescribeNewL7RulesErrHealth(DescribeNewL7RulesErrHealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNewL7RulesErrHealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNewL7RulesErrHealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeNewL7RulesErrHealth"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取产品总览统计，支持高防包、高防IP、高防IP专业版；
     * @param req DescribePackIndexRequest
     * @return DescribePackIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribePackIndexResponse DescribePackIndex(DescribePackIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePackIndexResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePackIndexResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePackIndex"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下载攻击事件的pcap包
     * @param req DescribePcapRequest
     * @return DescribePcapResponse
     * @throws TencentCloudSDKException
     */
    public DescribePcapResponse DescribePcap(DescribePcapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePcapResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePcapResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePcap"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取策略场景
     * @param req DescribePolicyCaseRequest
     * @return DescribePolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyCaseResponse DescribePolicyCase(DescribePolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源的IP列表
     * @param req DescribeResIpListRequest
     * @return DescribeResIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResIpListResponse DescribeResIpList(DescribeResIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResIpListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResIpListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResIpList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源列表
     * @param req DescribeResourceListRequest
     * @return DescribeResourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceListResponse DescribeResourceList(DescribeResourceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeResourceList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源的规则数
     * @param req DescribeRuleSetsRequest
     * @return DescribeRuleSetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleSetsResponse DescribeRuleSets(DescribeRuleSetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleSetsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleSetsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRuleSets"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取调度域名列表
     * @param req DescribeSchedulingDomainListRequest
     * @return DescribeSchedulingDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSchedulingDomainListResponse DescribeSchedulingDomainList(DescribeSchedulingDomainListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSchedulingDomainListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSchedulingDomainListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSchedulingDomainList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取本月安全统计
     * @param req DescribeSecIndexRequest
     * @return DescribeSecIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecIndexResponse DescribeSecIndex(DescribeSecIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecIndexResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecIndexResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSecIndex"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取回源IP段，支持的产品：高防IP，高防IP专业版；
     * @param req DescribeSourceIpSegmentRequest
     * @return DescribeSourceIpSegmentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIpSegmentResponse DescribeSourceIpSegment(DescribeSourceIpSegmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSourceIpSegmentResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSourceIpSegmentResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSourceIpSegment"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取业务转发统计数据，支持转发流量和转发包速率
     * @param req DescribeTransmitStatisRequest
     * @return DescribeTransmitStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTransmitStatisResponse DescribeTransmitStatis(DescribeTransmitStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTransmitStatisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTransmitStatisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeTransmitStatis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取黑洞解封次数
     * @param req DescribeUnBlockStatisRequest
     * @return DescribeUnBlockStatisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnBlockStatisResponse DescribeUnBlockStatis(DescribeUnBlockStatisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnBlockStatisResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnBlockStatisResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeUnBlockStatis"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取四层转发规则
     * @param req DescribleL4RulesRequest
     * @return DescribleL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleL4RulesResponse DescribleL4Rules(DescribleL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取七层转发规则
     * @param req DescribleL7RulesRequest
     * @return DescribleL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleL7RulesResponse DescribleL7Rules(DescribleL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取7层规则
     * @param req DescribleNewL7RulesRequest
     * @return DescribleNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribleNewL7RulesResponse DescribleNewL7Rules(DescribleNewL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleNewL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleNewL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleNewL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取地域的资源实例数
     * @param req DescribleRegionCountRequest
     * @return DescribleRegionCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribleRegionCountResponse DescribleRegionCount(DescribleRegionCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribleRegionCountResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribleRegionCountResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribleRegionCount"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为高防包、高防IP、高防IP专业版、棋牌盾产品设置CC攻击的告警通知阈值
     * @param req ModifyCCAlarmThresholdRequest
     * @return ModifyCCAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCAlarmThresholdResponse ModifyCCAlarmThreshold(ModifyCCAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改CC防护的访问频率控制规则
     * @param req ModifyCCFrequencyRulesRequest
     * @return ModifyCCFrequencyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCFrequencyRulesResponse ModifyCCFrequencyRules(ModifyCCFrequencyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCFrequencyRulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCFrequencyRulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCFrequencyRules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或关闭CC防护的访问频率控制规则
     * @param req ModifyCCFrequencyRulesStatusRequest
     * @return ModifyCCFrequencyRulesStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCFrequencyRulesStatusResponse ModifyCCFrequencyRulesStatus(ModifyCCFrequencyRulesStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCFrequencyRulesStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCFrequencyRulesStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCFrequencyRulesStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或关闭CC域名防护
     * @param req ModifyCCHostProtectionRequest
     * @return ModifyCCHostProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCHostProtectionResponse ModifyCCHostProtection(ModifyCCHostProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCHostProtectionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCHostProtectionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCHostProtection"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加或删除CC的IP黑白名单
     * @param req ModifyCCIpAllowDenyRequest
     * @return ModifyCCIpAllowDenyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCIpAllowDenyResponse ModifyCCIpAllowDeny(ModifyCCIpAllowDenyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCIpAllowDenyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCIpAllowDenyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCIpAllowDeny"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改CC防护等级
     * @param req ModifyCCLevelRequest
     * @return ModifyCCLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCLevelResponse ModifyCCLevel(ModifyCCLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCLevelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCLevelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCLevel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改CC自定义策略开关
     * @param req ModifyCCPolicySwitchRequest
     * @return ModifyCCPolicySwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCPolicySwitchResponse ModifyCCPolicySwitch(ModifyCCPolicySwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCPolicySwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCPolicySwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCPolicySwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改CC自定义策略
     * @param req ModifyCCSelfDefinePolicyRequest
     * @return ModifyCCSelfDefinePolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCSelfDefinePolicyResponse ModifyCCSelfDefinePolicy(ModifyCCSelfDefinePolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCSelfDefinePolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCSelfDefinePolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCSelfDefinePolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改CC的防护阈值
     * @param req ModifyCCThresholdRequest
     * @return ModifyCCThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCThresholdResponse ModifyCCThreshold(ModifyCCThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加或删除CC的URL白名单
     * @param req ModifyCCUrlAllowRequest
     * @return ModifyCCUrlAllowResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCUrlAllowResponse ModifyCCUrlAllow(ModifyCCUrlAllowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCCUrlAllowResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCCUrlAllowResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyCCUrlAllow"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *读取或修改DDoS的AI防护状态
     * @param req ModifyDDoSAIStatusRequest
     * @return ModifyDDoSAIStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSAIStatusResponse ModifyDDoSAIStatus(ModifyDDoSAIStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSAIStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSAIStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSAIStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为高防包、高防IP、高防IP专业版、棋牌盾等产品设置DDoS攻击的告警通知阈值
     * @param req ModifyDDoSAlarmThresholdRequest
     * @return ModifyDDoSAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSAlarmThresholdResponse ModifyDDoSAlarmThreshold(ModifyDDoSAlarmThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSAlarmThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSAlarmThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSAlarmThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或关闭DDoS防护状态，调用此接口允许临时关闭DDoS防护一段时间，等时间到了会自动开启DDoS防护；
     * @param req ModifyDDoSDefendStatusRequest
     * @return ModifyDDoSDefendStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSDefendStatusResponse ModifyDDoSDefendStatus(ModifyDDoSDefendStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSDefendStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSDefendStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSDefendStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *读取或修改DDoS的防护等级
     * @param req ModifyDDoSLevelRequest
     * @return ModifyDDoSLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSLevelResponse ModifyDDoSLevel(ModifyDDoSLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSLevelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSLevelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSLevel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS高级策略
     * @param req ModifyDDoSPolicyRequest
     * @return ModifyDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyResponse ModifyDDoSPolicy(ModifyDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改策略场景
     * @param req ModifyDDoSPolicyCaseRequest
     * @return ModifyDDoSPolicyCaseResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyCaseResponse ModifyDDoSPolicyCase(ModifyDDoSPolicyCaseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyCaseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyCaseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSPolicyCase"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS高级策略名称
     * @param req ModifyDDoSPolicyNameRequest
     * @return ModifyDDoSPolicyNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSPolicyNameResponse ModifyDDoSPolicyName(ModifyDDoSPolicyNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSPolicyNameResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSPolicyNameResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSPolicyName"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或关闭DDoS防护，只支持基础防护产品；
     * @param req ModifyDDoSSwitchRequest
     * @return ModifyDDoSSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSSwitchResponse ModifyDDoSSwitch(ModifyDDoSSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSSwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSSwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSSwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改DDoS清洗阈值
     * @param req ModifyDDoSThresholdRequest
     * @return ModifyDDoSThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSThresholdResponse ModifyDDoSThreshold(ModifyDDoSThresholdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSThresholdResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSThresholdResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSThreshold"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持水印密钥的添加，删除，开启，关闭
     * @param req ModifyDDoSWaterKeyRequest
     * @return ModifyDDoSWaterKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSWaterKeyResponse ModifyDDoSWaterKey(ModifyDDoSWaterKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDDoSWaterKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDDoSWaterKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDDoSWaterKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改弹性防护阈值
     * @param req ModifyElasticLimitRequest
     * @return ModifyElasticLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyElasticLimitResponse ModifyElasticLimit(ModifyElasticLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyElasticLimitResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyElasticLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyElasticLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改L4转发规则健康检查参数，支持的子产品：高防IP、高防IP专业版
     * @param req ModifyL4HealthRequest
     * @return ModifyL4HealthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4HealthResponse ModifyL4Health(ModifyL4HealthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4HealthResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4HealthResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4Health"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改L4转发规则的会话保持，支持的子产品：高防IP、高防IP专业版
     * @param req ModifyL4KeepTimeRequest
     * @return ModifyL4KeepTimeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4KeepTimeResponse ModifyL4KeepTime(ModifyL4KeepTimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4KeepTimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4KeepTimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4KeepTime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改L4转发规则
     * @param req ModifyL4RulesRequest
     * @return ModifyL4RulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL4RulesResponse ModifyL4Rules(ModifyL4RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL4RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL4RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL4Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改L7转发规则
     * @param req ModifyL7RulesRequest
     * @return ModifyL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyL7RulesResponse ModifyL7Rules(ModifyL7RulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyL7RulesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyL7RulesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyL7Rules"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在客户收攻击或者被封堵时，切回到源站，并设置回切的时长
     * @param req ModifyNetReturnSwitchRequest
     * @return ModifyNetReturnSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetReturnSwitchResponse ModifyNetReturnSwitch(ModifyNetReturnSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetReturnSwitchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNetReturnSwitchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyNetReturnSwitch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源实例绑定DDoS高级策略
     * @param req ModifyResBindDDoSPolicyRequest
     * @return ModifyResBindDDoSPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResBindDDoSPolicyResponse ModifyResBindDDoSPolicy(ModifyResBindDDoSPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResBindDDoSPolicyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResBindDDoSPolicyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyResBindDDoSPolicy"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改资源自动续费标记
     * @param req ModifyResourceRenewFlagRequest
     * @return ModifyResourceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceRenewFlagResponse ModifyResourceRenewFlag(ModifyResourceRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceRenewFlagResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceRenewFlagResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyResourceRenewFlag"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
