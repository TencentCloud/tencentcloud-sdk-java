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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TDEConfigAttribute extends AbstractModel {

    /**
    * 是否已开通TDE加密，enable-已开通，disable-未开通
    */
    @SerializedName("Encryption")
    @Expose
    private String Encryption;

    /**
    * 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，none-表示没有证书
    */
    @SerializedName("CertificateAttribution")
    @Expose
    private String CertificateAttribution;

    /**
    * 开通TDE加密时引用的其他主账号ID
    */
    @SerializedName("QuoteUin")
    @Expose
    private String QuoteUin;

    /**
    * KMS中购买的用户主密钥ID（CMK）
    */
    @SerializedName("CMKId")
    @Expose
    private String CMKId;

    /**
    * CMK所属的地域，不同地域的CMK不互通
    */
    @SerializedName("CMKRegion")
    @Expose
    private String CMKRegion;

    /**
     * Get 是否已开通TDE加密，enable-已开通，disable-未开通 
     * @return Encryption 是否已开通TDE加密，enable-已开通，disable-未开通
     */
    public String getEncryption() {
        return this.Encryption;
    }

    /**
     * Set 是否已开通TDE加密，enable-已开通，disable-未开通
     * @param Encryption 是否已开通TDE加密，enable-已开通，disable-未开通
     */
    public void setEncryption(String Encryption) {
        this.Encryption = Encryption;
    }

    /**
     * Get 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，none-表示没有证书 
     * @return CertificateAttribution 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，none-表示没有证书
     */
    public String getCertificateAttribution() {
        return this.CertificateAttribution;
    }

    /**
     * Set 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，none-表示没有证书
     * @param CertificateAttribution 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，none-表示没有证书
     */
    public void setCertificateAttribution(String CertificateAttribution) {
        this.CertificateAttribution = CertificateAttribution;
    }

    /**
     * Get 开通TDE加密时引用的其他主账号ID 
     * @return QuoteUin 开通TDE加密时引用的其他主账号ID
     */
    public String getQuoteUin() {
        return this.QuoteUin;
    }

    /**
     * Set 开通TDE加密时引用的其他主账号ID
     * @param QuoteUin 开通TDE加密时引用的其他主账号ID
     */
    public void setQuoteUin(String QuoteUin) {
        this.QuoteUin = QuoteUin;
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
     * Get CMK所属的地域，不同地域的CMK不互通 
     * @return CMKRegion CMK所属的地域，不同地域的CMK不互通
     */
    public String getCMKRegion() {
        return this.CMKRegion;
    }

    /**
     * Set CMK所属的地域，不同地域的CMK不互通
     * @param CMKRegion CMK所属的地域，不同地域的CMK不互通
     */
    public void setCMKRegion(String CMKRegion) {
        this.CMKRegion = CMKRegion;
    }

    public TDEConfigAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TDEConfigAttribute(TDEConfigAttribute source) {
        if (source.Encryption != null) {
            this.Encryption = new String(source.Encryption);
        }
        if (source.CertificateAttribution != null) {
            this.CertificateAttribution = new String(source.CertificateAttribution);
        }
        if (source.QuoteUin != null) {
            this.QuoteUin = new String(source.QuoteUin);
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
        this.setParamSimple(map, prefix + "CertificateAttribution", this.CertificateAttribution);
        this.setParamSimple(map, prefix + "QuoteUin", this.QuoteUin);
        this.setParamSimple(map, prefix + "CMKId", this.CMKId);
        this.setParamSimple(map, prefix + "CMKRegion", this.CMKRegion);

    }
}

