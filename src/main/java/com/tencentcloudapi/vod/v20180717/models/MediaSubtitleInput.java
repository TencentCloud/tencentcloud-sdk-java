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

public class MediaSubtitleInput extends AbstractModel{

    /**
    * 字幕名字，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字幕语言。常见的取值如下：
<li>cn：中文</li>
<li>ja：日文</li>
<li>en-US：英文</li>
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
    * 字幕内容，进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 字幕的唯一标识。长度不能超过16个字符，可以使用大小写字母、数字、下划线（_）或横杠（-）。不能与媒资文件中现有字幕的唯一标识重复。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 字幕名字，长度限制：64 个字符。 
     * @return Name 字幕名字，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字幕名字，长度限制：64 个字符。
     * @param Name 字幕名字，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字幕语言。常见的取值如下：
<li>cn：中文</li>
<li>ja：日文</li>
<li>en-US：英文</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646) 
     * @return Language 字幕语言。常见的取值如下：
<li>cn：中文</li>
<li>ja：日文</li>
<li>en-US：英文</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646)
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set 字幕语言。常见的取值如下：
<li>cn：中文</li>
<li>ja：日文</li>
<li>en-US：英文</li>
其他取值参考 [RFC5646](https://tools.ietf.org/html/rfc5646)
     * @param Language 字幕语言。常见的取值如下：
<li>cn：中文</li>
<li>ja：日文</li>
<li>en-US：英文</li>
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
     * Get 字幕内容，进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。 
     * @return Content 字幕内容，进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 字幕内容，进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。
     * @param Content 字幕内容，进行 [Base64](https://tools.ietf.org/html/rfc4648) 编码后的字符串。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 字幕的唯一标识。长度不能超过16个字符，可以使用大小写字母、数字、下划线（_）或横杠（-）。不能与媒资文件中现有字幕的唯一标识重复。 
     * @return Id 字幕的唯一标识。长度不能超过16个字符，可以使用大小写字母、数字、下划线（_）或横杠（-）。不能与媒资文件中现有字幕的唯一标识重复。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 字幕的唯一标识。长度不能超过16个字符，可以使用大小写字母、数字、下划线（_）或横杠（-）。不能与媒资文件中现有字幕的唯一标识重复。
     * @param Id 字幕的唯一标识。长度不能超过16个字符，可以使用大小写字母、数字、下划线（_）或横杠（-）。不能与媒资文件中现有字幕的唯一标识重复。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public MediaSubtitleInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubtitleInput(MediaSubtitleInput source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

