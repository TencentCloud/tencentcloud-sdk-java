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

public class AddUserDeviceRequest extends AbstractModel{

    /**
    * 设备名称，仅支持中文、英文、数字、_、-，长度不超过32个字符；（设备名称无需全局唯一，可以重复）
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备接入协议（1:RTMP,2:GB,3:GW）
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * 设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备所属组织ID，从查询组织接口DescribeOrganization中获取
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 设备接入服务节点ID（从查询设备可用服务节点接口DescribeDeviceRegion中获取的Value字段）
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * 设备密码（国标，网关设备必填，仅支持数字组合，长度为1-64个字符）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 设备描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 设备接入网关ID，从查询网关列表接口中ListGateways获取（仅网关接入需要）
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关接入协议类型（从查询网关接入协议接口DescribeGatewayProtocol中获取）1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * 设备接入IP（仅网关接入需要）
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 设备端口（仅网关接入需要）
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 设备用户名（仅网关接入需要）
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get 设备名称，仅支持中文、英文、数字、_、-，长度不超过32个字符；（设备名称无需全局唯一，可以重复） 
     * @return Name 设备名称，仅支持中文、英文、数字、_、-，长度不超过32个字符；（设备名称无需全局唯一，可以重复）
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称，仅支持中文、英文、数字、_、-，长度不超过32个字符；（设备名称无需全局唯一，可以重复）
     * @param Name 设备名称，仅支持中文、英文、数字、_、-，长度不超过32个字符；（设备名称无需全局唯一，可以重复）
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备接入协议（1:RTMP,2:GB,3:GW） 
     * @return AccessProtocol 设备接入协议（1:RTMP,2:GB,3:GW）
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set 设备接入协议（1:RTMP,2:GB,3:GW）
     * @param AccessProtocol 设备接入协议（1:RTMP,2:GB,3:GW）
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get 设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC） 
     * @return Type 设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）
     * @param Type 设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备所属组织ID，从查询组织接口DescribeOrganization中获取 
     * @return OrganizationId 设备所属组织ID，从查询组织接口DescribeOrganization中获取
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 设备所属组织ID，从查询组织接口DescribeOrganization中获取
     * @param OrganizationId 设备所属组织ID，从查询组织接口DescribeOrganization中获取
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 设备接入服务节点ID（从查询设备可用服务节点接口DescribeDeviceRegion中获取的Value字段） 
     * @return ClusterId 设备接入服务节点ID（从查询设备可用服务节点接口DescribeDeviceRegion中获取的Value字段）
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 设备接入服务节点ID（从查询设备可用服务节点接口DescribeDeviceRegion中获取的Value字段）
     * @param ClusterId 设备接入服务节点ID（从查询设备可用服务节点接口DescribeDeviceRegion中获取的Value字段）
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议) 
     * @return TransportProtocol 设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set 设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)
     * @param TransportProtocol 设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get 设备密码（国标，网关设备必填，仅支持数字组合，长度为1-64个字符） 
     * @return Password 设备密码（国标，网关设备必填，仅支持数字组合，长度为1-64个字符）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设备密码（国标，网关设备必填，仅支持数字组合，长度为1-64个字符）
     * @param Password 设备密码（国标，网关设备必填，仅支持数字组合，长度为1-64个字符）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 设备描述，仅支持中文、英文、数字、_、-，长度不超过128个字符 
     * @return Description 设备描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     * @param Description 设备描述，仅支持中文、英文、数字、_、-，长度不超过128个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 设备接入网关ID，从查询网关列表接口中ListGateways获取（仅网关接入需要） 
     * @return GatewayId 设备接入网关ID，从查询网关列表接口中ListGateways获取（仅网关接入需要）
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 设备接入网关ID，从查询网关列表接口中ListGateways获取（仅网关接入需要）
     * @param GatewayId 设备接入网关ID，从查询网关列表接口中ListGateways获取（仅网关接入需要）
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关接入协议类型（从查询网关接入协议接口DescribeGatewayProtocol中获取）1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要） 
     * @return ProtocolType 网关接入协议类型（从查询网关接入协议接口DescribeGatewayProtocol中获取）1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 网关接入协议类型（从查询网关接入协议接口DescribeGatewayProtocol中获取）1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
     * @param ProtocolType 网关接入协议类型（从查询网关接入协议接口DescribeGatewayProtocol中获取）1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 设备接入IP（仅网关接入需要） 
     * @return Ip 设备接入IP（仅网关接入需要）
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备接入IP（仅网关接入需要）
     * @param Ip 设备接入IP（仅网关接入需要）
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 设备端口（仅网关接入需要） 
     * @return Port 设备端口（仅网关接入需要）
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 设备端口（仅网关接入需要）
     * @param Port 设备端口（仅网关接入需要）
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 设备用户名（仅网关接入需要） 
     * @return Username 设备用户名（仅网关接入需要）
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 设备用户名（仅网关接入需要）
     * @param Username 设备用户名（仅网关接入需要）
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public AddUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUserDeviceRequest(AddUserDeviceRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AccessProtocol != null) {
            this.AccessProtocol = new Long(source.AccessProtocol);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AccessProtocol", this.AccessProtocol);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

