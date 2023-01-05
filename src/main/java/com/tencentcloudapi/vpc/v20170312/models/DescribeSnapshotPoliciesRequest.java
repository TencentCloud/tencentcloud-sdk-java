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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotPoliciesRequest extends AbstractModel{

    /**
    * 快照策略Id。
    */
    @SerializedName("SnapshotPolicyIds")
    @Expose
    private String [] SnapshotPolicyIds;

    /**
    * 过滤条件，参数不支持同时指定SnapshotPolicyIds和Filters。
<li>snapshot-policy-id - String -（过滤条件）快照策略ID。</li>
<li>snapshot-policy-name - String -（过滤条件）快照策略名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大为200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 快照策略Id。 
     * @return SnapshotPolicyIds 快照策略Id。
     */
    public String [] getSnapshotPolicyIds() {
        return this.SnapshotPolicyIds;
    }

    /**
     * Set 快照策略Id。
     * @param SnapshotPolicyIds 快照策略Id。
     */
    public void setSnapshotPolicyIds(String [] SnapshotPolicyIds) {
        this.SnapshotPolicyIds = SnapshotPolicyIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定SnapshotPolicyIds和Filters。
<li>snapshot-policy-id - String -（过滤条件）快照策略ID。</li>
<li>snapshot-policy-name - String -（过滤条件）快照策略名称。</li> 
     * @return Filters 过滤条件，参数不支持同时指定SnapshotPolicyIds和Filters。
<li>snapshot-policy-id - String -（过滤条件）快照策略ID。</li>
<li>snapshot-policy-name - String -（过滤条件）快照策略名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定SnapshotPolicyIds和Filters。
<li>snapshot-policy-id - String -（过滤条件）快照策略ID。</li>
<li>snapshot-policy-name - String -（过滤条件）快照策略名称。</li>
     * @param Filters 过滤条件，参数不支持同时指定SnapshotPolicyIds和Filters。
<li>snapshot-policy-id - String -（过滤条件）快照策略ID。</li>
<li>snapshot-policy-name - String -（过滤条件）快照策略名称。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大为200。 
     * @return Limit 返回数量，默认为20，最大为200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大为200。
     * @param Limit 返回数量，默认为20，最大为200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSnapshotPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotPoliciesRequest(DescribeSnapshotPoliciesRequest source) {
        if (source.SnapshotPolicyIds != null) {
            this.SnapshotPolicyIds = new String[source.SnapshotPolicyIds.length];
            for (int i = 0; i < source.SnapshotPolicyIds.length; i++) {
                this.SnapshotPolicyIds[i] = new String(source.SnapshotPolicyIds[i]);
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
        this.setParamArraySimple(map, prefix + "SnapshotPolicyIds.", this.SnapshotPolicyIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

