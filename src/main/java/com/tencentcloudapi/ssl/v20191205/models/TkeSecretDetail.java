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

public class TkeSecretDetail extends AbstractModel{

    /**
    * secret名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * ingress列表
    */
    @SerializedName("IngressList")
    @Expose
    private TkeIngressDetail [] IngressList;

    /**
    * 和新证书不匹配的域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoMatchDomains")
    @Expose
    private String [] NoMatchDomains;

    /**
     * Get secret名称 
     * @return Name secret名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set secret名称
     * @param Name secret名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get ingress列表 
     * @return IngressList ingress列表
     */
    public TkeIngressDetail [] getIngressList() {
        return this.IngressList;
    }

    /**
     * Set ingress列表
     * @param IngressList ingress列表
     */
    public void setIngressList(TkeIngressDetail [] IngressList) {
        this.IngressList = IngressList;
    }

    /**
     * Get 和新证书不匹配的域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoMatchDomains 和新证书不匹配的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoMatchDomains() {
        return this.NoMatchDomains;
    }

    /**
     * Set 和新证书不匹配的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoMatchDomains 和新证书不匹配的域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoMatchDomains(String [] NoMatchDomains) {
        this.NoMatchDomains = NoMatchDomains;
    }

    public TkeSecretDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeSecretDetail(TkeSecretDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.IngressList != null) {
            this.IngressList = new TkeIngressDetail[source.IngressList.length];
            for (int i = 0; i < source.IngressList.length; i++) {
                this.IngressList[i] = new TkeIngressDetail(source.IngressList[i]);
            }
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamArrayObj(map, prefix + "IngressList.", this.IngressList);
        this.setParamArraySimple(map, prefix + "NoMatchDomains.", this.NoMatchDomains);

    }
}

