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
        req.setSkipSign(false);
        return this.internalRequest(req, "AssociateAccessGroups", AssociateAccessGroupsResponse.class);
    }

    /**
     *创建权限组。
     * @param req CreateAccessGroupRequest
     * @return CreateAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessGroupResponse CreateAccessGroup(CreateAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessGroup", CreateAccessGroupResponse.class);
    }

    /**
     *批量创建权限规则，权限规则ID和创建时间无需填写。
     * @param req CreateAccessRulesRequest
     * @return CreateAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessRulesResponse CreateAccessRules(CreateAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessRules", CreateAccessRulesResponse.class);
    }

    /**
     *创建文件系统（异步）。
     * @param req CreateFileSystemRequest
     * @return CreateFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileSystemResponse CreateFileSystem(CreateFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFileSystem", CreateFileSystemResponse.class);
    }

    /**
     *批量创建生命周期规则，生命周期规则ID和创建时间无需填写。
     * @param req CreateLifeCycleRulesRequest
     * @return CreateLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public CreateLifeCycleRulesResponse CreateLifeCycleRules(CreateLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateLifeCycleRules", CreateLifeCycleRulesResponse.class);
    }

    /**
     *创建文件系统挂载点，仅限于创建成功的文件系统。
     * @param req CreateMountPointRequest
     * @return CreateMountPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateMountPointResponse CreateMountPoint(CreateMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMountPoint", CreateMountPointResponse.class);
    }

    /**
     *批量创建回热任务，回热任务ID、状态和创建时间无需填写。
     * @param req CreateRestoreTasksRequest
     * @return CreateRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateRestoreTasksResponse CreateRestoreTasks(CreateRestoreTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRestoreTasks", CreateRestoreTasksResponse.class);
    }

    /**
     *删除权限组。
     * @param req DeleteAccessGroupRequest
     * @return DeleteAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessGroupResponse DeleteAccessGroup(DeleteAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessGroup", DeleteAccessGroupResponse.class);
    }

    /**
     *批量删除权限规则。
     * @param req DeleteAccessRulesRequest
     * @return DeleteAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessRulesResponse DeleteAccessRules(DeleteAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAccessRules", DeleteAccessRulesResponse.class);
    }

    /**
     *删除文件系统，不允许删除非空文件系统。
     * @param req DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileSystemResponse DeleteFileSystem(DeleteFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFileSystem", DeleteFileSystemResponse.class);
    }

    /**
     *批量删除生命周期规则。
     * @param req DeleteLifeCycleRulesRequest
     * @return DeleteLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLifeCycleRulesResponse DeleteLifeCycleRules(DeleteLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteLifeCycleRules", DeleteLifeCycleRulesResponse.class);
    }

    /**
     *删除挂载点。
     * @param req DeleteMountPointRequest
     * @return DeleteMountPointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMountPointResponse DeleteMountPoint(DeleteMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMountPoint", DeleteMountPointResponse.class);
    }

    /**
     *查看权限组详细信息。
     * @param req DescribeAccessGroupRequest
     * @return DescribeAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessGroupResponse DescribeAccessGroup(DescribeAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessGroup", DescribeAccessGroupResponse.class);
    }

    /**
     *查看权限组列表。
     * @param req DescribeAccessGroupsRequest
     * @return DescribeAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessGroupsResponse DescribeAccessGroups(DescribeAccessGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessGroups", DescribeAccessGroupsResponse.class);
    }

    /**
     *通过权限组ID查看权限规则列表。
     * @param req DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRulesResponse DescribeAccessRules(DescribeAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRules", DescribeAccessRulesResponse.class);
    }

    /**
     *查看文件系统详细信息。
     * @param req DescribeFileSystemRequest
     * @return DescribeFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemResponse DescribeFileSystem(DescribeFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileSystem", DescribeFileSystemResponse.class);
    }

    /**
     *查看文件系统列表。
     * @param req DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileSystemsResponse DescribeFileSystems(DescribeFileSystemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFileSystems", DescribeFileSystemsResponse.class);
    }

    /**
     *通过文件系统ID查看生命周期规则列表。
     * @param req DescribeLifeCycleRulesRequest
     * @return DescribeLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLifeCycleRulesResponse DescribeLifeCycleRules(DescribeLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLifeCycleRules", DescribeLifeCycleRulesResponse.class);
    }

    /**
     *查看挂载点详细信息。
     * @param req DescribeMountPointRequest
     * @return DescribeMountPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountPointResponse DescribeMountPoint(DescribeMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountPoint", DescribeMountPointResponse.class);
    }

    /**
     *查看挂载点列表。
     * @param req DescribeMountPointsRequest
     * @return DescribeMountPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountPointsResponse DescribeMountPoints(DescribeMountPointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountPoints", DescribeMountPointsResponse.class);
    }

    /**
     *通过文件系统ID查看资源标签列表。
     * @param req DescribeResourceTagsRequest
     * @return DescribeResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceTagsResponse DescribeResourceTags(DescribeResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceTags", DescribeResourceTagsResponse.class);
    }

    /**
     *通过文件系统ID查看回热任务列表。
     * @param req DescribeRestoreTasksRequest
     * @return DescribeRestoreTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRestoreTasksResponse DescribeRestoreTasks(DescribeRestoreTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRestoreTasks", DescribeRestoreTasksResponse.class);
    }

    /**
     *给挂载点解绑多个权限组。
     * @param req DisassociateAccessGroupsRequest
     * @return DisassociateAccessGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAccessGroupsResponse DisassociateAccessGroups(DisassociateAccessGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisassociateAccessGroups", DisassociateAccessGroupsResponse.class);
    }

    /**
     *修改权限组属性。
     * @param req ModifyAccessGroupRequest
     * @return ModifyAccessGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessGroupResponse ModifyAccessGroup(ModifyAccessGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessGroup", ModifyAccessGroupResponse.class);
    }

    /**
     *批量修改权限规则属性，需要指定权限规则ID，支持修改权限规则地址、访问模式和优先级。
     * @param req ModifyAccessRulesRequest
     * @return ModifyAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessRulesResponse ModifyAccessRules(ModifyAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyAccessRules", ModifyAccessRulesResponse.class);
    }

    /**
     *修改文件系统属性，仅限于创建成功的文件系统。
     * @param req ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFileSystemResponse ModifyFileSystem(ModifyFileSystemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyFileSystem", ModifyFileSystemResponse.class);
    }

    /**
     *批量修改生命周期规则属性，需要指定生命周期规则ID，支持修改生命周期规则名称、路径、转换列表和状态。
     * @param req ModifyLifeCycleRulesRequest
     * @return ModifyLifeCycleRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLifeCycleRulesResponse ModifyLifeCycleRules(ModifyLifeCycleRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLifeCycleRules", ModifyLifeCycleRulesResponse.class);
    }

    /**
     *修改挂载点属性。
     * @param req ModifyMountPointRequest
     * @return ModifyMountPointResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMountPointResponse ModifyMountPoint(ModifyMountPointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyMountPoint", ModifyMountPointResponse.class);
    }

    /**
     *修改资源标签列表，全量覆盖。
     * @param req ModifyResourceTagsRequest
     * @return ModifyResourceTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyResourceTagsResponse ModifyResourceTags(ModifyResourceTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyResourceTags", ModifyResourceTagsResponse.class);
    }

}
