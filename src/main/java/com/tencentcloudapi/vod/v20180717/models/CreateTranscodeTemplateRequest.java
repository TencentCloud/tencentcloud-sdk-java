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

public class CreateTranscodeTemplateRequest extends AbstractModel {

    /**
    * <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>转码模板名称，长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>模板描述信息，长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>是否去除视频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>是否去除音频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>视频流配置参数，当 RemoveVideo 为 0，该字段必填。</p>
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * <p>音频流配置参数，当 RemoveAudio 为 0，该字段必填。</p>
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * <p>极速高清转码参数。</p>
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * <p>音视频增强配置。</p>
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
    * <p>切片类型，当 Container 为 hls 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
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
     * Get <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p> 
     * @return Container <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
     * @param Container <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>转码模板名称，长度限制：64 个字符。</p> 
     * @return Name <p>转码模板名称，长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>转码模板名称，长度限制：64 个字符。</p>
     * @param Name <p>转码模板名称，长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>模板描述信息，长度限制：256 个字符。</p> 
     * @return Comment <p>模板描述信息，长度限制：256 个字符。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>模板描述信息，长度限制：256 个字符。</p>
     * @param Comment <p>模板描述信息，长度限制：256 个字符。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>是否去除视频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。 
     * @return RemoveVideo <p>是否去除视频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>是否去除视频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
     * @param RemoveVideo <p>是否去除视频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>是否去除音频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。 
     * @return RemoveAudio <p>是否去除音频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>是否去除音频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
     * @param RemoveAudio <p>是否去除音频数据，可选值：</p><li>0：保留</li><li>1：去除</li>默认值：0。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>视频流配置参数，当 RemoveVideo 为 0，该字段必填。</p> 
     * @return VideoTemplate <p>视频流配置参数，当 RemoveVideo 为 0，该字段必填。</p>
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set <p>视频流配置参数，当 RemoveVideo 为 0，该字段必填。</p>
     * @param VideoTemplate <p>视频流配置参数，当 RemoveVideo 为 0，该字段必填。</p>
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get <p>音频流配置参数，当 RemoveAudio 为 0，该字段必填。</p> 
     * @return AudioTemplate <p>音频流配置参数，当 RemoveAudio 为 0，该字段必填。</p>
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set <p>音频流配置参数，当 RemoveAudio 为 0，该字段必填。</p>
     * @param AudioTemplate <p>音频流配置参数，当 RemoveAudio 为 0，该字段必填。</p>
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get <p>极速高清转码参数。</p> 
     * @return TEHDConfig <p>极速高清转码参数。</p>
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set <p>极速高清转码参数。</p>
     * @param TEHDConfig <p>极速高清转码参数。</p>
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get <p>音视频增强配置。</p> 
     * @return EnhanceConfig <p>音视频增强配置。</p>
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>音视频增强配置。</p>
     * @param EnhanceConfig <p>音视频增强配置。</p>
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>切片类型，当 Container 为 hls 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。 
     * @return SegmentType <p>切片类型，当 Container 为 hls 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>切片类型，当 Container 为 hls 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
     * @param SegmentType <p>切片类型，当 Container 为 hls 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
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

    public CreateTranscodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTranscodeTemplateRequest(CreateTranscodeTemplateRequest source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}

