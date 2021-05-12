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

public class ReservedInstanceConfigInfoItem extends AbstractModel{

    /**
    * 实例规格。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例规格名称。
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 优先级。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 实例族信息列表。
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private ReservedInstanceFamilyItem [] InstanceFamilies;

    /**
     * Get 实例规格。 
     * @return Type 实例规格。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例规格。
     * @param Type 实例规格。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例规格名称。 
     * @return TypeName 实例规格名称。
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 实例规格名称。
     * @param TypeName 实例规格名称。
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
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
     * Get 实例族信息列表。 
     * @return InstanceFamilies 实例族信息列表。
     */
    public ReservedInstanceFamilyItem [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set 实例族信息列表。
     * @param InstanceFamilies 实例族信息列表。
     */
    public void setInstanceFamilies(ReservedInstanceFamilyItem [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    public ReservedInstanceConfigInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedInstanceConfigInfoItem(ReservedInstanceConfigInfoItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TypeName != null) {
            this.TypeName = new String(source.TypeName);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceFamilies != null) {
            this.InstanceFamilies = new ReservedInstanceFamilyItem[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new ReservedInstanceFamilyItem(source.InstanceFamilies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TypeName", this.TypeName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "InstanceFamilies.", this.InstanceFamilies);

    }
}

