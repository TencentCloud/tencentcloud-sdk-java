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

public class EvaluationTaskInput extends AbstractModel {

    /**
    * 评测任务类型，可选 NORMAL、BD_RATE
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 评测类型，可选 PSNR、SSIM、VMAF、VMAF_NEG
    */
    @SerializedName("EvaluationTypeSet")
    @Expose
    private String [] EvaluationTypeSet;

    /**
    * 评测范围类型，可选 ALL（全部时长）、TIME（指定时长范围）、FRAME（指定帧数范围）
    */
    @SerializedName("EvaluationRangeType")
    @Expose
    private String EvaluationRangeType;

    /**
    * 对比视频信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContrastInfoSet")
    @Expose
    private MediaInputInfo [] ContrastInfoSet;

    /**
    * 对比视频信息。
    */
    @SerializedName("ContrastMediaSet")
    @Expose
    private EvaluationMediaInputInfo [] ContrastMediaSet;

    /**
    * 对比转码模板信息。
    */
    @SerializedName("ContrastTemplateSet")
    @Expose
    private EvaluationTemplateInputInfo [] ContrastTemplateSet;

    /**
    * 开始评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 评测开始帧，默认从0开始，当 EvaluationRangeType 为FRAME 时有效。
    */
    @SerializedName("StartFrameIndex")
    @Expose
    private Long StartFrameIndex;

    /**
    * 评测结束帧，默认为视频中可以参与评测的最后一帧，当 EvaluationRangeType 为 FRAME 时有效。
    */
    @SerializedName("EndFrameIndex")
    @Expose
    private Long EndFrameIndex;

    /**
    * 分辨率对齐模式，默认对齐到低分辨率的视频，可选 ALIGN_HIGH_RESOLUTION、ALIGN_LOW_RESOLUTION
    */
    @SerializedName("ResolutionAlignmentMode")
    @Expose
    private String ResolutionAlignmentMode;

    /**
    * 指定码率评测，当评测任务类型为 BD_RATE 有效。
    */
    @SerializedName("BitrateSet")
    @Expose
    private Long [] BitrateSet;

    /**
    * 指定 vcrf 评测，当评测任务类型为 BD_RATE 有效。
    */
    @SerializedName("VCRFSet")
    @Expose
    private Long [] VCRFSet;

    /**
     * Get 评测任务类型，可选 NORMAL、BD_RATE 
     * @return TaskType 评测任务类型，可选 NORMAL、BD_RATE
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 评测任务类型，可选 NORMAL、BD_RATE
     * @param TaskType 评测任务类型，可选 NORMAL、BD_RATE
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 评测类型，可选 PSNR、SSIM、VMAF、VMAF_NEG 
     * @return EvaluationTypeSet 评测类型，可选 PSNR、SSIM、VMAF、VMAF_NEG
     */
    public String [] getEvaluationTypeSet() {
        return this.EvaluationTypeSet;
    }

    /**
     * Set 评测类型，可选 PSNR、SSIM、VMAF、VMAF_NEG
     * @param EvaluationTypeSet 评测类型，可选 PSNR、SSIM、VMAF、VMAF_NEG
     */
    public void setEvaluationTypeSet(String [] EvaluationTypeSet) {
        this.EvaluationTypeSet = EvaluationTypeSet;
    }

    /**
     * Get 评测范围类型，可选 ALL（全部时长）、TIME（指定时长范围）、FRAME（指定帧数范围） 
     * @return EvaluationRangeType 评测范围类型，可选 ALL（全部时长）、TIME（指定时长范围）、FRAME（指定帧数范围）
     */
    public String getEvaluationRangeType() {
        return this.EvaluationRangeType;
    }

    /**
     * Set 评测范围类型，可选 ALL（全部时长）、TIME（指定时长范围）、FRAME（指定帧数范围）
     * @param EvaluationRangeType 评测范围类型，可选 ALL（全部时长）、TIME（指定时长范围）、FRAME（指定帧数范围）
     */
    public void setEvaluationRangeType(String EvaluationRangeType) {
        this.EvaluationRangeType = EvaluationRangeType;
    }

    /**
     * Get 对比视频信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContrastInfoSet 对比视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public MediaInputInfo [] getContrastInfoSet() {
        return this.ContrastInfoSet;
    }

    /**
     * Set 对比视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContrastInfoSet 对比视频信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setContrastInfoSet(MediaInputInfo [] ContrastInfoSet) {
        this.ContrastInfoSet = ContrastInfoSet;
    }

    /**
     * Get 对比视频信息。 
     * @return ContrastMediaSet 对比视频信息。
     */
    public EvaluationMediaInputInfo [] getContrastMediaSet() {
        return this.ContrastMediaSet;
    }

    /**
     * Set 对比视频信息。
     * @param ContrastMediaSet 对比视频信息。
     */
    public void setContrastMediaSet(EvaluationMediaInputInfo [] ContrastMediaSet) {
        this.ContrastMediaSet = ContrastMediaSet;
    }

    /**
     * Get 对比转码模板信息。 
     * @return ContrastTemplateSet 对比转码模板信息。
     */
    public EvaluationTemplateInputInfo [] getContrastTemplateSet() {
        return this.ContrastTemplateSet;
    }

    /**
     * Set 对比转码模板信息。
     * @param ContrastTemplateSet 对比转码模板信息。
     */
    public void setContrastTemplateSet(EvaluationTemplateInputInfo [] ContrastTemplateSet) {
        this.ContrastTemplateSet = ContrastTemplateSet;
    }

    /**
     * Get 开始评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。 
     * @return StartTime 开始评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
     * @param StartTime 开始评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。 
     * @return EndTime 结束评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
     * @param EndTime 结束评测时间，单位秒，当 EvaluationRangeType 为 TIME 时有效。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 评测开始帧，默认从0开始，当 EvaluationRangeType 为FRAME 时有效。 
     * @return StartFrameIndex 评测开始帧，默认从0开始，当 EvaluationRangeType 为FRAME 时有效。
     */
    public Long getStartFrameIndex() {
        return this.StartFrameIndex;
    }

    /**
     * Set 评测开始帧，默认从0开始，当 EvaluationRangeType 为FRAME 时有效。
     * @param StartFrameIndex 评测开始帧，默认从0开始，当 EvaluationRangeType 为FRAME 时有效。
     */
    public void setStartFrameIndex(Long StartFrameIndex) {
        this.StartFrameIndex = StartFrameIndex;
    }

    /**
     * Get 评测结束帧，默认为视频中可以参与评测的最后一帧，当 EvaluationRangeType 为 FRAME 时有效。 
     * @return EndFrameIndex 评测结束帧，默认为视频中可以参与评测的最后一帧，当 EvaluationRangeType 为 FRAME 时有效。
     */
    public Long getEndFrameIndex() {
        return this.EndFrameIndex;
    }

    /**
     * Set 评测结束帧，默认为视频中可以参与评测的最后一帧，当 EvaluationRangeType 为 FRAME 时有效。
     * @param EndFrameIndex 评测结束帧，默认为视频中可以参与评测的最后一帧，当 EvaluationRangeType 为 FRAME 时有效。
     */
    public void setEndFrameIndex(Long EndFrameIndex) {
        this.EndFrameIndex = EndFrameIndex;
    }

    /**
     * Get 分辨率对齐模式，默认对齐到低分辨率的视频，可选 ALIGN_HIGH_RESOLUTION、ALIGN_LOW_RESOLUTION 
     * @return ResolutionAlignmentMode 分辨率对齐模式，默认对齐到低分辨率的视频，可选 ALIGN_HIGH_RESOLUTION、ALIGN_LOW_RESOLUTION
     */
    public String getResolutionAlignmentMode() {
        return this.ResolutionAlignmentMode;
    }

    /**
     * Set 分辨率对齐模式，默认对齐到低分辨率的视频，可选 ALIGN_HIGH_RESOLUTION、ALIGN_LOW_RESOLUTION
     * @param ResolutionAlignmentMode 分辨率对齐模式，默认对齐到低分辨率的视频，可选 ALIGN_HIGH_RESOLUTION、ALIGN_LOW_RESOLUTION
     */
    public void setResolutionAlignmentMode(String ResolutionAlignmentMode) {
        this.ResolutionAlignmentMode = ResolutionAlignmentMode;
    }

    /**
     * Get 指定码率评测，当评测任务类型为 BD_RATE 有效。 
     * @return BitrateSet 指定码率评测，当评测任务类型为 BD_RATE 有效。
     */
    public Long [] getBitrateSet() {
        return this.BitrateSet;
    }

    /**
     * Set 指定码率评测，当评测任务类型为 BD_RATE 有效。
     * @param BitrateSet 指定码率评测，当评测任务类型为 BD_RATE 有效。
     */
    public void setBitrateSet(Long [] BitrateSet) {
        this.BitrateSet = BitrateSet;
    }

    /**
     * Get 指定 vcrf 评测，当评测任务类型为 BD_RATE 有效。 
     * @return VCRFSet 指定 vcrf 评测，当评测任务类型为 BD_RATE 有效。
     */
    public Long [] getVCRFSet() {
        return this.VCRFSet;
    }

    /**
     * Set 指定 vcrf 评测，当评测任务类型为 BD_RATE 有效。
     * @param VCRFSet 指定 vcrf 评测，当评测任务类型为 BD_RATE 有效。
     */
    public void setVCRFSet(Long [] VCRFSet) {
        this.VCRFSet = VCRFSet;
    }

    public EvaluationTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EvaluationTaskInput(EvaluationTaskInput source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.EvaluationTypeSet != null) {
            this.EvaluationTypeSet = new String[source.EvaluationTypeSet.length];
            for (int i = 0; i < source.EvaluationTypeSet.length; i++) {
                this.EvaluationTypeSet[i] = new String(source.EvaluationTypeSet[i]);
            }
        }
        if (source.EvaluationRangeType != null) {
            this.EvaluationRangeType = new String(source.EvaluationRangeType);
        }
        if (source.ContrastInfoSet != null) {
            this.ContrastInfoSet = new MediaInputInfo[source.ContrastInfoSet.length];
            for (int i = 0; i < source.ContrastInfoSet.length; i++) {
                this.ContrastInfoSet[i] = new MediaInputInfo(source.ContrastInfoSet[i]);
            }
        }
        if (source.ContrastMediaSet != null) {
            this.ContrastMediaSet = new EvaluationMediaInputInfo[source.ContrastMediaSet.length];
            for (int i = 0; i < source.ContrastMediaSet.length; i++) {
                this.ContrastMediaSet[i] = new EvaluationMediaInputInfo(source.ContrastMediaSet[i]);
            }
        }
        if (source.ContrastTemplateSet != null) {
            this.ContrastTemplateSet = new EvaluationTemplateInputInfo[source.ContrastTemplateSet.length];
            for (int i = 0; i < source.ContrastTemplateSet.length; i++) {
                this.ContrastTemplateSet[i] = new EvaluationTemplateInputInfo(source.ContrastTemplateSet[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartFrameIndex != null) {
            this.StartFrameIndex = new Long(source.StartFrameIndex);
        }
        if (source.EndFrameIndex != null) {
            this.EndFrameIndex = new Long(source.EndFrameIndex);
        }
        if (source.ResolutionAlignmentMode != null) {
            this.ResolutionAlignmentMode = new String(source.ResolutionAlignmentMode);
        }
        if (source.BitrateSet != null) {
            this.BitrateSet = new Long[source.BitrateSet.length];
            for (int i = 0; i < source.BitrateSet.length; i++) {
                this.BitrateSet[i] = new Long(source.BitrateSet[i]);
            }
        }
        if (source.VCRFSet != null) {
            this.VCRFSet = new Long[source.VCRFSet.length];
            for (int i = 0; i < source.VCRFSet.length; i++) {
                this.VCRFSet[i] = new Long(source.VCRFSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "EvaluationTypeSet.", this.EvaluationTypeSet);
        this.setParamSimple(map, prefix + "EvaluationRangeType", this.EvaluationRangeType);
        this.setParamArrayObj(map, prefix + "ContrastInfoSet.", this.ContrastInfoSet);
        this.setParamArrayObj(map, prefix + "ContrastMediaSet.", this.ContrastMediaSet);
        this.setParamArrayObj(map, prefix + "ContrastTemplateSet.", this.ContrastTemplateSet);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartFrameIndex", this.StartFrameIndex);
        this.setParamSimple(map, prefix + "EndFrameIndex", this.EndFrameIndex);
        this.setParamSimple(map, prefix + "ResolutionAlignmentMode", this.ResolutionAlignmentMode);
        this.setParamArraySimple(map, prefix + "BitrateSet.", this.BitrateSet);
        this.setParamArraySimple(map, prefix + "VCRFSet.", this.VCRFSet);

    }
}

