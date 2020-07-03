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

public class TranscodeTemplate extends AbstractModel{

    /**
    * 转码模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private String Definition;

    /**
    * 封装格式，取值：mp4、flv、hls、mp3、flac、ogg。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 转码模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 模板类型，取值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * 音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * 封装格式过滤条件，可选值：
<li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li>
<li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
    */
    @SerializedName("ContainerType")
    @Expose
    private String ContainerType;

    /**
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 转码模板唯一标识。 
     * @return Definition 转码模板唯一标识。
     */
    public String getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转码模板唯一标识。
     * @param Definition 转码模板唯一标识。
     */
    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 封装格式，取值：mp4、flv、hls、mp3、flac、ogg。 
     * @return Container 封装格式，取值：mp4、flv、hls、mp3、flac、ogg。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式，取值：mp4、flv、hls、mp3、flac、ogg。
     * @param Container 封装格式，取值：mp4、flv、hls、mp3、flac、ogg。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 转码模板名称。 
     * @return Name 转码模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 转码模板名称。
     * @param Name 转码模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板描述信息。 
     * @return Comment 模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息。
     * @param Comment 模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 模板类型，取值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li> 
     * @return Type 模板类型，取值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     * @param Type 模板类型，取值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li> 
     * @return RemoveVideo 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     * @param RemoveVideo 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li> 
     * @return RemoveAudio 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     * @param RemoveAudio 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoTemplate 视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoTemplate 视频流配置参数，仅当 RemoveVideo 为 0，该字段有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get 音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioTemplate 音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioTemplate 音频流配置参数，仅当 RemoveAudio 为 0，该字段有效 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TEHDConfig 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TEHDConfig 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get 封装格式过滤条件，可选值：
<li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li>
<li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li> 
     * @return ContainerType 封装格式过滤条件，可选值：
<li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li>
<li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
     */
    public String getContainerType() {
        return this.ContainerType;
    }

    /**
     * Set 封装格式过滤条件，可选值：
<li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li>
<li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
     * @param ContainerType 封装格式过滤条件，可选值：
<li>Video：视频格式，可以同时包含视频流和音频流的封装格式；</li>
<li>PureAudio：纯音频格式，只能包含音频流的封装格式板。</li>
     */
    public void setContainerType(String ContainerType) {
        this.ContainerType = ContainerType;
    }

    /**
     * Get 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。 
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
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
        this.setParamSimple(map, prefix + "ContainerType", this.ContainerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

