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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterOption extends AbstractModel {

    /**
    * 计算集群可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 计算集群类型，取值范围：
- KUBERNETES
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计算集群Service CIDR，不能与VPC网段重合。
    */
    @SerializedName("ServiceCidr")
    @Expose
    private String ServiceCidr;

    /**
    * 资源配额。
    */
    @SerializedName("ResourceQuota")
    @Expose
    private ResourceQuota ResourceQuota;

    /**
    * 限制范围。
    */
    @SerializedName("LimitRange")
    @Expose
    private LimitRange LimitRange;

    /**
     * Get 计算集群可用区。 
     * @return Zone 计算集群可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 计算集群可用区。
     * @param Zone 计算集群可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 计算集群类型，取值范围：
- KUBERNETES 
     * @return Type 计算集群类型，取值范围：
- KUBERNETES
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 计算集群类型，取值范围：
- KUBERNETES
     * @param Type 计算集群类型，取值范围：
- KUBERNETES
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计算集群Service CIDR，不能与VPC网段重合。 
     * @return ServiceCidr 计算集群Service CIDR，不能与VPC网段重合。
     */
    public String getServiceCidr() {
        return this.ServiceCidr;
    }

    /**
     * Set 计算集群Service CIDR，不能与VPC网段重合。
     * @param ServiceCidr 计算集群Service CIDR，不能与VPC网段重合。
     */
    public void setServiceCidr(String ServiceCidr) {
        this.ServiceCidr = ServiceCidr;
    }

    /**
     * Get 资源配额。 
     * @return ResourceQuota 资源配额。
     */
    public ResourceQuota getResourceQuota() {
        return this.ResourceQuota;
    }

    /**
     * Set 资源配额。
     * @param ResourceQuota 资源配额。
     */
    public void setResourceQuota(ResourceQuota ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

    /**
     * Get 限制范围。 
     * @return LimitRange 限制范围。
     */
    public LimitRange getLimitRange() {
        return this.LimitRange;
    }

    /**
     * Set 限制范围。
     * @param LimitRange 限制范围。
     */
    public void setLimitRange(LimitRange LimitRange) {
        this.LimitRange = LimitRange;
    }

    public ClusterOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterOption(ClusterOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ServiceCidr != null) {
            this.ServiceCidr = new String(source.ServiceCidr);
        }
        if (source.ResourceQuota != null) {
            this.ResourceQuota = new ResourceQuota(source.ResourceQuota);
        }
        if (source.LimitRange != null) {
            this.LimitRange = new LimitRange(source.LimitRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ServiceCidr", this.ServiceCidr);
        this.setParamObj(map, prefix + "ResourceQuota.", this.ResourceQuota);
        this.setParamObj(map, prefix + "LimitRange.", this.LimitRange);

    }
}

