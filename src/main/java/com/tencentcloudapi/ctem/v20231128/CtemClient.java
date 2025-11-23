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
package com.tencentcloudapi.ctem.v20231128;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ctem.v20231128.models.*;

public class CtemClient extends AbstractClient{
    private static String endpoint = "ctem.tencentcloudapi.com";
    private static String service = "ctem";
    private static String version = "2023-11-28";

    public CtemClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CtemClient(Credential credential, String region, ClientProfile profile) {
        super(CtemClient.endpoint, CtemClient.version, credential, region, profile);
    }

    /**
     *添加APP资产
     * @param req CreateAppRequest
     * @return CreateAppResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppResponse CreateApp(CreateAppRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateApp", CreateAppResponse.class);
    }

    /**
     *添加主机资产
     * @param req CreateAssetRequest
     * @return CreateAssetResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssetResponse CreateAsset(CreateAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAsset", CreateAssetResponse.class);
    }

    /**
     *创建企业
     * @param req CreateCustomerRequest
     * @return CreateCustomerResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomerResponse CreateCustomer(CreateCustomerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCustomer", CreateCustomerResponse.class);
    }

    /**
     *添加主域名数据
     * @param req CreateDomainRequest
     * @return CreateDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainResponse CreateDomain(CreateDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomain", CreateDomainResponse.class);
    }

    /**
     *添加企业架构资产
     * @param req CreateEnterpriseRequest
     * @return CreateEnterpriseResponse
     * @throws TencentCloudSDKException
     */
    public CreateEnterpriseResponse CreateEnterprise(CreateEnterpriseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEnterprise", CreateEnterpriseResponse.class);
    }

    /**
     *添加网站资产
     * @param req CreateHttpRequest
     * @return CreateHttpResponse
     * @throws TencentCloudSDKException
     */
    public CreateHttpResponse CreateHttp(CreateHttpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateHttp", CreateHttpResponse.class);
    }

    /**
     *启动测绘
     * @param req CreateJobRecordRequest
     * @return CreateJobRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobRecordResponse CreateJobRecord(CreateJobRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateJobRecord", CreateJobRecordResponse.class);
    }

    /**
     *添加后台数据
     * @param req CreateManageRequest
     * @return CreateManageResponse
     * @throws TencentCloudSDKException
     */
    public CreateManageResponse CreateManage(CreateManageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateManage", CreateManageResponse.class);
    }

    /**
     *添加端口服务资产
     * @param req CreatePortRequest
     * @return CreatePortResponse
     * @throws TencentCloudSDKException
     */
    public CreatePortResponse CreatePort(CreatePortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreatePort", CreatePortResponse.class);
    }

    /**
     *创建种子
     * @param req CreateSeedsRequest
     * @return CreateSeedsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSeedsResponse CreateSeeds(CreateSeedsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSeeds", CreateSeedsResponse.class);
    }

    /**
     *添加子域名数据
     * @param req CreateSubDomainRequest
     * @return CreateSubDomainResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubDomainResponse CreateSubDomain(CreateSubDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSubDomain", CreateSubDomainResponse.class);
    }

    /**
     *添加影子资产
     * @param req CreateSuspiciousAssetRequest
     * @return CreateSuspiciousAssetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSuspiciousAssetResponse CreateSuspiciousAsset(CreateSuspiciousAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateSuspiciousAsset", CreateSuspiciousAssetResponse.class);
    }

    /**
     *添加微信小程序资产
     * @param req CreateWechatAppletRequest
     * @return CreateWechatAppletResponse
     * @throws TencentCloudSDKException
     */
    public CreateWechatAppletResponse CreateWechatApplet(CreateWechatAppletRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWechatApplet", CreateWechatAppletResponse.class);
    }

    /**
     *添加微信公众号资产
     * @param req CreateWechatOfficialAccountRequest
     * @return CreateWechatOfficialAccountResponse
     * @throws TencentCloudSDKException
     */
    public CreateWechatOfficialAccountResponse CreateWechatOfficialAccount(CreateWechatOfficialAccountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateWechatOfficialAccount", CreateWechatOfficialAccountResponse.class);
    }

    /**
     *删除APP数据
     * @param req DeleteAppsRequest
     * @return DeleteAppsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAppsResponse DeleteApps(DeleteAppsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApps", DeleteAppsResponse.class);
    }

    /**
     *删除主机资产数据
     * @param req DeleteAssetsRequest
     * @return DeleteAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssetsResponse DeleteAssets(DeleteAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAssets", DeleteAssetsResponse.class);
    }

    /**
     *删除主域名数据
     * @param req DeleteDomainsRequest
     * @return DeleteDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainsResponse DeleteDomains(DeleteDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomains", DeleteDomainsResponse.class);
    }

    /**
     *删除企业架构数据
     * @param req DeleteEnterprisesRequest
     * @return DeleteEnterprisesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteEnterprisesResponse DeleteEnterprises(DeleteEnterprisesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteEnterprises", DeleteEnterprisesResponse.class);
    }

    /**
     *删除网站资产数据
     * @param req DeleteHttpsRequest
     * @return DeleteHttpsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHttpsResponse DeleteHttps(DeleteHttpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteHttps", DeleteHttpsResponse.class);
    }

    /**
     *删除后台数据
     * @param req DeleteManagesRequest
     * @return DeleteManagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteManagesResponse DeleteManages(DeleteManagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteManages", DeleteManagesResponse.class);
    }

    /**
     *删除端口数据
     * @param req DeletePortsRequest
     * @return DeletePortsResponse
     * @throws TencentCloudSDKException
     */
    public DeletePortsResponse DeletePorts(DeletePortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeletePorts", DeletePortsResponse.class);
    }

    /**
     *删除种子
     * @param req DeleteSeedsRequest
     * @return DeleteSeedsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSeedsResponse DeleteSeeds(DeleteSeedsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSeeds", DeleteSeedsResponse.class);
    }

    /**
     *删除子域名数据
     * @param req DeleteSubDomainsRequest
     * @return DeleteSubDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubDomainsResponse DeleteSubDomains(DeleteSubDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSubDomains", DeleteSubDomainsResponse.class);
    }

    /**
     *删除影子资产数据
     * @param req DeleteSuspiciousAssetsRequest
     * @return DeleteSuspiciousAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSuspiciousAssetsResponse DeleteSuspiciousAssets(DeleteSuspiciousAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteSuspiciousAssets", DeleteSuspiciousAssetsResponse.class);
    }

    /**
     *删除微信小程序数据
     * @param req DeleteWechatAppletsRequest
     * @return DeleteWechatAppletsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWechatAppletsResponse DeleteWechatApplets(DeleteWechatAppletsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWechatApplets", DeleteWechatAppletsResponse.class);
    }

    /**
     *删除微信公众号数据
     * @param req DeleteWechatOfficialAccountsRequest
     * @return DeleteWechatOfficialAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWechatOfficialAccountsResponse DeleteWechatOfficialAccounts(DeleteWechatOfficialAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteWechatOfficialAccounts", DeleteWechatOfficialAccountsResponse.class);
    }

    /**
     *查看API安全数据
     * @param req DescribeApiSecsRequest
     * @return DescribeApiSecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApiSecsResponse DescribeApiSecs(DescribeApiSecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApiSecs", DescribeApiSecsResponse.class);
    }

    /**
     *查看移动端资产
     * @param req DescribeAppsRequest
     * @return DescribeAppsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAppsResponse DescribeApps(DescribeAppsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeApps", DescribeAppsResponse.class);
    }

    /**
     *查看主机资产
     * @param req DescribeAssetsRequest
     * @return DescribeAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetsResponse DescribeAssets(DescribeAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssets", DescribeAssetsResponse.class);
    }

    /**
     *查看目录爆破数据
     * @param req DescribeConfigsRequest
     * @return DescribeConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigsResponse DescribeConfigs(DescribeConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigs", DescribeConfigsResponse.class);
    }

    /**
     *查看企业列表
     * @param req DescribeCustomersRequest
     * @return DescribeCustomersResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomersResponse DescribeCustomers(DescribeCustomersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCustomers", DescribeCustomersResponse.class);
    }

    /**
     *查看暗网数据
     * @param req DescribeDarkWebsRequest
     * @return DescribeDarkWebsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDarkWebsResponse DescribeDarkWebs(DescribeDarkWebsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDarkWebs", DescribeDarkWebsResponse.class);
    }

    /**
     *查看主域名数据
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomains", DescribeDomainsResponse.class);
    }

    /**
     *查看企业架构数据
     * @param req DescribeEnterprisesRequest
     * @return DescribeEnterprisesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEnterprisesResponse DescribeEnterprises(DescribeEnterprisesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEnterprises", DescribeEnterprisesResponse.class);
    }

    /**
     *查询仿冒应用
     * @param req DescribeFakeAppsRequest
     * @return DescribeFakeAppsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFakeAppsResponse DescribeFakeApps(DescribeFakeAppsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFakeApps", DescribeFakeAppsResponse.class);
    }

    /**
     *查询仿冒小程序
     * @param req DescribeFakeMiniProgramsRequest
     * @return DescribeFakeMiniProgramsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFakeMiniProgramsResponse DescribeFakeMiniPrograms(DescribeFakeMiniProgramsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFakeMiniPrograms", DescribeFakeMiniProgramsResponse.class);
    }

    /**
     *查询仿冒网站
     * @param req DescribeFakeWebsitesRequest
     * @return DescribeFakeWebsitesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFakeWebsitesResponse DescribeFakeWebsites(DescribeFakeWebsitesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFakeWebsites", DescribeFakeWebsitesResponse.class);
    }

    /**
     *查询仿冒公众号
     * @param req DescribeFakeWechatOfficialsRequest
     * @return DescribeFakeWechatOfficialsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFakeWechatOfficialsResponse DescribeFakeWechatOfficials(DescribeFakeWechatOfficialsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFakeWechatOfficials", DescribeFakeWechatOfficialsResponse.class);
    }

    /**
     *查看Github泄露数据
     * @param req DescribeGithubsRequest
     * @return DescribeGithubsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGithubsResponse DescribeGithubs(DescribeGithubsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGithubs", DescribeGithubsResponse.class);
    }

    /**
     *查看http数据
     * @param req DescribeHttpsRequest
     * @return DescribeHttpsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHttpsResponse DescribeHttps(DescribeHttpsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHttps", DescribeHttpsResponse.class);
    }

    /**
     *查看链路详情
     * @param req DescribeJobRecordDetailsRequest
     * @return DescribeJobRecordDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobRecordDetailsResponse DescribeJobRecordDetails(DescribeJobRecordDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobRecordDetails", DescribeJobRecordDetailsResponse.class);
    }

    /**
     *查看任务运行记录列表
     * @param req DescribeJobRecordsRequest
     * @return DescribeJobRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeJobRecordsResponse DescribeJobRecords(DescribeJobRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeJobRecords", DescribeJobRecordsResponse.class);
    }

    /**
     *获取代码泄露数据
     * @param req DescribeLeakageCodesRequest
     * @return DescribeLeakageCodesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLeakageCodesResponse DescribeLeakageCodes(DescribeLeakageCodesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLeakageCodes", DescribeLeakageCodesResponse.class);
    }

    /**
     *获取数据泄露事件
     * @param req DescribeLeakageDatasRequest
     * @return DescribeLeakageDatasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLeakageDatasResponse DescribeLeakageDatas(DescribeLeakageDatasRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLeakageDatas", DescribeLeakageDatasResponse.class);
    }

    /**
     *获取邮箱泄露数据
     * @param req DescribeLeakageEmailsRequest
     * @return DescribeLeakageEmailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLeakageEmailsResponse DescribeLeakageEmails(DescribeLeakageEmailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLeakageEmails", DescribeLeakageEmailsResponse.class);
    }

    /**
     *查看后台管理数据
     * @param req DescribeManagesRequest
     * @return DescribeManagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeManagesResponse DescribeManages(DescribeManagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeManages", DescribeManagesResponse.class);
    }

    /**
     *查看网盘泄露数据
     * @param req DescribeNetDisksRequest
     * @return DescribeNetDisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDisksResponse DescribeNetDisks(DescribeNetDisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNetDisks", DescribeNetDisksResponse.class);
    }

    /**
     *查看端口数据
     * @param req DescribePortsRequest
     * @return DescribePortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortsResponse DescribePorts(DescribePortsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePorts", DescribePortsResponse.class);
    }

    /**
     *查看种子列表
     * @param req DescribeSeedsRequest
     * @return DescribeSeedsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSeedsResponse DescribeSeeds(DescribeSeedsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSeeds", DescribeSeedsResponse.class);
    }

    /**
     *查看敏感信息泄露数据
     * @param req DescribeSensitiveInfosRequest
     * @return DescribeSensitiveInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSensitiveInfosResponse DescribeSensitiveInfos(DescribeSensitiveInfosRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSensitiveInfos", DescribeSensitiveInfosResponse.class);
    }

    /**
     *查看子域名数据
     * @param req DescribeSubDomainsRequest
     * @return DescribeSubDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubDomainsResponse DescribeSubDomains(DescribeSubDomainsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubDomains", DescribeSubDomainsResponse.class);
    }

    /**
     *查看影子资产
     * @param req DescribeSuspiciousAssetsRequest
     * @return DescribeSuspiciousAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSuspiciousAssetsResponse DescribeSuspiciousAssets(DescribeSuspiciousAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSuspiciousAssets", DescribeSuspiciousAssetsResponse.class);
    }

    /**
     *查看漏洞数据
     * @param req DescribeVulsRequest
     * @return DescribeVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsResponse DescribeVuls(DescribeVulsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVuls", DescribeVulsResponse.class);
    }

    /**
     *查看弱口令数据
     * @param req DescribeWeakPasswordsRequest
     * @return DescribeWeakPasswordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWeakPasswordsResponse DescribeWeakPasswords(DescribeWeakPasswordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWeakPasswords", DescribeWeakPasswordsResponse.class);
    }

    /**
     *查看微信小程序
     * @param req DescribeWechatAppletsRequest
     * @return DescribeWechatAppletsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWechatAppletsResponse DescribeWechatApplets(DescribeWechatAppletsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWechatApplets", DescribeWechatAppletsResponse.class);
    }

    /**
     *查看公众号数据
     * @param req DescribeWechatOfficialAccountsRequest
     * @return DescribeWechatOfficialAccountsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWechatOfficialAccountsResponse DescribeWechatOfficialAccounts(DescribeWechatOfficialAccountsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeWechatOfficialAccounts", DescribeWechatOfficialAccountsResponse.class);
    }

    /**
     *忽略数据
     * @param req IgnoreDataRequest
     * @return IgnoreDataResponse
     * @throws TencentCloudSDKException
     */
    public IgnoreDataResponse IgnoreData(IgnoreDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "IgnoreData", IgnoreDataResponse.class);
    }

    /**
     *编辑企业
     * @param req ModifyCustomerRequest
     * @return ModifyCustomerResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomerResponse ModifyCustomer(ModifyCustomerRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCustomer", ModifyCustomerResponse.class);
    }

    /**
     *修改标签
     * @param req ModifyLabelRequest
     * @return ModifyLabelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLabelResponse ModifyLabel(ModifyLabelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyLabel", ModifyLabelResponse.class);
    }

    /**
     *修改种子状态
     * @param req ModifySeedStatusRequest
     * @return ModifySeedStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySeedStatusResponse ModifySeedStatus(ModifySeedStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifySeedStatus", ModifySeedStatusResponse.class);
    }

    /**
     *停止扫描
     * @param req StopJobRecordRequest
     * @return StopJobRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopJobRecordResponse StopJobRecord(StopJobRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopJobRecord", StopJobRecordResponse.class);
    }

}
