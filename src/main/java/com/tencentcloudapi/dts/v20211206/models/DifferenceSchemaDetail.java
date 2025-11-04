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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DifferenceSchemaDetail extends AbstractModel {

    /**
    * 表结构不一致的数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 表结构不一致信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private SchemaDifference [] Items;

    /**
     * Get 表结构不一致的数量 
     * @return TotalCount 表结构不一致的数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 表结构不一致的数量
     * @param TotalCount 表结构不一致的数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 表结构不一致信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 表结构不一致信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SchemaDifference [] getItems() {
        return this.Items;
    }

    /**
     * Set 表结构不一致信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 表结构不一致信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(SchemaDifference [] Items) {
        this.Items = Items;
    }

    public DifferenceSchemaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceSchemaDetail(DifferenceSchemaDetail source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new SchemaDifference[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new SchemaDifference(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

