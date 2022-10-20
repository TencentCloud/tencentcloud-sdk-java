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
package com.tencentcloudapi.wedata.v20210820;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wedata.v20210820.models.*;

public class WedataClient extends AbstractClient{
    private static String endpoint = "wedata.tencentcloudapi.com";
    private static String service = "wedata";
    private static String version = "2021-08-20";

    public WedataClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WedataClient(Credential credential, String region, ClientProfile profile) {
        super(WedataClient.endpoint, WedataClient.version, credential, region, profile);
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量删除任务，仅对任务状态为”已停止“有效；

     * @param req BatchDeleteTasksNewRequest
     * @return BatchDeleteTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteTasksNewResponse BatchDeleteTasksNew(BatchDeleteTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDeleteTasksNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDeleteTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDeleteTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量修改任务责任人
     * @param req BatchModifyOwnersNewRequest
     * @return BatchModifyOwnersNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchModifyOwnersNewResponse BatchModifyOwnersNew(BatchModifyOwnersNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchModifyOwnersNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchModifyOwnersNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchModifyOwnersNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
仅对任务状态为”调度中“和”已暂停“有效，对所选任务的任务实例进行终止，并停止调度
     * @param req BatchStopTasksNewRequest
     * @return BatchStopTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public BatchStopTasksNewResponse BatchStopTasksNew(BatchStopTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchStopTasksNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchStopTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchStopTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 创建用户自定义函数
     * @param req CreateCustomFunctionRequest
     * @return CreateCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomFunctionResponse CreateCustomFunction(CreateCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomFunctionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建数据源
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDataSourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDataSourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataSource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建文件夹
     * @param req CreateFolderRequest
     * @return CreateFolderResponse
     * @throws TencentCloudSDKException
     */
    public CreateFolderResponse CreateFolder(CreateFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFolderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源管理需要先将资源上传到cos中，然后调用该接口，将cos资源绑定到wedata
     * @param req CreateOrUpdateResourceRequest
     * @return CreateOrUpdateResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrUpdateResourceResponse CreateOrUpdateResource(CreateOrUpdateResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrUpdateResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrUpdateResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrUpdateResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建任务
     * @param req CreateTaskRequest
     * @return CreateTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTaskResponse CreateTask(CreateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
创建工作流
     * @param req CreateWorkflowRequest
     * @return CreateWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public CreateWorkflowResponse CreateWorkflow(CreateWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWorkflowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除用户自定义函数
     * @param req DeleteCustomFunctionRequest
     * @return DeleteCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomFunctionResponse DeleteCustomFunction(DeleteCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomFunctionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除数据源
     * @param req DeleteDataSourcesRequest
     * @return DeleteDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourcesResponse DeleteDataSources(DeleteDataSourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDataSourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDataSourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDataSources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除文件夹
     * @param req DeleteFolderRequest
     * @return DeleteFolderResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFolderResponse DeleteFolder(DeleteFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFolderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资源管理删除资源
     * @param req DeleteResourceRequest
     * @return DeleteResourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteResourceResponse DeleteResource(DeleteResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
删除工作流
     * @param req DeleteWorkflowNewRequest
     * @return DeleteWorkflowNewResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWorkflowNewResponse DeleteWorkflowNew(DeleteWorkflowNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWorkflowNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWorkflowNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWorkflowNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源详情
     * @param req DescribeDataSourceListRequest
     * @return DescribeDataSourceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceListResponse DescribeDataSourceList(DescribeDataSourceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataSourceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataSourceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataSourceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源列表
     * @param req DescribeDataSourceWithoutInfoRequest
     * @return DescribeDataSourceWithoutInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceWithoutInfoResponse DescribeDataSourceWithoutInfo(DescribeDataSourceWithoutInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDataSourceWithoutInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDataSourceWithoutInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDataSourceWithoutInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
数据源详情
     * @param req DescribeDatasourceRequest
     * @return DescribeDatasourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasourceResponse DescribeDatasource(DescribeDatasourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatasourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatasourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatasource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
根据层级查找上/下游任务节点
     * @param req DescribeDependTasksNewRequest
     * @return DescribeDependTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDependTasksNewResponse DescribeDependTasksNew(DescribeDependTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDependTasksNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDependTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDependTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
拉取文件夹目录
     * @param req DescribeFolderListRequest
     * @return DescribeFolderListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderListResponse DescribeFolderList(DescribeFolderListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFolderListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFolderListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFolderList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
拉取文件夹下的工作流
     * @param req DescribeFolderWorkflowListRequest
     * @return DescribeFolderWorkflowListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFolderWorkflowListResponse DescribeFolderWorkflowList(DescribeFolderWorkflowListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFolderWorkflowListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFolderWorkflowListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFolderWorkflowList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询函数分类
     * @param req DescribeFunctionKindsRequest
     * @return DescribeFunctionKindsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionKindsResponse DescribeFunctionKinds(DescribeFunctionKindsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFunctionKindsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFunctionKindsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFunctionKinds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询函数类型
     * @param req DescribeFunctionTypesRequest
     * @return DescribeFunctionTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFunctionTypesResponse DescribeFunctionTypes(DescribeFunctionTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFunctionTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFunctionTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFunctionTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
获取实例日志列表
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询全量函数
     * @param req DescribeOrganizationalFunctionsRequest
     * @return DescribeOrganizationalFunctionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationalFunctionsResponse DescribeOrganizationalFunctions(DescribeOrganizationalFunctionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationalFunctionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationalFunctionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganizationalFunctions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取项目信息
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务实例的关联实例列表
     * @param req DescribeRelatedInstancesRequest
     * @return DescribeRelatedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRelatedInstancesResponse DescribeRelatedInstances(DescribeRelatedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRelatedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRelatedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRelatedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资源管理目录树
     * @param req DescribeResourceManagePathTreesRequest
     * @return DescribeResourceManagePathTreesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceManagePathTreesResponse DescribeResourceManagePathTrees(DescribeResourceManagePathTreesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceManagePathTreesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceManagePathTreesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceManagePathTrees");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
查询任务具体详情
     * @param req DescribeTaskDetailRequest
     * @return DescribeTaskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskDetailResponse DescribeTaskDetail(DescribeTaskDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务实例列表
     * @param req DescribeTaskInstancesRequest
     * @return DescribeTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskInstancesResponse DescribeTaskInstances(DescribeTaskInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
查询任务脚本
     * @param req DescribeTaskScriptRequest
     * @return DescribeTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskScriptResponse DescribeTaskScript(DescribeTaskScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
根据工作流分页查询任务
     * @param req DescribeTasksByPageRequest
     * @return DescribeTasksByPageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTasksByPageResponse DescribeTasksByPage(DescribeTasksByPageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTasksByPageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTasksByPageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTasksByPage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量置成功
     * @param req ForceSucInstancesRequest
     * @return ForceSucInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ForceSucInstancesResponse ForceSucInstances(ForceSucInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForceSucInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ForceSucInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForceSucInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
批量冻结任务
     * @param req FreezeTasksRequest
     * @return FreezeTasksResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksResponse FreezeTasks(FreezeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
基于多个工作流进行批量冻结任务操作
     * @param req FreezeTasksByMultiWorkflowRequest
     * @return FreezeTasksByMultiWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public FreezeTasksByMultiWorkflowResponse FreezeTasksByMultiWorkflow(FreezeTasksByMultiWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeTasksByMultiWorkflowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeTasksByMultiWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeTasksByMultiWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量终止操作
     * @param req KillInstancesRequest
     * @return KillInstancesResponse
     * @throws TencentCloudSDKException
     */
    public KillInstancesResponse KillInstances(KillInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KillInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<KillInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "KillInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
任务批量补录，调度状态任务才可以补录；



     * @param req MakeUpTasksNewRequest
     * @return MakeUpTasksNewResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpTasksNewResponse MakeUpTasksNew(MakeUpTasksNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MakeUpTasksNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MakeUpTasksNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MakeUpTasksNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
工作流下所有任务的补录
     * @param req MakeUpWorkflowNewRequest
     * @return MakeUpWorkflowNewResponse
     * @throws TencentCloudSDKException
     */
    public MakeUpWorkflowNewResponse MakeUpWorkflowNew(MakeUpWorkflowNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MakeUpWorkflowNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<MakeUpWorkflowNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "MakeUpWorkflowNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
修改数据源
     * @param req ModifyDataSourceRequest
     * @return ModifyDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDataSourceResponse ModifyDataSource(ModifyDataSourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDataSourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDataSourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDataSource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
文件夹更新
     * @param req ModifyFolderRequest
     * @return ModifyFolderResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFolderResponse ModifyFolder(ModifyFolderRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFolderResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyFolderResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyFolder");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新任务
     * @param req ModifyTaskInfoRequest
     * @return ModifyTaskInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskInfoResponse ModifyTaskInfo(ModifyTaskInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
添加父任务依赖
     * @param req ModifyTaskLinksRequest
     * @return ModifyTaskLinksResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskLinksResponse ModifyTaskLinks(ModifyTaskLinksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskLinksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskLinksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskLinks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
修改任务脚本
     * @param req ModifyTaskScriptRequest
     * @return ModifyTaskScriptResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTaskScriptResponse ModifyTaskScript(ModifyTaskScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTaskScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTaskScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTaskScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新工作流
     * @param req ModifyWorkflowInfoRequest
     * @return ModifyWorkflowInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowInfoResponse ModifyWorkflowInfo(ModifyWorkflowInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkflowInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkflowInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWorkflowInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
更新工作流调度
     * @param req ModifyWorkflowScheduleRequest
     * @return ModifyWorkflowScheduleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkflowScheduleResponse ModifyWorkflowSchedule(ModifyWorkflowScheduleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWorkflowScheduleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWorkflowScheduleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWorkflowSchedule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
注册事件
     * @param req RegisterEventRequest
     * @return RegisterEventResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventResponse RegisterEvent(RegisterEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
注册事件监听器
     * @param req RegisterEventListenerRequest
     * @return RegisterEventListenerResponse
     * @throws TencentCloudSDKException
     */
    public RegisterEventListenerResponse RegisterEventListener(RegisterEventListenerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterEventListenerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterEventListenerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RegisterEventListener");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
实例批量重跑
     * @param req RerunInstancesRequest
     * @return RerunInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RerunInstancesResponse RerunInstances(RerunInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RerunInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RerunInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RerunInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
运行任务
     * @param req RunTaskRequest
     * @return RunTaskResponse
     * @throws TencentCloudSDKException
     */
    public RunTaskResponse RunTask(RunTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RunTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *保存用户自定义函数
     * @param req SaveCustomFunctionRequest
     * @return SaveCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SaveCustomFunctionResponse SaveCustomFunction(SaveCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SaveCustomFunctionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SaveCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SaveCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
设置任务告警，新建/更新告警信息（最新）
     * @param req SetTaskAlarmNewRequest
     * @return SetTaskAlarmNewResponse
     * @throws TencentCloudSDKException
     */
    public SetTaskAlarmNewResponse SetTaskAlarmNew(SetTaskAlarmNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetTaskAlarmNewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetTaskAlarmNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetTaskAlarmNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提交自定义函数
     * @param req SubmitCustomFunctionRequest
     * @return SubmitCustomFunctionResponse
     * @throws TencentCloudSDKException
     */
    public SubmitCustomFunctionResponse SubmitCustomFunction(SubmitCustomFunctionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitCustomFunctionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitCustomFunctionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitCustomFunction");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
提交任务
     * @param req SubmitTaskRequest
     * @return SubmitTaskResponse
     * @throws TencentCloudSDKException
     */
    public SubmitTaskResponse SubmitTask(SubmitTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
提交工作流
     * @param req SubmitWorkflowRequest
     * @return SubmitWorkflowResponse
     * @throws TencentCloudSDKException
     */
    public SubmitWorkflowResponse SubmitWorkflow(SubmitWorkflowRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SubmitWorkflowResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SubmitWorkflowResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SubmitWorkflow");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *<p style="color:red;">[注意：该Beta版本只满足广州区部分白名单客户使用]</p>
触发事件
     * @param req TriggerEventRequest
     * @return TriggerEventResponse
     * @throws TencentCloudSDKException
     */
    public TriggerEventResponse TriggerEvent(TriggerEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TriggerEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TriggerEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TriggerEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
