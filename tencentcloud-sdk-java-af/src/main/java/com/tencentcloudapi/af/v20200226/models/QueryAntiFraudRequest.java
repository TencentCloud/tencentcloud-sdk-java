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
package com.tencentcloudapi.af.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAntiFraudRequest extends AbstractModel{

    /**
    * 电话号码(五选二)
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * Id(五选二)
    */
    @SerializedName("IdNumber")
    @Expose
    private String IdNumber;

    /**
    * 银行卡号(五选二)
    */
    @SerializedName("BankCardNumber")
    @Expose
    private String BankCardNumber;

    /**
    * 用户请求来源 IP(五选二)
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 国际移动设备识别码(五选二)
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * ios 系统广告标示符(五选二)
    */
    @SerializedName("Idfa")
    @Expose
    private String Idfa;

    /**
    * 业务场景 ID，需要找技术对接
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户邮箱地址
    */
    @SerializedName("EmailAddress")
    @Expose
    private String EmailAddress;

    /**
    * 用户住址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * MAC 地址
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * 国际移动用户识别码
    */
    @SerializedName("Imsi")
    @Expose
    private String Imsi;

    /**
    * 关联的腾讯帐号 QQ：1；
开放帐号微信： 2；
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 可选的 QQ 或微信 openid
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * qq 或微信分配给网站或应用的 appid，用来
唯一标识网站或应用
    */
    @SerializedName("AppIdU")
    @Expose
    private String AppIdU;

    /**
    * WIFI MAC
    */
    @SerializedName("WifiMac")
    @Expose
    private String WifiMac;

    /**
    * WIFI 服务集标识
    */
    @SerializedName("WifiSSID")
    @Expose
    private String WifiSSID;

    /**
    * WIFI-BSSID
    */
    @SerializedName("WifiBSSID")
    @Expose
    private String WifiBSSID;

    /**
    * 业务 ID，在多个业务中使用此服务，通过此
ID 区分统计数据
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * Id加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
    */
    @SerializedName("IdCryptoType")
    @Expose
    private String IdCryptoType;

    /**
    * 手机号加密类型
0：不加密（默认值）
1：md5, 2：sha256
3：SM3
    */
    @SerializedName("PhoneCryptoType")
    @Expose
    private String PhoneCryptoType;

    /**
    * 姓名加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
    */
    @SerializedName("NameCryptoType")
    @Expose
    private String NameCryptoType;

    /**
     * Get 电话号码(五选二) 
     * @return PhoneNumber 电话号码(五选二)
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 电话号码(五选二)
     * @param PhoneNumber 电话号码(五选二)
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get Id(五选二) 
     * @return IdNumber Id(五选二)
     */
    public String getIdNumber() {
        return this.IdNumber;
    }

    /**
     * Set Id(五选二)
     * @param IdNumber Id(五选二)
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * Get 银行卡号(五选二) 
     * @return BankCardNumber 银行卡号(五选二)
     */
    public String getBankCardNumber() {
        return this.BankCardNumber;
    }

    /**
     * Set 银行卡号(五选二)
     * @param BankCardNumber 银行卡号(五选二)
     */
    public void setBankCardNumber(String BankCardNumber) {
        this.BankCardNumber = BankCardNumber;
    }

    /**
     * Get 用户请求来源 IP(五选二) 
     * @return UserIp 用户请求来源 IP(五选二)
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户请求来源 IP(五选二)
     * @param UserIp 用户请求来源 IP(五选二)
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 国际移动设备识别码(五选二) 
     * @return Imei 国际移动设备识别码(五选二)
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 国际移动设备识别码(五选二)
     * @param Imei 国际移动设备识别码(五选二)
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get ios 系统广告标示符(五选二) 
     * @return Idfa ios 系统广告标示符(五选二)
     */
    public String getIdfa() {
        return this.Idfa;
    }

    /**
     * Set ios 系统广告标示符(五选二)
     * @param Idfa ios 系统广告标示符(五选二)
     */
    public void setIdfa(String Idfa) {
        this.Idfa = Idfa;
    }

    /**
     * Get 业务场景 ID，需要找技术对接 
     * @return Scene 业务场景 ID，需要找技术对接
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 业务场景 ID，需要找技术对接
     * @param Scene 业务场景 ID，需要找技术对接
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 姓名 
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户邮箱地址 
     * @return EmailAddress 用户邮箱地址
     */
    public String getEmailAddress() {
        return this.EmailAddress;
    }

    /**
     * Set 用户邮箱地址
     * @param EmailAddress 用户邮箱地址
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * Get 用户住址 
     * @return Address 用户住址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 用户住址
     * @param Address 用户住址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get MAC 地址 
     * @return Mac MAC 地址
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set MAC 地址
     * @param Mac MAC 地址
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get 国际移动用户识别码 
     * @return Imsi 国际移动用户识别码
     */
    public String getImsi() {
        return this.Imsi;
    }

    /**
     * Set 国际移动用户识别码
     * @param Imsi 国际移动用户识别码
     */
    public void setImsi(String Imsi) {
        this.Imsi = Imsi;
    }

    /**
     * Get 关联的腾讯帐号 QQ：1；
开放帐号微信： 2； 
     * @return AccountType 关联的腾讯帐号 QQ：1；
开放帐号微信： 2；
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 关联的腾讯帐号 QQ：1；
开放帐号微信： 2；
     * @param AccountType 关联的腾讯帐号 QQ：1；
开放帐号微信： 2；
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 可选的 QQ 或微信 openid 
     * @return Uid 可选的 QQ 或微信 openid
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 可选的 QQ 或微信 openid
     * @param Uid 可选的 QQ 或微信 openid
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get qq 或微信分配给网站或应用的 appid，用来
唯一标识网站或应用 
     * @return AppIdU qq 或微信分配给网站或应用的 appid，用来
唯一标识网站或应用
     */
    public String getAppIdU() {
        return this.AppIdU;
    }

    /**
     * Set qq 或微信分配给网站或应用的 appid，用来
唯一标识网站或应用
     * @param AppIdU qq 或微信分配给网站或应用的 appid，用来
唯一标识网站或应用
     */
    public void setAppIdU(String AppIdU) {
        this.AppIdU = AppIdU;
    }

    /**
     * Get WIFI MAC 
     * @return WifiMac WIFI MAC
     */
    public String getWifiMac() {
        return this.WifiMac;
    }

    /**
     * Set WIFI MAC
     * @param WifiMac WIFI MAC
     */
    public void setWifiMac(String WifiMac) {
        this.WifiMac = WifiMac;
    }

    /**
     * Get WIFI 服务集标识 
     * @return WifiSSID WIFI 服务集标识
     */
    public String getWifiSSID() {
        return this.WifiSSID;
    }

    /**
     * Set WIFI 服务集标识
     * @param WifiSSID WIFI 服务集标识
     */
    public void setWifiSSID(String WifiSSID) {
        this.WifiSSID = WifiSSID;
    }

    /**
     * Get WIFI-BSSID 
     * @return WifiBSSID WIFI-BSSID
     */
    public String getWifiBSSID() {
        return this.WifiBSSID;
    }

    /**
     * Set WIFI-BSSID
     * @param WifiBSSID WIFI-BSSID
     */
    public void setWifiBSSID(String WifiBSSID) {
        this.WifiBSSID = WifiBSSID;
    }

    /**
     * Get 业务 ID，在多个业务中使用此服务，通过此
ID 区分统计数据 
     * @return BusinessId 业务 ID，在多个业务中使用此服务，通过此
ID 区分统计数据
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务 ID，在多个业务中使用此服务，通过此
ID 区分统计数据
     * @param BusinessId 业务 ID，在多个业务中使用此服务，通过此
ID 区分统计数据
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get Id加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3 
     * @return IdCryptoType Id加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
     */
    public String getIdCryptoType() {
        return this.IdCryptoType;
    }

    /**
     * Set Id加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
     * @param IdCryptoType Id加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
     */
    public void setIdCryptoType(String IdCryptoType) {
        this.IdCryptoType = IdCryptoType;
    }

    /**
     * Get 手机号加密类型
0：不加密（默认值）
1：md5, 2：sha256
3：SM3 
     * @return PhoneCryptoType 手机号加密类型
0：不加密（默认值）
1：md5, 2：sha256
3：SM3
     */
    public String getPhoneCryptoType() {
        return this.PhoneCryptoType;
    }

    /**
     * Set 手机号加密类型
0：不加密（默认值）
1：md5, 2：sha256
3：SM3
     * @param PhoneCryptoType 手机号加密类型
0：不加密（默认值）
1：md5, 2：sha256
3：SM3
     */
    public void setPhoneCryptoType(String PhoneCryptoType) {
        this.PhoneCryptoType = PhoneCryptoType;
    }

    /**
     * Get 姓名加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3 
     * @return NameCryptoType 姓名加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
     */
    public String getNameCryptoType() {
        return this.NameCryptoType;
    }

    /**
     * Set 姓名加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
     * @param NameCryptoType 姓名加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
     */
    public void setNameCryptoType(String NameCryptoType) {
        this.NameCryptoType = NameCryptoType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "IdNumber", this.IdNumber);
        this.setParamSimple(map, prefix + "BankCardNumber", this.BankCardNumber);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Idfa", this.Idfa);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EmailAddress", this.EmailAddress);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "Imsi", this.Imsi);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "AppIdU", this.AppIdU);
        this.setParamSimple(map, prefix + "WifiMac", this.WifiMac);
        this.setParamSimple(map, prefix + "WifiSSID", this.WifiSSID);
        this.setParamSimple(map, prefix + "WifiBSSID", this.WifiBSSID);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "IdCryptoType", this.IdCryptoType);
        this.setParamSimple(map, prefix + "PhoneCryptoType", this.PhoneCryptoType);
        this.setParamSimple(map, prefix + "NameCryptoType", this.NameCryptoType);

    }
}

