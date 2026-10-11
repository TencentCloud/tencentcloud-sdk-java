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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DictDimensionInfo extends AbstractModel {

    /**
    * 关联的标准字典代码ID
    */
    @SerializedName("DictCodeId")
    @Expose
    private String DictCodeId;

    /**
    * 字典项列表（key-value映射）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DictItems")
    @Expose
    private DictItem [] DictItems;

    /**
     * Get 关联的标准字典代码ID 
     * @return DictCodeId 关联的标准字典代码ID
     */
    public String getDictCodeId() {
        return this.DictCodeId;
    }

    /**
     * Set 关联的标准字典代码ID
     * @param DictCodeId 关联的标准字典代码ID
     */
    public void setDictCodeId(String DictCodeId) {
        this.DictCodeId = DictCodeId;
    }

    /**
     * Get 字典项列表（key-value映射）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DictItems 字典项列表（key-value映射）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DictItem [] getDictItems() {
        return this.DictItems;
    }

    /**
     * Set 字典项列表（key-value映射）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DictItems 字典项列表（key-value映射）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDictItems(DictItem [] DictItems) {
        this.DictItems = DictItems;
    }

    public DictDimensionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DictDimensionInfo(DictDimensionInfo source) {
        if (source.DictCodeId != null) {
            this.DictCodeId = new String(source.DictCodeId);
        }
        if (source.DictItems != null) {
            this.DictItems = new DictItem[source.DictItems.length];
            for (int i = 0; i < source.DictItems.length; i++) {
                this.DictItems[i] = new DictItem(source.DictItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DictCodeId", this.DictCodeId);
        this.setParamArrayObj(map, prefix + "DictItems.", this.DictItems);

    }
}

