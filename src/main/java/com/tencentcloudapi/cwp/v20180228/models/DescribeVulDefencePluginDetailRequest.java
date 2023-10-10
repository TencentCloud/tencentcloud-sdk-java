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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulDefencePluginDetailRequest extends AbstractModel{

    /**
    * 主机Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * 过滤条件：Keywords: ip或者主机名,Exception，Status精确匹配
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 数据偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数据限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 主机Quuid 
     * @return Quuid 主机Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 主机Quuid
     * @param Quuid 主机Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get 过滤条件：Keywords: ip或者主机名,Exception，Status精确匹配 
     * @return Filters 过滤条件：Keywords: ip或者主机名,Exception，Status精确匹配
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：Keywords: ip或者主机名,Exception，Status精确匹配
     * @param Filters 过滤条件：Keywords: ip或者主机名,Exception，Status精确匹配
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 数据偏移 
     * @return Offset 数据偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移
     * @param Offset 数据偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 数据限制 
     * @return Limit 数据限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数据限制
     * @param Limit 数据限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeVulDefencePluginDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulDefencePluginDetailRequest(DescribeVulDefencePluginDetailRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

