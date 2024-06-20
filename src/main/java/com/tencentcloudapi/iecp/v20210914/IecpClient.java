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
     *产品停售，预下线

从组件市场选中组件并添加到应用模板列表
     * @param req ApplyMarketComponentRequest
     * @return ApplyMarketComponentResponse
     * @throws TencentCloudSDKException
     */
    public ApplyMarketComponentResponse ApplyMarketComponent(ApplyMarketComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ApplyMarketComponent", ApplyMarketComponentResponse.class);
    }

    /**
     *建立消息路由
     * @param req BuildMessageRouteRequest
     * @return BuildMessageRouteResponse
     * @throws TencentCloudSDKException
     */
    public BuildMessageRouteResponse BuildMessageRoute(BuildMessageRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BuildMessageRoute", BuildMessageRouteResponse.class);
    }

    /**
     *产品停售，预下线

创建可视化创建应用模板
     * @param req CreateApplicationVisualizationRequest
     * @return CreateApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateApplicationVisualizationResponse CreateApplicationVisualization(CreateApplicationVisualizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApplicationVisualization", CreateApplicationVisualizationResponse.class);
    }

    /**
     *创建ConfigMap
     * @param req CreateConfigMapRequest
     * @return CreateConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public CreateConfigMapResponse CreateConfigMap(CreateConfigMapRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateConfigMap", CreateConfigMapResponse.class);
    }

    /**
     *创建边缘节点
     * @param req CreateEdgeNodeRequest
     * @return CreateEdgeNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeResponse CreateEdgeNode(CreateEdgeNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeNode", CreateEdgeNodeResponse.class);
    }

    /**
     *批量预注册节点
     * @param req CreateEdgeNodeBatchRequest
     * @return CreateEdgeNodeBatchResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeBatchResponse CreateEdgeNodeBatch(CreateEdgeNodeBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeNodeBatch", CreateEdgeNodeBatchResponse.class);
    }

    /**
     *创建边缘单元NodeGroup
     * @param req CreateEdgeNodeGroupRequest
     * @return CreateEdgeNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeGroupResponse CreateEdgeNodeGroup(CreateEdgeNodeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeNodeGroup", CreateEdgeNodeGroupResponse.class);
    }

    /**
     *创建边缘单元NodeUnit模板
     * @param req CreateEdgeNodeUnitTemplateRequest
     * @return CreateEdgeNodeUnitTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeNodeUnitTemplateResponse CreateEdgeNodeUnitTemplate(CreateEdgeNodeUnitTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeNodeUnitTemplate", CreateEdgeNodeUnitTemplateResponse.class);
    }

    /**
     *产品停售，预下线

可视化创建应用
     * @param req CreateEdgeUnitApplicationVisualizationRequest
     * @return CreateEdgeUnitApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitApplicationVisualizationResponse CreateEdgeUnitApplicationVisualization(CreateEdgeUnitApplicationVisualizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeUnitApplicationVisualization", CreateEdgeUnitApplicationVisualizationResponse.class);
    }

    /**
     *产品停售，预下线

yaml方式创建应用
     * @param req CreateEdgeUnitApplicationYamlRequest
     * @return CreateEdgeUnitApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitApplicationYamlResponse CreateEdgeUnitApplicationYaml(CreateEdgeUnitApplicationYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeUnitApplicationYaml", CreateEdgeUnitApplicationYamlResponse.class);
    }

    /**
     *创建边缘单元
     * @param req CreateEdgeUnitCloudRequest
     * @return CreateEdgeUnitCloudResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitCloudResponse CreateEdgeUnitCloud(CreateEdgeUnitCloudRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeUnitCloud", CreateEdgeUnitCloudResponse.class);
    }

    /**
     *批量绑定设备到单元
     * @param req CreateEdgeUnitDevicesRequest
     * @return CreateEdgeUnitDevicesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeUnitDevicesResponse CreateEdgeUnitDevices(CreateEdgeUnitDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeUnitDevices", CreateEdgeUnitDevicesResponse.class);
    }

    /**
     *创建子设备
     * @param req CreateIotDeviceRequest
     * @return CreateIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateIotDeviceResponse CreateIotDevice(CreateIotDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateIotDevice", CreateIotDeviceResponse.class);
    }

    /**
     *创建消息路由
     * @param req CreateMessageRouteRequest
     * @return CreateMessageRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateMessageRouteResponse CreateMessageRoute(CreateMessageRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMessageRoute", CreateMessageRouteResponse.class);
    }

    /**
     *创建命名空间
     * @param req CreateNamespaceRequest
     * @return CreateNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNamespaceResponse CreateNamespace(CreateNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNamespace", CreateNamespaceResponse.class);
    }

    /**
     *创建Secret
     * @param req CreateSecretRequest
     * @return CreateSecretResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecretResponse CreateSecret(CreateSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSecret", CreateSecretResponse.class);
    }

    /**
     *创建或更新边缘单元NodeUnit
     * @param req CreateUpdateNodeUnitRequest
     * @return CreateUpdateNodeUnitResponse
     * @throws TencentCloudSDKException
     */
    public CreateUpdateNodeUnitResponse CreateUpdateNodeUnit(CreateUpdateNodeUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUpdateNodeUnit", CreateUpdateNodeUnitResponse.class);
    }

    /**
     *创建token
     * @param req CreateUserTokenRequest
     * @return CreateUserTokenResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserTokenResponse CreateUserToken(CreateUserTokenRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUserToken", CreateUserTokenResponse.class);
    }

    /**
     *产品停售，预下线

删除应用模板
     * @param req DeleteApplicationsRequest
     * @return DeleteApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationsResponse DeleteApplications(DeleteApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplications", DeleteApplicationsResponse.class);
    }

    /**
     *删除ConfigMap
     * @param req DeleteConfigMapRequest
     * @return DeleteConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public DeleteConfigMapResponse DeleteConfigMap(DeleteConfigMapRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteConfigMap", DeleteConfigMapResponse.class);
    }

    /**
     *删除边缘单元NodeGroup
     * @param req DeleteEdgeNodeGroupRequest
     * @return DeleteEdgeNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeNodeGroupResponse DeleteEdgeNodeGroup(DeleteEdgeNodeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeNodeGroup", DeleteEdgeNodeGroupResponse.class);
    }

    /**
     *删除边缘单元NodeUnit模板
     * @param req DeleteEdgeNodeUnitTemplatesRequest
     * @return DeleteEdgeNodeUnitTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeNodeUnitTemplatesResponse DeleteEdgeNodeUnitTemplates(DeleteEdgeNodeUnitTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeNodeUnitTemplates", DeleteEdgeNodeUnitTemplatesResponse.class);
    }

    /**
     *批量删除边缘节点
     * @param req DeleteEdgeNodesRequest
     * @return DeleteEdgeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeNodesResponse DeleteEdgeNodes(DeleteEdgeNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeNodes", DeleteEdgeNodesResponse.class);
    }

    /**
     *产品停售，预下线

删除应用列表
     * @param req DeleteEdgeUnitApplicationsRequest
     * @return DeleteEdgeUnitApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitApplicationsResponse DeleteEdgeUnitApplications(DeleteEdgeUnitApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeUnitApplications", DeleteEdgeUnitApplicationsResponse.class);
    }

    /**
     *删除边缘单元
     * @param req DeleteEdgeUnitCloudRequest
     * @return DeleteEdgeUnitCloudResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitCloudResponse DeleteEdgeUnitCloud(DeleteEdgeUnitCloudRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeUnitCloud", DeleteEdgeUnitCloudResponse.class);
    }

    /**
     *重新部署边缘单元指定Grid下应用
     * @param req DeleteEdgeUnitDeployGridItemRequest
     * @return DeleteEdgeUnitDeployGridItemResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitDeployGridItemResponse DeleteEdgeUnitDeployGridItem(DeleteEdgeUnitDeployGridItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeUnitDeployGridItem", DeleteEdgeUnitDeployGridItemResponse.class);
    }

    /**
     *批量解绑单元设备
     * @param req DeleteEdgeUnitDevicesRequest
     * @return DeleteEdgeUnitDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitDevicesResponse DeleteEdgeUnitDevices(DeleteEdgeUnitDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeUnitDevices", DeleteEdgeUnitDevicesResponse.class);
    }

    /**
     *删除指定pod
     * @param req DeleteEdgeUnitPodRequest
     * @return DeleteEdgeUnitPodResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeUnitPodResponse DeleteEdgeUnitPod(DeleteEdgeUnitPodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeUnitPod", DeleteEdgeUnitPodResponse.class);
    }

    /**
     *删除设备
     * @param req DeleteIotDeviceRequest
     * @return DeleteIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIotDeviceResponse DeleteIotDevice(DeleteIotDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIotDevice", DeleteIotDeviceResponse.class);
    }

    /**
     *批量删除设备
     * @param req DeleteIotDeviceBatchRequest
     * @return DeleteIotDeviceBatchResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIotDeviceBatchResponse DeleteIotDeviceBatch(DeleteIotDeviceBatchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteIotDeviceBatch", DeleteIotDeviceBatchResponse.class);
    }

    /**
     *删除消息路由
     * @param req DeleteMessageRouteRequest
     * @return DeleteMessageRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMessageRouteResponse DeleteMessageRoute(DeleteMessageRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteMessageRoute", DeleteMessageRouteResponse.class);
    }

    /**
     *删除命名空间
     * @param req DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNamespaceResponse DeleteNamespace(DeleteNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNamespace", DeleteNamespaceResponse.class);
    }

    /**
     *删除边缘单元NodeUnit
     * @param req DeleteNodeUnitRequest
     * @return DeleteNodeUnitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNodeUnitResponse DeleteNodeUnit(DeleteNodeUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNodeUnit", DeleteNodeUnitResponse.class);
    }

    /**
     *删除Secret
     * @param req DeleteSecretRequest
     * @return DeleteSecretResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecretResponse DeleteSecret(DeleteSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSecret", DeleteSecretResponse.class);
    }

    /**
     *产品停售，预下线

获取应用模板可视化配置信息
     * @param req DescribeApplicationVisualizationRequest
     * @return DescribeApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationVisualizationResponse DescribeApplicationVisualization(DescribeApplicationVisualizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationVisualization", DescribeApplicationVisualizationResponse.class);
    }

    /**
     *产品停售，预下线

查询应用模板Yaml
     * @param req DescribeApplicationYamlRequest
     * @return DescribeApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationYamlResponse DescribeApplicationYaml(DescribeApplicationYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationYaml", DescribeApplicationYamlResponse.class);
    }

    /**
     *产品停售，预下线

检查应用模板的Yaml配置
     * @param req DescribeApplicationYamlErrorRequest
     * @return DescribeApplicationYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationYamlErrorResponse DescribeApplicationYamlError(DescribeApplicationYamlErrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplicationYamlError", DescribeApplicationYamlErrorResponse.class);
    }

    /**
     *产品停售，预下线

获取应用模板列表
     * @param req DescribeApplicationsRequest
     * @return DescribeApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationsResponse DescribeApplications(DescribeApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApplications", DescribeApplicationsResponse.class);
    }

    /**
     *获取ConfigMap详情
     * @param req DescribeConfigMapRequest
     * @return DescribeConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMapResponse DescribeConfigMap(DescribeConfigMapRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigMap", DescribeConfigMapResponse.class);
    }

    /**
     *校验ConfigMap的Yaml语法
     * @param req DescribeConfigMapYamlErrorRequest
     * @return DescribeConfigMapYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMapYamlErrorResponse DescribeConfigMapYamlError(DescribeConfigMapYamlErrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigMapYamlError", DescribeConfigMapYamlErrorResponse.class);
    }

    /**
     *获取ConfigMap列表
     * @param req DescribeConfigMapsRequest
     * @return DescribeConfigMapsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigMapsResponse DescribeConfigMaps(DescribeConfigMapsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigMaps", DescribeConfigMapsResponse.class);
    }

    /**
     *自动获取Draco设备的安装包
     * @param req DescribeDracoEdgeNodeInstallerRequest
     * @return DescribeDracoEdgeNodeInstallerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDracoEdgeNodeInstallerResponse DescribeDracoEdgeNodeInstaller(DescribeDracoEdgeNodeInstallerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDracoEdgeNodeInstaller", DescribeDracoEdgeNodeInstallerResponse.class);
    }

    /**
     *获取节点安装信息
     * @param req DescribeEdgeAgentNodeInstallerRequest
     * @return DescribeEdgeAgentNodeInstallerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAgentNodeInstallerResponse DescribeEdgeAgentNodeInstaller(DescribeEdgeAgentNodeInstallerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeAgentNodeInstaller", DescribeEdgeAgentNodeInstallerResponse.class);
    }

    /**
     *获取边缘集群默认VPC信息
     * @param req DescribeEdgeDefaultVpcRequest
     * @return DescribeEdgeDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeDefaultVpcResponse DescribeEdgeDefaultVpc(DescribeEdgeDefaultVpcRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeDefaultVpc", DescribeEdgeDefaultVpcResponse.class);
    }

    /**
     *获取边缘节点信息
     * @param req DescribeEdgeNodeRequest
     * @return DescribeEdgeNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodeResponse DescribeEdgeNode(DescribeEdgeNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeNode", DescribeEdgeNodeResponse.class);
    }

    /**
     *查询节点Pod内的容器列表
     * @param req DescribeEdgeNodePodContainersRequest
     * @return DescribeEdgeNodePodContainersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodePodContainersResponse DescribeEdgeNodePodContainers(DescribeEdgeNodePodContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeNodePodContainers", DescribeEdgeNodePodContainersResponse.class);
    }

    /**
     *查询节点Pod列表
     * @param req DescribeEdgeNodePodsRequest
     * @return DescribeEdgeNodePodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodePodsResponse DescribeEdgeNodePods(DescribeEdgeNodePodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeNodePods", DescribeEdgeNodePodsResponse.class);
    }

    /**
     *获取节点备注信息列表
     * @param req DescribeEdgeNodeRemarkListRequest
     * @return DescribeEdgeNodeRemarkListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodeRemarkListResponse DescribeEdgeNodeRemarkList(DescribeEdgeNodeRemarkListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeNodeRemarkList", DescribeEdgeNodeRemarkListResponse.class);
    }

    /**
     *查询边缘节点列表
     * @param req DescribeEdgeNodesRequest
     * @return DescribeEdgeNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeNodesResponse DescribeEdgeNodes(DescribeEdgeNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeNodes", DescribeEdgeNodesResponse.class);
    }

    /**
     *查询边缘操作日志
     * @param req DescribeEdgeOperationLogsRequest
     * @return DescribeEdgeOperationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeOperationLogsResponse DescribeEdgeOperationLogs(DescribeEdgeOperationLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeOperationLogs", DescribeEdgeOperationLogsResponse.class);
    }

    /**
     *查询边缘单元Pod
     * @param req DescribeEdgePodRequest
     * @return DescribeEdgePodResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgePodResponse DescribeEdgePod(DescribeEdgePodRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgePod", DescribeEdgePodResponse.class);
    }

    /**
     *查询预注册节点列表
     * @param req DescribeEdgeSnNodesRequest
     * @return DescribeEdgeSnNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeSnNodesResponse DescribeEdgeSnNodes(DescribeEdgeSnNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeSnNodes", DescribeEdgeSnNodesResponse.class);
    }

    /**
     *产品停售，预下线

获取应用事件列表
     * @param req DescribeEdgeUnitApplicationEventsRequest
     * @return DescribeEdgeUnitApplicationEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationEventsResponse DescribeEdgeUnitApplicationEvents(DescribeEdgeUnitApplicationEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationEvents", DescribeEdgeUnitApplicationEventsResponse.class);
    }

    /**
     *产品停售，预下线

获取应用日志
     * @param req DescribeEdgeUnitApplicationLogsRequest
     * @return DescribeEdgeUnitApplicationLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationLogsResponse DescribeEdgeUnitApplicationLogs(DescribeEdgeUnitApplicationLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationLogs", DescribeEdgeUnitApplicationLogsResponse.class);
    }

    /**
     *产品停售，预下线

获取应用容器状态
     * @param req DescribeEdgeUnitApplicationPodContainersRequest
     * @return DescribeEdgeUnitApplicationPodContainersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationPodContainersResponse DescribeEdgeUnitApplicationPodContainers(DescribeEdgeUnitApplicationPodContainersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationPodContainers", DescribeEdgeUnitApplicationPodContainersResponse.class);
    }

    /**
     *产品停售，预下线

获取应用下Pod状态
     * @param req DescribeEdgeUnitApplicationPodsRequest
     * @return DescribeEdgeUnitApplicationPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationPodsResponse DescribeEdgeUnitApplicationPods(DescribeEdgeUnitApplicationPodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationPods", DescribeEdgeUnitApplicationPodsResponse.class);
    }

    /**
     *产品停售，预下线

获取单元可视化配置信息
     * @param req DescribeEdgeUnitApplicationVisualizationRequest
     * @return DescribeEdgeUnitApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationVisualizationResponse DescribeEdgeUnitApplicationVisualization(DescribeEdgeUnitApplicationVisualizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationVisualization", DescribeEdgeUnitApplicationVisualizationResponse.class);
    }

    /**
     *产品停售，预下线

获取应用的Yaml配置
     * @param req DescribeEdgeUnitApplicationYamlRequest
     * @return DescribeEdgeUnitApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationYamlResponse DescribeEdgeUnitApplicationYaml(DescribeEdgeUnitApplicationYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationYaml", DescribeEdgeUnitApplicationYamlResponse.class);
    }

    /**
     *产品停售，预下线

检查单元应用的Yaml配置
     * @param req DescribeEdgeUnitApplicationYamlErrorRequest
     * @return DescribeEdgeUnitApplicationYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationYamlErrorResponse DescribeEdgeUnitApplicationYamlError(DescribeEdgeUnitApplicationYamlErrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplicationYamlError", DescribeEdgeUnitApplicationYamlErrorResponse.class);
    }

    /**
     *获取单元下应用列表
     * @param req DescribeEdgeUnitApplicationsRequest
     * @return DescribeEdgeUnitApplicationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitApplicationsResponse DescribeEdgeUnitApplications(DescribeEdgeUnitApplicationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitApplications", DescribeEdgeUnitApplicationsResponse.class);
    }

    /**
     *产品停售，预下线

查询边缘集群详情
     * @param req DescribeEdgeUnitCloudRequest
     * @return DescribeEdgeUnitCloudResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitCloudResponse DescribeEdgeUnitCloud(DescribeEdgeUnitCloudRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitCloud", DescribeEdgeUnitCloudResponse.class);
    }

    /**
     *查询边缘单元Grid列表
     * @param req DescribeEdgeUnitDeployGridRequest
     * @return DescribeEdgeUnitDeployGridResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitDeployGridResponse DescribeEdgeUnitDeployGrid(DescribeEdgeUnitDeployGridRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitDeployGrid", DescribeEdgeUnitDeployGridResponse.class);
    }

    /**
     *查询边缘单元指定Grid下的部署应用列表
     * @param req DescribeEdgeUnitDeployGridItemRequest
     * @return DescribeEdgeUnitDeployGridItemResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitDeployGridItemResponse DescribeEdgeUnitDeployGridItem(DescribeEdgeUnitDeployGridItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitDeployGridItem", DescribeEdgeUnitDeployGridItemResponse.class);
    }

    /**
     *查询指定Grid下应用的Yaml
     * @param req DescribeEdgeUnitDeployGridItemYamlRequest
     * @return DescribeEdgeUnitDeployGridItemYamlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitDeployGridItemYamlResponse DescribeEdgeUnitDeployGridItemYaml(DescribeEdgeUnitDeployGridItemYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitDeployGridItemYaml", DescribeEdgeUnitDeployGridItemYamlResponse.class);
    }

    /**
     *查询边缘单元额外信息
     * @param req DescribeEdgeUnitExtraRequest
     * @return DescribeEdgeUnitExtraResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitExtraResponse DescribeEdgeUnitExtra(DescribeEdgeUnitExtraRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitExtra", DescribeEdgeUnitExtraResponse.class);
    }

    /**
     *查询边缘单元Grid事件列表
     * @param req DescribeEdgeUnitGridEventsRequest
     * @return DescribeEdgeUnitGridEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitGridEventsResponse DescribeEdgeUnitGridEvents(DescribeEdgeUnitGridEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitGridEvents", DescribeEdgeUnitGridEventsResponse.class);
    }

    /**
     *查询边缘单元Grid的Pod列表
     * @param req DescribeEdgeUnitGridPodsRequest
     * @return DescribeEdgeUnitGridPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitGridPodsResponse DescribeEdgeUnitGridPods(DescribeEdgeUnitGridPodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitGridPods", DescribeEdgeUnitGridPodsResponse.class);
    }

    /**
     *查询边缘集群监控状态
     * @param req DescribeEdgeUnitMonitorStatusRequest
     * @return DescribeEdgeUnitMonitorStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitMonitorStatusResponse DescribeEdgeUnitMonitorStatus(DescribeEdgeUnitMonitorStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitMonitorStatus", DescribeEdgeUnitMonitorStatusResponse.class);
    }

    /**
     *查询边缘集群NodeGroup
     * @param req DescribeEdgeUnitNodeGroupRequest
     * @return DescribeEdgeUnitNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitNodeGroupResponse DescribeEdgeUnitNodeGroup(DescribeEdgeUnitNodeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitNodeGroup", DescribeEdgeUnitNodeGroupResponse.class);
    }

    /**
     *查询边缘单元EdgeUnit模板列表
     * @param req DescribeEdgeUnitNodeUnitTemplatesRequest
     * @return DescribeEdgeUnitNodeUnitTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitNodeUnitTemplatesResponse DescribeEdgeUnitNodeUnitTemplates(DescribeEdgeUnitNodeUnitTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitNodeUnitTemplates", DescribeEdgeUnitNodeUnitTemplatesResponse.class);
    }

    /**
     *查询边缘单元列表
     * @param req DescribeEdgeUnitsCloudRequest
     * @return DescribeEdgeUnitsCloudResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeUnitsCloudResponse DescribeEdgeUnitsCloud(DescribeEdgeUnitsCloudRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeUnitsCloud", DescribeEdgeUnitsCloudResponse.class);
    }

    /**
     *获取设备信息
     * @param req DescribeIotDeviceRequest
     * @return DescribeIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotDeviceResponse DescribeIotDevice(DescribeIotDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIotDevice", DescribeIotDeviceResponse.class);
    }

    /**
     *获取设备列表信息
     * @param req DescribeIotDevicesRequest
     * @return DescribeIotDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIotDevicesResponse DescribeIotDevices(DescribeIotDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIotDevices", DescribeIotDevicesResponse.class);
    }

    /**
     *获取消息路由列表
     * @param req DescribeMessageRouteListRequest
     * @return DescribeMessageRouteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageRouteListResponse DescribeMessageRouteList(DescribeMessageRouteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMessageRouteList", DescribeMessageRouteListResponse.class);
    }

    /**
     *查询边缘单元监控数据
     * @param req DescribeMonitorMetricsRequest
     * @return DescribeMonitorMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorMetricsResponse DescribeMonitorMetrics(DescribeMonitorMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMonitorMetrics", DescribeMonitorMetricsResponse.class);
    }

    /**
     *获取命名空间
     * @param req DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespaceResponse DescribeNamespace(DescribeNamespaceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespace", DescribeNamespaceResponse.class);
    }

    /**
     *获取命名空间下的资源信息
     * @param req DescribeNamespaceResourcesRequest
     * @return DescribeNamespaceResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespaceResourcesResponse DescribeNamespaceResources(DescribeNamespaceResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespaceResources", DescribeNamespaceResourcesResponse.class);
    }

    /**
     *获取命名空间列表信息
     * @param req DescribeNamespacesRequest
     * @return DescribeNamespacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNamespacesResponse DescribeNamespaces(DescribeNamespacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNamespaces", DescribeNamespacesResponse.class);
    }

    /**
     *查询边缘单元NodeUnit列表
     * @param req DescribeNodeUnitRequest
     * @return DescribeNodeUnitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeUnitResponse DescribeNodeUnit(DescribeNodeUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeUnit", DescribeNodeUnitResponse.class);
    }

    /**
     *查询指定NodeGroup下NodeUnit模板列表
     * @param req DescribeNodeUnitTemplateOnNodeGroupRequest
     * @return DescribeNodeUnitTemplateOnNodeGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNodeUnitTemplateOnNodeGroupResponse DescribeNodeUnitTemplateOnNodeGroup(DescribeNodeUnitTemplateOnNodeGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNodeUnitTemplateOnNodeGroup", DescribeNodeUnitTemplateOnNodeGroupResponse.class);
    }

    /**
     *获取Secret详情
     * @param req DescribeSecretRequest
     * @return DescribeSecretResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretResponse DescribeSecret(DescribeSecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecret", DescribeSecretResponse.class);
    }

    /**
     *校验Secret的Yaml语法
     * @param req DescribeSecretYamlErrorRequest
     * @return DescribeSecretYamlErrorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretYamlErrorResponse DescribeSecretYamlError(DescribeSecretYamlErrorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecretYamlError", DescribeSecretYamlErrorResponse.class);
    }

    /**
     *获取Secrets列表
     * @param req DescribeSecretsRequest
     * @return DescribeSecretsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecretsResponse DescribeSecrets(DescribeSecretsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSecrets", DescribeSecretsResponse.class);
    }

    /**
     *查询用户的资源限制
     * @param req DescribeYeheResourceLimitRequest
     * @return DescribeYeheResourceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeYeheResourceLimitResponse DescribeYeheResourceLimit(DescribeYeheResourceLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeYeheResourceLimit", DescribeYeheResourceLimitResponse.class);
    }

    /**
     *获取组件市场的组件信息
     * @param req GetMarketComponentRequest
     * @return GetMarketComponentResponse
     * @throws TencentCloudSDKException
     */
    public GetMarketComponentResponse GetMarketComponent(GetMarketComponentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMarketComponent", GetMarketComponentResponse.class);
    }

    /**
     *获取组件市场组件列表
     * @param req GetMarketComponentListRequest
     * @return GetMarketComponentListResponse
     * @throws TencentCloudSDKException
     */
    public GetMarketComponentListResponse GetMarketComponentList(GetMarketComponentListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMarketComponentList", GetMarketComponentListResponse.class);
    }

    /**
     *产品停售，预下线

修改应用模板基本信息
     * @param req ModifyApplicationBasicInfoRequest
     * @return ModifyApplicationBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationBasicInfoResponse ModifyApplicationBasicInfo(ModifyApplicationBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationBasicInfo", ModifyApplicationBasicInfoResponse.class);
    }

    /**
     *产品停售，预下线

修改应用模板配置
     * @param req ModifyApplicationVisualizationRequest
     * @return ModifyApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApplicationVisualizationResponse ModifyApplicationVisualization(ModifyApplicationVisualizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyApplicationVisualization", ModifyApplicationVisualizationResponse.class);
    }

    /**
     *修改ConfigMap
     * @param req ModifyConfigMapRequest
     * @return ModifyConfigMapResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigMapResponse ModifyConfigMap(ModifyConfigMapRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyConfigMap", ModifyConfigMapResponse.class);
    }

    /**
     *编辑draco设备信息
     * @param req ModifyEdgeDracoNodeRequest
     * @return ModifyEdgeDracoNodeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeDracoNodeResponse ModifyEdgeDracoNode(ModifyEdgeDracoNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeDracoNode", ModifyEdgeDracoNodeResponse.class);
    }

    /**
     *编辑边缘节点标签
     * @param req ModifyEdgeNodeLabelsRequest
     * @return ModifyEdgeNodeLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeNodeLabelsResponse ModifyEdgeNodeLabels(ModifyEdgeNodeLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeNodeLabels", ModifyEdgeNodeLabelsResponse.class);
    }

    /**
     *修改边缘集群
     * @param req ModifyEdgeUnitRequest
     * @return ModifyEdgeUnitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitResponse ModifyEdgeUnit(ModifyEdgeUnitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeUnit", ModifyEdgeUnitResponse.class);
    }

    /**
     *修改单元应用基本信息
     * @param req ModifyEdgeUnitApplicationBasicInfoRequest
     * @return ModifyEdgeUnitApplicationBasicInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitApplicationBasicInfoResponse ModifyEdgeUnitApplicationBasicInfo(ModifyEdgeUnitApplicationBasicInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeUnitApplicationBasicInfo", ModifyEdgeUnitApplicationBasicInfoResponse.class);
    }

    /**
     *可视化修改应用配置
     * @param req ModifyEdgeUnitApplicationVisualizationRequest
     * @return ModifyEdgeUnitApplicationVisualizationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitApplicationVisualizationResponse ModifyEdgeUnitApplicationVisualization(ModifyEdgeUnitApplicationVisualizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeUnitApplicationVisualization", ModifyEdgeUnitApplicationVisualizationResponse.class);
    }

    /**
     *Yaml方式修改应用配置
     * @param req ModifyEdgeUnitApplicationYamlRequest
     * @return ModifyEdgeUnitApplicationYamlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitApplicationYamlResponse ModifyEdgeUnitApplicationYaml(ModifyEdgeUnitApplicationYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeUnitApplicationYaml", ModifyEdgeUnitApplicationYamlResponse.class);
    }

    /**
     *更新边缘单元信息
     * @param req ModifyEdgeUnitCloudApiRequest
     * @return ModifyEdgeUnitCloudApiResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitCloudApiResponse ModifyEdgeUnitCloudApi(ModifyEdgeUnitCloudApiRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeUnitCloudApi", ModifyEdgeUnitCloudApiResponse.class);
    }

    /**
     *修改边缘单元Grid部署应用副本数
     * @param req ModifyEdgeUnitDeployGridItemRequest
     * @return ModifyEdgeUnitDeployGridItemResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEdgeUnitDeployGridItemResponse ModifyEdgeUnitDeployGridItem(ModifyEdgeUnitDeployGridItemRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEdgeUnitDeployGridItem", ModifyEdgeUnitDeployGridItemResponse.class);
    }

    /**
     *修改设备信息
     * @param req ModifyIotDeviceRequest
     * @return ModifyIotDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIotDeviceResponse ModifyIotDevice(ModifyIotDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyIotDevice", ModifyIotDeviceResponse.class);
    }

    /**
     *修改边缘单元NodeUnit模板
     * @param req ModifyNodeUnitTemplateRequest
     * @return ModifyNodeUnitTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodeUnitTemplateResponse ModifyNodeUnitTemplate(ModifyNodeUnitTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodeUnitTemplate", ModifyNodeUnitTemplateResponse.class);
    }

    /**
     *修改Secret
     * @param req ModifySecretRequest
     * @return ModifySecretResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecretResponse ModifySecret(ModifySecretRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySecret", ModifySecretResponse.class);
    }

    /**
     *单元应用重部署
     * @param req RedeployEdgeUnitApplicationRequest
     * @return RedeployEdgeUnitApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RedeployEdgeUnitApplicationResponse RedeployEdgeUnitApplication(RedeployEdgeUnitApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RedeployEdgeUnitApplication", RedeployEdgeUnitApplicationResponse.class);
    }

    /**
     *开关消息路由
     * @param req SetRouteOnOffRequest
     * @return SetRouteOnOffResponse
     * @throws TencentCloudSDKException
     */
    public SetRouteOnOffResponse SetRouteOnOff(SetRouteOnOffRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetRouteOnOff", SetRouteOnOffResponse.class);
    }

}
