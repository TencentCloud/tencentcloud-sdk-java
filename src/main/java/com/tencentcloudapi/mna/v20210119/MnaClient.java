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
package com.tencentcloudapi.mna.v20210119;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mna.v20210119.models.*;

public class MnaClient extends AbstractClient{
    private static String endpoint = "mna.tencentcloudapi.com";
    private static String service = "mna";
    private static String version = "2021-01-19";

    public MnaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MnaClient(Credential credential, String region, ClientProfile profile) {
        super(MnaClient.endpoint, MnaClient.version, credential, region, profile);
    }

    /**
     *激活硬件设备
     * @param req ActivateHardwareRequest
     * @return ActivateHardwareResponse
     * @throws TencentCloudSDKException
     */
    public ActivateHardwareResponse ActivateHardware(ActivateHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateHardware", ActivateHardwareResponse.class);
    }

    /**
     *新建设备记录
     * @param req AddDeviceRequest
     * @return AddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceResponse AddDevice(AddDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDevice", AddDeviceResponse.class);
    }

    /**
     *新建分组
     * @param req AddGroupRequest
     * @return AddGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddGroupResponse AddGroup(AddGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddGroup", AddGroupResponse.class);
    }

    /**
     *添加硬件设备，生成未激活的硬件设备，可支持批量添加
     * @param req AddHardwareRequest
     * @return AddHardwareResponse
     * @throws TencentCloudSDKException
     */
    public AddHardwareResponse AddHardware(AddHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddHardware", AddHardwareResponse.class);
    }

    /**
     *新建互通规则
     * @param req AddL3ConnRequest
     * @return AddL3ConnResponse
     * @throws TencentCloudSDKException
     */
    public AddL3ConnResponse AddL3Conn(AddL3ConnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddL3Conn", AddL3ConnResponse.class);
    }

    /**
     *通过此接口设置和更新预置密钥
     * @param req CreateEncryptedKeyRequest
     * @return CreateEncryptedKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateEncryptedKeyResponse CreateEncryptedKey(CreateEncryptedKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEncryptedKey", CreateEncryptedKeyResponse.class);
    }

    /**
     *删除设备信息
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *删除分组
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *删除互通规则
     * @param req DeleteL3ConnRequest
     * @return DeleteL3ConnResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL3ConnResponse DeleteL3Conn(DeleteL3ConnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL3Conn", DeleteL3ConnResponse.class);
    }

    /**
     *下载活跃设备数量统计
     * @param req DownloadActiveDeviceCountRequest
     * @return DownloadActiveDeviceCountResponse
     * @throws TencentCloudSDKException
     */
    public DownloadActiveDeviceCountResponse DownloadActiveDeviceCount(DownloadActiveDeviceCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadActiveDeviceCount", DownloadActiveDeviceCountResponse.class);
    }

    /**
     *活跃设备数量统计
     * @param req GetActiveDeviceCountRequest
     * @return GetActiveDeviceCountResponse
     * @throws TencentCloudSDKException
     */
    public GetActiveDeviceCountResponse GetActiveDeviceCount(GetActiveDeviceCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetActiveDeviceCount", GetActiveDeviceCountResponse.class);
    }

    /**
     *通过指定设备的ID查找设备详细信息
     * @param req GetDeviceRequest
     * @return GetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceResponse GetDevice(GetDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevice", GetDeviceResponse.class);
    }

    /**
     *获取设备付费模式
     * @param req GetDevicePayModeRequest
     * @return GetDevicePayModeResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicePayModeResponse GetDevicePayMode(GetDevicePayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevicePayMode", GetDevicePayModeResponse.class);
    }

    /**
     *获取设备信息列表
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevices", GetDevicesResponse.class);
    }

    /**
     *根据AppId查询用户设置的流量告警信息，包括阈值，回调url和key
     * @param req GetFlowAlarmInfoRequest
     * @return GetFlowAlarmInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowAlarmInfoResponse GetFlowAlarmInfo(GetFlowAlarmInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowAlarmInfo", GetFlowAlarmInfoResponse.class);
    }

    /**
     *获取流量包列表
     * @param req GetFlowPackagesRequest
     * @return GetFlowPackagesResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowPackagesResponse GetFlowPackages(GetFlowPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowPackages", GetFlowPackagesResponse.class);
    }

    /**
     *获取指定设备Id，指定时间点数据流量使用情况
     * @param req GetFlowStatisticRequest
     * @return GetFlowStatisticResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticResponse GetFlowStatistic(GetFlowStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatistic", GetFlowStatisticResponse.class);
    }

    /**
     *获取指定分组，指定时间数据流量使用情况
     * @param req GetFlowStatisticByGroupRequest
     * @return GetFlowStatisticByGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticByGroupResponse GetFlowStatisticByGroup(GetFlowStatisticByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatisticByGroup", GetFlowStatisticByGroupResponse.class);
    }

    /**
     *获取指定区域，指定时间点数据流量使用情况
     * @param req GetFlowStatisticByRegionRequest
     * @return GetFlowStatisticByRegionResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticByRegionResponse GetFlowStatisticByRegion(GetFlowStatisticByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatisticByRegion", GetFlowStatisticByRegionResponse.class);
    }

    /**
     *查看分组详细信息
     * @param req GetGroupDetailRequest
     * @return GetGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupDetailResponse GetGroupDetail(GetGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupDetail", GetGroupDetailResponse.class);
    }

    /**
     *获取分组列表
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupList", GetGroupListResponse.class);
    }

    /**
     *获取厂商硬件列表
     * @param req GetHardwareListRequest
     * @return GetHardwareListResponse
     * @throws TencentCloudSDKException
     */
    public GetHardwareListResponse GetHardwareList(GetHardwareListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetHardwareList", GetHardwareListResponse.class);
    }

    /**
     *获取互通规则列表
     * @param req GetL3ConnListRequest
     * @return GetL3ConnListResponse
     * @throws TencentCloudSDKException
     */
    public GetL3ConnListResponse GetL3ConnList(GetL3ConnListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetL3ConnList", GetL3ConnListResponse.class);
    }

    /**
     *批量获取设备流量统计曲线
     * @param req GetMultiFlowStatisticRequest
     * @return GetMultiFlowStatisticResponse
     * @throws TencentCloudSDKException
     */
    public GetMultiFlowStatisticResponse GetMultiFlowStatistic(GetMultiFlowStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMultiFlowStatistic", GetMultiFlowStatisticResponse.class);
    }

    /**
     *获取单设备的实时流量统计指标
     * @param req GetNetMonitorRequest
     * @return GetNetMonitorResponse
     * @throws TencentCloudSDKException
     */
    public GetNetMonitorResponse GetNetMonitor(GetNetMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetNetMonitor", GetNetMonitorResponse.class);
    }

    /**
     *获取公钥用于验签
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPublicKey", GetPublicKeyResponse.class);
    }

    /**
     *在用量统计页面下载流量数据
     * @param req GetStatisticDataRequest
     * @return GetStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticDataResponse GetStatisticData(GetStatisticDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetStatisticData", GetStatisticDataResponse.class);
    }

    /**
     *获取厂商硬件设备列表
     * @param req GetVendorHardwareRequest
     * @return GetVendorHardwareResponse
     * @throws TencentCloudSDKException
     */
    public GetVendorHardwareResponse GetVendorHardware(GetVendorHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVendorHardware", GetVendorHardwareResponse.class);
    }

    /**
     *向已存在分组中添加设备
     * @param req GroupAddDeviceRequest
     * @return GroupAddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GroupAddDeviceResponse GroupAddDevice(GroupAddDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupAddDevice", GroupAddDeviceResponse.class);
    }

    /**
     *删除分组中的设备
     * @param req GroupDeleteDeviceRequest
     * @return GroupDeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GroupDeleteDeviceResponse GroupDeleteDevice(GroupDeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupDeleteDevice", GroupDeleteDeviceResponse.class);
    }

    /**
     *可开启/关闭流量包自动续费，不影响当前周期正在生效的流量包。
     * @param req ModifyPackageRenewFlagRequest
     * @return ModifyPackageRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPackageRenewFlagResponse ModifyPackageRenewFlag(ModifyPackageRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPackageRenewFlag", ModifyPackageRenewFlagResponse.class);
    }

    /**
     *购买预付费流量包
     * @param req OrderFlowPackageRequest
     * @return OrderFlowPackageResponse
     * @throws TencentCloudSDKException
     */
    public OrderFlowPackageResponse OrderFlowPackage(OrderFlowPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OrderFlowPackage", OrderFlowPackageResponse.class);
    }

    /**
     *购买一次性授权License
     * @param req OrderPerLicenseRequest
     * @return OrderPerLicenseResponse
     * @throws TencentCloudSDKException
     */
    public OrderPerLicenseResponse OrderPerLicense(OrderPerLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OrderPerLicense", OrderPerLicenseResponse.class);
    }

    /**
     *设置用户流量告警信息接口，通过该接口设置流量包告警阈值以及告警时回调的url和key
     * @param req SetNotifyUrlRequest
     * @return SetNotifyUrlResponse
     * @throws TencentCloudSDKException
     */
    public SetNotifyUrlResponse SetNotifyUrl(SetNotifyUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNotifyUrl", SetNotifyUrlResponse.class);
    }

    /**
     *更新设备信息
     * @param req UpdateDeviceRequest
     * @return UpdateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceResponse UpdateDevice(UpdateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDevice", UpdateDeviceResponse.class);
    }

    /**
     *更新分组备注
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGroup", UpdateGroupResponse.class);
    }

    /**
     *更新硬件信息
     * @param req UpdateHardwareRequest
     * @return UpdateHardwareResponse
     * @throws TencentCloudSDKException
     */
    public UpdateHardwareResponse UpdateHardware(UpdateHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateHardware", UpdateHardwareResponse.class);
    }

    /**
     *更新互通规则CIDR
     * @param req UpdateL3CidrRequest
     * @return UpdateL3CidrResponse
     * @throws TencentCloudSDKException
     */
    public UpdateL3CidrResponse UpdateL3Cidr(UpdateL3CidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateL3Cidr", UpdateL3CidrResponse.class);
    }

    /**
     *更新互通规则备注
     * @param req UpdateL3ConnRequest
     * @return UpdateL3ConnResponse
     * @throws TencentCloudSDKException
     */
    public UpdateL3ConnResponse UpdateL3Conn(UpdateL3ConnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateL3Conn", UpdateL3ConnResponse.class);
    }

    /**
     *更新互通规则开关
     * @param req UpdateL3SwitchRequest
     * @return UpdateL3SwitchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateL3SwitchResponse UpdateL3Switch(UpdateL3SwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateL3Switch", UpdateL3SwitchResponse.class);
    }

}
