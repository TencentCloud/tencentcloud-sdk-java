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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSupplyAttribute extends AbstractModel {

    /**
    * <p>资源供应类型。TIDE:潮汐;SPOT:竞价;空:常规按量后付费</p>
    */
    @SerializedName("SupplyType")
    @Expose
    private String SupplyType;

    /**
    * <p>集群类型</p><p>枚举值：</p><ul><li>DEFAULT： 默认集群</li><li>THIRD： 第三方集群</li></ul><p>默认值：DEFAULT</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
     * Get <p>资源供应类型。TIDE:潮汐;SPOT:竞价;空:常规按量后付费</p> 
     * @return SupplyType <p>资源供应类型。TIDE:潮汐;SPOT:竞价;空:常规按量后付费</p>
     */
    public String getSupplyType() {
        return this.SupplyType;
    }

    /**
     * Set <p>资源供应类型。TIDE:潮汐;SPOT:竞价;空:常规按量后付费</p>
     * @param SupplyType <p>资源供应类型。TIDE:潮汐;SPOT:竞价;空:常规按量后付费</p>
     */
    public void setSupplyType(String SupplyType) {
        this.SupplyType = SupplyType;
    }

    /**
     * Get <p>集群类型</p><p>枚举值：</p><ul><li>DEFAULT： 默认集群</li><li>THIRD： 第三方集群</li></ul><p>默认值：DEFAULT</p> 
     * @return ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>DEFAULT： 默认集群</li><li>THIRD： 第三方集群</li></ul><p>默认值：DEFAULT</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>集群类型</p><p>枚举值：</p><ul><li>DEFAULT： 默认集群</li><li>THIRD： 第三方集群</li></ul><p>默认值：DEFAULT</p>
     * @param ClusterType <p>集群类型</p><p>枚举值：</p><ul><li>DEFAULT： 默认集群</li><li>THIRD： 第三方集群</li></ul><p>默认值：DEFAULT</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    public ResourceSupplyAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSupplyAttribute(ResourceSupplyAttribute source) {
        if (source.SupplyType != null) {
            this.SupplyType = new String(source.SupplyType);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SupplyType", this.SupplyType);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);

    }
}

