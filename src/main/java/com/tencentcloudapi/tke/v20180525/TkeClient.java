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
        req.setSkipSign(false);
        return this.internalRequest(req, "AcquireClusterAdminRole", AcquireClusterAdminRoleResponse.class);
    }

    /**
     *给GR集群增加可用的ClusterCIDR
     * @param req AddClusterCIDRRequest
     * @return AddClusterCIDRResponse
     * @throws TencentCloudSDKException
     */
    public AddClusterCIDRResponse AddClusterCIDR(AddClusterCIDRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddClusterCIDR", AddClusterCIDRResponse.class);
    }

    /**
     *添加已经存在的实例到集群
     * @param req AddExistedInstancesRequest
     * @return AddExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AddExistedInstancesResponse AddExistedInstances(AddExistedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddExistedInstances", AddExistedInstancesResponse.class);
    }

    /**
     *将集群内节点移入节点池
     * @param req AddNodeToNodePoolRequest
     * @return AddNodeToNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public AddNodeToNodePoolResponse AddNodeToNodePool(AddNodeToNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNodeToNodePool", AddNodeToNodePoolResponse.class);
    }

    /**
     *针对VPC-CNI模式的集群，增加集群容器网络可使用的子网
     * @param req AddVpcCniSubnetsRequest
     * @return AddVpcCniSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AddVpcCniSubnetsResponse AddVpcCniSubnets(AddVpcCniSubnetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddVpcCniSubnets", AddVpcCniSubnetsResponse.class);
    }

    /**
     *在应用市场中取消安装失败的应用
     * @param req CancelClusterReleaseRequest
     * @return CancelClusterReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CancelClusterReleaseResponse CancelClusterRelease(CancelClusterReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CancelClusterRelease", CancelClusterReleaseResponse.class);
    }

    /**
     *检查边缘计算集群的CIDR是否冲突
     * @param req CheckEdgeClusterCIDRRequest
     * @return CheckEdgeClusterCIDRResponse
     * @throws TencentCloudSDKException
     */
    public CheckEdgeClusterCIDRResponse CheckEdgeClusterCIDR(CheckEdgeClusterCIDRRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckEdgeClusterCIDR", CheckEdgeClusterCIDRResponse.class);
    }

    /**
     *检查给定节点列表中哪些是可升级的
     * @param req CheckInstancesUpgradeAbleRequest
     * @return CheckInstancesUpgradeAbleResponse
     * @throws TencentCloudSDKException
     */
    public CheckInstancesUpgradeAbleResponse CheckInstancesUpgradeAble(CheckInstancesUpgradeAbleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckInstancesUpgradeAble", CheckInstancesUpgradeAbleResponse.class);
    }

    /**
     *创建备份仓库，指定了存储仓库类型（如COS）、COS桶地区、名称等信息，当前最多允许创建100个仓库， 注意此接口当前是全局接口，多个地域的TKE集群如果要备份到相同的备份仓库中，不需要重复创建备份仓库
     * @param req CreateBackupStorageLocationRequest
     * @return CreateBackupStorageLocationResponse
     * @throws TencentCloudSDKException
     */
    public CreateBackupStorageLocationResponse CreateBackupStorageLocation(CreateBackupStorageLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBackupStorageLocation", CreateBackupStorageLocationResponse.class);
    }

    /**
     *创建集群
     * @param req CreateClusterRequest
     * @return CreateClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterResponse CreateCluster(CreateClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCluster", CreateClusterResponse.class);
    }

    /**
     *创建集群访问端口
     * @param req CreateClusterEndpointRequest
     * @return CreateClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointResponse CreateClusterEndpoint(CreateClusterEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterEndpoint", CreateClusterEndpointResponse.class);
    }

    /**
     *创建托管集群外网访问端口（不再维护，准备下线）请使用新接口：CreateClusterEndpoint
     * @param req CreateClusterEndpointVipRequest
     * @return CreateClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterEndpointVipResponse CreateClusterEndpointVip(CreateClusterEndpointVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterEndpointVip", CreateClusterEndpointVipResponse.class);
    }

    /**
     *扩展(新建)集群节点
     * @param req CreateClusterInstancesRequest
     * @return CreateClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterInstancesResponse CreateClusterInstances(CreateClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterInstances", CreateClusterInstancesResponse.class);
    }

    /**
     *创建节点池
     * @param req CreateClusterNodePoolRequest
     * @return CreateClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterNodePoolResponse CreateClusterNodePool(CreateClusterNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterNodePool", CreateClusterNodePoolResponse.class);
    }

    /**
     *集群创建应用
     * @param req CreateClusterReleaseRequest
     * @return CreateClusterReleaseResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterReleaseResponse CreateClusterRelease(CreateClusterReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterRelease", CreateClusterReleaseResponse.class);
    }

    /**
     *创建集群路由
     * @param req CreateClusterRouteRequest
     * @return CreateClusterRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterRouteResponse CreateClusterRoute(CreateClusterRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterRoute", CreateClusterRouteResponse.class);
    }

    /**
     *创建集群路由表
     * @param req CreateClusterRouteTableRequest
     * @return CreateClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterRouteTableResponse CreateClusterRouteTable(CreateClusterRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterRouteTable", CreateClusterRouteTableResponse.class);
    }

    /**
     *创建按量计费超级节点
     * @param req CreateClusterVirtualNodeRequest
     * @return CreateClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterVirtualNodeResponse CreateClusterVirtualNode(CreateClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterVirtualNode", CreateClusterVirtualNodeResponse.class);
    }

    /**
     *创建超级节点池
     * @param req CreateClusterVirtualNodePoolRequest
     * @return CreateClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public CreateClusterVirtualNodePoolResponse CreateClusterVirtualNodePool(CreateClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateClusterVirtualNodePool", CreateClusterVirtualNodePoolResponse.class);
    }

    /**
     *创建边缘计算ECM机器
     * @param req CreateECMInstancesRequest
     * @return CreateECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateECMInstancesResponse CreateECMInstances(CreateECMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateECMInstances", CreateECMInstancesResponse.class);
    }

    /**
     *创建弹性集群
     * @param req CreateEKSClusterRequest
     * @return CreateEKSClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateEKSClusterResponse CreateEKSCluster(CreateEKSClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEKSCluster", CreateEKSClusterResponse.class);
    }

    /**
     *创建容器实例
     * @param req CreateEKSContainerInstancesRequest
     * @return CreateEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEKSContainerInstancesResponse CreateEKSContainerInstances(CreateEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEKSContainerInstances", CreateEKSContainerInstancesResponse.class);
    }

    /**
     *创建边缘容器CVM机器
     * @param req CreateEdgeCVMInstancesRequest
     * @return CreateEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeCVMInstancesResponse CreateEdgeCVMInstances(CreateEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeCVMInstances", CreateEdgeCVMInstancesResponse.class);
    }

    /**
     *创建边缘集群日志采集配置
     * @param req CreateEdgeLogConfigRequest
     * @return CreateEdgeLogConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateEdgeLogConfigResponse CreateEdgeLogConfig(CreateEdgeLogConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEdgeLogConfig", CreateEdgeLogConfigResponse.class);
    }

    /**
     *创建镜像缓存的接口。创建过程中，请勿删除EKSCI实例和云盘，否则镜像缓存将创建失败。
     * @param req CreateImageCacheRequest
     * @return CreateImageCacheResponse
     * @throws TencentCloudSDKException
     */
    public CreateImageCacheResponse CreateImageCache(CreateImageCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateImageCache", CreateImageCacheResponse.class);
    }

    /**
     *创建告警策略
     * @param req CreatePrometheusAlertPolicyRequest
     * @return CreatePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertPolicyResponse CreatePrometheusAlertPolicy(CreatePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertPolicy", CreatePrometheusAlertPolicyResponse.class);
    }

    /**
     *创建告警规则
     * @param req CreatePrometheusAlertRuleRequest
     * @return CreatePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusAlertRuleResponse CreatePrometheusAlertRule(CreatePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusAlertRule", CreatePrometheusAlertRuleResponse.class);
    }

    /**
     *与云监控融合的2.0实例关联集群
     * @param req CreatePrometheusClusterAgentRequest
     * @return CreatePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusClusterAgentResponse CreatePrometheusClusterAgent(CreatePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusClusterAgent", CreatePrometheusClusterAgentResponse.class);
    }

    /**
     *创建prometheus配置
     * @param req CreatePrometheusConfigRequest
     * @return CreatePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusConfigResponse CreatePrometheusConfig(CreatePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusConfig", CreatePrometheusConfigResponse.class);
    }

    /**
     *创建grafana监控面板
     * @param req CreatePrometheusDashboardRequest
     * @return CreatePrometheusDashboardResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusDashboardResponse CreatePrometheusDashboard(CreatePrometheusDashboardRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusDashboard", CreatePrometheusDashboardResponse.class);
    }

    /**
     *创建全局告警通知渠道
     * @param req CreatePrometheusGlobalNotificationRequest
     * @return CreatePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusGlobalNotificationResponse CreatePrometheusGlobalNotification(CreatePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusGlobalNotification", CreatePrometheusGlobalNotificationResponse.class);
    }

    /**
     *以Yaml的方式创建聚合规则
     * @param req CreatePrometheusRecordRuleYamlRequest
     * @return CreatePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusRecordRuleYamlResponse CreatePrometheusRecordRuleYaml(CreatePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusRecordRuleYaml", CreatePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *创建一个云原生Prometheus模板
     * @param req CreatePrometheusTempRequest
     * @return CreatePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTempResponse CreatePrometheusTemp(CreatePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusTemp", CreatePrometheusTempResponse.class);
    }

    /**
     *创建一个云原生Prometheus模板实例
     * @param req CreatePrometheusTemplateRequest
     * @return CreatePrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreatePrometheusTemplateResponse CreatePrometheusTemplate(CreatePrometheusTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePrometheusTemplate", CreatePrometheusTemplateResponse.class);
    }

    /**
     *预留券实例的购买会预先扣除本次实例购买所需金额，在调用本接口前请确保账户余额充足。
     * @param req CreateReservedInstancesRequest
     * @return CreateReservedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public CreateReservedInstancesResponse CreateReservedInstances(CreateReservedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateReservedInstances", CreateReservedInstancesResponse.class);
    }

    /**
     *创建边缘计算集群
     * @param req CreateTKEEdgeClusterRequest
     * @return CreateTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateTKEEdgeClusterResponse CreateTKEEdgeCluster(CreateTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTKEEdgeCluster", CreateTKEEdgeClusterResponse.class);
    }

    /**
     *删除一个addon
     * @param req DeleteAddonRequest
     * @return DeleteAddonResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddonResponse DeleteAddon(DeleteAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAddon", DeleteAddonResponse.class);
    }

    /**
     *删除备份仓库
     * @param req DeleteBackupStorageLocationRequest
     * @return DeleteBackupStorageLocationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBackupStorageLocationResponse DeleteBackupStorageLocation(DeleteBackupStorageLocationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBackupStorageLocation", DeleteBackupStorageLocationResponse.class);
    }

    /**
     *删除集群(YUNAPI V3版本)
     * @param req DeleteClusterRequest
     * @return DeleteClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterResponse DeleteCluster(DeleteClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCluster", DeleteClusterResponse.class);
    }

    /**
     *删除集群伸缩组
     * @param req DeleteClusterAsGroupsRequest
     * @return DeleteClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterAsGroupsResponse DeleteClusterAsGroups(DeleteClusterAsGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterAsGroups", DeleteClusterAsGroupsResponse.class);
    }

    /**
     *删除集群访问端口
     * @param req DeleteClusterEndpointRequest
     * @return DeleteClusterEndpointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointResponse DeleteClusterEndpoint(DeleteClusterEndpointRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterEndpoint", DeleteClusterEndpointResponse.class);
    }

    /**
     *删除托管集群外网访问端口（老的方式，仅支持托管集群外网端口）
     * @param req DeleteClusterEndpointVipRequest
     * @return DeleteClusterEndpointVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterEndpointVipResponse DeleteClusterEndpointVip(DeleteClusterEndpointVipRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterEndpointVip", DeleteClusterEndpointVipResponse.class);
    }

    /**
     *删除集群中的实例
     * @param req DeleteClusterInstancesRequest
     * @return DeleteClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterInstancesResponse DeleteClusterInstances(DeleteClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterInstances", DeleteClusterInstancesResponse.class);
    }

    /**
     *删除节点池
     * @param req DeleteClusterNodePoolRequest
     * @return DeleteClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterNodePoolResponse DeleteClusterNodePool(DeleteClusterNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterNodePool", DeleteClusterNodePoolResponse.class);
    }

    /**
     *删除集群路由
     * @param req DeleteClusterRouteRequest
     * @return DeleteClusterRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteResponse DeleteClusterRoute(DeleteClusterRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterRoute", DeleteClusterRouteResponse.class);
    }

    /**
     *删除集群路由表
     * @param req DeleteClusterRouteTableRequest
     * @return DeleteClusterRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterRouteTableResponse DeleteClusterRouteTable(DeleteClusterRouteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterRouteTable", DeleteClusterRouteTableResponse.class);
    }

    /**
     *删除超级节点
     * @param req DeleteClusterVirtualNodeRequest
     * @return DeleteClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterVirtualNodeResponse DeleteClusterVirtualNode(DeleteClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterVirtualNode", DeleteClusterVirtualNodeResponse.class);
    }

    /**
     *删除超级节点池
     * @param req DeleteClusterVirtualNodePoolRequest
     * @return DeleteClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public DeleteClusterVirtualNodePoolResponse DeleteClusterVirtualNodePool(DeleteClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteClusterVirtualNodePool", DeleteClusterVirtualNodePoolResponse.class);
    }

    /**
     *删除ECM实例
     * @param req DeleteECMInstancesRequest
     * @return DeleteECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteECMInstancesResponse DeleteECMInstances(DeleteECMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteECMInstances", DeleteECMInstancesResponse.class);
    }

    /**
     *删除弹性集群(yunapiv3)
     * @param req DeleteEKSClusterRequest
     * @return DeleteEKSClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEKSClusterResponse DeleteEKSCluster(DeleteEKSClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEKSCluster", DeleteEKSClusterResponse.class);
    }

    /**
     *删除容器实例，可批量删除
     * @param req DeleteEKSContainerInstancesRequest
     * @return DeleteEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEKSContainerInstancesResponse DeleteEKSContainerInstances(DeleteEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEKSContainerInstances", DeleteEKSContainerInstancesResponse.class);
    }

    /**
     *删除边缘容器CVM实例
     * @param req DeleteEdgeCVMInstancesRequest
     * @return DeleteEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeCVMInstancesResponse DeleteEdgeCVMInstances(DeleteEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeCVMInstances", DeleteEdgeCVMInstancesResponse.class);
    }

    /**
     *删除边缘计算实例
     * @param req DeleteEdgeClusterInstancesRequest
     * @return DeleteEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEdgeClusterInstancesResponse DeleteEdgeClusterInstances(DeleteEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEdgeClusterInstances", DeleteEdgeClusterInstancesResponse.class);
    }

    /**
     *批量删除镜像缓存
     * @param req DeleteImageCachesRequest
     * @return DeleteImageCachesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteImageCachesResponse DeleteImageCaches(DeleteImageCachesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteImageCaches", DeleteImageCachesResponse.class);
    }

    /**
     *删除2.0实例告警策略
     * @param req DeletePrometheusAlertPolicyRequest
     * @return DeletePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertPolicyResponse DeletePrometheusAlertPolicy(DeletePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertPolicy", DeletePrometheusAlertPolicyResponse.class);
    }

    /**
     *删除告警规则
     * @param req DeletePrometheusAlertRuleRequest
     * @return DeletePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusAlertRuleResponse DeletePrometheusAlertRule(DeletePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusAlertRule", DeletePrometheusAlertRuleResponse.class);
    }

    /**
     *解除TMP实例的集群关联
     * @param req DeletePrometheusClusterAgentRequest
     * @return DeletePrometheusClusterAgentResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusClusterAgentResponse DeletePrometheusClusterAgent(DeletePrometheusClusterAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusClusterAgent", DeletePrometheusClusterAgentResponse.class);
    }

    /**
     *删除Prometheus配置，如果目标不存在，将返回成功
     * @param req DeletePrometheusConfigRequest
     * @return DeletePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusConfigResponse DeletePrometheusConfig(DeletePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusConfig", DeletePrometheusConfigResponse.class);
    }

    /**
     *删除聚合实例
     * @param req DeletePrometheusRecordRuleYamlRequest
     * @return DeletePrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusRecordRuleYamlResponse DeletePrometheusRecordRuleYaml(DeletePrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusRecordRuleYaml", DeletePrometheusRecordRuleYamlResponse.class);
    }

    /**
     *删除一个云原生Prometheus配置模板
     * @param req DeletePrometheusTempRequest
     * @return DeletePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempResponse DeletePrometheusTemp(DeletePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTemp", DeletePrometheusTempResponse.class);
    }

    /**
     *解除模板同步，这将会删除目标中该模板所生产的配置，针对V2版本实例
     * @param req DeletePrometheusTempSyncRequest
     * @return DeletePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTempSyncResponse DeletePrometheusTempSync(DeletePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTempSync", DeletePrometheusTempSyncResponse.class);
    }

    /**
     *删除一个云原生Prometheus配置模板
     * @param req DeletePrometheusTemplateRequest
     * @return DeletePrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTemplateResponse DeletePrometheusTemplate(DeletePrometheusTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTemplate", DeletePrometheusTemplateResponse.class);
    }

    /**
     *取消模板同步，这将会删除目标中该模板所生产的配置
     * @param req DeletePrometheusTemplateSyncRequest
     * @return DeletePrometheusTemplateSyncResponse
     * @throws TencentCloudSDKException
     */
    public DeletePrometheusTemplateSyncResponse DeletePrometheusTemplateSync(DeletePrometheusTemplateSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePrometheusTemplateSync", DeletePrometheusTemplateSyncResponse.class);
    }

    /**
     *预留券实例如符合退还规则，可通过本接口主动退还。
     * @param req DeleteReservedInstancesRequest
     * @return DeleteReservedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteReservedInstancesResponse DeleteReservedInstances(DeleteReservedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteReservedInstances", DeleteReservedInstancesResponse.class);
    }

    /**
     *删除边缘计算集群
     * @param req DeleteTKEEdgeClusterRequest
     * @return DeleteTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTKEEdgeClusterResponse DeleteTKEEdgeCluster(DeleteTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTKEEdgeCluster", DeleteTKEEdgeClusterResponse.class);
    }

    /**
     *获取addon列表
     * @param req DescribeAddonRequest
     * @return DescribeAddonResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddonResponse DescribeAddon(DescribeAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddon", DescribeAddonResponse.class);
    }

    /**
     *获取一个addon的参数
     * @param req DescribeAddonValuesRequest
     * @return DescribeAddonValuesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddonValuesResponse DescribeAddonValues(DescribeAddonValuesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAddonValues", DescribeAddonValuesResponse.class);
    }

    /**
     *获取集群可以升级的所有版本
     * @param req DescribeAvailableClusterVersionRequest
     * @return DescribeAvailableClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableClusterVersionResponse DescribeAvailableClusterVersion(DescribeAvailableClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableClusterVersion", DescribeAvailableClusterVersionResponse.class);
    }

    /**
     *边缘计算支持版本和k8s版本
     * @param req DescribeAvailableTKEEdgeVersionRequest
     * @return DescribeAvailableTKEEdgeVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAvailableTKEEdgeVersionResponse DescribeAvailableTKEEdgeVersion(DescribeAvailableTKEEdgeVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAvailableTKEEdgeVersion", DescribeAvailableTKEEdgeVersionResponse.class);
    }

    /**
     *查询备份仓库信息
     * @param req DescribeBackupStorageLocationsRequest
     * @return DescribeBackupStorageLocationsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupStorageLocationsResponse DescribeBackupStorageLocations(DescribeBackupStorageLocationsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBackupStorageLocations", DescribeBackupStorageLocationsResponse.class);
    }

    /**
     *集群弹性伸缩配置
     * @param req DescribeClusterAsGroupOptionRequest
     * @return DescribeClusterAsGroupOptionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupOptionResponse DescribeClusterAsGroupOption(DescribeClusterAsGroupOptionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAsGroupOption", DescribeClusterAsGroupOptionResponse.class);
    }

    /**
     *集群关联的伸缩组列表
     * @param req DescribeClusterAsGroupsRequest
     * @return DescribeClusterAsGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAsGroupsResponse DescribeClusterAsGroups(DescribeClusterAsGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAsGroups", DescribeClusterAsGroupsResponse.class);
    }

    /**
     *查看集群认证配置
     * @param req DescribeClusterAuthenticationOptionsRequest
     * @return DescribeClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAuthenticationOptionsResponse DescribeClusterAuthenticationOptions(DescribeClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAuthenticationOptions", DescribeClusterAuthenticationOptionsResponse.class);
    }

    /**
     *获取指定子账户在RBAC授权模式中对应kube-apiserver客户端证书的CommonName字段，如果没有客户端证书，将会签发一个，此接口有最大传入子账户数量上限，当前为50
     * @param req DescribeClusterCommonNamesRequest
     * @return DescribeClusterCommonNamesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterCommonNamesResponse DescribeClusterCommonNames(DescribeClusterCommonNamesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterCommonNames", DescribeClusterCommonNamesResponse.class);
    }

    /**
     *用于查询Kubernetes的各个原生控制器是否开启
     * @param req DescribeClusterControllersRequest
     * @return DescribeClusterControllersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterControllersResponse DescribeClusterControllers(DescribeClusterControllersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterControllers", DescribeClusterControllersResponse.class);
    }

    /**
     *查询集群访问端口状态(独立集群开启内网/外网访问，托管集群支持开启内网访问)
     * @param req DescribeClusterEndpointStatusRequest
     * @return DescribeClusterEndpointStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointStatusResponse DescribeClusterEndpointStatus(DescribeClusterEndpointStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpointStatus", DescribeClusterEndpointStatusResponse.class);
    }

    /**
     *查询集群开启端口流程状态(仅支持托管集群外网端口)
     * @param req DescribeClusterEndpointVipStatusRequest
     * @return DescribeClusterEndpointVipStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointVipStatusResponse DescribeClusterEndpointVipStatus(DescribeClusterEndpointVipStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpointVipStatus", DescribeClusterEndpointVipStatusResponse.class);
    }

    /**
     *获取集群的访问地址，包括内网地址，外网地址，外网域名，外网访问安全策略
     * @param req DescribeClusterEndpointsRequest
     * @return DescribeClusterEndpointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterEndpointsResponse DescribeClusterEndpoints(DescribeClusterEndpointsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterEndpoints", DescribeClusterEndpointsResponse.class);
    }

    /**
     *查询集群自定义参数
     * @param req DescribeClusterExtraArgsRequest
     * @return DescribeClusterExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterExtraArgsResponse DescribeClusterExtraArgs(DescribeClusterExtraArgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterExtraArgs", DescribeClusterExtraArgsResponse.class);
    }

    /**
     *查询用户单个Region下的所有集群巡检结果概览信息
     * @param req DescribeClusterInspectionResultsOverviewRequest
     * @return DescribeClusterInspectionResultsOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInspectionResultsOverviewResponse DescribeClusterInspectionResultsOverview(DescribeClusterInspectionResultsOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInspectionResultsOverview", DescribeClusterInspectionResultsOverviewResponse.class);
    }

    /**
     *查询集群下节点实例信息
     * @param req DescribeClusterInstancesRequest
     * @return DescribeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterInstancesResponse DescribeClusterInstances(DescribeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterInstances", DescribeClusterInstancesResponse.class);
    }

    /**
     *获取集群的kubeconfig文件，不同子账户获取自己的kubeconfig文件，该文件中有每个子账户自己的kube-apiserver的客户端证书，默认首次调此接口时候创建客户端证书，时效20年，未授予任何权限，如果是集群所有者或者主账户，则默认是cluster-admin权限。
     * @param req DescribeClusterKubeconfigRequest
     * @return DescribeClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterKubeconfigResponse DescribeClusterKubeconfig(DescribeClusterKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterKubeconfig", DescribeClusterKubeconfigResponse.class);
    }

    /**
     *获取集群规模
     * @param req DescribeClusterLevelAttributeRequest
     * @return DescribeClusterLevelAttributeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelAttributeResponse DescribeClusterLevelAttribute(DescribeClusterLevelAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterLevelAttribute", DescribeClusterLevelAttributeResponse.class);
    }

    /**
     *查询集群变配记录
     * @param req DescribeClusterLevelChangeRecordsRequest
     * @return DescribeClusterLevelChangeRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterLevelChangeRecordsResponse DescribeClusterLevelChangeRecords(DescribeClusterLevelChangeRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterLevelChangeRecords", DescribeClusterLevelChangeRecordsResponse.class);
    }

    /**
     *查询节点池详情
     * @param req DescribeClusterNodePoolDetailRequest
     * @return DescribeClusterNodePoolDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolDetailResponse DescribeClusterNodePoolDetail(DescribeClusterNodePoolDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodePoolDetail", DescribeClusterNodePoolDetailResponse.class);
    }

    /**
     *查询节点池列表
     * @param req DescribeClusterNodePoolsRequest
     * @return DescribeClusterNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterNodePoolsResponse DescribeClusterNodePools(DescribeClusterNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterNodePools", DescribeClusterNodePoolsResponse.class);
    }

    /**
     *在应用市场中查询正在安装中的应用列表
     * @param req DescribeClusterPendingReleasesRequest
     * @return DescribeClusterPendingReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPendingReleasesResponse DescribeClusterPendingReleases(DescribeClusterPendingReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPendingReleases", DescribeClusterPendingReleasesResponse.class);
    }

    /**
     *查询通过应用市场安装的某个应用详情
     * @param req DescribeClusterReleaseDetailsRequest
     * @return DescribeClusterReleaseDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterReleaseDetailsResponse DescribeClusterReleaseDetails(DescribeClusterReleaseDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterReleaseDetails", DescribeClusterReleaseDetailsResponse.class);
    }

    /**
     *查询集群在应用市场中某个已安装应用的版本历史
     * @param req DescribeClusterReleaseHistoryRequest
     * @return DescribeClusterReleaseHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterReleaseHistoryResponse DescribeClusterReleaseHistory(DescribeClusterReleaseHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterReleaseHistory", DescribeClusterReleaseHistoryResponse.class);
    }

    /**
     *查询集群在应用市场中已安装应用列表
     * @param req DescribeClusterReleasesRequest
     * @return DescribeClusterReleasesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterReleasesResponse DescribeClusterReleases(DescribeClusterReleasesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterReleases", DescribeClusterReleasesResponse.class);
    }

    /**
     *查询集群路由表
     * @param req DescribeClusterRouteTablesRequest
     * @return DescribeClusterRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRouteTablesResponse DescribeClusterRouteTables(DescribeClusterRouteTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRouteTables", DescribeClusterRouteTablesResponse.class);
    }

    /**
     *查询集群路由
     * @param req DescribeClusterRoutesRequest
     * @return DescribeClusterRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterRoutesResponse DescribeClusterRoutes(DescribeClusterRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterRoutes", DescribeClusterRoutesResponse.class);
    }

    /**
     *集群的密钥信息
     * @param req DescribeClusterSecurityRequest
     * @return DescribeClusterSecurityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterSecurityResponse DescribeClusterSecurity(DescribeClusterSecurityRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterSecurity", DescribeClusterSecurityResponse.class);
    }

    /**
     *查看集群状态列表
     * @param req DescribeClusterStatusRequest
     * @return DescribeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterStatusResponse DescribeClusterStatus(DescribeClusterStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterStatus", DescribeClusterStatusResponse.class);
    }

    /**
     *查看超级节点列表
     * @param req DescribeClusterVirtualNodeRequest
     * @return DescribeClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterVirtualNodeResponse DescribeClusterVirtualNode(DescribeClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterVirtualNode", DescribeClusterVirtualNodeResponse.class);
    }

    /**
     *查看超级节点池列表
     * @param req DescribeClusterVirtualNodePoolsRequest
     * @return DescribeClusterVirtualNodePoolsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterVirtualNodePoolsResponse DescribeClusterVirtualNodePools(DescribeClusterVirtualNodePoolsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterVirtualNodePools", DescribeClusterVirtualNodePoolsResponse.class);
    }

    /**
     *查询集群列表
     * @param req DescribeClustersRequest
     * @return DescribeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClustersResponse DescribeClusters(DescribeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusters", DescribeClustersResponse.class);
    }

    /**
     *获取ECM实例相关信息
     * @param req DescribeECMInstancesRequest
     * @return DescribeECMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeECMInstancesResponse DescribeECMInstances(DescribeECMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeECMInstances", DescribeECMInstancesResponse.class);
    }

    /**
     *获取弹性容器集群的接入认证信息
     * @param req DescribeEKSClusterCredentialRequest
     * @return DescribeEKSClusterCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSClusterCredentialResponse DescribeEKSClusterCredential(DescribeEKSClusterCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEKSClusterCredential", DescribeEKSClusterCredentialResponse.class);
    }

    /**
     *查询弹性集群列表
     * @param req DescribeEKSClustersRequest
     * @return DescribeEKSClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSClustersResponse DescribeEKSClusters(DescribeEKSClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEKSClusters", DescribeEKSClustersResponse.class);
    }

    /**
     *查询容器实例的事件
     * @param req DescribeEKSContainerInstanceEventRequest
     * @return DescribeEKSContainerInstanceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSContainerInstanceEventResponse DescribeEKSContainerInstanceEvent(DescribeEKSContainerInstanceEventRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEKSContainerInstanceEvent", DescribeEKSContainerInstanceEventResponse.class);
    }

    /**
     *查询容器实例支持的地域
     * @param req DescribeEKSContainerInstanceRegionsRequest
     * @return DescribeEKSContainerInstanceRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSContainerInstanceRegionsResponse DescribeEKSContainerInstanceRegions(DescribeEKSContainerInstanceRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEKSContainerInstanceRegions", DescribeEKSContainerInstanceRegionsResponse.class);
    }

    /**
     *查询容器实例
     * @param req DescribeEKSContainerInstancesRequest
     * @return DescribeEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEKSContainerInstancesResponse DescribeEKSContainerInstances(DescribeEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEKSContainerInstances", DescribeEKSContainerInstancesResponse.class);
    }

    /**
     *查询边缘容器集群可用的自定义参数
     * @param req DescribeEdgeAvailableExtraArgsRequest
     * @return DescribeEdgeAvailableExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeAvailableExtraArgsResponse DescribeEdgeAvailableExtraArgs(DescribeEdgeAvailableExtraArgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeAvailableExtraArgs", DescribeEdgeAvailableExtraArgsResponse.class);
    }

    /**
     *获取边缘容器CVM实例相关信息
     * @param req DescribeEdgeCVMInstancesRequest
     * @return DescribeEdgeCVMInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeCVMInstancesResponse DescribeEdgeCVMInstances(DescribeEdgeCVMInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeCVMInstances", DescribeEdgeCVMInstancesResponse.class);
    }

    /**
     *查询边缘集群自定义参数
     * @param req DescribeEdgeClusterExtraArgsRequest
     * @return DescribeEdgeClusterExtraArgsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterExtraArgsResponse DescribeEdgeClusterExtraArgs(DescribeEdgeClusterExtraArgsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeClusterExtraArgs", DescribeEdgeClusterExtraArgsResponse.class);
    }

    /**
     *查询边缘计算集群的节点信息
     * @param req DescribeEdgeClusterInstancesRequest
     * @return DescribeEdgeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterInstancesResponse DescribeEdgeClusterInstances(DescribeEdgeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeClusterInstances", DescribeEdgeClusterInstancesResponse.class);
    }

    /**
     *可以查询边缘集群升级信息，包含可以升级的组件，当前升级状态和升级错误信息
     * @param req DescribeEdgeClusterUpgradeInfoRequest
     * @return DescribeEdgeClusterUpgradeInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeClusterUpgradeInfoResponse DescribeEdgeClusterUpgradeInfo(DescribeEdgeClusterUpgradeInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeClusterUpgradeInfo", DescribeEdgeClusterUpgradeInfoResponse.class);
    }

    /**
     *获取事件、审计和日志的状态
     * @param req DescribeEdgeLogSwitchesRequest
     * @return DescribeEdgeLogSwitchesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEdgeLogSwitchesResponse DescribeEdgeLogSwitches(DescribeEdgeLogSwitchesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEdgeLogSwitches", DescribeEdgeLogSwitchesResponse.class);
    }

    /**
     *查询容器实例中容器日志
     * @param req DescribeEksContainerInstanceLogRequest
     * @return DescribeEksContainerInstanceLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEksContainerInstanceLogResponse DescribeEksContainerInstanceLog(DescribeEksContainerInstanceLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEksContainerInstanceLog", DescribeEksContainerInstanceLogResponse.class);
    }

    /**
     *本接口用于查询开启vpc-cni模式的任务进度
     * @param req DescribeEnableVpcCniProgressRequest
     * @return DescribeEnableVpcCniProgressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnableVpcCniProgressResponse DescribeEnableVpcCniProgress(DescribeEnableVpcCniProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnableVpcCniProgress", DescribeEnableVpcCniProgressResponse.class);
    }

    /**
     *查询etcd数据是否进行加密
     * @param req DescribeEncryptionStatusRequest
     * @return DescribeEncryptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEncryptionStatusResponse DescribeEncryptionStatus(DescribeEncryptionStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEncryptionStatus", DescribeEncryptionStatusResponse.class);
    }

    /**
     *查询已经存在的节点，判断是否可以加入集群
     * @param req DescribeExistedInstancesRequest
     * @return DescribeExistedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExistedInstancesResponse DescribeExistedInstances(DescribeExistedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExistedInstances", DescribeExistedInstancesResponse.class);
    }

    /**
     *获取导入第三方集群YAML定义
     * @param req DescribeExternalClusterSpecRequest
     * @return DescribeExternalClusterSpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalClusterSpecResponse DescribeExternalClusterSpec(DescribeExternalClusterSpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalClusterSpec", DescribeExternalClusterSpecResponse.class);
    }

    /**
     *查看开启第三方节点池配置信息
     * @param req DescribeExternalNodeSupportConfigRequest
     * @return DescribeExternalNodeSupportConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExternalNodeSupportConfigResponse DescribeExternalNodeSupportConfig(DescribeExternalNodeSupportConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExternalNodeSupportConfig", DescribeExternalNodeSupportConfigResponse.class);
    }

    /**
     *获取eniipamd组件信息
     * @param req DescribeIPAMDRequest
     * @return DescribeIPAMDResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPAMDResponse DescribeIPAMD(DescribeIPAMDRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeIPAMD", DescribeIPAMDResponse.class);
    }

    /**
     *查询镜像缓存信息接口
     * @param req DescribeImageCachesRequest
     * @return DescribeImageCachesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImageCachesResponse DescribeImageCaches(DescribeImageCachesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImageCaches", DescribeImageCachesResponse.class);
    }

    /**
     *获取镜像信息
     * @param req DescribeImagesRequest
     * @return DescribeImagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeImages", DescribeImagesResponse.class);
    }

    /**
     *查询各个规格的 Pod 的抵扣率
     * @param req DescribePodDeductionRateRequest
     * @return DescribePodDeductionRateResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodDeductionRateResponse DescribePodDeductionRate(DescribePodDeductionRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePodDeductionRate", DescribePodDeductionRateResponse.class);
    }

    /**
     *查询可以用预留券抵扣的 Pod 信息。
     * @param req DescribePodsBySpecRequest
     * @return DescribePodsBySpecResponse
     * @throws TencentCloudSDKException
     */
    public DescribePodsBySpecResponse DescribePodsBySpec(DescribePodsBySpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePodsBySpec", DescribePodsBySpecResponse.class);
    }

    /**
     *包括 Pod 资源统计和绑定的预留券资源统计。
     * @param req DescribePostNodeResourcesRequest
     * @return DescribePostNodeResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostNodeResourcesResponse DescribePostNodeResources(DescribePostNodeResourcesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostNodeResources", DescribePostNodeResourcesResponse.class);
    }

    /**
     *获取关联目标集群的实例列表
     * @param req DescribePrometheusAgentInstancesRequest
     * @return DescribePrometheusAgentInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentInstancesResponse DescribePrometheusAgentInstances(DescribePrometheusAgentInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAgentInstances", DescribePrometheusAgentInstancesResponse.class);
    }

    /**
     *获取被关联集群列表
     * @param req DescribePrometheusAgentsRequest
     * @return DescribePrometheusAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAgentsResponse DescribePrometheusAgents(DescribePrometheusAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAgents", DescribePrometheusAgentsResponse.class);
    }

    /**
     *获取告警历史
     * @param req DescribePrometheusAlertHistoryRequest
     * @return DescribePrometheusAlertHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertHistoryResponse DescribePrometheusAlertHistory(DescribePrometheusAlertHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertHistory", DescribePrometheusAlertHistoryResponse.class);
    }

    /**
     *获取2.0实例告警策略列表
     * @param req DescribePrometheusAlertPolicyRequest
     * @return DescribePrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertPolicyResponse DescribePrometheusAlertPolicy(DescribePrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertPolicy", DescribePrometheusAlertPolicyResponse.class);
    }

    /**
     *获取告警规则列表
     * @param req DescribePrometheusAlertRuleRequest
     * @return DescribePrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusAlertRuleResponse DescribePrometheusAlertRule(DescribePrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusAlertRule", DescribePrometheusAlertRuleResponse.class);
    }

    /**
     *获取TMP实例关联集群列表
     * @param req DescribePrometheusClusterAgentsRequest
     * @return DescribePrometheusClusterAgentsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusClusterAgentsResponse DescribePrometheusClusterAgents(DescribePrometheusClusterAgentsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusClusterAgents", DescribePrometheusClusterAgentsResponse.class);
    }

    /**
     *拉取Prometheus配置
     * @param req DescribePrometheusConfigRequest
     * @return DescribePrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusConfigResponse DescribePrometheusConfig(DescribePrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusConfig", DescribePrometheusConfigResponse.class);
    }

    /**
     *获得实例级别抓取配置
     * @param req DescribePrometheusGlobalConfigRequest
     * @return DescribePrometheusGlobalConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalConfigResponse DescribePrometheusGlobalConfig(DescribePrometheusGlobalConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusGlobalConfig", DescribePrometheusGlobalConfigResponse.class);
    }

    /**
     *查询全局告警通知渠道
     * @param req DescribePrometheusGlobalNotificationRequest
     * @return DescribePrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusGlobalNotificationResponse DescribePrometheusGlobalNotification(DescribePrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusGlobalNotification", DescribePrometheusGlobalNotificationResponse.class);
    }

    /**
     *获取实例详细信息
     * @param req DescribePrometheusInstanceRequest
     * @return DescribePrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceResponse DescribePrometheusInstance(DescribePrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstance", DescribePrometheusInstanceResponse.class);
    }

    /**
     *获取2.0实例初始化任务状态
     * @param req DescribePrometheusInstanceInitStatusRequest
     * @return DescribePrometheusInstanceInitStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstanceInitStatusResponse DescribePrometheusInstanceInitStatus(DescribePrometheusInstanceInitStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstanceInitStatus", DescribePrometheusInstanceInitStatusResponse.class);
    }

    /**
     *获取与云监控融合实例列表
     * @param req DescribePrometheusInstancesOverviewRequest
     * @return DescribePrometheusInstancesOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusInstancesOverviewResponse DescribePrometheusInstancesOverview(DescribePrometheusInstancesOverviewRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusInstancesOverview", DescribePrometheusInstancesOverviewResponse.class);
    }

    /**
     *获取实例列表
     * @param req DescribePrometheusOverviewsRequest
     * @return DescribePrometheusOverviewsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusOverviewsResponse DescribePrometheusOverviews(DescribePrometheusOverviewsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusOverviews", DescribePrometheusOverviewsResponse.class);
    }

    /**
     *获取聚合规则列表，包含关联集群内crd资源创建的record rule
     * @param req DescribePrometheusRecordRulesRequest
     * @return DescribePrometheusRecordRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusRecordRulesResponse DescribePrometheusRecordRules(DescribePrometheusRecordRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusRecordRules", DescribePrometheusRecordRulesResponse.class);
    }

    /**
     *获取targets信息
     * @param req DescribePrometheusTargetsRequest
     * @return DescribePrometheusTargetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTargetsResponse DescribePrometheusTargets(DescribePrometheusTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTargets", DescribePrometheusTargetsResponse.class);
    }

    /**
     *拉取模板列表，默认模板将总是在最前面
     * @param req DescribePrometheusTempRequest
     * @return DescribePrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempResponse DescribePrometheusTemp(DescribePrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTemp", DescribePrometheusTempResponse.class);
    }

    /**
     *获取模板关联实例信息，针对V2版本实例
     * @param req DescribePrometheusTempSyncRequest
     * @return DescribePrometheusTempSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTempSyncResponse DescribePrometheusTempSync(DescribePrometheusTempSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTempSync", DescribePrometheusTempSyncResponse.class);
    }

    /**
     *获取模板同步信息
     * @param req DescribePrometheusTemplateSyncRequest
     * @return DescribePrometheusTemplateSyncResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTemplateSyncResponse DescribePrometheusTemplateSync(DescribePrometheusTemplateSyncRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTemplateSync", DescribePrometheusTemplateSyncResponse.class);
    }

    /**
     *拉取模板列表，默认模板将总是在最前面
     * @param req DescribePrometheusTemplatesRequest
     * @return DescribePrometheusTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribePrometheusTemplatesResponse DescribePrometheusTemplates(DescribePrometheusTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePrometheusTemplates", DescribePrometheusTemplatesResponse.class);
    }

    /**
     *预留实例用量查询
     * @param req DescribeRIUtilizationDetailRequest
     * @return DescribeRIUtilizationDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRIUtilizationDetailResponse DescribeRIUtilizationDetail(DescribeRIUtilizationDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRIUtilizationDetail", DescribeRIUtilizationDetailResponse.class);
    }

    /**
     *获取容器服务支持的所有地域
     * @param req DescribeRegionsRequest
     * @return DescribeRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRegionsResponse DescribeRegions(DescribeRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRegions", DescribeRegionsResponse.class);
    }

    /**
     *查询预留实例列表
     * @param req DescribeReservedInstancesRequest
     * @return DescribeReservedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeReservedInstancesResponse DescribeReservedInstances(DescribeReservedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeReservedInstances", DescribeReservedInstancesResponse.class);
    }

    /**
     *获取集群资源使用量
     * @param req DescribeResourceUsageRequest
     * @return DescribeResourceUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageResponse DescribeResourceUsage(DescribeResourceUsageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceUsage", DescribeResourceUsageResponse.class);
    }

    /**
     *查询路由表冲突列表
     * @param req DescribeRouteTableConflictsRequest
     * @return DescribeRouteTableConflictsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTableConflictsResponse DescribeRouteTableConflicts(DescribeRouteTableConflictsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRouteTableConflicts", DescribeRouteTableConflictsResponse.class);
    }

    /**
     *获取边缘计算集群的认证信息
     * @param req DescribeTKEEdgeClusterCredentialRequest
     * @return DescribeTKEEdgeClusterCredentialResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterCredentialResponse DescribeTKEEdgeClusterCredential(DescribeTKEEdgeClusterCredentialRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeClusterCredential", DescribeTKEEdgeClusterCredentialResponse.class);
    }

    /**
     *获取边缘计算集群的当前状态以及过程信息
     * @param req DescribeTKEEdgeClusterStatusRequest
     * @return DescribeTKEEdgeClusterStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClusterStatusResponse DescribeTKEEdgeClusterStatus(DescribeTKEEdgeClusterStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeClusterStatus", DescribeTKEEdgeClusterStatusResponse.class);
    }

    /**
     *查询边缘集群列表
     * @param req DescribeTKEEdgeClustersRequest
     * @return DescribeTKEEdgeClustersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeClustersResponse DescribeTKEEdgeClusters(DescribeTKEEdgeClustersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeClusters", DescribeTKEEdgeClustersResponse.class);
    }

    /**
     *获取边缘计算外部访问的kubeconfig
     * @param req DescribeTKEEdgeExternalKubeconfigRequest
     * @return DescribeTKEEdgeExternalKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeExternalKubeconfigResponse DescribeTKEEdgeExternalKubeconfig(DescribeTKEEdgeExternalKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeExternalKubeconfig", DescribeTKEEdgeExternalKubeconfigResponse.class);
    }

    /**
     *获取边缘脚本链接，此接口用于添加第三方节点，通过下载脚本从而将节点添加到边缘集群。
     * @param req DescribeTKEEdgeScriptRequest
     * @return DescribeTKEEdgeScriptResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTKEEdgeScriptResponse DescribeTKEEdgeScript(DescribeTKEEdgeScriptRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTKEEdgeScript", DescribeTKEEdgeScriptResponse.class);
    }

    /**
     *获取集群版本信息
     * @param req DescribeVersionsRequest
     * @return DescribeVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVersionsResponse DescribeVersions(DescribeVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVersions", DescribeVersionsResponse.class);
    }

    /**
     *本接口查询当前用户和地域在指定可用区下的机型可支持的最大 TKE VPC-CNI 网络模式的 Pod 数量
     * @param req DescribeVpcCniPodLimitsRequest
     * @return DescribeVpcCniPodLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcCniPodLimitsResponse DescribeVpcCniPodLimits(DescribeVpcCniPodLimitsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcCniPodLimits", DescribeVpcCniPodLimitsResponse.class);
    }

    /**
     *关闭集群审计
     * @param req DisableClusterAuditRequest
     * @return DisableClusterAuditResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterAuditResponse DisableClusterAudit(DisableClusterAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableClusterAudit", DisableClusterAuditResponse.class);
    }

    /**
     *关闭集群删除保护
     * @param req DisableClusterDeletionProtectionRequest
     * @return DisableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableClusterDeletionProtectionResponse DisableClusterDeletionProtection(DisableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableClusterDeletionProtection", DisableClusterDeletionProtectionResponse.class);
    }

    /**
     *关闭加密信息保护
     * @param req DisableEncryptionProtectionRequest
     * @return DisableEncryptionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DisableEncryptionProtectionResponse DisableEncryptionProtection(DisableEncryptionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableEncryptionProtection", DisableEncryptionProtectionResponse.class);
    }

    /**
     *关闭事件持久化功能
     * @param req DisableEventPersistenceRequest
     * @return DisableEventPersistenceResponse
     * @throws TencentCloudSDKException
     */
    public DisableEventPersistenceResponse DisableEventPersistence(DisableEventPersistenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableEventPersistence", DisableEventPersistenceResponse.class);
    }

    /**
     *提供给附加了VPC-CNI能力的Global-Route集群关闭VPC-CNI
     * @param req DisableVpcCniNetworkTypeRequest
     * @return DisableVpcCniNetworkTypeResponse
     * @throws TencentCloudSDKException
     */
    public DisableVpcCniNetworkTypeResponse DisableVpcCniNetworkType(DisableVpcCniNetworkTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DisableVpcCniNetworkType", DisableVpcCniNetworkTypeResponse.class);
    }

    /**
     *驱逐超级节点
     * @param req DrainClusterVirtualNodeRequest
     * @return DrainClusterVirtualNodeResponse
     * @throws TencentCloudSDKException
     */
    public DrainClusterVirtualNodeResponse DrainClusterVirtualNode(DrainClusterVirtualNodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DrainClusterVirtualNode", DrainClusterVirtualNodeResponse.class);
    }

    /**
     *开启集群审计
     * @param req EnableClusterAuditRequest
     * @return EnableClusterAuditResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterAuditResponse EnableClusterAudit(EnableClusterAuditRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableClusterAudit", EnableClusterAuditResponse.class);
    }

    /**
     *启用集群删除保护
     * @param req EnableClusterDeletionProtectionRequest
     * @return EnableClusterDeletionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableClusterDeletionProtectionResponse EnableClusterDeletionProtection(EnableClusterDeletionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableClusterDeletionProtection", EnableClusterDeletionProtectionResponse.class);
    }

    /**
     *开启加密数据保护
     * @param req EnableEncryptionProtectionRequest
     * @return EnableEncryptionProtectionResponse
     * @throws TencentCloudSDKException
     */
    public EnableEncryptionProtectionResponse EnableEncryptionProtection(EnableEncryptionProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableEncryptionProtection", EnableEncryptionProtectionResponse.class);
    }

    /**
     *开启事件持久化功能
     * @param req EnableEventPersistenceRequest
     * @return EnableEventPersistenceResponse
     * @throws TencentCloudSDKException
     */
    public EnableEventPersistenceResponse EnableEventPersistence(EnableEventPersistenceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableEventPersistence", EnableEventPersistenceResponse.class);
    }

    /**
     *GR集群可以通过本接口附加vpc-cni容器网络插件，开启vpc-cni容器网络能力
     * @param req EnableVpcCniNetworkTypeRequest
     * @return EnableVpcCniNetworkTypeResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpcCniNetworkTypeResponse EnableVpcCniNetworkType(EnableVpcCniNetworkTypeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EnableVpcCniNetworkType", EnableVpcCniNetworkTypeResponse.class);
    }

    /**
     *操作TKE集群的addon
     * @param req ForwardApplicationRequestV3Request
     * @return ForwardApplicationRequestV3Response
     * @throws TencentCloudSDKException
     */
    public ForwardApplicationRequestV3Response ForwardApplicationRequestV3(ForwardApplicationRequestV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForwardApplicationRequestV3", ForwardApplicationRequestV3Response.class);
    }

    /**
     *操作TKEEdge集群的addon
     * @param req ForwardTKEEdgeApplicationRequestV3Request
     * @return ForwardTKEEdgeApplicationRequestV3Response
     * @throws TencentCloudSDKException
     */
    public ForwardTKEEdgeApplicationRequestV3Response ForwardTKEEdgeApplicationRequestV3(ForwardTKEEdgeApplicationRequestV3Request req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ForwardTKEEdgeApplicationRequestV3", ForwardTKEEdgeApplicationRequestV3Response.class);
    }

    /**
     *获取集群规模价格
     * @param req GetClusterLevelPriceRequest
     * @return GetClusterLevelPriceResponse
     * @throws TencentCloudSDKException
     */
    public GetClusterLevelPriceResponse GetClusterLevelPrice(GetClusterLevelPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetClusterLevelPrice", GetClusterLevelPriceResponse.class);
    }

    /**
     *根据镜像列表，查询匹配的镜像缓存
     * @param req GetMostSuitableImageCacheRequest
     * @return GetMostSuitableImageCacheResponse
     * @throws TencentCloudSDKException
     */
    public GetMostSuitableImageCacheResponse GetMostSuitableImageCache(GetMostSuitableImageCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMostSuitableImageCache", GetMostSuitableImageCacheResponse.class);
    }

    /**
     *获取TKE支持的App列表
     * @param req GetTkeAppChartListRequest
     * @return GetTkeAppChartListResponse
     * @throws TencentCloudSDKException
     */
    public GetTkeAppChartListResponse GetTkeAppChartList(GetTkeAppChartListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetTkeAppChartList", GetTkeAppChartListResponse.class);
    }

    /**
     *获得节点升级当前的进度
     * @param req GetUpgradeInstanceProgressRequest
     * @return GetUpgradeInstanceProgressResponse
     * @throws TencentCloudSDKException
     */
    public GetUpgradeInstanceProgressResponse GetUpgradeInstanceProgress(GetUpgradeInstanceProgressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetUpgradeInstanceProgress", GetUpgradeInstanceProgressResponse.class);
    }

    /**
     *为目标集群安装一个addon
     * @param req InstallAddonRequest
     * @return InstallAddonResponse
     * @throws TencentCloudSDKException
     */
    public InstallAddonResponse InstallAddon(InstallAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallAddon", InstallAddonResponse.class);
    }

    /**
     *在tke@edge集群的边缘节点上安装日志采集组件
     * @param req InstallEdgeLogAgentRequest
     * @return InstallEdgeLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallEdgeLogAgentResponse InstallEdgeLogAgent(InstallEdgeLogAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallEdgeLogAgent", InstallEdgeLogAgentResponse.class);
    }

    /**
     *在TKE集群中安装CLS日志采集组件
     * @param req InstallLogAgentRequest
     * @return InstallLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public InstallLogAgentResponse InstallLogAgent(InstallLogAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "InstallLogAgent", InstallLogAgentResponse.class);
    }

    /**
     *查询指定集群的巡检结果信息
     * @param req ListClusterInspectionResultsRequest
     * @return ListClusterInspectionResultsResponse
     * @throws TencentCloudSDKException
     */
    public ListClusterInspectionResultsResponse ListClusterInspectionResults(ListClusterInspectionResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListClusterInspectionResults", ListClusterInspectionResultsResponse.class);
    }

    /**
     *查询集群巡检结果历史列表
     * @param req ListClusterInspectionResultsItemsRequest
     * @return ListClusterInspectionResultsItemsResponse
     * @throws TencentCloudSDKException
     */
    public ListClusterInspectionResultsItemsResponse ListClusterInspectionResultsItems(ListClusterInspectionResultsItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListClusterInspectionResultsItems", ListClusterInspectionResultsItemsResponse.class);
    }

    /**
     *修改集群伸缩组属性
     * @param req ModifyClusterAsGroupAttributeRequest
     * @return ModifyClusterAsGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupAttributeResponse ModifyClusterAsGroupAttribute(ModifyClusterAsGroupAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAsGroupAttribute", ModifyClusterAsGroupAttributeResponse.class);
    }

    /**
     *修改集群弹性伸缩属性
     * @param req ModifyClusterAsGroupOptionAttributeRequest
     * @return ModifyClusterAsGroupOptionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAsGroupOptionAttributeResponse ModifyClusterAsGroupOptionAttribute(ModifyClusterAsGroupOptionAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAsGroupOptionAttribute", ModifyClusterAsGroupOptionAttributeResponse.class);
    }

    /**
     *修改集群属性
     * @param req ModifyClusterAttributeRequest
     * @return ModifyClusterAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAttributeResponse ModifyClusterAttribute(ModifyClusterAttributeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAttribute", ModifyClusterAttributeResponse.class);
    }

    /**
     *修改集群认证配置
     * @param req ModifyClusterAuthenticationOptionsRequest
     * @return ModifyClusterAuthenticationOptionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterAuthenticationOptionsResponse ModifyClusterAuthenticationOptions(ModifyClusterAuthenticationOptionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterAuthenticationOptions", ModifyClusterAuthenticationOptionsResponse.class);
    }

    /**
     *修改托管集群外网端口的安全策略（老的方式，仅支持托管集群外网端口）
     * @param req ModifyClusterEndpointSPRequest
     * @return ModifyClusterEndpointSPResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterEndpointSPResponse ModifyClusterEndpointSP(ModifyClusterEndpointSPRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterEndpointSP", ModifyClusterEndpointSPResponse.class);
    }

    /**
     *编辑节点池
     * @param req ModifyClusterNodePoolRequest
     * @return ModifyClusterNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterNodePoolResponse ModifyClusterNodePool(ModifyClusterNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterNodePool", ModifyClusterNodePoolResponse.class);
    }

    /**
     *修改超级节点池
     * @param req ModifyClusterVirtualNodePoolRequest
     * @return ModifyClusterVirtualNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClusterVirtualNodePoolResponse ModifyClusterVirtualNodePool(ModifyClusterVirtualNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClusterVirtualNodePool", ModifyClusterVirtualNodePoolResponse.class);
    }

    /**
     *修改节点池关联伸缩组的期望实例数
     * @param req ModifyNodePoolDesiredCapacityAboutAsgRequest
     * @return ModifyNodePoolDesiredCapacityAboutAsgResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolDesiredCapacityAboutAsgResponse ModifyNodePoolDesiredCapacityAboutAsg(ModifyNodePoolDesiredCapacityAboutAsgRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodePoolDesiredCapacityAboutAsg", ModifyNodePoolDesiredCapacityAboutAsgResponse.class);
    }

    /**
     *修改节点池的机型配置
     * @param req ModifyNodePoolInstanceTypesRequest
     * @return ModifyNodePoolInstanceTypesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNodePoolInstanceTypesResponse ModifyNodePoolInstanceTypes(ModifyNodePoolInstanceTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNodePoolInstanceTypes", ModifyNodePoolInstanceTypesResponse.class);
    }

    /**
     *修改被关联集群的external labels
     * @param req ModifyPrometheusAgentExternalLabelsRequest
     * @return ModifyPrometheusAgentExternalLabelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAgentExternalLabelsResponse ModifyPrometheusAgentExternalLabels(ModifyPrometheusAgentExternalLabelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAgentExternalLabels", ModifyPrometheusAgentExternalLabelsResponse.class);
    }

    /**
     *修改2.0实例告警策略
     * @param req ModifyPrometheusAlertPolicyRequest
     * @return ModifyPrometheusAlertPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertPolicyResponse ModifyPrometheusAlertPolicy(ModifyPrometheusAlertPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAlertPolicy", ModifyPrometheusAlertPolicyResponse.class);
    }

    /**
     *修改告警规则
     * @param req ModifyPrometheusAlertRuleRequest
     * @return ModifyPrometheusAlertRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusAlertRuleResponse ModifyPrometheusAlertRule(ModifyPrometheusAlertRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusAlertRule", ModifyPrometheusAlertRuleResponse.class);
    }

    /**
     *修改prometheus配置，如果配置项不存在，则会新增
     * @param req ModifyPrometheusConfigRequest
     * @return ModifyPrometheusConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusConfigResponse ModifyPrometheusConfig(ModifyPrometheusConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusConfig", ModifyPrometheusConfigResponse.class);
    }

    /**
     *修改全局告警通知渠道
     * @param req ModifyPrometheusGlobalNotificationRequest
     * @return ModifyPrometheusGlobalNotificationResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusGlobalNotificationResponse ModifyPrometheusGlobalNotification(ModifyPrometheusGlobalNotificationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusGlobalNotification", ModifyPrometheusGlobalNotificationResponse.class);
    }

    /**
     *通过yaml的方式修改Prometheus聚合实例
     * @param req ModifyPrometheusRecordRuleYamlRequest
     * @return ModifyPrometheusRecordRuleYamlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusRecordRuleYamlResponse ModifyPrometheusRecordRuleYaml(ModifyPrometheusRecordRuleYamlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusRecordRuleYaml", ModifyPrometheusRecordRuleYamlResponse.class);
    }

    /**
     *修改模板内容
     * @param req ModifyPrometheusTempRequest
     * @return ModifyPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTempResponse ModifyPrometheusTemp(ModifyPrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusTemp", ModifyPrometheusTempResponse.class);
    }

    /**
     *修改模板内容
     * @param req ModifyPrometheusTemplateRequest
     * @return ModifyPrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrometheusTemplateResponse ModifyPrometheusTemplate(ModifyPrometheusTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPrometheusTemplate", ModifyPrometheusTemplateResponse.class);
    }

    /**
     *修改预留券的抵扣范围，抵扣范围取值：Region、Zone 和 Node。
     * @param req ModifyReservedInstanceScopeRequest
     * @return ModifyReservedInstanceScopeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyReservedInstanceScopeResponse ModifyReservedInstanceScope(ModifyReservedInstanceScopeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyReservedInstanceScope", ModifyReservedInstanceScopeResponse.class);
    }

    /**
     *移出节点池节点，但保留在集群内
     * @param req RemoveNodeFromNodePoolRequest
     * @return RemoveNodeFromNodePoolResponse
     * @throws TencentCloudSDKException
     */
    public RemoveNodeFromNodePoolResponse RemoveNodeFromNodePool(RemoveNodeFromNodePoolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RemoveNodeFromNodePool", RemoveNodeFromNodePoolResponse.class);
    }

    /**
     *续费时请确保账户余额充足。
     * @param req RenewReservedInstancesRequest
     * @return RenewReservedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RenewReservedInstancesResponse RenewReservedInstances(RenewReservedInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewReservedInstances", RenewReservedInstancesResponse.class);
    }

    /**
     *重启弹性容器实例，支持批量操作
     * @param req RestartEKSContainerInstancesRequest
     * @return RestartEKSContainerInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RestartEKSContainerInstancesResponse RestartEKSContainerInstances(RestartEKSContainerInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartEKSContainerInstances", RestartEKSContainerInstancesResponse.class);
    }

    /**
     *在应用市场中集群回滚应用至某个历史版本
     * @param req RollbackClusterReleaseRequest
     * @return RollbackClusterReleaseResponse
     * @throws TencentCloudSDKException
     */
    public RollbackClusterReleaseResponse RollbackClusterRelease(RollbackClusterReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollbackClusterRelease", RollbackClusterReleaseResponse.class);
    }

    /**
     *初始化TMP实例，开启集成中心时调用
     * @param req RunPrometheusInstanceRequest
     * @return RunPrometheusInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RunPrometheusInstanceResponse RunPrometheusInstance(RunPrometheusInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunPrometheusInstance", RunPrometheusInstanceResponse.class);
    }

    /**
     *缩容独立集群master节点
     * @param req ScaleInClusterMasterRequest
     * @return ScaleInClusterMasterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleInClusterMasterResponse ScaleInClusterMaster(ScaleInClusterMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleInClusterMaster", ScaleInClusterMasterResponse.class);
    }

    /**
     *扩容独立集群master节点
     * @param req ScaleOutClusterMasterRequest
     * @return ScaleOutClusterMasterResponse
     * @throws TencentCloudSDKException
     */
    public ScaleOutClusterMasterResponse ScaleOutClusterMaster(ScaleOutClusterMasterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ScaleOutClusterMaster", ScaleOutClusterMasterResponse.class);
    }

    /**
     *仅能设置节点池中处于伸缩组的节点
     * @param req SetNodePoolNodeProtectionRequest
     * @return SetNodePoolNodeProtectionResponse
     * @throws TencentCloudSDKException
     */
    public SetNodePoolNodeProtectionResponse SetNodePoolNodeProtection(SetNodePoolNodeProtectionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNodePoolNodeProtection", SetNodePoolNodeProtectionResponse.class);
    }

    /**
     *同步模板到实例或者集群，针对V2版本实例
     * @param req SyncPrometheusTempRequest
     * @return SyncPrometheusTempResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTempResponse SyncPrometheusTemp(SyncPrometheusTempRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncPrometheusTemp", SyncPrometheusTempResponse.class);
    }

    /**
     *同步模板到实例或者集群
     * @param req SyncPrometheusTemplateRequest
     * @return SyncPrometheusTemplateResponse
     * @throws TencentCloudSDKException
     */
    public SyncPrometheusTemplateResponse SyncPrometheusTemplate(SyncPrometheusTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SyncPrometheusTemplate", SyncPrometheusTemplateResponse.class);
    }

    /**
     *在应用市场中集群删除某个应用
     * @param req UninstallClusterReleaseRequest
     * @return UninstallClusterReleaseResponse
     * @throws TencentCloudSDKException
     */
    public UninstallClusterReleaseResponse UninstallClusterRelease(UninstallClusterReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallClusterRelease", UninstallClusterReleaseResponse.class);
    }

    /**
     *从tke@edge集群边缘节点上卸载日志采集组件
     * @param req UninstallEdgeLogAgentRequest
     * @return UninstallEdgeLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallEdgeLogAgentResponse UninstallEdgeLogAgent(UninstallEdgeLogAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallEdgeLogAgent", UninstallEdgeLogAgentResponse.class);
    }

    /**
     *从TKE集群中卸载CLS日志采集组件
     * @param req UninstallLogAgentRequest
     * @return UninstallLogAgentResponse
     * @throws TencentCloudSDKException
     */
    public UninstallLogAgentResponse UninstallLogAgent(UninstallLogAgentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UninstallLogAgent", UninstallLogAgentResponse.class);
    }

    /**
     *更新一个addon的参数和版本
     * @param req UpdateAddonRequest
     * @return UpdateAddonResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAddonResponse UpdateAddon(UpdateAddonRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAddon", UpdateAddonResponse.class);
    }

    /**
     *对集群的Kubeconfig信息进行更新
     * @param req UpdateClusterKubeconfigRequest
     * @return UpdateClusterKubeconfigResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterKubeconfigResponse UpdateClusterKubeconfig(UpdateClusterKubeconfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateClusterKubeconfig", UpdateClusterKubeconfigResponse.class);
    }

    /**
     *升级集群 Master 组件到指定版本
     * @param req UpdateClusterVersionRequest
     * @return UpdateClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateClusterVersionResponse UpdateClusterVersion(UpdateClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateClusterVersion", UpdateClusterVersionResponse.class);
    }

    /**
     *修改弹性集群名称等属性 
     * @param req UpdateEKSClusterRequest
     * @return UpdateEKSClusterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEKSClusterResponse UpdateEKSCluster(UpdateEKSClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEKSCluster", UpdateEKSClusterResponse.class);
    }

    /**
     *更新容器实例
     * @param req UpdateEKSContainerInstanceRequest
     * @return UpdateEKSContainerInstanceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEKSContainerInstanceResponse UpdateEKSContainerInstance(UpdateEKSContainerInstanceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEKSContainerInstance", UpdateEKSContainerInstanceResponse.class);
    }

    /**
     *升级边缘集群组件到指定版本，此版本为TKEEdge专用版本。
     * @param req UpdateEdgeClusterVersionRequest
     * @return UpdateEdgeClusterVersionResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEdgeClusterVersionResponse UpdateEdgeClusterVersion(UpdateEdgeClusterVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEdgeClusterVersion", UpdateEdgeClusterVersionResponse.class);
    }

    /**
     *更新镜像缓存接口
     * @param req UpdateImageCacheRequest
     * @return UpdateImageCacheResponse
     * @throws TencentCloudSDKException
     */
    public UpdateImageCacheResponse UpdateImageCache(UpdateImageCacheRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateImageCache", UpdateImageCacheResponse.class);
    }

    /**
     *修改边缘计算集群名称等属性
     * @param req UpdateTKEEdgeClusterRequest
     * @return UpdateTKEEdgeClusterResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTKEEdgeClusterResponse UpdateTKEEdgeCluster(UpdateTKEEdgeClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTKEEdgeCluster", UpdateTKEEdgeClusterResponse.class);
    }

    /**
     *给集群的一批work节点进行升级
     * @param req UpgradeClusterInstancesRequest
     * @return UpgradeClusterInstancesResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterInstancesResponse UpgradeClusterInstances(UpgradeClusterInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeClusterInstances", UpgradeClusterInstancesResponse.class);
    }

    /**
     *升级集群中已安装的应用
     * @param req UpgradeClusterReleaseRequest
     * @return UpgradeClusterReleaseResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeClusterReleaseResponse UpgradeClusterRelease(UpgradeClusterReleaseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeClusterRelease", UpgradeClusterReleaseResponse.class);
    }

}
