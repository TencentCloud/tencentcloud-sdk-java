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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSColumnOrder extends AbstractModel{

    /**
    * 列名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Col")
    @Expose
    private String Col;

    /**
    * 排序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
     * Get 列名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Col 列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCol() {
        return this.Col;
    }

    /**
     * Set 列名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Col 列名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCol(String Col) {
        this.Col = Col;
    }

    /**
     * Get 排序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order 排序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    public DMSColumnOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSColumnOrder(DMSColumnOrder source) {
        if (source.Col != null) {
            this.Col = new String(source.Col);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Col", this.Col);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

