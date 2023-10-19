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
package com.tencentcloudapi.ssa.v20180608;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ssa.v20180608.models.*;

public class SsaClient extends AbstractClient{
    private static String endpoint = "ssa.tencentcloudapi.com";
    private static String service = "ssa";
    private static String version = "2018-06-08";
    
    public SsaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SsaClient(Credential credential, String region, ClientProfile profile) {
        super(SsaClient.endpoint, SsaClient.version, credential, region, profile);
    }

    /**
     *安全大屏-用户威胁告警信息
     * @param req DescribeAlarmStatRequest
     * @return DescribeAlarmStatResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAlarmStatResponse DescribeAlarmStat(DescribeAlarmStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAlarmStat", DescribeAlarmStatResponse.class);
    }

    /**
     *资产安全页资产详情
     * @param req DescribeAssetDetailRequest
     * @return DescribeAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailResponse DescribeAssetDetail(DescribeAssetDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDetail", DescribeAssetDetailResponse.class);
    }

    /**
     *资产条件查询
     * @param req DescribeAssetDetailListRequest
     * @return DescribeAssetDetailListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailListResponse DescribeAssetDetailList(DescribeAssetDetailListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetDetailList", DescribeAssetDetailListResponse.class);
    }

    /**
     *资产安全资产列表
     * @param req DescribeAssetListRequest
     * @return DescribeAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetListResponse DescribeAssetList(DescribeAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetList", DescribeAssetListResponse.class);
    }

    /**
     *资产测绘-测绘列表
     * @param req DescribeAssetsMappingListRequest
     * @return DescribeAssetsMappingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetsMappingListResponse DescribeAssetsMappingList(DescribeAssetsMappingListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAssetsMappingList", DescribeAssetsMappingListResponse.class);
    }

    /**
     *云安全配置管理资产组列表
     * @param req DescribeCheckConfigAssetListRequest
     * @return DescribeCheckConfigAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckConfigAssetListResponse DescribeCheckConfigAssetList(DescribeCheckConfigAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckConfigAssetList", DescribeCheckConfigAssetListResponse.class);
    }

    /**
     *云安全配置检查项详情
     * @param req DescribeCheckConfigDetailRequest
     * @return DescribeCheckConfigDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckConfigDetailResponse DescribeCheckConfigDetail(DescribeCheckConfigDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCheckConfigDetail", DescribeCheckConfigDetailResponse.class);
    }

    /**
     *合规管理-资产列表
     * @param req DescribeComplianceAssetListRequest
     * @return DescribeComplianceAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetListResponse DescribeComplianceAssetList(DescribeComplianceAssetListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceAssetList", DescribeComplianceAssetListResponse.class);
    }

    /**
     *合规管理检查项详情
     * @param req DescribeComplianceDetailRequest
     * @return DescribeComplianceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceDetailResponse DescribeComplianceDetail(DescribeComplianceDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceDetail", DescribeComplianceDetailResponse.class);
    }

    /**
     *合规管理总览页检查项列表
     * @param req DescribeComplianceListRequest
     * @return DescribeComplianceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceListResponse DescribeComplianceList(DescribeComplianceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeComplianceList", DescribeComplianceListResponse.class);
    }

    /**
     *云配置检查项总览页检查项列表
     * @param req DescribeConfigListRequest
     * @return DescribeConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigListResponse DescribeConfigList(DescribeConfigListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeConfigList", DescribeConfigListResponse.class);
    }

    /**
     *域名列表信息
     * @param req DescribeDomainListRequest
     * @return DescribeDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainListResponse DescribeDomainList(DescribeDomainListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainList", DescribeDomainListResponse.class);
    }

    /**
     *获取安全事件详情
     * @param req DescribeEventDetailRequest
     * @return DescribeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventDetailResponse DescribeEventDetail(DescribeEventDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEventDetail", DescribeEventDetailResponse.class);
    }

    /**
     *获取泄露列表
     * @param req DescribeLeakDetectionListRequest
     * @return DescribeLeakDetectionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLeakDetectionListResponse DescribeLeakDetectionList(DescribeLeakDetectionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLeakDetectionList", DescribeLeakDetectionListResponse.class);
    }

    /**
     *获取测绘列表
     * @param req DescribeMappingResultsRequest
     * @return DescribeMappingResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMappingResultsResponse DescribeMappingResults(DescribeMappingResultsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeMappingResults", DescribeMappingResultsResponse.class);
    }

    /**
     *获取安全事件列表
     * @param req DescribeSafetyEventListRequest
     * @return DescribeSafetyEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafetyEventListResponse DescribeSafetyEventList(DescribeSafetyEventListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSafetyEventList", DescribeSafetyEventListResponse.class);
    }

    /**
     *返回告警详情
     * @param req DescribeSocAlertDetailsRequest
     * @return DescribeSocAlertDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocAlertDetailsResponse DescribeSocAlertDetails(DescribeSocAlertDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSocAlertDetails", DescribeSocAlertDetailsResponse.class);
    }

    /**
     *拉取告警列表
     * @param req DescribeSocAlertListRequest
     * @return DescribeSocAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocAlertListResponse DescribeSocAlertList(DescribeSocAlertListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSocAlertList", DescribeSocAlertListResponse.class);
    }

    /**
     *云安全配置检查项列表
     * @param req DescribeSocCheckItemListRequest
     * @return DescribeSocCheckItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocCheckItemListResponse DescribeSocCheckItemList(DescribeSocCheckItemListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSocCheckItemList", DescribeSocCheckItemListResponse.class);
    }

    /**
     *云安全配置检查项结果列表
     * @param req DescribeSocCheckResultListRequest
     * @return DescribeSocCheckResultListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocCheckResultListResponse DescribeSocCheckResultList(DescribeSocCheckResultListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSocCheckResultList", DescribeSocCheckResultListResponse.class);
    }

    /**
     *合规详情项
     * @param req DescribeSocCspmComplianceRequest
     * @return DescribeSocCspmComplianceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocCspmComplianceResponse DescribeSocCspmCompliance(DescribeSocCspmComplianceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSocCspmCompliance", DescribeSocCspmComplianceResponse.class);
    }

    /**
     *漏洞列表页，获取漏洞详情信息
     * @param req DescribeVulDetailRequest
     * @return DescribeVulDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDetailResponse DescribeVulDetail(DescribeVulDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulDetail", DescribeVulDetailResponse.class);
    }

    /**
     *漏洞管理页，获取漏洞列表
     * @param req DescribeVulListRequest
     * @return DescribeVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulListResponse DescribeVulList(DescribeVulListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVulList", DescribeVulListResponse.class);
    }

    /**
     *查询【通用字段】【泄露监测数据列表】
     * @param req SaDivulgeDataQueryPubRequest
     * @return SaDivulgeDataQueryPubResponse
     * @throws TencentCloudSDKException
     */
    public SaDivulgeDataQueryPubResponse SaDivulgeDataQueryPub(SaDivulgeDataQueryPubRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaDivulgeDataQueryPub", SaDivulgeDataQueryPubResponse.class);
    }

    /**
     *SaDivulgeScanRuleMutate
     * @param req SaDivulgeScanRuleMutateRequest
     * @return SaDivulgeScanRuleMutateResponse
     * @throws TencentCloudSDKException
     */
    public SaDivulgeScanRuleMutateResponse SaDivulgeScanRuleMutate(SaDivulgeScanRuleMutateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaDivulgeScanRuleMutate", SaDivulgeScanRuleMutateResponse.class);
    }

    /**
     *安全事件通用字段
     * @param req SaEventPubRequest
     * @return SaEventPubResponse
     * @throws TencentCloudSDKException
     */
    public SaEventPubResponse SaEventPub(SaEventPubRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SaEventPub", SaEventPubResponse.class);
    }

}
