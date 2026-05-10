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

public class PlayerConfig extends AbstractModel {

    /**
    * <p>播放器配置名字。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>播放器配置类型，取值范围：</p><li>Preset：系统预置配置；</li><li>Custom：用户自定义配置。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>播放的音视频类型，可选值有：</p><li>AdaptiveDynamicStream：自适应码流输出；</li><li>Transcode：转码输出；</li><li>Original：原始音视频。</li>
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * <p>播放 DRM 保护的自适应码流开关：</p><li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li><li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
    */
    @SerializedName("DrmSwitch")
    @Expose
    private String DrmSwitch;

    /**
    * <p>允许输出的未加密的自适应码流模板 ID。</p>
    */
    @SerializedName("AdaptiveDynamicStreamingDefinition")
    @Expose
    private Long AdaptiveDynamicStreamingDefinition;

    /**
    * <p>允许输出的 DRM 自适应码流模板内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrmStreamingsInfo")
    @Expose
    private DrmStreamingsInfo DrmStreamingsInfo;

    /**
    * <p>允许输出的转码模板 ID。</p>
    */
    @SerializedName("TranscodeDefinition")
    @Expose
    private Long TranscodeDefinition;

    /**
    * <p>允许输出的雪碧图模板 ID。</p>
    */
    @SerializedName("ImageSpriteDefinition")
    @Expose
    private Long ImageSpriteDefinition;

    /**
    * <p>播放器对不于不同分辨率的子流展示名字。</p>
    */
    @SerializedName("ResolutionNameSet")
    @Expose
    private ResolutionNameInfo [] ResolutionNameSet;

    /**
    * <p>播放器配置创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>播放器配置最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>播放时使用的域名。值为 Default，表示使用<a href="https://cloud.tencent.com/document/product/266/33373">默认分发配置</a>中的域名。</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>播放时使用的 Scheme。取值范围：</p><li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li><li>HTTP；</li><li>HTTPS。</li>
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * <p>模板描述信息。</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get <p>播放器配置名字。</p> 
     * @return Name <p>播放器配置名字。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>播放器配置名字。</p>
     * @param Name <p>播放器配置名字。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>播放器配置类型，取值范围：</p><li>Preset：系统预置配置；</li><li>Custom：用户自定义配置。</li> 
     * @return Type <p>播放器配置类型，取值范围：</p><li>Preset：系统预置配置；</li><li>Custom：用户自定义配置。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>播放器配置类型，取值范围：</p><li>Preset：系统预置配置；</li><li>Custom：用户自定义配置。</li>
     * @param Type <p>播放器配置类型，取值范围：</p><li>Preset：系统预置配置；</li><li>Custom：用户自定义配置。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>播放的音视频类型，可选值有：</p><li>AdaptiveDynamicStream：自适应码流输出；</li><li>Transcode：转码输出；</li><li>Original：原始音视频。</li> 
     * @return AudioVideoType <p>播放的音视频类型，可选值有：</p><li>AdaptiveDynamicStream：自适应码流输出；</li><li>Transcode：转码输出；</li><li>Original：原始音视频。</li>
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set <p>播放的音视频类型，可选值有：</p><li>AdaptiveDynamicStream：自适应码流输出；</li><li>Transcode：转码输出；</li><li>Original：原始音视频。</li>
     * @param AudioVideoType <p>播放的音视频类型，可选值有：</p><li>AdaptiveDynamicStream：自适应码流输出；</li><li>Transcode：转码输出；</li><li>Original：原始音视频。</li>
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get <p>播放 DRM 保护的自适应码流开关：</p><li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li><li>OFF：关闭，表示播放未加密的自适应码流输出。</li> 
     * @return DrmSwitch <p>播放 DRM 保护的自适应码流开关：</p><li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li><li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     */
    public String getDrmSwitch() {
        return this.DrmSwitch;
    }

    /**
     * Set <p>播放 DRM 保护的自适应码流开关：</p><li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li><li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     * @param DrmSwitch <p>播放 DRM 保护的自适应码流开关：</p><li>ON：开启，表示仅播放 DRM  保护的自适应码流输出；</li><li>OFF：关闭，表示播放未加密的自适应码流输出。</li>
     */
    public void setDrmSwitch(String DrmSwitch) {
        this.DrmSwitch = DrmSwitch;
    }

    /**
     * Get <p>允许输出的未加密的自适应码流模板 ID。</p> 
     * @return AdaptiveDynamicStreamingDefinition <p>允许输出的未加密的自适应码流模板 ID。</p>
     */
    public Long getAdaptiveDynamicStreamingDefinition() {
        return this.AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Set <p>允许输出的未加密的自适应码流模板 ID。</p>
     * @param AdaptiveDynamicStreamingDefinition <p>允许输出的未加密的自适应码流模板 ID。</p>
     */
    public void setAdaptiveDynamicStreamingDefinition(Long AdaptiveDynamicStreamingDefinition) {
        this.AdaptiveDynamicStreamingDefinition = AdaptiveDynamicStreamingDefinition;
    }

    /**
     * Get <p>允许输出的 DRM 自适应码流模板内容。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrmStreamingsInfo <p>允许输出的 DRM 自适应码流模板内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DrmStreamingsInfo getDrmStreamingsInfo() {
        return this.DrmStreamingsInfo;
    }

    /**
     * Set <p>允许输出的 DRM 自适应码流模板内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrmStreamingsInfo <p>允许输出的 DRM 自适应码流模板内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrmStreamingsInfo(DrmStreamingsInfo DrmStreamingsInfo) {
        this.DrmStreamingsInfo = DrmStreamingsInfo;
    }

    /**
     * Get <p>允许输出的转码模板 ID。</p> 
     * @return TranscodeDefinition <p>允许输出的转码模板 ID。</p>
     */
    public Long getTranscodeDefinition() {
        return this.TranscodeDefinition;
    }

    /**
     * Set <p>允许输出的转码模板 ID。</p>
     * @param TranscodeDefinition <p>允许输出的转码模板 ID。</p>
     */
    public void setTranscodeDefinition(Long TranscodeDefinition) {
        this.TranscodeDefinition = TranscodeDefinition;
    }

    /**
     * Get <p>允许输出的雪碧图模板 ID。</p> 
     * @return ImageSpriteDefinition <p>允许输出的雪碧图模板 ID。</p>
     */
    public Long getImageSpriteDefinition() {
        return this.ImageSpriteDefinition;
    }

    /**
     * Set <p>允许输出的雪碧图模板 ID。</p>
     * @param ImageSpriteDefinition <p>允许输出的雪碧图模板 ID。</p>
     */
    public void setImageSpriteDefinition(Long ImageSpriteDefinition) {
        this.ImageSpriteDefinition = ImageSpriteDefinition;
    }

    /**
     * Get <p>播放器对不于不同分辨率的子流展示名字。</p> 
     * @return ResolutionNameSet <p>播放器对不于不同分辨率的子流展示名字。</p>
     */
    public ResolutionNameInfo [] getResolutionNameSet() {
        return this.ResolutionNameSet;
    }

    /**
     * Set <p>播放器对不于不同分辨率的子流展示名字。</p>
     * @param ResolutionNameSet <p>播放器对不于不同分辨率的子流展示名字。</p>
     */
    public void setResolutionNameSet(ResolutionNameInfo [] ResolutionNameSet) {
        this.ResolutionNameSet = ResolutionNameSet;
    }

    /**
     * Get <p>播放器配置创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return CreateTime <p>播放器配置创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>播放器配置创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param CreateTime <p>播放器配置创建时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>播放器配置最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return UpdateTime <p>播放器配置最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>播放器配置最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param UpdateTime <p>播放器配置最后修改时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>播放时使用的域名。值为 Default，表示使用<a href="https://cloud.tencent.com/document/product/266/33373">默认分发配置</a>中的域名。</p> 
     * @return Domain <p>播放时使用的域名。值为 Default，表示使用<a href="https://cloud.tencent.com/document/product/266/33373">默认分发配置</a>中的域名。</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>播放时使用的域名。值为 Default，表示使用<a href="https://cloud.tencent.com/document/product/266/33373">默认分发配置</a>中的域名。</p>
     * @param Domain <p>播放时使用的域名。值为 Default，表示使用<a href="https://cloud.tencent.com/document/product/266/33373">默认分发配置</a>中的域名。</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>播放时使用的 Scheme。取值范围：</p><li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li><li>HTTP；</li><li>HTTPS。</li> 
     * @return Scheme <p>播放时使用的 Scheme。取值范围：</p><li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li><li>HTTP；</li><li>HTTPS。</li>
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set <p>播放时使用的 Scheme。取值范围：</p><li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li><li>HTTP；</li><li>HTTPS。</li>
     * @param Scheme <p>播放时使用的 Scheme。取值范围：</p><li>Default：使用[默认分发配置](https://cloud.tencent.com/document/product/266/33373)中的 Scheme；</li><li>HTTP；</li><li>HTTPS。</li>
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get <p>模板描述信息。</p> 
     * @return Comment <p>模板描述信息。</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>模板描述信息。</p>
     * @param Comment <p>模板描述信息。</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public PlayerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayerConfig(PlayerConfig source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.ResolutionNameSet != null) {
            this.ResolutionNameSet = new ResolutionNameInfo[source.ResolutionNameSet.length];
            for (int i = 0; i < source.ResolutionNameSet.length; i++) {
                this.ResolutionNameSet[i] = new ResolutionNameInfo(source.ResolutionNameSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "DrmSwitch", this.DrmSwitch);
        this.setParamSimple(map, prefix + "AdaptiveDynamicStreamingDefinition", this.AdaptiveDynamicStreamingDefinition);
        this.setParamObj(map, prefix + "DrmStreamingsInfo.", this.DrmStreamingsInfo);
        this.setParamSimple(map, prefix + "TranscodeDefinition", this.TranscodeDefinition);
        this.setParamSimple(map, prefix + "ImageSpriteDefinition", this.ImageSpriteDefinition);
        this.setParamArrayObj(map, prefix + "ResolutionNameSet.", this.ResolutionNameSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

