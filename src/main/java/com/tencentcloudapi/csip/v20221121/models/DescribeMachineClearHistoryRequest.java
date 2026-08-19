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

public class DescribeMachineClearHistoryRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>筛选条件多个条件筛选时 Keywords,TimeBetween,取交集 Keywords 实例名称/内网/公网IP TimeBetween 时间区间</p>
    */
    @SerializedName("Filters")
    @Expose
    private EDRFilters [] Filters;

    /**
    * <p>限制条数,默认10 ,最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量,默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>正序, ASC , 倒序 DESC , 默认ASC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>AgentLastOfflineTime 客户端最后离线时间AutoClearTime 清理时间</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>筛选条件多个条件筛选时 Keywords,TimeBetween,取交集 Keywords 实例名称/内网/公网IP TimeBetween 时间区间</p> 
     * @return Filters <p>筛选条件多个条件筛选时 Keywords,TimeBetween,取交集 Keywords 实例名称/内网/公网IP TimeBetween 时间区间</p>
     */
    public EDRFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件多个条件筛选时 Keywords,TimeBetween,取交集 Keywords 实例名称/内网/公网IP TimeBetween 时间区间</p>
     * @param Filters <p>筛选条件多个条件筛选时 Keywords,TimeBetween,取交集 Keywords 实例名称/内网/公网IP TimeBetween 时间区间</p>
     */
    public void setFilters(EDRFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>限制条数,默认10 ,最大100</p> 
     * @return Limit <p>限制条数,默认10 ,最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制条数,默认10 ,最大100</p>
     * @param Limit <p>限制条数,默认10 ,最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量,默认0</p> 
     * @return Offset <p>偏移量,默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量,默认0</p>
     * @param Offset <p>偏移量,默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>正序, ASC , 倒序 DESC , 默认ASC</p> 
     * @return Order <p>正序, ASC , 倒序 DESC , 默认ASC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>正序, ASC , 倒序 DESC , 默认ASC</p>
     * @param Order <p>正序, ASC , 倒序 DESC , 默认ASC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>AgentLastOfflineTime 客户端最后离线时间AutoClearTime 清理时间</p> 
     * @return By <p>AgentLastOfflineTime 客户端最后离线时间AutoClearTime 清理时间</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>AgentLastOfflineTime 客户端最后离线时间AutoClearTime 清理时间</p>
     * @param By <p>AgentLastOfflineTime 客户端最后离线时间AutoClearTime 清理时间</p>
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
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new EDRFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new EDRFilters(source.Filters[i]);
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
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

