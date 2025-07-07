/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeClusterPublicLB extends AbstractModel {

    /**
    * 是否开启公网访问LB
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 允许访问的公网cidr
    */
    @SerializedName("AllowFromCidrs")
    @Expose
    private String [] AllowFromCidrs;

    /**
     * Get 是否开启公网访问LB 
     * @return Enabled 是否开启公网访问LB
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启公网访问LB
     * @param Enabled 是否开启公网访问LB
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 允许访问的公网cidr 
     * @return AllowFromCidrs 允许访问的公网cidr
     */
    public String [] getAllowFromCidrs() {
        return this.AllowFromCidrs;
    }

    /**
     * Set 允许访问的公网cidr
     * @param AllowFromCidrs 允许访问的公网cidr
     */
    public void setAllowFromCidrs(String [] AllowFromCidrs) {
        this.AllowFromCidrs = AllowFromCidrs;
    }

    public EdgeClusterPublicLB() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeClusterPublicLB(EdgeClusterPublicLB source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.AllowFromCidrs != null) {
            this.AllowFromCidrs = new String[source.AllowFromCidrs.length];
            for (int i = 0; i < source.AllowFromCidrs.length; i++) {
                this.AllowFromCidrs[i] = new String(source.AllowFromCidrs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "AllowFromCidrs.", this.AllowFromCidrs);

    }
}

