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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecTaskRequest extends AbstractModel {

    /**
    * <p>引擎模型类型<br>识别引擎采用分级计费方案，标记为“大模型版”的引擎适用大模型计费方案，<a href="https://cloud.tencent.com/document/product/1093/35686">点击这里</a> 查看产品计费说明</p><p>电话通讯场景引擎：<br><strong>注意：电话通讯场景，请务必使用以下8k引擎</strong><br>• 8k_zh：中文电话通讯；<br>• 8k_en：英文电话通讯；<br>• 8k_zh_large：中文电话场景专用大模型引擎【大模型版】。当前模型同时支持中文、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话、闽南语、客家话、粤语、南宁话方言识别，通过显著提升模型参数规模与语言建模能力，实现对电话音频中复杂场景（如口音干扰、背景噪声）的高精度识别，识别准确率较常规版本大幅提升。<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比常规版本与普方大模型效果；</p><p>注意：如您有电话通讯场景识别需求，但发现需求语种仅支持16k，可将8k音频传入下方16k引擎，亦能获取识别结果。但<strong>16k引擎并非基于电话通讯数据训练，无法承诺此种调用方式的识别效果，需由您自行验证识别结果是否可用</strong></p><p>通用场景引擎：<br><strong>注意：除电话通讯场景以外的其它识别场景，请务必使用以下16k引擎</strong><br>• <strong>16k_zh_en</strong>：中英粤+9种方言大模型引擎【大模型版】。当前模型同时支持中文、英语、粤语、四川、陕西、河南、上海、湖南、湖北、安徽、闽南和潮汕方言识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升;<br>• <strong>16k_zh_large：</strong>普方英大模型引擎【大模型版】。当前模型同时支持中文、英文、<a href="https://cloud.tencent.com/document/product/1093/35682">多种中文方言</a>等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升，<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比中文普通话常规版本与普方英大模型版本的识别效果；<br>• <strong>16k_multi_lang：</strong>多语种大模型引擎【大模型版】。当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别)；<br>• <strong>16k_zh：</strong>中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景；<br>• <strong>16k_en：</strong>英语；<br>• <strong>16k_en_large：</strong>英语大模型；<br>• <strong>16k_yue：</strong>粤语；<br>• <strong>16k_zh-PY：</strong>中英粤混合引擎，使用一个引擎同时识别中文普通话、英语、粤语三个语言;<br>• <strong>16k_zh-TW</strong>：中文繁体；<br>• <strong>16k_ja：</strong>日语；<br>• <strong>16k_ko：</strong>韩语；<br>• <strong>16k_vi：</strong>越南语；<br>• <strong>16k_ms：</strong>马来语；<br>• <strong>16k_id：</strong>印度尼西亚语；<br>• <strong>16k_fil：</strong>菲律宾语；<br>• <strong>16k_th：</strong>泰语；<br>• <strong>16k_pt：</strong>葡萄牙语；<br>• <strong>16k_tr：</strong>土耳其语；<br>• <strong>16k_ar：</strong>阿拉伯语；<br>• <strong>16k_es：</strong>西班牙语；<br>• <strong>16k_hi：</strong>印地语；<br>• <strong>16k_fr：</strong>法语；<br>• <strong>16k_zh_medical：</strong>中文医疗引擎；<br>• <strong>16k_de：</strong>德语；</p><p>枚举值：</p><ul><li>16k_zh： 中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景</li></ul>
    */
    @SerializedName("EngineModelType")
    @Expose
    private String EngineModelType;

    /**
    * <p>识别声道数<br>1：单声道（16k音频仅支持单声道，<strong>请勿</strong>设置为双声道）；<br>2：双声道（仅支持8k电话音频，且双声道应分别为通话双方）</p><p>注意：<br>• 16k音频：仅支持单声道识别，<strong>需设置ChannelNum=1</strong>；<br>• 8k电话音频：支持单声道、双声道识别，<strong>建议设置ChannelNum=2，即双声道</strong>。双声道能够物理区分说话人、避免说话双方重叠产生的识别错误，能达到最好的说话人分离效果和识别效果。设置双声道后，将自动区分说话人，因此<strong>无需再开启说话人分离功能</strong>，相关参数（<strong>SpeakerDiarization、SpeakerNumber</strong>）使用默认值即可，返回的ResultDetail中的speakerId的值为0代表左声道，值为1代表右声道。</p>
    */
    @SerializedName("ChannelNum")
    @Expose
    private Long ChannelNum;

    /**
    * <p>识别结果返回样式<br>0：基础识别结果（仅包含有效人声时间戳，无词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>）；<br>1：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值，<strong>不含标点</strong>）；<br>2：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点）；<br>3：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按标点符号分段，<strong>适用字幕场景</strong>；<br>4：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按nlp语义分段，<strong>适用会议、庭审记录转写等场景</strong>，仅支持8k_zh/16k_zh引擎<br>5：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），并输出口语转书面语转写结果，该结果去除语气词、重复词、精简冗余表达，并修正发言人口误，实现口语转书面语的效果，<strong>适用于线上、线下会议直接总结为书面会议纪要的场景</strong>，仅支持8k_zh/16k_zh引擎</p><p>注意：<br>以下引擎仅支持参数值设置为0：16k_multi_lang、16k_ja、16k_ko、16k_vi、16k_ms、16k_id、16k_fil、16k_th、16k_pt、16k_tr、16k_ar、16k_es、16k_hi、16k_fr、16k_zh_medical、16k_de<br>如果传入参数值4，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">语义分段资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值4，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong><br>如果传入参数值5，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">口语转书面语资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值5，将自动计费<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong></p>
    */
    @SerializedName("ResTextFormat")
    @Expose
    private Long ResTextFormat;

    /**
    * <p>音频数据来源<br>0：音频URL；<br>1：音频数据（post body）</p>
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * <p>音频数据base64编码<br><strong>当 SourceType 值为 1 时须填写该字段，为 0 时不需要填写</strong></p><p>注意：音频数据要小于5MB（含）</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * <p>数据长度（此数据长度为数据未进行base64编码时的长度）</p>
    */
    @SerializedName("DataLen")
    @Expose
    private Long DataLen;

    /**
    * <p>音频URL的地址（需要公网环境浏览器可下载）<br><strong>当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写</strong></p><p>注意：</p><ol><li>请确保录音文件时长在5个小时（含）之内，否则可能识别失败；</li><li>请保证文件的下载速度，否则可能下载失败</li></ol>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>回调 URL<br>用户自行搭建的用于接收识别结果的服务URL<br>回调格式和内容详见：<a href="https://cloud.tencent.com/document/product/1093/52632">录音识别回调说明</a></p><p>注意：</p><ul><li>如果用户使用轮询方式获取识别结果，则无需提交该参数</li><li>建议在回调URL中带上您的业务ID等信息，以便处理业务逻辑</li></ul>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>是否开启说话人分离<br>0：不开启；<br>1：开启（仅支持以下引擎：8k_zh/8k_zh_large/16k_zh/16k_ms/16k_en/16k_id/16k_zh_large/16k_zh_dialect/16k_zh_en/16k_es/16k_fr/16k_ja/16k_ko，且ChannelNum=1时可用）；<br>3: 开启角色分离，需配合SpeakerRoles参数使用（增值服务，仅支持16k_zh_en引擎，可支持传入声纹对录音文件内的说话人进行角色认证）<br>默认值为 0</p><p>注意：<br>8k双声道电话音频请按 <strong>ChannelNum 识别声道数</strong> 的参数描述使用默认值</p>
    */
    @SerializedName("SpeakerDiarization")
    @Expose
    private Long SpeakerDiarization;

    /**
    * <p>说话人分离人数<br><strong>需配合开启说话人分离使用，不开启无效</strong>，取值范围：0-10<br>0：自动分离（最多分离出20个人）；<br>1-10：指定人数分离；<br>默认值为 0<br>注:16k引擎不支持指定人数分离</p>
    */
    @SerializedName("SpeakerNumber")
    @Expose
    private Long SpeakerNumber;

    /**
    * <p>热词表id<br>如不设置该参数，将自动生效默认热词表；<br>如设置该参数，将生效对应id的热词表；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a></p>
    */
    @SerializedName("HotwordId")
    @Expose
    private String HotwordId;

    /**
    * <p>热词增强功能（目前仅支持8k_zh/16k_zh引擎）<br>1：开启热词增强功能</p><p>注意：热词增强功能开启后，将对传入的热词表id开启同音替换功能，可以在这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a>。效果举例：在热词表中配置“蜜制”一词，并开启增强功能，与“蜜制”（mìzhì）同音同调的“秘制”（mìzhì）的识别结果会被强制替换成“蜜制”。<strong>建议客户根据实际的业务需求开启该功能</strong></p>
    */
    @SerializedName("ReinforceHotword")
    @Expose
    private Long ReinforceHotword;

    /**
    * <p>自学习定制模型 id<br>如设置了该参数，将生效对应id的自学习定制模型；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/38416">自学习定制模型配置方法</a></p>
    */
    @SerializedName("CustomizationId")
    @Expose
    private String CustomizationId;

    /**
    * <p><strong>【增值付费功能】</strong>情绪识别能力（目前仅支持 16k_zh , 16k_zh_en , 8k_zh ）<br>0：不开启；<br>1：开启情绪识别，但不在文本展示情绪标签；<br>2：开启情绪识别，并且在文本展示情绪标签（<strong>该功能需要设置ResTextFormat 大于0</strong>）<br>默认值为0<br>支持的情绪分类为：高兴、伤心、愤怒</p><p>注意：</p><ol><li><strong>本功能为增值服务</strong>，需将参数设置为1或2时方可按对应方式生效；</li><li>如果传入参数值1或2，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">情绪识别资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值1或2，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a>）</strong>；</li><li>参数设置为0时，无需购买资源包，也不会消耗情绪识别对应资源</li></ol>
    */
    @SerializedName("EmotionRecognition")
    @Expose
    private Long EmotionRecognition;

    /**
    * <p>情绪能量值<br>取值为音量分贝值/10，取值范围：[1,10]，值越高情绪越强烈<br>0：不开启；<br>1：开启；<br>默认值为0</p>
    */
    @SerializedName("EmotionalEnergy")
    @Expose
    private Long EmotionalEnergy;

    /**
    * <p>阿拉伯数字智能转换（目前支持中文普通话引擎）<br>0：不转换，直接输出中文数字；<br>1：根据场景智能转换为阿拉伯数字；<br>3：打开数学相关数字转换（如：阿尔法转写为α）；<br>默认值为 1</p>
    */
    @SerializedName("ConvertNumMode")
    @Expose
    private Long ConvertNumMode;

    /**
    * <p>脏词过滤（目前支持中文普通话引擎）<br>0：不过滤脏词；<br>1：过滤脏词；<br>2：将脏词替换为 * ；<br>默认值为 0</p>
    */
    @SerializedName("FilterDirty")
    @Expose
    private Long FilterDirty;

    /**
    * <p>标点符号过滤（目前支持中文普通话引擎）<br>0：不过滤标点；<br>1：过滤句末标点；<br>2：过滤所有标点；<br>默认值为 0</p>
    */
    @SerializedName("FilterPunc")
    @Expose
    private Long FilterPunc;

    /**
    * <p>语气词过滤（目前支持中文普通话引擎）<br>0：不过滤语气词；<br>1：过滤部分语气词；<br>2：严格过滤语气词；<br>默认值为 0</p>
    */
    @SerializedName("FilterModal")
    @Expose
    private Long FilterModal;

    /**
    * <p>单标点最多字数（目前支持中文普通话引擎）<br><strong>可控制单行字幕最大字数，适用于字幕生成场景</strong>，取值范围：[6，40]<br>0：不开启该功能；<br>默认值为0</p><p>注意：需设置ResTextFormat为3，解析返回的ResultDetail列表，通过结构中FinalSentence获取单个标点断句结果</p>
    */
    @SerializedName("SentenceMaxLength")
    @Expose
    private Long SentenceMaxLength;

    /**
    * <p>附加参数<strong>（该参数无意义，忽略即可）</strong></p>
    */
    @SerializedName("Extra")
    @Expose
    private String Extra;

    /**
    * <p>临时热词表：该参数用于提升识别准确率。</p><ul><li><p>单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或“ASR|11”；</p></li><li><p>临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p></li><li><p>参数 hotword_id（热词表） 与 hotword_list（临时热词表） 区别：</p><ul><li><p>hotword_id：热词表。需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；</p></li><li><p>hotword_list：临时热词表。每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表。适用于有极大量热词需求的用户；</p></li></ul></li></ul><p>注意：</p><ul><li><p>如果同时传入了 hotword_id 和 hotword_list，只有hotword_list 生效；</p></li><li><p>热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。</p></li><li><p>热词权重设置为100时，当前热词开启热词增强同音同调替换功能（仅支持8k_zh,16k_zh），举例：热词配置“蜜制|100”时，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。</p></li></ul>
    */
    @SerializedName("HotwordList")
    @Expose
    private String HotwordList;

    /**
    * <p>关键词识别ID列表，默认空为不进行识别，最多10个</p>
    */
    @SerializedName("KeyWordLibIdList")
    @Expose
    private String [] KeyWordLibIdList;

    /**
    * <p>替换词汇表id,  适用于热词和自学习场景也无法解决的极端case词组,  会对识别结果强制替换。具体可参考<a href="https://console.cloud.tencent.com/asr/replaceword">配置控制台</a>;强制替换功能可能会影响正常识别结果，请谨慎使用</p><p>注意：</p><ol><li>本功能配置完成后，预计在10分钟后生效</li></ol>
    */
    @SerializedName("ReplaceTextId")
    @Expose
    private String ReplaceTextId;

    /**
    * <p>开启角色分离能力配合SpeakerDiarization: 3 使用，ASR增值服务，<strong>仅可传入一组声纹信息</strong>进行角色认证，仅支持16k_zh_en引擎。需传入SpeakerRoleInfo数据组，确定说话人的角色信息，涉及RoleAudioUrl和RoleName两个参数。 RoleAudioUrl：需要认证角色的声纹音频地址，建议30s内的纯净人声，最长不能超过45s。 RoleName：需要认证角色的名称，若匹配成功，会替换话者分离中的SpeakerID。 示例： &quot;{"EngineModelType":"16k_zh_en","ChannelNum":1,"ResTextFormat":1,"SourceType":0,"Url":"需要进行ASR识别的音频链接","SpeakerDiarization":3,"SpeakerRoles":[{"RoleAudioUrl":"需要认证角色的声纹音频地址","RoleName":"需要认证角色的名称"}]}&quot;</p>
    */
    @SerializedName("SpeakerRoles")
    @Expose
    private SpeakerRoleInfo [] SpeakerRoles;

    /**
     * Get <p>引擎模型类型<br>识别引擎采用分级计费方案，标记为“大模型版”的引擎适用大模型计费方案，<a href="https://cloud.tencent.com/document/product/1093/35686">点击这里</a> 查看产品计费说明</p><p>电话通讯场景引擎：<br><strong>注意：电话通讯场景，请务必使用以下8k引擎</strong><br>• 8k_zh：中文电话通讯；<br>• 8k_en：英文电话通讯；<br>• 8k_zh_large：中文电话场景专用大模型引擎【大模型版】。当前模型同时支持中文、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话、闽南语、客家话、粤语、南宁话方言识别，通过显著提升模型参数规模与语言建模能力，实现对电话音频中复杂场景（如口音干扰、背景噪声）的高精度识别，识别准确率较常规版本大幅提升。<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比常规版本与普方大模型效果；</p><p>注意：如您有电话通讯场景识别需求，但发现需求语种仅支持16k，可将8k音频传入下方16k引擎，亦能获取识别结果。但<strong>16k引擎并非基于电话通讯数据训练，无法承诺此种调用方式的识别效果，需由您自行验证识别结果是否可用</strong></p><p>通用场景引擎：<br><strong>注意：除电话通讯场景以外的其它识别场景，请务必使用以下16k引擎</strong><br>• <strong>16k_zh_en</strong>：中英粤+9种方言大模型引擎【大模型版】。当前模型同时支持中文、英语、粤语、四川、陕西、河南、上海、湖南、湖北、安徽、闽南和潮汕方言识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升;<br>• <strong>16k_zh_large：</strong>普方英大模型引擎【大模型版】。当前模型同时支持中文、英文、<a href="https://cloud.tencent.com/document/product/1093/35682">多种中文方言</a>等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升，<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比中文普通话常规版本与普方英大模型版本的识别效果；<br>• <strong>16k_multi_lang：</strong>多语种大模型引擎【大模型版】。当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别)；<br>• <strong>16k_zh：</strong>中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景；<br>• <strong>16k_en：</strong>英语；<br>• <strong>16k_en_large：</strong>英语大模型；<br>• <strong>16k_yue：</strong>粤语；<br>• <strong>16k_zh-PY：</strong>中英粤混合引擎，使用一个引擎同时识别中文普通话、英语、粤语三个语言;<br>• <strong>16k_zh-TW</strong>：中文繁体；<br>• <strong>16k_ja：</strong>日语；<br>• <strong>16k_ko：</strong>韩语；<br>• <strong>16k_vi：</strong>越南语；<br>• <strong>16k_ms：</strong>马来语；<br>• <strong>16k_id：</strong>印度尼西亚语；<br>• <strong>16k_fil：</strong>菲律宾语；<br>• <strong>16k_th：</strong>泰语；<br>• <strong>16k_pt：</strong>葡萄牙语；<br>• <strong>16k_tr：</strong>土耳其语；<br>• <strong>16k_ar：</strong>阿拉伯语；<br>• <strong>16k_es：</strong>西班牙语；<br>• <strong>16k_hi：</strong>印地语；<br>• <strong>16k_fr：</strong>法语；<br>• <strong>16k_zh_medical：</strong>中文医疗引擎；<br>• <strong>16k_de：</strong>德语；</p><p>枚举值：</p><ul><li>16k_zh： 中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景</li></ul> 
     * @return EngineModelType <p>引擎模型类型<br>识别引擎采用分级计费方案，标记为“大模型版”的引擎适用大模型计费方案，<a href="https://cloud.tencent.com/document/product/1093/35686">点击这里</a> 查看产品计费说明</p><p>电话通讯场景引擎：<br><strong>注意：电话通讯场景，请务必使用以下8k引擎</strong><br>• 8k_zh：中文电话通讯；<br>• 8k_en：英文电话通讯；<br>• 8k_zh_large：中文电话场景专用大模型引擎【大模型版】。当前模型同时支持中文、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话、闽南语、客家话、粤语、南宁话方言识别，通过显著提升模型参数规模与语言建模能力，实现对电话音频中复杂场景（如口音干扰、背景噪声）的高精度识别，识别准确率较常规版本大幅提升。<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比常规版本与普方大模型效果；</p><p>注意：如您有电话通讯场景识别需求，但发现需求语种仅支持16k，可将8k音频传入下方16k引擎，亦能获取识别结果。但<strong>16k引擎并非基于电话通讯数据训练，无法承诺此种调用方式的识别效果，需由您自行验证识别结果是否可用</strong></p><p>通用场景引擎：<br><strong>注意：除电话通讯场景以外的其它识别场景，请务必使用以下16k引擎</strong><br>• <strong>16k_zh_en</strong>：中英粤+9种方言大模型引擎【大模型版】。当前模型同时支持中文、英语、粤语、四川、陕西、河南、上海、湖南、湖北、安徽、闽南和潮汕方言识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升;<br>• <strong>16k_zh_large：</strong>普方英大模型引擎【大模型版】。当前模型同时支持中文、英文、<a href="https://cloud.tencent.com/document/product/1093/35682">多种中文方言</a>等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升，<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比中文普通话常规版本与普方英大模型版本的识别效果；<br>• <strong>16k_multi_lang：</strong>多语种大模型引擎【大模型版】。当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别)；<br>• <strong>16k_zh：</strong>中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景；<br>• <strong>16k_en：</strong>英语；<br>• <strong>16k_en_large：</strong>英语大模型；<br>• <strong>16k_yue：</strong>粤语；<br>• <strong>16k_zh-PY：</strong>中英粤混合引擎，使用一个引擎同时识别中文普通话、英语、粤语三个语言;<br>• <strong>16k_zh-TW</strong>：中文繁体；<br>• <strong>16k_ja：</strong>日语；<br>• <strong>16k_ko：</strong>韩语；<br>• <strong>16k_vi：</strong>越南语；<br>• <strong>16k_ms：</strong>马来语；<br>• <strong>16k_id：</strong>印度尼西亚语；<br>• <strong>16k_fil：</strong>菲律宾语；<br>• <strong>16k_th：</strong>泰语；<br>• <strong>16k_pt：</strong>葡萄牙语；<br>• <strong>16k_tr：</strong>土耳其语；<br>• <strong>16k_ar：</strong>阿拉伯语；<br>• <strong>16k_es：</strong>西班牙语；<br>• <strong>16k_hi：</strong>印地语；<br>• <strong>16k_fr：</strong>法语；<br>• <strong>16k_zh_medical：</strong>中文医疗引擎；<br>• <strong>16k_de：</strong>德语；</p><p>枚举值：</p><ul><li>16k_zh： 中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景</li></ul>
     */
    public String getEngineModelType() {
        return this.EngineModelType;
    }

    /**
     * Set <p>引擎模型类型<br>识别引擎采用分级计费方案，标记为“大模型版”的引擎适用大模型计费方案，<a href="https://cloud.tencent.com/document/product/1093/35686">点击这里</a> 查看产品计费说明</p><p>电话通讯场景引擎：<br><strong>注意：电话通讯场景，请务必使用以下8k引擎</strong><br>• 8k_zh：中文电话通讯；<br>• 8k_en：英文电话通讯；<br>• 8k_zh_large：中文电话场景专用大模型引擎【大模型版】。当前模型同时支持中文、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话、闽南语、客家话、粤语、南宁话方言识别，通过显著提升模型参数规模与语言建模能力，实现对电话音频中复杂场景（如口音干扰、背景噪声）的高精度识别，识别准确率较常规版本大幅提升。<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比常规版本与普方大模型效果；</p><p>注意：如您有电话通讯场景识别需求，但发现需求语种仅支持16k，可将8k音频传入下方16k引擎，亦能获取识别结果。但<strong>16k引擎并非基于电话通讯数据训练，无法承诺此种调用方式的识别效果，需由您自行验证识别结果是否可用</strong></p><p>通用场景引擎：<br><strong>注意：除电话通讯场景以外的其它识别场景，请务必使用以下16k引擎</strong><br>• <strong>16k_zh_en</strong>：中英粤+9种方言大模型引擎【大模型版】。当前模型同时支持中文、英语、粤语、四川、陕西、河南、上海、湖南、湖北、安徽、闽南和潮汕方言识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升;<br>• <strong>16k_zh_large：</strong>普方英大模型引擎【大模型版】。当前模型同时支持中文、英文、<a href="https://cloud.tencent.com/document/product/1093/35682">多种中文方言</a>等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升，<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比中文普通话常规版本与普方英大模型版本的识别效果；<br>• <strong>16k_multi_lang：</strong>多语种大模型引擎【大模型版】。当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别)；<br>• <strong>16k_zh：</strong>中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景；<br>• <strong>16k_en：</strong>英语；<br>• <strong>16k_en_large：</strong>英语大模型；<br>• <strong>16k_yue：</strong>粤语；<br>• <strong>16k_zh-PY：</strong>中英粤混合引擎，使用一个引擎同时识别中文普通话、英语、粤语三个语言;<br>• <strong>16k_zh-TW</strong>：中文繁体；<br>• <strong>16k_ja：</strong>日语；<br>• <strong>16k_ko：</strong>韩语；<br>• <strong>16k_vi：</strong>越南语；<br>• <strong>16k_ms：</strong>马来语；<br>• <strong>16k_id：</strong>印度尼西亚语；<br>• <strong>16k_fil：</strong>菲律宾语；<br>• <strong>16k_th：</strong>泰语；<br>• <strong>16k_pt：</strong>葡萄牙语；<br>• <strong>16k_tr：</strong>土耳其语；<br>• <strong>16k_ar：</strong>阿拉伯语；<br>• <strong>16k_es：</strong>西班牙语；<br>• <strong>16k_hi：</strong>印地语；<br>• <strong>16k_fr：</strong>法语；<br>• <strong>16k_zh_medical：</strong>中文医疗引擎；<br>• <strong>16k_de：</strong>德语；</p><p>枚举值：</p><ul><li>16k_zh： 中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景</li></ul>
     * @param EngineModelType <p>引擎模型类型<br>识别引擎采用分级计费方案，标记为“大模型版”的引擎适用大模型计费方案，<a href="https://cloud.tencent.com/document/product/1093/35686">点击这里</a> 查看产品计费说明</p><p>电话通讯场景引擎：<br><strong>注意：电话通讯场景，请务必使用以下8k引擎</strong><br>• 8k_zh：中文电话通讯；<br>• 8k_en：英文电话通讯；<br>• 8k_zh_large：中文电话场景专用大模型引擎【大模型版】。当前模型同时支持中文、上海话、四川话、武汉话、贵阳话、昆明话、西安话、郑州话、太原话、兰州话、银川话、西宁话、南京话、合肥话、南昌话、长沙话、苏州话、杭州话、济南话、天津话、石家庄话、黑龙江话、吉林话、辽宁话、闽南语、客家话、粤语、南宁话方言识别，通过显著提升模型参数规模与语言建模能力，实现对电话音频中复杂场景（如口音干扰、背景噪声）的高精度识别，识别准确率较常规版本大幅提升。<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比常规版本与普方大模型效果；</p><p>注意：如您有电话通讯场景识别需求，但发现需求语种仅支持16k，可将8k音频传入下方16k引擎，亦能获取识别结果。但<strong>16k引擎并非基于电话通讯数据训练，无法承诺此种调用方式的识别效果，需由您自行验证识别结果是否可用</strong></p><p>通用场景引擎：<br><strong>注意：除电话通讯场景以外的其它识别场景，请务必使用以下16k引擎</strong><br>• <strong>16k_zh_en</strong>：中英粤+9种方言大模型引擎【大模型版】。当前模型同时支持中文、英语、粤语、四川、陕西、河南、上海、湖南、湖北、安徽、闽南和潮汕方言识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升;<br>• <strong>16k_zh_large：</strong>普方英大模型引擎【大模型版】。当前模型同时支持中文、英文、<a href="https://cloud.tencent.com/document/product/1093/35682">多种中文方言</a>等语言的识别，模型参数量极大，语言模型性能增强，针对噪声大、回音大、人声小、人声远等低质量音频的识别准确率极大提升，<a href="https://console.cloud.tencent.com/asr/demonstrate">点击这里</a> 对比中文普通话常规版本与普方英大模型版本的识别效果；<br>• <strong>16k_multi_lang：</strong>多语种大模型引擎【大模型版】。当前模型同时支持英语、日语、韩语、阿拉伯语、菲律宾语、法语、印地语、印尼语、马来语、葡萄牙语、西班牙语、泰语、土耳其语、越南语、德语的识别，可实现15个语种的自动识别(句子/段落级别)；<br>• <strong>16k_zh：</strong>中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景；<br>• <strong>16k_en：</strong>英语；<br>• <strong>16k_en_large：</strong>英语大模型；<br>• <strong>16k_yue：</strong>粤语；<br>• <strong>16k_zh-PY：</strong>中英粤混合引擎，使用一个引擎同时识别中文普通话、英语、粤语三个语言;<br>• <strong>16k_zh-TW</strong>：中文繁体；<br>• <strong>16k_ja：</strong>日语；<br>• <strong>16k_ko：</strong>韩语；<br>• <strong>16k_vi：</strong>越南语；<br>• <strong>16k_ms：</strong>马来语；<br>• <strong>16k_id：</strong>印度尼西亚语；<br>• <strong>16k_fil：</strong>菲律宾语；<br>• <strong>16k_th：</strong>泰语；<br>• <strong>16k_pt：</strong>葡萄牙语；<br>• <strong>16k_tr：</strong>土耳其语；<br>• <strong>16k_ar：</strong>阿拉伯语；<br>• <strong>16k_es：</strong>西班牙语；<br>• <strong>16k_hi：</strong>印地语；<br>• <strong>16k_fr：</strong>法语；<br>• <strong>16k_zh_medical：</strong>中文医疗引擎；<br>• <strong>16k_de：</strong>德语；</p><p>枚举值：</p><ul><li>16k_zh： 中文普通话通用引擎，支持中文普通话和少量英语，使用丰富的中文普通话语料训练，覆盖场景广泛，适用于除电话通讯外的所有中文普通话识别场景</li></ul>
     */
    public void setEngineModelType(String EngineModelType) {
        this.EngineModelType = EngineModelType;
    }

    /**
     * Get <p>识别声道数<br>1：单声道（16k音频仅支持单声道，<strong>请勿</strong>设置为双声道）；<br>2：双声道（仅支持8k电话音频，且双声道应分别为通话双方）</p><p>注意：<br>• 16k音频：仅支持单声道识别，<strong>需设置ChannelNum=1</strong>；<br>• 8k电话音频：支持单声道、双声道识别，<strong>建议设置ChannelNum=2，即双声道</strong>。双声道能够物理区分说话人、避免说话双方重叠产生的识别错误，能达到最好的说话人分离效果和识别效果。设置双声道后，将自动区分说话人，因此<strong>无需再开启说话人分离功能</strong>，相关参数（<strong>SpeakerDiarization、SpeakerNumber</strong>）使用默认值即可，返回的ResultDetail中的speakerId的值为0代表左声道，值为1代表右声道。</p> 
     * @return ChannelNum <p>识别声道数<br>1：单声道（16k音频仅支持单声道，<strong>请勿</strong>设置为双声道）；<br>2：双声道（仅支持8k电话音频，且双声道应分别为通话双方）</p><p>注意：<br>• 16k音频：仅支持单声道识别，<strong>需设置ChannelNum=1</strong>；<br>• 8k电话音频：支持单声道、双声道识别，<strong>建议设置ChannelNum=2，即双声道</strong>。双声道能够物理区分说话人、避免说话双方重叠产生的识别错误，能达到最好的说话人分离效果和识别效果。设置双声道后，将自动区分说话人，因此<strong>无需再开启说话人分离功能</strong>，相关参数（<strong>SpeakerDiarization、SpeakerNumber</strong>）使用默认值即可，返回的ResultDetail中的speakerId的值为0代表左声道，值为1代表右声道。</p>
     */
    public Long getChannelNum() {
        return this.ChannelNum;
    }

    /**
     * Set <p>识别声道数<br>1：单声道（16k音频仅支持单声道，<strong>请勿</strong>设置为双声道）；<br>2：双声道（仅支持8k电话音频，且双声道应分别为通话双方）</p><p>注意：<br>• 16k音频：仅支持单声道识别，<strong>需设置ChannelNum=1</strong>；<br>• 8k电话音频：支持单声道、双声道识别，<strong>建议设置ChannelNum=2，即双声道</strong>。双声道能够物理区分说话人、避免说话双方重叠产生的识别错误，能达到最好的说话人分离效果和识别效果。设置双声道后，将自动区分说话人，因此<strong>无需再开启说话人分离功能</strong>，相关参数（<strong>SpeakerDiarization、SpeakerNumber</strong>）使用默认值即可，返回的ResultDetail中的speakerId的值为0代表左声道，值为1代表右声道。</p>
     * @param ChannelNum <p>识别声道数<br>1：单声道（16k音频仅支持单声道，<strong>请勿</strong>设置为双声道）；<br>2：双声道（仅支持8k电话音频，且双声道应分别为通话双方）</p><p>注意：<br>• 16k音频：仅支持单声道识别，<strong>需设置ChannelNum=1</strong>；<br>• 8k电话音频：支持单声道、双声道识别，<strong>建议设置ChannelNum=2，即双声道</strong>。双声道能够物理区分说话人、避免说话双方重叠产生的识别错误，能达到最好的说话人分离效果和识别效果。设置双声道后，将自动区分说话人，因此<strong>无需再开启说话人分离功能</strong>，相关参数（<strong>SpeakerDiarization、SpeakerNumber</strong>）使用默认值即可，返回的ResultDetail中的speakerId的值为0代表左声道，值为1代表右声道。</p>
     */
    public void setChannelNum(Long ChannelNum) {
        this.ChannelNum = ChannelNum;
    }

    /**
     * Get <p>识别结果返回样式<br>0：基础识别结果（仅包含有效人声时间戳，无词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>）；<br>1：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值，<strong>不含标点</strong>）；<br>2：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点）；<br>3：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按标点符号分段，<strong>适用字幕场景</strong>；<br>4：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按nlp语义分段，<strong>适用会议、庭审记录转写等场景</strong>，仅支持8k_zh/16k_zh引擎<br>5：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），并输出口语转书面语转写结果，该结果去除语气词、重复词、精简冗余表达，并修正发言人口误，实现口语转书面语的效果，<strong>适用于线上、线下会议直接总结为书面会议纪要的场景</strong>，仅支持8k_zh/16k_zh引擎</p><p>注意：<br>以下引擎仅支持参数值设置为0：16k_multi_lang、16k_ja、16k_ko、16k_vi、16k_ms、16k_id、16k_fil、16k_th、16k_pt、16k_tr、16k_ar、16k_es、16k_hi、16k_fr、16k_zh_medical、16k_de<br>如果传入参数值4，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">语义分段资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值4，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong><br>如果传入参数值5，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">口语转书面语资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值5，将自动计费<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong></p> 
     * @return ResTextFormat <p>识别结果返回样式<br>0：基础识别结果（仅包含有效人声时间戳，无词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>）；<br>1：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值，<strong>不含标点</strong>）；<br>2：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点）；<br>3：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按标点符号分段，<strong>适用字幕场景</strong>；<br>4：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按nlp语义分段，<strong>适用会议、庭审记录转写等场景</strong>，仅支持8k_zh/16k_zh引擎<br>5：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），并输出口语转书面语转写结果，该结果去除语气词、重复词、精简冗余表达，并修正发言人口误，实现口语转书面语的效果，<strong>适用于线上、线下会议直接总结为书面会议纪要的场景</strong>，仅支持8k_zh/16k_zh引擎</p><p>注意：<br>以下引擎仅支持参数值设置为0：16k_multi_lang、16k_ja、16k_ko、16k_vi、16k_ms、16k_id、16k_fil、16k_th、16k_pt、16k_tr、16k_ar、16k_es、16k_hi、16k_fr、16k_zh_medical、16k_de<br>如果传入参数值4，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">语义分段资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值4，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong><br>如果传入参数值5，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">口语转书面语资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值5，将自动计费<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong></p>
     */
    public Long getResTextFormat() {
        return this.ResTextFormat;
    }

    /**
     * Set <p>识别结果返回样式<br>0：基础识别结果（仅包含有效人声时间戳，无词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>）；<br>1：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值，<strong>不含标点</strong>）；<br>2：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点）；<br>3：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按标点符号分段，<strong>适用字幕场景</strong>；<br>4：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按nlp语义分段，<strong>适用会议、庭审记录转写等场景</strong>，仅支持8k_zh/16k_zh引擎<br>5：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），并输出口语转书面语转写结果，该结果去除语气词、重复词、精简冗余表达，并修正发言人口误，实现口语转书面语的效果，<strong>适用于线上、线下会议直接总结为书面会议纪要的场景</strong>，仅支持8k_zh/16k_zh引擎</p><p>注意：<br>以下引擎仅支持参数值设置为0：16k_multi_lang、16k_ja、16k_ko、16k_vi、16k_ms、16k_id、16k_fil、16k_th、16k_pt、16k_tr、16k_ar、16k_es、16k_hi、16k_fr、16k_zh_medical、16k_de<br>如果传入参数值4，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">语义分段资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值4，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong><br>如果传入参数值5，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">口语转书面语资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值5，将自动计费<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong></p>
     * @param ResTextFormat <p>识别结果返回样式<br>0：基础识别结果（仅包含有效人声时间戳，无词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>）；<br>1：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值，<strong>不含标点</strong>）；<br>2：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点）；<br>3：基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按标点符号分段，<strong>适用字幕场景</strong>；<br>4：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），且识别结果按nlp语义分段，<strong>适用会议、庭审记录转写等场景</strong>，仅支持8k_zh/16k_zh引擎<br>5：<strong>【增值付费功能】</strong>基础识别结果之上，增加词粒度的<a href="https://cloud.tencent.com/document/api/1093/37824#SentenceDetail">详细识别结果</a>（包含词级别时间戳、语速值和标点），并输出口语转书面语转写结果，该结果去除语气词、重复词、精简冗余表达，并修正发言人口误，实现口语转书面语的效果，<strong>适用于线上、线下会议直接总结为书面会议纪要的场景</strong>，仅支持8k_zh/16k_zh引擎</p><p>注意：<br>以下引擎仅支持参数值设置为0：16k_multi_lang、16k_ja、16k_ko、16k_vi、16k_ms、16k_id、16k_fil、16k_th、16k_pt、16k_tr、16k_ar、16k_es、16k_hi、16k_fr、16k_zh_medical、16k_de<br>如果传入参数值4，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">语义分段资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值4，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong><br>如果传入参数值5，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">口语转书面语资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值5，将自动计费<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a></strong></p>
     */
    public void setResTextFormat(Long ResTextFormat) {
        this.ResTextFormat = ResTextFormat;
    }

    /**
     * Get <p>音频数据来源<br>0：音频URL；<br>1：音频数据（post body）</p> 
     * @return SourceType <p>音频数据来源<br>0：音频URL；<br>1：音频数据（post body）</p>
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set <p>音频数据来源<br>0：音频URL；<br>1：音频数据（post body）</p>
     * @param SourceType <p>音频数据来源<br>0：音频URL；<br>1：音频数据（post body）</p>
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get <p>音频数据base64编码<br><strong>当 SourceType 值为 1 时须填写该字段，为 0 时不需要填写</strong></p><p>注意：音频数据要小于5MB（含）</p> 
     * @return Data <p>音频数据base64编码<br><strong>当 SourceType 值为 1 时须填写该字段，为 0 时不需要填写</strong></p><p>注意：音频数据要小于5MB（含）</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>音频数据base64编码<br><strong>当 SourceType 值为 1 时须填写该字段，为 0 时不需要填写</strong></p><p>注意：音频数据要小于5MB（含）</p>
     * @param Data <p>音频数据base64编码<br><strong>当 SourceType 值为 1 时须填写该字段，为 0 时不需要填写</strong></p><p>注意：音频数据要小于5MB（含）</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get <p>数据长度（此数据长度为数据未进行base64编码时的长度）</p> 
     * @return DataLen <p>数据长度（此数据长度为数据未进行base64编码时的长度）</p>
     */
    public Long getDataLen() {
        return this.DataLen;
    }

    /**
     * Set <p>数据长度（此数据长度为数据未进行base64编码时的长度）</p>
     * @param DataLen <p>数据长度（此数据长度为数据未进行base64编码时的长度）</p>
     */
    public void setDataLen(Long DataLen) {
        this.DataLen = DataLen;
    }

    /**
     * Get <p>音频URL的地址（需要公网环境浏览器可下载）<br><strong>当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写</strong></p><p>注意：</p><ol><li>请确保录音文件时长在5个小时（含）之内，否则可能识别失败；</li><li>请保证文件的下载速度，否则可能下载失败</li></ol> 
     * @return Url <p>音频URL的地址（需要公网环境浏览器可下载）<br><strong>当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写</strong></p><p>注意：</p><ol><li>请确保录音文件时长在5个小时（含）之内，否则可能识别失败；</li><li>请保证文件的下载速度，否则可能下载失败</li></ol>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>音频URL的地址（需要公网环境浏览器可下载）<br><strong>当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写</strong></p><p>注意：</p><ol><li>请确保录音文件时长在5个小时（含）之内，否则可能识别失败；</li><li>请保证文件的下载速度，否则可能下载失败</li></ol>
     * @param Url <p>音频URL的地址（需要公网环境浏览器可下载）<br><strong>当 SourceType 值为 0 时须填写该字段，为 1 时不需要填写</strong></p><p>注意：</p><ol><li>请确保录音文件时长在5个小时（含）之内，否则可能识别失败；</li><li>请保证文件的下载速度，否则可能下载失败</li></ol>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>回调 URL<br>用户自行搭建的用于接收识别结果的服务URL<br>回调格式和内容详见：<a href="https://cloud.tencent.com/document/product/1093/52632">录音识别回调说明</a></p><p>注意：</p><ul><li>如果用户使用轮询方式获取识别结果，则无需提交该参数</li><li>建议在回调URL中带上您的业务ID等信息，以便处理业务逻辑</li></ul> 
     * @return CallbackUrl <p>回调 URL<br>用户自行搭建的用于接收识别结果的服务URL<br>回调格式和内容详见：<a href="https://cloud.tencent.com/document/product/1093/52632">录音识别回调说明</a></p><p>注意：</p><ul><li>如果用户使用轮询方式获取识别结果，则无需提交该参数</li><li>建议在回调URL中带上您的业务ID等信息，以便处理业务逻辑</li></ul>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调 URL<br>用户自行搭建的用于接收识别结果的服务URL<br>回调格式和内容详见：<a href="https://cloud.tencent.com/document/product/1093/52632">录音识别回调说明</a></p><p>注意：</p><ul><li>如果用户使用轮询方式获取识别结果，则无需提交该参数</li><li>建议在回调URL中带上您的业务ID等信息，以便处理业务逻辑</li></ul>
     * @param CallbackUrl <p>回调 URL<br>用户自行搭建的用于接收识别结果的服务URL<br>回调格式和内容详见：<a href="https://cloud.tencent.com/document/product/1093/52632">录音识别回调说明</a></p><p>注意：</p><ul><li>如果用户使用轮询方式获取识别结果，则无需提交该参数</li><li>建议在回调URL中带上您的业务ID等信息，以便处理业务逻辑</li></ul>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>是否开启说话人分离<br>0：不开启；<br>1：开启（仅支持以下引擎：8k_zh/8k_zh_large/16k_zh/16k_ms/16k_en/16k_id/16k_zh_large/16k_zh_dialect/16k_zh_en/16k_es/16k_fr/16k_ja/16k_ko，且ChannelNum=1时可用）；<br>3: 开启角色分离，需配合SpeakerRoles参数使用（增值服务，仅支持16k_zh_en引擎，可支持传入声纹对录音文件内的说话人进行角色认证）<br>默认值为 0</p><p>注意：<br>8k双声道电话音频请按 <strong>ChannelNum 识别声道数</strong> 的参数描述使用默认值</p> 
     * @return SpeakerDiarization <p>是否开启说话人分离<br>0：不开启；<br>1：开启（仅支持以下引擎：8k_zh/8k_zh_large/16k_zh/16k_ms/16k_en/16k_id/16k_zh_large/16k_zh_dialect/16k_zh_en/16k_es/16k_fr/16k_ja/16k_ko，且ChannelNum=1时可用）；<br>3: 开启角色分离，需配合SpeakerRoles参数使用（增值服务，仅支持16k_zh_en引擎，可支持传入声纹对录音文件内的说话人进行角色认证）<br>默认值为 0</p><p>注意：<br>8k双声道电话音频请按 <strong>ChannelNum 识别声道数</strong> 的参数描述使用默认值</p>
     */
    public Long getSpeakerDiarization() {
        return this.SpeakerDiarization;
    }

    /**
     * Set <p>是否开启说话人分离<br>0：不开启；<br>1：开启（仅支持以下引擎：8k_zh/8k_zh_large/16k_zh/16k_ms/16k_en/16k_id/16k_zh_large/16k_zh_dialect/16k_zh_en/16k_es/16k_fr/16k_ja/16k_ko，且ChannelNum=1时可用）；<br>3: 开启角色分离，需配合SpeakerRoles参数使用（增值服务，仅支持16k_zh_en引擎，可支持传入声纹对录音文件内的说话人进行角色认证）<br>默认值为 0</p><p>注意：<br>8k双声道电话音频请按 <strong>ChannelNum 识别声道数</strong> 的参数描述使用默认值</p>
     * @param SpeakerDiarization <p>是否开启说话人分离<br>0：不开启；<br>1：开启（仅支持以下引擎：8k_zh/8k_zh_large/16k_zh/16k_ms/16k_en/16k_id/16k_zh_large/16k_zh_dialect/16k_zh_en/16k_es/16k_fr/16k_ja/16k_ko，且ChannelNum=1时可用）；<br>3: 开启角色分离，需配合SpeakerRoles参数使用（增值服务，仅支持16k_zh_en引擎，可支持传入声纹对录音文件内的说话人进行角色认证）<br>默认值为 0</p><p>注意：<br>8k双声道电话音频请按 <strong>ChannelNum 识别声道数</strong> 的参数描述使用默认值</p>
     */
    public void setSpeakerDiarization(Long SpeakerDiarization) {
        this.SpeakerDiarization = SpeakerDiarization;
    }

    /**
     * Get <p>说话人分离人数<br><strong>需配合开启说话人分离使用，不开启无效</strong>，取值范围：0-10<br>0：自动分离（最多分离出20个人）；<br>1-10：指定人数分离；<br>默认值为 0<br>注:16k引擎不支持指定人数分离</p> 
     * @return SpeakerNumber <p>说话人分离人数<br><strong>需配合开启说话人分离使用，不开启无效</strong>，取值范围：0-10<br>0：自动分离（最多分离出20个人）；<br>1-10：指定人数分离；<br>默认值为 0<br>注:16k引擎不支持指定人数分离</p>
     */
    public Long getSpeakerNumber() {
        return this.SpeakerNumber;
    }

    /**
     * Set <p>说话人分离人数<br><strong>需配合开启说话人分离使用，不开启无效</strong>，取值范围：0-10<br>0：自动分离（最多分离出20个人）；<br>1-10：指定人数分离；<br>默认值为 0<br>注:16k引擎不支持指定人数分离</p>
     * @param SpeakerNumber <p>说话人分离人数<br><strong>需配合开启说话人分离使用，不开启无效</strong>，取值范围：0-10<br>0：自动分离（最多分离出20个人）；<br>1-10：指定人数分离；<br>默认值为 0<br>注:16k引擎不支持指定人数分离</p>
     */
    public void setSpeakerNumber(Long SpeakerNumber) {
        this.SpeakerNumber = SpeakerNumber;
    }

    /**
     * Get <p>热词表id<br>如不设置该参数，将自动生效默认热词表；<br>如设置该参数，将生效对应id的热词表；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a></p> 
     * @return HotwordId <p>热词表id<br>如不设置该参数，将自动生效默认热词表；<br>如设置该参数，将生效对应id的热词表；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a></p>
     */
    public String getHotwordId() {
        return this.HotwordId;
    }

    /**
     * Set <p>热词表id<br>如不设置该参数，将自动生效默认热词表；<br>如设置该参数，将生效对应id的热词表；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a></p>
     * @param HotwordId <p>热词表id<br>如不设置该参数，将自动生效默认热词表；<br>如设置该参数，将生效对应id的热词表；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a></p>
     */
    public void setHotwordId(String HotwordId) {
        this.HotwordId = HotwordId;
    }

    /**
     * Get <p>热词增强功能（目前仅支持8k_zh/16k_zh引擎）<br>1：开启热词增强功能</p><p>注意：热词增强功能开启后，将对传入的热词表id开启同音替换功能，可以在这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a>。效果举例：在热词表中配置“蜜制”一词，并开启增强功能，与“蜜制”（mìzhì）同音同调的“秘制”（mìzhì）的识别结果会被强制替换成“蜜制”。<strong>建议客户根据实际的业务需求开启该功能</strong></p> 
     * @return ReinforceHotword <p>热词增强功能（目前仅支持8k_zh/16k_zh引擎）<br>1：开启热词增强功能</p><p>注意：热词增强功能开启后，将对传入的热词表id开启同音替换功能，可以在这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a>。效果举例：在热词表中配置“蜜制”一词，并开启增强功能，与“蜜制”（mìzhì）同音同调的“秘制”（mìzhì）的识别结果会被强制替换成“蜜制”。<strong>建议客户根据实际的业务需求开启该功能</strong></p>
     * @deprecated
     */
    @Deprecated
    public Long getReinforceHotword() {
        return this.ReinforceHotword;
    }

    /**
     * Set <p>热词增强功能（目前仅支持8k_zh/16k_zh引擎）<br>1：开启热词增强功能</p><p>注意：热词增强功能开启后，将对传入的热词表id开启同音替换功能，可以在这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a>。效果举例：在热词表中配置“蜜制”一词，并开启增强功能，与“蜜制”（mìzhì）同音同调的“秘制”（mìzhì）的识别结果会被强制替换成“蜜制”。<strong>建议客户根据实际的业务需求开启该功能</strong></p>
     * @param ReinforceHotword <p>热词增强功能（目前仅支持8k_zh/16k_zh引擎）<br>1：开启热词增强功能</p><p>注意：热词增强功能开启后，将对传入的热词表id开启同音替换功能，可以在这里查看<a href="https://cloud.tencent.com/document/product/1093/40996">热词表配置方法</a>。效果举例：在热词表中配置“蜜制”一词，并开启增强功能，与“蜜制”（mìzhì）同音同调的“秘制”（mìzhì）的识别结果会被强制替换成“蜜制”。<strong>建议客户根据实际的业务需求开启该功能</strong></p>
     * @deprecated
     */
    @Deprecated
    public void setReinforceHotword(Long ReinforceHotword) {
        this.ReinforceHotword = ReinforceHotword;
    }

    /**
     * Get <p>自学习定制模型 id<br>如设置了该参数，将生效对应id的自学习定制模型；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/38416">自学习定制模型配置方法</a></p> 
     * @return CustomizationId <p>自学习定制模型 id<br>如设置了该参数，将生效对应id的自学习定制模型；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/38416">自学习定制模型配置方法</a></p>
     */
    public String getCustomizationId() {
        return this.CustomizationId;
    }

    /**
     * Set <p>自学习定制模型 id<br>如设置了该参数，将生效对应id的自学习定制模型；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/38416">自学习定制模型配置方法</a></p>
     * @param CustomizationId <p>自学习定制模型 id<br>如设置了该参数，将生效对应id的自学习定制模型；<br>点击这里查看<a href="https://cloud.tencent.com/document/product/1093/38416">自学习定制模型配置方法</a></p>
     */
    public void setCustomizationId(String CustomizationId) {
        this.CustomizationId = CustomizationId;
    }

    /**
     * Get <p><strong>【增值付费功能】</strong>情绪识别能力（目前仅支持 16k_zh , 16k_zh_en , 8k_zh ）<br>0：不开启；<br>1：开启情绪识别，但不在文本展示情绪标签；<br>2：开启情绪识别，并且在文本展示情绪标签（<strong>该功能需要设置ResTextFormat 大于0</strong>）<br>默认值为0<br>支持的情绪分类为：高兴、伤心、愤怒</p><p>注意：</p><ol><li><strong>本功能为增值服务</strong>，需将参数设置为1或2时方可按对应方式生效；</li><li>如果传入参数值1或2，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">情绪识别资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值1或2，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a>）</strong>；</li><li>参数设置为0时，无需购买资源包，也不会消耗情绪识别对应资源</li></ol> 
     * @return EmotionRecognition <p><strong>【增值付费功能】</strong>情绪识别能力（目前仅支持 16k_zh , 16k_zh_en , 8k_zh ）<br>0：不开启；<br>1：开启情绪识别，但不在文本展示情绪标签；<br>2：开启情绪识别，并且在文本展示情绪标签（<strong>该功能需要设置ResTextFormat 大于0</strong>）<br>默认值为0<br>支持的情绪分类为：高兴、伤心、愤怒</p><p>注意：</p><ol><li><strong>本功能为增值服务</strong>，需将参数设置为1或2时方可按对应方式生效；</li><li>如果传入参数值1或2，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">情绪识别资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值1或2，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a>）</strong>；</li><li>参数设置为0时，无需购买资源包，也不会消耗情绪识别对应资源</li></ol>
     */
    public Long getEmotionRecognition() {
        return this.EmotionRecognition;
    }

    /**
     * Set <p><strong>【增值付费功能】</strong>情绪识别能力（目前仅支持 16k_zh , 16k_zh_en , 8k_zh ）<br>0：不开启；<br>1：开启情绪识别，但不在文本展示情绪标签；<br>2：开启情绪识别，并且在文本展示情绪标签（<strong>该功能需要设置ResTextFormat 大于0</strong>）<br>默认值为0<br>支持的情绪分类为：高兴、伤心、愤怒</p><p>注意：</p><ol><li><strong>本功能为增值服务</strong>，需将参数设置为1或2时方可按对应方式生效；</li><li>如果传入参数值1或2，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">情绪识别资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值1或2，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a>）</strong>；</li><li>参数设置为0时，无需购买资源包，也不会消耗情绪识别对应资源</li></ol>
     * @param EmotionRecognition <p><strong>【增值付费功能】</strong>情绪识别能力（目前仅支持 16k_zh , 16k_zh_en , 8k_zh ）<br>0：不开启；<br>1：开启情绪识别，但不在文本展示情绪标签；<br>2：开启情绪识别，并且在文本展示情绪标签（<strong>该功能需要设置ResTextFormat 大于0</strong>）<br>默认值为0<br>支持的情绪分类为：高兴、伤心、愤怒</p><p>注意：</p><ol><li><strong>本功能为增值服务</strong>，需将参数设置为1或2时方可按对应方式生效；</li><li>如果传入参数值1或2，需确保账号已购买<a href="https://cloud.tencent.com/document/product/1093/35686#97ae4aa0-29a0-4066-9f07-ccaf8856a16b">情绪识别资源包</a>，或账号开启后付费；<strong>若当前账号已开启后付费功能，并传入参数值1或2，将<a href="https://cloud.tencent.com/document/product/1093/35686#d912167d-ffd5-41a9-8b1c-2e89845a6852">自动计费</a>）</strong>；</li><li>参数设置为0时，无需购买资源包，也不会消耗情绪识别对应资源</li></ol>
     */
    public void setEmotionRecognition(Long EmotionRecognition) {
        this.EmotionRecognition = EmotionRecognition;
    }

    /**
     * Get <p>情绪能量值<br>取值为音量分贝值/10，取值范围：[1,10]，值越高情绪越强烈<br>0：不开启；<br>1：开启；<br>默认值为0</p> 
     * @return EmotionalEnergy <p>情绪能量值<br>取值为音量分贝值/10，取值范围：[1,10]，值越高情绪越强烈<br>0：不开启；<br>1：开启；<br>默认值为0</p>
     */
    public Long getEmotionalEnergy() {
        return this.EmotionalEnergy;
    }

    /**
     * Set <p>情绪能量值<br>取值为音量分贝值/10，取值范围：[1,10]，值越高情绪越强烈<br>0：不开启；<br>1：开启；<br>默认值为0</p>
     * @param EmotionalEnergy <p>情绪能量值<br>取值为音量分贝值/10，取值范围：[1,10]，值越高情绪越强烈<br>0：不开启；<br>1：开启；<br>默认值为0</p>
     */
    public void setEmotionalEnergy(Long EmotionalEnergy) {
        this.EmotionalEnergy = EmotionalEnergy;
    }

    /**
     * Get <p>阿拉伯数字智能转换（目前支持中文普通话引擎）<br>0：不转换，直接输出中文数字；<br>1：根据场景智能转换为阿拉伯数字；<br>3：打开数学相关数字转换（如：阿尔法转写为α）；<br>默认值为 1</p> 
     * @return ConvertNumMode <p>阿拉伯数字智能转换（目前支持中文普通话引擎）<br>0：不转换，直接输出中文数字；<br>1：根据场景智能转换为阿拉伯数字；<br>3：打开数学相关数字转换（如：阿尔法转写为α）；<br>默认值为 1</p>
     */
    public Long getConvertNumMode() {
        return this.ConvertNumMode;
    }

    /**
     * Set <p>阿拉伯数字智能转换（目前支持中文普通话引擎）<br>0：不转换，直接输出中文数字；<br>1：根据场景智能转换为阿拉伯数字；<br>3：打开数学相关数字转换（如：阿尔法转写为α）；<br>默认值为 1</p>
     * @param ConvertNumMode <p>阿拉伯数字智能转换（目前支持中文普通话引擎）<br>0：不转换，直接输出中文数字；<br>1：根据场景智能转换为阿拉伯数字；<br>3：打开数学相关数字转换（如：阿尔法转写为α）；<br>默认值为 1</p>
     */
    public void setConvertNumMode(Long ConvertNumMode) {
        this.ConvertNumMode = ConvertNumMode;
    }

    /**
     * Get <p>脏词过滤（目前支持中文普通话引擎）<br>0：不过滤脏词；<br>1：过滤脏词；<br>2：将脏词替换为 * ；<br>默认值为 0</p> 
     * @return FilterDirty <p>脏词过滤（目前支持中文普通话引擎）<br>0：不过滤脏词；<br>1：过滤脏词；<br>2：将脏词替换为 * ；<br>默认值为 0</p>
     */
    public Long getFilterDirty() {
        return this.FilterDirty;
    }

    /**
     * Set <p>脏词过滤（目前支持中文普通话引擎）<br>0：不过滤脏词；<br>1：过滤脏词；<br>2：将脏词替换为 * ；<br>默认值为 0</p>
     * @param FilterDirty <p>脏词过滤（目前支持中文普通话引擎）<br>0：不过滤脏词；<br>1：过滤脏词；<br>2：将脏词替换为 * ；<br>默认值为 0</p>
     */
    public void setFilterDirty(Long FilterDirty) {
        this.FilterDirty = FilterDirty;
    }

    /**
     * Get <p>标点符号过滤（目前支持中文普通话引擎）<br>0：不过滤标点；<br>1：过滤句末标点；<br>2：过滤所有标点；<br>默认值为 0</p> 
     * @return FilterPunc <p>标点符号过滤（目前支持中文普通话引擎）<br>0：不过滤标点；<br>1：过滤句末标点；<br>2：过滤所有标点；<br>默认值为 0</p>
     */
    public Long getFilterPunc() {
        return this.FilterPunc;
    }

    /**
     * Set <p>标点符号过滤（目前支持中文普通话引擎）<br>0：不过滤标点；<br>1：过滤句末标点；<br>2：过滤所有标点；<br>默认值为 0</p>
     * @param FilterPunc <p>标点符号过滤（目前支持中文普通话引擎）<br>0：不过滤标点；<br>1：过滤句末标点；<br>2：过滤所有标点；<br>默认值为 0</p>
     */
    public void setFilterPunc(Long FilterPunc) {
        this.FilterPunc = FilterPunc;
    }

    /**
     * Get <p>语气词过滤（目前支持中文普通话引擎）<br>0：不过滤语气词；<br>1：过滤部分语气词；<br>2：严格过滤语气词；<br>默认值为 0</p> 
     * @return FilterModal <p>语气词过滤（目前支持中文普通话引擎）<br>0：不过滤语气词；<br>1：过滤部分语气词；<br>2：严格过滤语气词；<br>默认值为 0</p>
     */
    public Long getFilterModal() {
        return this.FilterModal;
    }

    /**
     * Set <p>语气词过滤（目前支持中文普通话引擎）<br>0：不过滤语气词；<br>1：过滤部分语气词；<br>2：严格过滤语气词；<br>默认值为 0</p>
     * @param FilterModal <p>语气词过滤（目前支持中文普通话引擎）<br>0：不过滤语气词；<br>1：过滤部分语气词；<br>2：严格过滤语气词；<br>默认值为 0</p>
     */
    public void setFilterModal(Long FilterModal) {
        this.FilterModal = FilterModal;
    }

    /**
     * Get <p>单标点最多字数（目前支持中文普通话引擎）<br><strong>可控制单行字幕最大字数，适用于字幕生成场景</strong>，取值范围：[6，40]<br>0：不开启该功能；<br>默认值为0</p><p>注意：需设置ResTextFormat为3，解析返回的ResultDetail列表，通过结构中FinalSentence获取单个标点断句结果</p> 
     * @return SentenceMaxLength <p>单标点最多字数（目前支持中文普通话引擎）<br><strong>可控制单行字幕最大字数，适用于字幕生成场景</strong>，取值范围：[6，40]<br>0：不开启该功能；<br>默认值为0</p><p>注意：需设置ResTextFormat为3，解析返回的ResultDetail列表，通过结构中FinalSentence获取单个标点断句结果</p>
     */
    public Long getSentenceMaxLength() {
        return this.SentenceMaxLength;
    }

    /**
     * Set <p>单标点最多字数（目前支持中文普通话引擎）<br><strong>可控制单行字幕最大字数，适用于字幕生成场景</strong>，取值范围：[6，40]<br>0：不开启该功能；<br>默认值为0</p><p>注意：需设置ResTextFormat为3，解析返回的ResultDetail列表，通过结构中FinalSentence获取单个标点断句结果</p>
     * @param SentenceMaxLength <p>单标点最多字数（目前支持中文普通话引擎）<br><strong>可控制单行字幕最大字数，适用于字幕生成场景</strong>，取值范围：[6，40]<br>0：不开启该功能；<br>默认值为0</p><p>注意：需设置ResTextFormat为3，解析返回的ResultDetail列表，通过结构中FinalSentence获取单个标点断句结果</p>
     */
    public void setSentenceMaxLength(Long SentenceMaxLength) {
        this.SentenceMaxLength = SentenceMaxLength;
    }

    /**
     * Get <p>附加参数<strong>（该参数无意义，忽略即可）</strong></p> 
     * @return Extra <p>附加参数<strong>（该参数无意义，忽略即可）</strong></p>
     */
    public String getExtra() {
        return this.Extra;
    }

    /**
     * Set <p>附加参数<strong>（该参数无意义，忽略即可）</strong></p>
     * @param Extra <p>附加参数<strong>（该参数无意义，忽略即可）</strong></p>
     */
    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    /**
     * Get <p>临时热词表：该参数用于提升识别准确率。</p><ul><li><p>单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或“ASR|11”；</p></li><li><p>临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p></li><li><p>参数 hotword_id（热词表） 与 hotword_list（临时热词表） 区别：</p><ul><li><p>hotword_id：热词表。需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；</p></li><li><p>hotword_list：临时热词表。每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表。适用于有极大量热词需求的用户；</p></li></ul></li></ul><p>注意：</p><ul><li><p>如果同时传入了 hotword_id 和 hotword_list，只有hotword_list 生效；</p></li><li><p>热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。</p></li><li><p>热词权重设置为100时，当前热词开启热词增强同音同调替换功能（仅支持8k_zh,16k_zh），举例：热词配置“蜜制|100”时，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。</p></li></ul> 
     * @return HotwordList <p>临时热词表：该参数用于提升识别准确率。</p><ul><li><p>单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或“ASR|11”；</p></li><li><p>临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p></li><li><p>参数 hotword_id（热词表） 与 hotword_list（临时热词表） 区别：</p><ul><li><p>hotword_id：热词表。需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；</p></li><li><p>hotword_list：临时热词表。每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表。适用于有极大量热词需求的用户；</p></li></ul></li></ul><p>注意：</p><ul><li><p>如果同时传入了 hotword_id 和 hotword_list，只有hotword_list 生效；</p></li><li><p>热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。</p></li><li><p>热词权重设置为100时，当前热词开启热词增强同音同调替换功能（仅支持8k_zh,16k_zh），举例：热词配置“蜜制|100”时，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。</p></li></ul>
     */
    public String getHotwordList() {
        return this.HotwordList;
    }

    /**
     * Set <p>临时热词表：该参数用于提升识别准确率。</p><ul><li><p>单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或“ASR|11”；</p></li><li><p>临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p></li><li><p>参数 hotword_id（热词表） 与 hotword_list（临时热词表） 区别：</p><ul><li><p>hotword_id：热词表。需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；</p></li><li><p>hotword_list：临时热词表。每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表。适用于有极大量热词需求的用户；</p></li></ul></li></ul><p>注意：</p><ul><li><p>如果同时传入了 hotword_id 和 hotword_list，只有hotword_list 生效；</p></li><li><p>热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。</p></li><li><p>热词权重设置为100时，当前热词开启热词增强同音同调替换功能（仅支持8k_zh,16k_zh），举例：热词配置“蜜制|100”时，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。</p></li></ul>
     * @param HotwordList <p>临时热词表：该参数用于提升识别准确率。</p><ul><li><p>单个热词限制：&quot;热词|权重&quot;，单个热词不超过30个字符（最多10个汉字），权重[1-11]或者100，如：“腾讯云|5” 或“ASR|11”；</p></li><li><p>临时热词表限制：多个热词用英文逗号分割，最多支持128个热词，如：“腾讯云|10,语音识别|5,ASR|11”；</p></li><li><p>参数 hotword_id（热词表） 与 hotword_list（临时热词表） 区别：</p><ul><li><p>hotword_id：热词表。需要先在控制台或接口创建热词表，获得对应hotword_id传入参数来使用热词功能；</p></li><li><p>hotword_list：临时热词表。每次请求时直接传入临时热词表来使用热词功能，云端不保留临时热词表。适用于有极大量热词需求的用户；</p></li></ul></li></ul><p>注意：</p><ul><li><p>如果同时传入了 hotword_id 和 hotword_list，只有hotword_list 生效；</p></li><li><p>热词权重设置为11时，当前热词将升级为超级热词，建议仅将重要且必须生效的热词设置到11，设置过多权重为11的热词将影响整体字准率。</p></li><li><p>热词权重设置为100时，当前热词开启热词增强同音同调替换功能（仅支持8k_zh,16k_zh），举例：热词配置“蜜制|100”时，与“蜜制”同拼音（mizhi）的“秘制”的识别结果会被强制替换成“蜜制”。因此建议客户根据自己的实际情况开启该功能。建议仅将重要且必须生效的热词设置到100，设置过多权重为100的热词将影响整体字准率。</p></li></ul>
     */
    public void setHotwordList(String HotwordList) {
        this.HotwordList = HotwordList;
    }

    /**
     * Get <p>关键词识别ID列表，默认空为不进行识别，最多10个</p> 
     * @return KeyWordLibIdList <p>关键词识别ID列表，默认空为不进行识别，最多10个</p>
     */
    public String [] getKeyWordLibIdList() {
        return this.KeyWordLibIdList;
    }

    /**
     * Set <p>关键词识别ID列表，默认空为不进行识别，最多10个</p>
     * @param KeyWordLibIdList <p>关键词识别ID列表，默认空为不进行识别，最多10个</p>
     */
    public void setKeyWordLibIdList(String [] KeyWordLibIdList) {
        this.KeyWordLibIdList = KeyWordLibIdList;
    }

    /**
     * Get <p>替换词汇表id,  适用于热词和自学习场景也无法解决的极端case词组,  会对识别结果强制替换。具体可参考<a href="https://console.cloud.tencent.com/asr/replaceword">配置控制台</a>;强制替换功能可能会影响正常识别结果，请谨慎使用</p><p>注意：</p><ol><li>本功能配置完成后，预计在10分钟后生效</li></ol> 
     * @return ReplaceTextId <p>替换词汇表id,  适用于热词和自学习场景也无法解决的极端case词组,  会对识别结果强制替换。具体可参考<a href="https://console.cloud.tencent.com/asr/replaceword">配置控制台</a>;强制替换功能可能会影响正常识别结果，请谨慎使用</p><p>注意：</p><ol><li>本功能配置完成后，预计在10分钟后生效</li></ol>
     */
    public String getReplaceTextId() {
        return this.ReplaceTextId;
    }

    /**
     * Set <p>替换词汇表id,  适用于热词和自学习场景也无法解决的极端case词组,  会对识别结果强制替换。具体可参考<a href="https://console.cloud.tencent.com/asr/replaceword">配置控制台</a>;强制替换功能可能会影响正常识别结果，请谨慎使用</p><p>注意：</p><ol><li>本功能配置完成后，预计在10分钟后生效</li></ol>
     * @param ReplaceTextId <p>替换词汇表id,  适用于热词和自学习场景也无法解决的极端case词组,  会对识别结果强制替换。具体可参考<a href="https://console.cloud.tencent.com/asr/replaceword">配置控制台</a>;强制替换功能可能会影响正常识别结果，请谨慎使用</p><p>注意：</p><ol><li>本功能配置完成后，预计在10分钟后生效</li></ol>
     */
    public void setReplaceTextId(String ReplaceTextId) {
        this.ReplaceTextId = ReplaceTextId;
    }

    /**
     * Get <p>开启角色分离能力配合SpeakerDiarization: 3 使用，ASR增值服务，<strong>仅可传入一组声纹信息</strong>进行角色认证，仅支持16k_zh_en引擎。需传入SpeakerRoleInfo数据组，确定说话人的角色信息，涉及RoleAudioUrl和RoleName两个参数。 RoleAudioUrl：需要认证角色的声纹音频地址，建议30s内的纯净人声，最长不能超过45s。 RoleName：需要认证角色的名称，若匹配成功，会替换话者分离中的SpeakerID。 示例： &quot;{"EngineModelType":"16k_zh_en","ChannelNum":1,"ResTextFormat":1,"SourceType":0,"Url":"需要进行ASR识别的音频链接","SpeakerDiarization":3,"SpeakerRoles":[{"RoleAudioUrl":"需要认证角色的声纹音频地址","RoleName":"需要认证角色的名称"}]}&quot;</p> 
     * @return SpeakerRoles <p>开启角色分离能力配合SpeakerDiarization: 3 使用，ASR增值服务，<strong>仅可传入一组声纹信息</strong>进行角色认证，仅支持16k_zh_en引擎。需传入SpeakerRoleInfo数据组，确定说话人的角色信息，涉及RoleAudioUrl和RoleName两个参数。 RoleAudioUrl：需要认证角色的声纹音频地址，建议30s内的纯净人声，最长不能超过45s。 RoleName：需要认证角色的名称，若匹配成功，会替换话者分离中的SpeakerID。 示例： &quot;{"EngineModelType":"16k_zh_en","ChannelNum":1,"ResTextFormat":1,"SourceType":0,"Url":"需要进行ASR识别的音频链接","SpeakerDiarization":3,"SpeakerRoles":[{"RoleAudioUrl":"需要认证角色的声纹音频地址","RoleName":"需要认证角色的名称"}]}&quot;</p>
     */
    public SpeakerRoleInfo [] getSpeakerRoles() {
        return this.SpeakerRoles;
    }

    /**
     * Set <p>开启角色分离能力配合SpeakerDiarization: 3 使用，ASR增值服务，<strong>仅可传入一组声纹信息</strong>进行角色认证，仅支持16k_zh_en引擎。需传入SpeakerRoleInfo数据组，确定说话人的角色信息，涉及RoleAudioUrl和RoleName两个参数。 RoleAudioUrl：需要认证角色的声纹音频地址，建议30s内的纯净人声，最长不能超过45s。 RoleName：需要认证角色的名称，若匹配成功，会替换话者分离中的SpeakerID。 示例： &quot;{"EngineModelType":"16k_zh_en","ChannelNum":1,"ResTextFormat":1,"SourceType":0,"Url":"需要进行ASR识别的音频链接","SpeakerDiarization":3,"SpeakerRoles":[{"RoleAudioUrl":"需要认证角色的声纹音频地址","RoleName":"需要认证角色的名称"}]}&quot;</p>
     * @param SpeakerRoles <p>开启角色分离能力配合SpeakerDiarization: 3 使用，ASR增值服务，<strong>仅可传入一组声纹信息</strong>进行角色认证，仅支持16k_zh_en引擎。需传入SpeakerRoleInfo数据组，确定说话人的角色信息，涉及RoleAudioUrl和RoleName两个参数。 RoleAudioUrl：需要认证角色的声纹音频地址，建议30s内的纯净人声，最长不能超过45s。 RoleName：需要认证角色的名称，若匹配成功，会替换话者分离中的SpeakerID。 示例： &quot;{"EngineModelType":"16k_zh_en","ChannelNum":1,"ResTextFormat":1,"SourceType":0,"Url":"需要进行ASR识别的音频链接","SpeakerDiarization":3,"SpeakerRoles":[{"RoleAudioUrl":"需要认证角色的声纹音频地址","RoleName":"需要认证角色的名称"}]}&quot;</p>
     */
    public void setSpeakerRoles(SpeakerRoleInfo [] SpeakerRoles) {
        this.SpeakerRoles = SpeakerRoles;
    }

    public CreateRecTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecTaskRequest(CreateRecTaskRequest source) {
        if (source.EngineModelType != null) {
            this.EngineModelType = new String(source.EngineModelType);
        }
        if (source.ChannelNum != null) {
            this.ChannelNum = new Long(source.ChannelNum);
        }
        if (source.ResTextFormat != null) {
            this.ResTextFormat = new Long(source.ResTextFormat);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.DataLen != null) {
            this.DataLen = new Long(source.DataLen);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SpeakerDiarization != null) {
            this.SpeakerDiarization = new Long(source.SpeakerDiarization);
        }
        if (source.SpeakerNumber != null) {
            this.SpeakerNumber = new Long(source.SpeakerNumber);
        }
        if (source.HotwordId != null) {
            this.HotwordId = new String(source.HotwordId);
        }
        if (source.ReinforceHotword != null) {
            this.ReinforceHotword = new Long(source.ReinforceHotword);
        }
        if (source.CustomizationId != null) {
            this.CustomizationId = new String(source.CustomizationId);
        }
        if (source.EmotionRecognition != null) {
            this.EmotionRecognition = new Long(source.EmotionRecognition);
        }
        if (source.EmotionalEnergy != null) {
            this.EmotionalEnergy = new Long(source.EmotionalEnergy);
        }
        if (source.ConvertNumMode != null) {
            this.ConvertNumMode = new Long(source.ConvertNumMode);
        }
        if (source.FilterDirty != null) {
            this.FilterDirty = new Long(source.FilterDirty);
        }
        if (source.FilterPunc != null) {
            this.FilterPunc = new Long(source.FilterPunc);
        }
        if (source.FilterModal != null) {
            this.FilterModal = new Long(source.FilterModal);
        }
        if (source.SentenceMaxLength != null) {
            this.SentenceMaxLength = new Long(source.SentenceMaxLength);
        }
        if (source.Extra != null) {
            this.Extra = new String(source.Extra);
        }
        if (source.HotwordList != null) {
            this.HotwordList = new String(source.HotwordList);
        }
        if (source.KeyWordLibIdList != null) {
            this.KeyWordLibIdList = new String[source.KeyWordLibIdList.length];
            for (int i = 0; i < source.KeyWordLibIdList.length; i++) {
                this.KeyWordLibIdList[i] = new String(source.KeyWordLibIdList[i]);
            }
        }
        if (source.ReplaceTextId != null) {
            this.ReplaceTextId = new String(source.ReplaceTextId);
        }
        if (source.SpeakerRoles != null) {
            this.SpeakerRoles = new SpeakerRoleInfo[source.SpeakerRoles.length];
            for (int i = 0; i < source.SpeakerRoles.length; i++) {
                this.SpeakerRoles[i] = new SpeakerRoleInfo(source.SpeakerRoles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineModelType", this.EngineModelType);
        this.setParamSimple(map, prefix + "ChannelNum", this.ChannelNum);
        this.setParamSimple(map, prefix + "ResTextFormat", this.ResTextFormat);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "DataLen", this.DataLen);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SpeakerDiarization", this.SpeakerDiarization);
        this.setParamSimple(map, prefix + "SpeakerNumber", this.SpeakerNumber);
        this.setParamSimple(map, prefix + "HotwordId", this.HotwordId);
        this.setParamSimple(map, prefix + "ReinforceHotword", this.ReinforceHotword);
        this.setParamSimple(map, prefix + "CustomizationId", this.CustomizationId);
        this.setParamSimple(map, prefix + "EmotionRecognition", this.EmotionRecognition);
        this.setParamSimple(map, prefix + "EmotionalEnergy", this.EmotionalEnergy);
        this.setParamSimple(map, prefix + "ConvertNumMode", this.ConvertNumMode);
        this.setParamSimple(map, prefix + "FilterDirty", this.FilterDirty);
        this.setParamSimple(map, prefix + "FilterPunc", this.FilterPunc);
        this.setParamSimple(map, prefix + "FilterModal", this.FilterModal);
        this.setParamSimple(map, prefix + "SentenceMaxLength", this.SentenceMaxLength);
        this.setParamSimple(map, prefix + "Extra", this.Extra);
        this.setParamSimple(map, prefix + "HotwordList", this.HotwordList);
        this.setParamArraySimple(map, prefix + "KeyWordLibIdList.", this.KeyWordLibIdList);
        this.setParamSimple(map, prefix + "ReplaceTextId", this.ReplaceTextId);
        this.setParamArrayObj(map, prefix + "SpeakerRoles.", this.SpeakerRoles);

    }
}

