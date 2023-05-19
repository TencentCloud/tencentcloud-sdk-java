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

public class ClbListenerRule extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 规则绑定的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则是否匹配待绑定证书的域名
    */
    @SerializedName("IsMatch")
    @Expose
    private Boolean IsMatch;

    /**
    * 规则已绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Certificate")
    @Expose
    private Certificate Certificate;

    /**
    * 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get 规则ID 
     * @return LocationId 规则ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 规则ID
     * @param LocationId 规则ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 规则绑定的域名 
     * @return Domain 规则绑定的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 规则绑定的域名
     * @param Domain 规则绑定的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则是否匹配待绑定证书的域名 
     * @return IsMatch 规则是否匹配待绑定证书的域名
     */
    public Boolean getIsMatch() {
        return this.IsMatch;
    }

    /**
     * Set 规则是否匹配待绑定证书的域名
     * @param IsMatch 规则是否匹配待绑定证书的域名
     */
    public void setIsMatch(Boolean IsMatch) {
        this.IsMatch = IsMatch;
    }

    /**
     * Get 规则已绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Certificate 规则已绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Certificate getCertificate() {
        return this.Certificate;
    }

    /**
     * Set 规则已绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Certificate 规则已绑定的证书数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCertificate(Certificate Certificate) {
        this.Certificate = Certificate;
    }

    /**
     * Get 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoMatchDomains 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoMatchDomains 不匹配域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public ClbListenerRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbListenerRule(ClbListenerRule source) {
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IsMatch != null) {
            this.IsMatch = new Boolean(source.IsMatch);
        }
        if (source.Certificate != null) {
            this.Certificate = new Certificate(source.Certificate);
        }
        if (source.NoMatchDomains != null) {
            this.NoMatchDomains = new String[source.NoMatchDomains.length];
            for (int i = 0; i < source.NoMatchDomains.length; i++) {
                this.NoMatchDomains[i] = new String(source.NoMatchDomains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "IsMatch", this.IsMatch);
        this.setParamObj(map, prefix + "Certificate.", this.Certificate);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

