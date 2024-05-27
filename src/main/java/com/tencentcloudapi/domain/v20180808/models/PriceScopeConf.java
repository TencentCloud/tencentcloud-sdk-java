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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PriceScopeConf extends AbstractModel {

    /**
    * 最高价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxPrice")
    @Expose
    private Float MaxPrice;

    /**
    * 最低价格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinPrice")
    @Expose
    private Float MinPrice;

    /**
    * 价格幅度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 保证金
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepositPrice")
    @Expose
    private Float DepositPrice;

    /**
     * Get 最高价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxPrice 最高价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMaxPrice() {
        return this.MaxPrice;
    }

    /**
     * Set 最高价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxPrice 最高价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxPrice(Float MaxPrice) {
        this.MaxPrice = MaxPrice;
    }

    /**
     * Get 最低价格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinPrice 最低价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMinPrice() {
        return this.MinPrice;
    }

    /**
     * Set 最低价格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinPrice 最低价格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinPrice(Float MinPrice) {
        this.MinPrice = MinPrice;
    }

    /**
     * Get 价格幅度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Price 价格幅度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 价格幅度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Price 价格幅度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 保证金
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepositPrice 保证金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDepositPrice() {
        return this.DepositPrice;
    }

    /**
     * Set 保证金
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepositPrice 保证金
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepositPrice(Float DepositPrice) {
        this.DepositPrice = DepositPrice;
    }

    public PriceScopeConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PriceScopeConf(PriceScopeConf source) {
        if (source.MaxPrice != null) {
            this.MaxPrice = new Float(source.MaxPrice);
        }
        if (source.MinPrice != null) {
            this.MinPrice = new Float(source.MinPrice);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.DepositPrice != null) {
            this.DepositPrice = new Float(source.DepositPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxPrice", this.MaxPrice);
        this.setParamSimple(map, prefix + "MinPrice", this.MinPrice);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "DepositPrice", this.DepositPrice);

    }
}

