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
     *本接口(ControlDevicePTZ) 用于对支持GB28181 PTZ信令的设备进行远程控制。
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
     *对回放流进行控制，包括暂停、播放、拉动、结束等
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
     *本接口(CreateRecordPlan) 用于创建录制计划，使设备与时间模板绑定，以便及时启动录制
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
     *本接口(DeleteRecordPlan)用于删除录制计划
录制计划删除的同时，会停止该录制计划下的全部录制任务。
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
     *本接口(DescribeAllDeviceList) 用于获取设备列表。
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
     *获取回放视频流(NVR录制用)
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
     *根据时间获取回放文件列表(云端录制用)
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
     *本接口(GetRecordDatesByDev)用于查询设备含有录像文件的日期列表。
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
