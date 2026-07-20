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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListConnectionsRequest extends AbstractModel {

    /**
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>根据哪个字段进行返回结果排序</p><p>枚举值：</p><ul><li>created_at： 创建时间</li><li>updated_at： 更新时间</li><li>name： 连接器名称</li></ul><p>默认值：updated_at</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>根据哪个字段进行返回结果排序</p><p>枚举值：</p><ul><li>created_at： 创建时间</li><li>updated_at： 更新时间</li><li>name： 连接器名称</li></ul><p>默认值：updated_at</p> 
     * @return OrderBy <p>根据哪个字段进行返回结果排序</p><p>枚举值：</p><ul><li>created_at： 创建时间</li><li>updated_at： 更新时间</li><li>name： 连接器名称</li></ul><p>默认值：updated_at</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>根据哪个字段进行返回结果排序</p><p>枚举值：</p><ul><li>created_at： 创建时间</li><li>updated_at： 更新时间</li><li>name： 连接器名称</li></ul><p>默认值：updated_at</p>
     * @param OrderBy <p>根据哪个字段进行返回结果排序</p><p>枚举值：</p><ul><li>created_at： 创建时间</li><li>updated_at： 更新时间</li><li>name： 连接器名称</li></ul><p>默认值：updated_at</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p> 
     * @return Order <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
     * @param Order <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public ListConnectionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListConnectionsRequest(ListConnectionsRequest source) {
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

