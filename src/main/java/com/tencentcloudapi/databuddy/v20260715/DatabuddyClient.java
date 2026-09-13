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
     *更新工作流
     * @param req UpdateWorkflowRequest
     * @return UpdateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public UpdateWorkflowResponse UpdateWorkflow(UpdateWorkflowRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateWorkflow", UpdateWorkflowResponse.class);
    }

}
