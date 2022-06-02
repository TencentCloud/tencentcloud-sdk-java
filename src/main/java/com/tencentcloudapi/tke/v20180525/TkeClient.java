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
package com.tencentcloudapi.tke.v20180525;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tke.v20180525.models.*;

public class TkeClient extends AbstractClient{
    private static String endpoint = "tke.tencentcloudapi.com";
    private static String service = "tke";
    private static String version = "2018-05-25";

    public TkeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TkeClient(Credential credential, String region, ClientProfile profile) {
        super(TkeClient.endpoint, TkeClient.version, credential, region, profile);
    }

    /**
     *通过此接口，可以获取集群的tke:admin的ClusterRole，即管理员角色，可以用于CAM侧高权限的用户，通过CAM策略给予子账户此接口权限，进而可以通过此接口直接获取到kubernetes集群内的管理员角色。
     * @param req AcquireClusterAdminRoleRequest
     * @return AcquireClusterAdminRoleResponse
     * @throws TencentCloudSDKException
     */
    public AcquireClusterAdminRoleResponse AcquireClusterAdminRole(AcquireClusterAdminRoleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcquireClusterAdminRoleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AcquireClusterAdminRoleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AcquireClusterAdminRole");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给GR集群增加可用的ClusterCIDR
     * @param req AddClusterCIDRRequest
     * @return AddClusterCIDRResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterCIDRResponse AddClusterCIDR(AddClusterCIDRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddClusterCIDRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddClusterCIDRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddClusterCIDR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加已经存在的实例到集群
     * @param req AddExistedInstancesRequest
     * @return AddExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddExistedInstancesResponse AddExistedInstances(AddExistedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddExistedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddExistedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddExistedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将集群内节点移入节点池
     * @param req AddNodeToNodePoolRequest
     * @return AddNodeToNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeToNodePoolResponse AddNodeToNodePool(AddNodeToNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddNodeToNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddNodeToNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddNodeToNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *针对VPC-CNI模式的集群，增加集群容器网络可使用的子网
     * @param req AddVpcCniSubnetsRequest
     * @return AddVpcCniSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AddVpcCniSubnetsResponse AddVpcCniSubnets(AddVpcCniSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddVpcCniSubnetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddVpcCniSubnetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddVpcCniSubnets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查边缘计算集群的CIDR是否冲突
     * @param req CheckEdgeClusterCIDRRequest
     * @return CheckEdgeClusterCIDRResponse
     * @throws TencentCloudSDKException
     */
    public CheckEdgeClusterCIDRResponse CheckEdgeClusterCIDR(CheckEdgeClusterCIDRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckEdgeClusterCIDRResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckEdgeClusterCIDRResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckEdgeClusterCIDR");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查给定节点列表中哪些是可升级的 
     * @param req CheckInstancesUpgradeAbleRequest
     * @return CheckInstancesUpgradeAbleResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstancesUpgradeAbleResponse CheckInstancesUpgradeAble(CheckInstancesUpgradeAbleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckInstancesUpgradeAbleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckInstancesUpgradeAbleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckInstancesUpgradeAble");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群访问端口(独立集群开启内网/外网访问，托管集群支持开启内网访问)
     * @param req CreateClusterEndpointRequest
     * @return CreateClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointResponse CreateClusterEndpoint(CreateClusterEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterEndpointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建托管集群外网访问端口（老的方式，仅支持托管集群外网端口）
     * @param req CreateClusterEndpointVipRequest
     * @return CreateClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointVipResponse CreateClusterEndpointVip(CreateClusterEndpointVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterEndpointVipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterEndpointVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterEndpointVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩展(新建)集群节点
     * @param req CreateClusterInstancesRequest
     * @return CreateClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterInstancesResponse CreateClusterInstances(CreateClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建节点池
     * @param req CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodePoolResponse CreateClusterNodePool(CreateClusterNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从伸缩组创建节点池
     * @param req CreateClusterNodePoolFromExistingAsgRequest
     * @return CreateClusterNodePoolFromExistingAsgResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodePoolFromExistingAsgResponse CreateClusterNodePoolFromExistingAsg(CreateClusterNodePoolFromExistingAsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterNodePoolFromExistingAsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterNodePoolFromExistingAsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterNodePoolFromExistingAsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群路由
     * @param req CreateClusterRouteRequest
     * @return CreateClusterRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterRouteResponse CreateClusterRoute(CreateClusterRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建集群路由表
     * @param req CreateClusterRouteTableRequest
     * @return CreateClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterRouteTableResponse CreateClusterRouteTable(CreateClusterRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateClusterRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateClusterRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateClusterRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建边缘计算ECM机器
     * @param req CreateECMInstancesRequest
     * @return CreateECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateECMInstancesResponse CreateECMInstances(CreateECMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateECMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateECMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateECMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建弹性集群
     * @param req CreateEKSClusterRequest
     * @return CreateEKSClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateEKSClusterResponse CreateEKSCluster(CreateEKSClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEKSClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEKSClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEKSCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建容器实例
     * @param req CreateEKSContainerInstancesRequest
     * @return CreateEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEKSContainerInstancesResponse CreateEKSContainerInstances(CreateEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEKSContainerInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEKSContainerInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEKSContainerInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建镜像缓存的接口。创建过程中，请勿删除EKSCI实例和云盘，否则镜像缓存将创建失败。
     * @param req CreateImageCacheRequest
     * @return CreateImageCacheResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageCacheResponse CreateImageCache(CreateImageCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateImageCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateImageCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateImageCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建告警策略
     * @param req CreatePrometheusAlertPolicyRequest
     * @return CreatePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertPolicyResponse CreatePrometheusAlertPolicy(CreatePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建告警规则
     * @param req CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertRuleResponse CreatePrometheusAlertRule(CreatePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建grafana监控面板
     * @param req CreatePrometheusDashboardRequest
     * @return CreatePrometheusDashboardResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusDashboardResponse CreatePrometheusDashboard(CreatePrometheusDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusDashboardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusDashboardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusDashboard");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建全局告警通知渠道
     * @param req CreatePrometheusGlobalNotificationRequest
     * @return CreatePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusGlobalNotificationResponse CreatePrometheusGlobalNotification(CreatePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusGlobalNotificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusGlobalNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusGlobalNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个云原生Prometheus模板
     * @param req CreatePrometheusTempRequest
     * @return CreatePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTempResponse CreatePrometheusTemp(CreatePrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusTempResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建一个云原生Prometheus模板实例
     * @param req CreatePrometheusTemplateRequest
     * @return CreatePrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTemplateResponse CreatePrometheusTemplate(CreatePrometheusTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePrometheusTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePrometheusTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePrometheusTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建边缘计算集群
     * @param req CreateTKEEdgeClusterRequest
     * @return CreateTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateTKEEdgeClusterResponse CreateTKEEdgeCluster(CreateTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTKEEdgeClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTKEEdgeClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTKEEdgeCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群(YUNAPI V3版本)
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群伸缩组
     * @param req DeleteClusterAsGroupsRequest
     * @return DeleteClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterAsGroupsResponse DeleteClusterAsGroups(DeleteClusterAsGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterAsGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterAsGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterAsGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群访问端口(独立集群开启内网/外网访问，托管集群支持开启内网访问)
     * @param req DeleteClusterEndpointRequest
     * @return DeleteClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointResponse DeleteClusterEndpoint(DeleteClusterEndpointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterEndpointResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterEndpointResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterEndpoint");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除托管集群外网访问端口（老的方式，仅支持托管集群外网端口）
     * @param req DeleteClusterEndpointVipRequest
     * @return DeleteClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointVipResponse DeleteClusterEndpointVip(DeleteClusterEndpointVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterEndpointVipResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterEndpointVipResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterEndpointVip");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群中的实例
     * @param req DeleteClusterInstancesRequest
     * @return DeleteClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterInstancesResponse DeleteClusterInstances(DeleteClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除节点池
     * @param req DeleteClusterNodePoolRequest
     * @return DeleteClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterNodePoolResponse DeleteClusterNodePool(DeleteClusterNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群路由
     * @param req DeleteClusterRouteRequest
     * @return DeleteClusterRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteResponse DeleteClusterRoute(DeleteClusterRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除集群路由表
     * @param req DeleteClusterRouteTableRequest
     * @return DeleteClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteTableResponse DeleteClusterRouteTable(DeleteClusterRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteClusterRouteTableResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteClusterRouteTableResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteClusterRouteTable");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除ECM实例
     * @param req DeleteECMInstancesRequest
     * @return DeleteECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteECMInstancesResponse DeleteECMInstances(DeleteECMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteECMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteECMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteECMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除弹性集群(yunapiv3)
     * @param req DeleteEKSClusterRequest
     * @return DeleteEKSClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEKSClusterResponse DeleteEKSCluster(DeleteEKSClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEKSClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEKSClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEKSCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除容器实例，可批量删除
     * @param req DeleteEKSContainerInstancesRequest
     * @return DeleteEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEKSContainerInstancesResponse DeleteEKSContainerInstances(DeleteEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEKSContainerInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEKSContainerInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEKSContainerInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘容器CVM实例
     * @param req DeleteEdgeCVMInstancesRequest
     * @return DeleteEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeCVMInstancesResponse DeleteEdgeCVMInstances(DeleteEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeCVMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeCVMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeCVMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘计算实例
     * @param req DeleteEdgeClusterInstancesRequest
     * @return DeleteEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeClusterInstancesResponse DeleteEdgeClusterInstances(DeleteEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEdgeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEdgeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEdgeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除镜像缓存
     * @param req DeleteImageCachesRequest
     * @return DeleteImageCachesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageCachesResponse DeleteImageCaches(DeleteImageCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteImageCachesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteImageCachesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteImageCaches");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除2.0实例告警策略
     * @param req DeletePrometheusAlertPolicyRequest
     * @return DeletePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertPolicyResponse DeletePrometheusAlertPolicy(DeletePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除告警规则
     * @param req DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertRuleResponse DeletePrometheusAlertRule(DeletePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个云原生Prometheus配置模板
     * @param req DeletePrometheusTempRequest
     * @return DeletePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempResponse DeletePrometheusTemp(DeletePrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusTempResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *解除模板同步，这将会删除目标中该模板所生产的配置，针对V2版本实例
     * @param req DeletePrometheusTempSyncRequest
     * @return DeletePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempSyncResponse DeletePrometheusTempSync(DeletePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusTempSyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusTempSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusTempSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个云原生Prometheus配置模板
     * @param req DeletePrometheusTemplateRequest
     * @return DeletePrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTemplateResponse DeletePrometheusTemplate(DeletePrometheusTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取消模板同步，这将会删除目标中该模板所生产的配置
     * @param req DeletePrometheusTemplateSyncRequest
     * @return DeletePrometheusTemplateSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTemplateSyncResponse DeletePrometheusTemplateSync(DeletePrometheusTemplateSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePrometheusTemplateSyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePrometheusTemplateSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeletePrometheusTemplateSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除边缘计算集群
     * @param req DeleteTKEEdgeClusterRequest
     * @return DeleteTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTKEEdgeClusterResponse DeleteTKEEdgeCluster(DeleteTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTKEEdgeClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTKEEdgeClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTKEEdgeCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群可以升级的所有版本
     * @param req DescribeAvailableClusterVersionRequest
     * @return DescribeAvailableClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableClusterVersionResponse DescribeAvailableClusterVersion(DescribeAvailableClusterVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableClusterVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableClusterVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableClusterVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *边缘计算支持的k8s版本
     * @param req DescribeAvailableTKEEdgeVersionRequest
     * @return DescribeAvailableTKEEdgeVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableTKEEdgeVersionResponse DescribeAvailableTKEEdgeVersion(DescribeAvailableTKEEdgeVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAvailableTKEEdgeVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAvailableTKEEdgeVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAvailableTKEEdgeVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群弹性伸缩配置
     * @param req DescribeClusterAsGroupOptionRequest
     * @return DescribeClusterAsGroupOptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupOptionResponse DescribeClusterAsGroupOption(DescribeClusterAsGroupOptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAsGroupOptionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAsGroupOptionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAsGroupOption");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群关联的伸缩组列表
     * @param req DescribeClusterAsGroupsRequest
     * @return DescribeClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupsResponse DescribeClusterAsGroups(DescribeClusterAsGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAsGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAsGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAsGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看集群认证配置
     * @param req DescribeClusterAuthenticationOptionsRequest
     * @return DescribeClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAuthenticationOptionsResponse DescribeClusterAuthenticationOptions(DescribeClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterAuthenticationOptionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterAuthenticationOptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterAuthenticationOptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定子账户在RBAC授权模式中对应kube-apiserver客户端证书的CommonName字段，如果没有客户端证书，将会签发一个，此接口有最大传入子账户数量上限，当前为50
     * @param req DescribeClusterCommonNamesRequest
     * @return DescribeClusterCommonNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterCommonNamesResponse DescribeClusterCommonNames(DescribeClusterCommonNamesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterCommonNamesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterCommonNamesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterCommonNames");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询Kubernetes的各个原生控制器是否开启
     * @param req DescribeClusterControllersRequest
     * @return DescribeClusterControllersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterControllersResponse DescribeClusterControllers(DescribeClusterControllersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterControllersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterControllersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterControllers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群访问端口状态(独立集群开启内网/外网访问，托管集群支持开启内网访问)
     * @param req DescribeClusterEndpointStatusRequest
     * @return DescribeClusterEndpointStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointStatusResponse DescribeClusterEndpointStatus(DescribeClusterEndpointStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterEndpointStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterEndpointStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterEndpointStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群开启端口流程状态(仅支持托管集群外网端口)
     * @param req DescribeClusterEndpointVipStatusRequest
     * @return DescribeClusterEndpointVipStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointVipStatusResponse DescribeClusterEndpointVipStatus(DescribeClusterEndpointVipStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterEndpointVipStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterEndpointVipStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterEndpointVipStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     * 查询集群下节点实例信息 
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群的kubeconfig文件，不同子账户获取自己的kubeconfig文件，该文件中有每个子账户自己的kube-apiserver的客户端证书，默认首次调此接口时候创建客户端证书，时效20年，未授予任何权限，如果是集群所有者或者主账户，则默认是cluster-admin权限。
     * @param req DescribeClusterKubeconfigRequest
     * @return DescribeClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterKubeconfigResponse DescribeClusterKubeconfig(DescribeClusterKubeconfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterKubeconfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterKubeconfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterKubeconfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群规模
     * @param req DescribeClusterLevelAttributeRequest
     * @return DescribeClusterLevelAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelAttributeResponse DescribeClusterLevelAttribute(DescribeClusterLevelAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterLevelAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterLevelAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterLevelAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群变配记录
     * @param req DescribeClusterLevelChangeRecordsRequest
     * @return DescribeClusterLevelChangeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelChangeRecordsResponse DescribeClusterLevelChangeRecords(DescribeClusterLevelChangeRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterLevelChangeRecordsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterLevelChangeRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterLevelChangeRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询节点池详情
     * @param req DescribeClusterNodePoolDetailRequest
     * @return DescribeClusterNodePoolDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolDetailResponse DescribeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterNodePoolDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterNodePoolDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterNodePoolDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询节点池列表
     * @param req DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolsResponse DescribeClusterNodePools(DescribeClusterNodePoolsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterNodePoolsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterNodePoolsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterNodePools");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群路由表
     * @param req DescribeClusterRouteTablesRequest
     * @return DescribeClusterRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRouteTablesResponse DescribeClusterRouteTables(DescribeClusterRouteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterRouteTablesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterRouteTablesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterRouteTables");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群路由
     * @param req DescribeClusterRoutesRequest
     * @return DescribeClusterRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRoutesResponse DescribeClusterRoutes(DescribeClusterRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterRoutesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群的密钥信息
     * @param req DescribeClusterSecurityRequest
     * @return DescribeClusterSecurityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSecurityResponse DescribeClusterSecurity(DescribeClusterSecurityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterSecurityResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterSecurityResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterSecurity");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看集群状态列表
     * @param req DescribeClusterStatusRequest
     * @return DescribeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterStatusResponse DescribeClusterStatus(DescribeClusterStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询集群列表
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取ECM实例相关信息
     * @param req DescribeECMInstancesRequest
     * @return DescribeECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeECMInstancesResponse DescribeECMInstances(DescribeECMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeECMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeECMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeECMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取弹性容器集群的接入认证信息
     * @param req DescribeEKSClusterCredentialRequest
     * @return DescribeEKSClusterCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSClusterCredentialResponse DescribeEKSClusterCredential(DescribeEKSClusterCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEKSClusterCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEKSClusterCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEKSClusterCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询弹性集群列表
     * @param req DescribeEKSClustersRequest
     * @return DescribeEKSClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSClustersResponse DescribeEKSClusters(DescribeEKSClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEKSClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEKSClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEKSClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器实例的事件
     * @param req DescribeEKSContainerInstanceEventRequest
     * @return DescribeEKSContainerInstanceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSContainerInstanceEventResponse DescribeEKSContainerInstanceEvent(DescribeEKSContainerInstanceEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEKSContainerInstanceEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEKSContainerInstanceEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEKSContainerInstanceEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器实例支持的地域
     * @param req DescribeEKSContainerInstanceRegionsRequest
     * @return DescribeEKSContainerInstanceRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSContainerInstanceRegionsResponse DescribeEKSContainerInstanceRegions(DescribeEKSContainerInstanceRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEKSContainerInstanceRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEKSContainerInstanceRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEKSContainerInstanceRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器实例
     * @param req DescribeEKSContainerInstancesRequest
     * @return DescribeEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSContainerInstancesResponse DescribeEKSContainerInstances(DescribeEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEKSContainerInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEKSContainerInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEKSContainerInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘容器集群可用的自定义参数
     * @param req DescribeEdgeAvailableExtraArgsRequest
     * @return DescribeEdgeAvailableExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAvailableExtraArgsResponse DescribeEdgeAvailableExtraArgs(DescribeEdgeAvailableExtraArgsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeAvailableExtraArgsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeAvailableExtraArgsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeAvailableExtraArgs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘容器CVM实例相关信息
     * @param req DescribeEdgeCVMInstancesRequest
     * @return DescribeEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeCVMInstancesResponse DescribeEdgeCVMInstances(DescribeEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeCVMInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeCVMInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeCVMInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘集群自定义参数
     * @param req DescribeEdgeClusterExtraArgsRequest
     * @return DescribeEdgeClusterExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterExtraArgsResponse DescribeEdgeClusterExtraArgs(DescribeEdgeClusterExtraArgsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeClusterExtraArgsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeClusterExtraArgsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeClusterExtraArgs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘计算集群的节点信息
     * @param req DescribeEdgeClusterInstancesRequest
     * @return DescribeEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterInstancesResponse DescribeEdgeClusterInstances(DescribeEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEdgeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEdgeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEdgeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询容器实例中容器日志
     * @param req DescribeEksContainerInstanceLogRequest
     * @return DescribeEksContainerInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEksContainerInstanceLogResponse DescribeEksContainerInstanceLog(DescribeEksContainerInstanceLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEksContainerInstanceLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEksContainerInstanceLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEksContainerInstanceLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于查询开启vpc-cni模式的任务进度
     * @param req DescribeEnableVpcCniProgressRequest
     * @return DescribeEnableVpcCniProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnableVpcCniProgressResponse DescribeEnableVpcCniProgress(DescribeEnableVpcCniProgressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnableVpcCniProgressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnableVpcCniProgressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnableVpcCniProgress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已经存在的节点，判断是否可以加入集群
     * @param req DescribeExistedInstancesRequest
     * @return DescribeExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExistedInstancesResponse DescribeExistedInstances(DescribeExistedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExistedInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExistedInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExistedInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取导入第三方集群YAML定义
     * @param req DescribeExternalClusterSpecRequest
     * @return DescribeExternalClusterSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalClusterSpecResponse DescribeExternalClusterSpec(DescribeExternalClusterSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExternalClusterSpecResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExternalClusterSpecResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExternalClusterSpec");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询镜像缓存信息接口
     * @param req DescribeImageCachesRequest
     * @return DescribeImageCachesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageCachesResponse DescribeImageCaches(DescribeImageCachesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImageCachesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImageCachesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImageCaches");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取镜像信息
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeImagesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeImagesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeImages");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取关联目标集群的实例列表
     * @param req DescribePrometheusAgentInstancesRequest
     * @return DescribePrometheusAgentInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentInstancesResponse DescribePrometheusAgentInstances(DescribePrometheusAgentInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAgentInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAgentInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAgentInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取被关联集群列表
     * @param req DescribePrometheusAgentsRequest
     * @return DescribePrometheusAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentsResponse DescribePrometheusAgents(DescribePrometheusAgentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAgentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAgentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAgents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取告警历史
     * @param req DescribePrometheusAlertHistoryRequest
     * @return DescribePrometheusAlertHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertHistoryResponse DescribePrometheusAlertHistory(DescribePrometheusAlertHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAlertHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAlertHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAlertHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取2.0实例告警策略列表
     * @param req DescribePrometheusAlertPolicyRequest
     * @return DescribePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertPolicyResponse DescribePrometheusAlertPolicy(DescribePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取告警规则列表
     * @param req DescribePrometheusAlertRuleRequest
     * @return DescribePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertRuleResponse DescribePrometheusAlertRule(DescribePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取2.0实例关联集群列表
     * @param req DescribePrometheusClusterAgentsRequest
     * @return DescribePrometheusClusterAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusClusterAgentsResponse DescribePrometheusClusterAgents(DescribePrometheusClusterAgentsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusClusterAgentsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusClusterAgentsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusClusterAgents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询全局告警通知渠道
     * @param req DescribePrometheusGlobalNotificationRequest
     * @return DescribePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalNotificationResponse DescribePrometheusGlobalNotification(DescribePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusGlobalNotificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusGlobalNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusGlobalNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例详细信息
     * @param req DescribePrometheusInstanceRequest
     * @return DescribePrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceResponse DescribePrometheusInstance(DescribePrometheusInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取与云监控融合实例列表
     * @param req DescribePrometheusInstancesOverviewRequest
     * @return DescribePrometheusInstancesOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesOverviewResponse DescribePrometheusInstancesOverview(DescribePrometheusInstancesOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusInstancesOverviewResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusInstancesOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusInstancesOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取实例列表
     * @param req DescribePrometheusOverviewsRequest
     * @return DescribePrometheusOverviewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusOverviewsResponse DescribePrometheusOverviews(DescribePrometheusOverviewsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusOverviewsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusOverviewsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusOverviews");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取聚合规则列表，包含关联集群内crd资源创建的record rule
     * @param req DescribePrometheusRecordRulesRequest
     * @return DescribePrometheusRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRulesResponse DescribePrometheusRecordRules(DescribePrometheusRecordRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusRecordRulesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusRecordRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusRecordRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取targets信息
     * @param req DescribePrometheusTargetsRequest
     * @return DescribePrometheusTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTargetsResponse DescribePrometheusTargets(DescribePrometheusTargetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTargetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTargetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTargets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取模板列表，默认模板将总是在最前面
     * @param req DescribePrometheusTempRequest
     * @return DescribePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempResponse DescribePrometheusTemp(DescribePrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTempResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模板关联实例信息，针对V2版本实例
     * @param req DescribePrometheusTempSyncRequest
     * @return DescribePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempSyncResponse DescribePrometheusTempSync(DescribePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTempSyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTempSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTempSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取模板同步信息
     * @param req DescribePrometheusTemplateSyncRequest
     * @return DescribePrometheusTemplateSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTemplateSyncResponse DescribePrometheusTemplateSync(DescribePrometheusTemplateSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTemplateSyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTemplateSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTemplateSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取模板列表，默认模板将总是在最前面
     * @param req DescribePrometheusTemplatesRequest
     * @return DescribePrometheusTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTemplatesResponse DescribePrometheusTemplates(DescribePrometheusTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePrometheusTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePrometheusTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePrometheusTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取容器服务支持的所有地域
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRegionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群资源使用量
     * @param req DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageResponse DescribeResourceUsage(DescribeResourceUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceUsageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceUsageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceUsage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询路由表冲突列表
     * @param req DescribeRouteTableConflictsRequest
     * @return DescribeRouteTableConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTableConflictsResponse DescribeRouteTableConflicts(DescribeRouteTableConflictsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteTableConflictsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRouteTableConflictsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRouteTableConflicts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘计算集群的认证信息
     * @param req DescribeTKEEdgeClusterCredentialRequest
     * @return DescribeTKEEdgeClusterCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterCredentialResponse DescribeTKEEdgeClusterCredential(DescribeTKEEdgeClusterCredentialRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeClusterCredentialResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeClusterCredentialResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeClusterCredential");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘计算集群的当前状态以及过程信息
     * @param req DescribeTKEEdgeClusterStatusRequest
     * @return DescribeTKEEdgeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterStatusResponse DescribeTKEEdgeClusterStatus(DescribeTKEEdgeClusterStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeClusterStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeClusterStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeClusterStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询边缘集群列表
     * @param req DescribeTKEEdgeClustersRequest
     * @return DescribeTKEEdgeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClustersResponse DescribeTKEEdgeClusters(DescribeTKEEdgeClustersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeClustersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeClustersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeClusters");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘计算外部访问的kubeconfig
     * @param req DescribeTKEEdgeExternalKubeconfigRequest
     * @return DescribeTKEEdgeExternalKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeExternalKubeconfigResponse DescribeTKEEdgeExternalKubeconfig(DescribeTKEEdgeExternalKubeconfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeExternalKubeconfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeExternalKubeconfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeExternalKubeconfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取边缘脚本链接
     * @param req DescribeTKEEdgeScriptRequest
     * @return DescribeTKEEdgeScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeScriptResponse DescribeTKEEdgeScript(DescribeTKEEdgeScriptRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTKEEdgeScriptResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTKEEdgeScriptResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTKEEdgeScript");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群版本信息
     * @param req DescribeVersionsRequest
     * @return DescribeVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionsResponse DescribeVersions(DescribeVersionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVersionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVersionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVersions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口查询当前用户和地域在指定可用区下的机型可支持的最大 TKE VPC-CNI 网络模式的 Pod 数量
     * @param req DescribeVpcCniPodLimitsRequest
     * @return DescribeVpcCniPodLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcCniPodLimitsResponse DescribeVpcCniPodLimits(DescribeVpcCniPodLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcCniPodLimitsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcCniPodLimitsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcCniPodLimits");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭集群审计
     * @param req DisableClusterAuditRequest
     * @return DisableClusterAuditResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterAuditResponse DisableClusterAudit(DisableClusterAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableClusterAuditResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableClusterAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableClusterAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭集群删除保护
     * @param req DisableClusterDeletionProtectionRequest
     * @return DisableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterDeletionProtectionResponse DisableClusterDeletionProtection(DisableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableClusterDeletionProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableClusterDeletionProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableClusterDeletionProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *关闭事件持久化功能
     * @param req DisableEventPersistenceRequest
     * @return DisableEventPersistenceResponse
     * @throws TencentCloudSDKException
     */
    public DisableEventPersistenceResponse DisableEventPersistence(DisableEventPersistenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableEventPersistenceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableEventPersistenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableEventPersistence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供给附加了VPC-CNI能力的Global-Route集群关闭VPC-CNI
     * @param req DisableVpcCniNetworkTypeRequest
     * @return DisableVpcCniNetworkTypeResponse
     * @throws TencentCloudSDKException
     */
    public DisableVpcCniNetworkTypeResponse DisableVpcCniNetworkType(DisableVpcCniNetworkTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableVpcCniNetworkTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableVpcCniNetworkTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableVpcCniNetworkType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启集群审计
     * @param req EnableClusterAuditRequest
     * @return EnableClusterAuditResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterAuditResponse EnableClusterAudit(EnableClusterAuditRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableClusterAuditResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableClusterAuditResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableClusterAudit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用集群删除保护
     * @param req EnableClusterDeletionProtectionRequest
     * @return EnableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterDeletionProtectionResponse EnableClusterDeletionProtection(EnableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableClusterDeletionProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableClusterDeletionProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableClusterDeletionProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启事件持久化功能
     * @param req EnableEventPersistenceRequest
     * @return EnableEventPersistenceResponse
     * @throws TencentCloudSDKException
     */
    public EnableEventPersistenceResponse EnableEventPersistence(EnableEventPersistenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableEventPersistenceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableEventPersistenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableEventPersistence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *GR集群可以通过本接口附加vpc-cni容器网络插件，开启vpc-cni容器网络能力
     * @param req EnableVpcCniNetworkTypeRequest
     * @return EnableVpcCniNetworkTypeResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpcCniNetworkTypeResponse EnableVpcCniNetworkType(EnableVpcCniNetworkTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableVpcCniNetworkTypeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableVpcCniNetworkTypeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableVpcCniNetworkType");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *操作TKE集群的addon
     * @param req ForwardApplicationRequestV3Request
     * @return ForwardApplicationRequestV3Response
     * @throws TencentCloudSDKException
     */
    public ForwardApplicationRequestV3Response ForwardApplicationRequestV3(ForwardApplicationRequestV3Request req) throws TencentCloudSDKException{
        JsonResponseModel<ForwardApplicationRequestV3Response> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ForwardApplicationRequestV3Response>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ForwardApplicationRequestV3");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取集群规模价格
     * @param req GetClusterLevelPriceRequest
     * @return GetClusterLevelPriceResponse
     * @throws TencentCloudSDKException
     */
    public GetClusterLevelPriceResponse GetClusterLevelPrice(GetClusterLevelPriceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetClusterLevelPriceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetClusterLevelPriceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetClusterLevelPrice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据镜像列表，查询匹配的镜像缓存
     * @param req GetMostSuitableImageCacheRequest
     * @return GetMostSuitableImageCacheResponse
     * @throws TencentCloudSDKException
     */
    public GetMostSuitableImageCacheResponse GetMostSuitableImageCache(GetMostSuitableImageCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetMostSuitableImageCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetMostSuitableImageCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetMostSuitableImageCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取TKE支持的App列表
     * @param req GetTkeAppChartListRequest
     * @return GetTkeAppChartListResponse
     * @throws TencentCloudSDKException
     */
    public GetTkeAppChartListResponse GetTkeAppChartList(GetTkeAppChartListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTkeAppChartListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTkeAppChartListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTkeAppChartList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获得节点升级当前的进度 
     * @param req GetUpgradeInstanceProgressRequest
     * @return GetUpgradeInstanceProgressResponse
     * @throws TencentCloudSDKException
     */
    public GetUpgradeInstanceProgressResponse GetUpgradeInstanceProgress(GetUpgradeInstanceProgressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetUpgradeInstanceProgressResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetUpgradeInstanceProgressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetUpgradeInstanceProgress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在TKE集群中安装CLS日志采集组件
     * @param req InstallLogAgentRequest
     * @return InstallLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallLogAgentResponse InstallLogAgent(InstallLogAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstallLogAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<InstallLogAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "InstallLogAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改集群伸缩组属性
     * @param req ModifyClusterAsGroupAttributeRequest
     * @return ModifyClusterAsGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupAttributeResponse ModifyClusterAsGroupAttribute(ModifyClusterAsGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAsGroupAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAsGroupAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAsGroupAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改集群弹性伸缩属性
     * @param req ModifyClusterAsGroupOptionAttributeRequest
     * @return ModifyClusterAsGroupOptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupOptionAttributeResponse ModifyClusterAsGroupOptionAttribute(ModifyClusterAsGroupOptionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAsGroupOptionAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAsGroupOptionAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAsGroupOptionAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改集群属性
     * @param req ModifyClusterAttributeRequest
     * @return ModifyClusterAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAttributeResponse ModifyClusterAttribute(ModifyClusterAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改集群认证配置
     * @param req ModifyClusterAuthenticationOptionsRequest
     * @return ModifyClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAuthenticationOptionsResponse ModifyClusterAuthenticationOptions(ModifyClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterAuthenticationOptionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterAuthenticationOptionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterAuthenticationOptions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改托管集群外网端口的安全策略（老的方式，仅支持托管集群外网端口）
     * @param req ModifyClusterEndpointSPRequest
     * @return ModifyClusterEndpointSPResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterEndpointSPResponse ModifyClusterEndpointSP(ModifyClusterEndpointSPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterEndpointSPResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterEndpointSPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterEndpointSP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑节点池
     * @param req ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNodePoolResponse ModifyClusterNodePool(ModifyClusterNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClusterNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClusterNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyClusterNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改节点池关联伸缩组的期望实例数
     * @param req ModifyNodePoolDesiredCapacityAboutAsgRequest
     * @return ModifyNodePoolDesiredCapacityAboutAsgResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolDesiredCapacityAboutAsgResponse ModifyNodePoolDesiredCapacityAboutAsg(ModifyNodePoolDesiredCapacityAboutAsgRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNodePoolDesiredCapacityAboutAsgResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNodePoolDesiredCapacityAboutAsgResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNodePoolDesiredCapacityAboutAsg");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改节点池的机型配置
     * @param req ModifyNodePoolInstanceTypesRequest
     * @return ModifyNodePoolInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolInstanceTypesResponse ModifyNodePoolInstanceTypes(ModifyNodePoolInstanceTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNodePoolInstanceTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyNodePoolInstanceTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyNodePoolInstanceTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改2.0实例告警策略
     * @param req ModifyPrometheusAlertPolicyRequest
     * @return ModifyPrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertPolicyResponse ModifyPrometheusAlertPolicy(ModifyPrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusAlertPolicyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusAlertPolicyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusAlertPolicy");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改告警规则 
     * @param req ModifyPrometheusAlertRuleRequest
     * @return ModifyPrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertRuleResponse ModifyPrometheusAlertRule(ModifyPrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusAlertRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusAlertRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusAlertRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改全局告警通知渠道
     * @param req ModifyPrometheusGlobalNotificationRequest
     * @return ModifyPrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusGlobalNotificationResponse ModifyPrometheusGlobalNotification(ModifyPrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusGlobalNotificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusGlobalNotificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusGlobalNotification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改模板内容
     * @param req ModifyPrometheusTempRequest
     * @return ModifyPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTempResponse ModifyPrometheusTemp(ModifyPrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusTempResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改模板内容
     * @param req ModifyPrometheusTemplateRequest
     * @return ModifyPrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTemplateResponse ModifyPrometheusTemplate(ModifyPrometheusTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrometheusTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPrometheusTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPrometheusTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *移出节点池节点，但保留在集群内
     * @param req RemoveNodeFromNodePoolRequest
     * @return RemoveNodeFromNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public RemoveNodeFromNodePoolResponse RemoveNodeFromNodePool(RemoveNodeFromNodePoolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveNodeFromNodePoolResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveNodeFromNodePoolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveNodeFromNodePool");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重启弹性容器实例，支持批量操作
     * @param req RestartEKSContainerInstancesRequest
     * @return RestartEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartEKSContainerInstancesResponse RestartEKSContainerInstances(RestartEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RestartEKSContainerInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RestartEKSContainerInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RestartEKSContainerInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *缩容独立集群master节点
     * @param req ScaleInClusterMasterRequest
     * @return ScaleInClusterMasterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleInClusterMasterResponse ScaleInClusterMaster(ScaleInClusterMasterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleInClusterMasterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleInClusterMasterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleInClusterMaster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *扩容独立集群master节点
     * @param req ScaleOutClusterMasterRequest
     * @return ScaleOutClusterMasterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutClusterMasterResponse ScaleOutClusterMaster(ScaleOutClusterMasterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScaleOutClusterMasterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ScaleOutClusterMasterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ScaleOutClusterMaster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *仅能设置节点池中处于伸缩组的节点
     * @param req SetNodePoolNodeProtectionRequest
     * @return SetNodePoolNodeProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetNodePoolNodeProtectionResponse SetNodePoolNodeProtection(SetNodePoolNodeProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetNodePoolNodeProtectionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SetNodePoolNodeProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SetNodePoolNodeProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步模板到实例或者集群，针对V2版本实例
     * @param req SyncPrometheusTempRequest
     * @return SyncPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTempResponse SyncPrometheusTemp(SyncPrometheusTempRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncPrometheusTempResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncPrometheusTempResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncPrometheusTemp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *同步模板到实例或者集群
     * @param req SyncPrometheusTemplateRequest
     * @return SyncPrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTemplateResponse SyncPrometheusTemplate(SyncPrometheusTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncPrometheusTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncPrometheusTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncPrometheusTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从TKE集群中卸载CLS日志采集组件
     * @param req UninstallLogAgentRequest
     * @return UninstallLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallLogAgentResponse UninstallLogAgent(UninstallLogAgentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UninstallLogAgentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UninstallLogAgentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UninstallLogAgent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *升级集群 Master 组件到指定版本
     * @param req UpdateClusterVersionRequest
     * @return UpdateClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterVersionResponse UpdateClusterVersion(UpdateClusterVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateClusterVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateClusterVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateClusterVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改弹性集群名称等属性 
     * @param req UpdateEKSClusterRequest
     * @return UpdateEKSClusterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEKSClusterResponse UpdateEKSCluster(UpdateEKSClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEKSClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEKSClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEKSCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新容器实例
     * @param req UpdateEKSContainerInstanceRequest
     * @return UpdateEKSContainerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEKSContainerInstanceResponse UpdateEKSContainerInstance(UpdateEKSContainerInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEKSContainerInstanceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEKSContainerInstanceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEKSContainerInstance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新镜像缓存接口
     * @param req UpdateImageCacheRequest
     * @return UpdateImageCacheResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageCacheResponse UpdateImageCache(UpdateImageCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateImageCacheResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateImageCacheResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateImageCache");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改边缘计算集群名称等属性 
     * @param req UpdateTKEEdgeClusterRequest
     * @return UpdateTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTKEEdgeClusterResponse UpdateTKEEdgeCluster(UpdateTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTKEEdgeClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateTKEEdgeClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateTKEEdgeCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给集群的一批work节点进行升级 
     * @param req UpgradeClusterInstancesRequest
     * @return UpgradeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterInstancesResponse UpgradeClusterInstances(UpgradeClusterInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeClusterInstancesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeClusterInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeClusterInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
