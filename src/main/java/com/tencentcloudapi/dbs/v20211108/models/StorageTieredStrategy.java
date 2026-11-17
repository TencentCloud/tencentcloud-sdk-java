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

public class StorageTieredStrategy extends AbstractModel {

    /**
    * 低频存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayToLowFrequency")
    @Expose
    private Long DayToLowFrequency;

    /**
    * 归档存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayToArchive")
    @Expose
    private Long DayToArchive;

    /**
    * 深度归档存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DayToDeepArchive")
    @Expose
    private Long DayToDeepArchive;

    /**
     * Get 低频存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayToLowFrequency 低频存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayToLowFrequency() {
        return this.DayToLowFrequency;
    }

    /**
     * Set 低频存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayToLowFrequency 低频存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayToLowFrequency(Long DayToLowFrequency) {
        this.DayToLowFrequency = DayToLowFrequency;
    }

    /**
     * Get 归档存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayToArchive 归档存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayToArchive() {
        return this.DayToArchive;
    }

    /**
     * Set 归档存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayToArchive 归档存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayToArchive(Long DayToArchive) {
        this.DayToArchive = DayToArchive;
    }

    /**
     * Get 深度归档存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DayToDeepArchive 深度归档存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDayToDeepArchive() {
        return this.DayToDeepArchive;
    }

    /**
     * Set 深度归档存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param DayToDeepArchive 深度归档存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDayToDeepArchive(Long DayToDeepArchive) {
        this.DayToDeepArchive = DayToDeepArchive;
    }

    public StorageTieredStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageTieredStrategy(StorageTieredStrategy source) {
        if (source.DayToLowFrequency != null) {
            this.DayToLowFrequency = new Long(source.DayToLowFrequency);
        }
        if (source.DayToArchive != null) {
            this.DayToArchive = new Long(source.DayToArchive);
        }
        if (source.DayToDeepArchive != null) {
            this.DayToDeepArchive = new Long(source.DayToDeepArchive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayToLowFrequency", this.DayToLowFrequency);
        this.setParamSimple(map, prefix + "DayToArchive", this.DayToArchive);
        this.setParamSimple(map, prefix + "DayToDeepArchive", this.DayToDeepArchive);

    }
}

