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
     *删除索引
     * @param req DeleteIndexRequest
     * @return DeleteIndexResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIndexResponse DeleteIndex(DeleteIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIndexResponse> rsp = null;
        String rspStr = "";
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
     *获取索引列表
     * @param req DescribeIndexListRequest
     * @return DescribeIndexListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIndexListResponse DescribeIndexList(DescribeIndexListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIndexListResponse> rsp = null;
        String rspStr = "";
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
     *查询集群各视图数据，包括集群维度、节点维度、Kibana维度
     * @param req DescribeViewsRequest
     * @return DescribeViewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeViewsResponse DescribeViews(DescribeViewsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeViewsResponse> rsp = null;
        String rspStr = "";
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
     *重启ES集群实例(用于系统版本更新等操作) 
     * @param req RestartInstanceRequest
     * @return RestartInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RestartInstanceResponse RestartInstance(RestartInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartInstanceResponse> rsp = null;
        String rspStr = "";
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
     *用于重启集群节点
     * @param req RestartNodesRequest
     * @return RestartNodesResponse
     * @throws TencentCloudSDKException
     */
    public RestartNodesResponse RestartNodes(RestartNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartNodesResponse> rsp = null;
        String rspStr = "";
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
     *更新智能运维配置
     * @param req UpdateDiagnoseSettingsRequest
     * @return UpdateDiagnoseSettingsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDiagnoseSettingsResponse UpdateDiagnoseSettings(UpdateDiagnoseSettingsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDiagnoseSettingsResponse> rsp = null;
        String rspStr = "";
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
     *变更插件列表
     * @param req UpdatePluginsRequest
     * @return UpdatePluginsResponse
     * @throws TencentCloudSDKException
     */
    public UpdatePluginsResponse UpdatePlugins(UpdatePluginsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdatePluginsResponse> rsp = null;
        String rspStr = "";
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
