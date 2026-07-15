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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskSizeRange extends AbstractModel {

    /**
    * 最小值
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 小刻度值
    */
    @SerializedName("Sml")
    @Expose
    private Long Sml;

    /**
    * 中刻度值
    */
    @SerializedName("Med")
    @Expose
    private Long Med;

    /**
    * 最大值
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
    * 磁盘块数最小值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCountMin")
    @Expose
    private Long DiskCountMin;

    /**
    * 磁盘块数最大值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskCountMax")
    @Expose
    private Long DiskCountMax;

    /**
     * Get 最小值 
     * @return Min 最小值
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 最小值
     * @param Min 最小值
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get 小刻度值 
     * @return Sml 小刻度值
     */
    public Long getSml() {
        return this.Sml;
    }

    /**
     * Set 小刻度值
     * @param Sml 小刻度值
     */
    public void setSml(Long Sml) {
        this.Sml = Sml;
    }

    /**
     * Get 中刻度值 
     * @return Med 中刻度值
     */
    public Long getMed() {
        return this.Med;
    }

    /**
     * Set 中刻度值
     * @param Med 中刻度值
     */
    public void setMed(Long Med) {
        this.Med = Med;
    }

    /**
     * Get 最大值 
     * @return Max 最大值
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 最大值
     * @param Max 最大值
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    /**
     * Get 磁盘块数最小值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCountMin 磁盘块数最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCountMin() {
        return this.DiskCountMin;
    }

    /**
     * Set 磁盘块数最小值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCountMin 磁盘块数最小值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCountMin(Long DiskCountMin) {
        this.DiskCountMin = DiskCountMin;
    }

    /**
     * Get 磁盘块数最大值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskCountMax 磁盘块数最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskCountMax() {
        return this.DiskCountMax;
    }

    /**
     * Set 磁盘块数最大值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskCountMax 磁盘块数最大值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskCountMax(Long DiskCountMax) {
        this.DiskCountMax = DiskCountMax;
    }

    public DiskSizeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskSizeRange(DiskSizeRange source) {
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.Sml != null) {
            this.Sml = new Long(source.Sml);
        }
        if (source.Med != null) {
            this.Med = new Long(source.Med);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
        if (source.DiskCountMin != null) {
            this.DiskCountMin = new Long(source.DiskCountMin);
        }
        if (source.DiskCountMax != null) {
            this.DiskCountMax = new Long(source.DiskCountMax);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Sml", this.Sml);
        this.setParamSimple(map, prefix + "Med", this.Med);
        this.setParamSimple(map, prefix + "Max", this.Max);
        this.setParamSimple(map, prefix + "DiskCountMin", this.DiskCountMin);
        this.setParamSimple(map, prefix + "DiskCountMax", this.DiskCountMax);

    }
}

