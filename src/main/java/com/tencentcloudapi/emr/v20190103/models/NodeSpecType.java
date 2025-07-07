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

public class NodeSpecType extends AbstractModel {

    /**
    * 机型序列
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 机型序列名字
    */
    @SerializedName("TypeName")
    @Expose
    private String TypeName;

    /**
    * 排序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * InstanceFamily数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceFamilies")
    @Expose
    private NodeSpecFamily [] InstanceFamilies;

    /**
     * Get 机型序列 
     * @return Type 机型序列
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 机型序列
     * @param Type 机型序列
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 机型序列名字 
     * @return TypeName 机型序列名字
     */
    public String getTypeName() {
        return this.TypeName;
    }

    /**
     * Set 机型序列名字
     * @param TypeName 机型序列名字
     */
    public void setTypeName(String TypeName) {
        this.TypeName = TypeName;
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
     * Get InstanceFamily数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceFamilies InstanceFamily数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpecFamily [] getInstanceFamilies() {
        return this.InstanceFamilies;
    }

    /**
     * Set InstanceFamily数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceFamilies InstanceFamily数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceFamilies(NodeSpecFamily [] InstanceFamilies) {
        this.InstanceFamilies = InstanceFamilies;
    }

    public NodeSpecType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeSpecType(NodeSpecType source) {
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
            this.InstanceFamilies = new NodeSpecFamily[source.InstanceFamilies.length];
            for (int i = 0; i < source.InstanceFamilies.length; i++) {
                this.InstanceFamilies[i] = new NodeSpecFamily(source.InstanceFamilies[i]);
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

