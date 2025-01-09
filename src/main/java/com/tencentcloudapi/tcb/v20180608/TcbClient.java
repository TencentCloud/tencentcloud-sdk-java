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
        req.setSkipSign(false);
        return this.internalRequest(req, "BindEnvGateway", BindEnvGatewayResponse.class);
    }

    /**
     *检查是否开通Tcb服务
     * @param req CheckTcbServiceRequest
     * @return CheckTcbServiceResponse
     * @throws TencentCloudSDKException
     */
    public CheckTcbServiceResponse CheckTcbService(CheckTcbServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CheckTcbService", CheckTcbServiceResponse.class);
    }

    /**
     *TCB云API统一入口
     * @param req CommonServiceAPIRequest
     * @return CommonServiceAPIResponse
     * @throws TencentCloudSDKException
     */
    public CommonServiceAPIResponse CommonServiceAPI(CommonServiceAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CommonServiceAPI", CommonServiceAPIResponse.class);
    }

    /**
     *创建云开发项目
     * @param req CreateAndDeployCloudBaseProjectRequest
     * @return CreateAndDeployCloudBaseProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndDeployCloudBaseProjectResponse CreateAndDeployCloudBaseProject(CreateAndDeployCloudBaseProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAndDeployCloudBaseProject", CreateAndDeployCloudBaseProjectResponse.class);
    }

    /**
     *增加安全域名
     * @param req CreateAuthDomainRequest
     * @return CreateAuthDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuthDomainResponse CreateAuthDomain(CreateAuthDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuthDomain", CreateAuthDomainResponse.class);
    }

    /**
     *开通容器托管的资源，包括集群创建，VPC配置，异步任务创建，镜像托管，Coding等，查看创建结果需要根据DescribeCloudBaseRunResource接口来查看
     * @param req CreateCloudBaseRunResourceRequest
     * @return CreateCloudBaseRunResourceResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudBaseRunResourceResponse CreateCloudBaseRunResource(CreateCloudBaseRunResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudBaseRunResource", CreateCloudBaseRunResourceResponse.class);
    }

    /**
     *创建服务版本
     * @param req CreateCloudBaseRunServerVersionRequest
     * @return CreateCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudBaseRunServerVersionResponse CreateCloudBaseRunServerVersion(CreateCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudBaseRunServerVersion", CreateCloudBaseRunServerVersionResponse.class);
    }

    /**
     *创建托管域名
     * @param req CreateHostingDomainRequest
     * @return CreateHostingDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostingDomainResponse CreateHostingDomain(CreateHostingDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHostingDomain", CreateHostingDomainResponse.class);
    }

    /**
     *开通后付费资源
     * @param req CreatePostpayPackageRequest
     * @return CreatePostpayPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreatePostpayPackageResponse CreatePostpayPackage(CreatePostpayPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePostpayPackage", CreatePostpayPackageResponse.class);
    }

    /**
     *本接口（CreateStandaloneGateway）用于创建独立网关。
     * @param req CreateStandaloneGatewayRequest
     * @return CreateStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateStandaloneGatewayResponse CreateStandaloneGateway(CreateStandaloneGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStandaloneGateway", CreateStandaloneGatewayResponse.class);
    }

    /**
     *创建静态托管资源，包括COS和CDN，异步任务创建，查看创建结果需要根据DescribeStaticStore接口来查看
     * @param req CreateStaticStoreRequest
     * @return CreateStaticStoreResponse
     * @throws TencentCloudSDKException
     */
    public CreateStaticStoreResponse CreateStaticStore(CreateStaticStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateStaticStore", CreateStaticStoreResponse.class);
    }

    /**
     *创建微信云托管
     * @param req CreateWxCloudBaseRunEnvRequest
     * @return CreateWxCloudBaseRunEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateWxCloudBaseRunEnvResponse CreateWxCloudBaseRunEnv(CreateWxCloudBaseRunEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWxCloudBaseRunEnv", CreateWxCloudBaseRunEnvResponse.class);
    }

    /**
     *开通微信云托管MySQL数据库服务
     * @param req CreateWxCloudBaseRunServerDBClusterRequest
     * @return CreateWxCloudBaseRunServerDBClusterResponse
     * @throws TencentCloudSDKException
     */
    public CreateWxCloudBaseRunServerDBClusterResponse CreateWxCloudBaseRunServerDBCluster(CreateWxCloudBaseRunServerDBClusterRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWxCloudBaseRunServerDBCluster", CreateWxCloudBaseRunServerDBClusterResponse.class);
    }

    /**
     *删除云项目
     * @param req DeleteCloudBaseProjectLatestVersionRequest
     * @return DeleteCloudBaseProjectLatestVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudBaseProjectLatestVersionResponse DeleteCloudBaseProjectLatestVersion(DeleteCloudBaseProjectLatestVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudBaseProjectLatestVersion", DeleteCloudBaseProjectLatestVersionResponse.class);
    }

    /**
     *删除服务版本
     * @param req DeleteCloudBaseRunServerVersionRequest
     * @return DeleteCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudBaseRunServerVersionResponse DeleteCloudBaseRunServerVersion(DeleteCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudBaseRunServerVersion", DeleteCloudBaseRunServerVersionResponse.class);
    }

    /**
     *删除终端用户
     * @param req DeleteEndUserRequest
     * @return DeleteEndUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEndUserResponse DeleteEndUser(DeleteEndUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEndUser", DeleteEndUserResponse.class);
    }

    /**
     *删除网关某版本
     * @param req DeleteGatewayVersionRequest
     * @return DeleteGatewayVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatewayVersionResponse DeleteGatewayVersion(DeleteGatewayVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGatewayVersion", DeleteGatewayVersionResponse.class);
    }

    /**
     *删除安全网关路由
     * @param req DeleteWxGatewayRouteRequest
     * @return DeleteWxGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWxGatewayRouteResponse DeleteWxGatewayRoute(DeleteWxGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWxGatewayRoute", DeleteWxGatewayRouteResponse.class);
    }

    /**
     *查询活动信息
     * @param req DescribeActivityInfoRequest
     * @return DescribeActivityInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActivityInfoResponse DescribeActivityInfo(DescribeActivityInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActivityInfo", DescribeActivityInfoResponse.class);
    }

    /**
     *查询活动记录信息
     * @param req DescribeActivityRecordRequest
     * @return DescribeActivityRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeActivityRecordResponse DescribeActivityRecord(DescribeActivityRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeActivityRecord", DescribeActivityRecordResponse.class);
    }

    /**
     *获取安全域名列表
     * @param req DescribeAuthDomainsRequest
     * @return DescribeAuthDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAuthDomainsResponse DescribeAuthDomains(DescribeAuthDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAuthDomains", DescribeAuthDomainsResponse.class);
    }

    /**
     *获取新套餐列表，含详情，如果传了PackageId，则只获取指定套餐详情
     * @param req DescribeBaasPackageListRequest
     * @return DescribeBaasPackageListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBaasPackageListResponse DescribeBaasPackageList(DescribeBaasPackageListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBaasPackageList", DescribeBaasPackageListResponse.class);
    }

    /**
     *获取计费相关信息
     * @param req DescribeBillingInfoRequest
     * @return DescribeBillingInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingInfoResponse DescribeBillingInfo(DescribeBillingInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingInfo", DescribeBillingInfoResponse.class);
    }

    /**
     *查询服务版本的详情
     * @param req DescribeCbrServerVersionRequest
     * @return DescribeCbrServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCbrServerVersionResponse DescribeCbrServerVersion(DescribeCbrServerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCbrServerVersion", DescribeCbrServerVersionResponse.class);
    }

    /**
     *获取云托管代码上传url
     * @param req DescribeCloudBaseBuildServiceRequest
     * @return DescribeCloudBaseBuildServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseBuildServiceResponse DescribeCloudBaseBuildService(DescribeCloudBaseBuildServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseBuildService", DescribeCloudBaseBuildServiceResponse.class);
    }

    /**
     *获取云开发项目列表
     * @param req DescribeCloudBaseProjectLatestVersionListRequest
     * @return DescribeCloudBaseProjectLatestVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseProjectLatestVersionListResponse DescribeCloudBaseProjectLatestVersionList(DescribeCloudBaseProjectLatestVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseProjectLatestVersionList", DescribeCloudBaseProjectLatestVersionListResponse.class);
    }

    /**
     *云项目部署列表
     * @param req DescribeCloudBaseProjectVersionListRequest
     * @return DescribeCloudBaseProjectVersionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseProjectVersionListResponse DescribeCloudBaseProjectVersionList(DescribeCloudBaseProjectVersionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseProjectVersionList", DescribeCloudBaseProjectVersionListResponse.class);
    }

    /**
     *查询环境下所有的vpc列表
     * @param req DescribeCloudBaseRunAllVpcsRequest
     * @return DescribeCloudBaseRunAllVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunAllVpcsResponse DescribeCloudBaseRunAllVpcs(DescribeCloudBaseRunAllVpcsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunAllVpcs", DescribeCloudBaseRunAllVpcsResponse.class);
    }

    /**
     *独立网关中拉取云托管服务对应的配置信息
     * @param req DescribeCloudBaseRunConfForGateWayRequest
     * @return DescribeCloudBaseRunConfForGateWayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunConfForGateWayResponse DescribeCloudBaseRunConfForGateWay(DescribeCloudBaseRunConfForGateWayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunConfForGateWay", DescribeCloudBaseRunConfForGateWayResponse.class);
    }

    /**
     *查询一键部署任务 （特定接口：外部查询使用）
     * @param req DescribeCloudBaseRunOneClickTaskExternalRequest
     * @return DescribeCloudBaseRunOneClickTaskExternalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunOneClickTaskExternalResponse DescribeCloudBaseRunOneClickTaskExternal(DescribeCloudBaseRunOneClickTaskExternalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunOneClickTaskExternal", DescribeCloudBaseRunOneClickTaskExternalResponse.class);
    }

    /**
     *查询服务、版本和操作类型
     * @param req DescribeCloudBaseRunOperationTypesRequest
     * @return DescribeCloudBaseRunOperationTypesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunOperationTypesResponse DescribeCloudBaseRunOperationTypes(DescribeCloudBaseRunOperationTypesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunOperationTypes", DescribeCloudBaseRunOperationTypesResponse.class);
    }

    /**
     *查询云托管服务版本容器列表
     * @param req DescribeCloudBaseRunPodListRequest
     * @return DescribeCloudBaseRunPodListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunPodListResponse DescribeCloudBaseRunPodList(DescribeCloudBaseRunPodListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunPodList", DescribeCloudBaseRunPodListResponse.class);
    }

    /**
     *查看容器托管的集群状态
     * @param req DescribeCloudBaseRunResourceRequest
     * @return DescribeCloudBaseRunResourceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunResourceResponse DescribeCloudBaseRunResource(DescribeCloudBaseRunResourceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunResource", DescribeCloudBaseRunResourceResponse.class);
    }

    /**
     *查看容器托管的集群状态扩展使用
     * @param req DescribeCloudBaseRunResourceForExtendRequest
     * @return DescribeCloudBaseRunResourceForExtendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunResourceForExtendResponse DescribeCloudBaseRunResourceForExtend(DescribeCloudBaseRunResourceForExtendRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunResourceForExtend", DescribeCloudBaseRunResourceForExtendResponse.class);
    }

    /**
     *查询单个服务的详情，版本以及详情
     * @param req DescribeCloudBaseRunServerRequest
     * @return DescribeCloudBaseRunServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunServerResponse DescribeCloudBaseRunServer(DescribeCloudBaseRunServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunServer", DescribeCloudBaseRunServerResponse.class);
    }

    /**
     *查询微信云托管服务域名
     * @param req DescribeCloudBaseRunServerDomainNameRequest
     * @return DescribeCloudBaseRunServerDomainNameResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunServerDomainNameResponse DescribeCloudBaseRunServerDomainName(DescribeCloudBaseRunServerDomainNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunServerDomainName", DescribeCloudBaseRunServerDomainNameResponse.class);
    }

    /**
     *查询服务版本的详情，CPU和MEM  请使用CPUSize和MemSize
     * @param req DescribeCloudBaseRunServerVersionRequest
     * @return DescribeCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunServerVersionResponse DescribeCloudBaseRunServerVersion(DescribeCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunServerVersion", DescribeCloudBaseRunServerVersionResponse.class);
    }

    /**
     *查询服务版本详情(新)
     * @param req DescribeCloudBaseRunVersionRequest
     * @return DescribeCloudBaseRunVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunVersionResponse DescribeCloudBaseRunVersion(DescribeCloudBaseRunVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunVersion", DescribeCloudBaseRunVersionResponse.class);
    }

    /**
     *DescribeCloudBaseRunVersionRsByCondition 获取云托管详情
     * @param req DescribeCloudBaseRunVersionRsByConditionRequest
     * @return DescribeCloudBaseRunVersionRsByConditionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunVersionRsByConditionResponse DescribeCloudBaseRunVersionRsByCondition(DescribeCloudBaseRunVersionRsByConditionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunVersionRsByCondition", DescribeCloudBaseRunVersionRsByConditionResponse.class);
    }

    /**
     *查询版本历史
     * @param req DescribeCloudBaseRunVersionSnapshotRequest
     * @return DescribeCloudBaseRunVersionSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseRunVersionSnapshotResponse DescribeCloudBaseRunVersionSnapshot(DescribeCloudBaseRunVersionSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseRunVersionSnapshot", DescribeCloudBaseRunVersionSnapshotResponse.class);
    }

    /**
     *根据用户传入的指标, 拉取一段时间内的监控数据。
     * @param req DescribeCurveDataRequest
     * @return DescribeCurveDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurveDataResponse DescribeCurveData(DescribeCurveDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCurveData", DescribeCurveDataResponse.class);
    }

    /**
     *获取数据库权限
     * @param req DescribeDatabaseACLRequest
     * @return DescribeDatabaseACLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatabaseACLResponse DescribeDatabaseACL(DescribeDatabaseACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatabaseACL", DescribeDatabaseACLResponse.class);
    }

    /**
     *获取下载文件信息
     * @param req DescribeDownloadFileRequest
     * @return DescribeDownloadFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDownloadFileResponse DescribeDownloadFile(DescribeDownloadFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDownloadFile", DescribeDownloadFileResponse.class);
    }

    /**
     *获取环境终端用户新增与登录信息
     * @param req DescribeEndUserLoginStatisticRequest
     * @return DescribeEndUserLoginStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndUserLoginStatisticResponse DescribeEndUserLoginStatistic(DescribeEndUserLoginStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndUserLoginStatistic", DescribeEndUserLoginStatisticResponse.class);
    }

    /**
     *获取终端用户总量与平台分布情况
     * @param req DescribeEndUserStatisticRequest
     * @return DescribeEndUserStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndUserStatisticResponse DescribeEndUserStatistic(DescribeEndUserStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndUserStatistic", DescribeEndUserStatisticResponse.class);
    }

    /**
     *获取终端用户列表
     * @param req DescribeEndUsersRequest
     * @return DescribeEndUsersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEndUsersResponse DescribeEndUsers(DescribeEndUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEndUsers", DescribeEndUsersResponse.class);
    }

    /**
     *获取环境下单地域
     * @param req DescribeEnvDealRegionRequest
     * @return DescribeEnvDealRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvDealRegionResponse DescribeEnvDealRegion(DescribeEnvDealRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvDealRegion", DescribeEnvDealRegionResponse.class);
    }

    /**
     *查询后付费免费配额信息
     * @param req DescribeEnvFreeQuotaRequest
     * @return DescribeEnvFreeQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvFreeQuotaResponse DescribeEnvFreeQuota(DescribeEnvFreeQuotaRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvFreeQuota", DescribeEnvFreeQuotaResponse.class);
    }

    /**
     *查询环境个数上限
     * @param req DescribeEnvLimitRequest
     * @return DescribeEnvLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvLimitResponse DescribeEnvLimit(DescribeEnvLimitRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvLimit", DescribeEnvLimitResponse.class);
    }

    /**
     *查询环境后付费计费详情
     * @param req DescribeEnvPostpaidDeductRequest
     * @return DescribeEnvPostpaidDeductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvPostpaidDeductResponse DescribeEnvPostpaidDeduct(DescribeEnvPostpaidDeductRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvPostpaidDeduct", DescribeEnvPostpaidDeductResponse.class);
    }

    /**
     *获取环境列表，含环境下的各个资源信息。尤其是各资源的唯一标识，是请求各资源的关键参数
     * @param req DescribeEnvsRequest
     * @return DescribeEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvsResponse DescribeEnvs(DescribeEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvs", DescribeEnvsResponse.class);
    }

    /**
     *描述扩展上传文件信息
     * @param req DescribeExtensionUploadInfoRequest
     * @return DescribeExtensionUploadInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtensionUploadInfoResponse DescribeExtensionUploadInfo(DescribeExtensionUploadInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtensionUploadInfo", DescribeExtensionUploadInfoResponse.class);
    }

    /**
     *获取增值包计费相关信息
     * @param req DescribeExtraPkgBillingInfoRequest
     * @return DescribeExtraPkgBillingInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExtraPkgBillingInfoResponse DescribeExtraPkgBillingInfo(DescribeExtraPkgBillingInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExtraPkgBillingInfo", DescribeExtraPkgBillingInfoResponse.class);
    }

    /**
     *查询网关监控数据
     * @param req DescribeGatewayCurveDataRequest
     * @return DescribeGatewayCurveDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayCurveDataResponse DescribeGatewayCurveData(DescribeGatewayCurveDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayCurveData", DescribeGatewayCurveDataResponse.class);
    }

    /**
     *查询网关版本信息
暂不鉴权
     * @param req DescribeGatewayVersionsRequest
     * @return DescribeGatewayVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayVersionsResponse DescribeGatewayVersions(DescribeGatewayVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayVersions", DescribeGatewayVersionsResponse.class);
    }

    /**
     *根据用户传入的指标, 拉取一段时间内的监控数据。
     * @param req DescribeGraphDataRequest
     * @return DescribeGraphDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGraphDataResponse DescribeGraphData(DescribeGraphDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGraphData", DescribeGraphDataResponse.class);
    }

    /**
     *查询静态托管域名任务状态
     * @param req DescribeHostingDomainTaskRequest
     * @return DescribeHostingDomainTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostingDomainTaskResponse DescribeHostingDomainTask(DescribeHostingDomainTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHostingDomainTask", DescribeHostingDomainTaskResponse.class);
    }

    /**
     *查询后付费资源免费量
     * @param req DescribePostpayFreeQuotasRequest
     * @return DescribePostpayFreeQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpayFreeQuotasResponse DescribePostpayFreeQuotas(DescribePostpayFreeQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostpayFreeQuotas", DescribePostpayFreeQuotasResponse.class);
    }

    /**
     *获取后付费免费额度
     * @param req DescribePostpayPackageFreeQuotasRequest
     * @return DescribePostpayPackageFreeQuotasResponse
     * @throws TencentCloudSDKException
     */
    public DescribePostpayPackageFreeQuotasResponse DescribePostpayPackageFreeQuotas(DescribePostpayPackageFreeQuotasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePostpayPackageFreeQuotas", DescribePostpayPackageFreeQuotasResponse.class);
    }

    /**
     *查询指定指标的配额使用量
     * @param req DescribeQuotaDataRequest
     * @return DescribeQuotaDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeQuotaDataResponse DescribeQuotaData(DescribeQuotaDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeQuotaData", DescribeQuotaDataResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSmsQuotas", DescribeSmsQuotasResponse.class);
    }

    /**
     *查询环境1分钱抵扣信息
     * @param req DescribeSpecialCostItemsRequest
     * @return DescribeSpecialCostItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecialCostItemsResponse DescribeSpecialCostItems(DescribeSpecialCostItemsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSpecialCostItems", DescribeSpecialCostItemsResponse.class);
    }

    /**
     *本接口（DescribeStandaloneGateway）查询小租户网关套餐信息。
     * @param req DescribeStandaloneGatewayRequest
     * @return DescribeStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandaloneGatewayResponse DescribeStandaloneGateway(DescribeStandaloneGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStandaloneGateway", DescribeStandaloneGatewayResponse.class);
    }

    /**
     *本接口（DescribeStandaloneGatewayPackage）用于查询小租户网关套餐信息。
     * @param req DescribeStandaloneGatewayPackageRequest
     * @return DescribeStandaloneGatewayPackageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStandaloneGatewayPackageResponse DescribeStandaloneGatewayPackage(DescribeStandaloneGatewayPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStandaloneGatewayPackage", DescribeStandaloneGatewayPackageResponse.class);
    }

    /**
     *查询用户活动信息
     * @param req DescribeUserActivityInfoRequest
     * @return DescribeUserActivityInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserActivityInfoResponse DescribeUserActivityInfo(DescribeUserActivityInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserActivityInfo", DescribeUserActivityInfoResponse.class);
    }

    /**
     *查询微信云托管环境信息
     * @param req DescribeWxCloudBaseRunEnvsRequest
     * @return DescribeWxCloudBaseRunEnvsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWxCloudBaseRunEnvsResponse DescribeWxCloudBaseRunEnvs(DescribeWxCloudBaseRunEnvsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWxCloudBaseRunEnvs", DescribeWxCloudBaseRunEnvsResponse.class);
    }

    /**
     *查询微信云托管子网
     * @param req DescribeWxCloudBaseRunSubNetsRequest
     * @return DescribeWxCloudBaseRunSubNetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWxCloudBaseRunSubNetsResponse DescribeWxCloudBaseRunSubNets(DescribeWxCloudBaseRunSubNetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWxCloudBaseRunSubNets", DescribeWxCloudBaseRunSubNetsResponse.class);
    }

    /**
     *查看安全网关路由
     * @param req DescribeWxGatewayRoutesRequest
     * @return DescribeWxGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWxGatewayRoutesResponse DescribeWxGatewayRoutes(DescribeWxGatewayRoutesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWxGatewayRoutes", DescribeWxGatewayRoutesResponse.class);
    }

    /**
     *查看安全网关
     * @param req DescribeWxGatewaysRequest
     * @return DescribeWxGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWxGatewaysResponse DescribeWxGateways(DescribeWxGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWxGateways", DescribeWxGatewaysResponse.class);
    }

    /**
     *销毁环境
     * @param req DestroyEnvRequest
     * @return DestroyEnvResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvResponse DestroyEnv(DestroyEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyEnv", DestroyEnvResponse.class);
    }

    /**
     *本接口（DestroyStandaloneGateway）用于销毁小租户网关。
     * @param req DestroyStandaloneGatewayRequest
     * @return DestroyStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DestroyStandaloneGatewayResponse DestroyStandaloneGateway(DestroyStandaloneGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyStandaloneGateway", DestroyStandaloneGatewayResponse.class);
    }

    /**
     *销毁静态托管资源，该接口创建异步销毁任务，资源最终状态可从DestroyStaticStore接口查看
     * @param req DestroyStaticStoreRequest
     * @return DestroyStaticStoreResponse
     * @throws TencentCloudSDKException
     */
    public DestroyStaticStoreResponse DestroyStaticStore(DestroyStaticStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyStaticStore", DestroyStaticStoreResponse.class);
    }

    /**
     *创建云应用服务
     * @param req EstablishCloudBaseRunServerRequest
     * @return EstablishCloudBaseRunServerResponse
     * @throws TencentCloudSDKException
     */
    public EstablishCloudBaseRunServerResponse EstablishCloudBaseRunServer(EstablishCloudBaseRunServerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EstablishCloudBaseRunServer", EstablishCloudBaseRunServerResponse.class);
    }

    /**
     *创建或修改安全网关路由
     * @param req EstablishWxGatewayRouteRequest
     * @return EstablishWxGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public EstablishWxGatewayRouteResponse EstablishWxGatewayRoute(EstablishWxGatewayRouteRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EstablishWxGatewayRoute", EstablishWxGatewayRouteResponse.class);
    }

    /**
     *批量冻结
     * @param req FreezeCloudBaseRunServersRequest
     * @return FreezeCloudBaseRunServersResponse
     * @throws TencentCloudSDKException
     */
    public FreezeCloudBaseRunServersResponse FreezeCloudBaseRunServers(FreezeCloudBaseRunServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "FreezeCloudBaseRunServers", FreezeCloudBaseRunServersResponse.class);
    }

    /**
     *修改容器内的版本流量配置
     * @param req ModifyCloudBaseRunServerFlowConfRequest
     * @return ModifyCloudBaseRunServerFlowConfResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudBaseRunServerFlowConfResponse ModifyCloudBaseRunServerFlowConf(ModifyCloudBaseRunServerFlowConfRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudBaseRunServerFlowConf", ModifyCloudBaseRunServerFlowConfResponse.class);
    }

    /**
     *修改服务版本的副本数，环境变量
     * @param req ModifyCloudBaseRunServerVersionRequest
     * @return ModifyCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudBaseRunServerVersionResponse ModifyCloudBaseRunServerVersion(ModifyCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudBaseRunServerVersion", ModifyCloudBaseRunServerVersionResponse.class);
    }

    /**
     *修改日志主题
     * @param req ModifyClsTopicRequest
     * @return ModifyClsTopicResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClsTopicResponse ModifyClsTopic(ModifyClsTopicRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyClsTopic", ModifyClsTopicResponse.class);
    }

    /**
     *修改数据库权限
     * @param req ModifyDatabaseACLRequest
     * @return ModifyDatabaseACLResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDatabaseACLResponse ModifyDatabaseACL(ModifyDatabaseACLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDatabaseACL", ModifyDatabaseACLResponse.class);
    }

    /**
     *管理终端用户
     * @param req ModifyEndUserRequest
     * @return ModifyEndUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEndUserResponse ModifyEndUser(ModifyEndUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEndUser", ModifyEndUserResponse.class);
    }

    /**
     *更新环境信息
     * @param req ModifyEnvRequest
     * @return ModifyEnvResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvResponse ModifyEnv(ModifyEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnv", ModifyEnvResponse.class);
    }

    /**
     *设置网关版本的流量比例
     * @param req ModifyGatewayVersionTrafficRequest
     * @return ModifyGatewayVersionTrafficResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayVersionTrafficResponse ModifyGatewayVersionTraffic(ModifyGatewayVersionTrafficRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyGatewayVersionTraffic", ModifyGatewayVersionTrafficResponse.class);
    }

    /**
     *针对已隔离的免费环境，可以通过本接口将其恢复访问。
     * @param req ReinstateEnvRequest
     * @return ReinstateEnvResponse
     * @throws TencentCloudSDKException
     */
    public ReinstateEnvResponse ReinstateEnv(ReinstateEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReinstateEnv", ReinstateEnvResponse.class);
    }

    /**
     *更新活动详情
     * @param req ReplaceActivityRecordRequest
     * @return ReplaceActivityRecordResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceActivityRecordResponse ReplaceActivityRecord(ReplaceActivityRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReplaceActivityRecord", ReplaceActivityRecordResponse.class);
    }

    /**
     *针对特定的版本，进行滚动更新
     * @param req RollUpdateCloudBaseRunServerVersionRequest
     * @return RollUpdateCloudBaseRunServerVersionResponse
     * @throws TencentCloudSDKException
     */
    public RollUpdateCloudBaseRunServerVersionResponse RollUpdateCloudBaseRunServerVersion(RollUpdateCloudBaseRunServerVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RollUpdateCloudBaseRunServerVersion", RollUpdateCloudBaseRunServerVersionResponse.class);
    }

    /**
     *搜索CLS日志，TCB角色密钥访问
     * @param req SearchClsLogRequest
     * @return SearchClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchClsLogResponse SearchClsLog(SearchClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClsLog", SearchClsLogResponse.class);
    }

    /**
     *本接口（TurnOffStandaloneGateway）用于关闭小租户网关。
     * @param req TurnOffStandaloneGatewayRequest
     * @return TurnOffStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public TurnOffStandaloneGatewayResponse TurnOffStandaloneGateway(TurnOffStandaloneGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TurnOffStandaloneGateway", TurnOffStandaloneGatewayResponse.class);
    }

    /**
     *本接口（TurnOnStandaloneGateway）用于开启小租户网关。
     * @param req TurnOnStandaloneGatewayRequest
     * @return TurnOnStandaloneGatewayResponse
     * @throws TencentCloudSDKException
     */
    public TurnOnStandaloneGatewayResponse TurnOnStandaloneGateway(TurnOnStandaloneGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TurnOnStandaloneGateway", TurnOnStandaloneGatewayResponse.class);
    }

    /**
     *批量解冻服务
     * @param req UnfreezeCloudBaseRunServersRequest
     * @return UnfreezeCloudBaseRunServersResponse
     * @throws TencentCloudSDKException
     */
    public UnfreezeCloudBaseRunServersResponse UnfreezeCloudBaseRunServers(UnfreezeCloudBaseRunServersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UnfreezeCloudBaseRunServers", UnfreezeCloudBaseRunServersResponse.class);
    }

}
