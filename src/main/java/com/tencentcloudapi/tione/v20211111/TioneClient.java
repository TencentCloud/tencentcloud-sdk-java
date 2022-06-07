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
