/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.organization.v20181225;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.organization.v20181225.models.*;

public class OrganizationClient extends AbstractClient{
    private static String endpoint = "organization.tencentcloudapi.com";
    private static String service = "organization";
    private static String version = "2018-12-25";

    public OrganizationClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OrganizationClient(Credential credential, String region, ClientProfile profile) {
        super(OrganizationClient.endpoint, OrganizationClient.version, credential, region, profile);
    }

    /**
     *接受加入企业组织邀请
     * @param req AcceptOrganizationInvitationRequest
     * @return AcceptOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public AcceptOrganizationInvitationResponse AcceptOrganizationInvitation(AcceptOrganizationInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AcceptOrganizationInvitation", AcceptOrganizationInvitationResponse.class);
    }

    /**
     *添加企业组织单元
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganizationNode", AddOrganizationNodeResponse.class);
    }

    /**
     *取消企业组织邀请
     * @param req CancelOrganizationInvitationRequest
     * @return CancelOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationInvitationResponse CancelOrganizationInvitation(CancelOrganizationInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelOrganizationInvitation", CancelOrganizationInvitationResponse.class);
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
     *删除企业组织成员
     * @param req DeleteOrganizationMemberFromNodeRequest
     * @return DeleteOrganizationMemberFromNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberFromNodeResponse DeleteOrganizationMemberFromNode(DeleteOrganizationMemberFromNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationMemberFromNode", DeleteOrganizationMemberFromNodeResponse.class);
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
     *批量删除企业组织单元
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganizationNodes", DeleteOrganizationNodesResponse.class);
    }

    /**
     *拒绝企业组织邀请
     * @param req DenyOrganizationInvitationRequest
     * @return DenyOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public DenyOrganizationInvitationResponse DenyOrganizationInvitation(DenyOrganizationInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DenyOrganizationInvitation", DenyOrganizationInvitationResponse.class);
    }

    /**
     *获取企业组织信息
     * @param req GetOrganizationRequest
     * @return GetOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationResponse GetOrganization(GetOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOrganization", GetOrganizationResponse.class);
    }

    /**
     *获取企业组织成员
     * @param req GetOrganizationMemberRequest
     * @return GetOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationMemberResponse GetOrganizationMember(GetOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetOrganizationMember", GetOrganizationMemberResponse.class);
    }

    /**
     *获取邀请信息列表
     * @param req ListOrganizationInvitationsRequest
     * @return ListOrganizationInvitationsResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationInvitationsResponse ListOrganizationInvitations(ListOrganizationInvitationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationInvitations", ListOrganizationInvitationsResponse.class);
    }

    /**
     *获取企业组织成员列表
     * @param req ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationMembersResponse ListOrganizationMembers(ListOrganizationMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationMembers", ListOrganizationMembersResponse.class);
    }

    /**
     *获取企业组织单元成员列表
     * @param req ListOrganizationNodeMembersRequest
     * @return ListOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationNodeMembersResponse ListOrganizationNodeMembers(ListOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationNodeMembers", ListOrganizationNodeMembersResponse.class);
    }

    /**
     *获取企业组织单元列表
     * @param req ListOrganizationNodesRequest
     * @return ListOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationNodesResponse ListOrganizationNodes(ListOrganizationNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationNodes", ListOrganizationNodesResponse.class);
    }

    /**
     *移动成员到指定企业组织单元
     * @param req MoveOrganizationMembersToNodeRequest
     * @return MoveOrganizationMembersToNodeResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationMembersToNodeResponse MoveOrganizationMembersToNode(MoveOrganizationMembersToNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "MoveOrganizationMembersToNode", MoveOrganizationMembersToNodeResponse.class);
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
     *发送企业组织邀请
     * @param req SendOrganizationInvitationRequest
     * @return SendOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public SendOrganizationInvitationResponse SendOrganizationInvitation(SendOrganizationInvitationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendOrganizationInvitation", SendOrganizationInvitationResponse.class);
    }

    /**
     *更新企业成员信息
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationMember", UpdateOrganizationMemberResponse.class);
    }

    /**
     *更新企业组织单元
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganizationNode", UpdateOrganizationNodeResponse.class);
    }

}
