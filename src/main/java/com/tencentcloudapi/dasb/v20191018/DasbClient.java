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
package com.tencentcloudapi.dasb.v20191018;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.dasb.v20191018.models.*;

public class DasbClient extends AbstractClient{
    private static String endpoint = "dasb.tencentcloudapi.com";
    private static String service = "dasb";
    private static String version = "2019-10-18";

    public DasbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DasbClient(Credential credential, String region, ClientProfile profile) {
        super(DasbClient.endpoint, DasbClient.version, credential, region, profile);
    }

    /**
     *添加资产组成员
     * @param req AddDeviceGroupMembersRequest
     * @return AddDeviceGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceGroupMembersResponse AddDeviceGroupMembers(AddDeviceGroupMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDeviceGroupMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddDeviceGroupMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDeviceGroupMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加用户组成员
     * @param req AddUserGroupMembersRequest
     * @return AddUserGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public AddUserGroupMembersResponse AddUserGroupMembers(AddUserGroupMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserGroupMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserGroupMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserGroupMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改资产绑定的堡垒机服务
     * @param req BindDeviceResourceRequest
     * @return BindDeviceResourceResponse
     * @throws TencentCloudSDKException
     */
    public BindDeviceResourceResponse BindDeviceResource(BindDeviceResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindDeviceResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindDeviceResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindDeviceResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建访问权限
     * @param req CreateAclRequest
     * @return CreateAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateAclResponse CreateAcl(CreateAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建资产组
     * @param req CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceGroupResponse CreateDeviceGroup(CreateDeviceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDeviceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建用户
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
     *删除访问权限
     * @param req DeleteAclsRequest
     * @return DeleteAclsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAclsResponse DeleteAcls(DeleteAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAclsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除资产组成员
     * @param req DeleteDeviceGroupMembersRequest
     * @return DeleteDeviceGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceGroupMembersResponse DeleteDeviceGroupMembers(DeleteDeviceGroupMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceGroupMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceGroupMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDeviceGroupMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除资产组
     * @param req DeleteDeviceGroupsRequest
     * @return DeleteDeviceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceGroupsResponse DeleteDeviceGroups(DeleteDeviceGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDeviceGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户组成员
     * @param req DeleteUserGroupMembersRequest
     * @return DeleteUserGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupMembersResponse DeleteUserGroupMembers(DeleteUserGroupMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserGroupMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserGroupMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserGroupMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户组
     * @param req DeleteUserGroupsRequest
     * @return DeleteUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupsResponse DeleteUserGroups(DeleteUserGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户
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
     *查询访问权限列表
     * @param req DescribeAclsRequest
     * @return DescribeAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAclsResponse DescribeAcls(DescribeAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAclsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAclsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAcls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取镜像列表
     * @param req DescribeDasbImageIdsRequest
     * @return DescribeDasbImageIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDasbImageIdsResponse DescribeDasbImageIds(DescribeDasbImageIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDasbImageIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDasbImageIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDasbImageIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产组成员列表
     * @param req DescribeDeviceGroupMembersRequest
     * @return DescribeDeviceGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceGroupMembersResponse DescribeDeviceGroupMembers(DescribeDeviceGroupMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceGroupMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceGroupMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceGroupMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产组列表
     * @param req DescribeDeviceGroupsRequest
     * @return DescribeDeviceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceGroupsResponse DescribeDeviceGroups(DescribeDeviceGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资产列表
     * @param req DescribeDevicesRequest
     * @return DescribeDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicesResponse DescribeDevices(DescribeDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户购买的堡垒机服务信息，包括资源ID、授权点数、VPC、过期时间等。
     * @param req DescribeResourcesRequest
     * @return DescribeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourcesResponse DescribeResources(DescribeResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户组成员列表
     * @param req DescribeUserGroupMembersRequest
     * @return DescribeUserGroupMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupMembersResponse DescribeUserGroupMembers(DescribeUserGroupMembersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserGroupMembersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserGroupMembersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserGroupMembers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户组列表
     * @param req DescribeUserGroupsRequest
     * @return DescribeUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupsResponse DescribeUserGroups(DescribeUserGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户列表
     * @param req DescribeUsersRequest
     * @return DescribeUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsersResponse DescribeUsers(DescribeUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改访问权限
     * @param req ModifyAclRequest
     * @return ModifyAclResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAclResponse ModifyAcl(ModifyAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAclResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAclResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAcl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户信息
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
