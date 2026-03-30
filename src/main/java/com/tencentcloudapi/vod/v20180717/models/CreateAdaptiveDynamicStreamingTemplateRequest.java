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

public class CreateAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * <p>自适应转码格式，取值范围：</p><li>HLS；</li><li>MPEG-DASH。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>自适应转码输出子流参数信息，最多输出10路子流。<br>注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。</p>
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

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
    * <p>DRM 方案类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>默认值为空字符串，如果取值为空字符串，代表不对视频做 DRM 保护。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
    */
    @SerializedName("DrmKeyProvider")
    @Expose
    private String DrmKeyProvider;

    /**
    * <p>加密方式，可选值：<br>cbcs：Widevine，FairPlay，WideVine+FairPlay支持；<br>cenc：Widevine支持；   </p><p>若不填<br>FairPlay 默认cbcs;<br>Widevine 默认cenc;<br>WideVine+FairPlay默认cbcs;</p>
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
    * <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * <p>模板描述信息，长度限制：256 个字符。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>切片类型，当 Format 为 HLS 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

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
     * Get <p>自适应转码输出子流参数信息，最多输出10路子流。<br>注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。</p> 
     * @return StreamInfos <p>自适应转码输出子流参数信息，最多输出10路子流。<br>注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。</p>
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set <p>自适应转码输出子流参数信息，最多输出10路子流。<br>注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。</p>
     * @param StreamInfos <p>自适应转码输出子流参数信息，最多输出10路子流。<br>注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。</p>
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
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
     * Get <p>DRM 方案类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>默认值为空字符串，如果取值为空字符串，代表不对视频做 DRM 保护。 
     * @return DrmType <p>DRM 方案类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>默认值为空字符串，如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set <p>DRM 方案类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>默认值为空字符串，如果取值为空字符串，代表不对视频做 DRM 保护。
     * @param DrmType <p>DRM 方案类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>默认值为空字符串，如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p> 
     * @return DrmKeyProvider <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
     */
    public String getDrmKeyProvider() {
        return this.DrmKeyProvider;
    }

    /**
     * Set <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
     * @param DrmKeyProvider <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
     */
    public void setDrmKeyProvider(String DrmKeyProvider) {
        this.DrmKeyProvider = DrmKeyProvider;
    }

    /**
     * Get <p>加密方式，可选值：<br>cbcs：Widevine，FairPlay，WideVine+FairPlay支持；<br>cenc：Widevine支持；   </p><p>若不填<br>FairPlay 默认cbcs;<br>Widevine 默认cenc;<br>WideVine+FairPlay默认cbcs;</p> 
     * @return DrmEncryptType <p>加密方式，可选值：<br>cbcs：Widevine，FairPlay，WideVine+FairPlay支持；<br>cenc：Widevine支持；   </p><p>若不填<br>FairPlay 默认cbcs;<br>Widevine 默认cenc;<br>WideVine+FairPlay默认cbcs;</p>
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set <p>加密方式，可选值：<br>cbcs：Widevine，FairPlay，WideVine+FairPlay支持；<br>cenc：Widevine支持；   </p><p>若不填<br>FairPlay 默认cbcs;<br>Widevine 默认cenc;<br>WideVine+FairPlay默认cbcs;</p>
     * @param DrmEncryptType <p>加密方式，可选值：<br>cbcs：Widevine，FairPlay，WideVine+FairPlay支持；<br>cenc：Widevine支持；   </p><p>若不填<br>FairPlay 默认cbcs;<br>Widevine 默认cenc;<br>WideVine+FairPlay默认cbcs;</p>
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
    }

    /**
     * Get <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。 
     * @return DisableHigherVideoBitrate <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
     * @param DisableHigherVideoBitrate <p>是否禁止视频低码率转高码率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。 
     * @return DisableHigherVideoResolution <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
     * @param DisableHigherVideoResolution <p>是否禁止视频分辨率转高分辨率，取值范围：</p><li>0：否，</li><li>1：是。</li>默认为否。
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
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
     * Get <p>切片类型，当 Format 为 HLS 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。 
     * @return SegmentType <p>切片类型，当 Format 为 HLS 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>切片类型，当 Format 为 HLS 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
     * @param SegmentType <p>切片类型，当 Format 为 HLS 时有效，可选值：</p><li>ts：ts 切片；</li><li>fmp4：fmp4 切片。</li>默认值：ts。
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    public CreateAdaptiveDynamicStreamingTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAdaptiveDynamicStreamingTemplateRequest(CreateAdaptiveDynamicStreamingTemplateRequest source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.DrmKeyProvider != null) {
            this.DrmKeyProvider = new String(source.DrmKeyProvider);
        }
        if (source.DrmEncryptType != null) {
            this.DrmEncryptType = new String(source.DrmEncryptType);
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "DrmKeyProvider", this.DrmKeyProvider);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

