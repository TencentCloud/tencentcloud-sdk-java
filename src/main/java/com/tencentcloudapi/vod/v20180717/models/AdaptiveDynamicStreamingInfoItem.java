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
    * <p>转自适应码流规格。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>打包格式，取值范围：</p><li>HLS；</li><li>DASH。</li>
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * <p>加密类型。</p>
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * <p>播放地址。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>媒体文件大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li><li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li><li><font color="red">注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * <p>子流信息列表。</p>
    */
    @SerializedName("SubStreamSet")
    @Expose
    private MediaSubStreamInfoItem [] SubStreamSet;

    /**
    * <p>版权信息。</p>
    */
    @SerializedName("CopyRightWatermarkText")
    @Expose
    private String CopyRightWatermarkText;

    /**
    * <p>数字水印模板id。</p>
    */
    @SerializedName("BlindWatermarkDefinition")
    @Expose
    private Long BlindWatermarkDefinition;

    /**
    * <p>字幕信息列表。</p>
    */
    @SerializedName("SubtitleSet")
    @Expose
    private MediaSubtitleItem [] SubtitleSet;

    /**
    * <p>默认字幕的唯一标识。</p>
    */
    @SerializedName("DefaultSubtitleId")
    @Expose
    private String DefaultSubtitleId;

    /**
    * <p>DRM加密方法。</p>
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
     * Get <p>转自适应码流规格。</p> 
     * @return Definition <p>转自适应码流规格。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转自适应码流规格。</p>
     * @param Definition <p>转自适应码流规格。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>打包格式，取值范围：</p><li>HLS；</li><li>DASH。</li> 
     * @return Package <p>打包格式，取值范围：</p><li>HLS；</li><li>DASH。</li>
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set <p>打包格式，取值范围：</p><li>HLS；</li><li>DASH。</li>
     * @param Package <p>打包格式，取值范围：</p><li>HLS；</li><li>DASH。</li>
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get <p>加密类型。</p> 
     * @return DrmType <p>加密类型。</p>
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set <p>加密类型。</p>
     * @param DrmType <p>加密类型。</p>
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get <p>播放地址。</p> 
     * @return Url <p>播放地址。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>播放地址。</p>
     * @param Url <p>播放地址。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>媒体文件大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li><li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li><li><font color="red">注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li> 
     * @return Size <p>媒体文件大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li><li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li><li><font color="red">注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>媒体文件大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li><li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li><li><font color="red">注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
     * @param Size <p>媒体文件大小，单位：字节。</p><li>当媒体文件为 HLS 时，大小是 m3u8 和 ts 文件大小的总和；</li><li>当媒体文件为 DASH 时，大小是 mpd 和分片文件大小的总和；</li><li><font color="red">注意</font>：在 2022-01-10T16:00:00Z 前处理生成的自适应码流文件此字段为0。</li>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li> 
     * @return DigitalWatermarkType <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
     * @param DigitalWatermarkType <p>数字水印类型。可选值：</p><li>Trace 表示经过溯源水印处理；</li><li>CopyRight 表示经过版权水印处理；</li><li>None 表示没有经过数字水印处理。</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get <p>子流信息列表。</p> 
     * @return SubStreamSet <p>子流信息列表。</p>
     */
    public MediaSubStreamInfoItem [] getSubStreamSet() {
        return this.SubStreamSet;
    }

    /**
     * Set <p>子流信息列表。</p>
     * @param SubStreamSet <p>子流信息列表。</p>
     */
    public void setSubStreamSet(MediaSubStreamInfoItem [] SubStreamSet) {
        this.SubStreamSet = SubStreamSet;
    }

    /**
     * Get <p>版权信息。</p> 
     * @return CopyRightWatermarkText <p>版权信息。</p>
     */
    public String getCopyRightWatermarkText() {
        return this.CopyRightWatermarkText;
    }

    /**
     * Set <p>版权信息。</p>
     * @param CopyRightWatermarkText <p>版权信息。</p>
     */
    public void setCopyRightWatermarkText(String CopyRightWatermarkText) {
        this.CopyRightWatermarkText = CopyRightWatermarkText;
    }

    /**
     * Get <p>数字水印模板id。</p> 
     * @return BlindWatermarkDefinition <p>数字水印模板id。</p>
     */
    public Long getBlindWatermarkDefinition() {
        return this.BlindWatermarkDefinition;
    }

    /**
     * Set <p>数字水印模板id。</p>
     * @param BlindWatermarkDefinition <p>数字水印模板id。</p>
     */
    public void setBlindWatermarkDefinition(Long BlindWatermarkDefinition) {
        this.BlindWatermarkDefinition = BlindWatermarkDefinition;
    }

    /**
     * Get <p>字幕信息列表。</p> 
     * @return SubtitleSet <p>字幕信息列表。</p>
     */
    public MediaSubtitleItem [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set <p>字幕信息列表。</p>
     * @param SubtitleSet <p>字幕信息列表。</p>
     */
    public void setSubtitleSet(MediaSubtitleItem [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get <p>默认字幕的唯一标识。</p> 
     * @return DefaultSubtitleId <p>默认字幕的唯一标识。</p>
     */
    public String getDefaultSubtitleId() {
        return this.DefaultSubtitleId;
    }

    /**
     * Set <p>默认字幕的唯一标识。</p>
     * @param DefaultSubtitleId <p>默认字幕的唯一标识。</p>
     */
    public void setDefaultSubtitleId(String DefaultSubtitleId) {
        this.DefaultSubtitleId = DefaultSubtitleId;
    }

    /**
     * Get <p>DRM加密方法。</p> 
     * @return DrmEncryptType <p>DRM加密方法。</p>
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set <p>DRM加密方法。</p>
     * @param DrmEncryptType <p>DRM加密方法。</p>
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
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
        if (source.BlindWatermarkDefinition != null) {
            this.BlindWatermarkDefinition = new Long(source.BlindWatermarkDefinition);
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
        if (source.DrmEncryptType != null) {
            this.DrmEncryptType = new String(source.DrmEncryptType);
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
        this.setParamSimple(map, prefix + "BlindWatermarkDefinition", this.BlindWatermarkDefinition);
        this.setParamArrayObj(map, prefix + "SubtitleSet.", this.SubtitleSet);
        this.setParamSimple(map, prefix + "DefaultSubtitleId", this.DefaultSubtitleId);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);

    }
}

