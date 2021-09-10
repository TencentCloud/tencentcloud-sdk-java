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

public class DescribeIPCChannelsRequest extends AbstractModel{

    /**
    * 偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制，默认0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道类型  0: 未知类型 1: 视频通道 2:  音频通道 3: 告警通道
    */
    @SerializedName("ChannelTypes")
    @Expose
    private Long [] ChannelTypes;

    /**
     * Get 偏移量，默认0 
     * @return Offset 偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认0
     * @param Offset 偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制，默认0 
     * @return Limit 限制，默认0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制，默认0
     * @param Limit 限制，默认0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 设备Id 
     * @return DeviceId 设备Id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备Id
     * @param DeviceId 设备Id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 通道类型  0: 未知类型 1: 视频通道 2:  音频通道 3: 告警通道 
     * @return ChannelTypes 通道类型  0: 未知类型 1: 视频通道 2:  音频通道 3: 告警通道
     */
    public Long [] getChannelTypes() {
        return this.ChannelTypes;
    }

    /**
     * Set 通道类型  0: 未知类型 1: 视频通道 2:  音频通道 3: 告警通道
     * @param ChannelTypes 通道类型  0: 未知类型 1: 视频通道 2:  音频通道 3: 告警通道
     */
    public void setChannelTypes(Long [] ChannelTypes) {
        this.ChannelTypes = ChannelTypes;
    }

    public DescribeIPCChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPCChannelsRequest(DescribeIPCChannelsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelTypes != null) {
            this.ChannelTypes = new Long[source.ChannelTypes.length];
            for (int i = 0; i < source.ChannelTypes.length; i++) {
                this.ChannelTypes[i] = new Long(source.ChannelTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamArraySimple(map, prefix + "ChannelTypes.", this.ChannelTypes);

    }
}

