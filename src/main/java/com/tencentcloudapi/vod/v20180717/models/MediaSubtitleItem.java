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

public class MediaSubtitleItem extends AbstractModel {

    /**
    * 字幕的唯一标识。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 字幕名字。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字幕语言。常见的取值如下：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646)
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * 字幕格式。取值范围如下：
<li>vtt</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 字幕 URL。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 字幕来源，取值范围：
<li>UserUploaded：用户上传；</li>
<li>AIRecognition：AI 识别，通过语音识别或语音翻译生成。</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
     * Get 字幕的唯一标识。 
     * @return Id 字幕的唯一标识。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 字幕的唯一标识。
     * @param Id 字幕的唯一标识。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 字幕名字。 
     * @return Name 字幕名字。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字幕名字。
     * @param Name 字幕名字。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字幕语言。常见的取值如下：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646) 
     * @return Language 字幕语言。常见的取值如下：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646)
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 字幕语言。常见的取值如下：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646)
     * @param Language 字幕语言。常见的取值如下：
<li>zh：中文；</li>
<li>en：英文；</li>
<li>ja：日文；</li>
<li>ko：韩文；</li>
<li>vi：越南语；</li>
<li>ms：马来语；</li>
<li>th：泰语；</li>
<li>pt：葡萄牙语；</li>
<li>tr：土耳其语；</li>
<li>ar：阿拉伯语；</li>
<li>es：西班牙语；</li>
<li>hi：印地语；</li>
<li>fr：法语。</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646)
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get 字幕格式。取值范围如下：
<li>vtt</li> 
     * @return Format 字幕格式。取值范围如下：
<li>vtt</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 字幕格式。取值范围如下：
<li>vtt</li>
     * @param Format 字幕格式。取值范围如下：
<li>vtt</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 字幕 URL。 
     * @return Url 字幕 URL。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 字幕 URL。
     * @param Url 字幕 URL。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 字幕来源，取值范围：
<li>UserUploaded：用户上传；</li>
<li>AIRecognition：AI 识别，通过语音识别或语音翻译生成。</li> 
     * @return Source 字幕来源，取值范围：
<li>UserUploaded：用户上传；</li>
<li>AIRecognition：AI 识别，通过语音识别或语音翻译生成。</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 字幕来源，取值范围：
<li>UserUploaded：用户上传；</li>
<li>AIRecognition：AI 识别，通过语音识别或语音翻译生成。</li>
     * @param Source 字幕来源，取值范围：
<li>UserUploaded：用户上传；</li>
<li>AIRecognition：AI 识别，通过语音识别或语音翻译生成。</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    public MediaSubtitleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubtitleItem(MediaSubtitleItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

