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

public class ModifySmartSubtitleTemplateRequest extends AbstractModel {

    /**
    * 智能字幕模板唯一标识
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * 智能字幕模板名称
长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 智能字幕模板描述信息
长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 智能字幕视频源语言
OCR识别仅支持以下语言：
`zh_en`：中英
`multi`：其他
ASR识别和纯字幕翻译当前支持以下语言：
`auto`：自动识别（仅在纯字幕翻译中支持）
`zh`：简体中文
`en`：英语
`ja`：日语
`ko`：韩语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`vi`：越南语
`ms`：马来语
`id`：印度尼西亚语
`fil`：菲律宾语
`th`：泰语
`pt`：葡萄牙语
`tr`：土耳其语
`ar`：阿拉伯语
`es`：西班牙语
`hi`：印地语
`fr`：法语
`de`：德语
`it`：意大利语
`zh_dialect`：中文方言
`zh_en`：中英
`yue`：粤语
`ru`：俄语
`prime_zh`：中英方言
`af-ZA`：南非荷兰语（南非）
`sq-AL`：阿尔巴尼亚语（阿尔巴尼亚）
`am-ET`：阿姆哈拉语（埃塞俄比亚）
`ar-DZ`：阿拉伯语（阿尔及利亚）
`ar-BH`：阿拉伯语（巴林）
`ar-EG`：阿拉伯语（埃及）
`ar-IQ`：阿拉伯语（伊拉克）
`ar-IL`：阿拉伯语（以色列）
`ar-JO`：阿拉伯语（约旦）
`ar-KW`：阿拉伯语（科威特）
`ar-LB`：阿拉伯语（黎巴嫩）
`ar-MR`：阿拉伯语（毛里塔尼亚）
`ar-MA`：阿拉伯语（摩洛哥）
`ar-OM`：阿拉伯语（阿曼）
`ar-QA`：阿拉伯语（卡塔尔）
`ar-SA`：阿拉伯语（沙特阿拉伯）
`ar-PS`：阿拉伯语（巴勒斯坦国）
`ar-SY`：阿拉伯语（叙利亚）
`ar-TN`：阿拉伯语（突尼斯）
`ar-AE`：阿拉伯语（阿拉伯联合酋长国）
`ar-YE`：阿拉伯语（也门）
`hy-AM`：亚美尼亚语（亚美尼亚）
`az-AZ`：阿塞拜疆语（阿塞拜疆）
`eu-ES`：巴斯克语（西班牙）
`bn-BD`：孟加拉语（孟加拉）
`bn-IN`：孟加拉语（印度）
`bs-BA`：波斯尼亚语（波斯尼亚和黑塞哥维那）
`bg-BG`：保加利亚语（保加利亚）
`my-MM`：缅甸语（缅甸）
`ca-ES`：加泰罗尼亚语（西班牙）
`hr-HR`：克罗地亚语（克罗地亚）
`cs-CZ`：捷克语（捷克共和国）
`da-DK`：丹麦语（丹麦）
`nl-BE`：荷兰语（比利时）
`nl-NL`：荷兰语（荷兰）
`en-AU`：英语（澳大利亚）
`en-CA`：英语（加拿大）
`en-GH`：英语（加纳）
`en-HK`：英语（中国香港）
`en-IN`：英语（印度）
`en-IE`：英语（爱尔兰）
`en-KE`：英语（肯尼亚）
`en-NZ`：英语（新西兰）
`en-NG`：英语（尼日利亚）
`en-PK`：英语（巴基斯坦）
`en-PH`：英语（菲律宾）
`en-SG`：英语（新加坡）
`en-ZA`：英语（南非）
`en-TZ`：英语（坦桑尼亚）
`en-GB`：英语（英国）
`en-US`：英语（美国）
`et-EE`：爱沙尼亚语（爱沙尼亚）
`fil-PH`：菲律宾语（菲律宾）
`fi-FI`：芬兰语（芬兰）
`fr-BE`：法语（比利时）
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fr-CH`：法语（瑞士）
`gl-ES`：加利西亚语（西班牙）
`ka-GE`：格鲁吉亚语（格鲁吉亚）
`el-GR`：希腊语（希腊）
`gu-IN`：古吉拉特语（印度）
`iw-IL`：希伯来语（以色列）
`hi-IN`：印地语（印度）
`hu-HU`：匈牙利语（匈牙利）
`is-IS`：冰岛语（冰岛）
`id-ID`：印度尼西亚语（印度尼西亚）
`it-IT`：意大利语（意大利）
`it-CH`：意大利语（瑞士）
`ja-JP`：日语（日本）
`jv-ID`：爪哇语（印度尼西亚）
`kn-IN`：卡纳达语（印度）
`kk-KZ`：哈萨克语（哈萨克斯坦）
`km-KH`：高棉语（柬埔寨）
`rw-RW`：卢旺达语（卢旺达）
`ko-KR`：韩语（韩国）
`lo-LA`：老挝语（老挝）
`lv-LV`：拉脱维亚语（拉脱维亚）
`lt-LT`：立陶宛语（立陶宛）
`mk-MK`：马其顿语（北马其顿）
`ms-MY`：马来语（马来西亚）
`ml-IN`：马拉雅拉姆语（印度）
`mr-IN`：马拉地语（印度）
`mn-MN`：蒙古语（蒙古）
`ne-NP`：尼泊尔语（尼泊尔）
`no-NO`：博克马尔挪威语（挪威）
`fa-IR`：波斯语（伊朗）
`pl-PL`：波兰语（波兰）
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`ro-RO`：罗马尼亚语（罗马尼亚）
`ru-RU`：俄语（俄罗斯）
`sr-RS`：塞尔维亚语（塞尔维亚）
`si-LK`：僧伽罗语（斯里兰卡）
`sk-SK`：斯洛伐克语（斯洛伐克）
`sl-SI`：斯洛文尼亚语（斯洛文尼亚）
`st-ZA`：南索托语（南非）
`es-AR`：西班牙语（阿根廷）
`es-BO`：西班牙语（玻利维亚）
`es-CL`：西班牙语（智利）
`es-CO`：西班牙语（哥伦比亚）
`es-CR`：西班牙语（哥斯达黎加）
`es-DO`：西班牙语（多米尼加共和国）
`es-EC`：西班牙语（厄瓜多尔）
`es-SV`：西班牙语（萨尔瓦多）
`es-GT`：西班牙语（危地马拉）
`es-HN`：西班牙语（洪都拉斯）
`es-MX`：西班牙语（墨西哥）
`es-NI`：西班牙语（尼加拉瓜）
`es-PA`：西班牙语（巴拿马）
`es-PY`：西班牙语（巴拉圭）
`es-PE`：西班牙语（秘鲁）
`es-PR`：西班牙语（波多黎各）
`es-ES`：西班牙语（西班牙）
`es-US`：西班牙语（美国）
`es-UY`：西班牙语（乌拉圭）
`es-VE`：西班牙语（委内瑞拉）
`su-ID`：巽他语（印度尼西亚）
`sw-KE`：斯瓦希里语（肯尼亚）
`sw-TZ`：斯瓦希里语（坦桑尼亚）
`sv-SE`：瑞典语（瑞典）
`ta-IN`：泰米尔语（印度）
`ta-MY`：泰米尔语（马来西亚）
`ta-SG`：泰米尔语（新加坡）
`ta-LK`：泰米尔语（斯里兰卡）
`te-IN`：泰卢固语（印度）
`th-TH`：泰语（泰国）
`ts-ZA`：聪加语（南非）
`tr-TR`：土耳其语（土耳其）
`uk-UA`：乌克兰语（乌克兰）
`ur-IN`：乌尔都语（印度）
`ur-PK`：乌尔都语（巴基斯坦）
`uz-UZ`：乌兹别克语（乌兹别克斯坦）
`ve-ZA`：文达语（南非）
`vi-VN`：越南语（越南）
`xh-ZA`：科萨语（南非）
`zu-ZA`：祖鲁语（南非）

    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕
- OCR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译和OCR识别翻译方式下，不允许传空或不传
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * ASR热词库参数
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`ab`：阿布哈兹语
`ace`：亚齐语
`ach`：阿乔利语
`af`：南非荷兰语
`ak`：契维语（阿坎语）
`am`：Amharic
`ar`：阿拉伯语
`as`：阿萨姆语
`ay`：艾马拉语
`az`：阿塞拜疆语
`ba`：巴什基尔语
`ban`：巴厘语
`bbc`：巴塔克托巴语
`bem`：Bemba
`bew`：Betawi
`bg`：保加利亚语
`bho`：博杰普尔语
`bik`：Bikol
`bm`：班巴拉语
`bn`：孟加拉语
`br`：布列塔尼语
`bs`：波斯尼亚语
`btx`：巴塔克卡罗语
`bts`：巴塔克西马隆贡语
`bua`：布里亚特语
`ca`：加泰罗尼亚语
`ceb`：宿务语
`cgg`：Kiga
`chm`：草原马里语
`ckb`：库尔德语（索拉尼语）
`cnh`：哈卡钦语
`co`：科西嘉语
`crh`：克里米亚鞑靼语
`crs`：塞舌尔克里奥尔语
`cs`：捷克语
`cv`：楚瓦什语
`cy`：威尔士语
`da`：丹麦语
`de`：德语
`din`：Dinka
`doi`：多格来语
`dov`：敦贝语
`dv`：第维埃语
`dz`：宗卡语
`ee`：Ewe
`el`：希腊语
`en`：英语
`eo`：世界语
`es`：西班牙语
`et`：爱沙尼亚语
`eu`：巴斯克语
`fa`：波斯语
`ff`：富拉语
`fi`：芬兰语
`fil`：菲律宾语（塔加拉语）
`fj`：斐济语
`fr`：法语
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fy`：弗里斯兰语
`ga`：爱尔兰语
`gaa`：加 (Ga) 语
`gd`：苏格兰盖尔语
`gl`：加利西亚语
`gn`：瓜拉尼语
`gom`：贡根语
`gu`：古吉拉特语
`gv`：马恩岛语
`ha`：Hausa
`haw`：夏威夷语
`he`：希伯来语
`hi`：印地语
`hil`：希利盖农语
`hmn`：苗语
`hr`：克罗地亚语
`hrx`：洪斯吕克语
`ht`：海地克里奥尔语
`hu`：匈牙利语
`hy`：亚美尼亚语
`id`：印度尼西亚语
`ig`：Igbo
`ilo`：伊洛果语
`is`：冰岛语
`it`：意大利语
`iw`：希伯来语
`ja`：日语
`jv`：爪哇语
`jw`：爪哇语
`ka`：格鲁吉亚语
`kk`：哈萨克语
`km`：高棉语
`kn`：卡纳达语
`ko`：韩语
`kri`：Krio
`ku`：库尔德语（库尔曼吉语）
`ktu`：吉土巴语
`ky`：吉尔吉斯语
`la`：拉丁语
`lb`：卢森堡语
`lg`：干达语（卢干达语）
`li`：林堡语
`lij`：利古里亚语
`lmo`：伦巴第语
`ln`：林加拉语
`lo`：老挝语
`lt`：立陶宛语
`ltg`：拉特加莱语
`luo`：Luo
`lus`：米佐语
`lv`：拉脱维亚语
`mai`：迈蒂利语
`mak`：马卡萨
`mg`：马尔加什语
`mi`：毛利语
`min`：米南语
`mk`：马其顿语
`ml`：马拉雅拉姆语
`mn`：蒙古语
`mr`：马拉地语
`ms`：马来语
`mt`：马耳他语
`my`：缅甸语
`ne`：尼泊尔语
`new`：尼瓦尔语
`nl`：荷兰语
`no`：挪威语
`nr`：恩德贝莱语（南部）
`nso`：北索托语（塞佩蒂语）
`nus`：努尔语
`ny`：齐切瓦语（尼扬贾语）
`oc`：奥克斯坦语
`om`：Oromo
`or`：奥里亚语
`pa`：旁遮普语
`pag`：邦阿西楠语
`pam`：邦板牙语
`pap`：Papiamento
`pl`：波兰语
`ps`：Pashto
`pt`：葡萄牙语
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`qu`：克丘亚语
`ro`：罗马尼亚语
`rom`：罗姆语
`rn`：Rundi
`ru`：俄语
`rw`：卢旺达语
`sa`：梵语
`scn`：西西里语
`sd`：信德语
`sg`：Sango
`shn`：掸语
`si`：僧伽罗语
`sk`：斯洛伐克语
`sl`：斯洛文尼亚语
`sm`：萨摩亚语
`sn`：修纳语
`so`：索马里语
`sq`：阿尔巴尼亚语
`sr`：塞尔维亚语
`ss`：斯瓦特语
`st`：塞索托语
`su`：巽他语
`sv`：瑞典语
`sw`：斯瓦希里语
`szl`：西里西亚语
`ta`：泰米尔语
`te`：泰卢固语
`tet`：德顿语
`tg`：塔吉克语
`th`：泰语
`ti`：提格里尼亚语
`tk`：土库曼语
`tl`：菲律宾语（塔加拉语）
`tn`：茨瓦纳语
`tr`：土耳其语
`ts`：聪加语
`tt`：鞑靼语
`ug`：维吾尔语
`uk`：乌克兰语
`ur`：乌尔都语
`uz`：乌兹别克语
`vi`：越南语
`xh`：科萨语
`yi`：意第绪语
`yo`：约鲁巴语
`yua`：尤卡坦玛雅语
`yue`：粤语
`zh`：简体中文
`zh-TW`：中文（繁体）
`zu`：祖鲁语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
- 2：OCR识别字幕

**注意**：不传的情况下，默认是ASR方式
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
     * Get 智能字幕模板唯一标识 
     * @return Definition 智能字幕模板唯一标识
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 智能字幕模板唯一标识
     * @param Definition 智能字幕模板唯一标识
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`； 
     * @return TranslateSwitch 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
     * @param TranslateSwitch 字幕翻译开关
`ON`: 开启翻译
`OFF`: 关闭翻译

**注意**：纯字幕翻译方式下，不传默认是打开的，不允许传空或`OFF`；
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get 智能字幕模板名称
长度限制：64 个字符。 
     * @return Name 智能字幕模板名称
长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能字幕模板名称
长度限制：64 个字符。
     * @param Name 智能字幕模板名称
长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 智能字幕模板描述信息
长度限制：256 个字符。 
     * @return Comment 智能字幕模板描述信息
长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 智能字幕模板描述信息
长度限制：256 个字符。
     * @param Comment 智能字幕模板描述信息
长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 智能字幕视频源语言
OCR识别仅支持以下语言：
`zh_en`：中英
`multi`：其他
ASR识别和纯字幕翻译当前支持以下语言：
`auto`：自动识别（仅在纯字幕翻译中支持）
`zh`：简体中文
`en`：英语
`ja`：日语
`ko`：韩语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`vi`：越南语
`ms`：马来语
`id`：印度尼西亚语
`fil`：菲律宾语
`th`：泰语
`pt`：葡萄牙语
`tr`：土耳其语
`ar`：阿拉伯语
`es`：西班牙语
`hi`：印地语
`fr`：法语
`de`：德语
`it`：意大利语
`zh_dialect`：中文方言
`zh_en`：中英
`yue`：粤语
`ru`：俄语
`prime_zh`：中英方言
`af-ZA`：南非荷兰语（南非）
`sq-AL`：阿尔巴尼亚语（阿尔巴尼亚）
`am-ET`：阿姆哈拉语（埃塞俄比亚）
`ar-DZ`：阿拉伯语（阿尔及利亚）
`ar-BH`：阿拉伯语（巴林）
`ar-EG`：阿拉伯语（埃及）
`ar-IQ`：阿拉伯语（伊拉克）
`ar-IL`：阿拉伯语（以色列）
`ar-JO`：阿拉伯语（约旦）
`ar-KW`：阿拉伯语（科威特）
`ar-LB`：阿拉伯语（黎巴嫩）
`ar-MR`：阿拉伯语（毛里塔尼亚）
`ar-MA`：阿拉伯语（摩洛哥）
`ar-OM`：阿拉伯语（阿曼）
`ar-QA`：阿拉伯语（卡塔尔）
`ar-SA`：阿拉伯语（沙特阿拉伯）
`ar-PS`：阿拉伯语（巴勒斯坦国）
`ar-SY`：阿拉伯语（叙利亚）
`ar-TN`：阿拉伯语（突尼斯）
`ar-AE`：阿拉伯语（阿拉伯联合酋长国）
`ar-YE`：阿拉伯语（也门）
`hy-AM`：亚美尼亚语（亚美尼亚）
`az-AZ`：阿塞拜疆语（阿塞拜疆）
`eu-ES`：巴斯克语（西班牙）
`bn-BD`：孟加拉语（孟加拉）
`bn-IN`：孟加拉语（印度）
`bs-BA`：波斯尼亚语（波斯尼亚和黑塞哥维那）
`bg-BG`：保加利亚语（保加利亚）
`my-MM`：缅甸语（缅甸）
`ca-ES`：加泰罗尼亚语（西班牙）
`hr-HR`：克罗地亚语（克罗地亚）
`cs-CZ`：捷克语（捷克共和国）
`da-DK`：丹麦语（丹麦）
`nl-BE`：荷兰语（比利时）
`nl-NL`：荷兰语（荷兰）
`en-AU`：英语（澳大利亚）
`en-CA`：英语（加拿大）
`en-GH`：英语（加纳）
`en-HK`：英语（中国香港）
`en-IN`：英语（印度）
`en-IE`：英语（爱尔兰）
`en-KE`：英语（肯尼亚）
`en-NZ`：英语（新西兰）
`en-NG`：英语（尼日利亚）
`en-PK`：英语（巴基斯坦）
`en-PH`：英语（菲律宾）
`en-SG`：英语（新加坡）
`en-ZA`：英语（南非）
`en-TZ`：英语（坦桑尼亚）
`en-GB`：英语（英国）
`en-US`：英语（美国）
`et-EE`：爱沙尼亚语（爱沙尼亚）
`fil-PH`：菲律宾语（菲律宾）
`fi-FI`：芬兰语（芬兰）
`fr-BE`：法语（比利时）
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fr-CH`：法语（瑞士）
`gl-ES`：加利西亚语（西班牙）
`ka-GE`：格鲁吉亚语（格鲁吉亚）
`el-GR`：希腊语（希腊）
`gu-IN`：古吉拉特语（印度）
`iw-IL`：希伯来语（以色列）
`hi-IN`：印地语（印度）
`hu-HU`：匈牙利语（匈牙利）
`is-IS`：冰岛语（冰岛）
`id-ID`：印度尼西亚语（印度尼西亚）
`it-IT`：意大利语（意大利）
`it-CH`：意大利语（瑞士）
`ja-JP`：日语（日本）
`jv-ID`：爪哇语（印度尼西亚）
`kn-IN`：卡纳达语（印度）
`kk-KZ`：哈萨克语（哈萨克斯坦）
`km-KH`：高棉语（柬埔寨）
`rw-RW`：卢旺达语（卢旺达）
`ko-KR`：韩语（韩国）
`lo-LA`：老挝语（老挝）
`lv-LV`：拉脱维亚语（拉脱维亚）
`lt-LT`：立陶宛语（立陶宛）
`mk-MK`：马其顿语（北马其顿）
`ms-MY`：马来语（马来西亚）
`ml-IN`：马拉雅拉姆语（印度）
`mr-IN`：马拉地语（印度）
`mn-MN`：蒙古语（蒙古）
`ne-NP`：尼泊尔语（尼泊尔）
`no-NO`：博克马尔挪威语（挪威）
`fa-IR`：波斯语（伊朗）
`pl-PL`：波兰语（波兰）
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`ro-RO`：罗马尼亚语（罗马尼亚）
`ru-RU`：俄语（俄罗斯）
`sr-RS`：塞尔维亚语（塞尔维亚）
`si-LK`：僧伽罗语（斯里兰卡）
`sk-SK`：斯洛伐克语（斯洛伐克）
`sl-SI`：斯洛文尼亚语（斯洛文尼亚）
`st-ZA`：南索托语（南非）
`es-AR`：西班牙语（阿根廷）
`es-BO`：西班牙语（玻利维亚）
`es-CL`：西班牙语（智利）
`es-CO`：西班牙语（哥伦比亚）
`es-CR`：西班牙语（哥斯达黎加）
`es-DO`：西班牙语（多米尼加共和国）
`es-EC`：西班牙语（厄瓜多尔）
`es-SV`：西班牙语（萨尔瓦多）
`es-GT`：西班牙语（危地马拉）
`es-HN`：西班牙语（洪都拉斯）
`es-MX`：西班牙语（墨西哥）
`es-NI`：西班牙语（尼加拉瓜）
`es-PA`：西班牙语（巴拿马）
`es-PY`：西班牙语（巴拉圭）
`es-PE`：西班牙语（秘鲁）
`es-PR`：西班牙语（波多黎各）
`es-ES`：西班牙语（西班牙）
`es-US`：西班牙语（美国）
`es-UY`：西班牙语（乌拉圭）
`es-VE`：西班牙语（委内瑞拉）
`su-ID`：巽他语（印度尼西亚）
`sw-KE`：斯瓦希里语（肯尼亚）
`sw-TZ`：斯瓦希里语（坦桑尼亚）
`sv-SE`：瑞典语（瑞典）
`ta-IN`：泰米尔语（印度）
`ta-MY`：泰米尔语（马来西亚）
`ta-SG`：泰米尔语（新加坡）
`ta-LK`：泰米尔语（斯里兰卡）
`te-IN`：泰卢固语（印度）
`th-TH`：泰语（泰国）
`ts-ZA`：聪加语（南非）
`tr-TR`：土耳其语（土耳其）
`uk-UA`：乌克兰语（乌克兰）
`ur-IN`：乌尔都语（印度）
`ur-PK`：乌尔都语（巴基斯坦）
`uz-UZ`：乌兹别克语（乌兹别克斯坦）
`ve-ZA`：文达语（南非）
`vi-VN`：越南语（越南）
`xh-ZA`：科萨语（南非）
`zu-ZA`：祖鲁语（南非）
 
     * @return VideoSrcLanguage 智能字幕视频源语言
OCR识别仅支持以下语言：
`zh_en`：中英
`multi`：其他
ASR识别和纯字幕翻译当前支持以下语言：
`auto`：自动识别（仅在纯字幕翻译中支持）
`zh`：简体中文
`en`：英语
`ja`：日语
`ko`：韩语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`vi`：越南语
`ms`：马来语
`id`：印度尼西亚语
`fil`：菲律宾语
`th`：泰语
`pt`：葡萄牙语
`tr`：土耳其语
`ar`：阿拉伯语
`es`：西班牙语
`hi`：印地语
`fr`：法语
`de`：德语
`it`：意大利语
`zh_dialect`：中文方言
`zh_en`：中英
`yue`：粤语
`ru`：俄语
`prime_zh`：中英方言
`af-ZA`：南非荷兰语（南非）
`sq-AL`：阿尔巴尼亚语（阿尔巴尼亚）
`am-ET`：阿姆哈拉语（埃塞俄比亚）
`ar-DZ`：阿拉伯语（阿尔及利亚）
`ar-BH`：阿拉伯语（巴林）
`ar-EG`：阿拉伯语（埃及）
`ar-IQ`：阿拉伯语（伊拉克）
`ar-IL`：阿拉伯语（以色列）
`ar-JO`：阿拉伯语（约旦）
`ar-KW`：阿拉伯语（科威特）
`ar-LB`：阿拉伯语（黎巴嫩）
`ar-MR`：阿拉伯语（毛里塔尼亚）
`ar-MA`：阿拉伯语（摩洛哥）
`ar-OM`：阿拉伯语（阿曼）
`ar-QA`：阿拉伯语（卡塔尔）
`ar-SA`：阿拉伯语（沙特阿拉伯）
`ar-PS`：阿拉伯语（巴勒斯坦国）
`ar-SY`：阿拉伯语（叙利亚）
`ar-TN`：阿拉伯语（突尼斯）
`ar-AE`：阿拉伯语（阿拉伯联合酋长国）
`ar-YE`：阿拉伯语（也门）
`hy-AM`：亚美尼亚语（亚美尼亚）
`az-AZ`：阿塞拜疆语（阿塞拜疆）
`eu-ES`：巴斯克语（西班牙）
`bn-BD`：孟加拉语（孟加拉）
`bn-IN`：孟加拉语（印度）
`bs-BA`：波斯尼亚语（波斯尼亚和黑塞哥维那）
`bg-BG`：保加利亚语（保加利亚）
`my-MM`：缅甸语（缅甸）
`ca-ES`：加泰罗尼亚语（西班牙）
`hr-HR`：克罗地亚语（克罗地亚）
`cs-CZ`：捷克语（捷克共和国）
`da-DK`：丹麦语（丹麦）
`nl-BE`：荷兰语（比利时）
`nl-NL`：荷兰语（荷兰）
`en-AU`：英语（澳大利亚）
`en-CA`：英语（加拿大）
`en-GH`：英语（加纳）
`en-HK`：英语（中国香港）
`en-IN`：英语（印度）
`en-IE`：英语（爱尔兰）
`en-KE`：英语（肯尼亚）
`en-NZ`：英语（新西兰）
`en-NG`：英语（尼日利亚）
`en-PK`：英语（巴基斯坦）
`en-PH`：英语（菲律宾）
`en-SG`：英语（新加坡）
`en-ZA`：英语（南非）
`en-TZ`：英语（坦桑尼亚）
`en-GB`：英语（英国）
`en-US`：英语（美国）
`et-EE`：爱沙尼亚语（爱沙尼亚）
`fil-PH`：菲律宾语（菲律宾）
`fi-FI`：芬兰语（芬兰）
`fr-BE`：法语（比利时）
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fr-CH`：法语（瑞士）
`gl-ES`：加利西亚语（西班牙）
`ka-GE`：格鲁吉亚语（格鲁吉亚）
`el-GR`：希腊语（希腊）
`gu-IN`：古吉拉特语（印度）
`iw-IL`：希伯来语（以色列）
`hi-IN`：印地语（印度）
`hu-HU`：匈牙利语（匈牙利）
`is-IS`：冰岛语（冰岛）
`id-ID`：印度尼西亚语（印度尼西亚）
`it-IT`：意大利语（意大利）
`it-CH`：意大利语（瑞士）
`ja-JP`：日语（日本）
`jv-ID`：爪哇语（印度尼西亚）
`kn-IN`：卡纳达语（印度）
`kk-KZ`：哈萨克语（哈萨克斯坦）
`km-KH`：高棉语（柬埔寨）
`rw-RW`：卢旺达语（卢旺达）
`ko-KR`：韩语（韩国）
`lo-LA`：老挝语（老挝）
`lv-LV`：拉脱维亚语（拉脱维亚）
`lt-LT`：立陶宛语（立陶宛）
`mk-MK`：马其顿语（北马其顿）
`ms-MY`：马来语（马来西亚）
`ml-IN`：马拉雅拉姆语（印度）
`mr-IN`：马拉地语（印度）
`mn-MN`：蒙古语（蒙古）
`ne-NP`：尼泊尔语（尼泊尔）
`no-NO`：博克马尔挪威语（挪威）
`fa-IR`：波斯语（伊朗）
`pl-PL`：波兰语（波兰）
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`ro-RO`：罗马尼亚语（罗马尼亚）
`ru-RU`：俄语（俄罗斯）
`sr-RS`：塞尔维亚语（塞尔维亚）
`si-LK`：僧伽罗语（斯里兰卡）
`sk-SK`：斯洛伐克语（斯洛伐克）
`sl-SI`：斯洛文尼亚语（斯洛文尼亚）
`st-ZA`：南索托语（南非）
`es-AR`：西班牙语（阿根廷）
`es-BO`：西班牙语（玻利维亚）
`es-CL`：西班牙语（智利）
`es-CO`：西班牙语（哥伦比亚）
`es-CR`：西班牙语（哥斯达黎加）
`es-DO`：西班牙语（多米尼加共和国）
`es-EC`：西班牙语（厄瓜多尔）
`es-SV`：西班牙语（萨尔瓦多）
`es-GT`：西班牙语（危地马拉）
`es-HN`：西班牙语（洪都拉斯）
`es-MX`：西班牙语（墨西哥）
`es-NI`：西班牙语（尼加拉瓜）
`es-PA`：西班牙语（巴拿马）
`es-PY`：西班牙语（巴拉圭）
`es-PE`：西班牙语（秘鲁）
`es-PR`：西班牙语（波多黎各）
`es-ES`：西班牙语（西班牙）
`es-US`：西班牙语（美国）
`es-UY`：西班牙语（乌拉圭）
`es-VE`：西班牙语（委内瑞拉）
`su-ID`：巽他语（印度尼西亚）
`sw-KE`：斯瓦希里语（肯尼亚）
`sw-TZ`：斯瓦希里语（坦桑尼亚）
`sv-SE`：瑞典语（瑞典）
`ta-IN`：泰米尔语（印度）
`ta-MY`：泰米尔语（马来西亚）
`ta-SG`：泰米尔语（新加坡）
`ta-LK`：泰米尔语（斯里兰卡）
`te-IN`：泰卢固语（印度）
`th-TH`：泰语（泰国）
`ts-ZA`：聪加语（南非）
`tr-TR`：土耳其语（土耳其）
`uk-UA`：乌克兰语（乌克兰）
`ur-IN`：乌尔都语（印度）
`ur-PK`：乌尔都语（巴基斯坦）
`uz-UZ`：乌兹别克语（乌兹别克斯坦）
`ve-ZA`：文达语（南非）
`vi-VN`：越南语（越南）
`xh-ZA`：科萨语（南非）
`zu-ZA`：祖鲁语（南非）

     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set 智能字幕视频源语言
OCR识别仅支持以下语言：
`zh_en`：中英
`multi`：其他
ASR识别和纯字幕翻译当前支持以下语言：
`auto`：自动识别（仅在纯字幕翻译中支持）
`zh`：简体中文
`en`：英语
`ja`：日语
`ko`：韩语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`vi`：越南语
`ms`：马来语
`id`：印度尼西亚语
`fil`：菲律宾语
`th`：泰语
`pt`：葡萄牙语
`tr`：土耳其语
`ar`：阿拉伯语
`es`：西班牙语
`hi`：印地语
`fr`：法语
`de`：德语
`it`：意大利语
`zh_dialect`：中文方言
`zh_en`：中英
`yue`：粤语
`ru`：俄语
`prime_zh`：中英方言
`af-ZA`：南非荷兰语（南非）
`sq-AL`：阿尔巴尼亚语（阿尔巴尼亚）
`am-ET`：阿姆哈拉语（埃塞俄比亚）
`ar-DZ`：阿拉伯语（阿尔及利亚）
`ar-BH`：阿拉伯语（巴林）
`ar-EG`：阿拉伯语（埃及）
`ar-IQ`：阿拉伯语（伊拉克）
`ar-IL`：阿拉伯语（以色列）
`ar-JO`：阿拉伯语（约旦）
`ar-KW`：阿拉伯语（科威特）
`ar-LB`：阿拉伯语（黎巴嫩）
`ar-MR`：阿拉伯语（毛里塔尼亚）
`ar-MA`：阿拉伯语（摩洛哥）
`ar-OM`：阿拉伯语（阿曼）
`ar-QA`：阿拉伯语（卡塔尔）
`ar-SA`：阿拉伯语（沙特阿拉伯）
`ar-PS`：阿拉伯语（巴勒斯坦国）
`ar-SY`：阿拉伯语（叙利亚）
`ar-TN`：阿拉伯语（突尼斯）
`ar-AE`：阿拉伯语（阿拉伯联合酋长国）
`ar-YE`：阿拉伯语（也门）
`hy-AM`：亚美尼亚语（亚美尼亚）
`az-AZ`：阿塞拜疆语（阿塞拜疆）
`eu-ES`：巴斯克语（西班牙）
`bn-BD`：孟加拉语（孟加拉）
`bn-IN`：孟加拉语（印度）
`bs-BA`：波斯尼亚语（波斯尼亚和黑塞哥维那）
`bg-BG`：保加利亚语（保加利亚）
`my-MM`：缅甸语（缅甸）
`ca-ES`：加泰罗尼亚语（西班牙）
`hr-HR`：克罗地亚语（克罗地亚）
`cs-CZ`：捷克语（捷克共和国）
`da-DK`：丹麦语（丹麦）
`nl-BE`：荷兰语（比利时）
`nl-NL`：荷兰语（荷兰）
`en-AU`：英语（澳大利亚）
`en-CA`：英语（加拿大）
`en-GH`：英语（加纳）
`en-HK`：英语（中国香港）
`en-IN`：英语（印度）
`en-IE`：英语（爱尔兰）
`en-KE`：英语（肯尼亚）
`en-NZ`：英语（新西兰）
`en-NG`：英语（尼日利亚）
`en-PK`：英语（巴基斯坦）
`en-PH`：英语（菲律宾）
`en-SG`：英语（新加坡）
`en-ZA`：英语（南非）
`en-TZ`：英语（坦桑尼亚）
`en-GB`：英语（英国）
`en-US`：英语（美国）
`et-EE`：爱沙尼亚语（爱沙尼亚）
`fil-PH`：菲律宾语（菲律宾）
`fi-FI`：芬兰语（芬兰）
`fr-BE`：法语（比利时）
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fr-CH`：法语（瑞士）
`gl-ES`：加利西亚语（西班牙）
`ka-GE`：格鲁吉亚语（格鲁吉亚）
`el-GR`：希腊语（希腊）
`gu-IN`：古吉拉特语（印度）
`iw-IL`：希伯来语（以色列）
`hi-IN`：印地语（印度）
`hu-HU`：匈牙利语（匈牙利）
`is-IS`：冰岛语（冰岛）
`id-ID`：印度尼西亚语（印度尼西亚）
`it-IT`：意大利语（意大利）
`it-CH`：意大利语（瑞士）
`ja-JP`：日语（日本）
`jv-ID`：爪哇语（印度尼西亚）
`kn-IN`：卡纳达语（印度）
`kk-KZ`：哈萨克语（哈萨克斯坦）
`km-KH`：高棉语（柬埔寨）
`rw-RW`：卢旺达语（卢旺达）
`ko-KR`：韩语（韩国）
`lo-LA`：老挝语（老挝）
`lv-LV`：拉脱维亚语（拉脱维亚）
`lt-LT`：立陶宛语（立陶宛）
`mk-MK`：马其顿语（北马其顿）
`ms-MY`：马来语（马来西亚）
`ml-IN`：马拉雅拉姆语（印度）
`mr-IN`：马拉地语（印度）
`mn-MN`：蒙古语（蒙古）
`ne-NP`：尼泊尔语（尼泊尔）
`no-NO`：博克马尔挪威语（挪威）
`fa-IR`：波斯语（伊朗）
`pl-PL`：波兰语（波兰）
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`ro-RO`：罗马尼亚语（罗马尼亚）
`ru-RU`：俄语（俄罗斯）
`sr-RS`：塞尔维亚语（塞尔维亚）
`si-LK`：僧伽罗语（斯里兰卡）
`sk-SK`：斯洛伐克语（斯洛伐克）
`sl-SI`：斯洛文尼亚语（斯洛文尼亚）
`st-ZA`：南索托语（南非）
`es-AR`：西班牙语（阿根廷）
`es-BO`：西班牙语（玻利维亚）
`es-CL`：西班牙语（智利）
`es-CO`：西班牙语（哥伦比亚）
`es-CR`：西班牙语（哥斯达黎加）
`es-DO`：西班牙语（多米尼加共和国）
`es-EC`：西班牙语（厄瓜多尔）
`es-SV`：西班牙语（萨尔瓦多）
`es-GT`：西班牙语（危地马拉）
`es-HN`：西班牙语（洪都拉斯）
`es-MX`：西班牙语（墨西哥）
`es-NI`：西班牙语（尼加拉瓜）
`es-PA`：西班牙语（巴拿马）
`es-PY`：西班牙语（巴拉圭）
`es-PE`：西班牙语（秘鲁）
`es-PR`：西班牙语（波多黎各）
`es-ES`：西班牙语（西班牙）
`es-US`：西班牙语（美国）
`es-UY`：西班牙语（乌拉圭）
`es-VE`：西班牙语（委内瑞拉）
`su-ID`：巽他语（印度尼西亚）
`sw-KE`：斯瓦希里语（肯尼亚）
`sw-TZ`：斯瓦希里语（坦桑尼亚）
`sv-SE`：瑞典语（瑞典）
`ta-IN`：泰米尔语（印度）
`ta-MY`：泰米尔语（马来西亚）
`ta-SG`：泰米尔语（新加坡）
`ta-LK`：泰米尔语（斯里兰卡）
`te-IN`：泰卢固语（印度）
`th-TH`：泰语（泰国）
`ts-ZA`：聪加语（南非）
`tr-TR`：土耳其语（土耳其）
`uk-UA`：乌克兰语（乌克兰）
`ur-IN`：乌尔都语（印度）
`ur-PK`：乌尔都语（巴基斯坦）
`uz-UZ`：乌兹别克语（乌兹别克斯坦）
`ve-ZA`：文达语（南非）
`vi-VN`：越南语（越南）
`xh-ZA`：科萨语（南非）
`zu-ZA`：祖鲁语（南非）

     * @param VideoSrcLanguage 智能字幕视频源语言
OCR识别仅支持以下语言：
`zh_en`：中英
`multi`：其他
ASR识别和纯字幕翻译当前支持以下语言：
`auto`：自动识别（仅在纯字幕翻译中支持）
`zh`：简体中文
`en`：英语
`ja`：日语
`ko`：韩语
`zh-PY`：中英粤
`zh_medical`：中文医疗
`vi`：越南语
`ms`：马来语
`id`：印度尼西亚语
`fil`：菲律宾语
`th`：泰语
`pt`：葡萄牙语
`tr`：土耳其语
`ar`：阿拉伯语
`es`：西班牙语
`hi`：印地语
`fr`：法语
`de`：德语
`it`：意大利语
`zh_dialect`：中文方言
`zh_en`：中英
`yue`：粤语
`ru`：俄语
`prime_zh`：中英方言
`af-ZA`：南非荷兰语（南非）
`sq-AL`：阿尔巴尼亚语（阿尔巴尼亚）
`am-ET`：阿姆哈拉语（埃塞俄比亚）
`ar-DZ`：阿拉伯语（阿尔及利亚）
`ar-BH`：阿拉伯语（巴林）
`ar-EG`：阿拉伯语（埃及）
`ar-IQ`：阿拉伯语（伊拉克）
`ar-IL`：阿拉伯语（以色列）
`ar-JO`：阿拉伯语（约旦）
`ar-KW`：阿拉伯语（科威特）
`ar-LB`：阿拉伯语（黎巴嫩）
`ar-MR`：阿拉伯语（毛里塔尼亚）
`ar-MA`：阿拉伯语（摩洛哥）
`ar-OM`：阿拉伯语（阿曼）
`ar-QA`：阿拉伯语（卡塔尔）
`ar-SA`：阿拉伯语（沙特阿拉伯）
`ar-PS`：阿拉伯语（巴勒斯坦国）
`ar-SY`：阿拉伯语（叙利亚）
`ar-TN`：阿拉伯语（突尼斯）
`ar-AE`：阿拉伯语（阿拉伯联合酋长国）
`ar-YE`：阿拉伯语（也门）
`hy-AM`：亚美尼亚语（亚美尼亚）
`az-AZ`：阿塞拜疆语（阿塞拜疆）
`eu-ES`：巴斯克语（西班牙）
`bn-BD`：孟加拉语（孟加拉）
`bn-IN`：孟加拉语（印度）
`bs-BA`：波斯尼亚语（波斯尼亚和黑塞哥维那）
`bg-BG`：保加利亚语（保加利亚）
`my-MM`：缅甸语（缅甸）
`ca-ES`：加泰罗尼亚语（西班牙）
`hr-HR`：克罗地亚语（克罗地亚）
`cs-CZ`：捷克语（捷克共和国）
`da-DK`：丹麦语（丹麦）
`nl-BE`：荷兰语（比利时）
`nl-NL`：荷兰语（荷兰）
`en-AU`：英语（澳大利亚）
`en-CA`：英语（加拿大）
`en-GH`：英语（加纳）
`en-HK`：英语（中国香港）
`en-IN`：英语（印度）
`en-IE`：英语（爱尔兰）
`en-KE`：英语（肯尼亚）
`en-NZ`：英语（新西兰）
`en-NG`：英语（尼日利亚）
`en-PK`：英语（巴基斯坦）
`en-PH`：英语（菲律宾）
`en-SG`：英语（新加坡）
`en-ZA`：英语（南非）
`en-TZ`：英语（坦桑尼亚）
`en-GB`：英语（英国）
`en-US`：英语（美国）
`et-EE`：爱沙尼亚语（爱沙尼亚）
`fil-PH`：菲律宾语（菲律宾）
`fi-FI`：芬兰语（芬兰）
`fr-BE`：法语（比利时）
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fr-CH`：法语（瑞士）
`gl-ES`：加利西亚语（西班牙）
`ka-GE`：格鲁吉亚语（格鲁吉亚）
`el-GR`：希腊语（希腊）
`gu-IN`：古吉拉特语（印度）
`iw-IL`：希伯来语（以色列）
`hi-IN`：印地语（印度）
`hu-HU`：匈牙利语（匈牙利）
`is-IS`：冰岛语（冰岛）
`id-ID`：印度尼西亚语（印度尼西亚）
`it-IT`：意大利语（意大利）
`it-CH`：意大利语（瑞士）
`ja-JP`：日语（日本）
`jv-ID`：爪哇语（印度尼西亚）
`kn-IN`：卡纳达语（印度）
`kk-KZ`：哈萨克语（哈萨克斯坦）
`km-KH`：高棉语（柬埔寨）
`rw-RW`：卢旺达语（卢旺达）
`ko-KR`：韩语（韩国）
`lo-LA`：老挝语（老挝）
`lv-LV`：拉脱维亚语（拉脱维亚）
`lt-LT`：立陶宛语（立陶宛）
`mk-MK`：马其顿语（北马其顿）
`ms-MY`：马来语（马来西亚）
`ml-IN`：马拉雅拉姆语（印度）
`mr-IN`：马拉地语（印度）
`mn-MN`：蒙古语（蒙古）
`ne-NP`：尼泊尔语（尼泊尔）
`no-NO`：博克马尔挪威语（挪威）
`fa-IR`：波斯语（伊朗）
`pl-PL`：波兰语（波兰）
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`ro-RO`：罗马尼亚语（罗马尼亚）
`ru-RU`：俄语（俄罗斯）
`sr-RS`：塞尔维亚语（塞尔维亚）
`si-LK`：僧伽罗语（斯里兰卡）
`sk-SK`：斯洛伐克语（斯洛伐克）
`sl-SI`：斯洛文尼亚语（斯洛文尼亚）
`st-ZA`：南索托语（南非）
`es-AR`：西班牙语（阿根廷）
`es-BO`：西班牙语（玻利维亚）
`es-CL`：西班牙语（智利）
`es-CO`：西班牙语（哥伦比亚）
`es-CR`：西班牙语（哥斯达黎加）
`es-DO`：西班牙语（多米尼加共和国）
`es-EC`：西班牙语（厄瓜多尔）
`es-SV`：西班牙语（萨尔瓦多）
`es-GT`：西班牙语（危地马拉）
`es-HN`：西班牙语（洪都拉斯）
`es-MX`：西班牙语（墨西哥）
`es-NI`：西班牙语（尼加拉瓜）
`es-PA`：西班牙语（巴拿马）
`es-PY`：西班牙语（巴拉圭）
`es-PE`：西班牙语（秘鲁）
`es-PR`：西班牙语（波多黎各）
`es-ES`：西班牙语（西班牙）
`es-US`：西班牙语（美国）
`es-UY`：西班牙语（乌拉圭）
`es-VE`：西班牙语（委内瑞拉）
`su-ID`：巽他语（印度尼西亚）
`sw-KE`：斯瓦希里语（肯尼亚）
`sw-TZ`：斯瓦希里语（坦桑尼亚）
`sv-SE`：瑞典语（瑞典）
`ta-IN`：泰米尔语（印度）
`ta-MY`：泰米尔语（马来西亚）
`ta-SG`：泰米尔语（新加坡）
`ta-LK`：泰米尔语（斯里兰卡）
`te-IN`：泰卢固语（印度）
`th-TH`：泰语（泰国）
`ts-ZA`：聪加语（南非）
`tr-TR`：土耳其语（土耳其）
`uk-UA`：乌克兰语（乌克兰）
`ur-IN`：乌尔都语（印度）
`ur-PK`：乌尔都语（巴基斯坦）
`uz-UZ`：乌兹别克语（乌兹别克斯坦）
`ve-ZA`：文达语（南非）
`vi-VN`：越南语（越南）
`xh-ZA`：科萨语（南非）
`zu-ZA`：祖鲁语（南非）

     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕
- OCR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译和OCR识别翻译方式下，不允许传空或不传 
     * @return SubtitleFormat 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕
- OCR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译和OCR识别翻译方式下，不允许传空或不传
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕
- OCR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译和OCR识别翻译方式下，不允许传空或不传
     * @param SubtitleFormat 智能字幕文件格式:
- ASR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕
     - 不填或填空：不生成字幕文件
- 纯字幕翻译处理类型下：
    - original：与源文件一致
    - vtt: WebVTT 格式字幕
    - srt: SRT 格式字幕
- OCR识别翻译处理类型下：
     - vtt: WebVTT 格式字幕
     - srt: SRT 格式字幕

**注意**：
- ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；
- 纯字幕翻译和OCR识别翻译方式下，不允许传空或不传
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2 
     * @return SubtitleType 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
     * @param SubtitleType 智能字幕字幕语言类型
0: 源语言
1: 翻译语言
2: 源语言+翻译语言
当TranslateSwitch为OFF时仅支持取0
当TranslateSwitch为ON时仅支持取1或2
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get ASR热词库参数 
     * @return AsrHotWordsConfigure ASR热词库参数
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set ASR热词库参数
     * @param AsrHotWordsConfigure ASR热词库参数
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`ab`：阿布哈兹语
`ace`：亚齐语
`ach`：阿乔利语
`af`：南非荷兰语
`ak`：契维语（阿坎语）
`am`：Amharic
`ar`：阿拉伯语
`as`：阿萨姆语
`ay`：艾马拉语
`az`：阿塞拜疆语
`ba`：巴什基尔语
`ban`：巴厘语
`bbc`：巴塔克托巴语
`bem`：Bemba
`bew`：Betawi
`bg`：保加利亚语
`bho`：博杰普尔语
`bik`：Bikol
`bm`：班巴拉语
`bn`：孟加拉语
`br`：布列塔尼语
`bs`：波斯尼亚语
`btx`：巴塔克卡罗语
`bts`：巴塔克西马隆贡语
`bua`：布里亚特语
`ca`：加泰罗尼亚语
`ceb`：宿务语
`cgg`：Kiga
`chm`：草原马里语
`ckb`：库尔德语（索拉尼语）
`cnh`：哈卡钦语
`co`：科西嘉语
`crh`：克里米亚鞑靼语
`crs`：塞舌尔克里奥尔语
`cs`：捷克语
`cv`：楚瓦什语
`cy`：威尔士语
`da`：丹麦语
`de`：德语
`din`：Dinka
`doi`：多格来语
`dov`：敦贝语
`dv`：第维埃语
`dz`：宗卡语
`ee`：Ewe
`el`：希腊语
`en`：英语
`eo`：世界语
`es`：西班牙语
`et`：爱沙尼亚语
`eu`：巴斯克语
`fa`：波斯语
`ff`：富拉语
`fi`：芬兰语
`fil`：菲律宾语（塔加拉语）
`fj`：斐济语
`fr`：法语
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fy`：弗里斯兰语
`ga`：爱尔兰语
`gaa`：加 (Ga) 语
`gd`：苏格兰盖尔语
`gl`：加利西亚语
`gn`：瓜拉尼语
`gom`：贡根语
`gu`：古吉拉特语
`gv`：马恩岛语
`ha`：Hausa
`haw`：夏威夷语
`he`：希伯来语
`hi`：印地语
`hil`：希利盖农语
`hmn`：苗语
`hr`：克罗地亚语
`hrx`：洪斯吕克语
`ht`：海地克里奥尔语
`hu`：匈牙利语
`hy`：亚美尼亚语
`id`：印度尼西亚语
`ig`：Igbo
`ilo`：伊洛果语
`is`：冰岛语
`it`：意大利语
`iw`：希伯来语
`ja`：日语
`jv`：爪哇语
`jw`：爪哇语
`ka`：格鲁吉亚语
`kk`：哈萨克语
`km`：高棉语
`kn`：卡纳达语
`ko`：韩语
`kri`：Krio
`ku`：库尔德语（库尔曼吉语）
`ktu`：吉土巴语
`ky`：吉尔吉斯语
`la`：拉丁语
`lb`：卢森堡语
`lg`：干达语（卢干达语）
`li`：林堡语
`lij`：利古里亚语
`lmo`：伦巴第语
`ln`：林加拉语
`lo`：老挝语
`lt`：立陶宛语
`ltg`：拉特加莱语
`luo`：Luo
`lus`：米佐语
`lv`：拉脱维亚语
`mai`：迈蒂利语
`mak`：马卡萨
`mg`：马尔加什语
`mi`：毛利语
`min`：米南语
`mk`：马其顿语
`ml`：马拉雅拉姆语
`mn`：蒙古语
`mr`：马拉地语
`ms`：马来语
`mt`：马耳他语
`my`：缅甸语
`ne`：尼泊尔语
`new`：尼瓦尔语
`nl`：荷兰语
`no`：挪威语
`nr`：恩德贝莱语（南部）
`nso`：北索托语（塞佩蒂语）
`nus`：努尔语
`ny`：齐切瓦语（尼扬贾语）
`oc`：奥克斯坦语
`om`：Oromo
`or`：奥里亚语
`pa`：旁遮普语
`pag`：邦阿西楠语
`pam`：邦板牙语
`pap`：Papiamento
`pl`：波兰语
`ps`：Pashto
`pt`：葡萄牙语
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`qu`：克丘亚语
`ro`：罗马尼亚语
`rom`：罗姆语
`rn`：Rundi
`ru`：俄语
`rw`：卢旺达语
`sa`：梵语
`scn`：西西里语
`sd`：信德语
`sg`：Sango
`shn`：掸语
`si`：僧伽罗语
`sk`：斯洛伐克语
`sl`：斯洛文尼亚语
`sm`：萨摩亚语
`sn`：修纳语
`so`：索马里语
`sq`：阿尔巴尼亚语
`sr`：塞尔维亚语
`ss`：斯瓦特语
`st`：塞索托语
`su`：巽他语
`sv`：瑞典语
`sw`：斯瓦希里语
`szl`：西里西亚语
`ta`：泰米尔语
`te`：泰卢固语
`tet`：德顿语
`tg`：塔吉克语
`th`：泰语
`ti`：提格里尼亚语
`tk`：土库曼语
`tl`：菲律宾语（塔加拉语）
`tn`：茨瓦纳语
`tr`：土耳其语
`ts`：聪加语
`tt`：鞑靼语
`ug`：维吾尔语
`uk`：乌克兰语
`ur`：乌尔都语
`uz`：乌兹别克语
`vi`：越南语
`xh`：科萨语
`yi`：意第绪语
`yo`：约鲁巴语
`yua`：尤卡坦玛雅语
`yue`：粤语
`zh`：简体中文
`zh-TW`：中文（繁体）
`zu`：祖鲁语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。 
     * @return TranslateDstLanguage 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`ab`：阿布哈兹语
`ace`：亚齐语
`ach`：阿乔利语
`af`：南非荷兰语
`ak`：契维语（阿坎语）
`am`：Amharic
`ar`：阿拉伯语
`as`：阿萨姆语
`ay`：艾马拉语
`az`：阿塞拜疆语
`ba`：巴什基尔语
`ban`：巴厘语
`bbc`：巴塔克托巴语
`bem`：Bemba
`bew`：Betawi
`bg`：保加利亚语
`bho`：博杰普尔语
`bik`：Bikol
`bm`：班巴拉语
`bn`：孟加拉语
`br`：布列塔尼语
`bs`：波斯尼亚语
`btx`：巴塔克卡罗语
`bts`：巴塔克西马隆贡语
`bua`：布里亚特语
`ca`：加泰罗尼亚语
`ceb`：宿务语
`cgg`：Kiga
`chm`：草原马里语
`ckb`：库尔德语（索拉尼语）
`cnh`：哈卡钦语
`co`：科西嘉语
`crh`：克里米亚鞑靼语
`crs`：塞舌尔克里奥尔语
`cs`：捷克语
`cv`：楚瓦什语
`cy`：威尔士语
`da`：丹麦语
`de`：德语
`din`：Dinka
`doi`：多格来语
`dov`：敦贝语
`dv`：第维埃语
`dz`：宗卡语
`ee`：Ewe
`el`：希腊语
`en`：英语
`eo`：世界语
`es`：西班牙语
`et`：爱沙尼亚语
`eu`：巴斯克语
`fa`：波斯语
`ff`：富拉语
`fi`：芬兰语
`fil`：菲律宾语（塔加拉语）
`fj`：斐济语
`fr`：法语
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fy`：弗里斯兰语
`ga`：爱尔兰语
`gaa`：加 (Ga) 语
`gd`：苏格兰盖尔语
`gl`：加利西亚语
`gn`：瓜拉尼语
`gom`：贡根语
`gu`：古吉拉特语
`gv`：马恩岛语
`ha`：Hausa
`haw`：夏威夷语
`he`：希伯来语
`hi`：印地语
`hil`：希利盖农语
`hmn`：苗语
`hr`：克罗地亚语
`hrx`：洪斯吕克语
`ht`：海地克里奥尔语
`hu`：匈牙利语
`hy`：亚美尼亚语
`id`：印度尼西亚语
`ig`：Igbo
`ilo`：伊洛果语
`is`：冰岛语
`it`：意大利语
`iw`：希伯来语
`ja`：日语
`jv`：爪哇语
`jw`：爪哇语
`ka`：格鲁吉亚语
`kk`：哈萨克语
`km`：高棉语
`kn`：卡纳达语
`ko`：韩语
`kri`：Krio
`ku`：库尔德语（库尔曼吉语）
`ktu`：吉土巴语
`ky`：吉尔吉斯语
`la`：拉丁语
`lb`：卢森堡语
`lg`：干达语（卢干达语）
`li`：林堡语
`lij`：利古里亚语
`lmo`：伦巴第语
`ln`：林加拉语
`lo`：老挝语
`lt`：立陶宛语
`ltg`：拉特加莱语
`luo`：Luo
`lus`：米佐语
`lv`：拉脱维亚语
`mai`：迈蒂利语
`mak`：马卡萨
`mg`：马尔加什语
`mi`：毛利语
`min`：米南语
`mk`：马其顿语
`ml`：马拉雅拉姆语
`mn`：蒙古语
`mr`：马拉地语
`ms`：马来语
`mt`：马耳他语
`my`：缅甸语
`ne`：尼泊尔语
`new`：尼瓦尔语
`nl`：荷兰语
`no`：挪威语
`nr`：恩德贝莱语（南部）
`nso`：北索托语（塞佩蒂语）
`nus`：努尔语
`ny`：齐切瓦语（尼扬贾语）
`oc`：奥克斯坦语
`om`：Oromo
`or`：奥里亚语
`pa`：旁遮普语
`pag`：邦阿西楠语
`pam`：邦板牙语
`pap`：Papiamento
`pl`：波兰语
`ps`：Pashto
`pt`：葡萄牙语
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`qu`：克丘亚语
`ro`：罗马尼亚语
`rom`：罗姆语
`rn`：Rundi
`ru`：俄语
`rw`：卢旺达语
`sa`：梵语
`scn`：西西里语
`sd`：信德语
`sg`：Sango
`shn`：掸语
`si`：僧伽罗语
`sk`：斯洛伐克语
`sl`：斯洛文尼亚语
`sm`：萨摩亚语
`sn`：修纳语
`so`：索马里语
`sq`：阿尔巴尼亚语
`sr`：塞尔维亚语
`ss`：斯瓦特语
`st`：塞索托语
`su`：巽他语
`sv`：瑞典语
`sw`：斯瓦希里语
`szl`：西里西亚语
`ta`：泰米尔语
`te`：泰卢固语
`tet`：德顿语
`tg`：塔吉克语
`th`：泰语
`ti`：提格里尼亚语
`tk`：土库曼语
`tl`：菲律宾语（塔加拉语）
`tn`：茨瓦纳语
`tr`：土耳其语
`ts`：聪加语
`tt`：鞑靼语
`ug`：维吾尔语
`uk`：乌克兰语
`ur`：乌尔都语
`uz`：乌兹别克语
`vi`：越南语
`xh`：科萨语
`yi`：意第绪语
`yo`：约鲁巴语
`yua`：尤卡坦玛雅语
`yue`：粤语
`zh`：简体中文
`zh-TW`：中文（繁体）
`zu`：祖鲁语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`ab`：阿布哈兹语
`ace`：亚齐语
`ach`：阿乔利语
`af`：南非荷兰语
`ak`：契维语（阿坎语）
`am`：Amharic
`ar`：阿拉伯语
`as`：阿萨姆语
`ay`：艾马拉语
`az`：阿塞拜疆语
`ba`：巴什基尔语
`ban`：巴厘语
`bbc`：巴塔克托巴语
`bem`：Bemba
`bew`：Betawi
`bg`：保加利亚语
`bho`：博杰普尔语
`bik`：Bikol
`bm`：班巴拉语
`bn`：孟加拉语
`br`：布列塔尼语
`bs`：波斯尼亚语
`btx`：巴塔克卡罗语
`bts`：巴塔克西马隆贡语
`bua`：布里亚特语
`ca`：加泰罗尼亚语
`ceb`：宿务语
`cgg`：Kiga
`chm`：草原马里语
`ckb`：库尔德语（索拉尼语）
`cnh`：哈卡钦语
`co`：科西嘉语
`crh`：克里米亚鞑靼语
`crs`：塞舌尔克里奥尔语
`cs`：捷克语
`cv`：楚瓦什语
`cy`：威尔士语
`da`：丹麦语
`de`：德语
`din`：Dinka
`doi`：多格来语
`dov`：敦贝语
`dv`：第维埃语
`dz`：宗卡语
`ee`：Ewe
`el`：希腊语
`en`：英语
`eo`：世界语
`es`：西班牙语
`et`：爱沙尼亚语
`eu`：巴斯克语
`fa`：波斯语
`ff`：富拉语
`fi`：芬兰语
`fil`：菲律宾语（塔加拉语）
`fj`：斐济语
`fr`：法语
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fy`：弗里斯兰语
`ga`：爱尔兰语
`gaa`：加 (Ga) 语
`gd`：苏格兰盖尔语
`gl`：加利西亚语
`gn`：瓜拉尼语
`gom`：贡根语
`gu`：古吉拉特语
`gv`：马恩岛语
`ha`：Hausa
`haw`：夏威夷语
`he`：希伯来语
`hi`：印地语
`hil`：希利盖农语
`hmn`：苗语
`hr`：克罗地亚语
`hrx`：洪斯吕克语
`ht`：海地克里奥尔语
`hu`：匈牙利语
`hy`：亚美尼亚语
`id`：印度尼西亚语
`ig`：Igbo
`ilo`：伊洛果语
`is`：冰岛语
`it`：意大利语
`iw`：希伯来语
`ja`：日语
`jv`：爪哇语
`jw`：爪哇语
`ka`：格鲁吉亚语
`kk`：哈萨克语
`km`：高棉语
`kn`：卡纳达语
`ko`：韩语
`kri`：Krio
`ku`：库尔德语（库尔曼吉语）
`ktu`：吉土巴语
`ky`：吉尔吉斯语
`la`：拉丁语
`lb`：卢森堡语
`lg`：干达语（卢干达语）
`li`：林堡语
`lij`：利古里亚语
`lmo`：伦巴第语
`ln`：林加拉语
`lo`：老挝语
`lt`：立陶宛语
`ltg`：拉特加莱语
`luo`：Luo
`lus`：米佐语
`lv`：拉脱维亚语
`mai`：迈蒂利语
`mak`：马卡萨
`mg`：马尔加什语
`mi`：毛利语
`min`：米南语
`mk`：马其顿语
`ml`：马拉雅拉姆语
`mn`：蒙古语
`mr`：马拉地语
`ms`：马来语
`mt`：马耳他语
`my`：缅甸语
`ne`：尼泊尔语
`new`：尼瓦尔语
`nl`：荷兰语
`no`：挪威语
`nr`：恩德贝莱语（南部）
`nso`：北索托语（塞佩蒂语）
`nus`：努尔语
`ny`：齐切瓦语（尼扬贾语）
`oc`：奥克斯坦语
`om`：Oromo
`or`：奥里亚语
`pa`：旁遮普语
`pag`：邦阿西楠语
`pam`：邦板牙语
`pap`：Papiamento
`pl`：波兰语
`ps`：Pashto
`pt`：葡萄牙语
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`qu`：克丘亚语
`ro`：罗马尼亚语
`rom`：罗姆语
`rn`：Rundi
`ru`：俄语
`rw`：卢旺达语
`sa`：梵语
`scn`：西西里语
`sd`：信德语
`sg`：Sango
`shn`：掸语
`si`：僧伽罗语
`sk`：斯洛伐克语
`sl`：斯洛文尼亚语
`sm`：萨摩亚语
`sn`：修纳语
`so`：索马里语
`sq`：阿尔巴尼亚语
`sr`：塞尔维亚语
`ss`：斯瓦特语
`st`：塞索托语
`su`：巽他语
`sv`：瑞典语
`sw`：斯瓦希里语
`szl`：西里西亚语
`ta`：泰米尔语
`te`：泰卢固语
`tet`：德顿语
`tg`：塔吉克语
`th`：泰语
`ti`：提格里尼亚语
`tk`：土库曼语
`tl`：菲律宾语（塔加拉语）
`tn`：茨瓦纳语
`tr`：土耳其语
`ts`：聪加语
`tt`：鞑靼语
`ug`：维吾尔语
`uk`：乌克兰语
`ur`：乌尔都语
`uz`：乌兹别克语
`vi`：越南语
`xh`：科萨语
`yi`：意第绪语
`yo`：约鲁巴语
`yua`：尤卡坦玛雅语
`yue`：粤语
`zh`：简体中文
`zh-TW`：中文（繁体）
`zu`：祖鲁语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
     * @param TranslateDstLanguage 字幕翻译目标语言
当TranslateSwitch为ON的时候生效，翻译语言列表：
`ab`：阿布哈兹语
`ace`：亚齐语
`ach`：阿乔利语
`af`：南非荷兰语
`ak`：契维语（阿坎语）
`am`：Amharic
`ar`：阿拉伯语
`as`：阿萨姆语
`ay`：艾马拉语
`az`：阿塞拜疆语
`ba`：巴什基尔语
`ban`：巴厘语
`bbc`：巴塔克托巴语
`bem`：Bemba
`bew`：Betawi
`bg`：保加利亚语
`bho`：博杰普尔语
`bik`：Bikol
`bm`：班巴拉语
`bn`：孟加拉语
`br`：布列塔尼语
`bs`：波斯尼亚语
`btx`：巴塔克卡罗语
`bts`：巴塔克西马隆贡语
`bua`：布里亚特语
`ca`：加泰罗尼亚语
`ceb`：宿务语
`cgg`：Kiga
`chm`：草原马里语
`ckb`：库尔德语（索拉尼语）
`cnh`：哈卡钦语
`co`：科西嘉语
`crh`：克里米亚鞑靼语
`crs`：塞舌尔克里奥尔语
`cs`：捷克语
`cv`：楚瓦什语
`cy`：威尔士语
`da`：丹麦语
`de`：德语
`din`：Dinka
`doi`：多格来语
`dov`：敦贝语
`dv`：第维埃语
`dz`：宗卡语
`ee`：Ewe
`el`：希腊语
`en`：英语
`eo`：世界语
`es`：西班牙语
`et`：爱沙尼亚语
`eu`：巴斯克语
`fa`：波斯语
`ff`：富拉语
`fi`：芬兰语
`fil`：菲律宾语（塔加拉语）
`fj`：斐济语
`fr`：法语
`fr-CA`：法语（加拿大）
`fr-FR`：法语（法国）
`fy`：弗里斯兰语
`ga`：爱尔兰语
`gaa`：加 (Ga) 语
`gd`：苏格兰盖尔语
`gl`：加利西亚语
`gn`：瓜拉尼语
`gom`：贡根语
`gu`：古吉拉特语
`gv`：马恩岛语
`ha`：Hausa
`haw`：夏威夷语
`he`：希伯来语
`hi`：印地语
`hil`：希利盖农语
`hmn`：苗语
`hr`：克罗地亚语
`hrx`：洪斯吕克语
`ht`：海地克里奥尔语
`hu`：匈牙利语
`hy`：亚美尼亚语
`id`：印度尼西亚语
`ig`：Igbo
`ilo`：伊洛果语
`is`：冰岛语
`it`：意大利语
`iw`：希伯来语
`ja`：日语
`jv`：爪哇语
`jw`：爪哇语
`ka`：格鲁吉亚语
`kk`：哈萨克语
`km`：高棉语
`kn`：卡纳达语
`ko`：韩语
`kri`：Krio
`ku`：库尔德语（库尔曼吉语）
`ktu`：吉土巴语
`ky`：吉尔吉斯语
`la`：拉丁语
`lb`：卢森堡语
`lg`：干达语（卢干达语）
`li`：林堡语
`lij`：利古里亚语
`lmo`：伦巴第语
`ln`：林加拉语
`lo`：老挝语
`lt`：立陶宛语
`ltg`：拉特加莱语
`luo`：Luo
`lus`：米佐语
`lv`：拉脱维亚语
`mai`：迈蒂利语
`mak`：马卡萨
`mg`：马尔加什语
`mi`：毛利语
`min`：米南语
`mk`：马其顿语
`ml`：马拉雅拉姆语
`mn`：蒙古语
`mr`：马拉地语
`ms`：马来语
`mt`：马耳他语
`my`：缅甸语
`ne`：尼泊尔语
`new`：尼瓦尔语
`nl`：荷兰语
`no`：挪威语
`nr`：恩德贝莱语（南部）
`nso`：北索托语（塞佩蒂语）
`nus`：努尔语
`ny`：齐切瓦语（尼扬贾语）
`oc`：奥克斯坦语
`om`：Oromo
`or`：奥里亚语
`pa`：旁遮普语
`pag`：邦阿西楠语
`pam`：邦板牙语
`pap`：Papiamento
`pl`：波兰语
`ps`：Pashto
`pt`：葡萄牙语
`pt-BR`：葡萄牙语（巴西）
`pt-PT`：葡萄牙语（葡萄牙）
`qu`：克丘亚语
`ro`：罗马尼亚语
`rom`：罗姆语
`rn`：Rundi
`ru`：俄语
`rw`：卢旺达语
`sa`：梵语
`scn`：西西里语
`sd`：信德语
`sg`：Sango
`shn`：掸语
`si`：僧伽罗语
`sk`：斯洛伐克语
`sl`：斯洛文尼亚语
`sm`：萨摩亚语
`sn`：修纳语
`so`：索马里语
`sq`：阿尔巴尼亚语
`sr`：塞尔维亚语
`ss`：斯瓦特语
`st`：塞索托语
`su`：巽他语
`sv`：瑞典语
`sw`：斯瓦希里语
`szl`：西里西亚语
`ta`：泰米尔语
`te`：泰卢固语
`tet`：德顿语
`tg`：塔吉克语
`th`：泰语
`ti`：提格里尼亚语
`tk`：土库曼语
`tl`：菲律宾语（塔加拉语）
`tn`：茨瓦纳语
`tr`：土耳其语
`ts`：聪加语
`tt`：鞑靼语
`ug`：维吾尔语
`uk`：乌克兰语
`ur`：乌尔都语
`uz`：乌兹别克语
`vi`：越南语
`xh`：科萨语
`yi`：意第绪语
`yo`：约鲁巴语
`yua`：尤卡坦玛雅语
`yue`：粤语
`zh`：简体中文
`zh-TW`：中文（繁体）
`zu`：祖鲁语

**注意**：多语言方式，则使用 `/` 分割，如：`en/ja`，表示英语和日语。
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
- 2：OCR识别字幕

**注意**：不传的情况下，默认是ASR方式 
     * @return ProcessType 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
- 2：OCR识别字幕

**注意**：不传的情况下，默认是ASR方式
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
- 2：OCR识别字幕

**注意**：不传的情况下，默认是ASR方式
     * @param ProcessType 字幕处理类型：
- 0：ASR识别字幕
- 1：纯字幕翻译
- 2：OCR识别字幕

**注意**：不传的情况下，默认是ASR方式
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    public ModifySmartSubtitleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySmartSubtitleTemplateRequest(ModifySmartSubtitleTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);

    }
}

