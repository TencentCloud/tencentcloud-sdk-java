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

public class ModifyAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * <p>自适应转码模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p><b>点播<a href="/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>模板名称，长度限制：64 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自适应转码格式，取值范围：</p><li>HLS；</li><li>MPEG-DASH。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * <p>自适应转码输入流参数信息，最多输入10路流。<br>注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。</p>
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * <p>模板描述信息，长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>分片类型，可选值：<br>ts: HLS，内部映射为ts-segment</p><p>mp4: HLS/DASH，HLS情况下内部映射为mp4-mp4-segment，DASH情况下内部映射为mp4-mp4-byterange</p><p>ts-segment：HLS+TS 切片</p><p>ts-byterange：HLS+TS byte range</p><p>mp4-segment：HLS+MP4 切片</p><p>mp4-byterange：HLS+MP4 byte range</p><p>ts-packed-audio：HLS+TS+Packed Audio 切片</p><p>mp4-packed-audio：HLS+MP4+Packed Audio 切片</p><p>ts-ts-segment：HLS+TS+TS 切片</p><p>ts-ts-byterange：HLS+TS+TS byte range</p><p>mp4-mp4-segment：HLS+MP4+MP4 切片</p><p>mp4-mp4-byterange：HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange：HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange：HLS+MP4+Packed Audio byte range<br> 默认值：ts-segment 注：自适应码流的分片格式以此字段为准。DASH格式下SegmentType只能为mp4-mp4-byterange。</p><p>FairPlay：只能用于HLS，切片格式只能是mp4或mp4-mp4-segment Widevine：可以用于HLS和DASH，HLS下切片格式只能是mp4或mp4-mp4-segment，DASH下切片格式只能是mp4或mp4-mp4-byterange Widevine+FairPlay: 只能用于HLS，切片格式只能是mp4或mp4-mp4-segment</p>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * <p>切片平均时长。</p><p>取值范围：[1, 10]</p><p>单位：秒</p>
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
     * Get <p>自适应转码模板唯一标识。</p> 
     * @return Definition <p>自适应转码模板唯一标识。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>自适应转码模板唯一标识。</p>
     * @param Definition <p>自适应转码模板唯一标识。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
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
     * Get <p>模板名称，长度限制：64 个字符。</p> 
     * @return Name <p>模板名称，长度限制：64 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称，长度限制：64 个字符。</p>
     * @param Name <p>模板名称，长度限制：64 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自适应转码格式，取值范围：</p><li>HLS；</li><li>MPEG-DASH。</li> 
     * @return Format <p>自适应转码格式，取值范围：</p><li>HLS；</li><li>MPEG-DASH。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>自适应转码格式，取值范围：</p><li>HLS；</li><li>MPEG-DASH。</li>
     * @param Format <p>自适应转码格式，取值范围：</p><li>HLS；</li><li>MPEG-DASH。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li> 
     * @return DisableHigherVideoBitrate <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>
     * @param DisableHigherVideoBitrate <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li> 
     * @return DisableHigherVideoResolution <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>
     * @param DisableHigherVideoResolution <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get <p>自适应转码输入流参数信息，最多输入10路流。<br>注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。</p> 
     * @return StreamInfos <p>自适应转码输入流参数信息，最多输入10路流。<br>注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。</p>
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set <p>自适应转码输入流参数信息，最多输入10路流。<br>注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。</p>
     * @param StreamInfos <p>自适应转码输入流参数信息，最多输入10路流。<br>注意：各个流的帧率必须保持一致；如果不一致，采用第一个流的帧率作为输出帧率。</p>
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
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
     * Get <p>分片类型，可选值：<br>ts: HLS，内部映射为ts-segment</p><p>mp4: HLS/DASH，HLS情况下内部映射为mp4-mp4-segment，DASH情况下内部映射为mp4-mp4-byterange</p><p>ts-segment：HLS+TS 切片</p><p>ts-byterange：HLS+TS byte range</p><p>mp4-segment：HLS+MP4 切片</p><p>mp4-byterange：HLS+MP4 byte range</p><p>ts-packed-audio：HLS+TS+Packed Audio 切片</p><p>mp4-packed-audio：HLS+MP4+Packed Audio 切片</p><p>ts-ts-segment：HLS+TS+TS 切片</p><p>ts-ts-byterange：HLS+TS+TS byte range</p><p>mp4-mp4-segment：HLS+MP4+MP4 切片</p><p>mp4-mp4-byterange：HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange：HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange：HLS+MP4+Packed Audio byte range<br> 默认值：ts-segment 注：自适应码流的分片格式以此字段为准。DASH格式下SegmentType只能为mp4-mp4-byterange。</p><p>FairPlay：只能用于HLS，切片格式只能是mp4或mp4-mp4-segment Widevine：可以用于HLS和DASH，HLS下切片格式只能是mp4或mp4-mp4-segment，DASH下切片格式只能是mp4或mp4-mp4-byterange Widevine+FairPlay: 只能用于HLS，切片格式只能是mp4或mp4-mp4-segment</p> 
     * @return SegmentType <p>分片类型，可选值：<br>ts: HLS，内部映射为ts-segment</p><p>mp4: HLS/DASH，HLS情况下内部映射为mp4-mp4-segment，DASH情况下内部映射为mp4-mp4-byterange</p><p>ts-segment：HLS+TS 切片</p><p>ts-byterange：HLS+TS byte range</p><p>mp4-segment：HLS+MP4 切片</p><p>mp4-byterange：HLS+MP4 byte range</p><p>ts-packed-audio：HLS+TS+Packed Audio 切片</p><p>mp4-packed-audio：HLS+MP4+Packed Audio 切片</p><p>ts-ts-segment：HLS+TS+TS 切片</p><p>ts-ts-byterange：HLS+TS+TS byte range</p><p>mp4-mp4-segment：HLS+MP4+MP4 切片</p><p>mp4-mp4-byterange：HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange：HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange：HLS+MP4+Packed Audio byte range<br> 默认值：ts-segment 注：自适应码流的分片格式以此字段为准。DASH格式下SegmentType只能为mp4-mp4-byterange。</p><p>FairPlay：只能用于HLS，切片格式只能是mp4或mp4-mp4-segment Widevine：可以用于HLS和DASH，HLS下切片格式只能是mp4或mp4-mp4-segment，DASH下切片格式只能是mp4或mp4-mp4-byterange Widevine+FairPlay: 只能用于HLS，切片格式只能是mp4或mp4-mp4-segment</p>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>分片类型，可选值：<br>ts: HLS，内部映射为ts-segment</p><p>mp4: HLS/DASH，HLS情况下内部映射为mp4-mp4-segment，DASH情况下内部映射为mp4-mp4-byterange</p><p>ts-segment：HLS+TS 切片</p><p>ts-byterange：HLS+TS byte range</p><p>mp4-segment：HLS+MP4 切片</p><p>mp4-byterange：HLS+MP4 byte range</p><p>ts-packed-audio：HLS+TS+Packed Audio 切片</p><p>mp4-packed-audio：HLS+MP4+Packed Audio 切片</p><p>ts-ts-segment：HLS+TS+TS 切片</p><p>ts-ts-byterange：HLS+TS+TS byte range</p><p>mp4-mp4-segment：HLS+MP4+MP4 切片</p><p>mp4-mp4-byterange：HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange：HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange：HLS+MP4+Packed Audio byte range<br> 默认值：ts-segment 注：自适应码流的分片格式以此字段为准。DASH格式下SegmentType只能为mp4-mp4-byterange。</p><p>FairPlay：只能用于HLS，切片格式只能是mp4或mp4-mp4-segment Widevine：可以用于HLS和DASH，HLS下切片格式只能是mp4或mp4-mp4-segment，DASH下切片格式只能是mp4或mp4-mp4-byterange Widevine+FairPlay: 只能用于HLS，切片格式只能是mp4或mp4-mp4-segment</p>
     * @param SegmentType <p>分片类型，可选值：<br>ts: HLS，内部映射为ts-segment</p><p>mp4: HLS/DASH，HLS情况下内部映射为mp4-mp4-segment，DASH情况下内部映射为mp4-mp4-byterange</p><p>ts-segment：HLS+TS 切片</p><p>ts-byterange：HLS+TS byte range</p><p>mp4-segment：HLS+MP4 切片</p><p>mp4-byterange：HLS+MP4 byte range</p><p>ts-packed-audio：HLS+TS+Packed Audio 切片</p><p>mp4-packed-audio：HLS+MP4+Packed Audio 切片</p><p>ts-ts-segment：HLS+TS+TS 切片</p><p>ts-ts-byterange：HLS+TS+TS byte range</p><p>mp4-mp4-segment：HLS+MP4+MP4 切片</p><p>mp4-mp4-byterange：HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange：HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange：HLS+MP4+Packed Audio byte range<br> 默认值：ts-segment 注：自适应码流的分片格式以此字段为准。DASH格式下SegmentType只能为mp4-mp4-byterange。</p><p>FairPlay：只能用于HLS，切片格式只能是mp4或mp4-mp4-segment Widevine：可以用于HLS和DASH，HLS下切片格式只能是mp4或mp4-mp4-segment，DASH下切片格式只能是mp4或mp4-mp4-byterange Widevine+FairPlay: 只能用于HLS，切片格式只能是mp4或mp4-mp4-segment</p>
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get <p>切片平均时长。</p><p>取值范围：[1, 10]</p><p>单位：秒</p> 
     * @return SegmentDuration <p>切片平均时长。</p><p>取值范围：[1, 10]</p><p>单位：秒</p>
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set <p>切片平均时长。</p><p>取值范围：[1, 10]</p><p>单位：秒</p>
     * @param SegmentDuration <p>切片平均时长。</p><p>取值范围：[1, 10]</p><p>单位：秒</p>
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
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
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
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
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);

    }
}

