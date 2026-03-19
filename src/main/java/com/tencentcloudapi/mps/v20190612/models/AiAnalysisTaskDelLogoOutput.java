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

public class AiAnalysisTaskDelLogoOutput extends AbstractModel {

    /**
    * <p>擦除后文件的路径。</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>擦除后文件的存储位置。</p>
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

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
    * <p>擦除的字幕位置。<strong>注意</strong>：仅对字幕提取且开启返回字幕位置时有效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitlePos")
    @Expose
    private SubtitlePosition SubtitlePos;

    /**
    * <p>音色克隆后的视频文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceClonedVideo")
    @Expose
    private String VoiceClonedVideo;

    /**
    * <p>音色克隆的标注文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceClonedMarkFile")
    @Expose
    private String VoiceClonedMarkFile;

    /**
     * Get <p>擦除后文件的路径。</p> 
     * @return Path <p>擦除后文件的路径。</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>擦除后文件的路径。</p>
     * @param Path <p>擦除后文件的路径。</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>擦除后文件的存储位置。</p> 
     * @return OutputStorage <p>擦除后文件的存储位置。</p>
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>擦除后文件的存储位置。</p>
     * @param OutputStorage <p>擦除后文件的存储位置。</p>
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

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
     * Get <p>音色克隆后的视频文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceClonedVideo <p>音色克隆后的视频文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoiceClonedVideo() {
        return this.VoiceClonedVideo;
    }

    /**
     * Set <p>音色克隆后的视频文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceClonedVideo <p>音色克隆后的视频文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceClonedVideo(String VoiceClonedVideo) {
        this.VoiceClonedVideo = VoiceClonedVideo;
    }

    /**
     * Get <p>音色克隆的标注文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceClonedMarkFile <p>音色克隆的标注文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoiceClonedMarkFile() {
        return this.VoiceClonedMarkFile;
    }

    /**
     * Set <p>音色克隆的标注文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceClonedMarkFile <p>音色克隆的标注文件地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceClonedMarkFile(String VoiceClonedMarkFile) {
        this.VoiceClonedMarkFile = VoiceClonedMarkFile;
    }

    public AiAnalysisTaskDelLogoOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiAnalysisTaskDelLogoOutput(AiAnalysisTaskDelLogoOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OriginSubtitlePath != null) {
            this.OriginSubtitlePath = new String(source.OriginSubtitlePath);
        }
        if (source.TranslateSubtitlePath != null) {
            this.TranslateSubtitlePath = new String(source.TranslateSubtitlePath);
        }
        if (source.SubtitlePos != null) {
            this.SubtitlePos = new SubtitlePosition(source.SubtitlePos);
        }
        if (source.VoiceClonedVideo != null) {
            this.VoiceClonedVideo = new String(source.VoiceClonedVideo);
        }
        if (source.VoiceClonedMarkFile != null) {
            this.VoiceClonedMarkFile = new String(source.VoiceClonedMarkFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OriginSubtitlePath", this.OriginSubtitlePath);
        this.setParamSimple(map, prefix + "TranslateSubtitlePath", this.TranslateSubtitlePath);
        this.setParamObj(map, prefix + "SubtitlePos.", this.SubtitlePos);
        this.setParamSimple(map, prefix + "VoiceClonedVideo", this.VoiceClonedVideo);
        this.setParamSimple(map, prefix + "VoiceClonedMarkFile", this.VoiceClonedMarkFile);

    }
}

