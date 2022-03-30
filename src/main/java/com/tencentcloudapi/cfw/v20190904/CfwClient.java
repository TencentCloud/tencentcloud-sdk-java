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
        JsonResponseModel<AddAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建新企业安全组规则
     * @param req AddEnterpriseSecurityGroupRulesRequest
     * @return AddEnterpriseSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddEnterpriseSecurityGroupRulesResponse AddEnterpriseSecurityGroupRules(AddEnterpriseSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddEnterpriseSecurityGroupRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddEnterpriseSecurityGroupRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddEnterpriseSecurityGroupRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建规则
     * @param req CreateAcRulesRequest
     * @return CreateAcRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAcRulesResponse CreateAcRules(CreateAcRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAcRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAcRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAcRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建、选择vpc
     * @param req CreateChooseVpcsRequest
     * @return CreateChooseVpcsResponse
     * @throws TencentCloudSDKException
     */
    public CreateChooseVpcsResponse CreateChooseVpcs(CreateChooseVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateChooseVpcsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateChooseVpcsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateChooseVpcs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建暴露数据库白名单规则
     * @param req CreateDatabaseWhiteListRulesRequest
     * @return CreateDatabaseWhiteListRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatabaseWhiteListRulesResponse CreateDatabaseWhiteListRules(CreateDatabaseWhiteListRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatabaseWhiteListRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatabaseWhiteListRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDatabaseWhiteListRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建防火墙实例
     * @param req CreateNatFwInstanceRequest
     * @return CreateNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatFwInstanceResponse CreateNatFwInstance(CreateNatFwInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatFwInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatFwInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatFwInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建防火墙实例和接入域名
     * @param req CreateNatFwInstanceWithDomainRequest
     * @return CreateNatFwInstanceWithDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatFwInstanceWithDomainResponse CreateNatFwInstanceWithDomain(CreateNatFwInstanceWithDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatFwInstanceWithDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNatFwInstanceWithDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNatFwInstanceWithDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建安全组API规则
     * @param req CreateSecurityGroupApiRulesRequest
     * @return CreateSecurityGroupApiRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupApiRulesResponse CreateSecurityGroupApiRules(CreateSecurityGroupApiRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupApiRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupApiRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupApiRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建企业安全组规则
     * @param req CreateSecurityGroupRulesRequest
     * @return CreateSecurityGroupRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupRulesResponse CreateSecurityGroupRules(CreateSecurityGroupRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecurityGroupRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecurityGroupRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除规则
     * @param req DeleteAcRuleRequest
     * @return DeleteAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAcRuleResponse DeleteAcRule(DeleteAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *全部删除规则
     * @param req DeleteAllAccessControlRuleRequest
     * @return DeleteAllAccessControlRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAllAccessControlRuleResponse DeleteAllAccessControlRule(DeleteAllAccessControlRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAllAccessControlRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAllAccessControlRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAllAccessControlRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁防火墙实例
     * @param req DeleteNatFwInstanceRequest
     * @return DeleteNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatFwInstanceResponse DeleteNatFwInstance(DeleteNatFwInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatFwInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNatFwInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNatFwInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DeleteResourceGroup-资产中心资产组删除
     * @param req DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceGroupResponse DeleteResourceGroup(DeleteResourceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResourceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除全部规则
     * @param req DeleteSecurityGroupAllRuleRequest
     * @return DeleteSecurityGroupAllRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupAllRuleResponse DeleteSecurityGroupAllRule(DeleteSecurityGroupAllRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupAllRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupAllRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroupAllRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除规则
     * @param req DeleteSecurityGroupRuleRequest
     * @return DeleteSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupRuleResponse DeleteSecurityGroupRule(DeleteSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除防火墙实例
     * @param req DeleteVpcInstanceRequest
     * @return DeleteVpcInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcInstanceResponse DeleteVpcInstance(DeleteVpcInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVpcInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVpcInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *访问控制列表
     * @param req DescribeAcListsRequest
     * @return DescribeAcListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAcListsResponse DescribeAcLists(DescribeAcListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAcListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAcListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAcLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取地址模板列表
     * @param req DescribeAddrTemplateListRequest
     * @return DescribeAddrTemplateListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddrTemplateListResponse DescribeAddrTemplateList(DescribeAddrTemplateListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddrTemplateListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAddrTemplateListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAddrTemplateList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全组关联实例列表
     * @param req DescribeAssociatedInstanceListRequest
     * @return DescribeAssociatedInstanceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssociatedInstanceListResponse DescribeAssociatedInstanceList(DescribeAssociatedInstanceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssociatedInstanceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssociatedInstanceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssociatedInstanceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeBlockByIpTimesList 告警中心阻断IP折线图

     * @param req DescribeBlockByIpTimesListRequest
     * @return DescribeBlockByIpTimesListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockByIpTimesListResponse DescribeBlockByIpTimesList(DescribeBlockByIpTimesListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlockByIpTimesListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlockByIpTimesListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlockByIpTimesList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeBlockStaticList 告警中心柱形图

     * @param req DescribeBlockStaticListRequest
     * @return DescribeBlockStaticListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBlockStaticListResponse DescribeBlockStaticList(DescribeBlockStaticListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBlockStaticListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBlockStaticListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBlockStaticList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询防火墙弹性公网IP
     * @param req DescribeCfwEipsRequest
     * @return DescribeCfwEipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCfwEipsResponse DescribeCfwEips(DescribeCfwEipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCfwEipsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCfwEipsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCfwEips");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询新企业安全组规则
     * @param req DescribeEnterpriseSecurityGroupRuleRequest
     * @return DescribeEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnterpriseSecurityGroupRuleResponse DescribeEnterpriseSecurityGroupRule(DescribeEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnterpriseSecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnterpriseSecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnterpriseSecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeGuideScanInfo新手引导扫描接口信息
     * @param req DescribeGuideScanInfoRequest
     * @return DescribeGuideScanInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGuideScanInfoResponse DescribeGuideScanInfo(DescribeGuideScanInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGuideScanInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGuideScanInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGuideScanInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ip防护状态查询
     * @param req DescribeIPStatusListRequest
     * @return DescribeIPStatusListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPStatusListResponse DescribeIPStatusList(DescribeIPStatusListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPStatusListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPStatusListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIPStatusList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取当前用户接入nat防火墙的所有子网数及natfw实例个数
     * @param req DescribeNatFwInfoCountRequest
     * @return DescribeNatFwInfoCountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInfoCountResponse DescribeNatFwInfoCount(DescribeNatFwInfoCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInfoCountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInfoCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInfoCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeNatFwInstance 获取租户所有NAT实例
     * @param req DescribeNatFwInstanceRequest
     * @return DescribeNatFwInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstanceResponse DescribeNatFwInstance(DescribeNatFwInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *GetNatFwInstanceWithRegion 获取租户新增运维的NAT实例，带上地域
     * @param req DescribeNatFwInstanceWithRegionRequest
     * @return DescribeNatFwInstanceWithRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstanceWithRegionResponse DescribeNatFwInstanceWithRegion(DescribeNatFwInstanceWithRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInstanceWithRegionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInstanceWithRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInstanceWithRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *GetNatInstance 获取租户所有NAT实例及实例卡片信息
     * @param req DescribeNatFwInstancesInfoRequest
     * @return DescribeNatFwInstancesInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwInstancesInfoResponse DescribeNatFwInstancesInfo(DescribeNatFwInstancesInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwInstancesInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwInstancesInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwInstancesInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示当前natfw 实例对应的vpc dns开关
     * @param req DescribeNatFwVpcDnsLstRequest
     * @return DescribeNatFwVpcDnsLstResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatFwVpcDnsLstResponse DescribeNatFwVpcDnsLst(DescribeNatFwVpcDnsLstRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatFwVpcDnsLstResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatFwVpcDnsLstResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatFwVpcDnsLst");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *nat规则列表概况
     * @param req DescribeNatRuleOverviewRequest
     * @return DescribeNatRuleOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatRuleOverviewResponse DescribeNatRuleOverview(DescribeNatRuleOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatRuleOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNatRuleOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNatRuleOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeResourceGroup资产中心资产树信息
     * @param req DescribeResourceGroupRequest
     * @return DescribeResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupResponse DescribeResourceGroup(DescribeResourceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeResourceGroupNew资产中心资产树信息
     * @param req DescribeResourceGroupNewRequest
     * @return DescribeResourceGroupNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceGroupNewResponse DescribeResourceGroupNew(DescribeResourceGroupNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceGroupNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceGroupNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceGroupNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则列表概况
     * @param req DescribeRuleOverviewRequest
     * @return DescribeRuleOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleOverviewResponse DescribeRuleOverview(DescribeRuleOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询安全组规则列表
     * @param req DescribeSecurityGroupListRequest
     * @return DescribeSecurityGroupListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupListResponse DescribeSecurityGroupList(DescribeSecurityGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecurityGroupListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecurityGroupList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeSourceAsset-查询资产组全部资产信息

     * @param req DescribeSourceAssetRequest
     * @return DescribeSourceAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceAssetResponse DescribeSourceAsset(DescribeSourceAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSourceAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSourceAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSourceAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *防火墙开关列表
     * @param req DescribeSwitchListsRequest
     * @return DescribeSwitchListsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSwitchListsResponse DescribeSwitchLists(DescribeSwitchListsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSwitchListsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSwitchListsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSwitchLists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步资产状态查询-互联网&VPC
     * @param req DescribeSyncAssetStatusRequest
     * @return DescribeSyncAssetStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSyncAssetStatusResponse DescribeSyncAssetStatus(DescribeSyncAssetStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSyncAssetStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSyncAssetStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSyncAssetStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeTLogInfo告警中心概况

     * @param req DescribeTLogInfoRequest
     * @return DescribeTLogInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTLogInfoResponse DescribeTLogInfo(DescribeTLogInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTLogInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTLogInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTLogInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeTLogIpList告警中心IP柱形图

     * @param req DescribeTLogIpListRequest
     * @return DescribeTLogIpListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTLogIpListResponse DescribeTLogIpList(DescribeTLogIpListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTLogIpListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTLogIpListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTLogIpList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询规则表状态
     * @param req DescribeTableStatusRequest
     * @return DescribeTableStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableStatusResponse DescribeTableStatus(DescribeTableStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTableStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTableStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTableStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeUnHandleEventTabList 告警中心伪攻击链事件未处置接口

     * @param req DescribeUnHandleEventTabListRequest
     * @return DescribeUnHandleEventTabListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUnHandleEventTabListResponse DescribeUnHandleEventTabList(DescribeUnHandleEventTabListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUnHandleEventTabListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUnHandleEventTabListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUnHandleEventTabList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *vpc规则列表概况
     * @param req DescribeVpcRuleOverviewRequest
     * @return DescribeVpcRuleOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcRuleOverviewResponse DescribeVpcRuleOverview(DescribeVpcRuleOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcRuleOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcRuleOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcRuleOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *防火墙垂直扩容
     * @param req ExpandCfwVerticalRequest
     * @return ExpandCfwVerticalResponse
     * @throws TencentCloudSDKException
     */
    public ExpandCfwVerticalResponse ExpandCfwVertical(ExpandCfwVerticalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExpandCfwVerticalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ExpandCfwVerticalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ExpandCfwVertical");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改规则
     * @param req ModifyAcRuleRequest
     * @return ModifyAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAcRuleResponse ModifyAcRule(ModifyAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *互联网边界防火墙一键开关
     * @param req ModifyAllPublicIPSwitchStatusRequest
     * @return ModifyAllPublicIPSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllPublicIPSwitchStatusResponse ModifyAllPublicIPSwitchStatus(ModifyAllPublicIPSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllPublicIPSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllPublicIPSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllPublicIPSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用停用全部规则
     * @param req ModifyAllRuleStatusRequest
     * @return ModifyAllRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllRuleStatusResponse ModifyAllRuleStatus(ModifyAllRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *一键开启和关闭
     * @param req ModifyAllSwitchStatusRequest
     * @return ModifyAllSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllSwitchStatusResponse ModifyAllSwitchStatus(ModifyAllSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *VPC防火墙一键开关
     * @param req ModifyAllVPCSwitchStatusRequest
     * @return ModifyAllVPCSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAllVPCSwitchStatusResponse ModifyAllVPCSwitchStatus(ModifyAllVPCSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAllVPCSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAllVPCSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAllVPCSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资产扫描
     * @param req ModifyAssetScanRequest
     * @return ModifyAssetScanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssetScanResponse ModifyAssetScan(ModifyAssetScanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssetScanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAssetScanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAssetScan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持对拦截列表、忽略列表如下操作：
批量增加拦截IP、忽略IP/域名
批量删除拦截IP、忽略IP/域名
批量修改拦截IP、忽略IP/域名生效事件
     * @param req ModifyBlockIgnoreListRequest
     * @return ModifyBlockIgnoreListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockIgnoreListResponse ModifyBlockIgnoreList(ModifyBlockIgnoreListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlockIgnoreListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlockIgnoreListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBlockIgnoreList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ModifyBlockTop取消置顶接口
     * @param req ModifyBlockTopRequest
     * @return ModifyBlockTopResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBlockTopResponse ModifyBlockTop(ModifyBlockTopRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBlockTopResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBlockTopResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBlockTop");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改单个防火墙开关
     * @param req ModifyItemSwitchStatusRequest
     * @return ModifyItemSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyItemSwitchStatusResponse ModifyItemSwitchStatus(ModifyItemSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyItemSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyItemSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyItemSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *防火墙实例重新选择vpc或nat
     * @param req ModifyNatFwReSelectRequest
     * @return ModifyNatFwReSelectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwReSelectResponse ModifyNatFwReSelect(ModifyNatFwReSelectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatFwReSelectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatFwReSelectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatFwReSelect");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改NAT防火墙开关
     * @param req ModifyNatFwSwitchRequest
     * @return ModifyNatFwSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwSwitchResponse ModifyNatFwSwitch(ModifyNatFwSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatFwSwitchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatFwSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatFwSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *nat 防火墙VPC DNS 开关切换
     * @param req ModifyNatFwVpcDnsSwitchRequest
     * @return ModifyNatFwVpcDnsSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatFwVpcDnsSwitchResponse ModifyNatFwVpcDnsSwitch(ModifyNatFwVpcDnsSwitchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatFwVpcDnsSwitchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNatFwVpcDnsSwitchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNatFwVpcDnsSwitch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *单个修改互联网边界防火墙开关
     * @param req ModifyPublicIPSwitchStatusRequest
     * @return ModifyPublicIPSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPublicIPSwitchStatusResponse ModifyPublicIPSwitchStatus(ModifyPublicIPSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPublicIPSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPublicIPSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPublicIPSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ModifyResourceGroup-资产中心资产组信息修改


     * @param req ModifyResourceGroupRequest
     * @return ModifyResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceGroupResponse ModifyResourceGroup(ModifyResourceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步资产-互联网&VPC（新）
     * @param req ModifyRunSyncAssetRequest
     * @return ModifyRunSyncAssetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRunSyncAssetResponse ModifyRunSyncAsset(ModifyRunSyncAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRunSyncAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRunSyncAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRunSyncAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用停用全部规则
     * @param req ModifySecurityGroupAllRuleStatusRequest
     * @return ModifySecurityGroupAllRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAllRuleStatusResponse ModifySecurityGroupAllRuleStatus(ModifySecurityGroupAllRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupAllRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupAllRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupAllRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用停用单条企业安全组规则
     * @param req ModifySecurityGroupItemRuleStatusRequest
     * @return ModifySecurityGroupItemRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupItemRuleStatusResponse ModifySecurityGroupItemRuleStatus(ModifySecurityGroupItemRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupItemRuleStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupItemRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupItemRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑单条安全组规则
     * @param req ModifySecurityGroupRuleRequest
     * @return ModifySecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupRuleResponse ModifySecurityGroupRule(ModifySecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *企业安全组规则快速排序
     * @param req ModifySecurityGroupSequenceRulesRequest
     * @return ModifySecurityGroupSequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupSequenceRulesResponse ModifySecurityGroupSequenceRules(ModifySecurityGroupSequenceRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupSequenceRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecurityGroupSequenceRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecurityGroupSequenceRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改规则执行顺序
     * @param req ModifySequenceRulesRequest
     * @return ModifySequenceRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySequenceRulesResponse ModifySequenceRules(ModifySequenceRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySequenceRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySequenceRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySequenceRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改规则表状态
     * @param req ModifyTableStatusRequest
     * @return ModifyTableStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTableStatusResponse ModifyTableStatus(ModifyTableStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTableStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTableStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTableStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *单个修改VPC火墙开关
     * @param req ModifyVPCSwitchStatusRequest
     * @return ModifyVPCSwitchStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVPCSwitchStatusResponse ModifyVPCSwitchStatus(ModifyVPCSwitchStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVPCSwitchStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVPCSwitchStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVPCSwitchStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除互联网边界规则
     * @param req RemoveAcRuleRequest
     * @return RemoveAcRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAcRuleResponse RemoveAcRule(RemoveAcRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveAcRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveAcRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveAcRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除新企业安全组规则
     * @param req RemoveEnterpriseSecurityGroupRuleRequest
     * @return RemoveEnterpriseSecurityGroupRuleResponse
     * @throws TencentCloudSDKException
     */
    public RemoveEnterpriseSecurityGroupRuleResponse RemoveEnterpriseSecurityGroupRule(RemoveEnterpriseSecurityGroupRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveEnterpriseSecurityGroupRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveEnterpriseSecurityGroupRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveEnterpriseSecurityGroupRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步资产-互联网&VPC
     * @param req RunSyncAssetRequest
     * @return RunSyncAssetResponse
     * @throws TencentCloudSDKException
     */
    public RunSyncAssetResponse RunSyncAsset(RunSyncAssetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunSyncAssetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RunSyncAssetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunSyncAsset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置防火墙Dnat规则
     * @param req SetNatFwDnatRuleRequest
     * @return SetNatFwDnatRuleResponse
     * @throws TencentCloudSDKException
     */
    public SetNatFwDnatRuleResponse SetNatFwDnatRule(SetNatFwDnatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetNatFwDnatRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetNatFwDnatRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetNatFwDnatRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置防火墙实例弹性公网ip，目前仅支持新增模式的防火墙实例
     * @param req SetNatFwEipRequest
     * @return SetNatFwEipResponse
     * @throws TencentCloudSDKException
     */
    public SetNatFwEipResponse SetNatFwEip(SetNatFwEipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetNatFwEipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetNatFwEipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetNatFwEip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *中止安全组规则下发
     * @param req StopSecurityGroupRuleDispatchRequest
     * @return StopSecurityGroupRuleDispatchResponse
     * @throws TencentCloudSDKException
     */
    public StopSecurityGroupRuleDispatchResponse StopSecurityGroupRuleDispatch(StopSecurityGroupRuleDispatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopSecurityGroupRuleDispatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopSecurityGroupRuleDispatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopSecurityGroupRuleDispatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
