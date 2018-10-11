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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceInfo  extends AbstractModel{

    /**
    * 设备名
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 设备是否在线，0不在线，1在线
    */
    @SerializedName("Online")
    @Expose
    private Integer Online;

    /**
    * 设备登陆时间
    */
    @SerializedName("LoginTime")
    @Expose
    private Integer LoginTime;

    /**
    * 设备版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 设备证书，证书加密的设备返回
    */
    @SerializedName("DeviceCert")
    @Expose
    private String DeviceCert;

    /**
    * 设备密钥，密钥加密的设备返回
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
    private Integer DeviceType;

    /**
    * IMEI
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * 运营商类型
    */
    @SerializedName("Isp")
    @Expose
    private Integer Isp;

    /**
    * NB IOT运营商处的DeviceID
    */
    @SerializedName("NbiotDeviceID")
    @Expose
    private String NbiotDeviceID;

    /**
    * IP地址
    */
    @SerializedName("ConnIP")
    @Expose
    private Long ConnIP;

    /**
    * 设备最后更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private Integer LastUpdateTime;

    /**
    * LoRa设备的dev eui
    */
    @SerializedName("LoraDevEui")
    @Expose
    private String LoraDevEui;

    /**
     * 获取设备名
     * @return DeviceName 设备名
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名
     * @param DeviceName 设备名
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取设备是否在线，0不在线，1在线
     * @return Online 设备是否在线，0不在线，1在线
     */
    public Integer getOnline() {
        return this.Online;
    }

    /**
     * 设置设备是否在线，0不在线，1在线
     * @param Online 设备是否在线，0不在线，1在线
     */
    public void setOnline(Integer Online) {
        this.Online = Online;
    }

    /**
     * 获取设备登陆时间
     * @return LoginTime 设备登陆时间
     */
    public Integer getLoginTime() {
        return this.LoginTime;
    }

    /**
     * 设置设备登陆时间
     * @param LoginTime 设备登陆时间
     */
    public void setLoginTime(Integer LoginTime) {
        this.LoginTime = LoginTime;
    }

    /**
     * 获取设备版本
     * @return Version 设备版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * 设置设备版本
     * @param Version 设备版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * 获取设备证书，证书加密的设备返回
     * @return DeviceCert 设备证书，证书加密的设备返回
     */
    public String getDeviceCert() {
        return this.DeviceCert;
    }

    /**
     * 设置设备证书，证书加密的设备返回
     * @param DeviceCert 设备证书，证书加密的设备返回
     */
    public void setDeviceCert(String DeviceCert) {
        this.DeviceCert = DeviceCert;
    }

    /**
     * 获取设备密钥，密钥加密的设备返回
     * @return DevicePsk 设备密钥，密钥加密的设备返回
     */
    public String getDevicePsk() {
        return this.DevicePsk;
    }

    /**
     * 设置设备密钥，密钥加密的设备返回
     * @param DevicePsk 设备密钥，密钥加密的设备返回
     */
    public void setDevicePsk(String DevicePsk) {
        this.DevicePsk = DevicePsk;
    }

    /**
     * 获取设备属性
     * @return Tags 设备属性
     */
    public DeviceTag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置设备属性
     * @param Tags 设备属性
     */
    public void setTags(DeviceTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取设备类型
     * @return DeviceType 设备类型
     */
    public Integer getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置设备类型
     * @param DeviceType 设备类型
     */
    public void setDeviceType(Integer DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取IMEI
     * @return Imei IMEI
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * 设置IMEI
     * @param Imei IMEI
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * 获取运营商类型
     * @return Isp 运营商类型
     */
    public Integer getIsp() {
        return this.Isp;
    }

    /**
     * 设置运营商类型
     * @param Isp 运营商类型
     */
    public void setIsp(Integer Isp) {
        this.Isp = Isp;
    }

    /**
     * 获取NB IOT运营商处的DeviceID
     * @return NbiotDeviceID NB IOT运营商处的DeviceID
     */
    public String getNbiotDeviceID() {
        return this.NbiotDeviceID;
    }

    /**
     * 设置NB IOT运营商处的DeviceID
     * @param NbiotDeviceID NB IOT运营商处的DeviceID
     */
    public void setNbiotDeviceID(String NbiotDeviceID) {
        this.NbiotDeviceID = NbiotDeviceID;
    }

    /**
     * 获取IP地址
     * @return ConnIP IP地址
     */
    public Long getConnIP() {
        return this.ConnIP;
    }

    /**
     * 设置IP地址
     * @param ConnIP IP地址
     */
    public void setConnIP(Long ConnIP) {
        this.ConnIP = ConnIP;
    }

    /**
     * 获取设备最后更新时间
     * @return LastUpdateTime 设备最后更新时间
     */
    public Integer getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * 设置设备最后更新时间
     * @param LastUpdateTime 设备最后更新时间
     */
    public void setLastUpdateTime(Integer LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    /**
     * 获取LoRa设备的dev eui
     * @return LoraDevEui LoRa设备的dev eui
     */
    public String getLoraDevEui() {
        return this.LoraDevEui;
    }

    /**
     * 设置LoRa设备的dev eui
     * @param LoraDevEui LoRa设备的dev eui
     */
    public void setLoraDevEui(String LoraDevEui) {
        this.LoraDevEui = LoraDevEui;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Online", this.Online);
        this.setParamSimple(map, prefix + "LoginTime", this.LoginTime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "DeviceCert", this.DeviceCert);
        this.setParamSimple(map, prefix + "DevicePsk", this.DevicePsk);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "NbiotDeviceID", this.NbiotDeviceID);
        this.setParamSimple(map, prefix + "ConnIP", this.ConnIP);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);
        this.setParamSimple(map, prefix + "LoraDevEui", this.LoraDevEui);

    }
}

