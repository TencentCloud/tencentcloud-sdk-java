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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelInfo extends AbstractModel {

    /**
    * 通道所属的设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备通道ID，一个设备通道只允许被一个上云计划添加
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
     * Get 通道所属的设备ID 
     * @return DeviceId 通道所属的设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 通道所属的设备ID
     * @param DeviceId 通道所属的设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备通道ID，一个设备通道只允许被一个上云计划添加 
     * @return ChannelId 设备通道ID，一个设备通道只允许被一个上云计划添加
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 设备通道ID，一个设备通道只允许被一个上云计划添加
     * @param ChannelId 设备通道ID，一个设备通道只允许被一个上云计划添加
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public ChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelInfo(ChannelInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

