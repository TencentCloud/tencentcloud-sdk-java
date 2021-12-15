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
package com.tencentcloudapi.eiam.v20210420;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eiam.v20210420.models.*;

public class EiamClient extends AbstractClient{
    private static String endpoint = "eiam.tencentcloudapi.com";
    private static String service = "eiam";
    private static String version = "2021-04-20";

    public EiamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EiamClient(Credential credential, String region, ClientProfile profile) {
        super(EiamClient.endpoint, EiamClient.version, credential, region, profile);
    }

    /**
     *账号组添加账号
     * @param req AddAccountToAccountGroupRequest
     * @return AddAccountToAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddAccountToAccountGroupResponse AddAccountToAccountGroup(AddAccountToAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAccountToAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddAccountToAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAccountToAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *加入用户到用户组
     * @param req AddUserToUserGroupRequest
     * @return AddUserToUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToUserGroupResponse AddUserToUserGroup(AddUserToUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserToUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserToUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserToUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建账号组
     * @param req CreateAccountGroupRequest
     * @return CreateAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccountGroupResponse CreateAccountGroup(CreateAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建应用账号
     * @param req CreateAppAccountRequest
     * @return CreateAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppAccountResponse CreateAppAccount(CreateAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAppAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAppAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAppAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建一个机构节点
     * @param req CreateOrgNodeRequest
     * @return CreateOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrgNodeResponse CreateOrgNode(CreateOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建一个用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建用户组
     * @param req CreateUserGroupRequest
     * @return CreateUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserGroupResponse CreateUserGroup(CreateUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除账号组
     * @param req DeleteAccountGroupRequest
     * @return DeleteAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccountGroupResponse DeleteAccountGroup(DeleteAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用账号
     * @param req DeleteAppAccountRequest
     * @return DeleteAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppAccountResponse DeleteAppAccount(DeleteAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAppAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAppAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAppAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个机构节点
     * @param req DeleteOrgNodeRequest
     * @return DeleteOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrgNodeResponse DeleteOrgNode(DeleteOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 删除用户。
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个用户组
     * @param req DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupResponse DeleteUserGroup(DeleteUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除当前节点下的用户。如果出现个别用户删除错误，将不影响其余被勾选用户被删除的操作，同时提示未被删除的用户名称/用户ID。
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询账号组列表
     * @param req DescribeAccountGroupRequest
     * @return DescribeAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountGroupResponse DescribeAccountGroup(DescribeAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用账号列表
     * @param req DescribeAppAccountRequest
     * @return DescribeAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppAccountResponse DescribeAppAccount(DescribeAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAppAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAppAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAppAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取一个应用的信息。
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据机构节点ID读取机构节点信息
     * @param req DescribeOrgNodeRequest
     * @return DescribeOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrgNodeResponse DescribeOrgNode(DescribeOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定机构下的资源授权列表
     * @param req DescribeOrgResourcesAuthorizationRequest
     * @return DescribeOrgResourcesAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrgResourcesAuthorizationResponse DescribeOrgResourcesAuthorization(DescribeOrgResourcesAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrgResourcesAuthorizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrgResourcesAuthorizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrgResourcesAuthorization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取JWT公钥信息。
     * @param req DescribePublicKeyRequest
     * @return DescribePublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicKeyResponse DescribePublicKey(DescribePublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户组信息
     * @param req DescribeUserGroupRequest
     * @return DescribeUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupResponse DescribeUserGroup(DescribeUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定用户组下的资源授权列表
     * @param req DescribeUserGroupResourcesAuthorizationRequest
     * @return DescribeUserGroupResourcesAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupResourcesAuthorizationResponse DescribeUserGroupResourcesAuthorization(DescribeUserGroupResourcesAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserGroupResourcesAuthorizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserGroupResourcesAuthorizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserGroupResourcesAuthorization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 搜索用户
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定用户下的资源授权列表
     * @param req DescribeUserResourcesAuthorizationRequest
     * @return DescribeUserResourcesAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResourcesAuthorizationResponse DescribeUserResourcesAuthorization(DescribeUserResourcesAuthorizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserResourcesAuthorizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserResourcesAuthorizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserResourcesAuthorization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 获取用户的第三方账号绑定信息。
     * @param req DescribeUserThirdPartyAccountInfoRequest
     * @return DescribeUserThirdPartyAccountInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserThirdPartyAccountInfoResponse DescribeUserThirdPartyAccountInfo(DescribeUserThirdPartyAccountInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserThirdPartyAccountInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserThirdPartyAccountInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserThirdPartyAccountInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 获取账号组中的账号列表
     * @param req ListAccountInAccountGroupRequest
     * @return ListAccountInAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListAccountInAccountGroupResponse ListAccountInAccountGroup(ListAccountInAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAccountInAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAccountInAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAccountInAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *应用授权关系列表（含搜索条件匹配）。
     * @param req ListApplicationAuthorizationsRequest
     * @return ListApplicationAuthorizationsResponse
     * @throws TencentCloudSDKException
     */
    public ListApplicationAuthorizationsResponse ListApplicationAuthorizations(ListApplicationAuthorizationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListApplicationAuthorizationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListApplicationAuthorizationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListApplicationAuthorizations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用列表信息。
     * @param req ListApplicationsRequest
     * @return ListApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public ListApplicationsResponse ListApplications(ListApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过机构节点ID获得被授权访问的应用列表。
     * @param req ListAuthorizedApplicationsToOrgNodeRequest
     * @return ListAuthorizedApplicationsToOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToOrgNodeResponse ListAuthorizedApplicationsToOrgNode(ListAuthorizedApplicationsToOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuthorizedApplicationsToOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAuthorizedApplicationsToOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户ID获得被授权访问的应用列表。
     * @param req ListAuthorizedApplicationsToUserRequest
     * @return ListAuthorizedApplicationsToUserResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToUserResponse ListAuthorizedApplicationsToUser(ListAuthorizedApplicationsToUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuthorizedApplicationsToUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAuthorizedApplicationsToUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户组ID获得被授权访问的应用列表。
     * @param req ListAuthorizedApplicationsToUserGroupRequest
     * @return ListAuthorizedApplicationsToUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToUserGroupResponse ListAuthorizedApplicationsToUserGroup(ListAuthorizedApplicationsToUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuthorizedApplicationsToUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAuthorizedApplicationsToUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户组列表信息（包含查询条件）。
     * @param req ListUserGroupsRequest
     * @return ListUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsResponse ListUserGroups(ListUserGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUserGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUserGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户所在的用户组列表
     * @param req ListUserGroupsOfUserRequest
     * @return ListUserGroupsOfUserResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsOfUserResponse ListUserGroupsOfUser(ListUserGroupsOfUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserGroupsOfUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUserGroupsOfUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUserGroupsOfUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户列表信息。
     * @param req ListUsersRequest
     * @return ListUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersResponse ListUsers(ListUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据机构节点ID读取节点下用户
     * @param req ListUsersInOrgNodeRequest
     * @return ListUsersInOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersInOrgNodeResponse ListUsersInOrgNode(ListUsersInOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersInOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersInOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsersInOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户组中的用户列表
     * @param req ListUsersInUserGroupRequest
     * @return ListUsersInUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersInUserGroupResponse ListUsersInUserGroup(ListUsersInUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersInUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersInUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsersInUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改账号组
     * @param req ModifyAccountGroupRequest
     * @return ModifyAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccountGroupResponse ModifyAccountGroup(ModifyAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用账号
     * @param req ModifyAppAccountRequest
     * @return ModifyAppAccountResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAppAccountResponse ModifyAppAccount(ModifyAppAccountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAppAccountResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAppAccountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAppAccount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新一个应用的信息
     * @param req ModifyApplicationRequest
     * @return ModifyApplicationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationResponse ModifyApplication(ModifyApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 冻结用户
     * @param req ModifyUserInfoRequest
     * @return ModifyUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserInfoResponse ModifyUserInfo(ModifyUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从账号组中移除账号
     * @param req RemoveAccountFromAccountGroupRequest
     * @return RemoveAccountFromAccountGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveAccountFromAccountGroupResponse RemoveAccountFromAccountGroup(RemoveAccountFromAccountGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveAccountFromAccountGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveAccountFromAccountGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveAccountFromAccountGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从用户组中移除用户
     * @param req RemoveUserFromUserGroupRequest
     * @return RemoveUserFromUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromUserGroupResponse RemoveUserFromUserGroup(RemoveUserFromUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserFromUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserFromUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUserFromUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建一个机构节点，
     * @param req UpdateOrgNodeRequest
     * @return UpdateOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrgNodeResponse UpdateOrgNode(UpdateOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
