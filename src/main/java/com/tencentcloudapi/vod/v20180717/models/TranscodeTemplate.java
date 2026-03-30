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

public class TranscodeTemplate extends AbstractModel {

    /**
    * <p>转码模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * <p>封装格式，取值：mp4、flv、hls、mp3、flac、ogg。</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>转码模板名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模板描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>是否去除视频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>是否去除音频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。</p>
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * <p>音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。</p>
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
    * <p>封装格式过滤条件，可选值：</p><li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li><li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>切片类型，仅当 Container 为 hls 时有效。</p>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * <p>扩展参数。</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get <p>转码模板唯一标识。</p> 
     * @return Definition <p>转码模板唯一标识。</p>
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转码模板唯一标识。</p>
     * @param Definition <p>转码模板唯一标识。</p>
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>封装格式，取值：mp4、flv、hls、mp3、flac、ogg。</p> 
     * @return Container <p>封装格式，取值：mp4、flv、hls、mp3、flac、ogg。</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>封装格式，取值：mp4、flv、hls、mp3、flac、ogg。</p>
     * @param Container <p>封装格式，取值：mp4、flv、hls、mp3、flac、ogg。</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>转码模板名称。</p> 
     * @return Name <p>转码模板名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>转码模板名称。</p>
     * @param Name <p>转码模板名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模板描述信息。</p> 
     * @return Comment <p>模板描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>模板描述信息。</p>
     * @param Comment <p>模板描述信息。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li> 
     * @return Type <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
     * @param Type <p>模板类型，取值：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否去除视频数据，取值：</p><li>0：保留；</li><li>1：去除。</li> 
     * @return RemoveVideo <p>是否去除视频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>是否去除视频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
     * @param RemoveVideo <p>是否去除视频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>是否去除音频数据，取值：</p><li>0：保留；</li><li>1：去除。</li> 
     * @return RemoveAudio <p>是否去除音频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>是否去除音频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
     * @param RemoveAudio <p>是否去除音频数据，取值：</p><li>0：保留；</li><li>1：去除。</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。</p> 
     * @return VideoTemplate <p>视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。</p>
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set <p>视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。</p>
     * @param VideoTemplate <p>视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。</p>
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get <p>音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。</p> 
     * @return AudioTemplate <p>音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。</p>
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set <p>音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。</p>
     * @param AudioTemplate <p>音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。</p>
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TEHDConfig <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TEHDConfig <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnhanceConfig <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnhanceConfig <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>封装格式过滤条件，可选值：</p><li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li><li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li> 
     * @return ContainerType <p>封装格式过滤条件，可选值：</p><li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li><li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set <p>封装格式过滤条件，可选值：</p><li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li><li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
     * @param ContainerType <p>封装格式过滤条件，可选值：</p><li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li><li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param CreateTime <p>模板创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param UpdateTime <p>模板最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>切片类型，仅当 Container 为 hls 时有效。</p> 
     * @return SegmentType <p>切片类型，仅当 Container 为 hls 时有效。</p>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>切片类型，仅当 Container 为 hls 时有效。</p>
     * @param SegmentType <p>切片类型，仅当 Container 为 hls 时有效。</p>
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get <p>扩展参数。</p> 
     * @return StdExtInfo <p>扩展参数。</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>扩展参数。</p>
     * @param StdExtInfo <p>扩展参数。</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    public TranscodeTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTemplate(TranscodeTemplate source) {
        if (source.Definition != null) {
            this.Definition = new String(source.Definition);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoTemplate != null) {
            this.VideoTemplate = new VideoTemplateInfo(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfo(source.AudioTemplate);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new TEHDConfig(source.TEHDConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new EnhanceConfig(source.EnhanceConfig);
        }
        if (source.ContainerType != null) {
            this.ContainerType = new String(source.ContainerType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}

