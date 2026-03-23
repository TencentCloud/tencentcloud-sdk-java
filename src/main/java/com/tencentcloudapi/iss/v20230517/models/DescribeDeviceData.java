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

public class DescribeDeviceData extends AbstractModel {

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
    * <p>设备接入协议，1:RTMP,2:GB,3:GW</p>
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
    * <p>设备接入服务节点id</p>
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
    * <p>sip服务ID</p>
    */
    @SerializedName("SipId")
    @Expose
    private String SipId;

    /**
    * <p>sip服务域</p>
    */
    @SerializedName("SipDomain")
    @Expose
    private String SipDomain;

    /**
    * <p>sip服务IP地址</p>
    */
    @SerializedName("SipIp")
    @Expose
    private String SipIp;

    /**
    * <p>sip服务端口</p>
    */
    @SerializedName("SipPort")
    @Expose
    private Long SipPort;

    /**
    * <p>Rtmp设备推流地址(仅rtmp设备有效)</p>
    */
    @SerializedName("PushStreamUrl")
    @Expose
    private String PushStreamUrl;

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
    private String OrganizationId;

    /**
    * <p>设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>设备所属网关名称</p>
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * <p>设备网关协议名称</p>
    */
    @SerializedName("ProtocolTypeName")
    @Expose
    private String ProtocolTypeName;

    /**
    * <p>网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）</p>
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
    * <p>设备地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>设备厂商</p>
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * <p>音频关开（0：关闭；1：开启）关闭时丢弃音频</p>
    */
    @SerializedName("AudioSwitch")
    @Expose
    private Long AudioSwitch;

    /**
    * <p>订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效</p>
    */
    @SerializedName("SubscribeSwitch")
    @Expose
    private Long SubscribeSwitch;

    /**
    * <p>RTMP推流地址自定义appName</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>RTMP推流地址自定义streamName</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * <p>是否开启静音帧（0：关闭；1 开启）</p>
    */
    @SerializedName("SilentFrameSwitch")
    @Expose
    private Long SilentFrameSwitch;

    /**
    * <p>Rtmp设备安全认证推流地址(仅rtmp设备有效)</p>
    */
    @SerializedName("PushStreamSecureUrl")
    @Expose
    private String PushStreamSecureUrl;

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
     * Get <p>设备接入协议，1:RTMP,2:GB,3:GW</p> 
     * @return AccessProtocol <p>设备接入协议，1:RTMP,2:GB,3:GW</p>
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set <p>设备接入协议，1:RTMP,2:GB,3:GW</p>
     * @param AccessProtocol <p>设备接入协议，1:RTMP,2:GB,3:GW</p>
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
     * Get <p>设备接入服务节点id</p> 
     * @return ClusterId <p>设备接入服务节点id</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>设备接入服务节点id</p>
     * @param ClusterId <p>设备接入服务节点id</p>
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
     * Get <p>sip服务ID</p> 
     * @return SipId <p>sip服务ID</p>
     */
    public String getSipId() {
        return this.SipId;
    }

    /**
     * Set <p>sip服务ID</p>
     * @param SipId <p>sip服务ID</p>
     */
    public void setSipId(String SipId) {
        this.SipId = SipId;
    }

    /**
     * Get <p>sip服务域</p> 
     * @return SipDomain <p>sip服务域</p>
     */
    public String getSipDomain() {
        return this.SipDomain;
    }

    /**
     * Set <p>sip服务域</p>
     * @param SipDomain <p>sip服务域</p>
     */
    public void setSipDomain(String SipDomain) {
        this.SipDomain = SipDomain;
    }

    /**
     * Get <p>sip服务IP地址</p> 
     * @return SipIp <p>sip服务IP地址</p>
     */
    public String getSipIp() {
        return this.SipIp;
    }

    /**
     * Set <p>sip服务IP地址</p>
     * @param SipIp <p>sip服务IP地址</p>
     */
    public void setSipIp(String SipIp) {
        this.SipIp = SipIp;
    }

    /**
     * Get <p>sip服务端口</p> 
     * @return SipPort <p>sip服务端口</p>
     */
    public Long getSipPort() {
        return this.SipPort;
    }

    /**
     * Set <p>sip服务端口</p>
     * @param SipPort <p>sip服务端口</p>
     */
    public void setSipPort(Long SipPort) {
        this.SipPort = SipPort;
    }

    /**
     * Get <p>Rtmp设备推流地址(仅rtmp设备有效)</p> 
     * @return PushStreamUrl <p>Rtmp设备推流地址(仅rtmp设备有效)</p>
     */
    public String getPushStreamUrl() {
        return this.PushStreamUrl;
    }

    /**
     * Set <p>Rtmp设备推流地址(仅rtmp设备有效)</p>
     * @param PushStreamUrl <p>Rtmp设备推流地址(仅rtmp设备有效)</p>
     */
    public void setPushStreamUrl(String PushStreamUrl) {
        this.PushStreamUrl = PushStreamUrl;
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
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>设备所属组织ID</p>
     * @param OrganizationId <p>设备所属组织ID</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）</p> 
     * @return GatewayId <p>设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）</p>
     * @param GatewayId <p>设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>设备所属网关名称</p> 
     * @return GatewayName <p>设备所属网关名称</p>
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set <p>设备所属网关名称</p>
     * @param GatewayName <p>设备所属网关名称</p>
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get <p>设备网关协议名称</p> 
     * @return ProtocolTypeName <p>设备网关协议名称</p>
     */
    public String getProtocolTypeName() {
        return this.ProtocolTypeName;
    }

    /**
     * Set <p>设备网关协议名称</p>
     * @param ProtocolTypeName <p>设备网关协议名称</p>
     */
    public void setProtocolTypeName(String ProtocolTypeName) {
        this.ProtocolTypeName = ProtocolTypeName;
    }

    /**
     * Get <p>网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）</p> 
     * @return ProtocolType <p>网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）</p>
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）</p>
     * @param ProtocolType <p>网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）</p>
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
     * Get <p>设备地域</p> 
     * @return Region <p>设备地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>设备地域</p>
     * @param Region <p>设备地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>设备厂商</p> 
     * @return Manufacturer <p>设备厂商</p>
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set <p>设备厂商</p>
     * @param Manufacturer <p>设备厂商</p>
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get <p>音频关开（0：关闭；1：开启）关闭时丢弃音频</p> 
     * @return AudioSwitch <p>音频关开（0：关闭；1：开启）关闭时丢弃音频</p>
     */
    public Long getAudioSwitch() {
        return this.AudioSwitch;
    }

    /**
     * Set <p>音频关开（0：关闭；1：开启）关闭时丢弃音频</p>
     * @param AudioSwitch <p>音频关开（0：关闭；1：开启）关闭时丢弃音频</p>
     */
    public void setAudioSwitch(Long AudioSwitch) {
        this.AudioSwitch = AudioSwitch;
    }

    /**
     * Get <p>订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效</p> 
     * @return SubscribeSwitch <p>订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效</p>
     */
    public Long getSubscribeSwitch() {
        return this.SubscribeSwitch;
    }

    /**
     * Set <p>订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效</p>
     * @param SubscribeSwitch <p>订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效</p>
     */
    public void setSubscribeSwitch(Long SubscribeSwitch) {
        this.SubscribeSwitch = SubscribeSwitch;
    }

    /**
     * Get <p>RTMP推流地址自定义appName</p> 
     * @return AppName <p>RTMP推流地址自定义appName</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>RTMP推流地址自定义appName</p>
     * @param AppName <p>RTMP推流地址自定义appName</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>RTMP推流地址自定义streamName</p> 
     * @return StreamName <p>RTMP推流地址自定义streamName</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>RTMP推流地址自定义streamName</p>
     * @param StreamName <p>RTMP推流地址自定义streamName</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get <p>是否开启静音帧（0：关闭；1 开启）</p> 
     * @return SilentFrameSwitch <p>是否开启静音帧（0：关闭；1 开启）</p>
     */
    public Long getSilentFrameSwitch() {
        return this.SilentFrameSwitch;
    }

    /**
     * Set <p>是否开启静音帧（0：关闭；1 开启）</p>
     * @param SilentFrameSwitch <p>是否开启静音帧（0：关闭；1 开启）</p>
     */
    public void setSilentFrameSwitch(Long SilentFrameSwitch) {
        this.SilentFrameSwitch = SilentFrameSwitch;
    }

    /**
     * Get <p>Rtmp设备安全认证推流地址(仅rtmp设备有效)</p> 
     * @return PushStreamSecureUrl <p>Rtmp设备安全认证推流地址(仅rtmp设备有效)</p>
     */
    public String getPushStreamSecureUrl() {
        return this.PushStreamSecureUrl;
    }

    /**
     * Set <p>Rtmp设备安全认证推流地址(仅rtmp设备有效)</p>
     * @param PushStreamSecureUrl <p>Rtmp设备安全认证推流地址(仅rtmp设备有效)</p>
     */
    public void setPushStreamSecureUrl(String PushStreamSecureUrl) {
        this.PushStreamSecureUrl = PushStreamSecureUrl;
    }

    public DescribeDeviceData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceData(DescribeDeviceData source) {
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
        if (source.SipId != null) {
            this.SipId = new String(source.SipId);
        }
        if (source.SipDomain != null) {
            this.SipDomain = new String(source.SipDomain);
        }
        if (source.SipIp != null) {
            this.SipIp = new String(source.SipIp);
        }
        if (source.SipPort != null) {
            this.SipPort = new Long(source.SipPort);
        }
        if (source.PushStreamUrl != null) {
            this.PushStreamUrl = new String(source.PushStreamUrl);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.ProtocolTypeName != null) {
            this.ProtocolTypeName = new String(source.ProtocolTypeName);
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.AudioSwitch != null) {
            this.AudioSwitch = new Long(source.AudioSwitch);
        }
        if (source.SubscribeSwitch != null) {
            this.SubscribeSwitch = new Long(source.SubscribeSwitch);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.SilentFrameSwitch != null) {
            this.SilentFrameSwitch = new Long(source.SilentFrameSwitch);
        }
        if (source.PushStreamSecureUrl != null) {
            this.PushStreamSecureUrl = new String(source.PushStreamSecureUrl);
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
        this.setParamSimple(map, prefix + "SipId", this.SipId);
        this.setParamSimple(map, prefix + "SipDomain", this.SipDomain);
        this.setParamSimple(map, prefix + "SipIp", this.SipIp);
        this.setParamSimple(map, prefix + "SipPort", this.SipPort);
        this.setParamSimple(map, prefix + "PushStreamUrl", this.PushStreamUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "ProtocolTypeName", this.ProtocolTypeName);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "AudioSwitch", this.AudioSwitch);
        this.setParamSimple(map, prefix + "SubscribeSwitch", this.SubscribeSwitch);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "SilentFrameSwitch", this.SilentFrameSwitch);
        this.setParamSimple(map, prefix + "PushStreamSecureUrl", this.PushStreamSecureUrl);

    }
}

