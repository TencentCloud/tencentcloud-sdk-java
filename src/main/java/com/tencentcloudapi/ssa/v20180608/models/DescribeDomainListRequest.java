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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainListRequest extends AbstractModel{

    /**
    * 起始，从0开始(只支持32位)
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * limit,最大值200(只支持32位)
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资产大类，根据此字段时返回不同的子结构,AssetBasicType(只支持32位)
    */
    @SerializedName("AssetBasicType")
    @Expose
    private Long AssetBasicType;

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private QueryFilterV3 [] Filter;

    /**
    * 排序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 导出字段
    */
    @SerializedName("Field")
    @Expose
    private String [] Field;

    /**
    * 时间范围(只支持32位)
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * 逻辑字段(只支持32位)
    */
    @SerializedName("Logic")
    @Expose
    private Long Logic;

    /**
    * 聚合字段  
    */
    @SerializedName("GroupByField")
    @Expose
    private String GroupByField;

    /**
    * -
    */
    @SerializedName("Task")
    @Expose
    private String Task;

    /**
    * 0:cfw 1:vss 2.soc 3.waf 4.cwp
    */
    @SerializedName("RequestFrom")
    @Expose
    private Long RequestFrom;

    /**
     * Get 起始，从0开始(只支持32位) 
     * @return Offset 起始，从0开始(只支持32位)
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始，从0开始(只支持32位)
     * @param Offset 起始，从0开始(只支持32位)
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get limit,最大值200(只支持32位) 
     * @return Limit limit,最大值200(只支持32位)
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set limit,最大值200(只支持32位)
     * @param Limit limit,最大值200(只支持32位)
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 资产大类，根据此字段时返回不同的子结构,AssetBasicType(只支持32位) 
     * @return AssetBasicType 资产大类，根据此字段时返回不同的子结构,AssetBasicType(只支持32位)
     */
    public Long getAssetBasicType() {
        return this.AssetBasicType;
    }

    /**
     * Set 资产大类，根据此字段时返回不同的子结构,AssetBasicType(只支持32位)
     * @param AssetBasicType 资产大类，根据此字段时返回不同的子结构,AssetBasicType(只支持32位)
     */
    public void setAssetBasicType(Long AssetBasicType) {
        this.AssetBasicType = AssetBasicType;
    }

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public QueryFilterV3 [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(QueryFilterV3 [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 排序 
     * @return Order 排序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序
     * @param Order 排序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 导出字段 
     * @return Field 导出字段
     */
    public String [] getField() {
        return this.Field;
    }

    /**
     * Set 导出字段
     * @param Field 导出字段
     */
    public void setField(String [] Field) {
        this.Field = Field;
    }

    /**
     * Get 时间范围(只支持32位) 
     * @return TimeRange 时间范围(只支持32位)
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 时间范围(只支持32位)
     * @param TimeRange 时间范围(只支持32位)
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get 逻辑字段(只支持32位) 
     * @return Logic 逻辑字段(只支持32位)
     */
    public Long getLogic() {
        return this.Logic;
    }

    /**
     * Set 逻辑字段(只支持32位)
     * @param Logic 逻辑字段(只支持32位)
     */
    public void setLogic(Long Logic) {
        this.Logic = Logic;
    }

    /**
     * Get 聚合字段   
     * @return GroupByField 聚合字段  
     */
    public String getGroupByField() {
        return this.GroupByField;
    }

    /**
     * Set 聚合字段  
     * @param GroupByField 聚合字段  
     */
    public void setGroupByField(String GroupByField) {
        this.GroupByField = GroupByField;
    }

    /**
     * Get - 
     * @return Task -
     */
    public String getTask() {
        return this.Task;
    }

    /**
     * Set -
     * @param Task -
     */
    public void setTask(String Task) {
        this.Task = Task;
    }

    /**
     * Get 0:cfw 1:vss 2.soc 3.waf 4.cwp 
     * @return RequestFrom 0:cfw 1:vss 2.soc 3.waf 4.cwp
     */
    public Long getRequestFrom() {
        return this.RequestFrom;
    }

    /**
     * Set 0:cfw 1:vss 2.soc 3.waf 4.cwp
     * @param RequestFrom 0:cfw 1:vss 2.soc 3.waf 4.cwp
     */
    public void setRequestFrom(Long RequestFrom) {
        this.RequestFrom = RequestFrom;
    }

    public DescribeDomainListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainListRequest(DescribeDomainListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AssetBasicType != null) {
            this.AssetBasicType = new Long(source.AssetBasicType);
        }
        if (source.Filter != null) {
            this.Filter = new QueryFilterV3[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new QueryFilterV3(source.Filter[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Field != null) {
            this.Field = new String[source.Field.length];
            for (int i = 0; i < source.Field.length; i++) {
                this.Field[i] = new String(source.Field[i]);
            }
        }
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.Logic != null) {
            this.Logic = new Long(source.Logic);
        }
        if (source.GroupByField != null) {
            this.GroupByField = new String(source.GroupByField);
        }
        if (source.Task != null) {
            this.Task = new String(source.Task);
        }
        if (source.RequestFrom != null) {
            this.RequestFrom = new Long(source.RequestFrom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "AssetBasicType", this.AssetBasicType);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "Field.", this.Field);
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "Logic", this.Logic);
        this.setParamSimple(map, prefix + "GroupByField", this.GroupByField);
        this.setParamSimple(map, prefix + "Task", this.Task);
        this.setParamSimple(map, prefix + "RequestFrom", this.RequestFrom);

    }
}

