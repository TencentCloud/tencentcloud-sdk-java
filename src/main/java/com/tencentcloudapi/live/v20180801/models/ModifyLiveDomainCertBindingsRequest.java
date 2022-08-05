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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLiveDomainCertBindingsRequest extends AbstractModel{

    /**
    * 要绑定证书的播放域名/状态 信息列表。
如果CloudCertId和证书公钥私钥对均不传，且域名列表已有绑定规则，只批量更新域名https规则的启用状态，并把未上传至腾讯云ssl的已有自有证书上传。
    */
    @SerializedName("DomainInfos")
    @Expose
    private LiveCertDomainInfo [] DomainInfos;

    /**
    * 腾讯云ssl的证书Id。
见 https://cloud.tencent.com/document/api/400/41665
    */
    @SerializedName("CloudCertId")
    @Expose
    private String CloudCertId;

    /**
    * 证书公钥。
CloudCertId和公钥私钥对二选一，若CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
    */
    @SerializedName("CertificatePublicKey")
    @Expose
    private String CertificatePublicKey;

    /**
    * 证书私钥。
CloudCertId和公钥私钥对二选一，若传CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
    */
    @SerializedName("CertificatePrivateKey")
    @Expose
    private String CertificatePrivateKey;

    /**
    * 上传至ssl证书中心的备注信息，只有新建证书时有效。传CloudCertId时会忽略。
    */
    @SerializedName("CertificateAlias")
    @Expose
    private String CertificateAlias;

    /**
     * Get 要绑定证书的播放域名/状态 信息列表。
如果CloudCertId和证书公钥私钥对均不传，且域名列表已有绑定规则，只批量更新域名https规则的启用状态，并把未上传至腾讯云ssl的已有自有证书上传。 
     * @return DomainInfos 要绑定证书的播放域名/状态 信息列表。
如果CloudCertId和证书公钥私钥对均不传，且域名列表已有绑定规则，只批量更新域名https规则的启用状态，并把未上传至腾讯云ssl的已有自有证书上传。
     */
    public LiveCertDomainInfo [] getDomainInfos() {
        return this.DomainInfos;
    }

    /**
     * Set 要绑定证书的播放域名/状态 信息列表。
如果CloudCertId和证书公钥私钥对均不传，且域名列表已有绑定规则，只批量更新域名https规则的启用状态，并把未上传至腾讯云ssl的已有自有证书上传。
     * @param DomainInfos 要绑定证书的播放域名/状态 信息列表。
如果CloudCertId和证书公钥私钥对均不传，且域名列表已有绑定规则，只批量更新域名https规则的启用状态，并把未上传至腾讯云ssl的已有自有证书上传。
     */
    public void setDomainInfos(LiveCertDomainInfo [] DomainInfos) {
        this.DomainInfos = DomainInfos;
    }

    /**
     * Get 腾讯云ssl的证书Id。
见 https://cloud.tencent.com/document/api/400/41665 
     * @return CloudCertId 腾讯云ssl的证书Id。
见 https://cloud.tencent.com/document/api/400/41665
     */
    public String getCloudCertId() {
        return this.CloudCertId;
    }

    /**
     * Set 腾讯云ssl的证书Id。
见 https://cloud.tencent.com/document/api/400/41665
     * @param CloudCertId 腾讯云ssl的证书Id。
见 https://cloud.tencent.com/document/api/400/41665
     */
    public void setCloudCertId(String CloudCertId) {
        this.CloudCertId = CloudCertId;
    }

    /**
     * Get 证书公钥。
CloudCertId和公钥私钥对二选一，若CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。 
     * @return CertificatePublicKey 证书公钥。
CloudCertId和公钥私钥对二选一，若CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
     */
    public String getCertificatePublicKey() {
        return this.CertificatePublicKey;
    }

    /**
     * Set 证书公钥。
CloudCertId和公钥私钥对二选一，若CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
     * @param CertificatePublicKey 证书公钥。
CloudCertId和公钥私钥对二选一，若CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
     */
    public void setCertificatePublicKey(String CertificatePublicKey) {
        this.CertificatePublicKey = CertificatePublicKey;
    }

    /**
     * Get 证书私钥。
CloudCertId和公钥私钥对二选一，若传CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。 
     * @return CertificatePrivateKey 证书私钥。
CloudCertId和公钥私钥对二选一，若传CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
     */
    public String getCertificatePrivateKey() {
        return this.CertificatePrivateKey;
    }

    /**
     * Set 证书私钥。
CloudCertId和公钥私钥对二选一，若传CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
     * @param CertificatePrivateKey 证书私钥。
CloudCertId和公钥私钥对二选一，若传CloudCertId将会舍弃公钥和私钥参数，否则将自动先把公钥私钥对上传至ssl新建证书，并使用上传成功后返回的CloudCertId。
     */
    public void setCertificatePrivateKey(String CertificatePrivateKey) {
        this.CertificatePrivateKey = CertificatePrivateKey;
    }

    /**
     * Get 上传至ssl证书中心的备注信息，只有新建证书时有效。传CloudCertId时会忽略。 
     * @return CertificateAlias 上传至ssl证书中心的备注信息，只有新建证书时有效。传CloudCertId时会忽略。
     */
    public String getCertificateAlias() {
        return this.CertificateAlias;
    }

    /**
     * Set 上传至ssl证书中心的备注信息，只有新建证书时有效。传CloudCertId时会忽略。
     * @param CertificateAlias 上传至ssl证书中心的备注信息，只有新建证书时有效。传CloudCertId时会忽略。
     */
    public void setCertificateAlias(String CertificateAlias) {
        this.CertificateAlias = CertificateAlias;
    }

    public ModifyLiveDomainCertBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLiveDomainCertBindingsRequest(ModifyLiveDomainCertBindingsRequest source) {
        if (source.DomainInfos != null) {
            this.DomainInfos = new LiveCertDomainInfo[source.DomainInfos.length];
            for (int i = 0; i < source.DomainInfos.length; i++) {
                this.DomainInfos[i] = new LiveCertDomainInfo(source.DomainInfos[i]);
            }
        }
        if (source.CloudCertId != null) {
            this.CloudCertId = new String(source.CloudCertId);
        }
        if (source.CertificatePublicKey != null) {
            this.CertificatePublicKey = new String(source.CertificatePublicKey);
        }
        if (source.CertificatePrivateKey != null) {
            this.CertificatePrivateKey = new String(source.CertificatePrivateKey);
        }
        if (source.CertificateAlias != null) {
            this.CertificateAlias = new String(source.CertificateAlias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DomainInfos.", this.DomainInfos);
        this.setParamSimple(map, prefix + "CloudCertId", this.CloudCertId);
        this.setParamSimple(map, prefix + "CertificatePublicKey", this.CertificatePublicKey);
        this.setParamSimple(map, prefix + "CertificatePrivateKey", this.CertificatePrivateKey);
        this.setParamSimple(map, prefix + "CertificateAlias", this.CertificateAlias);

    }
}

