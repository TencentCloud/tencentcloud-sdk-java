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
package com.tencentcloudapi.live.v20180801;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.live.v20180801.models.*;

public class LiveClient extends AbstractClient{
    private static String endpoint = "live.tencentcloudapi.com";
    private static String version = "2018-08-01";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public LiveClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public LiveClient(Credential credential, String region, ClientProfile profile) {
        super(LiveClient.endpoint, LiveClient.version, credential, region, profile);
    }

    /**
     *对流设置延播
     * @param req AddDelayLiveStreamRequest
     * @return AddDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public AddDelayLiveStreamResponse  AddDelayLiveStream(AddDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDelayLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddDelayLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddDelayLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加水印
     * @param req AddLiveWatermarkRequest
     * @return AddLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public AddLiveWatermarkResponse  AddLiveWatermark(AddLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AddLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AddLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *- 使用前提
  1. 录制文件存放于点播平台，所以用户如需使用录制功能，需首先自行开通点播服务。
  2. 录制文件存放后相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，具体请参考 [对应文档](https://cloud.tencent.com/document/product/266/2838)。

- 模式说明
  该接口支持两种录制模式：
  1. 定时录制模式。
    需要传入开始时间与结束时间，录制任务根据时间自动开始与结束。
  2. 实时视频录制模式。
    忽略传入的开始时间，在录制任务创建后立即开始录制，录制时长支持最大为30分钟，如果传入的结束时间与当前时间差大于30分钟，则按30分钟计算，实时视频录制主要用于录制精彩视频场景，时长建议控制在5分钟以内。

- 注意事项
  1. 调用接口超时设置应大于3秒，小于3秒重试以及频繁调用都有可能产生重复录制任务。
     * @param req CreateLiveRecordRequest
     * @return CreateLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public CreateLiveRecordResponse  CreateLiveRecord(CreateLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加拉流配置
     * @param req CreatePullStreamConfigRequest
     * @return CreatePullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreatePullStreamConfigResponse  CreatePullStreamConfig(CreatePullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePullStreamConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePullStreamConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePullStreamConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于删除录制任务
     * @param req DeleteLiveRecordRequest
     * @return DeleteLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveRecordResponse  DeleteLiveRecord(DeleteLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除水印
     * @param req DeleteLiveWatermarkRequest
     * @return DeleteLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLiveWatermarkResponse  DeleteLiveWatermark(DeleteLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Drm获取加密key
     * @param req DescribeDrmEncryptKeysRequest
     * @return DescribeDrmEncryptKeysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDrmEncryptKeysResponse  DescribeDrmEncryptKeys(DescribeDrmEncryptKeysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDrmEncryptKeysResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDrmEncryptKeysResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDrmEncryptKeys"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询播放鉴权key
     * @param req DescribeLivePlayAuthKeyRequest
     * @return DescribeLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePlayAuthKeyResponse  DescribeLivePlayAuthKey(DescribeLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePlayAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePlayAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLivePlayAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询直播推流鉴权key
     * @param req DescribeLivePushAuthKeyRequest
     * @return DescribeLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLivePushAuthKeyResponse  DescribeLivePushAuthKey(DescribeLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLivePushAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLivePushAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLivePushAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询在线推流信息列表
     * @param req DescribeLiveStreamOnlineInfoRequest
     * @return DescribeLiveStreamOnlineInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineInfoResponse  DescribeLiveStreamOnlineInfo(DescribeLiveStreamOnlineInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamOnlineInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamOnlineInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamOnlineInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回正在直播中的流列表
     * @param req DescribeLiveStreamOnlineListRequest
     * @return DescribeLiveStreamOnlineListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamOnlineListResponse  DescribeLiveStreamOnlineList(DescribeLiveStreamOnlineListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamOnlineListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamOnlineListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamOnlineList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回已经推过流的流列表
     * @param req DescribeLiveStreamPublishedListRequest
     * @return DescribeLiveStreamPublishedListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamPublishedListResponse  DescribeLiveStreamPublishedList(DescribeLiveStreamPublishedListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamPublishedListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamPublishedListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamPublishedList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回直播中、无推流或者禁播等状态
     * @param req DescribeLiveStreamStateRequest
     * @return DescribeLiveStreamStateResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveStreamStateResponse  DescribeLiveStreamState(DescribeLiveStreamStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveStreamStateResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveStreamStateResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveStreamState"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询水印列表
     * @param req DescribeLiveWatermarksRequest
     * @return DescribeLiveWatermarksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLiveWatermarksResponse  DescribeLiveWatermarks(DescribeLiveWatermarksRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLiveWatermarksResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLiveWatermarksResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeLiveWatermarks"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询拉流配置
     * @param req DescribePullStreamConfigsRequest
     * @return DescribePullStreamConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePullStreamConfigsResponse  DescribePullStreamConfigs(DescribePullStreamConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePullStreamConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePullStreamConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribePullStreamConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *断开推流连接，但可以重新推流
     * @param req DropLiveStreamRequest
     * @return DropLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public DropLiveStreamResponse  DropLiveStream(DropLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DropLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DropLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DropLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁止某条流的推送，可以预设某个时刻将流恢复。
     * @param req ForbidLiveStreamRequest
     * @return ForbidLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ForbidLiveStreamResponse  ForbidLiveStream(ForbidLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ForbidLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ForbidLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ForbidLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取直播DRM的license
     * @param req GetLiveDrmLicenseRequest
     * @return GetLiveDrmLicenseResponse
     * @throws TencentCloudSDKException
     */
    public GetLiveDrmLicenseResponse  GetLiveDrmLicense(GetLiveDrmLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLiveDrmLicenseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetLiveDrmLicenseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetLiveDrmLicense"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取点播DRM的license
     * @param req GetVodDrmLicenseRequest
     * @return GetVodDrmLicenseResponse
     * @throws TencentCloudSDKException
     */
    public GetVodDrmLicenseResponse  GetVodDrmLicense(GetVodDrmLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetVodDrmLicenseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetVodDrmLicenseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetVodDrmLicense"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改播放鉴权key
     * @param req ModifyLivePlayAuthKeyRequest
     * @return ModifyLivePlayAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePlayAuthKeyResponse  ModifyLivePlayAuthKey(ModifyLivePlayAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePlayAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePlayAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePlayAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改直播推流鉴权key
     * @param req ModifyLivePushAuthKeyRequest
     * @return ModifyLivePushAuthKeyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLivePushAuthKeyResponse  ModifyLivePushAuthKey(ModifyLivePushAuthKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLivePushAuthKeyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLivePushAuthKeyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyLivePushAuthKey"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新拉流配置
     * @param req ModifyPullStreamConfigRequest
     * @return ModifyPullStreamConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamConfigResponse  ModifyPullStreamConfig(ModifyPullStreamConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPullStreamConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPullStreamConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPullStreamConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改直播拉流配置状态
     * @param req ModifyPullStreamStatusRequest
     * @return ModifyPullStreamStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPullStreamStatusResponse  ModifyPullStreamStatus(ModifyPullStreamStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPullStreamStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPullStreamStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPullStreamStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复延迟播放设置
     * @param req ResumeDelayLiveStreamRequest
     * @return ResumeDelayLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeDelayLiveStreamResponse  ResumeDelayLiveStream(ResumeDelayLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeDelayLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeDelayLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeDelayLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *恢复某条流的推送。
     * @param req ResumeLiveStreamRequest
     * @return ResumeLiveStreamResponse
     * @throws TencentCloudSDKException
     */
    public ResumeLiveStreamResponse  ResumeLiveStream(ResumeLiveStreamRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeLiveStreamResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResumeLiveStreamResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResumeLiveStream"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置水印是否启用
     * @param req SetLiveWatermarkStatusRequest
     * @return SetLiveWatermarkStatusResponse
     * @throws TencentCloudSDKException
     */
    public SetLiveWatermarkStatusResponse  SetLiveWatermarkStatus(SetLiveWatermarkStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetLiveWatermarkStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SetLiveWatermarkStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SetLiveWatermarkStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于Drm加密请求
     * @param req StartDrmEncryptionRequest
     * @return StartDrmEncryptionResponse
     * @throws TencentCloudSDKException
     */
    public StartDrmEncryptionResponse  StartDrmEncryption(StartDrmEncryptionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartDrmEncryptionResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartDrmEncryptionResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartDrmEncryption"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *说明：录制后的文件存放于点播平台。用户如需使用录制功能，需首先自行开通点播账号并确保账号可用。录制文件存放后，相关费用（含存储以及下行播放流量）按照点播平台计费方式收取，请参考对应文档。
     * @param req StopLiveRecordRequest
     * @return StopLiveRecordResponse
     * @throws TencentCloudSDKException
     */
    public StopLiveRecordResponse  StopLiveRecord(StopLiveRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopLiveRecordResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopLiveRecordResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopLiveRecord"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新水印
     * @param req UpdateLiveWatermarkRequest
     * @return UpdateLiveWatermarkResponse
     * @throws TencentCloudSDKException
     */
    public UpdateLiveWatermarkResponse  UpdateLiveWatermark(UpdateLiveWatermarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateLiveWatermarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateLiveWatermarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateLiveWatermark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
