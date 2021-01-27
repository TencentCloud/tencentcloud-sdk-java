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
package com.tencentcloudapi.mgobe.v20201014;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mgobe.v20201014.models.*;

public class MgobeClient extends AbstractClient{
    private static String endpoint = "mgobe.tencentcloudapi.com";
    private static String service = "mgobe";
    private static String version = "2020-10-14";

    public MgobeClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MgobeClient(Credential credential, String region, ClientProfile profile) {
        super(MgobeClient.endpoint, MgobeClient.version, credential, region, profile);
    }

    /**
     *修改房间玩家自定义属性
     * @param req ChangeRoomPlayerProfileRequest
     * @return ChangeRoomPlayerProfileResponse
     * @throws TencentCloudSDKException
     */
    public ChangeRoomPlayerProfileResponse ChangeRoomPlayerProfile(ChangeRoomPlayerProfileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeRoomPlayerProfileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeRoomPlayerProfileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeRoomPlayerProfile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改玩家自定义状态
     * @param req ChangeRoomPlayerStatusRequest
     * @return ChangeRoomPlayerStatusResponse
     * @throws TencentCloudSDKException
     */
    public ChangeRoomPlayerStatusResponse ChangeRoomPlayerStatus(ChangeRoomPlayerStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ChangeRoomPlayerStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ChangeRoomPlayerStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ChangeRoomPlayerStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询玩家信息。支持两种用法，当OpenId不传的时候，PlayerId必传，传入PlayerId可以查询当前PlayerId的玩家信息，当OpenId传入的时候，PlayerId可不传，按照OpenId查询玩家信息。
     * @param req DescribePlayerRequest
     * @return DescribePlayerResponse
     * @throws TencentCloudSDKException
     */
    public DescribePlayerResponse DescribePlayer(DescribePlayerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePlayerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePlayerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePlayer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *该接口用于查询房间信息。支持两种用法，当房间Id不传的时候，玩家Id必传，传入玩家Id可以查询当前玩家所在的房间信息，当房间Id传入的时候，玩家Id可不传，按照房间Id查询房间信息。
     * @param req DescribeRoomRequest
     * @return DescribeRoomResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRoomResponse DescribeRoom(DescribeRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过game_id、room_id解散房间
     * @param req DismissRoomRequest
     * @return DismissRoomResponse
     * @throws TencentCloudSDKException
     */
    public DismissRoomResponse DismissRoom(DismissRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DismissRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DismissRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DismissRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改房间
     * @param req ModifyRoomRequest
     * @return ModifyRoomResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRoomResponse ModifyRoom(ModifyRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRoomResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyRoomResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyRoom");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *踢出房间玩家
     * @param req RemoveRoomPlayerRequest
     * @return RemoveRoomPlayerResponse
     * @throws TencentCloudSDKException
     */
    public RemoveRoomPlayerResponse RemoveRoomPlayer(RemoveRoomPlayerRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveRoomPlayerResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveRoomPlayerResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveRoomPlayer");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
