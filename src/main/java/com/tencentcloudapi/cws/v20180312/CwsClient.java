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
package com.tencentcloudapi.cws.v20180312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.cws.v20180312.models.*;

public class CwsClient extends AbstractClient{
    private static String endpoint = "cws.tencentcloudapi.com";
    private static String service = "cws";
    private static String version = "2018-03-12";

    public CwsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CwsClient(Credential credential, String region, ClientProfile profile) {
        super(CwsClient.endpoint, CwsClient.version, credential, region, profile);
    }

    /**
     *本接口（CreateMonitors）用于新增一个或多个站点的监测任务。
     * @param req CreateMonitorsRequest
     * @return CreateMonitorsResponse
     * @throws TencentCloudSDKException
     */
    public CreateMonitorsResponse CreateMonitors(CreateMonitorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMonitorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMonitorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMonitors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSites）用于新增一个或多个站点。
     * @param req CreateSitesRequest
     * @return CreateSitesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSitesResponse CreateSites(CreateSitesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSitesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSitesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSites");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateSitesScans）用于新增一个或多个站点的单次扫描任务。
     * @param req CreateSitesScansRequest
     * @return CreateSitesScansResponse
     * @throws TencentCloudSDKException
     */
    public CreateSitesScansResponse CreateSitesScans(CreateSitesScansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSitesScansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSitesScansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateSitesScans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（CreateVulsMisinformation）可以用于新增一个或多个漏洞误报信息。
     * @param req CreateVulsMisinformationRequest
     * @return CreateVulsMisinformationResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulsMisinformationResponse CreateVulsMisinformation(CreateVulsMisinformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulsMisinformationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVulsMisinformationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVulsMisinformation");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (CreateVulsReport) 用于生成漏洞报告并返回下载链接。
     * @param req CreateVulsReportRequest
     * @return CreateVulsReportResponse
     * @throws TencentCloudSDKException
     */
    public CreateVulsReportResponse CreateVulsReport(CreateVulsReportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVulsReportResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateVulsReportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateVulsReport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteMonitors) 用于删除用户监控任务。
     * @param req DeleteMonitorsRequest
     * @return DeleteMonitorsResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMonitorsResponse DeleteMonitors(DeleteMonitorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMonitorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMonitorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMonitors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DeleteSites) 用于删除站点。
     * @param req DeleteSitesRequest
     * @return DeleteSitesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSitesResponse DeleteSites(DeleteSitesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSitesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSitesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSites");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeConfig) 用于查询用户配置的详细信息。
     * @param req DescribeConfigRequest
     * @return DescribeConfigResponse
     * @throws TencentCloudSDKException
     */
    public DescribeConfigResponse DescribeConfig(DescribeConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeConfigResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeConfigResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeConfig");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeMonitors) 用于查询一个或多个监控任务的详细信息。
     * @param req DescribeMonitorsRequest
     * @return DescribeMonitorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorsResponse DescribeMonitors(DescribeMonitorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonitorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonitors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeSiteQuota) 用于查询用户购买的扫描次数总数和已使用数。
     * @param req DescribeSiteQuotaRequest
     * @return DescribeSiteQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSiteQuotaResponse DescribeSiteQuota(DescribeSiteQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSiteQuotaResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSiteQuotaResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSiteQuota");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeSites) 用于查询一个或多个站点的详细信息。
     * @param req DescribeSitesRequest
     * @return DescribeSitesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesResponse DescribeSites(DescribeSitesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSitesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSitesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSites");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeSitesVerification) 用于查询一个或多个待验证站点的验证信息。
     * @param req DescribeSitesVerificationRequest
     * @return DescribeSitesVerificationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSitesVerificationResponse DescribeSitesVerification(DescribeSitesVerificationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSitesVerificationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSitesVerificationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSitesVerification");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVuls) 用于查询一个或多个漏洞的详细信息。
     * @param req DescribeVulsRequest
     * @return DescribeVulsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsResponse DescribeVuls(DescribeVulsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVuls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVulsNumber) 用于查询用户网站的漏洞总计数量。
     * @param req DescribeVulsNumberRequest
     * @return DescribeVulsNumberResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsNumberResponse DescribeVulsNumber(DescribeVulsNumberRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulsNumberResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulsNumberResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulsNumber");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (DescribeVulsNumberTimeline) 用于查询漏洞数随时间变化统计信息。
     * @param req DescribeVulsNumberTimelineRequest
     * @return DescribeVulsNumberTimelineResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVulsNumberTimelineResponse DescribeVulsNumberTimeline(DescribeVulsNumberTimelineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVulsNumberTimelineResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVulsNumberTimelineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVulsNumberTimeline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyConfigAttribute) 用于修改用户配置的属性。
     * @param req ModifyConfigAttributeRequest
     * @return ModifyConfigAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyConfigAttributeResponse ModifyConfigAttribute(ModifyConfigAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyConfigAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyConfigAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyConfigAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifyMonitorAttribute) 用于修改监测任务的属性。
     * @param req ModifyMonitorAttributeRequest
     * @return ModifyMonitorAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMonitorAttributeResponse ModifyMonitorAttribute(ModifyMonitorAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMonitorAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMonitorAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMonitorAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (ModifySiteAttribute) 用于修改站点的属性。
     * @param req ModifySiteAttributeRequest
     * @return ModifySiteAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySiteAttributeResponse ModifySiteAttribute(ModifySiteAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySiteAttributeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySiteAttributeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySiteAttribute");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口 (VerifySites) 用于验证一个或多个待验证站点。
     * @param req VerifySitesRequest
     * @return VerifySitesResponse
     * @throws TencentCloudSDKException
     */
    public VerifySitesResponse VerifySites(VerifySitesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifySitesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<VerifySitesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "VerifySites");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
