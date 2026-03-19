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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartEraseSubtitleConfig extends AbstractModel {

    /**
    * <p>字幕擦除方式。<br><strong>自动擦除：</strong>通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。<br>当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。<br>当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。</p><ul><li>auto 自动擦除</li><li>custom 指定区域擦除</li></ul>
    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * <p>字幕擦除模型。<br><strong>标准版（推荐）：</strong>若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。<br><strong>区域版：</strong>若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。</p><ul><li>standard 标准模型</li><li>area 区域模型</li></ul>
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * <p>是否开启OCR字幕提取，默认取OFF。<br>当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * <p>字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>zh_en 中英文</li><li>multi 其他<br>其他具体支持识别如下语言：<br>中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语</li></ul>
    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * <p>字幕文件格式，默认取vtt；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>srt srt格式</li><li>vtt WebVTT格式</li><li>当填写SubtitleEmbedId时可以取值空字符串，表示不输出字幕文件</li></ul>
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>是否开启字幕翻译，默认取OFF；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * <p>字幕翻译目标语言，默认取en；仅当TransSwitch取&quot;ON&quot;时生效。<br>当前支持以下语言：<br>zh：简体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印度尼西亚语<br>ms：马来语<br>th：泰语<br>ar：阿拉伯语<br>hi：印地语</p>
    */
    @SerializedName("TransDstLang")
    @Expose
    private String TransDstLang;

    /**
    * <p>自动擦除自定义区域。<br>对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。<br>注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * <p>指定擦除自定义区域。<br>对选定区域，在选定时间段内不进行检测识别直接进行擦除。<br>注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
    * <p>字幕压制模板id，只有开启OCR翻译时可以填写</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>压制配置，默认开启1, 把字幕压制回原字幕位置。只有开启OCR翻译时可以填写，取0时表示不开启压回原位</p>
    */
    @SerializedName("UseOriginalPos")
    @Expose
    private Long UseOriginalPos;

    /**
    * <p>压制配置，默认开启1, 开启后使用原字幕字号。只有开启OCR翻译时可以填写，取0时表示不使用原字号</p>
    */
    @SerializedName("UseOriginalSize")
    @Expose
    private Long UseOriginalSize;

    /**
     * Get <p>字幕擦除方式。<br><strong>自动擦除：</strong>通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。<br>当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。<br>当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。</p><ul><li>auto 自动擦除</li><li>custom 指定区域擦除</li></ul> 
     * @return SubtitleEraseMethod <p>字幕擦除方式。<br><strong>自动擦除：</strong>通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。<br>当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。<br>当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。</p><ul><li>auto 自动擦除</li><li>custom 指定区域擦除</li></ul>
     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set <p>字幕擦除方式。<br><strong>自动擦除：</strong>通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。<br>当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。<br>当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。</p><ul><li>auto 自动擦除</li><li>custom 指定区域擦除</li></ul>
     * @param SubtitleEraseMethod <p>字幕擦除方式。<br><strong>自动擦除：</strong>通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。<br>当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。<br><strong>指定区域擦除：</strong>若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。<br>当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。</p><ul><li>auto 自动擦除</li><li>custom 指定区域擦除</li></ul>
     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get <p>字幕擦除模型。<br><strong>标准版（推荐）：</strong>若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。<br><strong>区域版：</strong>若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。</p><ul><li>standard 标准模型</li><li>area 区域模型</li></ul> 
     * @return SubtitleModel <p>字幕擦除模型。<br><strong>标准版（推荐）：</strong>若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。<br><strong>区域版：</strong>若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。</p><ul><li>standard 标准模型</li><li>area 区域模型</li></ul>
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set <p>字幕擦除模型。<br><strong>标准版（推荐）：</strong>若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。<br><strong>区域版：</strong>若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。</p><ul><li>standard 标准模型</li><li>area 区域模型</li></ul>
     * @param SubtitleModel <p>字幕擦除模型。<br><strong>标准版（推荐）：</strong>若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。<br><strong>区域版：</strong>若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。</p><ul><li>standard 标准模型</li><li>area 区域模型</li></ul>
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get <p>是否开启OCR字幕提取，默认取OFF。<br>当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul> 
     * @return OcrSwitch <p>是否开启OCR字幕提取，默认取OFF。<br>当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set <p>是否开启OCR字幕提取，默认取OFF。<br>当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
     * @param OcrSwitch <p>是否开启OCR字幕提取，默认取OFF。<br>当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get <p>字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>zh_en 中英文</li><li>multi 其他<br>其他具体支持识别如下语言：<br>中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语</li></ul> 
     * @return SubtitleLang <p>字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>zh_en 中英文</li><li>multi 其他<br>其他具体支持识别如下语言：<br>中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语</li></ul>
     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set <p>字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>zh_en 中英文</li><li>multi 其他<br>其他具体支持识别如下语言：<br>中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语</li></ul>
     * @param SubtitleLang <p>字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>zh_en 中英文</li><li>multi 其他<br>其他具体支持识别如下语言：<br>中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语</li></ul>
     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get <p>字幕文件格式，默认取vtt；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>srt srt格式</li><li>vtt WebVTT格式</li><li>当填写SubtitleEmbedId时可以取值空字符串，表示不输出字幕文件</li></ul> 
     * @return SubtitleFormat <p>字幕文件格式，默认取vtt；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>srt srt格式</li><li>vtt WebVTT格式</li><li>当填写SubtitleEmbedId时可以取值空字符串，表示不输出字幕文件</li></ul>
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>字幕文件格式，默认取vtt；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>srt srt格式</li><li>vtt WebVTT格式</li><li>当填写SubtitleEmbedId时可以取值空字符串，表示不输出字幕文件</li></ul>
     * @param SubtitleFormat <p>字幕文件格式，默认取vtt；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>srt srt格式</li><li>vtt WebVTT格式</li><li>当填写SubtitleEmbedId时可以取值空字符串，表示不输出字幕文件</li></ul>
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>是否开启字幕翻译，默认取OFF；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul> 
     * @return TransSwitch <p>是否开启字幕翻译，默认取OFF；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set <p>是否开启字幕翻译，默认取OFF；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
     * @param TransSwitch <p>是否开启字幕翻译，默认取OFF；仅当OcrSwitch取&quot;ON&quot;时生效。</p><ul><li>ON 开启</li><li>OFF 关闭</li></ul>
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get <p>字幕翻译目标语言，默认取en；仅当TransSwitch取&quot;ON&quot;时生效。<br>当前支持以下语言：<br>zh：简体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印度尼西亚语<br>ms：马来语<br>th：泰语<br>ar：阿拉伯语<br>hi：印地语</p> 
     * @return TransDstLang <p>字幕翻译目标语言，默认取en；仅当TransSwitch取&quot;ON&quot;时生效。<br>当前支持以下语言：<br>zh：简体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印度尼西亚语<br>ms：马来语<br>th：泰语<br>ar：阿拉伯语<br>hi：印地语</p>
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set <p>字幕翻译目标语言，默认取en；仅当TransSwitch取&quot;ON&quot;时生效。<br>当前支持以下语言：<br>zh：简体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印度尼西亚语<br>ms：马来语<br>th：泰语<br>ar：阿拉伯语<br>hi：印地语</p>
     * @param TransDstLang <p>字幕翻译目标语言，默认取en；仅当TransSwitch取&quot;ON&quot;时生效。<br>当前支持以下语言：<br>zh：简体中文<br>en：英语<br>ja：日语<br>ko：韩语<br>fr：法语<br>es：西班牙语<br>it：意大利语<br>de：德语<br>tr：土耳其语<br>ru：俄语<br>pt：葡萄牙语<br>vi：越南语<br>id：印度尼西亚语<br>ms：马来语<br>th：泰语<br>ar：阿拉伯语<br>hi：印地语</p>
     */
    public void setTransDstLang(String TransDstLang) {
        this.TransDstLang = TransDstLang;
    }

    /**
     * Get <p>自动擦除自定义区域。<br>对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。<br>注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p> 
     * @return AutoAreas <p>自动擦除自定义区域。<br>对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。<br>注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set <p>自动擦除自定义区域。<br>对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。<br>注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     * @param AutoAreas <p>自动擦除自定义区域。<br>对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。<br>注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get <p>指定擦除自定义区域。<br>对选定区域，在选定时间段内不进行检测识别直接进行擦除。<br>注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p> 
     * @return CustomAreas <p>指定擦除自定义区域。<br>对选定区域，在选定时间段内不进行检测识别直接进行擦除。<br>注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set <p>指定擦除自定义区域。<br>对选定区域，在选定时间段内不进行检测识别直接进行擦除。<br>注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     * @param CustomAreas <p>指定擦除自定义区域。<br>对选定区域，在选定时间段内不进行检测识别直接进行擦除。<br>注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。</p>
     */
    public void setCustomAreas(EraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
    }

    /**
     * Get <p>字幕压制模板id，只有开启OCR翻译时可以填写</p> 
     * @return SubtitleEmbedId <p>字幕压制模板id，只有开启OCR翻译时可以填写</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>字幕压制模板id，只有开启OCR翻译时可以填写</p>
     * @param SubtitleEmbedId <p>字幕压制模板id，只有开启OCR翻译时可以填写</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>压制配置，默认开启1, 把字幕压制回原字幕位置。只有开启OCR翻译时可以填写，取0时表示不开启压回原位</p> 
     * @return UseOriginalPos <p>压制配置，默认开启1, 把字幕压制回原字幕位置。只有开启OCR翻译时可以填写，取0时表示不开启压回原位</p>
     */
    public Long getUseOriginalPos() {
        return this.UseOriginalPos;
    }

    /**
     * Set <p>压制配置，默认开启1, 把字幕压制回原字幕位置。只有开启OCR翻译时可以填写，取0时表示不开启压回原位</p>
     * @param UseOriginalPos <p>压制配置，默认开启1, 把字幕压制回原字幕位置。只有开启OCR翻译时可以填写，取0时表示不开启压回原位</p>
     */
    public void setUseOriginalPos(Long UseOriginalPos) {
        this.UseOriginalPos = UseOriginalPos;
    }

    /**
     * Get <p>压制配置，默认开启1, 开启后使用原字幕字号。只有开启OCR翻译时可以填写，取0时表示不使用原字号</p> 
     * @return UseOriginalSize <p>压制配置，默认开启1, 开启后使用原字幕字号。只有开启OCR翻译时可以填写，取0时表示不使用原字号</p>
     */
    public Long getUseOriginalSize() {
        return this.UseOriginalSize;
    }

    /**
     * Set <p>压制配置，默认开启1, 开启后使用原字幕字号。只有开启OCR翻译时可以填写，取0时表示不使用原字号</p>
     * @param UseOriginalSize <p>压制配置，默认开启1, 开启后使用原字幕字号。只有开启OCR翻译时可以填写，取0时表示不使用原字号</p>
     */
    public void setUseOriginalSize(Long UseOriginalSize) {
        this.UseOriginalSize = UseOriginalSize;
    }

    public SmartEraseSubtitleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartEraseSubtitleConfig(SmartEraseSubtitleConfig source) {
        if (source.SubtitleEraseMethod != null) {
            this.SubtitleEraseMethod = new String(source.SubtitleEraseMethod);
        }
        if (source.SubtitleModel != null) {
            this.SubtitleModel = new String(source.SubtitleModel);
        }
        if (source.OcrSwitch != null) {
            this.OcrSwitch = new String(source.OcrSwitch);
        }
        if (source.SubtitleLang != null) {
            this.SubtitleLang = new String(source.SubtitleLang);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TransSwitch != null) {
            this.TransSwitch = new String(source.TransSwitch);
        }
        if (source.TransDstLang != null) {
            this.TransDstLang = new String(source.TransDstLang);
        }
        if (source.AutoAreas != null) {
            this.AutoAreas = new EraseArea[source.AutoAreas.length];
            for (int i = 0; i < source.AutoAreas.length; i++) {
                this.AutoAreas[i] = new EraseArea(source.AutoAreas[i]);
            }
        }
        if (source.CustomAreas != null) {
            this.CustomAreas = new EraseTimeArea[source.CustomAreas.length];
            for (int i = 0; i < source.CustomAreas.length; i++) {
                this.CustomAreas[i] = new EraseTimeArea(source.CustomAreas[i]);
            }
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.UseOriginalPos != null) {
            this.UseOriginalPos = new Long(source.UseOriginalPos);
        }
        if (source.UseOriginalSize != null) {
            this.UseOriginalSize = new Long(source.UseOriginalSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleEraseMethod", this.SubtitleEraseMethod);
        this.setParamSimple(map, prefix + "SubtitleModel", this.SubtitleModel);
        this.setParamSimple(map, prefix + "OcrSwitch", this.OcrSwitch);
        this.setParamSimple(map, prefix + "SubtitleLang", this.SubtitleLang);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TransSwitch", this.TransSwitch);
        this.setParamSimple(map, prefix + "TransDstLang", this.TransDstLang);
        this.setParamArrayObj(map, prefix + "AutoAreas.", this.AutoAreas);
        this.setParamArrayObj(map, prefix + "CustomAreas.", this.CustomAreas);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "UseOriginalPos", this.UseOriginalPos);
        this.setParamSimple(map, prefix + "UseOriginalSize", this.UseOriginalSize);

    }
}

