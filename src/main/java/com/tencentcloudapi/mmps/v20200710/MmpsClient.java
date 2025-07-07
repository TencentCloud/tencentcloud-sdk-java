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
package com.tencentcloudapi.mmps.v20200710;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mmps.v20200710.models.*;

public class MmpsClient extends AbstractClient{
    private static String endpoint = "mmps.tencentcloudapi.com";
    private static String service = "mmps";
    private static String version = "2020-07-10";

    public MmpsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MmpsClient(Credential credential, String region, ClientProfile profile) {
        super(MmpsClient.endpoint, MmpsClient.version, credential, region, profile);
    }

    /**
     *创建小程序隐私合规诊断任务
     * @param req CreateAppScanTaskRequest
     * @return CreateAppScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppScanTaskResponse CreateAppScanTask(CreateAppScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAppScanTask", CreateAppScanTaskResponse.class);
    }

    /**
     *小程序隐私合规诊断重试任务
     * @param req CreateAppScanTaskRepeatRequest
     * @return CreateAppScanTaskRepeatResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppScanTaskRepeatResponse CreateAppScanTaskRepeat(CreateAppScanTaskRepeatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateAppScanTaskRepeat", CreateAppScanTaskRepeatResponse.class);
    }

    /**
     *创建小程序安全深度诊断任务
     * @param req CreateFlySecMiniAppProfessionalScanTaskRequest
     * @return CreateFlySecMiniAppProfessionalScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlySecMiniAppProfessionalScanTaskResponse CreateFlySecMiniAppProfessionalScanTask(CreateFlySecMiniAppProfessionalScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFlySecMiniAppProfessionalScanTask", CreateFlySecMiniAppProfessionalScanTaskResponse.class);
    }

    /**
     *创建小程序翼扬安全的基础或深度诊断任务
     * @param req CreateFlySecMiniAppScanTaskRequest
     * @return CreateFlySecMiniAppScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlySecMiniAppScanTaskResponse CreateFlySecMiniAppScanTask(CreateFlySecMiniAppScanTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFlySecMiniAppScanTask", CreateFlySecMiniAppScanTaskResponse.class);
    }

    /**
     *重新提交基础诊断任务
     * @param req CreateFlySecMiniAppScanTaskRepeatRequest
     * @return CreateFlySecMiniAppScanTaskRepeatResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlySecMiniAppScanTaskRepeatResponse CreateFlySecMiniAppScanTaskRepeat(CreateFlySecMiniAppScanTaskRepeatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateFlySecMiniAppScanTaskRepeat", CreateFlySecMiniAppScanTaskRepeatResponse.class);
    }

    /**
     *查询翼扬安全基础诊断资源使用情况
     * @param req DescribeBasicDiagnosisResourceUsageInfoRequest
     * @return DescribeBasicDiagnosisResourceUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBasicDiagnosisResourceUsageInfoResponse DescribeBasicDiagnosisResourceUsageInfo(DescribeBasicDiagnosisResourceUsageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBasicDiagnosisResourceUsageInfo", DescribeBasicDiagnosisResourceUsageInfoResponse.class);
    }

    /**
     *获取翼扬诊断任务报告链接地址
     * @param req DescribeFlySecMiniAppReportUrlRequest
     * @return DescribeFlySecMiniAppReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlySecMiniAppReportUrlResponse DescribeFlySecMiniAppReportUrl(DescribeFlySecMiniAppReportUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlySecMiniAppReportUrl", DescribeFlySecMiniAppReportUrlResponse.class);
    }

    /**
     *查询指定小程序版本的翼扬诊断安全得分
     * @param req DescribeFlySecMiniAppScanReportListRequest
     * @return DescribeFlySecMiniAppScanReportListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlySecMiniAppScanReportListResponse DescribeFlySecMiniAppScanReportList(DescribeFlySecMiniAppScanReportListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlySecMiniAppScanReportList", DescribeFlySecMiniAppScanReportListResponse.class);
    }

    /**
     *获取翼扬安全诊断任务列表
     * @param req DescribeFlySecMiniAppScanTaskListRequest
     * @return DescribeFlySecMiniAppScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlySecMiniAppScanTaskListResponse DescribeFlySecMiniAppScanTaskList(DescribeFlySecMiniAppScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlySecMiniAppScanTaskList", DescribeFlySecMiniAppScanTaskListResponse.class);
    }

    /**
     *获取用户提交的基础诊断任务参数信息
     * @param req DescribeFlySecMiniAppScanTaskParamRequest
     * @return DescribeFlySecMiniAppScanTaskParamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlySecMiniAppScanTaskParamResponse DescribeFlySecMiniAppScanTaskParam(DescribeFlySecMiniAppScanTaskParamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlySecMiniAppScanTaskParam", DescribeFlySecMiniAppScanTaskParamResponse.class);
    }

    /**
     *查询翼扬安全诊断任务状态
     * @param req DescribeFlySecMiniAppScanTaskStatusRequest
     * @return DescribeFlySecMiniAppScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlySecMiniAppScanTaskStatusResponse DescribeFlySecMiniAppScanTaskStatus(DescribeFlySecMiniAppScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeFlySecMiniAppScanTaskStatus", DescribeFlySecMiniAppScanTaskStatusResponse.class);
    }

    /**
     *查询翼扬安全资源使用情况
     * @param req DescribeResourceUsageInfoRequest
     * @return DescribeResourceUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageInfoResponse DescribeResourceUsageInfo(DescribeResourceUsageInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeResourceUsageInfo", DescribeResourceUsageInfoResponse.class);
    }

    /**
     *获取小程序隐私合规诊断任务列表
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskList", DescribeScanTaskListResponse.class);
    }

    /**
     *获取小程序合规诊断任务报告url
     * @param req DescribeScanTaskReportUrlRequest
     * @return DescribeScanTaskReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskReportUrlResponse DescribeScanTaskReportUrl(DescribeScanTaskReportUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskReportUrl", DescribeScanTaskReportUrlResponse.class);
    }

    /**
     *查询小程序隐私合规诊断任务状态
     * @param req DescribeScanTaskStatusRequest
     * @return DescribeScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskStatusResponse DescribeScanTaskStatus(DescribeScanTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeScanTaskStatus", DescribeScanTaskStatusResponse.class);
    }

}
