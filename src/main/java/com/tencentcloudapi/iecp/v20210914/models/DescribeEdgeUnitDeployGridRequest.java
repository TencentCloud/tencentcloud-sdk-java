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

public class DescribeEdgeUnitDeployGridRequest extends AbstractModel{

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
    * 模糊匹配
    */
    @SerializedName("NamePattern")
    @Expose
    private String NamePattern;

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
    * 排序，默认为ASC
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
     * Get 模糊匹配 
     * @return NamePattern 模糊匹配
     */
    public String getNamePattern() {
        return this.NamePattern;
    }

    /**
     * Set 模糊匹配
     * @param NamePattern 模糊匹配
     */
    public void setNamePattern(String NamePattern) {
        this.NamePattern = NamePattern;
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
     * Get 排序，默认为ASC 
     * @return Order 排序，默认为ASC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，默认为ASC
     * @param Order 排序，默认为ASC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeEdgeUnitDeployGridRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitDeployGridRequest(DescribeEdgeUnitDeployGridRequest source) {
        if (source.EdgeUnitId != null) {
            this.EdgeUnitId = new Long(source.EdgeUnitId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NamePattern != null) {
            this.NamePattern = new String(source.NamePattern);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EdgeUnitId", this.EdgeUnitId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NamePattern", this.NamePattern);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

