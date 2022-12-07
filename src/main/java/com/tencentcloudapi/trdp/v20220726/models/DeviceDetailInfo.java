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
package com.tencentcloudapi.trdp.v20220726.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDetailInfo extends AbstractModel{

    /**
    * mac地址或唯一设备标识
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 手机型号
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 操作系统(unknown，android，ios，windows)
    */
    @SerializedName("OsSystem")
    @Expose
    private String OsSystem;

    /**
    * 操作系统版本
    */
    @SerializedName("OsSystemVersion")
    @Expose
    private String OsSystemVersion;

    /**
    * 竞价底价
    */
    @SerializedName("BidFloor")
    @Expose
    private Long BidFloor;

    /**
    * 设备版本
    */
    @SerializedName("DeviceVersion")
    @Expose
    private String DeviceVersion;

    /**
    * 设备制造商
    */
    @SerializedName("Maker")
    @Expose
    private String Maker;

    /**
    * 设备类型（PHONE,TABLET）
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
    */
    @SerializedName("Carrier")
    @Expose
    private String Carrier;

    /**
    * 入网方式(wifi,5g,4g,3g,2g)
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * 手机芯片信息
    */
    @SerializedName("PhoneChipInfo")
    @Expose
    private String PhoneChipInfo;

    /**
    * CPU 型号
    */
    @SerializedName("CpuModel")
    @Expose
    private String CpuModel;

    /**
    * CPU 核数
    */
    @SerializedName("CpuCore")
    @Expose
    private String CpuCore;

    /**
    * 内存容量，单位转换为 GB
    */
    @SerializedName("Memory")
    @Expose
    private String Memory;

    /**
    * 系统语言
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 手机音量
    */
    @SerializedName("Volume")
    @Expose
    private String Volume;

    /**
    * 电池电量
    */
    @SerializedName("BatteryPower")
    @Expose
    private String BatteryPower;

    /**
    * 屏幕分辨率宽，保留整数
    */
    @SerializedName("ResolutionWidth")
    @Expose
    private Long ResolutionWidth;

    /**
    * 屏幕分辨率高，保留整数
    */
    @SerializedName("ResolutionHeight")
    @Expose
    private Long ResolutionHeight;

    /**
    * 浏览器类型
    */
    @SerializedName("Ua")
    @Expose
    private String Ua;

    /**
    * 客户端应用
    */
    @SerializedName("App")
    @Expose
    private String App;

    /**
    * 应用包名
    */
    @SerializedName("AppPackageName")
    @Expose
    private String AppPackageName;

    /**
    * 设备序列号
Android设备
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * netOperator MCC+MNC
Android设备
    */
    @SerializedName("MobileCountryAndNetworkCode")
    @Expose
    private String MobileCountryAndNetworkCode;

    /**
    * 设备品牌 “华为”“oppo”“小米”
Android设备
    */
    @SerializedName("VendorId")
    @Expose
    private String VendorId;

    /**
    * Android API等级
Android设备
    */
    @SerializedName("AndroidApiLevel")
    @Expose
    private String AndroidApiLevel;

    /**
    * 屏幕亮度
Android设备
    */
    @SerializedName("Brightness")
    @Expose
    private String Brightness;

    /**
    * 蓝牙地址
Android设备
    */
    @SerializedName("BluetoothAddress")
    @Expose
    private String BluetoothAddress;

    /**
    * 基带版本
Android设备
    */
    @SerializedName("BaseBandVersion")
    @Expose
    private String BaseBandVersion;

    /**
    * kernel 版本
Android设备
    */
    @SerializedName("KernelVersion")
    @Expose
    private String KernelVersion;

    /**
    * 存储容量，单位转换为 GB
Android设备
    */
    @SerializedName("Storage")
    @Expose
    private String Storage;

    /**
    * 软件包名
Android设备
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * app 版本号
Android设备
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * app 显示名称
Android设备
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android设备
    */
    @SerializedName("IsDebug")
    @Expose
    private String IsDebug;

    /**
    * 是否越狱；0 为正常，1 为越狱；其他值无效
Android设备
    */
    @SerializedName("IsRoot")
    @Expose
    private String IsRoot;

    /**
    * 是否启动代理；0 为未开启，1 为开启；其他值无效
Android设备
    */
    @SerializedName("IsProxy")
    @Expose
    private String IsProxy;

    /**
    * 是否模拟器；0 为未开启，1 为开启；其他值无效
Android设备
    */
    @SerializedName("IsEmulator")
    @Expose
    private String IsEmulator;

    /**
    * 充电状态；1-不在充电，2-USB充电，3-电源充电
Android设备
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

    /**
    * 网络类型：2G/3G/4G/5G/Wi-Fi/WWAN/other
Android设备
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * Wi-Fi MAC地址
Android设备
    */
    @SerializedName("WifiMac")
    @Expose
    private String WifiMac;

    /**
    * 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS设备
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 开机时间
IOS设备
    */
    @SerializedName("StartupTime")
    @Expose
    private String StartupTime;

    /**
    * 所在经度
    */
    @SerializedName("Lon")
    @Expose
    private String Lon;

    /**
    * 所在纬度
    */
    @SerializedName("Lat")
    @Expose
    private String Lat;

    /**
     * Get mac地址或唯一设备标识 
     * @return MacAddress mac地址或唯一设备标识
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set mac地址或唯一设备标识
     * @param MacAddress mac地址或唯一设备标识
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get 手机型号 
     * @return Model 手机型号
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 手机型号
     * @param Model 手机型号
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 操作系统(unknown，android，ios，windows) 
     * @return OsSystem 操作系统(unknown，android，ios，windows)
     */
    public String getOsSystem() {
        return this.OsSystem;
    }

    /**
     * Set 操作系统(unknown，android，ios，windows)
     * @param OsSystem 操作系统(unknown，android，ios，windows)
     */
    public void setOsSystem(String OsSystem) {
        this.OsSystem = OsSystem;
    }

    /**
     * Get 操作系统版本 
     * @return OsSystemVersion 操作系统版本
     */
    public String getOsSystemVersion() {
        return this.OsSystemVersion;
    }

    /**
     * Set 操作系统版本
     * @param OsSystemVersion 操作系统版本
     */
    public void setOsSystemVersion(String OsSystemVersion) {
        this.OsSystemVersion = OsSystemVersion;
    }

    /**
     * Get 竞价底价 
     * @return BidFloor 竞价底价
     */
    public Long getBidFloor() {
        return this.BidFloor;
    }

    /**
     * Set 竞价底价
     * @param BidFloor 竞价底价
     */
    public void setBidFloor(Long BidFloor) {
        this.BidFloor = BidFloor;
    }

    /**
     * Get 设备版本 
     * @return DeviceVersion 设备版本
     */
    public String getDeviceVersion() {
        return this.DeviceVersion;
    }

    /**
     * Set 设备版本
     * @param DeviceVersion 设备版本
     */
    public void setDeviceVersion(String DeviceVersion) {
        this.DeviceVersion = DeviceVersion;
    }

    /**
     * Get 设备制造商 
     * @return Maker 设备制造商
     */
    public String getMaker() {
        return this.Maker;
    }

    /**
     * Set 设备制造商
     * @param Maker 设备制造商
     */
    public void setMaker(String Maker) {
        this.Maker = Maker;
    }

    /**
     * Get 设备类型（PHONE,TABLET） 
     * @return DeviceType 设备类型（PHONE,TABLET）
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型（PHONE,TABLET）
     * @param DeviceType 设备类型（PHONE,TABLET）
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通 
     * @return Carrier 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
     */
    public String getCarrier() {
        return this.Carrier;
    }

    /**
     * Set 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
     * @param Carrier 运营商；-1: 获取失败，0: 其他，1: 移动，2: 联通，3: 电信，4: 铁通
     */
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * Get 入网方式(wifi,5g,4g,3g,2g) 
     * @return AccessMode 入网方式(wifi,5g,4g,3g,2g)
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 入网方式(wifi,5g,4g,3g,2g)
     * @param AccessMode 入网方式(wifi,5g,4g,3g,2g)
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 手机芯片信息 
     * @return PhoneChipInfo 手机芯片信息
     */
    public String getPhoneChipInfo() {
        return this.PhoneChipInfo;
    }

    /**
     * Set 手机芯片信息
     * @param PhoneChipInfo 手机芯片信息
     */
    public void setPhoneChipInfo(String PhoneChipInfo) {
        this.PhoneChipInfo = PhoneChipInfo;
    }

    /**
     * Get CPU 型号 
     * @return CpuModel CPU 型号
     */
    public String getCpuModel() {
        return this.CpuModel;
    }

    /**
     * Set CPU 型号
     * @param CpuModel CPU 型号
     */
    public void setCpuModel(String CpuModel) {
        this.CpuModel = CpuModel;
    }

    /**
     * Get CPU 核数 
     * @return CpuCore CPU 核数
     */
    public String getCpuCore() {
        return this.CpuCore;
    }

    /**
     * Set CPU 核数
     * @param CpuCore CPU 核数
     */
    public void setCpuCore(String CpuCore) {
        this.CpuCore = CpuCore;
    }

    /**
     * Get 内存容量，单位转换为 GB 
     * @return Memory 内存容量，单位转换为 GB
     */
    public String getMemory() {
        return this.Memory;
    }

    /**
     * Set 内存容量，单位转换为 GB
     * @param Memory 内存容量，单位转换为 GB
     */
    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 系统语言 
     * @return Language 系统语言
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 系统语言
     * @param Language 系统语言
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 手机音量 
     * @return Volume 手机音量
     */
    public String getVolume() {
        return this.Volume;
    }

    /**
     * Set 手机音量
     * @param Volume 手机音量
     */
    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 电池电量 
     * @return BatteryPower 电池电量
     */
    public String getBatteryPower() {
        return this.BatteryPower;
    }

    /**
     * Set 电池电量
     * @param BatteryPower 电池电量
     */
    public void setBatteryPower(String BatteryPower) {
        this.BatteryPower = BatteryPower;
    }

    /**
     * Get 屏幕分辨率宽，保留整数 
     * @return ResolutionWidth 屏幕分辨率宽，保留整数
     */
    public Long getResolutionWidth() {
        return this.ResolutionWidth;
    }

    /**
     * Set 屏幕分辨率宽，保留整数
     * @param ResolutionWidth 屏幕分辨率宽，保留整数
     */
    public void setResolutionWidth(Long ResolutionWidth) {
        this.ResolutionWidth = ResolutionWidth;
    }

    /**
     * Get 屏幕分辨率高，保留整数 
     * @return ResolutionHeight 屏幕分辨率高，保留整数
     */
    public Long getResolutionHeight() {
        return this.ResolutionHeight;
    }

    /**
     * Set 屏幕分辨率高，保留整数
     * @param ResolutionHeight 屏幕分辨率高，保留整数
     */
    public void setResolutionHeight(Long ResolutionHeight) {
        this.ResolutionHeight = ResolutionHeight;
    }

    /**
     * Get 浏览器类型 
     * @return Ua 浏览器类型
     */
    public String getUa() {
        return this.Ua;
    }

    /**
     * Set 浏览器类型
     * @param Ua 浏览器类型
     */
    public void setUa(String Ua) {
        this.Ua = Ua;
    }

    /**
     * Get 客户端应用 
     * @return App 客户端应用
     */
    public String getApp() {
        return this.App;
    }

    /**
     * Set 客户端应用
     * @param App 客户端应用
     */
    public void setApp(String App) {
        this.App = App;
    }

    /**
     * Get 应用包名 
     * @return AppPackageName 应用包名
     */
    public String getAppPackageName() {
        return this.AppPackageName;
    }

    /**
     * Set 应用包名
     * @param AppPackageName 应用包名
     */
    public void setAppPackageName(String AppPackageName) {
        this.AppPackageName = AppPackageName;
    }

    /**
     * Get 设备序列号
Android设备 
     * @return SerialNumber 设备序列号
Android设备
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 设备序列号
Android设备
     * @param SerialNumber 设备序列号
Android设备
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get netOperator MCC+MNC
Android设备 
     * @return MobileCountryAndNetworkCode netOperator MCC+MNC
Android设备
     */
    public String getMobileCountryAndNetworkCode() {
        return this.MobileCountryAndNetworkCode;
    }

    /**
     * Set netOperator MCC+MNC
Android设备
     * @param MobileCountryAndNetworkCode netOperator MCC+MNC
Android设备
     */
    public void setMobileCountryAndNetworkCode(String MobileCountryAndNetworkCode) {
        this.MobileCountryAndNetworkCode = MobileCountryAndNetworkCode;
    }

    /**
     * Get 设备品牌 “华为”“oppo”“小米”
Android设备 
     * @return VendorId 设备品牌 “华为”“oppo”“小米”
Android设备
     */
    public String getVendorId() {
        return this.VendorId;
    }

    /**
     * Set 设备品牌 “华为”“oppo”“小米”
Android设备
     * @param VendorId 设备品牌 “华为”“oppo”“小米”
Android设备
     */
    public void setVendorId(String VendorId) {
        this.VendorId = VendorId;
    }

    /**
     * Get Android API等级
Android设备 
     * @return AndroidApiLevel Android API等级
Android设备
     */
    public String getAndroidApiLevel() {
        return this.AndroidApiLevel;
    }

    /**
     * Set Android API等级
Android设备
     * @param AndroidApiLevel Android API等级
Android设备
     */
    public void setAndroidApiLevel(String AndroidApiLevel) {
        this.AndroidApiLevel = AndroidApiLevel;
    }

    /**
     * Get 屏幕亮度
Android设备 
     * @return Brightness 屏幕亮度
Android设备
     */
    public String getBrightness() {
        return this.Brightness;
    }

    /**
     * Set 屏幕亮度
Android设备
     * @param Brightness 屏幕亮度
Android设备
     */
    public void setBrightness(String Brightness) {
        this.Brightness = Brightness;
    }

    /**
     * Get 蓝牙地址
Android设备 
     * @return BluetoothAddress 蓝牙地址
Android设备
     */
    public String getBluetoothAddress() {
        return this.BluetoothAddress;
    }

    /**
     * Set 蓝牙地址
Android设备
     * @param BluetoothAddress 蓝牙地址
Android设备
     */
    public void setBluetoothAddress(String BluetoothAddress) {
        this.BluetoothAddress = BluetoothAddress;
    }

    /**
     * Get 基带版本
Android设备 
     * @return BaseBandVersion 基带版本
Android设备
     */
    public String getBaseBandVersion() {
        return this.BaseBandVersion;
    }

    /**
     * Set 基带版本
Android设备
     * @param BaseBandVersion 基带版本
Android设备
     */
    public void setBaseBandVersion(String BaseBandVersion) {
        this.BaseBandVersion = BaseBandVersion;
    }

    /**
     * Get kernel 版本
Android设备 
     * @return KernelVersion kernel 版本
Android设备
     */
    public String getKernelVersion() {
        return this.KernelVersion;
    }

    /**
     * Set kernel 版本
Android设备
     * @param KernelVersion kernel 版本
Android设备
     */
    public void setKernelVersion(String KernelVersion) {
        this.KernelVersion = KernelVersion;
    }

    /**
     * Get 存储容量，单位转换为 GB
Android设备 
     * @return Storage 存储容量，单位转换为 GB
Android设备
     */
    public String getStorage() {
        return this.Storage;
    }

    /**
     * Set 存储容量，单位转换为 GB
Android设备
     * @param Storage 存储容量，单位转换为 GB
Android设备
     */
    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 软件包名
Android设备 
     * @return PackageName 软件包名
Android设备
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 软件包名
Android设备
     * @param PackageName 软件包名
Android设备
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get app 版本号
Android设备 
     * @return AppVersion app 版本号
Android设备
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set app 版本号
Android设备
     * @param AppVersion app 版本号
Android设备
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get app 显示名称
Android设备 
     * @return AppName app 显示名称
Android设备
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app 显示名称
Android设备
     * @param AppName app 显示名称
Android设备
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android设备 
     * @return IsDebug 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android设备
     */
    public String getIsDebug() {
        return this.IsDebug;
    }

    /**
     * Set 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android设备
     * @param IsDebug 是否 debug；0 为正常模式，1 为 debug 模式；其他值无效
Android设备
     */
    public void setIsDebug(String IsDebug) {
        this.IsDebug = IsDebug;
    }

    /**
     * Get 是否越狱；0 为正常，1 为越狱；其他值无效
Android设备 
     * @return IsRoot 是否越狱；0 为正常，1 为越狱；其他值无效
Android设备
     */
    public String getIsRoot() {
        return this.IsRoot;
    }

    /**
     * Set 是否越狱；0 为正常，1 为越狱；其他值无效
Android设备
     * @param IsRoot 是否越狱；0 为正常，1 为越狱；其他值无效
Android设备
     */
    public void setIsRoot(String IsRoot) {
        this.IsRoot = IsRoot;
    }

    /**
     * Get 是否启动代理；0 为未开启，1 为开启；其他值无效
Android设备 
     * @return IsProxy 是否启动代理；0 为未开启，1 为开启；其他值无效
Android设备
     */
    public String getIsProxy() {
        return this.IsProxy;
    }

    /**
     * Set 是否启动代理；0 为未开启，1 为开启；其他值无效
Android设备
     * @param IsProxy 是否启动代理；0 为未开启，1 为开启；其他值无效
Android设备
     */
    public void setIsProxy(String IsProxy) {
        this.IsProxy = IsProxy;
    }

    /**
     * Get 是否模拟器；0 为未开启，1 为开启；其他值无效
Android设备 
     * @return IsEmulator 是否模拟器；0 为未开启，1 为开启；其他值无效
Android设备
     */
    public String getIsEmulator() {
        return this.IsEmulator;
    }

    /**
     * Set 是否模拟器；0 为未开启，1 为开启；其他值无效
Android设备
     * @param IsEmulator 是否模拟器；0 为未开启，1 为开启；其他值无效
Android设备
     */
    public void setIsEmulator(String IsEmulator) {
        this.IsEmulator = IsEmulator;
    }

    /**
     * Get 充电状态；1-不在充电，2-USB充电，3-电源充电
Android设备 
     * @return ChargeStatus 充电状态；1-不在充电，2-USB充电，3-电源充电
Android设备
     */
    public String getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set 充电状态；1-不在充电，2-USB充电，3-电源充电
Android设备
     * @param ChargeStatus 充电状态；1-不在充电，2-USB充电，3-电源充电
Android设备
     */
    public void setChargeStatus(String ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get 网络类型：2G/3G/4G/5G/Wi-Fi/WWAN/other
Android设备 
     * @return NetworkType 网络类型：2G/3G/4G/5G/Wi-Fi/WWAN/other
Android设备
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型：2G/3G/4G/5G/Wi-Fi/WWAN/other
Android设备
     * @param NetworkType 网络类型：2G/3G/4G/5G/Wi-Fi/WWAN/other
Android设备
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get Wi-Fi MAC地址
Android设备 
     * @return WifiMac Wi-Fi MAC地址
Android设备
     */
    public String getWifiMac() {
        return this.WifiMac;
    }

    /**
     * Set Wi-Fi MAC地址
Android设备
     * @param WifiMac Wi-Fi MAC地址
Android设备
     */
    public void setWifiMac(String WifiMac) {
        this.WifiMac = WifiMac;
    }

    /**
     * Get 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS设备 
     * @return DeviceName 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS设备
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS设备
     * @param DeviceName 设备名称 "xxx 的 iPhone"，"xxx's IPhone" 等等
IOS设备
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 开机时间
IOS设备 
     * @return StartupTime 开机时间
IOS设备
     */
    public String getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 开机时间
IOS设备
     * @param StartupTime 开机时间
IOS设备
     */
    public void setStartupTime(String StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 所在经度 
     * @return Lon 所在经度
     */
    public String getLon() {
        return this.Lon;
    }

    /**
     * Set 所在经度
     * @param Lon 所在经度
     */
    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    /**
     * Get 所在纬度 
     * @return Lat 所在纬度
     */
    public String getLat() {
        return this.Lat;
    }

    /**
     * Set 所在纬度
     * @param Lat 所在纬度
     */
    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    public DeviceDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceDetailInfo(DeviceDetailInfo source) {
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.OsSystem != null) {
            this.OsSystem = new String(source.OsSystem);
        }
        if (source.OsSystemVersion != null) {
            this.OsSystemVersion = new String(source.OsSystemVersion);
        }
        if (source.BidFloor != null) {
            this.BidFloor = new Long(source.BidFloor);
        }
        if (source.DeviceVersion != null) {
            this.DeviceVersion = new String(source.DeviceVersion);
        }
        if (source.Maker != null) {
            this.Maker = new String(source.Maker);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Carrier != null) {
            this.Carrier = new String(source.Carrier);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.PhoneChipInfo != null) {
            this.PhoneChipInfo = new String(source.PhoneChipInfo);
        }
        if (source.CpuModel != null) {
            this.CpuModel = new String(source.CpuModel);
        }
        if (source.CpuCore != null) {
            this.CpuCore = new String(source.CpuCore);
        }
        if (source.Memory != null) {
            this.Memory = new String(source.Memory);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Volume != null) {
            this.Volume = new String(source.Volume);
        }
        if (source.BatteryPower != null) {
            this.BatteryPower = new String(source.BatteryPower);
        }
        if (source.ResolutionWidth != null) {
            this.ResolutionWidth = new Long(source.ResolutionWidth);
        }
        if (source.ResolutionHeight != null) {
            this.ResolutionHeight = new Long(source.ResolutionHeight);
        }
        if (source.Ua != null) {
            this.Ua = new String(source.Ua);
        }
        if (source.App != null) {
            this.App = new String(source.App);
        }
        if (source.AppPackageName != null) {
            this.AppPackageName = new String(source.AppPackageName);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.MobileCountryAndNetworkCode != null) {
            this.MobileCountryAndNetworkCode = new String(source.MobileCountryAndNetworkCode);
        }
        if (source.VendorId != null) {
            this.VendorId = new String(source.VendorId);
        }
        if (source.AndroidApiLevel != null) {
            this.AndroidApiLevel = new String(source.AndroidApiLevel);
        }
        if (source.Brightness != null) {
            this.Brightness = new String(source.Brightness);
        }
        if (source.BluetoothAddress != null) {
            this.BluetoothAddress = new String(source.BluetoothAddress);
        }
        if (source.BaseBandVersion != null) {
            this.BaseBandVersion = new String(source.BaseBandVersion);
        }
        if (source.KernelVersion != null) {
            this.KernelVersion = new String(source.KernelVersion);
        }
        if (source.Storage != null) {
            this.Storage = new String(source.Storage);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.IsDebug != null) {
            this.IsDebug = new String(source.IsDebug);
        }
        if (source.IsRoot != null) {
            this.IsRoot = new String(source.IsRoot);
        }
        if (source.IsProxy != null) {
            this.IsProxy = new String(source.IsProxy);
        }
        if (source.IsEmulator != null) {
            this.IsEmulator = new String(source.IsEmulator);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new String(source.ChargeStatus);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.WifiMac != null) {
            this.WifiMac = new String(source.WifiMac);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new String(source.StartupTime);
        }
        if (source.Lon != null) {
            this.Lon = new String(source.Lon);
        }
        if (source.Lat != null) {
            this.Lat = new String(source.Lat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "OsSystem", this.OsSystem);
        this.setParamSimple(map, prefix + "OsSystemVersion", this.OsSystemVersion);
        this.setParamSimple(map, prefix + "BidFloor", this.BidFloor);
        this.setParamSimple(map, prefix + "DeviceVersion", this.DeviceVersion);
        this.setParamSimple(map, prefix + "Maker", this.Maker);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Carrier", this.Carrier);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "PhoneChipInfo", this.PhoneChipInfo);
        this.setParamSimple(map, prefix + "CpuModel", this.CpuModel);
        this.setParamSimple(map, prefix + "CpuCore", this.CpuCore);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "BatteryPower", this.BatteryPower);
        this.setParamSimple(map, prefix + "ResolutionWidth", this.ResolutionWidth);
        this.setParamSimple(map, prefix + "ResolutionHeight", this.ResolutionHeight);
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "App", this.App);
        this.setParamSimple(map, prefix + "AppPackageName", this.AppPackageName);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "MobileCountryAndNetworkCode", this.MobileCountryAndNetworkCode);
        this.setParamSimple(map, prefix + "VendorId", this.VendorId);
        this.setParamSimple(map, prefix + "AndroidApiLevel", this.AndroidApiLevel);
        this.setParamSimple(map, prefix + "Brightness", this.Brightness);
        this.setParamSimple(map, prefix + "BluetoothAddress", this.BluetoothAddress);
        this.setParamSimple(map, prefix + "BaseBandVersion", this.BaseBandVersion);
        this.setParamSimple(map, prefix + "KernelVersion", this.KernelVersion);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "IsDebug", this.IsDebug);
        this.setParamSimple(map, prefix + "IsRoot", this.IsRoot);
        this.setParamSimple(map, prefix + "IsProxy", this.IsProxy);
        this.setParamSimple(map, prefix + "IsEmulator", this.IsEmulator);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "WifiMac", this.WifiMac);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "Lon", this.Lon);
        this.setParamSimple(map, prefix + "Lat", this.Lat);

    }
}

