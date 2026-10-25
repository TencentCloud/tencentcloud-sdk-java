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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricDistributionBatchItem extends AbstractModel {

    /**
    * <p>条目 Key</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private MetricDistributionItem [] Items;

    /**
    * <p>合计</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
     * Get <p>条目 Key</p> 
     * @return Key <p>条目 Key</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>条目 Key</p>
     * @param Key <p>条目 Key</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items <p>分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MetricDistributionItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items <p>分布桶</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(MetricDistributionItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>合计</p> 
     * @return Total <p>合计</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>合计</p>
     * @param Total <p>合计</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    public MetricDistributionBatchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDistributionBatchItem(MetricDistributionBatchItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Items != null) {
            this.Items = new MetricDistributionItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new MetricDistributionItem(source.Items[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "Total", this.Total);

    }
}

