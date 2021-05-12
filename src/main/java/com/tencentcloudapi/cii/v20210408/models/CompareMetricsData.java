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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompareMetricsData extends AbstractModel{

    /**
    * 短文准确率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortStructAccuracy")
    @Expose
    private String ShortStructAccuracy;

    /**
    * 短文召回率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortStructRecall")
    @Expose
    private String ShortStructRecall;

    /**
    * 长文结构化准确率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongStructAccuracy")
    @Expose
    private String LongStructAccuracy;

    /**
    * 长文结构化召回率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongStructRecall")
    @Expose
    private String LongStructRecall;

    /**
    * 长文提取准确率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongContentAccuracy")
    @Expose
    private String LongContentAccuracy;

    /**
    * 长文提取召回率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LongContentRecall")
    @Expose
    private String LongContentRecall;

    /**
     * Get 短文准确率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShortStructAccuracy 短文准确率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShortStructAccuracy() {
        return this.ShortStructAccuracy;
    }

    /**
     * Set 短文准确率
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShortStructAccuracy 短文准确率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShortStructAccuracy(String ShortStructAccuracy) {
        this.ShortStructAccuracy = ShortStructAccuracy;
    }

    /**
     * Get 短文召回率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShortStructRecall 短文召回率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShortStructRecall() {
        return this.ShortStructRecall;
    }

    /**
     * Set 短文召回率
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShortStructRecall 短文召回率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShortStructRecall(String ShortStructRecall) {
        this.ShortStructRecall = ShortStructRecall;
    }

    /**
     * Get 长文结构化准确率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongStructAccuracy 长文结构化准确率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongStructAccuracy() {
        return this.LongStructAccuracy;
    }

    /**
     * Set 长文结构化准确率
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongStructAccuracy 长文结构化准确率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongStructAccuracy(String LongStructAccuracy) {
        this.LongStructAccuracy = LongStructAccuracy;
    }

    /**
     * Get 长文结构化召回率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongStructRecall 长文结构化召回率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongStructRecall() {
        return this.LongStructRecall;
    }

    /**
     * Set 长文结构化召回率
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongStructRecall 长文结构化召回率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongStructRecall(String LongStructRecall) {
        this.LongStructRecall = LongStructRecall;
    }

    /**
     * Get 长文提取准确率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongContentAccuracy 长文提取准确率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongContentAccuracy() {
        return this.LongContentAccuracy;
    }

    /**
     * Set 长文提取准确率
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongContentAccuracy 长文提取准确率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongContentAccuracy(String LongContentAccuracy) {
        this.LongContentAccuracy = LongContentAccuracy;
    }

    /**
     * Get 长文提取召回率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LongContentRecall 长文提取召回率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLongContentRecall() {
        return this.LongContentRecall;
    }

    /**
     * Set 长文提取召回率
注意：此字段可能返回 null，表示取不到有效值。
     * @param LongContentRecall 长文提取召回率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLongContentRecall(String LongContentRecall) {
        this.LongContentRecall = LongContentRecall;
    }

    public CompareMetricsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompareMetricsData(CompareMetricsData source) {
        if (source.ShortStructAccuracy != null) {
            this.ShortStructAccuracy = new String(source.ShortStructAccuracy);
        }
        if (source.ShortStructRecall != null) {
            this.ShortStructRecall = new String(source.ShortStructRecall);
        }
        if (source.LongStructAccuracy != null) {
            this.LongStructAccuracy = new String(source.LongStructAccuracy);
        }
        if (source.LongStructRecall != null) {
            this.LongStructRecall = new String(source.LongStructRecall);
        }
        if (source.LongContentAccuracy != null) {
            this.LongContentAccuracy = new String(source.LongContentAccuracy);
        }
        if (source.LongContentRecall != null) {
            this.LongContentRecall = new String(source.LongContentRecall);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShortStructAccuracy", this.ShortStructAccuracy);
        this.setParamSimple(map, prefix + "ShortStructRecall", this.ShortStructRecall);
        this.setParamSimple(map, prefix + "LongStructAccuracy", this.LongStructAccuracy);
        this.setParamSimple(map, prefix + "LongStructRecall", this.LongStructRecall);
        this.setParamSimple(map, prefix + "LongContentAccuracy", this.LongContentAccuracy);
        this.setParamSimple(map, prefix + "LongContentRecall", this.LongContentRecall);

    }
}

