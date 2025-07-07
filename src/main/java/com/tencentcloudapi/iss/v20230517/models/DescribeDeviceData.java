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
    * 设备ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 设备名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 设备接入协议，1:RTMP,2:GB,3:GW 
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * 设备类型，1:IPC,2:NVR
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备接入服务节点id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 设备接入服务节点名称

    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 设备流传输协议，1:UDP,2:TCP 
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * 设备密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 设备描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * sip服务ID
    */
    @SerializedName("SipId")
    @Expose
    private String SipId;

    /**
    * sip服务域
    */
    @SerializedName("SipDomain")
    @Expose
    private String SipDomain;

    /**
    * sip服务IP地址
    */
    @SerializedName("SipIp")
    @Expose
    private String SipIp;

    /**
    * sip服务端口
    */
    @SerializedName("SipPort")
    @Expose
    private Long SipPort;

    /**
    * Rtmp设备推流地址(仅rtmp设备有效)
    */
    @SerializedName("PushStreamUrl")
    @Expose
    private String PushStreamUrl;

    /**
    * 设备状态，0:未注册,1:在线,2:离线,3:禁用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备所属组织ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 设备所属网关名称
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 设备网关协议名称
    */
    @SerializedName("ProtocolTypeName")
    @Expose
    private String ProtocolTypeName;

    /**
    * 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * 设备接入IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 设备Port
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 设备用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 设备地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 设备厂商
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 音频关开（0：关闭；1：开启）关闭时丢弃音频	
    */
    @SerializedName("AudioSwitch")
    @Expose
    private Long AudioSwitch;

    /**
    * 订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效	
    */
    @SerializedName("SubscribeSwitch")
    @Expose
    private Long SubscribeSwitch;

    /**
    * RTMP推流地址自定义appName
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * RTMP推流地址自定义streamName
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 是否开启静音帧（0：关闭；1 开启）
    */
    @SerializedName("SilentFrameSwitch")
    @Expose
    private Long SilentFrameSwitch;

    /**
     * Get 设备ID 
     * @return DeviceId 设备ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID
     * @param DeviceId 设备ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码） 
     * @return Code 设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）
     * @param Code 设备编码（国标设备即我们为设备生成的20位国标编码，rtmp 设备为10 位设备编码）
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 设备名称 
     * @return Name 设备名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 设备名称
     * @param Name 设备名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 设备接入协议，1:RTMP,2:GB,3:GW  
     * @return AccessProtocol 设备接入协议，1:RTMP,2:GB,3:GW 
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set 设备接入协议，1:RTMP,2:GB,3:GW 
     * @param AccessProtocol 设备接入协议，1:RTMP,2:GB,3:GW 
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get 设备类型，1:IPC,2:NVR 
     * @return Type 设备类型，1:IPC,2:NVR
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型，1:IPC,2:NVR
     * @param Type 设备类型，1:IPC,2:NVR
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备接入服务节点id 
     * @return ClusterId 设备接入服务节点id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 设备接入服务节点id
     * @param ClusterId 设备接入服务节点id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 设备接入服务节点名称
 
     * @return ClusterName 设备接入服务节点名称

     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 设备接入服务节点名称

     * @param ClusterName 设备接入服务节点名称

     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 设备流传输协议，1:UDP,2:TCP  
     * @return TransportProtocol 设备流传输协议，1:UDP,2:TCP 
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set 设备流传输协议，1:UDP,2:TCP 
     * @param TransportProtocol 设备流传输协议，1:UDP,2:TCP 
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get 设备密码 
     * @return Password 设备密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 设备密码
     * @param Password 设备密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 设备描述 
     * @return Description 设备描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 设备描述
     * @param Description 设备描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get sip服务ID 
     * @return SipId sip服务ID
     */
    public String getSipId() {
        return this.SipId;
    }

    /**
     * Set sip服务ID
     * @param SipId sip服务ID
     */
    public void setSipId(String SipId) {
        this.SipId = SipId;
    }

    /**
     * Get sip服务域 
     * @return SipDomain sip服务域
     */
    public String getSipDomain() {
        return this.SipDomain;
    }

    /**
     * Set sip服务域
     * @param SipDomain sip服务域
     */
    public void setSipDomain(String SipDomain) {
        this.SipDomain = SipDomain;
    }

    /**
     * Get sip服务IP地址 
     * @return SipIp sip服务IP地址
     */
    public String getSipIp() {
        return this.SipIp;
    }

    /**
     * Set sip服务IP地址
     * @param SipIp sip服务IP地址
     */
    public void setSipIp(String SipIp) {
        this.SipIp = SipIp;
    }

    /**
     * Get sip服务端口 
     * @return SipPort sip服务端口
     */
    public Long getSipPort() {
        return this.SipPort;
    }

    /**
     * Set sip服务端口
     * @param SipPort sip服务端口
     */
    public void setSipPort(Long SipPort) {
        this.SipPort = SipPort;
    }

    /**
     * Get Rtmp设备推流地址(仅rtmp设备有效) 
     * @return PushStreamUrl Rtmp设备推流地址(仅rtmp设备有效)
     */
    public String getPushStreamUrl() {
        return this.PushStreamUrl;
    }

    /**
     * Set Rtmp设备推流地址(仅rtmp设备有效)
     * @param PushStreamUrl Rtmp设备推流地址(仅rtmp设备有效)
     */
    public void setPushStreamUrl(String PushStreamUrl) {
        this.PushStreamUrl = PushStreamUrl;
    }

    /**
     * Get 设备状态，0:未注册,1:在线,2:离线,3:禁用 
     * @return Status 设备状态，0:未注册,1:在线,2:离线,3:禁用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态，0:未注册,1:在线,2:离线,3:禁用
     * @param Status 设备状态，0:未注册,1:在线,2:离线,3:禁用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备所属组织ID 
     * @return OrganizationId 设备所属组织ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 设备所属组织ID
     * @param OrganizationId 设备所属组织ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要） 
     * @return GatewayId 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
     * @param GatewayId 设备接入网关ID，从查询网关列表接口中获取（仅网关接入需要）
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 设备所属网关名称 
     * @return GatewayName 设备所属网关名称
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 设备所属网关名称
     * @param GatewayName 设备所属网关名称
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 设备网关协议名称 
     * @return ProtocolTypeName 设备网关协议名称
     */
    public String getProtocolTypeName() {
        return this.ProtocolTypeName;
    }

    /**
     * Set 设备网关协议名称
     * @param ProtocolTypeName 设备网关协议名称
     */
    public void setProtocolTypeName(String ProtocolTypeName) {
        this.ProtocolTypeName = ProtocolTypeName;
    }

    /**
     * Get 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要） 
     * @return ProtocolType 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
     * @param ProtocolType 网关接入协议类型，1.海康SDK，2.大华SDK，3.宇视SDK，4.Onvif（仅网关接入需要）
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 设备接入IP 
     * @return Ip 设备接入IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 设备接入IP
     * @param Ip 设备接入IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 设备Port 
     * @return Port 设备Port
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 设备Port
     * @param Port 设备Port
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 设备用户名 
     * @return Username 设备用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 设备用户名
     * @param Username 设备用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 设备地域 
     * @return Region 设备地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 设备地域
     * @param Region 设备地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 设备厂商 
     * @return Manufacturer 设备厂商
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 设备厂商
     * @param Manufacturer 设备厂商
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 音频关开（0：关闭；1：开启）关闭时丢弃音频	 
     * @return AudioSwitch 音频关开（0：关闭；1：开启）关闭时丢弃音频	
     */
    public Long getAudioSwitch() {
        return this.AudioSwitch;
    }

    /**
     * Set 音频关开（0：关闭；1：开启）关闭时丢弃音频	
     * @param AudioSwitch 音频关开（0：关闭；1：开启）关闭时丢弃音频	
     */
    public void setAudioSwitch(Long AudioSwitch) {
        this.AudioSwitch = AudioSwitch;
    }

    /**
     * Get 订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效	 
     * @return SubscribeSwitch 订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效	
     */
    public Long getSubscribeSwitch() {
        return this.SubscribeSwitch;
    }

    /**
     * Set 订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效	
     * @param SubscribeSwitch 订阅开关（0：关闭；1：开启）默认开启，开启状态下会订阅设备通道变化，仅国标NVR设备有效	
     */
    public void setSubscribeSwitch(Long SubscribeSwitch) {
        this.SubscribeSwitch = SubscribeSwitch;
    }

    /**
     * Get RTMP推流地址自定义appName 
     * @return AppName RTMP推流地址自定义appName
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set RTMP推流地址自定义appName
     * @param AppName RTMP推流地址自定义appName
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get RTMP推流地址自定义streamName 
     * @return StreamName RTMP推流地址自定义streamName
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set RTMP推流地址自定义streamName
     * @param StreamName RTMP推流地址自定义streamName
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 是否开启静音帧（0：关闭；1 开启） 
     * @return SilentFrameSwitch 是否开启静音帧（0：关闭；1 开启）
     */
    public Long getSilentFrameSwitch() {
        return this.SilentFrameSwitch;
    }

    /**
     * Set 是否开启静音帧（0：关闭；1 开启）
     * @param SilentFrameSwitch 是否开启静音帧（0：关闭；1 开启）
     */
    public void setSilentFrameSwitch(Long SilentFrameSwitch) {
        this.SilentFrameSwitch = SilentFrameSwitch;
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

    }
}

