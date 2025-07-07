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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CertBasicInfo extends AbstractModel {

    /**
    * 颁发者
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * 颁发给
    */
    @SerializedName("Subject")
    @Expose
    private String Subject;

    /**
    * 证书指纹
    */
    @SerializedName("Fingerprint")
    @Expose
    private String Fingerprint;

    /**
    * 证书有效期开始时间
    */
    @SerializedName("ValidFrom")
    @Expose
    private String ValidFrom;

    /**
    * 证书有效期结束时间
    */
    @SerializedName("ValidTo")
    @Expose
    private String ValidTo;

    /**
     * Get 颁发者 
     * @return Issuer 颁发者
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set 颁发者
     * @param Issuer 颁发者
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get 颁发给 
     * @return Subject 颁发给
     */
    public String getSubject() {
        return this.Subject;
    }

    /**
     * Set 颁发给
     * @param Subject 颁发给
     */
    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    /**
     * Get 证书指纹 
     * @return Fingerprint 证书指纹
     */
    public String getFingerprint() {
        return this.Fingerprint;
    }

    /**
     * Set 证书指纹
     * @param Fingerprint 证书指纹
     */
    public void setFingerprint(String Fingerprint) {
        this.Fingerprint = Fingerprint;
    }

    /**
     * Get 证书有效期开始时间 
     * @return ValidFrom 证书有效期开始时间
     */
    public String getValidFrom() {
        return this.ValidFrom;
    }

    /**
     * Set 证书有效期开始时间
     * @param ValidFrom 证书有效期开始时间
     */
    public void setValidFrom(String ValidFrom) {
        this.ValidFrom = ValidFrom;
    }

    /**
     * Get 证书有效期结束时间 
     * @return ValidTo 证书有效期结束时间
     */
    public String getValidTo() {
        return this.ValidTo;
    }

    /**
     * Set 证书有效期结束时间
     * @param ValidTo 证书有效期结束时间
     */
    public void setValidTo(String ValidTo) {
        this.ValidTo = ValidTo;
    }

    public CertBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertBasicInfo(CertBasicInfo source) {
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Subject != null) {
            this.Subject = new String(source.Subject);
        }
        if (source.Fingerprint != null) {
            this.Fingerprint = new String(source.Fingerprint);
        }
        if (source.ValidFrom != null) {
            this.ValidFrom = new String(source.ValidFrom);
        }
        if (source.ValidTo != null) {
            this.ValidTo = new String(source.ValidTo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Subject", this.Subject);
        this.setParamSimple(map, prefix + "Fingerprint", this.Fingerprint);
        this.setParamSimple(map, prefix + "ValidFrom", this.ValidFrom);
        this.setParamSimple(map, prefix + "ValidTo", this.ValidTo);

    }
}

