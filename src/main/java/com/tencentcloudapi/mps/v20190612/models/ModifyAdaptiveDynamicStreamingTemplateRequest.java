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

public class ModifyAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * 转自适应码流模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * 转自适应码流输入流参数信息，最多输入10路流。
注意：
1、各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
2、修改子流信息时需要全量修改添加所有字段值，否则没填字段会使用默认值。
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 是否为纯音频，0表示视频模板，1表示纯音频模板
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy
当值为0：
1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
注意：
此值只是区分模板类型，任务使用RemoveAudio和RemoveVideo的值
    */
    @SerializedName("PureAudio")
    @Expose
    private Long PureAudio;

    /**
    * 分片类型，可选值： <li>ts-segment：HLS+TS 切片</li> <li>ts-byterange：HLS+TS byte range</li> <li>mp4-segment：HLS+MP4 切片</li> <li>mp4-byterange：HLS/DASH+MP4 byte range</li> <li>ts-packed-audio：TS+Packed Audio</li> <li>mp4-packed-audio：MP4+Packed Audio</li> 默认值：ts-segment 
注：自适应码流的hls分片格式已此字段为准。DASH格式下SegmentType只能为mp4-byterange。
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get 转自适应码流模板唯一标识。 
     * @return Definition 转自适应码流模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转自适应码流模板唯一标识。
     * @param Definition 转自适应码流模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 模板名称，长度限制：64 个字符。 
     * @return Name 模板名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称，长度限制：64 个字符。
     * @param Name 模板名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li> 
     * @return Format 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     * @param Format 转自适应码流格式，取值范围：
<li>HLS，</li>
<li>MPEG-DASH。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li> 
     * @return DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     * @param DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li> 
     * @return DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     * @param DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get 转自适应码流输入流参数信息，最多输入10路流。
注意：
1、各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
2、修改子流信息时需要全量修改添加所有字段值，否则没填字段会使用默认值。 
     * @return StreamInfos 转自适应码流输入流参数信息，最多输入10路流。
注意：
1、各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
2、修改子流信息时需要全量修改添加所有字段值，否则没填字段会使用默认值。
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 转自适应码流输入流参数信息，最多输入10路流。
注意：
1、各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
2、修改子流信息时需要全量修改添加所有字段值，否则没填字段会使用默认值。
     * @param StreamInfos 转自适应码流输入流参数信息，最多输入10路流。
注意：
1、各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。
2、修改子流信息时需要全量修改添加所有字段值，否则没填字段会使用默认值。
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get 模板描述信息，长度限制：256 个字符。 
     * @return Comment 模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 模板描述信息，长度限制：256 个字符。
     * @param Comment 模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 是否为纯音频，0表示视频模板，1表示纯音频模板
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy
当值为0：
1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
注意：
此值只是区分模板类型，任务使用RemoveAudio和RemoveVideo的值 
     * @return PureAudio 是否为纯音频，0表示视频模板，1表示纯音频模板
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy
当值为0：
1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
注意：
此值只是区分模板类型，任务使用RemoveAudio和RemoveVideo的值
     */
    public Long getPureAudio() {
        return this.PureAudio;
    }

    /**
     * Set 是否为纯音频，0表示视频模板，1表示纯音频模板
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy
当值为0：
1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
注意：
此值只是区分模板类型，任务使用RemoveAudio和RemoveVideo的值
     * @param PureAudio 是否为纯音频，0表示视频模板，1表示纯音频模板
当值为1：
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy
当值为0：
1. StreamInfos.N.Video.Codec不能为copy
2. StreamInfos.N.Video.Fps不能为null
注意：
此值只是区分模板类型，任务使用RemoveAudio和RemoveVideo的值
     */
    public void setPureAudio(Long PureAudio) {
        this.PureAudio = PureAudio;
    }

    /**
     * Get 分片类型，可选值： <li>ts-segment：HLS+TS 切片</li> <li>ts-byterange：HLS+TS byte range</li> <li>mp4-segment：HLS+MP4 切片</li> <li>mp4-byterange：HLS/DASH+MP4 byte range</li> <li>ts-packed-audio：TS+Packed Audio</li> <li>mp4-packed-audio：MP4+Packed Audio</li> 默认值：ts-segment 
注：自适应码流的hls分片格式已此字段为准。DASH格式下SegmentType只能为mp4-byterange。 
     * @return SegmentType 分片类型，可选值： <li>ts-segment：HLS+TS 切片</li> <li>ts-byterange：HLS+TS byte range</li> <li>mp4-segment：HLS+MP4 切片</li> <li>mp4-byterange：HLS/DASH+MP4 byte range</li> <li>ts-packed-audio：TS+Packed Audio</li> <li>mp4-packed-audio：MP4+Packed Audio</li> 默认值：ts-segment 
注：自适应码流的hls分片格式已此字段为准。DASH格式下SegmentType只能为mp4-byterange。
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 分片类型，可选值： <li>ts-segment：HLS+TS 切片</li> <li>ts-byterange：HLS+TS byte range</li> <li>mp4-segment：HLS+MP4 切片</li> <li>mp4-byterange：HLS/DASH+MP4 byte range</li> <li>ts-packed-audio：TS+Packed Audio</li> <li>mp4-packed-audio：MP4+Packed Audio</li> 默认值：ts-segment 
注：自适应码流的hls分片格式已此字段为准。DASH格式下SegmentType只能为mp4-byterange。
     * @param SegmentType 分片类型，可选值： <li>ts-segment：HLS+TS 切片</li> <li>ts-byterange：HLS+TS byte range</li> <li>mp4-segment：HLS+MP4 切片</li> <li>mp4-byterange：HLS/DASH+MP4 byte range</li> <li>ts-packed-audio：TS+Packed Audio</li> <li>mp4-packed-audio：MP4+Packed Audio</li> 默认值：ts-segment 
注：自适应码流的hls分片格式已此字段为准。DASH格式下SegmentType只能为mp4-byterange。
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    public ModifyAdaptiveDynamicStreamingTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAdaptiveDynamicStreamingTemplateRequest(ModifyAdaptiveDynamicStreamingTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PureAudio != null) {
            this.PureAudio = new Long(source.PureAudio);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PureAudio", this.PureAudio);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

