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
package com.tencentcloudapi.databuddy.v20260715;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.databuddy.v20260715.models.*;

public class DatabuddyClient extends AbstractClient{
    private static String endpoint = "databuddy.tencentcloudapi.com";
    private static String service = "databuddy";
    private static String version = "2026-07-15";

    public DatabuddyClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public DatabuddyClient(Credential credential, String region, ClientProfile profile) {
        super(DatabuddyClient.endpoint, DatabuddyClient.version, credential, region, profile);
    }

    /**
     *添加控制台用户
     * @param req AddConsoleUsersRequest
     * @return AddConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public AddConsoleUsersResponse AddConsoleUsers(AddConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddConsoleUsers", AddConsoleUsersResponse.class);
    }

    /**
     *创建数据目录接口
     * @param req CreateCatalogRequest
     * @return CreateCatalogResponse
     * @throws TencentCloudSDKException
     */
    public CreateCatalogResponse CreateCatalog(CreateCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCatalog", CreateCatalogResponse.class);
    }

    /**
     *创建控制台用户组
     * @param req CreateConsoleGroupRequest
     * @return CreateConsoleGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateConsoleGroupResponse CreateConsoleGroup(CreateConsoleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConsoleGroup", CreateConsoleGroupResponse.class);
    }

    /**
     *在Studio（统一开发 IDE）的工作空间文件树中新建一个文件（Notebook/SQL/Python等），创建成功后返回文件的完整元信息。

**前置条件**
1. WorkspaceId 对应工作空间存在，且调用方为该工作空间成员；
2. ParentFolderPath 对应的父文件夹必须存在，且调用方对其有写权限（根目录传 `/`）；
3. FileName 在同一父文件夹下不能重名（含后缀比较）；
4. FileName 后缀必须与 FileType 匹配（`.ipynb`↔`NOTEBOOK_FILE`、`.sql`↔`SQL_FILE`）；
5. 需带文件内容创建时通过 Storage 传入（大文件走 COS 中转，小文件放 Storage.Content）。
     * @param req CreateFileRequest
     * @return CreateFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateFileResponse CreateFile(CreateFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFile", CreateFileResponse.class);
    }

    /**
     *创建文件夹
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFolder", CreateFolderResponse.class);
    }

    /**
     *创建schema
     * @param req CreateSchemaRequest
     * @return CreateSchemaResponse
     * @throws TencentCloudSDKException
     */
    public CreateSchemaResponse CreateSchema(CreateSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSchema", CreateSchemaResponse.class);
    }

    /**
     *创建工作流
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkflow", CreateWorkflowResponse.class);
    }

    /**
     *创建工作空间
     * @param req CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceResponse CreateWorkspace(CreateWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspace", CreateWorkspaceResponse.class);
    }

    /**
     *创建工作空间角色
     * @param req CreateWorkspaceRoleRequest
     * @return CreateWorkspaceRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkspaceRoleResponse CreateWorkspaceRole(CreateWorkspaceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWorkspaceRole", CreateWorkspaceRoleResponse.class);
    }

    /**
     *删除catalog
     * @param req DeleteCatalogRequest
     * @return DeleteCatalogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCatalogResponse DeleteCatalog(DeleteCatalogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCatalog", DeleteCatalogResponse.class);
    }

    /**
     *删除控制台用户组
     * @param req DeleteConsoleGroupsRequest
     * @return DeleteConsoleGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConsoleGroupsResponse DeleteConsoleGroups(DeleteConsoleGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConsoleGroups", DeleteConsoleGroupsResponse.class);
    }

    /**
     *将文件移入回收站（软删除），同时清理该文件的版本记录与执行结果快照。

**前置条件**
1. FileId 对应文件必须存在且为活跃状态；
2. 调用方对该文件有删除权限；
3. 文件未被工作流任务引用。

**错误码（Module 均为 `Studio`）**

| 错误码（Code） | InnerCode | 描述 | 处理建议 |
| --- | --- | --- | --- |
| `MissingParameter.WorkspaceId` | 1030001 | 缺少 WorkspaceId | 请传入 WorkspaceId |
| `MissingParameter.FileId` | 1030003 | 缺少 FileId | 请传入 FileId  |
| `InvalidParameterValue.FileType` | 1030102 | FileType 取值不支持 | FileType 取 FILE/NOTEBOOK_FILE/SQL_FILE |
| `ResourceNotFound.FileNotFound` | 1030203 | 文件不存在或已删除 | 请确认 FileId |
| `ResourceInUse.FileReferencedByTask` | 1030204 | 文件被工作流任务引用，不允许删除 | 请先解除任务引用后再删除 |
| `UnauthorizedOperation.FileDeleteDenied` | 1030303 | 对该文件无删除权限 | 请联系文件负责人或空间管理员授权 |
| `InternalError` | 1030900 | 服务内部异常 | 请携带 RequestId 联系支持 |
     * @param req DeleteFileRequest
     * @return DeleteFileResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFileResponse DeleteFile(DeleteFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFile", DeleteFileResponse.class);
    }

    /**
     *删除文件夹
     * @param req DeleteFolderRequest
     * @return DeleteFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFolderResponse DeleteFolder(DeleteFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteFolder", DeleteFolderResponse.class);
    }

    /**
     *删除schema
     * @param req DeleteSchemaRequest
     * @return DeleteSchemaResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSchemaResponse DeleteSchema(DeleteSchemaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSchema", DeleteSchemaResponse.class);
    }

    /**
     *删除工作流
     * @param req DeleteWorkflowRequest
     * @return DeleteWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowResponse DeleteWorkflow(DeleteWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkflow", DeleteWorkflowResponse.class);
    }

    /**
     *删除工作空间
     * @param req DeleteWorkspaceRequest
     * @return DeleteWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkspaceResponse DeleteWorkspace(DeleteWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkspace", DeleteWorkspaceResponse.class);
    }

    /**
     *删除工作空间角色
     * @param req DeleteWorkspaceRoleRequest
     * @return DeleteWorkspaceRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkspaceRoleResponse DeleteWorkspaceRole(DeleteWorkspaceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWorkspaceRole", DeleteWorkspaceRoleResponse.class);
    }

    /**
     *获取文件的元信息，可选包含文件内容，支持按版本读取历史快照。

**前置条件**
1. FileId 与 FilePath 二选一，至少传一个；同时传时以 FileId 为准；
2. 对应文件必须存在，且调用方对该文件有读权限；
3. 传 VersionId 时该版本必须存在。

**错误码（Module 均为 `Studio`）**

| 错误码（Code） | InnerCode | 描述 | 处理建议 |
| --- | --- | --- | --- |
| `MissingParameter.WorkspaceId` | 1030001 | 缺少 WorkspaceId | 请传入 WorkspaceId |
| `MissingParameter.FileId` | 1030003 | FileId 与 FilePath 同时为空 | FileId 与 FilePath 二选一，至少传一个 |
| `InvalidParameterValue.FileType` | 1030102 | FileType 取值不支持 | FileType 取 FILE/NOTEBOOK_FILE/SQL_FILE |
| `ResourceNotFound.FileNotFound` | 1030203 | 文件不存在或已删除 | 请确认 FileId 或 FilePath |
| `ResourceNotFound.FileVersionNotFound` | 1030205 | 指定的文件版本不存在 | 请确认 VersionId，或调用 ListFileVersions 获取 |
| `UnauthorizedOperation.FileReadDenied` | 1030304 | 对该文件无读权限 | 请联系文件负责人或空间管理员授权 |
| `InternalError` | 1030900 | 服务内部异常 | 请携带 RequestId 联系支持 |
     * @param req GetFileRequest
     * @return GetFileResponse
     * @throws TencentCloudSDKException
     */
    public GetFileResponse GetFile(GetFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFile", GetFileResponse.class);
    }

    /**
     *获取文件夹详情
     * @param req GetFolderRequest
     * @return GetFolderResponse
     * @throws TencentCloudSDKException
     */
    public GetFolderResponse GetFolder(GetFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFolder", GetFolderResponse.class);
    }

    /**
     *获取工作流详细信息
     * @param req GetWorkflowRequest
     * @return GetWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowResponse GetWorkflow(GetWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflow", GetWorkflowResponse.class);
    }

    /**
     *查询工作流运行详情
     * @param req GetWorkflowRunRequest
     * @return GetWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowRunResponse GetWorkflowRun(GetWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflowRun", GetWorkflowRunResponse.class);
    }

    /**
     *查询任务运行详情
     * @param req GetWorkflowTaskRunRequest
     * @return GetWorkflowTaskRunResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkflowTaskRunResponse GetWorkflowTaskRun(GetWorkflowTaskRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkflowTaskRun", GetWorkflowTaskRunResponse.class);
    }

    /**
     *查询工作空间详情
     * @param req GetWorkspaceRequest
     * @return GetWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public GetWorkspaceResponse GetWorkspace(GetWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetWorkspace", GetWorkspaceResponse.class);
    }

    /**
     *终止工作流的运行
     * @param req KillWorkflowRunRequest
     * @return KillWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public KillWorkflowRunResponse KillWorkflowRun(KillWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "KillWorkflowRun", KillWorkflowRunResponse.class);
    }

    /**
     *查询控制台用户组成员列表，该接口为控制台级接口，仅支持在中心地域调用：国内站请传入 ap-guangzhou，国际站请传入 ap-singapore；其他地域调用将返回 UnsupportedRegion。
     * @param req ListConsoleGroupUsersRequest
     * @return ListConsoleGroupUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleGroupUsersResponse ListConsoleGroupUsers(ListConsoleGroupUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleGroupUsers", ListConsoleGroupUsersResponse.class);
    }

    /**
     *查询控制台用户组列表，该接口为控制台级接口，仅支持在中心地域调用：国内站请传入 ap-guangzhou，国际站请传入 ap-singapore；其他地域调用将返回 UnsupportedRegion。
     * @param req ListConsoleGroupsRequest
     * @return ListConsoleGroupsResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleGroupsResponse ListConsoleGroups(ListConsoleGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleGroups", ListConsoleGroupsResponse.class);
    }

    /**
     *查询控制台角色列表，该接口为控制台级接口，仅支持在中心地域调用：国内站请传入 ap-guangzhou，国际站请传入 ap-singapore；其他地域调用将返回 UnsupportedRegion。
     * @param req ListConsoleRolesRequest
     * @return ListConsoleRolesResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleRolesResponse ListConsoleRoles(ListConsoleRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleRoles", ListConsoleRolesResponse.class);
    }

    /**
     *查询控制台用户列表，该接口为控制台级接口，仅支持在中心地域调用：国内站请传入 ap-guangzhou，国际站请传入 ap-singapore；其他地域调用将返回 UnsupportedRegion。
     * @param req ListConsoleUsersRequest
     * @return ListConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public ListConsoleUsersResponse ListConsoleUsers(ListConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListConsoleUsers", ListConsoleUsersResponse.class);
    }

    /**
     *获取文件夹和文件列表
     * @param req ListFilesRequest
     * @return ListFilesResponse
     * @throws TencentCloudSDKException
     */
    public ListFilesResponse ListFiles(ListFilesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListFiles", ListFilesResponse.class);
    }

    /**
     *获取schema列表
     * @param req ListSchemasRequest
     * @return ListSchemasResponse
     * @throws TencentCloudSDKException
     */
    public ListSchemasResponse ListSchemas(ListSchemasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSchemas", ListSchemasResponse.class);
    }

    /**
     *工作流运行列表
     * @param req ListWorkflowRunsRequest
     * @return ListWorkflowRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowRunsResponse ListWorkflowRuns(ListWorkflowRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowRuns", ListWorkflowRunsResponse.class);
    }

    /**
     *查询工作流任务历史运行列表
     * @param req ListWorkflowTaskRunsRequest
     * @return ListWorkflowTaskRunsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowTaskRunsResponse ListWorkflowTaskRuns(ListWorkflowTaskRunsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflowTaskRuns", ListWorkflowTaskRunsResponse.class);
    }

    /**
     *查询工作流列表
     * @param req ListWorkflowsRequest
     * @return ListWorkflowsResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkflowsResponse ListWorkflows(ListWorkflowsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkflows", ListWorkflowsResponse.class);
    }

    /**
     *查询工作空间列表
     * @param req ListWorkspacesRequest
     * @return ListWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public ListWorkspacesResponse ListWorkspaces(ListWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListWorkspaces", ListWorkspacesResponse.class);
    }

    /**
     *<p>批量移除控制台用户（单次最多10个；前置校验任一不满足整体拒绝；执行阶段单个失败不中断后续删除，成败以 SuccessUins/FailItems 为准）</p>
     * @param req RemoveConsoleUsersRequest
     * @return RemoveConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public RemoveConsoleUsersResponse RemoveConsoleUsers(RemoveConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveConsoleUsers", RemoveConsoleUsersResponse.class);
    }

    /**
     *重跑工作流
     * @param req RerunWorkflowRunRequest
     * @return RerunWorkflowRunResponse
     * @throws TencentCloudSDKException
     */
    public RerunWorkflowRunResponse RerunWorkflowRun(RerunWorkflowRunRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RerunWorkflowRun", RerunWorkflowRunResponse.class);
    }

    /**
     *运行工作流
     * @param req RunWorkflowRequest
     * @return RunWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public RunWorkflowResponse RunWorkflow(RunWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunWorkflow", RunWorkflowResponse.class);
    }

    /**
     *启动计算资源
     * @param req StartComputeRequest
     * @return StartComputeResponse
     * @throws TencentCloudSDKException
     */
    public StartComputeResponse StartCompute(StartComputeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartCompute", StartComputeResponse.class);
    }

    /**
     *停止计算资源
     * @param req StopComputeRequest
     * @return StopComputeResponse
     * @throws TencentCloudSDKException
     */
    public StopComputeResponse StopCompute(StopComputeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCompute", StopComputeResponse.class);
    }

    /**
     *解绑工作流Bundle信息
说明：本接口语义等同于规范动词清单中的 Detach，因兼容既有产品形态保留 Unbind 命名
     * @param req UnbindWorkflowBundleRequest
     * @return UnbindWorkflowBundleResponse
     * @throws TencentCloudSDKException
     */
    public UnbindWorkflowBundleResponse UnbindWorkflowBundle(UnbindWorkflowBundleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnbindWorkflowBundle", UnbindWorkflowBundleResponse.class);
    }

    /**
     *修改控制台用户组
     * @param req UpdateConsoleGroupRequest
     * @return UpdateConsoleGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConsoleGroupResponse UpdateConsoleGroup(UpdateConsoleGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConsoleGroup", UpdateConsoleGroupResponse.class);
    }

    /**
     *修改控制台用户角色
     * @param req UpdateConsoleUsersRequest
     * @return UpdateConsoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public UpdateConsoleUsersResponse UpdateConsoleUsers(UpdateConsoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateConsoleUsers", UpdateConsoleUsersResponse.class);
    }

    /**
     *更新文件内容与运行配置（计算资源、默认 catalog/schema、参数等），返回更新后的文件元信息。

**前置条件**
1. FileId 对应文件必须存在且为活跃状态；
2. 调用方对该文件有写权限；
3. 仅更新配置时不传 Storage；仅更新内容时不传 FileConfig；
4. FileConfig.ResourceId 非空时会校验资源类型与文件类型的匹配性。

**错误码（Module 均为 `Studio`）**

| 错误码（Code） | InnerCode | 描述 | 处理建议 |
| --- | --- | --- | --- |
| `MissingParameter.WorkspaceId` | 1030001 | 缺少 WorkspaceId | 请传入 WorkspaceId |
| `MissingParameter.FileId` | 1030003 | 缺少 FileId | 请传入 FileId |
| `InvalidParameterValue.FileType` | 1030102 | FileType 取值不支持 | FileType 取 FILE/NOTEBOOK_FILE/SQL_FILE |
| `InvalidParameterValue.ResourceId` | 1030104 | 计算资源类型与文件类型不匹配 | Python/Notebook 选数据计算资源，SQL 选数据分析资源 |
| `ResourceNotFound.FileNotFound` | 1030203 | 文件不存在或已删除 | 请确认 FileId，或调用 GetFile 校验文件状态 |
| `UnauthorizedOperation.FileWriteDenied` | 1030302 | 对该文件无写权限 | 请联系文件负责人或空间管理员授权 |
| `FailedOperation.FileStorageUpdateFailed` | 1030401 | 文件内容写入存储失败 | 请稍后重试，持续失败请携带 RequestId 联系支持 |
| `InternalError` | 1030900 | 服务内部异常 | 请携带 RequestId 联系支持 |
     * @param req UpdateFileRequest
     * @return UpdateFileResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFileResponse UpdateFile(UpdateFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFile", UpdateFileResponse.class);
    }

    /**
     *更新文件夹（支持重命名+移动）
     * @param req UpdateFolderRequest
     * @return UpdateFolderResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFolderResponse UpdateFolder(UpdateFolderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateFolder", UpdateFolderResponse.class);
    }

    /**
     *更新工作流
     * @param req UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowResponse UpdateWorkflow(UpdateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflow", UpdateWorkflowResponse.class);
    }

    /**
     *修改工作空间
     * @param req UpdateWorkspaceRequest
     * @return UpdateWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkspaceResponse UpdateWorkspace(UpdateWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkspace", UpdateWorkspaceResponse.class);
    }

    /**
     *更新工作空间角色
     * @param req UpdateWorkspaceRoleRequest
     * @return UpdateWorkspaceRoleResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkspaceRoleResponse UpdateWorkspaceRole(UpdateWorkspaceRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkspaceRole", UpdateWorkspaceRoleResponse.class);
    }

}
