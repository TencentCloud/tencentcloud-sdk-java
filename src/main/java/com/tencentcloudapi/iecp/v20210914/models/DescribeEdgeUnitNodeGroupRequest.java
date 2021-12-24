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

public class DescribeEdgeUnitNodeGroupRequest extends AbstractModel{

    /**
    * IECP边缘单元ID
    */
    @SerializedName("EdgeUnitId")
    @Expose
    private Long EdgeUnitId;

    /**
    * 命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 分页offset，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页limit，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 模糊匹配参数，精确匹配时失效
    */
    @SerializedName("NameFilter")
    @Expose
    private String NameFilter;

    /**
    * 精确匹配参数
    */
    @SerializedName("NameMatched")
    @Expose
    private String NameMatched;

    /**
    * 按时间排序，ASC/DESC，默认为DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get IECP边缘单元ID 
     * @return EdgeUnitId IECP边缘单元ID
     */
    public Long getEdgeUnitId() {
        return this.EdgeUnitId;
    }

    /**
     * Set IECP边缘单元ID
     * @param EdgeUnitId IECP边缘单元ID
     */
    public void setEdgeUnitId(Long EdgeUnitId) {
        this.EdgeUnitId = EdgeUnitId;
    }

    /**
     * Get 命名空间，默认为default 
     * @return Namespace 命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认为default
     * @param Namespace 命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 分页offset，默认为0 
     * @return Offset 分页offset，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页offset，默认为0
     * @param Offset 分页offset，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页limit，默认为20 
     * @return Limit 分页limit，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页limit，默认为20
     * @param Limit 分页limit，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 模糊匹配参数，精确匹配时失效 
     * @return NameFilter 模糊匹配参数，精确匹配时失效
     */
    public String getNameFilter() {
        return this.NameFilter;
    }

    /**
     * Set 模糊匹配参数，精确匹配时失效
     * @param NameFilter 模糊匹配参数，精确匹配时失效
     */
    public void setNameFilter(String NameFilter) {
        this.NameFilter = NameFilter;
    }

    /**
     * Get 精确匹配参数 
     * @return NameMatched 精确匹配参数
     */
    public String getNameMatched() {
        return this.NameMatched;
    }

    /**
     * Set 精确匹配参数
     * @param NameMatched 精确匹配参数
     */
    public void setNameMatched(String NameMatched) {
        this.NameMatched = NameMatched;
    }

    /**
     * Get 按时间排序，ASC/DESC，默认为DESC 
     * @return Order 按时间排序，ASC/DESC，默认为DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 按时间排序，ASC/DESC，默认为DESC
     * @param Order 按时间排序，ASC/DESC，默认为DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeEdgeUnitNodeGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitNodeGroupRequest(DescribeEdgeUnitNodeGroupRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NameFilter != null) {
            this.NameFilter = new String(source.NameFilter);
        }
        if (source.NameMatched != null) {
            this.NameMatched = new String(source.NameMatched);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NameFilter", this.NameFilter);
        this.setParamSimple(map, prefix + "NameMatched", this.NameMatched);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

