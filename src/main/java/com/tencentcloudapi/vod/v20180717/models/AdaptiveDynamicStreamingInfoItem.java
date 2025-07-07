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

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel {

    /**
    * 转自适应码流规格。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 打包格式，取值范围：
<li>HLS；</li>
<li>DASH。</li>
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * 加密类型。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 播放地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 媒体文件大小，单位：字节。
<li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li>
<li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li>
<li><font color=red>注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 数字水印类型。可选值：
<li>Trace 表示经过溯源水印处理；</li>
<li>CopyRight 表示经过版权水印处理；</li>
<li>None 表示没有经过数字水印处理。</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * 子流信息列表。
    */
    @SerializedName("SubStreamSet")
    @Expose
    private MediaSubStreamInfoItem [] SubStreamSet;

    /**
    * 版权信息。
    */
    @SerializedName("CopyRightWatermarkText")
    @Expose
    private String CopyRightWatermarkText;

    /**
    * 字幕信息列表。
    */
    @SerializedName("SubtitleSet")
    @Expose
    private MediaSubtitleItem [] SubtitleSet;

    /**
    * 默认字幕的唯一标识。
    */
    @SerializedName("DefaultSubtitleId")
    @Expose
    private String DefaultSubtitleId;

    /**
     * Get 转自适应码流规格。 
     * @return Definition 转自适应码流规格。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转自适应码流规格。
     * @param Definition 转自适应码流规格。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 打包格式，取值范围：
<li>HLS；</li>
<li>DASH。</li> 
     * @return Package 打包格式，取值范围：
<li>HLS；</li>
<li>DASH。</li>
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 打包格式，取值范围：
<li>HLS；</li>
<li>DASH。</li>
     * @param Package 打包格式，取值范围：
<li>HLS；</li>
<li>DASH。</li>
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get 加密类型。 
     * @return DrmType 加密类型。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set 加密类型。
     * @param DrmType 加密类型。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get 播放地址。 
     * @return Url 播放地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 播放地址。
     * @param Url 播放地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 媒体文件大小，单位：字节。
<li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li>
<li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li>
<li><font color=red>注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li> 
     * @return Size 媒体文件大小，单位：字节。
<li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li>
<li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li>
<li><font color=red>注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 媒体文件大小，单位：字节。
<li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li>
<li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li>
<li><font color=red>注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
     * @param Size 媒体文件大小，单位：字节。
<li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li>
<li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li>
<li><font color=red>注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 数字水印类型。可选值：
<li>Trace 表示经过溯源水印处理；</li>
<li>CopyRight 表示经过版权水印处理；</li>
<li>None 表示没有经过数字水印处理。</li> 
     * @return DigitalWatermarkType 数字水印类型。可选值：
<li>Trace 表示经过溯源水印处理；</li>
<li>CopyRight 表示经过版权水印处理；</li>
<li>None 表示没有经过数字水印处理。</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set 数字水印类型。可选值：
<li>Trace 表示经过溯源水印处理；</li>
<li>CopyRight 表示经过版权水印处理；</li>
<li>None 表示没有经过数字水印处理。</li>
     * @param DigitalWatermarkType 数字水印类型。可选值：
<li>Trace 表示经过溯源水印处理；</li>
<li>CopyRight 表示经过版权水印处理；</li>
<li>None 表示没有经过数字水印处理。</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get 子流信息列表。 
     * @return SubStreamSet 子流信息列表。
     */
    public MediaSubStreamInfoItem [] getSubStreamSet() {
        return this.SubStreamSet;
    }

    /**
     * Set 子流信息列表。
     * @param SubStreamSet 子流信息列表。
     */
    public void setSubStreamSet(MediaSubStreamInfoItem [] SubStreamSet) {
        this.SubStreamSet = SubStreamSet;
    }

    /**
     * Get 版权信息。 
     * @return CopyRightWatermarkText 版权信息。
     */
    public String getCopyRightWatermarkText() {
        return this.CopyRightWatermarkText;
    }

    /**
     * Set 版权信息。
     * @param CopyRightWatermarkText 版权信息。
     */
    public void setCopyRightWatermarkText(String CopyRightWatermarkText) {
        this.CopyRightWatermarkText = CopyRightWatermarkText;
    }

    /**
     * Get 字幕信息列表。 
     * @return SubtitleSet 字幕信息列表。
     */
    public MediaSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 字幕信息列表。
     * @param SubtitleSet 字幕信息列表。
     */
    public void setSubtitleSet(MediaSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get 默认字幕的唯一标识。 
     * @return DefaultSubtitleId 默认字幕的唯一标识。
     */
    public String getDefaultSubtitleId() {
        return this.DefaultSubtitleId;
    }

    /**
     * Set 默认字幕的唯一标识。
     * @param DefaultSubtitleId 默认字幕的唯一标识。
     */
    public void setDefaultSubtitleId(String DefaultSubtitleId) {
        this.DefaultSubtitleId = DefaultSubtitleId;
    }

    public AdaptiveDynamicStreamingInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingInfoItem(AdaptiveDynamicStreamingInfoItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.SubStreamSet != null) {
            this.SubStreamSet = new MediaSubStreamInfoItem[source.SubStreamSet.length];
            for (int i = 0; i < source.SubStreamSet.length; i++) {
                this.SubStreamSet[i] = new MediaSubStreamInfoItem(source.SubStreamSet[i]);
            }
        }
        if (source.CopyRightWatermarkText != null) {
            this.CopyRightWatermarkText = new String(source.CopyRightWatermarkText);
        }
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new MediaSubtitleItem[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new MediaSubtitleItem(source.SubtitleSet[i]);
            }
        }
        if (source.DefaultSubtitleId != null) {
            this.DefaultSubtitleId = new String(source.DefaultSubtitleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamArrayObj(map, prefix + "SubStreamSet.", this.SubStreamSet);
        this.setParamSimple(map, prefix + "CopyRightWatermarkText", this.CopyRightWatermarkText);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);
        this.setParamSimple(map, prefix + "DefaultSubtitleId", this.DefaultSubtitleId);

    }
}

