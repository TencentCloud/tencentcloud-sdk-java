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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolcParam extends AbstractModel {

    /**
    * <p>火山引擎 AppID。</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>房间号。</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>进房 Token。</p><p>需要开启鉴权，生成 Token时，注意RoomId 、UserId 需要对应上。详见：https://www.volcengine.com/docs/6348/70121</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>分配给拉流端的UserId。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>订阅用户名单。</p><p>当前名单列表为空时，默认为全订阅；当名单列表有用户id,则只会订阅列表中用户。</p>
    */
    @SerializedName("TrustedUserIdList")
    @Expose
    private String TrustedUserIdList;

    /**
    * <p>不订阅用户名单</p>
    */
    @SerializedName("UntrustedUserIdList")
    @Expose
    private String UntrustedUserIdList;

    /**
     * Get <p>火山引擎 AppID。</p> 
     * @return AppId <p>火山引擎 AppID。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>火山引擎 AppID。</p>
     * @param AppId <p>火山引擎 AppID。</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>房间号。</p> 
     * @return RoomId <p>房间号。</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>房间号。</p>
     * @param RoomId <p>房间号。</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>进房 Token。</p><p>需要开启鉴权，生成 Token时，注意RoomId 、UserId 需要对应上。详见：https://www.volcengine.com/docs/6348/70121</p> 
     * @return Token <p>进房 Token。</p><p>需要开启鉴权，生成 Token时，注意RoomId 、UserId 需要对应上。详见：https://www.volcengine.com/docs/6348/70121</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>进房 Token。</p><p>需要开启鉴权，生成 Token时，注意RoomId 、UserId 需要对应上。详见：https://www.volcengine.com/docs/6348/70121</p>
     * @param Token <p>进房 Token。</p><p>需要开启鉴权，生成 Token时，注意RoomId 、UserId 需要对应上。详见：https://www.volcengine.com/docs/6348/70121</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>分配给拉流端的UserId。</p> 
     * @return UserId <p>分配给拉流端的UserId。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>分配给拉流端的UserId。</p>
     * @param UserId <p>分配给拉流端的UserId。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>订阅用户名单。</p><p>当前名单列表为空时，默认为全订阅；当名单列表有用户id,则只会订阅列表中用户。</p> 
     * @return TrustedUserIdList <p>订阅用户名单。</p><p>当前名单列表为空时，默认为全订阅；当名单列表有用户id,则只会订阅列表中用户。</p>
     */
    public String getTrustedUserIdList() {
        return this.TrustedUserIdList;
    }

    /**
     * Set <p>订阅用户名单。</p><p>当前名单列表为空时，默认为全订阅；当名单列表有用户id,则只会订阅列表中用户。</p>
     * @param TrustedUserIdList <p>订阅用户名单。</p><p>当前名单列表为空时，默认为全订阅；当名单列表有用户id,则只会订阅列表中用户。</p>
     */
    public void setTrustedUserIdList(String TrustedUserIdList) {
        this.TrustedUserIdList = TrustedUserIdList;
    }

    /**
     * Get <p>不订阅用户名单</p> 
     * @return UntrustedUserIdList <p>不订阅用户名单</p>
     */
    public String getUntrustedUserIdList() {
        return this.UntrustedUserIdList;
    }

    /**
     * Set <p>不订阅用户名单</p>
     * @param UntrustedUserIdList <p>不订阅用户名单</p>
     */
    public void setUntrustedUserIdList(String UntrustedUserIdList) {
        this.UntrustedUserIdList = UntrustedUserIdList;
    }

    public VolcParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolcParam(VolcParam source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TrustedUserIdList != null) {
            this.TrustedUserIdList = new String(source.TrustedUserIdList);
        }
        if (source.UntrustedUserIdList != null) {
            this.UntrustedUserIdList = new String(source.UntrustedUserIdList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TrustedUserIdList", this.TrustedUserIdList);
        this.setParamSimple(map, prefix + "UntrustedUserIdList", this.UntrustedUserIdList);

    }
}

