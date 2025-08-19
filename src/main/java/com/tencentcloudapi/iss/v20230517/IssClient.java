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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddAITask", AddAITaskResponse.class);
    }

    /**
     *用于新增组织。
     * @param req AddOrganizationRequest
     * @return AddOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public AddOrganizationResponse AddOrganization(AddOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddOrganization", AddOrganizationResponse.class);
    }

    /**
     *用于新增录像上云计划 （当前仅适用于通过GB28181协议和网关接入的设备/视频通道）
     * @param req AddRecordBackupPlanRequest
     * @return AddRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordBackupPlanResponse AddRecordBackupPlan(AddRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordBackupPlan", AddRecordBackupPlanResponse.class);
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
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordBackupTemplate", AddRecordBackupTemplateResponse.class);
    }

    /**
     *用于新增实时上云计划
     * @param req AddRecordPlanRequest
     * @return AddRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordPlanResponse AddRecordPlan(AddRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordPlan", AddRecordPlanResponse.class);
    }

    /**
     *用于新建取回任务
     * @param req AddRecordRetrieveTaskRequest
     * @return AddRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordRetrieveTaskResponse AddRecordRetrieveTask(AddRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordRetrieveTask", AddRecordRetrieveTaskResponse.class);
    }

    /**
     *用于新增实时上云模板
     * @param req AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public AddRecordTemplateResponse AddRecordTemplate(AddRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddRecordTemplate", AddRecordTemplateResponse.class);
    }

    /**
     *用于设置推拉流鉴权配置。
     * @param req AddStreamAuthRequest
     * @return AddStreamAuthResponse
     * @throws TencentCloudSDKException
     */
    public AddStreamAuthResponse AddStreamAuth(AddStreamAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddStreamAuth", AddStreamAuthResponse.class);
    }

    /**
     *用于新增单个设备。添加设备之后，可根据返回结果到设备上进行配置，配置后等待设备注册/推流。
     * @param req AddUserDeviceRequest
     * @return AddUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddUserDeviceResponse AddUserDevice(AddUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddUserDevice", AddUserDeviceResponse.class);
    }

    /**
     *用于批量删除本地录像下载失败的任务
     * @param req BatchDeleteVideoDownloadTaskRequest
     * @return BatchDeleteVideoDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteVideoDownloadTaskResponse BatchDeleteVideoDownloadTask(BatchDeleteVideoDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteVideoDownloadTask", BatchDeleteVideoDownloadTaskResponse.class);
    }

    /**
     *用于批量操作（启用，禁用，删除）设备
     * @param req BatchOperateDeviceRequest
     * @return BatchOperateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public BatchOperateDeviceResponse BatchOperateDevice(BatchOperateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchOperateDevice", BatchOperateDeviceResponse.class);
    }

    /**
     *本接口可基于海康ISUP 5.0协议实现透传ISAPI的请求数据，调用接口前需确保设备采用ISUP协议成功注册至本平台
     * @param req CallISAPIRequest
     * @return CallISAPIResponse
     * @throws TencentCloudSDKException
     */
    public CallISAPIResponse CallISAPI(CallISAPIRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CallISAPI", CallISAPIResponse.class);
    }

    /**
     *用于设备通道云台控制，包括转动、变倍、变焦、光圈等。
     * @param req ControlDevicePTZRequest
     * @return ControlDevicePTZResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePTZResponse ControlDevicePTZ(ControlDevicePTZRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDevicePTZ", ControlDevicePTZResponse.class);
    }

    /**
     *用于操作设备预置位，包括设置、删除、调用。
     * @param req ControlDevicePresetRequest
     * @return ControlDevicePresetResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePresetResponse ControlDevicePreset(ControlDevicePresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDevicePreset", ControlDevicePresetResponse.class);
    }

    /**
     *控制设备抓拍--单次，当前仅支持国标设备
     * @param req ControlDeviceSnapshotRequest
     * @return ControlDeviceSnapshotResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceSnapshotResponse ControlDeviceSnapshot(ControlDeviceSnapshotRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDeviceSnapshot", ControlDeviceSnapshotResponse.class);
    }

    /**
     *用于获取设备的实时开流地址。
     * @param req ControlDeviceStreamRequest
     * @return ControlDeviceStreamResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceStreamResponse ControlDeviceStream(ControlDeviceStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlDeviceStream", ControlDeviceStreamResponse.class);
    }

    /**
     *用于录像回放过程中的倍速、跳转、播放/暂停/停止等控制。
     * @param req ControlRecordRequest
     * @return ControlRecordResponse
     * @throws TencentCloudSDKException
     */
    public ControlRecordResponse ControlRecord(ControlRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlRecord", ControlRecordResponse.class);
    }

    /**
     *用于查询设备本地录像时间轴信息，为NVR/IPC本地存储的录像。
     * @param req ControlRecordTimelineRequest
     * @return ControlRecordTimelineResponse
     * @throws TencentCloudSDKException
     */
    public ControlRecordTimelineResponse ControlRecordTimeline(ControlRecordTimelineRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ControlRecordTimeline", ControlRecordTimelineResponse.class);
    }

    /**
     *创建本地录像下载任务
     * @param req CreateVideoDownloadTaskRequest
     * @return CreateVideoDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateVideoDownloadTaskResponse CreateVideoDownloadTask(CreateVideoDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateVideoDownloadTask", CreateVideoDownloadTaskResponse.class);
    }

    /**
     *删除AI任务
     * @param req DeleteAITaskRequest
     * @return DeleteAITaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAITaskResponse DeleteAITask(DeleteAITaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteAITask", DeleteAITaskResponse.class);
    }

    /**
     *用于删除域名。
     * @param req DeleteDomainRequest
     * @return DeleteDomainResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainResponse DeleteDomain(DeleteDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDomain", DeleteDomainResponse.class);
    }

    /**
     *用于删除网关。
     * @param req DeleteGatewayRequest
     * @return DeleteGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGatewayResponse DeleteGateway(DeleteGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGateway", DeleteGatewayResponse.class);
    }

    /**
     *用于删除组织。
     * @param req DeleteOrganizationRequest
     * @return DeleteOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrganizationResponse DeleteOrganization(DeleteOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteOrganization", DeleteOrganizationResponse.class);
    }

    /**
     *用于删除录像上云模板。
     * @param req DeleteRecordBackupPlanRequest
     * @return DeleteRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBackupPlanResponse DeleteRecordBackupPlan(DeleteRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordBackupPlan", DeleteRecordBackupPlanResponse.class);
    }

    /**
     *用于删除录像上云模板。
     * @param req DeleteRecordBackupTemplateRequest
     * @return DeleteRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordBackupTemplateResponse DeleteRecordBackupTemplate(DeleteRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordBackupTemplate", DeleteRecordBackupTemplateResponse.class);
    }

    /**
     *用于删除实时上云计划
     * @param req DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordPlanResponse DeleteRecordPlan(DeleteRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordPlan", DeleteRecordPlanResponse.class);
    }

    /**
     *用于删除取回任务
     * @param req DeleteRecordRetrieveTaskRequest
     * @return DeleteRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordRetrieveTaskResponse DeleteRecordRetrieveTask(DeleteRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordRetrieveTask", DeleteRecordRetrieveTaskResponse.class);
    }

    /**
     *用于删除实时上云模板
     * @param req DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordTemplateResponse DeleteRecordTemplate(DeleteRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteRecordTemplate", DeleteRecordTemplateResponse.class);
    }

    /**
     *用于删除执行完成的任务
     * @param req DeleteTaskRequest
     * @return DeleteTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTaskResponse DeleteTask(DeleteTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTask", DeleteTaskResponse.class);
    }

    /**
     *用于删除已添加的设备。
     * @param req DeleteUserDeviceRequest
     * @return DeleteUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserDeviceResponse DeleteUserDevice(DeleteUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteUserDevice", DeleteUserDeviceResponse.class);
    }

    /**
     *获取AI任务详情
     * @param req DescribeAITaskRequest
     * @return DescribeAITaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITaskResponse DescribeAITask(DescribeAITaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAITask", DescribeAITaskResponse.class);
    }

    /**
     *获取AI任务识别结果
     * @param req DescribeAITaskResultRequest
     * @return DescribeAITaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAITaskResultResponse DescribeAITaskResult(DescribeAITaskResultRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAITaskResult", DescribeAITaskResultResponse.class);
    }

    /**
     *用于根据服务节点获取 CNAME 值。
     * @param req DescribeCNAMERequest
     * @return DescribeCNAMEResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCNAMEResponse DescribeCNAME(DescribeCNAMERequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeCNAME", DescribeCNAMEResponse.class);
    }

    /**
     *用于查询设备的通道。
     * @param req DescribeDeviceChannelRequest
     * @return DescribeDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceChannelResponse DescribeDeviceChannel(DescribeDeviceChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceChannel", DescribeDeviceChannelResponse.class);
    }

    /**
     *用于查询设备通道预置位信息。
     * @param req DescribeDevicePresetRequest
     * @return DescribeDevicePresetResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePresetResponse DescribeDevicePreset(DescribeDevicePresetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDevicePreset", DescribeDevicePresetResponse.class);
    }

    /**
     *用于添加设备时，查询设备可以使用的服务节点，查询结果为已经绑定了域名的服务节点。
     * @param req DescribeDeviceRegionRequest
     * @return DescribeDeviceRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceRegionResponse DescribeDeviceRegion(DescribeDeviceRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceRegion", DescribeDeviceRegionResponse.class);
    }

    /**
     *用于查询添加的域名列表。
     * @param req DescribeDomainRequest
     * @return DescribeDomainResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainResponse DescribeDomain(DescribeDomainRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomain", DescribeDomainResponse.class);
    }

    /**
     *用于用户添加域名时，查询可以绑定的服务节点，结果为平台支持的所有服务节点。（注意：每个服务节点只能绑定一个域名）
     * @param req DescribeDomainRegionRequest
     * @return DescribeDomainRegionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainRegionResponse DescribeDomainRegion(DescribeDomainRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDomainRegion", DescribeDomainRegionResponse.class);
    }

    /**
     *用于获取国标设备的公网地址
     * @param req DescribeGBDeviceAddrRequest
     * @return DescribeGBDeviceAddrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGBDeviceAddrResponse DescribeGBDeviceAddr(DescribeGBDeviceAddrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGBDeviceAddr", DescribeGBDeviceAddrResponse.class);
    }

    /**
     *用于获取网关详情。
     * @param req DescribeGatewayRequest
     * @return DescribeGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayResponse DescribeGateway(DescribeGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGateway", DescribeGatewayResponse.class);
    }

    /**
     *用于获取网关的数据及流量监控信息。
     * @param req DescribeGatewayMonitorRequest
     * @return DescribeGatewayMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayMonitorResponse DescribeGatewayMonitor(DescribeGatewayMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayMonitor", DescribeGatewayMonitorResponse.class);
    }

    /**
     *用于查询网关接入协议。
     * @param req DescribeGatewayProtocolRequest
     * @return DescribeGatewayProtocolResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayProtocolResponse DescribeGatewayProtocol(DescribeGatewayProtocolRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayProtocol", DescribeGatewayProtocolResponse.class);
    }

    /**
     *查询网关服务版本
     * @param req DescribeGatewayVersionRequest
     * @return DescribeGatewayVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayVersionResponse DescribeGatewayVersion(DescribeGatewayVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeGatewayVersion", DescribeGatewayVersionResponse.class);
    }

    /**
     *用于查询组织。
     * @param req DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrganizationResponse DescribeOrganization(DescribeOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeOrganization", DescribeOrganizationResponse.class);
    }

    /**
     *用于查询录像上云计划详情。
     * @param req DescribeRecordBackupPlanRequest
     * @return DescribeRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordBackupPlanResponse DescribeRecordBackupPlan(DescribeRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordBackupPlan", DescribeRecordBackupPlanResponse.class);
    }

    /**
     *用于查询录像上云模板详情。
     * @param req DescribeRecordBackupTemplateRequest
     * @return DescribeRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordBackupTemplateResponse DescribeRecordBackupTemplate(DescribeRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordBackupTemplate", DescribeRecordBackupTemplateResponse.class);
    }

    /**
     *用于查询设备云端录像时间轴信息（即为视频上云后设置录像计划后云存储的录像）
     * @param req DescribeRecordFileRequest
     * @return DescribeRecordFileResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordFileResponse DescribeRecordFile(DescribeRecordFileRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordFile", DescribeRecordFileResponse.class);
    }

    /**
     *用于查询实时上云计划详情
     * @param req DescribeRecordPlanRequest
     * @return DescribeRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordPlanResponse DescribeRecordPlan(DescribeRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordPlan", DescribeRecordPlanResponse.class);
    }

    /**
     *用于获取云端录像回放url地址
     * @param req DescribeRecordPlaybackUrlRequest
     * @return DescribeRecordPlaybackUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordPlaybackUrlResponse DescribeRecordPlaybackUrl(DescribeRecordPlaybackUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordPlaybackUrl", DescribeRecordPlaybackUrlResponse.class);
    }

    /**
     *用于查询云录像取回任务详情
     * @param req DescribeRecordRetrieveTaskRequest
     * @return DescribeRecordRetrieveTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordRetrieveTaskResponse DescribeRecordRetrieveTask(DescribeRecordRetrieveTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordRetrieveTask", DescribeRecordRetrieveTaskResponse.class);
    }

    /**
     *平台支持将数据以TS切片的形式存入客户自有COS桶，该接口用于支持客户快捷查询切片信息列表
（注意：只支持标准存储类型的查询）
     * @param req DescribeRecordSliceRequest
     * @return DescribeRecordSliceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordSliceResponse DescribeRecordSlice(DescribeRecordSliceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordSlice", DescribeRecordSliceResponse.class);
    }

    /**
     *用于查询实时上云模板详情
     * @param req DescribeRecordTemplateRequest
     * @return DescribeRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordTemplateResponse DescribeRecordTemplate(DescribeRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecordTemplate", DescribeRecordTemplateResponse.class);
    }

    /**
     *用于查询推拉流鉴权配置。
     * @param req DescribeStreamAuthRequest
     * @return DescribeStreamAuthResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStreamAuthResponse DescribeStreamAuth(DescribeStreamAuthRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeStreamAuth", DescribeStreamAuthResponse.class);
    }

    /**
     *用于查询任务详情
     * @param req DescribeTaskRequest
     * @return DescribeTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResponse DescribeTask(DescribeTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTask", DescribeTaskResponse.class);
    }

    /**
     *用于查询设备的详细信息。
     * @param req DescribeUserDeviceRequest
     * @return DescribeUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDeviceResponse DescribeUserDevice(DescribeUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDevice", DescribeUserDeviceResponse.class);
    }

    /**
     *用于批量查询设备详细信息。
     * @param req DescribeUserDeviceListRequest
     * @return DescribeUserDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDeviceListResponse DescribeUserDeviceList(DescribeUserDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeUserDeviceList", DescribeUserDeviceListResponse.class);
    }

    /**
     *用于获取视频通道的码率信息
     * @param req DescribeVideoBitRateRequest
     * @return DescribeVideoBitRateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoBitRateResponse DescribeVideoBitRate(DescribeVideoBitRateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoBitRate", DescribeVideoBitRateResponse.class);
    }

    /**
     *用于获取云录像下载 url
     * @param req DescribeVideoDownloadUrlRequest
     * @return DescribeVideoDownloadUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoDownloadUrlResponse DescribeVideoDownloadUrl(DescribeVideoDownloadUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeVideoDownloadUrl", DescribeVideoDownloadUrlResponse.class);
    }

    /**
     *获取AI任务列表
     * @param req ListAITasksRequest
     * @return ListAITasksResponse
     * @throws TencentCloudSDKException
     */
    public ListAITasksResponse ListAITasks(ListAITasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListAITasks", ListAITasksResponse.class);
    }

    /**
     *获取设备抓拍结果列表
     * @param req ListDeviceSnapshotsRequest
     * @return ListDeviceSnapshotsResponse
     * @throws TencentCloudSDKException
     */
    public ListDeviceSnapshotsResponse ListDeviceSnapshots(ListDeviceSnapshotsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDeviceSnapshots", ListDeviceSnapshotsResponse.class);
    }

    /**
     *用于获取对应组织下的设备列表。
     * @param req ListDevicesRequest
     * @return ListDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListDevicesResponse ListDevices(ListDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListDevices", ListDevicesResponse.class);
    }

    /**
     *用于查询网关下挂载的设备列表。
     * @param req ListGatewayDevicesRequest
     * @return ListGatewayDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListGatewayDevicesResponse ListGatewayDevices(ListGatewayDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGatewayDevices", ListGatewayDevicesResponse.class);
    }

    /**
     *用于获取网关列表。
     * @param req ListGatewaysRequest
     * @return ListGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public ListGatewaysResponse ListGateways(ListGatewaysRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListGateways", ListGatewaysResponse.class);
    }

    /**
     *用于查询组织目录下的未添加到实时上云计划中的通道数量
     * @param req ListOrganizationChannelNumbersRequest
     * @return ListOrganizationChannelNumbersResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationChannelNumbersResponse ListOrganizationChannelNumbers(ListOrganizationChannelNumbersRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationChannelNumbers", ListOrganizationChannelNumbersResponse.class);
    }

    /**
     *用于查询组织目录下的通道列表
     * @param req ListOrganizationChannelsRequest
     * @return ListOrganizationChannelsResponse
     * @throws TencentCloudSDKException
     */
    public ListOrganizationChannelsResponse ListOrganizationChannels(ListOrganizationChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListOrganizationChannels", ListOrganizationChannelsResponse.class);
    }

    /**
     *用于查询录像上云计划下的设备通道列表。
     * @param req ListRecordBackupPlanDevicesRequest
     * @return ListRecordBackupPlanDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupPlanDevicesResponse ListRecordBackupPlanDevices(ListRecordBackupPlanDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordBackupPlanDevices", ListRecordBackupPlanDevicesResponse.class);
    }

    /**
     *用于查询录像上云计划列表。
     * @param req ListRecordBackupPlansRequest
     * @return ListRecordBackupPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupPlansResponse ListRecordBackupPlans(ListRecordBackupPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordBackupPlans", ListRecordBackupPlansResponse.class);
    }

    /**
     *用于查询录像上云模板列表。
     * @param req ListRecordBackupTemplatesRequest
     * @return ListRecordBackupTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordBackupTemplatesResponse ListRecordBackupTemplates(ListRecordBackupTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordBackupTemplates", ListRecordBackupTemplatesResponse.class);
    }

    /**
     *用于查询用户下所有实时上云计划中的通道列表
     * @param req ListRecordPlanChannelsRequest
     * @return ListRecordPlanChannelsResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlanChannelsResponse ListRecordPlanChannels(ListRecordPlanChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordPlanChannels", ListRecordPlanChannelsResponse.class);
    }

    /**
     *用于查询实时上云计划下的设备通道列表
     * @param req ListRecordPlanDevicesRequest
     * @return ListRecordPlanDevicesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlanDevicesResponse ListRecordPlanDevices(ListRecordPlanDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordPlanDevices", ListRecordPlanDevicesResponse.class);
    }

    /**
     *用于查询实时上云计划列表
     * @param req ListRecordPlansRequest
     * @return ListRecordPlansResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordPlansResponse ListRecordPlans(ListRecordPlansRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordPlans", ListRecordPlansResponse.class);
    }

    /**
     *用于查询取回任务列表
     * @param req ListRecordRetrieveTasksRequest
     * @return ListRecordRetrieveTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordRetrieveTasksResponse ListRecordRetrieveTasks(ListRecordRetrieveTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordRetrieveTasks", ListRecordRetrieveTasksResponse.class);
    }

    /**
     *用于查询实时上云模板列表
     * @param req ListRecordTemplatesRequest
     * @return ListRecordTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public ListRecordTemplatesResponse ListRecordTemplates(ListRecordTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListRecordTemplates", ListRecordTemplatesResponse.class);
    }

    /**
     *用于查询任务的子任务列表
     * @param req ListSubTasksRequest
     * @return ListSubTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListSubTasksResponse ListSubTasks(ListSubTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListSubTasks", ListSubTasksResponse.class);
    }

    /**
     *用于查询批量任务和简单任务列表
     * @param req ListTasksRequest
     * @return ListTasksResponse
     * @throws TencentCloudSDKException
     */
    public ListTasksResponse ListTasks(ListTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListTasks", ListTasksResponse.class);
    }

    /**
     *查询本店里录像下载任务列表
     * @param req ListVideoDownloadTaskRequest
     * @return ListVideoDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public ListVideoDownloadTaskResponse ListVideoDownloadTask(ListVideoDownloadTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ListVideoDownloadTask", ListVideoDownloadTaskResponse.class);
    }

    /**
     *用于获取设备本地录像 URL 地址。
     * @param req PlayRecordRequest
     * @return PlayRecordResponse
     * @throws TencentCloudSDKException
     */
    public PlayRecordResponse PlayRecord(PlayRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PlayRecord", PlayRecordResponse.class);
    }

    /**
     *查询禁播通道列表
     * @param req QueryForbidPlayChannelListRequest
     * @return QueryForbidPlayChannelListResponse
     * @throws TencentCloudSDKException
     */
    public QueryForbidPlayChannelListResponse QueryForbidPlayChannelList(QueryForbidPlayChannelListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "QueryForbidPlayChannelList", QueryForbidPlayChannelListResponse.class);
    }

    /**
     *用于同步国标设备的通道（接口调用后，触发向设备请求通道列表，新增的通道入库，设备上已删除的通道需自行删除、后台不自动删除）。
     * @param req RefreshDeviceChannelRequest
     * @return RefreshDeviceChannelResponse
     * @throws TencentCloudSDKException
     */
    public RefreshDeviceChannelResponse RefreshDeviceChannel(RefreshDeviceChannelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RefreshDeviceChannel", RefreshDeviceChannelResponse.class);
    }

    /**
     *禁止主、子账号对视频通道的实况预览
     * @param req SetForbidPlayChannelsRequest
     * @return SetForbidPlayChannelsResponse
     * @throws TencentCloudSDKException
     */
    public SetForbidPlayChannelsResponse SetForbidPlayChannels(SetForbidPlayChannelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetForbidPlayChannels", SetForbidPlayChannelsResponse.class);
    }

    /**
     *更新AI任务
     * @param req UpdateAITaskRequest
     * @return UpdateAITaskResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAITaskResponse UpdateAITask(UpdateAITaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAITask", UpdateAITaskResponse.class);
    }

    /**
     *更新 AI 任务状态
     * @param req UpdateAITaskStatusRequest
     * @return UpdateAITaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateAITaskStatusResponse UpdateAITaskStatus(UpdateAITaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateAITaskStatus", UpdateAITaskStatusResponse.class);
    }

    /**
     *用于批量更改设备的组织。
     * @param req UpdateDeviceOrganizationRequest
     * @return UpdateDeviceOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceOrganizationResponse UpdateDeviceOrganization(UpdateDeviceOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceOrganization", UpdateDeviceOrganizationResponse.class);
    }

    /**
     *用于启用/禁用设备，禁用后拒绝设备注册。
     * @param req UpdateDeviceStatusRequest
     * @return UpdateDeviceStatusResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceStatusResponse UpdateDeviceStatus(UpdateDeviceStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDeviceStatus", UpdateDeviceStatusResponse.class);
    }

    /**
     *用于修改网关信息（支持对网关名称和描述的修改）。
     * @param req UpdateGatewayRequest
     * @return UpdateGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGatewayResponse UpdateGateway(UpdateGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGateway", UpdateGatewayResponse.class);
    }

    /**
     *用于修改组织。
     * @param req UpdateOrganizationRequest
     * @return UpdateOrganizationResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrganizationResponse UpdateOrganization(UpdateOrganizationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateOrganization", UpdateOrganizationResponse.class);
    }

    /**
     *用于修改录像上云计划。
     * @param req UpdateRecordBackupPlanRequest
     * @return UpdateRecordBackupPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordBackupPlanResponse UpdateRecordBackupPlan(UpdateRecordBackupPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordBackupPlan", UpdateRecordBackupPlanResponse.class);
    }

    /**
     *用于修改录像上云模板。
     * @param req UpdateRecordBackupTemplateRequest
     * @return UpdateRecordBackupTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordBackupTemplateResponse UpdateRecordBackupTemplate(UpdateRecordBackupTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordBackupTemplate", UpdateRecordBackupTemplateResponse.class);
    }

    /**
     *用于修改实时上云计划
     * @param req UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordPlanResponse UpdateRecordPlan(UpdateRecordPlanRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordPlan", UpdateRecordPlanResponse.class);
    }

    /**
     *用于修改实时上云模板
     * @param req UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordTemplateResponse UpdateRecordTemplate(UpdateRecordTemplateRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateRecordTemplate", UpdateRecordTemplateResponse.class);
    }

    /**
     *用于修改设备的配置信息。
     * @param req UpdateUserDeviceRequest
     * @return UpdateUserDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateUserDeviceResponse UpdateUserDevice(UpdateUserDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateUserDevice", UpdateUserDeviceResponse.class);
    }

    /**
     *用于网关升级（支持对所有待更新的服务一键升级）。
     * @param req UpgradeGatewayRequest
     * @return UpgradeGatewayResponse
     * @throws TencentCloudSDKException
     */
    public UpgradeGatewayResponse UpgradeGateway(UpgradeGatewayRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpgradeGateway", UpgradeGatewayResponse.class);
    }

}
