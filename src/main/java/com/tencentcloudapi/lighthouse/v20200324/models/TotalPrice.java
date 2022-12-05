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

public class TotalPrice extends AbstractModel{

    /**
    * 原始总计价格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
    * 折扣总计价格。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
     * Get 原始总计价格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalPrice 原始总计价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * Set 原始总计价格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalPrice 原始总计价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * Get 折扣总计价格。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountPrice 折扣总计价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * Set 折扣总计价格。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountPrice 折扣总计价格。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    public TotalPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TotalPrice(TotalPrice source) {
        if (source.OriginalPrice != null) {
            this.OriginalPrice = new Float(source.OriginalPrice);
        }
        if (source.DiscountPrice != null) {
            this.DiscountPrice = new Float(source.DiscountPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);

    }
}

