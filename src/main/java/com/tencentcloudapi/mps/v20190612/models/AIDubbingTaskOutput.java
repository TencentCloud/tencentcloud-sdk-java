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

public class AIDubbingTaskOutput extends AbstractModel {

    /**
    * <p>基于画面提取的字幕文件路径。</p>
    */
    @SerializedName("OriginSubtitlePath")
    @Expose
    private String OriginSubtitlePath;

    /**
    * <p>基于画面提取的字幕翻译文件路径。</p>
    */
    @SerializedName("TranslateSubtitlePath")
    @Expose
    private String TranslateSubtitlePath;

    /**
    * <p>音色克隆后的视频文件地址</p>
    */
    @SerializedName("VoiceClonedVideo")
    @Expose
    private String VoiceClonedVideo;

    /**
    * <p>音色克隆的标注文件地址</p>
    */
    @SerializedName("VoiceClonedMarkFile")
    @Expose
    private String VoiceClonedMarkFile;

    /**
    * <p>视频输出路径。</p>
    */
    @SerializedName("VideoPath")
    @Expose
    private String VideoPath;

    /**
    * <p>基于画面提取的字幕文件FileId。</p>
    */
    @SerializedName("OriginSubtitleFileId")
    @Expose
    private String OriginSubtitleFileId;

    /**
    * <p>基于画面提取的字幕翻译文件FileId    。</p>
    */
    @SerializedName("TranslateSubtitleFileId")
    @Expose
    private String TranslateSubtitleFileId;

    /**
    * <p>标记文件路径。</p>
    */
    @SerializedName("SpeakerPath")
    @Expose
    private String SpeakerPath;

    /**
    * <p>标记文件Fileid。</p>
    */
    @SerializedName("SpeakerFileId")
    @Expose
    private String SpeakerFileId;

    /**
    * <p>擦除视频输出FileId。</p>
    */
    @SerializedName("EraseVideoFileId")
    @Expose
    private String EraseVideoFileId;

    /**
    * <p>擦除视频输出路径。</p>
    */
    @SerializedName("EraseVideoPath")
    @Expose
    private String EraseVideoPath;

    /**
    * <p>译文配音音频文件路径。</p>
    */
    @SerializedName("DstAudioPath")
    @Expose
    private String DstAudioPath;

    /**
    * <p>译文配音音频文件FileId。</p>
    */
    @SerializedName("DstAudioFileId")
    @Expose
    private String DstAudioFileId;

    /**
    * <p>音色克隆编辑信息</p><p>用于音色克隆二次修改的编辑信息</p>
    */
    @SerializedName("DubbingEditInfoUrl")
    @Expose
    private String DubbingEditInfoUrl;

    /**
    * <p>擦除的字幕位置。<strong>注意</strong>：仅对字幕提取且开启返回字幕位置时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitlePos")
    @Expose
    private SubtitlePosition SubtitlePos;

    /**
    * <p>AI配音任务输出文件的存储位置。</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
     * Get <p>基于画面提取的字幕文件路径。</p> 
     * @return OriginSubtitlePath <p>基于画面提取的字幕文件路径。</p>
     */
    public String getOriginSubtitlePath() {
        return this.OriginSubtitlePath;
    }

    /**
     * Set <p>基于画面提取的字幕文件路径。</p>
     * @param OriginSubtitlePath <p>基于画面提取的字幕文件路径。</p>
     */
    public void setOriginSubtitlePath(String OriginSubtitlePath) {
        this.OriginSubtitlePath = OriginSubtitlePath;
    }

    /**
     * Get <p>基于画面提取的字幕翻译文件路径。</p> 
     * @return TranslateSubtitlePath <p>基于画面提取的字幕翻译文件路径。</p>
     */
    public String getTranslateSubtitlePath() {
        return this.TranslateSubtitlePath;
    }

    /**
     * Set <p>基于画面提取的字幕翻译文件路径。</p>
     * @param TranslateSubtitlePath <p>基于画面提取的字幕翻译文件路径。</p>
     */
    public void setTranslateSubtitlePath(String TranslateSubtitlePath) {
        this.TranslateSubtitlePath = TranslateSubtitlePath;
    }

    /**
     * Get <p>音色克隆后的视频文件地址</p> 
     * @return VoiceClonedVideo <p>音色克隆后的视频文件地址</p>
     */
    public String getVoiceClonedVideo() {
        return this.VoiceClonedVideo;
    }

    /**
     * Set <p>音色克隆后的视频文件地址</p>
     * @param VoiceClonedVideo <p>音色克隆后的视频文件地址</p>
     */
    public void setVoiceClonedVideo(String VoiceClonedVideo) {
        this.VoiceClonedVideo = VoiceClonedVideo;
    }

    /**
     * Get <p>音色克隆的标注文件地址</p> 
     * @return VoiceClonedMarkFile <p>音色克隆的标注文件地址</p>
     */
    public String getVoiceClonedMarkFile() {
        return this.VoiceClonedMarkFile;
    }

    /**
     * Set <p>音色克隆的标注文件地址</p>
     * @param VoiceClonedMarkFile <p>音色克隆的标注文件地址</p>
     */
    public void setVoiceClonedMarkFile(String VoiceClonedMarkFile) {
        this.VoiceClonedMarkFile = VoiceClonedMarkFile;
    }

    /**
     * Get <p>视频输出路径。</p> 
     * @return VideoPath <p>视频输出路径。</p>
     */
    public String getVideoPath() {
        return this.VideoPath;
    }

    /**
     * Set <p>视频输出路径。</p>
     * @param VideoPath <p>视频输出路径。</p>
     */
    public void setVideoPath(String VideoPath) {
        this.VideoPath = VideoPath;
    }

    /**
     * Get <p>基于画面提取的字幕文件FileId。</p> 
     * @return OriginSubtitleFileId <p>基于画面提取的字幕文件FileId。</p>
     */
    public String getOriginSubtitleFileId() {
        return this.OriginSubtitleFileId;
    }

    /**
     * Set <p>基于画面提取的字幕文件FileId。</p>
     * @param OriginSubtitleFileId <p>基于画面提取的字幕文件FileId。</p>
     */
    public void setOriginSubtitleFileId(String OriginSubtitleFileId) {
        this.OriginSubtitleFileId = OriginSubtitleFileId;
    }

    /**
     * Get <p>基于画面提取的字幕翻译文件FileId    。</p> 
     * @return TranslateSubtitleFileId <p>基于画面提取的字幕翻译文件FileId    。</p>
     */
    public String getTranslateSubtitleFileId() {
        return this.TranslateSubtitleFileId;
    }

    /**
     * Set <p>基于画面提取的字幕翻译文件FileId    。</p>
     * @param TranslateSubtitleFileId <p>基于画面提取的字幕翻译文件FileId    。</p>
     */
    public void setTranslateSubtitleFileId(String TranslateSubtitleFileId) {
        this.TranslateSubtitleFileId = TranslateSubtitleFileId;
    }

    /**
     * Get <p>标记文件路径。</p> 
     * @return SpeakerPath <p>标记文件路径。</p>
     */
    public String getSpeakerPath() {
        return this.SpeakerPath;
    }

    /**
     * Set <p>标记文件路径。</p>
     * @param SpeakerPath <p>标记文件路径。</p>
     */
    public void setSpeakerPath(String SpeakerPath) {
        this.SpeakerPath = SpeakerPath;
    }

    /**
     * Get <p>标记文件Fileid。</p> 
     * @return SpeakerFileId <p>标记文件Fileid。</p>
     */
    public String getSpeakerFileId() {
        return this.SpeakerFileId;
    }

    /**
     * Set <p>标记文件Fileid。</p>
     * @param SpeakerFileId <p>标记文件Fileid。</p>
     */
    public void setSpeakerFileId(String SpeakerFileId) {
        this.SpeakerFileId = SpeakerFileId;
    }

    /**
     * Get <p>擦除视频输出FileId。</p> 
     * @return EraseVideoFileId <p>擦除视频输出FileId。</p>
     */
    public String getEraseVideoFileId() {
        return this.EraseVideoFileId;
    }

    /**
     * Set <p>擦除视频输出FileId。</p>
     * @param EraseVideoFileId <p>擦除视频输出FileId。</p>
     */
    public void setEraseVideoFileId(String EraseVideoFileId) {
        this.EraseVideoFileId = EraseVideoFileId;
    }

    /**
     * Get <p>擦除视频输出路径。</p> 
     * @return EraseVideoPath <p>擦除视频输出路径。</p>
     */
    public String getEraseVideoPath() {
        return this.EraseVideoPath;
    }

    /**
     * Set <p>擦除视频输出路径。</p>
     * @param EraseVideoPath <p>擦除视频输出路径。</p>
     */
    public void setEraseVideoPath(String EraseVideoPath) {
        this.EraseVideoPath = EraseVideoPath;
    }

    /**
     * Get <p>译文配音音频文件路径。</p> 
     * @return DstAudioPath <p>译文配音音频文件路径。</p>
     */
    public String getDstAudioPath() {
        return this.DstAudioPath;
    }

    /**
     * Set <p>译文配音音频文件路径。</p>
     * @param DstAudioPath <p>译文配音音频文件路径。</p>
     */
    public void setDstAudioPath(String DstAudioPath) {
        this.DstAudioPath = DstAudioPath;
    }

    /**
     * Get <p>译文配音音频文件FileId。</p> 
     * @return DstAudioFileId <p>译文配音音频文件FileId。</p>
     */
    public String getDstAudioFileId() {
        return this.DstAudioFileId;
    }

    /**
     * Set <p>译文配音音频文件FileId。</p>
     * @param DstAudioFileId <p>译文配音音频文件FileId。</p>
     */
    public void setDstAudioFileId(String DstAudioFileId) {
        this.DstAudioFileId = DstAudioFileId;
    }

    /**
     * Get <p>音色克隆编辑信息</p><p>用于音色克隆二次修改的编辑信息</p> 
     * @return DubbingEditInfoUrl <p>音色克隆编辑信息</p><p>用于音色克隆二次修改的编辑信息</p>
     */
    public String getDubbingEditInfoUrl() {
        return this.DubbingEditInfoUrl;
    }

    /**
     * Set <p>音色克隆编辑信息</p><p>用于音色克隆二次修改的编辑信息</p>
     * @param DubbingEditInfoUrl <p>音色克隆编辑信息</p><p>用于音色克隆二次修改的编辑信息</p>
     */
    public void setDubbingEditInfoUrl(String DubbingEditInfoUrl) {
        this.DubbingEditInfoUrl = DubbingEditInfoUrl;
    }

    /**
     * Get <p>擦除的字幕位置。<strong>注意</strong>：仅对字幕提取且开启返回字幕位置时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitlePos <p>擦除的字幕位置。<strong>注意</strong>：仅对字幕提取且开启返回字幕位置时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitlePosition getSubtitlePos() {
        return this.SubtitlePos;
    }

    /**
     * Set <p>擦除的字幕位置。<strong>注意</strong>：仅对字幕提取且开启返回字幕位置时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitlePos <p>擦除的字幕位置。<strong>注意</strong>：仅对字幕提取且开启返回字幕位置时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitlePos(SubtitlePosition SubtitlePos) {
        this.SubtitlePos = SubtitlePos;
    }

    /**
     * Get <p>AI配音任务输出文件的存储位置。</p> 
     * @return OutputStorage <p>AI配音任务输出文件的存储位置。</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>AI配音任务输出文件的存储位置。</p>
     * @param OutputStorage <p>AI配音任务输出文件的存储位置。</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    public AIDubbingTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIDubbingTaskOutput(AIDubbingTaskOutput source) {
        if (source.OriginSubtitlePath != null) {
            this.OriginSubtitlePath = new String(source.OriginSubtitlePath);
        }
        if (source.TranslateSubtitlePath != null) {
            this.TranslateSubtitlePath = new String(source.TranslateSubtitlePath);
        }
        if (source.VoiceClonedVideo != null) {
            this.VoiceClonedVideo = new String(source.VoiceClonedVideo);
        }
        if (source.VoiceClonedMarkFile != null) {
            this.VoiceClonedMarkFile = new String(source.VoiceClonedMarkFile);
        }
        if (source.VideoPath != null) {
            this.VideoPath = new String(source.VideoPath);
        }
        if (source.OriginSubtitleFileId != null) {
            this.OriginSubtitleFileId = new String(source.OriginSubtitleFileId);
        }
        if (source.TranslateSubtitleFileId != null) {
            this.TranslateSubtitleFileId = new String(source.TranslateSubtitleFileId);
        }
        if (source.SpeakerPath != null) {
            this.SpeakerPath = new String(source.SpeakerPath);
        }
        if (source.SpeakerFileId != null) {
            this.SpeakerFileId = new String(source.SpeakerFileId);
        }
        if (source.EraseVideoFileId != null) {
            this.EraseVideoFileId = new String(source.EraseVideoFileId);
        }
        if (source.EraseVideoPath != null) {
            this.EraseVideoPath = new String(source.EraseVideoPath);
        }
        if (source.DstAudioPath != null) {
            this.DstAudioPath = new String(source.DstAudioPath);
        }
        if (source.DstAudioFileId != null) {
            this.DstAudioFileId = new String(source.DstAudioFileId);
        }
        if (source.DubbingEditInfoUrl != null) {
            this.DubbingEditInfoUrl = new String(source.DubbingEditInfoUrl);
        }
        if (source.SubtitlePos != null) {
            this.SubtitlePos = new SubtitlePosition(source.SubtitlePos);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OriginSubtitlePath", this.OriginSubtitlePath);
        this.setParamSimple(map, prefix + "TranslateSubtitlePath", this.TranslateSubtitlePath);
        this.setParamSimple(map, prefix + "VoiceClonedVideo", this.VoiceClonedVideo);
        this.setParamSimple(map, prefix + "VoiceClonedMarkFile", this.VoiceClonedMarkFile);
        this.setParamSimple(map, prefix + "VideoPath", this.VideoPath);
        this.setParamSimple(map, prefix + "OriginSubtitleFileId", this.OriginSubtitleFileId);
        this.setParamSimple(map, prefix + "TranslateSubtitleFileId", this.TranslateSubtitleFileId);
        this.setParamSimple(map, prefix + "SpeakerPath", this.SpeakerPath);
        this.setParamSimple(map, prefix + "SpeakerFileId", this.SpeakerFileId);
        this.setParamSimple(map, prefix + "EraseVideoFileId", this.EraseVideoFileId);
        this.setParamSimple(map, prefix + "EraseVideoPath", this.EraseVideoPath);
        this.setParamSimple(map, prefix + "DstAudioPath", this.DstAudioPath);
        this.setParamSimple(map, prefix + "DstAudioFileId", this.DstAudioFileId);
        this.setParamSimple(map, prefix + "DubbingEditInfoUrl", this.DubbingEditInfoUrl);
        this.setParamObj(map, prefix + "SubtitlePos.", this.SubtitlePos);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);

    }
}

