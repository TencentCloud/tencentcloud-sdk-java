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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlData extends AbstractModel{

    /**
    * 为true时表示视频无音频轨。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * 为true时表示视频无视频轨。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * 视频无参考质量打分，百分制。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * 质检检出异常项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
     * Get 为true时表示视频无音频轨。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoAudio 为true时表示视频无音频轨。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set 为true时表示视频无音频轨。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoAudio 为true时表示视频无音频轨。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get 为true时表示视频无视频轨。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoVideo 为true时表示视频无视频轨。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set 为true时表示视频无视频轨。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoVideo 为true时表示视频无视频轨。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get 视频无参考质量打分，百分制。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEvaluationScore 视频无参考质量打分，百分制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set 视频无参考质量打分，百分制。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEvaluationScore 视频无参考质量打分，百分制。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get 质检检出异常项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityControlResultSet 质检检出异常项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set 质检检出异常项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityControlResultSet 质检检出异常项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    public QualityControlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlData(QualityControlData source) {
        if (source.NoAudio != null) {
            this.NoAudio = new Boolean(source.NoAudio);
        }
        if (source.NoVideo != null) {
            this.NoVideo = new Boolean(source.NoVideo);
        }
        if (source.QualityEvaluationScore != null) {
            this.QualityEvaluationScore = new Long(source.QualityEvaluationScore);
        }
        if (source.QualityControlResultSet != null) {
            this.QualityControlResultSet = new QualityControlResult[source.QualityControlResultSet.length];
            for (int i = 0; i < source.QualityControlResultSet.length; i++) {
                this.QualityControlResultSet[i] = new QualityControlResult(source.QualityControlResultSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoAudio", this.NoAudio);
        this.setParamSimple(map, prefix + "NoVideo", this.NoVideo);
        this.setParamSimple(map, prefix + "QualityEvaluationScore", this.QualityEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);

    }
}

