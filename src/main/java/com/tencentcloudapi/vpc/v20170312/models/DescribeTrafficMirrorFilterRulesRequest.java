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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorFilterRulesRequest extends AbstractModel {

    /**
    * 流量镜像唯一ID
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像出站、入站过滤唯一ID列表。
    */
    @SerializedName("TrafficMirrorFilterRuleIds")
    @Expose
    private String [] TrafficMirrorFilterRuleIds;

    /**
    * <li>traffic-mirror-filter-rule-id - String - （过滤条件） 流量镜像过滤规则，形如：tmfi-qfhrb7yj。 </li>
<li>action - String - （过滤条件）策略， 支持类型： ACCEPT， DROP。 </li>
<li>description - String - （过滤条件）描述。 </li>
<li>direction - String - （过滤条件）方向, 支持类型：INGRESS， EGRESS。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求对象个数。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 流量镜像唯一ID 
     * @return TrafficMirrorId 流量镜像唯一ID
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * Set 流量镜像唯一ID
     * @param TrafficMirrorId 流量镜像唯一ID
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * Get 流量镜像出站、入站过滤唯一ID列表。 
     * @return TrafficMirrorFilterRuleIds 流量镜像出站、入站过滤唯一ID列表。
     */
    public String [] getTrafficMirrorFilterRuleIds() {
        return this.TrafficMirrorFilterRuleIds;
    }

    /**
     * Set 流量镜像出站、入站过滤唯一ID列表。
     * @param TrafficMirrorFilterRuleIds 流量镜像出站、入站过滤唯一ID列表。
     */
    public void setTrafficMirrorFilterRuleIds(String [] TrafficMirrorFilterRuleIds) {
        this.TrafficMirrorFilterRuleIds = TrafficMirrorFilterRuleIds;
    }

    /**
     * Get <li>traffic-mirror-filter-rule-id - String - （过滤条件） 流量镜像过滤规则，形如：tmfi-qfhrb7yj。 </li>
<li>action - String - （过滤条件）策略， 支持类型： ACCEPT， DROP。 </li>
<li>description - String - （过滤条件）描述。 </li>
<li>direction - String - （过滤条件）方向, 支持类型：INGRESS， EGRESS。</li> 
     * @return Filters <li>traffic-mirror-filter-rule-id - String - （过滤条件） 流量镜像过滤规则，形如：tmfi-qfhrb7yj。 </li>
<li>action - String - （过滤条件）策略， 支持类型： ACCEPT， DROP。 </li>
<li>description - String - （过滤条件）描述。 </li>
<li>direction - String - （过滤条件）方向, 支持类型：INGRESS， EGRESS。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>traffic-mirror-filter-rule-id - String - （过滤条件） 流量镜像过滤规则，形如：tmfi-qfhrb7yj。 </li>
<li>action - String - （过滤条件）策略， 支持类型： ACCEPT， DROP。 </li>
<li>description - String - （过滤条件）描述。 </li>
<li>direction - String - （过滤条件）方向, 支持类型：INGRESS， EGRESS。</li>
     * @param Filters <li>traffic-mirror-filter-rule-id - String - （过滤条件） 流量镜像过滤规则，形如：tmfi-qfhrb7yj。 </li>
<li>action - String - （过滤条件）策略， 支持类型： ACCEPT， DROP。 </li>
<li>description - String - （过滤条件）描述。 </li>
<li>direction - String - （过滤条件）方向, 支持类型：INGRESS， EGRESS。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求对象个数。 
     * @return Limit 请求对象个数。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求对象个数。
     * @param Limit 请求对象个数。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTrafficMirrorFilterRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficMirrorFilterRulesRequest(DescribeTrafficMirrorFilterRulesRequest source) {
        if (source.TrafficMirrorId != null) {
            this.TrafficMirrorId = new String(source.TrafficMirrorId);
        }
        if (source.TrafficMirrorFilterRuleIds != null) {
            this.TrafficMirrorFilterRuleIds = new String[source.TrafficMirrorFilterRuleIds.length];
            for (int i = 0; i < source.TrafficMirrorFilterRuleIds.length; i++) {
                this.TrafficMirrorFilterRuleIds[i] = new String(source.TrafficMirrorFilterRuleIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArraySimple(map, prefix + "TrafficMirrorFilterRuleIds.", this.TrafficMirrorFilterRuleIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

