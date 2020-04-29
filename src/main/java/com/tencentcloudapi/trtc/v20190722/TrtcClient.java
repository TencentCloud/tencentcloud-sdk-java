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

}
