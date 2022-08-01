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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainNameConfig extends AbstractModel{

    /**
    * 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostAliases")
    @Expose
    private HostAlias [] HostAliases;

    /**
    * DNS 配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DNSConfig")
    @Expose
    private DNSConfig DNSConfig;

    /**
     * Get 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostAliases 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HostAlias [] getHostAliases() {
        return this.HostAliases;
    }

    /**
     * Set 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostAliases 域名绑定配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostAliases(HostAlias [] HostAliases) {
        this.HostAliases = HostAliases;
    }

    /**
     * Get DNS 配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DNSConfig DNS 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DNSConfig getDNSConfig() {
        return this.DNSConfig;
    }

    /**
     * Set DNS 配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DNSConfig DNS 配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDNSConfig(DNSConfig DNSConfig) {
        this.DNSConfig = DNSConfig;
    }

    public DomainNameConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainNameConfig(DomainNameConfig source) {
        if (source.HostAliases != null) {
            this.HostAliases = new HostAlias[source.HostAliases.length];
            for (int i = 0; i < source.HostAliases.length; i++) {
                this.HostAliases[i] = new HostAlias(source.HostAliases[i]);
            }
        }
        if (source.DNSConfig != null) {
            this.DNSConfig = new DNSConfig(source.DNSConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HostAliases.", this.HostAliases);
        this.setParamObj(map, prefix + "DNSConfig.", this.DNSConfig);

    }
}

