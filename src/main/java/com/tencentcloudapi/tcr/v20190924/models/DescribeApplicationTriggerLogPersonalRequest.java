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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApplicationTriggerLogPersonalRequest extends AbstractModel {

    /**
    * 仓库名称
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回最大数量，默认 20, 最大值 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 升序或降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 按某列排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 仓库名称 
     * @return RepoName 仓库名称
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名称
     * @param RepoName 仓库名称
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回最大数量，默认 20, 最大值 100 
     * @return Limit 返回最大数量，默认 20, 最大值 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回最大数量，默认 20, 最大值 100
     * @param Limit 返回最大数量，默认 20, 最大值 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 升序或降序 
     * @return Order 升序或降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 升序或降序
     * @param Order 升序或降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 按某列排序 
     * @return OrderBy 按某列排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 按某列排序
     * @param OrderBy 按某列排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeApplicationTriggerLogPersonalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationTriggerLogPersonalRequest(DescribeApplicationTriggerLogPersonalRequest source) {
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

