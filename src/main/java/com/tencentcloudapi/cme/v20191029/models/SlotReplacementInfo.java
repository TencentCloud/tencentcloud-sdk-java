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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlotReplacementInfo extends AbstractModel{

    /**
    * 卡槽 Id。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 替换类型，可取值有：
<li> AUDIO ：音频；</li>
<li> VIDEO ：视频；</li>
<li> IMAGE ：图片；</li>
<li> TEXT ：文本。</li>
注意：这里必须保证替换的素材类型与模板轨道数据的素材类型一致。如果替换的类型为Text,，则必须保证模板轨道数据中相应卡槽的位置标记的是文本。
    */
    @SerializedName("ReplacementType")
    @Expose
    private String ReplacementType;

    /**
    * 媒体替换信息，仅当要替换的媒体类型为音频、视频、图片时有效。
    */
    @SerializedName("MediaReplacementInfo")
    @Expose
    private MediaReplacementInfo MediaReplacementInfo;

    /**
    * 文本替换信息，仅当要替换的卡槽类型为文本时有效。
    */
    @SerializedName("TextReplacementInfo")
    @Expose
    private TextReplacementInfo TextReplacementInfo;

    /**
     * Get 卡槽 Id。 
     * @return Id 卡槽 Id。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 卡槽 Id。
     * @param Id 卡槽 Id。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 替换类型，可取值有：
<li> AUDIO ：音频；</li>
<li> VIDEO ：视频；</li>
<li> IMAGE ：图片；</li>
<li> TEXT ：文本。</li>
注意：这里必须保证替换的素材类型与模板轨道数据的素材类型一致。如果替换的类型为Text,，则必须保证模板轨道数据中相应卡槽的位置标记的是文本。 
     * @return ReplacementType 替换类型，可取值有：
<li> AUDIO ：音频；</li>
<li> VIDEO ：视频；</li>
<li> IMAGE ：图片；</li>
<li> TEXT ：文本。</li>
注意：这里必须保证替换的素材类型与模板轨道数据的素材类型一致。如果替换的类型为Text,，则必须保证模板轨道数据中相应卡槽的位置标记的是文本。
     */
    public String getReplacementType() {
        return this.ReplacementType;
    }

    /**
     * Set 替换类型，可取值有：
<li> AUDIO ：音频；</li>
<li> VIDEO ：视频；</li>
<li> IMAGE ：图片；</li>
<li> TEXT ：文本。</li>
注意：这里必须保证替换的素材类型与模板轨道数据的素材类型一致。如果替换的类型为Text,，则必须保证模板轨道数据中相应卡槽的位置标记的是文本。
     * @param ReplacementType 替换类型，可取值有：
<li> AUDIO ：音频；</li>
<li> VIDEO ：视频；</li>
<li> IMAGE ：图片；</li>
<li> TEXT ：文本。</li>
注意：这里必须保证替换的素材类型与模板轨道数据的素材类型一致。如果替换的类型为Text,，则必须保证模板轨道数据中相应卡槽的位置标记的是文本。
     */
    public void setReplacementType(String ReplacementType) {
        this.ReplacementType = ReplacementType;
    }

    /**
     * Get 媒体替换信息，仅当要替换的媒体类型为音频、视频、图片时有效。 
     * @return MediaReplacementInfo 媒体替换信息，仅当要替换的媒体类型为音频、视频、图片时有效。
     */
    public MediaReplacementInfo getMediaReplacementInfo() {
        return this.MediaReplacementInfo;
    }

    /**
     * Set 媒体替换信息，仅当要替换的媒体类型为音频、视频、图片时有效。
     * @param MediaReplacementInfo 媒体替换信息，仅当要替换的媒体类型为音频、视频、图片时有效。
     */
    public void setMediaReplacementInfo(MediaReplacementInfo MediaReplacementInfo) {
        this.MediaReplacementInfo = MediaReplacementInfo;
    }

    /**
     * Get 文本替换信息，仅当要替换的卡槽类型为文本时有效。 
     * @return TextReplacementInfo 文本替换信息，仅当要替换的卡槽类型为文本时有效。
     */
    public TextReplacementInfo getTextReplacementInfo() {
        return this.TextReplacementInfo;
    }

    /**
     * Set 文本替换信息，仅当要替换的卡槽类型为文本时有效。
     * @param TextReplacementInfo 文本替换信息，仅当要替换的卡槽类型为文本时有效。
     */
    public void setTextReplacementInfo(TextReplacementInfo TextReplacementInfo) {
        this.TextReplacementInfo = TextReplacementInfo;
    }

    public SlotReplacementInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlotReplacementInfo(SlotReplacementInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ReplacementType != null) {
            this.ReplacementType = new String(source.ReplacementType);
        }
        if (source.MediaReplacementInfo != null) {
            this.MediaReplacementInfo = new MediaReplacementInfo(source.MediaReplacementInfo);
        }
        if (source.TextReplacementInfo != null) {
            this.TextReplacementInfo = new TextReplacementInfo(source.TextReplacementInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ReplacementType", this.ReplacementType);
        this.setParamObj(map, prefix + "MediaReplacementInfo.", this.MediaReplacementInfo);
        this.setParamObj(map, prefix + "TextReplacementInfo.", this.TextReplacementInfo);

    }
}

