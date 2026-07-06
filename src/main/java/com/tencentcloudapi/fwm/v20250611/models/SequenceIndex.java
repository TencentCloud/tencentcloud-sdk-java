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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SequenceIndex extends AbstractModel {

    /**
    * 原规则序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 新规则序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewOrderIndex")
    @Expose
    private Long NewOrderIndex;

    /**
     * Get 原规则序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderIndex 原规则序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 原规则序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderIndex 原规则序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 新规则序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewOrderIndex 新规则序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNewOrderIndex() {
        return this.NewOrderIndex;
    }

    /**
     * Set 新规则序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewOrderIndex 新规则序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewOrderIndex(Long NewOrderIndex) {
        this.NewOrderIndex = NewOrderIndex;
    }

    public SequenceIndex() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SequenceIndex(SequenceIndex source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.NewOrderIndex != null) {
            this.NewOrderIndex = new Long(source.NewOrderIndex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "NewOrderIndex", this.NewOrderIndex);

    }
}

