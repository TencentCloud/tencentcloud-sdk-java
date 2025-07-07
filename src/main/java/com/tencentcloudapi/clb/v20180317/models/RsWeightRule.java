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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RsWeightRule extends AbstractModel {

    /**
    * 负载均衡监听器 ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要修改权重的后端机器列表。
    */
    @SerializedName("Targets")
    @Expose
    private Target [] Targets;

    /**
    * 转发规则的ID，七层规则时需要此参数，4层规则不需要。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 目标规则的域名，提供LocationId参数时本参数不生效。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 目标规则的URL，提供LocationId参数时本参数不生效。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 后端服务修改后的转发权重，取值范围：[0，100]。此参数的优先级低于前述[Target](https://cloud.tencent.com/document/api/214/30694#Target)中的Weight参数，即最终的权重值以Target中的Weight参数值为准，仅当Target中的Weight参数为空时，才以RsWeightRule中的Weight参数为准。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 负载均衡监听器 ID。 
     * @return ListenerId 负载均衡监听器 ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID。
     * @param ListenerId 负载均衡监听器 ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 要修改权重的后端机器列表。 
     * @return Targets 要修改权重的后端机器列表。
     */
    public Target [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 要修改权重的后端机器列表。
     * @param Targets 要修改权重的后端机器列表。
     */
    public void setTargets(Target [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 转发规则的ID，七层规则时需要此参数，4层规则不需要。 
     * @return LocationId 转发规则的ID，七层规则时需要此参数，4层规则不需要。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的ID，七层规则时需要此参数，4层规则不需要。
     * @param LocationId 转发规则的ID，七层规则时需要此参数，4层规则不需要。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 目标规则的域名，提供LocationId参数时本参数不生效。 
     * @return Domain 目标规则的域名，提供LocationId参数时本参数不生效。
     * @deprecated
     */
    @Deprecated
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 目标规则的域名，提供LocationId参数时本参数不生效。
     * @param Domain 目标规则的域名，提供LocationId参数时本参数不生效。
     * @deprecated
     */
    @Deprecated
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 目标规则的URL，提供LocationId参数时本参数不生效。 
     * @return Url 目标规则的URL，提供LocationId参数时本参数不生效。
     * @deprecated
     */
    @Deprecated
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 目标规则的URL，提供LocationId参数时本参数不生效。
     * @param Url 目标规则的URL，提供LocationId参数时本参数不生效。
     * @deprecated
     */
    @Deprecated
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 后端服务修改后的转发权重，取值范围：[0，100]。此参数的优先级低于前述[Target](https://cloud.tencent.com/document/api/214/30694#Target)中的Weight参数，即最终的权重值以Target中的Weight参数值为准，仅当Target中的Weight参数为空时，才以RsWeightRule中的Weight参数为准。 
     * @return Weight 后端服务修改后的转发权重，取值范围：[0，100]。此参数的优先级低于前述[Target](https://cloud.tencent.com/document/api/214/30694#Target)中的Weight参数，即最终的权重值以Target中的Weight参数值为准，仅当Target中的Weight参数为空时，才以RsWeightRule中的Weight参数为准。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 后端服务修改后的转发权重，取值范围：[0，100]。此参数的优先级低于前述[Target](https://cloud.tencent.com/document/api/214/30694#Target)中的Weight参数，即最终的权重值以Target中的Weight参数值为准，仅当Target中的Weight参数为空时，才以RsWeightRule中的Weight参数为准。
     * @param Weight 后端服务修改后的转发权重，取值范围：[0，100]。此参数的优先级低于前述[Target](https://cloud.tencent.com/document/api/214/30694#Target)中的Weight参数，即最终的权重值以Target中的Weight参数值为准，仅当Target中的Weight参数为空时，才以RsWeightRule中的Weight参数为准。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public RsWeightRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RsWeightRule(RsWeightRule source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Targets != null) {
            this.Targets = new Target[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Target(source.Targets[i]);
            }
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

