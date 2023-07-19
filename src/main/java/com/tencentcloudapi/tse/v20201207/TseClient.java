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
     *创建云原生网关的灰度规则
     * @param req CreateCloudNativeAPIGatewayCanaryRuleRequest
     * @return CreateCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayCanaryRuleResponse CreateCloudNativeAPIGatewayCanaryRule(CreateCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudNativeAPIGatewayCanaryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudNativeAPIGatewayCanaryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudNativeAPIGatewayCanaryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云原生网关路由
     * @param req CreateCloudNativeAPIGatewayRouteRequest
     * @return CreateCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteResponse CreateCloudNativeAPIGatewayRoute(CreateCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudNativeAPIGatewayRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudNativeAPIGatewayRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudNativeAPIGatewayRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云原生网关限流插件(路由)
     * @param req CreateCloudNativeAPIGatewayRouteRateLimitRequest
     * @return CreateCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayRouteRateLimitResponse CreateCloudNativeAPIGatewayRouteRateLimit(CreateCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudNativeAPIGatewayRouteRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudNativeAPIGatewayRouteRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudNativeAPIGatewayRouteRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云原生网关服务
     * @param req CreateCloudNativeAPIGatewayServiceRequest
     * @return CreateCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceResponse CreateCloudNativeAPIGatewayService(CreateCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudNativeAPIGatewayServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudNativeAPIGatewayServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudNativeAPIGatewayService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云原生网关限流插件(服务)
     * @param req CreateCloudNativeAPIGatewayServiceRateLimitRequest
     * @return CreateCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudNativeAPIGatewayServiceRateLimitResponse CreateCloudNativeAPIGatewayServiceRateLimit(CreateCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudNativeAPIGatewayServiceRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudNativeAPIGatewayServiceRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudNativeAPIGatewayServiceRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建引擎实例
     * @param req CreateEngineRequest
     * @return CreateEngineResponse
     * @throws TencentCloudSDKException
     */
    public CreateEngineResponse CreateEngine(CreateEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateEngine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云原生网关的灰度规则
     * @param req DeleteCloudNativeAPIGatewayCanaryRuleRequest
     * @return DeleteCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayCanaryRuleResponse DeleteCloudNativeAPIGatewayCanaryRule(DeleteCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudNativeAPIGatewayCanaryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudNativeAPIGatewayCanaryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudNativeAPIGatewayCanaryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云原生网关路由
     * @param req DeleteCloudNativeAPIGatewayRouteRequest
     * @return DeleteCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteResponse DeleteCloudNativeAPIGatewayRoute(DeleteCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudNativeAPIGatewayRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudNativeAPIGatewayRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudNativeAPIGatewayRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云原生网关的限流插件(路由)
     * @param req DeleteCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayRouteRateLimitResponse DeleteCloudNativeAPIGatewayRouteRateLimit(DeleteCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudNativeAPIGatewayRouteRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudNativeAPIGatewayRouteRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudNativeAPIGatewayRouteRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云原生网关服务
     * @param req DeleteCloudNativeAPIGatewayServiceRequest
     * @return DeleteCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceResponse DeleteCloudNativeAPIGatewayService(DeleteCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudNativeAPIGatewayServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudNativeAPIGatewayServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudNativeAPIGatewayService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云原生网关的限流插件(服务)
     * @param req DeleteCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DeleteCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudNativeAPIGatewayServiceRateLimitResponse DeleteCloudNativeAPIGatewayServiceRateLimit(DeleteCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudNativeAPIGatewayServiceRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudNativeAPIGatewayServiceRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudNativeAPIGatewayServiceRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除引擎实例
     * @param req DeleteEngineRequest
     * @return DeleteEngineResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEngineResponse DeleteEngine(DeleteEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEngineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEngineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEngine");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云原生网关灰度规则列表
     * @param req DescribeCloudNativeAPIGatewayCanaryRulesRequest
     * @return DescribeCloudNativeAPIGatewayCanaryRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayCanaryRulesResponse DescribeCloudNativeAPIGatewayCanaryRules(DescribeCloudNativeAPIGatewayCanaryRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayCanaryRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayCanaryRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayCanaryRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云原生网关节点列表
     * @param req DescribeCloudNativeAPIGatewayNodesRequest
     * @return DescribeCloudNativeAPIGatewayNodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayNodesResponse DescribeCloudNativeAPIGatewayNodes(DescribeCloudNativeAPIGatewayNodesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayNodesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayNodesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayNodes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云原生API网关实例端口信息
     * @param req DescribeCloudNativeAPIGatewayPortsRequest
     * @return DescribeCloudNativeAPIGatewayPortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayPortsResponse DescribeCloudNativeAPIGatewayPorts(DescribeCloudNativeAPIGatewayPortsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayPortsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayPortsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayPorts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云原生网关的限流插件(路由)
     * @param req DescribeCloudNativeAPIGatewayRouteRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRouteRateLimitResponse DescribeCloudNativeAPIGatewayRouteRateLimit(DescribeCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayRouteRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayRouteRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayRouteRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云原生网关路由列表
     * @param req DescribeCloudNativeAPIGatewayRoutesRequest
     * @return DescribeCloudNativeAPIGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayRoutesResponse DescribeCloudNativeAPIGatewayRoutes(DescribeCloudNativeAPIGatewayRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayRoutesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayRoutes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云原生网关的限流插件(服务)
     * @param req DescribeCloudNativeAPIGatewayServiceRateLimitRequest
     * @return DescribeCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServiceRateLimitResponse DescribeCloudNativeAPIGatewayServiceRateLimit(DescribeCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayServiceRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayServiceRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayServiceRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云原生网关服务列表
     * @param req DescribeCloudNativeAPIGatewayServicesRequest
     * @return DescribeCloudNativeAPIGatewayServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudNativeAPIGatewayServicesResponse DescribeCloudNativeAPIGatewayServices(DescribeCloudNativeAPIGatewayServicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudNativeAPIGatewayServicesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudNativeAPIGatewayServicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudNativeAPIGatewayServices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Nacos类型引擎实例副本信息
     * @param req DescribeNacosReplicasRequest
     * @return DescribeNacosReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosReplicasResponse DescribeNacosReplicas(DescribeNacosReplicasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNacosReplicasResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNacosReplicasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNacosReplicas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询nacos服务接口列表
     * @param req DescribeNacosServerInterfacesRequest
     * @return DescribeNacosServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNacosServerInterfacesResponse DescribeNacosServerInterfaces(DescribeNacosServerInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNacosServerInterfacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeNacosServerInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeNacosServerInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云原生网关服务详情
     * @param req DescribeOneCloudNativeAPIGatewayServiceRequest
     * @return DescribeOneCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOneCloudNativeAPIGatewayServiceResponse DescribeOneCloudNativeAPIGatewayService(DescribeOneCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOneCloudNativeAPIGatewayServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOneCloudNativeAPIGatewayServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOneCloudNativeAPIGatewayService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询引擎实例访问地址
     * @param req DescribeSREInstanceAccessAddressRequest
     * @return DescribeSREInstanceAccessAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstanceAccessAddressResponse DescribeSREInstanceAccessAddress(DescribeSREInstanceAccessAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSREInstanceAccessAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSREInstanceAccessAddressResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSREInstanceAccessAddress");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询引擎实例列表
     * @param req DescribeSREInstancesRequest
     * @return DescribeSREInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSREInstancesResponse DescribeSREInstances(DescribeSREInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSREInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSREInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSREInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询Zookeeper类型注册引擎实例副本信息
     * @param req DescribeZookeeperReplicasRequest
     * @return DescribeZookeeperReplicasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperReplicasResponse DescribeZookeeperReplicas(DescribeZookeeperReplicasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZookeeperReplicasResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZookeeperReplicasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZookeeperReplicas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询zookeeper服务接口列表
     * @param req DescribeZookeeperServerInterfacesRequest
     * @return DescribeZookeeperServerInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeZookeeperServerInterfacesResponse DescribeZookeeperServerInterfaces(DescribeZookeeperServerInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeZookeeperServerInterfacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeZookeeperServerInterfacesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeZookeeperServerInterfaces");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云原生网关的灰度规则
     * @param req ModifyCloudNativeAPIGatewayCanaryRuleRequest
     * @return ModifyCloudNativeAPIGatewayCanaryRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayCanaryRuleResponse ModifyCloudNativeAPIGatewayCanaryRule(ModifyCloudNativeAPIGatewayCanaryRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudNativeAPIGatewayCanaryRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudNativeAPIGatewayCanaryRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudNativeAPIGatewayCanaryRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云原生网关路由
     * @param req ModifyCloudNativeAPIGatewayRouteRequest
     * @return ModifyCloudNativeAPIGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteResponse ModifyCloudNativeAPIGatewayRoute(ModifyCloudNativeAPIGatewayRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudNativeAPIGatewayRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudNativeAPIGatewayRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudNativeAPIGatewayRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云原生网关限流插件(路由)
     * @param req ModifyCloudNativeAPIGatewayRouteRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayRouteRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayRouteRateLimitResponse ModifyCloudNativeAPIGatewayRouteRateLimit(ModifyCloudNativeAPIGatewayRouteRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudNativeAPIGatewayRouteRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudNativeAPIGatewayRouteRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudNativeAPIGatewayRouteRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云原生网关服务
     * @param req ModifyCloudNativeAPIGatewayServiceRequest
     * @return ModifyCloudNativeAPIGatewayServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceResponse ModifyCloudNativeAPIGatewayService(ModifyCloudNativeAPIGatewayServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudNativeAPIGatewayServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudNativeAPIGatewayServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudNativeAPIGatewayService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改云原生网关限流插件(服务)
     * @param req ModifyCloudNativeAPIGatewayServiceRateLimitRequest
     * @return ModifyCloudNativeAPIGatewayServiceRateLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudNativeAPIGatewayServiceRateLimitResponse ModifyCloudNativeAPIGatewayServiceRateLimit(ModifyCloudNativeAPIGatewayServiceRateLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudNativeAPIGatewayServiceRateLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudNativeAPIGatewayServiceRateLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudNativeAPIGatewayServiceRateLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改引擎公网访问配置
     * @param req UpdateEngineInternetAccessRequest
     * @return UpdateEngineInternetAccessResponse
     * @throws TencentCloudSDKException
     */
    public UpdateEngineInternetAccessResponse UpdateEngineInternetAccess(UpdateEngineInternetAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateEngineInternetAccessResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateEngineInternetAccessResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateEngineInternetAccess");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
