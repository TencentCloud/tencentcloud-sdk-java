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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputTaBspData extends AbstractModel{

    /**
    * 请求序列号
    */
    @SerializedName("Seq")
    @Expose
    private Long Seq;

    /**
    * 操作系统类型[0：未知；1：android；2：ios；3：windows]
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 年龄下限
    */
    @SerializedName("AgeFloor")
    @Expose
    private Long AgeFloor;

    /**
    * 年龄上限
    */
    @SerializedName("AgeCeil")
    @Expose
    private Long AgeCeil;

    /**
    * 性别[1：男；2：女]
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 用户操作时间
    */
    @SerializedName("UserTime")
    @Expose
    private Long UserTime;

    /**
    * Imei [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * Imei小写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
    */
    @SerializedName("ImeiMd5")
    @Expose
    private String ImeiMd5;

    /**
    * Idfa [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
    */
    @SerializedName("Idfa")
    @Expose
    private String Idfa;

    /**
    * Idfa大写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
    */
    @SerializedName("IdfaMd5")
    @Expose
    private String IdfaMd5;

    /**
    * 用户IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * MAC地址[建议提供]
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * 手机号码[中国大陆]
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 浏览器
    */
    @SerializedName("UserAgent")
    @Expose
    private String UserAgent;

    /**
    * APP名称
    */
    @SerializedName("App")
    @Expose
    private String App;

    /**
    * 应用安装包名称
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * 设备制造商
    */
    @SerializedName("DeviceMaker")
    @Expose
    private String DeviceMaker;

    /**
    * 设备型号
    */
    @SerializedName("DeviceModule")
    @Expose
    private String DeviceModule;

    /**
    * 入网方式[1：WIFI；2：4G；3：3G；4：2G；5：其它]
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * 运营商[1：移动；2：联通；3：电信；4：其它]
    */
    @SerializedName("Sp")
    @Expose
    private String Sp;

    /**
    * 网址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 用户地址
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 纬度
    */
    @SerializedName("Latitude")
    @Expose
    private String Latitude;

    /**
    * 精度
    */
    @SerializedName("Longitude")
    @Expose
    private String Longitude;

    /**
    * 辅助区分信息
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get 请求序列号 
     * @return Seq 请求序列号
     */
    public Long getSeq() {
        return this.Seq;
    }

    /**
     * Set 请求序列号
     * @param Seq 请求序列号
     */
    public void setSeq(Long Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 操作系统类型[0：未知；1：android；2：ios；3：windows] 
     * @return OsType 操作系统类型[0：未知；1：android；2：ios；3：windows]
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 操作系统类型[0：未知；1：android；2：ios；3：windows]
     * @param OsType 操作系统类型[0：未知；1：android；2：ios；3：windows]
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 年龄下限 
     * @return AgeFloor 年龄下限
     */
    public Long getAgeFloor() {
        return this.AgeFloor;
    }

    /**
     * Set 年龄下限
     * @param AgeFloor 年龄下限
     */
    public void setAgeFloor(Long AgeFloor) {
        this.AgeFloor = AgeFloor;
    }

    /**
     * Get 年龄上限 
     * @return AgeCeil 年龄上限
     */
    public Long getAgeCeil() {
        return this.AgeCeil;
    }

    /**
     * Set 年龄上限
     * @param AgeCeil 年龄上限
     */
    public void setAgeCeil(Long AgeCeil) {
        this.AgeCeil = AgeCeil;
    }

    /**
     * Get 性别[1：男；2：女] 
     * @return Gender 性别[1：男；2：女]
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 性别[1：男；2：女]
     * @param Gender 性别[1：男；2：女]
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 用户操作时间 
     * @return UserTime 用户操作时间
     */
    public Long getUserTime() {
        return this.UserTime;
    }

    /**
     * Set 用户操作时间
     * @param UserTime 用户操作时间
     */
    public void setUserTime(Long UserTime) {
        this.UserTime = UserTime;
    }

    /**
     * Get Imei [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1] 
     * @return Imei Imei [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set Imei [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     * @param Imei Imei [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get Imei小写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1] 
     * @return ImeiMd5 Imei小写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public String getImeiMd5() {
        return this.ImeiMd5;
    }

    /**
     * Set Imei小写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     * @param ImeiMd5 Imei小写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public void setImeiMd5(String ImeiMd5) {
        this.ImeiMd5 = ImeiMd5;
    }

    /**
     * Get Idfa [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1] 
     * @return Idfa Idfa [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public String getIdfa() {
        return this.Idfa;
    }

    /**
     * Set Idfa [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     * @param Idfa Idfa [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public void setIdfa(String Idfa) {
        this.Idfa = Idfa;
    }

    /**
     * Get Idfa大写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1] 
     * @return IdfaMd5 Idfa大写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public String getIdfaMd5() {
        return this.IdfaMd5;
    }

    /**
     * Set Idfa大写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     * @param IdfaMd5 Idfa大写后加密Md5 [在(Imei|ImeiMd5|Idfa|IdfaMd5)里面4选1]
     */
    public void setIdfaMd5(String IdfaMd5) {
        this.IdfaMd5 = IdfaMd5;
    }

    /**
     * Get 用户IP 
     * @return UserIp 用户IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户IP
     * @param UserIp 用户IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get MAC地址[建议提供] 
     * @return Mac MAC地址[建议提供]
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set MAC地址[建议提供]
     * @param Mac MAC地址[建议提供]
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get 手机号码[中国大陆] 
     * @return PhoneNum 手机号码[中国大陆]
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 手机号码[中国大陆]
     * @param PhoneNum 手机号码[中国大陆]
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 浏览器 
     * @return UserAgent 浏览器
     */
    public String getUserAgent() {
        return this.UserAgent;
    }

    /**
     * Set 浏览器
     * @param UserAgent 浏览器
     */
    public void setUserAgent(String UserAgent) {
        this.UserAgent = UserAgent;
    }

    /**
     * Get APP名称 
     * @return App APP名称
     */
    public String getApp() {
        return this.App;
    }

    /**
     * Set APP名称
     * @param App APP名称
     */
    public void setApp(String App) {
        this.App = App;
    }

    /**
     * Get 应用安装包名称 
     * @return Package 应用安装包名称
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 应用安装包名称
     * @param Package 应用安装包名称
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get 设备制造商 
     * @return DeviceMaker 设备制造商
     */
    public String getDeviceMaker() {
        return this.DeviceMaker;
    }

    /**
     * Set 设备制造商
     * @param DeviceMaker 设备制造商
     */
    public void setDeviceMaker(String DeviceMaker) {
        this.DeviceMaker = DeviceMaker;
    }

    /**
     * Get 设备型号 
     * @return DeviceModule 设备型号
     */
    public String getDeviceModule() {
        return this.DeviceModule;
    }

    /**
     * Set 设备型号
     * @param DeviceModule 设备型号
     */
    public void setDeviceModule(String DeviceModule) {
        this.DeviceModule = DeviceModule;
    }

    /**
     * Get 入网方式[1：WIFI；2：4G；3：3G；4：2G；5：其它] 
     * @return AccessMode 入网方式[1：WIFI；2：4G；3：3G；4：2G；5：其它]
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 入网方式[1：WIFI；2：4G；3：3G；4：2G；5：其它]
     * @param AccessMode 入网方式[1：WIFI；2：4G；3：3G；4：2G；5：其它]
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 运营商[1：移动；2：联通；3：电信；4：其它] 
     * @return Sp 运营商[1：移动；2：联通；3：电信；4：其它]
     */
    public String getSp() {
        return this.Sp;
    }

    /**
     * Set 运营商[1：移动；2：联通；3：电信；4：其它]
     * @param Sp 运营商[1：移动；2：联通；3：电信；4：其它]
     */
    public void setSp(String Sp) {
        this.Sp = Sp;
    }

    /**
     * Get 网址 
     * @return Url 网址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 网址
     * @param Url 网址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 用户地址 
     * @return Location 用户地址
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 用户地址
     * @param Location 用户地址
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 纬度 
     * @return Latitude 纬度
     */
    public String getLatitude() {
        return this.Latitude;
    }

    /**
     * Set 纬度
     * @param Latitude 纬度
     */
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    /**
     * Get 精度 
     * @return Longitude 精度
     */
    public String getLongitude() {
        return this.Longitude;
    }

    /**
     * Set 精度
     * @param Longitude 精度
     */
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    /**
     * Get 辅助区分信息 
     * @return Context 辅助区分信息
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 辅助区分信息
     * @param Context 辅助区分信息
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "AgeFloor", this.AgeFloor);
        this.setParamSimple(map, prefix + "AgeCeil", this.AgeCeil);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "UserTime", this.UserTime);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "ImeiMd5", this.ImeiMd5);
        this.setParamSimple(map, prefix + "Idfa", this.Idfa);
        this.setParamSimple(map, prefix + "IdfaMd5", this.IdfaMd5);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "UserAgent", this.UserAgent);
        this.setParamSimple(map, prefix + "App", this.App);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DeviceMaker", this.DeviceMaker);
        this.setParamSimple(map, prefix + "DeviceModule", this.DeviceModule);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "Sp", this.Sp);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Latitude", this.Latitude);
        this.setParamSimple(map, prefix + "Longitude", this.Longitude);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

