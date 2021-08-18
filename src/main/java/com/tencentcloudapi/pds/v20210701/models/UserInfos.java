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
package com.tencentcloudapi.pds.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserInfos extends AbstractModel{

    /**
    * 用户的手机号
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 用户的微信OpenID
    */
    @SerializedName("Openid")
    @Expose
    private String Openid;

    /**
    * 用户移动设备的客户端IP
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 用户WiFi的BSSID
    */
    @SerializedName("WiFiBssid")
    @Expose
    private String WiFiBssid;

    /**
    * 用户Android设备的IMEI
    */
    @SerializedName("IMEI")
    @Expose
    private String IMEI;

    /**
    * 用户Android设备的OAID
    */
    @SerializedName("OAID")
    @Expose
    private String OAID;

    /**
    * 用户iOS设备的IDFA
    */
    @SerializedName("IDFA")
    @Expose
    private String IDFA;

    /**
     * Get 用户的手机号 
     * @return PhoneNum 用户的手机号
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 用户的手机号
     * @param PhoneNum 用户的手机号
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 用户的微信OpenID 
     * @return Openid 用户的微信OpenID
     */
    public String getOpenid() {
        return this.Openid;
    }

    /**
     * Set 用户的微信OpenID
     * @param Openid 用户的微信OpenID
     */
    public void setOpenid(String Openid) {
        this.Openid = Openid;
    }

    /**
     * Get 用户移动设备的客户端IP 
     * @return IP 用户移动设备的客户端IP
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 用户移动设备的客户端IP
     * @param IP 用户移动设备的客户端IP
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 用户WiFi的BSSID 
     * @return WiFiBssid 用户WiFi的BSSID
     */
    public String getWiFiBssid() {
        return this.WiFiBssid;
    }

    /**
     * Set 用户WiFi的BSSID
     * @param WiFiBssid 用户WiFi的BSSID
     */
    public void setWiFiBssid(String WiFiBssid) {
        this.WiFiBssid = WiFiBssid;
    }

    /**
     * Get 用户Android设备的IMEI 
     * @return IMEI 用户Android设备的IMEI
     */
    public String getIMEI() {
        return this.IMEI;
    }

    /**
     * Set 用户Android设备的IMEI
     * @param IMEI 用户Android设备的IMEI
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * Get 用户Android设备的OAID 
     * @return OAID 用户Android设备的OAID
     */
    public String getOAID() {
        return this.OAID;
    }

    /**
     * Set 用户Android设备的OAID
     * @param OAID 用户Android设备的OAID
     */
    public void setOAID(String OAID) {
        this.OAID = OAID;
    }

    /**
     * Get 用户iOS设备的IDFA 
     * @return IDFA 用户iOS设备的IDFA
     */
    public String getIDFA() {
        return this.IDFA;
    }

    /**
     * Set 用户iOS设备的IDFA
     * @param IDFA 用户iOS设备的IDFA
     */
    public void setIDFA(String IDFA) {
        this.IDFA = IDFA;
    }

    public UserInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserInfos(UserInfos source) {
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Openid != null) {
            this.Openid = new String(source.Openid);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.WiFiBssid != null) {
            this.WiFiBssid = new String(source.WiFiBssid);
        }
        if (source.IMEI != null) {
            this.IMEI = new String(source.IMEI);
        }
        if (source.OAID != null) {
            this.OAID = new String(source.OAID);
        }
        if (source.IDFA != null) {
            this.IDFA = new String(source.IDFA);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Openid", this.Openid);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "WiFiBssid", this.WiFiBssid);
        this.setParamSimple(map, prefix + "IMEI", this.IMEI);
        this.setParamSimple(map, prefix + "OAID", this.OAID);
        this.setParamSimple(map, prefix + "IDFA", this.IDFA);

    }
}

