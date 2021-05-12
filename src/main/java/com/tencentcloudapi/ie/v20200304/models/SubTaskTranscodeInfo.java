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

public class SubTaskTranscodeInfo extends AbstractModel{

    /**
    * 子任务名称。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 目标文件信息。
    */
    @SerializedName("TargetInfo")
    @Expose
    private TargetInfo TargetInfo;

    /**
    * 视频剪辑信息。注意：如果填写了EditInfo，则VideoInfo和AudioInfo必填
    */
    @SerializedName("EditInfo")
    @Expose
    private EditInfo EditInfo;

    /**
    * 视频转码信息，不填保持和源文件一致。
    */
    @SerializedName("VideoInfo")
    @Expose
    private VideoInfo VideoInfo;

    /**
    * 音频转码信息，不填保持和源文件一致。
    */
    @SerializedName("AudioInfo")
    @Expose
    private AudioInfo AudioInfo;

    /**
    * 指定封装信息。
    */
    @SerializedName("MuxInfo")
    @Expose
    private MuxInfo MuxInfo;

    /**
     * Get 子任务名称。 
     * @return TaskName 子任务名称。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 子任务名称。
     * @param TaskName 子任务名称。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 目标文件信息。 
     * @return TargetInfo 目标文件信息。
     */
    public TargetInfo getTargetInfo() {
        return this.TargetInfo;
    }

    /**
     * Set 目标文件信息。
     * @param TargetInfo 目标文件信息。
     */
    public void setTargetInfo(TargetInfo TargetInfo) {
        this.TargetInfo = TargetInfo;
    }

    /**
     * Get 视频剪辑信息。注意：如果填写了EditInfo，则VideoInfo和AudioInfo必填 
     * @return EditInfo 视频剪辑信息。注意：如果填写了EditInfo，则VideoInfo和AudioInfo必填
     */
    public EditInfo getEditInfo() {
        return this.EditInfo;
    }

    /**
     * Set 视频剪辑信息。注意：如果填写了EditInfo，则VideoInfo和AudioInfo必填
     * @param EditInfo 视频剪辑信息。注意：如果填写了EditInfo，则VideoInfo和AudioInfo必填
     */
    public void setEditInfo(EditInfo EditInfo) {
        this.EditInfo = EditInfo;
    }

    /**
     * Get 视频转码信息，不填保持和源文件一致。 
     * @return VideoInfo 视频转码信息，不填保持和源文件一致。
     */
    public VideoInfo getVideoInfo() {
        return this.VideoInfo;
    }

    /**
     * Set 视频转码信息，不填保持和源文件一致。
     * @param VideoInfo 视频转码信息，不填保持和源文件一致。
     */
    public void setVideoInfo(VideoInfo VideoInfo) {
        this.VideoInfo = VideoInfo;
    }

    /**
     * Get 音频转码信息，不填保持和源文件一致。 
     * @return AudioInfo 音频转码信息，不填保持和源文件一致。
     */
    public AudioInfo getAudioInfo() {
        return this.AudioInfo;
    }

    /**
     * Set 音频转码信息，不填保持和源文件一致。
     * @param AudioInfo 音频转码信息，不填保持和源文件一致。
     */
    public void setAudioInfo(AudioInfo AudioInfo) {
        this.AudioInfo = AudioInfo;
    }

    /**
     * Get 指定封装信息。 
     * @return MuxInfo 指定封装信息。
     */
    public MuxInfo getMuxInfo() {
        return this.MuxInfo;
    }

    /**
     * Set 指定封装信息。
     * @param MuxInfo 指定封装信息。
     */
    public void setMuxInfo(MuxInfo MuxInfo) {
        this.MuxInfo = MuxInfo;
    }

    public SubTaskTranscodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubTaskTranscodeInfo(SubTaskTranscodeInfo source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TargetInfo != null) {
            this.TargetInfo = new TargetInfo(source.TargetInfo);
        }
        if (source.EditInfo != null) {
            this.EditInfo = new EditInfo(source.EditInfo);
        }
        if (source.VideoInfo != null) {
            this.VideoInfo = new VideoInfo(source.VideoInfo);
        }
        if (source.AudioInfo != null) {
            this.AudioInfo = new AudioInfo(source.AudioInfo);
        }
        if (source.MuxInfo != null) {
            this.MuxInfo = new MuxInfo(source.MuxInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "TargetInfo.", this.TargetInfo);
        this.setParamObj(map, prefix + "EditInfo.", this.EditInfo);
        this.setParamObj(map, prefix + "VideoInfo.", this.VideoInfo);
        this.setParamObj(map, prefix + "AudioInfo.", this.AudioInfo);
        this.setParamObj(map, prefix + "MuxInfo.", this.MuxInfo);

    }
}

