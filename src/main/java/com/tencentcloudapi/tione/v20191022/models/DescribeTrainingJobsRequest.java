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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingJobsRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 创建时间晚于
    */
    @SerializedName("CreationTimeAfter")
    @Expose
    private String CreationTimeAfter;

    /**
    * 创建时间早于
    */
    @SerializedName("CreationTimeBefore")
    @Expose
    private String CreationTimeBefore;

    /**
    * 根据名称过滤
    */
    @SerializedName("NameContains")
    @Expose
    private String NameContains;

    /**
    * 根据状态过滤
    */
    @SerializedName("StatusEquals")
    @Expose
    private String StatusEquals;

    /**
    * 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制数目 
     * @return Limit 限制数目
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 创建时间晚于 
     * @return CreationTimeAfter 创建时间晚于
     */
    public String getCreationTimeAfter() {
        return this.CreationTimeAfter;
    }

    /**
     * Set 创建时间晚于
     * @param CreationTimeAfter 创建时间晚于
     */
    public void setCreationTimeAfter(String CreationTimeAfter) {
        this.CreationTimeAfter = CreationTimeAfter;
    }

    /**
     * Get 创建时间早于 
     * @return CreationTimeBefore 创建时间早于
     */
    public String getCreationTimeBefore() {
        return this.CreationTimeBefore;
    }

    /**
     * Set 创建时间早于
     * @param CreationTimeBefore 创建时间早于
     */
    public void setCreationTimeBefore(String CreationTimeBefore) {
        this.CreationTimeBefore = CreationTimeBefore;
    }

    /**
     * Get 根据名称过滤 
     * @return NameContains 根据名称过滤
     */
    public String getNameContains() {
        return this.NameContains;
    }

    /**
     * Set 根据名称过滤
     * @param NameContains 根据名称过滤
     */
    public void setNameContains(String NameContains) {
        this.NameContains = NameContains;
    }

    /**
     * Get 根据状态过滤 
     * @return StatusEquals 根据状态过滤
     */
    public String getStatusEquals() {
        return this.StatusEquals;
    }

    /**
     * Set 根据状态过滤
     * @param StatusEquals 根据状态过滤
     */
    public void setStatusEquals(String StatusEquals) {
        this.StatusEquals = StatusEquals;
    }

    /**
     * Get 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。 
     * @return Filters 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
     * @param Filters 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreationTimeAfter", this.CreationTimeAfter);
        this.setParamSimple(map, prefix + "CreationTimeBefore", this.CreationTimeBefore);
        this.setParamSimple(map, prefix + "NameContains", this.NameContains);
        this.setParamSimple(map, prefix + "StatusEquals", this.StatusEquals);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

