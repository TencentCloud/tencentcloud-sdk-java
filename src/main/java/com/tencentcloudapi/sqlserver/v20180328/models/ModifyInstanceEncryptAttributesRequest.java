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

public class ModifyInstanceEncryptAttributesRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，kms-表示使用kms的CMK证书，默认取值self。
    */
    @SerializedName("CertificateAttribution")
    @Expose
    private String CertificateAttribution;

    /**
    * 引用的其他主账号ID，当CertificateAttribution 为others时必填。
    */
    @SerializedName("QuoteUin")
    @Expose
    private String QuoteUin;

    /**
    * CertificateAttribution为kms时必填
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * CertificateAttribution为kms时必填
    */
    @SerializedName("KeyRegion")
    @Expose
    private String KeyRegion;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，kms-表示使用kms的CMK证书，默认取值self。 
     * @return CertificateAttribution 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，kms-表示使用kms的CMK证书，默认取值self。
     */
    public String getCertificateAttribution() {
        return this.CertificateAttribution;
    }

    /**
     * Set 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，kms-表示使用kms的CMK证书，默认取值self。
     * @param CertificateAttribution 证书归属。self-表示使用该账号自身的证书，others-表示引用其他账号的证书，kms-表示使用kms的CMK证书，默认取值self。
     */
    public void setCertificateAttribution(String CertificateAttribution) {
        this.CertificateAttribution = CertificateAttribution;
    }

    /**
     * Get 引用的其他主账号ID，当CertificateAttribution 为others时必填。 
     * @return QuoteUin 引用的其他主账号ID，当CertificateAttribution 为others时必填。
     */
    public String getQuoteUin() {
        return this.QuoteUin;
    }

    /**
     * Set 引用的其他主账号ID，当CertificateAttribution 为others时必填。
     * @param QuoteUin 引用的其他主账号ID，当CertificateAttribution 为others时必填。
     */
    public void setQuoteUin(String QuoteUin) {
        this.QuoteUin = QuoteUin;
    }

    /**
     * Get CertificateAttribution为kms时必填 
     * @return KeyId CertificateAttribution为kms时必填
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set CertificateAttribution为kms时必填
     * @param KeyId CertificateAttribution为kms时必填
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get CertificateAttribution为kms时必填 
     * @return KeyRegion CertificateAttribution为kms时必填
     */
    public String getKeyRegion() {
        return this.KeyRegion;
    }

    /**
     * Set CertificateAttribution为kms时必填
     * @param KeyRegion CertificateAttribution为kms时必填
     */
    public void setKeyRegion(String KeyRegion) {
        this.KeyRegion = KeyRegion;
    }

    public ModifyInstanceEncryptAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceEncryptAttributesRequest(ModifyInstanceEncryptAttributesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CertificateAttribution != null) {
            this.CertificateAttribution = new String(source.CertificateAttribution);
        }
        if (source.QuoteUin != null) {
            this.QuoteUin = new String(source.QuoteUin);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyRegion != null) {
            this.KeyRegion = new String(source.KeyRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CertificateAttribution", this.CertificateAttribution);
        this.setParamSimple(map, prefix + "QuoteUin", this.QuoteUin);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyRegion", this.KeyRegion);

    }
}

