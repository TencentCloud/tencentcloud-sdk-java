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
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 项目名称，不可超过30个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 项目归属者。
    */
    @SerializedName("Owner")
    @Expose
    private Entity Owner;

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
    * 导播台信息，仅当项目类型为 SWITCHER 时必填。
    */
    @SerializedName("SwitcherProjectInput")
    @Expose
    private SwitcherProjectInput SwitcherProjectInput;

    /**
    * 直播剪辑信息，暂未开放，请勿使用。
    */
    @SerializedName("LiveStreamClipProjectInput")
    @Expose
    private LiveStreamClipProjectInput LiveStreamClipProjectInput;

    /**
    * 视频编辑信息，仅当项目类型为 VIDEO_EDIT 时必填。
    */
    @SerializedName("VideoEditProjectInput")
    @Expose
    private VideoEditProjectInput VideoEditProjectInput;

    /**
    * 视频拆条信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
    */
    @SerializedName("VideoSegmentationProjectInput")
    @Expose
    private VideoSegmentationProjectInput VideoSegmentationProjectInput;

    /**
    * 云转推项目信息，仅当项目类型为 STREAM_CONNECT 时必填。
    */
    @SerializedName("StreamConnectProjectInput")
    @Expose
    private StreamConnectProjectInput StreamConnectProjectInput;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li> 
     * @return Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
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
     * @param Category 项目类别，取值有：
<li>VIDEO_EDIT：视频编辑。</li>
<li>SWITCHER：导播台。</li>
<li>VIDEO_SEGMENTATION：视频拆条。</li>
<li>STREAM_CONNECT：云转推。</li>
     */
    public void setCategory(String Category) {
        this.Category = Category;
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
     * Get 项目归属者。 
     * @return Owner 项目归属者。
     */
    public Entity getOwner() {
        return this.Owner;
    }

    /**
     * Set 项目归属者。
     * @param Owner 项目归属者。
     */
    public void setOwner(Entity Owner) {
        this.Owner = Owner;
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
     * Get 导播台信息，仅当项目类型为 SWITCHER 时必填。 
     * @return SwitcherProjectInput 导播台信息，仅当项目类型为 SWITCHER 时必填。
     */
    public SwitcherProjectInput getSwitcherProjectInput() {
        return this.SwitcherProjectInput;
    }

    /**
     * Set 导播台信息，仅当项目类型为 SWITCHER 时必填。
     * @param SwitcherProjectInput 导播台信息，仅当项目类型为 SWITCHER 时必填。
     */
    public void setSwitcherProjectInput(SwitcherProjectInput SwitcherProjectInput) {
        this.SwitcherProjectInput = SwitcherProjectInput;
    }

    /**
     * Get 直播剪辑信息，暂未开放，请勿使用。 
     * @return LiveStreamClipProjectInput 直播剪辑信息，暂未开放，请勿使用。
     */
    public LiveStreamClipProjectInput getLiveStreamClipProjectInput() {
        return this.LiveStreamClipProjectInput;
    }

    /**
     * Set 直播剪辑信息，暂未开放，请勿使用。
     * @param LiveStreamClipProjectInput 直播剪辑信息，暂未开放，请勿使用。
     */
    public void setLiveStreamClipProjectInput(LiveStreamClipProjectInput LiveStreamClipProjectInput) {
        this.LiveStreamClipProjectInput = LiveStreamClipProjectInput;
    }

    /**
     * Get 视频编辑信息，仅当项目类型为 VIDEO_EDIT 时必填。 
     * @return VideoEditProjectInput 视频编辑信息，仅当项目类型为 VIDEO_EDIT 时必填。
     */
    public VideoEditProjectInput getVideoEditProjectInput() {
        return this.VideoEditProjectInput;
    }

    /**
     * Set 视频编辑信息，仅当项目类型为 VIDEO_EDIT 时必填。
     * @param VideoEditProjectInput 视频编辑信息，仅当项目类型为 VIDEO_EDIT 时必填。
     */
    public void setVideoEditProjectInput(VideoEditProjectInput VideoEditProjectInput) {
        this.VideoEditProjectInput = VideoEditProjectInput;
    }

    /**
     * Get 视频拆条信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。 
     * @return VideoSegmentationProjectInput 视频拆条信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
     */
    public VideoSegmentationProjectInput getVideoSegmentationProjectInput() {
        return this.VideoSegmentationProjectInput;
    }

    /**
     * Set 视频拆条信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
     * @param VideoSegmentationProjectInput 视频拆条信息，仅当项目类型为 VIDEO_SEGMENTATION  时必填。
     */
    public void setVideoSegmentationProjectInput(VideoSegmentationProjectInput VideoSegmentationProjectInput) {
        this.VideoSegmentationProjectInput = VideoSegmentationProjectInput;
    }

    /**
     * Get 云转推项目信息，仅当项目类型为 STREAM_CONNECT 时必填。 
     * @return StreamConnectProjectInput 云转推项目信息，仅当项目类型为 STREAM_CONNECT 时必填。
     */
    public StreamConnectProjectInput getStreamConnectProjectInput() {
        return this.StreamConnectProjectInput;
    }

    /**
     * Set 云转推项目信息，仅当项目类型为 STREAM_CONNECT 时必填。
     * @param StreamConnectProjectInput 云转推项目信息，仅当项目类型为 STREAM_CONNECT 时必填。
     */
    public void setStreamConnectProjectInput(StreamConnectProjectInput StreamConnectProjectInput) {
        this.StreamConnectProjectInput = StreamConnectProjectInput;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Owner.", this.Owner);
        this.setParamSimple(map, prefix + "AspectRatio", this.AspectRatio);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "SwitcherProjectInput.", this.SwitcherProjectInput);
        this.setParamObj(map, prefix + "LiveStreamClipProjectInput.", this.LiveStreamClipProjectInput);
        this.setParamObj(map, prefix + "VideoEditProjectInput.", this.VideoEditProjectInput);
        this.setParamObj(map, prefix + "VideoSegmentationProjectInput.", this.VideoSegmentationProjectInput);
        this.setParamObj(map, prefix + "StreamConnectProjectInput.", this.StreamConnectProjectInput);

    }
}

