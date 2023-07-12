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
package com.tencentcloudapi.es.v20180416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.es.v20180416.models.*;

public class EsClient extends AbstractClient{
    private static String endpoint = "es.tencentcloudapi.com";
    private static String service = "es";
    private static String version = "2018-04-16";
    
    public EsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EsClient(Credential credential, String region, ClientProfile profile) {
        super(EsClient.endpoint, EsClient.version, credential, region, profile);
    }

    /**
     *创建索引
     * @param req CreateIndexRequest
     * @return CreateIndexResponse
     * @throws TencentCloudSDKException
     */
    public CreateIndexResponse CreateIndex(CreateIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建指定规格的ES集群实例
     * @param req CreateInstanceRequest
     * @return CreateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateInstanceResponse CreateInstance(CreateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建Logstash实例
     * @param req CreateLogstashInstanceRequest
     * @return CreateLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateLogstashInstanceResponse CreateLogstashInstance(CreateLogstashInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLogstashInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLogstashInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLogstashInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除索引
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁集群实例 
     * @param req DeleteInstanceRequest
     * @return DeleteInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteInstanceResponse DeleteInstance(DeleteInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除Logstash实例
     * @param req DeleteLogstashInstanceRequest
     * @return DeleteLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogstashInstanceResponse DeleteLogstashInstance(DeleteLogstashInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogstashInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogstashInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogstashInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于批量删除Logstash管道
     * @param req DeleteLogstashPipelinesRequest
     * @return DeleteLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLogstashPipelinesResponse DeleteLogstashPipelines(DeleteLogstashPipelinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLogstashPipelinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLogstashPipelinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLogstashPipelines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取索引列表
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIndexListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIndexList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取索引元数据
     * @param req DescribeIndexMetaRequest
     * @return DescribeIndexMetaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexMetaResponse DescribeIndexMeta(DescribeIndexMetaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexMetaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIndexMetaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIndexMeta");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户该地域下符合条件的ES集群的日志
     * @param req DescribeInstanceLogsRequest
     * @return DescribeInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceLogsResponse DescribeInstanceLogs(DescribeInstanceLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
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
     *查询实例指定条件下的操作记录
     * @param req DescribeInstanceOperationsRequest
     * @return DescribeInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstanceOperationsResponse DescribeInstanceOperations(DescribeInstanceOperationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstanceOperationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstanceOperationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstanceOperations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户该地域下符合条件的所有实例
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户该地域下符合条件的Logstash实例的日志
     * @param req DescribeLogstashInstanceLogsRequest
     * @return DescribeLogstashInstanceLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashInstanceLogsResponse DescribeLogstashInstanceLogs(DescribeLogstashInstanceLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogstashInstanceLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogstashInstanceLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogstashInstanceLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询实例指定条件下的操作记录
     * @param req DescribeLogstashInstanceOperationsRequest
     * @return DescribeLogstashInstanceOperationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashInstanceOperationsResponse DescribeLogstashInstanceOperations(DescribeLogstashInstanceOperationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogstashInstanceOperationsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogstashInstanceOperationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogstashInstanceOperations");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户该地域下符合条件的所有Logstash实例
     * @param req DescribeLogstashInstancesRequest
     * @return DescribeLogstashInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashInstancesResponse DescribeLogstashInstances(DescribeLogstashInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogstashInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogstashInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogstashInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取Logstash实例管道列表
     * @param req DescribeLogstashPipelinesRequest
     * @return DescribeLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogstashPipelinesResponse DescribeLogstashPipelines(DescribeLogstashPipelinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLogstashPipelinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLogstashPipelinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLogstashPipelines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群各视图数据，包括集群维度、节点维度、Kibana维度
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeViewsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeViewsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeViews");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能运维诊断集群
     * @param req DiagnoseInstanceRequest
     * @return DiagnoseInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DiagnoseInstanceResponse DiagnoseInstance(DiagnoseInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DiagnoseInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DiagnoseInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DiagnoseInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取接收客户端请求的节点类型
     * @param req GetRequestTargetNodeTypesRequest
     * @return GetRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public GetRequestTargetNodeTypesResponse GetRequestTargetNodeTypes(GetRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRequestTargetNodeTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetRequestTargetNodeTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRequestTargetNodeTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改绑定VIP的安全组，传安全组id列表
     * @param req ModifyEsVipSecurityGroupRequest
     * @return ModifyEsVipSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEsVipSecurityGroupResponse ModifyEsVipSecurityGroup(ModifyEsVipSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEsVipSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEsVipSecurityGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEsVipSecurityGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启ES集群实例(用于系统版本更新等操作) 
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启Kibana 
     * @param req RestartKibanaRequest
     * @return RestartKibanaResponse
     * @throws TencentCloudSDKException
     */
    public RestartKibanaResponse RestartKibana(RestartKibanaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartKibanaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartKibanaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartKibana");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于重启Logstash实例
     * @param req RestartLogstashInstanceRequest
     * @return RestartLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartLogstashInstanceResponse RestartLogstashInstance(RestartLogstashInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartLogstashInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartLogstashInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartLogstashInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于重启集群节点
     * @param req RestartNodesRequest
     * @return RestartNodesResponse
     * @throws TencentCloudSDKException
     */
    public RestartNodesResponse RestartNodes(RestartNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RestartNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于下发并且部署管道
     * @param req SaveAndDeployLogstashPipelineRequest
     * @return SaveAndDeployLogstashPipelineResponse
     * @throws TencentCloudSDKException
     */
    public SaveAndDeployLogstashPipelineResponse SaveAndDeployLogstashPipeline(SaveAndDeployLogstashPipelineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SaveAndDeployLogstashPipelineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SaveAndDeployLogstashPipelineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SaveAndDeployLogstashPipeline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于启动Logstash管道
     * @param req StartLogstashPipelinesRequest
     * @return StartLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public StartLogstashPipelinesResponse StartLogstashPipelines(StartLogstashPipelinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartLogstashPipelinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StartLogstashPipelinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StartLogstashPipelines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于批量停止Logstash管道
     * @param req StopLogstashPipelinesRequest
     * @return StopLogstashPipelinesResponse
     * @throws TencentCloudSDKException
     */
    public StopLogstashPipelinesResponse StopLogstashPipelines(StopLogstashPipelinesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopLogstashPipelinesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopLogstashPipelinesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopLogstashPipelines");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新智能运维配置
     * @param req UpdateDiagnoseSettingsRequest
     * @return UpdateDiagnoseSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDiagnoseSettingsResponse UpdateDiagnoseSettings(UpdateDiagnoseSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDiagnoseSettingsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDiagnoseSettingsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDiagnoseSettings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新ES集群词典
     * @param req UpdateDictionariesRequest
     * @return UpdateDictionariesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDictionariesResponse UpdateDictionaries(UpdateDictionariesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDictionariesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDictionariesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDictionaries");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新索引
     * @param req UpdateIndexRequest
     * @return UpdateIndexResponse
     * @throws TencentCloudSDKException
     */
    public UpdateIndexResponse UpdateIndex(UpdateIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对集群进行节点规格变更，修改实例名称，修改配置，重置密码， 添加Kibana黑白名单等操作。参数中InstanceId为必传参数，ForceRestart为选填参数，剩余参数传递组合及含义如下：
- InstanceName：修改实例名称(仅用于标识实例)
- NodeInfoList: 修改节点配置（节点横向扩缩容，纵向扩缩容，增加主节点，增加冷节点等）
- EsConfig：修改集群配置
- Password：修改默认用户elastic的密码
- EsAcl：修改访问控制列表
- CosBackUp: 设置集群COS自动备份信息
以上参数组合只能传递一种，多传或少传均会导致请求失败
     * @param req UpdateInstanceRequest
     * @return UpdateInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateInstanceResponse UpdateInstance(UpdateInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新实例Jdk配置
     * @param req UpdateJdkRequest
     * @return UpdateJdkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJdkResponse UpdateJdk(UpdateJdkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateJdkResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateJdkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateJdk");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对集群进行节点规格变更，修改实例名称，修改配置，等操作。参数中InstanceId为必传参数，参数传递组合及含义如下：
- InstanceName：修改实例名称(仅用于标识实例)
- NodeNum: 修改实例节点数量（节点横向扩缩容，纵向扩缩容等）
- YMLConfig: 修改实例YML配置
- BindedES：修改绑定的ES集群配置
以上参数组合只能传递一种，多传或少传均会导致请求失败
     * @param req UpdateLogstashInstanceRequest
     * @return UpdateLogstashInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLogstashInstanceResponse UpdateLogstashInstance(UpdateLogstashInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateLogstashInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateLogstashInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateLogstashInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于更新管道描述信息
     * @param req UpdateLogstashPipelineDescRequest
     * @return UpdateLogstashPipelineDescResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLogstashPipelineDescResponse UpdateLogstashPipelineDesc(UpdateLogstashPipelineDescRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateLogstashPipelineDescResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateLogstashPipelineDescResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateLogstashPipelineDesc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *变更插件列表
     * @param req UpdatePluginsRequest
     * @return UpdatePluginsResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePluginsResponse UpdatePlugins(UpdatePluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePluginsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdatePluginsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdatePlugins");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新接收客户端请求的节点类型
     * @param req UpdateRequestTargetNodeTypesRequest
     * @return UpdateRequestTargetNodeTypesResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRequestTargetNodeTypesResponse UpdateRequestTargetNodeTypes(UpdateRequestTargetNodeTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRequestTargetNodeTypesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRequestTargetNodeTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRequestTargetNodeTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级ES集群版本
     * @param req UpgradeInstanceRequest
     * @return UpgradeInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeInstanceResponse UpgradeInstance(UpgradeInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级ES商业特性
     * @param req UpgradeLicenseRequest
     * @return UpgradeLicenseResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeLicenseResponse UpgradeLicense(UpgradeLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeLicenseResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeLicenseResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeLicense");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
