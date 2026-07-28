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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveModerationParams extends AbstractModel {

    /**
    * <p>AI 内容理解任务类型</p><p>枚举值：</p><ul><li>1： 音频切片理解</li><li>2： 视频截帧理解</li><li>3： 音视切片+视频截帧理解 </li></ul><p>默认值：3</p>
    */
    @SerializedName("ModerationType")
    @Expose
    private Long ModerationType;

    /**
    * <p>持续没有上行推流的状态超过MaxIdleTime的时长，自动停止切片。</p><p>取值范围：[30, 1800]</p><p>单位：秒</p><p>默认值：30</p>
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * <p>视频截帧间隔</p><p>取值范围：[1, 60]</p><p>单位：秒</p><p>默认值：5</p>
    */
    @SerializedName("SliceVideo")
    @Expose
    private Long SliceVideo;

    /**
    * <p>音频切片时长</p><p>取值范围：[5, 60]</p><p>单位：秒</p><p>默认值：15</p>
    */
    @SerializedName("SliceAudio")
    @Expose
    private Long SliceAudio;

    /**
    * <p>是否保存文件</p><p>枚举值：</p><ul><li>0： 0不保存</li><li>1： 1保存所有</li><li>2： 仅命中</li></ul><p>默认值：1</p>
    */
    @SerializedName("SaveModerationFile")
    @Expose
    private Long SaveModerationFile;

    /**
    * <p>是否回调所有内容理解结果</p><p>枚举值：</p><ul><li>0： 回调所有结果</li><li>1： 仅回调命中结果</li></ul><p>默认值：0</p>
    */
    @SerializedName("CallbackAllResults")
    @Expose
    private Long CallbackAllResults;

    /**
     * Get <p>AI 内容理解任务类型</p><p>枚举值：</p><ul><li>1： 音频切片理解</li><li>2： 视频截帧理解</li><li>3： 音视切片+视频截帧理解 </li></ul><p>默认值：3</p> 
     * @return ModerationType <p>AI 内容理解任务类型</p><p>枚举值：</p><ul><li>1： 音频切片理解</li><li>2： 视频截帧理解</li><li>3： 音视切片+视频截帧理解 </li></ul><p>默认值：3</p>
     */
    public Long getModerationType() {
        return this.ModerationType;
    }

    /**
     * Set <p>AI 内容理解任务类型</p><p>枚举值：</p><ul><li>1： 音频切片理解</li><li>2： 视频截帧理解</li><li>3： 音视切片+视频截帧理解 </li></ul><p>默认值：3</p>
     * @param ModerationType <p>AI 内容理解任务类型</p><p>枚举值：</p><ul><li>1： 音频切片理解</li><li>2： 视频截帧理解</li><li>3： 音视切片+视频截帧理解 </li></ul><p>默认值：3</p>
     */
    public void setModerationType(Long ModerationType) {
        this.ModerationType = ModerationType;
    }

    /**
     * Get <p>持续没有上行推流的状态超过MaxIdleTime的时长，自动停止切片。</p><p>取值范围：[30, 1800]</p><p>单位：秒</p><p>默认值：30</p> 
     * @return MaxIdleTime <p>持续没有上行推流的状态超过MaxIdleTime的时长，自动停止切片。</p><p>取值范围：[30, 1800]</p><p>单位：秒</p><p>默认值：30</p>
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set <p>持续没有上行推流的状态超过MaxIdleTime的时长，自动停止切片。</p><p>取值范围：[30, 1800]</p><p>单位：秒</p><p>默认值：30</p>
     * @param MaxIdleTime <p>持续没有上行推流的状态超过MaxIdleTime的时长，自动停止切片。</p><p>取值范围：[30, 1800]</p><p>单位：秒</p><p>默认值：30</p>
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get <p>视频截帧间隔</p><p>取值范围：[1, 60]</p><p>单位：秒</p><p>默认值：5</p> 
     * @return SliceVideo <p>视频截帧间隔</p><p>取值范围：[1, 60]</p><p>单位：秒</p><p>默认值：5</p>
     */
    public Long getSliceVideo() {
        return this.SliceVideo;
    }

    /**
     * Set <p>视频截帧间隔</p><p>取值范围：[1, 60]</p><p>单位：秒</p><p>默认值：5</p>
     * @param SliceVideo <p>视频截帧间隔</p><p>取值范围：[1, 60]</p><p>单位：秒</p><p>默认值：5</p>
     */
    public void setSliceVideo(Long SliceVideo) {
        this.SliceVideo = SliceVideo;
    }

    /**
     * Get <p>音频切片时长</p><p>取值范围：[5, 60]</p><p>单位：秒</p><p>默认值：15</p> 
     * @return SliceAudio <p>音频切片时长</p><p>取值范围：[5, 60]</p><p>单位：秒</p><p>默认值：15</p>
     */
    public Long getSliceAudio() {
        return this.SliceAudio;
    }

    /**
     * Set <p>音频切片时长</p><p>取值范围：[5, 60]</p><p>单位：秒</p><p>默认值：15</p>
     * @param SliceAudio <p>音频切片时长</p><p>取值范围：[5, 60]</p><p>单位：秒</p><p>默认值：15</p>
     */
    public void setSliceAudio(Long SliceAudio) {
        this.SliceAudio = SliceAudio;
    }

    /**
     * Get <p>是否保存文件</p><p>枚举值：</p><ul><li>0： 0不保存</li><li>1： 1保存所有</li><li>2： 仅命中</li></ul><p>默认值：1</p> 
     * @return SaveModerationFile <p>是否保存文件</p><p>枚举值：</p><ul><li>0： 0不保存</li><li>1： 1保存所有</li><li>2： 仅命中</li></ul><p>默认值：1</p>
     */
    public Long getSaveModerationFile() {
        return this.SaveModerationFile;
    }

    /**
     * Set <p>是否保存文件</p><p>枚举值：</p><ul><li>0： 0不保存</li><li>1： 1保存所有</li><li>2： 仅命中</li></ul><p>默认值：1</p>
     * @param SaveModerationFile <p>是否保存文件</p><p>枚举值：</p><ul><li>0： 0不保存</li><li>1： 1保存所有</li><li>2： 仅命中</li></ul><p>默认值：1</p>
     */
    public void setSaveModerationFile(Long SaveModerationFile) {
        this.SaveModerationFile = SaveModerationFile;
    }

    /**
     * Get <p>是否回调所有内容理解结果</p><p>枚举值：</p><ul><li>0： 回调所有结果</li><li>1： 仅回调命中结果</li></ul><p>默认值：0</p> 
     * @return CallbackAllResults <p>是否回调所有内容理解结果</p><p>枚举值：</p><ul><li>0： 回调所有结果</li><li>1： 仅回调命中结果</li></ul><p>默认值：0</p>
     */
    public Long getCallbackAllResults() {
        return this.CallbackAllResults;
    }

    /**
     * Set <p>是否回调所有内容理解结果</p><p>枚举值：</p><ul><li>0： 回调所有结果</li><li>1： 仅回调命中结果</li></ul><p>默认值：0</p>
     * @param CallbackAllResults <p>是否回调所有内容理解结果</p><p>枚举值：</p><ul><li>0： 回调所有结果</li><li>1： 仅回调命中结果</li></ul><p>默认值：0</p>
     */
    public void setCallbackAllResults(Long CallbackAllResults) {
        this.CallbackAllResults = CallbackAllResults;
    }

    public LiveModerationParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveModerationParams(LiveModerationParams source) {
        if (source.ModerationType != null) {
            this.ModerationType = new Long(source.ModerationType);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.SliceVideo != null) {
            this.SliceVideo = new Long(source.SliceVideo);
        }
        if (source.SliceAudio != null) {
            this.SliceAudio = new Long(source.SliceAudio);
        }
        if (source.SaveModerationFile != null) {
            this.SaveModerationFile = new Long(source.SaveModerationFile);
        }
        if (source.CallbackAllResults != null) {
            this.CallbackAllResults = new Long(source.CallbackAllResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModerationType", this.ModerationType);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "SliceVideo", this.SliceVideo);
        this.setParamSimple(map, prefix + "SliceAudio", this.SliceAudio);
        this.setParamSimple(map, prefix + "SaveModerationFile", this.SaveModerationFile);
        this.setParamSimple(map, prefix + "CallbackAllResults", this.CallbackAllResults);

    }
}

