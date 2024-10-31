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
package com.tencentcloudapi.cfw.v20190904;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cfw.v20190904.models.*;

public class CfwClient extends AbstractClient{
    private static String endpoint = "cfw.tencentcloudapi.com";
    private static String service = "cfw";
    private static String version = "2019-09-04";
    
    public CfwClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CfwClient(Credential credential, String region, ClientProfile profile) {
        super(CfwClient.endpoint, CfwClient.version, credential, region, profile);
    }

    /**
     *添加互联网边界规则
     * @param req AddAcRuleRequest
     * @return AddAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddAcRuleResponse AddAcRule(AddAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAcRule", AddAcRuleResponse.class);
    }

    /**
     *添加互联网边界访问控制规则
     * @param req AddAclRuleRequest
     * @return AddAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddAclRuleResponse AddAclRule(AddAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAclRule", AddAclRuleResponse.class);
    }

    /**
     *创建新企业安全组规则
     * @param req AddEnterpriseSecurityGroupRulesRequest
     * @return AddEnterpriseSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddEnterpriseSecurityGroupRulesResponse AddEnterpriseSecurityGroupRules(AddEnterpriseSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddEnterpriseSecurityGroupRules", AddEnterpriseSecurityGroupRulesResponse.class);
    }

    /**
     *添加nat访问控制规则
     * @param req AddNatAcRuleRequest
     * @return AddNatAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddNatAcRuleResponse AddNatAcRule(AddNatAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNatAcRule", AddNatAcRuleResponse.class);
    }

    /**
     *添加VPC内网间规则
     * @param req AddVpcAcRuleRequest
     * @return AddVpcAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddVpcAcRuleResponse AddVpcAcRule(AddVpcAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddVpcAcRule", AddVpcAcRuleResponse.class);
    }

    /**
     *创建访问控制规则
     * @param req CreateAcRulesRequest
     * @return CreateAcRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAcRulesResponse CreateAcRules(CreateAcRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAcRules", CreateAcRulesResponse.class);
    }

    /**
     *创建地址模板规则
     * @param req CreateAddressTemplateRequest
     * @return CreateAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateResponse CreateAddressTemplate(CreateAddressTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAddressTemplate", CreateAddressTemplateResponse.class);
    }

    /**
     *用户告警中心-封隔离处置按钮
     * @param req CreateAlertCenterIsolateRequest
     * @return CreateAlertCenterIsolateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertCenterIsolateResponse CreateAlertCenterIsolate(CreateAlertCenterIsolateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertCenterIsolate", CreateAlertCenterIsolateResponse.class);
    }

    /**
     *用户告警中心-忽略处置按钮
     * @param req CreateAlertCenterOmitRequest
     * @return CreateAlertCenterOmitResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertCenterOmitResponse CreateAlertCenterOmit(CreateAlertCenterOmitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertCenterOmit", CreateAlertCenterOmitResponse.class);
    }

    /**
     *用户告警中心-封禁、放通处置按钮
     * @param req CreateAlertCenterRuleRequest
     * @return CreateAlertCenterRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateAlertCenterRuleResponse CreateAlertCenterRule(CreateAlertCenterRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAlertCenterRule", CreateAlertCenterRuleResponse.class);
    }

    /**
     *批量添加入侵防御封禁列表、放通列表规则
     * @param req CreateBlockIgnoreRuleListRequest
     * @return CreateBlockIgnoreRuleListResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlockIgnoreRuleListResponse CreateBlockIgnoreRuleList(CreateBlockIgnoreRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBlockIgnoreRuleList", CreateBlockIgnoreRuleListResponse.class);
    }

    /**
     *批量添加入侵防御封禁列表、放通列表规则
     * @param req CreateBlockIgnoreRuleNewRequest
     * @return CreateBlockIgnoreRuleNewResponse
     * @throws TencentCloudSDKException
     */
    public CreateBlockIgnoreRuleNewResponse CreateBlockIgnoreRuleNew(CreateBlockIgnoreRuleNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBlockIgnoreRuleNew", CreateBlockIgnoreRuleNewResponse.class);
    }

    /**
     *创建、选择vpc
     * @param req CreateChooseVpcsRequest
     * @return CreateChooseVpcsResponse
     * @throws TencentCloudSDKException
     */
    public CreateChooseVpcsResponse CreateChooseVpcs(CreateChooseVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateChooseVpcs", CreateChooseVpcsResponse.class);
    }

    /**
     *创建暴露数据库白名单规则
     * @param req CreateDatabaseWhiteListRulesRequest
     * @return CreateDatabaseWhiteListRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseWhiteListRulesResponse CreateDatabaseWhiteListRules(CreateDatabaseWhiteListRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDatabaseWhiteListRules", CreateDatabaseWhiteListRulesResponse.class);
    }

    /**
     *创建入侵防御规则白名单接口
     * @param req CreateIdsWhiteRuleRequest
     * @return CreateIdsWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateIdsWhiteRuleResponse CreateIdsWhiteRule(CreateIdsWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIdsWhiteRule", CreateIdsWhiteRuleResponse.class);
    }

    /**
     *创建NAT防火墙实例（Region参数必填）
     * @param req CreateNatFwInstanceRequest
     * @return CreateNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatFwInstanceResponse CreateNatFwInstance(CreateNatFwInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatFwInstance", CreateNatFwInstanceResponse.class);
    }

    /**
     *创建防火墙实例和接入域名（Region参数必填）
     * @param req CreateNatFwInstanceWithDomainRequest
     * @return CreateNatFwInstanceWithDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatFwInstanceWithDomainResponse CreateNatFwInstanceWithDomain(CreateNatFwInstanceWithDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNatFwInstanceWithDomain", CreateNatFwInstanceWithDomainResponse.class);
    }

    /**
     *创建企业安全组规则
     * @param req CreateSecurityGroupRulesRequest
     * @return CreateSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupRulesResponse CreateSecurityGroupRules(CreateSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecurityGroupRules", CreateSecurityGroupRulesResponse.class);
    }

    /**
     *创建VPC间防火墙(防火墙组)
     * @param req CreateVpcFwGroupRequest
     * @return CreateVpcFwGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcFwGroupResponse CreateVpcFwGroup(CreateVpcFwGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVpcFwGroup", CreateVpcFwGroupResponse.class);
    }

    /**
     *删除规则
     * @param req DeleteAcRuleRequest
     * @return DeleteAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAcRuleResponse DeleteAcRule(DeleteAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAcRule", DeleteAcRuleResponse.class);
    }

    /**
     *删除地址模板规则
     * @param req DeleteAddressTemplateRequest
     * @return DeleteAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateResponse DeleteAddressTemplate(DeleteAddressTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddressTemplate", DeleteAddressTemplateResponse.class);
    }

    /**
     *全部删除规则
     * @param req DeleteAllAccessControlRuleRequest
     * @return DeleteAllAccessControlRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllAccessControlRuleResponse DeleteAllAccessControlRule(DeleteAllAccessControlRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAllAccessControlRule", DeleteAllAccessControlRuleResponse.class);
    }

    /**
     *批量删除入侵防御封禁列表、放通列表规则
     * @param req DeleteBlockIgnoreRuleListRequest
     * @return DeleteBlockIgnoreRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlockIgnoreRuleListResponse DeleteBlockIgnoreRuleList(DeleteBlockIgnoreRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlockIgnoreRuleList", DeleteBlockIgnoreRuleListResponse.class);
    }

    /**
     *批量删除入侵防御封禁列表、放通列表规则（新）
     * @param req DeleteBlockIgnoreRuleNewRequest
     * @return DeleteBlockIgnoreRuleNewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBlockIgnoreRuleNewResponse DeleteBlockIgnoreRuleNew(DeleteBlockIgnoreRuleNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBlockIgnoreRuleNew", DeleteBlockIgnoreRuleNewResponse.class);
    }

    /**
     *删除入侵防御规则白名单接口
     * @param req DeleteIdsWhiteRuleRequest
     * @return DeleteIdsWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIdsWhiteRuleResponse DeleteIdsWhiteRule(DeleteIdsWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIdsWhiteRule", DeleteIdsWhiteRuleResponse.class);
    }

    /**
     *销毁防火墙实例
     * @param req DeleteNatFwInstanceRequest
     * @return DeleteNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatFwInstanceResponse DeleteNatFwInstance(DeleteNatFwInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNatFwInstance", DeleteNatFwInstanceResponse.class);
    }

    /**
     *删除远程运维域名
     * @param req DeleteRemoteAccessDomainRequest
     * @return DeleteRemoteAccessDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRemoteAccessDomainResponse DeleteRemoteAccessDomain(DeleteRemoteAccessDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRemoteAccessDomain", DeleteRemoteAccessDomainResponse.class);
    }

    /**
     *DeleteResourceGroup-资产中心资产组删除
     * @param req DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceGroupResponse DeleteResourceGroup(DeleteResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteResourceGroup", DeleteResourceGroupResponse.class);
    }

    /**
     *删除规则
     * @param req DeleteSecurityGroupRuleRequest
     * @return DeleteSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupRuleResponse DeleteSecurityGroupRule(DeleteSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecurityGroupRule", DeleteSecurityGroupRuleResponse.class);
    }

    /**
     *删除防火墙(组)，或者删除其中实例
     * @param req DeleteVpcFwGroupRequest
     * @return DeleteVpcFwGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcFwGroupResponse DeleteVpcFwGroup(DeleteVpcFwGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteVpcFwGroup", DeleteVpcFwGroupResponse.class);
    }

    /**
     *访问控制列表
     * @param req DescribeAcListsRequest
     * @return DescribeAcListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAcListsResponse DescribeAcLists(DescribeAcListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAcLists", DescribeAcListsResponse.class);
    }

    /**
     *查询互联网边界访问控制列表
     * @param req DescribeAclRuleRequest
     * @return DescribeAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAclRuleResponse DescribeAclRule(DescribeAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAclRule", DescribeAclRuleResponse.class);
    }

    /**
     *查询地址模板列表
     * @param req DescribeAddressTemplateListRequest
     * @return DescribeAddressTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplateListResponse DescribeAddressTemplateList(DescribeAddressTemplateListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddressTemplateList", DescribeAddressTemplateListResponse.class);
    }

    /**
     *资产同步状态查询
     * @param req DescribeAssetSyncRequest
     * @return DescribeAssetSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetSyncResponse DescribeAssetSync(DescribeAssetSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetSync", DescribeAssetSyncResponse.class);
    }

    /**
     *获取安全组关联实例列表
     * @param req DescribeAssociatedInstanceListRequest
     * @return DescribeAssociatedInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssociatedInstanceListResponse DescribeAssociatedInstanceList(DescribeAssociatedInstanceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssociatedInstanceList", DescribeAssociatedInstanceListResponse.class);
    }

    /**
     *DescribeBlockByIpTimesList 告警中心阻断IP折线图
     * @param req DescribeBlockByIpTimesListRequest
     * @return DescribeBlockByIpTimesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockByIpTimesListResponse DescribeBlockByIpTimesList(DescribeBlockByIpTimesListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockByIpTimesList", DescribeBlockByIpTimesListResponse.class);
    }

    /**
     *查询入侵防御放通封禁列表
     * @param req DescribeBlockIgnoreListRequest
     * @return DescribeBlockIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockIgnoreListResponse DescribeBlockIgnoreList(DescribeBlockIgnoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockIgnoreList", DescribeBlockIgnoreListResponse.class);
    }

    /**
     *DescribeBlockStaticList 告警中心柱形图
     * @param req DescribeBlockStaticListRequest
     * @return DescribeBlockStaticListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockStaticListResponse DescribeBlockStaticList(DescribeBlockStaticListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBlockStaticList", DescribeBlockStaticListResponse.class);
    }

    /**
     *查询防火墙弹性公网IP
     * @param req DescribeCfwEipsRequest
     * @return DescribeCfwEipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfwEipsResponse DescribeCfwEips(DescribeCfwEipsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCfwEips", DescribeCfwEipsResponse.class);
    }

    /**
     *获取入侵防御按钮列表
     * @param req DescribeDefenseSwitchRequest
     * @return DescribeDefenseSwitchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDefenseSwitchResponse DescribeDefenseSwitch(DescribeDefenseSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDefenseSwitch", DescribeDefenseSwitchResponse.class);
    }

    /**
     *查询新版安全组下发进度
     * @param req DescribeEnterpriseSGRuleProgressRequest
     * @return DescribeEnterpriseSGRuleProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnterpriseSGRuleProgressResponse DescribeEnterpriseSGRuleProgress(DescribeEnterpriseSGRuleProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnterpriseSGRuleProgress", DescribeEnterpriseSGRuleProgressResponse.class);
    }

    /**
     *查询新企业安全组规则
     * @param req DescribeEnterpriseSecurityGroupRuleRequest
     * @return DescribeEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnterpriseSecurityGroupRuleResponse DescribeEnterpriseSecurityGroupRule(DescribeEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnterpriseSecurityGroupRule", DescribeEnterpriseSecurityGroupRuleResponse.class);
    }

    /**
     *查询新企业安全组规则  从node接口迁移   原接口DescribeSecurityGroupNewList
     * @param req DescribeEnterpriseSecurityGroupRuleListRequest
     * @return DescribeEnterpriseSecurityGroupRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnterpriseSecurityGroupRuleListResponse DescribeEnterpriseSecurityGroupRuleList(DescribeEnterpriseSecurityGroupRuleListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnterpriseSecurityGroupRuleList", DescribeEnterpriseSecurityGroupRuleListResponse.class);
    }

    /**
     *串行防火墙IP开关列表
     * @param req DescribeFwEdgeIpsRequest
     * @return DescribeFwEdgeIpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFwEdgeIpsResponse DescribeFwEdgeIps(DescribeFwEdgeIpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFwEdgeIps", DescribeFwEdgeIpsResponse.class);
    }

    /**
     *获取租户所有VPC防火墙(组)及VPC防火墙实例卡片信息
     * @param req DescribeFwGroupInstanceInfoRequest
     * @return DescribeFwGroupInstanceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFwGroupInstanceInfoResponse DescribeFwGroupInstanceInfo(DescribeFwGroupInstanceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFwGroupInstanceInfo", DescribeFwGroupInstanceInfoResponse.class);
    }

    /**
     *获取防火墙同步状态，一般在执行同步操作后查询
     * @param req DescribeFwSyncStatusRequest
     * @return DescribeFwSyncStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFwSyncStatusResponse DescribeFwSyncStatus(DescribeFwSyncStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFwSyncStatus", DescribeFwSyncStatusResponse.class);
    }

    /**
     *DescribeGuideScanInfo新手引导扫描接口信息
     * @param req DescribeGuideScanInfoRequest
     * @return DescribeGuideScanInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGuideScanInfoResponse DescribeGuideScanInfo(DescribeGuideScanInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGuideScanInfo", DescribeGuideScanInfoResponse.class);
    }

    /**
     *IP防护状态查询
     * @param req DescribeIPStatusListRequest
     * @return DescribeIPStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStatusListResponse DescribeIPStatusList(DescribeIPStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPStatusList", DescribeIPStatusListResponse.class);
    }

    /**
     *查询入侵防御规则白名单接口
     * @param req DescribeIdsWhiteRuleRequest
     * @return DescribeIdsWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIdsWhiteRuleResponse DescribeIdsWhiteRule(DescribeIdsWhiteRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIdsWhiteRule", DescribeIdsWhiteRuleResponse.class);
    }

    /**
     *日志审计日志查询
     * @param req DescribeLogsRequest
     * @return DescribeLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsResponse DescribeLogs(DescribeLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogs", DescribeLogsResponse.class);
    }

    /**
     *查询NAT访问控制列表
     * @param req DescribeNatAcRuleRequest
     * @return DescribeNatAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatAcRuleResponse DescribeNatAcRule(DescribeNatAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatAcRule", DescribeNatAcRuleResponse.class);
    }

    /**
     *查询Nat防火墙Dnat规则
     * @param req DescribeNatFwDnatRuleRequest
     * @return DescribeNatFwDnatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwDnatRuleResponse DescribeNatFwDnatRule(DescribeNatFwDnatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatFwDnatRule", DescribeNatFwDnatRuleResponse.class);
    }

    /**
     *获取当前用户接入nat防火墙的所有子网数及natfw实例个数
     * @param req DescribeNatFwInfoCountRequest
     * @return DescribeNatFwInfoCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInfoCountResponse DescribeNatFwInfoCount(DescribeNatFwInfoCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatFwInfoCount", DescribeNatFwInfoCountResponse.class);
    }

    /**
     *DescribeNatFwInstance 获取租户所有NAT实例
     * @param req DescribeNatFwInstanceRequest
     * @return DescribeNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstanceResponse DescribeNatFwInstance(DescribeNatFwInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatFwInstance", DescribeNatFwInstanceResponse.class);
    }

    /**
     *GetNatFwInstanceWithRegion 获取租户新增运维的NAT实例，带上地域
     * @param req DescribeNatFwInstanceWithRegionRequest
     * @return DescribeNatFwInstanceWithRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstanceWithRegionResponse DescribeNatFwInstanceWithRegion(DescribeNatFwInstanceWithRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatFwInstanceWithRegion", DescribeNatFwInstanceWithRegionResponse.class);
    }

    /**
     *GetNatInstance 获取租户所有NAT实例及实例卡片信息
     * @param req DescribeNatFwInstancesInfoRequest
     * @return DescribeNatFwInstancesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstancesInfoResponse DescribeNatFwInstancesInfo(DescribeNatFwInstancesInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatFwInstancesInfo", DescribeNatFwInstancesInfoResponse.class);
    }

    /**
     *展示当前natfw 实例对应的vpc dns开关
     * @param req DescribeNatFwVpcDnsLstRequest
     * @return DescribeNatFwVpcDnsLstResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwVpcDnsLstResponse DescribeNatFwVpcDnsLst(DescribeNatFwVpcDnsLstRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNatFwVpcDnsLst", DescribeNatFwVpcDnsLstResponse.class);
    }

    /**
     *DescribeResourceGroup资产中心资产树信息
     * @param req DescribeResourceGroupRequest
     * @return DescribeResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupResponse DescribeResourceGroup(DescribeResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceGroup", DescribeResourceGroupResponse.class);
    }

    /**
     *资产中心资产组数数据信息查询
     * @param req DescribeResourceGroupNewRequest
     * @return DescribeResourceGroupNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupNewResponse DescribeResourceGroupNew(DescribeResourceGroupNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceGroupNew", DescribeResourceGroupNewResponse.class);
    }

    /**
     *查询规则列表概况
     * @param req DescribeRuleOverviewRequest
     * @return DescribeRuleOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleOverviewResponse DescribeRuleOverview(DescribeRuleOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRuleOverview", DescribeRuleOverviewResponse.class);
    }

    /**
     *查询安全组规则列表
     * @param req DescribeSecurityGroupListRequest
     * @return DescribeSecurityGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupListResponse DescribeSecurityGroupList(DescribeSecurityGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecurityGroupList", DescribeSecurityGroupListResponse.class);
    }

    /**
     *DescribeSourceAsset-查询全部资产信息
     * @param req DescribeSourceAssetRequest
     * @return DescribeSourceAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceAssetResponse DescribeSourceAsset(DescribeSourceAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceAsset", DescribeSourceAssetResponse.class);
    }

    /**
     *历史接口，已经废弃，产品有新的替代接口

防火墙开关列表，已废弃，请使用DescribeFwEdgeIps
     * @param req DescribeSwitchListsRequest
     * @return DescribeSwitchListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSwitchListsResponse DescribeSwitchLists(DescribeSwitchListsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSwitchLists", DescribeSwitchListsResponse.class);
    }

    /**
     *DescribeTLogInfo告警中心概况查询
     * @param req DescribeTLogInfoRequest
     * @return DescribeTLogInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTLogInfoResponse DescribeTLogInfo(DescribeTLogInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTLogInfo", DescribeTLogInfoResponse.class);
    }

    /**
     *DescribeTLogIpList告警中心IP柱形图
     * @param req DescribeTLogIpListRequest
     * @return DescribeTLogIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTLogIpListResponse DescribeTLogIpList(DescribeTLogIpListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTLogIpList", DescribeTLogIpListResponse.class);
    }

    /**
     *查询规则表状态
     * @param req DescribeTableStatusRequest
     * @return DescribeTableStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableStatusResponse DescribeTableStatus(DescribeTableStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTableStatus", DescribeTableStatusResponse.class);
    }

    /**
     *DescribeUnHandleEventTabList 告警中心伪攻击链事件未处置接口
     * @param req DescribeUnHandleEventTabListRequest
     * @return DescribeUnHandleEventTabListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnHandleEventTabListResponse DescribeUnHandleEventTabList(DescribeUnHandleEventTabListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUnHandleEventTabList", DescribeUnHandleEventTabListResponse.class);
    }

    /**
     *查询内网间访问控制列表
     * @param req DescribeVpcAcRuleRequest
     * @return DescribeVpcAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAcRuleResponse DescribeVpcAcRule(DescribeVpcAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcAcRule", DescribeVpcAcRuleResponse.class);
    }

    /**
     *VPC防火墙(组)开关列表
     * @param req DescribeVpcFwGroupSwitchRequest
     * @return DescribeVpcFwGroupSwitchResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcFwGroupSwitchResponse DescribeVpcFwGroupSwitch(DescribeVpcFwGroupSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcFwGroupSwitch", DescribeVpcFwGroupSwitchResponse.class);
    }

    /**
     *防火墙垂直扩容
     * @param req ExpandCfwVerticalRequest
     * @return ExpandCfwVerticalResponse
     * @throws TencentCloudSDKException
     */
    public ExpandCfwVerticalResponse ExpandCfwVertical(ExpandCfwVerticalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ExpandCfwVertical", ExpandCfwVerticalResponse.class);
    }

    /**
     *修改规则
     * @param req ModifyAcRuleRequest
     * @return ModifyAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAcRuleResponse ModifyAcRule(ModifyAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAcRule", ModifyAcRuleResponse.class);
    }

    /**
     *修改互联网边界访问控制规则
     * @param req ModifyAclRuleRequest
     * @return ModifyAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAclRuleResponse ModifyAclRule(ModifyAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAclRule", ModifyAclRuleResponse.class);
    }

    /**
     *修改地址模板
     * @param req ModifyAddressTemplateRequest
     * @return ModifyAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateResponse ModifyAddressTemplate(ModifyAddressTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAddressTemplate", ModifyAddressTemplateResponse.class);
    }

    /**
     *互联网边界防火墙一键开关
     * @param req ModifyAllPublicIPSwitchStatusRequest
     * @return ModifyAllPublicIPSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllPublicIPSwitchStatusResponse ModifyAllPublicIPSwitchStatus(ModifyAllPublicIPSwitchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAllPublicIPSwitchStatus", ModifyAllPublicIPSwitchStatusResponse.class);
    }

    /**
     *启用停用全部规则
     * @param req ModifyAllRuleStatusRequest
     * @return ModifyAllRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllRuleStatusResponse ModifyAllRuleStatus(ModifyAllRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAllRuleStatus", ModifyAllRuleStatusResponse.class);
    }

    /**
     *该接口已不再使用

VPC防火墙一键开关
     * @param req ModifyAllVPCSwitchStatusRequest
     * @return ModifyAllVPCSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllVPCSwitchStatusResponse ModifyAllVPCSwitchStatus(ModifyAllVPCSwitchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAllVPCSwitchStatus", ModifyAllVPCSwitchStatusResponse.class);
    }

    /**
     *资产扫描
     * @param req ModifyAssetScanRequest
     * @return ModifyAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetScanResponse ModifyAssetScan(ModifyAssetScanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetScan", ModifyAssetScanResponse.class);
    }

    /**
     *资产同步
     * @param req ModifyAssetSyncRequest
     * @return ModifyAssetSyncResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetSyncResponse ModifyAssetSync(ModifyAssetSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAssetSync", ModifyAssetSyncResponse.class);
    }

    /**
     *支持对封禁列表、放通列表如下操作：
批量增加封禁IP、放通IP/域名
批量删除封禁IP、放通IP/域名
批量修改封禁IP、放通IP/域名生效事件
     * @param req ModifyBlockIgnoreListRequest
     * @return ModifyBlockIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIgnoreListResponse ModifyBlockIgnoreList(ModifyBlockIgnoreListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlockIgnoreList", ModifyBlockIgnoreListResponse.class);
    }

    /**
     *编辑单条入侵防御封禁列表、放通列表规则
     * @param req ModifyBlockIgnoreRuleRequest
     * @return ModifyBlockIgnoreRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIgnoreRuleResponse ModifyBlockIgnoreRule(ModifyBlockIgnoreRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlockIgnoreRule", ModifyBlockIgnoreRuleResponse.class);
    }

    /**
     *编辑单条入侵防御封禁列表、放通列表规则（新）
     * @param req ModifyBlockIgnoreRuleNewRequest
     * @return ModifyBlockIgnoreRuleNewResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIgnoreRuleNewResponse ModifyBlockIgnoreRuleNew(ModifyBlockIgnoreRuleNewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlockIgnoreRuleNew", ModifyBlockIgnoreRuleNewResponse.class);
    }

    /**
     *ModifyBlockTop取消置顶接口
     * @param req ModifyBlockTopRequest
     * @return ModifyBlockTopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockTopResponse ModifyBlockTop(ModifyBlockTopRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBlockTop", ModifyBlockTopResponse.class);
    }

    /**
     *启用停用VPC间规则或Nat边界规则
VPC间规则需指定EdgeId。Nat边界规则需指定地域Region与Direction。
     * @param req ModifyEWRuleStatusRequest
     * @return ModifyEWRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEWRuleStatusResponse ModifyEWRuleStatus(ModifyEWRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEWRuleStatus", ModifyEWRuleStatusResponse.class);
    }

    /**
     *修改边界防火墙开关(旁路、串行)
     * @param req ModifyEdgeIpSwitchRequest
     * @return ModifyEdgeIpSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeIpSwitchResponse ModifyEdgeIpSwitch(ModifyEdgeIpSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeIpSwitch", ModifyEdgeIpSwitchResponse.class);
    }

    /**
     *修改企业安全组下发状态
     * @param req ModifyEnterpriseSecurityDispatchStatusRequest
     * @return ModifyEnterpriseSecurityDispatchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnterpriseSecurityDispatchStatusResponse ModifyEnterpriseSecurityDispatchStatus(ModifyEnterpriseSecurityDispatchStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnterpriseSecurityDispatchStatus", ModifyEnterpriseSecurityDispatchStatusResponse.class);
    }

    /**
     *编辑新企业安全组规则
     * @param req ModifyEnterpriseSecurityGroupRuleRequest
     * @return ModifyEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnterpriseSecurityGroupRuleResponse ModifyEnterpriseSecurityGroupRule(ModifyEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnterpriseSecurityGroupRule", ModifyEnterpriseSecurityGroupRuleResponse.class);
    }

    /**
     *修改防火墙(组)开关(支持单点模式、多点模式、全互通模式)
     * @param req ModifyFwGroupSwitchRequest
     * @return ModifyFwGroupSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFwGroupSwitchResponse ModifyFwGroupSwitch(ModifyFwGroupSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFwGroupSwitch", ModifyFwGroupSwitchResponse.class);
    }

    /**
     *修改NAT访问控制规则
     * @param req ModifyNatAcRuleRequest
     * @return ModifyNatAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatAcRuleResponse ModifyNatAcRule(ModifyNatAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatAcRule", ModifyNatAcRuleResponse.class);
    }

    /**
     *防火墙实例重新选择vpc或nat
     * @param req ModifyNatFwReSelectRequest
     * @return ModifyNatFwReSelectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwReSelectResponse ModifyNatFwReSelect(ModifyNatFwReSelectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatFwReSelect", ModifyNatFwReSelectResponse.class);
    }

    /**
     *修改NAT防火墙开关
     * @param req ModifyNatFwSwitchRequest
     * @return ModifyNatFwSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwSwitchResponse ModifyNatFwSwitch(ModifyNatFwSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatFwSwitch", ModifyNatFwSwitchResponse.class);
    }

    /**
     *nat 防火墙VPC DNS 开关切换
     * @param req ModifyNatFwVpcDnsSwitchRequest
     * @return ModifyNatFwVpcDnsSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwVpcDnsSwitchResponse ModifyNatFwVpcDnsSwitch(ModifyNatFwVpcDnsSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatFwVpcDnsSwitch", ModifyNatFwVpcDnsSwitchResponse.class);
    }

    /**
     *编辑NAT防火墙
     * @param req ModifyNatInstanceRequest
     * @return ModifyNatInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatInstanceResponse ModifyNatInstance(ModifyNatInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatInstance", ModifyNatInstanceResponse.class);
    }

    /**
     *NAT防火墙规则快速排序
     * @param req ModifyNatSequenceRulesRequest
     * @return ModifyNatSequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatSequenceRulesResponse ModifyNatSequenceRules(ModifyNatSequenceRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNatSequenceRules", ModifyNatSequenceRulesResponse.class);
    }

    /**
     *ModifyResourceGroup-资产中心资产组信息修改
     * @param req ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceGroupResponse ModifyResourceGroup(ModifyResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceGroup", ModifyResourceGroupResponse.class);
    }

    /**
     *同步资产-互联网&VPC（新）
     * @param req ModifyRunSyncAssetRequest
     * @return ModifyRunSyncAssetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRunSyncAssetResponse ModifyRunSyncAsset(ModifyRunSyncAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRunSyncAsset", ModifyRunSyncAssetResponse.class);
    }

    /**
     *启用停用单条企业安全组规则
     * @param req ModifySecurityGroupItemRuleStatusRequest
     * @return ModifySecurityGroupItemRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupItemRuleStatusResponse ModifySecurityGroupItemRuleStatus(ModifySecurityGroupItemRuleStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupItemRuleStatus", ModifySecurityGroupItemRuleStatusResponse.class);
    }

    /**
     *编辑单条安全组规则
     * @param req ModifySecurityGroupRuleRequest
     * @return ModifySecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupRuleResponse ModifySecurityGroupRule(ModifySecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupRule", ModifySecurityGroupRuleResponse.class);
    }

    /**
     *企业安全组规则快速排序
     * @param req ModifySecurityGroupSequenceRulesRequest
     * @return ModifySecurityGroupSequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupSequenceRulesResponse ModifySecurityGroupSequenceRules(ModifySecurityGroupSequenceRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecurityGroupSequenceRules", ModifySecurityGroupSequenceRulesResponse.class);
    }

    /**
     *互联网边界规则快速排序
     * @param req ModifySequenceAclRulesRequest
     * @return ModifySequenceAclRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySequenceAclRulesResponse ModifySequenceAclRules(ModifySequenceAclRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySequenceAclRules", ModifySequenceAclRulesResponse.class);
    }

    /**
     *修改规则执行顺序
     * @param req ModifySequenceRulesRequest
     * @return ModifySequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySequenceRulesResponse ModifySequenceRules(ModifySequenceRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySequenceRules", ModifySequenceRulesResponse.class);
    }

    /**
     *日志存储设置，可以修改存储时间和清空日志
     * @param req ModifyStorageSettingRequest
     * @return ModifyStorageSettingResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStorageSettingResponse ModifyStorageSetting(ModifyStorageSettingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyStorageSetting", ModifyStorageSettingResponse.class);
    }

    /**
     *修改规则表状态
     * @param req ModifyTableStatusRequest
     * @return ModifyTableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableStatusResponse ModifyTableStatus(ModifyTableStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyTableStatus", ModifyTableStatusResponse.class);
    }

    /**
     *修改内网间访问控制规则
     * @param req ModifyVpcAcRuleRequest
     * @return ModifyVpcAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAcRuleResponse ModifyVpcAcRule(ModifyVpcAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcAcRule", ModifyVpcAcRuleResponse.class);
    }

    /**
     *编辑VPC间防火墙(防火墙组)
     * @param req ModifyVpcFwGroupRequest
     * @return ModifyVpcFwGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcFwGroupResponse ModifyVpcFwGroup(ModifyVpcFwGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcFwGroup", ModifyVpcFwGroupResponse.class);
    }

    /**
     *vpc间规则快速排序
     * @param req ModifyVpcFwSequenceRulesRequest
     * @return ModifyVpcFwSequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcFwSequenceRulesResponse ModifyVpcFwSequenceRules(ModifyVpcFwSequenceRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyVpcFwSequenceRules", ModifyVpcFwSequenceRulesResponse.class);
    }

    /**
     *删除互联网边界规则
     * @param req RemoveAcRuleRequest
     * @return RemoveAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAcRuleResponse RemoveAcRule(RemoveAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveAcRule", RemoveAcRuleResponse.class);
    }

    /**
     *删除互联网边界访问控制规则
     * @param req RemoveAclRuleRequest
     * @return RemoveAclRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAclRuleResponse RemoveAclRule(RemoveAclRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveAclRule", RemoveAclRuleResponse.class);
    }

    /**
     *删除新企业安全组规则
     * @param req RemoveEnterpriseSecurityGroupRuleRequest
     * @return RemoveEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveEnterpriseSecurityGroupRuleResponse RemoveEnterpriseSecurityGroupRule(RemoveEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveEnterpriseSecurityGroupRule", RemoveEnterpriseSecurityGroupRuleResponse.class);
    }

    /**
     *删除NAT访问控制规则
     * @param req RemoveNatAcRuleRequest
     * @return RemoveNatAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveNatAcRuleResponse RemoveNatAcRule(RemoveNatAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveNatAcRule", RemoveNatAcRuleResponse.class);
    }

    /**
     *删除VPC间规则
     * @param req RemoveVpcAcRuleRequest
     * @return RemoveVpcAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveVpcAcRuleResponse RemoveVpcAcRule(RemoveVpcAcRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveVpcAcRule", RemoveVpcAcRuleResponse.class);
    }

    /**
     *配置防火墙Dnat规则
     * @param req SetNatFwDnatRuleRequest
     * @return SetNatFwDnatRuleResponse
     * @throws TencentCloudSDKException
     */
    public SetNatFwDnatRuleResponse SetNatFwDnatRule(SetNatFwDnatRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNatFwDnatRule", SetNatFwDnatRuleResponse.class);
    }

    /**
     *设置防火墙实例弹性公网ip，目前仅支持新增模式的防火墙实例
     * @param req SetNatFwEipRequest
     * @return SetNatFwEipResponse
     * @throws TencentCloudSDKException
     */
    public SetNatFwEipResponse SetNatFwEip(SetNatFwEipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNatFwEip", SetNatFwEipResponse.class);
    }

    /**
     *中止安全组规则下发
     * @param req StopSecurityGroupRuleDispatchRequest
     * @return StopSecurityGroupRuleDispatchResponse
     * @throws TencentCloudSDKException
     */
    public StopSecurityGroupRuleDispatchResponse StopSecurityGroupRuleDispatch(StopSecurityGroupRuleDispatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopSecurityGroupRuleDispatch", StopSecurityGroupRuleDispatchResponse.class);
    }

    /**
     *同步防火墙操作，包括同步防火墙路由（若vpc，专线网关等增加了Cidr，需要手动同步一下路由使之在防火墙上生效）等。
     * @param req SyncFwOperateRequest
     * @return SyncFwOperateResponse
     * @throws TencentCloudSDKException
     */
    public SyncFwOperateResponse SyncFwOperate(SyncFwOperateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncFwOperate", SyncFwOperateResponse.class);
    }

}
