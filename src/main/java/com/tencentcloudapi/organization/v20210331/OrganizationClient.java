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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationMemberEmail", AddOrganizationMemberEmailResponse.class);
    }

    /**
     *添加企业组织节点
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationNode", AddOrganizationNodeResponse.class);
    }

    /**
     *绑定组织成员和组织管理员子账号的授权关系
     * @param req BindOrganizationMemberAuthAccountRequest
     * @return BindOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public BindOrganizationMemberAuthAccountResponse BindOrganizationMemberAuthAccount(BindOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindOrganizationMemberAuthAccount", BindOrganizationMemberAuthAccountResponse.class);
    }

    /**
     *取消组织成员和组织管理员子账号的授权关系

     * @param req CancelOrganizationMemberAuthAccountRequest
     * @return CancelOrganizationMemberAuthAccountResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationMemberAuthAccountResponse CancelOrganizationMemberAuthAccount(CancelOrganizationMemberAuthAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelOrganizationMemberAuthAccount", CancelOrganizationMemberAuthAccountResponse.class);
    }

    /**
     *创建企业组织
     * @param req CreateOrganizationRequest
     * @return CreateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationResponse CreateOrganization(CreateOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganization", CreateOrganizationResponse.class);
    }

    /**
     *添加组织身份
     * @param req CreateOrganizationIdentityRequest
     * @return CreateOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationIdentityResponse CreateOrganizationIdentity(CreateOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationIdentity", CreateOrganizationIdentityResponse.class);
    }

    /**
     *创建组织成员
     * @param req CreateOrganizationMemberRequest
     * @return CreateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberResponse CreateOrganizationMember(CreateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMember", CreateOrganizationMemberResponse.class);
    }

    /**
     *添加组织成员访问授权
     * @param req CreateOrganizationMemberAuthIdentityRequest
     * @return CreateOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberAuthIdentityResponse CreateOrganizationMemberAuthIdentity(CreateOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMemberAuthIdentity", CreateOrganizationMemberAuthIdentityResponse.class);
    }

    /**
     *创建组织成员访问授权策略
     * @param req CreateOrganizationMemberPolicyRequest
     * @return CreateOrganizationMemberPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMemberPolicyResponse CreateOrganizationMemberPolicy(CreateOrganizationMemberPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMemberPolicy", CreateOrganizationMemberPolicyResponse.class);
    }

    /**
     *创建组织成员访问策略
     * @param req CreateOrganizationMembersPolicyRequest
     * @return CreateOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationMembersPolicyResponse CreateOrganizationMembersPolicy(CreateOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOrganizationMembersPolicy", CreateOrganizationMembersPolicyResponse.class);
    }

    /**
     *删除企业组织
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganization", DeleteOrganizationResponse.class);
    }

    /**
     *删除组织身份
     * @param req DeleteOrganizationIdentityRequest
     * @return DeleteOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationIdentityResponse DeleteOrganizationIdentity(DeleteOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationIdentity", DeleteOrganizationIdentityResponse.class);
    }

    /**
     *删除组织成员访问授权
     * @param req DeleteOrganizationMemberAuthIdentityRequest
     * @return DeleteOrganizationMemberAuthIdentityResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberAuthIdentityResponse DeleteOrganizationMemberAuthIdentity(DeleteOrganizationMemberAuthIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMemberAuthIdentity", DeleteOrganizationMemberAuthIdentityResponse.class);
    }

    /**
     *批量删除企业组织成员
     * @param req DeleteOrganizationMembersRequest
     * @return DeleteOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersResponse DeleteOrganizationMembers(DeleteOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMembers", DeleteOrganizationMembersResponse.class);
    }

    /**
     *删除组织成员访问策略
     * @param req DeleteOrganizationMembersPolicyRequest
     * @return DeleteOrganizationMembersPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMembersPolicyResponse DeleteOrganizationMembersPolicy(DeleteOrganizationMembersPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMembersPolicy", DeleteOrganizationMembersPolicyResponse.class);
    }

    /**
     *批量删除企业组织节点
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationNodes", DeleteOrganizationNodesResponse.class);
    }

    /**
     *获取企业组织信息
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganization", DescribeOrganizationResponse.class);
    }

    /**
     *获取已设置管理员的互信主体关系列表
     * @param req DescribeOrganizationAuthNodeRequest
     * @return DescribeOrganizationAuthNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationAuthNodeResponse DescribeOrganizationAuthNode(DescribeOrganizationAuthNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationAuthNode", DescribeOrganizationAuthNodeResponse.class);
    }

    /**
     *以成员维度获取组织财务信息
     * @param req DescribeOrganizationFinancialByMemberRequest
     * @return DescribeOrganizationFinancialByMemberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByMemberResponse DescribeOrganizationFinancialByMember(DescribeOrganizationFinancialByMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationFinancialByMember", DescribeOrganizationFinancialByMemberResponse.class);
    }

    /**
     *以月维度获取组织财务信息趋势
     * @param req DescribeOrganizationFinancialByMonthRequest
     * @return DescribeOrganizationFinancialByMonthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByMonthResponse DescribeOrganizationFinancialByMonth(DescribeOrganizationFinancialByMonthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationFinancialByMonth", DescribeOrganizationFinancialByMonthResponse.class);
    }

    /**
     *以产品维度获取组织财务信息
     * @param req DescribeOrganizationFinancialByProductRequest
     * @return DescribeOrganizationFinancialByProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationFinancialByProductResponse DescribeOrganizationFinancialByProduct(DescribeOrganizationFinancialByProductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationFinancialByProduct", DescribeOrganizationFinancialByProductResponse.class);
    }

    /**
     *获取组织成员被绑定授权关系的子账号列表
     * @param req DescribeOrganizationMemberAuthAccountsRequest
     * @return DescribeOrganizationMemberAuthAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthAccountsResponse DescribeOrganizationMemberAuthAccounts(DescribeOrganizationMemberAuthAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberAuthAccounts", DescribeOrganizationMemberAuthAccountsResponse.class);
    }

    /**
     *获取组织成员访问授权列表
     * @param req DescribeOrganizationMemberAuthIdentitiesRequest
     * @return DescribeOrganizationMemberAuthIdentitiesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberAuthIdentitiesResponse DescribeOrganizationMemberAuthIdentities(DescribeOrganizationMemberAuthIdentitiesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberAuthIdentities", DescribeOrganizationMemberAuthIdentitiesResponse.class);
    }

    /**
     *查询成员邮箱绑定详细信息
     * @param req DescribeOrganizationMemberEmailBindRequest
     * @return DescribeOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberEmailBindResponse DescribeOrganizationMemberEmailBind(DescribeOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberEmailBind", DescribeOrganizationMemberEmailBindResponse.class);
    }

    /**
     *获取组织成员的授权策略列表
     * @param req DescribeOrganizationMemberPoliciesRequest
     * @return DescribeOrganizationMemberPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMemberPoliciesResponse DescribeOrganizationMemberPolicies(DescribeOrganizationMemberPoliciesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMemberPolicies", DescribeOrganizationMemberPoliciesResponse.class);
    }

    /**
     *获取企业组织成员列表
     * @param req DescribeOrganizationMembersRequest
     * @return DescribeOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationMembersResponse DescribeOrganizationMembers(DescribeOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationMembers", DescribeOrganizationMembersResponse.class);
    }

    /**
     *获取组织节点列表
     * @param req DescribeOrganizationNodesRequest
     * @return DescribeOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationNodesResponse DescribeOrganizationNodes(DescribeOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationNodes", DescribeOrganizationNodesResponse.class);
    }

    /**
     *获取组织成员访问身份列表
     * @param req ListOrganizationIdentityRequest
     * @return ListOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationIdentityResponse ListOrganizationIdentity(ListOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationIdentity", ListOrganizationIdentityResponse.class);
    }

    /**
     *移动成员到指定企业组织节点
     * @param req MoveOrganizationNodeMembersRequest
     * @return MoveOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationNodeMembersResponse MoveOrganizationNodeMembers(MoveOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveOrganizationNodeMembers", MoveOrganizationNodeMembersResponse.class);
    }

    /**
     *退出企业组织
     * @param req QuitOrganizationRequest
     * @return QuitOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public QuitOrganizationResponse QuitOrganization(QuitOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QuitOrganization", QuitOrganizationResponse.class);
    }

    /**
     *更新组织身份
     * @param req UpdateOrganizationIdentityRequest
     * @return UpdateOrganizationIdentityResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationIdentityResponse UpdateOrganizationIdentity(UpdateOrganizationIdentityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationIdentity", UpdateOrganizationIdentityResponse.class);
    }

    /**
     *更新组织成员信息
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMember", UpdateOrganizationMemberResponse.class);
    }

    /**
     *修改绑定成员邮箱
     * @param req UpdateOrganizationMemberEmailBindRequest
     * @return UpdateOrganizationMemberEmailBindResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberEmailBindResponse UpdateOrganizationMemberEmailBind(UpdateOrganizationMemberEmailBindRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMemberEmailBind", UpdateOrganizationMemberEmailBindResponse.class);
    }

    /**
     *更新企业组织节点
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationNode", UpdateOrganizationNodeResponse.class);
    }

}
