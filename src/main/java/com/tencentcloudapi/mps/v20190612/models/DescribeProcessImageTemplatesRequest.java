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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProcessImageTemplatesRequest extends AbstractModel {

    /**
    * 图片处理模板唯一标识过滤条件，数组长度限制：100。
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数 默认值：10；最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 图片处理模板标识过滤条件。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 排序方式，OrderBy设置后才有效，可选值：   0：升序   1：降序  默认 0。
    */
    @SerializedName("OrderType")
    @Expose
    private Long OrderType;

    /**
    * 排序字段，可选值：  
Definition：模板唯一标识； 
默认值：创建时间。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 模板类型过滤条件，可选值： <li>Preset：系统预置模板；</li> <li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 图片处理模板唯一标识过滤条件，数组长度限制：100。 
     * @return Definitions 图片处理模板唯一标识过滤条件，数组长度限制：100。
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * Set 图片处理模板唯一标识过滤条件，数组长度限制：100。
     * @param Definitions 图片处理模板唯一标识过滤条件，数组长度限制：100。
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数 默认值：10；最大值：100。 
     * @return Limit 返回记录条数 默认值：10；最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数 默认值：10；最大值：100。
     * @param Limit 返回记录条数 默认值：10；最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 图片处理模板标识过滤条件。 
     * @return Name 图片处理模板标识过滤条件。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 图片处理模板标识过滤条件。
     * @param Name 图片处理模板标识过滤条件。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 排序方式，OrderBy设置后才有效，可选值：   0：升序   1：降序  默认 0。 
     * @return OrderType 排序方式，OrderBy设置后才有效，可选值：   0：升序   1：降序  默认 0。
     */
    public Long getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式，OrderBy设置后才有效，可选值：   0：升序   1：降序  默认 0。
     * @param OrderType 排序方式，OrderBy设置后才有效，可选值：   0：升序   1：降序  默认 0。
     */
    public void setOrderType(Long OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 排序字段，可选值：  
Definition：模板唯一标识； 
默认值：创建时间。 
     * @return OrderBy 排序字段，可选值：  
Definition：模板唯一标识； 
默认值：创建时间。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可选值：  
Definition：模板唯一标识； 
默认值：创建时间。
     * @param OrderBy 排序字段，可选值：  
Definition：模板唯一标识； 
默认值：创建时间。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 模板类型过滤条件，可选值： <li>Preset：系统预置模板；</li> <li>Custom：用户自定义模板。</li> 
     * @return Type 模板类型过滤条件，可选值： <li>Preset：系统预置模板；</li> <li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型过滤条件，可选值： <li>Preset：系统预置模板；</li> <li>Custom：用户自定义模板。</li>
     * @param Type 模板类型过滤条件，可选值： <li>Preset：系统预置模板；</li> <li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeProcessImageTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProcessImageTemplatesRequest(DescribeProcessImageTemplatesRequest source) {
        if (source.Definitions != null) {
            this.Definitions = new Long[source.Definitions.length];
            for (int i = 0; i < source.Definitions.length; i++) {
                this.Definitions[i] = new Long(source.Definitions[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OrderType != null) {
            this.OrderType = new Long(source.OrderType);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

