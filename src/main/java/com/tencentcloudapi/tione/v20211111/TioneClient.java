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
     *批量创建模型加速任务
     * @param req CreateBatchModelAccTasksRequest
     * @return CreateBatchModelAccTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchModelAccTasksResponse CreateBatchModelAccTasks(CreateBatchModelAccTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchModelAccTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchModelAccTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatchModelAccTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建跑批任务
     * @param req CreateBatchTaskRequest
     * @return CreateBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchTaskResponse CreateBatchTask(CreateBatchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBatchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBatchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBatchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建数据集
     * @param req CreateDatasetRequest
     * @return CreateDatasetResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasetResponse CreateDataset(CreateDatasetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDatasetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDatasetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDataset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建、发布一个新的模型服务
     * @param req CreateModelServiceRequest
     * @return CreateModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelServiceResponse CreateModelService(CreateModelServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateModelServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateModelServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateModelService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *保存优化模型
     * @param req CreateOptimizedModelRequest
     * @return CreateOptimizedModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateOptimizedModelResponse CreateOptimizedModel(CreateOptimizedModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOptimizedModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOptimizedModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOptimizedModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导入模型
     * @param req CreateTrainingModelRequest
     * @return CreateTrainingModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingModelResponse CreateTrainingModel(CreateTrainingModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTrainingModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTrainingModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTrainingModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建模型训练任务
     * @param req CreateTrainingTaskRequest
     * @return CreateTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingTaskResponse CreateTrainingTask(CreateTrainingTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTrainingTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTrainingTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTrainingTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除跑批任务
     * @param req DeleteBatchTaskRequest
     * @return DeleteBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBatchTaskResponse DeleteBatchTask(DeleteBatchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBatchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteBatchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteBatchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除数据集
     * @param req DeleteDatasetRequest
     * @return DeleteDatasetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatasetResponse DeleteDataset(DeleteDatasetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDatasetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDatasetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDataset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除模型加速任务
     * @param req DeleteModelAccelerateTaskRequest
     * @return DeleteModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelAccelerateTaskResponse DeleteModelAccelerateTask(DeleteModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModelAccelerateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModelAccelerateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteModelAccelerateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据服务id删除模型服务
     * @param req DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceResponse DeleteModelService(DeleteModelServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModelServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModelServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteModelService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据服务组id删除服务组下所有模型服务
     * @param req DeleteModelServiceGroupRequest
     * @return DeleteModelServiceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceGroupResponse DeleteModelServiceGroup(DeleteModelServiceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteModelServiceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteModelServiceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteModelServiceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除模型
     * @param req DeleteTrainingModelRequest
     * @return DeleteTrainingModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingModelResponse DeleteTrainingModel(DeleteTrainingModelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTrainingModelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTrainingModelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTrainingModel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除模型版本
     * @param req DeleteTrainingModelVersionRequest
     * @return DeleteTrainingModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingModelVersionResponse DeleteTrainingModelVersion(DeleteTrainingModelVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTrainingModelVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTrainingModelVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTrainingModelVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除训练任务
     * @param req DeleteTrainingTaskRequest
     * @return DeleteTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingTaskResponse DeleteTrainingTask(DeleteTrainingTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTrainingTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTrainingTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTrainingTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列举API
     * @param req DescribeAPIConfigsRequest
     * @return DescribeAPIConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIConfigsResponse DescribeAPIConfigs(DescribeAPIConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAPIConfigsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAPIConfigsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAPIConfigs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询跑批任务
     * @param req DescribeBatchTaskRequest
     * @return DescribeBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTaskResponse DescribeBatchTask(DescribeBatchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询跑批实例列表
     * @param req DescribeBatchTaskInstancesRequest
     * @return DescribeBatchTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTaskInstancesResponse DescribeBatchTaskInstances(DescribeBatchTaskInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchTaskInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchTaskInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchTaskInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量预测任务列表信息
     * @param req DescribeBatchTasksRequest
     * @return DescribeBatchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTasksResponse DescribeBatchTasks(DescribeBatchTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询资源组详情
     * @param req DescribeBillingResourceGroupsRequest
     * @return DescribeBillingResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceGroupsResponse DescribeBillingResourceGroups(DescribeBillingResourceGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillingResourceGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillingResourceGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillingResourceGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBillingSpecs)用于查询计费项列表
     * @param req DescribeBillingSpecsRequest
     * @return DescribeBillingSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingSpecsResponse DescribeBillingSpecs(DescribeBillingSpecsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillingSpecsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillingSpecsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillingSpecs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeBillingSpecsPrice)用于查询计费项价格。
     * @param req DescribeBillingSpecsPriceRequest
     * @return DescribeBillingSpecsPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingSpecsPriceResponse DescribeBillingSpecsPrice(DescribeBillingSpecsPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBillingSpecsPriceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBillingSpecsPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBillingSpecsPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询结构化数据集详情
     * @param req DescribeDatasetDetailStructuredRequest
     * @return DescribeDatasetDetailStructuredResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetDetailStructuredResponse DescribeDatasetDetailStructured(DescribeDatasetDetailStructuredRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatasetDetailStructuredResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatasetDetailStructuredResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatasetDetailStructured");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询非结构化数据集详情
     * @param req DescribeDatasetDetailUnstructuredRequest
     * @return DescribeDatasetDetailUnstructuredResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetDetailUnstructuredResponse DescribeDatasetDetailUnstructured(DescribeDatasetDetailUnstructuredRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatasetDetailUnstructuredResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatasetDetailUnstructuredResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatasetDetailUnstructured");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询数据集列表
     * @param req DescribeDatasetsRequest
     * @return DescribeDatasetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetsResponse DescribeDatasets(DescribeDatasetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatasetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatasetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatasets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询推理镜像模板
     * @param req DescribeInferTemplatesRequest
     * @return DescribeInferTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferTemplatesResponse DescribeInferTemplates(DescribeInferTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInferTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInferTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInferTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询最近上报的训练自定义指标
     * @param req DescribeLatestTrainingMetricsRequest
     * @return DescribeLatestTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLatestTrainingMetricsResponse DescribeLatestTrainingMetrics(DescribeLatestTrainingMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLatestTrainingMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLatestTrainingMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLatestTrainingMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取训练、推理、Notebook服务的日志
     * @param req DescribeLogsRequest
     * @return DescribeLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsResponse DescribeLogs(DescribeLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询模型加速引擎版本列表
     * @param req DescribeModelAccEngineVersionsRequest
     * @return DescribeModelAccEngineVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccEngineVersionsResponse DescribeModelAccEngineVersions(DescribeModelAccEngineVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelAccEngineVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelAccEngineVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelAccEngineVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询模型优化任务详情
     * @param req DescribeModelAccelerateTaskRequest
     * @return DescribeModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateTaskResponse DescribeModelAccelerateTask(DescribeModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelAccelerateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelAccelerateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelAccelerateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询模型加速任务列表
     * @param req DescribeModelAccelerateTasksRequest
     * @return DescribeModelAccelerateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateTasksResponse DescribeModelAccelerateTasks(DescribeModelAccelerateTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelAccelerateTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelAccelerateTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelAccelerateTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个服务
     * @param req DescribeModelServiceRequest
     * @return DescribeModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceResponse DescribeModelService(DescribeModelServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示服务的调用信息
     * @param req DescribeModelServiceCallInfoRequest
     * @return DescribeModelServiceCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceCallInfoResponse DescribeModelServiceCallInfo(DescribeModelServiceCallInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServiceCallInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServiceCallInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelServiceCallInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个服务组
     * @param req DescribeModelServiceGroupRequest
     * @return DescribeModelServiceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceGroupResponse DescribeModelServiceGroup(DescribeModelServiceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServiceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServiceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelServiceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *列举在线推理服务组
     * @param req DescribeModelServiceGroupsRequest
     * @return DescribeModelServiceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceGroupsResponse DescribeModelServiceGroups(DescribeModelServiceGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServiceGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServiceGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelServiceGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *展示服务的历史版本
     * @param req DescribeModelServiceHistoryRequest
     * @return DescribeModelServiceHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceHistoryResponse DescribeModelServiceHistory(DescribeModelServiceHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServiceHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServiceHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelServiceHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询模型服务能否开启热更新
     * @param req DescribeModelServiceHotUpdatedRequest
     * @return DescribeModelServiceHotUpdatedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceHotUpdatedResponse DescribeModelServiceHotUpdated(DescribeModelServiceHotUpdatedRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServiceHotUpdatedResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServiceHotUpdatedResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelServiceHotUpdated");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询多个服务
     * @param req DescribeModelServicesRequest
     * @return DescribeModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServicesResponse DescribeModelServices(DescribeModelServicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelServicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelServicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelServices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *训练框架列表
     * @param req DescribeTrainingFrameworksRequest
     * @return DescribeTrainingFrameworksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingFrameworksResponse DescribeTrainingFrameworks(DescribeTrainingFrameworksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingFrameworksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingFrameworksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingFrameworks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询训练自定义指标
     * @param req DescribeTrainingMetricsRequest
     * @return DescribeTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingMetricsResponse DescribeTrainingMetrics(DescribeTrainingMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询模型版本
     * @param req DescribeTrainingModelVersionRequest
     * @return DescribeTrainingModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelVersionResponse DescribeTrainingModelVersion(DescribeTrainingModelVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingModelVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingModelVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingModelVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *模型版本列表
     * @param req DescribeTrainingModelVersionsRequest
     * @return DescribeTrainingModelVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelVersionsResponse DescribeTrainingModelVersions(DescribeTrainingModelVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingModelVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingModelVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingModelVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *模型列表
     * @param req DescribeTrainingModelsRequest
     * @return DescribeTrainingModelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelsResponse DescribeTrainingModels(DescribeTrainingModelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingModelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingModelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingModels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *训练任务详情
     * @param req DescribeTrainingTaskRequest
     * @return DescribeTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskResponse DescribeTrainingTask(DescribeTrainingTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *训练任务pod列表
     * @param req DescribeTrainingTaskPodsRequest
     * @return DescribeTrainingTaskPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskPodsResponse DescribeTrainingTaskPods(DescribeTrainingTaskPodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingTaskPodsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingTaskPodsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingTaskPods");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *训练任务列表
     * @param req DescribeTrainingTasksRequest
     * @return DescribeTrainingTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTasksResponse DescribeTrainingTasks(DescribeTrainingTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrainingTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTrainingTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTrainingTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于更新模型服务
     * @param req ModifyModelServiceRequest
     * @return ModifyModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServiceResponse ModifyModelService(ModifyModelServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModelServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModelServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyModelService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增量更新在线推理服务的部分配置，不更新的配置项不需要传入
     * @param req ModifyModelServicePartialConfigRequest
     * @return ModifyModelServicePartialConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServicePartialConfigResponse ModifyModelServicePartialConfig(ModifyModelServicePartialConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModelServicePartialConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModelServicePartialConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyModelServicePartialConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新推理服务组流量分配
     * @param req ModifyServiceGroupWeightsRequest
     * @return ModifyServiceGroupWeightsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceGroupWeightsResponse ModifyServiceGroupWeights(ModifyServiceGroupWeightsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceGroupWeightsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyServiceGroupWeightsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyServiceGroupWeights");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *上报训练自定义指标
     * @param req PushTrainingMetricsRequest
     * @return PushTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public PushTrainingMetricsResponse PushTrainingMetrics(PushTrainingMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PushTrainingMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PushTrainingMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PushTrainingMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启模型加速任务
     * @param req RestartModelAccelerateTaskRequest
     * @return RestartModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestartModelAccelerateTaskResponse RestartModelAccelerateTask(RestartModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartModelAccelerateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartModelAccelerateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartModelAccelerateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启动模型训练任务
     * @param req StartTrainingTaskRequest
     * @return StartTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartTrainingTaskResponse StartTrainingTask(StartTrainingTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartTrainingTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StartTrainingTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartTrainingTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止跑批任务
     * @param req StopBatchTaskRequest
     * @return StopBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopBatchTaskResponse StopBatchTask(StopBatchTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopBatchTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopBatchTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopBatchTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止模型加速任务
     * @param req StopModelAccelerateTaskRequest
     * @return StopModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopModelAccelerateTaskResponse StopModelAccelerateTask(StopModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopModelAccelerateTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopModelAccelerateTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopModelAccelerateTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止模型训练任务
     * @param req StopTrainingTaskRequest
     * @return StopTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopTrainingTaskResponse StopTrainingTask(StopTrainingTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopTrainingTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<StopTrainingTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopTrainingTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
