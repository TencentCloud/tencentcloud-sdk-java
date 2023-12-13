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
package com.tencentcloudapi.antiddos.v20200309;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.antiddos.v20200309.models.*;

public class AntiddosClient extends AbstractClient{
    private static String endpoint = "antiddos.tencentcloudapi.com";
    private static String service = "antiddos";
    private static String version = "2020-03-09";
    
    public AntiddosClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AntiddosClient(Credential credential, String region, ClientProfile profile) {
        super(AntiddosClient.endpoint, AntiddosClient.version, credential, region, profile);
    }

    /**
     *本接口 (AssociateDDoSEipAddress) 用于将高防弹性公网IP绑定到实例或弹性网卡的指定内网 IP 上。
     * @param req AssociateDDoSEipAddressRequest
     * @return AssociateDDoSEipAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDDoSEipAddressResponse AssociateDDoSEipAddress(AssociateDDoSEipAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateDDoSEipAddress", AssociateDDoSEipAddressResponse.class);
    }

    /**
     *本接口 (AssociateDDoSEipLoadBalancer) 用于将高防弹性公网IP绑定到负载均衡指定内网 IP 上。
     * @param req AssociateDDoSEipLoadBalancerRequest
     * @return AssociateDDoSEipLoadBalancerResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDDoSEipLoadBalancerResponse AssociateDDoSEipLoadBalancer(AssociateDDoSEipLoadBalancerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateDDoSEipLoadBalancer", AssociateDDoSEipLoadBalancerResponse.class);
    }

    /**
     *添加DDoS防护的IP黑白名单
     * @param req CreateBlackWhiteIpListRequest
     * @return CreateBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlackWhiteIpListResponse CreateBlackWhiteIpList(CreateBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBlackWhiteIpList", CreateBlackWhiteIpListResponse.class);
    }

    /**
     *绑定IP到高防包实例，支持独享包、共享包（新版）；需要注意的是此接口绑定或解绑IP是异步接口，当处于绑定或解绑中时，则不允许再进行绑定或解绑，需要等待当前绑定或解绑完成。
     * @param req CreateBoundIPRequest
     * @return CreateBoundIPResponse
     * @throws TencentCloudSDKException
     */
    public CreateBoundIPResponse CreateBoundIP(CreateBoundIPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBoundIP", CreateBoundIPResponse.class);
    }

    /**
     *新增CC精准防护策略
     * @param req CreateCCPrecisionPolicyRequest
     * @return CreateCCPrecisionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCPrecisionPolicyResponse CreateCCPrecisionPolicy(CreateCCPrecisionPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCCPrecisionPolicy", CreateCCPrecisionPolicyResponse.class);
    }

    /**
     *新增CC频率限制策略
     * @param req CreateCCReqLimitPolicyRequest
     * @return CreateCCReqLimitPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCCReqLimitPolicyResponse CreateCCReqLimitPolicy(CreateCCReqLimitPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCCReqLimitPolicy", CreateCCReqLimitPolicyResponse.class);
    }

    /**
     *新建CC四层黑白名单
     * @param req CreateCcBlackWhiteIpListRequest
     * @return CreateCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcBlackWhiteIpListResponse CreateCcBlackWhiteIpList(CreateCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCcBlackWhiteIpList", CreateCcBlackWhiteIpListResponse.class);
    }

    /**
     *新建CC防护的地域封禁配置
     * @param req CreateCcGeoIPBlockConfigRequest
     * @return CreateCcGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcGeoIPBlockConfigResponse CreateCcGeoIPBlockConfig(CreateCcGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCcGeoIPBlockConfig", CreateCcGeoIPBlockConfigResponse.class);
    }

    /**
     *设置DDoS防护的AI防护开关
     * @param req CreateDDoSAIRequest
     * @return CreateDDoSAIResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSAIResponse CreateDDoSAI(CreateDDoSAIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDDoSAI", CreateDDoSAIResponse.class);
    }

    /**
     *添加DDoS防护的IP网段黑白名单
     * @param req CreateDDoSBlackWhiteIpListRequest
     * @return CreateDDoSBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSBlackWhiteIpListResponse CreateDDoSBlackWhiteIpList(CreateDDoSBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDDoSBlackWhiteIpList", CreateDDoSBlackWhiteIpListResponse.class);
    }

    /**
     *配置DDoS连接抑制选项
     * @param req CreateDDoSConnectLimitRequest
     * @return CreateDDoSConnectLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSConnectLimitResponse CreateDDoSConnectLimit(CreateDDoSConnectLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDDoSConnectLimit", CreateDDoSConnectLimitResponse.class);
    }

    /**
     *添加DDoS防护的区域封禁配置
     * @param req CreateDDoSGeoIPBlockConfigRequest
     * @return CreateDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSGeoIPBlockConfigResponse CreateDDoSGeoIPBlockConfig(CreateDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDDoSGeoIPBlockConfig", CreateDDoSGeoIPBlockConfigResponse.class);
    }

    /**
     *添加DDoS防护的访问限速配置
     * @param req CreateDDoSSpeedLimitConfigRequest
     * @return CreateDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateDDoSSpeedLimitConfigResponse CreateDDoSSpeedLimitConfig(CreateDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDDoSSpeedLimitConfig", CreateDDoSSpeedLimitConfigResponse.class);
    }

    /**
     *设置单IP默认告警阈值配置
     * @param req CreateDefaultAlarmThresholdRequest
     * @return CreateDefaultAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultAlarmThresholdResponse CreateDefaultAlarmThreshold(CreateDefaultAlarmThresholdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDefaultAlarmThreshold", CreateDefaultAlarmThresholdResponse.class);
    }

    /**
     *设置单IP告警阈值配置
     * @param req CreateIPAlarmThresholdConfigRequest
     * @return CreateIPAlarmThresholdConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateIPAlarmThresholdConfigResponse CreateIPAlarmThresholdConfig(CreateIPAlarmThresholdConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIPAlarmThresholdConfig", CreateIPAlarmThresholdConfigResponse.class);
    }

    /**
     *批量配置L7转发规则的证书供SSL测调用
     * @param req CreateL7RuleCertsRequest
     * @return CreateL7RuleCertsResponse
     * @throws TencentCloudSDKException
     */
    public CreateL7RuleCertsResponse CreateL7RuleCerts(CreateL7RuleCertsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateL7RuleCerts", CreateL7RuleCertsResponse.class);
    }

    /**
     *添加7层转发规则
     * @param req CreateNewL7RulesRequest
     * @return CreateNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNewL7RulesResponse CreateNewL7Rules(CreateNewL7RulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNewL7Rules", CreateNewL7RulesResponse.class);
    }

    /**
     *添加DDoS防护的特征过滤规则
     * @param req CreatePacketFilterConfigRequest
     * @return CreatePacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePacketFilterConfigResponse CreatePacketFilterConfig(CreatePacketFilterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePacketFilterConfig", CreatePacketFilterConfigResponse.class);
    }

    /**
     *添加DDoS防护的端口acl策略
     * @param req CreatePortAclConfigRequest
     * @return CreatePortAclConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePortAclConfigResponse CreatePortAclConfig(CreatePortAclConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePortAclConfig", CreatePortAclConfigResponse.class);
    }

    /**
     *批量添加DDoS防护的端口acl策略
     * @param req CreatePortAclConfigListRequest
     * @return CreatePortAclConfigListResponse
     * @throws TencentCloudSDKException
     */
    public CreatePortAclConfigListResponse CreatePortAclConfigList(CreatePortAclConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePortAclConfigList", CreatePortAclConfigListResponse.class);
    }

    /**
     *设置DDoS防护的协议封禁配置
     * @param req CreateProtocolBlockConfigRequest
     * @return CreateProtocolBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateProtocolBlockConfigResponse CreateProtocolBlockConfig(CreateProtocolBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProtocolBlockConfig", CreateProtocolBlockConfigResponse.class);
    }

    /**
     *创建一个域名，可用于在封堵时调度切换IP
     * @param req CreateSchedulingDomainRequest
     * @return CreateSchedulingDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchedulingDomainResponse CreateSchedulingDomain(CreateSchedulingDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSchedulingDomain", CreateSchedulingDomainResponse.class);
    }

    /**
     *添加DDoS防护的水印防护配置
     * @param req CreateWaterPrintConfigRequest
     * @return CreateWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateWaterPrintConfigResponse CreateWaterPrintConfig(CreateWaterPrintConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWaterPrintConfig", CreateWaterPrintConfigResponse.class);
    }

    /**
     *添加DDoS防护的水印防护密钥
     * @param req CreateWaterPrintKeyRequest
     * @return CreateWaterPrintKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateWaterPrintKeyResponse CreateWaterPrintKey(CreateWaterPrintKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWaterPrintKey", CreateWaterPrintKeyResponse.class);
    }

    /**
     *删除CC分级策略
     * @param req DeleteCCLevelPolicyRequest
     * @return DeleteCCLevelPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCLevelPolicyResponse DeleteCCLevelPolicy(DeleteCCLevelPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCLevelPolicy", DeleteCCLevelPolicyResponse.class);
    }

    /**
     *删除CC精准防护策略
     * @param req DeleteCCPrecisionPolicyRequest
     * @return DeleteCCPrecisionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCPrecisionPolicyResponse DeleteCCPrecisionPolicy(DeleteCCPrecisionPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCPrecisionPolicy", DeleteCCPrecisionPolicyResponse.class);
    }

    /**
     *删除CC频率限制策略
     * @param req DeleteCCRequestLimitPolicyRequest
     * @return DeleteCCRequestLimitPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCRequestLimitPolicyResponse DeleteCCRequestLimitPolicy(DeleteCCRequestLimitPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCRequestLimitPolicy", DeleteCCRequestLimitPolicyResponse.class);
    }

    /**
     *删除CC清洗阈值策略
     * @param req DeleteCCThresholdPolicyRequest
     * @return DeleteCCThresholdPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCThresholdPolicyResponse DeleteCCThresholdPolicy(DeleteCCThresholdPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCCThresholdPolicy", DeleteCCThresholdPolicyResponse.class);
    }

    /**
     *删除CC四层黑白名单
     * @param req DeleteCcBlackWhiteIpListRequest
     * @return DeleteCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcBlackWhiteIpListResponse DeleteCcBlackWhiteIpList(DeleteCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCcBlackWhiteIpList", DeleteCcBlackWhiteIpListResponse.class);
    }

    /**
     *删除CC防护的区域封禁配置
     * @param req DeleteCcGeoIPBlockConfigRequest
     * @return DeleteCcGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcGeoIPBlockConfigResponse DeleteCcGeoIPBlockConfig(DeleteCcGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCcGeoIPBlockConfig", DeleteCcGeoIPBlockConfigResponse.class);
    }

    /**
     *删除DDoS防护的IP网段黑白名单
     * @param req DeleteDDoSBlackWhiteIpListRequest
     * @return DeleteDDoSBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSBlackWhiteIpListResponse DeleteDDoSBlackWhiteIpList(DeleteDDoSBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDDoSBlackWhiteIpList", DeleteDDoSBlackWhiteIpListResponse.class);
    }

    /**
     *删除DDoS防护的区域封禁配置
     * @param req DeleteDDoSGeoIPBlockConfigRequest
     * @return DeleteDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSGeoIPBlockConfigResponse DeleteDDoSGeoIPBlockConfig(DeleteDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDDoSGeoIPBlockConfig", DeleteDDoSGeoIPBlockConfigResponse.class);
    }

    /**
     *删除DDoS防护的访问限速配置
     * @param req DeleteDDoSSpeedLimitConfigRequest
     * @return DeleteDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDDoSSpeedLimitConfigResponse DeleteDDoSSpeedLimitConfig(DeleteDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDDoSSpeedLimitConfig", DeleteDDoSSpeedLimitConfigResponse.class);
    }

    /**
     *删除DDoS防护的特征过滤规则
     * @param req DeletePacketFilterConfigRequest
     * @return DeletePacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePacketFilterConfigResponse DeletePacketFilterConfig(DeletePacketFilterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePacketFilterConfig", DeletePacketFilterConfigResponse.class);
    }

    /**
     *删除DDoS防护的端口acl策略
     * @param req DeletePortAclConfigRequest
     * @return DeletePortAclConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePortAclConfigResponse DeletePortAclConfig(DeletePortAclConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePortAclConfig", DeletePortAclConfigResponse.class);
    }

    /**
     *删除DDoS防护的水印防护配置
     * @param req DeleteWaterPrintConfigRequest
     * @return DeleteWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWaterPrintConfigResponse DeleteWaterPrintConfig(DeleteWaterPrintConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWaterPrintConfig", DeleteWaterPrintConfigResponse.class);
    }

    /**
     *删除DDoS防护的水印防护密钥
     * @param req DeleteWaterPrintKeyRequest
     * @return DeleteWaterPrintKeyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWaterPrintKeyResponse DeleteWaterPrintKey(DeleteWaterPrintKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWaterPrintKey", DeleteWaterPrintKeyResponse.class);
    }

    /**
     *获取基础防护攻击状态
     * @param req DescribeBasicDeviceStatusRequest
     * @return DescribeBasicDeviceStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDeviceStatusResponse DescribeBasicDeviceStatus(DescribeBasicDeviceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBasicDeviceStatus", DescribeBasicDeviceStatusResponse.class);
    }

    /**
     *获取高防包流量折线图
     * @param req DescribeBgpBizTrendRequest
     * @return DescribeBgpBizTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBgpBizTrendResponse DescribeBgpBizTrend(DescribeBgpBizTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBgpBizTrend", DescribeBgpBizTrendResponse.class);
    }

    /**
     *获取业务流量状态码统计列表
     * @param req DescribeBizHttpStatusRequest
     * @return DescribeBizHttpStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizHttpStatusResponse DescribeBizHttpStatus(DescribeBizHttpStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBizHttpStatus", DescribeBizHttpStatusResponse.class);
    }

    /**
     *获取高防IP业务监控流量曲线
     * @param req DescribeBizMonitorTrendRequest
     * @return DescribeBizMonitorTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizMonitorTrendResponse DescribeBizMonitorTrend(DescribeBizMonitorTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBizMonitorTrend", DescribeBizMonitorTrendResponse.class);
    }

    /**
     *获取业务流量曲线
     * @param req DescribeBizTrendRequest
     * @return DescribeBizTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBizTrendResponse DescribeBizTrend(DescribeBizTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBizTrend", DescribeBizTrendResponse.class);
    }

    /**
     *接口变更

获取DDoS防护的IP黑白名单
     * @param req DescribeBlackWhiteIpListRequest
     * @return DescribeBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlackWhiteIpListResponse DescribeBlackWhiteIpList(DescribeBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlackWhiteIpList", DescribeBlackWhiteIpListResponse.class);
    }

    /**
     *获取边界防护CC防护等级列表
     * @param req DescribeCCLevelListRequest
     * @return DescribeCCLevelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCLevelListResponse DescribeCCLevelList(DescribeCCLevelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCLevelList", DescribeCCLevelListResponse.class);
    }

    /**
     *获取CC分级策略
     * @param req DescribeCCLevelPolicyRequest
     * @return DescribeCCLevelPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCLevelPolicyResponse DescribeCCLevelPolicy(DescribeCCLevelPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCLevelPolicy", DescribeCCLevelPolicyResponse.class);
    }

    /**
     *获取CC精准防护列表
     * @param req DescribeCCPrecisionPlyListRequest
     * @return DescribeCCPrecisionPlyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCPrecisionPlyListResponse DescribeCCPrecisionPlyList(DescribeCCPrecisionPlyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCPrecisionPlyList", DescribeCCPrecisionPlyListResponse.class);
    }

    /**
     *获取CC频率限制策略列表
     * @param req DescribeCCReqLimitPolicyListRequest
     * @return DescribeCCReqLimitPolicyListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCReqLimitPolicyListResponse DescribeCCReqLimitPolicyList(DescribeCCReqLimitPolicyListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCReqLimitPolicyList", DescribeCCReqLimitPolicyListResponse.class);
    }

    /**
     *获取CC清洗阈值列表
     * @param req DescribeCCThresholdListRequest
     * @return DescribeCCThresholdListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCThresholdListResponse DescribeCCThresholdList(DescribeCCThresholdListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCThresholdList", DescribeCCThresholdListResponse.class);
    }

    /**
     *获取CC攻击指标数据，包括总请求峰值(QPS)和攻击请求(QPS)以及总请求次数和攻击请求次数
     * @param req DescribeCCTrendRequest
     * @return DescribeCCTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCTrendResponse DescribeCCTrend(DescribeCCTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCCTrend", DescribeCCTrendResponse.class);
    }

    /**
     *获取CC四层黑白名单列表
     * @param req DescribeCcBlackWhiteIpListRequest
     * @return DescribeCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcBlackWhiteIpListResponse DescribeCcBlackWhiteIpList(DescribeCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcBlackWhiteIpList", DescribeCcBlackWhiteIpListResponse.class);
    }

    /**
     *获取CC防护的区域封禁配置列表
     * @param req DescribeCcGeoIPBlockConfigListRequest
     * @return DescribeCcGeoIPBlockConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcGeoIPBlockConfigListResponse DescribeCcGeoIPBlockConfigList(DescribeCcGeoIPBlockConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCcGeoIPBlockConfigList", DescribeCcGeoIPBlockConfigListResponse.class);
    }

    /**
     *获取DDoS防护的IP网段黑白名单
     * @param req DescribeDDoSBlackWhiteIpListRequest
     * @return DescribeDDoSBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSBlackWhiteIpListResponse DescribeDDoSBlackWhiteIpList(DescribeDDoSBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSBlackWhiteIpList", DescribeDDoSBlackWhiteIpListResponse.class);
    }

    /**
     *获取DDoS连接抑制配置列表
     * @param req DescribeDDoSConnectLimitListRequest
     * @return DescribeDDoSConnectLimitListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSConnectLimitListResponse DescribeDDoSConnectLimitList(DescribeDDoSConnectLimitListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSConnectLimitList", DescribeDDoSConnectLimitListResponse.class);
    }

    /**
     *获取DDoS攻击流量带宽和攻击包速率数据
     * @param req DescribeDDoSTrendRequest
     * @return DescribeDDoSTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDDoSTrendResponse DescribeDDoSTrend(DescribeDDoSTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDDoSTrend", DescribeDDoSTrendResponse.class);
    }

    /**
     *获取单IP默认告警阈值配置
     * @param req DescribeDefaultAlarmThresholdRequest
     * @return DescribeDefaultAlarmThresholdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefaultAlarmThresholdResponse DescribeDefaultAlarmThreshold(DescribeDefaultAlarmThresholdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefaultAlarmThreshold", DescribeDefaultAlarmThresholdResponse.class);
    }

    /**
     *获取IP封堵列表
     * @param req DescribeIpBlockListRequest
     * @return DescribeIpBlockListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpBlockListResponse DescribeIpBlockList(DescribeIpBlockListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIpBlockList", DescribeIpBlockListResponse.class);
    }

    /**
     *查询与证书ID对于域名匹配的七层规则
     * @param req DescribeL7RulesBySSLCertIdRequest
     * @return DescribeL7RulesBySSLCertIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeL7RulesBySSLCertIdResponse DescribeL7RulesBySSLCertId(DescribeL7RulesBySSLCertIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeL7RulesBySSLCertId", DescribeL7RulesBySSLCertIdResponse.class);
    }

    /**
     *获取高防IP资产实例列表

     * @param req DescribeListBGPIPInstancesRequest
     * @return DescribeListBGPIPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPIPInstancesResponse DescribeListBGPIPInstances(DescribeListBGPIPInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListBGPIPInstances", DescribeListBGPIPInstancesResponse.class);
    }

    /**
     *获取高防包资产实例列表
     * @param req DescribeListBGPInstancesRequest
     * @return DescribeListBGPInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBGPInstancesResponse DescribeListBGPInstances(DescribeListBGPInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListBGPInstances", DescribeListBGPInstancesResponse.class);
    }

    /**
     *获取DDoS防护的IP黑白名单列表
     * @param req DescribeListBlackWhiteIpListRequest
     * @return DescribeListBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListBlackWhiteIpListResponse DescribeListBlackWhiteIpList(DescribeListBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListBlackWhiteIpList", DescribeListBlackWhiteIpListResponse.class);
    }

    /**
     *获取DDoS防护的AI防护开关列表
     * @param req DescribeListDDoSAIRequest
     * @return DescribeListDDoSAIResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSAIResponse DescribeListDDoSAI(DescribeListDDoSAIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListDDoSAI", DescribeListDDoSAIResponse.class);
    }

    /**
     *获取DDoS防护的区域封禁配置列表
     * @param req DescribeListDDoSGeoIPBlockConfigRequest
     * @return DescribeListDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSGeoIPBlockConfigResponse DescribeListDDoSGeoIPBlockConfig(DescribeListDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListDDoSGeoIPBlockConfig", DescribeListDDoSGeoIPBlockConfigResponse.class);
    }

    /**
     *获取DDoS防护的访问限速配置列表
     * @param req DescribeListDDoSSpeedLimitConfigRequest
     * @return DescribeListDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListDDoSSpeedLimitConfigResponse DescribeListDDoSSpeedLimitConfig(DescribeListDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListDDoSSpeedLimitConfig", DescribeListDDoSSpeedLimitConfigResponse.class);
    }

    /**
     *获取单IP告警阈值配置列表
     * @param req DescribeListIPAlarmConfigRequest
     * @return DescribeListIPAlarmConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListIPAlarmConfigResponse DescribeListIPAlarmConfig(DescribeListIPAlarmConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListIPAlarmConfig", DescribeListIPAlarmConfigResponse.class);
    }

    /**
     *获取转发监听器列表
     * @param req DescribeListListenerRequest
     * @return DescribeListListenerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListListenerResponse DescribeListListener(DescribeListListenerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListListener", DescribeListListenerResponse.class);
    }

    /**
     *获取DDoS防护的特征过滤规则列表
     * @param req DescribeListPacketFilterConfigRequest
     * @return DescribeListPacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListPacketFilterConfigResponse DescribeListPacketFilterConfig(DescribeListPacketFilterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListPacketFilterConfig", DescribeListPacketFilterConfigResponse.class);
    }

    /**
     *获取DDoS防护的端口acl策略列表
     * @param req DescribeListPortAclListRequest
     * @return DescribeListPortAclListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListPortAclListResponse DescribeListPortAclList(DescribeListPortAclListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListPortAclList", DescribeListPortAclListResponse.class);
    }

    /**
     *接口变更

获取防护阈值配置列表，包括DDoS的AI、等级、CC阈值开关等
     * @param req DescribeListProtectThresholdConfigRequest
     * @return DescribeListProtectThresholdConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListProtectThresholdConfigResponse DescribeListProtectThresholdConfig(DescribeListProtectThresholdConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListProtectThresholdConfig", DescribeListProtectThresholdConfigResponse.class);
    }

    /**
     *获取DDoS防护的协议封禁配置列表
     * @param req DescribeListProtocolBlockConfigRequest
     * @return DescribeListProtocolBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListProtocolBlockConfigResponse DescribeListProtocolBlockConfig(DescribeListProtocolBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListProtocolBlockConfig", DescribeListProtocolBlockConfigResponse.class);
    }

    /**
     *获取智能调度域名列表
     * @param req DescribeListSchedulingDomainRequest
     * @return DescribeListSchedulingDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListSchedulingDomainResponse DescribeListSchedulingDomain(DescribeListSchedulingDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListSchedulingDomain", DescribeListSchedulingDomainResponse.class);
    }

    /**
     *获取DDoS防护的水印防护配置列表
     * @param req DescribeListWaterPrintConfigRequest
     * @return DescribeListWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListWaterPrintConfigResponse DescribeListWaterPrintConfig(DescribeListWaterPrintConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListWaterPrintConfig", DescribeListWaterPrintConfigResponse.class);
    }

    /**
     *高防IP获取7层规则
     * @param req DescribeNewL7RulesRequest
     * @return DescribeNewL7RulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL7RulesResponse DescribeNewL7Rules(DescribeNewL7RulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNewL7Rules", DescribeNewL7RulesResponse.class);
    }

    /**
     *获取L7转发规则健康检查异常结果列表
     * @param req DescribeNewL7RulesErrHealthRequest
     * @return DescribeNewL7RulesErrHealthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNewL7RulesErrHealthResponse DescribeNewL7RulesErrHealth(DescribeNewL7RulesErrHealthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNewL7RulesErrHealth", DescribeNewL7RulesErrHealthResponse.class);
    }

    /**
     *拉取防护概览攻击趋势
     * @param req DescribeOverviewAttackTrendRequest
     * @return DescribeOverviewAttackTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewAttackTrendResponse DescribeOverviewAttackTrend(DescribeOverviewAttackTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewAttackTrend", DescribeOverviewAttackTrendResponse.class);
    }

    /**
     *获取防护概览总请求峰值(QPS)和攻击请求(QPS)以及总请求次数和攻击请求次数
     * @param req DescribeOverviewCCTrendRequest
     * @return DescribeOverviewCCTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewCCTrendResponse DescribeOverviewCCTrend(DescribeOverviewCCTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewCCTrend", DescribeOverviewCCTrendResponse.class);
    }

    /**
     *获取防护概览的ddos攻击事件
     * @param req DescribeOverviewDDoSEventListRequest
     * @return DescribeOverviewDDoSEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewDDoSEventListResponse DescribeOverviewDDoSEventList(DescribeOverviewDDoSEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewDDoSEventList", DescribeOverviewDDoSEventListResponse.class);
    }

    /**
     *获取防护概览DDoS攻击流量带宽和攻击包速率数据
     * @param req DescribeOverviewDDoSTrendRequest
     * @return DescribeOverviewDDoSTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewDDoSTrendResponse DescribeOverviewDDoSTrend(DescribeOverviewDDoSTrendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewDDoSTrend", DescribeOverviewDDoSTrendResponse.class);
    }

    /**
     *拉取防护概览指标
     * @param req DescribeOverviewIndexRequest
     * @return DescribeOverviewIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOverviewIndexResponse DescribeOverviewIndex(DescribeOverviewIndexRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOverviewIndex", DescribeOverviewIndexResponse.class);
    }

    /**
     *查询账号维度待处理风险信息，包括是否为付费用户，查询攻击中、封堵中、过期资源数量等
     * @param req DescribePendingRiskInfoRequest
     * @return DescribePendingRiskInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribePendingRiskInfoResponse DescribePendingRiskInfo(DescribePendingRiskInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePendingRiskInfo", DescribePendingRiskInfoResponse.class);
    }

    /**
     *本接口 (DisassociateDDoSEipAddress) 用于解绑高防弹性公网IP。
     * @param req DisassociateDDoSEipAddressRequest
     * @return DisassociateDDoSEipAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDDoSEipAddressResponse DisassociateDDoSEipAddress(DisassociateDDoSEipAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateDDoSEipAddress", DisassociateDDoSEipAddressResponse.class);
    }

    /**
     *修改CC防护等级
     * @param req ModifyCCLevelPolicyRequest
     * @return ModifyCCLevelPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCLevelPolicyResponse ModifyCCLevelPolicy(ModifyCCLevelPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCCLevelPolicy", ModifyCCLevelPolicyResponse.class);
    }

    /**
     *修改CC精准防护策略
     * @param req ModifyCCPrecisionPolicyRequest
     * @return ModifyCCPrecisionPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCPrecisionPolicyResponse ModifyCCPrecisionPolicy(ModifyCCPrecisionPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCCPrecisionPolicy", ModifyCCPrecisionPolicyResponse.class);
    }

    /**
     *修改CC频率限制策略
     * @param req ModifyCCReqLimitPolicyRequest
     * @return ModifyCCReqLimitPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCReqLimitPolicyResponse ModifyCCReqLimitPolicy(ModifyCCReqLimitPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCCReqLimitPolicy", ModifyCCReqLimitPolicyResponse.class);
    }

    /**
     *修改CC清洗阈值
     * @param req ModifyCCThresholdPolicyRequest
     * @return ModifyCCThresholdPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCCThresholdPolicyResponse ModifyCCThresholdPolicy(ModifyCCThresholdPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCCThresholdPolicy", ModifyCCThresholdPolicyResponse.class);
    }

    /**
     *修改CC四层黑白名单
     * @param req ModifyCcBlackWhiteIpListRequest
     * @return ModifyCcBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcBlackWhiteIpListResponse ModifyCcBlackWhiteIpList(ModifyCcBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCcBlackWhiteIpList", ModifyCcBlackWhiteIpListResponse.class);
    }

    /**
     *修改DDoS黑白名单列表
     * @param req ModifyDDoSBlackWhiteIpListRequest
     * @return ModifyDDoSBlackWhiteIpListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSBlackWhiteIpListResponse ModifyDDoSBlackWhiteIpList(ModifyDDoSBlackWhiteIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSBlackWhiteIpList", ModifyDDoSBlackWhiteIpListResponse.class);
    }

    /**
     *修改DDoS防护的区域封禁配置
     * @param req ModifyDDoSGeoIPBlockConfigRequest
     * @return ModifyDDoSGeoIPBlockConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSGeoIPBlockConfigResponse ModifyDDoSGeoIPBlockConfig(ModifyDDoSGeoIPBlockConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSGeoIPBlockConfig", ModifyDDoSGeoIPBlockConfigResponse.class);
    }

    /**
     *读取或修改DDoS的防护等级
     * @param req ModifyDDoSLevelRequest
     * @return ModifyDDoSLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSLevelResponse ModifyDDoSLevel(ModifyDDoSLevelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSLevel", ModifyDDoSLevelResponse.class);
    }

    /**
     *修改DDoS防护的访问限速配置
     * @param req ModifyDDoSSpeedLimitConfigRequest
     * @return ModifyDDoSSpeedLimitConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSSpeedLimitConfigResponse ModifyDDoSSpeedLimitConfig(ModifyDDoSSpeedLimitConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSSpeedLimitConfig", ModifyDDoSSpeedLimitConfigResponse.class);
    }

    /**
     *修改DDoS清洗阈值
     * @param req ModifyDDoSThresholdRequest
     * @return ModifyDDoSThresholdResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDDoSThresholdResponse ModifyDDoSThreshold(ModifyDDoSThresholdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDDoSThreshold", ModifyDDoSThresholdResponse.class);
    }

    /**
     *修改智能解析域名名称
     * @param req ModifyDomainUsrNameRequest
     * @return ModifyDomainUsrNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainUsrNameResponse ModifyDomainUsrName(ModifyDomainUsrNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDomainUsrName", ModifyDomainUsrNameResponse.class);
    }

    /**
     *修改7层转发规则
     * @param req ModifyNewDomainRulesRequest
     * @return ModifyNewDomainRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNewDomainRulesResponse ModifyNewDomainRules(ModifyNewDomainRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNewDomainRules", ModifyNewDomainRulesResponse.class);
    }

    /**
     *修改DDoS防护的特征过滤规则
     * @param req ModifyPacketFilterConfigRequest
     * @return ModifyPacketFilterConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPacketFilterConfigResponse ModifyPacketFilterConfig(ModifyPacketFilterConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPacketFilterConfig", ModifyPacketFilterConfigResponse.class);
    }

    /**
     *修改DDoS防护的端口acl策略
     * @param req ModifyPortAclConfigRequest
     * @return ModifyPortAclConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPortAclConfigResponse ModifyPortAclConfig(ModifyPortAclConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPortAclConfig", ModifyPortAclConfigResponse.class);
    }

    /**
     *开启或关闭DDoS防护的水印防护配置
     * @param req SwitchWaterPrintConfigRequest
     * @return SwitchWaterPrintConfigResponse
     * @throws TencentCloudSDKException
     */
    public SwitchWaterPrintConfigResponse SwitchWaterPrintConfig(SwitchWaterPrintConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SwitchWaterPrintConfig", SwitchWaterPrintConfigResponse.class);
    }

}
