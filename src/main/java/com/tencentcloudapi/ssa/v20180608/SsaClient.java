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
     *资产安全页资产详情
     * @param req DescribeAssetDetailRequest
     * @return DescribeAssetDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetDetailResponse DescribeAssetDetail(DescribeAssetDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资产安全资产列表
     * @param req DescribeAssetListRequest
     * @return DescribeAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetListResponse DescribeAssetList(DescribeAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资产测绘-测绘列表
     * @param req DescribeAssetsMappingListRequest
     * @return DescribeAssetsMappingListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssetsMappingListResponse DescribeAssetsMappingList(DescribeAssetsMappingListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssetsMappingListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAssetsMappingListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAssetsMappingList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云安全配置管理资产组列表
     * @param req DescribeCheckConfigAssetListRequest
     * @return DescribeCheckConfigAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckConfigAssetListResponse DescribeCheckConfigAssetList(DescribeCheckConfigAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckConfigAssetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCheckConfigAssetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCheckConfigAssetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云安全配置检查项详情
     * @param req DescribeCheckConfigDetailRequest
     * @return DescribeCheckConfigDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCheckConfigDetailResponse DescribeCheckConfigDetail(DescribeCheckConfigDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCheckConfigDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCheckConfigDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCheckConfigDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合规管理-资产列表
     * @param req DescribeComplianceAssetListRequest
     * @return DescribeComplianceAssetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceAssetListResponse DescribeComplianceAssetList(DescribeComplianceAssetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceAssetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceAssetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceAssetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合规管理检查项详情
     * @param req DescribeComplianceDetailRequest
     * @return DescribeComplianceDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceDetailResponse DescribeComplianceDetail(DescribeComplianceDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合规管理总览页检查项列表
     * @param req DescribeComplianceListRequest
     * @return DescribeComplianceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeComplianceListResponse DescribeComplianceList(DescribeComplianceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeComplianceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeComplianceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeComplianceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云配置检查项总览页检查项列表
     * @param req DescribeConfigListRequest
     * @return DescribeConfigListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigListResponse DescribeConfigList(DescribeConfigListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfigList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全事件详情
     * @param req DescribeEventDetailRequest
     * @return DescribeEventDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventDetailResponse DescribeEventDetail(DescribeEventDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeEventDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeEventDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeEventDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取泄露列表
     * @param req DescribeLeakDetectionListRequest
     * @return DescribeLeakDetectionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLeakDetectionListResponse DescribeLeakDetectionList(DescribeLeakDetectionListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLeakDetectionListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLeakDetectionListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLeakDetectionList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取测绘列表
     * @param req DescribeMappingResultsRequest
     * @return DescribeMappingResultsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMappingResultsResponse DescribeMappingResults(DescribeMappingResultsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMappingResultsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMappingResultsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMappingResults");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取安全事件列表
     * @param req DescribeSafetyEventListRequest
     * @return DescribeSafetyEventListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSafetyEventListResponse DescribeSafetyEventList(DescribeSafetyEventListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSafetyEventListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSafetyEventListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSafetyEventList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回告警详情
     * @param req DescribeSocAlertDetailsRequest
     * @return DescribeSocAlertDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocAlertDetailsResponse DescribeSocAlertDetails(DescribeSocAlertDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSocAlertDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSocAlertDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSocAlertDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取告警列表
     * @param req DescribeSocAlertListRequest
     * @return DescribeSocAlertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocAlertListResponse DescribeSocAlertList(DescribeSocAlertListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSocAlertListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSocAlertListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSocAlertList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云安全配置检查项列表
     * @param req DescribeSocCheckItemListRequest
     * @return DescribeSocCheckItemListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocCheckItemListResponse DescribeSocCheckItemList(DescribeSocCheckItemListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSocCheckItemListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSocCheckItemListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSocCheckItemList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *云安全配置检查项结果列表
     * @param req DescribeSocCheckResultListRequest
     * @return DescribeSocCheckResultListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocCheckResultListResponse DescribeSocCheckResultList(DescribeSocCheckResultListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSocCheckResultListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSocCheckResultListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSocCheckResultList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合规详情项
     * @param req DescribeSocCspmComplianceRequest
     * @return DescribeSocCspmComplianceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSocCspmComplianceResponse DescribeSocCspmCompliance(DescribeSocCspmComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSocCspmComplianceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSocCspmComplianceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSocCspmCompliance");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞列表页，获取漏洞详情信息
     * @param req DescribeVulDetailRequest
     * @return DescribeVulDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulDetailResponse DescribeVulDetail(DescribeVulDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *漏洞管理页，获取漏洞列表
     * @param req DescribeVulListRequest
     * @return DescribeVulListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulListResponse DescribeVulList(DescribeVulListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询【通用字段】【泄露监测数据列表】
     * @param req SaDivulgeDataQueryPubRequest
     * @return SaDivulgeDataQueryPubResponse
     * @throws TencentCloudSDKException
     */
    public SaDivulgeDataQueryPubResponse SaDivulgeDataQueryPub(SaDivulgeDataQueryPubRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SaDivulgeDataQueryPubResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SaDivulgeDataQueryPubResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SaDivulgeDataQueryPub");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
