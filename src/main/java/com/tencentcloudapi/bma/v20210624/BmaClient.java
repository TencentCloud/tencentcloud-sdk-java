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
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPFakeURL", CreateBPFakeURLResponse.class);
    }

    /**
     *添加误报工单
     * @param req CreateBPFalseTicketRequest
     * @return CreateBPFalseTicketResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPFalseTicketResponse CreateBPFalseTicket(CreateBPFalseTicketRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPFalseTicket", CreateBPFalseTicketResponse.class);
    }

    /**
     *添加下线材料
     * @param req CreateBPOfflineAttachmentRequest
     * @return CreateBPOfflineAttachmentResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPOfflineAttachmentResponse CreateBPOfflineAttachment(CreateBPOfflineAttachmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPOfflineAttachment", CreateBPOfflineAttachmentResponse.class);
    }

    /**
     *添加下线工单
     * @param req CreateBPOfflineTicketRequest
     * @return CreateBPOfflineTicketResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPOfflineTicketResponse CreateBPOfflineTicket(CreateBPOfflineTicketRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPOfflineTicket", CreateBPOfflineTicketResponse.class);
    }

    /**
     *添加保护网站
     * @param req CreateBPProtectURLsRequest
     * @return CreateBPProtectURLsResponse
     * @throws TencentCloudSDKException
     */
    public CreateBPProtectURLsResponse CreateBPProtectURLs(CreateBPProtectURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBPProtectURLs", CreateBPProtectURLsResponse.class);
    }

    /**
     *新建协查处置

     * @param req CreateCRBlockRequest
     * @return CreateCRBlockResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRBlockResponse CreateCRBlock(CreateCRBlockRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRBlock", CreateCRBlockResponse.class);
    }

    /**
     *本接口用于企业认证，新接入用户必须认证后才可以进行后续操作（个人认证和企业认证二选一），只需认证一次即可
     * @param req CreateCRCompanyVerifyRequest
     * @return CreateCRCompanyVerifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRCompanyVerifyResponse CreateCRCompanyVerify(CreateCRCompanyVerifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRCompanyVerify", CreateCRCompanyVerifyResponse.class);
    }

    /**
     *新建过程取证码
     * @param req CreateCRDesktopCodeRequest
     * @return CreateCRDesktopCodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRDesktopCodeResponse CreateCRDesktopCode(CreateCRDesktopCodeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRDesktopCode", CreateCRDesktopCodeResponse.class);
    }

    /**
     *版权保护-新建发函接口
     * @param req CreateCRRightRequest
     * @return CreateCRRightResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRRightResponse CreateCRRight(CreateCRRightRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRRight", CreateCRRightResponse.class);
    }

    /**
     *权属文件添加
     * @param req CreateCRRightFileRequest
     * @return CreateCRRightFileResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRRightFileResponse CreateCRRightFile(CreateCRRightFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRRightFile", CreateCRRightFileResponse.class);
    }

    /**
     *举报侵权链接
     * @param req CreateCRTortRequest
     * @return CreateCRTortResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRTortResponse CreateCRTort(CreateCRTortRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRTort", CreateCRTortResponse.class);
    }

    /**
     *本接口用于个人认证，新接入用户必须认证后才可以进行后续操作（个人认证和企业认证二选一），只需认证一次即可
     * @param req CreateCRUserVerifyRequest
     * @return CreateCRUserVerifyResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRUserVerifyResponse CreateCRUserVerify(CreateCRUserVerifyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRUserVerify", CreateCRUserVerifyResponse.class);
    }

    /**
     *新建作品
     * @param req CreateCRWorkRequest
     * @return CreateCRWorkResponse
     * @throws TencentCloudSDKException
     */
    public CreateCRWorkResponse CreateCRWork(CreateCRWorkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCRWork", CreateCRWorkResponse.class);
    }

    /**
     *查询企业信息
     * @param req DescribeBPCompanyInfoRequest
     * @return DescribeBPCompanyInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPCompanyInfoResponse DescribeBPCompanyInfo(DescribeBPCompanyInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPCompanyInfo", DescribeBPCompanyInfoResponse.class);
    }

    /**
     *查询仿冒链接
     * @param req DescribeBPFakeURLsRequest
     * @return DescribeBPFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPFakeURLsResponse DescribeBPFakeURLs(DescribeBPFakeURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPFakeURLs", DescribeBPFakeURLsResponse.class);
    }

    /**
     *查询保护网站
     * @param req DescribeBPProtectURLsRequest
     * @return DescribeBPProtectURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPProtectURLsResponse DescribeBPProtectURLs(DescribeBPProtectURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPProtectURLs", DescribeBPProtectURLsResponse.class);
    }

    /**
     *查询举报列表
     * @param req DescribeBPReportFakeURLsRequest
     * @return DescribeBPReportFakeURLsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBPReportFakeURLsResponse DescribeBPReportFakeURLs(DescribeBPReportFakeURLsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBPReportFakeURLs", DescribeBPReportFakeURLsResponse.class);
    }

    /**
     *版权保护-查询作品监测详情接口
     * @param req DescribeCRMonitorDetailRequest
     * @return DescribeCRMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRMonitorDetailResponse DescribeCRMonitorDetail(DescribeCRMonitorDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCRMonitorDetail", DescribeCRMonitorDetailResponse.class);
    }

    /**
     *版权保护-查询监测列表接口
     * @param req DescribeCRMonitorsRequest
     * @return DescribeCRMonitorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRMonitorsResponse DescribeCRMonitors(DescribeCRMonitorsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCRMonitors", DescribeCRMonitorsResponse.class);
    }

    /**
     *查询取证详情
     * @param req DescribeCRObtainDetailRequest
     * @return DescribeCRObtainDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRObtainDetailResponse DescribeCRObtainDetail(DescribeCRObtainDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCRObtainDetail", DescribeCRObtainDetailResponse.class);
    }

    /**
     *查询作品基本信息
     * @param req DescribeCRWorkInfoRequest
     * @return DescribeCRWorkInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCRWorkInfoResponse DescribeCRWorkInfo(DescribeCRWorkInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCRWorkInfo", DescribeCRWorkInfoResponse.class);
    }

    /**
     *修改下线材料
     * @param req ModifyBPOfflineAttachmentRequest
     * @return ModifyBPOfflineAttachmentResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBPOfflineAttachmentResponse ModifyBPOfflineAttachment(ModifyBPOfflineAttachmentRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyBPOfflineAttachment", ModifyBPOfflineAttachmentResponse.class);
    }

    /**
     *协查处置申请
     * @param req ModifyCRBlockStatusRequest
     * @return ModifyCRBlockStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRBlockStatusResponse ModifyCRBlockStatus(ModifyCRBlockStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCRBlockStatus", ModifyCRBlockStatusResponse.class);
    }

    /**
     *开启/关闭监测
     * @param req ModifyCRMonitorRequest
     * @return ModifyCRMonitorResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRMonitorResponse ModifyCRMonitor(ModifyCRMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCRMonitor", ModifyCRMonitorResponse.class);
    }

    /**
     *取证申请
     * @param req ModifyCRObtainStatusRequest
     * @return ModifyCRObtainStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRObtainStatusResponse ModifyCRObtainStatus(ModifyCRObtainStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCRObtainStatus", ModifyCRObtainStatusResponse.class);
    }

    /**
     *发函申请
     * @param req ModifyCRRightStatusRequest
     * @return ModifyCRRightStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRRightStatusResponse ModifyCRRightStatus(ModifyCRRightStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCRRightStatus", ModifyCRRightStatusResponse.class);
    }

    /**
     *修改白名单列表
     * @param req ModifyCRWhiteListRequest
     * @return ModifyCRWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCRWhiteListResponse ModifyCRWhiteList(ModifyCRWhiteListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCRWhiteList", ModifyCRWhiteListResponse.class);
    }

    /**
     *更新作品
     * @param req UpdateCRWorkRequest
     * @return UpdateCRWorkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateCRWorkResponse UpdateCRWork(UpdateCRWorkRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateCRWork", UpdateCRWorkResponse.class);
    }

}
