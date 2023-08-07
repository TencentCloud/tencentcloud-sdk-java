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

public class UpdateDeviceData extends AbstractModel{

    /**
    * 设备ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备编码（即我们为设备生成的20位国标编码）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 设备名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备接入协议，1:RTMP,2:GB,3:GW 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * 设备类型，1:IPC,2:NVR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备接入服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 设备接入服务节点名称

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 设备流传输协议，1:UDP,2:TCP 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * 设备密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 设备描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备状态，0:未注册,1:在线,2:离线,3:禁用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备所属组织ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationId")
    @Expose
    private Long OrganizationId;

    /**
    * 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * 设备接入IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 设备Port
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 设备用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 用户Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

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
     * Get 设备编码（即我们为设备生成的20位国标编码）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 设备编码（即我们为设备生成的20位国标编码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 设备编码（即我们为设备生成的20位国标编码）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 设备编码（即我们为设备生成的20位国标编码）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(String Code) {
        this.Code = Code;
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
     * Get 设备接入协议，1:RTMP,2:GB,3:GW 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessProtocol 设备接入协议，1:RTMP,2:GB,3:GW 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set 设备接入协议，1:RTMP,2:GB,3:GW 
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessProtocol 设备接入协议，1:RTMP,2:GB,3:GW 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get 设备类型，1:IPC,2:NVR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 设备类型，1:IPC,2:NVR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型，1:IPC,2:NVR
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 设备类型，1:IPC,2:NVR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备接入服务节点ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 设备接入服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 设备接入服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 设备接入服务节点ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 设备接入服务节点名称

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 设备接入服务节点名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 设备接入服务节点名称

注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 设备接入服务节点名称

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 设备流传输协议，1:UDP,2:TCP 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransportProtocol 设备流传输协议，1:UDP,2:TCP 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set 设备流传输协议，1:UDP,2:TCP 
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransportProtocol 设备流传输协议，1:UDP,2:TCP 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get 设备密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 设备密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设备密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 设备密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 设备描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 设备描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 设备描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备状态，0:未注册,1:在线,2:离线,3:禁用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 设备状态，0:未注册,1:在线,2:离线,3:禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态，0:未注册,1:在线,2:离线,3:禁用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 设备状态，0:未注册,1:在线,2:离线,3:禁用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备所属组织ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationId 设备所属组织ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 设备所属组织ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationId 设备所属组织ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationId(Long OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolType 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolType 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 设备接入IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 设备接入IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备接入IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 设备接入IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 设备Port
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 设备Port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 设备Port
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 设备Port
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 设备用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Username 设备用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 设备用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Username 设备用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 用户Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public UpdateDeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateDeviceData(UpdateDeviceData source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccessProtocol != null) {
            this.AccessProtocol = new Long(source.AccessProtocol);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.TransportProtocol != null) {
            this.TransportProtocol = new Long(source.TransportProtocol);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new Long(source.OrganizationId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new Long(source.ProtocolType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccessProtocol", this.AccessProtocol);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

