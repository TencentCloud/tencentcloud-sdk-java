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
package com.tencentcloudapi.iotcloud.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceResponse extends AbstractModel {

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备是否在线，0不在线，1在线，3未激活
    */
    @SerializedName("Online")
    @Expose
    private Long Online;

    /**
    * 设备登录时间
    */
    @SerializedName("LoginTime")
    @Expose
    private Long LoginTime;

    /**
    * 设备固件版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 设备最后更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Long LastUpdateTime;

    /**
    * 设备证书
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * 设备密钥
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * 设备属性
    */
    @SerializedName("Tags")
    @Expose
    private DeviceTag [] Tags;

    /**
    * 设备类型
    */
    @SerializedName("DeviceType")
    @Expose
    private Long DeviceType;

    /**
    * 国际移动设备识别码 IMEI
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 运营商类型
    */
    @SerializedName("Isp")
    @Expose
    private Long Isp;

    /**
    * IP地址
    */
    @SerializedName("ConnIP")
    @Expose
    private Long ConnIP;

    /**
    * NB IoT运营商处的DeviceID
    */
    @SerializedName("NbiotDeviceID")
    @Expose
    private String NbiotDeviceID;

    /**
    * Lora设备的dev eui
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
    * Lora设备的mote type
    */
    @SerializedName("LoraMoteType")
    @Expose
    private Long LoraMoteType;

    /**
    * 设备的sdk日志等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
    * 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstOnlineTime")
    @Expose
    private Long FirstOnlineTime;

    /**
    * 最近下线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOfflineTime")
    @Expose
    private Long LastOfflineTime;

    /**
    * 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 设备证书获取状态，0 未获取过设备密钥, 1 已获取过设备密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertState")
    @Expose
    private Long CertState;

    /**
    * 设备启用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableState")
    @Expose
    private Long EnableState;

    /**
    * 设备标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private DeviceLabel [] Labels;

    /**
    * MQTT客户端IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientIP")
    @Expose
    private String ClientIP;

    /**
    * 设备固件更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirmwareUpdateTime")
    @Expose
    private Long FirmwareUpdateTime;

    /**
    * 创建者账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserId")
    @Expose
    private Long CreateUserId;

    /**
    * NB IoT运营商处的DeviceID
    */
    @SerializedName("NBIoTDeviceID")
    @Expose
    private String NBIoTDeviceID;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 设备名 
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 设备是否在线，0不在线，1在线，3未激活 
     * @return Online 设备是否在线，0不在线，1在线，3未激活
     */
    public Long getOnline() {
        return this.Online;
    }

    /**
     * Set 设备是否在线，0不在线，1在线，3未激活
     * @param Online 设备是否在线，0不在线，1在线，3未激活
     */
    public void setOnline(Long Online) {
        this.Online = Online;
    }

    /**
     * Get 设备登录时间 
     * @return LoginTime 设备登录时间
     */
    public Long getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set 设备登录时间
     * @param LoginTime 设备登录时间
     */
    public void setLoginTime(Long LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * Get 设备固件版本 
     * @return Version 设备固件版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 设备固件版本
     * @param Version 设备固件版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 设备最后更新时间 
     * @return LastUpdateTime 设备最后更新时间
     */
    public Long getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 设备最后更新时间
     * @param LastUpdateTime 设备最后更新时间
     */
    public void setLastUpdateTime(Long LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * Get 设备证书 
     * @return DeviceCert 设备证书
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * Set 设备证书
     * @param DeviceCert 设备证书
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * Get 设备密钥 
     * @return DevicePsk 设备密钥
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set 设备密钥
     * @param DevicePsk 设备密钥
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * Get 设备属性 
     * @return Tags 设备属性
     */
    public DeviceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 设备属性
     * @param Tags 设备属性
     */
    public void setTags(DeviceTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 设备类型 
     * @return DeviceType 设备类型
     */
    public Long getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(Long DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 国际移动设备识别码 IMEI 
     * @return Imei 国际移动设备识别码 IMEI
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 国际移动设备识别码 IMEI
     * @param Imei 国际移动设备识别码 IMEI
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get 运营商类型 
     * @return Isp 运营商类型
     */
    public Long getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商类型
     * @param Isp 运营商类型
     */
    public void setIsp(Long Isp) {
        this.Isp = Isp;
    }

    /**
     * Get IP地址 
     * @return ConnIP IP地址
     */
    public Long getConnIP() {
        return this.ConnIP;
    }

    /**
     * Set IP地址
     * @param ConnIP IP地址
     */
    public void setConnIP(Long ConnIP) {
        this.ConnIP = ConnIP;
    }

    /**
     * Get NB IoT运营商处的DeviceID 
     * @return NbiotDeviceID NB IoT运营商处的DeviceID
     * @deprecated
     */
    @Deprecated
    public String getNbiotDeviceID() {
        return this.NbiotDeviceID;
    }

    /**
     * Set NB IoT运营商处的DeviceID
     * @param NbiotDeviceID NB IoT运营商处的DeviceID
     * @deprecated
     */
    @Deprecated
    public void setNbiotDeviceID(String NbiotDeviceID) {
        this.NbiotDeviceID = NbiotDeviceID;
    }

    /**
     * Get Lora设备的dev eui 
     * @return LoraDevEui Lora设备的dev eui
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * Set Lora设备的dev eui
     * @param LoraDevEui Lora设备的dev eui
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * Get Lora设备的mote type 
     * @return LoraMoteType Lora设备的mote type
     */
    public Long getLoraMoteType() {
        return this.LoraMoteType;
    }

    /**
     * Set Lora设备的mote type
     * @param LoraMoteType Lora设备的mote type
     */
    public void setLoraMoteType(Long LoraMoteType) {
        this.LoraMoteType = LoraMoteType;
    }

    /**
     * Get 设备的sdk日志等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogLevel 设备的sdk日志等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 设备的sdk日志等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogLevel 设备的sdk日志等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstOnlineTime 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstOnlineTime() {
        return this.FirstOnlineTime;
    }

    /**
     * Set 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstOnlineTime 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstOnlineTime(Long FirstOnlineTime) {
        this.FirstOnlineTime = FirstOnlineTime;
    }

    /**
     * Get 最近下线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOfflineTime 最近下线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastOfflineTime() {
        return this.LastOfflineTime;
    }

    /**
     * Set 最近下线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOfflineTime 最近下线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOfflineTime(Long LastOfflineTime) {
        this.LastOfflineTime = LastOfflineTime;
    }

    /**
     * Get 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 设备证书获取状态，0 未获取过设备密钥, 1 已获取过设备密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertState 设备证书获取状态，0 未获取过设备密钥, 1 已获取过设备密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCertState() {
        return this.CertState;
    }

    /**
     * Set 设备证书获取状态，0 未获取过设备密钥, 1 已获取过设备密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertState 设备证书获取状态，0 未获取过设备密钥, 1 已获取过设备密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertState(Long CertState) {
        this.CertState = CertState;
    }

    /**
     * Get 设备启用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableState 设备启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableState() {
        return this.EnableState;
    }

    /**
     * Set 设备启用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableState 设备启用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableState(Long EnableState) {
        this.EnableState = EnableState;
    }

    /**
     * Get 设备标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 设备标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceLabel [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 设备标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 设备标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(DeviceLabel [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get MQTT客户端IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientIP MQTT客户端IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientIP() {
        return this.ClientIP;
    }

    /**
     * Set MQTT客户端IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientIP MQTT客户端IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientIP(String ClientIP) {
        this.ClientIP = ClientIP;
    }

    /**
     * Get 设备固件更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirmwareUpdateTime 设备固件更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirmwareUpdateTime() {
        return this.FirmwareUpdateTime;
    }

    /**
     * Set 设备固件更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirmwareUpdateTime 设备固件更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirmwareUpdateTime(Long FirmwareUpdateTime) {
        this.FirmwareUpdateTime = FirmwareUpdateTime;
    }

    /**
     * Get 创建者账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserId 创建者账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建者账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserId 创建者账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserId(Long CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get NB IoT运营商处的DeviceID 
     * @return NBIoTDeviceID NB IoT运营商处的DeviceID
     */
    public String getNBIoTDeviceID() {
        return this.NBIoTDeviceID;
    }

    /**
     * Set NB IoT运营商处的DeviceID
     * @param NBIoTDeviceID NB IoT运营商处的DeviceID
     */
    public void setNBIoTDeviceID(String NBIoTDeviceID) {
        this.NBIoTDeviceID = NBIoTDeviceID;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDeviceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceResponse(DescribeDeviceResponse source) {
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Online != null) {
            this.Online = new Long(source.Online);
        }
        if (source.LoginTime != null) {
            this.LoginTime = new Long(source.LoginTime);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new Long(source.LastUpdateTime);
        }
        if (source.DeviceCert != null) {
            this.DeviceCert = new String(source.DeviceCert);
        }
        if (source.DevicePsk != null) {
            this.DevicePsk = new String(source.DevicePsk);
        }
        if (source.Tags != null) {
            this.Tags = new DeviceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new DeviceTag(source.Tags[i]);
            }
        }
        if (source.DeviceType != null) {
            this.DeviceType = new Long(source.DeviceType);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.Isp != null) {
            this.Isp = new Long(source.Isp);
        }
        if (source.ConnIP != null) {
            this.ConnIP = new Long(source.ConnIP);
        }
        if (source.NbiotDeviceID != null) {
            this.NbiotDeviceID = new String(source.NbiotDeviceID);
        }
        if (source.LoraDevEui != null) {
            this.LoraDevEui = new String(source.LoraDevEui);
        }
        if (source.LoraMoteType != null) {
            this.LoraMoteType = new Long(source.LoraMoteType);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new Long(source.LogLevel);
        }
        if (source.FirstOnlineTime != null) {
            this.FirstOnlineTime = new Long(source.FirstOnlineTime);
        }
        if (source.LastOfflineTime != null) {
            this.LastOfflineTime = new Long(source.LastOfflineTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.CertState != null) {
            this.CertState = new Long(source.CertState);
        }
        if (source.EnableState != null) {
            this.EnableState = new Long(source.EnableState);
        }
        if (source.Labels != null) {
            this.Labels = new DeviceLabel[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new DeviceLabel(source.Labels[i]);
            }
        }
        if (source.ClientIP != null) {
            this.ClientIP = new String(source.ClientIP);
        }
        if (source.FirmwareUpdateTime != null) {
            this.FirmwareUpdateTime = new Long(source.FirmwareUpdateTime);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new Long(source.CreateUserId);
        }
        if (source.NBIoTDeviceID != null) {
            this.NBIoTDeviceID = new String(source.NBIoTDeviceID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "ConnIP", this.ConnIP);
        this.setParamSimple(map, prefix + "NbiotDeviceID", this.NbiotDeviceID);
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);
        this.setParamSimple(map, prefix + "LoraMoteType", this.LoraMoteType);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "FirstOnlineTime", this.FirstOnlineTime);
        this.setParamSimple(map, prefix + "LastOfflineTime", this.LastOfflineTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CertState", this.CertState);
        this.setParamSimple(map, prefix + "EnableState", this.EnableState);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "ClientIP", this.ClientIP);
        this.setParamSimple(map, prefix + "FirmwareUpdateTime", this.FirmwareUpdateTime);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "NBIoTDeviceID", this.NBIoTDeviceID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

