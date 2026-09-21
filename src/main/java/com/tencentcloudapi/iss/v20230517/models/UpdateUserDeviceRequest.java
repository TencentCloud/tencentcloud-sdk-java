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

public class UpdateUserDeviceRequest extends AbstractModel {

    /**
    * <p>设备ID（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>设备名称（仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位）</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）</p>
    */
    @SerializedName("TransportProtocol")
    @Expose
    private Long TransportProtocol;

    /**
    * <p>设备密码（仅国标设备支持，长度不超过 64 位）</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>设备描述（长度不超过128位）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>设备接入IP（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>设备Port（已不再使用，保留用于兼容，可忽略）</p>
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
    * <p>网关设备接入协议（已不再使用，保留用于兼容，可忽略）</p>
    */
    @SerializedName("ProtocolType")
    @Expose
    private Long ProtocolType;

    /**
    * <p>音频关开（0：关闭；1：开启）默认开启，关闭时丢弃音频</p>
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
    * <p>是否开启静音帧（0：关闭；1 开启）</p>
    */
    @SerializedName("SilentFrameSwitch")
    @Expose
    private Long SilentFrameSwitch;

    /**
    * <p>时钟同步开关（仅国标设备生效）</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值： 1</p>
    */
    @SerializedName("TimeSyncSwitch")
    @Expose
    private Long TimeSyncSwitch;

    /**
     * Get <p>设备ID（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p> 
     * @return DeviceId <p>设备ID（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
     * @param DeviceId <p>设备ID（从获取设备列表接口ListDevices中获取）</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/1344/95871">ListDevices</a></p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>设备名称（仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位）</p> 
     * @return Name <p>设备名称（仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位）</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>设备名称（仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位）</p>
     * @param Name <p>设备名称（仅支持中文、英文、数字、空格、中英文括号、_、-, 长度不超过128位）</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）</p> 
     * @return TransportProtocol <p>设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）</p>
     */
    public Long getTransportProtocol() {
        return this.TransportProtocol;
    }

    /**
     * Set <p>设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）</p>
     * @param TransportProtocol <p>设备流传输协议，仅国标设备有效，填0则不做更改（1:UDP,2:TCP）</p>
     */
    public void setTransportProtocol(Long TransportProtocol) {
        this.TransportProtocol = TransportProtocol;
    }

    /**
     * Get <p>设备密码（仅国标设备支持，长度不超过 64 位）</p> 
     * @return Password <p>设备密码（仅国标设备支持，长度不超过 64 位）</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>设备密码（仅国标设备支持，长度不超过 64 位）</p>
     * @param Password <p>设备密码（仅国标设备支持，长度不超过 64 位）</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>设备描述（长度不超过128位）</p> 
     * @return Description <p>设备描述（长度不超过128位）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>设备描述（长度不超过128位）</p>
     * @param Description <p>设备描述（长度不超过128位）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>设备Port（已不再使用，保留用于兼容，可忽略）</p> 
     * @return Port <p>设备Port（已不再使用，保留用于兼容，可忽略）</p>
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>设备Port（已不再使用，保留用于兼容，可忽略）</p>
     * @param Port <p>设备Port（已不再使用，保留用于兼容，可忽略）</p>
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
     * Get <p>网关设备接入协议（已不再使用，保留用于兼容，可忽略）</p> 
     * @return ProtocolType <p>网关设备接入协议（已不再使用，保留用于兼容，可忽略）</p>
     */
    public Long getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set <p>网关设备接入协议（已不再使用，保留用于兼容，可忽略）</p>
     * @param ProtocolType <p>网关设备接入协议（已不再使用，保留用于兼容，可忽略）</p>
     */
    public void setProtocolType(Long ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get <p>音频关开（0：关闭；1：开启）默认开启，关闭时丢弃音频</p> 
     * @return AudioSwitch <p>音频关开（0：关闭；1：开启）默认开启，关闭时丢弃音频</p>
     */
    public Long getAudioSwitch() {
        return this.AudioSwitch;
    }

    /**
     * Set <p>音频关开（0：关闭；1：开启）默认开启，关闭时丢弃音频</p>
     * @param AudioSwitch <p>音频关开（0：关闭；1：开启）默认开启，关闭时丢弃音频</p>
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
     * Get <p>时钟同步开关（仅国标设备生效）</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值： 1</p> 
     * @return TimeSyncSwitch <p>时钟同步开关（仅国标设备生效）</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值： 1</p>
     */
    public Long getTimeSyncSwitch() {
        return this.TimeSyncSwitch;
    }

    /**
     * Set <p>时钟同步开关（仅国标设备生效）</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值： 1</p>
     * @param TimeSyncSwitch <p>时钟同步开关（仅国标设备生效）</p><p>枚举值：</p><ul><li>0： 关闭</li><li>1： 开启</li></ul><p>默认值： 1</p>
     */
    public void setTimeSyncSwitch(Long TimeSyncSwitch) {
        this.TimeSyncSwitch = TimeSyncSwitch;
    }

    public UpdateUserDeviceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateUserDeviceRequest(UpdateUserDeviceRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new Long(source.ProtocolType);
        }
        if (source.AudioSwitch != null) {
            this.AudioSwitch = new Long(source.AudioSwitch);
        }
        if (source.SubscribeSwitch != null) {
            this.SubscribeSwitch = new Long(source.SubscribeSwitch);
        }
        if (source.SilentFrameSwitch != null) {
            this.SilentFrameSwitch = new Long(source.SilentFrameSwitch);
        }
        if (source.TimeSyncSwitch != null) {
            this.TimeSyncSwitch = new Long(source.TimeSyncSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TransportProtocol", this.TransportProtocol);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AudioSwitch", this.AudioSwitch);
        this.setParamSimple(map, prefix + "SubscribeSwitch", this.SubscribeSwitch);
        this.setParamSimple(map, prefix + "SilentFrameSwitch", this.SilentFrameSwitch);
        this.setParamSimple(map, prefix + "TimeSyncSwitch", this.TimeSyncSwitch);

    }
}

