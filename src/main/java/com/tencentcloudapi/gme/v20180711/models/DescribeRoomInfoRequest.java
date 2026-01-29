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

public class DescribeRoomInfoRequest extends AbstractModel {

    /**
    * <p>应用ID，登录<a href="https://console.cloud.tencent.com/gamegme">控制台 - 服务管理</a>创建应用得到的AppID</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
    */
    @SerializedName("RoomIds")
    @Expose
    private Long [] RoomIds;

    /**
    * <p>字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
    */
    @SerializedName("StrRoomIds")
    @Expose
    private String [] StrRoomIds;

    /**
     * Get <p>应用ID，登录<a href="https://console.cloud.tencent.com/gamegme">控制台 - 服务管理</a>创建应用得到的AppID</p> 
     * @return SdkAppId <p>应用ID，登录<a href="https://console.cloud.tencent.com/gamegme">控制台 - 服务管理</a>创建应用得到的AppID</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用ID，登录<a href="https://console.cloud.tencent.com/gamegme">控制台 - 服务管理</a>创建应用得到的AppID</p>
     * @param SdkAppId <p>应用ID，登录<a href="https://console.cloud.tencent.com/gamegme">控制台 - 服务管理</a>创建应用得到的AppID</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p> 
     * @return RoomIds <p>房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
     */
    public Long [] getRoomIds() {
        return this.RoomIds;
    }

    /**
     * Set <p>房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
     * @param RoomIds <p>房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
     */
    public void setRoomIds(Long [] RoomIds) {
        this.RoomIds = RoomIds;
    }

    /**
     * Get <p>字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p> 
     * @return StrRoomIds <p>字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
     */
    public String [] getStrRoomIds() {
        return this.StrRoomIds;
    }

    /**
     * Set <p>字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
     * @param StrRoomIds <p>字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）</p>
     */
    public void setStrRoomIds(String [] StrRoomIds) {
        this.StrRoomIds = StrRoomIds;
    }

    public DescribeRoomInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoomInfoRequest(DescribeRoomInfoRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomIds != null) {
            this.RoomIds = new Long[source.RoomIds.length];
            for (int i = 0; i < source.RoomIds.length; i++) {
                this.RoomIds[i] = new Long(source.RoomIds[i]);
            }
        }
        if (source.StrRoomIds != null) {
            this.StrRoomIds = new String[source.StrRoomIds.length];
            for (int i = 0; i < source.StrRoomIds.length; i++) {
                this.StrRoomIds[i] = new String(source.StrRoomIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "RoomIds.", this.RoomIds);
        this.setParamArraySimple(map, prefix + "StrRoomIds.", this.StrRoomIds);

    }
}

