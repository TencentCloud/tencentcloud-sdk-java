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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstanceFamilyItem extends AbstractModel{

    /**
    * 实例族。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 优先级。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 实例类型信息列表。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private ReservedInstanceTypeItem [] InstanceTypes;

    /**
     * Get 实例族。 
     * @return InstanceFamily 实例族。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例族。
     * @param InstanceFamily 实例族。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 优先级。 
     * @return Order 优先级。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 优先级。
     * @param Order 优先级。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 实例类型信息列表。 
     * @return InstanceTypes 实例类型信息列表。
     */
    public ReservedInstanceTypeItem [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set 实例类型信息列表。
     * @param InstanceTypes 实例类型信息列表。
     */
    public void setInstanceTypes(ReservedInstanceTypeItem [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    public ReservedInstanceFamilyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceFamilyItem(ReservedInstanceFamilyItem source) {
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new ReservedInstanceTypeItem[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new ReservedInstanceTypeItem(source.InstanceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "InstanceTypes.", this.InstanceTypes);

    }
}

