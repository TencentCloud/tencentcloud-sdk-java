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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadCertificateRequest extends AbstractModel {

    /**
    * 证书内容。
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
    * 证书类型，默认 SVR。CA = CA证书，SVR = 服务器证书。
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
    * 证书用途/证书来源。“CLB，CDN，WAF，LIVE，DDOS”
    */
    @SerializedName("CertificateUse")
    @Expose
    private String CertificateUse;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 相同的证书是否允许重复上传； true：允许上传相同指纹的证书；  false：不允许上传相同指纹的证书； 默认值：true
    */
    @SerializedName("Repeatable")
    @Expose
    private Boolean Repeatable;

    /**
     * Get 证书内容。 
     * @return CertificatePublicKey 证书内容。
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set 证书内容。
     * @param CertificatePublicKey 证书内容。
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
     * Get 证书类型，默认 SVR。CA = CA证书，SVR = 服务器证书。 
     * @return CertificateType 证书类型，默认 SVR。CA = CA证书，SVR = 服务器证书。
     */
    public String getCertificateType() {
        return this.CertificateType;
    }

    /**
     * Set 证书类型，默认 SVR。CA = CA证书，SVR = 服务器证书。
     * @param CertificateType 证书类型，默认 SVR。CA = CA证书，SVR = 服务器证书。
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
     * Get 证书用途/证书来源。“CLB，CDN，WAF，LIVE，DDOS” 
     * @return CertificateUse 证书用途/证书来源。“CLB，CDN，WAF，LIVE，DDOS”
     */
    public String getCertificateUse() {
        return this.CertificateUse;
    }

    /**
     * Set 证书用途/证书来源。“CLB，CDN，WAF，LIVE，DDOS”
     * @param CertificateUse 证书用途/证书来源。“CLB，CDN，WAF，LIVE，DDOS”
     */
    public void setCertificateUse(String CertificateUse) {
        this.CertificateUse = CertificateUse;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 相同的证书是否允许重复上传； true：允许上传相同指纹的证书；  false：不允许上传相同指纹的证书； 默认值：true 
     * @return Repeatable 相同的证书是否允许重复上传； true：允许上传相同指纹的证书；  false：不允许上传相同指纹的证书； 默认值：true
     */
    public Boolean getRepeatable() {
        return this.Repeatable;
    }

    /**
     * Set 相同的证书是否允许重复上传； true：允许上传相同指纹的证书；  false：不允许上传相同指纹的证书； 默认值：true
     * @param Repeatable 相同的证书是否允许重复上传； true：允许上传相同指纹的证书；  false：不允许上传相同指纹的证书； 默认值：true
     */
    public void setRepeatable(Boolean Repeatable) {
        this.Repeatable = Repeatable;
    }

    public UploadCertificateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadCertificateRequest(UploadCertificateRequest source) {
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.CertificateType != null) {
            this.CertificateType = new String(source.CertificateType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CertificateUse != null) {
            this.CertificateUse = new String(source.CertificateUse);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.Repeatable != null) {
            this.Repeatable = new Boolean(source.Repeatable);
        }
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
        this.setParamSimple(map, prefix + "CertificateUse", this.CertificateUse);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Repeatable", this.Repeatable);

    }
}

