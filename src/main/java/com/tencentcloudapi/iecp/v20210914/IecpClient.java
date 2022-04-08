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
package com.tencentcloudapi.iecp.v20210914;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iecp.v20210914.models.*;

public class IecpClient extends AbstractClient{
    private static String endpoint = "iecp.tencentcloudapi.com";
    private static String service = "iecp";
    private static String version = "2021-09-14";

    public IecpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IecpClient(Credential credential, String region, ClientProfile profile) {
        super(IecpClient.endpoint, IecpClient.version, credential, region, profile);
    }

    /**
     *从组件市场选中组件并添加到应用模板列表
     * @param req ApplyMarketComponentRequest
     * @return ApplyMarketComponentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyMarketComponentResponse ApplyMarketComponent(ApplyMarketComponentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ApplyMarketComponentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ApplyMarketComponentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ApplyMarketComponent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *建立消息路由
     * @param req BuildMessageRouteRequest
     * @return BuildMessageRouteResponse
     * @throws TencentCloudSDKException
     */
    public BuildMessageRouteResponse BuildMessageRoute(BuildMessageRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BuildMessageRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BuildMessageRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BuildMessageRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建可视化创建应用模板
     * @param req CreateApplicationVisualizationRequest
     * @return CreateApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationVisualizationResponse CreateApplicationVisualization(CreateApplicationVisualizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateApplicationVisualizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateApplicationVisualizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateApplicationVisualization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建ConfigMap
     * @param req CreateConfigMapRequest
     * @return CreateConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigMapResponse CreateConfigMap(CreateConfigMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateConfigMapResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateConfigMapResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateConfigMap");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建边缘节点
     * @param req CreateEdgeNodeRequest
     * @return CreateEdgeNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeResponse CreateEdgeNode(CreateEdgeNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量预注册节点
     * @param req CreateEdgeNodeBatchRequest
     * @return CreateEdgeNodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeBatchResponse CreateEdgeNodeBatch(CreateEdgeNodeBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeNodeBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeNodeBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeNodeBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建边缘单元NodeGroup
     * @param req CreateEdgeNodeGroupRequest
     * @return CreateEdgeNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeGroupResponse CreateEdgeNodeGroup(CreateEdgeNodeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeNodeGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeNodeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeNodeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建边缘单元NodeUnit模板
     * @param req CreateEdgeNodeUnitTemplateRequest
     * @return CreateEdgeNodeUnitTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeUnitTemplateResponse CreateEdgeNodeUnitTemplate(CreateEdgeNodeUnitTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeNodeUnitTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeNodeUnitTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeNodeUnitTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可视化创建应用
     * @param req CreateEdgeUnitApplicationVisualizationRequest
     * @return CreateEdgeUnitApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitApplicationVisualizationResponse CreateEdgeUnitApplicationVisualization(CreateEdgeUnitApplicationVisualizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeUnitApplicationVisualizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeUnitApplicationVisualizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeUnitApplicationVisualization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *yaml方式创建应用
     * @param req CreateEdgeUnitApplicationYamlRequest
     * @return CreateEdgeUnitApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitApplicationYamlResponse CreateEdgeUnitApplicationYaml(CreateEdgeUnitApplicationYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeUnitApplicationYamlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeUnitApplicationYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeUnitApplicationYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建边缘单元
     * @param req CreateEdgeUnitCloudRequest
     * @return CreateEdgeUnitCloudResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitCloudResponse CreateEdgeUnitCloud(CreateEdgeUnitCloudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeUnitCloudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeUnitCloudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeUnitCloud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量绑定设备到单元
     * @param req CreateEdgeUnitDevicesRequest
     * @return CreateEdgeUnitDevicesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitDevicesResponse CreateEdgeUnitDevices(CreateEdgeUnitDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEdgeUnitDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEdgeUnitDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEdgeUnitDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建子设备
     * @param req CreateIotDeviceRequest
     * @return CreateIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateIotDeviceResponse CreateIotDevice(CreateIotDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateIotDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateIotDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateIotDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建消息路由
     * @param req CreateMessageRouteRequest
     * @return CreateMessageRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateMessageRouteResponse CreateMessageRoute(CreateMessageRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMessageRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMessageRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMessageRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建命名空间
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建Secret
     * @param req CreateSecretRequest
     * @return CreateSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecretResponse CreateSecret(CreateSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或更新边缘单元NodeUnit
     * @param req CreateUpdateNodeUnitRequest
     * @return CreateUpdateNodeUnitResponse
     * @throws TencentCloudSDKException
     */
    public CreateUpdateNodeUnitResponse CreateUpdateNodeUnit(CreateUpdateNodeUnitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUpdateNodeUnitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUpdateNodeUnitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUpdateNodeUnit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建token
     * @param req CreateUserTokenRequest
     * @return CreateUserTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserTokenResponse CreateUserToken(CreateUserTokenRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserTokenResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserTokenResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserToken");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用模板
     * @param req DeleteApplicationsRequest
     * @return DeleteApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationsResponse DeleteApplications(DeleteApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除ConfigMap
     * @param req DeleteConfigMapRequest
     * @return DeleteConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigMapResponse DeleteConfigMap(DeleteConfigMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteConfigMapResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteConfigMapResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteConfigMap");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘单元NodeGroup
     * @param req DeleteEdgeNodeGroupRequest
     * @return DeleteEdgeNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeNodeGroupResponse DeleteEdgeNodeGroup(DeleteEdgeNodeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeNodeGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeNodeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeNodeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘单元NodeUnit模板
     * @param req DeleteEdgeNodeUnitTemplatesRequest
     * @return DeleteEdgeNodeUnitTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeNodeUnitTemplatesResponse DeleteEdgeNodeUnitTemplates(DeleteEdgeNodeUnitTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeNodeUnitTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeNodeUnitTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeNodeUnitTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除边缘节点
     * @param req DeleteEdgeNodesRequest
     * @return DeleteEdgeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeNodesResponse DeleteEdgeNodes(DeleteEdgeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除应用列表
     * @param req DeleteEdgeUnitApplicationsRequest
     * @return DeleteEdgeUnitApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitApplicationsResponse DeleteEdgeUnitApplications(DeleteEdgeUnitApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeUnitApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeUnitApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeUnitApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘单元
     * @param req DeleteEdgeUnitCloudRequest
     * @return DeleteEdgeUnitCloudResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitCloudResponse DeleteEdgeUnitCloud(DeleteEdgeUnitCloudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeUnitCloudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeUnitCloudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeUnitCloud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重新部署边缘单元指定Grid下应用
     * @param req DeleteEdgeUnitDeployGridItemRequest
     * @return DeleteEdgeUnitDeployGridItemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitDeployGridItemResponse DeleteEdgeUnitDeployGridItem(DeleteEdgeUnitDeployGridItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeUnitDeployGridItemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeUnitDeployGridItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeUnitDeployGridItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量解绑单元设备
     * @param req DeleteEdgeUnitDevicesRequest
     * @return DeleteEdgeUnitDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitDevicesResponse DeleteEdgeUnitDevices(DeleteEdgeUnitDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeUnitDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeUnitDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeUnitDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除指定pod
     * @param req DeleteEdgeUnitPodRequest
     * @return DeleteEdgeUnitPodResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitPodResponse DeleteEdgeUnitPod(DeleteEdgeUnitPodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeUnitPodResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeUnitPodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeUnitPod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除设备
     * @param req DeleteIotDeviceRequest
     * @return DeleteIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIotDeviceResponse DeleteIotDevice(DeleteIotDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIotDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIotDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIotDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除设备
     * @param req DeleteIotDeviceBatchRequest
     * @return DeleteIotDeviceBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIotDeviceBatchResponse DeleteIotDeviceBatch(DeleteIotDeviceBatchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIotDeviceBatchResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIotDeviceBatchResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIotDeviceBatch");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除消息路由
     * @param req DeleteMessageRouteRequest
     * @return DeleteMessageRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMessageRouteResponse DeleteMessageRoute(DeleteMessageRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMessageRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMessageRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMessageRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除命名空间
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘单元NodeUnit
     * @param req DeleteNodeUnitRequest
     * @return DeleteNodeUnitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodeUnitResponse DeleteNodeUnit(DeleteNodeUnitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNodeUnitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteNodeUnitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteNodeUnit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除Secret
     * @param req DeleteSecretRequest
     * @return DeleteSecretResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretResponse DeleteSecret(DeleteSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用模板可视化配置信息
     * @param req DescribeApplicationVisualizationRequest
     * @return DescribeApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationVisualizationResponse DescribeApplicationVisualization(DescribeApplicationVisualizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationVisualizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationVisualizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationVisualization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用模板Yaml
     * @param req DescribeApplicationYamlRequest
     * @return DescribeApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationYamlResponse DescribeApplicationYaml(DescribeApplicationYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationYamlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查应用模板的Yaml配置
     * @param req DescribeApplicationYamlErrorRequest
     * @return DescribeApplicationYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationYamlErrorResponse DescribeApplicationYamlError(DescribeApplicationYamlErrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationYamlErrorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationYamlErrorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplicationYamlError");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用模板列表
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取ConfigMap详情
     * @param req DescribeConfigMapRequest
     * @return DescribeConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMapResponse DescribeConfigMap(DescribeConfigMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigMapResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigMapResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigMap");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验ConfigMap的Yaml语法
     * @param req DescribeConfigMapYamlErrorRequest
     * @return DescribeConfigMapYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMapYamlErrorResponse DescribeConfigMapYamlError(DescribeConfigMapYamlErrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigMapYamlErrorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigMapYamlErrorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigMapYamlError");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取ConfigMap列表
     * @param req DescribeConfigMapsRequest
     * @return DescribeConfigMapsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMapsResponse DescribeConfigMaps(DescribeConfigMapsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigMapsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigMapsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigMaps");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *自动获取Draco设备的安装包
     * @param req DescribeDracoEdgeNodeInstallerRequest
     * @return DescribeDracoEdgeNodeInstallerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDracoEdgeNodeInstallerResponse DescribeDracoEdgeNodeInstaller(DescribeDracoEdgeNodeInstallerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDracoEdgeNodeInstallerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDracoEdgeNodeInstallerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDracoEdgeNodeInstaller");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取节点安装信息
     * @param req DescribeEdgeAgentNodeInstallerRequest
     * @return DescribeEdgeAgentNodeInstallerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAgentNodeInstallerResponse DescribeEdgeAgentNodeInstaller(DescribeEdgeAgentNodeInstallerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeAgentNodeInstallerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeAgentNodeInstallerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeAgentNodeInstaller");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘集群默认VPC信息
     * @param req DescribeEdgeDefaultVpcRequest
     * @return DescribeEdgeDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeDefaultVpcResponse DescribeEdgeDefaultVpc(DescribeEdgeDefaultVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeDefaultVpcResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeDefaultVpcResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeDefaultVpc");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘节点信息
     * @param req DescribeEdgeNodeRequest
     * @return DescribeEdgeNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodeResponse DescribeEdgeNode(DescribeEdgeNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询节点Pod内的容器列表
     * @param req DescribeEdgeNodePodContainersRequest
     * @return DescribeEdgeNodePodContainersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodePodContainersResponse DescribeEdgeNodePodContainers(DescribeEdgeNodePodContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeNodePodContainersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeNodePodContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeNodePodContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询节点Pod列表
     * @param req DescribeEdgeNodePodsRequest
     * @return DescribeEdgeNodePodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodePodsResponse DescribeEdgeNodePods(DescribeEdgeNodePodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeNodePodsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeNodePodsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeNodePods");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取节点备注信息列表
     * @param req DescribeEdgeNodeRemarkListRequest
     * @return DescribeEdgeNodeRemarkListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodeRemarkListResponse DescribeEdgeNodeRemarkList(DescribeEdgeNodeRemarkListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeNodeRemarkListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeNodeRemarkListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeNodeRemarkList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘节点列表
     * @param req DescribeEdgeNodesRequest
     * @return DescribeEdgeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodesResponse DescribeEdgeNodes(DescribeEdgeNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘操作日志
     * @param req DescribeEdgeOperationLogsRequest
     * @return DescribeEdgeOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeOperationLogsResponse DescribeEdgeOperationLogs(DescribeEdgeOperationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeOperationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeOperationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeOperationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元Pod
     * @param req DescribeEdgePodRequest
     * @return DescribeEdgePodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgePodResponse DescribeEdgePod(DescribeEdgePodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgePodResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgePodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgePod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询预注册节点列表
     * @param req DescribeEdgeSnNodesRequest
     * @return DescribeEdgeSnNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeSnNodesResponse DescribeEdgeSnNodes(DescribeEdgeSnNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeSnNodesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeSnNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeSnNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用事件列表
     * @param req DescribeEdgeUnitApplicationEventsRequest
     * @return DescribeEdgeUnitApplicationEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationEventsResponse DescribeEdgeUnitApplicationEvents(DescribeEdgeUnitApplicationEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用日志
     * @param req DescribeEdgeUnitApplicationLogsRequest
     * @return DescribeEdgeUnitApplicationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationLogsResponse DescribeEdgeUnitApplicationLogs(DescribeEdgeUnitApplicationLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationLogsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationLogsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationLogs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用容器状态
     * @param req DescribeEdgeUnitApplicationPodContainersRequest
     * @return DescribeEdgeUnitApplicationPodContainersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationPodContainersResponse DescribeEdgeUnitApplicationPodContainers(DescribeEdgeUnitApplicationPodContainersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationPodContainersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationPodContainersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationPodContainers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用下Pod状态
     * @param req DescribeEdgeUnitApplicationPodsRequest
     * @return DescribeEdgeUnitApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationPodsResponse DescribeEdgeUnitApplicationPods(DescribeEdgeUnitApplicationPodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationPodsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationPodsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationPods");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单元可视化配置信息
     * @param req DescribeEdgeUnitApplicationVisualizationRequest
     * @return DescribeEdgeUnitApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationVisualizationResponse DescribeEdgeUnitApplicationVisualization(DescribeEdgeUnitApplicationVisualizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationVisualizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationVisualizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationVisualization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用的Yaml配置
     * @param req DescribeEdgeUnitApplicationYamlRequest
     * @return DescribeEdgeUnitApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationYamlResponse DescribeEdgeUnitApplicationYaml(DescribeEdgeUnitApplicationYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationYamlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查单元应用的Yaml配置
     * @param req DescribeEdgeUnitApplicationYamlErrorRequest
     * @return DescribeEdgeUnitApplicationYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationYamlErrorResponse DescribeEdgeUnitApplicationYamlError(DescribeEdgeUnitApplicationYamlErrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationYamlErrorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationYamlErrorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplicationYamlError");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取单元下应用列表
     * @param req DescribeEdgeUnitApplicationsRequest
     * @return DescribeEdgeUnitApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationsResponse DescribeEdgeUnitApplications(DescribeEdgeUnitApplicationsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitApplicationsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitApplicationsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitApplications");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘集群详情
     * @param req DescribeEdgeUnitCloudRequest
     * @return DescribeEdgeUnitCloudResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitCloudResponse DescribeEdgeUnitCloud(DescribeEdgeUnitCloudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitCloudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitCloudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitCloud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元Grid列表
     * @param req DescribeEdgeUnitDeployGridRequest
     * @return DescribeEdgeUnitDeployGridResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitDeployGridResponse DescribeEdgeUnitDeployGrid(DescribeEdgeUnitDeployGridRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitDeployGridResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitDeployGridResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitDeployGrid");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元指定Grid下的部署应用列表
     * @param req DescribeEdgeUnitDeployGridItemRequest
     * @return DescribeEdgeUnitDeployGridItemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitDeployGridItemResponse DescribeEdgeUnitDeployGridItem(DescribeEdgeUnitDeployGridItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitDeployGridItemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitDeployGridItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitDeployGridItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定Grid下应用的Yaml
     * @param req DescribeEdgeUnitDeployGridItemYamlRequest
     * @return DescribeEdgeUnitDeployGridItemYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitDeployGridItemYamlResponse DescribeEdgeUnitDeployGridItemYaml(DescribeEdgeUnitDeployGridItemYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitDeployGridItemYamlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitDeployGridItemYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitDeployGridItemYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元额外信息
     * @param req DescribeEdgeUnitExtraRequest
     * @return DescribeEdgeUnitExtraResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitExtraResponse DescribeEdgeUnitExtra(DescribeEdgeUnitExtraRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitExtraResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitExtraResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitExtra");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元Grid事件列表
     * @param req DescribeEdgeUnitGridEventsRequest
     * @return DescribeEdgeUnitGridEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitGridEventsResponse DescribeEdgeUnitGridEvents(DescribeEdgeUnitGridEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitGridEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitGridEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitGridEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元Grid的Pod列表
     * @param req DescribeEdgeUnitGridPodsRequest
     * @return DescribeEdgeUnitGridPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitGridPodsResponse DescribeEdgeUnitGridPods(DescribeEdgeUnitGridPodsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitGridPodsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitGridPodsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitGridPods");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘集群监控状态
     * @param req DescribeEdgeUnitMonitorStatusRequest
     * @return DescribeEdgeUnitMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitMonitorStatusResponse DescribeEdgeUnitMonitorStatus(DescribeEdgeUnitMonitorStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitMonitorStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitMonitorStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitMonitorStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘集群NodeGroup
     * @param req DescribeEdgeUnitNodeGroupRequest
     * @return DescribeEdgeUnitNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitNodeGroupResponse DescribeEdgeUnitNodeGroup(DescribeEdgeUnitNodeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitNodeGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitNodeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitNodeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元EdgeUnit模板列表
     * @param req DescribeEdgeUnitNodeUnitTemplatesRequest
     * @return DescribeEdgeUnitNodeUnitTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitNodeUnitTemplatesResponse DescribeEdgeUnitNodeUnitTemplates(DescribeEdgeUnitNodeUnitTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitNodeUnitTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitNodeUnitTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitNodeUnitTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元列表
     * @param req DescribeEdgeUnitsCloudRequest
     * @return DescribeEdgeUnitsCloudResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitsCloudResponse DescribeEdgeUnitsCloud(DescribeEdgeUnitsCloudRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeUnitsCloudResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeUnitsCloudResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeUnitsCloud");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备信息
     * @param req DescribeIotDeviceRequest
     * @return DescribeIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotDeviceResponse DescribeIotDevice(DescribeIotDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIotDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIotDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIotDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备列表信息
     * @param req DescribeIotDevicesRequest
     * @return DescribeIotDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotDevicesResponse DescribeIotDevices(DescribeIotDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIotDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIotDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIotDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取消息路由列表
     * @param req DescribeMessageRouteListRequest
     * @return DescribeMessageRouteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageRouteListResponse DescribeMessageRouteList(DescribeMessageRouteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMessageRouteListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMessageRouteListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMessageRouteList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元监控数据
     * @param req DescribeMonitorMetricsRequest
     * @return DescribeMonitorMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorMetricsResponse DescribeMonitorMetrics(DescribeMonitorMetricsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorMetricsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonitorMetricsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonitorMetrics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取命名空间
     * @param req DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespaceResponse DescribeNamespace(DescribeNamespaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespaceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespaceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespace");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取命名空间下的资源信息
     * @param req DescribeNamespaceResourcesRequest
     * @return DescribeNamespaceResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespaceResourcesResponse DescribeNamespaceResources(DescribeNamespaceResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespaceResourcesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespaceResourcesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaceResources");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取命名空间列表信息
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNamespacesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNamespacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNamespaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘单元NodeUnit列表
     * @param req DescribeNodeUnitRequest
     * @return DescribeNodeUnitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeUnitResponse DescribeNodeUnit(DescribeNodeUnitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNodeUnitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNodeUnitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNodeUnit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定NodeGroup下NodeUnit模板列表
     * @param req DescribeNodeUnitTemplateOnNodeGroupRequest
     * @return DescribeNodeUnitTemplateOnNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeUnitTemplateOnNodeGroupResponse DescribeNodeUnitTemplateOnNodeGroup(DescribeNodeUnitTemplateOnNodeGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNodeUnitTemplateOnNodeGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNodeUnitTemplateOnNodeGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNodeUnitTemplateOnNodeGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Secret详情
     * @param req DescribeSecretRequest
     * @return DescribeSecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretResponse DescribeSecret(DescribeSecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *校验Secret的Yaml语法
     * @param req DescribeSecretYamlErrorRequest
     * @return DescribeSecretYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretYamlErrorResponse DescribeSecretYamlError(DescribeSecretYamlErrorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecretYamlErrorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecretYamlErrorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecretYamlError");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Secrets列表
     * @param req DescribeSecretsRequest
     * @return DescribeSecretsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretsResponse DescribeSecrets(DescribeSecretsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecretsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSecretsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSecrets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户的资源限制
     * @param req DescribeYeheResourceLimitRequest
     * @return DescribeYeheResourceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYeheResourceLimitResponse DescribeYeheResourceLimit(DescribeYeheResourceLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeYeheResourceLimitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeYeheResourceLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeYeheResourceLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组件市场的组件信息
     * @param req GetMarketComponentRequest
     * @return GetMarketComponentResponse
     * @throws TencentCloudSDKException
     */
    public GetMarketComponentResponse GetMarketComponent(GetMarketComponentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMarketComponentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetMarketComponentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetMarketComponent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取组件市场组件列表
     * @param req GetMarketComponentListRequest
     * @return GetMarketComponentListResponse
     * @throws TencentCloudSDKException
     */
    public GetMarketComponentListResponse GetMarketComponentList(GetMarketComponentListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMarketComponentListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetMarketComponentListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetMarketComponentList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用模板基本信息
     * @param req ModifyApplicationBasicInfoRequest
     * @return ModifyApplicationBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationBasicInfoResponse ModifyApplicationBasicInfo(ModifyApplicationBasicInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationBasicInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationBasicInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationBasicInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改应用模板配置
     * @param req ModifyApplicationVisualizationRequest
     * @return ModifyApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationVisualizationResponse ModifyApplicationVisualization(ModifyApplicationVisualizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApplicationVisualizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApplicationVisualizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApplicationVisualization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改ConfigMap
     * @param req ModifyConfigMapRequest
     * @return ModifyConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigMapResponse ModifyConfigMap(ModifyConfigMapRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConfigMapResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyConfigMapResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyConfigMap");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑draco设备信息
     * @param req ModifyEdgeDracoNodeRequest
     * @return ModifyEdgeDracoNodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeDracoNodeResponse ModifyEdgeDracoNode(ModifyEdgeDracoNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeDracoNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeDracoNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeDracoNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑边缘节点标签
     * @param req ModifyEdgeNodeLabelsRequest
     * @return ModifyEdgeNodeLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeNodeLabelsResponse ModifyEdgeNodeLabels(ModifyEdgeNodeLabelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeNodeLabelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeNodeLabelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeNodeLabels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改边缘集群
     * @param req ModifyEdgeUnitRequest
     * @return ModifyEdgeUnitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitResponse ModifyEdgeUnit(ModifyEdgeUnitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeUnitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeUnitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeUnit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改单元应用基本信息
     * @param req ModifyEdgeUnitApplicationBasicInfoRequest
     * @return ModifyEdgeUnitApplicationBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitApplicationBasicInfoResponse ModifyEdgeUnitApplicationBasicInfo(ModifyEdgeUnitApplicationBasicInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeUnitApplicationBasicInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeUnitApplicationBasicInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeUnitApplicationBasicInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可视化修改应用配置
     * @param req ModifyEdgeUnitApplicationVisualizationRequest
     * @return ModifyEdgeUnitApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitApplicationVisualizationResponse ModifyEdgeUnitApplicationVisualization(ModifyEdgeUnitApplicationVisualizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeUnitApplicationVisualizationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeUnitApplicationVisualizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeUnitApplicationVisualization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Yaml方式修改应用配置
     * @param req ModifyEdgeUnitApplicationYamlRequest
     * @return ModifyEdgeUnitApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitApplicationYamlResponse ModifyEdgeUnitApplicationYaml(ModifyEdgeUnitApplicationYamlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeUnitApplicationYamlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeUnitApplicationYamlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeUnitApplicationYaml");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新边缘单元信息
     * @param req ModifyEdgeUnitCloudApiRequest
     * @return ModifyEdgeUnitCloudApiResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitCloudApiResponse ModifyEdgeUnitCloudApi(ModifyEdgeUnitCloudApiRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeUnitCloudApiResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeUnitCloudApiResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeUnitCloudApi");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改边缘单元Grid部署应用副本数
     * @param req ModifyEdgeUnitDeployGridItemRequest
     * @return ModifyEdgeUnitDeployGridItemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitDeployGridItemResponse ModifyEdgeUnitDeployGridItem(ModifyEdgeUnitDeployGridItemRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEdgeUnitDeployGridItemResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEdgeUnitDeployGridItemResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEdgeUnitDeployGridItem");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改设备信息
     * @param req ModifyIotDeviceRequest
     * @return ModifyIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIotDeviceResponse ModifyIotDevice(ModifyIotDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIotDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyIotDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyIotDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改边缘单元NodeUnit模板
     * @param req ModifyNodeUnitTemplateRequest
     * @return ModifyNodeUnitTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodeUnitTemplateResponse ModifyNodeUnitTemplate(ModifyNodeUnitTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNodeUnitTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNodeUnitTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNodeUnitTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改Secret
     * @param req ModifySecretRequest
     * @return ModifySecretResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecretResponse ModifySecret(ModifySecretRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecretResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySecretResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySecret");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *单元应用重部署
     * @param req RedeployEdgeUnitApplicationRequest
     * @return RedeployEdgeUnitApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RedeployEdgeUnitApplicationResponse RedeployEdgeUnitApplication(RedeployEdgeUnitApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RedeployEdgeUnitApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RedeployEdgeUnitApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RedeployEdgeUnitApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开关消息路由
     * @param req SetRouteOnOffRequest
     * @return SetRouteOnOffResponse
     * @throws TencentCloudSDKException
     */
    public SetRouteOnOffResponse SetRouteOnOff(SetRouteOnOffRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetRouteOnOffResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetRouteOnOffResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetRouteOnOff");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
