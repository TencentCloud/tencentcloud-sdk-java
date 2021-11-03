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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceStreamsRequest extends AbstractModel{

    /**
    * 设备唯一标识
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 流地址失效时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 通道唯一标识（接口升级字段为必填）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
     * Get 设备唯一标识 
     * @return DeviceId 设备唯一标识
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备唯一标识
     * @param DeviceId 设备唯一标识
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 流地址失效时间 
     * @return ExpireTime 流地址失效时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 流地址失效时间
     * @param ExpireTime 流地址失效时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 通道唯一标识（接口升级字段为必填） 
     * @return ChannelId 通道唯一标识（接口升级字段为必填）
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道唯一标识（接口升级字段为必填）
     * @param ChannelId 通道唯一标识（接口升级字段为必填）
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeDeviceStreamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceStreamsRequest(DescribeDeviceStreamsRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
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
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

