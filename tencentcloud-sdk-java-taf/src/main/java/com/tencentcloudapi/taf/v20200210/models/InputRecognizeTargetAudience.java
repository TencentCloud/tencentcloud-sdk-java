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

public class InputRecognizeTargetAudience extends AbstractModel{

    /**
    * 设备ID，AccountType指定的类型
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 设备号类型，1.imei 2.imeiMd5（小写后转MD5转小写）3.idfa， 4.idfaMd5（大写后转MD5转小写），5.手机号,256.其它
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 模型ID列表
    */
    @SerializedName("ModelIdList")
    @Expose
    private Long [] ModelIdList;

    /**
    * 用户IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 操作系统类型(unknown，android，ios，windows)
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * 操作系统版本
    */
    @SerializedName("Osv")
    @Expose
    private String Osv;

    /**
    * 纬度
    */
    @SerializedName("Lat")
    @Expose
    private String Lat;

    /**
    * 经度
    */
    @SerializedName("Lon")
    @Expose
    private String Lon;

    /**
    * 设备型号(MI 6)
    */
    @SerializedName("DeviceModel")
    @Expose
    private String DeviceModel;

    /**
    * 竞价底价
    */
    @SerializedName("BidFloor")
    @Expose
    private Long BidFloor;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 性别(1.MALE 2.FEMALE)
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 用户地址
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 投放模式（0=PDB，1=PD，2=RTB，10=其他）
    */
    @SerializedName("DeliveryMode")
    @Expose
    private Long DeliveryMode;

    /**
    * 广告位类型<br />（0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
    */
    @SerializedName("AdvertisingType")
    @Expose
    private Long AdvertisingType;

    /**
    * mac地址，建议提供
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * 电话号码
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

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
    @SerializedName("Package")
    @Expose
    private String Package;

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
    * 入网方式(wifi,4g,3g,2g)
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * 运营商(1.移动 2.联通 3.电信等)
    */
    @SerializedName("Sp")
    @Expose
    private Long Sp;

    /**
    * 设备屏幕分辨率宽度像素数
    */
    @SerializedName("DeviceW")
    @Expose
    private Long DeviceW;

    /**
    * 设备屏幕分辨率高度像素数
    */
    @SerializedName("DeviceH")
    @Expose
    private Long DeviceH;

    /**
    * 是否全屏插广告(0-否，1-是)
    */
    @SerializedName("FullScreen")
    @Expose
    private Long FullScreen;

    /**
    * 广告位宽度
    */
    @SerializedName("ImpBannerW")
    @Expose
    private Long ImpBannerW;

    /**
    * 广告位高度
    */
    @SerializedName("ImpBannerH")
    @Expose
    private Long ImpBannerH;

    /**
    * 网址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 上下文信息
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 渠道
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 请求ID
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
    * 请求ID的md5值
    */
    @SerializedName("ReqMd5")
    @Expose
    private String ReqMd5;

    /**
    * ad_type
    */
    @SerializedName("AdType")
    @Expose
    private Long AdType;

    /**
    * app name
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * appVer
    */
    @SerializedName("AppVer")
    @Expose
    private String AppVer;

    /**
    * 竞价模式1：rtb 2:pd
    */
    @SerializedName("ReqType")
    @Expose
    private Long ReqType;

    /**
     * Get 设备ID，AccountType指定的类型 
     * @return Uid 设备ID，AccountType指定的类型
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 设备ID，AccountType指定的类型
     * @param Uid 设备ID，AccountType指定的类型
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 设备号类型，1.imei 2.imeiMd5（小写后转MD5转小写）3.idfa， 4.idfaMd5（大写后转MD5转小写），5.手机号,256.其它 
     * @return AccountType 设备号类型，1.imei 2.imeiMd5（小写后转MD5转小写）3.idfa， 4.idfaMd5（大写后转MD5转小写），5.手机号,256.其它
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 设备号类型，1.imei 2.imeiMd5（小写后转MD5转小写）3.idfa， 4.idfaMd5（大写后转MD5转小写），5.手机号,256.其它
     * @param AccountType 设备号类型，1.imei 2.imeiMd5（小写后转MD5转小写）3.idfa， 4.idfaMd5（大写后转MD5转小写），5.手机号,256.其它
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 模型ID列表 
     * @return ModelIdList 模型ID列表
     */
    public Long [] getModelIdList() {
        return this.ModelIdList;
    }

    /**
     * Set 模型ID列表
     * @param ModelIdList 模型ID列表
     */
    public void setModelIdList(Long [] ModelIdList) {
        this.ModelIdList = ModelIdList;
    }

    /**
     * Get 用户IP 
     * @return Ip 用户IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 用户IP
     * @param Ip 用户IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 操作系统类型(unknown，android，ios，windows) 
     * @return Os 操作系统类型(unknown，android，ios，windows)
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set 操作系统类型(unknown，android，ios，windows)
     * @param Os 操作系统类型(unknown，android，ios，windows)
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get 操作系统版本 
     * @return Osv 操作系统版本
     */
    public String getOsv() {
        return this.Osv;
    }

    /**
     * Set 操作系统版本
     * @param Osv 操作系统版本
     */
    public void setOsv(String Osv) {
        this.Osv = Osv;
    }

    /**
     * Get 纬度 
     * @return Lat 纬度
     */
    public String getLat() {
        return this.Lat;
    }

    /**
     * Set 纬度
     * @param Lat 纬度
     */
    public void setLat(String Lat) {
        this.Lat = Lat;
    }

    /**
     * Get 经度 
     * @return Lon 经度
     */
    public String getLon() {
        return this.Lon;
    }

    /**
     * Set 经度
     * @param Lon 经度
     */
    public void setLon(String Lon) {
        this.Lon = Lon;
    }

    /**
     * Get 设备型号(MI 6) 
     * @return DeviceModel 设备型号(MI 6)
     */
    public String getDeviceModel() {
        return this.DeviceModel;
    }

    /**
     * Set 设备型号(MI 6)
     * @param DeviceModel 设备型号(MI 6)
     */
    public void setDeviceModel(String DeviceModel) {
        this.DeviceModel = DeviceModel;
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
     * Get 年龄 
     * @return Age 年龄
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
     * @param Age 年龄
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 性别(1.MALE 2.FEMALE) 
     * @return Gender 性别(1.MALE 2.FEMALE)
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 性别(1.MALE 2.FEMALE)
     * @param Gender 性别(1.MALE 2.FEMALE)
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
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
     * Get 投放模式（0=PDB，1=PD，2=RTB，10=其他） 
     * @return DeliveryMode 投放模式（0=PDB，1=PD，2=RTB，10=其他）
     */
    public Long getDeliveryMode() {
        return this.DeliveryMode;
    }

    /**
     * Set 投放模式（0=PDB，1=PD，2=RTB，10=其他）
     * @param DeliveryMode 投放模式（0=PDB，1=PD，2=RTB，10=其他）
     */
    public void setDeliveryMode(Long DeliveryMode) {
        this.DeliveryMode = DeliveryMode;
    }

    /**
     * Get 广告位类型<br />（0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它） 
     * @return AdvertisingType 广告位类型<br />（0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
     */
    public Long getAdvertisingType() {
        return this.AdvertisingType;
    }

    /**
     * Set 广告位类型<br />（0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
     * @param AdvertisingType 广告位类型<br />（0=前贴片，1=开屏广告，2=网页头部广告、3=网页中部广告、4=网页底部广告、5=悬浮广告、10=其它）
     */
    public void setAdvertisingType(Long AdvertisingType) {
        this.AdvertisingType = AdvertisingType;
    }

    /**
     * Get mac地址，建议提供 
     * @return Mac mac地址，建议提供
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set mac地址，建议提供
     * @param Mac mac地址，建议提供
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get 电话号码 
     * @return Phone 电话号码
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 电话号码
     * @param Phone 电话号码
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
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
     * @return Package 应用包名
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 应用包名
     * @param Package 应用包名
     */
    public void setPackage(String Package) {
        this.Package = Package;
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
     * Get 入网方式(wifi,4g,3g,2g) 
     * @return AccessMode 入网方式(wifi,4g,3g,2g)
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 入网方式(wifi,4g,3g,2g)
     * @param AccessMode 入网方式(wifi,4g,3g,2g)
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 运营商(1.移动 2.联通 3.电信等) 
     * @return Sp 运营商(1.移动 2.联通 3.电信等)
     */
    public Long getSp() {
        return this.Sp;
    }

    /**
     * Set 运营商(1.移动 2.联通 3.电信等)
     * @param Sp 运营商(1.移动 2.联通 3.电信等)
     */
    public void setSp(Long Sp) {
        this.Sp = Sp;
    }

    /**
     * Get 设备屏幕分辨率宽度像素数 
     * @return DeviceW 设备屏幕分辨率宽度像素数
     */
    public Long getDeviceW() {
        return this.DeviceW;
    }

    /**
     * Set 设备屏幕分辨率宽度像素数
     * @param DeviceW 设备屏幕分辨率宽度像素数
     */
    public void setDeviceW(Long DeviceW) {
        this.DeviceW = DeviceW;
    }

    /**
     * Get 设备屏幕分辨率高度像素数 
     * @return DeviceH 设备屏幕分辨率高度像素数
     */
    public Long getDeviceH() {
        return this.DeviceH;
    }

    /**
     * Set 设备屏幕分辨率高度像素数
     * @param DeviceH 设备屏幕分辨率高度像素数
     */
    public void setDeviceH(Long DeviceH) {
        this.DeviceH = DeviceH;
    }

    /**
     * Get 是否全屏插广告(0-否，1-是) 
     * @return FullScreen 是否全屏插广告(0-否，1-是)
     */
    public Long getFullScreen() {
        return this.FullScreen;
    }

    /**
     * Set 是否全屏插广告(0-否，1-是)
     * @param FullScreen 是否全屏插广告(0-否，1-是)
     */
    public void setFullScreen(Long FullScreen) {
        this.FullScreen = FullScreen;
    }

    /**
     * Get 广告位宽度 
     * @return ImpBannerW 广告位宽度
     */
    public Long getImpBannerW() {
        return this.ImpBannerW;
    }

    /**
     * Set 广告位宽度
     * @param ImpBannerW 广告位宽度
     */
    public void setImpBannerW(Long ImpBannerW) {
        this.ImpBannerW = ImpBannerW;
    }

    /**
     * Get 广告位高度 
     * @return ImpBannerH 广告位高度
     */
    public Long getImpBannerH() {
        return this.ImpBannerH;
    }

    /**
     * Set 广告位高度
     * @param ImpBannerH 广告位高度
     */
    public void setImpBannerH(Long ImpBannerH) {
        this.ImpBannerH = ImpBannerH;
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
     * Get 上下文信息 
     * @return Context 上下文信息
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 上下文信息
     * @param Context 上下文信息
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 渠道 
     * @return Channel 渠道
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 渠道
     * @param Channel 渠道
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 请求ID 
     * @return ReqId 请求ID
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set 请求ID
     * @param ReqId 请求ID
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    /**
     * Get 请求ID的md5值 
     * @return ReqMd5 请求ID的md5值
     */
    public String getReqMd5() {
        return this.ReqMd5;
    }

    /**
     * Set 请求ID的md5值
     * @param ReqMd5 请求ID的md5值
     */
    public void setReqMd5(String ReqMd5) {
        this.ReqMd5 = ReqMd5;
    }

    /**
     * Get ad_type 
     * @return AdType ad_type
     */
    public Long getAdType() {
        return this.AdType;
    }

    /**
     * Set ad_type
     * @param AdType ad_type
     */
    public void setAdType(Long AdType) {
        this.AdType = AdType;
    }

    /**
     * Get app name 
     * @return AppName app name
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app name
     * @param AppName app name
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get appVer 
     * @return AppVer appVer
     */
    public String getAppVer() {
        return this.AppVer;
    }

    /**
     * Set appVer
     * @param AppVer appVer
     */
    public void setAppVer(String AppVer) {
        this.AppVer = AppVer;
    }

    /**
     * Get 竞价模式1：rtb 2:pd 
     * @return ReqType 竞价模式1：rtb 2:pd
     */
    public Long getReqType() {
        return this.ReqType;
    }

    /**
     * Set 竞价模式1：rtb 2:pd
     * @param ReqType 竞价模式1：rtb 2:pd
     */
    public void setReqType(Long ReqType) {
        this.ReqType = ReqType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamArraySimple(map, prefix + "ModelIdList.", this.ModelIdList);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "Osv", this.Osv);
        this.setParamSimple(map, prefix + "Lat", this.Lat);
        this.setParamSimple(map, prefix + "Lon", this.Lon);
        this.setParamSimple(map, prefix + "DeviceModel", this.DeviceModel);
        this.setParamSimple(map, prefix + "BidFloor", this.BidFloor);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "DeliveryMode", this.DeliveryMode);
        this.setParamSimple(map, prefix + "AdvertisingType", this.AdvertisingType);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Ua", this.Ua);
        this.setParamSimple(map, prefix + "App", this.App);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "Maker", this.Maker);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "Sp", this.Sp);
        this.setParamSimple(map, prefix + "DeviceW", this.DeviceW);
        this.setParamSimple(map, prefix + "DeviceH", this.DeviceH);
        this.setParamSimple(map, prefix + "FullScreen", this.FullScreen);
        this.setParamSimple(map, prefix + "ImpBannerW", this.ImpBannerW);
        this.setParamSimple(map, prefix + "ImpBannerH", this.ImpBannerH);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);
        this.setParamSimple(map, prefix + "ReqMd5", this.ReqMd5);
        this.setParamSimple(map, prefix + "AdType", this.AdType);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVer", this.AppVer);
        this.setParamSimple(map, prefix + "ReqType", this.ReqType);

    }
}

