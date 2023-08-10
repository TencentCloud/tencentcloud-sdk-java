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
package com.tencentcloudapi.organization.v20210331;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.organization.v20210331.models.*;

public class OrganizationClient extends AbstractClient{
    private static String endpoint = "organization.tencentcloudapi.com";
    private static String service = "organization";
    private static String version = "2021-03-31";
    
    public OrganizationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OrganizationClient(Credential credential, String region, ClientProfile profile) {
        super(OrganizationClient.endpoint, OrganizationClient.version, credential, region, profile);
    }

    /**
     *添加组织成员邮箱
     * @param req AddOrganizationMemberEmailRequest
     * @return AddOrganizationMemberEmailResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationMemberEmailResponse AddOrganizationMemberEmail(AddOrganizationMemberEmailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddOrganizationMemberEmailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddOrganizationMemberEmailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddOrganizationMemberEmail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加企业组织节点
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddOrganizationNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddOrganizationNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddOrganizationNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *绑定组织成员和组织管理员子账号的授权关系
     * @param req BindOrganizationMemberAuthAccountRequest
     * @return BindOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindOrganizationMemberAuthAccountResponse BindOrganizationMemberAuthAccount(BindOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindOrganizationMemberAuthAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<BindOrganizationMemberAuthAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindOrganizationMemberAuthAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消组织成员和组织管理员子账号的授权关系

     * @param req CancelOrganizationMemberAuthAccountRequest
     * @return CancelOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationMemberAuthAccountResponse CancelOrganizationMemberAuthAccount(CancelOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelOrganizationMemberAuthAccountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CancelOrganizationMemberAuthAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelOrganizationMemberAuthAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建组织成员
     * @param req CreateOrganizationMemberRequest
     * @return CreateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberResponse CreateOrganizationMember(CreateOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganizationMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加组织成员访问授权
     * @param req CreateOrganizationMemberAuthIdentityRequest
     * @return CreateOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberAuthIdentityResponse CreateOrganizationMemberAuthIdentity(CreateOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationMemberAuthIdentityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationMemberAuthIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganizationMemberAuthIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建组织成员访问授权策略
     * @param req CreateOrganizationMemberPolicyRequest
     * @return CreateOrganizationMemberPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberPolicyResponse CreateOrganizationMemberPolicy(CreateOrganizationMemberPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationMemberPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationMemberPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganizationMemberPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除组织成员访问授权
     * @param req DeleteOrganizationMemberAuthIdentityRequest
     * @return DeleteOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberAuthIdentityResponse DeleteOrganizationMemberAuthIdentity(DeleteOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationMemberAuthIdentityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationMemberAuthIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganizationMemberAuthIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除企业组织成员
     * @param req DeleteOrganizationMembersRequest
     * @return DeleteOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersResponse DeleteOrganizationMembers(DeleteOrganizationMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationMembersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganizationMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除组织成员访问策略
     * @param req DeleteOrganizationMembersPolicyRequest
     * @return DeleteOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersPolicyResponse DeleteOrganizationMembersPolicy(DeleteOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationMembersPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationMembersPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganizationMembersPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除企业组织节点
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganizationNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织信息
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取已设置管理员的互信主体关系列表
     * @param req DescribeOrganizationAuthNodeRequest
     * @return DescribeOrganizationAuthNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationAuthNodeResponse DescribeOrganizationAuthNode(DescribeOrganizationAuthNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationAuthNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationAuthNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationAuthNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以成员维度获取组织财务信息
     * @param req DescribeOrganizationFinancialByMemberRequest
     * @return DescribeOrganizationFinancialByMemberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByMemberResponse DescribeOrganizationFinancialByMember(DescribeOrganizationFinancialByMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationFinancialByMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationFinancialByMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationFinancialByMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以月维度获取组织财务信息趋势
     * @param req DescribeOrganizationFinancialByMonthRequest
     * @return DescribeOrganizationFinancialByMonthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByMonthResponse DescribeOrganizationFinancialByMonth(DescribeOrganizationFinancialByMonthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationFinancialByMonthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationFinancialByMonthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationFinancialByMonth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *以产品维度获取组织财务信息
     * @param req DescribeOrganizationFinancialByProductRequest
     * @return DescribeOrganizationFinancialByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByProductResponse DescribeOrganizationFinancialByProduct(DescribeOrganizationFinancialByProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationFinancialByProductResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationFinancialByProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationFinancialByProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组织成员被绑定授权关系的子账号列表
     * @param req DescribeOrganizationMemberAuthAccountsRequest
     * @return DescribeOrganizationMemberAuthAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthAccountsResponse DescribeOrganizationMemberAuthAccounts(DescribeOrganizationMemberAuthAccountsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationMemberAuthAccountsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationMemberAuthAccountsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationMemberAuthAccounts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组织成员可被管理的身份列表
     * @param req DescribeOrganizationMemberAuthIdentitiesRequest
     * @return DescribeOrganizationMemberAuthIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthIdentitiesResponse DescribeOrganizationMemberAuthIdentities(DescribeOrganizationMemberAuthIdentitiesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationMemberAuthIdentitiesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationMemberAuthIdentitiesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationMemberAuthIdentities");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询成员邮箱绑定详细信息
     * @param req DescribeOrganizationMemberEmailBindRequest
     * @return DescribeOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberEmailBindResponse DescribeOrganizationMemberEmailBind(DescribeOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationMemberEmailBindResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationMemberEmailBindResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationMemberEmailBind");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组织成员的授权策略列表
     * @param req DescribeOrganizationMemberPoliciesRequest
     * @return DescribeOrganizationMemberPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberPoliciesResponse DescribeOrganizationMemberPolicies(DescribeOrganizationMemberPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationMemberPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationMemberPoliciesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationMemberPolicies");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织成员列表
     * @param req DescribeOrganizationMembersRequest
     * @return DescribeOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMembersResponse DescribeOrganizationMembers(DescribeOrganizationMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationMembersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组织节点列表
     * @param req DescribeOrganizationNodesRequest
     * @return DescribeOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationNodesResponse DescribeOrganizationNodes(DescribeOrganizationNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组织成员访问身份列表
     * @param req ListOrganizationIdentityRequest
     * @return ListOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationIdentityResponse ListOrganizationIdentity(ListOrganizationIdentityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationIdentityResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationIdentityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationIdentity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动成员到指定企业组织节点
     * @param req MoveOrganizationNodeMembersRequest
     * @return MoveOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationNodeMembersResponse MoveOrganizationNodeMembers(MoveOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MoveOrganizationNodeMembersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<MoveOrganizationNodeMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MoveOrganizationNodeMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新组织成员信息
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationMemberResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrganizationMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOrganizationMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改绑定成员邮箱
     * @param req UpdateOrganizationMemberEmailBindRequest
     * @return UpdateOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberEmailBindResponse UpdateOrganizationMemberEmailBind(UpdateOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationMemberEmailBindResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrganizationMemberEmailBindResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOrganizationMemberEmailBind");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新企业组织节点
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationNodeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrganizationNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOrganizationNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
