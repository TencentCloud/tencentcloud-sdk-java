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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMcpServersResponseVO extends AbstractModel {

    /**
    * 条目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private DescribeMcpServerResponseVO [] Items;

    /**
     * Get 条目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 条目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 条目
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 条目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeMcpServerResponseVO [] getItems() {
        return this.Items;
    }

    /**
     * Set 数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(DescribeMcpServerResponseVO [] Items) {
        this.Items = Items;
    }

    public DescribeMcpServersResponseVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMcpServersResponseVO(DescribeMcpServersResponseVO source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Items != null) {
            this.Items = new DescribeMcpServerResponseVO[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DescribeMcpServerResponseVO(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

