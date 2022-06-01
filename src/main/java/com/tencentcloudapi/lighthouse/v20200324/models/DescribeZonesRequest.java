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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel{

    /**
    * 可用区列表排序的依据字段。取值范围：
<li>ZONE：依据可用区排序。
<li>INSTANCE_DISPLAY_LABEL：依据可用区展示标签排序，可用区展示标签包括：HIDDEN（隐藏）、NORMAL（普通）、SELECTED（默认选中），默认采用的升序排列为：['HIDDEN', 'NORMAL', 'SELECTED']。
默认按可用区排序。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 输出可用区列表的排列顺序。取值范围：
<li>ASC：升序排列。 
<li>DESC：降序排列。
默认按升序排列。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 可用区列表排序的依据字段。取值范围：
<li>ZONE：依据可用区排序。
<li>INSTANCE_DISPLAY_LABEL：依据可用区展示标签排序，可用区展示标签包括：HIDDEN（隐藏）、NORMAL（普通）、SELECTED（默认选中），默认采用的升序排列为：['HIDDEN', 'NORMAL', 'SELECTED']。
默认按可用区排序。 
     * @return OrderField 可用区列表排序的依据字段。取值范围：
<li>ZONE：依据可用区排序。
<li>INSTANCE_DISPLAY_LABEL：依据可用区展示标签排序，可用区展示标签包括：HIDDEN（隐藏）、NORMAL（普通）、SELECTED（默认选中），默认采用的升序排列为：['HIDDEN', 'NORMAL', 'SELECTED']。
默认按可用区排序。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 可用区列表排序的依据字段。取值范围：
<li>ZONE：依据可用区排序。
<li>INSTANCE_DISPLAY_LABEL：依据可用区展示标签排序，可用区展示标签包括：HIDDEN（隐藏）、NORMAL（普通）、SELECTED（默认选中），默认采用的升序排列为：['HIDDEN', 'NORMAL', 'SELECTED']。
默认按可用区排序。
     * @param OrderField 可用区列表排序的依据字段。取值范围：
<li>ZONE：依据可用区排序。
<li>INSTANCE_DISPLAY_LABEL：依据可用区展示标签排序，可用区展示标签包括：HIDDEN（隐藏）、NORMAL（普通）、SELECTED（默认选中），默认采用的升序排列为：['HIDDEN', 'NORMAL', 'SELECTED']。
默认按可用区排序。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 输出可用区列表的排列顺序。取值范围：
<li>ASC：升序排列。 
<li>DESC：降序排列。
默认按升序排列。 
     * @return Order 输出可用区列表的排列顺序。取值范围：
<li>ASC：升序排列。 
<li>DESC：降序排列。
默认按升序排列。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出可用区列表的排列顺序。取值范围：
<li>ASC：升序排列。 
<li>DESC：降序排列。
默认按升序排列。
     * @param Order 输出可用区列表的排列顺序。取值范围：
<li>ASC：升序排列。 
<li>DESC：降序排列。
默认按升序排列。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

