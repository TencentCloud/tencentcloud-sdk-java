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
package com.tencentcloudapi.cat.v20180409;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cat.v20180409.models.*;

public class CatClient extends AbstractClient{
    private static String endpoint = "cat.tencentcloudapi.com";
    private static String service = "cat";
    private static String version = "2018-04-09";

    public CatClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CatClient(Credential credential, String region, ClientProfile profile) {
        super(CatClient.endpoint, CatClient.version, credential, region, profile);
    }

    /**
     *批量创建拨测任务
     * @param req CreateProbeTasksRequest
     * @return CreateProbeTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateProbeTasksResponse CreateProbeTasks(CreateProbeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProbeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProbeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProbeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除拨测任务
     * @param req DeleteProbeTaskRequest
     * @return DeleteProbeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProbeTaskResponse DeleteProbeTask(DeleteProbeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProbeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProbeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProbeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据时间范围、任务ID、运营商等条件查询单次拨测详情数据
     * @param req DescribeDetailedSingleProbeDataRequest
     * @return DescribeDetailedSingleProbeDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDetailedSingleProbeDataResponse DescribeDetailedSingleProbeData(DescribeDetailedSingleProbeDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDetailedSingleProbeDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDetailedSingleProbeDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDetailedSingleProbeData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取拨测节点
     * @param req DescribeNodesRequest
     * @return DescribeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodesResponse DescribeNodes(DescribeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云拨测指标数据，指标支持使用sum,avg,max,min聚合函数进行指标数据查询
     * @param req DescribeProbeMetricDataRequest
     * @return DescribeProbeMetricDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProbeMetricDataResponse DescribeProbeMetricData(DescribeProbeMetricDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProbeMetricDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProbeMetricDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProbeMetricData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测节点
     * @param req DescribeProbeNodesRequest
     * @return DescribeProbeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProbeNodesResponse DescribeProbeNodes(DescribeProbeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProbeNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProbeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProbeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拨测任务列表
     * @param req DescribeProbeTasksRequest
     * @return DescribeProbeTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProbeTasksResponse DescribeProbeTasks(DescribeProbeTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProbeTasksResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProbeTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProbeTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复拨测任务
     * @param req ResumeProbeTaskRequest
     * @return ResumeProbeTaskResponse
     * @throws TencentCloudSDKException
     */
    public ResumeProbeTaskResponse ResumeProbeTask(ResumeProbeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeProbeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeProbeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResumeProbeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暂停拨测任务
     * @param req SuspendProbeTaskRequest
     * @return SuspendProbeTaskResponse
     * @throws TencentCloudSDKException
     */
    public SuspendProbeTaskResponse SuspendProbeTask(SuspendProbeTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SuspendProbeTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SuspendProbeTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SuspendProbeTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新探测任务属性
     * @param req UpdateProbeTaskAttributesRequest
     * @return UpdateProbeTaskAttributesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProbeTaskAttributesResponse UpdateProbeTaskAttributes(UpdateProbeTaskAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProbeTaskAttributesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProbeTaskAttributesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProbeTaskAttributes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量更新拨测任务配置
     * @param req UpdateProbeTaskConfigurationListRequest
     * @return UpdateProbeTaskConfigurationListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateProbeTaskConfigurationListResponse UpdateProbeTaskConfigurationList(UpdateProbeTaskConfigurationListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateProbeTaskConfigurationListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateProbeTaskConfigurationListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateProbeTaskConfigurationList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
