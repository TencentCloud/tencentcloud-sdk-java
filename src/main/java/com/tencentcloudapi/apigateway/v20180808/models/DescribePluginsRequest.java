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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePluginsRequest extends AbstractModel {

    /**
    * 要查询的插件列表。
    */
    @SerializedName("PluginIds")
    @Expose
    private String [] PluginIds;

    /**
    * 要查询的插件名称。
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 要查询的插件类型。
    */
    @SerializedName("PluginType")
    @Expose
    private String PluginType;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。预留字段，目前不支持过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 要查询的插件列表。 
     * @return PluginIds 要查询的插件列表。
     */
    public String [] getPluginIds() {
        return this.PluginIds;
    }

    /**
     * Set 要查询的插件列表。
     * @param PluginIds 要查询的插件列表。
     */
    public void setPluginIds(String [] PluginIds) {
        this.PluginIds = PluginIds;
    }

    /**
     * Get 要查询的插件名称。 
     * @return PluginName 要查询的插件名称。
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 要查询的插件名称。
     * @param PluginName 要查询的插件名称。
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 要查询的插件类型。 
     * @return PluginType 要查询的插件类型。
     */
    public String getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 要查询的插件类型。
     * @param PluginType 要查询的插件类型。
     */
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。预留字段，目前不支持过滤。 
     * @return Filters 过滤条件。预留字段，目前不支持过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。预留字段，目前不支持过滤。
     * @param Filters 过滤条件。预留字段，目前不支持过滤。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePluginsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePluginsRequest(DescribePluginsRequest source) {
        if (source.PluginIds != null) {
            this.PluginIds = new String[source.PluginIds.length];
            for (int i = 0; i < source.PluginIds.length; i++) {
                this.PluginIds[i] = new String(source.PluginIds[i]);
            }
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PluginIds.", this.PluginIds);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

