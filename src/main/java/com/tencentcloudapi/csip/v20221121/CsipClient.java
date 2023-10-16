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
     *删除域名和ip请求
     * @param req DeleteDomainAndIpRequest
     * @return DeleteDomainAndIpResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainAndIpResponse DeleteDomainAndIp(DeleteDomainAndIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainAndIpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainAndIpResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainAndIp");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除风险中心扫描任务
     * @param req DeleteRiskScanTaskRequest
     * @return DeleteRiskScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRiskScanTaskResponse DeleteRiskScanTask(DeleteRiskScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRiskScanTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRiskScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRiskScanTask");
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
     *数据库资产列表
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
     *获取资产视角的配置风险列表
     * @param req DescribeRiskCenterAssetViewCFGRiskListRequest
     * @return DescribeRiskCenterAssetViewCFGRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewCFGRiskListResponse DescribeRiskCenterAssetViewCFGRiskList(DescribeRiskCenterAssetViewCFGRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterAssetViewCFGRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterAssetViewCFGRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterAssetViewCFGRiskList");
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
     *获取资产视角的弱口令风险列表
     * @param req DescribeRiskCenterAssetViewWeakPasswordRiskListRequest
     * @return DescribeRiskCenterAssetViewWeakPasswordRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterAssetViewWeakPasswordRiskListResponse DescribeRiskCenterAssetViewWeakPasswordRiskList(DescribeRiskCenterAssetViewWeakPasswordRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterAssetViewWeakPasswordRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterAssetViewWeakPasswordRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterAssetViewWeakPasswordRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取端口视角的端口风险列表
     * @param req DescribeRiskCenterPortViewPortRiskListRequest
     * @return DescribeRiskCenterPortViewPortRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterPortViewPortRiskListResponse DescribeRiskCenterPortViewPortRiskList(DescribeRiskCenterPortViewPortRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterPortViewPortRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterPortViewPortRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterPortViewPortRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取风险服务列表
     * @param req DescribeRiskCenterServerRiskListRequest
     * @return DescribeRiskCenterServerRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterServerRiskListResponse DescribeRiskCenterServerRiskList(DescribeRiskCenterServerRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterServerRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterServerRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterServerRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取漏洞视角的漏洞风险列表
     * @param req DescribeRiskCenterVULViewVULRiskListRequest
     * @return DescribeRiskCenterVULViewVULRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterVULViewVULRiskListResponse DescribeRiskCenterVULViewVULRiskList(DescribeRiskCenterVULViewVULRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterVULViewVULRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterVULViewVULRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterVULViewVULRiskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取网站风险列表
     * @param req DescribeRiskCenterWebsiteRiskListRequest
     * @return DescribeRiskCenterWebsiteRiskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRiskCenterWebsiteRiskListResponse DescribeRiskCenterWebsiteRiskList(DescribeRiskCenterWebsiteRiskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRiskCenterWebsiteRiskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRiskCenterWebsiteRiskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRiskCenterWebsiteRiskList");
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
     *获取扫描任务列表
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanTaskListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanTaskListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanTaskList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *立体防护中心查询漏洞信息
     * @param req DescribeSearchBugInfoRequest
     * @return DescribeSearchBugInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSearchBugInfoResponse DescribeSearchBugInfo(DescribeSearchBugInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSearchBugInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSearchBugInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSearchBugInfo");
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
     *获取任务扫描报告列表
     * @param req DescribeTaskLogListRequest
     * @return DescribeTaskLogListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogListResponse DescribeTaskLogList(DescribeTaskLogListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskLogListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskLogListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskLogList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取报告下载的临时链接
     * @param req DescribeTaskLogURLRequest
     * @return DescribeTaskLogURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskLogURLResponse DescribeTaskLogURL(DescribeTaskLogURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskLogURLResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTaskLogURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTaskLogURL");
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

    /**
     *修改风险中心风险状态
     * @param req ModifyRiskCenterRiskStatusRequest
     * @return ModifyRiskCenterRiskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRiskCenterRiskStatusResponse ModifyRiskCenterRiskStatus(ModifyRiskCenterRiskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRiskCenterRiskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRiskCenterRiskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRiskCenterRiskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *停止扫风险中心扫描任务
     * @param req StopRiskCenterTaskRequest
     * @return StopRiskCenterTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopRiskCenterTaskResponse StopRiskCenterTask(StopRiskCenterTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopRiskCenterTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<StopRiskCenterTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "StopRiskCenterTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
