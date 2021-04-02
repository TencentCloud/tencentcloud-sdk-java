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
     *查询防火墙弹性公网ip
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

}
