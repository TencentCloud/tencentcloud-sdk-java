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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextWritingRequest extends AbstractModel{

    /**
    * 待续写的句子，文本统一使用utf-8格式编码，长度不超过200字符。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 待续写文本的语言类型，支持语言如下：
zh：中文
en：英文
    */
    @SerializedName("SourceLang")
    @Expose
    private String SourceLang;

    /**
    * 返回续写结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 指定续写领域，支持领域如下：
general：通用领域，支持中英文补全
academic：学术领域，仅支持英文补全
默认为general（通用领域）。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 指定续写风格，支持风格如下：
science_fiction：科幻
military_history：军事
xuanhuan_wuxia：武侠
urban_officialdom：职场
默认为xuanhuan_wuxia（武侠）。
    */
    @SerializedName("Style")
    @Expose
    private String Style;

    /**
     * Get 待续写的句子，文本统一使用utf-8格式编码，长度不超过200字符。 
     * @return Text 待续写的句子，文本统一使用utf-8格式编码，长度不超过200字符。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 待续写的句子，文本统一使用utf-8格式编码，长度不超过200字符。
     * @param Text 待续写的句子，文本统一使用utf-8格式编码，长度不超过200字符。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 待续写文本的语言类型，支持语言如下：
zh：中文
en：英文 
     * @return SourceLang 待续写文本的语言类型，支持语言如下：
zh：中文
en：英文
     */
    public String getSourceLang() {
        return this.SourceLang;
    }

    /**
     * Set 待续写文本的语言类型，支持语言如下：
zh：中文
en：英文
     * @param SourceLang 待续写文本的语言类型，支持语言如下：
zh：中文
en：英文
     */
    public void setSourceLang(String SourceLang) {
        this.SourceLang = SourceLang;
    }

    /**
     * Get 返回续写结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数） 
     * @return Number 返回续写结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 返回续写结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     * @param Number 返回续写结果的个数。数量需>=1且<=5。
（注意实际结果可能小于指定个数）
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 指定续写领域，支持领域如下：
general：通用领域，支持中英文补全
academic：学术领域，仅支持英文补全
默认为general（通用领域）。 
     * @return Domain 指定续写领域，支持领域如下：
general：通用领域，支持中英文补全
academic：学术领域，仅支持英文补全
默认为general（通用领域）。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定续写领域，支持领域如下：
general：通用领域，支持中英文补全
academic：学术领域，仅支持英文补全
默认为general（通用领域）。
     * @param Domain 指定续写领域，支持领域如下：
general：通用领域，支持中英文补全
academic：学术领域，仅支持英文补全
默认为general（通用领域）。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 指定续写风格，支持风格如下：
science_fiction：科幻
military_history：军事
xuanhuan_wuxia：武侠
urban_officialdom：职场
默认为xuanhuan_wuxia（武侠）。 
     * @return Style 指定续写风格，支持风格如下：
science_fiction：科幻
military_history：军事
xuanhuan_wuxia：武侠
urban_officialdom：职场
默认为xuanhuan_wuxia（武侠）。
     */
    public String getStyle() {
        return this.Style;
    }

    /**
     * Set 指定续写风格，支持风格如下：
science_fiction：科幻
military_history：军事
xuanhuan_wuxia：武侠
urban_officialdom：职场
默认为xuanhuan_wuxia（武侠）。
     * @param Style 指定续写风格，支持风格如下：
science_fiction：科幻
military_history：军事
xuanhuan_wuxia：武侠
urban_officialdom：职场
默认为xuanhuan_wuxia（武侠）。
     */
    public void setStyle(String Style) {
        this.Style = Style;
    }

    public TextWritingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextWritingRequest(TextWritingRequest source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.SourceLang != null) {
            this.SourceLang = new String(source.SourceLang);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Style != null) {
            this.Style = new String(source.Style);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "SourceLang", this.SourceLang);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Style", this.Style);

    }
}

