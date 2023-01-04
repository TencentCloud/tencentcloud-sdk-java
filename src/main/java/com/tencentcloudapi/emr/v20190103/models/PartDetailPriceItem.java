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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartDetailPriceItem extends AbstractModel{

    /**
    * 类型包括：节点->node、系统盘->rootDisk、云数据盘->dataDisk、metaDB
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 单价（原价）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 单价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealCost")
    @Expose
    private Float RealCost;

    /**
    * 总价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalCost")
    @Expose
    private Float RealTotalCost;

    /**
    * 折扣
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * 数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
     * Get 类型包括：节点->node、系统盘->rootDisk、云数据盘->dataDisk、metaDB
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 类型包括：节点->node、系统盘->rootDisk、云数据盘->dataDisk、metaDB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 类型包括：节点->node、系统盘->rootDisk、云数据盘->dataDisk、metaDB
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 类型包括：节点->node、系统盘->rootDisk、云数据盘->dataDisk、metaDB
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 单价（原价）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 单价（原价）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 单价（原价）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 单价（原价）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 单价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealCost 单价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 单价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealCost 单价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealCost(Float RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get 总价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalCost 总价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 总价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalCost 总价（折扣价）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalCost(Float RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 折扣
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Policy 折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set 折扣
注意：此字段可能返回 null，表示取不到有效值。
     * @param Policy 折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsNum 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsNum 数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    public PartDetailPriceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartDetailPriceItem(PartDetailPriceItem source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.RealCost != null) {
            this.RealCost = new Float(source.RealCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new Float(source.RealTotalCost);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);

    }
}

