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
package com.tencentcloudapi.chdfs.v20201112;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.chdfs.v20201112.models.*;

public class ChdfsClient extends AbstractClient{
    private static String endpoint = "chdfs.tencentcloudapi.com";
    private static String service = "chdfs";
    private static String version = "2020-11-12";

    public ChdfsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public ChdfsClient(Credential credential, String region, ClientProfile profile) {
        super(ChdfsClient.endpoint, ChdfsClient.version, credential, region, profile);
    }

    /**
     *给挂载点绑定多个权限组。
     * @param req AssociateAccessGroupsRequest
     * @return AssociateAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAccessGroupsResponse AssociateAccessGroups(AssociateAccessGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateAccessGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AssociateAccessGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AssociateAccessGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建权限组。
     * @param req CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessGroupResponse CreateAccessGroup(CreateAccessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量创建权限规则，权限规则ID和创建时间无需填写。
     * @param req CreateAccessRulesRequest
     * @return CreateAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessRulesResponse CreateAccessRules(CreateAccessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccessRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccessRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccessRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建文件系统（异步）。
     * @param req CreateFileSystemRequest
     * @return CreateFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileSystemResponse CreateFileSystem(CreateFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFileSystemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFileSystemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFileSystem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量创建生命周期规则，生命周期规则ID和创建时间无需填写。
     * @param req CreateLifeCycleRulesRequest
     * @return CreateLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifeCycleRulesResponse CreateLifeCycleRules(CreateLifeCycleRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLifeCycleRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLifeCycleRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLifeCycleRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建文件系统挂载点，仅限于创建成功的文件系统。
     * @param req CreateMountPointRequest
     * @return CreateMountPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateMountPointResponse CreateMountPoint(CreateMountPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMountPointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMountPointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMountPoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量创建回热任务，回热任务ID、状态和创建时间无需填写。
     * @param req CreateRestoreTasksRequest
     * @return CreateRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateRestoreTasksResponse CreateRestoreTasks(CreateRestoreTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRestoreTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRestoreTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRestoreTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除权限组。
     * @param req DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessGroupResponse DeleteAccessGroup(DeleteAccessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除权限规则。
     * @param req DeleteAccessRulesRequest
     * @return DeleteAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessRulesResponse DeleteAccessRules(DeleteAccessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccessRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccessRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除文件系统，不允许删除非空文件系统。
     * @param req DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileSystemResponse DeleteFileSystem(DeleteFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFileSystemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFileSystemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFileSystem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除生命周期规则。
     * @param req DeleteLifeCycleRulesRequest
     * @return DeleteLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifeCycleRulesResponse DeleteLifeCycleRules(DeleteLifeCycleRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLifeCycleRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLifeCycleRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLifeCycleRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除挂载点。
     * @param req DeleteMountPointRequest
     * @return DeleteMountPointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMountPointResponse DeleteMountPoint(DeleteMountPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMountPointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMountPointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMountPoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看权限组详细信息。
     * @param req DescribeAccessGroupRequest
     * @return DescribeAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessGroupResponse DescribeAccessGroup(DescribeAccessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看权限组列表。
     * @param req DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessGroupsResponse DescribeAccessGroups(DescribeAccessGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过权限组ID查看权限规则列表。
     * @param req DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRulesResponse DescribeAccessRules(DescribeAccessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看文件系统详细信息。
     * @param req DescribeFileSystemRequest
     * @return DescribeFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemResponse DescribeFileSystem(DescribeFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileSystemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileSystemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileSystem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看文件系统列表。
     * @param req DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemsResponse DescribeFileSystems(DescribeFileSystemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileSystemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileSystemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileSystems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过文件系统ID查看生命周期规则列表。
     * @param req DescribeLifeCycleRulesRequest
     * @return DescribeLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifeCycleRulesResponse DescribeLifeCycleRules(DescribeLifeCycleRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLifeCycleRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLifeCycleRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLifeCycleRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看挂载点详细信息。
     * @param req DescribeMountPointRequest
     * @return DescribeMountPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountPointResponse DescribeMountPoint(DescribeMountPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMountPointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMountPointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMountPoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看挂载点列表。
     * @param req DescribeMountPointsRequest
     * @return DescribeMountPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountPointsResponse DescribeMountPoints(DescribeMountPointsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMountPointsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMountPointsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMountPoints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过文件系统ID查看资源标签列表。
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过文件系统ID查看回热任务列表。
     * @param req DescribeRestoreTasksRequest
     * @return DescribeRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTasksResponse DescribeRestoreTasks(DescribeRestoreTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRestoreTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRestoreTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRestoreTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给挂载点解绑多个权限组。
     * @param req DisassociateAccessGroupsRequest
     * @return DisassociateAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAccessGroupsResponse DisassociateAccessGroups(DisassociateAccessGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateAccessGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisassociateAccessGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisassociateAccessGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改权限组属性。
     * @param req ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessGroupResponse ModifyAccessGroup(ModifyAccessGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccessGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccessGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改权限规则属性，需要指定权限规则ID，支持修改权限规则地址、访问模式和优先级。
     * @param req ModifyAccessRulesRequest
     * @return ModifyAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessRulesResponse ModifyAccessRules(ModifyAccessRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccessRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccessRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改文件系统属性，仅限于创建成功的文件系统。
     * @param req ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileSystemResponse ModifyFileSystem(ModifyFileSystemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFileSystemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFileSystemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFileSystem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量修改生命周期规则属性，需要指定生命周期规则ID，支持修改生命周期规则名称、路径、转换列表和状态。
     * @param req ModifyLifeCycleRulesRequest
     * @return ModifyLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLifeCycleRulesResponse ModifyLifeCycleRules(ModifyLifeCycleRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLifeCycleRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLifeCycleRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLifeCycleRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改挂载点属性。
     * @param req ModifyMountPointRequest
     * @return ModifyMountPointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMountPointResponse ModifyMountPoint(ModifyMountPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMountPointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMountPointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMountPoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改资源标签列表，全量覆盖。
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyResourceTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyResourceTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyResourceTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
