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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoomInfoRequest extends AbstractModel{

    /**
    * 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
    */
    @SerializedName("RoomIds")
    @Expose
    private Long [] RoomIds;

    /**
    * 字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
    */
    @SerializedName("StrRoomIds")
    @Expose
    private String [] StrRoomIds;

    /**
     * Get 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID 
     * @return SdkAppId 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     * @param SdkAppId 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个） 
     * @return RoomIds 房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
     */
    public Long [] getRoomIds() {
        return this.RoomIds;
    }

    /**
     * Set 房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
     * @param RoomIds 房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
     */
    public void setRoomIds(Long [] RoomIds) {
        this.RoomIds = RoomIds;
    }

    /**
     * Get 字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个） 
     * @return StrRoomIds 字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
     */
    public String [] getStrRoomIds() {
        return this.StrRoomIds;
    }

    /**
     * Set 字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
     * @param StrRoomIds 字符串类型房间号列表，最大不能超过10个（RoomIds、StrRoomIds必须填一个）
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

