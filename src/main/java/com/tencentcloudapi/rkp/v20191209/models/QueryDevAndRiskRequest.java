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
package com.tencentcloudapi.rkp.v20191209.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryDevAndRiskRequest extends AbstractModel{

    /**
    * 设备类型 0表示Android， 1表示IOS
    */
    @SerializedName("DevType")
    @Expose
    private Long DevType;

    /**
    * Android Imei号
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * Mac地址
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * android  Aid
    */
    @SerializedName("Aid")
    @Expose
    private String Aid;

    /**
    * Android Cid
    */
    @SerializedName("Cid")
    @Expose
    private String Cid;

    /**
    * 手机Imsi
    */
    @SerializedName("Imsi")
    @Expose
    private String Imsi;

    /**
    * Df 磁盘分区信息
    */
    @SerializedName("Df")
    @Expose
    private String Df;

    /**
    * 内核版本
    */
    @SerializedName("KernelVer")
    @Expose
    private String KernelVer;

    /**
    * 存储大小
    */
    @SerializedName("Storage")
    @Expose
    private String Storage;

    /**
    * 设备驱动指纹
    */
    @SerializedName("Dfp")
    @Expose
    private String Dfp;

    /**
    * 启动时间
    */
    @SerializedName("BootTime")
    @Expose
    private String BootTime;

    /**
    * 分辨率 水平*垂直 格式
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 铃声列表
    */
    @SerializedName("RingList")
    @Expose
    private String RingList;

    /**
    * 字体列表
    */
    @SerializedName("FontList")
    @Expose
    private String FontList;

    /**
    * 传感器列表
    */
    @SerializedName("SensorList")
    @Expose
    private String SensorList;

    /**
    * CPU型号
    */
    @SerializedName("CpuType")
    @Expose
    private String CpuType;

    /**
    * 电池容量
    */
    @SerializedName("Battery")
    @Expose
    private String Battery;

    /**
    * 信通院广告ID
    */
    @SerializedName("Oaid")
    @Expose
    private String Oaid;

    /**
    * IOS 广告ID
    */
    @SerializedName("Idfa")
    @Expose
    private String Idfa;

    /**
    * IOS 应用ID
    */
    @SerializedName("Idfv")
    @Expose
    private String Idfv;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * IOS手机型号
    */
    @SerializedName("IphoneModel")
    @Expose
    private String IphoneModel;

    /**
    * Android 指纹
    */
    @SerializedName("Fingerprint")
    @Expose
    private String Fingerprint;

    /**
    * Android序列号
    */
    @SerializedName("SerialId")
    @Expose
    private String SerialId;

    /**
     * Get 设备类型 0表示Android， 1表示IOS 
     * @return DevType 设备类型 0表示Android， 1表示IOS
     */
    public Long getDevType() {
        return this.DevType;
    }

    /**
     * Set 设备类型 0表示Android， 1表示IOS
     * @param DevType 设备类型 0表示Android， 1表示IOS
     */
    public void setDevType(Long DevType) {
        this.DevType = DevType;
    }

    /**
     * Get Android Imei号 
     * @return Imei Android Imei号
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set Android Imei号
     * @param Imei Android Imei号
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get Mac地址 
     * @return Mac Mac地址
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set Mac地址
     * @param Mac Mac地址
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get android  Aid 
     * @return Aid android  Aid
     */
    public String getAid() {
        return this.Aid;
    }

    /**
     * Set android  Aid
     * @param Aid android  Aid
     */
    public void setAid(String Aid) {
        this.Aid = Aid;
    }

    /**
     * Get Android Cid 
     * @return Cid Android Cid
     */
    public String getCid() {
        return this.Cid;
    }

    /**
     * Set Android Cid
     * @param Cid Android Cid
     */
    public void setCid(String Cid) {
        this.Cid = Cid;
    }

    /**
     * Get 手机Imsi 
     * @return Imsi 手机Imsi
     */
    public String getImsi() {
        return this.Imsi;
    }

    /**
     * Set 手机Imsi
     * @param Imsi 手机Imsi
     */
    public void setImsi(String Imsi) {
        this.Imsi = Imsi;
    }

    /**
     * Get Df 磁盘分区信息 
     * @return Df Df 磁盘分区信息
     */
    public String getDf() {
        return this.Df;
    }

    /**
     * Set Df 磁盘分区信息
     * @param Df Df 磁盘分区信息
     */
    public void setDf(String Df) {
        this.Df = Df;
    }

    /**
     * Get 内核版本 
     * @return KernelVer 内核版本
     */
    public String getKernelVer() {
        return this.KernelVer;
    }

    /**
     * Set 内核版本
     * @param KernelVer 内核版本
     */
    public void setKernelVer(String KernelVer) {
        this.KernelVer = KernelVer;
    }

    /**
     * Get 存储大小 
     * @return Storage 存储大小
     */
    public String getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储大小
     * @param Storage 存储大小
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 设备驱动指纹 
     * @return Dfp 设备驱动指纹
     */
    public String getDfp() {
        return this.Dfp;
    }

    /**
     * Set 设备驱动指纹
     * @param Dfp 设备驱动指纹
     */
    public void setDfp(String Dfp) {
        this.Dfp = Dfp;
    }

    /**
     * Get 启动时间 
     * @return BootTime 启动时间
     */
    public String getBootTime() {
        return this.BootTime;
    }

    /**
     * Set 启动时间
     * @param BootTime 启动时间
     */
    public void setBootTime(String BootTime) {
        this.BootTime = BootTime;
    }

    /**
     * Get 分辨率 水平*垂直 格式 
     * @return Resolution 分辨率 水平*垂直 格式
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率 水平*垂直 格式
     * @param Resolution 分辨率 水平*垂直 格式
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 铃声列表 
     * @return RingList 铃声列表
     */
    public String getRingList() {
        return this.RingList;
    }

    /**
     * Set 铃声列表
     * @param RingList 铃声列表
     */
    public void setRingList(String RingList) {
        this.RingList = RingList;
    }

    /**
     * Get 字体列表 
     * @return FontList 字体列表
     */
    public String getFontList() {
        return this.FontList;
    }

    /**
     * Set 字体列表
     * @param FontList 字体列表
     */
    public void setFontList(String FontList) {
        this.FontList = FontList;
    }

    /**
     * Get 传感器列表 
     * @return SensorList 传感器列表
     */
    public String getSensorList() {
        return this.SensorList;
    }

    /**
     * Set 传感器列表
     * @param SensorList 传感器列表
     */
    public void setSensorList(String SensorList) {
        this.SensorList = SensorList;
    }

    /**
     * Get CPU型号 
     * @return CpuType CPU型号
     */
    public String getCpuType() {
        return this.CpuType;
    }

    /**
     * Set CPU型号
     * @param CpuType CPU型号
     */
    public void setCpuType(String CpuType) {
        this.CpuType = CpuType;
    }

    /**
     * Get 电池容量 
     * @return Battery 电池容量
     */
    public String getBattery() {
        return this.Battery;
    }

    /**
     * Set 电池容量
     * @param Battery 电池容量
     */
    public void setBattery(String Battery) {
        this.Battery = Battery;
    }

    /**
     * Get 信通院广告ID 
     * @return Oaid 信通院广告ID
     */
    public String getOaid() {
        return this.Oaid;
    }

    /**
     * Set 信通院广告ID
     * @param Oaid 信通院广告ID
     */
    public void setOaid(String Oaid) {
        this.Oaid = Oaid;
    }

    /**
     * Get IOS 广告ID 
     * @return Idfa IOS 广告ID
     */
    public String getIdfa() {
        return this.Idfa;
    }

    /**
     * Set IOS 广告ID
     * @param Idfa IOS 广告ID
     */
    public void setIdfa(String Idfa) {
        this.Idfa = Idfa;
    }

    /**
     * Get IOS 应用ID 
     * @return Idfv IOS 应用ID
     */
    public String getIdfv() {
        return this.Idfv;
    }

    /**
     * Set IOS 应用ID
     * @param Idfv IOS 应用ID
     */
    public void setIdfv(String Idfv) {
        this.Idfv = Idfv;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get IOS手机型号 
     * @return IphoneModel IOS手机型号
     */
    public String getIphoneModel() {
        return this.IphoneModel;
    }

    /**
     * Set IOS手机型号
     * @param IphoneModel IOS手机型号
     */
    public void setIphoneModel(String IphoneModel) {
        this.IphoneModel = IphoneModel;
    }

    /**
     * Get Android 指纹 
     * @return Fingerprint Android 指纹
     */
    public String getFingerprint() {
        return this.Fingerprint;
    }

    /**
     * Set Android 指纹
     * @param Fingerprint Android 指纹
     */
    public void setFingerprint(String Fingerprint) {
        this.Fingerprint = Fingerprint;
    }

    /**
     * Get Android序列号 
     * @return SerialId Android序列号
     */
    public String getSerialId() {
        return this.SerialId;
    }

    /**
     * Set Android序列号
     * @param SerialId Android序列号
     */
    public void setSerialId(String SerialId) {
        this.SerialId = SerialId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DevType", this.DevType);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Aid", this.Aid);
        this.setParamSimple(map, prefix + "Cid", this.Cid);
        this.setParamSimple(map, prefix + "Imsi", this.Imsi);
        this.setParamSimple(map, prefix + "Df", this.Df);
        this.setParamSimple(map, prefix + "KernelVer", this.KernelVer);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Dfp", this.Dfp);
        this.setParamSimple(map, prefix + "BootTime", this.BootTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "RingList", this.RingList);
        this.setParamSimple(map, prefix + "FontList", this.FontList);
        this.setParamSimple(map, prefix + "SensorList", this.SensorList);
        this.setParamSimple(map, prefix + "CpuType", this.CpuType);
        this.setParamSimple(map, prefix + "Battery", this.Battery);
        this.setParamSimple(map, prefix + "Oaid", this.Oaid);
        this.setParamSimple(map, prefix + "Idfa", this.Idfa);
        this.setParamSimple(map, prefix + "Idfv", this.Idfv);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "IphoneModel", this.IphoneModel);
        this.setParamSimple(map, prefix + "Fingerprint", this.Fingerprint);
        this.setParamSimple(map, prefix + "SerialId", this.SerialId);

    }
}

