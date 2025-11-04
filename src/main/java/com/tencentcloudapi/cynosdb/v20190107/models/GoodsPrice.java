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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GoodsPrice extends AbstractModel {

    /**
    * 实例价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstancePrice")
    @Expose
    private TradePrice InstancePrice;

    /**
    * 存储价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoragePrice")
    @Expose
    private TradePrice StoragePrice;

    /**
    * 商品规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsSpec")
    @Expose
    private GoodsSpec GoodsSpec;

    /**
     * Get 实例价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstancePrice 实例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TradePrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * Set 实例价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstancePrice 实例价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstancePrice(TradePrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * Get 存储价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoragePrice 存储价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TradePrice getStoragePrice() {
        return this.StoragePrice;
    }

    /**
     * Set 存储价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoragePrice 存储价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoragePrice(TradePrice StoragePrice) {
        this.StoragePrice = StoragePrice;
    }

    /**
     * Get 商品规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsSpec 商品规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GoodsSpec getGoodsSpec() {
        return this.GoodsSpec;
    }

    /**
     * Set 商品规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsSpec 商品规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsSpec(GoodsSpec GoodsSpec) {
        this.GoodsSpec = GoodsSpec;
    }

    public GoodsPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsPrice(GoodsPrice source) {
        if (source.InstancePrice != null) {
            this.InstancePrice = new TradePrice(source.InstancePrice);
        }
        if (source.StoragePrice != null) {
            this.StoragePrice = new TradePrice(source.StoragePrice);
        }
        if (source.GoodsSpec != null) {
            this.GoodsSpec = new GoodsSpec(source.GoodsSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "StoragePrice.", this.StoragePrice);
        this.setParamObj(map, prefix + "GoodsSpec.", this.GoodsSpec);

    }
}

