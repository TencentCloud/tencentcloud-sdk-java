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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordRetrieveTaskChannelInfo extends AbstractModel{

    /**
    * 设备通道所属的设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备通道所属的设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备通道ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 设备通道名称 
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 任务状态，0:已取回，1:取回中，2:待取回, 3:无归档录像
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 设备通道所属的设备ID 
     * @return DeviceId 设备通道所属的设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备通道所属的设备ID
     * @param DeviceId 设备通道所属的设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备通道所属的设备名称 
     * @return DeviceName 设备通道所属的设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备通道所属的设备名称
     * @param DeviceName 设备通道所属的设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备通道ID 
     * @return ChannelId 设备通道ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 设备通道ID
     * @param ChannelId 设备通道ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 设备通道名称  
     * @return ChannelName 设备通道名称 
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 设备通道名称 
     * @param ChannelName 设备通道名称 
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 任务状态，0:已取回，1:取回中，2:待取回, 3:无归档录像 
     * @return Status 任务状态，0:已取回，1:取回中，2:待取回, 3:无归档录像
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，0:已取回，1:取回中，2:待取回, 3:无归档录像
     * @param Status 任务状态，0:已取回，1:取回中，2:待取回, 3:无归档录像
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public RecordRetrieveTaskChannelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordRetrieveTaskChannelInfo(RecordRetrieveTaskChannelInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

