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
    * <p>为true时表示视频无音频轨。</p>
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * <p>为true时表示视频无视频轨。</p>
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * <p>视频无参考质量评分，百分制。</p>
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * <p>视频无参考质量评分，MOS分数。</p>
    */
    @SerializedName("QualityEvaluationMeanOpinionScore")
    @Expose
    private Float QualityEvaluationMeanOpinionScore;

    /**
    * <p>视频美学评分，范围：[0,100]。</p>
    */
    @SerializedName("AestheticEvaluationScore")
    @Expose
    private Long AestheticEvaluationScore;

    /**
    * <p>内容质检检出异常项。</p>
    */
    @SerializedName("QualityControlResultSet")
    @Expose
    private QualityControlResult [] QualityControlResultSet;

    /**
    * <p>格式诊断检出异常项。</p>
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private ContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
     * Get <p>为true时表示视频无音频轨。</p> 
     * @return NoAudio <p>为true时表示视频无音频轨。</p>
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set <p>为true时表示视频无音频轨。</p>
     * @param NoAudio <p>为true时表示视频无音频轨。</p>
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get <p>为true时表示视频无视频轨。</p> 
     * @return NoVideo <p>为true时表示视频无视频轨。</p>
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set <p>为true时表示视频无视频轨。</p>
     * @param NoVideo <p>为true时表示视频无视频轨。</p>
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get <p>视频无参考质量评分，百分制。</p> 
     * @return QualityEvaluationScore <p>视频无参考质量评分，百分制。</p>
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set <p>视频无参考质量评分，百分制。</p>
     * @param QualityEvaluationScore <p>视频无参考质量评分，百分制。</p>
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get <p>视频无参考质量评分，MOS分数。</p> 
     * @return QualityEvaluationMeanOpinionScore <p>视频无参考质量评分，MOS分数。</p>
     */
    public Float getQualityEvaluationMeanOpinionScore() {
        return this.QualityEvaluationMeanOpinionScore;
    }

    /**
     * Set <p>视频无参考质量评分，MOS分数。</p>
     * @param QualityEvaluationMeanOpinionScore <p>视频无参考质量评分，MOS分数。</p>
     */
    public void setQualityEvaluationMeanOpinionScore(Float QualityEvaluationMeanOpinionScore) {
        this.QualityEvaluationMeanOpinionScore = QualityEvaluationMeanOpinionScore;
    }

    /**
     * Get <p>视频美学评分，范围：[0,100]。</p> 
     * @return AestheticEvaluationScore <p>视频美学评分，范围：[0,100]。</p>
     */
    public Long getAestheticEvaluationScore() {
        return this.AestheticEvaluationScore;
    }

    /**
     * Set <p>视频美学评分，范围：[0,100]。</p>
     * @param AestheticEvaluationScore <p>视频美学评分，范围：[0,100]。</p>
     */
    public void setAestheticEvaluationScore(Long AestheticEvaluationScore) {
        this.AestheticEvaluationScore = AestheticEvaluationScore;
    }

    /**
     * Get <p>内容质检检出异常项。</p> 
     * @return QualityControlResultSet <p>内容质检检出异常项。</p>
     */
    public QualityControlResult [] getQualityControlResultSet() {
        return this.QualityControlResultSet;
    }

    /**
     * Set <p>内容质检检出异常项。</p>
     * @param QualityControlResultSet <p>内容质检检出异常项。</p>
     */
    public void setQualityControlResultSet(QualityControlResult [] QualityControlResultSet) {
        this.QualityControlResultSet = QualityControlResultSet;
    }

    /**
     * Get <p>格式诊断检出异常项。</p> 
     * @return ContainerDiagnoseResultSet <p>格式诊断检出异常项。</p>
     */
    public ContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set <p>格式诊断检出异常项。</p>
     * @param ContainerDiagnoseResultSet <p>格式诊断检出异常项。</p>
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
        if (source.AestheticEvaluationScore != null) {
            this.AestheticEvaluationScore = new Long(source.AestheticEvaluationScore);
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
        this.setParamSimple(map, prefix + "AestheticEvaluationScore", this.AestheticEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityControlResultSet.", this.QualityControlResultSet);
        this.setParamArrayObj(map, prefix + "ContainerDiagnoseResultSet.", this.ContainerDiagnoseResultSet);

    }
}

