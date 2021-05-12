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

public class QualityControlInfoTaskResult extends AbstractModel{

    /**
    * 质检任务 ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 质检任务状态。
1：执行中；2：成功；3：失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 表示处理进度百分比
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 处理时长(s)
    */
    @SerializedName("UsedTime")
    @Expose
    private Long UsedTime;

    /**
    * 计费时长(s)
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 为true时表示视频无音频轨
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoAudio")
    @Expose
    private Boolean NoAudio;

    /**
    * 为true时表示视频无视频轨
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoVideo")
    @Expose
    private Boolean NoVideo;

    /**
    * 视频无参考质量打分，百分制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEvaluationScore")
    @Expose
    private Long QualityEvaluationScore;

    /**
    * 视频画面无参考评分低于阈值的时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityEvaluationResults")
    @Expose
    private QualityControlResultItems [] QualityEvaluationResults;

    /**
    * 视频画面抖动时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JitterResults")
    @Expose
    private QualityControlResultItems [] JitterResults;

    /**
    * 视频画面模糊时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlurResults")
    @Expose
    private QualityControlResultItems [] BlurResults;

    /**
    * 视频画面低光、过曝时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbnormalLightingResults")
    @Expose
    private QualityControlResultItems [] AbnormalLightingResults;

    /**
    * 视频画面花屏时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrashScreenResults")
    @Expose
    private QualityControlResultItems [] CrashScreenResults;

    /**
    * 视频画面黑边、白边、黑屏、白屏、纯色屏时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlackWhiteEdgeResults")
    @Expose
    private QualityControlResultItems [] BlackWhiteEdgeResults;

    /**
    * 视频画面有噪点时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoiseResults")
    @Expose
    private QualityControlResultItems [] NoiseResults;

    /**
    * 视频画面有马赛克时间段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MosaicResults")
    @Expose
    private QualityControlResultItems [] MosaicResults;

    /**
    * 视频画面有二维码的时间段，包括小程序码、条形码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QRCodeResults")
    @Expose
    private QualityControlResultItems [] QRCodeResults;

    /**
    * 视频音频异常时间段，包括静音、低音、爆音
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceResults")
    @Expose
    private QualityControlResultItems [] VoiceResults;

    /**
    * 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * Get 质检任务 ID 
     * @return TaskId 质检任务 ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 质检任务 ID
     * @param TaskId 质检任务 ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 质检任务状态。
1：执行中；2：成功；3：失败 
     * @return Status 质检任务状态。
1：执行中；2：成功；3：失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 质检任务状态。
1：执行中；2：成功；3：失败
     * @param Status 质检任务状态。
1：执行中；2：成功；3：失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 表示处理进度百分比 
     * @return Progress 表示处理进度百分比
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 表示处理进度百分比
     * @param Progress 表示处理进度百分比
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 处理时长(s) 
     * @return UsedTime 处理时长(s)
     */
    public Long getUsedTime() {
        return this.UsedTime;
    }

    /**
     * Set 处理时长(s)
     * @param UsedTime 处理时长(s)
     */
    public void setUsedTime(Long UsedTime) {
        this.UsedTime = UsedTime;
    }

    /**
     * Get 计费时长(s) 
     * @return Duration 计费时长(s)
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 计费时长(s)
     * @param Duration 计费时长(s)
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 为true时表示视频无音频轨
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoAudio 为true时表示视频无音频轨
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoAudio() {
        return this.NoAudio;
    }

    /**
     * Set 为true时表示视频无音频轨
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoAudio 为true时表示视频无音频轨
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoAudio(Boolean NoAudio) {
        this.NoAudio = NoAudio;
    }

    /**
     * Get 为true时表示视频无视频轨
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoVideo 为true时表示视频无视频轨
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getNoVideo() {
        return this.NoVideo;
    }

    /**
     * Set 为true时表示视频无视频轨
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoVideo 为true时表示视频无视频轨
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoVideo(Boolean NoVideo) {
        this.NoVideo = NoVideo;
    }

    /**
     * Get 视频无参考质量打分，百分制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEvaluationScore 视频无参考质量打分，百分制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityEvaluationScore() {
        return this.QualityEvaluationScore;
    }

    /**
     * Set 视频无参考质量打分，百分制
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEvaluationScore 视频无参考质量打分，百分制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEvaluationScore(Long QualityEvaluationScore) {
        this.QualityEvaluationScore = QualityEvaluationScore;
    }

    /**
     * Get 视频画面无参考评分低于阈值的时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityEvaluationResults 视频画面无参考评分低于阈值的时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getQualityEvaluationResults() {
        return this.QualityEvaluationResults;
    }

    /**
     * Set 视频画面无参考评分低于阈值的时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityEvaluationResults 视频画面无参考评分低于阈值的时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityEvaluationResults(QualityControlResultItems [] QualityEvaluationResults) {
        this.QualityEvaluationResults = QualityEvaluationResults;
    }

    /**
     * Get 视频画面抖动时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JitterResults 视频画面抖动时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getJitterResults() {
        return this.JitterResults;
    }

    /**
     * Set 视频画面抖动时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param JitterResults 视频画面抖动时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJitterResults(QualityControlResultItems [] JitterResults) {
        this.JitterResults = JitterResults;
    }

    /**
     * Get 视频画面模糊时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlurResults 视频画面模糊时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getBlurResults() {
        return this.BlurResults;
    }

    /**
     * Set 视频画面模糊时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlurResults 视频画面模糊时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlurResults(QualityControlResultItems [] BlurResults) {
        this.BlurResults = BlurResults;
    }

    /**
     * Get 视频画面低光、过曝时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbnormalLightingResults 视频画面低光、过曝时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getAbnormalLightingResults() {
        return this.AbnormalLightingResults;
    }

    /**
     * Set 视频画面低光、过曝时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbnormalLightingResults 视频画面低光、过曝时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormalLightingResults(QualityControlResultItems [] AbnormalLightingResults) {
        this.AbnormalLightingResults = AbnormalLightingResults;
    }

    /**
     * Get 视频画面花屏时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrashScreenResults 视频画面花屏时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getCrashScreenResults() {
        return this.CrashScreenResults;
    }

    /**
     * Set 视频画面花屏时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrashScreenResults 视频画面花屏时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrashScreenResults(QualityControlResultItems [] CrashScreenResults) {
        this.CrashScreenResults = CrashScreenResults;
    }

    /**
     * Get 视频画面黑边、白边、黑屏、白屏、纯色屏时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlackWhiteEdgeResults 视频画面黑边、白边、黑屏、白屏、纯色屏时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getBlackWhiteEdgeResults() {
        return this.BlackWhiteEdgeResults;
    }

    /**
     * Set 视频画面黑边、白边、黑屏、白屏、纯色屏时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlackWhiteEdgeResults 视频画面黑边、白边、黑屏、白屏、纯色屏时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlackWhiteEdgeResults(QualityControlResultItems [] BlackWhiteEdgeResults) {
        this.BlackWhiteEdgeResults = BlackWhiteEdgeResults;
    }

    /**
     * Get 视频画面有噪点时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoiseResults 视频画面有噪点时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getNoiseResults() {
        return this.NoiseResults;
    }

    /**
     * Set 视频画面有噪点时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoiseResults 视频画面有噪点时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoiseResults(QualityControlResultItems [] NoiseResults) {
        this.NoiseResults = NoiseResults;
    }

    /**
     * Get 视频画面有马赛克时间段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MosaicResults 视频画面有马赛克时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getMosaicResults() {
        return this.MosaicResults;
    }

    /**
     * Set 视频画面有马赛克时间段
注意：此字段可能返回 null，表示取不到有效值。
     * @param MosaicResults 视频画面有马赛克时间段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMosaicResults(QualityControlResultItems [] MosaicResults) {
        this.MosaicResults = MosaicResults;
    }

    /**
     * Get 视频画面有二维码的时间段，包括小程序码、条形码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QRCodeResults 视频画面有二维码的时间段，包括小程序码、条形码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getQRCodeResults() {
        return this.QRCodeResults;
    }

    /**
     * Set 视频画面有二维码的时间段，包括小程序码、条形码
注意：此字段可能返回 null，表示取不到有效值。
     * @param QRCodeResults 视频画面有二维码的时间段，包括小程序码、条形码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQRCodeResults(QualityControlResultItems [] QRCodeResults) {
        this.QRCodeResults = QRCodeResults;
    }

    /**
     * Get 视频音频异常时间段，包括静音、低音、爆音
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceResults 视频音频异常时间段，包括静音、低音、爆音
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityControlResultItems [] getVoiceResults() {
        return this.VoiceResults;
    }

    /**
     * Set 视频音频异常时间段，包括静音、低音、爆音
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceResults 视频音频异常时间段，包括静音、低音、爆音
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceResults(QualityControlResultItems [] VoiceResults) {
        this.VoiceResults = VoiceResults;
    }

    /**
     * Get 任务错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 任务错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 任务错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrMsg 任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * Set 任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrMsg 任务错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    public QualityControlInfoTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlInfoTaskResult(QualityControlInfoTaskResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.UsedTime != null) {
            this.UsedTime = new Long(source.UsedTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.NoAudio != null) {
            this.NoAudio = new Boolean(source.NoAudio);
        }
        if (source.NoVideo != null) {
            this.NoVideo = new Boolean(source.NoVideo);
        }
        if (source.QualityEvaluationScore != null) {
            this.QualityEvaluationScore = new Long(source.QualityEvaluationScore);
        }
        if (source.QualityEvaluationResults != null) {
            this.QualityEvaluationResults = new QualityControlResultItems[source.QualityEvaluationResults.length];
            for (int i = 0; i < source.QualityEvaluationResults.length; i++) {
                this.QualityEvaluationResults[i] = new QualityControlResultItems(source.QualityEvaluationResults[i]);
            }
        }
        if (source.JitterResults != null) {
            this.JitterResults = new QualityControlResultItems[source.JitterResults.length];
            for (int i = 0; i < source.JitterResults.length; i++) {
                this.JitterResults[i] = new QualityControlResultItems(source.JitterResults[i]);
            }
        }
        if (source.BlurResults != null) {
            this.BlurResults = new QualityControlResultItems[source.BlurResults.length];
            for (int i = 0; i < source.BlurResults.length; i++) {
                this.BlurResults[i] = new QualityControlResultItems(source.BlurResults[i]);
            }
        }
        if (source.AbnormalLightingResults != null) {
            this.AbnormalLightingResults = new QualityControlResultItems[source.AbnormalLightingResults.length];
            for (int i = 0; i < source.AbnormalLightingResults.length; i++) {
                this.AbnormalLightingResults[i] = new QualityControlResultItems(source.AbnormalLightingResults[i]);
            }
        }
        if (source.CrashScreenResults != null) {
            this.CrashScreenResults = new QualityControlResultItems[source.CrashScreenResults.length];
            for (int i = 0; i < source.CrashScreenResults.length; i++) {
                this.CrashScreenResults[i] = new QualityControlResultItems(source.CrashScreenResults[i]);
            }
        }
        if (source.BlackWhiteEdgeResults != null) {
            this.BlackWhiteEdgeResults = new QualityControlResultItems[source.BlackWhiteEdgeResults.length];
            for (int i = 0; i < source.BlackWhiteEdgeResults.length; i++) {
                this.BlackWhiteEdgeResults[i] = new QualityControlResultItems(source.BlackWhiteEdgeResults[i]);
            }
        }
        if (source.NoiseResults != null) {
            this.NoiseResults = new QualityControlResultItems[source.NoiseResults.length];
            for (int i = 0; i < source.NoiseResults.length; i++) {
                this.NoiseResults[i] = new QualityControlResultItems(source.NoiseResults[i]);
            }
        }
        if (source.MosaicResults != null) {
            this.MosaicResults = new QualityControlResultItems[source.MosaicResults.length];
            for (int i = 0; i < source.MosaicResults.length; i++) {
                this.MosaicResults[i] = new QualityControlResultItems(source.MosaicResults[i]);
            }
        }
        if (source.QRCodeResults != null) {
            this.QRCodeResults = new QualityControlResultItems[source.QRCodeResults.length];
            for (int i = 0; i < source.QRCodeResults.length; i++) {
                this.QRCodeResults[i] = new QualityControlResultItems(source.QRCodeResults[i]);
            }
        }
        if (source.VoiceResults != null) {
            this.VoiceResults = new QualityControlResultItems[source.VoiceResults.length];
            for (int i = 0; i < source.VoiceResults.length; i++) {
                this.VoiceResults[i] = new QualityControlResultItems(source.VoiceResults[i]);
            }
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMsg != null) {
            this.ErrMsg = new String(source.ErrMsg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "UsedTime", this.UsedTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "NoAudio", this.NoAudio);
        this.setParamSimple(map, prefix + "NoVideo", this.NoVideo);
        this.setParamSimple(map, prefix + "QualityEvaluationScore", this.QualityEvaluationScore);
        this.setParamArrayObj(map, prefix + "QualityEvaluationResults.", this.QualityEvaluationResults);
        this.setParamArrayObj(map, prefix + "JitterResults.", this.JitterResults);
        this.setParamArrayObj(map, prefix + "BlurResults.", this.BlurResults);
        this.setParamArrayObj(map, prefix + "AbnormalLightingResults.", this.AbnormalLightingResults);
        this.setParamArrayObj(map, prefix + "CrashScreenResults.", this.CrashScreenResults);
        this.setParamArrayObj(map, prefix + "BlackWhiteEdgeResults.", this.BlackWhiteEdgeResults);
        this.setParamArrayObj(map, prefix + "NoiseResults.", this.NoiseResults);
        this.setParamArrayObj(map, prefix + "MosaicResults.", this.MosaicResults);
        this.setParamArrayObj(map, prefix + "QRCodeResults.", this.QRCodeResults);
        this.setParamArrayObj(map, prefix + "VoiceResults.", this.VoiceResults);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

