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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplaceCertificateRequest extends AbstractModel{

    /**
    * 证书ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 验证类型 DNS,DNS_AUTO,FILE
    */
    @SerializedName("ValidType")
    @Expose
    private String ValidType;

    /**
    * 类型，可选项：Original、Upload、Online，默认original。
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR内容。
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * key密码。
    */
    @SerializedName("CsrkeyPassword")
    @Expose
    private String CsrkeyPassword;

    /**
     * Get 证书ID。 
     * @return CertificateId 证书ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书ID。
     * @param CertificateId 证书ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 验证类型 DNS,DNS_AUTO,FILE 
     * @return ValidType 验证类型 DNS,DNS_AUTO,FILE
     */
    public String getValidType() {
        return this.ValidType;
    }

    /**
     * Set 验证类型 DNS,DNS_AUTO,FILE
     * @param ValidType 验证类型 DNS,DNS_AUTO,FILE
     */
    public void setValidType(String ValidType) {
        this.ValidType = ValidType;
    }

    /**
     * Get 类型，可选项：Original、Upload、Online，默认original。 
     * @return CsrType 类型，可选项：Original、Upload、Online，默认original。
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set 类型，可选项：Original、Upload、Online，默认original。
     * @param CsrType 类型，可选项：Original、Upload、Online，默认original。
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR内容。 
     * @return CsrContent CSR内容。
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR内容。
     * @param CsrContent CSR内容。
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get key密码。 
     * @return CsrkeyPassword key密码。
     */
    public String getCsrkeyPassword() {
        return this.CsrkeyPassword;
    }

    /**
     * Set key密码。
     * @param CsrkeyPassword key密码。
     */
    public void setCsrkeyPassword(String CsrkeyPassword) {
        this.CsrkeyPassword = CsrkeyPassword;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificateId", this.CertificateId);
        this.setParamSimple(map, prefix + "ValidType", this.ValidType);
        this.setParamSimple(map, prefix + "CsrType", this.CsrType);
        this.setParamSimple(map, prefix + "CsrContent", this.CsrContent);
        this.setParamSimple(map, prefix + "CsrkeyPassword", this.CsrkeyPassword);

    }
}

