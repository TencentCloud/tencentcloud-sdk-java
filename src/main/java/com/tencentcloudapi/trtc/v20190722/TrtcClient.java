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

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TrtcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TrtcClient(Credential credential, String region, ClientProfile profile) {
        super(TrtcClient.endpoint, TrtcClient.version, credential, region, profile);
    }

    /**
     *接口说明：把房间所有用户从房间踢出，解散房间。支持所有平台，Android、iOS、Windows 和 macOS 需升级到 TRTC SDK 6.6及以上版本。
     * @param req DissolveRoomRequest
     * @return DissolveRoomResponse
     * @throws TencentCloudSDKException
     */
    public DissolveRoomResponse DissolveRoom(DissolveRoomRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DissolveRoomResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DissolveRoomResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DissolveRoom"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口说明：将用户从房间踢出。支持所有平台，Android、iOS、Windows 和 macOS 需升级到 TRTC SDK 6.6及以上版本。
     * @param req KickOutUserRequest
     * @return KickOutUserResponse
     * @throws TencentCloudSDKException
     */
    public KickOutUserResponse KickOutUser(KickOutUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<KickOutUserResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<KickOutUserResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "KickOutUser"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
