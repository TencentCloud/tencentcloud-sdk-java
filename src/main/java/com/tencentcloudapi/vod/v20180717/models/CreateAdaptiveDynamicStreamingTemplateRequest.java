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

public class CreateAdaptiveDynamicStreamingTemplateRequest extends AbstractModel{

    /**
    * 自适应转码格式，取值范围：
<li>HLS。</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 自适应转码输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * 模板名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DRM方案类型，取值范围：
<li>SimpleAES。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * 模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
     * Get 自适应转码输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。 
     * @return StreamInfos 自适应转码输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set 自适应转码输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
     * @param StreamInfos 自适应转码输出子流参数信息，最多输出10路子流。
注意：各个子流的帧率必须保持一致；如果不一致，采用第一个子流的帧率作为输出帧率。
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
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
     * Get DRM方案类型，取值范围：
<li>SimpleAES。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。 
     * @return DrmType DRM方案类型，取值范围：
<li>SimpleAES。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM方案类型，取值范围：
<li>SimpleAES。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     * @param DrmType DRM方案类型，取值范围：
<li>SimpleAES。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。 
     * @return DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     * @param DisableHigherVideoBitrate 是否禁止视频低码率转高码率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。 
     * @return DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     * @param DisableHigherVideoResolution 是否禁止视频分辨率转高分辨率，取值范围：
<li>0：否，</li>
<li>1：是。</li>
默认为否。
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
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
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

