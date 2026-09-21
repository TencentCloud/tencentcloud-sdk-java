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

public class AddUserDeviceRequest extends AbstractModel {

    /**
    * <p>设备名称，仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位；（设备名称无需全局唯一，可以重复）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>设备接入协议（1:RTMP,2:GB,6:ISUP）</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li><li>6： ISUP</li></ul><p>默认值：2</p>
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * <p>设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）</p><p>枚举值：</p><ul><li>1： IPC</li><li>2： NVR</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>设备所属组织ID，从查询组织接口DescribeOrganization中获取</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>设备接入服务节点ID（从查询设备可用服务节点接口DescribeRegionDomain中获取的Value字段）</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>设备密码（国标设备必填，长度为1-64个字符）</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>设备描述，长度不超过128个字符</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * <p>设备接入IP（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>设备端口（已不再使用，保留用于兼容，可忽略）</p><p>取值范围：[1, 65535]</p><p>单位： 端口</p>
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>设备用户名（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>设备 SN（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("SNCode")
    @Expose
    private String SNCode;

    /**
    * <p>RTMP推流地址自定义AppName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>RTMP推流地址自定义StreamName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
     * Get <p>设备名称，仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位；（设备名称无需全局唯一，可以重复）</p> 
     * @return Name <p>设备名称，仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位；（设备名称无需全局唯一，可以重复）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>设备名称，仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位；（设备名称无需全局唯一，可以重复）</p>
     * @param Name <p>设备名称，仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位；（设备名称无需全局唯一，可以重复）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>设备接入协议（1:RTMP,2:GB,6:ISUP）</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li><li>6： ISUP</li></ul><p>默认值：2</p> 
     * @return AccessProtocol <p>设备接入协议（1:RTMP,2:GB,6:ISUP）</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li><li>6： ISUP</li></ul><p>默认值：2</p>
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set <p>设备接入协议（1:RTMP,2:GB,6:ISUP）</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li><li>6： ISUP</li></ul><p>默认值：2</p>
     * @param AccessProtocol <p>设备接入协议（1:RTMP,2:GB,6:ISUP）</p><p>枚举值：</p><ul><li>1： RTMP</li><li>2： GB</li><li>6： ISUP</li></ul><p>默认值：2</p>
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get <p>设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）</p><p>枚举值：</p><ul><li>1： IPC</li><li>2： NVR</li></ul> 
     * @return Type <p>设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）</p><p>枚举值：</p><ul><li>1： IPC</li><li>2： NVR</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）</p><p>枚举值：</p><ul><li>1： IPC</li><li>2： NVR</li></ul>
     * @param Type <p>设备类型，1:IPC,2:NVR；（若设备接入协议选择RTMP，则设备类型只能选择IPC）</p><p>枚举值：</p><ul><li>1： IPC</li><li>2： NVR</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>设备所属组织ID，从查询组织接口DescribeOrganization中获取</p> 
     * @return OrganizationId <p>设备所属组织ID，从查询组织接口DescribeOrganization中获取</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>设备所属组织ID，从查询组织接口DescribeOrganization中获取</p>
     * @param OrganizationId <p>设备所属组织ID，从查询组织接口DescribeOrganization中获取</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>设备接入服务节点ID（从查询设备可用服务节点接口DescribeRegionDomain中获取的Value字段）</p> 
     * @return ClusterId <p>设备接入服务节点ID（从查询设备可用服务节点接口DescribeRegionDomain中获取的Value字段）</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>设备接入服务节点ID（从查询设备可用服务节点接口DescribeRegionDomain中获取的Value字段）</p>
     * @param ClusterId <p>设备接入服务节点ID（从查询设备可用服务节点接口DescribeRegionDomain中获取的Value字段）</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)</p> 
     * @return TransportProtocol <p>设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)</p>
     * @param TransportProtocol <p>设备流传输协议，1:UDP,2:TCP；(国标设备有效，不填写则默认UDP协议)</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>设备密码（国标设备必填，长度为1-64个字符）</p> 
     * @return Password <p>设备密码（国标设备必填，长度为1-64个字符）</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>设备密码（国标设备必填，长度为1-64个字符）</p>
     * @param Password <p>设备密码（国标设备必填，长度为1-64个字符）</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>设备描述，长度不超过128个字符</p> 
     * @return Description <p>设备描述，长度不超过128个字符</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>设备描述，长度不超过128个字符</p>
     * @param Description <p>设备描述，长度不超过128个字符</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>设备接入IP（已不再使用，保留用于兼容，可忽略）</p> 
     * @return Ip <p>设备接入IP（已不再使用，保留用于兼容，可忽略）</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>设备接入IP（已不再使用，保留用于兼容，可忽略）</p>
     * @param Ip <p>设备接入IP（已不再使用，保留用于兼容，可忽略）</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>设备端口（已不再使用，保留用于兼容，可忽略）</p><p>取值范围：[1, 65535]</p><p>单位： 端口</p> 
     * @return Port <p>设备端口（已不再使用，保留用于兼容，可忽略）</p><p>取值范围：[1, 65535]</p><p>单位： 端口</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>设备端口（已不再使用，保留用于兼容，可忽略）</p><p>取值范围：[1, 65535]</p><p>单位： 端口</p>
     * @param Port <p>设备端口（已不再使用，保留用于兼容，可忽略）</p><p>取值范围：[1, 65535]</p><p>单位： 端口</p>
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>设备用户名（已不再使用，保留用于兼容，可忽略）</p> 
     * @return Username <p>设备用户名（已不再使用，保留用于兼容，可忽略）</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>设备用户名（已不再使用，保留用于兼容，可忽略）</p>
     * @param Username <p>设备用户名（已不再使用，保留用于兼容，可忽略）</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>设备 SN（已不再使用，保留用于兼容，可忽略）</p> 
     * @return SNCode <p>设备 SN（已不再使用，保留用于兼容，可忽略）</p>
     */
    public String getSNCode() {
        return this.SNCode;
    }

    /**
     * Set <p>设备 SN（已不再使用，保留用于兼容，可忽略）</p>
     * @param SNCode <p>设备 SN（已不再使用，保留用于兼容，可忽略）</p>
     */
    public void setSNCode(String SNCode) {
        this.SNCode = SNCode;
    }

    /**
     * Get <p>RTMP推流地址自定义AppName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p> 
     * @return AppName <p>RTMP推流地址自定义AppName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>RTMP推流地址自定义AppName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
     * @param AppName <p>RTMP推流地址自定义AppName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>RTMP推流地址自定义StreamName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p> 
     * @return StreamName <p>RTMP推流地址自定义StreamName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>RTMP推流地址自定义StreamName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
     * @param StreamName <p>RTMP推流地址自定义StreamName（仅RTMP需要，支持英文、数字、_、-、.、长度不超过64位）</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
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
        if (source.SNCode != null) {
            this.SNCode = new String(source.SNCode);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
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
        this.setParamSimple(map, prefix + "SNCode", this.SNCode);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);

    }
}

