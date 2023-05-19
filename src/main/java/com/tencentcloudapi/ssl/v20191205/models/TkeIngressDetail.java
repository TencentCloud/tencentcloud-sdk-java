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

public class TkeIngressDetail extends AbstractModel{

    /**
    * ingress名称
    */
    @SerializedName("IngressName")
    @Expose
    private String IngressName;

    /**
    * tls域名列表
    */
    @SerializedName("TlsDomains")
    @Expose
    private String [] TlsDomains;

    /**
    * ingress域名列表
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get ingress名称 
     * @return IngressName ingress名称
     */
    public String getIngressName() {
        return this.IngressName;
    }

    /**
     * Set ingress名称
     * @param IngressName ingress名称
     */
    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
    }

    /**
     * Get tls域名列表 
     * @return TlsDomains tls域名列表
     */
    public String [] getTlsDomains() {
        return this.TlsDomains;
    }

    /**
     * Set tls域名列表
     * @param TlsDomains tls域名列表
     */
    public void setTlsDomains(String [] TlsDomains) {
        this.TlsDomains = TlsDomains;
    }

    /**
     * Get ingress域名列表 
     * @return Domains ingress域名列表
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set ingress域名列表
     * @param Domains ingress域名列表
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public TkeIngressDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TkeIngressDetail(TkeIngressDetail source) {
        if (source.IngressName != null) {
            this.IngressName = new String(source.IngressName);
        }
        if (source.TlsDomains != null) {
            this.TlsDomains = new String[source.TlsDomains.length];
            for (int i = 0; i < source.TlsDomains.length; i++) {
                this.TlsDomains[i] = new String(source.TlsDomains[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IngressName", this.IngressName);
        this.setParamArraySimple(map, prefix + "TlsDomains.", this.TlsDomains);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

