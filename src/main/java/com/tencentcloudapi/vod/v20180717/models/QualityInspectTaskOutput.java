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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectTaskOutput extends AbstractModel{

    /**
    * 媒体文件是否无音频轨，取值范围：
<li>0：否，即有音频轨；</li>
<li>1：是，即无音频轨。</li>
    */
    @SerializedName("NoAudio")
    @Expose
    private Long NoAudio;

    /**
    * 媒体文件是否无视频轨，取值范围：
<li>0：否，即有视频轨；</li>
<li>1：是，即无视频轨。</li>
    */
    @SerializedName("NoVideo")
    @Expose
    private Long NoVideo;

    /**
    * 视频画面质量评分，取值范围：[0, 100]。
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * 音画质检测出的异常项列表。
    */
    @SerializedName("QualityInspectResultSet")
    @Expose
    private QualityInspectResultItem [] QualityInspectResultSet;

    /**
     * Get 媒体文件是否无音频轨，取值范围：
<li>0：否，即有音频轨；</li>
<li>1：是，即无音频轨。</li> 
     * @return NoAudio 媒体文件是否无音频轨，取值范围：
<li>0：否，即有音频轨；</li>
<li>1：是，即无音频轨。</li>
     */
    public Long getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set 媒体文件是否无音频轨，取值范围：
<li>0：否，即有音频轨；</li>
<li>1：是，即无音频轨。</li>
     * @param NoAudio 媒体文件是否无音频轨，取值范围：
<li>0：否，即有音频轨；</li>
<li>1：是，即无音频轨。</li>
     */
    public void setNoAudio(Long NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get 媒体文件是否无视频轨，取值范围：
<li>0：否，即有视频轨；</li>
<li>1：是，即无视频轨。</li> 
     * @return NoVideo 媒体文件是否无视频轨，取值范围：
<li>0：否，即有视频轨；</li>
<li>1：是，即无视频轨。</li>
     */
    public Long getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set 媒体文件是否无视频轨，取值范围：
<li>0：否，即有视频轨；</li>
<li>1：是，即无视频轨。</li>
     * @param NoVideo 媒体文件是否无视频轨，取值范围：
<li>0：否，即有视频轨；</li>
<li>1：是，即无视频轨。</li>
     */
    public void setNoVideo(Long NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get 视频画面质量评分，取值范围：[0, 100]。 
     * @return QualityEvaluationScore 视频画面质量评分，取值范围：[0, 100]。
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set 视频画面质量评分，取值范围：[0, 100]。
     * @param QualityEvaluationScore 视频画面质量评分，取值范围：[0, 100]。
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get 音画质检测出的异常项列表。 
     * @return QualityInspectResultSet 音画质检测出的异常项列表。
     */
    public QualityInspectResultItem [] getQualityInspectResultSet() {
        return this.QualityInspectResultSet;
    }

    /**
     * Set 音画质检测出的异常项列表。
     * @param QualityInspectResultSet 音画质检测出的异常项列表。
     */
    public void setQualityInspectResultSet(QualityInspectResultItem [] QualityInspectResultSet) {
        this.QualityInspectResultSet = QualityInspectResultSet;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NoAudio", this.NoAudio);
        this.setParamSimple(map, prefix + "NoVideo", this.NoVideo);
        this.setParamSimple(map, prefix + "QualityEvaluationScore", this.QualityEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityInspectResultSet.", this.QualityInspectResultSet);

    }
}

