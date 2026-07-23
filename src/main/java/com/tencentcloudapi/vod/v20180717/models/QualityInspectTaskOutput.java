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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectTaskOutput extends AbstractModel {

    /**
    * <p>媒体文件是否无音频轨，取值范围：</p><li>0：否，即有音频轨；</li><li>1：是，即无音频轨。</li>
    */
    @SerializedName("NoAudio")
    @Expose
    private Long NoAudio;

    /**
    * <p>媒体文件是否无视频轨，取值范围：</p><li>0：否，即有视频轨；</li><li>1：是，即无视频轨。</li>
    */
    @SerializedName("NoVideo")
    @Expose
    private Long NoVideo;

    /**
    * <p>视频画面质量评分，取值范围：[0, 100]。</p>
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * <p>音画质检测出的异常项列表。</p>
    */
    @SerializedName("QualityInspectResultSet")
    @Expose
    private QualityInspectResultItem [] QualityInspectResultSet;

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
    * <p>格式诊断检出异常项。</p>
    */
    @SerializedName("ContainerDiagnoseResultSet")
    @Expose
    private QualityInspectContainerDiagnoseResultItem [] ContainerDiagnoseResultSet;

    /**
    * <p>LLM 大模型 AIGC 质量检测结果。</p>
    */
    @SerializedName("LLMDetectionReport")
    @Expose
    private QualityInspectLLMDetectionReport LLMDetectionReport;

    /**
     * Get <p>媒体文件是否无音频轨，取值范围：</p><li>0：否，即有音频轨；</li><li>1：是，即无音频轨。</li> 
     * @return NoAudio <p>媒体文件是否无音频轨，取值范围：</p><li>0：否，即有音频轨；</li><li>1：是，即无音频轨。</li>
     */
    public Long getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set <p>媒体文件是否无音频轨，取值范围：</p><li>0：否，即有音频轨；</li><li>1：是，即无音频轨。</li>
     * @param NoAudio <p>媒体文件是否无音频轨，取值范围：</p><li>0：否，即有音频轨；</li><li>1：是，即无音频轨。</li>
     */
    public void setNoAudio(Long NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get <p>媒体文件是否无视频轨，取值范围：</p><li>0：否，即有视频轨；</li><li>1：是，即无视频轨。</li> 
     * @return NoVideo <p>媒体文件是否无视频轨，取值范围：</p><li>0：否，即有视频轨；</li><li>1：是，即无视频轨。</li>
     */
    public Long getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set <p>媒体文件是否无视频轨，取值范围：</p><li>0：否，即有视频轨；</li><li>1：是，即无视频轨。</li>
     * @param NoVideo <p>媒体文件是否无视频轨，取值范围：</p><li>0：否，即有视频轨；</li><li>1：是，即无视频轨。</li>
     */
    public void setNoVideo(Long NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get <p>视频画面质量评分，取值范围：[0, 100]。</p> 
     * @return QualityEvaluationScore <p>视频画面质量评分，取值范围：[0, 100]。</p>
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set <p>视频画面质量评分，取值范围：[0, 100]。</p>
     * @param QualityEvaluationScore <p>视频画面质量评分，取值范围：[0, 100]。</p>
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get <p>音画质检测出的异常项列表。</p> 
     * @return QualityInspectResultSet <p>音画质检测出的异常项列表。</p>
     */
    public QualityInspectResultItem [] getQualityInspectResultSet() {
        return this.QualityInspectResultSet;
    }

    /**
     * Set <p>音画质检测出的异常项列表。</p>
     * @param QualityInspectResultSet <p>音画质检测出的异常项列表。</p>
     */
    public void setQualityInspectResultSet(QualityInspectResultItem [] QualityInspectResultSet) {
        this.QualityInspectResultSet = QualityInspectResultSet;
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
     * Get <p>格式诊断检出异常项。</p> 
     * @return ContainerDiagnoseResultSet <p>格式诊断检出异常项。</p>
     */
    public QualityInspectContainerDiagnoseResultItem [] getContainerDiagnoseResultSet() {
        return this.ContainerDiagnoseResultSet;
    }

    /**
     * Set <p>格式诊断检出异常项。</p>
     * @param ContainerDiagnoseResultSet <p>格式诊断检出异常项。</p>
     */
    public void setContainerDiagnoseResultSet(QualityInspectContainerDiagnoseResultItem [] ContainerDiagnoseResultSet) {
        this.ContainerDiagnoseResultSet = ContainerDiagnoseResultSet;
    }

    /**
     * Get <p>LLM 大模型 AIGC 质量检测结果。</p> 
     * @return LLMDetectionReport <p>LLM 大模型 AIGC 质量检测结果。</p>
     */
    public QualityInspectLLMDetectionReport getLLMDetectionReport() {
        return this.LLMDetectionReport;
    }

    /**
     * Set <p>LLM 大模型 AIGC 质量检测结果。</p>
     * @param LLMDetectionReport <p>LLM 大模型 AIGC 质量检测结果。</p>
     */
    public void setLLMDetectionReport(QualityInspectLLMDetectionReport LLMDetectionReport) {
        this.LLMDetectionReport = LLMDetectionReport;
    }

    public QualityInspectTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectTaskOutput(QualityInspectTaskOutput source) {
        if (source.NoAudio != null) {
            this.NoAudio = new Long(source.NoAudio);
        }
        if (source.NoVideo != null) {
            this.NoVideo = new Long(source.NoVideo);
        }
        if (source.QualityEvaluationScore != null) {
            this.QualityEvaluationScore = new Long(source.QualityEvaluationScore);
        }
        if (source.QualityInspectResultSet != null) {
            this.QualityInspectResultSet = new QualityInspectResultItem[source.QualityInspectResultSet.length];
            for (int i = 0; i < source.QualityInspectResultSet.length; i++) {
                this.QualityInspectResultSet[i] = new QualityInspectResultItem(source.QualityInspectResultSet[i]);
            }
        }
        if (source.QualityEvaluationMeanOpinionScore != null) {
            this.QualityEvaluationMeanOpinionScore = new Float(source.QualityEvaluationMeanOpinionScore);
        }
        if (source.AestheticEvaluationScore != null) {
            this.AestheticEvaluationScore = new Long(source.AestheticEvaluationScore);
        }
        if (source.ContainerDiagnoseResultSet != null) {
            this.ContainerDiagnoseResultSet = new QualityInspectContainerDiagnoseResultItem[source.ContainerDiagnoseResultSet.length];
            for (int i = 0; i < source.ContainerDiagnoseResultSet.length; i++) {
                this.ContainerDiagnoseResultSet[i] = new QualityInspectContainerDiagnoseResultItem(source.ContainerDiagnoseResultSet[i]);
            }
        }
        if (source.LLMDetectionReport != null) {
            this.LLMDetectionReport = new QualityInspectLLMDetectionReport(source.LLMDetectionReport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoAudio", this.NoAudio);
        this.setParamSimple(map, prefix + "NoVideo", this.NoVideo);
        this.setParamSimple(map, prefix + "QualityEvaluationScore", this.QualityEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityInspectResultSet.", this.QualityInspectResultSet);
        this.setParamSimple(map, prefix + "QualityEvaluationMeanOpinionScore", this.QualityEvaluationMeanOpinionScore);
        this.setParamSimple(map, prefix + "AestheticEvaluationScore", this.AestheticEvaluationScore);
        this.setParamArrayObj(map, prefix + "ContainerDiagnoseResultSet.", this.ContainerDiagnoseResultSet);
        this.setParamObj(map, prefix + "LLMDetectionReport.", this.LLMDetectionReport);

    }
}

