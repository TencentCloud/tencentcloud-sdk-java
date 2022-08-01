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

public class DNSConfig extends AbstractModel{

    /**
    * DNS IP 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nameservers")
    @Expose
    private String [] Nameservers;

    /**
     * Get DNS IP 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nameservers DNS IP 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNameservers() {
        return this.Nameservers;
    }

    /**
     * Set DNS IP 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nameservers DNS IP 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameservers(String [] Nameservers) {
        this.Nameservers = Nameservers;
    }

    public DNSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DNSConfig(DNSConfig source) {
        if (source.Nameservers != null) {
            this.Nameservers = new String[source.Nameservers.length];
            for (int i = 0; i < source.Nameservers.length; i++) {
                this.Nameservers[i] = new String(source.Nameservers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Nameservers.", this.Nameservers);

    }
}

