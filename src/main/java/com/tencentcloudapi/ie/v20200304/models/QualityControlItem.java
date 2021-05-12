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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlItem extends AbstractModel{

    /**
    * 置信度，取值范围是 0 到 100
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 出现的起始时间戳，秒
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 出现的结束时间戳，秒
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 区域坐标(px)，即左上角坐标、右下角坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AreaCoordsSet")
    @Expose
    private Long [] AreaCoordsSet;

    /**
     * Get 置信度，取值范围是 0 到 100
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Confidence 置信度，取值范围是 0 到 100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 置信度，取值范围是 0 到 100
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 置信度，取值范围是 0 到 100
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 出现的起始时间戳，秒 
     * @return StartTimeOffset 出现的起始时间戳，秒
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 出现的起始时间戳，秒
     * @param StartTimeOffset 出现的起始时间戳，秒
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 出现的结束时间戳，秒 
     * @return EndTimeOffset 出现的结束时间戳，秒
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 出现的结束时间戳，秒
     * @param EndTimeOffset 出现的结束时间戳，秒
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 区域坐标(px)，即左上角坐标、右下角坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AreaCoordsSet 区域坐标(px)，即左上角坐标、右下角坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getAreaCoordsSet() {
        return this.AreaCoordsSet;
    }

    /**
     * Set 区域坐标(px)，即左上角坐标、右下角坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param AreaCoordsSet 区域坐标(px)，即左上角坐标、右下角坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAreaCoordsSet(Long [] AreaCoordsSet) {
        this.AreaCoordsSet = AreaCoordsSet;
    }

    public QualityControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlItem(QualityControlItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.AreaCoordsSet != null) {
            this.AreaCoordsSet = new Long[source.AreaCoordsSet.length];
            for (int i = 0; i < source.AreaCoordsSet.length; i++) {
                this.AreaCoordsSet[i] = new Long(source.AreaCoordsSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArraySimple(map, prefix + "AreaCoordsSet.", this.AreaCoordsSet);

    }
}

