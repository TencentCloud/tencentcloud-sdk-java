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
package com.tencentcloudapi.ciam.v20220331;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ciam.v20220331.models.*;

public class CiamClient extends AbstractClient{
    private static String endpoint = "ciam.tencentcloudapi.com";
    private static String service = "ciam";
    private static String version = "2022-03-31";

    public CiamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CiamClient(Credential credential, String region, ClientProfile profile) {
        super(CiamClient.endpoint, CiamClient.version, credential, region, profile);
    }

    /**
     *新建接口导入用户任务
     * @param req CreateApiImportUserJobRequest
     * @return CreateApiImportUserJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateApiImportUserJobResponse CreateApiImportUserJob(CreateApiImportUserJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApiImportUserJob", CreateApiImportUserJobResponse.class);
    }

    /**
     *新建文件导出用户任务
     * @param req CreateFileExportUserJobRequest
     * @return CreateFileExportUserJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileExportUserJobResponse CreateFileExportUserJob(CreateFileExportUserJobRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileExportUserJob", CreateFileExportUserJobResponse.class);
    }

    /**
     *创建用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *创建用户组
     * @param req CreateUserGroupRequest
     * @return CreateUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserGroupResponse CreateUserGroup(CreateUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserGroup", CreateUserGroupResponse.class);
    }

    /**
     *创建用户目录
     * @param req CreateUserStoreRequest
     * @return CreateUserStoreResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserStoreResponse CreateUserStore(CreateUserStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserStore", CreateUserStoreResponse.class);
    }

    /**
     *批量删除用户组
     * @param req DeleteUserGroupsRequest
     * @return DeleteUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupsResponse DeleteUserGroups(DeleteUserGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserGroups", DeleteUserGroupsResponse.class);
    }

    /**
     *删除用户目录
     * @param req DeleteUserStoreRequest
     * @return DeleteUserStoreResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserStoreResponse DeleteUserStore(DeleteUserStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserStore", DeleteUserStoreResponse.class);
    }

    /**
     *批量删除用户
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsers", DeleteUsersResponse.class);
    }

    /**
     *多条件查询用户信息
     * @param req DescribeUserRequest
     * @return DescribeUserResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserResponse DescribeUser(DescribeUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUser", DescribeUserResponse.class);
    }

    /**
     *根据ID查询用户信息
     * @param req DescribeUserByIdRequest
     * @return DescribeUserByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserByIdResponse DescribeUserById(DescribeUserByIdRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserById", DescribeUserByIdResponse.class);
    }

    /**
     *账号融合
     * @param req LinkAccountRequest
     * @return LinkAccountResponse
     * @throws TencentCloudSDKException
     */
    public LinkAccountResponse LinkAccount(LinkAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "LinkAccount", LinkAccountResponse.class);
    }

    /**
     *查询任务详情
     * @param req ListJobsRequest
     * @return ListJobsResponse
     * @throws TencentCloudSDKException
     */
    public ListJobsResponse ListJobs(ListJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListJobs", ListJobsResponse.class);
    }

    /**
     *查询日志信息
     * @param req ListLogMessageByConditionRequest
     * @return ListLogMessageByConditionResponse
     * @throws TencentCloudSDKException
     */
    public ListLogMessageByConditionResponse ListLogMessageByCondition(ListLogMessageByConditionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListLogMessageByCondition", ListLogMessageByConditionResponse.class);
    }

    /**
     *查询用户列表
     * @param req ListUserRequest
     * @return ListUserResponse
     * @throws TencentCloudSDKException
     */
    public ListUserResponse ListUser(ListUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUser", ListUserResponse.class);
    }

    /**
     *根据属性查询用户列表
     * @param req ListUserByPropertyRequest
     * @return ListUserByPropertyResponse
     * @throws TencentCloudSDKException
     */
    public ListUserByPropertyResponse ListUserByProperty(ListUserByPropertyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUserByProperty", ListUserByPropertyResponse.class);
    }

    /**
     *查询用户组列表
     * @param req ListUserGroupsRequest
     * @return ListUserGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsResponse ListUserGroups(ListUserGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUserGroups", ListUserGroupsResponse.class);
    }

    /**
     *查询用户目录列表
     * @param req ListUserStoreRequest
     * @return ListUserStoreResponse
     * @throws TencentCloudSDKException
     */
    public ListUserStoreResponse ListUserStore(ListUserStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListUserStore", ListUserStoreResponse.class);
    }

    /**
     *重置用户密码
     * @param req ResetPasswordRequest
     * @return ResetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public ResetPasswordResponse ResetPassword(ResetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ResetPassword", ResetPasswordResponse.class);
    }

    /**
     *设置用户密码
     * @param req SetPasswordRequest
     * @return SetPasswordResponse
     * @throws TencentCloudSDKException
     */
    public SetPasswordResponse SetPassword(SetPasswordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetPassword", SetPasswordResponse.class);
    }

    /**
     *更新用户
     * @param req UpdateUserRequest
     * @return UpdateUserResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserResponse UpdateUser(UpdateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUser", UpdateUserResponse.class);
    }

    /**
     *更新用户组
     * @param req UpdateUserGroupRequest
     * @return UpdateUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserGroupResponse UpdateUserGroup(UpdateUserGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserGroup", UpdateUserGroupResponse.class);
    }

    /**
     *更新用户状态
     * @param req UpdateUserStatusRequest
     * @return UpdateUserStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserStatusResponse UpdateUserStatus(UpdateUserStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserStatus", UpdateUserStatusResponse.class);
    }

    /**
     *更新用户目录
     * @param req UpdateUserStoreRequest
     * @return UpdateUserStoreResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserStoreResponse UpdateUserStore(UpdateUserStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserStore", UpdateUserStoreResponse.class);
    }

}
