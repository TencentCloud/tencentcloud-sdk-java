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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBCustomDisasterRecoverGroupsRequest extends AbstractModel {

    /**
    * <p>置放群组ID</p><p>入参限制：单次数量上限是10</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>查询筛选条件。支持的筛选条件包括：</p><ul><li>tag-key：按标签键进行过滤。</li><li>tag-value：按标签值进行过滤。</li></ul><p>入参限制：数量上限为5</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>根据标签键和标签值筛选 DB Custom 置放群组</p><p>入参限制：数量上限为5</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>分页偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>置放群组ID</p><p>入参限制：单次数量上限是10</p> 
     * @return DisasterRecoverGroupIds <p>置放群组ID</p><p>入参限制：单次数量上限是10</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>置放群组ID</p><p>入参限制：单次数量上限是10</p>
     * @param DisasterRecoverGroupIds <p>置放群组ID</p><p>入参限制：单次数量上限是10</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>查询筛选条件。支持的筛选条件包括：</p><ul><li>tag-key：按标签键进行过滤。</li><li>tag-value：按标签值进行过滤。</li></ul><p>入参限制：数量上限为5</p> 
     * @return Filters <p>查询筛选条件。支持的筛选条件包括：</p><ul><li>tag-key：按标签键进行过滤。</li><li>tag-value：按标签值进行过滤。</li></ul><p>入参限制：数量上限为5</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询筛选条件。支持的筛选条件包括：</p><ul><li>tag-key：按标签键进行过滤。</li><li>tag-value：按标签值进行过滤。</li></ul><p>入参限制：数量上限为5</p>
     * @param Filters <p>查询筛选条件。支持的筛选条件包括：</p><ul><li>tag-key：按标签键进行过滤。</li><li>tag-value：按标签值进行过滤。</li></ul><p>入参限制：数量上限为5</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>根据标签键和标签值筛选 DB Custom 置放群组</p><p>入参限制：数量上限为5</p> 
     * @return Tags <p>根据标签键和标签值筛选 DB Custom 置放群组</p><p>入参限制：数量上限为5</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>根据标签键和标签值筛选 DB Custom 置放群组</p><p>入参限制：数量上限为5</p>
     * @param Tags <p>根据标签键和标签值筛选 DB Custom 置放群组</p><p>入参限制：数量上限为5</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>分页偏移量</p> 
     * @return Offset <p>分页偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量</p>
     * @param Offset <p>分页偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p> 
     * @return Limit <p>返回数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     * @param Limit <p>返回数量</p><p>取值范围：[1, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDBCustomDisasterRecoverGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBCustomDisasterRecoverGroupsRequest(DescribeDBCustomDisasterRecoverGroupsRequest source) {
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
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
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

