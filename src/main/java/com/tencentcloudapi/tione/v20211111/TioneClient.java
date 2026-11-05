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
package com.tencentcloudapi.tione.v20211111;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tione.v20211111.models.*;

public class TioneClient extends AbstractClient{
    private static String endpoint = "tione.tencentcloudapi.com";
    private static String service = "tione";
    private static String version = "2021-11-11";

    public TioneClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TioneClient(Credential credential, String region, ClientProfile profile) {
        super(TioneClient.endpoint, TioneClient.version, credential, region, profile);
    }

    /**
     *该接口支持与自行部署的大模型的聊天。

使用该接口调用时需要携带腾讯云的密钥信息用于身份信息鉴权，建议通过腾讯云的云 API SDK调用，具体可以参考
https://cloud.tencent.com/document/product/1278/85305
     * @param req ChatCompletionRequest
     * @return ChatCompletionResponse
     * @throws TencentCloudSDKException
     */
    public ChatCompletionResponse ChatCompletion(ChatCompletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatCompletion", ChatCompletionResponse.class);
    }

    /**
     *创建数据源
     * @param req CreateDataSourceRequest
     * @return CreateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDataSourceResponse CreateDataSource(CreateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataSource", CreateDataSourceResponse.class);
    }

    /**
     *创建数据集
     * @param req CreateDatasetRequest
     * @return CreateDatasetResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasetResponse CreateDataset(CreateDatasetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataset", CreateDatasetResponse.class);
    }

    /**
     *创建任务式建模训练任务，Notebook，在线服务和批量预测任务日志下载任务API
     * @param req CreateExportRequest
     * @return CreateExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateExportResponse CreateExport(CreateExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateExport", CreateExportResponse.class);
    }

    /**
     *用于创建、发布一个新的模型服务
     * @param req CreateModelServiceRequest
     * @return CreateModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelServiceResponse CreateModelService(CreateModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModelService", CreateModelServiceResponse.class);
    }

    /**
     *创建一个 AuthToken
     * @param req CreateModelServiceAuthTokenRequest
     * @return CreateModelServiceAuthTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelServiceAuthTokenResponse CreateModelServiceAuthToken(CreateModelServiceAuthTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModelServiceAuthToken", CreateModelServiceAuthTokenResponse.class);
    }

    /**
     *创建挂载限制
     * @param req CreateMountLimitRequest
     * @return CreateMountLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateMountLimitResponse CreateMountLimit(CreateMountLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMountLimit", CreateMountLimitResponse.class);
    }

    /**
     *创建Notebook
     * @param req CreateNotebookRequest
     * @return CreateNotebookResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookResponse CreateNotebook(CreateNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebook", CreateNotebookResponse.class);
    }

    /**
     *保存镜像
     * @param req CreateNotebookImageRequest
     * @return CreateNotebookImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookImageResponse CreateNotebookImage(CreateNotebookImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookImage", CreateNotebookImageResponse.class);
    }

    /**
     *生成Notebook访问链接
     * @param req CreatePresignedNotebookUrlRequest
     * @return CreatePresignedNotebookUrlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePresignedNotebookUrlResponse CreatePresignedNotebookUrl(CreatePresignedNotebookUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePresignedNotebookUrl", CreatePresignedNotebookUrlResponse.class);
    }

    /**
     *创建自定义角色
     * @param req CreateRoleRequest
     * @return CreateRoleResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoleResponse CreateRole(CreateRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRole", CreateRoleResponse.class);
    }

    /**
     *导入模型
     * @param req CreateTrainingModelRequest
     * @return CreateTrainingModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingModelResponse CreateTrainingModel(CreateTrainingModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrainingModel", CreateTrainingModelResponse.class);
    }

    /**
     *创建模型训练任务
     * @param req CreateTrainingTaskRequest
     * @return CreateTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingTaskResponse CreateTrainingTask(CreateTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrainingTask", CreateTrainingTaskResponse.class);
    }

    /**
     *删除数据源
     * @param req DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDataSourceResponse DeleteDataSource(DeleteDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataSource", DeleteDataSourceResponse.class);
    }

    /**
     *删除数据集
     * @param req DeleteDatasetRequest
     * @return DeleteDatasetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatasetResponse DeleteDataset(DeleteDatasetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataset", DeleteDatasetResponse.class);
    }

    /**
     *删除任务式建模训练任务，Notebook，在线服务和批量预测任务日志导出任务API
     * @param req DeleteExportRequest
     * @return DeleteExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteExportResponse DeleteExport(DeleteExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteExport", DeleteExportResponse.class);
    }

    /**
     *根据服务id删除模型服务
     * @param req DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceResponse DeleteModelService(DeleteModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelService", DeleteModelServiceResponse.class);
    }

    /**
     *删除一个 AuthToken
     * @param req DeleteModelServiceAuthTokenRequest
     * @return DeleteModelServiceAuthTokenResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceAuthTokenResponse DeleteModelServiceAuthToken(DeleteModelServiceAuthTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelServiceAuthToken", DeleteModelServiceAuthTokenResponse.class);
    }

    /**
     *根据服务组id删除服务组下所有模型服务
     * @param req DeleteModelServiceGroupRequest
     * @return DeleteModelServiceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceGroupResponse DeleteModelServiceGroup(DeleteModelServiceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelServiceGroup", DeleteModelServiceGroupResponse.class);
    }

    /**
     *删除挂载限制。注意：删除挂载限制后，该存储对应的所有数据源也会被删除
     * @param req DeleteMountLimitRequest
     * @return DeleteMountLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMountLimitResponse DeleteMountLimit(DeleteMountLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMountLimit", DeleteMountLimitResponse.class);
    }

    /**
     *删除Notebook
     * @param req DeleteNotebookRequest
     * @return DeleteNotebookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookResponse DeleteNotebook(DeleteNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotebook", DeleteNotebookResponse.class);
    }

    /**
     *删除权限角色
     * @param req DeleteRoleRequest
     * @return DeleteRoleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoleResponse DeleteRole(DeleteRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRole", DeleteRoleResponse.class);
    }

    /**
     *删除模型
     * @param req DeleteTrainingModelRequest
     * @return DeleteTrainingModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingModelResponse DeleteTrainingModel(DeleteTrainingModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrainingModel", DeleteTrainingModelResponse.class);
    }

    /**
     *删除模型版本
     * @param req DeleteTrainingModelVersionRequest
     * @return DeleteTrainingModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingModelVersionResponse DeleteTrainingModelVersion(DeleteTrainingModelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrainingModelVersion", DeleteTrainingModelVersionResponse.class);
    }

    /**
     *删除训练任务
     * @param req DeleteTrainingTaskRequest
     * @return DeleteTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingTaskResponse DeleteTrainingTask(DeleteTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrainingTask", DeleteTrainingTaskResponse.class);
    }

    /**
     *列取访问权限规则列表
     * @param req DescribeAccessRulesRequest
     * @return DescribeAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRulesResponse DescribeAccessRules(DescribeAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRules", DescribeAccessRulesResponse.class);
    }

    /**
     *本接口（DescribeAnnotatedTaskList）用于查询用户标注任务详细信息列表；支持各种过滤条件；
     * @param req DescribeAnnotatedTaskListRequest
     * @return DescribeAnnotatedTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAnnotatedTaskListResponse DescribeAnnotatedTaskList(DescribeAnnotatedTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAnnotatedTaskList", DescribeAnnotatedTaskListResponse.class);
    }

    /**
     *查询资源组节点列表
     * @param req DescribeBillingResourceGroupRequest
     * @return DescribeBillingResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceGroupResponse DescribeBillingResourceGroup(DescribeBillingResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceGroup", DescribeBillingResourceGroupResponse.class);
    }

    /**
     *查询资源组关联的工作空间列表
     * @param req DescribeBillingResourceGroupAttachedWorkspacesRequest
     * @return DescribeBillingResourceGroupAttachedWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceGroupAttachedWorkspacesResponse DescribeBillingResourceGroupAttachedWorkspaces(DescribeBillingResourceGroupAttachedWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceGroupAttachedWorkspaces", DescribeBillingResourceGroupAttachedWorkspacesResponse.class);
    }

    /**
     *查询资源组列表
     * @param req DescribeBillingResourceGroupsRequest
     * @return DescribeBillingResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceGroupsResponse DescribeBillingResourceGroups(DescribeBillingResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceGroups", DescribeBillingResourceGroupsResponse.class);
    }

    /**
     *查询资源组节点运行中的任务
     * @param req DescribeBillingResourceInstanceRunningJobsRequest
     * @return DescribeBillingResourceInstanceRunningJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceInstanceRunningJobsResponse DescribeBillingResourceInstanceRunningJobs(DescribeBillingResourceInstanceRunningJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceInstanceRunningJobs", DescribeBillingResourceInstanceRunningJobsResponse.class);
    }

    /**
     *本接口(DescribeBillingSpecs) 提供查询计费项列表
     * @param req DescribeBillingSpecsRequest
     * @return DescribeBillingSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingSpecsResponse DescribeBillingSpecs(DescribeBillingSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingSpecs", DescribeBillingSpecsResponse.class);
    }

    /**
     *本接口(DescribeBillingSpecsPrice)用于查询按量计费计费项价格。
     * @param req DescribeBillingSpecsPriceRequest
     * @return DescribeBillingSpecsPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingSpecsPriceResponse DescribeBillingSpecsPrice(DescribeBillingSpecsPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingSpecsPrice", DescribeBillingSpecsPriceResponse.class);
    }

    /**
     *获取内置镜像列表
     * @param req DescribeBuildInImagesRequest
     * @return DescribeBuildInImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBuildInImagesResponse DescribeBuildInImages(DescribeBuildInImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBuildInImages", DescribeBuildInImagesResponse.class);
    }

    /**
     *获取数据源详情
     * @param req DescribeDataSourceRequest
     * @return DescribeDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourceResponse DescribeDataSource(DescribeDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSource", DescribeDataSourceResponse.class);
    }

    /**
     *获取数据源列表
     * @param req DescribeDataSourcesRequest
     * @return DescribeDataSourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDataSourcesResponse DescribeDataSources(DescribeDataSourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDataSources", DescribeDataSourcesResponse.class);
    }

    /**
     *查询数据集列表
     * @param req DescribeDatasetsRequest
     * @return DescribeDatasetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetsResponse DescribeDatasets(DescribeDatasetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasets", DescribeDatasetsResponse.class);
    }

    /**
     *获取任务式建模训练任务，Notebook，在线服务和批量预测任务的事件API
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
    }

    /**
     *查看任务式建模训练任务，Notebook，在线服务和批量预测任务日志下载任务状态API
     * @param req DescribeExportRequest
     * @return DescribeExportResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExportResponse DescribeExport(DescribeExportRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExport", DescribeExportResponse.class);
    }

    /**
     *已废弃，收敛到统一接口

查询推理镜像模板
     * @param req DescribeInferTemplatesRequest
     * @return DescribeInferTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferTemplatesResponse DescribeInferTemplates(DescribeInferTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferTemplates", DescribeInferTemplatesResponse.class);
    }

    /**
     *获取任务式建模训练任务，Notebook，在线服务和批量预测任务的日志API
     * @param req DescribeLogsRequest
     * @return DescribeLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsResponse DescribeLogs(DescribeLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogs", DescribeLogsResponse.class);
    }

    /**
     *查询模型优化任务详情
     * @param req DescribeModelAccelerateTaskRequest
     * @return DescribeModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateTaskResponse DescribeModelAccelerateTask(DescribeModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelAccelerateTask", DescribeModelAccelerateTaskResponse.class);
    }

    /**
     *模型加速之后的模型版本列表
     * @param req DescribeModelAccelerateVersionsRequest
     * @return DescribeModelAccelerateVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateVersionsResponse DescribeModelAccelerateVersions(DescribeModelAccelerateVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelAccelerateVersions", DescribeModelAccelerateVersionsResponse.class);
    }

    /**
     *查询单个服务
     * @param req DescribeModelServiceRequest
     * @return DescribeModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceResponse DescribeModelService(DescribeModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelService", DescribeModelServiceResponse.class);
    }

    /**
     *展示服务的调用信息
     * @param req DescribeModelServiceCallInfoRequest
     * @return DescribeModelServiceCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceCallInfoResponse DescribeModelServiceCallInfo(DescribeModelServiceCallInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceCallInfo", DescribeModelServiceCallInfoResponse.class);
    }

    /**
     *查询单个服务组
     * @param req DescribeModelServiceGroupRequest
     * @return DescribeModelServiceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceGroupResponse DescribeModelServiceGroup(DescribeModelServiceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceGroup", DescribeModelServiceGroupResponse.class);
    }

    /**
     *列举在线推理服务组
     * @param req DescribeModelServiceGroupsRequest
     * @return DescribeModelServiceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceGroupsResponse DescribeModelServiceGroups(DescribeModelServiceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceGroups", DescribeModelServiceGroupsResponse.class);
    }

    /**
     *用于查询模型服务能否开启热更新
     * @param req DescribeModelServiceHotUpdatedRequest
     * @return DescribeModelServiceHotUpdatedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceHotUpdatedResponse DescribeModelServiceHotUpdated(DescribeModelServiceHotUpdatedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceHotUpdated", DescribeModelServiceHotUpdatedResponse.class);
    }

    /**
     *DescribeMountInstance
     * @param req DescribeMountInstanceRequest
     * @return DescribeMountInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountInstanceResponse DescribeMountInstance(DescribeMountInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountInstance", DescribeMountInstanceResponse.class);
    }

    /**
     *非数据源挂载时获取实例列表
     * @param req DescribeMountInstancesRequest
     * @return DescribeMountInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountInstancesResponse DescribeMountInstances(DescribeMountInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountInstances", DescribeMountInstancesResponse.class);
    }

    /**
     *获取挂载限制列表
     * @param req DescribeMountLimitsRequest
     * @return DescribeMountLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMountLimitsResponse DescribeMountLimits(DescribeMountLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMountLimits", DescribeMountLimitsResponse.class);
    }

    /**
     *Notebook详情
     * @param req DescribeNotebookRequest
     * @return DescribeNotebookResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookResponse DescribeNotebook(DescribeNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebook", DescribeNotebookResponse.class);
    }

    /**
     *Notebook列表
     * @param req DescribeNotebooksRequest
     * @return DescribeNotebooksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebooksResponse DescribeNotebooks(DescribeNotebooksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebooks", DescribeNotebooksResponse.class);
    }

    /**
     *查询平台镜像信息
     * @param req DescribePlatformImagesRequest
     * @return DescribePlatformImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlatformImagesResponse DescribePlatformImages(DescribePlatformImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePlatformImages", DescribePlatformImagesResponse.class);
    }

    /**
     *该接口用于查询内置镜像列表
     * @param req DescribePresetImageListRequest
     * @return DescribePresetImageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePresetImageListResponse DescribePresetImageList(DescribePresetImageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePresetImageList", DescribePresetImageListResponse.class);
    }

    /**
     *公共算法版本列表
     * @param req DescribePublicAlgoVersionListRequest
     * @return DescribePublicAlgoVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicAlgoVersionListResponse DescribePublicAlgoVersionList(DescribePublicAlgoVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicAlgoVersionList", DescribePublicAlgoVersionListResponse.class);
    }

    /**
     *获取角色详情
     * @param req DescribeRoleRequest
     * @return DescribeRoleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleResponse DescribeRole(DescribeRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRole", DescribeRoleResponse.class);
    }

    /**
     *获取角色下已授权的用户列表
     * @param req DescribeRoleUsersRequest
     * @return DescribeRoleUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoleUsersResponse DescribeRoleUsers(DescribeRoleUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoleUsers", DescribeRoleUsersResponse.class);
    }

    /**
     *获取角色列表
     * @param req DescribeRolesRequest
     * @return DescribeRolesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRolesResponse DescribeRoles(DescribeRolesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRoles", DescribeRolesResponse.class);
    }

    /**
     *批量查询子账号Linux用户信息
     * @param req DescribeSubAccountLinuxUserInfosRequest
     * @return DescribeSubAccountLinuxUserInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubAccountLinuxUserInfosResponse DescribeSubAccountLinuxUserInfos(DescribeSubAccountLinuxUserInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubAccountLinuxUserInfos", DescribeSubAccountLinuxUserInfosResponse.class);
    }

    /**
     *查询模型版本
     * @param req DescribeTrainingModelVersionRequest
     * @return DescribeTrainingModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelVersionResponse DescribeTrainingModelVersion(DescribeTrainingModelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingModelVersion", DescribeTrainingModelVersionResponse.class);
    }

    /**
     *模型版本列表
     * @param req DescribeTrainingModelVersionsRequest
     * @return DescribeTrainingModelVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelVersionsResponse DescribeTrainingModelVersions(DescribeTrainingModelVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingModelVersions", DescribeTrainingModelVersionsResponse.class);
    }

    /**
     *训练任务详情
     * @param req DescribeTrainingTaskRequest
     * @return DescribeTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskResponse DescribeTrainingTask(DescribeTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTask", DescribeTrainingTaskResponse.class);
    }

    /**
     *获取单个训练任务实例的登录链接
     * @param req DescribeTrainingTaskPodUrlRequest
     * @return DescribeTrainingTaskPodUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskPodUrlResponse DescribeTrainingTaskPodUrl(DescribeTrainingTaskPodUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTaskPodUrl", DescribeTrainingTaskPodUrlResponse.class);
    }

    /**
     *训练任务pod列表
     * @param req DescribeTrainingTaskPodsRequest
     * @return DescribeTrainingTaskPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskPodsResponse DescribeTrainingTaskPods(DescribeTrainingTaskPodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTaskPods", DescribeTrainingTaskPodsResponse.class);
    }

    /**
     *训练任务列表
     * @param req DescribeTrainingTasksRequest
     * @return DescribeTrainingTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTasksResponse DescribeTrainingTasks(DescribeTrainingTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTasks", DescribeTrainingTasksResponse.class);
    }

    /**
     *查询工作空间详情
     * @param req DescribeWorkspaceRequest
     * @return DescribeWorkspaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceResponse DescribeWorkspace(DescribeWorkspaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspace", DescribeWorkspaceResponse.class);
    }

    /**
     *查询空间成员列表
     * @param req DescribeWorkspaceMembersRequest
     * @return DescribeWorkspaceMembersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceMembersResponse DescribeWorkspaceMembers(DescribeWorkspaceMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceMembers", DescribeWorkspaceMembersResponse.class);
    }

    /**
     *## DescribeWorkspaceQuotaUsage 接口文档

### 接口描述
查询工作空间配额用量信息。该接口用于查询指定工作空间下某个子账号的配额使用情况，支持多种配额类型（CBS存储配额、Notebook开发机数量配额、托管按量资源规格限制）。

### 错误码

| 错误码 | 说明 |
|--------|------|
| InvalidParameterValue | 参数值无效（如必填参数为空、QuotaType不在枚举范围内） |
| FailedOperation.QueryDatabaseFail | 数据库查询失败 |

### 示例

**请求示例**：
```json
{
  "QuotaType": "Notebook",
  "SupervisorUin": "100012345678",
  "SupervisorSubUin": "100012345679",
  "TiProjectId": "ti-proj-123456"
}
```

**响应示例**：
```json
{
  "QuotaType": "Notebook",
  "QuotaEnabled": true,
  "TotalQuota": 10,
  "UsedQuota": 3,
}
```
     * @param req DescribeWorkspaceQuotaUsageRequest
     * @return DescribeWorkspaceQuotaUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceQuotaUsageResponse DescribeWorkspaceQuotaUsage(DescribeWorkspaceQuotaUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceQuotaUsage", DescribeWorkspaceQuotaUsageResponse.class);
    }

    /**
     *# DescribeWorkspaceQuotas 接口文档

## 接口描述

查询指定工作空间下的配额配置和配额列表。该接口用于获取主账号在某个工作空间下的配额管理配置，包括是否启用配额管理、默认配额值以及针对子账号或用户组的具体配额分配情况。

支持三种配额类型：
- **CBS**：CBS存储配额管理
- **Notebook**：开发机数量配额管理
- **PostPaySpec**：托管按量资源规格限制



## 请求参数

### 公共参数（HTTP Header）
| 参数名 | 类型 | 必填 | 描述 |
|--------|------|------|------|
| X-TC-Uin | string | 是 | 主账号Uin |
| X-TC-ProjectId | uint32 | 是 | 工作空间ID |

### 请求体参数
| 参数名 | 类型 | 必填 | 描述 |
|--------|------|------|------|
| QuotaType | string | 是 | 配额类型，可选值：<br>- `CBS`：CBS存储配额<br>- `Notebook`：开发机数量配额<br>- `PostPaySpec`：托管按量资源规格限制 |

## 响应参数

| 参数名 | 类型 | 描述 |
|--------|------|------|
| QuotaType | string | 配额类型 |
| QuotaEnabled | bool | 是否启用配额管理功能 |
| DefaultQuota | WorkspaceQuota | 默认配额配置（当QuotaEnabled为false时为空对象） |
| Quotas | ][WorkspaceQuota | 配额列表，包含所有子账号或用户组的配额配置（仅当QuotaEnabled为true时返回） |

### WorkspaceQuota

| 参数名 | 类型 | 描述 |
|--------|------|------|
| Id | string | 配额ID，格式：<br>- 用户配额：`{quota_type}-{uin}-{subuin}-{TiProjectId}`<br>- 用户组配额：`{quota_type}-{uin}-{groupid}-{TiProjectId}`<br>- 默认配额：`{quota_type}-{uin}-default-{TiProjectId}` |
| QuotaType | string | 配额类型 |
| Uin | string | 主账号Uin |
| SubUin | string | 子账号Uin（当TargetType为USER时有值） |
| SubUinName | string | 子账号名称（当TargetType为USER时有值） |
| QuotaValue | uint32 | 配额值：<br>- CBS：容量（GiB），默认100，范围10-10000<br>- Notebook：数量（个），默认1，范围1-999<br>- PostPaySpec：无意义，关注QuotaData字段 |
| QuotaData | []string | 配额数据（JSON数组格式）：<br>- 当QuotaType为PostPaySpec时，存储允许使用的规格ID列表 |
| TargetType | string | 配额目标类型：<br>- `USER`：用户配额<br>- `USER_GROUP`：用户组配额 |
| GroupId | string | 用户组ID（当TargetType为USER_GROUP时有值） |
| GroupName | string | 用户组名称（当TargetType为USER_GROUP时有值） |
| TiProjectId | string | 工作空间ID |

## 业务逻辑

1. **参数校验**：验证QuotaType参数是否合法
2. **查询配额配置**：根据主账号Uin、工作空间ID和配额类型查询配额配置
3. **配置不存在**：
   - 返回系统默认的配额启用状态和默认配额值
   - CBS默认启用，默认值100GiB
   - Notebook默认启用，默认值1个
   - PostPaySpec默认不启用
4. **配置存在但未启用**：
   - QuotaEnabled返回false
   - DefaultQuota返回空对象
   - Quotas不返回
5. **配置存在且已启用**：
   - QuotaEnabled返回true
   - DefaultQuota返回配置的默认配额值
   - Quotas返回所有子账号或用户组的配额列表
   - 自动反序列化QuotaData字段（JSON数组）

## 使用场景

1. **配额管理页面初始化**：获取当前工作空间的配额配置状态
2. **配额列表展示**：展示所有子账号或用户组的配额分配情况
3. **配额编辑前查询**：在修改配额前获取当前配置
4. **权限控制判断**：判断是否启用了配额管理功能

## 错误码

| 错误码 | 描述 | 解决方案 |
|--------|------|----------|
| InvalidParameterValue | 参数值错误 | 检查QuotaType参数是否为合法值（CBS/Notebook/PostPaySpec） |
| FailedOperation.QueryDatabaseFail | 数据库查询失败 | 稍后重试或联系管理员 |

## 请求示例

```json
{
  "QuotaType": "CBS"
}
```

**HTTP Header:**
```
X-TC-Uin: 100012345678
X-TC-ProjectId: 123456
```

## 响应示例

### 示例1：配额已启用且有配额列表

```json
{
  "QuotaType": "CBS",
  "QuotaEnabled": true,
  "DefaultQuota": {
    "Id": "CBS-100012345678-default-123456",
    "QuotaType": "CBS",
    "Uin": "100012345678",
    "SubUin": "",
    "SubUinName": "",
    "QuotaValue": 100,
    "QuotaData": [],
    "TargetType": "",
    "GroupId": "",
    "GroupName": "",
    "TiProjectId": "123456"
  },
  "Quotas": [
    {
      "Id": "CBS-100012345678-100012345679-123456",
      "QuotaType": "CBS",
      "Uin": "100012345678",
      "SubUin": "100012345679",
      "SubUinName": "张三",
      "QuotaValue": 200,
      "QuotaData": [],
      "TargetType": "USER",
      "GroupId": "",
      "GroupName": "",
      "TiProjectId": "123456"
    },
    {
      "Id": "CBS-100012345678-group001-123456",
      "QuotaType": "CBS",
      "Uin": "100012345678",
      "SubUin": "",
      "SubUinName": "",
      "QuotaValue": 500,
      "QuotaData": [],
      "TargetType": "USER_GROUP",
      "GroupId": "group001",
      "GroupName": "开发组",
      "TiProjectId": "123456"
    }
  ]
}
```

### 示例2：配额未启用

```json
{
  "QuotaType": "PostPaySpec",
  "QuotaEnabled": false,
  "DefaultQuota": {},
  "Quotas": []
}
```

### 示例3：PostPaySpec类型配额（带QuotaData）

```json
{
  "QuotaType": "PostPaySpec",
  "QuotaEnabled": true,
  "DefaultQuota": {
    "Id": "PostPaySpec-100012345678-default-123456",
    "QuotaType": "PostPaySpec",
    "Uin": "100012345678",
    "SubUin": "",
    "SubUinName": "",
    "QuotaValue": 0,
    "QuotaData": ["spec-001", "spec-002", "spec-003"],
    "TargetType": "",
    "GroupId": "",
    "GroupName": "",
    "TiProjectId": "123456"
  },
  "Quotas": [
    {
      "Id": "PostPaySpec-100012345678-100012345679-123456",
      "QuotaType": "PostPaySpec",
      "Uin": "100012345678",
      "SubUin": "100012345679",
      "SubUinName": "李四",
      "QuotaValue": 0,
      "QuotaData": ["spec-001", "spec-002"],
      "TargetType": "USER",
      "GroupId": "",
      "GroupName": "",
      "TiProjectId": "123456"
    }
  ]
}
```

## 注意事项

1. **配额继承规则**：
   - 如果子账号或用户组没有单独配置配额，则使用DefaultQuota的值
   - 用户组配额优先级高于默认配额，用户配额优先级最高

2. **QuotaData字段**：
   - 仅在QuotaType为PostPaySpec时有实际意义
   - 存储的是允许使用的规格ID列表
   - 其他类型的配额该字段为空数组

3. **TargetType字段**：
   - DefaultQuota的TargetType为空字符串
   - Quotas列表中的每个配额都有明确的TargetType

4. **配额值单位**：
   - CBS配额：GiB（1 GiB = 1024 MiB）
   - Notebook配额：个数

5. **性能优化**：
   - 接口会一次性返回所有配额列表，避免多次查询
   - 建议前端做好缓存，减少重复请求
     * @param req DescribeWorkspaceQuotasRequest
     * @return DescribeWorkspaceQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspaceQuotasResponse DescribeWorkspaceQuotas(DescribeWorkspaceQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaceQuotas", DescribeWorkspaceQuotasResponse.class);
    }

    /**
     *查询工作空间列表
     * @param req DescribeWorkspacesRequest
     * @return DescribeWorkspacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWorkspacesResponse DescribeWorkspaces(DescribeWorkspacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWorkspaces", DescribeWorkspacesResponse.class);
    }

    /**
     *开启CLS日志投递
     * @param req EnableTrainingTaskClsConfigRequest
     * @return EnableTrainingTaskClsConfigResponse
     * @throws TencentCloudSDKException
     */
    public EnableTrainingTaskClsConfigResponse EnableTrainingTaskClsConfig(EnableTrainingTaskClsConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableTrainingTaskClsConfig", EnableTrainingTaskClsConfigResponse.class);
    }

    /**
     *用于更新模型服务
     * @param req ModifyModelServiceRequest
     * @return ModifyModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServiceResponse ModifyModelService(ModifyModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelService", ModifyModelServiceResponse.class);
    }

    /**
     *修改一个 AuthToken
     * @param req ModifyModelServiceAuthTokenRequest
     * @return ModifyModelServiceAuthTokenResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServiceAuthTokenResponse ModifyModelServiceAuthToken(ModifyModelServiceAuthTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelServiceAuthToken", ModifyModelServiceAuthTokenResponse.class);
    }

    /**
     *修改服务鉴权配置
     * @param req ModifyModelServiceAuthorizationRequest
     * @return ModifyModelServiceAuthorizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServiceAuthorizationResponse ModifyModelServiceAuthorization(ModifyModelServiceAuthorizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelServiceAuthorization", ModifyModelServiceAuthorizationResponse.class);
    }

    /**
     *修改Notebook
     * @param req ModifyNotebookRequest
     * @return ModifyNotebookResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotebookResponse ModifyNotebook(ModifyNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotebook", ModifyNotebookResponse.class);
    }

    /**
     *修改Notebook标签
     * @param req ModifyNotebookTagsRequest
     * @return ModifyNotebookTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotebookTagsResponse ModifyNotebookTags(ModifyNotebookTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotebookTags", ModifyNotebookTagsResponse.class);
    }

    /**
     *修改自定义角色
     * @param req ModifyRoleRequest
     * @return ModifyRoleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleResponse ModifyRole(ModifyRoleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRole", ModifyRoleResponse.class);
    }

    /**
     *修改自定义角色的权限规则
     * @param req ModifyRoleAccessRulesRequest
     * @return ModifyRoleAccessRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleAccessRulesResponse ModifyRoleAccessRules(ModifyRoleAccessRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoleAccessRules", ModifyRoleAccessRulesResponse.class);
    }

    /**
     *修改角色下用户的授权状态
     * @param req ModifyRoleUserGrantRequest
     * @return ModifyRoleUserGrantResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoleUserGrantResponse ModifyRoleUserGrant(ModifyRoleUserGrantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRoleUserGrant", ModifyRoleUserGrantResponse.class);
    }

    /**
     *更新推理服务组流量分配
     * @param req ModifyServiceGroupWeightsRequest
     * @return ModifyServiceGroupWeightsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceGroupWeightsResponse ModifyServiceGroupWeights(ModifyServiceGroupWeightsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceGroupWeights", ModifyServiceGroupWeightsResponse.class);
    }

    /**
     *更新用户授权
     * @param req ModifyUserGrantRequest
     * @return ModifyUserGrantResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserGrantResponse ModifyUserGrant(ModifyUserGrantRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUserGrant", ModifyUserGrantResponse.class);
    }

    /**
     *更新空间用户列表
     * @param req ModifyWorkspaceMembersRequest
     * @return ModifyWorkspaceMembersResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWorkspaceMembersResponse ModifyWorkspaceMembers(ModifyWorkspaceMembersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyWorkspaceMembers", ModifyWorkspaceMembersResponse.class);
    }

    /**
     *上报训练自定义指标
     * @param req PushTrainingMetricsRequest
     * @return PushTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public PushTrainingMetricsResponse PushTrainingMetrics(PushTrainingMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PushTrainingMetrics", PushTrainingMetricsResponse.class);
    }

    /**
     *启动Notebook
     * @param req StartNotebookRequest
     * @return StartNotebookResponse
     * @throws TencentCloudSDKException
     */
    public StartNotebookResponse StartNotebook(StartNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartNotebook", StartNotebookResponse.class);
    }

    /**
     *启动模型训练任务
     * @param req StartTrainingTaskRequest
     * @return StartTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartTrainingTaskResponse StartTrainingTask(StartTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartTrainingTask", StartTrainingTaskResponse.class);
    }

    /**
     *停止模型加速任务
     * @param req StopModelAccelerateTaskRequest
     * @return StopModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopModelAccelerateTaskResponse StopModelAccelerateTask(StopModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopModelAccelerateTask", StopModelAccelerateTaskResponse.class);
    }

    /**
     *停止Notebook
     * @param req StopNotebookRequest
     * @return StopNotebookResponse
     * @throws TencentCloudSDKException
     */
    public StopNotebookResponse StopNotebook(StopNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopNotebook", StopNotebookResponse.class);
    }

    /**
     *停止模型训练任务
     * @param req StopTrainingTaskRequest
     * @return StopTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopTrainingTaskResponse StopTrainingTask(StopTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTrainingTask", StopTrainingTaskResponse.class);
    }

    /**
     *更新数据源
     * @param req UpdateDataSourceRequest
     * @return UpdateDataSourceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDataSourceResponse UpdateDataSource(UpdateDataSourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDataSource", UpdateDataSourceResponse.class);
    }

    /**
     *创建挂载限制
     * @param req UpdateMountLimitRequest
     * @return UpdateMountLimitResponse
     * @throws TencentCloudSDKException
     */
    public UpdateMountLimitResponse UpdateMountLimit(UpdateMountLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateMountLimit", UpdateMountLimitResponse.class);
    }

    /**
     *更新子账号Linux用户信息
     * @param req UpdateSubAccountLinuxUserInfoRequest
     * @return UpdateSubAccountLinuxUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateSubAccountLinuxUserInfoResponse UpdateSubAccountLinuxUserInfo(UpdateSubAccountLinuxUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateSubAccountLinuxUserInfo", UpdateSubAccountLinuxUserInfoResponse.class);
    }

}
