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

}
