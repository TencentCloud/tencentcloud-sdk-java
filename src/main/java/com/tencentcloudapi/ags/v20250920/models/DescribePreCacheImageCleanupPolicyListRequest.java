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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePreCacheImageCleanupPolicyListRequest extends AbstractModel {

    /**
    * <p>策略 ID 列表</p><p>入参限制：最多 100 个，每个 1～64 字符；指定时 Offset、Limit、Filters 不生效，不存在或已删除的 ID 被忽略</p>
    */
    @SerializedName("CleanupPolicyIds")
    @Expose
    private String [] CleanupPolicyIds;

    /**
    * <p>过滤器</p><p>入参限制：Filter={Name:String,Values:String[]}；最多 10 个 Filter，每个 Filter 的 Name 和 Values 必填，Values 最多 10 个、每个最多 255 字符</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>偏移值</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量限制</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>策略 ID 列表</p><p>入参限制：最多 100 个，每个 1～64 字符；指定时 Offset、Limit、Filters 不生效，不存在或已删除的 ID 被忽略</p> 
     * @return CleanupPolicyIds <p>策略 ID 列表</p><p>入参限制：最多 100 个，每个 1～64 字符；指定时 Offset、Limit、Filters 不生效，不存在或已删除的 ID 被忽略</p>
     */
    public String [] getCleanupPolicyIds() {
        return this.CleanupPolicyIds;
    }

    /**
     * Set <p>策略 ID 列表</p><p>入参限制：最多 100 个，每个 1～64 字符；指定时 Offset、Limit、Filters 不生效，不存在或已删除的 ID 被忽略</p>
     * @param CleanupPolicyIds <p>策略 ID 列表</p><p>入参限制：最多 100 个，每个 1～64 字符；指定时 Offset、Limit、Filters 不生效，不存在或已删除的 ID 被忽略</p>
     */
    public void setCleanupPolicyIds(String [] CleanupPolicyIds) {
        this.CleanupPolicyIds = CleanupPolicyIds;
    }

    /**
     * Get <p>过滤器</p><p>入参限制：Filter={Name:String,Values:String[]}；最多 10 个 Filter，每个 Filter 的 Name 和 Values 必填，Values 最多 10 个、每个最多 255 字符</p> 
     * @return Filters <p>过滤器</p><p>入参限制：Filter={Name:String,Values:String[]}；最多 10 个 Filter，每个 Filter 的 Name 和 Values 必填，Values 最多 10 个、每个最多 255 字符</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器</p><p>入参限制：Filter={Name:String,Values:String[]}；最多 10 个 Filter，每个 Filter 的 Name 和 Values 必填，Values 最多 10 个、每个最多 255 字符</p>
     * @param Filters <p>过滤器</p><p>入参限制：Filter={Name:String,Values:String[]}；最多 10 个 Filter，每个 Filter 的 Name 和 Values 必填，Values 最多 10 个、每个最多 255 字符</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移值</p><p>默认值：0</p> 
     * @return Offset <p>偏移值</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移值</p><p>默认值：0</p>
     * @param Offset <p>偏移值</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量限制</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return Limit <p>返回数量限制</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量限制</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param Limit <p>返回数量限制</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePreCacheImageCleanupPolicyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePreCacheImageCleanupPolicyListRequest(DescribePreCacheImageCleanupPolicyListRequest source) {
        if (source.CleanupPolicyIds != null) {
            this.CleanupPolicyIds = new String[source.CleanupPolicyIds.length];
            for (int i = 0; i < source.CleanupPolicyIds.length; i++) {
                this.CleanupPolicyIds[i] = new String(source.CleanupPolicyIds[i]);
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
        this.setParamArraySimple(map, prefix + "CleanupPolicyIds.", this.CleanupPolicyIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

