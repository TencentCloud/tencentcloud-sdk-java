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

public class WafInstanceDetail extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 证书ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 是否保持长连接，1是，0 否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keepalive")
    @Expose
    private Long Keepalive;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 证书ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CertId 证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CertId 证书ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 是否保持长连接，1是，0 否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keepalive 是否保持长连接，1是，0 否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKeepalive() {
        return this.Keepalive;
    }

    /**
     * Set 是否保持长连接，1是，0 否
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keepalive 是否保持长连接，1是，0 否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeepalive(Long Keepalive) {
        this.Keepalive = Keepalive;
    }

    public WafInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafInstanceDetail(WafInstanceDetail source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Keepalive != null) {
            this.Keepalive = new Long(source.Keepalive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Keepalive", this.Keepalive);

    }
}

