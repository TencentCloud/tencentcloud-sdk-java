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

public class AdaptiveDynamicStreamingTemplate  extends AbstractModel{

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
    * 打包类型，取值范围：
<li>hls；</li>
<li>dash。</li>
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * DRM 类型，取值范围：
<li>FairPlay；</li>
<li>SimpleAES；</li>
<li>Widevine。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 视频轨模板列表。
    */
    @SerializedName("VideoTrackTemplateSet")
    @Expose
    private VideoTrackTemplateInfo [] VideoTrackTemplateSet;

    /**
    * 音频轨模板列表。
    */
    @SerializedName("AudioTrackTemplateSet")
    @Expose
    private AudioTrackTemplateInfo [] AudioTrackTemplateSet;

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
    * 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * 获取转自适应码流模板唯一标识。
     * @return Definition 转自适应码流模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置转自适应码流模板唯一标识。
     * @param Definition 转自适应码流模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取模板类型，取值范围：
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
     * 设置模板类型，取值范围：
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
     * 获取转自适应码流模板名称。
     * @return Name 转自适应码流模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置转自适应码流模板名称。
     * @param Name 转自适应码流模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取转自适应码流模板描述信息。
     * @return Comment 转自适应码流模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * 设置转自适应码流模板描述信息。
     * @param Comment 转自适应码流模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * 获取打包类型，取值范围：
<li>hls；</li>
<li>dash。</li>
     * @return PackageType 打包类型，取值范围：
<li>hls；</li>
<li>dash。</li>
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * 设置打包类型，取值范围：
<li>hls；</li>
<li>dash。</li>
     * @param PackageType 打包类型，取值范围：
<li>hls；</li>
<li>dash。</li>
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * 获取DRM 类型，取值范围：
<li>FairPlay；</li>
<li>SimpleAES；</li>
<li>Widevine。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     * @return DrmType DRM 类型，取值范围：
<li>FairPlay；</li>
<li>SimpleAES；</li>
<li>Widevine。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * 设置DRM 类型，取值范围：
<li>FairPlay；</li>
<li>SimpleAES；</li>
<li>Widevine。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     * @param DrmType DRM 类型，取值范围：
<li>FairPlay；</li>
<li>SimpleAES；</li>
<li>Widevine。</li>
如果取值为空字符串，代表不对视频做 DRM 保护。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * 获取视频轨模板列表。
     * @return VideoTrackTemplateSet 视频轨模板列表。
     */
    public VideoTrackTemplateInfo [] getVideoTrackTemplateSet() {
        return this.VideoTrackTemplateSet;
    }

    /**
     * 设置视频轨模板列表。
     * @param VideoTrackTemplateSet 视频轨模板列表。
     */
    public void setVideoTrackTemplateSet(VideoTrackTemplateInfo [] VideoTrackTemplateSet) {
        this.VideoTrackTemplateSet = VideoTrackTemplateSet;
    }

    /**
     * 获取音频轨模板列表。
     * @return AudioTrackTemplateSet 音频轨模板列表。
     */
    public AudioTrackTemplateInfo [] getAudioTrackTemplateSet() {
        return this.AudioTrackTemplateSet;
    }

    /**
     * 设置音频轨模板列表。
     * @param AudioTrackTemplateSet 音频轨模板列表。
     */
    public void setAudioTrackTemplateSet(AudioTrackTemplateInfo [] AudioTrackTemplateSet) {
        this.AudioTrackTemplateSet = AudioTrackTemplateSet;
    }

    /**
     * 获取是否禁止视频低码率转高码率，取值范围：
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
     * 设置是否禁止视频低码率转高码率，取值范围：
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
     * 获取是否禁止视频分辨率转高分辨率，取值范围：
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
     * 设置是否禁止视频分辨率转高分辨率，取值范围：
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
     * 获取模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param UpdateTime 模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamArrayObj(map, prefix + "VideoTrackTemplateSet.", this.VideoTrackTemplateSet);
        this.setParamArrayObj(map, prefix + "AudioTrackTemplateSet.", this.AudioTrackTemplateSet);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

