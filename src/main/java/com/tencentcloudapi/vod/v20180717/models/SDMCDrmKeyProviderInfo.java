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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SDMCDrmKeyProviderInfo extends AbstractModel{

    /**
    * 华曦达分配的用户 ID。最大长度为128个字符。
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * 华曦达分配的用户密钥 ID。最大长度为128个字符。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 华曦达分配的用户密钥内容。最大长度为128个字符。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 华曦达分配的 FairPlay 证书地址。该地址需使用 HTTPS 协议，最大长度为1024个字符。
    */
    @SerializedName("FairPlayCertificateUrl")
    @Expose
    private String FairPlayCertificateUrl;

    /**
     * Get 华曦达分配的用户 ID。最大长度为128个字符。 
     * @return Uid 华曦达分配的用户 ID。最大长度为128个字符。
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set 华曦达分配的用户 ID。最大长度为128个字符。
     * @param Uid 华曦达分配的用户 ID。最大长度为128个字符。
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get 华曦达分配的用户密钥 ID。最大长度为128个字符。 
     * @return SecretId 华曦达分配的用户密钥 ID。最大长度为128个字符。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 华曦达分配的用户密钥 ID。最大长度为128个字符。
     * @param SecretId 华曦达分配的用户密钥 ID。最大长度为128个字符。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 华曦达分配的用户密钥内容。最大长度为128个字符。 
     * @return SecretKey 华曦达分配的用户密钥内容。最大长度为128个字符。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 华曦达分配的用户密钥内容。最大长度为128个字符。
     * @param SecretKey 华曦达分配的用户密钥内容。最大长度为128个字符。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 华曦达分配的 FairPlay 证书地址。该地址需使用 HTTPS 协议，最大长度为1024个字符。 
     * @return FairPlayCertificateUrl 华曦达分配的 FairPlay 证书地址。该地址需使用 HTTPS 协议，最大长度为1024个字符。
     */
    public String getFairPlayCertificateUrl() {
        return this.FairPlayCertificateUrl;
    }

    /**
     * Set 华曦达分配的 FairPlay 证书地址。该地址需使用 HTTPS 协议，最大长度为1024个字符。
     * @param FairPlayCertificateUrl 华曦达分配的 FairPlay 证书地址。该地址需使用 HTTPS 协议，最大长度为1024个字符。
     */
    public void setFairPlayCertificateUrl(String FairPlayCertificateUrl) {
        this.FairPlayCertificateUrl = FairPlayCertificateUrl;
    }

    public SDMCDrmKeyProviderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SDMCDrmKeyProviderInfo(SDMCDrmKeyProviderInfo source) {
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.FairPlayCertificateUrl != null) {
            this.FairPlayCertificateUrl = new String(source.FairPlayCertificateUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "FairPlayCertificateUrl", this.FairPlayCertificateUrl);

    }
}

