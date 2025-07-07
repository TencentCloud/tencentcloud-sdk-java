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

public class DifferenceDetail extends AbstractModel {

    /**
    * 数据不一致的表数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 校验不一致的表详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private DifferenceItem [] Items;

    /**
     * Get 数据不一致的表数量 
     * @return TotalCount 数据不一致的表数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 数据不一致的表数量
     * @param TotalCount 数据不一致的表数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 校验不一致的表详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 校验不一致的表详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DifferenceItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 校验不一致的表详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 校验不一致的表详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(DifferenceItem [] Items) {
        this.Items = Items;
    }

    public DifferenceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceDetail(DifferenceDetail source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new DifferenceItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DifferenceItem(source.Items[i]);
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

