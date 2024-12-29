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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSLConfig extends AbstractModel {

    /**
    * SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
    */
    @SerializedName("SSLValidityPeriod")
    @Expose
    private String SSLValidityPeriod;

    /**
    * SSL证书有效性，0-无效，1-有效
    */
    @SerializedName("SSLValidity")
    @Expose
    private Long SSLValidity;

    /**
    * 是否是KMS的CMK证书
    */
    @SerializedName("IsKMS")
    @Expose
    private Long IsKMS;

    /**
    * KMS中购买的用户主密钥ID（CMK）
    */
    @SerializedName("CMKId")
    @Expose
    private String CMKId;

    /**
    * CMK所属的地域，不同地域的CMK数据不互通
    */
    @SerializedName("CMKRegion")
    @Expose
    private String CMKRegion;

    /**
     * Get SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行 
     * @return Encryption SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
     * @param Encryption SSL加密状态，
enable-已开启
disable-未开启
enable_doing-开启中
disable_doing-关闭中
renew_doing-更新中
wait_doing-等待维护时间内执行
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS 
     * @return SSLValidityPeriod SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
     */
    public String getSSLValidityPeriod() {
        return this.SSLValidityPeriod;
    }

    /**
     * Set SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
     * @param SSLValidityPeriod SSL证书有效期，时间格式 YYYY-MM-DD HH:MM:SS
     */
    public void setSSLValidityPeriod(String SSLValidityPeriod) {
        this.SSLValidityPeriod = SSLValidityPeriod;
    }

    /**
     * Get SSL证书有效性，0-无效，1-有效 
     * @return SSLValidity SSL证书有效性，0-无效，1-有效
     */
    public Long getSSLValidity() {
        return this.SSLValidity;
    }

    /**
     * Set SSL证书有效性，0-无效，1-有效
     * @param SSLValidity SSL证书有效性，0-无效，1-有效
     */
    public void setSSLValidity(Long SSLValidity) {
        this.SSLValidity = SSLValidity;
    }

    /**
     * Get 是否是KMS的CMK证书 
     * @return IsKMS 是否是KMS的CMK证书
     */
    public Long getIsKMS() {
        return this.IsKMS;
    }

    /**
     * Set 是否是KMS的CMK证书
     * @param IsKMS 是否是KMS的CMK证书
     */
    public void setIsKMS(Long IsKMS) {
        this.IsKMS = IsKMS;
    }

    /**
     * Get KMS中购买的用户主密钥ID（CMK） 
     * @return CMKId KMS中购买的用户主密钥ID（CMK）
     */
    public String getCMKId() {
        return this.CMKId;
    }

    /**
     * Set KMS中购买的用户主密钥ID（CMK）
     * @param CMKId KMS中购买的用户主密钥ID（CMK）
     */
    public void setCMKId(String CMKId) {
        this.CMKId = CMKId;
    }

    /**
     * Get CMK所属的地域，不同地域的CMK数据不互通 
     * @return CMKRegion CMK所属的地域，不同地域的CMK数据不互通
     */
    public String getCMKRegion() {
        return this.CMKRegion;
    }

    /**
     * Set CMK所属的地域，不同地域的CMK数据不互通
     * @param CMKRegion CMK所属的地域，不同地域的CMK数据不互通
     */
    public void setCMKRegion(String CMKRegion) {
        this.CMKRegion = CMKRegion;
    }

    public SSLConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSLConfig(SSLConfig source) {
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.SSLValidityPeriod != null) {
            this.SSLValidityPeriod = new String(source.SSLValidityPeriod);
        }
        if (source.SSLValidity != null) {
            this.SSLValidity = new Long(source.SSLValidity);
        }
        if (source.IsKMS != null) {
            this.IsKMS = new Long(source.IsKMS);
        }
        if (source.CMKId != null) {
            this.CMKId = new String(source.CMKId);
        }
        if (source.CMKRegion != null) {
            this.CMKRegion = new String(source.CMKRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Encryption", this.Encryption);
        this.setParamSimple(map, prefix + "SSLValidityPeriod", this.SSLValidityPeriod);
        this.setParamSimple(map, prefix + "SSLValidity", this.SSLValidity);
        this.setParamSimple(map, prefix + "IsKMS", this.IsKMS);
        this.setParamSimple(map, prefix + "CMKId", this.CMKId);
        this.setParamSimple(map, prefix + "CMKRegion", this.CMKRegion);

    }
}

