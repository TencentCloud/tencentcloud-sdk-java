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

public class ModifyRoomInfoRequest extends AbstractModel{

    /**
    * 应用ID，登录[控制台 - 服务管理](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 房间id
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 301 启动推流
302 停止推流
303 重置RTMP连接
    */
    @SerializedName("OperationType")
    @Expose
    private Long OperationType;

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
     * Get 房间id 
     * @return RoomId 房间id
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间id
     * @param RoomId 房间id
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 301 启动推流
302 停止推流
303 重置RTMP连接 
     * @return OperationType 301 启动推流
302 停止推流
303 重置RTMP连接
     */
    public Long getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 301 启动推流
302 停止推流
303 重置RTMP连接
     * @param OperationType 301 启动推流
302 停止推流
303 重置RTMP连接
     */
    public void setOperationType(Long OperationType) {
        this.OperationType = OperationType;
    }

    public ModifyRoomInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRoomInfoRequest(ModifyRoomInfoRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.OperationType != null) {
            this.OperationType = new Long(source.OperationType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);

    }
}

