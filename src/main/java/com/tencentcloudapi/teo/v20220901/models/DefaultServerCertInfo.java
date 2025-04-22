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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DefaultServerCertInfo extends AbstractModel {

    /**
    * 服务器证书 ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 证书备注名。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 证书类型，取值有：
<li>default: 默认证书;</li>
<li>upload:用户上传;</li>
<li>managed:腾讯云托管。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 证书过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 证书生效时间。
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 证书公用名。
    */
    @SerializedName("CommonName")
    @Expose
    private String CommonName;

    /**
    * 证书SAN域名。
    */
    @SerializedName("SubjectAltName")
    @Expose
    private String [] SubjectAltName;

    /**
    * 部署状态，取值有：
<li>processing: 部署中；</li>
<li>deployed: 已部署；</li>
<li>failed: 部署失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Status为失败时,此字段返回失败原因。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 证书算法。
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
     * Get 服务器证书 ID。 
     * @return CertId 服务器证书 ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务器证书 ID。
     * @param CertId 服务器证书 ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 证书备注名。 
     * @return Alias 证书备注名。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 证书备注名。
     * @param Alias 证书备注名。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 证书类型，取值有：
<li>default: 默认证书;</li>
<li>upload:用户上传;</li>
<li>managed:腾讯云托管。</li> 
     * @return Type 证书类型，取值有：
<li>default: 默认证书;</li>
<li>upload:用户上传;</li>
<li>managed:腾讯云托管。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证书类型，取值有：
<li>default: 默认证书;</li>
<li>upload:用户上传;</li>
<li>managed:腾讯云托管。</li>
     * @param Type 证书类型，取值有：
<li>default: 默认证书;</li>
<li>upload:用户上传;</li>
<li>managed:腾讯云托管。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 证书过期时间。 
     * @return ExpireTime 证书过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 证书过期时间。
     * @param ExpireTime 证书过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 证书生效时间。 
     * @return EffectiveTime 证书生效时间。
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 证书生效时间。
     * @param EffectiveTime 证书生效时间。
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 证书公用名。 
     * @return CommonName 证书公用名。
     */
    public String getCommonName() {
        return this.CommonName;
    }

    /**
     * Set 证书公用名。
     * @param CommonName 证书公用名。
     */
    public void setCommonName(String CommonName) {
        this.CommonName = CommonName;
    }

    /**
     * Get 证书SAN域名。 
     * @return SubjectAltName 证书SAN域名。
     */
    public String [] getSubjectAltName() {
        return this.SubjectAltName;
    }

    /**
     * Set 证书SAN域名。
     * @param SubjectAltName 证书SAN域名。
     */
    public void setSubjectAltName(String [] SubjectAltName) {
        this.SubjectAltName = SubjectAltName;
    }

    /**
     * Get 部署状态，取值有：
<li>processing: 部署中；</li>
<li>deployed: 已部署；</li>
<li>failed: 部署失败。</li> 
     * @return Status 部署状态，取值有：
<li>processing: 部署中；</li>
<li>deployed: 已部署；</li>
<li>failed: 部署失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 部署状态，取值有：
<li>processing: 部署中；</li>
<li>deployed: 已部署；</li>
<li>failed: 部署失败。</li>
     * @param Status 部署状态，取值有：
<li>processing: 部署中；</li>
<li>deployed: 已部署；</li>
<li>failed: 部署失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Status为失败时,此字段返回失败原因。 
     * @return Message Status为失败时,此字段返回失败原因。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Status为失败时,此字段返回失败原因。
     * @param Message Status为失败时,此字段返回失败原因。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 证书算法。 
     * @return SignAlgo 证书算法。
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set 证书算法。
     * @param SignAlgo 证书算法。
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    public DefaultServerCertInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DefaultServerCertInfo(DefaultServerCertInfo source) {
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.CommonName != null) {
            this.CommonName = new String(source.CommonName);
        }
        if (source.SubjectAltName != null) {
            this.SubjectAltName = new String[source.SubjectAltName.length];
            for (int i = 0; i < source.SubjectAltName.length; i++) {
                this.SubjectAltName[i] = new String(source.SubjectAltName[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "CommonName", this.CommonName);
        this.setParamArraySimple(map, prefix + "SubjectAltName.", this.SubjectAltName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);

    }
}

