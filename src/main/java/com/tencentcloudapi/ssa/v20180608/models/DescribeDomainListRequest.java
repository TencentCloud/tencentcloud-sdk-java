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
    * -
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * -
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * -
    */
    @SerializedName("AssetBasicType")
    @Expose
    private Long AssetBasicType;

    /**
    * -
    */
    @SerializedName("Filter")
    @Expose
    private QueryFilterV3 [] Filter;

    /**
    * -
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * -
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * -
    */
    @SerializedName("Field")
    @Expose
    private String [] Field;

    /**
    * -
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * -
    */
    @SerializedName("Logic")
    @Expose
    private Long Logic;

    /**
    * -
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
    * -
    */
    @SerializedName("RequestFrom")
    @Expose
    private Long RequestFrom;

    /**
     * Get - 
     * @return Offset -
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set -
     * @param Offset -
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get - 
     * @return Limit -
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set -
     * @param Limit -
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get - 
     * @return AssetBasicType -
     */
    public Long getAssetBasicType() {
        return this.AssetBasicType;
    }

    /**
     * Set -
     * @param AssetBasicType -
     */
    public void setAssetBasicType(Long AssetBasicType) {
        this.AssetBasicType = AssetBasicType;
    }

    /**
     * Get - 
     * @return Filter -
     */
    public QueryFilterV3 [] getFilter() {
        return this.Filter;
    }

    /**
     * Set -
     * @param Filter -
     */
    public void setFilter(QueryFilterV3 [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get - 
     * @return Order -
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set -
     * @param Order -
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get - 
     * @return By -
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set -
     * @param By -
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get - 
     * @return Field -
     */
    public String [] getField() {
        return this.Field;
    }

    /**
     * Set -
     * @param Field -
     */
    public void setField(String [] Field) {
        this.Field = Field;
    }

    /**
     * Get - 
     * @return TimeRange -
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set -
     * @param TimeRange -
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get - 
     * @return Logic -
     */
    public Long getLogic() {
        return this.Logic;
    }

    /**
     * Set -
     * @param Logic -
     */
    public void setLogic(Long Logic) {
        this.Logic = Logic;
    }

    /**
     * Get - 
     * @return GroupByField -
     */
    public String getGroupByField() {
        return this.GroupByField;
    }

    /**
     * Set -
     * @param GroupByField -
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
     * Get - 
     * @return RequestFrom -
     */
    public Long getRequestFrom() {
        return this.RequestFrom;
    }

    /**
     * Set -
     * @param RequestFrom -
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

