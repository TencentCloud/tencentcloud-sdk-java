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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentMsgGjh extends AbstractModel{

    /**
    * 发表消息设备IP类型，0x0代表IP地址是ipv4，0x1代表是IPv6，默认为0，即IPv4。
    */
    @SerializedName("CIPType")
    @Expose
    private String CIPType;

    /**
    * 发表消息设备IPv4地址，没有可以为空字符串；
    */
    @SerializedName("StrMsgIP")
    @Expose
    private String StrMsgIP;

    /**
    * 发表消息设备IPv6地址，没有可以为空字符串。
    */
    @SerializedName("StrMsgIPv6")
    @Expose
    private String StrMsgIPv6;

    /**
    * 消息发表时间戳。
    */
    @SerializedName("UiPostTime")
    @Expose
    private Long UiPostTime;

    /**
     * Get 发表消息设备IP类型，0x0代表IP地址是ipv4，0x1代表是IPv6，默认为0，即IPv4。 
     * @return CIPType 发表消息设备IP类型，0x0代表IP地址是ipv4，0x1代表是IPv6，默认为0，即IPv4。
     */
    public String getCIPType() {
        return this.CIPType;
    }

    /**
     * Set 发表消息设备IP类型，0x0代表IP地址是ipv4，0x1代表是IPv6，默认为0，即IPv4。
     * @param CIPType 发表消息设备IP类型，0x0代表IP地址是ipv4，0x1代表是IPv6，默认为0，即IPv4。
     */
    public void setCIPType(String CIPType) {
        this.CIPType = CIPType;
    }

    /**
     * Get 发表消息设备IPv4地址，没有可以为空字符串； 
     * @return StrMsgIP 发表消息设备IPv4地址，没有可以为空字符串；
     */
    public String getStrMsgIP() {
        return this.StrMsgIP;
    }

    /**
     * Set 发表消息设备IPv4地址，没有可以为空字符串；
     * @param StrMsgIP 发表消息设备IPv4地址，没有可以为空字符串；
     */
    public void setStrMsgIP(String StrMsgIP) {
        this.StrMsgIP = StrMsgIP;
    }

    /**
     * Get 发表消息设备IPv6地址，没有可以为空字符串。 
     * @return StrMsgIPv6 发表消息设备IPv6地址，没有可以为空字符串。
     */
    public String getStrMsgIPv6() {
        return this.StrMsgIPv6;
    }

    /**
     * Set 发表消息设备IPv6地址，没有可以为空字符串。
     * @param StrMsgIPv6 发表消息设备IPv6地址，没有可以为空字符串。
     */
    public void setStrMsgIPv6(String StrMsgIPv6) {
        this.StrMsgIPv6 = StrMsgIPv6;
    }

    /**
     * Get 消息发表时间戳。 
     * @return UiPostTime 消息发表时间戳。
     */
    public Long getUiPostTime() {
        return this.UiPostTime;
    }

    /**
     * Set 消息发表时间戳。
     * @param UiPostTime 消息发表时间戳。
     */
    public void setUiPostTime(Long UiPostTime) {
        this.UiPostTime = UiPostTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CIPType", this.CIPType);
        this.setParamSimple(map, prefix + "StrMsgIP", this.StrMsgIP);
        this.setParamSimple(map, prefix + "StrMsgIPv6", this.StrMsgIPv6);
        this.setParamSimple(map, prefix + "UiPostTime", this.UiPostTime);

    }
}

