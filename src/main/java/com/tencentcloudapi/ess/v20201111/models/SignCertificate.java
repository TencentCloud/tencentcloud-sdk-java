/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignCertificate extends AbstractModel {

    /**
    * 证书序列号
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * 证书持有者名称
    */
    @SerializedName("CommonName")
    @Expose
    private String CommonName;

    /**
    * 证书生效时间
    */
    @SerializedName("NotBefore")
    @Expose
    private Long NotBefore;

    /**
    * 证书失效时间
    */
    @SerializedName("NotAfter")
    @Expose
    private Long NotAfter;

    /**
    * 证书颁发者名称
    */
    @SerializedName("IssuerCommonName")
    @Expose
    private String IssuerCommonName;

    /**
     * Get 证书序列号 
     * @return SerialNumber 证书序列号
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set 证书序列号
     * @param SerialNumber 证书序列号
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    /**
     * Get 证书持有者名称 
     * @return CommonName 证书持有者名称
     */
    public String getCommonName() {
        return this.CommonName;
    }

    /**
     * Set 证书持有者名称
     * @param CommonName 证书持有者名称
     */
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }

    /**
     * Get 证书生效时间 
     * @return NotBefore 证书生效时间
     */
    public Long getNotBefore() {
        return this.NotBefore;
    }

    /**
     * Set 证书生效时间
     * @param NotBefore 证书生效时间
     */
    public void setNotBefore(Long NotBefore) {
        this.NotBefore = NotBefore;
    }

    /**
     * Get 证书失效时间 
     * @return NotAfter 证书失效时间
     */
    public Long getNotAfter() {
        return this.NotAfter;
    }

    /**
     * Set 证书失效时间
     * @param NotAfter 证书失效时间
     */
    public void setNotAfter(Long NotAfter) {
        this.NotAfter = NotAfter;
    }

    /**
     * Get 证书颁发者名称 
     * @return IssuerCommonName 证书颁发者名称
     */
    public String getIssuerCommonName() {
        return this.IssuerCommonName;
    }

    /**
     * Set 证书颁发者名称
     * @param IssuerCommonName 证书颁发者名称
     */
    public void setIssuerCommonName(String IssuerCommonName) {
        this.IssuerCommonName = IssuerCommonName;
    }

    public SignCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignCertificate(SignCertificate source) {
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.CommonName != null) {
            this.CommonName = new String(source.CommonName);
        }
        if (source.NotBefore != null) {
            this.NotBefore = new Long(source.NotBefore);
        }
        if (source.NotAfter != null) {
            this.NotAfter = new Long(source.NotAfter);
        }
        if (source.IssuerCommonName != null) {
            this.IssuerCommonName = new String(source.IssuerCommonName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "CommonName", this.CommonName);
        this.setParamSimple(map, prefix + "NotBefore", this.NotBefore);
        this.setParamSimple(map, prefix + "NotAfter", this.NotAfter);
        this.setParamSimple(map, prefix + "IssuerCommonName", this.IssuerCommonName);

    }
}

