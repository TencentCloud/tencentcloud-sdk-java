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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePluginSummaryListRequest extends AbstractModel {

    /**
    * 空间ID，查询空间内的插件列表时使用
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 过滤条件列表 支持：PluginKind、CategoryKey、PluginSource、PluginId、PluginClass、BillingType
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>是否只返回已收藏插件。取 true 时，仅返回当前用户已收藏的插件；取 false 或不传时不按收藏状态过滤。</p>
    */
    @SerializedName("IsFavoriteOnly")
    @Expose
    private Boolean IsFavoriteOnly;

    /**
    * <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
    */
    @SerializedName("Module")
    @Expose
    private Long Module;

    /**
    * 页码 从0开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询内容 模糊匹配：插件名称/插件描述/工具名称/工具描述
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>排序方式。</p><p>枚举值：</p><ul><li>0：未指定，默认排序</li><li>1：按相关性排序</li><li>2：按更新时间排序</li><li>3：默认排序</li><li>4：按热度排序</li></ul>
    */
    @SerializedName("SortType")
    @Expose
    private Long SortType;

    /**
     * Get 空间ID，查询空间内的插件列表时使用 
     * @return SpaceId 空间ID，查询空间内的插件列表时使用
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 空间ID，查询空间内的插件列表时使用
     * @param SpaceId 空间ID，查询空间内的插件列表时使用
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 过滤条件列表 支持：PluginKind、CategoryKey、PluginSource、PluginId、PluginClass、BillingType 
     * @return FilterList 过滤条件列表 支持：PluginKind、CategoryKey、PluginSource、PluginId、PluginClass、BillingType
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set 过滤条件列表 支持：PluginKind、CategoryKey、PluginSource、PluginId、PluginClass、BillingType
     * @param FilterList 过滤条件列表 支持：PluginKind、CategoryKey、PluginSource、PluginId、PluginClass、BillingType
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>是否只返回已收藏插件。取 true 时，仅返回当前用户已收藏的插件；取 false 或不传时不按收藏状态过滤。</p> 
     * @return IsFavoriteOnly <p>是否只返回已收藏插件。取 true 时，仅返回当前用户已收藏的插件；取 false 或不传时不按收藏状态过滤。</p>
     */
    public Boolean getIsFavoriteOnly() {
        return this.IsFavoriteOnly;
    }

    /**
     * Set <p>是否只返回已收藏插件。取 true 时，仅返回当前用户已收藏的插件；取 false 或不传时不按收藏状态过滤。</p>
     * @param IsFavoriteOnly <p>是否只返回已收藏插件。取 true 时，仅返回当前用户已收藏的插件；取 false 或不传时不按收藏状态过滤。</p>
     */
    public void setIsFavoriteOnly(Boolean IsFavoriteOnly) {
        this.IsFavoriteOnly = IsFavoriteOnly;
    }

    /**
     * Get <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul> 
     * @return Module <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
     */
    public Long getModule() {
        return this.Module;
    }

    /**
     * Set <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
     * @param Module <p>插件展示场景。不传或取 0 时不限定场景。</p><p>枚举值：</p><ul><li>0：不限定场景</li><li>1：Agent 模式</li><li>2：工作流</li><li>3：智能工作台</li></ul>
     */
    public void setModule(Long Module) {
        this.Module = Module;
    }

    /**
     * Get 页码 从0开始 
     * @return PageNumber 页码 从0开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码 从0开始
     * @param PageNumber 页码 从0开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页大小 
     * @return PageSize 每页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小
     * @param PageSize 每页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询内容 模糊匹配：插件名称/插件描述/工具名称/工具描述 
     * @return Query 查询内容 模糊匹配：插件名称/插件描述/工具名称/工具描述
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询内容 模糊匹配：插件名称/插件描述/工具名称/工具描述
     * @param Query 查询内容 模糊匹配：插件名称/插件描述/工具名称/工具描述
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>排序方式。</p><p>枚举值：</p><ul><li>0：未指定，默认排序</li><li>1：按相关性排序</li><li>2：按更新时间排序</li><li>3：默认排序</li><li>4：按热度排序</li></ul> 
     * @return SortType <p>排序方式。</p><p>枚举值：</p><ul><li>0：未指定，默认排序</li><li>1：按相关性排序</li><li>2：按更新时间排序</li><li>3：默认排序</li><li>4：按热度排序</li></ul>
     */
    public Long getSortType() {
        return this.SortType;
    }

    /**
     * Set <p>排序方式。</p><p>枚举值：</p><ul><li>0：未指定，默认排序</li><li>1：按相关性排序</li><li>2：按更新时间排序</li><li>3：默认排序</li><li>4：按热度排序</li></ul>
     * @param SortType <p>排序方式。</p><p>枚举值：</p><ul><li>0：未指定，默认排序</li><li>1：按相关性排序</li><li>2：按更新时间排序</li><li>3：默认排序</li><li>4：按热度排序</li></ul>
     */
    public void setSortType(Long SortType) {
        this.SortType = SortType;
    }

    public DescribePluginSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePluginSummaryListRequest(DescribePluginSummaryListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.IsFavoriteOnly != null) {
            this.IsFavoriteOnly = new Boolean(source.IsFavoriteOnly);
        }
        if (source.Module != null) {
            this.Module = new Long(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SortType != null) {
            this.SortType = new Long(source.SortType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "IsFavoriteOnly", this.IsFavoriteOnly);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SortType", this.SortType);

    }
}

