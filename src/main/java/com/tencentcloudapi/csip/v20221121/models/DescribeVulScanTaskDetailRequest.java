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

public class DescribeVulScanTaskDetailRequest extends AbstractModel {

    /**
    * <p>任务id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>过滤条件，支持以下 Name：</p><li>InstanceId - 资产实例 ID，精确匹配</li><li>InstanceName - 资产实例名称，模糊匹配（ExactMatch=1 时精确匹配）</li><li>Ip - 资产 IP 地址，精确匹配</li><li>Status - 扫描状态，精确匹配</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>分页大小，默认 10，最大 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移，从 0 开始</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方向：asc（升序）/ desc（降序），默认 desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段，默认按创建时间（CreateTime）排序</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>任务id</p> 
     * @return Id <p>任务id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>任务id</p>
     * @param Id <p>任务id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get <p>过滤条件，支持以下 Name：</p><li>InstanceId - 资产实例 ID，精确匹配</li><li>InstanceName - 资产实例名称，模糊匹配（ExactMatch=1 时精确匹配）</li><li>Ip - 资产 IP 地址，精确匹配</li><li>Status - 扫描状态，精确匹配</li> 
     * @return Filters <p>过滤条件，支持以下 Name：</p><li>InstanceId - 资产实例 ID，精确匹配</li><li>InstanceName - 资产实例名称，模糊匹配（ExactMatch=1 时精确匹配）</li><li>Ip - 资产 IP 地址，精确匹配</li><li>Status - 扫描状态，精确匹配</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，支持以下 Name：</p><li>InstanceId - 资产实例 ID，精确匹配</li><li>InstanceName - 资产实例名称，模糊匹配（ExactMatch=1 时精确匹配）</li><li>Ip - 资产 IP 地址，精确匹配</li><li>Status - 扫描状态，精确匹配</li>
     * @param Filters <p>过滤条件，支持以下 Name：</p><li>InstanceId - 资产实例 ID，精确匹配</li><li>InstanceName - 资产实例名称，模糊匹配（ExactMatch=1 时精确匹配）</li><li>Ip - 资产 IP 地址，精确匹配</li><li>Status - 扫描状态，精确匹配</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页大小，默认 10，最大 100</p> 
     * @return Limit <p>分页大小，默认 10，最大 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认 10，最大 100</p>
     * @param Limit <p>分页大小，默认 10，最大 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移，从 0 开始</p> 
     * @return Offset <p>分页偏移，从 0 开始</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移，从 0 开始</p>
     * @param Offset <p>分页偏移，从 0 开始</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方向：asc（升序）/ desc（降序），默认 desc</p> 
     * @return Order <p>排序方向：asc（升序）/ desc（降序），默认 desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向：asc（升序）/ desc（降序），默认 desc</p>
     * @param Order <p>排序方向：asc（升序）/ desc（降序），默认 desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段，默认按创建时间（CreateTime）排序</p> 
     * @return By <p>排序字段，默认按创建时间（CreateTime）排序</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段，默认按创建时间（CreateTime）排序</p>
     * @param By <p>排序字段，默认按创建时间（CreateTime）排序</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeVulScanTaskDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulScanTaskDetailRequest(DescribeVulScanTaskDetailRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

