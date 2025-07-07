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

public class RoundPlayListItemInfo extends AbstractModel {

    /**
    * 媒体文件标识。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 播放的音视频类型，可选值：
<li>Transcode：转码输出；转码输出会有多个模版，必须指定 Definition 字段</li>
<li>Original：原始音视频。</li>
Type 对应的格式必须为 HLS 格式。
    */
    @SerializedName("AudioVideoType")
    @Expose
    private String AudioVideoType;

    /**
    * 播放节目的 ID，由系统分配。
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 指定播放的转码模板，当 AudioVideoType 为 Transcode 时必须指定。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
     * Get 媒体文件标识。 
     * @return FileId 媒体文件标识。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 媒体文件标识。
     * @param FileId 媒体文件标识。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * Get 播放的音视频类型，可选值：
<li>Transcode：转码输出；转码输出会有多个模版，必须指定 Definition 字段</li>
<li>Original：原始音视频。</li>
Type 对应的格式必须为 HLS 格式。 
     * @return AudioVideoType 播放的音视频类型，可选值：
<li>Transcode：转码输出；转码输出会有多个模版，必须指定 Definition 字段</li>
<li>Original：原始音视频。</li>
Type 对应的格式必须为 HLS 格式。
     */
    public String getAudioVideoType() {
        return this.AudioVideoType;
    }

    /**
     * Set 播放的音视频类型，可选值：
<li>Transcode：转码输出；转码输出会有多个模版，必须指定 Definition 字段</li>
<li>Original：原始音视频。</li>
Type 对应的格式必须为 HLS 格式。
     * @param AudioVideoType 播放的音视频类型，可选值：
<li>Transcode：转码输出；转码输出会有多个模版，必须指定 Definition 字段</li>
<li>Original：原始音视频。</li>
Type 对应的格式必须为 HLS 格式。
     */
    public void setAudioVideoType(String AudioVideoType) {
        this.AudioVideoType = AudioVideoType;
    }

    /**
     * Get 播放节目的 ID，由系统分配。 
     * @return ItemId 播放节目的 ID，由系统分配。
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 播放节目的 ID，由系统分配。
     * @param ItemId 播放节目的 ID，由系统分配。
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 指定播放的转码模板，当 AudioVideoType 为 Transcode 时必须指定。 
     * @return Definition 指定播放的转码模板，当 AudioVideoType 为 Transcode 时必须指定。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 指定播放的转码模板，当 AudioVideoType 为 Transcode 时必须指定。
     * @param Definition 指定播放的转码模板，当 AudioVideoType 为 Transcode 时必须指定。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    public RoundPlayListItemInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayListItemInfo(RoundPlayListItemInfo source) {
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
        }
        if (source.AudioVideoType != null) {
            this.AudioVideoType = new String(source.AudioVideoType);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "AudioVideoType", this.AudioVideoType);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "Definition", this.Definition);

    }
}

