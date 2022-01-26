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

public class CreateSuperPlayerConfigRequest extends AbstractModel{

    /**
    * 播放器配置名称，长度限制：64 个字符。只允许出现 [0-9a-zA-Z] 及 _- 字符（如 test_ABC-123），同一个用户该名称唯一。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
默认为 AdaptiveDynamicStream。
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
默认为 OFF。
当 AudioVideoType 为 AdaptiveDynamicStream 时，此参数有效。
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * 允许输出的未加密的自适应码流模板 ID。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 OFF 时，此参数为必填。
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * 允许输出的 DRM 自适应码流模板内容。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 ON 时，此参数为必填。
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * 允许输出的转码模板 ID。

当 AudioVideoType 为 Transcode 时必填。
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * 允许输出的雪碧图模板 ID。
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * 播放器对不于不同分辨率的子流展示名字，不填或者填空数组则使用默认配置：
<li>MinEdgeLength：240，Name：流畅；</li>
<li>MinEdgeLength：480，Name：标清；</li>
<li>MinEdgeLength：720，Name：高清；</li>
<li>MinEdgeLength：1080，Name：全高清；</li>
<li>MinEdgeLength：1440，Name：2K；</li>
<li>MinEdgeLength：2160，Name：4K；</li>
<li>MinEdgeLength：4320，Name：8K。</li>
    */
    @SerializedName("ResolutionNames")
    @Expose
    private ResolutionNameInfo [] ResolutionNames;

    /**
    * 播放时使用的域名。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 播放时使用的 Scheme。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme。其他可选值：
<li>HTTP；</li>
<li>HTTPS。</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

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
     * Get 播放器配置名称，长度限制：64 个字符。只允许出现 [0-9a-zA-Z] 及 _- 字符（如 test_ABC-123），同一个用户该名称唯一。 
     * @return Name 播放器配置名称，长度限制：64 个字符。只允许出现 [0-9a-zA-Z] 及 _- 字符（如 test_ABC-123），同一个用户该名称唯一。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 播放器配置名称，长度限制：64 个字符。只允许出现 [0-9a-zA-Z] 及 _- 字符（如 test_ABC-123），同一个用户该名称唯一。
     * @param Name 播放器配置名称，长度限制：64 个字符。只允许出现 [0-9a-zA-Z] 及 _- 字符（如 test_ABC-123），同一个用户该名称唯一。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
默认为 AdaptiveDynamicStream。 
     * @return AudioVideoType 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
默认为 AdaptiveDynamicStream。
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
默认为 AdaptiveDynamicStream。
     * @param AudioVideoType 播放的音视频类型，可选值：
<li>AdaptiveDynamicStream：自适应码流输出；</li>
<li>Transcode：转码输出；</li>
<li>Original：原始音视频。</li>
默认为 AdaptiveDynamicStream。
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
默认为 OFF。
当 AudioVideoType 为 AdaptiveDynamicStream 时，此参数有效。 
     * @return DrmSwitch 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
默认为 OFF。
当 AudioVideoType 为 AdaptiveDynamicStream 时，此参数有效。
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
默认为 OFF。
当 AudioVideoType 为 AdaptiveDynamicStream 时，此参数有效。
     * @param DrmSwitch 播放 DRM 保护的自适应码流开关：
<li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li>
<li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
默认为 OFF。
当 AudioVideoType 为 AdaptiveDynamicStream 时，此参数有效。
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get 允许输出的未加密的自适应码流模板 ID。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 OFF 时，此参数为必填。 
     * @return AdaptiveDynamicStreamingDefinition 允许输出的未加密的自适应码流模板 ID。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 OFF 时，此参数为必填。
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set 允许输出的未加密的自适应码流模板 ID。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 OFF 时，此参数为必填。
     * @param AdaptiveDynamicStreamingDefinition 允许输出的未加密的自适应码流模板 ID。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 OFF 时，此参数为必填。
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get 允许输出的 DRM 自适应码流模板内容。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 ON 时，此参数为必填。 
     * @return DrmStreamingsInfo 允许输出的 DRM 自适应码流模板内容。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 ON 时，此参数为必填。
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set 允许输出的 DRM 自适应码流模板内容。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 ON 时，此参数为必填。
     * @param DrmStreamingsInfo 允许输出的 DRM 自适应码流模板内容。

当 AudioVideoType 为 AdaptiveDynamicStream 并且 DrmSwitch 为 ON 时，此参数为必填。
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get 允许输出的转码模板 ID。

当 AudioVideoType 为 Transcode 时必填。 
     * @return TranscodeDefinition 允许输出的转码模板 ID。

当 AudioVideoType 为 Transcode 时必填。
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set 允许输出的转码模板 ID。

当 AudioVideoType 为 Transcode 时必填。
     * @param TranscodeDefinition 允许输出的转码模板 ID。

当 AudioVideoType 为 Transcode 时必填。
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get 允许输出的雪碧图模板 ID。 
     * @return ImageSpriteDefinition 允许输出的雪碧图模板 ID。
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set 允许输出的雪碧图模板 ID。
     * @param ImageSpriteDefinition 允许输出的雪碧图模板 ID。
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get 播放器对不于不同分辨率的子流展示名字，不填或者填空数组则使用默认配置：
<li>MinEdgeLength：240，Name：流畅；</li>
<li>MinEdgeLength：480，Name：标清；</li>
<li>MinEdgeLength：720，Name：高清；</li>
<li>MinEdgeLength：1080，Name：全高清；</li>
<li>MinEdgeLength：1440，Name：2K；</li>
<li>MinEdgeLength：2160，Name：4K；</li>
<li>MinEdgeLength：4320，Name：8K。</li> 
     * @return ResolutionNames 播放器对不于不同分辨率的子流展示名字，不填或者填空数组则使用默认配置：
<li>MinEdgeLength：240，Name：流畅；</li>
<li>MinEdgeLength：480，Name：标清；</li>
<li>MinEdgeLength：720，Name：高清；</li>
<li>MinEdgeLength：1080，Name：全高清；</li>
<li>MinEdgeLength：1440，Name：2K；</li>
<li>MinEdgeLength：2160，Name：4K；</li>
<li>MinEdgeLength：4320，Name：8K。</li>
     */
    public ResolutionNameInfo [] getResolutionNames() {
        return this.ResolutionNames;
    }

    /**
     * Set 播放器对不于不同分辨率的子流展示名字，不填或者填空数组则使用默认配置：
<li>MinEdgeLength：240，Name：流畅；</li>
<li>MinEdgeLength：480，Name：标清；</li>
<li>MinEdgeLength：720，Name：高清；</li>
<li>MinEdgeLength：1080，Name：全高清；</li>
<li>MinEdgeLength：1440，Name：2K；</li>
<li>MinEdgeLength：2160，Name：4K；</li>
<li>MinEdgeLength：4320，Name：8K。</li>
     * @param ResolutionNames 播放器对不于不同分辨率的子流展示名字，不填或者填空数组则使用默认配置：
<li>MinEdgeLength：240，Name：流畅；</li>
<li>MinEdgeLength：480，Name：标清；</li>
<li>MinEdgeLength：720，Name：高清；</li>
<li>MinEdgeLength：1080，Name：全高清；</li>
<li>MinEdgeLength：1440，Name：2K；</li>
<li>MinEdgeLength：2160，Name：4K；</li>
<li>MinEdgeLength：4320，Name：8K。</li>
     */
    public void setResolutionNames(ResolutionNameInfo [] ResolutionNames) {
        this.ResolutionNames = ResolutionNames;
    }

    /**
     * Get 播放时使用的域名。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。 
     * @return Domain 播放时使用的域名。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 播放时使用的域名。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
     * @param Domain 播放时使用的域名。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 播放时使用的 Scheme。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme。其他可选值：
<li>HTTP；</li>
<li>HTTPS。</li> 
     * @return Scheme 播放时使用的 Scheme。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme。其他可选值：
<li>HTTP；</li>
<li>HTTPS。</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set 播放时使用的 Scheme。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme。其他可选值：
<li>HTTP；</li>
<li>HTTPS。</li>
     * @param Scheme 播放时使用的 Scheme。不填或者填 Default，表示使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme。其他可选值：
<li>HTTP；</li>
<li>HTTPS。</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
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

    public CreateSuperPlayerConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSuperPlayerConfigRequest(CreateSuperPlayerConfigRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.DrmSwitch != null) {
            this.DrmSwitch = new String(source.DrmSwitch);
        }
        if (source.AdaptiveDynamicStreamingDefinition != null) {
            this.AdaptiveDynamicStreamingDefinition = new Long(source.AdaptiveDynamicStreamingDefinition);
        }
        if (source.DrmStreamingsInfo != null) {
            this.DrmStreamingsInfo = new DrmStreamingsInfo(source.DrmStreamingsInfo);
        }
        if (source.TranscodeDefinition != null) {
            this.TranscodeDefinition = new Long(source.TranscodeDefinition);
        }
        if (source.ImageSpriteDefinition != null) {
            this.ImageSpriteDefinition = new Long(source.ImageSpriteDefinition);
        }
        if (source.ResolutionNames != null) {
            this.ResolutionNames = new ResolutionNameInfo[source.ResolutionNames.length];
            for (int i = 0; i < source.ResolutionNames.length; i++) {
                this.ResolutionNames[i] = new ResolutionNameInfo(source.ResolutionNames[i]);
            }
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNames.", this.ResolutionNames);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

