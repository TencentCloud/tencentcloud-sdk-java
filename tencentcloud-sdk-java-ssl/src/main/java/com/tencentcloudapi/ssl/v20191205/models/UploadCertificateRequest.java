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

public class UploadCertificateRequest extends AbstractModel{

    /**
    * 证书公钥。
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * 私钥内容，证书类型为 SVR 时必填，为 CA 时可不填。
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * 证书类型，默认 SVR。CA = 客户端证书，SVR = 服务器证书。
    */
    @SerializedName("CertificateType")
    @Expose
    private String CertificateType;

    /**
    * 备注名称。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
     * Get 证书公钥。 
     * @return CertificatePublicKey 证书公钥。
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set 证书公钥。
     * @param CertificatePublicKey 证书公钥。
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get 私钥内容，证书类型为 SVR 时必填，为 CA 时可不填。 
     * @return CertificatePrivateKey 私钥内容，证书类型为 SVR 时必填，为 CA 时可不填。
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set 私钥内容，证书类型为 SVR 时必填，为 CA 时可不填。
     * @param CertificatePrivateKey 私钥内容，证书类型为 SVR 时必填，为 CA 时可不填。
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get 证书类型，默认 SVR。CA = 客户端证书，SVR = 服务器证书。 
     * @return CertificateType 证书类型，默认 SVR。CA = 客户端证书，SVR = 服务器证书。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证书类型，默认 SVR。CA = 客户端证书，SVR = 服务器证书。
     * @param CertificateType 证书类型，默认 SVR。CA = 客户端证书，SVR = 服务器证书。
     */
    public void setCertificateType(String CertificateType) {
        this.CertificateType = CertificateType;
    }

    /**
     * Get 备注名称。 
     * @return Alias 备注名称。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 备注名称。
     * @param Alias 备注名称。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "CertificateType", this.CertificateType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

