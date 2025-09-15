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
    * 字幕擦除方式。
**自动擦除：**通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。
当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。
**指定区域擦除：**若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。
当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。
- auto 自动擦除
- custom 指定区域擦除

    */
    @SerializedName("SubtitleEraseMethod")
    @Expose
    private String SubtitleEraseMethod;

    /**
    * 字幕擦除模型。
**标准版（推荐）：**若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。
**区域版：**若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。
- standard 标准模型
- area 区域模型
    */
    @SerializedName("SubtitleModel")
    @Expose
    private String SubtitleModel;

    /**
    * 是否开启OCR字幕提取，默认取OFF。
当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。
- ON 开启
- OFF 关闭
    */
    @SerializedName("OcrSwitch")
    @Expose
    private String OcrSwitch;

    /**
    * 字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取"ON"时生效。
- zh_en 中英文
- multi 其他
其他具体支持识别如下语言：
中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语


    */
    @SerializedName("SubtitleLang")
    @Expose
    private String SubtitleLang;

    /**
    * 字幕文件格式，默认取vtt；仅当OcrSwitch取"ON"时生效。
- srt srt格式
- vtt WebVTT格式
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 是否开启字幕翻译，默认取OFF；仅当OcrSwitch取"ON"时生效。
- ON 开启
- OFF 关闭
    */
    @SerializedName("TransSwitch")
    @Expose
    private String TransSwitch;

    /**
    * 字幕翻译目标语言，默认取en；仅当TransSwitch取"ON"时生效。
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
    */
    @SerializedName("TransDstLang")
    @Expose
    private String TransDstLang;

    /**
    * 自动擦除自定义区域。
对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。
注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
    */
    @SerializedName("AutoAreas")
    @Expose
    private EraseArea [] AutoAreas;

    /**
    * 指定擦除自定义区域。
对选定区域，在选定时间段内不进行检测识别直接进行擦除。
注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
    */
    @SerializedName("CustomAreas")
    @Expose
    private EraseTimeArea [] CustomAreas;

    /**
     * Get 字幕擦除方式。
**自动擦除：**通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。
当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。
**指定区域擦除：**若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。
当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。
- auto 自动擦除
- custom 指定区域擦除
 
     * @return SubtitleEraseMethod 字幕擦除方式。
**自动擦除：**通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。
当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。
**指定区域擦除：**若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。
当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。
- auto 自动擦除
- custom 指定区域擦除

     */
    public String getSubtitleEraseMethod() {
        return this.SubtitleEraseMethod;
    }

    /**
     * Set 字幕擦除方式。
**自动擦除：**通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。
当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。
**指定区域擦除：**若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。
当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。
- auto 自动擦除
- custom 指定区域擦除

     * @param SubtitleEraseMethod 字幕擦除方式。
**自动擦除：**通过AI模型自动识别视频中的字幕文本内容，进行无痕化擦除，生成新的视频。但画面干扰、特殊字幕样式可能会带来一定漏擦误擦问题，可以通过指定区域擦除处理。
当使用自动擦除时，若您不指定AutoAreas，将对默认区域（画面中下部）进行自动擦除；若指定AutoAreas，将改为对您指定的区域进行自动擦除。
**指定区域擦除：**若您的字幕位置较固定，建议您直接指定擦除区域，最大程度减少漏擦的情况。
当您选择指定区域擦除时，请在CustomAreas中至少传入一个指定区域。
- auto 自动擦除
- custom 指定区域擦除

     */
    public void setSubtitleEraseMethod(String SubtitleEraseMethod) {
        this.SubtitleEraseMethod = SubtitleEraseMethod;
    }

    /**
     * Get 字幕擦除模型。
**标准版（推荐）：**若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。
**区域版：**若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。
- standard 标准模型
- area 区域模型 
     * @return SubtitleModel 字幕擦除模型。
**标准版（推荐）：**若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。
**区域版：**若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。
- standard 标准模型
- area 区域模型
     */
    public String getSubtitleModel() {
        return this.SubtitleModel;
    }

    /**
     * Set 字幕擦除模型。
**标准版（推荐）：**若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。
**区域版：**若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。
- standard 标准模型
- area 区域模型
     * @param SubtitleModel 字幕擦除模型。
**标准版（推荐）：**若您的字幕样式标准，通常建议选择该版本，细节无痕化效果更好。
**区域版：**若您的字幕存在花体、阴影、动效等特殊样式，建议选择区域版，擦除面积更大，但细节效果不如标准版。
- standard 标准模型
- area 区域模型
     */
    public void setSubtitleModel(String SubtitleModel) {
        this.SubtitleModel = SubtitleModel;
    }

    /**
     * Get 是否开启OCR字幕提取，默认取OFF。
当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。
- ON 开启
- OFF 关闭 
     * @return OcrSwitch 是否开启OCR字幕提取，默认取OFF。
当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。
- ON 开启
- OFF 关闭
     */
    public String getOcrSwitch() {
        return this.OcrSwitch;
    }

    /**
     * Set 是否开启OCR字幕提取，默认取OFF。
当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。
- ON 开启
- OFF 关闭
     * @param OcrSwitch 是否开启OCR字幕提取，默认取OFF。
当且仅当SubtitleEraseMethod取auto时支持开启OCR字幕提取，开启后将识别自动擦除区域内出现时间最长且最稳定的文字区域为字幕区域，对字幕区域中的文字进行提取和擦除。
- ON 开启
- OFF 关闭
     */
    public void setOcrSwitch(String OcrSwitch) {
        this.OcrSwitch = OcrSwitch;
    }

    /**
     * Get 字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取"ON"时生效。
- zh_en 中英文
- multi 其他
其他具体支持识别如下语言：
中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语

 
     * @return SubtitleLang 字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取"ON"时生效。
- zh_en 中英文
- multi 其他
其他具体支持识别如下语言：
中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语


     */
    public String getSubtitleLang() {
        return this.SubtitleLang;
    }

    /**
     * Set 字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取"ON"时生效。
- zh_en 中英文
- multi 其他
其他具体支持识别如下语言：
中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语


     * @param SubtitleLang 字幕语言，用于指导OCR识别，默认取zh_en；仅当OcrSwitch取"ON"时生效。
- zh_en 中英文
- multi 其他
其他具体支持识别如下语言：
中文、英文、日文、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语、印地语、阿拉伯语、印度-孟加拉语、印度-古吉拉特语、印度-卡纳达语 、印度-马拉亚拉姆语 、印度-泰米尔语、印度-泰卢固语、斯洛文尼亚语、波兰语、加泰罗尼亚语、波斯尼亚语、捷克语、爱沙尼亚语、克罗地亚语、旁遮普语、马拉地语、阿塞拜疆语、印尼语、卢森堡语 、立陶宛语、拉脱维亚语、马耳他语、斯洛伐克语、土耳其语、哈萨克语、希腊语、爱尔兰语、白俄罗斯语、高棉语、他加禄语、普什图语、波斯语、塔吉克斯坦语


     */
    public void setSubtitleLang(String SubtitleLang) {
        this.SubtitleLang = SubtitleLang;
    }

    /**
     * Get 字幕文件格式，默认取vtt；仅当OcrSwitch取"ON"时生效。
- srt srt格式
- vtt WebVTT格式 
     * @return SubtitleFormat 字幕文件格式，默认取vtt；仅当OcrSwitch取"ON"时生效。
- srt srt格式
- vtt WebVTT格式
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 字幕文件格式，默认取vtt；仅当OcrSwitch取"ON"时生效。
- srt srt格式
- vtt WebVTT格式
     * @param SubtitleFormat 字幕文件格式，默认取vtt；仅当OcrSwitch取"ON"时生效。
- srt srt格式
- vtt WebVTT格式
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get 是否开启字幕翻译，默认取OFF；仅当OcrSwitch取"ON"时生效。
- ON 开启
- OFF 关闭 
     * @return TransSwitch 是否开启字幕翻译，默认取OFF；仅当OcrSwitch取"ON"时生效。
- ON 开启
- OFF 关闭
     */
    public String getTransSwitch() {
        return this.TransSwitch;
    }

    /**
     * Set 是否开启字幕翻译，默认取OFF；仅当OcrSwitch取"ON"时生效。
- ON 开启
- OFF 关闭
     * @param TransSwitch 是否开启字幕翻译，默认取OFF；仅当OcrSwitch取"ON"时生效。
- ON 开启
- OFF 关闭
     */
    public void setTransSwitch(String TransSwitch) {
        this.TransSwitch = TransSwitch;
    }

    /**
     * Get 字幕翻译目标语言，默认取en；仅当TransSwitch取"ON"时生效。
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语 
     * @return TransDstLang 字幕翻译目标语言，默认取en；仅当TransSwitch取"ON"时生效。
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
     */
    public String getTransDstLang() {
        return this.TransDstLang;
    }

    /**
     * Set 字幕翻译目标语言，默认取en；仅当TransSwitch取"ON"时生效。
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
     * @param TransDstLang 字幕翻译目标语言，默认取en；仅当TransSwitch取"ON"时生效。
当前支持以下语言：
zh：简体中文
en：英语
ja：日语
ko：韩语
fr：法语
es：西班牙语
it：意大利语
de：德语
tr：土耳其语
ru：俄语
pt：葡萄牙语
vi：越南语
id：印度尼西亚语
ms：马来语
th：泰语
ar：阿拉伯语
hi：印地语
     */
    public void setTransDstLang(String TransDstLang) {
        this.TransDstLang = TransDstLang;
    }

    /**
     * Get 自动擦除自定义区域。
对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。
注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。 
     * @return AutoAreas 自动擦除自定义区域。
对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。
注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
     */
    public EraseArea [] getAutoAreas() {
        return this.AutoAreas;
    }

    /**
     * Set 自动擦除自定义区域。
对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。
注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
     * @param AutoAreas 自动擦除自定义区域。
对选定区域，利用AI模型自动检测其中存在的擦除目标并擦除。
注意：当擦除方式选择custom时，此参数将不会生效；修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
     */
    public void setAutoAreas(EraseArea [] AutoAreas) {
        this.AutoAreas = AutoAreas;
    }

    /**
     * Get 指定擦除自定义区域。
对选定区域，在选定时间段内不进行检测识别直接进行擦除。
注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。 
     * @return CustomAreas 指定擦除自定义区域。
对选定区域，在选定时间段内不进行检测识别直接进行擦除。
注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
     */
    public EraseTimeArea [] getCustomAreas() {
        return this.CustomAreas;
    }

    /**
     * Set 指定擦除自定义区域。
对选定区域，在选定时间段内不进行检测识别直接进行擦除。
注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
     * @param CustomAreas 指定擦除自定义区域。
对选定区域，在选定时间段内不进行检测识别直接进行擦除。
注意：修改模板时，清除区域请传入[]，不传时将保持模板区域信息不变。
     */
    public void setCustomAreas(EraseTimeArea [] CustomAreas) {
        this.CustomAreas = CustomAreas;
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

    }
}

