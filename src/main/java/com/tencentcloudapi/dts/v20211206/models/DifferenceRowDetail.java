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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DifferenceRowDetail extends AbstractModel {

    /**
    * 不一致总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 不一致列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private RowsCountDifference [] Items;

    /**
     * Get 不一致总数 
     * @return TotalCount 不一致总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 不一致总数
     * @param TotalCount 不一致总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 不一致列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 不一致列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RowsCountDifference [] getItems() {
        return this.Items;
    }

    /**
     * Set 不一致列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 不一致列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(RowsCountDifference [] Items) {
        this.Items = Items;
    }

    public DifferenceRowDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DifferenceRowDetail(DifferenceRowDetail source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new RowsCountDifference[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new RowsCountDifference(source.Items[i]);
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

