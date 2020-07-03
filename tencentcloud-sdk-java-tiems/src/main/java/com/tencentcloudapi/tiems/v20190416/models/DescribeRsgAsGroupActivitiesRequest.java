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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRsgAsGroupActivitiesRequest extends AbstractModel{

    /**
    * 伸缩组 ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 查询活动的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询互动的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 筛选选项
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大值为 200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 输出列表的排列顺序。取值范围："ASC", "DESC"
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序的依据字段， 取值范围 "CREATE_TIME", "UPDATE_TIME", "NAME"
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get 伸缩组 ID 
     * @return Id 伸缩组 ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 伸缩组 ID
     * @param Id 伸缩组 ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 查询活动的开始时间 
     * @return StartTime 查询活动的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询活动的开始时间
     * @param StartTime 查询活动的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询互动的结束时间 
     * @return EndTime 查询互动的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询互动的结束时间
     * @param EndTime 查询互动的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 筛选选项 
     * @return Filters 筛选选项
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选选项
     * @param Filters 筛选选项
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为 0 
     * @return Offset 偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0
     * @param Offset 偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 200 
     * @return Limit 返回数量，默认为 20，最大值为 200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 200
     * @param Limit 返回数量，默认为 20，最大值为 200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 输出列表的排列顺序。取值范围："ASC", "DESC" 
     * @return Order 输出列表的排列顺序。取值范围："ASC", "DESC"
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出列表的排列顺序。取值范围："ASC", "DESC"
     * @param Order 输出列表的排列顺序。取值范围："ASC", "DESC"
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序的依据字段， 取值范围 "CREATE_TIME", "UPDATE_TIME", "NAME" 
     * @return OrderField 排序的依据字段， 取值范围 "CREATE_TIME", "UPDATE_TIME", "NAME"
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序的依据字段， 取值范围 "CREATE_TIME", "UPDATE_TIME", "NAME"
     * @param OrderField 排序的依据字段， 取值范围 "CREATE_TIME", "UPDATE_TIME", "NAME"
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

