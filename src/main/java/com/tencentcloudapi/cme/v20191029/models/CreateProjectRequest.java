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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProjectRequest extends AbstractModel{

    /**
    * 平台 Id，指定访问的平台。平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目名称，不可超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目归属者，即项目的所有者，后续操作只有该所有者有权限操作。

注：目前所有项目只能设置归属个人，暂不支持团队项目。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

    /**
    * 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式，即普通视频编辑项目。</li>
<li>VideoEditTemplate：剪辑模板制作模式，用于制作剪辑模板。</li>

注：不填则为默认模式。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 画布宽高比。
该字段已经废弃，请使用具体项目输入中的 AspectRatio 字段。
    */
    @SerializedName("AspectRatio")
    @Expose
    private String AspectRatio;

    /**
    * 项目描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 导播台项目输入信息，仅当项目类型为 SWITCHER 时必填。
    */
    @SerializedName("SwitcherProjectInput")
    @Expose
    private SwitcherProjectInput SwitcherProjectInput;

    /**
    * 直播剪辑项目输入信息，暂未开放，请勿使用。
    */
    @SerializedName("LiveStreamClipProjectInput")
    @Expose
    private LiveStreamClipProjectInput LiveStreamClipProjectInput;

    /**
    * 视频编辑项目输入信息，仅当项目类型为 VIDEO_EDIT 时必填。
    */
    @SerializedName("VideoEditProjectInput")
    @Expose
    private VideoEditProjectInput VideoEditProjectInput;

    /**
    * 视频拆条项目输入信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
    */
    @SerializedName("VideoSegmentationProjectInput")
    @Expose
    private VideoSegmentationProjectInput VideoSegmentationProjectInput;

    /**
    * 云转推项目输入信息，仅当项目类型为 STREAM_CONNECT 时必填。
    */
    @SerializedName("StreamConnectProjectInput")
    @Expose
    private StreamConnectProjectInput StreamConnectProjectInput;

    /**
    * 录制回放项目输入信息，仅当项目类型为 RECORD_REPLAY 时必填。
    */
    @SerializedName("RecordReplayProjectInput")
    @Expose
    private RecordReplayProjectInput RecordReplayProjectInput;

    /**
     * Get 平台 Id，指定访问的平台。平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。 
     * @return Platform 平台 Id，指定访问的平台。平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台 Id，指定访问的平台。平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     * @param Platform 平台 Id，指定访问的平台。平台概念，请参见文档 [平台](https://cloud.tencent.com/document/product/1156/43767)。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目名称，不可超过30个字符。 
     * @return Name 项目名称，不可超过30个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名称，不可超过30个字符。
     * @param Name 项目名称，不可超过30个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 项目归属者，即项目的所有者，后续操作只有该所有者有权限操作。

注：目前所有项目只能设置归属个人，暂不支持团队项目。 
     * @return Owner 项目归属者，即项目的所有者，后续操作只有该所有者有权限操作。

注：目前所有项目只能设置归属个人，暂不支持团队项目。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 项目归属者，即项目的所有者，后续操作只有该所有者有权限操作。

注：目前所有项目只能设置归属个人，暂不支持团队项目。
     * @param Owner 项目归属者，即项目的所有者，后续操作只有该所有者有权限操作。

注：目前所有项目只能设置归属个人，暂不支持团队项目。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li> 
     * @return Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     * @param Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
<li>RECORD_REPLAY：录制回放。</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式，即普通视频编辑项目。</li>
<li>VideoEditTemplate：剪辑模板制作模式，用于制作剪辑模板。</li>

注：不填则为默认模式。 
     * @return Mode 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式，即普通视频编辑项目。</li>
<li>VideoEditTemplate：剪辑模板制作模式，用于制作剪辑模板。</li>

注：不填则为默认模式。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式，即普通视频编辑项目。</li>
<li>VideoEditTemplate：剪辑模板制作模式，用于制作剪辑模板。</li>

注：不填则为默认模式。
     * @param Mode 项目模式，一个项目可以有多种模式并相互切换。
当 Category 为 VIDEO_EDIT 时，可选模式有：
<li>Default：默认模式，即普通视频编辑项目。</li>
<li>VideoEditTemplate：剪辑模板制作模式，用于制作剪辑模板。</li>

注：不填则为默认模式。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 画布宽高比。
该字段已经废弃，请使用具体项目输入中的 AspectRatio 字段。 
     * @return AspectRatio 画布宽高比。
该字段已经废弃，请使用具体项目输入中的 AspectRatio 字段。
     */
    public String getAspectRatio() {
        return this.AspectRatio;
    }

    /**
     * Set 画布宽高比。
该字段已经废弃，请使用具体项目输入中的 AspectRatio 字段。
     * @param AspectRatio 画布宽高比。
该字段已经废弃，请使用具体项目输入中的 AspectRatio 字段。
     */
    public void setAspectRatio(String AspectRatio) {
        this.AspectRatio = AspectRatio;
    }

    /**
     * Get 项目描述信息。 
     * @return Description 项目描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 项目描述信息。
     * @param Description 项目描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 导播台项目输入信息，仅当项目类型为 SWITCHER 时必填。 
     * @return SwitcherProjectInput 导播台项目输入信息，仅当项目类型为 SWITCHER 时必填。
     */
    public SwitcherProjectInput getSwitcherProjectInput() {
        return this.SwitcherProjectInput;
    }

    /**
     * Set 导播台项目输入信息，仅当项目类型为 SWITCHER 时必填。
     * @param SwitcherProjectInput 导播台项目输入信息，仅当项目类型为 SWITCHER 时必填。
     */
    public void setSwitcherProjectInput(SwitcherProjectInput SwitcherProjectInput) {
        this.SwitcherProjectInput = SwitcherProjectInput;
    }

    /**
     * Get 直播剪辑项目输入信息，暂未开放，请勿使用。 
     * @return LiveStreamClipProjectInput 直播剪辑项目输入信息，暂未开放，请勿使用。
     */
    public LiveStreamClipProjectInput getLiveStreamClipProjectInput() {
        return this.LiveStreamClipProjectInput;
    }

    /**
     * Set 直播剪辑项目输入信息，暂未开放，请勿使用。
     * @param LiveStreamClipProjectInput 直播剪辑项目输入信息，暂未开放，请勿使用。
     */
    public void setLiveStreamClipProjectInput(LiveStreamClipProjectInput LiveStreamClipProjectInput) {
        this.LiveStreamClipProjectInput = LiveStreamClipProjectInput;
    }

    /**
     * Get 视频编辑项目输入信息，仅当项目类型为 VIDEO_EDIT 时必填。 
     * @return VideoEditProjectInput 视频编辑项目输入信息，仅当项目类型为 VIDEO_EDIT 时必填。
     */
    public VideoEditProjectInput getVideoEditProjectInput() {
        return this.VideoEditProjectInput;
    }

    /**
     * Set 视频编辑项目输入信息，仅当项目类型为 VIDEO_EDIT 时必填。
     * @param VideoEditProjectInput 视频编辑项目输入信息，仅当项目类型为 VIDEO_EDIT 时必填。
     */
    public void setVideoEditProjectInput(VideoEditProjectInput VideoEditProjectInput) {
        this.VideoEditProjectInput = VideoEditProjectInput;
    }

    /**
     * Get 视频拆条项目输入信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。 
     * @return VideoSegmentationProjectInput 视频拆条项目输入信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
     */
    public VideoSegmentationProjectInput getVideoSegmentationProjectInput() {
        return this.VideoSegmentationProjectInput;
    }

    /**
     * Set 视频拆条项目输入信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
     * @param VideoSegmentationProjectInput 视频拆条项目输入信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
     */
    public void setVideoSegmentationProjectInput(VideoSegmentationProjectInput VideoSegmentationProjectInput) {
        this.VideoSegmentationProjectInput = VideoSegmentationProjectInput;
    }

    /**
     * Get 云转推项目输入信息，仅当项目类型为 STREAM_CONNECT 时必填。 
     * @return StreamConnectProjectInput 云转推项目输入信息，仅当项目类型为 STREAM_CONNECT 时必填。
     */
    public StreamConnectProjectInput getStreamConnectProjectInput() {
        return this.StreamConnectProjectInput;
    }

    /**
     * Set 云转推项目输入信息，仅当项目类型为 STREAM_CONNECT 时必填。
     * @param StreamConnectProjectInput 云转推项目输入信息，仅当项目类型为 STREAM_CONNECT 时必填。
     */
    public void setStreamConnectProjectInput(StreamConnectProjectInput StreamConnectProjectInput) {
        this.StreamConnectProjectInput = StreamConnectProjectInput;
    }

    /**
     * Get 录制回放项目输入信息，仅当项目类型为 RECORD_REPLAY 时必填。 
     * @return RecordReplayProjectInput 录制回放项目输入信息，仅当项目类型为 RECORD_REPLAY 时必填。
     */
    public RecordReplayProjectInput getRecordReplayProjectInput() {
        return this.RecordReplayProjectInput;
    }

    /**
     * Set 录制回放项目输入信息，仅当项目类型为 RECORD_REPLAY 时必填。
     * @param RecordReplayProjectInput 录制回放项目输入信息，仅当项目类型为 RECORD_REPLAY 时必填。
     */
    public void setRecordReplayProjectInput(RecordReplayProjectInput RecordReplayProjectInput) {
        this.RecordReplayProjectInput = RecordReplayProjectInput;
    }

    public CreateProjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateProjectRequest(CreateProjectRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Owner != null) {
            this.Owner = new Entity(source.Owner);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.AspectRatio != null) {
            this.AspectRatio = new String(source.AspectRatio);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SwitcherProjectInput != null) {
            this.SwitcherProjectInput = new SwitcherProjectInput(source.SwitcherProjectInput);
        }
        if (source.LiveStreamClipProjectInput != null) {
            this.LiveStreamClipProjectInput = new LiveStreamClipProjectInput(source.LiveStreamClipProjectInput);
        }
        if (source.VideoEditProjectInput != null) {
            this.VideoEditProjectInput = new VideoEditProjectInput(source.VideoEditProjectInput);
        }
        if (source.VideoSegmentationProjectInput != null) {
            this.VideoSegmentationProjectInput = new VideoSegmentationProjectInput(source.VideoSegmentationProjectInput);
        }
        if (source.StreamConnectProjectInput != null) {
            this.StreamConnectProjectInput = new StreamConnectProjectInput(source.StreamConnectProjectInput);
        }
        if (source.RecordReplayProjectInput != null) {
            this.RecordReplayProjectInput = new RecordReplayProjectInput(source.RecordReplayProjectInput);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "SwitcherProjectInput.", this.SwitcherProjectInput);
        this.setParamObj(map, prefix + "LiveStreamClipProjectInput.", this.LiveStreamClipProjectInput);
        this.setParamObj(map, prefix + "VideoEditProjectInput.", this.VideoEditProjectInput);
        this.setParamObj(map, prefix + "VideoSegmentationProjectInput.", this.VideoSegmentationProjectInput);
        this.setParamObj(map, prefix + "StreamConnectProjectInput.", this.StreamConnectProjectInput);
        this.setParamObj(map, prefix + "RecordReplayProjectInput.", this.RecordReplayProjectInput);

    }
}

