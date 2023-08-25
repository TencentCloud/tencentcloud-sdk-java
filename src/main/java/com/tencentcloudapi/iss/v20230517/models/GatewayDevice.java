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

public class GatewayDevice extends AbstractModel{

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 网关接入协议类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * 网关接入协议名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolTypeName")
    @Expose
    private String ProtocolTypeName;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 设备端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 设备下通道数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
    * 设备状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 设备ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceId 设备ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 网关接入协议类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolType 网关接入协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 网关接入协议类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolType 网关接入协议类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 网关接入协议名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolTypeName 网关接入协议名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocolTypeName() {
        return this.ProtocolTypeName;
    }

    /**
     * Set 网关接入协议名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolTypeName 网关接入协议名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolTypeName(String ProtocolTypeName) {
        this.ProtocolTypeName = ProtocolTypeName;
    }

    /**
     * Get 设备名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 设备名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 设备类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 设备内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 设备内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 设备端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 设备端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 设备端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 设备端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 设备下通道数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelNum 设备下通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * Set 设备下通道数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelNum 设备下通道数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    /**
     * Get 设备状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 设备状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 设备状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GatewayDevice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayDevice(GatewayDevice source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new Long(source.ProtocolType);
        }
        if (source.ProtocolTypeName != null) {
            this.ProtocolTypeName = new String(source.ProtocolTypeName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ChannelNum != null) {
            this.ChannelNum = new Long(source.ChannelNum);
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
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "ProtocolTypeName", this.ProtocolTypeName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

