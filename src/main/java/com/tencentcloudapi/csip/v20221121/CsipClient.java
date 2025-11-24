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
package com.tencentcloudapi.csip.v20221121;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.csip.v20221121.models.*;

public class CsipClient extends AbstractClient{
    private static String endpoint = "csip.tencentcloudapi.com";
    private static String service = "csip";
    private static String version = "2022-11-21";

    public CsipClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CsipClient(Credential credential, String region, ClientProfile profile) {
        super(CsipClient.endpoint, CsipClient.version, credential, region, profile);
    }

    /**
     *csip角色授权绑定接口
     * @param req AddNewBindRoleUserRequest
     * @return AddNewBindRoleUserResponse
     * @throws TencentCloudSDKException
     */
    public AddNewBindRoleUserResponse AddNewBindRoleUser(AddNewBindRoleUserRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddNewBindRoleUser", AddNewBindRoleUserResponse.class);
    }

    /**
     *检测AK 异步任务
     * @param req CreateAccessKeyCheckTaskRequest
     * @return CreateAccessKeyCheckTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeyCheckTaskResponse CreateAccessKeyCheckTask(CreateAccessKeyCheckTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeyCheckTask", CreateAccessKeyCheckTaskResponse.class);
    }

    /**
     *发起AK资产同步任务
     * @param req CreateAccessKeySyncTaskRequest
     * @return CreateAccessKeySyncTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessKeySyncTaskResponse CreateAccessKeySyncTask(CreateAccessKeySyncTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAccessKeySyncTask", CreateAccessKeySyncTaskResponse.class);
    }

    /**
     *创建域名、ip相关信息
     * @param req CreateDomainAndIpRequest
     * @return CreateDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAndIpResponse CreateDomainAndIp(CreateDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDomainAndIp", CreateDomainAndIpResponse.class);
    }

    /**
     *创建风险中心扫描任务
     * @param req CreateRiskCenterScanTaskRequest
     * @return CreateRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskCenterScanTaskResponse CreateRiskCenterScanTask(CreateRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateRiskCenterScanTask", CreateRiskCenterScanTaskResponse.class);
    }

    /**
     *删除域名和ip请求
     * @param req DeleteDomainAndIpRequest
     * @return DeleteDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAndIpResponse DeleteDomainAndIp(DeleteDomainAndIpRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomainAndIp", DeleteDomainAndIpResponse.class);
    }

    /**
     *删除风险中心扫描任务
     * @param req DeleteRiskScanTaskRequest
     * @return DeleteRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskScanTaskResponse DeleteRiskScanTask(DeleteRiskScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRiskScanTask", DeleteRiskScanTaskResponse.class);
    }

    /**
     *获取调用记录列表
     * @param req DescribeAbnormalCallRecordRequest
     * @return DescribeAbnormalCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalCallRecordResponse DescribeAbnormalCallRecord(DescribeAbnormalCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAbnormalCallRecord", DescribeAbnormalCallRecordResponse.class);
    }

    /**
     *访问密钥告警记录列表
     * @param req DescribeAccessKeyAlarmRequest
     * @return DescribeAccessKeyAlarmResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmResponse DescribeAccessKeyAlarm(DescribeAccessKeyAlarmRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarm", DescribeAccessKeyAlarmResponse.class);
    }

    /**
     *访问密钥告警记录详情
     * @param req DescribeAccessKeyAlarmDetailRequest
     * @return DescribeAccessKeyAlarmDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAlarmDetailResponse DescribeAccessKeyAlarmDetail(DescribeAccessKeyAlarmDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAlarmDetail", DescribeAccessKeyAlarmDetailResponse.class);
    }

    /**
     *获取用户访问密钥资产列表
     * @param req DescribeAccessKeyAssetRequest
     * @return DescribeAccessKeyAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyAssetResponse DescribeAccessKeyAsset(DescribeAccessKeyAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyAsset", DescribeAccessKeyAssetResponse.class);
    }

    /**
     *访问密钥风险记录列表
     * @param req DescribeAccessKeyRiskRequest
     * @return DescribeAccessKeyRiskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskResponse DescribeAccessKeyRisk(DescribeAccessKeyRiskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRisk", DescribeAccessKeyRiskResponse.class);
    }

    /**
     *访问密钥风险记录详情
     * @param req DescribeAccessKeyRiskDetailRequest
     * @return DescribeAccessKeyRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyRiskDetailResponse DescribeAccessKeyRiskDetail(DescribeAccessKeyRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyRiskDetail", DescribeAccessKeyRiskDetailResponse.class);
    }

    /**
     *查询用户的账号详情
     * @param req DescribeAccessKeyUserDetailRequest
     * @return DescribeAccessKeyUserDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserDetailResponse DescribeAccessKeyUserDetail(DescribeAccessKeyUserDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserDetail", DescribeAccessKeyUserDetailResponse.class);
    }

    /**
     *查询用户的账号列表
     * @param req DescribeAccessKeyUserListRequest
     * @return DescribeAccessKeyUserListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessKeyUserListResponse DescribeAccessKeyUserList(DescribeAccessKeyUserListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessKeyUserList", DescribeAccessKeyUserListResponse.class);
    }

    /**
     *告警中心全量告警列表接口
     * @param req DescribeAlertListRequest
     * @return DescribeAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlertListResponse DescribeAlertList(DescribeAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlertList", DescribeAlertListResponse.class);
    }

    /**
     *查询云边界分析-暴露路径下主机节点的进程列表
     * @param req DescribeAssetProcessListRequest
     * @return DescribeAssetProcessListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetProcessListResponse DescribeAssetProcessList(DescribeAssetProcessListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetProcessList", DescribeAssetProcessListResponse.class);
    }

    /**
     *资产视角下云资源配置风险列表
     * @param req DescribeAssetRiskListRequest
     * @return DescribeAssetRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetRiskListResponse DescribeAssetRiskList(DescribeAssetRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetRiskList", DescribeAssetRiskListResponse.class);
    }

    /**
     *获取资产视角的漏洞风险列表
     * @param req DescribeAssetViewVulRiskListRequest
     * @return DescribeAssetViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetViewVulRiskListResponse DescribeAssetViewVulRiskList(DescribeAssetViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetViewVulRiskList", DescribeAssetViewVulRiskListResponse.class);
    }

    /**
     *云防资产中心统计数据
     * @param req DescribeCFWAssetStatisticsRequest
     * @return DescribeCFWAssetStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCFWAssetStatisticsResponse DescribeCFWAssetStatistics(DescribeCFWAssetStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCFWAssetStatistics", DescribeCFWAssetStatisticsResponse.class);
    }

    /**
     *获取风险中心风险概况示例
     * @param req DescribeCSIPRiskStatisticsRequest
     * @return DescribeCSIPRiskStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCSIPRiskStatisticsResponse DescribeCSIPRiskStatistics(DescribeCSIPRiskStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCSIPRiskStatistics", DescribeCSIPRiskStatisticsResponse.class);
    }

    /**
     *cvm详情
     * @param req DescribeCVMAssetInfoRequest
     * @return DescribeCVMAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetInfoResponse DescribeCVMAssetInfo(DescribeCVMAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssetInfo", DescribeCVMAssetInfoResponse.class);
    }

    /**
     *获取cvm列表
     * @param req DescribeCVMAssetsRequest
     * @return DescribeCVMAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetsResponse DescribeCVMAssets(DescribeCVMAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCVMAssets", DescribeCVMAssetsResponse.class);
    }

    /**
     *获取调用记录列表
     * @param req DescribeCallRecordRequest
     * @return DescribeCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallRecordResponse DescribeCallRecord(DescribeCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCallRecord", DescribeCallRecordResponse.class);
    }

    /**
     *检查视角下云资源配置风险列表
     * @param req DescribeCheckViewRisksRequest
     * @return DescribeCheckViewRisksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckViewRisksResponse DescribeCheckViewRisks(DescribeCheckViewRisksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckViewRisks", DescribeCheckViewRisksResponse.class);
    }

    /**
     *集群列表
     * @param req DescribeClusterAssetsRequest
     * @return DescribeClusterAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterAssetsResponse DescribeClusterAssets(DescribeClusterAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterAssets", DescribeClusterAssetsResponse.class);
    }

    /**
     *集群pod列表
     * @param req DescribeClusterPodAssetsRequest
     * @return DescribeClusterPodAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodAssetsResponse DescribeClusterPodAssets(DescribeClusterPodAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeClusterPodAssets", DescribeClusterPodAssetsResponse.class);
    }

    /**
     *云资源配置风险规则列表示例
     * @param req DescribeConfigCheckRulesRequest
     * @return DescribeConfigCheckRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigCheckRulesResponse DescribeConfigCheckRules(DescribeConfigCheckRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigCheckRules", DescribeConfigCheckRulesResponse.class);
    }

    /**
     *db资产详情
     * @param req DescribeDbAssetInfoRequest
     * @return DescribeDbAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetInfoResponse DescribeDbAssetInfo(DescribeDbAssetInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssetInfo", DescribeDbAssetInfoResponse.class);
    }

    /**
     *数据库资产列表
     * @param req DescribeDbAssetsRequest
     * @return DescribeDbAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetsResponse DescribeDbAssets(DescribeDbAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDbAssets", DescribeDbAssetsResponse.class);
    }

    /**
     *域名列表
     * @param req DescribeDomainAssetsRequest
     * @return DescribeDomainAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAssetsResponse DescribeDomainAssets(DescribeDomainAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainAssets", DescribeDomainAssetsResponse.class);
    }

    /**
     *云边界分析资产分类
     * @param req DescribeExposeAssetCategoryRequest
     * @return DescribeExposeAssetCategoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposeAssetCategoryResponse DescribeExposeAssetCategory(DescribeExposeAssetCategoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposeAssetCategory", DescribeExposeAssetCategoryResponse.class);
    }

    /**
     *查询云边界分析路径节点
     * @param req DescribeExposePathRequest
     * @return DescribeExposePathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposePathResponse DescribeExposePath(DescribeExposePathRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposePath", DescribeExposePathResponse.class);
    }

    /**
     *云边界分析资产列表
     * @param req DescribeExposuresRequest
     * @return DescribeExposuresResponse
     * @throws TencentCloudSDKException
     */
    public DescribeExposuresResponse DescribeExposures(DescribeExposuresRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeExposures", DescribeExposuresResponse.class);
    }

    /**
     *获取网关列表
     * @param req DescribeGatewayAssetsRequest
     * @return DescribeGatewayAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayAssetsResponse DescribeGatewayAssets(DescribeGatewayAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayAssets", DescribeGatewayAssetsResponse.class);
    }

    /**
     *查询云边界分析-暴露路径下主机节点的高危基线风险列表
     * @param req DescribeHighBaseLineRiskListRequest
     * @return DescribeHighBaseLineRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHighBaseLineRiskListResponse DescribeHighBaseLineRiskList(DescribeHighBaseLineRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeHighBaseLineRiskList", DescribeHighBaseLineRiskListResponse.class);
    }

    /**
     *查询clb监听器列表
     * @param req DescribeListenerListRequest
     * @return DescribeListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerListResponse DescribeListenerList(DescribeListenerListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeListenerList", DescribeListenerListResponse.class);
    }

    /**
     *获取网卡列表
     * @param req DescribeNICAssetsRequest
     * @return DescribeNICAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNICAssetsResponse DescribeNICAssets(DescribeNICAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNICAssets", DescribeNICAssetsResponse.class);
    }

    /**
     *查询集团账号详情
     * @param req DescribeOrganizationInfoRequest
     * @return DescribeOrganizationInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationInfoResponse DescribeOrganizationInfo(DescribeOrganizationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationInfo", DescribeOrganizationInfoResponse.class);
    }

    /**
     *查询集团账号用户列表
     * @param req DescribeOrganizationUserInfoRequest
     * @return DescribeOrganizationUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationUserInfoResponse DescribeOrganizationUserInfo(DescribeOrganizationUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganizationUserInfo", DescribeOrganizationUserInfoResponse.class);
    }

    /**
     *资产列表
     * @param req DescribeOtherCloudAssetsRequest
     * @return DescribeOtherCloudAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOtherCloudAssetsResponse DescribeOtherCloudAssets(DescribeOtherCloudAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOtherCloudAssets", DescribeOtherCloudAssetsResponse.class);
    }

    /**
     *ip公网列表
     * @param req DescribePublicIpAssetsRequest
     * @return DescribePublicIpAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpAssetsResponse DescribePublicIpAssets(DescribePublicIpAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePublicIpAssets", DescribePublicIpAssetsResponse.class);
    }

    /**
     *仓库镜像列表
     * @param req DescribeRepositoryImageAssetsRequest
     * @return DescribeRepositoryImageAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRepositoryImageAssetsResponse DescribeRepositoryImageAssets(DescribeRepositoryImageAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRepositoryImageAssets", DescribeRepositoryImageAssetsResponse.class);
    }

    /**
     *获取风险调用记录列表
     * @param req DescribeRiskCallRecordRequest
     * @return DescribeRiskCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCallRecordResponse DescribeRiskCallRecord(DescribeRiskCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCallRecord", DescribeRiskCallRecordResponse.class);
    }

    /**
     *获取资产视角的配置风险列表
     * @param req DescribeRiskCenterAssetViewCFGRiskListRequest
     * @return DescribeRiskCenterAssetViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewCFGRiskListResponse DescribeRiskCenterAssetViewCFGRiskList(DescribeRiskCenterAssetViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewCFGRiskList", DescribeRiskCenterAssetViewCFGRiskListResponse.class);
    }

    /**
     *获取资产视角的端口风险列表
     * @param req DescribeRiskCenterAssetViewPortRiskListRequest
     * @return DescribeRiskCenterAssetViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewPortRiskListResponse DescribeRiskCenterAssetViewPortRiskList(DescribeRiskCenterAssetViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewPortRiskList", DescribeRiskCenterAssetViewPortRiskListResponse.class);
    }

    /**
     *获取资产视角的漏洞风险列表
     * @param req DescribeRiskCenterAssetViewVULRiskListRequest
     * @return DescribeRiskCenterAssetViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewVULRiskListResponse DescribeRiskCenterAssetViewVULRiskList(DescribeRiskCenterAssetViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewVULRiskList", DescribeRiskCenterAssetViewVULRiskListResponse.class);
    }

    /**
     *获取资产视角的弱口令风险列表
     * @param req DescribeRiskCenterAssetViewWeakPasswordRiskListRequest
     * @return DescribeRiskCenterAssetViewWeakPasswordRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewWeakPasswordRiskListResponse DescribeRiskCenterAssetViewWeakPasswordRiskList(DescribeRiskCenterAssetViewWeakPasswordRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterAssetViewWeakPasswordRiskList", DescribeRiskCenterAssetViewWeakPasswordRiskListResponse.class);
    }

    /**
     *获取配置视角的配置风险列表
     * @param req DescribeRiskCenterCFGViewCFGRiskListRequest
     * @return DescribeRiskCenterCFGViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterCFGViewCFGRiskListResponse DescribeRiskCenterCFGViewCFGRiskList(DescribeRiskCenterCFGViewCFGRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterCFGViewCFGRiskList", DescribeRiskCenterCFGViewCFGRiskListResponse.class);
    }

    /**
     *获取端口视角的端口风险列表
     * @param req DescribeRiskCenterPortViewPortRiskListRequest
     * @return DescribeRiskCenterPortViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterPortViewPortRiskListResponse DescribeRiskCenterPortViewPortRiskList(DescribeRiskCenterPortViewPortRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterPortViewPortRiskList", DescribeRiskCenterPortViewPortRiskListResponse.class);
    }

    /**
     *获取风险服务列表
     * @param req DescribeRiskCenterServerRiskListRequest
     * @return DescribeRiskCenterServerRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterServerRiskListResponse DescribeRiskCenterServerRiskList(DescribeRiskCenterServerRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterServerRiskList", DescribeRiskCenterServerRiskListResponse.class);
    }

    /**
     *获取漏洞视角的漏洞风险列表
     * @param req DescribeRiskCenterVULViewVULRiskListRequest
     * @return DescribeRiskCenterVULViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterVULViewVULRiskListResponse DescribeRiskCenterVULViewVULRiskList(DescribeRiskCenterVULViewVULRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterVULViewVULRiskList", DescribeRiskCenterVULViewVULRiskListResponse.class);
    }

    /**
     *获取内容风险列表
     * @param req DescribeRiskCenterWebsiteRiskListRequest
     * @return DescribeRiskCenterWebsiteRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterWebsiteRiskListResponse DescribeRiskCenterWebsiteRiskList(DescribeRiskCenterWebsiteRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskCenterWebsiteRiskList", DescribeRiskCenterWebsiteRiskListResponse.class);
    }

    /**
     *风险详情列表示例
     * @param req DescribeRiskDetailListRequest
     * @return DescribeRiskDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskDetailListResponse DescribeRiskDetailList(DescribeRiskDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskDetailList", DescribeRiskDetailListResponse.class);
    }

    /**
     *查询风险规则详情示例
     * @param req DescribeRiskRuleDetailRequest
     * @return DescribeRiskRuleDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskRuleDetailResponse DescribeRiskRuleDetail(DescribeRiskRuleDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskRuleDetail", DescribeRiskRuleDetailResponse.class);
    }

    /**
     *高级配置风险规则列表示例
     * @param req DescribeRiskRulesRequest
     * @return DescribeRiskRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskRulesResponse DescribeRiskRules(DescribeRiskRulesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRiskRules", DescribeRiskRulesResponse.class);
    }

    /**
     *获取扫描报告列表
     * @param req DescribeScanReportListRequest
     * @return DescribeScanReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanReportListResponse DescribeScanReportList(DescribeScanReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanReportList", DescribeScanReportListResponse.class);
    }

    /**
     *查询云边界分析扫描结果统计信息
     * @param req DescribeScanStatisticRequest
     * @return DescribeScanStatisticResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanStatisticResponse DescribeScanStatistic(DescribeScanStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanStatistic", DescribeScanStatisticResponse.class);
    }

    /**
     *获取扫描任务列表
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskList", DescribeScanTaskListResponse.class);
    }

    /**
     *立体防护中心查询漏洞信息
     * @param req DescribeSearchBugInfoRequest
     * @return DescribeSearchBugInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchBugInfoResponse DescribeSearchBugInfo(DescribeSearchBugInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSearchBugInfo", DescribeSearchBugInfoResponse.class);
    }

    /**
     *获取用户访问密钥资产列表（源IP视角）
     * @param req DescribeSourceIPAssetRequest
     * @return DescribeSourceIPAssetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSourceIPAssetResponse DescribeSourceIPAsset(DescribeSourceIPAssetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSourceIPAsset", DescribeSourceIPAssetResponse.class);
    }

    /**
     *查询集团的子账号列表
     * @param req DescribeSubUserInfoRequest
     * @return DescribeSubUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubUserInfoResponse DescribeSubUserInfo(DescribeSubUserInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubUserInfo", DescribeSubUserInfoResponse.class);
    }

    /**
     *获取子网列表
     * @param req DescribeSubnetAssetsRequest
     * @return DescribeSubnetAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetAssetsResponse DescribeSubnetAssets(DescribeSubnetAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSubnetAssets", DescribeSubnetAssetsResponse.class);
    }

    /**
     *获取任务扫描报告列表
     * @param req DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogListResponse DescribeTaskLogList(DescribeTaskLogListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogList", DescribeTaskLogListResponse.class);
    }

    /**
     *获取报告下载的临时链接
     * @param req DescribeTaskLogURLRequest
     * @return DescribeTaskLogURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogURLResponse DescribeTaskLogURL(DescribeTaskLogURLRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTaskLogURL", DescribeTaskLogURLResponse.class);
    }

    /**
     *查询TOP攻击信息
     * @param req DescribeTopAttackInfoRequest
     * @return DescribeTopAttackInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopAttackInfoResponse DescribeTopAttackInfo(DescribeTopAttackInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTopAttackInfo", DescribeTopAttackInfoResponse.class);
    }

    /**
     *查询用户行为分析策略列表
     * @param req DescribeUebaRuleRequest
     * @return DescribeUebaRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUebaRuleResponse DescribeUebaRule(DescribeUebaRuleRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUebaRule", DescribeUebaRuleResponse.class);
    }

    /**
     *获取账号调用记录列表
     * @param req DescribeUserCallRecordRequest
     * @return DescribeUserCallRecordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCallRecordResponse DescribeUserCallRecord(DescribeUserCallRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserCallRecord", DescribeUserCallRecordResponse.class);
    }

    /**
     *新安全中心风险中心-漏洞列表
     * @param req DescribeVULListRequest
     * @return DescribeVULListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULListResponse DescribeVULList(DescribeVULListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULList", DescribeVULListResponse.class);
    }

    /**
     *查询漏洞风险高级配置
     * @param req DescribeVULRiskAdvanceCFGListRequest
     * @return DescribeVULRiskAdvanceCFGListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskAdvanceCFGListResponse DescribeVULRiskAdvanceCFGList(DescribeVULRiskAdvanceCFGListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskAdvanceCFGList", DescribeVULRiskAdvanceCFGListResponse.class);
    }

    /**
     *获取漏洞展开详情
     * @param req DescribeVULRiskDetailRequest
     * @return DescribeVULRiskDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVULRiskDetailResponse DescribeVULRiskDetail(DescribeVULRiskDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVULRiskDetail", DescribeVULRiskDetailResponse.class);
    }

    /**
     *获取vpc列表
     * @param req DescribeVpcAssetsRequest
     * @return DescribeVpcAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAssetsResponse DescribeVpcAssets(DescribeVpcAssetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVpcAssets", DescribeVpcAssetsResponse.class);
    }

    /**
     *查询云边界分析-暴露路径下主机节点的漏洞列表
     * @param req DescribeVulRiskListRequest
     * @return DescribeVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulRiskListResponse DescribeVulRiskList(DescribeVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulRiskList", DescribeVulRiskListResponse.class);
    }

    /**
     *获取漏洞视角的漏洞风险列表
     * @param req DescribeVulViewVulRiskListRequest
     * @return DescribeVulViewVulRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulViewVulRiskListResponse DescribeVulViewVulRiskList(DescribeVulViewVulRiskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulViewVulRiskList", DescribeVulViewVulRiskListResponse.class);
    }

    /**
     *修改集团账号状态
     * @param req ModifyOrganizationAccountStatusRequest
     * @return ModifyOrganizationAccountStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyOrganizationAccountStatusResponse ModifyOrganizationAccountStatus(ModifyOrganizationAccountStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyOrganizationAccountStatus", ModifyOrganizationAccountStatusResponse.class);
    }

    /**
     *修改风险中心风险状态
     * @param req ModifyRiskCenterRiskStatusRequest
     * @return ModifyRiskCenterRiskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterRiskStatusResponse ModifyRiskCenterRiskStatus(ModifyRiskCenterRiskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterRiskStatus", ModifyRiskCenterRiskStatusResponse.class);
    }

    /**
     *修改风险中心扫描任务
     * @param req ModifyRiskCenterScanTaskRequest
     * @return ModifyRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterScanTaskResponse ModifyRiskCenterScanTask(ModifyRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyRiskCenterScanTask", ModifyRiskCenterScanTaskResponse.class);
    }

    /**
     *更新自定义策略的开关
     * @param req ModifyUebaRuleSwitchRequest
     * @return ModifyUebaRuleSwitchResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUebaRuleSwitchResponse ModifyUebaRuleSwitch(ModifyUebaRuleSwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyUebaRuleSwitch", ModifyUebaRuleSwitchResponse.class);
    }

    /**
     *停止扫风险中心扫描任务
     * @param req StopRiskCenterTaskRequest
     * @return StopRiskCenterTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRiskCenterTaskResponse StopRiskCenterTask(StopRiskCenterTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopRiskCenterTask", StopRiskCenterTaskResponse.class);
    }

    /**
     *标记风险或者告警为 已处置/已忽略
     * @param req UpdateAccessKeyAlarmStatusRequest
     * @return UpdateAccessKeyAlarmStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyAlarmStatusResponse UpdateAccessKeyAlarmStatus(UpdateAccessKeyAlarmStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyAlarmStatus", UpdateAccessKeyAlarmStatusResponse.class);
    }

    /**
     *编辑访问密钥/源IP备注
     * @param req UpdateAccessKeyRemarkRequest
     * @return UpdateAccessKeyRemarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAccessKeyRemarkResponse UpdateAccessKeyRemark(UpdateAccessKeyRemarkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAccessKeyRemark", UpdateAccessKeyRemarkResponse.class);
    }

    /**
     *批量告警状态处理接口
     * @param req UpdateAlertStatusListRequest
     * @return UpdateAlertStatusListResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAlertStatusListResponse UpdateAlertStatusList(UpdateAlertStatusListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAlertStatusList", UpdateAlertStatusListResponse.class);
    }

}
