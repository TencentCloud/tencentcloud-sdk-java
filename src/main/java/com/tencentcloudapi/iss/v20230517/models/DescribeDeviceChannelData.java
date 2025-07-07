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

public class DescribeDeviceChannelData extends AbstractModel {

    /**
    * 设备 ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 通道编码
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * 通道名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 流状态（0:未传输,1:传输中）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否可控 Ptz（0:不可控,1:可控）
    */
    @SerializedName("PTZType")
    @Expose
    private Long PTZType;

    /**
    * 通道厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 通道在离线状态（0:离线,1:在线）
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 设备 ID 
     * @return DeviceId 设备 ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备 ID
     * @param DeviceId 设备 ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 通道编码 
     * @return ChannelCode 通道编码
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set 通道编码
     * @param ChannelCode 通道编码
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get 通道名称 
     * @return Name 通道名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通道名称
     * @param Name 通道名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 流状态（0:未传输,1:传输中） 
     * @return Status 流状态（0:未传输,1:传输中）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 流状态（0:未传输,1:传输中）
     * @param Status 流状态（0:未传输,1:传输中）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否可控 Ptz（0:不可控,1:可控） 
     * @return PTZType 是否可控 Ptz（0:不可控,1:可控）
     */
    public Long getPTZType() {
        return this.PTZType;
    }

    /**
     * Set 是否可控 Ptz（0:不可控,1:可控）
     * @param PTZType 是否可控 Ptz（0:不可控,1:可控）
     */
    public void setPTZType(Long PTZType) {
        this.PTZType = PTZType;
    }

    /**
     * Get 通道厂商 
     * @return Manufacturer 通道厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 通道厂商
     * @param Manufacturer 通道厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480）） 
     * @return Resolution 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
     * @param Resolution 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 通道在离线状态（0:离线,1:在线） 
     * @return State 通道在离线状态（0:离线,1:在线）
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 通道在离线状态（0:离线,1:在线）
     * @param State 通道在离线状态（0:离线,1:在线）
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 所在地域 
     * @return Region 所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所在地域
     * @param Region 所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public DescribeDeviceChannelData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceChannelData(DescribeDeviceChannelData source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelCode != null) {
            this.ChannelCode = new String(source.ChannelCode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PTZType != null) {
            this.PTZType = new Long(source.PTZType);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelCode", this.ChannelCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PTZType", this.PTZType);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

