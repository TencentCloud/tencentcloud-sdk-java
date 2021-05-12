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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInternalLB extends AbstractModel{

    /**
    * 是否开启内网访问LB
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 内网访问LB关联的子网Id
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get 是否开启内网访问LB 
     * @return Enabled 是否开启内网访问LB
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启内网访问LB
     * @param Enabled 是否开启内网访问LB
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 内网访问LB关联的子网Id 
     * @return SubnetId 内网访问LB关联的子网Id
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 内网访问LB关联的子网Id
     * @param SubnetId 内网访问LB关联的子网Id
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public ClusterInternalLB() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInternalLB(ClusterInternalLB source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

