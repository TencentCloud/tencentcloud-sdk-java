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
package com.tencentcloudapi.advisor.v20200721.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStrategie extends AbstractModel{

    /**
    * 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 评估项名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 评估项对应产品ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 评估项对应产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductDesc")
    @Expose
    private String ProductDesc;

    /**
    * 评估项优化建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repair")
    @Expose
    private String Repair;

    /**
    * 评估项类别ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 评估项类别名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 评估项风险列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private DescribeStrategiesCondition [] Conditions;

    /**
     * Get 评估项ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 评估项ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 评估项名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 评估项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 评估项名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 评估项名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 评估项描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 评估项描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 评估项对应产品ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 评估项对应产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 评估项对应产品ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 评估项对应产品ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 评估项对应产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductDesc 评估项对应产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductDesc() {
        return this.ProductDesc;
    }

    /**
     * Set 评估项对应产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductDesc 评估项对应产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductDesc(String ProductDesc) {
        this.ProductDesc = ProductDesc;
    }

    /**
     * Get 评估项优化建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repair 评估项优化建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepair() {
        return this.Repair;
    }

    /**
     * Set 评估项优化建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repair 评估项优化建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepair(String Repair) {
        this.Repair = Repair;
    }

    /**
     * Get 评估项类别ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 评估项类别ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 评估项类别ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 评估项类别ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 评估项类别名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 评估项类别名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 评估项类别名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 评估项类别名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 评估项风险列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 评估项风险列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeStrategiesCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 评估项风险列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 评估项风险列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(DescribeStrategiesCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public DescribeStrategie() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStrategie(DescribeStrategie source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProductDesc != null) {
            this.ProductDesc = new String(source.ProductDesc);
        }
        if (source.Repair != null) {
            this.Repair = new String(source.Repair);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Conditions != null) {
            this.Conditions = new DescribeStrategiesCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new DescribeStrategiesCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProductDesc", this.ProductDesc);
        this.setParamSimple(map, prefix + "Repair", this.Repair);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

