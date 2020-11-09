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
        JsonResponseModel<AcceptOrganizationInvitationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcceptOrganizationInvitationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcceptOrganizationInvitation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加企业组织单元
     * @param req AddOrganizationNodeRequest
     * @return AddOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationNodeResponse AddOrganizationNode(AddOrganizationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddOrganizationNodeResponse> rsp = null;
        String rspStr = "";
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
     *取消企业组织邀请
     * @param req CancelOrganizationInvitationRequest
     * @return CancelOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public CancelOrganizationInvitationResponse CancelOrganizationInvitation(CancelOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CancelOrganizationInvitationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CancelOrganizationInvitationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CancelOrganizationInvitation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建企业组织
     * @param req CreateOrganizationRequest
     * @return CreateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrganizationResponse CreateOrganization(CreateOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除企业组织
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除企业组织成员
     * @param req DeleteOrganizationMemberFromNodeRequest
     * @return DeleteOrganizationMemberFromNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationMemberFromNodeResponse DeleteOrganizationMemberFromNode(DeleteOrganizationMemberFromNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationMemberFromNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationMemberFromNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganizationMemberFromNode");
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
     *批量删除企业组织单元
     * @param req DeleteOrganizationNodesRequest
     * @return DeleteOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationNodesResponse DeleteOrganizationNodes(DeleteOrganizationNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationNodesResponse> rsp = null;
        String rspStr = "";
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
     *拒绝企业组织邀请
     * @param req DenyOrganizationInvitationRequest
     * @return DenyOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public DenyOrganizationInvitationResponse DenyOrganizationInvitation(DenyOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DenyOrganizationInvitationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DenyOrganizationInvitationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DenyOrganizationInvitation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织信息
     * @param req GetOrganizationRequest
     * @return GetOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationResponse GetOrganization(GetOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织成员
     * @param req GetOrganizationMemberRequest
     * @return GetOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public GetOrganizationMemberResponse GetOrganizationMember(GetOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetOrganizationMemberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetOrganizationMemberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetOrganizationMember");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取邀请信息列表
     * @param req ListOrganizationInvitationsRequest
     * @return ListOrganizationInvitationsResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationInvitationsResponse ListOrganizationInvitations(ListOrganizationInvitationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationInvitationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationInvitationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationInvitations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织成员列表
     * @param req ListOrganizationMembersRequest
     * @return ListOrganizationMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationMembersResponse ListOrganizationMembers(ListOrganizationMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织单元成员列表
     * @param req ListOrganizationNodeMembersRequest
     * @return ListOrganizationNodeMembersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationNodeMembersResponse ListOrganizationNodeMembers(ListOrganizationNodeMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationNodeMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationNodeMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationNodeMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取企业组织单元列表
     * @param req ListOrganizationNodesRequest
     * @return ListOrganizationNodesResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationNodesResponse ListOrganizationNodes(ListOrganizationNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移动成员到指定企业组织单元
     * @param req MoveOrganizationMembersToNodeRequest
     * @return MoveOrganizationMembersToNodeResponse
     * @throws TencentCloudSDKException
     */
    public MoveOrganizationMembersToNodeResponse MoveOrganizationMembersToNode(MoveOrganizationMembersToNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MoveOrganizationMembersToNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MoveOrganizationMembersToNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MoveOrganizationMembersToNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *退出企业组织
     * @param req QuitOrganizationRequest
     * @return QuitOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public QuitOrganizationResponse QuitOrganization(QuitOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuitOrganizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<QuitOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "QuitOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *发送企业组织邀请
     * @param req SendOrganizationInvitationRequest
     * @return SendOrganizationInvitationResponse
     * @throws TencentCloudSDKException
     */
    public SendOrganizationInvitationResponse SendOrganizationInvitation(SendOrganizationInvitationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SendOrganizationInvitationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendOrganizationInvitationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendOrganizationInvitation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新企业成员信息
     * @param req UpdateOrganizationMemberRequest
     * @return UpdateOrganizationMemberResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationMemberResponse UpdateOrganizationMember(UpdateOrganizationMemberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationMemberResponse> rsp = null;
        String rspStr = "";
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
     *更新企业组织单元
     * @param req UpdateOrganizationNodeRequest
     * @return UpdateOrganizationNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationNodeResponse UpdateOrganizationNode(UpdateOrganizationNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationNodeResponse> rsp = null;
        String rspStr = "";
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
