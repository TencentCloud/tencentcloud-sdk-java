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
        JsonResponseModel<AddNewBindRoleUserResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddNewBindRoleUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddNewBindRoleUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建域名、ip相关信息
     * @param req CreateDomainAndIpRequest
     * @return CreateDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public CreateDomainAndIpResponse CreateDomainAndIp(CreateDomainAndIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDomainAndIpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDomainAndIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDomainAndIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建风险中心扫描任务
     * @param req CreateRiskCenterScanTaskRequest
     * @return CreateRiskCenterScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateRiskCenterScanTaskResponse CreateRiskCenterScanTask(CreateRiskCenterScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRiskCenterScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRiskCenterScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRiskCenterScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *cvm详情
     * @param req DescribeCVMAssetInfoRequest
     * @return DescribeCVMAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetInfoResponse DescribeCVMAssetInfo(DescribeCVMAssetInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCVMAssetInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCVMAssetInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCVMAssetInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *cvm列表
     * @param req DescribeCVMAssetsRequest
     * @return DescribeCVMAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCVMAssetsResponse DescribeCVMAssets(DescribeCVMAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCVMAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCVMAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCVMAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *集群pod列表
     * @param req DescribeClusterPodAssetsRequest
     * @return DescribeClusterPodAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClusterPodAssetsResponse DescribeClusterPodAssets(DescribeClusterPodAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClusterPodAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClusterPodAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeClusterPodAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *db资产详情
     * @param req DescribeDbAssetInfoRequest
     * @return DescribeDbAssetInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetInfoResponse DescribeDbAssetInfo(DescribeDbAssetInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDbAssetInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDbAssetInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDbAssetInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *资产列表
     * @param req DescribeDbAssetsRequest
     * @return DescribeDbAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDbAssetsResponse DescribeDbAssets(DescribeDbAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDbAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDbAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDbAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *域名列表
     * @param req DescribeDomainAssetsRequest
     * @return DescribeDomainAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainAssetsResponse DescribeDomainAssets(DescribeDomainAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询clb监听器列表
     * @param req DescribeListenerListRequest
     * @return DescribeListenerListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeListenerListResponse DescribeListenerList(DescribeListenerListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeListenerListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeListenerListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeListenerList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *ip公网列表
     * @param req DescribePublicIpAssetsRequest
     * @return DescribePublicIpAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePublicIpAssetsResponse DescribePublicIpAssets(DescribePublicIpAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePublicIpAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePublicIpAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePublicIpAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产视角的端口风险列表
     * @param req DescribeRiskCenterAssetViewPortRiskListRequest
     * @return DescribeRiskCenterAssetViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewPortRiskListResponse DescribeRiskCenterAssetViewPortRiskList(DescribeRiskCenterAssetViewPortRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterAssetViewPortRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterAssetViewPortRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterAssetViewPortRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取资产视角的漏洞风险列表
     * @param req DescribeRiskCenterAssetViewVULRiskListRequest
     * @return DescribeRiskCenterAssetViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewVULRiskListResponse DescribeRiskCenterAssetViewVULRiskList(DescribeRiskCenterAssetViewVULRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterAssetViewVULRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterAssetViewVULRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterAssetViewVULRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取扫描报告列表
     * @param req DescribeScanReportListRequest
     * @return DescribeScanReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanReportListResponse DescribeScanReportList(DescribeScanReportListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanReportListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanReportListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanReportList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取子网列表
     * @param req DescribeSubnetAssetsRequest
     * @return DescribeSubnetAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetAssetsResponse DescribeSubnetAssets(DescribeSubnetAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubnetAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubnetAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取vpc列表
     * @param req DescribeVpcAssetsRequest
     * @return DescribeVpcAssetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcAssetsResponse DescribeVpcAssets(DescribeVpcAssetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcAssetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVpcAssetsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVpcAssets");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
