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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInAndOutTimeRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 房间ID
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 字符串类型用户ID
    */
    @SerializedName("UserIdStr")
    @Expose
    private String UserIdStr;

    /**
    * 字符串类型房间ID
    */
    @SerializedName("RoomIdStr")
    @Expose
    private String RoomIdStr;

    /**
     * Get 应用ID 
     * @return BizId 应用ID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID
     * @param BizId 应用ID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 房间ID 
     * @return RoomId 房间ID
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID
     * @param RoomId 房间ID
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 字符串类型用户ID 
     * @return UserIdStr 字符串类型用户ID
     */
    public String getUserIdStr() {
        return this.UserIdStr;
    }

    /**
     * Set 字符串类型用户ID
     * @param UserIdStr 字符串类型用户ID
     */
    public void setUserIdStr(String UserIdStr) {
        this.UserIdStr = UserIdStr;
    }

    /**
     * Get 字符串类型房间ID 
     * @return RoomIdStr 字符串类型房间ID
     */
    public String getRoomIdStr() {
        return this.RoomIdStr;
    }

    /**
     * Set 字符串类型房间ID
     * @param RoomIdStr 字符串类型房间ID
     */
    public void setRoomIdStr(String RoomIdStr) {
        this.RoomIdStr = RoomIdStr;
    }

    public DescribeUserInAndOutTimeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInAndOutTimeRequest(DescribeUserInAndOutTimeRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserIdStr != null) {
            this.UserIdStr = new String(source.UserIdStr);
        }
        if (source.RoomIdStr != null) {
            this.RoomIdStr = new String(source.RoomIdStr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserIdStr", this.UserIdStr);
        this.setParamSimple(map, prefix + "RoomIdStr", this.RoomIdStr);

    }
}

