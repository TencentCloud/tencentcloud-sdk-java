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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TRTCJoinRoomInput extends AbstractModel {

    /**
    * 签名。
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 房间号。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 推流应用ID。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * 用户唯一标识。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 进房钥匙，若需要权限控制请携带该参数。
 [privateMapKey 权限设置](/document/product/647/32240) 
    */
    @SerializedName("PrivateMapKey")
    @Expose
    private String PrivateMapKey;

    /**
    * 用户角色，目前支持两种角色：
<li>anchor：主播</li>
<li>audience：观众</li>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * TRTC房间号的类型：
<li>Integer：数字类型</li>
<li> String：字符串类型</li>
默认为：Integer 。
    */
    @SerializedName("RoomIdType")
    @Expose
    private String RoomIdType;

    /**
     * Get 签名。 
     * @return Sign 签名。
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 签名。
     * @param Sign 签名。
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get 房间号。 
     * @return RoomId 房间号。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间号。
     * @param RoomId 房间号。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 推流应用ID。 
     * @return SdkAppId 推流应用ID。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 推流应用ID。
     * @param SdkAppId 推流应用ID。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 用户唯一标识。 
     * @return UserId 用户唯一标识。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一标识。
     * @param UserId 用户唯一标识。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 进房钥匙，若需要权限控制请携带该参数。
 [privateMapKey 权限设置](/document/product/647/32240)  
     * @return PrivateMapKey 进房钥匙，若需要权限控制请携带该参数。
 [privateMapKey 权限设置](/document/product/647/32240) 
     */
    public String getPrivateMapKey() {
        return this.PrivateMapKey;
    }

    /**
     * Set 进房钥匙，若需要权限控制请携带该参数。
 [privateMapKey 权限设置](/document/product/647/32240) 
     * @param PrivateMapKey 进房钥匙，若需要权限控制请携带该参数。
 [privateMapKey 权限设置](/document/product/647/32240) 
     */
    public void setPrivateMapKey(String PrivateMapKey) {
        this.PrivateMapKey = PrivateMapKey;
    }

    /**
     * Get 用户角色，目前支持两种角色：
<li>anchor：主播</li>
<li>audience：观众</li> 
     * @return Role 用户角色，目前支持两种角色：
<li>anchor：主播</li>
<li>audience：观众</li>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 用户角色，目前支持两种角色：
<li>anchor：主播</li>
<li>audience：观众</li>
     * @param Role 用户角色，目前支持两种角色：
<li>anchor：主播</li>
<li>audience：观众</li>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get TRTC房间号的类型：
<li>Integer：数字类型</li>
<li> String：字符串类型</li>
默认为：Integer 。 
     * @return RoomIdType TRTC房间号的类型：
<li>Integer：数字类型</li>
<li> String：字符串类型</li>
默认为：Integer 。
     */
    public String getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set TRTC房间号的类型：
<li>Integer：数字类型</li>
<li> String：字符串类型</li>
默认为：Integer 。
     * @param RoomIdType TRTC房间号的类型：
<li>Integer：数字类型</li>
<li> String：字符串类型</li>
默认为：Integer 。
     */
    public void setRoomIdType(String RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    public TRTCJoinRoomInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TRTCJoinRoomInput(TRTCJoinRoomInput source) {
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PrivateMapKey != null) {
            this.PrivateMapKey = new String(source.PrivateMapKey);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new String(source.RoomIdType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "PrivateMapKey", this.PrivateMapKey);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);

    }
}

