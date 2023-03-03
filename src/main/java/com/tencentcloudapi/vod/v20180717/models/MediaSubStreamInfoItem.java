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

public class MediaSubStreamInfoItem extends AbstractModel{

    /**
    * 子流类型，取值范围：
<li>audio：纯音频；</li>
<li>video：视频（可能包含音频流）。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当子流为视频流时，视频画面宽度，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 当子流为视频流时，视频画面高度，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 子流媒体文件大小，单位：Byte。
<font color=red>注意：</font>在 2023-02-09T16:00:00Z 前处理生成的自适应码流文件此字段为0。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 子流类型，取值范围：
<li>audio：纯音频；</li>
<li>video：视频（可能包含音频流）。</li> 
     * @return Type 子流类型，取值范围：
<li>audio：纯音频；</li>
<li>video：视频（可能包含音频流）。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 子流类型，取值范围：
<li>audio：纯音频；</li>
<li>video：视频（可能包含音频流）。</li>
     * @param Type 子流类型，取值范围：
<li>audio：纯音频；</li>
<li>video：视频（可能包含音频流）。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当子流为视频流时，视频画面宽度，单位：px。 
     * @return Width 当子流为视频流时，视频画面宽度，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 当子流为视频流时，视频画面宽度，单位：px。
     * @param Width 当子流为视频流时，视频画面宽度，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 当子流为视频流时，视频画面高度，单位：px。 
     * @return Height 当子流为视频流时，视频画面高度，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 当子流为视频流时，视频画面高度，单位：px。
     * @param Height 当子流为视频流时，视频画面高度，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 子流媒体文件大小，单位：Byte。
<font color=red>注意：</font>在 2023-02-09T16:00:00Z 前处理生成的自适应码流文件此字段为0。 
     * @return Size 子流媒体文件大小，单位：Byte。
<font color=red>注意：</font>在 2023-02-09T16:00:00Z 前处理生成的自适应码流文件此字段为0。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 子流媒体文件大小，单位：Byte。
<font color=red>注意：</font>在 2023-02-09T16:00:00Z 前处理生成的自适应码流文件此字段为0。
     * @param Size 子流媒体文件大小，单位：Byte。
<font color=red>注意：</font>在 2023-02-09T16:00:00Z 前处理生成的自适应码流文件此字段为0。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public MediaSubStreamInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubStreamInfoItem(MediaSubStreamInfoItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

