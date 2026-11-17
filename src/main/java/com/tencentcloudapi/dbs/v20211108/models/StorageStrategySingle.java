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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageStrategySingle extends AbstractModel {

    /**
    * 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionType")
    @Expose
    private String RetentionType;

    /**
    * 备份保留天数，取值范围为 7 - 3650。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionPeriod")
    @Expose
    private Long RetentionPeriod;

    /**
    * 分级存储策略。RetentionType 为 tiered 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TieredStrategy")
    @Expose
    private StorageTieredStrategy TieredStrategy;

    /**
     * Get 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionType 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRetentionType() {
        return this.RetentionType;
    }

    /**
     * Set 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionType 存储策略类型。取值：
- standard：标准存储
- tiered：分级存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionType(String RetentionType) {
        this.RetentionType = RetentionType;
    }

    /**
     * Get 备份保留天数，取值范围为 7 - 3650。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionPeriod 备份保留天数，取值范围为 7 - 3650。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionPeriod() {
        return this.RetentionPeriod;
    }

    /**
     * Set 备份保留天数，取值范围为 7 - 3650。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionPeriod 备份保留天数，取值范围为 7 - 3650。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionPeriod(Long RetentionPeriod) {
        this.RetentionPeriod = RetentionPeriod;
    }

    /**
     * Get 分级存储策略。RetentionType 为 tiered 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TieredStrategy 分级存储策略。RetentionType 为 tiered 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageTieredStrategy getTieredStrategy() {
        return this.TieredStrategy;
    }

    /**
     * Set 分级存储策略。RetentionType 为 tiered 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TieredStrategy 分级存储策略。RetentionType 为 tiered 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTieredStrategy(StorageTieredStrategy TieredStrategy) {
        this.TieredStrategy = TieredStrategy;
    }

    public StorageStrategySingle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageStrategySingle(StorageStrategySingle source) {
        if (source.RetentionType != null) {
            this.RetentionType = new String(source.RetentionType);
        }
        if (source.RetentionPeriod != null) {
            this.RetentionPeriod = new Long(source.RetentionPeriod);
        }
        if (source.TieredStrategy != null) {
            this.TieredStrategy = new StorageTieredStrategy(source.TieredStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetentionType", this.RetentionType);
        this.setParamSimple(map, prefix + "RetentionPeriod", this.RetentionPeriod);
        this.setParamObj(map, prefix + "TieredStrategy.", this.TieredStrategy);

    }
}

