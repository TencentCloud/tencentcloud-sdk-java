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
package com.tencentcloudapi.trtc.v20190722;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.trtc.v20190722.models.*;

public class TrtcClient extends AbstractClient{
    private static String endpoint = "trtc.tencentcloudapi.com";
    private static String version = "2019-07-22";

    public TrtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TrtcClient(Credential credential, String region, ClientProfile profile) {
        super(TrtcClient.endpoint, TrtcClient.version, credential, region, profile);
    }

    /**
     *查询指定时间内的用户列表及用户通话质量数据。
     * @param req DescribeCallDetailRequest
     * @return DescribeCallDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCallDetailResponse DescribeCallDetail(DescribeCallDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCallDetailResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCallDetailResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCallDetail"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询历史房间和用户数，每分钟1次，可查询最近5天的数据
     * @param req DescribeHistoryScaleRequest
     * @return DescribeHistoryScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHistoryScaleResponse DescribeHistoryScale(DescribeHistoryScaleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHistoryScaleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHistoryScaleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeHistoryScale"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询sdkappid维度下实时网络状态，包括上行丢包与下行丢包。可查询24小时内数据，查询起止时间不超过1个小时。
     * @param req DescribeRealtimeNetworkRequest
     * @return DescribeRealtimeNetworkResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeNetworkResponse DescribeRealtimeNetwork(DescribeRealtimeNetworkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeNetworkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeNetworkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealtimeNetwork"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询sdkappid维度下实时质量数据，包括：进房成功率，首帧秒开率，音频卡顿率，视频卡顿率。可查询24小时内数据，查询起止时间不超过1个小时。
     * @param req DescribeRealtimeQualityRequest
     * @return DescribeRealtimeQualityResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeQualityResponse DescribeRealtimeQuality(DescribeRealtimeQualityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeQualityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeQualityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealtimeQuality"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询sdkappid维度下实时规模，可查询24小时内数据，查询起止时间不超过1个小时。
     * @param req DescribeRealtimeScaleRequest
     * @return DescribeRealtimeScaleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRealtimeScaleResponse DescribeRealtimeScale(DescribeRealtimeScaleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRealtimeScaleResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRealtimeScaleResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRealtimeScale"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询sdkappid下的房间列表。默认返回10条通话，一次最多返回100条通话。可查询最近5天的数据。
     * @param req DescribeRoomInformationRequest
     * @return DescribeRoomInformationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomInformationResponse DescribeRoomInformation(DescribeRoomInformationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomInformationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomInformationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRoomInformation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口说明：把房间所有用户从房间移出，解散房间。支持所有平台，Android、iOS、Windows 和 macOS 需升级到 TRTC SDK 6.6及以上版本。
     * @param req DismissRoomRequest
     * @return DismissRoomResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomResponse DismissRoom(DismissRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DismissRoomResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DismissRoom"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口说明：将用户从房间移出，适用于主播/房主/管理员踢人等场景。支持所有平台，Android、iOS、Windows 和 macOS 需升级到 TRTC SDK 6.6及以上版本。
     * @param req RemoveUserRequest
     * @return RemoveUserResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserResponse RemoveUser(RemoveUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemoveUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口说明：启动云端混流，并指定混流画面中各路画面的布局位置。

TRTC 的一个房间中可能会同时存在多路音视频流，您可以通过此 API 接口，通知腾讯云服务端将多路视频画面合成一路，并指定每一路画面的位置，同时将多路声音进行混音，最终形成一路音视频流，以便用于录制和直播观看。

您可以通过此接口实现如下目标：
- 设置最终直播流的画质和音质，包括视频分辨率、视频码率、视频帧率、以及声音质量等。
- 设置各路画面的位置和布局，您只需要在启动时设置一次，排版引擎会自动完成后续的画面排布。
- 设置录制文件名，用于二次回放。
- 设置 CDN 直播流 ID，用于在 CDN 进行直播观看。

目前已经支持了如下几种布局模板：
- 悬浮模板：第一个进入房间的用户的视频画面会铺满整个屏幕，其他用户的视频画面从左下角依次水平排列，悬浮于大画面之上。
- 九宫格模板：所有用户的视频画面大小一致，平分整个屏幕，人数越多，每个画面的尺寸越小。
- 屏幕分享模板：适合视频会议和在线教育场景的布局，屏幕分享（或者主讲的摄像头）始终占据屏幕左侧的大画面位置，其他用户依次垂直排列于右侧。
     * @param req StartMCUMixTranscodeRequest
     * @return StartMCUMixTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public StartMCUMixTranscodeResponse StartMCUMixTranscode(StartMCUMixTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StartMCUMixTranscodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StartMCUMixTranscodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StartMCUMixTranscode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口说明：结束云端混流
     * @param req StopMCUMixTranscodeRequest
     * @return StopMCUMixTranscodeResponse
     * @throws TencentCloudSDKException
     */
    public StopMCUMixTranscodeResponse StopMCUMixTranscode(StopMCUMixTranscodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<StopMCUMixTranscodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<StopMCUMixTranscodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "StopMCUMixTranscode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
