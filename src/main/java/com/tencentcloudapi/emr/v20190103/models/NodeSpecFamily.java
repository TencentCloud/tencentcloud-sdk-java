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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeSpecFamily extends AbstractModel {

    /**
    * 机型
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 机型名称
    */
    @SerializedName("FamilyName")
    @Expose
    private String FamilyName;

    /**
    * 排序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * InstanceType的列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private NodeSpecInstanceType [] InstanceTypes;

    /**
     * Get 机型 
     * @return InstanceFamily 机型
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 机型
     * @param InstanceFamily 机型
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 机型名称 
     * @return FamilyName 机型名称
     */
    public String getFamilyName() {
        return this.FamilyName;
    }

    /**
     * Set 机型名称
     * @param FamilyName 机型名称
     */
    public void setFamilyName(String FamilyName) {
        this.FamilyName = FamilyName;
    }

    /**
     * Get 排序 
     * @return Order 排序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序
     * @param Order 排序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get InstanceType的列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypes InstanceType的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecInstanceType [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * Set InstanceType的列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypes InstanceType的列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypes(NodeSpecInstanceType [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    public NodeSpecFamily() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecFamily(NodeSpecFamily source) {
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.FamilyName != null) {
            this.FamilyName = new String(source.FamilyName);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.InstanceTypes != null) {
            this.InstanceTypes = new NodeSpecInstanceType[source.InstanceTypes.length];
            for (int i = 0; i < source.InstanceTypes.length; i++) {
                this.InstanceTypes[i] = new NodeSpecInstanceType(source.InstanceTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "FamilyName", this.FamilyName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "InstanceTypes.", this.InstanceTypes);

    }
}

