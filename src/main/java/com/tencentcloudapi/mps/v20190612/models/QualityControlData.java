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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlData extends AbstractModel {

    /**
    * 为true时表示视频无音频轨。
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * 为true时表示视频无视频轨。
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * 视频无参考质量评分，百分制。
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * 视频无参考质量评分，MOS分数。
    */
    @SerializedName("QualityEvaluationMeanOpinionScore")
    @Expose
    private Float QualityEvaluationMeanOpinionScore;

    /**
    * 内容质检检出异常项。
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * 格式诊断检出异常项。
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
     * Get 为true时表示视频无音频轨。 
     * @return NoAudio 为true时表示视频无音频轨。
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set 为true时表示视频无音频轨。
     * @param NoAudio 为true时表示视频无音频轨。
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get 为true时表示视频无视频轨。 
     * @return NoVideo 为true时表示视频无视频轨。
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set 为true时表示视频无视频轨。
     * @param NoVideo 为true时表示视频无视频轨。
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get 视频无参考质量评分，百分制。 
     * @return QualityEvaluationScore 视频无参考质量评分，百分制。
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set 视频无参考质量评分，百分制。
     * @param QualityEvaluationScore 视频无参考质量评分，百分制。
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get 视频无参考质量评分，MOS分数。 
     * @return QualityEvaluationMeanOpinionScore 视频无参考质量评分，MOS分数。
     */
    public Float getQualityEvaluationMeanOpinionScore() {
        return this.QualityEvaluationMeanOpinionScore;
    }

    /**
     * Set 视频无参考质量评分，MOS分数。
     * @param QualityEvaluationMeanOpinionScore 视频无参考质量评分，MOS分数。
     */
    public void setQualityEvaluationMeanOpinionScore(Float QualityEvaluationMeanOpinionScore) {
        this.QualityEvaluationMeanOpinionScore = QualityEvaluationMeanOpinionScore;
    }

    /**
     * Get 内容质检检出异常项。 
     * @return QualityControlResultSet 内容质检检出异常项。
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set 内容质检检出异常项。
     * @param QualityControlResultSet 内容质检检出异常项。
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get 格式诊断检出异常项。 
     * @return ContainerDiagnoseResultSet 格式诊断检出异常项。
     */
    public ContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set 格式诊断检出异常项。
     * @param ContainerDiagnoseResultSet 格式诊断检出异常项。
     */
    public void setContainerDiagnoseResultSet(ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet) {
        this.ContainerDiagnoseResultSet = ContainerDiagnoseResultSet;
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
        if (source.QualityEvaluationMeanOpinionScore != null) {
            this.QualityEvaluationMeanOpinionScore = new Float(source.QualityEvaluationMeanOpinionScore);
        }
        if (source.QualityControlResultSet != null) {
            this.QualityControlResultSet = new QualityControlResult[source.QualityControlResultSet.length];
            for (int i = 0; i < source.QualityControlResultSet.length; i++) {
                this.QualityControlResultSet[i] = new QualityControlResult(source.QualityControlResultSet[i]);
            }
        }
        if (source.ContainerDiagnoseResultSet != null) {
            this.ContainerDiagnoseResultSet = new ContainerDiagnoseResultItem[source.ContainerDiagnoseResultSet.length];
            for (int i = 0; i < source.ContainerDiagnoseResultSet.length; i++) {
                this.ContainerDiagnoseResultSet[i] = new ContainerDiagnoseResultItem(source.ContainerDiagnoseResultSet[i]);
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
        this.setParamSimple(map, prefix + "QualityEvaluationMeanOpinionScore", this.QualityEvaluationMeanOpinionScore);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);
        this.setParamArrayObj(map, prefix + "ContainerDiagnoseResultSet.", this.ContainerDiagnoseResultSet);

    }
}

