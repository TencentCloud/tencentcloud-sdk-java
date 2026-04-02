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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTranslateRequest extends AbstractModel {

    /**
    * <p>待翻译的文本，文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本可能会翻译失败。单次请求的文本长度需要低于6000字符。</p>
    */
    @SerializedName("SourceText")
    @Expose
    private String SourceText;

    /**
    * <p>源语言，支持：<br>zh：简体中文<br>zh-TW：繁体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印尼语<br>th：泰语<br>ms：马来西亚语<br>ar：阿拉伯语<br>hi：印地语</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>目标语言，各源语言的目标语言支持列表如下</p><li> zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）</li><li>ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）</li><li>ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）</li><li>fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）</li><li>ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）</li><li>pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）</li><li>vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ar（阿拉伯语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>hi（印地语）：en（英语）</li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>用来标记不希望被翻译的文本内容，如句子中的特殊符号、人名、地名等；每次请求只支持配置一个不被翻译的单词；仅支持配置人名、地名等名词，不要配置动词或短语，否则会影响翻译结果。</p>
    */
    @SerializedName("UntranslatedText")
    @Expose
    private String UntranslatedText;

    /**
    * <p>需要使用的术语库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107926">术语库操作指南</a> 自行创建术语库获取。</p>
    */
    @SerializedName("TermRepoIDList")
    @Expose
    private String [] TermRepoIDList;

    /**
    * <p>需要使用的例句库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107927">例句库操作指南</a> 自行创建例句库获取。</p>
    */
    @SerializedName("SentRepoIDList")
    @Expose
    private String [] SentRepoIDList;

    /**
     * Get <p>待翻译的文本，文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本可能会翻译失败。单次请求的文本长度需要低于6000字符。</p> 
     * @return SourceText <p>待翻译的文本，文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本可能会翻译失败。单次请求的文本长度需要低于6000字符。</p>
     */
    public String getSourceText() {
        return this.SourceText;
    }

    /**
     * Set <p>待翻译的文本，文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本可能会翻译失败。单次请求的文本长度需要低于6000字符。</p>
     * @param SourceText <p>待翻译的文本，文本统一使用utf-8格式编码，非utf-8格式编码字符会翻译失败，请传入有效文本，html标记等非常规翻译文本可能会翻译失败。单次请求的文本长度需要低于6000字符。</p>
     */
    public void setSourceText(String SourceText) {
        this.SourceText = SourceText;
    }

    /**
     * Get <p>源语言，支持：<br>zh：简体中文<br>zh-TW：繁体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印尼语<br>th：泰语<br>ms：马来西亚语<br>ar：阿拉伯语<br>hi：印地语</p> 
     * @return Source <p>源语言，支持：<br>zh：简体中文<br>zh-TW：繁体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印尼语<br>th：泰语<br>ms：马来西亚语<br>ar：阿拉伯语<br>hi：印地语</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>源语言，支持：<br>zh：简体中文<br>zh-TW：繁体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印尼语<br>th：泰语<br>ms：马来西亚语<br>ar：阿拉伯语<br>hi：印地语</p>
     * @param Source <p>源语言，支持：<br>zh：简体中文<br>zh-TW：繁体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印尼语<br>th：泰语<br>ms：马来西亚语<br>ar：阿拉伯语<br>hi：印地语</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标语言，各源语言的目标语言支持列表如下</p><li> zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）</li><li>ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）</li><li>ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）</li><li>fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）</li><li>ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）</li><li>pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）</li><li>vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ar（阿拉伯语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>hi（印地语）：en（英语）</li> 
     * @return Target <p>目标语言，各源语言的目标语言支持列表如下</p><li> zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）</li><li>ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）</li><li>ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）</li><li>fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）</li><li>ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）</li><li>pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）</li><li>vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ar（阿拉伯语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>hi（印地语）：en（英语）</li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标语言，各源语言的目标语言支持列表如下</p><li> zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）</li><li>ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）</li><li>ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）</li><li>fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）</li><li>ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）</li><li>pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）</li><li>vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ar（阿拉伯语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>hi（印地语）：en（英语）</li>
     * @param Target <p>目标语言，各源语言的目标语言支持列表如下</p><li> zh（简体中文）：zh-TW（繁体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>zh-TW（繁体中文）：zh（简体中文）、en（英语）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）</li><li>en（英语）：zh（中文）、zh-TW（繁体中文）、ja（日语）、ko（韩语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）、vi（越南语）、id（印尼语）、th（泰语）、ms（马来语）、ar（阿拉伯语）、hi（印地语）</li><li>ja（日语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ko（韩语）</li><li>ko（韩语）：zh（中文）、zh-TW（繁体中文）、en（英语）、ja（日语）</li><li>fr（法语）：zh（中文）、zh-TW（繁体中文）、en（英语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>es（西班牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>it（意大利语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、de（德语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>de（德语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、tr（土耳其语）、ru（俄语）、pt（葡萄牙语）</li><li>tr（土耳其语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、ru（俄语）、pt（葡萄牙语）</li><li>ru（俄语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、pt（葡萄牙语）</li><li>pt（葡萄牙语）：zh（中文）、zh-TW（繁体中文）、en（英语）、fr（法语）、es（西班牙语）、it（意大利语）、de（德语）、tr（土耳其语）、ru（俄语）</li><li>vi（越南语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>id（印尼语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>th（泰语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ms（马来语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>ar（阿拉伯语）：zh（中文）、zh-TW（繁体中文）、en（英语）</li><li>hi（印地语）：en（英语）</li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0</p> 
     * @return ProjectId <p>项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0</p>
     * @param ProjectId <p>项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>用来标记不希望被翻译的文本内容，如句子中的特殊符号、人名、地名等；每次请求只支持配置一个不被翻译的单词；仅支持配置人名、地名等名词，不要配置动词或短语，否则会影响翻译结果。</p> 
     * @return UntranslatedText <p>用来标记不希望被翻译的文本内容，如句子中的特殊符号、人名、地名等；每次请求只支持配置一个不被翻译的单词；仅支持配置人名、地名等名词，不要配置动词或短语，否则会影响翻译结果。</p>
     */
    public String getUntranslatedText() {
        return this.UntranslatedText;
    }

    /**
     * Set <p>用来标记不希望被翻译的文本内容，如句子中的特殊符号、人名、地名等；每次请求只支持配置一个不被翻译的单词；仅支持配置人名、地名等名词，不要配置动词或短语，否则会影响翻译结果。</p>
     * @param UntranslatedText <p>用来标记不希望被翻译的文本内容，如句子中的特殊符号、人名、地名等；每次请求只支持配置一个不被翻译的单词；仅支持配置人名、地名等名词，不要配置动词或短语，否则会影响翻译结果。</p>
     */
    public void setUntranslatedText(String UntranslatedText) {
        this.UntranslatedText = UntranslatedText;
    }

    /**
     * Get <p>需要使用的术语库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107926">术语库操作指南</a> 自行创建术语库获取。</p> 
     * @return TermRepoIDList <p>需要使用的术语库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107926">术语库操作指南</a> 自行创建术语库获取。</p>
     */
    public String [] getTermRepoIDList() {
        return this.TermRepoIDList;
    }

    /**
     * Set <p>需要使用的术语库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107926">术语库操作指南</a> 自行创建术语库获取。</p>
     * @param TermRepoIDList <p>需要使用的术语库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107926">术语库操作指南</a> 自行创建术语库获取。</p>
     */
    public void setTermRepoIDList(String [] TermRepoIDList) {
        this.TermRepoIDList = TermRepoIDList;
    }

    /**
     * Get <p>需要使用的例句库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107927">例句库操作指南</a> 自行创建例句库获取。</p> 
     * @return SentRepoIDList <p>需要使用的例句库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107927">例句库操作指南</a> 自行创建例句库获取。</p>
     */
    public String [] getSentRepoIDList() {
        return this.SentRepoIDList;
    }

    /**
     * Set <p>需要使用的例句库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107927">例句库操作指南</a> 自行创建例句库获取。</p>
     * @param SentRepoIDList <p>需要使用的例句库列表，通过 <a href="https://cloud.tencent.com/document/product/551/107927">例句库操作指南</a> 自行创建例句库获取。</p>
     */
    public void setSentRepoIDList(String [] SentRepoIDList) {
        this.SentRepoIDList = SentRepoIDList;
    }

    public TextTranslateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTranslateRequest(TextTranslateRequest source) {
        if (source.SourceText != null) {
            this.SourceText = new String(source.SourceText);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.UntranslatedText != null) {
            this.UntranslatedText = new String(source.UntranslatedText);
        }
        if (source.TermRepoIDList != null) {
            this.TermRepoIDList = new String[source.TermRepoIDList.length];
            for (int i = 0; i < source.TermRepoIDList.length; i++) {
                this.TermRepoIDList[i] = new String(source.TermRepoIDList[i]);
            }
        }
        if (source.SentRepoIDList != null) {
            this.SentRepoIDList = new String[source.SentRepoIDList.length];
            for (int i = 0; i < source.SentRepoIDList.length; i++) {
                this.SentRepoIDList[i] = new String(source.SentRepoIDList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceText", this.SourceText);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "UntranslatedText", this.UntranslatedText);
        this.setParamArraySimple(map, prefix + "TermRepoIDList.", this.TermRepoIDList);
        this.setParamArraySimple(map, prefix + "SentRepoIDList.", this.SentRepoIDList);

    }
}

