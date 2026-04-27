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

public class RawSmartSubtitleParameter extends AbstractModel {

    /**
    * <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
    */
    @SerializedName("SubtitleType")
    @Expose
    private Long SubtitleType;

    /**
    * <p>智能字幕视频源语言<br>OCR识别仅支持以下语言：<br><code>zh_en</code>：中英<br><code>multi</code>：其他<br>ASR识别和纯字幕翻译当前支持以下语言：<br><code>auto</code>：自动识别<br><code>zh</code>：简体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>vi</code>：越南语<br><code>ms</code>：马来语<br><code>id</code>：印度尼西亚语<br><code>fil</code>：菲律宾语<br><code>th</code>：泰语<br><code>pt</code>：葡萄牙语<br><code>tr</code>：土耳其语<br><code>ar</code>：阿拉伯语<br><code>es</code>：西班牙语<br><code>hi</code>：印地语<br><code>fr</code>：法语<br><code>de</code>：德语<br><code>it</code>：意大利语<br><code>zh_dialect</code>：中文方言<br><code>zh_en</code>：中英<br><code>yue</code>：粤语<br><code>ru</code>：俄语<br><code>prime_zh</code>：中英方言<br><code>af-ZA</code>：南非荷兰语（南非）<br><code>sq-AL</code>：阿尔巴尼亚语（阿尔巴尼亚）<br><code>am-ET</code>：阿姆哈拉语（埃塞俄比亚）<br><code>ar-DZ</code>：阿拉伯语（阿尔及利亚）<br><code>ar-BH</code>：阿拉伯语（巴林）<br><code>ar-EG</code>：阿拉伯语（埃及）<br><code>ar-IQ</code>：阿拉伯语（伊拉克）<br><code>ar-IL</code>：阿拉伯语（以色列）<br><code>ar-JO</code>：阿拉伯语（约旦）<br><code>ar-KW</code>：阿拉伯语（科威特）<br><code>ar-LB</code>：阿拉伯语（黎巴嫩）<br><code>ar-MR</code>：阿拉伯语（毛里塔尼亚）<br><code>ar-MA</code>：阿拉伯语（摩洛哥）<br><code>ar-OM</code>：阿拉伯语（阿曼）<br><code>ar-QA</code>：阿拉伯语（卡塔尔）<br><code>ar-SA</code>：阿拉伯语（沙特阿拉伯）<br><code>ar-PS</code>：阿拉伯语（巴勒斯坦国）<br><code>ar-SY</code>：阿拉伯语（叙利亚）<br><code>ar-TN</code>：阿拉伯语（突尼斯）<br><code>ar-AE</code>：阿拉伯语（阿拉伯联合酋长国）<br><code>ar-YE</code>：阿拉伯语（也门）<br><code>hy-AM</code>：亚美尼亚语（亚美尼亚）<br><code>az-AZ</code>：阿塞拜疆语（阿塞拜疆）<br><code>eu-ES</code>：巴斯克语（西班牙）<br><code>bn-BD</code>：孟加拉语（孟加拉）<br><code>bn-IN</code>：孟加拉语（印度）<br><code>bs-BA</code>：波斯尼亚语（波斯尼亚和黑塞哥维那）<br><code>bg-BG</code>：保加利亚语（保加利亚）<br><code>my-MM</code>：缅甸语（缅甸）<br><code>ca-ES</code>：加泰罗尼亚语（西班牙）<br><code>hr-HR</code>：克罗地亚语（克罗地亚）<br><code>cs-CZ</code>：捷克语（捷克共和国）<br><code>da-DK</code>：丹麦语（丹麦）<br><code>nl-BE</code>：荷兰语（比利时）<br><code>nl-NL</code>：荷兰语（荷兰）<br><code>en-AU</code>：英语（澳大利亚）<br><code>en-CA</code>：英语（加拿大）<br><code>en-GH</code>：英语（加纳）<br><code>en-HK</code>：英语（中国香港）<br><code>en-IN</code>：英语（印度）<br><code>en-IE</code>：英语（爱尔兰）<br><code>en-KE</code>：英语（肯尼亚）<br><code>en-NZ</code>：英语（新西兰）<br><code>en-NG</code>：英语（尼日利亚）<br><code>en-PK</code>：英语（巴基斯坦）<br><code>en-PH</code>：英语（菲律宾）<br><code>en-SG</code>：英语（新加坡）<br><code>en-ZA</code>：英语（南非）<br><code>en-TZ</code>：英语（坦桑尼亚）<br><code>en-GB</code>：英语（英国）<br><code>en-US</code>：英语（美国）<br><code>et-EE</code>：爱沙尼亚语（爱沙尼亚）<br><code>fil-PH</code>：菲律宾语（菲律宾）<br><code>fi-FI</code>：芬兰语（芬兰）<br><code>fr-BE</code>：法语（比利时）<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fr-CH</code>：法语（瑞士）<br><code>gl-ES</code>：加利西亚语（西班牙）<br><code>ka-GE</code>：格鲁吉亚语（格鲁吉亚）<br><code>el-GR</code>：希腊语（希腊）<br><code>gu-IN</code>：古吉拉特语（印度）<br><code>iw-IL</code>：希伯来语（以色列）<br><code>hi-IN</code>：印地语（印度）<br><code>hu-HU</code>：匈牙利语（匈牙利）<br><code>is-IS</code>：冰岛语（冰岛）<br><code>id-ID</code>：印度尼西亚语（印度尼西亚）<br><code>it-IT</code>：意大利语（意大利）<br><code>it-CH</code>：意大利语（瑞士）<br><code>ja-JP</code>：日语（日本）<br><code>jv-ID</code>：爪哇语（印度尼西亚）<br><code>kn-IN</code>：卡纳达语（印度）<br><code>kk-KZ</code>：哈萨克语（哈萨克斯坦）<br><code>km-KH</code>：高棉语（柬埔寨）<br><code>rw-RW</code>：卢旺达语（卢旺达）<br><code>ko-KR</code>：韩语（韩国）<br><code>lo-LA</code>：老挝语（老挝）<br><code>lv-LV</code>：拉脱维亚语（拉脱维亚）<br><code>lt-LT</code>：立陶宛语（立陶宛）<br><code>mk-MK</code>：马其顿语（北马其顿）<br><code>ms-MY</code>：马来语（马来西亚）<br><code>ml-IN</code>：马拉雅拉姆语（印度）<br><code>mr-IN</code>：马拉地语（印度）<br><code>mn-MN</code>：蒙古语（蒙古）<br><code>ne-NP</code>：尼泊尔语（尼泊尔）<br><code>no-NO</code>：博克马尔挪威语（挪威）<br><code>fa-IR</code>：波斯语（伊朗）<br><code>pl-PL</code>：波兰语（波兰）<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>ro-RO</code>：罗马尼亚语（罗马尼亚）<br><code>ru-RU</code>：俄语（俄罗斯）<br><code>sr-RS</code>：塞尔维亚语（塞尔维亚）<br><code>si-LK</code>：僧伽罗语（斯里兰卡）<br><code>sk-SK</code>：斯洛伐克语（斯洛伐克）<br><code>sl-SI</code>：斯洛文尼亚语（斯洛文尼亚）<br><code>st-ZA</code>：南索托语（南非）<br><code>es-AR</code>：西班牙语（阿根廷）<br><code>es-BO</code>：西班牙语（玻利维亚）<br><code>es-CL</code>：西班牙语（智利）<br><code>es-CO</code>：西班牙语（哥伦比亚）<br><code>es-CR</code>：西班牙语（哥斯达黎加）<br><code>es-DO</code>：西班牙语（多米尼加共和国）<br><code>es-EC</code>：西班牙语（厄瓜多尔）<br><code>es-SV</code>：西班牙语（萨尔瓦多）<br><code>es-GT</code>：西班牙语（危地马拉）<br><code>es-HN</code>：西班牙语（洪都拉斯）<br><code>es-MX</code>：西班牙语（墨西哥）<br><code>es-NI</code>：西班牙语（尼加拉瓜）<br><code>es-PA</code>：西班牙语（巴拿马）<br><code>es-PY</code>：西班牙语（巴拉圭）<br><code>es-PE</code>：西班牙语（秘鲁）<br><code>es-PR</code>：西班牙语（波多黎各）<br><code>es-ES</code>：西班牙语（西班牙）<br><code>es-US</code>：西班牙语（美国）<br><code>es-UY</code>：西班牙语（乌拉圭）<br><code>es-VE</code>：西班牙语（委内瑞拉）<br><code>su-ID</code>：巽他语（印度尼西亚）<br><code>sw-KE</code>：斯瓦希里语（肯尼亚）<br><code>sw-TZ</code>：斯瓦希里语（坦桑尼亚）<br><code>sv-SE</code>：瑞典语（瑞典）<br><code>ta-IN</code>：泰米尔语（印度）<br><code>ta-MY</code>：泰米尔语（马来西亚）<br><code>ta-SG</code>：泰米尔语（新加坡）<br><code>ta-LK</code>：泰米尔语（斯里兰卡）<br><code>te-IN</code>：泰卢固语（印度）<br><code>th-TH</code>：泰语（泰国）<br><code>ts-ZA</code>：聪加语（南非）<br><code>tr-TR</code>：土耳其语（土耳其）<br><code>uk-UA</code>：乌克兰语（乌克兰）<br><code>ur-IN</code>：乌尔都语（印度）<br><code>ur-PK</code>：乌尔都语（巴基斯坦）<br><code>uz-UZ</code>：乌兹别克语（乌兹别克斯坦）<br><code>ve-ZA</code>：文达语（南非）<br><code>vi-VN</code>：越南语（越南）<br><code>xh-ZA</code>：科萨语（南非）<br><code>zu-ZA</code>：祖鲁语（南非）</p>
    */
    @SerializedName("VideoSrcLanguage")
    @Expose
    private String VideoSrcLanguage;

    /**
    * <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译和OCR识别翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleFormat")
    @Expose
    private String SubtitleFormat;

    /**
    * <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateSwitch")
    @Expose
    private String TranslateSwitch;

    /**
    * <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效，翻译语言列表：<br><code>ab</code>：阿布哈兹语<br><code>ace</code>：亚齐语<br><code>ach</code>：阿乔利语<br><code>af</code>：南非荷兰语<br><code>ak</code>：契维语（阿坎语）<br><code>am</code>：Amharic<br><code>ar</code>：阿拉伯语<br><code>as</code>：阿萨姆语<br><code>ay</code>：艾马拉语<br><code>az</code>：阿塞拜疆语<br><code>ba</code>：巴什基尔语<br><code>ban</code>：巴厘语<br><code>bbc</code>：巴塔克托巴语<br><code>bem</code>：Bemba<br><code>bew</code>：Betawi<br><code>bg</code>：保加利亚语<br><code>bho</code>：博杰普尔语<br><code>bik</code>：Bikol<br><code>bm</code>：班巴拉语<br><code>bn</code>：孟加拉语<br><code>br</code>：布列塔尼语<br><code>bs</code>：波斯尼亚语<br><code>btx</code>：巴塔克卡罗语<br><code>bts</code>：巴塔克西马隆贡语<br><code>bua</code>：布里亚特语<br><code>ca</code>：加泰罗尼亚语<br><code>ceb</code>：宿务语<br><code>cgg</code>：Kiga<br><code>chm</code>：草原马里语<br><code>ckb</code>：库尔德语（索拉尼语）<br><code>cnh</code>：哈卡钦语<br><code>co</code>：科西嘉语<br><code>crh</code>：克里米亚鞑靼语<br><code>crs</code>：塞舌尔克里奥尔语<br><code>cs</code>：捷克语<br><code>cv</code>：楚瓦什语<br><code>cy</code>：威尔士语<br><code>da</code>：丹麦语<br><code>de</code>：德语<br><code>din</code>：Dinka<br><code>doi</code>：多格来语<br><code>dov</code>：敦贝语<br><code>dv</code>：第维埃语<br><code>dz</code>：宗卡语<br><code>ee</code>：Ewe<br><code>el</code>：希腊语<br><code>en</code>：英语<br><code>eo</code>：世界语<br><code>es</code>：西班牙语<br><code>et</code>：爱沙尼亚语<br><code>eu</code>：巴斯克语<br><code>fa</code>：波斯语<br><code>ff</code>：富拉语<br><code>fi</code>：芬兰语<br><code>fil</code>：菲律宾语（塔加拉语）<br><code>fj</code>：斐济语<br><code>fr</code>：法语<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fy</code>：弗里斯兰语<br><code>ga</code>：爱尔兰语<br><code>gaa</code>：加 (Ga) 语<br><code>gd</code>：苏格兰盖尔语<br><code>gl</code>：加利西亚语<br><code>gn</code>：瓜拉尼语<br><code>gom</code>：贡根语<br><code>gu</code>：古吉拉特语<br><code>gv</code>：马恩岛语<br><code>ha</code>：Hausa<br><code>haw</code>：夏威夷语<br><code>he</code>：希伯来语<br><code>hi</code>：印地语<br><code>hil</code>：希利盖农语<br><code>hmn</code>：苗语<br><code>hr</code>：克罗地亚语<br><code>hrx</code>：洪斯吕克语<br><code>ht</code>：海地克里奥尔语<br><code>hu</code>：匈牙利语<br><code>hy</code>：亚美尼亚语<br><code>id</code>：印度尼西亚语<br><code>ig</code>：Igbo<br><code>ilo</code>：伊洛果语<br><code>is</code>：冰岛语<br><code>it</code>：意大利语<br><code>iw</code>：希伯来语<br><code>ja</code>：日语<br><code>jv</code>：爪哇语<br><code>ka</code>：格鲁吉亚语<br><code>kk</code>：哈萨克语<br><code>km</code>：高棉语<br><code>kn</code>：卡纳达语<br><code>ko</code>：韩语<br><code>kri</code>：Krio<br><code>ku</code>：库尔德语（库尔曼吉语）<br><code>ktu</code>：吉土巴语<br><code>ky</code>：吉尔吉斯语<br><code>la</code>：拉丁语<br><code>lb</code>：卢森堡语<br><code>lg</code>：干达语（卢干达语）<br><code>li</code>：林堡语<br><code>lij</code>：利古里亚语<br><code>lmo</code>：伦巴第语<br><code>ln</code>：林加拉语<br><code>lo</code>：老挝语<br><code>lt</code>：立陶宛语<br><code>ltg</code>：拉特加莱语<br><code>luo</code>：Luo<br><code>lus</code>：米佐语<br><code>lv</code>：拉脱维亚语<br><code>mai</code>：迈蒂利语<br><code>mak</code>：马卡萨<br><code>mg</code>：马尔加什语<br><code>mi</code>：毛利语<br><code>min</code>：米南语<br><code>mk</code>：马其顿语<br><code>ml</code>：马拉雅拉姆语<br><code>mn</code>：蒙古语<br><code>mr</code>：马拉地语<br><code>ms</code>：马来语<br><code>mt</code>：马耳他语<br><code>my</code>：缅甸语<br><code>ne</code>：尼泊尔语<br><code>new</code>：尼瓦尔语<br><code>nl</code>：荷兰语<br><code>no</code>：挪威语<br><code>nr</code>：恩德贝莱语（南部）<br><code>nso</code>：北索托语（塞佩蒂语）<br><code>nus</code>：努尔语<br><code>ny</code>：齐切瓦语（尼扬贾语）<br><code>oc</code>：奥克斯坦语<br><code>om</code>：Oromo<br><code>or</code>：奥里亚语<br><code>pa</code>：旁遮普语<br><code>pag</code>：邦阿西楠语<br><code>pam</code>：邦板牙语<br><code>pap</code>：Papiamento<br><code>pl</code>：波兰语<br><code>ps</code>：Pashto<br><code>pt</code>：葡萄牙语<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>qu</code>：克丘亚语<br><code>ro</code>：罗马尼亚语<br><code>rom</code>：罗姆语<br><code>rn</code>：Rundi<br><code>ru</code>：俄语<br><code>rw</code>：卢旺达语<br><code>sa</code>：梵语<br><code>scn</code>：西西里语<br><code>sd</code>：信德语<br><code>sg</code>：Sango<br><code>shn</code>：掸语<br><code>si</code>：僧伽罗语<br><code>sk</code>：斯洛伐克语<br><code>sl</code>：斯洛文尼亚语<br><code>sm</code>：萨摩亚语<br><code>sn</code>：修纳语<br><code>so</code>：索马里语<br><code>sq</code>：阿尔巴尼亚语<br><code>sr</code>：塞尔维亚语<br><code>ss</code>：斯瓦特语<br><code>st</code>：塞索托语<br><code>su</code>：巽他语<br><code>sv</code>：瑞典语<br><code>sw</code>：斯瓦希里语<br><code>szl</code>：西里西亚语<br><code>ta</code>：泰米尔语<br><code>te</code>：泰卢固语<br><code>tet</code>：德顿语<br><code>tg</code>：塔吉克语<br><code>th</code>：泰语<br><code>ti</code>：提格里尼亚语<br><code>tk</code>：土库曼语<br><code>tn</code>：茨瓦纳语<br><code>tr</code>：土耳其语<br><code>ts</code>：聪加语<br><code>tt</code>：鞑靼语<br><code>ug</code>：维吾尔语<br><code>uk</code>：乌克兰语<br><code>ur</code>：乌尔都语<br><code>uz</code>：乌兹别克语<br><code>vi</code>：越南语<br><code>xh</code>：科萨语<br><code>yi</code>：意第绪语<br><code>yo</code>：约鲁巴语<br><code>yua</code>：尤卡坦玛雅语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：中文（繁体）<br><code>zu</code>：祖鲁语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TranslateDstLanguage")
    @Expose
    private String TranslateDstLanguage;

    /**
    * <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrHotWordsConfigure")
    @Expose
    private AsrHotWordsConfigure AsrHotWordsConfigure;

    /**
    * <p>自定义参数</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
    * <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private Long ProcessType;

    /**
    * <p>字幕OCR提取框选区域配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectingSubtitleAreasConfig")
    @Expose
    private SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig;

    /**
    * <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写</p>
    */
    @SerializedName("SubtitleEmbedId")
    @Expose
    private Long SubtitleEmbedId;

    /**
    * <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
    */
    @SerializedName("SpeakerMode")
    @Expose
    private Long SpeakerMode;

    /**
    * <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
    */
    @SerializedName("SpeakerLabel")
    @Expose
    private Long SpeakerLabel;

    /**
     * Get <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p> 
     * @return SubtitleType <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
     */
    public Long getSubtitleType() {
        return this.SubtitleType;
    }

    /**
     * Set <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
     * @param SubtitleType <p>智能字幕字幕语言类型<br>0: 源语言<br>1: 翻译语言<br>2: 源语言+翻译语言<br>当TranslateSwitch为OFF时仅支持取0<br>当TranslateSwitch为ON时仅支持取1或2</p>
     */
    public void setSubtitleType(Long SubtitleType) {
        this.SubtitleType = SubtitleType;
    }

    /**
     * Get <p>智能字幕视频源语言<br>OCR识别仅支持以下语言：<br><code>zh_en</code>：中英<br><code>multi</code>：其他<br>ASR识别和纯字幕翻译当前支持以下语言：<br><code>auto</code>：自动识别<br><code>zh</code>：简体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>vi</code>：越南语<br><code>ms</code>：马来语<br><code>id</code>：印度尼西亚语<br><code>fil</code>：菲律宾语<br><code>th</code>：泰语<br><code>pt</code>：葡萄牙语<br><code>tr</code>：土耳其语<br><code>ar</code>：阿拉伯语<br><code>es</code>：西班牙语<br><code>hi</code>：印地语<br><code>fr</code>：法语<br><code>de</code>：德语<br><code>it</code>：意大利语<br><code>zh_dialect</code>：中文方言<br><code>zh_en</code>：中英<br><code>yue</code>：粤语<br><code>ru</code>：俄语<br><code>prime_zh</code>：中英方言<br><code>af-ZA</code>：南非荷兰语（南非）<br><code>sq-AL</code>：阿尔巴尼亚语（阿尔巴尼亚）<br><code>am-ET</code>：阿姆哈拉语（埃塞俄比亚）<br><code>ar-DZ</code>：阿拉伯语（阿尔及利亚）<br><code>ar-BH</code>：阿拉伯语（巴林）<br><code>ar-EG</code>：阿拉伯语（埃及）<br><code>ar-IQ</code>：阿拉伯语（伊拉克）<br><code>ar-IL</code>：阿拉伯语（以色列）<br><code>ar-JO</code>：阿拉伯语（约旦）<br><code>ar-KW</code>：阿拉伯语（科威特）<br><code>ar-LB</code>：阿拉伯语（黎巴嫩）<br><code>ar-MR</code>：阿拉伯语（毛里塔尼亚）<br><code>ar-MA</code>：阿拉伯语（摩洛哥）<br><code>ar-OM</code>：阿拉伯语（阿曼）<br><code>ar-QA</code>：阿拉伯语（卡塔尔）<br><code>ar-SA</code>：阿拉伯语（沙特阿拉伯）<br><code>ar-PS</code>：阿拉伯语（巴勒斯坦国）<br><code>ar-SY</code>：阿拉伯语（叙利亚）<br><code>ar-TN</code>：阿拉伯语（突尼斯）<br><code>ar-AE</code>：阿拉伯语（阿拉伯联合酋长国）<br><code>ar-YE</code>：阿拉伯语（也门）<br><code>hy-AM</code>：亚美尼亚语（亚美尼亚）<br><code>az-AZ</code>：阿塞拜疆语（阿塞拜疆）<br><code>eu-ES</code>：巴斯克语（西班牙）<br><code>bn-BD</code>：孟加拉语（孟加拉）<br><code>bn-IN</code>：孟加拉语（印度）<br><code>bs-BA</code>：波斯尼亚语（波斯尼亚和黑塞哥维那）<br><code>bg-BG</code>：保加利亚语（保加利亚）<br><code>my-MM</code>：缅甸语（缅甸）<br><code>ca-ES</code>：加泰罗尼亚语（西班牙）<br><code>hr-HR</code>：克罗地亚语（克罗地亚）<br><code>cs-CZ</code>：捷克语（捷克共和国）<br><code>da-DK</code>：丹麦语（丹麦）<br><code>nl-BE</code>：荷兰语（比利时）<br><code>nl-NL</code>：荷兰语（荷兰）<br><code>en-AU</code>：英语（澳大利亚）<br><code>en-CA</code>：英语（加拿大）<br><code>en-GH</code>：英语（加纳）<br><code>en-HK</code>：英语（中国香港）<br><code>en-IN</code>：英语（印度）<br><code>en-IE</code>：英语（爱尔兰）<br><code>en-KE</code>：英语（肯尼亚）<br><code>en-NZ</code>：英语（新西兰）<br><code>en-NG</code>：英语（尼日利亚）<br><code>en-PK</code>：英语（巴基斯坦）<br><code>en-PH</code>：英语（菲律宾）<br><code>en-SG</code>：英语（新加坡）<br><code>en-ZA</code>：英语（南非）<br><code>en-TZ</code>：英语（坦桑尼亚）<br><code>en-GB</code>：英语（英国）<br><code>en-US</code>：英语（美国）<br><code>et-EE</code>：爱沙尼亚语（爱沙尼亚）<br><code>fil-PH</code>：菲律宾语（菲律宾）<br><code>fi-FI</code>：芬兰语（芬兰）<br><code>fr-BE</code>：法语（比利时）<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fr-CH</code>：法语（瑞士）<br><code>gl-ES</code>：加利西亚语（西班牙）<br><code>ka-GE</code>：格鲁吉亚语（格鲁吉亚）<br><code>el-GR</code>：希腊语（希腊）<br><code>gu-IN</code>：古吉拉特语（印度）<br><code>iw-IL</code>：希伯来语（以色列）<br><code>hi-IN</code>：印地语（印度）<br><code>hu-HU</code>：匈牙利语（匈牙利）<br><code>is-IS</code>：冰岛语（冰岛）<br><code>id-ID</code>：印度尼西亚语（印度尼西亚）<br><code>it-IT</code>：意大利语（意大利）<br><code>it-CH</code>：意大利语（瑞士）<br><code>ja-JP</code>：日语（日本）<br><code>jv-ID</code>：爪哇语（印度尼西亚）<br><code>kn-IN</code>：卡纳达语（印度）<br><code>kk-KZ</code>：哈萨克语（哈萨克斯坦）<br><code>km-KH</code>：高棉语（柬埔寨）<br><code>rw-RW</code>：卢旺达语（卢旺达）<br><code>ko-KR</code>：韩语（韩国）<br><code>lo-LA</code>：老挝语（老挝）<br><code>lv-LV</code>：拉脱维亚语（拉脱维亚）<br><code>lt-LT</code>：立陶宛语（立陶宛）<br><code>mk-MK</code>：马其顿语（北马其顿）<br><code>ms-MY</code>：马来语（马来西亚）<br><code>ml-IN</code>：马拉雅拉姆语（印度）<br><code>mr-IN</code>：马拉地语（印度）<br><code>mn-MN</code>：蒙古语（蒙古）<br><code>ne-NP</code>：尼泊尔语（尼泊尔）<br><code>no-NO</code>：博克马尔挪威语（挪威）<br><code>fa-IR</code>：波斯语（伊朗）<br><code>pl-PL</code>：波兰语（波兰）<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>ro-RO</code>：罗马尼亚语（罗马尼亚）<br><code>ru-RU</code>：俄语（俄罗斯）<br><code>sr-RS</code>：塞尔维亚语（塞尔维亚）<br><code>si-LK</code>：僧伽罗语（斯里兰卡）<br><code>sk-SK</code>：斯洛伐克语（斯洛伐克）<br><code>sl-SI</code>：斯洛文尼亚语（斯洛文尼亚）<br><code>st-ZA</code>：南索托语（南非）<br><code>es-AR</code>：西班牙语（阿根廷）<br><code>es-BO</code>：西班牙语（玻利维亚）<br><code>es-CL</code>：西班牙语（智利）<br><code>es-CO</code>：西班牙语（哥伦比亚）<br><code>es-CR</code>：西班牙语（哥斯达黎加）<br><code>es-DO</code>：西班牙语（多米尼加共和国）<br><code>es-EC</code>：西班牙语（厄瓜多尔）<br><code>es-SV</code>：西班牙语（萨尔瓦多）<br><code>es-GT</code>：西班牙语（危地马拉）<br><code>es-HN</code>：西班牙语（洪都拉斯）<br><code>es-MX</code>：西班牙语（墨西哥）<br><code>es-NI</code>：西班牙语（尼加拉瓜）<br><code>es-PA</code>：西班牙语（巴拿马）<br><code>es-PY</code>：西班牙语（巴拉圭）<br><code>es-PE</code>：西班牙语（秘鲁）<br><code>es-PR</code>：西班牙语（波多黎各）<br><code>es-ES</code>：西班牙语（西班牙）<br><code>es-US</code>：西班牙语（美国）<br><code>es-UY</code>：西班牙语（乌拉圭）<br><code>es-VE</code>：西班牙语（委内瑞拉）<br><code>su-ID</code>：巽他语（印度尼西亚）<br><code>sw-KE</code>：斯瓦希里语（肯尼亚）<br><code>sw-TZ</code>：斯瓦希里语（坦桑尼亚）<br><code>sv-SE</code>：瑞典语（瑞典）<br><code>ta-IN</code>：泰米尔语（印度）<br><code>ta-MY</code>：泰米尔语（马来西亚）<br><code>ta-SG</code>：泰米尔语（新加坡）<br><code>ta-LK</code>：泰米尔语（斯里兰卡）<br><code>te-IN</code>：泰卢固语（印度）<br><code>th-TH</code>：泰语（泰国）<br><code>ts-ZA</code>：聪加语（南非）<br><code>tr-TR</code>：土耳其语（土耳其）<br><code>uk-UA</code>：乌克兰语（乌克兰）<br><code>ur-IN</code>：乌尔都语（印度）<br><code>ur-PK</code>：乌尔都语（巴基斯坦）<br><code>uz-UZ</code>：乌兹别克语（乌兹别克斯坦）<br><code>ve-ZA</code>：文达语（南非）<br><code>vi-VN</code>：越南语（越南）<br><code>xh-ZA</code>：科萨语（南非）<br><code>zu-ZA</code>：祖鲁语（南非）</p> 
     * @return VideoSrcLanguage <p>智能字幕视频源语言<br>OCR识别仅支持以下语言：<br><code>zh_en</code>：中英<br><code>multi</code>：其他<br>ASR识别和纯字幕翻译当前支持以下语言：<br><code>auto</code>：自动识别<br><code>zh</code>：简体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>vi</code>：越南语<br><code>ms</code>：马来语<br><code>id</code>：印度尼西亚语<br><code>fil</code>：菲律宾语<br><code>th</code>：泰语<br><code>pt</code>：葡萄牙语<br><code>tr</code>：土耳其语<br><code>ar</code>：阿拉伯语<br><code>es</code>：西班牙语<br><code>hi</code>：印地语<br><code>fr</code>：法语<br><code>de</code>：德语<br><code>it</code>：意大利语<br><code>zh_dialect</code>：中文方言<br><code>zh_en</code>：中英<br><code>yue</code>：粤语<br><code>ru</code>：俄语<br><code>prime_zh</code>：中英方言<br><code>af-ZA</code>：南非荷兰语（南非）<br><code>sq-AL</code>：阿尔巴尼亚语（阿尔巴尼亚）<br><code>am-ET</code>：阿姆哈拉语（埃塞俄比亚）<br><code>ar-DZ</code>：阿拉伯语（阿尔及利亚）<br><code>ar-BH</code>：阿拉伯语（巴林）<br><code>ar-EG</code>：阿拉伯语（埃及）<br><code>ar-IQ</code>：阿拉伯语（伊拉克）<br><code>ar-IL</code>：阿拉伯语（以色列）<br><code>ar-JO</code>：阿拉伯语（约旦）<br><code>ar-KW</code>：阿拉伯语（科威特）<br><code>ar-LB</code>：阿拉伯语（黎巴嫩）<br><code>ar-MR</code>：阿拉伯语（毛里塔尼亚）<br><code>ar-MA</code>：阿拉伯语（摩洛哥）<br><code>ar-OM</code>：阿拉伯语（阿曼）<br><code>ar-QA</code>：阿拉伯语（卡塔尔）<br><code>ar-SA</code>：阿拉伯语（沙特阿拉伯）<br><code>ar-PS</code>：阿拉伯语（巴勒斯坦国）<br><code>ar-SY</code>：阿拉伯语（叙利亚）<br><code>ar-TN</code>：阿拉伯语（突尼斯）<br><code>ar-AE</code>：阿拉伯语（阿拉伯联合酋长国）<br><code>ar-YE</code>：阿拉伯语（也门）<br><code>hy-AM</code>：亚美尼亚语（亚美尼亚）<br><code>az-AZ</code>：阿塞拜疆语（阿塞拜疆）<br><code>eu-ES</code>：巴斯克语（西班牙）<br><code>bn-BD</code>：孟加拉语（孟加拉）<br><code>bn-IN</code>：孟加拉语（印度）<br><code>bs-BA</code>：波斯尼亚语（波斯尼亚和黑塞哥维那）<br><code>bg-BG</code>：保加利亚语（保加利亚）<br><code>my-MM</code>：缅甸语（缅甸）<br><code>ca-ES</code>：加泰罗尼亚语（西班牙）<br><code>hr-HR</code>：克罗地亚语（克罗地亚）<br><code>cs-CZ</code>：捷克语（捷克共和国）<br><code>da-DK</code>：丹麦语（丹麦）<br><code>nl-BE</code>：荷兰语（比利时）<br><code>nl-NL</code>：荷兰语（荷兰）<br><code>en-AU</code>：英语（澳大利亚）<br><code>en-CA</code>：英语（加拿大）<br><code>en-GH</code>：英语（加纳）<br><code>en-HK</code>：英语（中国香港）<br><code>en-IN</code>：英语（印度）<br><code>en-IE</code>：英语（爱尔兰）<br><code>en-KE</code>：英语（肯尼亚）<br><code>en-NZ</code>：英语（新西兰）<br><code>en-NG</code>：英语（尼日利亚）<br><code>en-PK</code>：英语（巴基斯坦）<br><code>en-PH</code>：英语（菲律宾）<br><code>en-SG</code>：英语（新加坡）<br><code>en-ZA</code>：英语（南非）<br><code>en-TZ</code>：英语（坦桑尼亚）<br><code>en-GB</code>：英语（英国）<br><code>en-US</code>：英语（美国）<br><code>et-EE</code>：爱沙尼亚语（爱沙尼亚）<br><code>fil-PH</code>：菲律宾语（菲律宾）<br><code>fi-FI</code>：芬兰语（芬兰）<br><code>fr-BE</code>：法语（比利时）<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fr-CH</code>：法语（瑞士）<br><code>gl-ES</code>：加利西亚语（西班牙）<br><code>ka-GE</code>：格鲁吉亚语（格鲁吉亚）<br><code>el-GR</code>：希腊语（希腊）<br><code>gu-IN</code>：古吉拉特语（印度）<br><code>iw-IL</code>：希伯来语（以色列）<br><code>hi-IN</code>：印地语（印度）<br><code>hu-HU</code>：匈牙利语（匈牙利）<br><code>is-IS</code>：冰岛语（冰岛）<br><code>id-ID</code>：印度尼西亚语（印度尼西亚）<br><code>it-IT</code>：意大利语（意大利）<br><code>it-CH</code>：意大利语（瑞士）<br><code>ja-JP</code>：日语（日本）<br><code>jv-ID</code>：爪哇语（印度尼西亚）<br><code>kn-IN</code>：卡纳达语（印度）<br><code>kk-KZ</code>：哈萨克语（哈萨克斯坦）<br><code>km-KH</code>：高棉语（柬埔寨）<br><code>rw-RW</code>：卢旺达语（卢旺达）<br><code>ko-KR</code>：韩语（韩国）<br><code>lo-LA</code>：老挝语（老挝）<br><code>lv-LV</code>：拉脱维亚语（拉脱维亚）<br><code>lt-LT</code>：立陶宛语（立陶宛）<br><code>mk-MK</code>：马其顿语（北马其顿）<br><code>ms-MY</code>：马来语（马来西亚）<br><code>ml-IN</code>：马拉雅拉姆语（印度）<br><code>mr-IN</code>：马拉地语（印度）<br><code>mn-MN</code>：蒙古语（蒙古）<br><code>ne-NP</code>：尼泊尔语（尼泊尔）<br><code>no-NO</code>：博克马尔挪威语（挪威）<br><code>fa-IR</code>：波斯语（伊朗）<br><code>pl-PL</code>：波兰语（波兰）<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>ro-RO</code>：罗马尼亚语（罗马尼亚）<br><code>ru-RU</code>：俄语（俄罗斯）<br><code>sr-RS</code>：塞尔维亚语（塞尔维亚）<br><code>si-LK</code>：僧伽罗语（斯里兰卡）<br><code>sk-SK</code>：斯洛伐克语（斯洛伐克）<br><code>sl-SI</code>：斯洛文尼亚语（斯洛文尼亚）<br><code>st-ZA</code>：南索托语（南非）<br><code>es-AR</code>：西班牙语（阿根廷）<br><code>es-BO</code>：西班牙语（玻利维亚）<br><code>es-CL</code>：西班牙语（智利）<br><code>es-CO</code>：西班牙语（哥伦比亚）<br><code>es-CR</code>：西班牙语（哥斯达黎加）<br><code>es-DO</code>：西班牙语（多米尼加共和国）<br><code>es-EC</code>：西班牙语（厄瓜多尔）<br><code>es-SV</code>：西班牙语（萨尔瓦多）<br><code>es-GT</code>：西班牙语（危地马拉）<br><code>es-HN</code>：西班牙语（洪都拉斯）<br><code>es-MX</code>：西班牙语（墨西哥）<br><code>es-NI</code>：西班牙语（尼加拉瓜）<br><code>es-PA</code>：西班牙语（巴拿马）<br><code>es-PY</code>：西班牙语（巴拉圭）<br><code>es-PE</code>：西班牙语（秘鲁）<br><code>es-PR</code>：西班牙语（波多黎各）<br><code>es-ES</code>：西班牙语（西班牙）<br><code>es-US</code>：西班牙语（美国）<br><code>es-UY</code>：西班牙语（乌拉圭）<br><code>es-VE</code>：西班牙语（委内瑞拉）<br><code>su-ID</code>：巽他语（印度尼西亚）<br><code>sw-KE</code>：斯瓦希里语（肯尼亚）<br><code>sw-TZ</code>：斯瓦希里语（坦桑尼亚）<br><code>sv-SE</code>：瑞典语（瑞典）<br><code>ta-IN</code>：泰米尔语（印度）<br><code>ta-MY</code>：泰米尔语（马来西亚）<br><code>ta-SG</code>：泰米尔语（新加坡）<br><code>ta-LK</code>：泰米尔语（斯里兰卡）<br><code>te-IN</code>：泰卢固语（印度）<br><code>th-TH</code>：泰语（泰国）<br><code>ts-ZA</code>：聪加语（南非）<br><code>tr-TR</code>：土耳其语（土耳其）<br><code>uk-UA</code>：乌克兰语（乌克兰）<br><code>ur-IN</code>：乌尔都语（印度）<br><code>ur-PK</code>：乌尔都语（巴基斯坦）<br><code>uz-UZ</code>：乌兹别克语（乌兹别克斯坦）<br><code>ve-ZA</code>：文达语（南非）<br><code>vi-VN</code>：越南语（越南）<br><code>xh-ZA</code>：科萨语（南非）<br><code>zu-ZA</code>：祖鲁语（南非）</p>
     */
    public String getVideoSrcLanguage() {
        return this.VideoSrcLanguage;
    }

    /**
     * Set <p>智能字幕视频源语言<br>OCR识别仅支持以下语言：<br><code>zh_en</code>：中英<br><code>multi</code>：其他<br>ASR识别和纯字幕翻译当前支持以下语言：<br><code>auto</code>：自动识别<br><code>zh</code>：简体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>vi</code>：越南语<br><code>ms</code>：马来语<br><code>id</code>：印度尼西亚语<br><code>fil</code>：菲律宾语<br><code>th</code>：泰语<br><code>pt</code>：葡萄牙语<br><code>tr</code>：土耳其语<br><code>ar</code>：阿拉伯语<br><code>es</code>：西班牙语<br><code>hi</code>：印地语<br><code>fr</code>：法语<br><code>de</code>：德语<br><code>it</code>：意大利语<br><code>zh_dialect</code>：中文方言<br><code>zh_en</code>：中英<br><code>yue</code>：粤语<br><code>ru</code>：俄语<br><code>prime_zh</code>：中英方言<br><code>af-ZA</code>：南非荷兰语（南非）<br><code>sq-AL</code>：阿尔巴尼亚语（阿尔巴尼亚）<br><code>am-ET</code>：阿姆哈拉语（埃塞俄比亚）<br><code>ar-DZ</code>：阿拉伯语（阿尔及利亚）<br><code>ar-BH</code>：阿拉伯语（巴林）<br><code>ar-EG</code>：阿拉伯语（埃及）<br><code>ar-IQ</code>：阿拉伯语（伊拉克）<br><code>ar-IL</code>：阿拉伯语（以色列）<br><code>ar-JO</code>：阿拉伯语（约旦）<br><code>ar-KW</code>：阿拉伯语（科威特）<br><code>ar-LB</code>：阿拉伯语（黎巴嫩）<br><code>ar-MR</code>：阿拉伯语（毛里塔尼亚）<br><code>ar-MA</code>：阿拉伯语（摩洛哥）<br><code>ar-OM</code>：阿拉伯语（阿曼）<br><code>ar-QA</code>：阿拉伯语（卡塔尔）<br><code>ar-SA</code>：阿拉伯语（沙特阿拉伯）<br><code>ar-PS</code>：阿拉伯语（巴勒斯坦国）<br><code>ar-SY</code>：阿拉伯语（叙利亚）<br><code>ar-TN</code>：阿拉伯语（突尼斯）<br><code>ar-AE</code>：阿拉伯语（阿拉伯联合酋长国）<br><code>ar-YE</code>：阿拉伯语（也门）<br><code>hy-AM</code>：亚美尼亚语（亚美尼亚）<br><code>az-AZ</code>：阿塞拜疆语（阿塞拜疆）<br><code>eu-ES</code>：巴斯克语（西班牙）<br><code>bn-BD</code>：孟加拉语（孟加拉）<br><code>bn-IN</code>：孟加拉语（印度）<br><code>bs-BA</code>：波斯尼亚语（波斯尼亚和黑塞哥维那）<br><code>bg-BG</code>：保加利亚语（保加利亚）<br><code>my-MM</code>：缅甸语（缅甸）<br><code>ca-ES</code>：加泰罗尼亚语（西班牙）<br><code>hr-HR</code>：克罗地亚语（克罗地亚）<br><code>cs-CZ</code>：捷克语（捷克共和国）<br><code>da-DK</code>：丹麦语（丹麦）<br><code>nl-BE</code>：荷兰语（比利时）<br><code>nl-NL</code>：荷兰语（荷兰）<br><code>en-AU</code>：英语（澳大利亚）<br><code>en-CA</code>：英语（加拿大）<br><code>en-GH</code>：英语（加纳）<br><code>en-HK</code>：英语（中国香港）<br><code>en-IN</code>：英语（印度）<br><code>en-IE</code>：英语（爱尔兰）<br><code>en-KE</code>：英语（肯尼亚）<br><code>en-NZ</code>：英语（新西兰）<br><code>en-NG</code>：英语（尼日利亚）<br><code>en-PK</code>：英语（巴基斯坦）<br><code>en-PH</code>：英语（菲律宾）<br><code>en-SG</code>：英语（新加坡）<br><code>en-ZA</code>：英语（南非）<br><code>en-TZ</code>：英语（坦桑尼亚）<br><code>en-GB</code>：英语（英国）<br><code>en-US</code>：英语（美国）<br><code>et-EE</code>：爱沙尼亚语（爱沙尼亚）<br><code>fil-PH</code>：菲律宾语（菲律宾）<br><code>fi-FI</code>：芬兰语（芬兰）<br><code>fr-BE</code>：法语（比利时）<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fr-CH</code>：法语（瑞士）<br><code>gl-ES</code>：加利西亚语（西班牙）<br><code>ka-GE</code>：格鲁吉亚语（格鲁吉亚）<br><code>el-GR</code>：希腊语（希腊）<br><code>gu-IN</code>：古吉拉特语（印度）<br><code>iw-IL</code>：希伯来语（以色列）<br><code>hi-IN</code>：印地语（印度）<br><code>hu-HU</code>：匈牙利语（匈牙利）<br><code>is-IS</code>：冰岛语（冰岛）<br><code>id-ID</code>：印度尼西亚语（印度尼西亚）<br><code>it-IT</code>：意大利语（意大利）<br><code>it-CH</code>：意大利语（瑞士）<br><code>ja-JP</code>：日语（日本）<br><code>jv-ID</code>：爪哇语（印度尼西亚）<br><code>kn-IN</code>：卡纳达语（印度）<br><code>kk-KZ</code>：哈萨克语（哈萨克斯坦）<br><code>km-KH</code>：高棉语（柬埔寨）<br><code>rw-RW</code>：卢旺达语（卢旺达）<br><code>ko-KR</code>：韩语（韩国）<br><code>lo-LA</code>：老挝语（老挝）<br><code>lv-LV</code>：拉脱维亚语（拉脱维亚）<br><code>lt-LT</code>：立陶宛语（立陶宛）<br><code>mk-MK</code>：马其顿语（北马其顿）<br><code>ms-MY</code>：马来语（马来西亚）<br><code>ml-IN</code>：马拉雅拉姆语（印度）<br><code>mr-IN</code>：马拉地语（印度）<br><code>mn-MN</code>：蒙古语（蒙古）<br><code>ne-NP</code>：尼泊尔语（尼泊尔）<br><code>no-NO</code>：博克马尔挪威语（挪威）<br><code>fa-IR</code>：波斯语（伊朗）<br><code>pl-PL</code>：波兰语（波兰）<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>ro-RO</code>：罗马尼亚语（罗马尼亚）<br><code>ru-RU</code>：俄语（俄罗斯）<br><code>sr-RS</code>：塞尔维亚语（塞尔维亚）<br><code>si-LK</code>：僧伽罗语（斯里兰卡）<br><code>sk-SK</code>：斯洛伐克语（斯洛伐克）<br><code>sl-SI</code>：斯洛文尼亚语（斯洛文尼亚）<br><code>st-ZA</code>：南索托语（南非）<br><code>es-AR</code>：西班牙语（阿根廷）<br><code>es-BO</code>：西班牙语（玻利维亚）<br><code>es-CL</code>：西班牙语（智利）<br><code>es-CO</code>：西班牙语（哥伦比亚）<br><code>es-CR</code>：西班牙语（哥斯达黎加）<br><code>es-DO</code>：西班牙语（多米尼加共和国）<br><code>es-EC</code>：西班牙语（厄瓜多尔）<br><code>es-SV</code>：西班牙语（萨尔瓦多）<br><code>es-GT</code>：西班牙语（危地马拉）<br><code>es-HN</code>：西班牙语（洪都拉斯）<br><code>es-MX</code>：西班牙语（墨西哥）<br><code>es-NI</code>：西班牙语（尼加拉瓜）<br><code>es-PA</code>：西班牙语（巴拿马）<br><code>es-PY</code>：西班牙语（巴拉圭）<br><code>es-PE</code>：西班牙语（秘鲁）<br><code>es-PR</code>：西班牙语（波多黎各）<br><code>es-ES</code>：西班牙语（西班牙）<br><code>es-US</code>：西班牙语（美国）<br><code>es-UY</code>：西班牙语（乌拉圭）<br><code>es-VE</code>：西班牙语（委内瑞拉）<br><code>su-ID</code>：巽他语（印度尼西亚）<br><code>sw-KE</code>：斯瓦希里语（肯尼亚）<br><code>sw-TZ</code>：斯瓦希里语（坦桑尼亚）<br><code>sv-SE</code>：瑞典语（瑞典）<br><code>ta-IN</code>：泰米尔语（印度）<br><code>ta-MY</code>：泰米尔语（马来西亚）<br><code>ta-SG</code>：泰米尔语（新加坡）<br><code>ta-LK</code>：泰米尔语（斯里兰卡）<br><code>te-IN</code>：泰卢固语（印度）<br><code>th-TH</code>：泰语（泰国）<br><code>ts-ZA</code>：聪加语（南非）<br><code>tr-TR</code>：土耳其语（土耳其）<br><code>uk-UA</code>：乌克兰语（乌克兰）<br><code>ur-IN</code>：乌尔都语（印度）<br><code>ur-PK</code>：乌尔都语（巴基斯坦）<br><code>uz-UZ</code>：乌兹别克语（乌兹别克斯坦）<br><code>ve-ZA</code>：文达语（南非）<br><code>vi-VN</code>：越南语（越南）<br><code>xh-ZA</code>：科萨语（南非）<br><code>zu-ZA</code>：祖鲁语（南非）</p>
     * @param VideoSrcLanguage <p>智能字幕视频源语言<br>OCR识别仅支持以下语言：<br><code>zh_en</code>：中英<br><code>multi</code>：其他<br>ASR识别和纯字幕翻译当前支持以下语言：<br><code>auto</code>：自动识别<br><code>zh</code>：简体中文<br><code>en</code>：英语<br><code>ja</code>：日语<br><code>ko</code>：韩语<br><code>zh-PY</code>：中英粤<br><code>zh_medical</code>：中文医疗<br><code>vi</code>：越南语<br><code>ms</code>：马来语<br><code>id</code>：印度尼西亚语<br><code>fil</code>：菲律宾语<br><code>th</code>：泰语<br><code>pt</code>：葡萄牙语<br><code>tr</code>：土耳其语<br><code>ar</code>：阿拉伯语<br><code>es</code>：西班牙语<br><code>hi</code>：印地语<br><code>fr</code>：法语<br><code>de</code>：德语<br><code>it</code>：意大利语<br><code>zh_dialect</code>：中文方言<br><code>zh_en</code>：中英<br><code>yue</code>：粤语<br><code>ru</code>：俄语<br><code>prime_zh</code>：中英方言<br><code>af-ZA</code>：南非荷兰语（南非）<br><code>sq-AL</code>：阿尔巴尼亚语（阿尔巴尼亚）<br><code>am-ET</code>：阿姆哈拉语（埃塞俄比亚）<br><code>ar-DZ</code>：阿拉伯语（阿尔及利亚）<br><code>ar-BH</code>：阿拉伯语（巴林）<br><code>ar-EG</code>：阿拉伯语（埃及）<br><code>ar-IQ</code>：阿拉伯语（伊拉克）<br><code>ar-IL</code>：阿拉伯语（以色列）<br><code>ar-JO</code>：阿拉伯语（约旦）<br><code>ar-KW</code>：阿拉伯语（科威特）<br><code>ar-LB</code>：阿拉伯语（黎巴嫩）<br><code>ar-MR</code>：阿拉伯语（毛里塔尼亚）<br><code>ar-MA</code>：阿拉伯语（摩洛哥）<br><code>ar-OM</code>：阿拉伯语（阿曼）<br><code>ar-QA</code>：阿拉伯语（卡塔尔）<br><code>ar-SA</code>：阿拉伯语（沙特阿拉伯）<br><code>ar-PS</code>：阿拉伯语（巴勒斯坦国）<br><code>ar-SY</code>：阿拉伯语（叙利亚）<br><code>ar-TN</code>：阿拉伯语（突尼斯）<br><code>ar-AE</code>：阿拉伯语（阿拉伯联合酋长国）<br><code>ar-YE</code>：阿拉伯语（也门）<br><code>hy-AM</code>：亚美尼亚语（亚美尼亚）<br><code>az-AZ</code>：阿塞拜疆语（阿塞拜疆）<br><code>eu-ES</code>：巴斯克语（西班牙）<br><code>bn-BD</code>：孟加拉语（孟加拉）<br><code>bn-IN</code>：孟加拉语（印度）<br><code>bs-BA</code>：波斯尼亚语（波斯尼亚和黑塞哥维那）<br><code>bg-BG</code>：保加利亚语（保加利亚）<br><code>my-MM</code>：缅甸语（缅甸）<br><code>ca-ES</code>：加泰罗尼亚语（西班牙）<br><code>hr-HR</code>：克罗地亚语（克罗地亚）<br><code>cs-CZ</code>：捷克语（捷克共和国）<br><code>da-DK</code>：丹麦语（丹麦）<br><code>nl-BE</code>：荷兰语（比利时）<br><code>nl-NL</code>：荷兰语（荷兰）<br><code>en-AU</code>：英语（澳大利亚）<br><code>en-CA</code>：英语（加拿大）<br><code>en-GH</code>：英语（加纳）<br><code>en-HK</code>：英语（中国香港）<br><code>en-IN</code>：英语（印度）<br><code>en-IE</code>：英语（爱尔兰）<br><code>en-KE</code>：英语（肯尼亚）<br><code>en-NZ</code>：英语（新西兰）<br><code>en-NG</code>：英语（尼日利亚）<br><code>en-PK</code>：英语（巴基斯坦）<br><code>en-PH</code>：英语（菲律宾）<br><code>en-SG</code>：英语（新加坡）<br><code>en-ZA</code>：英语（南非）<br><code>en-TZ</code>：英语（坦桑尼亚）<br><code>en-GB</code>：英语（英国）<br><code>en-US</code>：英语（美国）<br><code>et-EE</code>：爱沙尼亚语（爱沙尼亚）<br><code>fil-PH</code>：菲律宾语（菲律宾）<br><code>fi-FI</code>：芬兰语（芬兰）<br><code>fr-BE</code>：法语（比利时）<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fr-CH</code>：法语（瑞士）<br><code>gl-ES</code>：加利西亚语（西班牙）<br><code>ka-GE</code>：格鲁吉亚语（格鲁吉亚）<br><code>el-GR</code>：希腊语（希腊）<br><code>gu-IN</code>：古吉拉特语（印度）<br><code>iw-IL</code>：希伯来语（以色列）<br><code>hi-IN</code>：印地语（印度）<br><code>hu-HU</code>：匈牙利语（匈牙利）<br><code>is-IS</code>：冰岛语（冰岛）<br><code>id-ID</code>：印度尼西亚语（印度尼西亚）<br><code>it-IT</code>：意大利语（意大利）<br><code>it-CH</code>：意大利语（瑞士）<br><code>ja-JP</code>：日语（日本）<br><code>jv-ID</code>：爪哇语（印度尼西亚）<br><code>kn-IN</code>：卡纳达语（印度）<br><code>kk-KZ</code>：哈萨克语（哈萨克斯坦）<br><code>km-KH</code>：高棉语（柬埔寨）<br><code>rw-RW</code>：卢旺达语（卢旺达）<br><code>ko-KR</code>：韩语（韩国）<br><code>lo-LA</code>：老挝语（老挝）<br><code>lv-LV</code>：拉脱维亚语（拉脱维亚）<br><code>lt-LT</code>：立陶宛语（立陶宛）<br><code>mk-MK</code>：马其顿语（北马其顿）<br><code>ms-MY</code>：马来语（马来西亚）<br><code>ml-IN</code>：马拉雅拉姆语（印度）<br><code>mr-IN</code>：马拉地语（印度）<br><code>mn-MN</code>：蒙古语（蒙古）<br><code>ne-NP</code>：尼泊尔语（尼泊尔）<br><code>no-NO</code>：博克马尔挪威语（挪威）<br><code>fa-IR</code>：波斯语（伊朗）<br><code>pl-PL</code>：波兰语（波兰）<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>ro-RO</code>：罗马尼亚语（罗马尼亚）<br><code>ru-RU</code>：俄语（俄罗斯）<br><code>sr-RS</code>：塞尔维亚语（塞尔维亚）<br><code>si-LK</code>：僧伽罗语（斯里兰卡）<br><code>sk-SK</code>：斯洛伐克语（斯洛伐克）<br><code>sl-SI</code>：斯洛文尼亚语（斯洛文尼亚）<br><code>st-ZA</code>：南索托语（南非）<br><code>es-AR</code>：西班牙语（阿根廷）<br><code>es-BO</code>：西班牙语（玻利维亚）<br><code>es-CL</code>：西班牙语（智利）<br><code>es-CO</code>：西班牙语（哥伦比亚）<br><code>es-CR</code>：西班牙语（哥斯达黎加）<br><code>es-DO</code>：西班牙语（多米尼加共和国）<br><code>es-EC</code>：西班牙语（厄瓜多尔）<br><code>es-SV</code>：西班牙语（萨尔瓦多）<br><code>es-GT</code>：西班牙语（危地马拉）<br><code>es-HN</code>：西班牙语（洪都拉斯）<br><code>es-MX</code>：西班牙语（墨西哥）<br><code>es-NI</code>：西班牙语（尼加拉瓜）<br><code>es-PA</code>：西班牙语（巴拿马）<br><code>es-PY</code>：西班牙语（巴拉圭）<br><code>es-PE</code>：西班牙语（秘鲁）<br><code>es-PR</code>：西班牙语（波多黎各）<br><code>es-ES</code>：西班牙语（西班牙）<br><code>es-US</code>：西班牙语（美国）<br><code>es-UY</code>：西班牙语（乌拉圭）<br><code>es-VE</code>：西班牙语（委内瑞拉）<br><code>su-ID</code>：巽他语（印度尼西亚）<br><code>sw-KE</code>：斯瓦希里语（肯尼亚）<br><code>sw-TZ</code>：斯瓦希里语（坦桑尼亚）<br><code>sv-SE</code>：瑞典语（瑞典）<br><code>ta-IN</code>：泰米尔语（印度）<br><code>ta-MY</code>：泰米尔语（马来西亚）<br><code>ta-SG</code>：泰米尔语（新加坡）<br><code>ta-LK</code>：泰米尔语（斯里兰卡）<br><code>te-IN</code>：泰卢固语（印度）<br><code>th-TH</code>：泰语（泰国）<br><code>ts-ZA</code>：聪加语（南非）<br><code>tr-TR</code>：土耳其语（土耳其）<br><code>uk-UA</code>：乌克兰语（乌克兰）<br><code>ur-IN</code>：乌尔都语（印度）<br><code>ur-PK</code>：乌尔都语（巴基斯坦）<br><code>uz-UZ</code>：乌兹别克语（乌兹别克斯坦）<br><code>ve-ZA</code>：文达语（南非）<br><code>vi-VN</code>：越南语（越南）<br><code>xh-ZA</code>：科萨语（南非）<br><code>zu-ZA</code>：祖鲁语（南非）</p>
     */
    public void setVideoSrcLanguage(String VideoSrcLanguage) {
        this.VideoSrcLanguage = VideoSrcLanguage;
    }

    /**
     * Get <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译和OCR识别翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleFormat <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译和OCR识别翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubtitleFormat() {
        return this.SubtitleFormat;
    }

    /**
     * Set <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译和OCR识别翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleFormat <p>智能字幕文件格式:</p><ul><li>ASR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li><li>不填或填空：不生成字幕文件</li></ul></li><li>纯字幕翻译处理类型下：<ul><li>original：与源文件一致</li><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li><li>OCR识别翻译处理类型下：<ul><li>vtt: WebVTT 格式字幕</li><li>srt: SRT 格式字幕</li></ul></li></ul><p><strong>注意</strong>：</p><ul><li>ASR识别方式下，翻译大于等于2种语言时不允许传空或不传；</li><li>纯字幕翻译和OCR识别翻译方式下，不允许传空或不传</li><li>OCR类型的任务，在开启压制时，允许不传或传空</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleFormat(String SubtitleFormat) {
        this.SubtitleFormat = SubtitleFormat;
    }

    /**
     * Get <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateSwitch <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateSwitch() {
        return this.TranslateSwitch;
    }

    /**
     * Set <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateSwitch <p>字幕翻译开关<br><code>ON</code>: 开启翻译<br><code>OFF</code>: 关闭翻译</p><p><strong>注意</strong>：纯字幕翻译方式下，不传默认是打开的，不允许传空或<code>OFF</code>；</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateSwitch(String TranslateSwitch) {
        this.TranslateSwitch = TranslateSwitch;
    }

    /**
     * Get <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效，翻译语言列表：<br><code>ab</code>：阿布哈兹语<br><code>ace</code>：亚齐语<br><code>ach</code>：阿乔利语<br><code>af</code>：南非荷兰语<br><code>ak</code>：契维语（阿坎语）<br><code>am</code>：Amharic<br><code>ar</code>：阿拉伯语<br><code>as</code>：阿萨姆语<br><code>ay</code>：艾马拉语<br><code>az</code>：阿塞拜疆语<br><code>ba</code>：巴什基尔语<br><code>ban</code>：巴厘语<br><code>bbc</code>：巴塔克托巴语<br><code>bem</code>：Bemba<br><code>bew</code>：Betawi<br><code>bg</code>：保加利亚语<br><code>bho</code>：博杰普尔语<br><code>bik</code>：Bikol<br><code>bm</code>：班巴拉语<br><code>bn</code>：孟加拉语<br><code>br</code>：布列塔尼语<br><code>bs</code>：波斯尼亚语<br><code>btx</code>：巴塔克卡罗语<br><code>bts</code>：巴塔克西马隆贡语<br><code>bua</code>：布里亚特语<br><code>ca</code>：加泰罗尼亚语<br><code>ceb</code>：宿务语<br><code>cgg</code>：Kiga<br><code>chm</code>：草原马里语<br><code>ckb</code>：库尔德语（索拉尼语）<br><code>cnh</code>：哈卡钦语<br><code>co</code>：科西嘉语<br><code>crh</code>：克里米亚鞑靼语<br><code>crs</code>：塞舌尔克里奥尔语<br><code>cs</code>：捷克语<br><code>cv</code>：楚瓦什语<br><code>cy</code>：威尔士语<br><code>da</code>：丹麦语<br><code>de</code>：德语<br><code>din</code>：Dinka<br><code>doi</code>：多格来语<br><code>dov</code>：敦贝语<br><code>dv</code>：第维埃语<br><code>dz</code>：宗卡语<br><code>ee</code>：Ewe<br><code>el</code>：希腊语<br><code>en</code>：英语<br><code>eo</code>：世界语<br><code>es</code>：西班牙语<br><code>et</code>：爱沙尼亚语<br><code>eu</code>：巴斯克语<br><code>fa</code>：波斯语<br><code>ff</code>：富拉语<br><code>fi</code>：芬兰语<br><code>fil</code>：菲律宾语（塔加拉语）<br><code>fj</code>：斐济语<br><code>fr</code>：法语<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fy</code>：弗里斯兰语<br><code>ga</code>：爱尔兰语<br><code>gaa</code>：加 (Ga) 语<br><code>gd</code>：苏格兰盖尔语<br><code>gl</code>：加利西亚语<br><code>gn</code>：瓜拉尼语<br><code>gom</code>：贡根语<br><code>gu</code>：古吉拉特语<br><code>gv</code>：马恩岛语<br><code>ha</code>：Hausa<br><code>haw</code>：夏威夷语<br><code>he</code>：希伯来语<br><code>hi</code>：印地语<br><code>hil</code>：希利盖农语<br><code>hmn</code>：苗语<br><code>hr</code>：克罗地亚语<br><code>hrx</code>：洪斯吕克语<br><code>ht</code>：海地克里奥尔语<br><code>hu</code>：匈牙利语<br><code>hy</code>：亚美尼亚语<br><code>id</code>：印度尼西亚语<br><code>ig</code>：Igbo<br><code>ilo</code>：伊洛果语<br><code>is</code>：冰岛语<br><code>it</code>：意大利语<br><code>iw</code>：希伯来语<br><code>ja</code>：日语<br><code>jv</code>：爪哇语<br><code>ka</code>：格鲁吉亚语<br><code>kk</code>：哈萨克语<br><code>km</code>：高棉语<br><code>kn</code>：卡纳达语<br><code>ko</code>：韩语<br><code>kri</code>：Krio<br><code>ku</code>：库尔德语（库尔曼吉语）<br><code>ktu</code>：吉土巴语<br><code>ky</code>：吉尔吉斯语<br><code>la</code>：拉丁语<br><code>lb</code>：卢森堡语<br><code>lg</code>：干达语（卢干达语）<br><code>li</code>：林堡语<br><code>lij</code>：利古里亚语<br><code>lmo</code>：伦巴第语<br><code>ln</code>：林加拉语<br><code>lo</code>：老挝语<br><code>lt</code>：立陶宛语<br><code>ltg</code>：拉特加莱语<br><code>luo</code>：Luo<br><code>lus</code>：米佐语<br><code>lv</code>：拉脱维亚语<br><code>mai</code>：迈蒂利语<br><code>mak</code>：马卡萨<br><code>mg</code>：马尔加什语<br><code>mi</code>：毛利语<br><code>min</code>：米南语<br><code>mk</code>：马其顿语<br><code>ml</code>：马拉雅拉姆语<br><code>mn</code>：蒙古语<br><code>mr</code>：马拉地语<br><code>ms</code>：马来语<br><code>mt</code>：马耳他语<br><code>my</code>：缅甸语<br><code>ne</code>：尼泊尔语<br><code>new</code>：尼瓦尔语<br><code>nl</code>：荷兰语<br><code>no</code>：挪威语<br><code>nr</code>：恩德贝莱语（南部）<br><code>nso</code>：北索托语（塞佩蒂语）<br><code>nus</code>：努尔语<br><code>ny</code>：齐切瓦语（尼扬贾语）<br><code>oc</code>：奥克斯坦语<br><code>om</code>：Oromo<br><code>or</code>：奥里亚语<br><code>pa</code>：旁遮普语<br><code>pag</code>：邦阿西楠语<br><code>pam</code>：邦板牙语<br><code>pap</code>：Papiamento<br><code>pl</code>：波兰语<br><code>ps</code>：Pashto<br><code>pt</code>：葡萄牙语<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>qu</code>：克丘亚语<br><code>ro</code>：罗马尼亚语<br><code>rom</code>：罗姆语<br><code>rn</code>：Rundi<br><code>ru</code>：俄语<br><code>rw</code>：卢旺达语<br><code>sa</code>：梵语<br><code>scn</code>：西西里语<br><code>sd</code>：信德语<br><code>sg</code>：Sango<br><code>shn</code>：掸语<br><code>si</code>：僧伽罗语<br><code>sk</code>：斯洛伐克语<br><code>sl</code>：斯洛文尼亚语<br><code>sm</code>：萨摩亚语<br><code>sn</code>：修纳语<br><code>so</code>：索马里语<br><code>sq</code>：阿尔巴尼亚语<br><code>sr</code>：塞尔维亚语<br><code>ss</code>：斯瓦特语<br><code>st</code>：塞索托语<br><code>su</code>：巽他语<br><code>sv</code>：瑞典语<br><code>sw</code>：斯瓦希里语<br><code>szl</code>：西里西亚语<br><code>ta</code>：泰米尔语<br><code>te</code>：泰卢固语<br><code>tet</code>：德顿语<br><code>tg</code>：塔吉克语<br><code>th</code>：泰语<br><code>ti</code>：提格里尼亚语<br><code>tk</code>：土库曼语<br><code>tn</code>：茨瓦纳语<br><code>tr</code>：土耳其语<br><code>ts</code>：聪加语<br><code>tt</code>：鞑靼语<br><code>ug</code>：维吾尔语<br><code>uk</code>：乌克兰语<br><code>ur</code>：乌尔都语<br><code>uz</code>：乌兹别克语<br><code>vi</code>：越南语<br><code>xh</code>：科萨语<br><code>yi</code>：意第绪语<br><code>yo</code>：约鲁巴语<br><code>yua</code>：尤卡坦玛雅语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：中文（繁体）<br><code>zu</code>：祖鲁语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TranslateDstLanguage <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效，翻译语言列表：<br><code>ab</code>：阿布哈兹语<br><code>ace</code>：亚齐语<br><code>ach</code>：阿乔利语<br><code>af</code>：南非荷兰语<br><code>ak</code>：契维语（阿坎语）<br><code>am</code>：Amharic<br><code>ar</code>：阿拉伯语<br><code>as</code>：阿萨姆语<br><code>ay</code>：艾马拉语<br><code>az</code>：阿塞拜疆语<br><code>ba</code>：巴什基尔语<br><code>ban</code>：巴厘语<br><code>bbc</code>：巴塔克托巴语<br><code>bem</code>：Bemba<br><code>bew</code>：Betawi<br><code>bg</code>：保加利亚语<br><code>bho</code>：博杰普尔语<br><code>bik</code>：Bikol<br><code>bm</code>：班巴拉语<br><code>bn</code>：孟加拉语<br><code>br</code>：布列塔尼语<br><code>bs</code>：波斯尼亚语<br><code>btx</code>：巴塔克卡罗语<br><code>bts</code>：巴塔克西马隆贡语<br><code>bua</code>：布里亚特语<br><code>ca</code>：加泰罗尼亚语<br><code>ceb</code>：宿务语<br><code>cgg</code>：Kiga<br><code>chm</code>：草原马里语<br><code>ckb</code>：库尔德语（索拉尼语）<br><code>cnh</code>：哈卡钦语<br><code>co</code>：科西嘉语<br><code>crh</code>：克里米亚鞑靼语<br><code>crs</code>：塞舌尔克里奥尔语<br><code>cs</code>：捷克语<br><code>cv</code>：楚瓦什语<br><code>cy</code>：威尔士语<br><code>da</code>：丹麦语<br><code>de</code>：德语<br><code>din</code>：Dinka<br><code>doi</code>：多格来语<br><code>dov</code>：敦贝语<br><code>dv</code>：第维埃语<br><code>dz</code>：宗卡语<br><code>ee</code>：Ewe<br><code>el</code>：希腊语<br><code>en</code>：英语<br><code>eo</code>：世界语<br><code>es</code>：西班牙语<br><code>et</code>：爱沙尼亚语<br><code>eu</code>：巴斯克语<br><code>fa</code>：波斯语<br><code>ff</code>：富拉语<br><code>fi</code>：芬兰语<br><code>fil</code>：菲律宾语（塔加拉语）<br><code>fj</code>：斐济语<br><code>fr</code>：法语<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fy</code>：弗里斯兰语<br><code>ga</code>：爱尔兰语<br><code>gaa</code>：加 (Ga) 语<br><code>gd</code>：苏格兰盖尔语<br><code>gl</code>：加利西亚语<br><code>gn</code>：瓜拉尼语<br><code>gom</code>：贡根语<br><code>gu</code>：古吉拉特语<br><code>gv</code>：马恩岛语<br><code>ha</code>：Hausa<br><code>haw</code>：夏威夷语<br><code>he</code>：希伯来语<br><code>hi</code>：印地语<br><code>hil</code>：希利盖农语<br><code>hmn</code>：苗语<br><code>hr</code>：克罗地亚语<br><code>hrx</code>：洪斯吕克语<br><code>ht</code>：海地克里奥尔语<br><code>hu</code>：匈牙利语<br><code>hy</code>：亚美尼亚语<br><code>id</code>：印度尼西亚语<br><code>ig</code>：Igbo<br><code>ilo</code>：伊洛果语<br><code>is</code>：冰岛语<br><code>it</code>：意大利语<br><code>iw</code>：希伯来语<br><code>ja</code>：日语<br><code>jv</code>：爪哇语<br><code>ka</code>：格鲁吉亚语<br><code>kk</code>：哈萨克语<br><code>km</code>：高棉语<br><code>kn</code>：卡纳达语<br><code>ko</code>：韩语<br><code>kri</code>：Krio<br><code>ku</code>：库尔德语（库尔曼吉语）<br><code>ktu</code>：吉土巴语<br><code>ky</code>：吉尔吉斯语<br><code>la</code>：拉丁语<br><code>lb</code>：卢森堡语<br><code>lg</code>：干达语（卢干达语）<br><code>li</code>：林堡语<br><code>lij</code>：利古里亚语<br><code>lmo</code>：伦巴第语<br><code>ln</code>：林加拉语<br><code>lo</code>：老挝语<br><code>lt</code>：立陶宛语<br><code>ltg</code>：拉特加莱语<br><code>luo</code>：Luo<br><code>lus</code>：米佐语<br><code>lv</code>：拉脱维亚语<br><code>mai</code>：迈蒂利语<br><code>mak</code>：马卡萨<br><code>mg</code>：马尔加什语<br><code>mi</code>：毛利语<br><code>min</code>：米南语<br><code>mk</code>：马其顿语<br><code>ml</code>：马拉雅拉姆语<br><code>mn</code>：蒙古语<br><code>mr</code>：马拉地语<br><code>ms</code>：马来语<br><code>mt</code>：马耳他语<br><code>my</code>：缅甸语<br><code>ne</code>：尼泊尔语<br><code>new</code>：尼瓦尔语<br><code>nl</code>：荷兰语<br><code>no</code>：挪威语<br><code>nr</code>：恩德贝莱语（南部）<br><code>nso</code>：北索托语（塞佩蒂语）<br><code>nus</code>：努尔语<br><code>ny</code>：齐切瓦语（尼扬贾语）<br><code>oc</code>：奥克斯坦语<br><code>om</code>：Oromo<br><code>or</code>：奥里亚语<br><code>pa</code>：旁遮普语<br><code>pag</code>：邦阿西楠语<br><code>pam</code>：邦板牙语<br><code>pap</code>：Papiamento<br><code>pl</code>：波兰语<br><code>ps</code>：Pashto<br><code>pt</code>：葡萄牙语<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>qu</code>：克丘亚语<br><code>ro</code>：罗马尼亚语<br><code>rom</code>：罗姆语<br><code>rn</code>：Rundi<br><code>ru</code>：俄语<br><code>rw</code>：卢旺达语<br><code>sa</code>：梵语<br><code>scn</code>：西西里语<br><code>sd</code>：信德语<br><code>sg</code>：Sango<br><code>shn</code>：掸语<br><code>si</code>：僧伽罗语<br><code>sk</code>：斯洛伐克语<br><code>sl</code>：斯洛文尼亚语<br><code>sm</code>：萨摩亚语<br><code>sn</code>：修纳语<br><code>so</code>：索马里语<br><code>sq</code>：阿尔巴尼亚语<br><code>sr</code>：塞尔维亚语<br><code>ss</code>：斯瓦特语<br><code>st</code>：塞索托语<br><code>su</code>：巽他语<br><code>sv</code>：瑞典语<br><code>sw</code>：斯瓦希里语<br><code>szl</code>：西里西亚语<br><code>ta</code>：泰米尔语<br><code>te</code>：泰卢固语<br><code>tet</code>：德顿语<br><code>tg</code>：塔吉克语<br><code>th</code>：泰语<br><code>ti</code>：提格里尼亚语<br><code>tk</code>：土库曼语<br><code>tn</code>：茨瓦纳语<br><code>tr</code>：土耳其语<br><code>ts</code>：聪加语<br><code>tt</code>：鞑靼语<br><code>ug</code>：维吾尔语<br><code>uk</code>：乌克兰语<br><code>ur</code>：乌尔都语<br><code>uz</code>：乌兹别克语<br><code>vi</code>：越南语<br><code>xh</code>：科萨语<br><code>yi</code>：意第绪语<br><code>yo</code>：约鲁巴语<br><code>yua</code>：尤卡坦玛雅语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：中文（繁体）<br><code>zu</code>：祖鲁语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranslateDstLanguage() {
        return this.TranslateDstLanguage;
    }

    /**
     * Set <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效，翻译语言列表：<br><code>ab</code>：阿布哈兹语<br><code>ace</code>：亚齐语<br><code>ach</code>：阿乔利语<br><code>af</code>：南非荷兰语<br><code>ak</code>：契维语（阿坎语）<br><code>am</code>：Amharic<br><code>ar</code>：阿拉伯语<br><code>as</code>：阿萨姆语<br><code>ay</code>：艾马拉语<br><code>az</code>：阿塞拜疆语<br><code>ba</code>：巴什基尔语<br><code>ban</code>：巴厘语<br><code>bbc</code>：巴塔克托巴语<br><code>bem</code>：Bemba<br><code>bew</code>：Betawi<br><code>bg</code>：保加利亚语<br><code>bho</code>：博杰普尔语<br><code>bik</code>：Bikol<br><code>bm</code>：班巴拉语<br><code>bn</code>：孟加拉语<br><code>br</code>：布列塔尼语<br><code>bs</code>：波斯尼亚语<br><code>btx</code>：巴塔克卡罗语<br><code>bts</code>：巴塔克西马隆贡语<br><code>bua</code>：布里亚特语<br><code>ca</code>：加泰罗尼亚语<br><code>ceb</code>：宿务语<br><code>cgg</code>：Kiga<br><code>chm</code>：草原马里语<br><code>ckb</code>：库尔德语（索拉尼语）<br><code>cnh</code>：哈卡钦语<br><code>co</code>：科西嘉语<br><code>crh</code>：克里米亚鞑靼语<br><code>crs</code>：塞舌尔克里奥尔语<br><code>cs</code>：捷克语<br><code>cv</code>：楚瓦什语<br><code>cy</code>：威尔士语<br><code>da</code>：丹麦语<br><code>de</code>：德语<br><code>din</code>：Dinka<br><code>doi</code>：多格来语<br><code>dov</code>：敦贝语<br><code>dv</code>：第维埃语<br><code>dz</code>：宗卡语<br><code>ee</code>：Ewe<br><code>el</code>：希腊语<br><code>en</code>：英语<br><code>eo</code>：世界语<br><code>es</code>：西班牙语<br><code>et</code>：爱沙尼亚语<br><code>eu</code>：巴斯克语<br><code>fa</code>：波斯语<br><code>ff</code>：富拉语<br><code>fi</code>：芬兰语<br><code>fil</code>：菲律宾语（塔加拉语）<br><code>fj</code>：斐济语<br><code>fr</code>：法语<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fy</code>：弗里斯兰语<br><code>ga</code>：爱尔兰语<br><code>gaa</code>：加 (Ga) 语<br><code>gd</code>：苏格兰盖尔语<br><code>gl</code>：加利西亚语<br><code>gn</code>：瓜拉尼语<br><code>gom</code>：贡根语<br><code>gu</code>：古吉拉特语<br><code>gv</code>：马恩岛语<br><code>ha</code>：Hausa<br><code>haw</code>：夏威夷语<br><code>he</code>：希伯来语<br><code>hi</code>：印地语<br><code>hil</code>：希利盖农语<br><code>hmn</code>：苗语<br><code>hr</code>：克罗地亚语<br><code>hrx</code>：洪斯吕克语<br><code>ht</code>：海地克里奥尔语<br><code>hu</code>：匈牙利语<br><code>hy</code>：亚美尼亚语<br><code>id</code>：印度尼西亚语<br><code>ig</code>：Igbo<br><code>ilo</code>：伊洛果语<br><code>is</code>：冰岛语<br><code>it</code>：意大利语<br><code>iw</code>：希伯来语<br><code>ja</code>：日语<br><code>jv</code>：爪哇语<br><code>ka</code>：格鲁吉亚语<br><code>kk</code>：哈萨克语<br><code>km</code>：高棉语<br><code>kn</code>：卡纳达语<br><code>ko</code>：韩语<br><code>kri</code>：Krio<br><code>ku</code>：库尔德语（库尔曼吉语）<br><code>ktu</code>：吉土巴语<br><code>ky</code>：吉尔吉斯语<br><code>la</code>：拉丁语<br><code>lb</code>：卢森堡语<br><code>lg</code>：干达语（卢干达语）<br><code>li</code>：林堡语<br><code>lij</code>：利古里亚语<br><code>lmo</code>：伦巴第语<br><code>ln</code>：林加拉语<br><code>lo</code>：老挝语<br><code>lt</code>：立陶宛语<br><code>ltg</code>：拉特加莱语<br><code>luo</code>：Luo<br><code>lus</code>：米佐语<br><code>lv</code>：拉脱维亚语<br><code>mai</code>：迈蒂利语<br><code>mak</code>：马卡萨<br><code>mg</code>：马尔加什语<br><code>mi</code>：毛利语<br><code>min</code>：米南语<br><code>mk</code>：马其顿语<br><code>ml</code>：马拉雅拉姆语<br><code>mn</code>：蒙古语<br><code>mr</code>：马拉地语<br><code>ms</code>：马来语<br><code>mt</code>：马耳他语<br><code>my</code>：缅甸语<br><code>ne</code>：尼泊尔语<br><code>new</code>：尼瓦尔语<br><code>nl</code>：荷兰语<br><code>no</code>：挪威语<br><code>nr</code>：恩德贝莱语（南部）<br><code>nso</code>：北索托语（塞佩蒂语）<br><code>nus</code>：努尔语<br><code>ny</code>：齐切瓦语（尼扬贾语）<br><code>oc</code>：奥克斯坦语<br><code>om</code>：Oromo<br><code>or</code>：奥里亚语<br><code>pa</code>：旁遮普语<br><code>pag</code>：邦阿西楠语<br><code>pam</code>：邦板牙语<br><code>pap</code>：Papiamento<br><code>pl</code>：波兰语<br><code>ps</code>：Pashto<br><code>pt</code>：葡萄牙语<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>qu</code>：克丘亚语<br><code>ro</code>：罗马尼亚语<br><code>rom</code>：罗姆语<br><code>rn</code>：Rundi<br><code>ru</code>：俄语<br><code>rw</code>：卢旺达语<br><code>sa</code>：梵语<br><code>scn</code>：西西里语<br><code>sd</code>：信德语<br><code>sg</code>：Sango<br><code>shn</code>：掸语<br><code>si</code>：僧伽罗语<br><code>sk</code>：斯洛伐克语<br><code>sl</code>：斯洛文尼亚语<br><code>sm</code>：萨摩亚语<br><code>sn</code>：修纳语<br><code>so</code>：索马里语<br><code>sq</code>：阿尔巴尼亚语<br><code>sr</code>：塞尔维亚语<br><code>ss</code>：斯瓦特语<br><code>st</code>：塞索托语<br><code>su</code>：巽他语<br><code>sv</code>：瑞典语<br><code>sw</code>：斯瓦希里语<br><code>szl</code>：西里西亚语<br><code>ta</code>：泰米尔语<br><code>te</code>：泰卢固语<br><code>tet</code>：德顿语<br><code>tg</code>：塔吉克语<br><code>th</code>：泰语<br><code>ti</code>：提格里尼亚语<br><code>tk</code>：土库曼语<br><code>tn</code>：茨瓦纳语<br><code>tr</code>：土耳其语<br><code>ts</code>：聪加语<br><code>tt</code>：鞑靼语<br><code>ug</code>：维吾尔语<br><code>uk</code>：乌克兰语<br><code>ur</code>：乌尔都语<br><code>uz</code>：乌兹别克语<br><code>vi</code>：越南语<br><code>xh</code>：科萨语<br><code>yi</code>：意第绪语<br><code>yo</code>：约鲁巴语<br><code>yua</code>：尤卡坦玛雅语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：中文（繁体）<br><code>zu</code>：祖鲁语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TranslateDstLanguage <p>字幕翻译目标语言<br>当TranslateSwitch为ON的时候生效，翻译语言列表：<br><code>ab</code>：阿布哈兹语<br><code>ace</code>：亚齐语<br><code>ach</code>：阿乔利语<br><code>af</code>：南非荷兰语<br><code>ak</code>：契维语（阿坎语）<br><code>am</code>：Amharic<br><code>ar</code>：阿拉伯语<br><code>as</code>：阿萨姆语<br><code>ay</code>：艾马拉语<br><code>az</code>：阿塞拜疆语<br><code>ba</code>：巴什基尔语<br><code>ban</code>：巴厘语<br><code>bbc</code>：巴塔克托巴语<br><code>bem</code>：Bemba<br><code>bew</code>：Betawi<br><code>bg</code>：保加利亚语<br><code>bho</code>：博杰普尔语<br><code>bik</code>：Bikol<br><code>bm</code>：班巴拉语<br><code>bn</code>：孟加拉语<br><code>br</code>：布列塔尼语<br><code>bs</code>：波斯尼亚语<br><code>btx</code>：巴塔克卡罗语<br><code>bts</code>：巴塔克西马隆贡语<br><code>bua</code>：布里亚特语<br><code>ca</code>：加泰罗尼亚语<br><code>ceb</code>：宿务语<br><code>cgg</code>：Kiga<br><code>chm</code>：草原马里语<br><code>ckb</code>：库尔德语（索拉尼语）<br><code>cnh</code>：哈卡钦语<br><code>co</code>：科西嘉语<br><code>crh</code>：克里米亚鞑靼语<br><code>crs</code>：塞舌尔克里奥尔语<br><code>cs</code>：捷克语<br><code>cv</code>：楚瓦什语<br><code>cy</code>：威尔士语<br><code>da</code>：丹麦语<br><code>de</code>：德语<br><code>din</code>：Dinka<br><code>doi</code>：多格来语<br><code>dov</code>：敦贝语<br><code>dv</code>：第维埃语<br><code>dz</code>：宗卡语<br><code>ee</code>：Ewe<br><code>el</code>：希腊语<br><code>en</code>：英语<br><code>eo</code>：世界语<br><code>es</code>：西班牙语<br><code>et</code>：爱沙尼亚语<br><code>eu</code>：巴斯克语<br><code>fa</code>：波斯语<br><code>ff</code>：富拉语<br><code>fi</code>：芬兰语<br><code>fil</code>：菲律宾语（塔加拉语）<br><code>fj</code>：斐济语<br><code>fr</code>：法语<br><code>fr-CA</code>：法语（加拿大）<br><code>fr-FR</code>：法语（法国）<br><code>fy</code>：弗里斯兰语<br><code>ga</code>：爱尔兰语<br><code>gaa</code>：加 (Ga) 语<br><code>gd</code>：苏格兰盖尔语<br><code>gl</code>：加利西亚语<br><code>gn</code>：瓜拉尼语<br><code>gom</code>：贡根语<br><code>gu</code>：古吉拉特语<br><code>gv</code>：马恩岛语<br><code>ha</code>：Hausa<br><code>haw</code>：夏威夷语<br><code>he</code>：希伯来语<br><code>hi</code>：印地语<br><code>hil</code>：希利盖农语<br><code>hmn</code>：苗语<br><code>hr</code>：克罗地亚语<br><code>hrx</code>：洪斯吕克语<br><code>ht</code>：海地克里奥尔语<br><code>hu</code>：匈牙利语<br><code>hy</code>：亚美尼亚语<br><code>id</code>：印度尼西亚语<br><code>ig</code>：Igbo<br><code>ilo</code>：伊洛果语<br><code>is</code>：冰岛语<br><code>it</code>：意大利语<br><code>iw</code>：希伯来语<br><code>ja</code>：日语<br><code>jv</code>：爪哇语<br><code>ka</code>：格鲁吉亚语<br><code>kk</code>：哈萨克语<br><code>km</code>：高棉语<br><code>kn</code>：卡纳达语<br><code>ko</code>：韩语<br><code>kri</code>：Krio<br><code>ku</code>：库尔德语（库尔曼吉语）<br><code>ktu</code>：吉土巴语<br><code>ky</code>：吉尔吉斯语<br><code>la</code>：拉丁语<br><code>lb</code>：卢森堡语<br><code>lg</code>：干达语（卢干达语）<br><code>li</code>：林堡语<br><code>lij</code>：利古里亚语<br><code>lmo</code>：伦巴第语<br><code>ln</code>：林加拉语<br><code>lo</code>：老挝语<br><code>lt</code>：立陶宛语<br><code>ltg</code>：拉特加莱语<br><code>luo</code>：Luo<br><code>lus</code>：米佐语<br><code>lv</code>：拉脱维亚语<br><code>mai</code>：迈蒂利语<br><code>mak</code>：马卡萨<br><code>mg</code>：马尔加什语<br><code>mi</code>：毛利语<br><code>min</code>：米南语<br><code>mk</code>：马其顿语<br><code>ml</code>：马拉雅拉姆语<br><code>mn</code>：蒙古语<br><code>mr</code>：马拉地语<br><code>ms</code>：马来语<br><code>mt</code>：马耳他语<br><code>my</code>：缅甸语<br><code>ne</code>：尼泊尔语<br><code>new</code>：尼瓦尔语<br><code>nl</code>：荷兰语<br><code>no</code>：挪威语<br><code>nr</code>：恩德贝莱语（南部）<br><code>nso</code>：北索托语（塞佩蒂语）<br><code>nus</code>：努尔语<br><code>ny</code>：齐切瓦语（尼扬贾语）<br><code>oc</code>：奥克斯坦语<br><code>om</code>：Oromo<br><code>or</code>：奥里亚语<br><code>pa</code>：旁遮普语<br><code>pag</code>：邦阿西楠语<br><code>pam</code>：邦板牙语<br><code>pap</code>：Papiamento<br><code>pl</code>：波兰语<br><code>ps</code>：Pashto<br><code>pt</code>：葡萄牙语<br><code>pt-BR</code>：葡萄牙语（巴西）<br><code>pt-PT</code>：葡萄牙语（葡萄牙）<br><code>qu</code>：克丘亚语<br><code>ro</code>：罗马尼亚语<br><code>rom</code>：罗姆语<br><code>rn</code>：Rundi<br><code>ru</code>：俄语<br><code>rw</code>：卢旺达语<br><code>sa</code>：梵语<br><code>scn</code>：西西里语<br><code>sd</code>：信德语<br><code>sg</code>：Sango<br><code>shn</code>：掸语<br><code>si</code>：僧伽罗语<br><code>sk</code>：斯洛伐克语<br><code>sl</code>：斯洛文尼亚语<br><code>sm</code>：萨摩亚语<br><code>sn</code>：修纳语<br><code>so</code>：索马里语<br><code>sq</code>：阿尔巴尼亚语<br><code>sr</code>：塞尔维亚语<br><code>ss</code>：斯瓦特语<br><code>st</code>：塞索托语<br><code>su</code>：巽他语<br><code>sv</code>：瑞典语<br><code>sw</code>：斯瓦希里语<br><code>szl</code>：西里西亚语<br><code>ta</code>：泰米尔语<br><code>te</code>：泰卢固语<br><code>tet</code>：德顿语<br><code>tg</code>：塔吉克语<br><code>th</code>：泰语<br><code>ti</code>：提格里尼亚语<br><code>tk</code>：土库曼语<br><code>tn</code>：茨瓦纳语<br><code>tr</code>：土耳其语<br><code>ts</code>：聪加语<br><code>tt</code>：鞑靼语<br><code>ug</code>：维吾尔语<br><code>uk</code>：乌克兰语<br><code>ur</code>：乌尔都语<br><code>uz</code>：乌兹别克语<br><code>vi</code>：越南语<br><code>xh</code>：科萨语<br><code>yi</code>：意第绪语<br><code>yo</code>：约鲁巴语<br><code>yua</code>：尤卡坦玛雅语<br><code>yue</code>：粤语<br><code>zh</code>：简体中文<br><code>zh-TW</code>：中文（繁体）<br><code>zu</code>：祖鲁语</p><p><strong>注意</strong>：多语言方式，则使用 <code>/</code> 分割，如：<code>en/ja</code>，表示英语和日语。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranslateDstLanguage(String TranslateDstLanguage) {
        this.TranslateDstLanguage = TranslateDstLanguage;
    }

    /**
     * Get <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrHotWordsConfigure <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrHotWordsConfigure getAsrHotWordsConfigure() {
        return this.AsrHotWordsConfigure;
    }

    /**
     * Set <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrHotWordsConfigure <p>ASR热词库参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrHotWordsConfigure(AsrHotWordsConfigure AsrHotWordsConfigure) {
        this.AsrHotWordsConfigure = AsrHotWordsConfigure;
    }

    /**
     * Get <p>自定义参数</p> 
     * @return ExtInfo <p>自定义参数</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>自定义参数</p>
     * @param ExtInfo <p>自定义参数</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    /**
     * Get <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p> 
     * @return ProcessType <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
     */
    public Long getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
     * @param ProcessType <p>字幕处理类型：</p><ul><li>0：ASR识别字幕</li><li>1：纯字幕翻译</li><li>2：OCR识别字幕</li></ul><p><strong>注意</strong>：不传的情况下默认类型为 ASR识别字幕</p>
     */
    public void setProcessType(Long ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>字幕OCR提取框选区域配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectingSubtitleAreasConfig <p>字幕OCR提取框选区域配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SelectingSubtitleAreasConfig getSelectingSubtitleAreasConfig() {
        return this.SelectingSubtitleAreasConfig;
    }

    /**
     * Set <p>字幕OCR提取框选区域配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectingSubtitleAreasConfig <p>字幕OCR提取框选区域配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectingSubtitleAreasConfig(SelectingSubtitleAreasConfig SelectingSubtitleAreasConfig) {
        this.SelectingSubtitleAreasConfig = SelectingSubtitleAreasConfig;
    }

    /**
     * Get <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写</p> 
     * @return SubtitleEmbedId <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写</p>
     */
    public Long getSubtitleEmbedId() {
        return this.SubtitleEmbedId;
    }

    /**
     * Set <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写</p>
     * @param SubtitleEmbedId <p>压制模板id，只有ProcessType为0或2（任务类型为ASR或OCR）时才允许填写</p>
     */
    public void setSubtitleEmbedId(Long SubtitleEmbedId) {
        this.SubtitleEmbedId = SubtitleEmbedId;
    }

    /**
     * Get <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p> 
     * @return SpeakerMode <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
     */
    public Long getSpeakerMode() {
        return this.SpeakerMode;
    }

    /**
     * Set <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
     * @param SpeakerMode <p>说话人识别模式，可选值：<br>0：表示不开启说话人识别；<br>1：表示开启说话人识别；<br>默认值：0</p>
     */
    public void setSpeakerMode(Long SpeakerMode) {
        this.SpeakerMode = SpeakerMode;
    }

    /**
     * Get <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p> 
     * @return SpeakerLabel <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
     */
    public Long getSpeakerLabel() {
        return this.SpeakerLabel;
    }

    /**
     * Set <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
     * @param SpeakerLabel <p>说话人识别输出到字幕文件，可选值：<br>0：表示不输出到字幕文件；<br>1：表示输出到vtt字幕文件<br>注意：使用此参数SpeakerMode的值不能为0；<br>默认值：0</p>
     */
    public void setSpeakerLabel(Long SpeakerLabel) {
        this.SpeakerLabel = SpeakerLabel;
    }

    public RawSmartSubtitleParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RawSmartSubtitleParameter(RawSmartSubtitleParameter source) {
        if (source.SubtitleType != null) {
            this.SubtitleType = new Long(source.SubtitleType);
        }
        if (source.VideoSrcLanguage != null) {
            this.VideoSrcLanguage = new String(source.VideoSrcLanguage);
        }
        if (source.SubtitleFormat != null) {
            this.SubtitleFormat = new String(source.SubtitleFormat);
        }
        if (source.TranslateSwitch != null) {
            this.TranslateSwitch = new String(source.TranslateSwitch);
        }
        if (source.TranslateDstLanguage != null) {
            this.TranslateDstLanguage = new String(source.TranslateDstLanguage);
        }
        if (source.AsrHotWordsConfigure != null) {
            this.AsrHotWordsConfigure = new AsrHotWordsConfigure(source.AsrHotWordsConfigure);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new Long(source.ProcessType);
        }
        if (source.SelectingSubtitleAreasConfig != null) {
            this.SelectingSubtitleAreasConfig = new SelectingSubtitleAreasConfig(source.SelectingSubtitleAreasConfig);
        }
        if (source.SubtitleEmbedId != null) {
            this.SubtitleEmbedId = new Long(source.SubtitleEmbedId);
        }
        if (source.SpeakerMode != null) {
            this.SpeakerMode = new Long(source.SpeakerMode);
        }
        if (source.SpeakerLabel != null) {
            this.SpeakerLabel = new Long(source.SpeakerLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleType", this.SubtitleType);
        this.setParamSimple(map, prefix + "VideoSrcLanguage", this.VideoSrcLanguage);
        this.setParamSimple(map, prefix + "SubtitleFormat", this.SubtitleFormat);
        this.setParamSimple(map, prefix + "TranslateSwitch", this.TranslateSwitch);
        this.setParamSimple(map, prefix + "TranslateDstLanguage", this.TranslateDstLanguage);
        this.setParamObj(map, prefix + "AsrHotWordsConfigure.", this.AsrHotWordsConfigure);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamObj(map, prefix + "SelectingSubtitleAreasConfig.", this.SelectingSubtitleAreasConfig);
        this.setParamSimple(map, prefix + "SubtitleEmbedId", this.SubtitleEmbedId);
        this.setParamSimple(map, prefix + "SpeakerMode", this.SpeakerMode);
        this.setParamSimple(map, prefix + "SpeakerLabel", this.SpeakerLabel);

    }
}

