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

public class CertificateInfo extends AbstractModel {

    /**
    * 证书 ID。来源于 SSL 侧，您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/ssl) 查看 CertId。
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
<li>default：默认证书；</li>
<li>upload：用户上传；</li>
<li>managed：腾讯云托管。</li>
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
    * 证书部署时间。
    */
    @SerializedName("DeployTime")
    @Expose
    private String DeployTime;

    /**
    * 签名算法。
    */
    @SerializedName("SignAlgo")
    @Expose
    private String SignAlgo;

    /**
    * 证书状态，取值有：
<li>deployed：已部署；</li>
<li>processing：部署中；</li>
<li>applying：申请中；</li>
<li>failed：申请失败；</li>
<li>issued：绑定失败。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 证书 ID。来源于 SSL 侧，您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/ssl) 查看 CertId。 
     * @return CertId 证书 ID。来源于 SSL 侧，您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/ssl) 查看 CertId。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书 ID。来源于 SSL 侧，您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/ssl) 查看 CertId。
     * @param CertId 证书 ID。来源于 SSL 侧，您可以前往 [SSL 证书列表](https://console.cloud.tencent.com/ssl) 查看 CertId。
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
<li>default：默认证书；</li>
<li>upload：用户上传；</li>
<li>managed：腾讯云托管。</li> 
     * @return Type 证书类型，取值有：
<li>default：默认证书；</li>
<li>upload：用户上传；</li>
<li>managed：腾讯云托管。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 证书类型，取值有：
<li>default：默认证书；</li>
<li>upload：用户上传；</li>
<li>managed：腾讯云托管。</li>
     * @param Type 证书类型，取值有：
<li>default：默认证书；</li>
<li>upload：用户上传；</li>
<li>managed：腾讯云托管。</li>
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
     * Get 证书部署时间。 
     * @return DeployTime 证书部署时间。
     */
    public String getDeployTime() {
        return this.DeployTime;
    }

    /**
     * Set 证书部署时间。
     * @param DeployTime 证书部署时间。
     */
    public void setDeployTime(String DeployTime) {
        this.DeployTime = DeployTime;
    }

    /**
     * Get 签名算法。 
     * @return SignAlgo 签名算法。
     */
    public String getSignAlgo() {
        return this.SignAlgo;
    }

    /**
     * Set 签名算法。
     * @param SignAlgo 签名算法。
     */
    public void setSignAlgo(String SignAlgo) {
        this.SignAlgo = SignAlgo;
    }

    /**
     * Get 证书状态，取值有：
<li>deployed：已部署；</li>
<li>processing：部署中；</li>
<li>applying：申请中；</li>
<li>failed：申请失败；</li>
<li>issued：绑定失败。</li> 
     * @return Status 证书状态，取值有：
<li>deployed：已部署；</li>
<li>processing：部署中；</li>
<li>applying：申请中；</li>
<li>failed：申请失败；</li>
<li>issued：绑定失败。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 证书状态，取值有：
<li>deployed：已部署；</li>
<li>processing：部署中；</li>
<li>applying：申请中；</li>
<li>failed：申请失败；</li>
<li>issued：绑定失败。</li>
     * @param Status 证书状态，取值有：
<li>deployed：已部署；</li>
<li>processing：部署中；</li>
<li>applying：申请中；</li>
<li>failed：申请失败；</li>
<li>issued：绑定失败。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CertificateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CertificateInfo(CertificateInfo source) {
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
        if (source.DeployTime != null) {
            this.DeployTime = new String(source.DeployTime);
        }
        if (source.SignAlgo != null) {
            this.SignAlgo = new String(source.SignAlgo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
        this.setParamSimple(map, prefix + "DeployTime", this.DeployTime);
        this.setParamSimple(map, prefix + "SignAlgo", this.SignAlgo);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

