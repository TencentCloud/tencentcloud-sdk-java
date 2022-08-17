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
package com.tencentcloudapi.bma.v20210624;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.bma.v20210624.models.*;

public class BmaClient extends AbstractClient{
    private static String endpoint = "bma.tencentcloudapi.com";
    private static String service = "bma";
    private static String version = "2021-06-24";

    public BmaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public BmaClient(Credential credential, String region, ClientProfile profile) {
        super(BmaClient.endpoint, BmaClient.version, credential, region, profile);
    }

    /**
     *添加仿冒链接（举报）
     * @param req CreateBPFakeURLRequest
     * @return CreateBPFakeURLResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFakeURLResponse CreateBPFakeURL(CreateBPFakeURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPFakeURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPFakeURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPFakeURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加误报工单
     * @param req CreateBPFalseTicketRequest
     * @return CreateBPFalseTicketResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFalseTicketResponse CreateBPFalseTicket(CreateBPFalseTicketRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPFalseTicketResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPFalseTicketResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPFalseTicket");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加下线材料
     * @param req CreateBPOfflineAttachmentRequest
     * @return CreateBPOfflineAttachmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPOfflineAttachmentResponse CreateBPOfflineAttachment(CreateBPOfflineAttachmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPOfflineAttachmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPOfflineAttachmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPOfflineAttachment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加下线工单
     * @param req CreateBPOfflineTicketRequest
     * @return CreateBPOfflineTicketResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPOfflineTicketResponse CreateBPOfflineTicket(CreateBPOfflineTicketRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPOfflineTicketResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPOfflineTicketResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPOfflineTicket");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加保护网站
     * @param req CreateBPProtectURLsRequest
     * @return CreateBPProtectURLsResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPProtectURLsResponse CreateBPProtectURLs(CreateBPProtectURLsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBPProtectURLsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateBPProtectURLsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateBPProtectURLs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-新建拦截接口
     * @param req CreateCRBlockRequest
     * @return CreateCRBlockResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRBlockResponse CreateCRBlock(CreateCRBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRBlockResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRBlockResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRBlock");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *品牌经营管家-版权保护模块企业认证接口
     * @param req CreateCRCompanyVerifyRequest
     * @return CreateCRCompanyVerifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRCompanyVerifyResponse CreateCRCompanyVerify(CreateCRCompanyVerifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRCompanyVerifyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRCompanyVerifyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRCompanyVerify");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-新建发函接口
     * @param req CreateCRRightRequest
     * @return CreateCRRightResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRRightResponse CreateCRRight(CreateCRRightRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRRightResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRRightResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRRight");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *品牌经营管家-版权保护个人认证接口
     * @param req CreateCRUserVerifyRequest
     * @return CreateCRUserVerifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRUserVerifyResponse CreateCRUserVerify(CreateCRUserVerifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRUserVerifyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRUserVerifyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRUserVerify");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-添加作品接口
     * @param req CreateCRWorkRequest
     * @return CreateCRWorkResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRWorkResponse CreateCRWork(CreateCRWorkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCRWorkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateCRWorkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateCRWork");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询企业信息
     * @param req DescribeBPCompanyInfoRequest
     * @return DescribeBPCompanyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPCompanyInfoResponse DescribeBPCompanyInfo(DescribeBPCompanyInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBPCompanyInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBPCompanyInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBPCompanyInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询仿冒链接
     * @param req DescribeBPFakeURLsRequest
     * @return DescribeBPFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPFakeURLsResponse DescribeBPFakeURLs(DescribeBPFakeURLsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBPFakeURLsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBPFakeURLsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBPFakeURLs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询保护网站
     * @param req DescribeBPProtectURLsRequest
     * @return DescribeBPProtectURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPProtectURLsResponse DescribeBPProtectURLs(DescribeBPProtectURLsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBPProtectURLsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBPProtectURLsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBPProtectURLs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询举报列表
     * @param req DescribeBPReportFakeURLsRequest
     * @return DescribeBPReportFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPReportFakeURLsResponse DescribeBPReportFakeURLs(DescribeBPReportFakeURLsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBPReportFakeURLsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBPReportFakeURLsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBPReportFakeURLs");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-查询作品监测详情接口
     * @param req DescribeCRMonitorDetailRequest
     * @return DescribeCRMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRMonitorDetailResponse DescribeCRMonitorDetail(DescribeCRMonitorDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCRMonitorDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCRMonitorDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCRMonitorDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-查询监测列表接口
     * @param req DescribeCRMonitorsRequest
     * @return DescribeCRMonitorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRMonitorsResponse DescribeCRMonitors(DescribeCRMonitorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCRMonitorsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCRMonitorsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCRMonitors");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询作品基本信息
     * @param req DescribeCRWorkInfoRequest
     * @return DescribeCRWorkInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRWorkInfoResponse DescribeCRWorkInfo(DescribeCRWorkInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCRWorkInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCRWorkInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCRWorkInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改下线材料
     * @param req ModifyBPOfflineAttachmentRequest
     * @return ModifyBPOfflineAttachmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBPOfflineAttachmentResponse ModifyBPOfflineAttachment(ModifyBPOfflineAttachmentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBPOfflineAttachmentResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBPOfflineAttachmentResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBPOfflineAttachment");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-拦截申请接口
     * @param req ModifyCRBlockStatusRequest
     * @return ModifyCRBlockStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRBlockStatusResponse ModifyCRBlockStatus(ModifyCRBlockStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCRBlockStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCRBlockStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCRBlockStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-修改监测状态接口
     * @param req ModifyCRMonitorRequest
     * @return ModifyCRMonitorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRMonitorResponse ModifyCRMonitor(ModifyCRMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCRMonitorResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCRMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCRMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *申请取证
     * @param req ModifyCRObtainStatusRequest
     * @return ModifyCRObtainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRObtainStatusResponse ModifyCRObtainStatus(ModifyCRObtainStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCRObtainStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCRObtainStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCRObtainStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *版权保护-维权申请接口
     * @param req ModifyCRRightStatusRequest
     * @return ModifyCRRightStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRRightStatusResponse ModifyCRRightStatus(ModifyCRRightStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCRRightStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCRRightStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCRRightStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新作品
     * @param req UpdateCRWorkRequest
     * @return UpdateCRWorkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCRWorkResponse UpdateCRWork(UpdateCRWorkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateCRWorkResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateCRWorkResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateCRWork");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
