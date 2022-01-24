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
package com.tencentcloudapi.ims.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel{

    /**
    * 该字段表示业务用户对应设备的IP地址，同时**支持IPv4和IPv6**地址的记录；需要与IpType参数配合使用。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 该字段表示业务用户对应的MAC地址，以方便设备识别与管理；其格式与取值与标准MAC地址一致。
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * *内测中，敬请期待。*
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * *内测中，敬请期待。*
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 该字段表示业务用户对应设备的**IMEI码**（国际移动设备识别码），该识别码可用于识别每一部独立的手机等移动通信设备，方便设备识别与管理。<br>备注：格式为**15-17位纯数字**。
    */
    @SerializedName("IMEI")
    @Expose
    private String IMEI;

    /**
    * **iOS设备专用**，该字段表示业务用户对应的**IDFA**(广告标识符),这是由苹果公司提供的用于标识用户的广告标识符，由一串16进制的32位数字和字母组成。<br>
备注：苹果公司自2021年iOS14更新后允许用户手动关闭或者开启IDFA，故此字符串标记有效性可能有所降低。
    */
    @SerializedName("IDFA")
    @Expose
    private String IDFA;

    /**
    * **iOS设备专用**，该字段表示业务用户对应的**IDFV**(应用开发商标识符),这是由苹果公司提供的用于标注应用开发商的标识符，由一串16进制的32位数字和字母组成，可被用于唯一标识设备。
    */
    @SerializedName("IDFV")
    @Expose
    private String IDFV;

    /**
    * 该字段表示记录的IP地址的类型，取值：**0**（代表IPv4地址）、**1**（代表IPv6地址）；需要与IpType参数配合使用。
    */
    @SerializedName("IpType")
    @Expose
    private Long IpType;

    /**
     * Get 该字段表示业务用户对应设备的IP地址，同时**支持IPv4和IPv6**地址的记录；需要与IpType参数配合使用。 
     * @return Ip 该字段表示业务用户对应设备的IP地址，同时**支持IPv4和IPv6**地址的记录；需要与IpType参数配合使用。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 该字段表示业务用户对应设备的IP地址，同时**支持IPv4和IPv6**地址的记录；需要与IpType参数配合使用。
     * @param Ip 该字段表示业务用户对应设备的IP地址，同时**支持IPv4和IPv6**地址的记录；需要与IpType参数配合使用。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 该字段表示业务用户对应的MAC地址，以方便设备识别与管理；其格式与取值与标准MAC地址一致。 
     * @return Mac 该字段表示业务用户对应的MAC地址，以方便设备识别与管理；其格式与取值与标准MAC地址一致。
     */
    public String getMac() {
        return this.Mac;
    }

    /**
     * Set 该字段表示业务用户对应的MAC地址，以方便设备识别与管理；其格式与取值与标准MAC地址一致。
     * @param Mac 该字段表示业务用户对应的MAC地址，以方便设备识别与管理；其格式与取值与标准MAC地址一致。
     */
    public void setMac(String Mac) {
        this.Mac = Mac;
    }

    /**
     * Get *内测中，敬请期待。* 
     * @return TokenId *内测中，敬请期待。*
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set *内测中，敬请期待。*
     * @param TokenId *内测中，敬请期待。*
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get *内测中，敬请期待。* 
     * @return DeviceId *内测中，敬请期待。*
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set *内测中，敬请期待。*
     * @param DeviceId *内测中，敬请期待。*
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 该字段表示业务用户对应设备的**IMEI码**（国际移动设备识别码），该识别码可用于识别每一部独立的手机等移动通信设备，方便设备识别与管理。<br>备注：格式为**15-17位纯数字**。 
     * @return IMEI 该字段表示业务用户对应设备的**IMEI码**（国际移动设备识别码），该识别码可用于识别每一部独立的手机等移动通信设备，方便设备识别与管理。<br>备注：格式为**15-17位纯数字**。
     */
    public String getIMEI() {
        return this.IMEI;
    }

    /**
     * Set 该字段表示业务用户对应设备的**IMEI码**（国际移动设备识别码），该识别码可用于识别每一部独立的手机等移动通信设备，方便设备识别与管理。<br>备注：格式为**15-17位纯数字**。
     * @param IMEI 该字段表示业务用户对应设备的**IMEI码**（国际移动设备识别码），该识别码可用于识别每一部独立的手机等移动通信设备，方便设备识别与管理。<br>备注：格式为**15-17位纯数字**。
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * Get **iOS设备专用**，该字段表示业务用户对应的**IDFA**(广告标识符),这是由苹果公司提供的用于标识用户的广告标识符，由一串16进制的32位数字和字母组成。<br>
备注：苹果公司自2021年iOS14更新后允许用户手动关闭或者开启IDFA，故此字符串标记有效性可能有所降低。 
     * @return IDFA **iOS设备专用**，该字段表示业务用户对应的**IDFA**(广告标识符),这是由苹果公司提供的用于标识用户的广告标识符，由一串16进制的32位数字和字母组成。<br>
备注：苹果公司自2021年iOS14更新后允许用户手动关闭或者开启IDFA，故此字符串标记有效性可能有所降低。
     */
    public String getIDFA() {
        return this.IDFA;
    }

    /**
     * Set **iOS设备专用**，该字段表示业务用户对应的**IDFA**(广告标识符),这是由苹果公司提供的用于标识用户的广告标识符，由一串16进制的32位数字和字母组成。<br>
备注：苹果公司自2021年iOS14更新后允许用户手动关闭或者开启IDFA，故此字符串标记有效性可能有所降低。
     * @param IDFA **iOS设备专用**，该字段表示业务用户对应的**IDFA**(广告标识符),这是由苹果公司提供的用于标识用户的广告标识符，由一串16进制的32位数字和字母组成。<br>
备注：苹果公司自2021年iOS14更新后允许用户手动关闭或者开启IDFA，故此字符串标记有效性可能有所降低。
     */
    public void setIDFA(String IDFA) {
        this.IDFA = IDFA;
    }

    /**
     * Get **iOS设备专用**，该字段表示业务用户对应的**IDFV**(应用开发商标识符),这是由苹果公司提供的用于标注应用开发商的标识符，由一串16进制的32位数字和字母组成，可被用于唯一标识设备。 
     * @return IDFV **iOS设备专用**，该字段表示业务用户对应的**IDFV**(应用开发商标识符),这是由苹果公司提供的用于标注应用开发商的标识符，由一串16进制的32位数字和字母组成，可被用于唯一标识设备。
     */
    public String getIDFV() {
        return this.IDFV;
    }

    /**
     * Set **iOS设备专用**，该字段表示业务用户对应的**IDFV**(应用开发商标识符),这是由苹果公司提供的用于标注应用开发商的标识符，由一串16进制的32位数字和字母组成，可被用于唯一标识设备。
     * @param IDFV **iOS设备专用**，该字段表示业务用户对应的**IDFV**(应用开发商标识符),这是由苹果公司提供的用于标注应用开发商的标识符，由一串16进制的32位数字和字母组成，可被用于唯一标识设备。
     */
    public void setIDFV(String IDFV) {
        this.IDFV = IDFV;
    }

    /**
     * Get 该字段表示记录的IP地址的类型，取值：**0**（代表IPv4地址）、**1**（代表IPv6地址）；需要与IpType参数配合使用。 
     * @return IpType 该字段表示记录的IP地址的类型，取值：**0**（代表IPv4地址）、**1**（代表IPv6地址）；需要与IpType参数配合使用。
     */
    public Long getIpType() {
        return this.IpType;
    }

    /**
     * Set 该字段表示记录的IP地址的类型，取值：**0**（代表IPv4地址）、**1**（代表IPv6地址）；需要与IpType参数配合使用。
     * @param IpType 该字段表示记录的IP地址的类型，取值：**0**（代表IPv4地址）、**1**（代表IPv6地址）；需要与IpType参数配合使用。
     */
    public void setIpType(Long IpType) {
        this.IpType = IpType;
    }

    public Device() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Device(Device source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Mac != null) {
            this.Mac = new String(source.Mac);
        }
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.IMEI != null) {
            this.IMEI = new String(source.IMEI);
        }
        if (source.IDFA != null) {
            this.IDFA = new String(source.IDFA);
        }
        if (source.IDFV != null) {
            this.IDFV = new String(source.IDFV);
        }
        if (source.IpType != null) {
            this.IpType = new Long(source.IpType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "IMEI", this.IMEI);
        this.setParamSimple(map, prefix + "IDFA", this.IDFA);
        this.setParamSimple(map, prefix + "IDFV", this.IDFV);
        this.setParamSimple(map, prefix + "IpType", this.IpType);

    }
}

