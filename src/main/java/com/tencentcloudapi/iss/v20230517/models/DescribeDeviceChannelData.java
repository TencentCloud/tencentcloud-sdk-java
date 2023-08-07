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

public class DescribeDeviceChannelData extends AbstractModel{

    /**
    * 设备 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 通道 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 通道编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelCode")
    @Expose
    private String ChannelCode;

    /**
    * 通道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 流状态（0:未传输,1:传输中）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否可控 Ptz（0:不可控,1:可控）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PTZType")
    @Expose
    private Long PTZType;

    /**
    * 通道厂商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 通道在离线状态（0:离线,1:在线）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 所在地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 设备 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 通道 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelId 通道 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelId 通道 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 通道编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelCode 通道编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelCode() {
        return this.ChannelCode;
    }

    /**
     * Set 通道编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelCode 通道编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelCode(String ChannelCode) {
        this.ChannelCode = ChannelCode;
    }

    /**
     * Get 通道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 通道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 通道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 流状态（0:未传输,1:传输中）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 流状态（0:未传输,1:传输中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 流状态（0:未传输,1:传输中）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 流状态（0:未传输,1:传输中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否可控 Ptz（0:不可控,1:可控）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PTZType 是否可控 Ptz（0:不可控,1:可控）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPTZType() {
        return this.PTZType;
    }

    /**
     * Set 是否可控 Ptz（0:不可控,1:可控）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PTZType 是否可控 Ptz（0:不可控,1:可控）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPTZType(Long PTZType) {
        this.PTZType = PTZType;
    }

    /**
     * Get 通道厂商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Manufacturer 通道厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 通道厂商
注意：此字段可能返回 null，表示取不到有效值。
     * @param Manufacturer 通道厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resolution 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resolution 通道支持分辨率（分辨率列表由‘/’隔开，国标协议样例（6/3），自定义样例（12800960/640480））
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 通道在离线状态（0:离线,1:在线）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 通道在离线状态（0:离线,1:在线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 通道在离线状态（0:离线,1:在线）
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 通道在离线状态（0:离线,1:在线）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 所在地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 所在地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所在地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 所在地域
注意：此字段可能返回 null，表示取不到有效值。
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

