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
package com.tencentcloudapi.acp.v20220105;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.acp.v20220105.models.*;

public class AcpClient extends AbstractClient{
    private static String endpoint = "acp.tencentcloudapi.com";
    private static String service = "acp";
    private static String version = "2022-01-05";

    public AcpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public AcpClient(Credential credential, String region, ClientProfile profile) {
        super(AcpClient.endpoint, AcpClient.version, credential, region, profile);
    }

    /**
     *创建应用合规隐私诊断任务
     * @param req CreateAppScanTaskRequest
     * @return CreateAppScanTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppScanTaskResponse CreateAppScanTask(CreateAppScanTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAppScanTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAppScanTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAppScanTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *App应用合规隐私诊断重试任务
     * @param req CreateAppScanTaskRepeatRequest
     * @return CreateAppScanTaskRepeatResponse
     * @throws TencentCloudSDKException
     */
    public CreateAppScanTaskRepeatResponse CreateAppScanTaskRepeat(CreateAppScanTaskRepeatRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAppScanTaskRepeatResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAppScanTaskRepeatResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAppScanTaskRepeat");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取应用合规文件上传凭证，用于上传诊断文件
     * @param req DescribeFileTicketRequest
     * @return DescribeFileTicketResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFileTicketResponse DescribeFileTicket(DescribeFileTicketRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFileTicketResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFileTicketResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFileTicket");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询应用合规平台用户资源的使用情况
     * @param req DescribeResourceUsageInfoRequest
     * @return DescribeResourceUsageInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeResourceUsageInfoResponse DescribeResourceUsageInfo(DescribeResourceUsageInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeResourceUsageInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeResourceUsageInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeResourceUsageInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取App隐私合规诊断任务列表
     * @param req DescribeScanTaskListRequest
     * @return DescribeScanTaskListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskListResponse DescribeScanTaskList(DescribeScanTaskListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanTaskListResponse> rsp = null;
        String rspStr = "";
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
     *获取App合规诊断任务报告url
     * @param req DescribeScanTaskReportUrlRequest
     * @return DescribeScanTaskReportUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskReportUrlResponse DescribeScanTaskReportUrl(DescribeScanTaskReportUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanTaskReportUrlResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanTaskReportUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanTaskReportUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询App隐私合规诊断任务状态
     * @param req DescribeScanTaskStatusRequest
     * @return DescribeScanTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScanTaskStatusResponse DescribeScanTaskStatus(DescribeScanTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScanTaskStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScanTaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScanTaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
