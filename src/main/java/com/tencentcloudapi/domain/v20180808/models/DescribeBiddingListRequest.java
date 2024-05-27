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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBiddingListRequest extends AbstractModel {

    /**
    * 每页数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 2 竞价中  3 等待出价  4 交易失败  10 竞价阶段持有者赎回
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * 排序字段：BiddingEndTime 竞价结束时间	
BiddingPrice 我的价格
    */
    @SerializedName("SortField")
    @Expose
    private String SortField;

    /**
    * 排序规则：asc升序，desc降序
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 每页数量 
     * @return PageSize 每页数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量
     * @param PageSize 每页数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 2 竞价中  3 等待出价  4 交易失败  10 竞价阶段持有者赎回 
     * @return Status 2 竞价中  3 等待出价  4 交易失败  10 竞价阶段持有者赎回
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 2 竞价中  3 等待出价  4 交易失败  10 竞价阶段持有者赎回
     * @param Status 2 竞价中  3 等待出价  4 交易失败  10 竞价阶段持有者赎回
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get 排序字段：BiddingEndTime 竞价结束时间	
BiddingPrice 我的价格 
     * @return SortField 排序字段：BiddingEndTime 竞价结束时间	
BiddingPrice 我的价格
     */
    public String getSortField() {
        return this.SortField;
    }

    /**
     * Set 排序字段：BiddingEndTime 竞价结束时间	
BiddingPrice 我的价格
     * @param SortField 排序字段：BiddingEndTime 竞价结束时间	
BiddingPrice 我的价格
     */
    public void setSortField(String SortField) {
        this.SortField = SortField;
    }

    /**
     * Get 排序规则：asc升序，desc降序 
     * @return SortOrder 排序规则：asc升序，desc降序
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序规则：asc升序，desc降序
     * @param SortOrder 排序规则：asc升序，desc降序
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeBiddingListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBiddingListRequest(DescribeBiddingListRequest source) {
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.SortField != null) {
            this.SortField = new String(source.SortField);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "SortField", this.SortField);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

