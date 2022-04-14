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

public class AntiFraudFilter extends AbstractModel{

    /**
    * 业务方账号 ID
    */
    @SerializedName("CustomerUin")
    @Expose
    private String CustomerUin;

    /**
    * 业务方APPID
    */
    @SerializedName("CustomerAppid")
    @Expose
    private String CustomerAppid;

    /**
    * 身份证号
注 1：下方 idCryptoType 为指定
加密方式
注 2：若 idNumber 加密则必传加
密方式
    */
    @SerializedName("IdNumber")
    @Expose
    private String IdNumber;

    /**
    * 手机号码（注：不需要带国家代码
例如：13430421011）
注 1：下方 phoneCryptoType 为
指定加密方式:
注 2：若 phoneNumber 加密则必
传加密方式
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 业务场景 ID
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 默认不使用，业务方子
账号，若接口使用密钥对应是子账
号则必填
    */
    @SerializedName("CustomerSubUin")
    @Expose
    private String CustomerSubUin;

    /**
    * 已获取约定标识则传 1；
用于基于特定需求而传的标识字段
注：有约定则是必传，若未传则查
询接口失败
    */
    @SerializedName("Authorization")
    @Expose
    private String Authorization;

    /**
    * 姓名
注 ：不支持加密
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 银行卡号
    */
    @SerializedName("BankCardNumber")
    @Expose
    private String BankCardNumber;

    /**
    * 用户请求来源 IP
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 国际移动设备识别码
    */
    @SerializedName("Imei")
    @Expose
    private String Imei;

    /**
    * ios 系统广告标示符
    */
    @SerializedName("Idfa")
    @Expose
    private String Idfa;

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
    * qq 或微信分配给网站或应用的
appid，用来唯一标识网站或应用
    */
    @SerializedName("AppIdU")
    @Expose
    private String AppIdU;

    /**
    * ＷＩＦＩＭＡＣ
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
    * 拓展字段类型 ID
注：默认不填写，需要时天御侧将
提供
    */
    @SerializedName("ExtensionId")
    @Expose
    private String ExtensionId;

    /**
    * 拓展字段内容
注：默认不填，需要时天御侧将提
供
    */
    @SerializedName("ExtensionIn")
    @Expose
    private String ExtensionIn;

    /**
    * 业务 ID，默认不传
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 身份证加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
注：若 idNumber 加密则必传加密
方式
    */
    @SerializedName("IdCryptoType")
    @Expose
    private String IdCryptoType;

    /**
    * 手机号加密类型
0：不加密（默认值）
1：md5,
2：sha256
3：SM3
注：若 phoneNumber 加密则必传
加密方式
    */
    @SerializedName("PhoneCryptoType")
    @Expose
    private String PhoneCryptoType;

    /**
    * 姓名加密类型：——注：已经不支持加
密，该字段存在是为了兼容可能历史客户
版本；
0：不加密（默认值）
1：md5
    */
    @SerializedName("NameCryptoType")
    @Expose
    private String NameCryptoType;

    /**
    * 是否使用旧回包
    */
    @SerializedName("OldResponseType")
    @Expose
    private String OldResponseType;

    /**
     * Get 业务方账号 ID 
     * @return CustomerUin 业务方账号 ID
     */
    public String getCustomerUin() {
        return this.CustomerUin;
    }

    /**
     * Set 业务方账号 ID
     * @param CustomerUin 业务方账号 ID
     */
    public void setCustomerUin(String CustomerUin) {
        this.CustomerUin = CustomerUin;
    }

    /**
     * Get 业务方APPID 
     * @return CustomerAppid 业务方APPID
     */
    public String getCustomerAppid() {
        return this.CustomerAppid;
    }

    /**
     * Set 业务方APPID
     * @param CustomerAppid 业务方APPID
     */
    public void setCustomerAppid(String CustomerAppid) {
        this.CustomerAppid = CustomerAppid;
    }

    /**
     * Get 身份证号
注 1：下方 idCryptoType 为指定
加密方式
注 2：若 idNumber 加密则必传加
密方式 
     * @return IdNumber 身份证号
注 1：下方 idCryptoType 为指定
加密方式
注 2：若 idNumber 加密则必传加
密方式
     */
    public String getIdNumber() {
        return this.IdNumber;
    }

    /**
     * Set 身份证号
注 1：下方 idCryptoType 为指定
加密方式
注 2：若 idNumber 加密则必传加
密方式
     * @param IdNumber 身份证号
注 1：下方 idCryptoType 为指定
加密方式
注 2：若 idNumber 加密则必传加
密方式
     */
    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    /**
     * Get 手机号码（注：不需要带国家代码
例如：13430421011）
注 1：下方 phoneCryptoType 为
指定加密方式:
注 2：若 phoneNumber 加密则必
传加密方式 
     * @return PhoneNumber 手机号码（注：不需要带国家代码
例如：13430421011）
注 1：下方 phoneCryptoType 为
指定加密方式:
注 2：若 phoneNumber 加密则必
传加密方式
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 手机号码（注：不需要带国家代码
例如：13430421011）
注 1：下方 phoneCryptoType 为
指定加密方式:
注 2：若 phoneNumber 加密则必
传加密方式
     * @param PhoneNumber 手机号码（注：不需要带国家代码
例如：13430421011）
注 1：下方 phoneCryptoType 为
指定加密方式:
注 2：若 phoneNumber 加密则必
传加密方式
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 业务场景 ID 
     * @return Scene 业务场景 ID
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set 业务场景 ID
     * @param Scene 业务场景 ID
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get 默认不使用，业务方子
账号，若接口使用密钥对应是子账
号则必填 
     * @return CustomerSubUin 默认不使用，业务方子
账号，若接口使用密钥对应是子账
号则必填
     */
    public String getCustomerSubUin() {
        return this.CustomerSubUin;
    }

    /**
     * Set 默认不使用，业务方子
账号，若接口使用密钥对应是子账
号则必填
     * @param CustomerSubUin 默认不使用，业务方子
账号，若接口使用密钥对应是子账
号则必填
     */
    public void setCustomerSubUin(String CustomerSubUin) {
        this.CustomerSubUin = CustomerSubUin;
    }

    /**
     * Get 已获取约定标识则传 1；
用于基于特定需求而传的标识字段
注：有约定则是必传，若未传则查
询接口失败 
     * @return Authorization 已获取约定标识则传 1；
用于基于特定需求而传的标识字段
注：有约定则是必传，若未传则查
询接口失败
     */
    public String getAuthorization() {
        return this.Authorization;
    }

    /**
     * Set 已获取约定标识则传 1；
用于基于特定需求而传的标识字段
注：有约定则是必传，若未传则查
询接口失败
     * @param Authorization 已获取约定标识则传 1；
用于基于特定需求而传的标识字段
注：有约定则是必传，若未传则查
询接口失败
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }

    /**
     * Get 姓名
注 ：不支持加密 
     * @return Name 姓名
注 ：不支持加密
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 姓名
注 ：不支持加密
     * @param Name 姓名
注 ：不支持加密
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 银行卡号 
     * @return BankCardNumber 银行卡号
     */
    public String getBankCardNumber() {
        return this.BankCardNumber;
    }

    /**
     * Set 银行卡号
     * @param BankCardNumber 银行卡号
     */
    public void setBankCardNumber(String BankCardNumber) {
        this.BankCardNumber = BankCardNumber;
    }

    /**
     * Get 用户请求来源 IP 
     * @return UserIp 用户请求来源 IP
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户请求来源 IP
     * @param UserIp 用户请求来源 IP
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 国际移动设备识别码 
     * @return Imei 国际移动设备识别码
     */
    public String getImei() {
        return this.Imei;
    }

    /**
     * Set 国际移动设备识别码
     * @param Imei 国际移动设备识别码
     */
    public void setImei(String Imei) {
        this.Imei = Imei;
    }

    /**
     * Get ios 系统广告标示符 
     * @return Idfa ios 系统广告标示符
     */
    public String getIdfa() {
        return this.Idfa;
    }

    /**
     * Set ios 系统广告标示符
     * @param Idfa ios 系统广告标示符
     */
    public void setIdfa(String Idfa) {
        this.Idfa = Idfa;
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
     * Get qq 或微信分配给网站或应用的
appid，用来唯一标识网站或应用 
     * @return AppIdU qq 或微信分配给网站或应用的
appid，用来唯一标识网站或应用
     */
    public String getAppIdU() {
        return this.AppIdU;
    }

    /**
     * Set qq 或微信分配给网站或应用的
appid，用来唯一标识网站或应用
     * @param AppIdU qq 或微信分配给网站或应用的
appid，用来唯一标识网站或应用
     */
    public void setAppIdU(String AppIdU) {
        this.AppIdU = AppIdU;
    }

    /**
     * Get ＷＩＦＩＭＡＣ 
     * @return WifiMac ＷＩＦＩＭＡＣ
     */
    public String getWifiMac() {
        return this.WifiMac;
    }

    /**
     * Set ＷＩＦＩＭＡＣ
     * @param WifiMac ＷＩＦＩＭＡＣ
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
     * Get 拓展字段类型 ID
注：默认不填写，需要时天御侧将
提供 
     * @return ExtensionId 拓展字段类型 ID
注：默认不填写，需要时天御侧将
提供
     */
    public String getExtensionId() {
        return this.ExtensionId;
    }

    /**
     * Set 拓展字段类型 ID
注：默认不填写，需要时天御侧将
提供
     * @param ExtensionId 拓展字段类型 ID
注：默认不填写，需要时天御侧将
提供
     */
    public void setExtensionId(String ExtensionId) {
        this.ExtensionId = ExtensionId;
    }

    /**
     * Get 拓展字段内容
注：默认不填，需要时天御侧将提
供 
     * @return ExtensionIn 拓展字段内容
注：默认不填，需要时天御侧将提
供
     */
    public String getExtensionIn() {
        return this.ExtensionIn;
    }

    /**
     * Set 拓展字段内容
注：默认不填，需要时天御侧将提
供
     * @param ExtensionIn 拓展字段内容
注：默认不填，需要时天御侧将提
供
     */
    public void setExtensionIn(String ExtensionIn) {
        this.ExtensionIn = ExtensionIn;
    }

    /**
     * Get 业务 ID，默认不传 
     * @return BusinessId 业务 ID，默认不传
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务 ID，默认不传
     * @param BusinessId 业务 ID，默认不传
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 身份证加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
注：若 idNumber 加密则必传加密
方式 
     * @return IdCryptoType 身份证加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
注：若 idNumber 加密则必传加密
方式
     */
    public String getIdCryptoType() {
        return this.IdCryptoType;
    }

    /**
     * Set 身份证加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
注：若 idNumber 加密则必传加密
方式
     * @param IdCryptoType 身份证加密类型
0：不加密（默认值）
1：md5
2：sha256
3：SM3
注：若 idNumber 加密则必传加密
方式
     */
    public void setIdCryptoType(String IdCryptoType) {
        this.IdCryptoType = IdCryptoType;
    }

    /**
     * Get 手机号加密类型
0：不加密（默认值）
1：md5,
2：sha256
3：SM3
注：若 phoneNumber 加密则必传
加密方式 
     * @return PhoneCryptoType 手机号加密类型
0：不加密（默认值）
1：md5,
2：sha256
3：SM3
注：若 phoneNumber 加密则必传
加密方式
     */
    public String getPhoneCryptoType() {
        return this.PhoneCryptoType;
    }

    /**
     * Set 手机号加密类型
0：不加密（默认值）
1：md5,
2：sha256
3：SM3
注：若 phoneNumber 加密则必传
加密方式
     * @param PhoneCryptoType 手机号加密类型
0：不加密（默认值）
1：md5,
2：sha256
3：SM3
注：若 phoneNumber 加密则必传
加密方式
     */
    public void setPhoneCryptoType(String PhoneCryptoType) {
        this.PhoneCryptoType = PhoneCryptoType;
    }

    /**
     * Get 姓名加密类型：——注：已经不支持加
密，该字段存在是为了兼容可能历史客户
版本；
0：不加密（默认值）
1：md5 
     * @return NameCryptoType 姓名加密类型：——注：已经不支持加
密，该字段存在是为了兼容可能历史客户
版本；
0：不加密（默认值）
1：md5
     */
    public String getNameCryptoType() {
        return this.NameCryptoType;
    }

    /**
     * Set 姓名加密类型：——注：已经不支持加
密，该字段存在是为了兼容可能历史客户
版本；
0：不加密（默认值）
1：md5
     * @param NameCryptoType 姓名加密类型：——注：已经不支持加
密，该字段存在是为了兼容可能历史客户
版本；
0：不加密（默认值）
1：md5
     */
    public void setNameCryptoType(String NameCryptoType) {
        this.NameCryptoType = NameCryptoType;
    }

    /**
     * Get 是否使用旧回包 
     * @return OldResponseType 是否使用旧回包
     */
    public String getOldResponseType() {
        return this.OldResponseType;
    }

    /**
     * Set 是否使用旧回包
     * @param OldResponseType 是否使用旧回包
     */
    public void setOldResponseType(String OldResponseType) {
        this.OldResponseType = OldResponseType;
    }

    public AntiFraudFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AntiFraudFilter(AntiFraudFilter source) {
        if (source.CustomerUin != null) {
            this.CustomerUin = new String(source.CustomerUin);
        }
        if (source.CustomerAppid != null) {
            this.CustomerAppid = new String(source.CustomerAppid);
        }
        if (source.IdNumber != null) {
            this.IdNumber = new String(source.IdNumber);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.CustomerSubUin != null) {
            this.CustomerSubUin = new String(source.CustomerSubUin);
        }
        if (source.Authorization != null) {
            this.Authorization = new String(source.Authorization);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BankCardNumber != null) {
            this.BankCardNumber = new String(source.BankCardNumber);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Imei != null) {
            this.Imei = new String(source.Imei);
        }
        if (source.Idfa != null) {
            this.Idfa = new String(source.Idfa);
        }
        if (source.EmailAddress != null) {
            this.EmailAddress = new String(source.EmailAddress);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.Imsi != null) {
            this.Imsi = new String(source.Imsi);
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.AppIdU != null) {
            this.AppIdU = new String(source.AppIdU);
        }
        if (source.WifiMac != null) {
            this.WifiMac = new String(source.WifiMac);
        }
        if (source.WifiSSID != null) {
            this.WifiSSID = new String(source.WifiSSID);
        }
        if (source.WifiBSSID != null) {
            this.WifiBSSID = new String(source.WifiBSSID);
        }
        if (source.ExtensionId != null) {
            this.ExtensionId = new String(source.ExtensionId);
        }
        if (source.ExtensionIn != null) {
            this.ExtensionIn = new String(source.ExtensionIn);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.IdCryptoType != null) {
            this.IdCryptoType = new String(source.IdCryptoType);
        }
        if (source.PhoneCryptoType != null) {
            this.PhoneCryptoType = new String(source.PhoneCryptoType);
        }
        if (source.NameCryptoType != null) {
            this.NameCryptoType = new String(source.NameCryptoType);
        }
        if (source.OldResponseType != null) {
            this.OldResponseType = new String(source.OldResponseType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerUin", this.CustomerUin);
        this.setParamSimple(map, prefix + "CustomerAppid", this.CustomerAppid);
        this.setParamSimple(map, prefix + "IdNumber", this.IdNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "CustomerSubUin", this.CustomerSubUin);
        this.setParamSimple(map, prefix + "Authorization", this.Authorization);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BankCardNumber", this.BankCardNumber);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Imei", this.Imei);
        this.setParamSimple(map, prefix + "Idfa", this.Idfa);
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
        this.setParamSimple(map, prefix + "ExtensionId", this.ExtensionId);
        this.setParamSimple(map, prefix + "ExtensionIn", this.ExtensionIn);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "IdCryptoType", this.IdCryptoType);
        this.setParamSimple(map, prefix + "PhoneCryptoType", this.PhoneCryptoType);
        this.setParamSimple(map, prefix + "NameCryptoType", this.NameCryptoType);
        this.setParamSimple(map, prefix + "OldResponseType", this.OldResponseType);

    }
}

