/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
     *绑定云开发自定义域名，用于云接入和静态托管
     * @param req BindCloudBaseAccessDomainRequest
     * @return BindCloudBaseAccessDomainResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudBaseAccessDomainResponse BindCloudBaseAccessDomain(BindCloudBaseAccessDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudBaseAccessDomain", BindCloudBaseAccessDomainResponse.class);
    }

    /**
     *绑定自定义域名
     * @param req BindCloudBaseGWDomainRequest
     * @return BindCloudBaseGWDomainResponse
     * @throws TencentCloudSDKException
     */
    public BindCloudBaseGWDomainResponse BindCloudBaseGWDomain(BindCloudBaseGWDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BindCloudBaseGWDomain", BindCloudBaseGWDomainResponse.class);
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
     *增加安全域名。
云开发会校验网页应用请求的来源域名，您需要将来源域名加入到WEB安全域名列表中。
可以通过接口 [DescribeAuthDomains](https://cloud.tencent.com/document/product/876/42151) 获取当前已绑定生效的安全域名。

注意⚠️
  安全域名绑定成功之后，需要几分钟时间逐步生效。
     * @param req CreateAuthDomainRequest
     * @return CreateAuthDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateAuthDomainResponse CreateAuthDomain(CreateAuthDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAuthDomain", CreateAuthDomainResponse.class);
    }

    /**
     *创建云开发产品计费订单，用于以下几种场景：
1. 购买云开发环境
2. 续费云开发环境
3. 变更云开发环境套餐
4. 购买云开发资源包
5. 购买云开发大促包

该接口支持下单并支付(CreateAndPay=true时)，此时会自动在腾讯云账户中扣除余额（余额不足会下单失败）。
该接口支持自动扣除代金券（AutoVoucher=true时），符合条件的代金券会被自动扣除。
     * @param req CreateBillDealRequest
     * @return CreateBillDealResponse
     * @throws TencentCloudSDKException
     */
    public CreateBillDealResponse CreateBillDeal(CreateBillDealRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBillDeal", CreateBillDealResponse.class);
    }

    /**
     *创建云开发网关API
     * @param req CreateCloudBaseGWAPIRequest
     * @return CreateCloudBaseGWAPIResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudBaseGWAPIResponse CreateCloudBaseGWAPI(CreateCloudBaseGWAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudBaseGWAPI", CreateCloudBaseGWAPIResponse.class);
    }

    /**
     *本接口用于购买云开发环境。
该接口会自动下单并支付，会在腾讯云账户中扣除余额（余额不足会下单失败）。
该接口支持自动扣除代金券（AutoVoucher=true时），符合条件的代金券会被自动扣除。
环境下单成功之后会返回EnvId。EnvId是全局唯一表示。
环境发货是异步行为，后续可以通过接口 [DescribeEnvs ](https://cloud.tencent.com/document/product/876/34820) 查询环境状态和各项资源信息；通过 [DescribeBillingInfo](https://cloud.tencent.com/document/product/876/94390) 查询环境套餐信息，包括 到期时间、当前套餐等。
     * @param req CreateEnvRequest
     * @return CreateEnvResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnvResponse CreateEnv(CreateEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnv", CreateEnvResponse.class);
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
     *开通Mysql

开通后，可通过 [DescribeCreateMySQLResult ](https://cloud.tencent.com/document/api/876/128185) 查询开通结果
     * @param req CreateMySQLRequest
     * @return CreateMySQLResponse
     * @throws TencentCloudSDKException
     */
    public CreateMySQLResponse CreateMySQL(CreateMySQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateMySQL", CreateMySQLResponse.class);
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
     *本接口(CreateTable)用于创建表，支持创建capped类型集合，暂时不支持分片表
     * @param req CreateTableRequest
     * @return CreateTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateTableResponse CreateTable(CreateTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTable", CreateTableResponse.class);
    }

    /**
     *创建tcb用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateUser", CreateUserResponse.class);
    }

    /**
     *删除合法域名。
云开发会校验网页应用请求的来源域名，您需要将来源域名加入到WEB安全域名列表中。
可以通过接口 [DescribeAuthDomains](https://cloud.tencent.com/document/product/876/42151) 获取当前已绑定生效的安全域名。

注意⚠️
安全域名被删除之后，可能会引起跨域问题，请谨慎操作。
     * @param req DeleteAuthDomainRequest
     * @return DeleteAuthDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAuthDomainResponse DeleteAuthDomain(DeleteAuthDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAuthDomain", DeleteAuthDomainResponse.class);
    }

    /**
     *删除网关API
     * @param req DeleteCloudBaseGWAPIRequest
     * @return DeleteCloudBaseGWAPIResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudBaseGWAPIResponse DeleteCloudBaseGWAPI(DeleteCloudBaseGWAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudBaseGWAPI", DeleteCloudBaseGWAPIResponse.class);
    }

    /**
     *删除网关域名
     * @param req DeleteCloudBaseGWDomainRequest
     * @return DeleteCloudBaseGWDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudBaseGWDomainResponse DeleteCloudBaseGWDomain(DeleteCloudBaseGWDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudBaseGWDomain", DeleteCloudBaseGWDomainResponse.class);
    }

    /**
     *本接口(DeleteTable)用于删除表，删除表后表中数据将会被删除且无法恢复，请谨慎操作
     * @param req DeleteTableRequest
     * @return DeleteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTableResponse DeleteTable(DeleteTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTable", DeleteTableResponse.class);
    }

    /**
     *删除tcb用户
     * @param req DeleteUsersRequest
     * @return DeleteUsersResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUsersResponse DeleteUsers(DeleteUsersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUsers", DeleteUsersResponse.class);
    }

    /**
     *本接口用于获取当前环境的安全域名列表。
云开发会校验网页应用请求的来源域名，您需要将来源域名加入到WEB安全域名列表中。
可以通过接口 [CreateAuthDomain](https://cloud.tencent.com/document/product/876/42764) 增加安全域名。
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
     *获取网关API列表
     * @param req DescribeCloudBaseGWAPIRequest
     * @return DescribeCloudBaseGWAPIResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseGWAPIResponse DescribeCloudBaseGWAPI(DescribeCloudBaseGWAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseGWAPI", DescribeCloudBaseGWAPIResponse.class);
    }

    /**
     *获取网关服务
     * @param req DescribeCloudBaseGWServiceRequest
     * @return DescribeCloudBaseGWServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCloudBaseGWServiceResponse DescribeCloudBaseGWService(DescribeCloudBaseGWServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCloudBaseGWService", DescribeCloudBaseGWServiceResponse.class);
    }

    /**
     *查询开通Mysql结果，`Response.Data.Status = "notexist"` 表示未开通，如果未开通，可以调用 [CreateMySQL](https://cloud.tencent.com/document/api/876/128186) 来开通
 `Response.Data. Status = "success"` 表示开通成功，Mysql开通成功后，可通过接口设置数据库账号相关功能包括但不限于【创建账号、删除账号、查询可授权权限列表、查询账号已有权限、修改主机、修改配置、修改账号库表权限】、集群操作相关【查询集群参数、修改集群参数】，连接设置相关【关闭外网、开通外网、查询集群信息】，备份回档相关【创建手动回档、删除手动回档、修改自动备份配置信息、查询备份文件列表、集群回档、查询任务列表、获取table列表、获取集群数据库列表、查询备份下载地址】，相关功能接口文档：[TDSQL-C MySQL API文档](https://cloud.tencent.com/document/product/1003/48106)
     * @param req DescribeCreateMySQLResultRequest
     * @return DescribeCreateMySQLResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCreateMySQLResultResponse DescribeCreateMySQLResult(DescribeCreateMySQLResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCreateMySQLResult", DescribeCreateMySQLResultResponse.class);
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
     *查询环境计费周期。
云开发环境的资源点都是按月结算的，每个月都有一定的抵扣额度。

例如：
  某个环境在 2026-01-05 购买了3个月个人版(到期时间: 2026-04-05)，则他可以在以下3个周期内，分别享有40000资源点的额度：
  1. 2026-01-05 ~ 2026-02-05 23:59:59
  2. 2026-02-06 ~ 2026-03-05 23:59:59
  3. 2026-03-06 ~ 2026-04-05 23:59:59

本接口，用于获取环境当前属于哪个计费周期内。
     * @param req DescribeEnvAccountCircleRequest
     * @return DescribeEnvAccountCircleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnvAccountCircleResponse DescribeEnvAccountCircle(DescribeEnvAccountCircleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnvAccountCircle", DescribeEnvAccountCircleResponse.class);
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
     *查询Mysql集群信息

调用该接口前需要先查询Mysql是否开通，可通过 [DescribeCreateMySQLResult ](https://cloud.tencent.com/document/api/876/128185) 查询，只有已开通的才能查到集群信息
     * @param req DescribeMySQLClusterDetailRequest
     * @return DescribeMySQLClusterDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMySQLClusterDetailResponse DescribeMySQLClusterDetail(DescribeMySQLClusterDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMySQLClusterDetail", DescribeMySQLClusterDetailResponse.class);
    }

    /**
     *查询Mysql任务状态
     * @param req DescribeMySQLTaskStatusRequest
     * @return DescribeMySQLTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMySQLTaskStatusResponse DescribeMySQLTaskStatus(DescribeMySQLTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMySQLTaskStatus", DescribeMySQLTaskStatusResponse.class);
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
     *查询数据库安全规则。
安全规则，用于控制C端用户的访问权限。详见 [安全规则介绍](https://cloud.tencent.com/document/product/876/123478) 。
     * @param req DescribeSafeRuleRequest
     * @return DescribeSafeRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafeRuleResponse DescribeSafeRule(DescribeSafeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafeRule", DescribeSafeRuleResponse.class);
    }

    /**
     *查看当前环境下静态托管资源信息，根据返回结果判断静态资源的状态
     * @param req DescribeStaticStoreRequest
     * @return DescribeStaticStoreResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStaticStoreResponse DescribeStaticStore(DescribeStaticStoreRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStaticStore", DescribeStaticStoreResponse.class);
    }

    /**
     *查询表的相关信息，包括索引等信息
     * @param req DescribeTableRequest
     * @return DescribeTableResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTableResponse DescribeTable(DescribeTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTable", DescribeTableResponse.class);
    }

    /**
     *本接口(ListTables)用于查询所有表信息，包括表名、表中数据条数、表中数据量、索引个数及索引的大小等
     * @param req DescribeTablesRequest
     * @return DescribeTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTablesResponse DescribeTables(DescribeTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTables", DescribeTablesResponse.class);
    }

    /**
     *查询tcb用户列表
     * @param req DescribeUserListRequest
     * @return DescribeUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserListResponse DescribeUserList(DescribeUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserList", DescribeUserListResponse.class);
    }

    /**
     *本接口用于销毁云开发环境。
云开发环境遵循腾讯云包年包月预付费产品生命周期，因此环境销毁需要分两步：
1. 资源退费。此时会根据当前环境剩余有效期，自动退还相关费用(代金券不退)。退款后，环境进入隔离期。
2. 环境删除。环境在进入隔离期后15天会自动删除。也可以通过本接口，指定 IsForce=true 来强制删除隔离期环境。

**注意**⚠️
  1. 环境退费后进入隔离期，则所有资源均无法访问，控制台无法操作和管理。
  2. 环境被彻底删除后，所有数据均无法找回。请谨慎操作。

可以通过接口 [tcb:DescribeBillingInfo](https://cloud.tencent.com/document/product/876/94390) 查询环境计费状态。
     * @param req DestroyEnvRequest
     * @return DestroyEnvResponse
     * @throws TencentCloudSDKException
     */
    public DestroyEnvResponse DestroyEnv(DestroyEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyEnv", DestroyEnvResponse.class);
    }

    /**
     *销毁Mysql

销毁后可以通过 [DescribeMySQLTaskStatus](https://cloud.tencent.com/document/api/876/128183) 接口查询销毁结果，如果 `Response.Data. Status = FAILED ` 表示销毁失败，可以重新调用销毁接口重试
     * @param req DestroyMySQLRequest
     * @return DestroyMySQLResponse
     * @throws TencentCloudSDKException
     */
    public DestroyMySQLResponse DestroyMySQL(DestroyMySQLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DestroyMySQL", DestroyMySQLResponse.class);
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
     *修改登录配置
     * @param req EditAuthConfigRequest
     * @return EditAuthConfigResponse
     * @throws TencentCloudSDKException
     */
    public EditAuthConfigResponse EditAuthConfig(EditAuthConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "EditAuthConfig", EditAuthConfigResponse.class);
    }

    /**
     *本接口(ListTables)用于查询所有表信息，包括表名、表中数据条数、表中数据量、索引个数及索引的大小等
     * @param req ListTablesRequest
     * @return ListTablesResponse
     * @throws TencentCloudSDKException
     */
    public ListTablesResponse ListTables(ListTablesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTables", ListTablesResponse.class);
    }

    /**
     *修改云开发网关API
     * @param req ModifyCloudBaseGWAPIRequest
     * @return ModifyCloudBaseGWAPIResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCloudBaseGWAPIResponse ModifyCloudBaseGWAPI(ModifyCloudBaseGWAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCloudBaseGWAPI", ModifyCloudBaseGWAPIResponse.class);
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
     *本接口用于变更云开发环境套餐。
该接口会自动下单并支付，会在腾讯云账户中扣除余额（余额不足会下单失败）。
该接口支持自动扣除代金券（AutoVoucher=true时），符合条件的代金券会被自动扣除。
     * @param req ModifyEnvPlanRequest
     * @return ModifyEnvPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyEnvPlanResponse ModifyEnvPlan(ModifyEnvPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyEnvPlan", ModifyEnvPlanResponse.class);
    }

    /**
     *设置数据库安全规则。
安全规则，用于控制C端用户的访问权限。详见 [安全规则介绍 ](https://cloud.tencent.com/document/product/876/123478)。
     * @param req ModifySafeRuleRequest
     * @return ModifySafeRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifySafeRuleResponse ModifySafeRule(ModifySafeRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySafeRule", ModifySafeRuleResponse.class);
    }

    /**
     *修改tcb用户
     * @param req ModifyUserRequest
     * @return ModifyUserResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserResponse ModifyUser(ModifyUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUser", ModifyUserResponse.class);
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
     *本接口用于云开发环境套餐续费。
该接口会自动下单并支付，会在腾讯云账户中扣除余额（余额不足会下单失败）。
该接口支持自动扣除代金券（AutoVoucher=true时），符合条件的代金券会被自动扣除。
     * @param req RenewEnvRequest
     * @return RenewEnvResponse
     * @throws TencentCloudSDKException
     */
    public RenewEnvResponse RenewEnv(RenewEnvRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RenewEnv", RenewEnvResponse.class);
    }

    /**
     *本接口用于执行数据库命令
     * @param req RunCommandsRequest
     * @return RunCommandsResponse
     * @throws TencentCloudSDKException
     */
    public RunCommandsResponse RunCommands(RunCommandsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunCommands", RunCommandsResponse.class);
    }

    /**
     *执行SQL语句

调用该接口前需要先查询Mysql是否开通，可通过 [DescribeCreateMySQLResult ](https://cloud.tencent.com/document/api/876/128185) 查询，只有开通成功才能操作
     * @param req RunSqlRequest
     * @return RunSqlResponse
     * @throws TencentCloudSDKException
     */
    public RunSqlResponse RunSql(RunSqlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RunSql", RunSqlResponse.class);
    }

    /**
     *搜索用户调用日志
     * @param req SearchClsLogRequest
     * @return SearchClsLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchClsLogResponse SearchClsLog(SearchClsLogRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SearchClsLog", SearchClsLogResponse.class);
    }

    /**
     *本接口(UpdateTable)用于修改表信息，当前可以支持创建和删除索引
     * @param req UpdateTableRequest
     * @return UpdateTableResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTableResponse UpdateTable(UpdateTableRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateTable", UpdateTableResponse.class);
    }

}
