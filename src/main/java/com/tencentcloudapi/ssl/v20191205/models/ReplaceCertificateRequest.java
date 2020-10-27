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
    * 证书 ID。
    */
    @SerializedName("CertificateId")
    @Expose
    private String CertificateId;

    /**
    * 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
    */
    @SerializedName("ValidType")
    @Expose
    private String ValidType;

    /**
    * 类型，默认 Original。可选项：Original = 原证书 CSR，Upload = 手动上传，Online = 在线生成。
    */
    @SerializedName("CsrType")
    @Expose
    private String CsrType;

    /**
    * CSR 内容。
    */
    @SerializedName("CsrContent")
    @Expose
    private String CsrContent;

    /**
    * KEY 密码。
    */
    @SerializedName("CsrkeyPassword")
    @Expose
    private String CsrkeyPassword;

    /**
    * 重颁发原因。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 证书 ID。 
     * @return CertificateId 证书 ID。
     */
    public String getCertificateId() {
        return this.CertificateId;
    }

    /**
     * Set 证书 ID。
     * @param CertificateId 证书 ID。
     */
    public void setCertificateId(String CertificateId) {
        this.CertificateId = CertificateId;
    }

    /**
     * Get 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。 
     * @return ValidType 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
     */
    public String getValidType() {
        return this.ValidType;
    }

    /**
     * Set 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
     * @param ValidType 验证类型：DNS_AUTO = 自动DNS验证，DNS = 手动DNS验证，FILE = 文件验证。
     */
    public void setValidType(String ValidType) {
        this.ValidType = ValidType;
    }

    /**
     * Get 类型，默认 Original。可选项：Original = 原证书 CSR，Upload = 手动上传，Online = 在线生成。 
     * @return CsrType 类型，默认 Original。可选项：Original = 原证书 CSR，Upload = 手动上传，Online = 在线生成。
     */
    public String getCsrType() {
        return this.CsrType;
    }

    /**
     * Set 类型，默认 Original。可选项：Original = 原证书 CSR，Upload = 手动上传，Online = 在线生成。
     * @param CsrType 类型，默认 Original。可选项：Original = 原证书 CSR，Upload = 手动上传，Online = 在线生成。
     */
    public void setCsrType(String CsrType) {
        this.CsrType = CsrType;
    }

    /**
     * Get CSR 内容。 
     * @return CsrContent CSR 内容。
     */
    public String getCsrContent() {
        return this.CsrContent;
    }

    /**
     * Set CSR 内容。
     * @param CsrContent CSR 内容。
     */
    public void setCsrContent(String CsrContent) {
        this.CsrContent = CsrContent;
    }

    /**
     * Get KEY 密码。 
     * @return CsrkeyPassword KEY 密码。
     */
    public String getCsrkeyPassword() {
        return this.CsrkeyPassword;
    }

    /**
     * Set KEY 密码。
     * @param CsrkeyPassword KEY 密码。
     */
    public void setCsrkeyPassword(String CsrkeyPassword) {
        this.CsrkeyPassword = CsrkeyPassword;
    }

    /**
     * Get 重颁发原因。 
     * @return Reason 重颁发原因。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 重颁发原因。
     * @param Reason 重颁发原因。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

