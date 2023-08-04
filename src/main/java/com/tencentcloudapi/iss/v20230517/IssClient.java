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
package com.tencentcloudapi.iss.v20230517;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iss.v20230517.models.*;

public class IssClient extends AbstractClient{
    private static String endpoint = "iss.tencentcloudapi.com";
    private static String service = "iss";
    private static String version = "2023-05-17";
    
    public IssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IssClient(Credential credential, String region, ClientProfile profile) {
        super(IssClient.endpoint, IssClient.version, credential, region, profile);
    }

    /**
     *添加AI任务
     * @param req AddAITaskRequest
     * @return AddAITaskResponse
     * @throws TencentCloudSDKException
     */
    public AddAITaskResponse AddAITask(AddAITaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAITaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddAITaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAITask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新增组织。
     * @param req AddOrganizationRequest
     * @return AddOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationResponse AddOrganization(AddOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新增录像上云计划 （当前仅适用于通过GB28181协议和网关接入的设备/视频通道）
     * @param req AddRecordBackupPlanRequest
     * @return AddRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordBackupPlanResponse AddRecordBackupPlan(AddRecordBackupPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddRecordBackupPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddRecordBackupPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRecordBackupPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新增录像上云模板。
> 该功能本质是拉取设备本地录像数据上云（即存在 IPC 摄像头存储卡或 NVR 硬盘中的录像），操作时需先设定录像时间段（即想要上云的设备本地录像），再设定上云时间段和上云倍速，平台将于上云时间段倍速拉取设备对应前一天的录像时间段数据。

> 设定需至少满足（上云时间段=前一天的录像时间段/上云倍速），建议上云时间段可多设定10%左右的时间，避免因网络波动导致数据拉取不完整。
     * @param req AddRecordBackupTemplateRequest
     * @return AddRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordBackupTemplateResponse AddRecordBackupTemplate(AddRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddRecordBackupTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddRecordBackupTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRecordBackupTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新增实时上云计划
     * @param req AddRecordPlanRequest
     * @return AddRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordPlanResponse AddRecordPlan(AddRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddRecordPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新建取回任务
     * @param req AddRecordRetrieveTaskRequest
     * @return AddRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordRetrieveTaskResponse AddRecordRetrieveTask(AddRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddRecordRetrieveTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddRecordRetrieveTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRecordRetrieveTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新增实时上云模板
     * @param req AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordTemplateResponse AddRecordTemplate(AddRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddRecordTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于设置推拉流鉴权配置。
     * @param req AddStreamAuthRequest
     * @return AddStreamAuthResponse
     * @throws TencentCloudSDKException
     */
    public AddStreamAuthResponse AddStreamAuth(AddStreamAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddStreamAuthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddStreamAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddStreamAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于新增单个设备。添加设备之后，可根据返回结果到设备上进行配置，配置后等待设备注册/推流。
     * @param req AddUserDeviceRequest
     * @return AddUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddUserDeviceResponse AddUserDevice(AddUserDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserDeviceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于检测域名是否备案。
     * @param req CheckDomainRequest
     * @return CheckDomainResponse
     * @throws TencentCloudSDKException
     */
    public CheckDomainResponse CheckDomain(CheckDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CheckDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CheckDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于设备通道云台控制，包括转动、变倍、变焦、光圈等。
     * @param req ControlDevicePTZRequest
     * @return ControlDevicePTZResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePTZResponse ControlDevicePTZ(ControlDevicePTZRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDevicePTZResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ControlDevicePTZResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlDevicePTZ");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于操作设备预置位，包括设置、删除、调用。
     * @param req ControlDevicePresetRequest
     * @return ControlDevicePresetResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePresetResponse ControlDevicePreset(ControlDevicePresetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDevicePresetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ControlDevicePresetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlDevicePreset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取设备的实时开流地址。
     * @param req ControlDeviceStreamRequest
     * @return ControlDeviceStreamResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceStreamResponse ControlDeviceStream(ControlDeviceStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDeviceStreamResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ControlDeviceStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlDeviceStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于录像回放过程中的倍速、跳转、播放/暂停/停止等控制。
     * @param req ControlRecordRequest
     * @return ControlRecordResponse
     * @throws TencentCloudSDKException
     */
    public ControlRecordResponse ControlRecord(ControlRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ControlRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询设备本地录像时间轴信息，为NVR/IPC本地存储的录像。
     * @param req ControlRecordTimelineRequest
     * @return ControlRecordTimelineResponse
     * @throws TencentCloudSDKException
     */
    public ControlRecordTimelineResponse ControlRecordTimeline(ControlRecordTimelineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlRecordTimelineResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ControlRecordTimelineResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlRecordTimeline");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除AI任务
     * @param req DeleteAITaskRequest
     * @return DeleteAITaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAITaskResponse DeleteAITask(DeleteAITaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAITaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAITaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAITask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除域名。
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除网关。
     * @param req DeleteGatewayRequest
     * @return DeleteGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatewayResponse DeleteGateway(DeleteGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除组织。
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除录像上云模板。
     * @param req DeleteRecordBackupPlanRequest
     * @return DeleteRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBackupPlanResponse DeleteRecordBackupPlan(DeleteRecordBackupPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordBackupPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordBackupPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordBackupPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除录像上云模板。
     * @param req DeleteRecordBackupTemplateRequest
     * @return DeleteRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBackupTemplateResponse DeleteRecordBackupTemplate(DeleteRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordBackupTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordBackupTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordBackupTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除实时上云计划
     * @param req DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordPlanResponse DeleteRecordPlan(DeleteRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除取回任务
     * @param req DeleteRecordRetrieveTaskRequest
     * @return DeleteRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordRetrieveTaskResponse DeleteRecordRetrieveTask(DeleteRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordRetrieveTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordRetrieveTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordRetrieveTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除实时上云模板
     * @param req DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTemplateResponse DeleteRecordTemplate(DeleteRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除已添加的设备。
     * @param req DeleteUserDeviceRequest
     * @return DeleteUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserDeviceResponse DeleteUserDevice(DeleteUserDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserDeviceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取AI任务详情
     * @param req DescribeAITaskRequest
     * @return DescribeAITaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITaskResponse DescribeAITask(DescribeAITaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAITaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAITaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAITask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取AI任务识别结果
     * @param req DescribeAITaskResultRequest
     * @return DescribeAITaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITaskResultResponse DescribeAITaskResult(DescribeAITaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAITaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAITaskResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAITaskResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于根据服务节点获取 CNAME 值。
     * @param req DescribeCNAMERequest
     * @return DescribeCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCNAMEResponse DescribeCNAME(DescribeCNAMERequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCNAMEResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCNAMEResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCNAME");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询设备的通道。
     * @param req DescribeDeviceChannelRequest
     * @return DescribeDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceChannelResponse DescribeDeviceChannel(DescribeDeviceChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询设备通道预置位信息。
     * @param req DescribeDevicePresetRequest
     * @return DescribeDevicePresetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePresetResponse DescribeDevicePreset(DescribeDevicePresetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePresetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePresetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevicePreset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于添加设备时，查询设备可以使用的服务节点，查询结果为已经绑定了域名的服务节点。
     * @param req DescribeDeviceRegionRequest
     * @return DescribeDeviceRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceRegionResponse DescribeDeviceRegion(DescribeDeviceRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询添加的域名列表。
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomain");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于用户添加域名时，查询可以绑定的服务节点，结果为平台支持的所有服务节点。（注意：每个服务节点只能绑定一个域名）
     * @param req DescribeDomainRegionRequest
     * @return DescribeDomainRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainRegionResponse DescribeDomainRegion(DescribeDomainRegionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainRegionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainRegionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainRegion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取网关详情。
     * @param req DescribeGatewayRequest
     * @return DescribeGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayResponse DescribeGateway(DescribeGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取网关的数据及流量监控信息。
     * @param req DescribeGatewayMonitorRequest
     * @return DescribeGatewayMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayMonitorResponse DescribeGatewayMonitor(DescribeGatewayMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayMonitorResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayMonitorResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayMonitor");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询网关接入协议。
     * @param req DescribeGatewayProtocolRequest
     * @return DescribeGatewayProtocolResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayProtocolResponse DescribeGatewayProtocol(DescribeGatewayProtocolRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayProtocolResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayProtocolResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayProtocol");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询网关服务版本
     * @param req DescribeGatewayVersionRequest
     * @return DescribeGatewayVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayVersionResponse DescribeGatewayVersion(DescribeGatewayVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGatewayVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGatewayVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询组织。
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询录像上云计划详情。
     * @param req DescribeRecordBackupPlanRequest
     * @return DescribeRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordBackupPlanResponse DescribeRecordBackupPlan(DescribeRecordBackupPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordBackupPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordBackupPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordBackupPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询录像上云模板详情。
     * @param req DescribeRecordBackupTemplateRequest
     * @return DescribeRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordBackupTemplateResponse DescribeRecordBackupTemplate(DescribeRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordBackupTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordBackupTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordBackupTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询设备云端录像时间轴信息（即为视频上云后设置录像计划后云存储的录像）
     * @param req DescribeRecordFileRequest
     * @return DescribeRecordFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordFileResponse DescribeRecordFile(DescribeRecordFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordFileResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询实时上云计划详情
     * @param req DescribeRecordPlanRequest
     * @return DescribeRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordPlanResponse DescribeRecordPlan(DescribeRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取云端录像回放url地址
     * @param req DescribeRecordPlaybackUrlRequest
     * @return DescribeRecordPlaybackUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordPlaybackUrlResponse DescribeRecordPlaybackUrl(DescribeRecordPlaybackUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordPlaybackUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordPlaybackUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordPlaybackUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询云录像取回任务详情
     * @param req DescribeRecordRetrieveTaskRequest
     * @return DescribeRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordRetrieveTaskResponse DescribeRecordRetrieveTask(DescribeRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordRetrieveTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordRetrieveTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordRetrieveTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询实时上云模板详情
     * @param req DescribeRecordTemplateRequest
     * @return DescribeRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTemplateResponse DescribeRecordTemplate(DescribeRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询推拉流鉴权配置。
     * @param req DescribeStreamAuthRequest
     * @return DescribeStreamAuthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamAuthResponse DescribeStreamAuth(DescribeStreamAuthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStreamAuthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStreamAuthResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStreamAuth");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询设备的详细信息。
     * @param req DescribeUserDeviceRequest
     * @return DescribeUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDeviceResponse DescribeUserDevice(DescribeUserDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserDeviceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取云录像下载 url
     * @param req DescribeVideoDownloadUrlRequest
     * @return DescribeVideoDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoDownloadUrlResponse DescribeVideoDownloadUrl(DescribeVideoDownloadUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoDownloadUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoDownloadUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoDownloadUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取AI任务列表
     * @param req ListAITasksRequest
     * @return ListAITasksResponse
     * @throws TencentCloudSDKException
     */
    public ListAITasksResponse ListAITasks(ListAITasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAITasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListAITasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAITasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取对应组织下的设备列表。
     * @param req ListDevicesRequest
     * @return ListDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListDevicesResponse ListDevices(ListDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListDevicesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取网关列表。
     * @param req ListGatewaysRequest
     * @return ListGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public ListGatewaysResponse ListGateways(ListGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListGatewaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListGatewaysResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListGateways");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询组织目录下的未添加到实时上云计划中的通道数量
     * @param req ListOrganizationChannelNumbersRequest
     * @return ListOrganizationChannelNumbersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationChannelNumbersResponse ListOrganizationChannelNumbers(ListOrganizationChannelNumbersRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationChannelNumbersResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationChannelNumbersResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationChannelNumbers");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询组织目录下的通道列表
     * @param req ListOrganizationChannelsRequest
     * @return ListOrganizationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationChannelsResponse ListOrganizationChannels(ListOrganizationChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListOrganizationChannelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListOrganizationChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListOrganizationChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询录像上云计划下的设备通道列表。
     * @param req ListRecordBackupPlanDevicesRequest
     * @return ListRecordBackupPlanDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupPlanDevicesResponse ListRecordBackupPlanDevices(ListRecordBackupPlanDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordBackupPlanDevicesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordBackupPlanDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordBackupPlanDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询录像上云计划列表。
     * @param req ListRecordBackupPlansRequest
     * @return ListRecordBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupPlansResponse ListRecordBackupPlans(ListRecordBackupPlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordBackupPlansResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordBackupPlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordBackupPlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询录像上云模板列表。
     * @param req ListRecordBackupTemplatesRequest
     * @return ListRecordBackupTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupTemplatesResponse ListRecordBackupTemplates(ListRecordBackupTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordBackupTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordBackupTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordBackupTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询用户下所有实时上云计划中的通道列表
     * @param req ListRecordPlanChannelsRequest
     * @return ListRecordPlanChannelsResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlanChannelsResponse ListRecordPlanChannels(ListRecordPlanChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordPlanChannelsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordPlanChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordPlanChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询实时上云计划下的设备通道列表
     * @param req ListRecordPlanDevicesRequest
     * @return ListRecordPlanDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlanDevicesResponse ListRecordPlanDevices(ListRecordPlanDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordPlanDevicesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordPlanDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordPlanDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询实时上云计划列表
     * @param req ListRecordPlansRequest
     * @return ListRecordPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlansResponse ListRecordPlans(ListRecordPlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordPlansResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordPlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordPlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询取回任务列表
     * @param req ListRecordRetrieveTasksRequest
     * @return ListRecordRetrieveTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordRetrieveTasksResponse ListRecordRetrieveTasks(ListRecordRetrieveTasksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordRetrieveTasksResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordRetrieveTasksResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordRetrieveTasks");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询实时上云模板列表
     * @param req ListRecordTemplatesRequest
     * @return ListRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordTemplatesResponse ListRecordTemplates(ListRecordTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListRecordTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ListRecordTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListRecordTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于获取设备本地录像 URL 地址。
     * @param req PlayRecordRequest
     * @return PlayRecordResponse
     * @throws TencentCloudSDKException
     */
    public PlayRecordResponse PlayRecord(PlayRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PlayRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PlayRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PlayRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于刷新国标设备的通道（接口调用后，触发向设备请求通道列表，新增的通道入库，设备上已删除的通道需自行删除、后台不自动删除）。
     * @param req RefreshDeviceChannelRequest
     * @return RefreshDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public RefreshDeviceChannelResponse RefreshDeviceChannel(RefreshDeviceChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefreshDeviceChannelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RefreshDeviceChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefreshDeviceChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新AI任务
     * @param req UpdateAITaskRequest
     * @return UpdateAITaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAITaskResponse UpdateAITask(UpdateAITaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAITaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAITaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAITask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新 AI 任务状态
     * @param req UpdateAITaskStatusRequest
     * @return UpdateAITaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAITaskStatusResponse UpdateAITaskStatus(UpdateAITaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateAITaskStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateAITaskStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateAITaskStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于批量更改设备的组织。
     * @param req UpdateDeviceOrganizationRequest
     * @return UpdateDeviceOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceOrganizationResponse UpdateDeviceOrganization(UpdateDeviceOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDeviceOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于启用/禁用设备，禁用后拒绝设备注册。
     * @param req UpdateDeviceStatusRequest
     * @return UpdateDeviceStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceStatusResponse UpdateDeviceStatus(UpdateDeviceStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDeviceStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改网关信息（支持对网关名称和描述的修改）。
     * @param req UpdateGatewayRequest
     * @return UpdateGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGatewayResponse UpdateGateway(UpdateGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改组织。
     * @param req UpdateOrganizationRequest
     * @return UpdateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationResponse UpdateOrganization(UpdateOrganizationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrganizationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrganizationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOrganization");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改录像上云计划。
     * @param req UpdateRecordBackupPlanRequest
     * @return UpdateRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordBackupPlanResponse UpdateRecordBackupPlan(UpdateRecordBackupPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordBackupPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecordBackupPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecordBackupPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改录像上云模板。
     * @param req UpdateRecordBackupTemplateRequest
     * @return UpdateRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordBackupTemplateResponse UpdateRecordBackupTemplate(UpdateRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordBackupTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecordBackupTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecordBackupTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改实时上云计划
     * @param req UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordPlanResponse UpdateRecordPlan(UpdateRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordPlanResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改实时上云模板
     * @param req UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordTemplateResponse UpdateRecordTemplate(UpdateRecordTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateRecordTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateRecordTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于修改设备的配置信息。
     * @param req UpdateUserDeviceRequest
     * @return UpdateUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserDeviceResponse UpdateUserDevice(UpdateUserDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateUserDeviceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateUserDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateUserDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于网关升级（支持对所有待更新的服务一键升级）。
     * @param req UpgradeGatewayRequest
     * @return UpgradeGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGatewayResponse UpgradeGateway(UpgradeGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpgradeGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpgradeGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpgradeGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
