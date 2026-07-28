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

public class SourceInfo extends AbstractModel {

    /**
    * <p>直播间 ID（用于结果透传与去重；数字房间号也用 string 传）</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>房间号类型</p><p>枚举值：</p><ul><li>0： 字符串房间号</li><li>1： 数字房间号</li></ul>
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * <p>主播/被审核方 ID</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
     * Get <p>直播间 ID（用于结果透传与去重；数字房间号也用 string 传）</p> 
     * @return RoomId <p>直播间 ID（用于结果透传与去重；数字房间号也用 string 传）</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>直播间 ID（用于结果透传与去重；数字房间号也用 string 传）</p>
     * @param RoomId <p>直播间 ID（用于结果透传与去重；数字房间号也用 string 传）</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>房间号类型</p><p>枚举值：</p><ul><li>0： 字符串房间号</li><li>1： 数字房间号</li></ul> 
     * @return RoomIdType <p>房间号类型</p><p>枚举值：</p><ul><li>0： 字符串房间号</li><li>1： 数字房间号</li></ul>
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set <p>房间号类型</p><p>枚举值：</p><ul><li>0： 字符串房间号</li><li>1： 数字房间号</li></ul>
     * @param RoomIdType <p>房间号类型</p><p>枚举值：</p><ul><li>0： 字符串房间号</li><li>1： 数字房间号</li></ul>
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get <p>主播/被审核方 ID</p> 
     * @return UserId <p>主播/被审核方 ID</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>主播/被审核方 ID</p>
     * @param UserId <p>主播/被审核方 ID</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public SourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInfo(SourceInfo source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

