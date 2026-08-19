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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetHeaderItem extends AbstractModel {

    /**
    * <p>类型</p>
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
    * <p>展示</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>是否支持复制</p>
    */
    @SerializedName("Copy")
    @Expose
    private Long Copy;

    /**
    * <p>值对应字段键</p>
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * <p>跳转URL</p>
    */
    @SerializedName("LinkURL")
    @Expose
    private String LinkURL;

    /**
    * <p>过滤器</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilterConfig [] Filters;

    /**
    * <p>是否支持排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private Long Sort;

    /**
    * <p>字段展示样式</p>
    */
    @SerializedName("ValueStyle")
    @Expose
    private String ValueStyle;

    /**
     * Get <p>类型</p> 
     * @return ItemType <p>类型</p>
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set <p>类型</p>
     * @param ItemType <p>类型</p>
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get <p>展示</p> 
     * @return Label <p>展示</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>展示</p>
     * @param Label <p>展示</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>是否支持复制</p> 
     * @return Copy <p>是否支持复制</p>
     */
    public Long getCopy() {
        return this.Copy;
    }

    /**
     * Set <p>是否支持复制</p>
     * @param Copy <p>是否支持复制</p>
     */
    public void setCopy(Long Copy) {
        this.Copy = Copy;
    }

    /**
     * Get <p>值对应字段键</p> 
     * @return Values <p>值对应字段键</p>
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set <p>值对应字段键</p>
     * @param Values <p>值对应字段键</p>
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get <p>跳转URL</p> 
     * @return LinkURL <p>跳转URL</p>
     */
    public String getLinkURL() {
        return this.LinkURL;
    }

    /**
     * Set <p>跳转URL</p>
     * @param LinkURL <p>跳转URL</p>
     */
    public void setLinkURL(String LinkURL) {
        this.LinkURL = LinkURL;
    }

    /**
     * Get <p>过滤器</p> 
     * @return Filters <p>过滤器</p>
     */
    public AssetFilterConfig [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器</p>
     * @param Filters <p>过滤器</p>
     */
    public void setFilters(AssetFilterConfig [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>是否支持排序</p> 
     * @return Sort <p>是否支持排序</p>
     */
    public Long getSort() {
        return this.Sort;
    }

    /**
     * Set <p>是否支持排序</p>
     * @param Sort <p>是否支持排序</p>
     */
    public void setSort(Long Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>字段展示样式</p> 
     * @return ValueStyle <p>字段展示样式</p>
     */
    public String getValueStyle() {
        return this.ValueStyle;
    }

    /**
     * Set <p>字段展示样式</p>
     * @param ValueStyle <p>字段展示样式</p>
     */
    public void setValueStyle(String ValueStyle) {
        this.ValueStyle = ValueStyle;
    }

    public AssetHeaderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetHeaderItem(AssetHeaderItem source) {
        if (source.ItemType != null) {
            this.ItemType = new String(source.ItemType);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Copy != null) {
            this.Copy = new Long(source.Copy);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.LinkURL != null) {
            this.LinkURL = new String(source.LinkURL);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilterConfig[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilterConfig(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new Long(source.Sort);
        }
        if (source.ValueStyle != null) {
            this.ValueStyle = new String(source.ValueStyle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Copy", this.Copy);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "LinkURL", this.LinkURL);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "ValueStyle", this.ValueStyle);

    }
}

