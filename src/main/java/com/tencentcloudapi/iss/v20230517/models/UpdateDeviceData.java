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

public class UpdateDeviceData extends AbstractModel {

    /**
    * <p>设备ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）</p>
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>设备接入协议，1:RTMP,2:GB</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li></ul>
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * <p>设备类型，1:IPC,2:NVR</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>设备接入服务节点ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>设备接入服务节点名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>设备流传输协议，1:UDP,2:TCP</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>设备密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>设备描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>设备状态，0:未注册,1:在线,2:离线,3:禁用</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>设备所属组织ID</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private Long OrganizationId;

    /**
    * <p>设备接入网关ID（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>网关接入协议类型（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * <p>设备接入IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>设备Port</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>设备用户名</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>用户Id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get <p>设备ID</p> 
     * @return DeviceId <p>设备ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID</p>
     * @param DeviceId <p>设备ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）</p> 
     * @return Code <p>设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）</p>
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set <p>设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）</p>
     * @param Code <p>设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）</p>
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get <p>设备名称</p> 
     * @return Name <p>设备名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>设备名称</p>
     * @param Name <p>设备名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>设备接入协议，1:RTMP,2:GB</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li></ul> 
     * @return AccessProtocol <p>设备接入协议，1:RTMP,2:GB</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li></ul>
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set <p>设备接入协议，1:RTMP,2:GB</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li></ul>
     * @param AccessProtocol <p>设备接入协议，1:RTMP,2:GB</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li></ul>
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get <p>设备类型，1:IPC,2:NVR</p> 
     * @return Type <p>设备类型，1:IPC,2:NVR</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>设备类型，1:IPC,2:NVR</p>
     * @param Type <p>设备类型，1:IPC,2:NVR</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>设备接入服务节点ID</p> 
     * @return ClusterId <p>设备接入服务节点ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>设备接入服务节点ID</p>
     * @param ClusterId <p>设备接入服务节点ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>设备接入服务节点名称</p> 
     * @return ClusterName <p>设备接入服务节点名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>设备接入服务节点名称</p>
     * @param ClusterName <p>设备接入服务节点名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>设备流传输协议，1:UDP,2:TCP</p> 
     * @return TransportProtocol <p>设备流传输协议，1:UDP,2:TCP</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>设备流传输协议，1:UDP,2:TCP</p>
     * @param TransportProtocol <p>设备流传输协议，1:UDP,2:TCP</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>设备密码</p> 
     * @return Password <p>设备密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>设备密码</p>
     * @param Password <p>设备密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>设备描述</p> 
     * @return Description <p>设备描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>设备描述</p>
     * @param Description <p>设备描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>设备状态，0:未注册,1:在线,2:离线,3:禁用</p> 
     * @return Status <p>设备状态，0:未注册,1:在线,2:离线,3:禁用</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>设备状态，0:未注册,1:在线,2:离线,3:禁用</p>
     * @param Status <p>设备状态，0:未注册,1:在线,2:离线,3:禁用</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>设备所属组织ID</p> 
     * @return OrganizationId <p>设备所属组织ID</p>
     */
    public Long getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>设备所属组织ID</p>
     * @param OrganizationId <p>设备所属组织ID</p>
     */
    public void setOrganizationId(Long OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>设备接入网关ID（已不再使用，保留用于兼容，可忽略）</p> 
     * @return GatewayId <p>设备接入网关ID（已不再使用，保留用于兼容，可忽略）</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>设备接入网关ID（已不再使用，保留用于兼容，可忽略）</p>
     * @param GatewayId <p>设备接入网关ID（已不再使用，保留用于兼容，可忽略）</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>网关接入协议类型（已不再使用，保留用于兼容，可忽略）</p> 
     * @return ProtocolType <p>网关接入协议类型（已不再使用，保留用于兼容，可忽略）</p>
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>网关接入协议类型（已不再使用，保留用于兼容，可忽略）</p>
     * @param ProtocolType <p>网关接入协议类型（已不再使用，保留用于兼容，可忽略）</p>
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>设备接入IP</p> 
     * @return Ip <p>设备接入IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>设备接入IP</p>
     * @param Ip <p>设备接入IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>设备Port</p> 
     * @return Port <p>设备Port</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>设备Port</p>
     * @param Port <p>设备Port</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>设备用户名</p> 
     * @return Username <p>设备用户名</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>设备用户名</p>
     * @param Username <p>设备用户名</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>用户Id</p> 
     * @return AppId <p>用户Id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户Id</p>
     * @param AppId <p>用户Id</p>
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

