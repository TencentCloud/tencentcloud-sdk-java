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
