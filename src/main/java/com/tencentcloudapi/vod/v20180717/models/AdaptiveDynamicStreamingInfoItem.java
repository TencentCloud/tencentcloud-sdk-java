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

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel{

    /**
    * 转自适应码流规格。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 打包格式，只能为 HLS。
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
     * Get 打包格式，只能为 HLS。 
     * @return Package 打包格式，只能为 HLS。
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set 打包格式，只能为 HLS。
     * @param Package 打包格式，只能为 HLS。
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

    }
}

