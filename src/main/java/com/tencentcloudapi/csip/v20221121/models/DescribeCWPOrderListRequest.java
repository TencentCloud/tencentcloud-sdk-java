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

public class DescribeCWPOrderListRequest extends AbstractModel {

    /**
    * <p>多个条件筛选时取交集</p><li>ProductCode 产品编码,p_开头</li><li>SubProductCode 子产品编码,sp_开头</li><li>InquireKey  计费项,sv_开头</li><li>Status 资源状态 1正常 2隔离 3销毁</li><li>PayMode 付费模式 0 按量计费 , 1 包年包月</li><li>ResourceId 资源ID</li><li>RenewFlag 自动续费标签 0 默认不需要(大客户存在自动续费的能力) 1 自动续费 2 手动设置不自动续费</li><li>DealNames 子订单号</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>偏移量,默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制条数,默认10 ,最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>多个条件筛选时取交集</p><li>ProductCode 产品编码,p_开头</li><li>SubProductCode 子产品编码,sp_开头</li><li>InquireKey  计费项,sv_开头</li><li>Status 资源状态 1正常 2隔离 3销毁</li><li>PayMode 付费模式 0 按量计费 , 1 包年包月</li><li>ResourceId 资源ID</li><li>RenewFlag 自动续费标签 0 默认不需要(大客户存在自动续费的能力) 1 自动续费 2 手动设置不自动续费</li><li>DealNames 子订单号</li> 
     * @return Filters <p>多个条件筛选时取交集</p><li>ProductCode 产品编码,p_开头</li><li>SubProductCode 子产品编码,sp_开头</li><li>InquireKey  计费项,sv_开头</li><li>Status 资源状态 1正常 2隔离 3销毁</li><li>PayMode 付费模式 0 按量计费 , 1 包年包月</li><li>ResourceId 资源ID</li><li>RenewFlag 自动续费标签 0 默认不需要(大客户存在自动续费的能力) 1 自动续费 2 手动设置不自动续费</li><li>DealNames 子订单号</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>多个条件筛选时取交集</p><li>ProductCode 产品编码,p_开头</li><li>SubProductCode 子产品编码,sp_开头</li><li>InquireKey  计费项,sv_开头</li><li>Status 资源状态 1正常 2隔离 3销毁</li><li>PayMode 付费模式 0 按量计费 , 1 包年包月</li><li>ResourceId 资源ID</li><li>RenewFlag 自动续费标签 0 默认不需要(大客户存在自动续费的能力) 1 自动续费 2 手动设置不自动续费</li><li>DealNames 子订单号</li>
     * @param Filters <p>多个条件筛选时取交集</p><li>ProductCode 产品编码,p_开头</li><li>SubProductCode 子产品编码,sp_开头</li><li>InquireKey  计费项,sv_开头</li><li>Status 资源状态 1正常 2隔离 3销毁</li><li>PayMode 付费模式 0 按量计费 , 1 包年包月</li><li>ResourceId 资源ID</li><li>RenewFlag 自动续费标签 0 默认不需要(大客户存在自动续费的能力) 1 自动续费 2 手动设置不自动续费</li><li>DealNames 子订单号</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
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

    public DescribeCWPOrderListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCWPOrderListRequest(DescribeCWPOrderListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

