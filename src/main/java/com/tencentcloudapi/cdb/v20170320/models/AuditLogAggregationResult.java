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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditLogAggregationResult extends AbstractModel{

    /**
    * 聚合维度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AggregationField")
    @Expose
    private String AggregationField;

    /**
    * 聚合桶的结果集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Buckets")
    @Expose
    private Bucket [] Buckets;

    /**
     * Get 聚合维度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AggregationField 聚合维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAggregationField() {
        return this.AggregationField;
    }

    /**
     * Set 聚合维度
注意：此字段可能返回 null，表示取不到有效值。
     * @param AggregationField 聚合维度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAggregationField(String AggregationField) {
        this.AggregationField = AggregationField;
    }

    /**
     * Get 聚合桶的结果集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Buckets 聚合桶的结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Bucket [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set 聚合桶的结果集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Buckets 聚合桶的结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuckets(Bucket [] Buckets) {
        this.Buckets = Buckets;
    }

    public AuditLogAggregationResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditLogAggregationResult(AuditLogAggregationResult source) {
        if (source.AggregationField != null) {
            this.AggregationField = new String(source.AggregationField);
        }
        if (source.Buckets != null) {
            this.Buckets = new Bucket[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new Bucket(source.Buckets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AggregationField", this.AggregationField);
        this.setParamArrayObj(map, prefix + "Buckets.", this.Buckets);

    }
}

