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
package com.tencentcloudapi.tse.v20201207;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tse.v20201207.models.*;

public class TseClient extends AbstractClient{
    private static String endpoint = "tse.tencentcloudapi.com";
    private static String service = "tse";
    private static String version = "2020-12-07";
    
    public TseClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TseClient(Credential credential, String region, ClientProfile profile) {
        super(TseClient.endpoint, TseClient.version, credential, region, profile);
    }

    /**
     *创建云原生API网关实例
     * @param req CreateCloudNativeAPIGatewayRequest
     * @return CreateCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayResponse CreateCloudNativeAPIGateway(CreateCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGateway", CreateCloudNativeAPIGatewayResponse.class);
    }

    /**
     *创建云原生网关的灰度规则
     * @param req CreateCloudNativeAPIGatewayCanaryRuleRequest
     * @return CreateCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCanaryRuleResponse CreateCloudNativeAPIGatewayCanaryRule(CreateCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayCanaryRule", CreateCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *创建云原生网关证书
     * @param req CreateCloudNativeAPIGatewayCertificateRequest
     * @return CreateCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCertificateResponse CreateCloudNativeAPIGatewayCertificate(CreateCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayCertificate", CreateCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *创建云原生网关路由
     * @param req CreateCloudNativeAPIGatewayRouteRequest
     * @return CreateCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteResponse CreateCloudNativeAPIGatewayRoute(CreateCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayRoute", CreateCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *创建云原生网关限流插件(路由)
     * @param req CreateCloudNativeAPIGatewayRouteRateLimitRequest
     * @return CreateCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteRateLimitResponse CreateCloudNativeAPIGatewayRouteRateLimit(CreateCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayRouteRateLimit", CreateCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *创建云原生网关服务
     * @param req CreateCloudNativeAPIGatewayServiceRequest
     * @return CreateCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceResponse CreateCloudNativeAPIGatewayService(CreateCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayService", CreateCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *创建云原生网关限流插件(服务)
     * @param req CreateCloudNativeAPIGatewayServiceRateLimitRequest
     * @return CreateCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceRateLimitResponse CreateCloudNativeAPIGatewayServiceRateLimit(CreateCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudNativeAPIGatewayServiceRateLimit", CreateCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *创建引擎实例
     * @param req CreateEngineRequest
     * @return CreateEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateEngineResponse CreateEngine(CreateEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEngine", CreateEngineResponse.class);
    }

    /**
     *创建云原生网关引擎分组
     * @param req CreateNativeGatewayServerGroupRequest
     * @return CreateNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateNativeGatewayServerGroupResponse CreateNativeGatewayServerGroup(CreateNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNativeGatewayServerGroup", CreateNativeGatewayServerGroupResponse.class);
    }

    /**
     *删除云原生API网关实例
     * @param req DeleteCloudNativeAPIGatewayRequest
     * @return DeleteCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayResponse DeleteCloudNativeAPIGateway(DeleteCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGateway", DeleteCloudNativeAPIGatewayResponse.class);
    }

    /**
     *删除云原生网关的灰度规则
     * @param req DeleteCloudNativeAPIGatewayCanaryRuleRequest
     * @return DeleteCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCanaryRuleResponse DeleteCloudNativeAPIGatewayCanaryRule(DeleteCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCanaryRule", DeleteCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *删除云原生网关证书
     * @param req DeleteCloudNativeAPIGatewayCertificateRequest
     * @return DeleteCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCertificateResponse DeleteCloudNativeAPIGatewayCertificate(DeleteCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayCertificate", DeleteCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *删除云原生网关路由
     * @param req DeleteCloudNativeAPIGatewayRouteRequest
     * @return DeleteCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteResponse DeleteCloudNativeAPIGatewayRoute(DeleteCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayRoute", DeleteCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *删除云原生网关的限流插件(路由)
     * @param req DeleteCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteRateLimitResponse DeleteCloudNativeAPIGatewayRouteRateLimit(DeleteCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayRouteRateLimit", DeleteCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *删除云原生网关服务
     * @param req DeleteCloudNativeAPIGatewayServiceRequest
     * @return DeleteCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceResponse DeleteCloudNativeAPIGatewayService(DeleteCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayService", DeleteCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *删除云原生网关的限流插件(服务)
     * @param req DeleteCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceRateLimitResponse DeleteCloudNativeAPIGatewayServiceRateLimit(DeleteCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudNativeAPIGatewayServiceRateLimit", DeleteCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *删除引擎实例
     * @param req DeleteEngineRequest
     * @return DeleteEngineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEngineResponse DeleteEngine(DeleteEngineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEngine", DeleteEngineResponse.class);
    }

    /**
     *删除网关实例分组
     * @param req DeleteNativeGatewayServerGroupRequest
     * @return DeleteNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNativeGatewayServerGroupResponse DeleteNativeGatewayServerGroup(DeleteNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNativeGatewayServerGroup", DeleteNativeGatewayServerGroupResponse.class);
    }

    /**
     *获取云原生API网关实例信息
     * @param req DescribeCloudNativeAPIGatewayRequest
     * @return DescribeCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayResponse DescribeCloudNativeAPIGateway(DescribeCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGateway", DescribeCloudNativeAPIGatewayResponse.class);
    }

    /**
     *查询云原生网关灰度规则列表
     * @param req DescribeCloudNativeAPIGatewayCanaryRulesRequest
     * @return DescribeCloudNativeAPIGatewayCanaryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCanaryRulesResponse DescribeCloudNativeAPIGatewayCanaryRules(DescribeCloudNativeAPIGatewayCanaryRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCanaryRules", DescribeCloudNativeAPIGatewayCanaryRulesResponse.class);
    }

    /**
     *查询云原生网关单个证书详情
     * @param req DescribeCloudNativeAPIGatewayCertificateDetailsRequest
     * @return DescribeCloudNativeAPIGatewayCertificateDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCertificateDetailsResponse DescribeCloudNativeAPIGatewayCertificateDetails(DescribeCloudNativeAPIGatewayCertificateDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCertificateDetails", DescribeCloudNativeAPIGatewayCertificateDetailsResponse.class);
    }

    /**
     *查询云原生网关证书列表
     * @param req DescribeCloudNativeAPIGatewayCertificatesRequest
     * @return DescribeCloudNativeAPIGatewayCertificatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCertificatesResponse DescribeCloudNativeAPIGatewayCertificates(DescribeCloudNativeAPIGatewayCertificatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayCertificates", DescribeCloudNativeAPIGatewayCertificatesResponse.class);
    }

    /**
     *获取云原生API网关实例网络配置信息
     * @param req DescribeCloudNativeAPIGatewayConfigRequest
     * @return DescribeCloudNativeAPIGatewayConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayConfigResponse DescribeCloudNativeAPIGatewayConfig(DescribeCloudNativeAPIGatewayConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayConfig", DescribeCloudNativeAPIGatewayConfigResponse.class);
    }

    /**
     *获取云原生网关节点列表
     * @param req DescribeCloudNativeAPIGatewayNodesRequest
     * @return DescribeCloudNativeAPIGatewayNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayNodesResponse DescribeCloudNativeAPIGatewayNodes(DescribeCloudNativeAPIGatewayNodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayNodes", DescribeCloudNativeAPIGatewayNodesResponse.class);
    }

    /**
     *获取云原生API网关实例端口信息
     * @param req DescribeCloudNativeAPIGatewayPortsRequest
     * @return DescribeCloudNativeAPIGatewayPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayPortsResponse DescribeCloudNativeAPIGatewayPorts(DescribeCloudNativeAPIGatewayPortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayPorts", DescribeCloudNativeAPIGatewayPortsResponse.class);
    }

    /**
     *查询云原生网关的限流插件(路由)
     * @param req DescribeCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRouteRateLimitResponse DescribeCloudNativeAPIGatewayRouteRateLimit(DescribeCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayRouteRateLimit", DescribeCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *查询云原生网关路由列表
     * @param req DescribeCloudNativeAPIGatewayRoutesRequest
     * @return DescribeCloudNativeAPIGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRoutesResponse DescribeCloudNativeAPIGatewayRoutes(DescribeCloudNativeAPIGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayRoutes", DescribeCloudNativeAPIGatewayRoutesResponse.class);
    }

    /**
     *查询云原生网关的限流插件(服务)
     * @param req DescribeCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServiceRateLimitResponse DescribeCloudNativeAPIGatewayServiceRateLimit(DescribeCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServiceRateLimit", DescribeCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *查询云原生网关服务列表
     * @param req DescribeCloudNativeAPIGatewayServicesRequest
     * @return DescribeCloudNativeAPIGatewayServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServicesResponse DescribeCloudNativeAPIGatewayServices(DescribeCloudNativeAPIGatewayServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGatewayServices", DescribeCloudNativeAPIGatewayServicesResponse.class);
    }

    /**
     *获取云原生API网关实例列表
     * @param req DescribeCloudNativeAPIGatewaysRequest
     * @return DescribeCloudNativeAPIGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewaysResponse DescribeCloudNativeAPIGateways(DescribeCloudNativeAPIGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudNativeAPIGateways", DescribeCloudNativeAPIGatewaysResponse.class);
    }

    /**
     *查询Nacos类型引擎实例副本信息
     * @param req DescribeNacosReplicasRequest
     * @return DescribeNacosReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosReplicasResponse DescribeNacosReplicas(DescribeNacosReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNacosReplicas", DescribeNacosReplicasResponse.class);
    }

    /**
     *查询nacos服务接口列表
     * @param req DescribeNacosServerInterfacesRequest
     * @return DescribeNacosServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosServerInterfacesResponse DescribeNacosServerInterfaces(DescribeNacosServerInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNacosServerInterfaces", DescribeNacosServerInterfacesResponse.class);
    }

    /**
     *查询云原生网关分组信息
     * @param req DescribeNativeGatewayServerGroupsRequest
     * @return DescribeNativeGatewayServerGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNativeGatewayServerGroupsResponse DescribeNativeGatewayServerGroups(DescribeNativeGatewayServerGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNativeGatewayServerGroups", DescribeNativeGatewayServerGroupsResponse.class);
    }

    /**
     *获取云原生网关服务详情
     * @param req DescribeOneCloudNativeAPIGatewayServiceRequest
     * @return DescribeOneCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOneCloudNativeAPIGatewayServiceResponse DescribeOneCloudNativeAPIGatewayService(DescribeOneCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOneCloudNativeAPIGatewayService", DescribeOneCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *查询引擎实例访问地址
     * @param req DescribeSREInstanceAccessAddressRequest
     * @return DescribeSREInstanceAccessAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstanceAccessAddressResponse DescribeSREInstanceAccessAddress(DescribeSREInstanceAccessAddressRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSREInstanceAccessAddress", DescribeSREInstanceAccessAddressResponse.class);
    }

    /**
     *用于查询引擎实例列表
     * @param req DescribeSREInstancesRequest
     * @return DescribeSREInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstancesResponse DescribeSREInstances(DescribeSREInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSREInstances", DescribeSREInstancesResponse.class);
    }

    /**
     *查询Zookeeper类型注册引擎实例副本信息
     * @param req DescribeZookeeperReplicasRequest
     * @return DescribeZookeeperReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperReplicasResponse DescribeZookeeperReplicas(DescribeZookeeperReplicasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZookeeperReplicas", DescribeZookeeperReplicasResponse.class);
    }

    /**
     *查询zookeeper服务接口列表
     * @param req DescribeZookeeperServerInterfacesRequest
     * @return DescribeZookeeperServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperServerInterfacesResponse DescribeZookeeperServerInterfaces(DescribeZookeeperServerInterfacesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeZookeeperServerInterfaces", DescribeZookeeperServerInterfacesResponse.class);
    }

    /**
     *修改云原生API网关实例基础信息
     * @param req ModifyCloudNativeAPIGatewayRequest
     * @return ModifyCloudNativeAPIGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayResponse ModifyCloudNativeAPIGateway(ModifyCloudNativeAPIGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGateway", ModifyCloudNativeAPIGatewayResponse.class);
    }

    /**
     *修改云原生网关的灰度规则
     * @param req ModifyCloudNativeAPIGatewayCanaryRuleRequest
     * @return ModifyCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCanaryRuleResponse ModifyCloudNativeAPIGatewayCanaryRule(ModifyCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayCanaryRule", ModifyCloudNativeAPIGatewayCanaryRuleResponse.class);
    }

    /**
     *更新云原生网关证书
     * @param req ModifyCloudNativeAPIGatewayCertificateRequest
     * @return ModifyCloudNativeAPIGatewayCertificateResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCertificateResponse ModifyCloudNativeAPIGatewayCertificate(ModifyCloudNativeAPIGatewayCertificateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayCertificate", ModifyCloudNativeAPIGatewayCertificateResponse.class);
    }

    /**
     *修改云原生网关路由
     * @param req ModifyCloudNativeAPIGatewayRouteRequest
     * @return ModifyCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteResponse ModifyCloudNativeAPIGatewayRoute(ModifyCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayRoute", ModifyCloudNativeAPIGatewayRouteResponse.class);
    }

    /**
     *修改云原生网关限流插件(路由)
     * @param req ModifyCloudNativeAPIGatewayRouteRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteRateLimitResponse ModifyCloudNativeAPIGatewayRouteRateLimit(ModifyCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayRouteRateLimit", ModifyCloudNativeAPIGatewayRouteRateLimitResponse.class);
    }

    /**
     *修改云原生网关服务
     * @param req ModifyCloudNativeAPIGatewayServiceRequest
     * @return ModifyCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceResponse ModifyCloudNativeAPIGatewayService(ModifyCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayService", ModifyCloudNativeAPIGatewayServiceResponse.class);
    }

    /**
     *修改云原生网关限流插件(服务)
     * @param req ModifyCloudNativeAPIGatewayServiceRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceRateLimitResponse ModifyCloudNativeAPIGatewayServiceRateLimit(ModifyCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudNativeAPIGatewayServiceRateLimit", ModifyCloudNativeAPIGatewayServiceRateLimitResponse.class);
    }

    /**
     *修改云原生API网关实例分组基础信息
     * @param req ModifyNativeGatewayServerGroupRequest
     * @return ModifyNativeGatewayServerGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNativeGatewayServerGroupResponse ModifyNativeGatewayServerGroup(ModifyNativeGatewayServerGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNativeGatewayServerGroup", ModifyNativeGatewayServerGroupResponse.class);
    }

    /**
     *修改云原生网关证书信息
     * @param req UpdateCloudNativeAPIGatewayCertificateInfoRequest
     * @return UpdateCloudNativeAPIGatewayCertificateInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewayCertificateInfoResponse UpdateCloudNativeAPIGatewayCertificateInfo(UpdateCloudNativeAPIGatewayCertificateInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewayCertificateInfo", UpdateCloudNativeAPIGatewayCertificateInfoResponse.class);
    }

    /**
     *修改云原生API网关实例的节点规格信息，比如节点扩缩容或者升降配
     * @param req UpdateCloudNativeAPIGatewaySpecRequest
     * @return UpdateCloudNativeAPIGatewaySpecResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCloudNativeAPIGatewaySpecResponse UpdateCloudNativeAPIGatewaySpec(UpdateCloudNativeAPIGatewaySpecRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCloudNativeAPIGatewaySpec", UpdateCloudNativeAPIGatewaySpecResponse.class);
    }

    /**
     *修改引擎公网访问配置
     * @param req UpdateEngineInternetAccessRequest
     * @return UpdateEngineInternetAccessResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEngineInternetAccessResponse UpdateEngineInternetAccess(UpdateEngineInternetAccessRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateEngineInternetAccess", UpdateEngineInternetAccessResponse.class);
    }

    /**
     *更新网关上游实例列表，仅支持IPList服务类型
     * @param req UpdateUpstreamTargetsRequest
     * @return UpdateUpstreamTargetsResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUpstreamTargetsResponse UpdateUpstreamTargets(UpdateUpstreamTargetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUpstreamTargets", UpdateUpstreamTargetsResponse.class);
    }

}
