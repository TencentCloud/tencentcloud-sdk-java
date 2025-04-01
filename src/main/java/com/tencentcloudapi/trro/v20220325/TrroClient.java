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
package com.tencentcloudapi.trro.v20220325;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trro.v20220325.models.*;

public class TrroClient extends AbstractClient{
    private static String endpoint = "trro.tencentcloudapi.com";
    private static String service = "trro";
    private static String version = "2022-03-25";
    
    public TrroClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrroClient(Credential credential, String region, ClientProfile profile) {
        super(TrroClient.endpoint, TrroClient.version, credential, region, profile);
    }

    /**
     *用于批量删除设备
     * @param req BatchDeleteDevicesRequest
     * @return BatchDeleteDevicesResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeleteDevicesResponse BatchDeleteDevices(BatchDeleteDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeleteDevices", BatchDeleteDevicesResponse.class);
    }

    /**
     *用于批量删除修改权限配置
     * @param req BatchDeletePolicyRequest
     * @return BatchDeletePolicyResponse
     * @throws TencentCloudSDKException
     */
    public BatchDeletePolicyResponse BatchDeletePolicy(BatchDeletePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BatchDeletePolicy", BatchDeletePolicyResponse.class);
    }

    /**
     *为推流设备绑定license，优先绑定到期时间最近的，到期时间相同优先绑定月包
     * @param req BoundLicensesRequest
     * @return BoundLicensesResponse
     * @throws TencentCloudSDKException
     */
    public BoundLicensesResponse BoundLicenses(BoundLicensesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "BoundLicenses", BoundLicensesResponse.class);
    }

    /**
     *启动云端录制功能，完成房间内的音视频录制，并上传到指定的云存储。
     * @param req CreateCloudRecordingRequest
     * @return CreateCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public CreateCloudRecordingResponse CreateCloudRecording(CreateCloudRecordingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateCloudRecording", CreateCloudRecordingResponse.class);
    }

    /**
     *用于创建设备
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDevice", CreateDeviceResponse.class);
    }

    /**
     *用于创建项目
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateProject", CreateProjectResponse.class);
    }

    /**
     *成功开启录制后，可以使用此接口来停止录制任务。停止录制成功后不代表文件全部传输完成，如果未完成后台将会继续上传文件，成功后通过事件回调通知客户文件全部传输完成状态。
     * @param req DeleteCloudRecordingRequest
     * @return DeleteCloudRecordingResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCloudRecordingResponse DeleteCloudRecording(DeleteCloudRecordingRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteCloudRecording", DeleteCloudRecordingResponse.class);
    }

    /**
     *用于删除项目
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteProject", DeleteProjectResponse.class);
    }

    /**
     *用于获取指定设备信息
     * @param req DescribeDeviceInfoRequest
     * @return DescribeDeviceInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceInfoResponse DescribeDeviceInfo(DescribeDeviceInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceInfo", DescribeDeviceInfoResponse.class);
    }

    /**
     *用于获取设备信息列表
     * @param req DescribeDeviceListRequest
     * @return DescribeDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceListResponse DescribeDeviceList(DescribeDeviceListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceList", DescribeDeviceListResponse.class);
    }

    /**
     *获取设备会话数据详单
     * @param req DescribeDeviceSessionDetailsRequest
     * @return DescribeDeviceSessionDetailsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceSessionDetailsResponse DescribeDeviceSessionDetails(DescribeDeviceSessionDetailsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceSessionDetails", DescribeDeviceSessionDetailsResponse.class);
    }

    /**
     *获取设备会话列表
     * @param req DescribeDeviceSessionListRequest
     * @return DescribeDeviceSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceSessionListResponse DescribeDeviceSessionList(DescribeDeviceSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDeviceSessionList", DescribeDeviceSessionListResponse.class);
    }

    /**
     *用于查看权限配置
     * @param req DescribePolicyRequest
     * @return DescribePolicyResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyResponse DescribePolicy(DescribePolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribePolicy", DescribePolicyResponse.class);
    }

    /**
     *用于获取项目信息
     * @param req DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectInfoResponse DescribeProjectInfo(DescribeProjectInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectInfo", DescribeProjectInfoResponse.class);
    }

    /**
     *用于获取项目列表
     * @param req DescribeProjectListRequest
     * @return DescribeProjectListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectListResponse DescribeProjectList(DescribeProjectListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeProjectList", DescribeProjectListResponse.class);
    }

    /**
     *获取最新设备会话列表
     * @param req DescribeRecentSessionListRequest
     * @return DescribeRecentSessionListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRecentSessionListResponse DescribeRecentSessionList(DescribeRecentSessionListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeRecentSessionList", DescribeRecentSessionListResponse.class);
    }

    /**
     *获取会话统计值
     * @param req DescribeSessionStatisticsRequest
     * @return DescribeSessionStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionStatisticsResponse DescribeSessionStatistics(DescribeSessionStatisticsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionStatistics", DescribeSessionStatisticsResponse.class);
    }

    /**
     *获取各时间段的会话统计值
     * @param req DescribeSessionStatisticsByIntervalRequest
     * @return DescribeSessionStatisticsByIntervalResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionStatisticsByIntervalResponse DescribeSessionStatisticsByInterval(DescribeSessionStatisticsByIntervalRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeSessionStatisticsByInterval", DescribeSessionStatisticsByIntervalResponse.class);
    }

    /**
     *获取设备已经绑定的可用授权数量
     * @param req GetDeviceLicenseRequest
     * @return GetDeviceLicenseResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceLicenseResponse GetDeviceLicense(GetDeviceLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDeviceLicense", GetDeviceLicenseResponse.class);
    }

    /**
     *查询用户设备的授权绑定情况
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevices", GetDevicesResponse.class);
    }

    /**
     *统计license类型数量
     * @param req GetLicenseStatRequest
     * @return GetLicenseStatResponse
     * @throws TencentCloudSDKException
     */
    public GetLicenseStatResponse GetLicenseStat(GetLicenseStatRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLicenseStat", GetLicenseStatResponse.class);
    }

    /**
     *按授权查看license列表
     * @param req GetLicensesRequest
     * @return GetLicensesResponse
     * @throws TencentCloudSDKException
     */
    public GetLicensesResponse GetLicenses(GetLicensesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetLicenses", GetLicensesResponse.class);
    }

    /**
     *设置回调URL
录制回调事件内容参考：https://cloud.tencent.com/document/product/647/81113
转推回调事件内容参考：https://cloud.tencent.com/document/product/647/88552
     * @param req ModifyCallbackUrlRequest
     * @return ModifyCallbackUrlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCallbackUrlResponse ModifyCallbackUrl(ModifyCallbackUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyCallbackUrl", ModifyCallbackUrlResponse.class);
    }

    /**
     *用于修改设备信息
     * @param req ModifyDeviceRequest
     * @return ModifyDeviceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceResponse ModifyDevice(ModifyDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDevice", ModifyDeviceResponse.class);
    }

    /**
     *用于修改权限配置
     * @param req ModifyPolicyRequest
     * @return ModifyPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPolicyResponse ModifyPolicy(ModifyPolicyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPolicy", ModifyPolicyResponse.class);
    }

    /**
     *用于修改项目信息
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProject", ModifyProjectResponse.class);
    }

    /**
     *使用项目共享密钥可动态生成设备登录密钥，登录前无需对设备进行提前注册，适合希望简化业务流程的客户。由于是公共密钥，请务必注意保护项目共享密钥，并及时更新。建议项目共享密钥保存在服务器侧。由服务器生成设备登录密码下发给设备，避免密钥保存在客户端侧产生的密钥泄露风险。

开启项目共享密钥后，对于已注册的设备，仍可使用原设备密码登录。若希望仅能通过共享密钥生成密码登录，请通过云 API 将设备密码更新为"USEPROJECTKEYPWD"。
     * @param req ModifyProjectSecModeRequest
     * @return ModifyProjectSecModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectSecModeResponse ModifyProjectSecMode(ModifyProjectSecModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyProjectSecMode", ModifyProjectSecModeResponse.class);
    }

    /**
     *启动一个混流转推任务，将 TRTC 房间的多路音视频流混成一路音视频流，编码后推到直播 CDN 或者回推到 TRTC 房间。也支持不转码直接转推 TRTC 房间的单路流。启动成功后，会返回一个 SdkAppid 维度唯一的任务 Id（TaskId）。您需要保存该 TaskId，后续需要依赖此 TaskId 更新和结束任务。
     * @param req StartPublishLiveStreamRequest
     * @return StartPublishLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public StartPublishLiveStreamResponse StartPublishLiveStream(StartPublishLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartPublishLiveStream", StartPublishLiveStreamResponse.class);
    }

    /**
     *停止指定的混流转推任务。如果没有调用 Stop 接口停止任务，所有参与混流转推的主播离开房间超过MaxIdleTime 设置的时间后，任务也会自动停止。
     * @param req StopPublishLiveStreamRequest
     * @return StopPublishLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public StopPublishLiveStreamResponse StopPublishLiveStream(StopPublishLiveStreamRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopPublishLiveStream", StopPublishLiveStreamResponse.class);
    }

}
