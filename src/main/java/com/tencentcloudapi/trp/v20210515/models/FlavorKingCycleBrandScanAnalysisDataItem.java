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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlavorKingCycleBrandScanAnalysisDataItem extends AbstractModel {

    /**
    * <p>周期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * <p>品牌</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrandName")
    @Expose
    private String BrandName;

    /**
    * <p>品牌占比</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
     * Get <p>周期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration <p>周期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>周期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration <p>周期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>品牌</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrandName <p>品牌</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrandName() {
        return this.BrandName;
    }

    /**
     * Set <p>品牌</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrandName <p>品牌</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    /**
     * Get <p>品牌占比</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ratio <p>品牌占比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set <p>品牌占比</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ratio <p>品牌占比</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    public FlavorKingCycleBrandScanAnalysisDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlavorKingCycleBrandScanAnalysisDataItem(FlavorKingCycleBrandScanAnalysisDataItem source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.BrandName != null) {
            this.BrandName = new String(source.BrandName);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "BrandName", this.BrandName);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

