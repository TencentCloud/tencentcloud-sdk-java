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
    * 转自适应码流模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 转自适应码流模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 转自适应码流模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 自适应转码格式，取值范围：
<li>HLS。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * DRM 类型，取值范围：
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * DRM 的密钥提供商，取值范围：
<li>SDMC：华曦达；</li>
<li>VOD：云点播。</li>
默认值为 VOD 。
    */
    @SerializedName("DrmKeyProvider")
    @Expose
    private String DrmKeyProvider;

    /**
    * 自适应转码输入流参数信息，最多输入10路流。
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

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
    * 切片类型，仅当 Format 为 HLS 时有效。
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
     * Get 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li> 
     * @return Type 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     * @param Type 模板类型，取值范围：
<li>Preset：系统预置模板；</li>
<li>Custom：用户自定义模板。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 转自适应码流模板名称。 
     * @return Name 转自适应码流模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 转自适应码流模板名称。
     * @param Name 转自适应码流模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 转自适应码流模板描述信息。 
     * @return Comment 转自适应码流模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 转自适应码流模板描述信息。
     * @param Comment 转自适应码流模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 自适应转码格式，取值范围：
<li>HLS。</li> 
     * @return Format 自适应转码格式，取值范围：
<li>HLS。</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 自适应转码格式，取值范围：
<li>HLS。</li>
     * @param Format 自适应转码格式，取值范围：
<li>HLS。</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get DRM 类型，取值范围：
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
如果取值为空字符串，代表不对视频做 DRM 保护。 
     * @return DrmType DRM 类型，取值范围：
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM 类型，取值范围：
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     * @param DrmType DRM 类型，取值范围：
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get DRM 的密钥提供商，取值范围：
<li>SDMC：华曦达；</li>
<li>VOD：云点播。</li>
默认值为 VOD 。 
     * @return DrmKeyProvider DRM 的密钥提供商，取值范围：
<li>SDMC：华曦达；</li>
<li>VOD：云点播。</li>
默认值为 VOD 。
     */
    public String getDrmKeyProvider() {
        return this.DrmKeyProvider;
    }

    /**
     * Set DRM 的密钥提供商，取值范围：
<li>SDMC：华曦达；</li>
<li>VOD：云点播。</li>
默认值为 VOD 。
     * @param DrmKeyProvider DRM 的密钥提供商，取值范围：
<li>SDMC：华曦达；</li>
<li>VOD：云点播。</li>
默认值为 VOD 。
     */
    public void setDrmKeyProvider(String DrmKeyProvider) {
        this.DrmKeyProvider = DrmKeyProvider;
    }

    /**
     * Get 自适应转码输入流参数信息，最多输入10路流。 
     * @return StreamInfos 自适应转码输入流参数信息，最多输入10路流。
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 自适应转码输入流参数信息，最多输入10路流。
     * @param StreamInfos 自适应转码输入流参数信息，最多输入10路流。
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
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
     * Get 切片类型，仅当 Format 为 HLS 时有效。 
     * @return SegmentType 切片类型，仅当 Format 为 HLS 时有效。
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 切片类型，仅当 Format 为 HLS 时有效。
     * @param SegmentType 切片类型，仅当 Format 为 HLS 时有效。
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
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

