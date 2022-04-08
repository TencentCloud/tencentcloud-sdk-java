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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMessageRouteListRequest extends AbstractModel{

    /**
    * 无
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 无
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 无
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 无
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 无
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 无
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 无 
     * @return Limit 无
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 无
     * @param Limit 无
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 无 
     * @return Offset 无
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 无
     * @param Offset 无
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 无 
     * @return Filter 无
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 无
     * @param Filter 无
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 无 
     * @return StartTime 无
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 无
     * @param StartTime 无
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 无 
     * @return EndTime 无
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 无
     * @param EndTime 无
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 无 
     * @return Order 无
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 无
     * @param Order 无
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeMessageRouteListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMessageRouteListRequest(DescribeMessageRouteListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

