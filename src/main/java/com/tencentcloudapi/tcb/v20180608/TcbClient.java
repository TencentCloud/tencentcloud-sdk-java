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

}
