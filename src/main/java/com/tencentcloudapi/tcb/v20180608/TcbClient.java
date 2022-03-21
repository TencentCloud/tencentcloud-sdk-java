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
package com.tencentcloudapi.tcb.v20180608;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tcb.v20180608.models.*;

public class TcbClient extends AbstractClient{
    private static String endpoint = "tcb.tencentcloudapi.com";
    private static String service = "tcb";
    private static String version = "2018-06-08";

    public TcbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TcbClient(Credential credential, String region, ClientProfile profile) {
        super(TcbClient.endpoint, TcbClient.version, credential, region, profile);
    }

    /**
     *绑定另外一个环境下的网关，callContainer请求可以访问到该网关
     * @param req BindEnvGatewayRequest
     * @return BindEnvGatewayResponse
     * @throws TencentCloudSDKException
     */
    public BindEnvGatewayResponse BindEnvGateway(BindEnvGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindEnvGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindEnvGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindEnvGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检查是否开通Tcb服务
     * @param req CheckTcbServiceRequest
     * @return CheckTcbServiceResponse
     * @throws TencentCloudSDKException
     */
    public CheckTcbServiceResponse CheckTcbService(CheckTcbServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckTcbServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CheckTcbServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckTcbService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *TCB云API统一入口
     * @param req CommonServiceAPIRequest
     * @return CommonServiceAPIResponse
     * @throws TencentCloudSDKException
     */
    public CommonServiceAPIResponse CommonServiceAPI(CommonServiceAPIRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CommonServiceAPIResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CommonServiceAPIResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CommonServiceAPI");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云开发项目
     * @param req CreateAndDeployCloudBaseProjectRequest
     * @return CreateAndDeployCloudBaseProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndDeployCloudBaseProjectResponse CreateAndDeployCloudBaseProject(CreateAndDeployCloudBaseProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAndDeployCloudBaseProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAndDeployCloudBaseProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAndDeployCloudBaseProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加安全域名
     * @param req CreateAuthDomainRequest
     * @return CreateAuthDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuthDomainResponse CreateAuthDomain(CreateAuthDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAuthDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuthDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAuthDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开通容器托管的资源，包括集群创建，VPC配置，异步任务创建，镜像托管，Coding等，查看创建结果需要根据DescribeCloudBaseRunResource接口来查看
     * @param req CreateCloudBaseRunResourceRequest
     * @return CreateCloudBaseRunResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudBaseRunResourceResponse CreateCloudBaseRunResource(CreateCloudBaseRunResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudBaseRunResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudBaseRunResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudBaseRunResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建服务版本
     * @param req CreateCloudBaseRunServerVersionRequest
     * @return CreateCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudBaseRunServerVersionResponse CreateCloudBaseRunServerVersion(CreateCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCloudBaseRunServerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCloudBaseRunServerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCloudBaseRunServerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建托管域名
     * @param req CreateHostingDomainRequest
     * @return CreateHostingDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostingDomainResponse CreateHostingDomain(CreateHostingDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHostingDomainResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHostingDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHostingDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开通后付费资源
     * @param req CreatePostpayPackageRequest
     * @return CreatePostpayPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostpayPackageResponse CreatePostpayPackage(CreatePostpayPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePostpayPackageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePostpayPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreatePostpayPackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateStandaloneGateway）用于创建独立网关。
     * @param req CreateStandaloneGatewayRequest
     * @return CreateStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateStandaloneGatewayResponse CreateStandaloneGateway(CreateStandaloneGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStandaloneGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStandaloneGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStandaloneGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建静态托管资源，包括COS和CDN，异步任务创建，查看创建结果需要根据DescribeStaticStore接口来查看
     * @param req CreateStaticStoreRequest
     * @return CreateStaticStoreResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaticStoreResponse CreateStaticStore(CreateStaticStoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStaticStoreResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStaticStoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStaticStore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建微信云托管
     * @param req CreateWxCloudBaseRunEnvRequest
     * @return CreateWxCloudBaseRunEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateWxCloudBaseRunEnvResponse CreateWxCloudBaseRunEnv(CreateWxCloudBaseRunEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWxCloudBaseRunEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWxCloudBaseRunEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWxCloudBaseRunEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开通微信云托管MySQL数据库服务
     * @param req CreateWxCloudBaseRunServerDBClusterRequest
     * @return CreateWxCloudBaseRunServerDBClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateWxCloudBaseRunServerDBClusterResponse CreateWxCloudBaseRunServerDBCluster(CreateWxCloudBaseRunServerDBClusterRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateWxCloudBaseRunServerDBClusterResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateWxCloudBaseRunServerDBClusterResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateWxCloudBaseRunServerDBCluster");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除云项目
     * @param req DeleteCloudBaseProjectLatestVersionRequest
     * @return DeleteCloudBaseProjectLatestVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudBaseProjectLatestVersionResponse DeleteCloudBaseProjectLatestVersion(DeleteCloudBaseProjectLatestVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudBaseProjectLatestVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudBaseProjectLatestVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudBaseProjectLatestVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除服务版本
     * @param req DeleteCloudBaseRunServerVersionRequest
     * @return DeleteCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudBaseRunServerVersionResponse DeleteCloudBaseRunServerVersion(DeleteCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCloudBaseRunServerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCloudBaseRunServerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCloudBaseRunServerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除终端用户
     * @param req DeleteEndUserRequest
     * @return DeleteEndUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEndUserResponse DeleteEndUser(DeleteEndUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteEndUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEndUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteEndUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除安全网关路由
     * @param req DeleteWxGatewayRouteRequest
     * @return DeleteWxGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWxGatewayRouteResponse DeleteWxGatewayRoute(DeleteWxGatewayRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWxGatewayRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWxGatewayRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWxGatewayRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询活动信息
     * @param req DescribeActivityInfoRequest
     * @return DescribeActivityInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActivityInfoResponse DescribeActivityInfo(DescribeActivityInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeActivityInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeActivityInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeActivityInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询活动记录信息
     * @param req DescribeActivityRecordRequest
     * @return DescribeActivityRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActivityRecordResponse DescribeActivityRecord(DescribeActivityRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeActivityRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeActivityRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeActivityRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全域名列表
     * @param req DescribeAuthDomainsRequest
     * @return DescribeAuthDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthDomainsResponse DescribeAuthDomains(DescribeAuthDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAuthDomainsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuthDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAuthDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云托管代码上传url
     * @param req DescribeCloudBaseBuildServiceRequest
     * @return DescribeCloudBaseBuildServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseBuildServiceResponse DescribeCloudBaseBuildService(DescribeCloudBaseBuildServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseBuildServiceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseBuildServiceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseBuildService");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取云开发项目列表
     * @param req DescribeCloudBaseProjectLatestVersionListRequest
     * @return DescribeCloudBaseProjectLatestVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseProjectLatestVersionListResponse DescribeCloudBaseProjectLatestVersionList(DescribeCloudBaseProjectLatestVersionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseProjectLatestVersionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseProjectLatestVersionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseProjectLatestVersionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云项目部署列表
     * @param req DescribeCloudBaseProjectVersionListRequest
     * @return DescribeCloudBaseProjectVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseProjectVersionListResponse DescribeCloudBaseProjectVersionList(DescribeCloudBaseProjectVersionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseProjectVersionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseProjectVersionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseProjectVersionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询环境下所有的vpc列表
     * @param req DescribeCloudBaseRunAllVpcsRequest
     * @return DescribeCloudBaseRunAllVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunAllVpcsResponse DescribeCloudBaseRunAllVpcs(DescribeCloudBaseRunAllVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunAllVpcsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunAllVpcsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunAllVpcs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *独立网关中拉取云托管服务对应的配置信息
     * @param req DescribeCloudBaseRunConfForGateWayRequest
     * @return DescribeCloudBaseRunConfForGateWayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunConfForGateWayResponse DescribeCloudBaseRunConfForGateWay(DescribeCloudBaseRunConfForGateWayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunConfForGateWayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunConfForGateWayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunConfForGateWay");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询一键部署任务 （特定接口：外部查询使用）
     * @param req DescribeCloudBaseRunOneClickTaskExternalRequest
     * @return DescribeCloudBaseRunOneClickTaskExternalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunOneClickTaskExternalResponse DescribeCloudBaseRunOneClickTaskExternal(DescribeCloudBaseRunOneClickTaskExternalRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunOneClickTaskExternalResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunOneClickTaskExternalResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunOneClickTaskExternal");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务、版本和操作类型
     * @param req DescribeCloudBaseRunOperationTypesRequest
     * @return DescribeCloudBaseRunOperationTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunOperationTypesResponse DescribeCloudBaseRunOperationTypes(DescribeCloudBaseRunOperationTypesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunOperationTypesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunOperationTypesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunOperationTypes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询云应用服务版本容器列表
     * @param req DescribeCloudBaseRunPodListRequest
     * @return DescribeCloudBaseRunPodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunPodListResponse DescribeCloudBaseRunPodList(DescribeCloudBaseRunPodListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunPodListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunPodListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunPodList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看容器托管的集群状态
     * @param req DescribeCloudBaseRunResourceRequest
     * @return DescribeCloudBaseRunResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunResourceResponse DescribeCloudBaseRunResource(DescribeCloudBaseRunResourceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunResourceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunResourceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunResource");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看容器托管的集群状态扩展使用
     * @param req DescribeCloudBaseRunResourceForExtendRequest
     * @return DescribeCloudBaseRunResourceForExtendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunResourceForExtendResponse DescribeCloudBaseRunResourceForExtend(DescribeCloudBaseRunResourceForExtendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunResourceForExtendResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunResourceForExtendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunResourceForExtend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个服务的详情，版本以及详情
     * @param req DescribeCloudBaseRunServerRequest
     * @return DescribeCloudBaseRunServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunServerResponse DescribeCloudBaseRunServer(DescribeCloudBaseRunServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunServerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunServerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunServer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询微信云托管服务域名
     * @param req DescribeCloudBaseRunServerDomainNameRequest
     * @return DescribeCloudBaseRunServerDomainNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunServerDomainNameResponse DescribeCloudBaseRunServerDomainName(DescribeCloudBaseRunServerDomainNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunServerDomainNameResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunServerDomainNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunServerDomainName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务版本的详情，CPU和MEM  请使用CPUSize和MemSize
     * @param req DescribeCloudBaseRunServerVersionRequest
     * @return DescribeCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunServerVersionResponse DescribeCloudBaseRunServerVersion(DescribeCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunServerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunServerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunServerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询服务版本详情(新)
     * @param req DescribeCloudBaseRunVersionRequest
     * @return DescribeCloudBaseRunVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunVersionResponse DescribeCloudBaseRunVersion(DescribeCloudBaseRunVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *DescribeCloudBaseRunVersionRsByCondition 获取云托管详情
     * @param req DescribeCloudBaseRunVersionRsByConditionRequest
     * @return DescribeCloudBaseRunVersionRsByConditionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunVersionRsByConditionResponse DescribeCloudBaseRunVersionRsByCondition(DescribeCloudBaseRunVersionRsByConditionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunVersionRsByConditionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunVersionRsByConditionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunVersionRsByCondition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询版本历史
     * @param req DescribeCloudBaseRunVersionSnapshotRequest
     * @return DescribeCloudBaseRunVersionSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunVersionSnapshotResponse DescribeCloudBaseRunVersionSnapshot(DescribeCloudBaseRunVersionSnapshotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCloudBaseRunVersionSnapshotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCloudBaseRunVersionSnapshotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCloudBaseRunVersionSnapshot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据用户传入的指标, 拉取一段时间内的监控数据。
     * @param req DescribeCurveDataRequest
     * @return DescribeCurveDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurveDataResponse DescribeCurveData(DescribeCurveDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCurveDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCurveDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCurveData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取数据库权限
     * @param req DescribeDatabaseACLRequest
     * @return DescribeDatabaseACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseACLResponse DescribeDatabaseACL(DescribeDatabaseACLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDatabaseACLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseACLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDatabaseACL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取下载文件信息
     * @param req DescribeDownloadFileRequest
     * @return DescribeDownloadFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDownloadFileResponse DescribeDownloadFile(DescribeDownloadFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDownloadFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDownloadFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDownloadFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境终端用户新增与登录信息
     * @param req DescribeEndUserLoginStatisticRequest
     * @return DescribeEndUserLoginStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndUserLoginStatisticResponse DescribeEndUserLoginStatistic(DescribeEndUserLoginStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEndUserLoginStatisticResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEndUserLoginStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEndUserLoginStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取终端用户总量与平台分布情况
     * @param req DescribeEndUserStatisticRequest
     * @return DescribeEndUserStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndUserStatisticResponse DescribeEndUserStatistic(DescribeEndUserStatisticRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEndUserStatisticResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEndUserStatisticResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEndUserStatistic");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取终端用户列表
     * @param req DescribeEndUsersRequest
     * @return DescribeEndUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndUsersResponse DescribeEndUsers(DescribeEndUsersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEndUsersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEndUsersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEndUsers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境下单地域
     * @param req DescribeEnvDealRegionRequest
     * @return DescribeEnvDealRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvDealRegionResponse DescribeEnvDealRegion(DescribeEnvDealRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvDealRegionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvDealRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvDealRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询后付费免费配额信息
     * @param req DescribeEnvFreeQuotaRequest
     * @return DescribeEnvFreeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvFreeQuotaResponse DescribeEnvFreeQuota(DescribeEnvFreeQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvFreeQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvFreeQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvFreeQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询环境个数上限
     * @param req DescribeEnvLimitRequest
     * @return DescribeEnvLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvLimitResponse DescribeEnvLimit(DescribeEnvLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvLimitResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询环境后付费计费详情
     * @param req DescribeEnvPostpaidDeductRequest
     * @return DescribeEnvPostpaidDeductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvPostpaidDeductResponse DescribeEnvPostpaidDeduct(DescribeEnvPostpaidDeductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvPostpaidDeductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvPostpaidDeductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvPostpaidDeduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取环境列表，含环境下的各个资源信息。尤其是各资源的唯一标识，是请求各资源的关键参数
     * @param req DescribeEnvsRequest
     * @return DescribeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvsResponse DescribeEnvs(DescribeEnvsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEnvsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEnvs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述扩展上传文件信息
     * @param req DescribeExtensionUploadInfoRequest
     * @return DescribeExtensionUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionUploadInfoResponse DescribeExtensionUploadInfo(DescribeExtensionUploadInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExtensionUploadInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExtensionUploadInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExtensionUploadInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取增值包计费相关信息
     * @param req DescribeExtraPkgBillingInfoRequest
     * @return DescribeExtraPkgBillingInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtraPkgBillingInfoResponse DescribeExtraPkgBillingInfo(DescribeExtraPkgBillingInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeExtraPkgBillingInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeExtraPkgBillingInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeExtraPkgBillingInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询静态托管域名任务状态
     * @param req DescribeHostingDomainTaskRequest
     * @return DescribeHostingDomainTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostingDomainTaskResponse DescribeHostingDomainTask(DescribeHostingDomainTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostingDomainTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostingDomainTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostingDomainTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询后付费资源免费量
     * @param req DescribePostpayFreeQuotasRequest
     * @return DescribePostpayFreeQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpayFreeQuotasResponse DescribePostpayFreeQuotas(DescribePostpayFreeQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePostpayFreeQuotasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePostpayFreeQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePostpayFreeQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取后付费免费额度
     * @param req DescribePostpayPackageFreeQuotasRequest
     * @return DescribePostpayPackageFreeQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpayPackageFreeQuotasResponse DescribePostpayPackageFreeQuotas(DescribePostpayPackageFreeQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePostpayPackageFreeQuotasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePostpayPackageFreeQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePostpayPackageFreeQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询指定指标的配额使用量
     * @param req DescribeQuotaDataRequest
     * @return DescribeQuotaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaDataResponse DescribeQuotaData(DescribeQuotaDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeQuotaDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQuotaDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeQuotaData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询后付费短信资源量
1 有免费包的返回SmsFreeQuota结构所有字段
2 没有免费包，有付费包，付费返回复用SmsFreeQuota结构，其中只有 TodayUsedQuota 字段有效
3 都没有返回为空数组
     * @param req DescribeSmsQuotasRequest
     * @return DescribeSmsQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSmsQuotasResponse DescribeSmsQuotas(DescribeSmsQuotasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSmsQuotasResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSmsQuotasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSmsQuotas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询环境1分钱抵扣信息
     * @param req DescribeSpecialCostItemsRequest
     * @return DescribeSpecialCostItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecialCostItemsResponse DescribeSpecialCostItems(DescribeSpecialCostItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpecialCostItemsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpecialCostItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSpecialCostItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeStandaloneGateway）查询小租户网关套餐信息。
     * @param req DescribeStandaloneGatewayRequest
     * @return DescribeStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandaloneGatewayResponse DescribeStandaloneGateway(DescribeStandaloneGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStandaloneGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStandaloneGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStandaloneGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeStandaloneGatewayPackage）用于查询小租户网关套餐信息。
     * @param req DescribeStandaloneGatewayPackageRequest
     * @return DescribeStandaloneGatewayPackageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandaloneGatewayPackageResponse DescribeStandaloneGatewayPackage(DescribeStandaloneGatewayPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStandaloneGatewayPackageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStandaloneGatewayPackageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStandaloneGatewayPackage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户活动信息
     * @param req DescribeUserActivityInfoRequest
     * @return DescribeUserActivityInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserActivityInfoResponse DescribeUserActivityInfo(DescribeUserActivityInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserActivityInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserActivityInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserActivityInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询微信云托管环境信息
     * @param req DescribeWxCloudBaseRunEnvsRequest
     * @return DescribeWxCloudBaseRunEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWxCloudBaseRunEnvsResponse DescribeWxCloudBaseRunEnvs(DescribeWxCloudBaseRunEnvsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWxCloudBaseRunEnvsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWxCloudBaseRunEnvsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWxCloudBaseRunEnvs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询微信云托管子网
     * @param req DescribeWxCloudBaseRunSubNetsRequest
     * @return DescribeWxCloudBaseRunSubNetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWxCloudBaseRunSubNetsResponse DescribeWxCloudBaseRunSubNets(DescribeWxCloudBaseRunSubNetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWxCloudBaseRunSubNetsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWxCloudBaseRunSubNetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWxCloudBaseRunSubNets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁环境
     * @param req DestroyEnvRequest
     * @return DestroyEnvResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvResponse DestroyEnv(DestroyEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DestroyStandaloneGateway）用于销毁小租户网关。
     * @param req DestroyStandaloneGatewayRequest
     * @return DestroyStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DestroyStandaloneGatewayResponse DestroyStandaloneGateway(DestroyStandaloneGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyStandaloneGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyStandaloneGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyStandaloneGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁静态托管资源，该接口创建异步销毁任务，资源最终状态可从DestroyStaticStore接口查看
     * @param req DestroyStaticStoreRequest
     * @return DestroyStaticStoreResponse
     * @throws TencentCloudSDKException
     */
    public DestroyStaticStoreResponse DestroyStaticStore(DestroyStaticStoreRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyStaticStoreResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyStaticStoreResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyStaticStore");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建云应用服务
     * @param req EstablishCloudBaseRunServerRequest
     * @return EstablishCloudBaseRunServerResponse
     * @throws TencentCloudSDKException
     */
    public EstablishCloudBaseRunServerResponse EstablishCloudBaseRunServer(EstablishCloudBaseRunServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EstablishCloudBaseRunServerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EstablishCloudBaseRunServerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EstablishCloudBaseRunServer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建或修改安全网关路由
     * @param req EstablishWxGatewayRouteRequest
     * @return EstablishWxGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public EstablishWxGatewayRouteResponse EstablishWxGatewayRoute(EstablishWxGatewayRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EstablishWxGatewayRouteResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EstablishWxGatewayRouteResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EstablishWxGatewayRoute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量冻结
     * @param req FreezeCloudBaseRunServersRequest
     * @return FreezeCloudBaseRunServersResponse
     * @throws TencentCloudSDKException
     */
    public FreezeCloudBaseRunServersResponse FreezeCloudBaseRunServers(FreezeCloudBaseRunServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreezeCloudBaseRunServersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<FreezeCloudBaseRunServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreezeCloudBaseRunServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改容器内的版本流量配置
     * @param req ModifyCloudBaseRunServerFlowConfRequest
     * @return ModifyCloudBaseRunServerFlowConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudBaseRunServerFlowConfResponse ModifyCloudBaseRunServerFlowConf(ModifyCloudBaseRunServerFlowConfRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudBaseRunServerFlowConfResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudBaseRunServerFlowConfResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudBaseRunServerFlowConf");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改服务版本的副本数，环境变量
     * @param req ModifyCloudBaseRunServerVersionRequest
     * @return ModifyCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudBaseRunServerVersionResponse ModifyCloudBaseRunServerVersion(ModifyCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCloudBaseRunServerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCloudBaseRunServerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCloudBaseRunServerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改数据库权限
     * @param req ModifyDatabaseACLRequest
     * @return ModifyDatabaseACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseACLResponse ModifyDatabaseACL(ModifyDatabaseACLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDatabaseACLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatabaseACLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDatabaseACL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *管理终端用户
     * @param req ModifyEndUserRequest
     * @return ModifyEndUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEndUserResponse ModifyEndUser(ModifyEndUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEndUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEndUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEndUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新环境信息
     * @param req ModifyEnvRequest
     * @return ModifyEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvResponse ModifyEnv(ModifyEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *针对已隔离的免费环境，可以通过本接口将其恢复访问。
     * @param req ReinstateEnvRequest
     * @return ReinstateEnvResponse
     * @throws TencentCloudSDKException
     */
    public ReinstateEnvResponse ReinstateEnv(ReinstateEnvRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReinstateEnvResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReinstateEnvResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReinstateEnv");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新活动详情
     * @param req ReplaceActivityRecordRequest
     * @return ReplaceActivityRecordResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceActivityRecordResponse ReplaceActivityRecord(ReplaceActivityRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceActivityRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReplaceActivityRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReplaceActivityRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *针对特定的版本，进行滚动更新
     * @param req RollUpdateCloudBaseRunServerVersionRequest
     * @return RollUpdateCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollUpdateCloudBaseRunServerVersionResponse RollUpdateCloudBaseRunServerVersion(RollUpdateCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RollUpdateCloudBaseRunServerVersionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RollUpdateCloudBaseRunServerVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RollUpdateCloudBaseRunServerVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *搜索CLS日志，TCB角色秘钥访问
     * @param req SearchClsLogRequest
     * @return SearchClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchClsLogResponse SearchClsLog(SearchClsLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchClsLogResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchClsLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchClsLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（TurnOffStandaloneGateway）用于关闭小租户网关。
     * @param req TurnOffStandaloneGatewayRequest
     * @return TurnOffStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public TurnOffStandaloneGatewayResponse TurnOffStandaloneGateway(TurnOffStandaloneGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TurnOffStandaloneGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TurnOffStandaloneGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TurnOffStandaloneGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（TurnOnStandaloneGateway）用于开启小租户网关。
     * @param req TurnOnStandaloneGatewayRequest
     * @return TurnOnStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public TurnOnStandaloneGatewayResponse TurnOnStandaloneGateway(TurnOnStandaloneGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TurnOnStandaloneGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<TurnOnStandaloneGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "TurnOnStandaloneGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量解冻服务
     * @param req UnfreezeCloudBaseRunServersRequest
     * @return UnfreezeCloudBaseRunServersResponse
     * @throws TencentCloudSDKException
     */
    public UnfreezeCloudBaseRunServersResponse UnfreezeCloudBaseRunServers(UnfreezeCloudBaseRunServersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnfreezeCloudBaseRunServersResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UnfreezeCloudBaseRunServersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UnfreezeCloudBaseRunServers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
