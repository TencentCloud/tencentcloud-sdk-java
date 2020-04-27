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
        try {
                Type type = new TypeToken<JsonResponseModel<CheckTcbServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CheckTcbService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CommonServiceAPIResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CommonServiceAPI"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAuthDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateAuthDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHostingDomainResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateHostingDomain"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStaticStoreResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateStaticStore"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteEndUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteEndUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAuthDomainsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAuthDomains"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDatabaseACLResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDatabaseACL"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEndUsersResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEndUsers"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvFreeQuotaResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEnvFreeQuota"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvLimitResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEnvLimit"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEnvsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeEnvs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeQuotaDataResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeQuotaData"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyStaticStoreResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DestroyStaticStore"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDatabaseACLResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDatabaseACL"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
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
        try {
                Type type = new TypeToken<JsonResponseModel<ReinstateEnvResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ReinstateEnv"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
