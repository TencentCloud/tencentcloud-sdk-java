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

public class DescribeCurrentDeviceDataResponse extends AbstractModel{

    /**
    * 通道数
    */
    @SerializedName("Channels")
    @Expose
    private Long Channels;

    /**
    * 设备数
    */
    @SerializedName("Devices")
    @Expose
    private Long Devices;

    /**
    * 在线通道数
    */
    @SerializedName("OnlineChannels")
    @Expose
    private Long OnlineChannels;

    /**
    * 在线设备数
    */
    @SerializedName("OnlineDevices")
    @Expose
    private Long OnlineDevices;

    /**
    * 正在录制通道数
    */
    @SerializedName("RecordingChannels")
    @Expose
    private Long RecordingChannels;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 通道数 
     * @return Channels 通道数
     */
    public Long getChannels() {
        return this.Channels;
    }

    /**
     * Set 通道数
     * @param Channels 通道数
     */
    public void setChannels(Long Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 设备数 
     * @return Devices 设备数
     */
    public Long getDevices() {
        return this.Devices;
    }

    /**
     * Set 设备数
     * @param Devices 设备数
     */
    public void setDevices(Long Devices) {
        this.Devices = Devices;
    }

    /**
     * Get 在线通道数 
     * @return OnlineChannels 在线通道数
     */
    public Long getOnlineChannels() {
        return this.OnlineChannels;
    }

    /**
     * Set 在线通道数
     * @param OnlineChannels 在线通道数
     */
    public void setOnlineChannels(Long OnlineChannels) {
        this.OnlineChannels = OnlineChannels;
    }

    /**
     * Get 在线设备数 
     * @return OnlineDevices 在线设备数
     */
    public Long getOnlineDevices() {
        return this.OnlineDevices;
    }

    /**
     * Set 在线设备数
     * @param OnlineDevices 在线设备数
     */
    public void setOnlineDevices(Long OnlineDevices) {
        this.OnlineDevices = OnlineDevices;
    }

    /**
     * Get 正在录制通道数 
     * @return RecordingChannels 正在录制通道数
     */
    public Long getRecordingChannels() {
        return this.RecordingChannels;
    }

    /**
     * Set 正在录制通道数
     * @param RecordingChannels 正在录制通道数
     */
    public void setRecordingChannels(Long RecordingChannels) {
        this.RecordingChannels = RecordingChannels;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCurrentDeviceDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentDeviceDataResponse(DescribeCurrentDeviceDataResponse source) {
        if (source.Channels != null) {
            this.Channels = new Long(source.Channels);
        }
        if (source.Devices != null) {
            this.Devices = new Long(source.Devices);
        }
        if (source.OnlineChannels != null) {
            this.OnlineChannels = new Long(source.OnlineChannels);
        }
        if (source.OnlineDevices != null) {
            this.OnlineDevices = new Long(source.OnlineDevices);
        }
        if (source.RecordingChannels != null) {
            this.RecordingChannels = new Long(source.RecordingChannels);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Channels", this.Channels);
        this.setParamSimple(map, prefix + "Devices", this.Devices);
        this.setParamSimple(map, prefix + "OnlineChannels", this.OnlineChannels);
        this.setParamSimple(map, prefix + "OnlineDevices", this.OnlineDevices);
        this.setParamSimple(map, prefix + "RecordingChannels", this.RecordingChannels);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

