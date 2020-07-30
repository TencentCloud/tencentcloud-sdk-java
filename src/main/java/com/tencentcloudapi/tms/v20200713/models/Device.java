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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Device extends AbstractModel{

    /**
    * 用户IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Mac地址
    */
    @SerializedName("Mac")
    @Expose
    private String Mac;

    /**
    * 设备指纹Token
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * 设备指纹ID
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备序列号
    */
    @SerializedName("IMEI")
    @Expose
    private String IMEI;

    /**
    * IOS设备，Identifier For Advertising（广告标识符）
    */
    @SerializedName("IDFA")
    @Expose
    private String IDFA;

    /**
    * IOS设备，IDFV - Identifier For Vendor（应用开发商标识符）
    */
    @SerializedName("IDFV")
    @Expose
    private String IDFV;

    /**
     * Get 用户IP 
     * @return IP 用户IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 用户IP
     * @param IP 用户IP
     */
    public void setIP(String IP) {
        this.IP = IP;
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
     * Get 设备指纹Token 
     * @return TokenId 设备指纹Token
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set 设备指纹Token
     * @param TokenId 设备指纹Token
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get 设备指纹ID 
     * @return DeviceId 设备指纹ID
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备指纹ID
     * @param DeviceId 设备指纹ID
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备序列号 
     * @return IMEI 设备序列号
     */
    public String getIMEI() {
        return this.IMEI;
    }

    /**
     * Set 设备序列号
     * @param IMEI 设备序列号
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * Get IOS设备，Identifier For Advertising（广告标识符） 
     * @return IDFA IOS设备，Identifier For Advertising（广告标识符）
     */
    public String getIDFA() {
        return this.IDFA;
    }

    /**
     * Set IOS设备，Identifier For Advertising（广告标识符）
     * @param IDFA IOS设备，Identifier For Advertising（广告标识符）
     */
    public void setIDFA(String IDFA) {
        this.IDFA = IDFA;
    }

    /**
     * Get IOS设备，IDFV - Identifier For Vendor（应用开发商标识符） 
     * @return IDFV IOS设备，IDFV - Identifier For Vendor（应用开发商标识符）
     */
    public String getIDFV() {
        return this.IDFV;
    }

    /**
     * Set IOS设备，IDFV - Identifier For Vendor（应用开发商标识符）
     * @param IDFV IOS设备，IDFV - Identifier For Vendor（应用开发商标识符）
     */
    public void setIDFV(String IDFV) {
        this.IDFV = IDFV;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Mac", this.Mac);
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "IMEI", this.IMEI);
        this.setParamSimple(map, prefix + "IDFA", this.IDFA);
        this.setParamSimple(map, prefix + "IDFV", this.IDFV);

    }
}

