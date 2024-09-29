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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablePartitionsRequest extends AbstractModel {

    /**
    * 表ID
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 分页number
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页size
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤器
    */
    @SerializedName("FilterSet")
    @Expose
    private Filter [] FilterSet;

    /**
    * 排序字段
    */
    @SerializedName("OrderFieldSet")
    @Expose
    private OrderField [] OrderFieldSet;

    /**
     * Get 表ID 
     * @return TableId 表ID
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表ID
     * @param TableId 表ID
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 分页number 
     * @return PageNumber 分页number
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页number
     * @param PageNumber 分页number
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页size 
     * @return PageSize 分页size
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页size
     * @param PageSize 分页size
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 过滤器 
     * @return FilterSet 过滤器
     */
    public Filter [] getFilterSet() {
        return this.FilterSet;
    }

    /**
     * Set 过滤器
     * @param FilterSet 过滤器
     */
    public void setFilterSet(Filter [] FilterSet) {
        this.FilterSet = FilterSet;
    }

    /**
     * Get 排序字段 
     * @return OrderFieldSet 排序字段
     */
    public OrderField [] getOrderFieldSet() {
        return this.OrderFieldSet;
    }

    /**
     * Set 排序字段
     * @param OrderFieldSet 排序字段
     */
    public void setOrderFieldSet(OrderField [] OrderFieldSet) {
        this.OrderFieldSet = OrderFieldSet;
    }

    public DescribeTablePartitionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablePartitionsRequest(DescribeTablePartitionsRequest source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.FilterSet != null) {
            this.FilterSet = new Filter[source.FilterSet.length];
            for (int i = 0; i < source.FilterSet.length; i++) {
                this.FilterSet[i] = new Filter(source.FilterSet[i]);
            }
        }
        if (source.OrderFieldSet != null) {
            this.OrderFieldSet = new OrderField[source.OrderFieldSet.length];
            for (int i = 0; i < source.OrderFieldSet.length; i++) {
                this.OrderFieldSet[i] = new OrderField(source.OrderFieldSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "FilterSet.", this.FilterSet);
        this.setParamArrayObj(map, prefix + "OrderFieldSet.", this.OrderFieldSet);

    }
}

