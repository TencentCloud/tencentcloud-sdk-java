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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo extends AbstractModel{

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 0: 离线, 1: 在线, 2: 获取失败, 3 未激活
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 设备密钥，密钥加密的设备返回
    */
    @SerializedName("DevicePsk")
    @Expose
    private String DevicePsk;

    /**
    * 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstOnlineTime")
    @Expose
    private Long FirstOnlineTime;

    /**
    * 最后一次上线时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoginTime")
    @Expose
    private Long LoginTime;

    /**
    * 设备创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 设备固件版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 设备证书
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * 日志级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogLevel")
    @Expose
    private Long LogLevel;

    /**
    * LoRaWAN 设备地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevAddr")
    @Expose
    private String DevAddr;

    /**
    * LoRaWAN 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * LoRaWAN 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevEUI")
    @Expose
    private String DevEUI;

    /**
    * LoRaWAN 应用会话密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppSKey")
    @Expose
    private String AppSKey;

    /**
    * LoRaWAN 网络会话密钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NwkSKey")
    @Expose
    private String NwkSKey;

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
     * Get 0: 离线, 1: 在线, 2: 获取失败, 3 未激活 
     * @return Status 0: 离线, 1: 在线, 2: 获取失败, 3 未激活
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0: 离线, 1: 在线, 2: 获取失败, 3 未激活
     * @param Status 0: 离线, 1: 在线, 2: 获取失败, 3 未激活
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 设备密钥，密钥加密的设备返回 
     * @return DevicePsk 设备密钥，密钥加密的设备返回
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * Set 设备密钥，密钥加密的设备返回
     * @param DevicePsk 设备密钥，密钥加密的设备返回
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * Get 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstOnlineTime 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstOnlineTime() {
        return this.FirstOnlineTime;
    }

    /**
     * Set 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstOnlineTime 首次上线时间
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstOnlineTime(Long FirstOnlineTime) {
        this.FirstOnlineTime = FirstOnlineTime;
    }

    /**
     * Get 最后一次上线时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoginTime 最后一次上线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoginTime() {
        return this.LoginTime;
    }

    /**
     * Set 最后一次上线时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoginTime 最后一次上线时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoginTime(Long LoginTime) {
        this.LoginTime = LoginTime;
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
     * Get 设备固件版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 设备固件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 设备固件版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 设备固件版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 设备证书
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeviceCert 设备证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * Set 设备证书
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeviceCert 设备证书
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * Get 日志级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogLevel 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogLevel 日志级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogLevel(Long LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get LoRaWAN 设备地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevAddr LoRaWAN 设备地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevAddr() {
        return this.DevAddr;
    }

    /**
     * Set LoRaWAN 设备地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevAddr LoRaWAN 设备地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevAddr(String DevAddr) {
        this.DevAddr = DevAddr;
    }

    /**
     * Get LoRaWAN 应用密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppKey LoRaWAN 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * Set LoRaWAN 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppKey LoRaWAN 应用密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * Get LoRaWAN 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevEUI LoRaWAN 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDevEUI() {
        return this.DevEUI;
    }

    /**
     * Set LoRaWAN 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevEUI LoRaWAN 设备唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevEUI(String DevEUI) {
        this.DevEUI = DevEUI;
    }

    /**
     * Get LoRaWAN 应用会话密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppSKey LoRaWAN 应用会话密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppSKey() {
        return this.AppSKey;
    }

    /**
     * Set LoRaWAN 应用会话密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppSKey LoRaWAN 应用会话密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppSKey(String AppSKey) {
        this.AppSKey = AppSKey;
    }

    /**
     * Get LoRaWAN 网络会话密钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NwkSKey LoRaWAN 网络会话密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNwkSKey() {
        return this.NwkSKey;
    }

    /**
     * Set LoRaWAN 网络会话密钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param NwkSKey LoRaWAN 网络会话密钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNwkSKey(String NwkSKey) {
        this.NwkSKey = NwkSKey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamSimple(map, prefix + "FirstOnlineTime", this.FirstOnlineTime);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "DevAddr", this.DevAddr);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "DevEUI", this.DevEUI);
        this.setParamSimple(map, prefix + "AppSKey", this.AppSKey);
        this.setParamSimple(map, prefix + "NwkSKey", this.NwkSKey);

    }
}

