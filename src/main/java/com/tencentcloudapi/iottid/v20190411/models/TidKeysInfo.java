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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TidKeysInfo extends AbstractModel{

    /**
    * TID号码
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 公钥
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * 私钥
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 共享密钥
    */
    @SerializedName("Psk")
    @Expose
    private String Psk;

    /**
    * 软加固白盒密钥下载地址
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 软加固设备标识码
    */
    @SerializedName("DeviceCode")
    @Expose
    private String DeviceCode;

    /**
     * Get TID号码 
     * @return Tid TID号码
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set TID号码
     * @param Tid TID号码
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 公钥 
     * @return PublicKey 公钥
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥
     * @param PublicKey 公钥
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get 私钥 
     * @return PrivateKey 私钥
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set 私钥
     * @param PrivateKey 私钥
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get 共享密钥 
     * @return Psk 共享密钥
     */
    public String getPsk() {
        return this.Psk;
    }

    /**
     * Set 共享密钥
     * @param Psk 共享密钥
     */
    public void setPsk(String Psk) {
        this.Psk = Psk;
    }

    /**
     * Get 软加固白盒密钥下载地址 
     * @return DownloadUrl 软加固白盒密钥下载地址
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 软加固白盒密钥下载地址
     * @param DownloadUrl 软加固白盒密钥下载地址
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 软加固设备标识码 
     * @return DeviceCode 软加固设备标识码
     */
    public String getDeviceCode() {
        return this.DeviceCode;
    }

    /**
     * Set 软加固设备标识码
     * @param DeviceCode 软加固设备标识码
     */
    public void setDeviceCode(String DeviceCode) {
        this.DeviceCode = DeviceCode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "Psk", this.Psk);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "DeviceCode", this.DeviceCode);

    }
}

