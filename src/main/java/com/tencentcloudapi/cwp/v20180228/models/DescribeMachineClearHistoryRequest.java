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

public class DescribeMachineClearHistoryRequest extends AbstractModel{

    /**
    * 筛选条件
多个条件筛选时 Keywords,TimeBetween,取交集
<li> Keywords 实例名称/内网/公网IP</li>
<li> TimeBetween 时间区间</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 限制条数,默认10 ,最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 正序, ASC , 倒序 DESC , 默认ASC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * AgentLastOfflineTime 客户端最后离线时间
AutoClearTime 清理时间
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 筛选条件
多个条件筛选时 Keywords,TimeBetween,取交集
<li> Keywords 实例名称/内网/公网IP</li>
<li> TimeBetween 时间区间</li> 
     * @return Filters 筛选条件
多个条件筛选时 Keywords,TimeBetween,取交集
<li> Keywords 实例名称/内网/公网IP</li>
<li> TimeBetween 时间区间</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
多个条件筛选时 Keywords,TimeBetween,取交集
<li> Keywords 实例名称/内网/公网IP</li>
<li> TimeBetween 时间区间</li>
     * @param Filters 筛选条件
多个条件筛选时 Keywords,TimeBetween,取交集
<li> Keywords 实例名称/内网/公网IP</li>
<li> TimeBetween 时间区间</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 限制条数,默认10 ,最大100 
     * @return Limit 限制条数,默认10 ,最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数,默认10 ,最大100
     * @param Limit 限制条数,默认10 ,最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 正序, ASC , 倒序 DESC , 默认ASC 
     * @return Order 正序, ASC , 倒序 DESC , 默认ASC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 正序, ASC , 倒序 DESC , 默认ASC
     * @param Order 正序, ASC , 倒序 DESC , 默认ASC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get AgentLastOfflineTime 客户端最后离线时间
AutoClearTime 清理时间 
     * @return By AgentLastOfflineTime 客户端最后离线时间
AutoClearTime 清理时间
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set AgentLastOfflineTime 客户端最后离线时间
AutoClearTime 清理时间
     * @param By AgentLastOfflineTime 客户端最后离线时间
AutoClearTime 清理时间
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeMachineClearHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMachineClearHistoryRequest(DescribeMachineClearHistoryRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

