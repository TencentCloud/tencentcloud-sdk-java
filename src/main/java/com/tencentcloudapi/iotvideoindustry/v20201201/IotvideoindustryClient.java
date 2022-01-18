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
package com.tencentcloudapi.iotvideoindustry.v20201201;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotvideoindustry.v20201201.models.*;

public class IotvideoindustryClient extends AbstractClient{
    private static String endpoint = "iotvideoindustry.tencentcloudapi.com";
    private static String service = "iotvideoindustry";
    private static String version = "2020-12-01";

    public IotvideoindustryClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotvideoindustryClient(Credential credential, String region, ClientProfile profile) {
        super(IotvideoindustryClient.endpoint, IotvideoindustryClient.version, credential, region, profile);
    }

    /**
     *本接口(BindGroupDevices) 用于绑定设备到分组。
     * @param req BindGroupDevicesRequest
     * @return BindGroupDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BindGroupDevicesResponse BindGroupDevices(BindGroupDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BindGroupDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BindGroupDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BindGroupDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ControlChannelLocalRecord）用于对通道本地回放流进行控制，包括暂停、播放、拉动、结束等

     * @param req ControlChannelLocalRecordRequest
     * @return ControlChannelLocalRecordResponse
     * @throws TencentCloudSDKException
     */
    public ControlChannelLocalRecordResponse ControlChannelLocalRecord(ControlChannelLocalRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlChannelLocalRecordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlChannelLocalRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlChannelLocalRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ControlChannelPTZ) 用于对支持GB28181 PTZ信令的设备进行指定通道的远程控制。
     * @param req ControlChannelPTZRequest
     * @return ControlChannelPTZResponse
     * @throws TencentCloudSDKException
     */
    public ControlChannelPTZResponse ControlChannelPTZ(ControlChannelPTZRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlChannelPTZResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlChannelPTZResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlChannelPTZ");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ControlDevicePTZ) 用于对支持GB28181 PTZ信令的设备进行远程控制。
请使用ControlChannelPTZ接口
     * @param req ControlDevicePTZRequest
     * @return ControlDevicePTZResponse
     * @throws TencentCloudSDKException
     */
    public ControlDevicePTZResponse ControlDevicePTZ(ControlDevicePTZRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDevicePTZResponse> rsp = null;
        String rspStr = "";
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
     *看守位控制
     * @param req ControlHomePositionRequest
     * @return ControlHomePositionResponse
     * @throws TencentCloudSDKException
     */
    public ControlHomePositionResponse ControlHomePosition(ControlHomePositionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlHomePositionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlHomePositionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlHomePosition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *预置位控制
     * @param req ControlPresetRequest
     * @return ControlPresetResponse
     * @throws TencentCloudSDKException
     */
    public ControlPresetResponse ControlPreset(ControlPresetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlPresetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlPresetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlPreset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对回放流进行控制，包括暂停、播放、拉动、结束等
请使用ControlChannelLocalRecord接口
     * @param req ControlRecordStreamRequest
     * @return ControlRecordStreamResponse
     * @throws TencentCloudSDKException
     */
    public ControlRecordStreamResponse ControlRecordStream(ControlRecordStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlRecordStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlRecordStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlRecordStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDevice) 用于创建设备。
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDeviceGroup) 用于创建设备管理分组。
     * @param req CreateDeviceGroupRequest
     * @return CreateDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceGroupResponse CreateDeviceGroup(CreateDeviceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDeviceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建直播频道
     * @param req CreateLiveChannelRequest
     * @return CreateLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveChannelResponse CreateLiveChannel(CreateLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建直播录制计划
     * @param req CreateLiveRecordPlanRequest
     * @return CreateLiveRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordPlanResponse CreateLiveRecordPlan(CreateLiveRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLiveRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建消息转发配置
     * @param req CreateMessageForwardRequest
     * @return CreateMessageForwardResponse
     * @throws TencentCloudSDKException
     */
    public CreateMessageForwardResponse CreateMessageForward(CreateMessageForwardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateMessageForwardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateMessageForwardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateMessageForward");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateRecordPlan) 用于创建录制计划，使设备与时间模板绑定，以便及时启动录制
请使用CreateRecordingPlan代替
     * @param req CreateRecordPlanRequest
     * @return CreateRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordPlanResponse CreateRecordPlan(CreateRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateRecordingPlan) 用于创建录制计划，使通道与时间模板绑定，以便及时启动录制
     * @param req CreateRecordingPlanRequest
     * @return CreateRecordingPlanResponse
     * @throws TencentCloudSDKException
     */
    public CreateRecordingPlanResponse CreateRecordingPlan(CreateRecordingPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRecordingPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRecordingPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateRecordingPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建场景
     * @param req CreateSceneRequest
     * @return CreateSceneResponse
     * @throws TencentCloudSDKException
     */
    public CreateSceneResponse CreateScene(CreateSceneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSceneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateSceneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateScene");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateTimeTemplate) 用于根据模板描述的具体录制时间片段，创建定制化的时间模板。
     * @param req CreateTimeTemplateRequest
     * @return CreateTimeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateTimeTemplateResponse CreateTimeTemplate(CreateTimeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTimeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTimeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTimeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除设备下的通道
注意： 在线状态的设备不允许删除
     * @param req DeleteChannelRequest
     * @return DeleteChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteChannelResponse DeleteChannel(DeleteChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteDevice)用于删除设备。
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteDeviceGroup)用于删除分组。
     * @param req DeleteDeviceGroupRequest
     * @return DeleteDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceGroupResponse DeleteDeviceGroup(DeleteDeviceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDeviceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除直播接口
     * @param req DeleteLiveChannelRequest
     * @return DeleteLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveChannelResponse DeleteLiveChannel(DeleteLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除直播录制计划
     * @param req DeleteLiveRecordPlanRequest
     * @return DeleteLiveRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordPlanResponse DeleteLiveRecordPlan(DeleteLiveRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播录像删除
     * @param req DeleteLiveVideoListRequest
     * @return DeleteLiveVideoListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveVideoListResponse DeleteLiveVideoList(DeleteLiveVideoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveVideoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveVideoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLiveVideoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除消息转发配置
     * @param req DeleteMessageForwardRequest
     * @return DeleteMessageForwardResponse
     * @throws TencentCloudSDKException
     */
    public DeleteMessageForwardResponse DeleteMessageForward(DeleteMessageForwardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteMessageForwardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteMessageForwardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteMessageForward");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteRecordPlan)用于删除录制计划
录制计划删除的同时，会停止该录制计划下的全部录制任务。
请使用DeleteRecordingPlan接口
     * @param req DeleteRecordPlanRequest
     * @return DeleteRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordPlanResponse DeleteRecordPlan(DeleteRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordPlanResponse> rsp = null;
        String rspStr = "";
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
     *本接口(DeleteRecordingPlan)用于删除录制计划
录制计划删除的同时，会停止该录制计划下的全部录制任务。
     * @param req DeleteRecordingPlanRequest
     * @return DeleteRecordingPlanResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRecordingPlanResponse DeleteRecordingPlan(DeleteRecordingPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRecordingPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRecordingPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteRecordingPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除场景
     * @param req DeleteSceneRequest
     * @return DeleteSceneResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSceneResponse DeleteScene(DeleteSceneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSceneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSceneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteScene");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DeleteTimeTemplate) 用于删除时间模板。
     * @param req DeleteTimeTemplateRequest
     * @return DeleteTimeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTimeTemplateResponse DeleteTimeTemplate(DeleteTimeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTimeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTimeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTimeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除录像存储列表
     * @param req DeleteVideoListRequest
     * @return DeleteVideoListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVideoListResponse DeleteVideoList(DeleteVideoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVideoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteVideoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteVideoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设备告警-删除告警
     * @param req DeleteWarningRequest
     * @return DeleteWarningResponse
     * @throws TencentCloudSDKException
     */
    public DeleteWarningResponse DeleteWarning(DeleteWarningRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteWarningResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteWarningResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteWarning");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取异常事件统计
     * @param req DescribeAbnormalEventsRequest
     * @return DescribeAbnormalEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAbnormalEventsResponse DescribeAbnormalEvents(DescribeAbnormalEventsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAbnormalEventsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAbnormalEventsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAbnormalEvents");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeAllDeviceList) 用于获取设备列表。
请使用DescribeDevicesList接口
     * @param req DescribeAllDeviceListRequest
     * @return DescribeAllDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAllDeviceListResponse DescribeAllDeviceList(DescribeAllDeviceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAllDeviceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAllDeviceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAllDeviceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取场景绑定通道列表
     * @param req DescribeBindSceneChannelsRequest
     * @return DescribeBindSceneChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindSceneChannelsResponse DescribeBindSceneChannels(DescribeBindSceneChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindSceneChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindSceneChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindSceneChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取场景绑定设备列表
     * @param req DescribeBindSceneDevicesRequest
     * @return DescribeBindSceneDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBindSceneDevicesResponse DescribeBindSceneDevices(DescribeBindSceneDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBindSceneDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBindSceneDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBindSceneDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeChannelLiveStreamURL)用于获取设备指定通道实时流地址，地址是动态生成，如重新播放需要调用此接口重新获取最新播放地址。
正常推流，如未设置对应录制计划，且180s无人观看此流，将会被自动掐断。
     * @param req DescribeChannelLiveStreamURLRequest
     * @return DescribeChannelLiveStreamURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelLiveStreamURLResponse DescribeChannelLiveStreamURL(DescribeChannelLiveStreamURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelLiveStreamURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelLiveStreamURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelLiveStreamURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeChannelLocalRecordURL）用于将NVR等设备对应通道本地回放文件，通过GB28181信令推送至云端，并生成对应的实时视频流URL，流地址URL是动态生成，如需重新播放请重新调用此接口获取最新地址。
正常推流，如未设置对应录制计划，且180s无人观看此流，将会被自动掐断。
     * @param req DescribeChannelLocalRecordURLRequest
     * @return DescribeChannelLocalRecordURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelLocalRecordURLResponse DescribeChannelLocalRecordURL(DescribeChannelLocalRecordURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelLocalRecordURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelLocalRecordURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelLocalRecordURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeChannelStreamURL)用于获取设备指定通道实时流地址，地址是动态生成，如重新播放需要调用此接口重新获取最新播放地址。
正常推流，如未设置对应录制计划，且180s无人观看此流，将会被自动掐断。
     * @param req DescribeChannelStreamURLRequest
     * @return DescribeChannelStreamURLResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelStreamURLResponse DescribeChannelStreamURL(DescribeChannelStreamURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelStreamURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelStreamURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelStreamURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeChannels）用于获取设备下属通道列表
     * @param req DescribeChannelsRequest
     * @return DescribeChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelsResponse DescribeChannels(DescribeChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据直播录制计划获取频道列表
     * @param req DescribeChannelsByLiveRecordPlanRequest
     * @return DescribeChannelsByLiveRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public DescribeChannelsByLiveRecordPlanResponse DescribeChannelsByLiveRecordPlan(DescribeChannelsByLiveRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeChannelsByLiveRecordPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeChannelsByLiveRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeChannelsByLiveRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备统计当前信息
     * @param req DescribeCurrentDeviceDataRequest
     * @return DescribeCurrentDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCurrentDeviceDataResponse DescribeCurrentDeviceData(DescribeCurrentDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCurrentDeviceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCurrentDeviceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCurrentDeviceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定设备详细信息
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备事件
     * @param req DescribeDeviceEventRequest
     * @return DescribeDeviceEventResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceEventResponse DescribeDeviceEvent(DescribeDeviceEventRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceEventResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceEventResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceEvent");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDeviceGroup)用于根据设备ID查询设备所在分组信息，可批量查询。
     * @param req DescribeDeviceGroupRequest
     * @return DescribeDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceGroupResponse DescribeDeviceGroup(DescribeDeviceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDevicesList) 用于获取设备列表，支持模糊搜索
     * @param req DescribeDeviceListRequest
     * @return DescribeDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceListResponse DescribeDeviceList(DescribeDeviceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询设备统计monitor信息
     * @param req DescribeDeviceMonitorDataRequest
     * @return DescribeDeviceMonitorDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceMonitorDataResponse DescribeDeviceMonitorData(DescribeDeviceMonitorDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceMonitorDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceMonitorDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceMonitorData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDevicePassWord)用于查询设备密码。
     * @param req DescribeDevicePassWordRequest
     * @return DescribeDevicePassWordResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDevicePassWordResponse DescribeDevicePassWord(DescribeDevicePassWordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDevicePassWordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDevicePassWordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevicePassWord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDeviceStreams)用于获取设备实时流地址。
请使用DescribeChannelStreamURL接口
     * @param req DescribeDeviceStreamsRequest
     * @return DescribeDeviceStreamsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceStreamsResponse DescribeDeviceStreams(DescribeDeviceStreamsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceStreamsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceStreamsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceStreams");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeGroupById)用于根据分组ID查询分组。
     * @param req DescribeGroupByIdRequest
     * @return DescribeGroupByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupByIdResponse DescribeGroupById(DescribeGroupByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据分组路径查询分组
     * @param req DescribeGroupByPathRequest
     * @return DescribeGroupByPathResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupByPathResponse DescribeGroupByPath(DescribeGroupByPathRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupByPathResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupByPathResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupByPath");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeGroupDevices)用于查询分组下的设备列表。
     * @param req DescribeGroupDevicesRequest
     * @return DescribeGroupDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupDevicesResponse DescribeGroupDevices(DescribeGroupDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroupDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeGroups)用于批量查询分组信息。
     * @param req DescribeGroupsRequest
     * @return DescribeGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGroupsResponse DescribeGroups(DescribeGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取IPC设备下属通道
请使用DescribeChannels接口
     * @param req DescribeIPCChannelsRequest
     * @return DescribeIPCChannelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIPCChannelsResponse DescribeIPCChannels(DescribeIPCChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIPCChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIPCChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIPCChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播详情接口
     * @param req DescribeLiveChannelRequest
     * @return DescribeLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveChannelResponse DescribeLiveChannel(DescribeLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播列表接口
     * @param req DescribeLiveChannelListRequest
     * @return DescribeLiveChannelListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveChannelListResponse DescribeLiveChannelList(DescribeLiveChannelListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveChannelListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveChannelListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveChannelList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播录制计划详情
     * @param req DescribeLiveRecordPlanByIdRequest
     * @return DescribeLiveRecordPlanByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordPlanByIdResponse DescribeLiveRecordPlanById(DescribeLiveRecordPlanByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordPlanByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordPlanByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveRecordPlanById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播录制计划列表
     * @param req DescribeLiveRecordPlanIdsRequest
     * @return DescribeLiveRecordPlanIdsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveRecordPlanIdsResponse DescribeLiveRecordPlanIds(DescribeLiveRecordPlanIdsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveRecordPlanIdsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveRecordPlanIdsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveRecordPlanIds");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播拉流接口
     * @param req DescribeLiveStreamRequest
     * @return DescribeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamResponse DescribeLiveStream(DescribeLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播录像回放列表
     * @param req DescribeLiveVideoListRequest
     * @return DescribeLiveVideoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveVideoListResponse DescribeLiveVideoList(DescribeLiveVideoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveVideoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveVideoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLiveVideoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看消息转发配置详情
     * @param req DescribeMessageForwardRequest
     * @return DescribeMessageForwardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageForwardResponse DescribeMessageForward(DescribeMessageForwardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMessageForwardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMessageForwardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMessageForward");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看消息转发配置列表
     * @param req DescribeMessageForwardsRequest
     * @return DescribeMessageForwardsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMessageForwardsResponse DescribeMessageForwards(DescribeMessageForwardsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMessageForwardsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMessageForwardsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMessageForwards");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运营中心-设备录像存储统计
     * @param req DescribeMonitorDataByDateRequest
     * @return DescribeMonitorDataByDateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMonitorDataByDateResponse DescribeMonitorDataByDate(DescribeMonitorDataByDateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMonitorDataByDateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMonitorDataByDateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeMonitorDataByDate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取预置位列表
     * @param req DescribePresetListRequest
     * @return DescribePresetListResponse
     * @throws TencentCloudSDKException
     */
    public DescribePresetListResponse DescribePresetList(DescribePresetListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePresetListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePresetListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePresetList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeRecordDatesByChannel)用于查询设备含有录像文件的日期列表。
     * @param req DescribeRecordDatesByChannelRequest
     * @return DescribeRecordDatesByChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordDatesByChannelResponse DescribeRecordDatesByChannel(DescribeRecordDatesByChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordDatesByChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordDatesByChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordDatesByChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播录像存储日期列表
     * @param req DescribeRecordDatesByLiveRequest
     * @return DescribeRecordDatesByLiveResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordDatesByLiveResponse DescribeRecordDatesByLive(DescribeRecordDatesByLiveRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordDatesByLiveResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordDatesByLiveResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordDatesByLive");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取回放视频流地址
请使用DescribeChannelLocalRecordURL接口

RecordId和StartTime/EndTime互斥
当存在RecordId时，StartTime和EndTime无效
当RecordId为空，StartTime和EndTime生效
     * @param req DescribeRecordStreamRequest
     * @return DescribeRecordStreamResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordStreamResponse DescribeRecordStream(DescribeRecordStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordStreamResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordStreamResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordStream");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeRecordingPlanById)用于根据录制计划ID获取录制计划。
     * @param req DescribeRecordingPlanByIdRequest
     * @return DescribeRecordingPlanByIdResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingPlanByIdResponse DescribeRecordingPlanById(DescribeRecordingPlanByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordingPlanByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordingPlanByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordingPlanById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeRecordingPlans)用于获取用户的全部录制计划。
     * @param req DescribeRecordingPlansRequest
     * @return DescribeRecordingPlansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecordingPlansResponse DescribeRecordingPlans(DescribeRecordingPlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRecordingPlansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRecordingPlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRecordingPlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取SIP服务器相关配置，用户可以通过这些配置项，将设备通过GB28181协议注册到本服务。
     * @param req DescribeSIPServerRequest
     * @return DescribeSIPServerResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSIPServerResponse DescribeSIPServer(DescribeSIPServerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSIPServerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSIPServerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSIPServer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *场景详情
     * @param req DescribeSceneRequest
     * @return DescribeSceneResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSceneResponse DescribeScene(DescribeSceneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSceneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSceneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScene");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取场景列表
     * @param req DescribeScenesRequest
     * @return DescribeScenesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeScenesResponse DescribeScenes(DescribeScenesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeScenesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeScenesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeScenes");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeStatisticDetails)用于查询指定统计项详情，返回结果按天为单位聚合，支持的最大时间查询范围为31天。
     * @param req DescribeStatisticDetailsRequest
     * @return DescribeStatisticDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticDetailsResponse DescribeStatisticDetails(DescribeStatisticDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatisticDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatisticDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStatisticDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeStatisticSummary)用于查询用户昨日的概览数据。
     * @param req DescribeStatisticSummaryRequest
     * @return DescribeStatisticSummaryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStatisticSummaryResponse DescribeStatisticSummary(DescribeStatisticSummaryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStatisticSummaryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStatisticSummaryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStatisticSummary");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSubGroups)用于查询分组下的子分组列表。
     * @param req DescribeSubGroupsRequest
     * @return DescribeSubGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubGroupsResponse DescribeSubGroups(DescribeSubGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询主设备订阅状态
     * @param req DescribeSubscriptionStatusRequest
     * @return DescribeSubscriptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubscriptionStatusResponse DescribeSubscriptionStatus(DescribeSubscriptionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubscriptionStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSubscriptionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSubscriptionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据时间获取云端录制文件列表
     * @param req DescribeVideoListRequest
     * @return DescribeVideoListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoListResponse DescribeVideoList(DescribeVideoListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeVideoListByChannel)用于查询指定通道的录制文件列表
     * @param req DescribeVideoListByChannelRequest
     * @return DescribeVideoListByChannelResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVideoListByChannelResponse DescribeVideoListByChannel(DescribeVideoListByChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVideoListByChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVideoListByChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVideoListByChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *告警等级列表
     * @param req DescribeWarnModRequest
     * @return DescribeWarnModResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarnModResponse DescribeWarnMod(DescribeWarnModRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarnModResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWarnModResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWarnMod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取告警列表
     * @param req DescribeWarningsRequest
     * @return DescribeWarningsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWarningsResponse DescribeWarnings(DescribeWarningsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWarningsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWarningsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWarnings");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取X-P2P的统计数据
     * @param req DescribeXP2PDataRequest
     * @return DescribeXP2PDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeXP2PDataResponse DescribeXP2PData(DescribeXP2PDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeXP2PDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeXP2PDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeXP2PData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetRecordDatesByDev)用于查询设备含有录像文件的日期列表。
请使用DescribeRecordDatesByChannel接口
     * @param req GetRecordDatesByDevRequest
     * @return GetRecordDatesByDevResponse
     * @throws TencentCloudSDKException
     */
    public GetRecordDatesByDevResponse GetRecordDatesByDev(GetRecordDatesByDevRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRecordDatesByDevResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRecordDatesByDevResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRecordDatesByDev");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetRecordPlanByDev)用于根据设备ID查询其绑定的录制计划.

     * @param req GetRecordPlanByDevRequest
     * @return GetRecordPlanByDevResponse
     * @throws TencentCloudSDKException
     */
    public GetRecordPlanByDevResponse GetRecordPlanByDev(GetRecordPlanByDevRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRecordPlanByDevResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRecordPlanByDevResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRecordPlanByDev");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetRecordPlanById)用于根据录制计划ID获取录制计划。
请使用DescribeRecordingPlanById接口
     * @param req GetRecordPlanByIdRequest
     * @return GetRecordPlanByIdResponse
     * @throws TencentCloudSDKException
     */
    public GetRecordPlanByIdResponse GetRecordPlanById(GetRecordPlanByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRecordPlanByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRecordPlanByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRecordPlanById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetRecordPlans)用于获取用户的全部录制计划。
请使用DescribeRecordingPlans接口
     * @param req GetRecordPlansRequest
     * @return GetRecordPlansResponse
     * @throws TencentCloudSDKException
     */
    public GetRecordPlansResponse GetRecordPlans(GetRecordPlansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRecordPlansResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRecordPlansResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRecordPlans");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetTimeTemplateById)用于根据模板ID获取时间模板详情。
     * @param req GetTimeTemplateByIdRequest
     * @return GetTimeTemplateByIdResponse
     * @throws TencentCloudSDKException
     */
    public GetTimeTemplateByIdResponse GetTimeTemplateById(GetTimeTemplateByIdRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTimeTemplateByIdResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTimeTemplateByIdResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTimeTemplateById");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetTimeTemplates)用于获取时间模板列表。
     * @param req GetTimeTemplatesRequest
     * @return GetTimeTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public GetTimeTemplatesResponse GetTimeTemplates(GetTimeTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTimeTemplatesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTimeTemplatesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTimeTemplates");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(GetVideoListByCon)用于查询设备的录制文件列表
请使用DescribeVideoListByChannel接口
     * @param req GetVideoListByConRequest
     * @return GetVideoListByConResponse
     * @throws TencentCloudSDKException
     */
    public GetVideoListByConResponse GetVideoListByCon(GetVideoListByConRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetVideoListByConResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetVideoListByConResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetVideoListByCon");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播录制计划绑定解绑直播频道
     * @param req ModifyBindPlanLiveChannelRequest
     * @return ModifyBindPlanLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBindPlanLiveChannelResponse ModifyBindPlanLiveChannel(ModifyBindPlanLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBindPlanLiveChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBindPlanLiveChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBindPlanLiveChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyBindRecordingPlan)用于更新录制计划绑定的通道
     * @param req ModifyBindRecordingPlanRequest
     * @return ModifyBindRecordingPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBindRecordingPlanResponse ModifyBindRecordingPlan(ModifyBindRecordingPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBindRecordingPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBindRecordingPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBindRecordingPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *场景绑定解绑通道接口
     * @param req ModifyBindSceneChannelsRequest
     * @return ModifyBindSceneChannelsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBindSceneChannelsResponse ModifyBindSceneChannels(ModifyBindSceneChannelsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBindSceneChannelsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBindSceneChannelsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBindSceneChannels");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *场景绑定/解绑通道接口
     * @param req ModifyBindSceneDeviceRequest
     * @return ModifyBindSceneDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBindSceneDeviceResponse ModifyBindSceneDevice(ModifyBindSceneDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBindSceneDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBindSceneDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBindSceneDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDeviceData)用于编辑设备信息。
     * @param req ModifyDeviceDataRequest
     * @return ModifyDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceDataResponse ModifyDeviceData(ModifyDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDeviceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDeviceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDeviceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑直播接口
     * @param req ModifyLiveChannelRequest
     * @return ModifyLiveChannelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveChannelResponse ModifyLiveChannel(ModifyLiveChannelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveChannelResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveChannelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveChannel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑直播录制计划
     * @param req ModifyLiveRecordPlanRequest
     * @return ModifyLiveRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveRecordPlanResponse ModifyLiveRecordPlan(ModifyLiveRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveRecordPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveRecordPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveRecordPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直播录像编辑
     * @param req ModifyLiveVideoRequest
     * @return ModifyLiveVideoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLiveVideoResponse ModifyLiveVideo(ModifyLiveVideoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLiveVideoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLiveVideoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLiveVideo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改消息转发配置
     * @param req ModifyMessageForwardRequest
     * @return ModifyMessageForwardResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMessageForwardResponse ModifyMessageForward(ModifyMessageForwardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMessageForwardResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMessageForwardResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyMessageForward");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑预置位信息
     * @param req ModifyPresetRequest
     * @return ModifyPresetResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPresetResponse ModifyPreset(ModifyPresetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPresetResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPresetResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyPreset");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyRecordingPlan)用于更新录制计划。

     * @param req ModifyRecordingPlanRequest
     * @return ModifyRecordingPlanResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRecordingPlanResponse ModifyRecordingPlan(ModifyRecordingPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRecordingPlanResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRecordingPlanResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRecordingPlan");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改场景
     * @param req ModifySceneRequest
     * @return ModifySceneResponse
     * @throws TencentCloudSDKException
     */
    public ModifySceneResponse ModifyScene(ModifySceneRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySceneResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySceneResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyScene");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑设备订阅状态
     * @param req ModifySubscriptionStatusRequest
     * @return ModifySubscriptionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubscriptionStatusResponse ModifySubscriptionStatus(ModifySubscriptionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubscriptionStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySubscriptionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySubscriptionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改录像存储列表
     * @param req ModifyVideoInfoRequest
     * @return ModifyVideoInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVideoInfoResponse ModifyVideoInfo(ModifyVideoInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVideoInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyVideoInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyVideoInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *重置设备告警
     * @param req ResetWarningRequest
     * @return ResetWarningResponse
     * @throws TencentCloudSDKException
     */
    public ResetWarningResponse ResetWarning(ResetWarningRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetWarningResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ResetWarningResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ResetWarning");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpdateDeviceGroup)用于修改分组信息。
     * @param req UpdateDeviceGroupRequest
     * @return UpdateDeviceGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceGroupResponse UpdateDeviceGroup(UpdateDeviceGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDeviceGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDeviceGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDeviceGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpdateDevicePassWord)用于修改设备密码。
     * @param req UpdateDevicePassWordRequest
     * @return UpdateDevicePassWordResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicePassWordResponse UpdateDevicePassWord(UpdateDevicePassWordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDevicePassWordResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDevicePassWordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDevicePassWord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(UpdateRecordPlan)用于更新录制计划。
请使用 ModifyRecordingPlan接口和ModifyBindRecordingPlan接口
     * @param req UpdateRecordPlanRequest
     * @return UpdateRecordPlanResponse
     * @throws TencentCloudSDKException
     */
    public UpdateRecordPlanResponse UpdateRecordPlan(UpdateRecordPlanRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateRecordPlanResponse> rsp = null;
        String rspStr = "";
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
     *本接口(UpdateTimeTemplate)用于更新时间模板。
     * @param req UpdateTimeTemplateRequest
     * @return UpdateTimeTemplateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateTimeTemplateResponse UpdateTimeTemplate(UpdateTimeTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateTimeTemplateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateTimeTemplateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateTimeTemplate");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
