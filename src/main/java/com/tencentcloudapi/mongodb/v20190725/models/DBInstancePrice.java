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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstancePrice extends AbstractModel{

    /**
    * 单价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitPrice")
    @Expose
    private Float UnitPrice;

    /**
    * 原价
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 折扣加
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get 单价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitPrice 单价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getUnitPrice() {
        return this.UnitPrice;
    }

    /**
     * Set 单价
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitPrice 单价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitPrice(Float UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * Get 原价 
     * @return OriginalPrice 原价
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原价
     * @param OriginalPrice 原价
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折扣加 
     * @return DiscountPrice 折扣加
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折扣加
     * @param DiscountPrice 折扣加
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UnitPrice", this.UnitPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

