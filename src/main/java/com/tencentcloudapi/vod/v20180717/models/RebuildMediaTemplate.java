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

public class RebuildMediaTemplate extends AbstractModel{

    /**
    * 音画质重生模板号。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 音画质重生模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 音画质重生模板描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 音画质重生视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebuildVideoInfo")
    @Expose
    private RebuildVideoInfo RebuildVideoInfo;

    /**
    * 音画质重生音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RebuildAudioInfo")
    @Expose
    private RebuildAudioInfo RebuildAudioInfo;

    /**
    * 输出视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetVideoInfo")
    @Expose
    private RebuildMediaTargetVideoStream TargetVideoInfo;

    /**
    * 输出音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetAudioInfo")
    @Expose
    private RebuildMediaTargetAudioStream TargetAudioInfo;

    /**
    * 封装格式。可选值：mp4、hls。默认是 mp4。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

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
     * Get 音画质重生模板号。 
     * @return Definition 音画质重生模板号。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 音画质重生模板号。
     * @param Definition 音画质重生模板号。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li> 
     * @return Type 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     * @param Type 模板类型，可选值：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 音画质重生模板名称。 
     * @return Name 音画质重生模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 音画质重生模板名称。
     * @param Name 音画质重生模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 音画质重生模板描述。 
     * @return Comment 音画质重生模板描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 音画质重生模板描述。
     * @param Comment 音画质重生模板描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 音画质重生视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebuildVideoInfo 音画质重生视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildVideoInfo getRebuildVideoInfo() {
        return this.RebuildVideoInfo;
    }

    /**
     * Set 音画质重生视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebuildVideoInfo 音画质重生视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebuildVideoInfo(RebuildVideoInfo RebuildVideoInfo) {
        this.RebuildVideoInfo = RebuildVideoInfo;
    }

    /**
     * Get 音画质重生音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RebuildAudioInfo 音画质重生音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildAudioInfo getRebuildAudioInfo() {
        return this.RebuildAudioInfo;
    }

    /**
     * Set 音画质重生音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RebuildAudioInfo 音画质重生音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRebuildAudioInfo(RebuildAudioInfo RebuildAudioInfo) {
        this.RebuildAudioInfo = RebuildAudioInfo;
    }

    /**
     * Get 输出视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetVideoInfo 输出视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildMediaTargetVideoStream getTargetVideoInfo() {
        return this.TargetVideoInfo;
    }

    /**
     * Set 输出视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetVideoInfo 输出视频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetVideoInfo(RebuildMediaTargetVideoStream TargetVideoInfo) {
        this.TargetVideoInfo = TargetVideoInfo;
    }

    /**
     * Get 输出音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetAudioInfo 输出音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RebuildMediaTargetAudioStream getTargetAudioInfo() {
        return this.TargetAudioInfo;
    }

    /**
     * Set 输出音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetAudioInfo 输出音频控制信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetAudioInfo(RebuildMediaTargetAudioStream TargetAudioInfo) {
        this.TargetAudioInfo = TargetAudioInfo;
    }

    /**
     * Get 封装格式。可选值：mp4、hls。默认是 mp4。 
     * @return Container 封装格式。可选值：mp4、hls。默认是 mp4。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式。可选值：mp4、hls。默认是 mp4。
     * @param Container 封装格式。可选值：mp4、hls。默认是 mp4。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。 
     * @return RemoveVideo 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
     * @param RemoveVideo 是否去除视频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。 
     * @return RemoveAudio 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
     * @param RemoveAudio 是否去除音频数据，可选值：
<li>0：保留</li>
<li>1：去除</li>
默认值 0。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
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

    public RebuildMediaTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTemplate(RebuildMediaTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.RebuildVideoInfo != null) {
            this.RebuildVideoInfo = new RebuildVideoInfo(source.RebuildVideoInfo);
        }
        if (source.RebuildAudioInfo != null) {
            this.RebuildAudioInfo = new RebuildAudioInfo(source.RebuildAudioInfo);
        }
        if (source.TargetVideoInfo != null) {
            this.TargetVideoInfo = new RebuildMediaTargetVideoStream(source.TargetVideoInfo);
        }
        if (source.TargetAudioInfo != null) {
            this.TargetAudioInfo = new RebuildMediaTargetAudioStream(source.TargetAudioInfo);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "RebuildVideoInfo.", this.RebuildVideoInfo);
        this.setParamObj(map, prefix + "RebuildAudioInfo.", this.RebuildAudioInfo);
        this.setParamObj(map, prefix + "TargetVideoInfo.", this.TargetVideoInfo);
        this.setParamObj(map, prefix + "TargetAudioInfo.", this.TargetAudioInfo);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

