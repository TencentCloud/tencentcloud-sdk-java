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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatisticsReport extends AbstractModel {

    /**
    * 字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bytes")
    @Expose
    private Long Bytes;

    /**
    * 监控指标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private PacketStatistics [] Items;

    /**
     * Get 字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bytes 字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBytes() {
        return this.Bytes;
    }

    /**
     * Set 字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bytes 字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBytes(Long Bytes) {
        this.Bytes = Bytes;
    }

    /**
     * Get 监控指标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 监控指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PacketStatistics [] getItems() {
        return this.Items;
    }

    /**
     * Set 监控指标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 监控指标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(PacketStatistics [] Items) {
        this.Items = Items;
    }

    public StatisticsReport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticsReport(StatisticsReport source) {
        if (source.Bytes != null) {
            this.Bytes = new Long(source.Bytes);
        }
        if (source.Items != null) {
            this.Items = new PacketStatistics[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new PacketStatistics(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bytes", this.Bytes);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

