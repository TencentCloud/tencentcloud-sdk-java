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

public class AdaptiveDynamicStreamingTemplate extends AbstractModel {

    /**
    * <p>转自适应码流模板唯一标识。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>模板类型，取值范围：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>转自适应码流模板名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>转自适应码流模板描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>自适应转码格式，取值范围：</p><li>HLS。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>DRM 类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>如果取值为空字符串，代表不对视频做 DRM 保护。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认值为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
    */
    @SerializedName("DrmKeyProvider")
    @Expose
    private String DrmKeyProvider;

    /**
    * <p>DRM的加密类型，取值范围：{&quot;cbcs&quot;, &quot;cenc&quot;}</p>
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
    * <p>自适应转码输入流参数信息，最多输入10路流。</p>
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

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
    * <p>切片类型，仅当 Format 为 HLS 时有效。</p>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get <p>转自适应码流模板唯一标识。</p> 
     * @return Definition <p>转自适应码流模板唯一标识。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转自适应码流模板唯一标识。</p>
     * @param Definition <p>转自适应码流模板唯一标识。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>模板类型，取值范围：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li> 
     * @return Type <p>模板类型，取值范围：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>模板类型，取值范围：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
     * @param Type <p>模板类型，取值范围：</p><li>Preset：系统预置模板；</li><li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>转自适应码流模板名称。</p> 
     * @return Name <p>转自适应码流模板名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>转自适应码流模板名称。</p>
     * @param Name <p>转自适应码流模板名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>转自适应码流模板描述信息。</p> 
     * @return Comment <p>转自适应码流模板描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>转自适应码流模板描述信息。</p>
     * @param Comment <p>转自适应码流模板描述信息。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>自适应转码格式，取值范围：</p><li>HLS。</li> 
     * @return Format <p>自适应转码格式，取值范围：</p><li>HLS。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>自适应转码格式，取值范围：</p><li>HLS。</li>
     * @param Format <p>自适应转码格式，取值范围：</p><li>HLS。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>DRM 类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>如果取值为空字符串，代表不对视频做 DRM 保护。 
     * @return DrmType <p>DRM 类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set <p>DRM 类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>如果取值为空字符串，代表不对视频做 DRM 保护。
     * @param DrmType <p>DRM 类型，取值范围：</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认值为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p> 
     * @return DrmKeyProvider <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认值为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
     */
    public String getDrmKeyProvider() {
        return this.DrmKeyProvider;
    }

    /**
     * Set <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认值为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
     * @param DrmKeyProvider <p>DRM 的密钥提供商，取值范围：</p><li>SDMC：华曦达；</li><li>VOD：云点播。</li>默认值为 VOD 。<p>华曦达服务后续逐步下线，请使用VOD DRM加密服务。</p>
     */
    public void setDrmKeyProvider(String DrmKeyProvider) {
        this.DrmKeyProvider = DrmKeyProvider;
    }

    /**
     * Get <p>DRM的加密类型，取值范围：{&quot;cbcs&quot;, &quot;cenc&quot;}</p> 
     * @return DrmEncryptType <p>DRM的加密类型，取值范围：{&quot;cbcs&quot;, &quot;cenc&quot;}</p>
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set <p>DRM的加密类型，取值范围：{&quot;cbcs&quot;, &quot;cenc&quot;}</p>
     * @param DrmEncryptType <p>DRM的加密类型，取值范围：{&quot;cbcs&quot;, &quot;cenc&quot;}</p>
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
    }

    /**
     * Get <p>自适应转码输入流参数信息，最多输入10路流。</p> 
     * @return StreamInfos <p>自适应转码输入流参数信息，最多输入10路流。</p>
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set <p>自适应转码输入流参数信息，最多输入10路流。</p>
     * @param StreamInfos <p>自适应转码输入流参数信息，最多输入10路流。</p>
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
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
     * Get <p>切片类型，仅当 Format 为 HLS 时有效。</p> 
     * @return SegmentType <p>切片类型，仅当 Format 为 HLS 时有效。</p>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>切片类型，仅当 Format 为 HLS 时有效。</p>
     * @param SegmentType <p>切片类型，仅当 Format 为 HLS 时有效。</p>
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    public AdaptiveDynamicStreamingTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTemplate(AdaptiveDynamicStreamingTemplate source) {
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
        if (source.Format != null) {
            this.Format = new String(source.Format);
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
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "DrmKeyProvider", this.DrmKeyProvider);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

