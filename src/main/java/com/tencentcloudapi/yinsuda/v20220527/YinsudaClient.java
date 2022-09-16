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
package com.tencentcloudapi.yinsuda.v20220527;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.yinsuda.v20220527.models.*;

public class YinsudaClient extends AbstractClient{
    private static String endpoint = "yinsuda.tencentcloudapi.com";
    private static String service = "yinsuda";
    private static String version = "2022-05-27";

    public YinsudaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public YinsudaClient(Credential credential, String region, ClientProfile profile) {
        super(YinsudaClient.endpoint, YinsudaClient.version, credential, region, profile);
    }

    /**
     *批量获取歌曲详细信息，包括：歌词下载链接、播放凭证、音高数据下载链接信息等。
     * @param req BatchDescribeKTVMusicDetailsRequest
     * @return BatchDescribeKTVMusicDetailsResponse
     * @throws TencentCloudSDKException
     */
    public BatchDescribeKTVMusicDetailsResponse BatchDescribeKTVMusicDetails(BatchDescribeKTVMusicDetailsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BatchDescribeKTVMusicDetailsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<BatchDescribeKTVMusicDetailsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "BatchDescribeKTVMusicDetails");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建机器人，支持进入 RTC 房间，播放曲库歌曲。
     * @param req CreateKTVRobotRequest
     * @return CreateKTVRobotResponse
     * @throws TencentCloudSDKException
     */
    public CreateKTVRobotResponse CreateKTVRobot(CreateKTVRobotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateKTVRobotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateKTVRobotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateKTVRobot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据输入的规则匹配曲库中的歌曲。
     * @param req DescribeKTVMatchMusicsRequest
     * @return DescribeKTVMatchMusicsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVMatchMusicsResponse DescribeKTVMatchMusics(DescribeKTVMatchMusicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVMatchMusicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVMatchMusicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVMatchMusics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过标签过滤歌曲列表。
     * @param req DescribeKTVMusicsByTagRequest
     * @return DescribeKTVMusicsByTagResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVMusicsByTagResponse DescribeKTVMusicsByTag(DescribeKTVMusicsByTagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVMusicsByTagResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVMusicsByTagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVMusicsByTag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据歌单 Id 获取歌单详情。
     * @param req DescribeKTVPlaylistDetailRequest
     * @return DescribeKTVPlaylistDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVPlaylistDetailResponse DescribeKTVPlaylistDetail(DescribeKTVPlaylistDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVPlaylistDetailResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVPlaylistDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVPlaylistDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取歌单列表。
     * @param req DescribeKTVPlaylistsRequest
     * @return DescribeKTVPlaylistsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVPlaylistsResponse DescribeKTVPlaylists(DescribeKTVPlaylistsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVPlaylistsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVPlaylistsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVPlaylists");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取机器人列表，支持 Id、状态等过滤条件。
     * @param req DescribeKTVRobotsRequest
     * @return DescribeKTVRobotsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVRobotsResponse DescribeKTVRobots(DescribeKTVRobotsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVRobotsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVRobotsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVRobots");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据关键词获取联想词列表。
     * @param req DescribeKTVSuggestionsRequest
     * @return DescribeKTVSuggestionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVSuggestionsResponse DescribeKTVSuggestions(DescribeKTVSuggestionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVSuggestionsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVSuggestionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVSuggestions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取标签分组及分组下的标签列表信息。
     * @param req DescribeKTVTagsRequest
     * @return DescribeKTVTagsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeKTVTagsResponse DescribeKTVTags(DescribeKTVTagsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeKTVTagsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeKTVTagsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeKTVTags");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *销毁机器人，机器人退出 RTC 房间。
     * @param req DestroyKTVRobotRequest
     * @return DestroyKTVRobotResponse
     * @throws TencentCloudSDKException
     */
    public DestroyKTVRobotResponse DestroyKTVRobot(DestroyKTVRobotRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DestroyKTVRobotResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DestroyKTVRobotResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DestroyKTVRobot");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据关键词搜索歌曲，返回相关歌曲列表。
     * @param req SearchKTVMusicsRequest
     * @return SearchKTVMusicsResponse
     * @throws TencentCloudSDKException
     */
    public SearchKTVMusicsResponse SearchKTVMusics(SearchKTVMusicsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchKTVMusicsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchKTVMusicsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchKTVMusics");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *下发操作机器人指令，支持播放、暂停、恢复、歌单设置等操作指令，实现对机器人行为的控制。
     * @param req SyncKTVRobotCommandRequest
     * @return SyncKTVRobotCommandResponse
     * @throws TencentCloudSDKException
     */
    public SyncKTVRobotCommandResponse SyncKTVRobotCommand(SyncKTVRobotCommandRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SyncKTVRobotCommandResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SyncKTVRobotCommandResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SyncKTVRobotCommand");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
