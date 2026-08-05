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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAICallRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>被叫号码</p>
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * <p>模型接口协议类型，目前兼容四种协议类型：</p><ul><li>OpenAI协议(包括GPT、混元、DeepSeek等)：&quot;openai&quot;</li><li>Azure协议：&quot;azure&quot;</li><li>Minimax协议：&quot;minimax&quot;</li><li>Dify协议: &quot;dify&quot;</li></ul>
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * <p>模型API密钥，获取鉴权信息方式请参见各模型官网</p><ul><li><p>OpenAI协议：<a href="https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key">GPT</a>，<a href="https://cloud.tencent.com/document/product/1729/111008">混元</a>，<a href="https://api-docs.deepseek.com/zh-cn/">DeepSeek</a>；</p></li><li><p>Azure协议：<a href="https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&amp;pivots=programming-language-studio#key-settings">Azure GPT</a>；</p></li><li><p>Minimax：<a href="https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2">Minimax</a></p></li></ul>
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>模型接口地址</p><ul><li><p>OpenAI协议<br>GPT：&quot;https://api.openai.com/v1/&quot;<br>混元：&quot;https://api.hunyuan.cloud.tencent.com/v1&quot;<br>Deepseek：&quot;https://api.deepseek.com/v1&quot;</p></li><li><p>Azure协议<br>&quot;https://{your-resource-name}.openai.azure.com?api-version={api-version}&quot;</p></li><li><p>Minimax协议<br>&quot;https://api.minimax.chat/v1&quot;</p></li></ul>
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * <p>用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。</p>
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * <p>模型名称，如</p><ul><li><p>OpenAI协议<br>&quot;gpt-4o-mini&quot;,&quot;gpt-4o&quot;，&quot;hunyuan-standard&quot;, &quot;hunyuan-turbo&quot;，&quot;deepseek-chat&quot;；</p></li><li><p>Azure协议<br>&quot;gpt-4o-mini&quot;, &quot;gpt-4o&quot;；</p></li><li><p>Minmax协议<br>&quot;deepseek-chat&quot;.</p></li></ul>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置</p><p>汉语：<br>ZhiMei：智美，客服女声<br>ZhiXi： 智希 通用女声<br>ZhiQi：智琪 客服女声<br>ZhiTian：智甜 女童声<br>AiXiaoJing：爱小静 对话女声</p><p>英语:<br>WeRose：英文女声<br>Monika：英文女声</p><p>日语：<br>Nanami</p><p>韩语：<br>SunHi</p><p>印度尼西亚语(印度尼西亚)：<br>Gadis</p><p>马来语（马来西亚）:<br>Yasmin</p><p> 泰米尔语（马来西亚）:<br>Kani</p><p>泰语（泰国）:<br>Achara</p><p>越南语(越南):<br>HoaiMy</p>
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * <p>主叫号码列表</p>
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * <p>用于设定AI座席欢迎语。</p>
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * <p>0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)<br>1:   使用ai根据prompt自动生成welcomeMessage并先说话</p>
    */
    @SerializedName("WelcomeType")
    @Expose
    private Long WelcomeType;

    /**
    * <p>0: 默认可打断， 2：高优先不可打断</p>
    */
    @SerializedName("WelcomeMessagePriority")
    @Expose
    private Long WelcomeMessagePriority;

    /**
    * <p>最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * <p>语音识别支持的语言, 默认是&quot;zh&quot; 中文,<br>填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，<br>注意:主要语言为中国方言时，可选语言无效<br>目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：</p><ol><li>Chinese = &quot;zh&quot; # 中文</li><li>Chinese_TW = &quot;zh-TW&quot; # 中国台湾</li><li>Chinese_DIALECT = &quot;zh-dialect&quot; # 中国方言</li><li>English = &quot;en&quot; # 英语</li><li>Vietnamese = &quot;vi&quot; # 越南语</li><li>Japanese = &quot;ja&quot; # 日语</li><li>Korean = &quot;ko&quot; # 汉语</li><li>Indonesia = &quot;id&quot; # 印度尼西亚语</li><li>Thai = &quot;th&quot; # 泰语</li><li>Portuguese = &quot;pt&quot; # 葡萄牙语</li><li>Turkish = &quot;tr&quot; # 土耳其语</li><li>Arabic = &quot;ar&quot; # 阿拉伯语</li><li>Spanish = &quot;es&quot; # 西班牙语</li><li>Hindi = &quot;hi&quot; # 印地语</li><li>French = &quot;fr&quot; # 法语</li><li>Malay = &quot;ms&quot; # 马来语</li><li>Filipino = &quot;fil&quot; # 菲律宾语</li><li>German = &quot;de&quot; # 德语</li><li>Italian = &quot;it&quot; # 意大利语</li><li>Russian = &quot;ru&quot; # 俄语</li></ol>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>打断AI说话模式，默认为0，0表示自动打断，1表示不打断。</p>
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * <p>InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。</p>
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * <p>模型是否支持(或者开启)call_end function calling</p>
    */
    @SerializedName("EndFunctionEnable")
    @Expose
    private Boolean EndFunctionEnable;

    /**
    * <p>EndFunctionEnable为true时生效；call_end function calling的desc，默认为 &quot;End the call when user has to leave (like says bye) or you are instructed to do so.&quot;</p>
    */
    @SerializedName("EndFunctionDesc")
    @Expose
    private String EndFunctionDesc;

    /**
    * <p>模型是否支持(或者开启)transfer_to_human function calling</p>
    */
    @SerializedName("TransferFunctionEnable")
    @Expose
    private Boolean TransferFunctionEnable;

    /**
    * <p>TransferFunctionEnable为true的时候生效: 转人工配置</p>
    */
    @SerializedName("TransferItems")
    @Expose
    private AITransferItem [] TransferItems;

    /**
    * <p>模型是否支持(或者开启)转智能体function calling</p>
    */
    @SerializedName("TransferToAgentEnable")
    @Expose
    private Boolean TransferToAgentEnable;

    /**
    * <p>TransferToAgentEnable为true的时候生效: 转智能体配置</p>
    */
    @SerializedName("TransferToAgentItems")
    @Expose
    private TransferToAgentItem [] TransferToAgentItems;

    /**
    * <p>用户多久没说话提示时长,最小10秒,默认10秒</p>
    */
    @SerializedName("NotifyDuration")
    @Expose
    private Long NotifyDuration;

    /**
    * <p>用户NotifyDuration没说话，AI提示的语句，默认是&quot;抱歉，我没听清。您可以重复下吗？&quot;</p>
    */
    @SerializedName("NotifyMessage")
    @Expose
    private String NotifyMessage;

    /**
    * <p>最大触发AI提示音次数，默认为不限制</p>
    */
    @SerializedName("NotifyMaxCount")
    @Expose
    private Long NotifyMaxCount;

    /**
    * <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p><ul><li>Tencent TTS<br>配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中     u2003 "AppId": "您的应用ID", // String 必填     u2003 "SecretId": "您的密钥ID", // String 必填     u2003 "SecretKey":  "您的密钥Key", // String 必填     u2003 "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。     u2003 "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换     u2003 "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。     u2003 "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数  u2003}</code></pre> </div><ul><li>Minimax TTS<br>配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank"> Minimax TTS 文档链接</a>。注意 Minimax TTS 存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "minimax",  // String TTS类型,         "Model": "speech-01-turbo",        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",        "APIKey": "eyxxxx",        "GroupId": "181000000000000",        "VoiceType":"female-tianmei",        "Speed": 1.2}</code></pre></div><ul><li>火山 TTS</li></ul><p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>语音合成音色列表–语音技术-火山引擎<br>大模型语音合成音色列表–语音技术-火山引擎</p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "volcengine",  // 必填：String TTS类型    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token    "Speed" : 1.0,            // 可选参数 语速，默认为1.0    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。}</code></pre></div><ul><li>Azure TTS<br>配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "azure", // 必填：String TTS类型    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key    "Region": "chinanorth3",  // 必填：String 订阅的地区    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填    "Language": "zh-CN", // 必填：String 合成的语言      "Rate": 1 // 选填：float 语速  0.5～2 默认为 1}</code></pre></div><ul><li>自定义TTS</li></ul><p>具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{  "TTSType": "custom", // String 必填  "APIKey": "ApiKey", // String 必填 用来鉴权  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  }</code></pre></div>
    */
    @SerializedName("CustomTTSConfig")
    @Expose
    private String CustomTTSConfig;

    /**
    * <p>提示词变量</p>
    */
    @SerializedName("PromptVariables")
    @Expose
    private Variable [] PromptVariables;

    /**
    * <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
    */
    @SerializedName("VadSilenceTime")
    @Expose
    private Long VadSilenceTime;

    /**
    * <p>通话内容提取配置</p>
    */
    @SerializedName("ExtractConfig")
    @Expose
    private AICallExtractConfigElement [] ExtractConfig;

    /**
    * <p>模型温度控制</p>
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
    */
    @SerializedName("Variables")
    @Expose
    private Variable [] Variables;

    /**
    * <p>模型topP</p>
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。</p>
    */
    @SerializedName("VadLevel")
    @Expose
    private Long VadLevel;

    /**
    * <p>衔接语</p>
    */
    @SerializedName("ToneWord")
    @Expose
    private ToneWordInfo ToneWord;

    /**
    * <p>合规提示音，<br>该参数传true（默认）表示通话开始播放摩斯码，提示对话内容为 AI 生成。<br>该参数传false表示关闭合规提示音。该参数传false则代表您知晓并同意以下协议：<br>我方充分知悉和理解，根据<a href="https://www.cac.gov.cn/2016-11/07/c_1119867116.htm">《网络安全法》</a><a href="https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm">《互联网信息服务深度合成管理规定》</a><a href="https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm">《生成式人工智能服务管理暂行办法》</a><a href="https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm">《人工智能生成合成内容标识办法》</a>的法律法规的规定，对人工智能生成合成内容应当添加显式标识和隐式标识。我方基于业务需求，请腾讯云对生成合成内容不添加显式标识，我方承诺合法合规使用生成合成内容，避免造成混淆、误认；如果使用生成合成内容对公众提供服务的，或通过网络传播的，我方将自觉主动添加符合法律规定和国家标准要求的显式标识，承担人工智能生成合成内容标识的法律义务。我方未能恰当、合理地履行人工智能内容标识义务造成不良后果的，或遭受主管部门责罚的，相关责任由我方完全承担。</p>
    */
    @SerializedName("EnableComplianceAudio")
    @Expose
    private Boolean EnableComplianceAudio;

    /**
    * <p>是否开启语音信箱识别</p>
    */
    @SerializedName("EnableVoicemailDetection")
    @Expose
    private Boolean EnableVoicemailDetection;

    /**
    * <p>识别到对端为语音信箱时的行为，当EnableVoicemailDetection为True时生效<br>0: 挂断电话（默认）</p>
    */
    @SerializedName("VoicemailAction")
    @Expose
    private Long VoicemailAction;

    /**
    * <p>大模型拓展参数， 格式为json字符串</p>
    */
    @SerializedName("LLMExtraBody")
    @Expose
    private String LLMExtraBody;

    /**
    * <p>最大通话时长， 默认不限制。单位毫秒(ms)</p>
    */
    @SerializedName("MaxCallDurationMs")
    @Expose
    private Long MaxCallDurationMs;

    /**
    * <p>最大振铃时长，达到时长阈值自动挂断。 <strong>仅自携号码支持当前参数</strong></p>
    */
    @SerializedName("MaxRingTimeoutSecond")
    @Expose
    private Long MaxRingTimeoutSecond;

    /**
    * <p>环境音场景，没有的话不填。<br>coffee_shops：咖啡店氛围，背景中有人聊天<br>busy_office：客服中心</p>
    */
    @SerializedName("AmbientSoundType")
    @Expose
    private String AmbientSoundType;

    /**
    * <p>环境音音量。如果AmbientSoundType 为空，该字段不填。取值的范围是 [0,2]。值越低，环境音越小；值越高，环境音越响亮。如果未设置，则使用默认值 1。</p>
    */
    @SerializedName("AmbientSoundVolume")
    @Expose
    private Float AmbientSoundVolume;

    /**
    * <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
    */
    @SerializedName("AcquireTimeoutSecond")
    @Expose
    private Long AcquireTimeoutSecond;

    /**
    * <p>自定义STT配置，请联系产品/开发后使用</p>
    */
    @SerializedName("CustomSTTConfig")
    @Expose
    private String CustomSTTConfig;

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>被叫号码</p> 
     * @return Callee <p>被叫号码</p>
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set <p>被叫号码</p>
     * @param Callee <p>被叫号码</p>
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get <p>模型接口协议类型，目前兼容四种协议类型：</p><ul><li>OpenAI协议(包括GPT、混元、DeepSeek等)：&quot;openai&quot;</li><li>Azure协议：&quot;azure&quot;</li><li>Minimax协议：&quot;minimax&quot;</li><li>Dify协议: &quot;dify&quot;</li></ul> 
     * @return LLMType <p>模型接口协议类型，目前兼容四种协议类型：</p><ul><li>OpenAI协议(包括GPT、混元、DeepSeek等)：&quot;openai&quot;</li><li>Azure协议：&quot;azure&quot;</li><li>Minimax协议：&quot;minimax&quot;</li><li>Dify协议: &quot;dify&quot;</li></ul>
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set <p>模型接口协议类型，目前兼容四种协议类型：</p><ul><li>OpenAI协议(包括GPT、混元、DeepSeek等)：&quot;openai&quot;</li><li>Azure协议：&quot;azure&quot;</li><li>Minimax协议：&quot;minimax&quot;</li><li>Dify协议: &quot;dify&quot;</li></ul>
     * @param LLMType <p>模型接口协议类型，目前兼容四种协议类型：</p><ul><li>OpenAI协议(包括GPT、混元、DeepSeek等)：&quot;openai&quot;</li><li>Azure协议：&quot;azure&quot;</li><li>Minimax协议：&quot;minimax&quot;</li><li>Dify协议: &quot;dify&quot;</li></ul>
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get <p>模型API密钥，获取鉴权信息方式请参见各模型官网</p><ul><li><p>OpenAI协议：<a href="https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key">GPT</a>，<a href="https://cloud.tencent.com/document/product/1729/111008">混元</a>，<a href="https://api-docs.deepseek.com/zh-cn/">DeepSeek</a>；</p></li><li><p>Azure协议：<a href="https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&amp;pivots=programming-language-studio#key-settings">Azure GPT</a>；</p></li><li><p>Minimax：<a href="https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2">Minimax</a></p></li></ul> 
     * @return APIKey <p>模型API密钥，获取鉴权信息方式请参见各模型官网</p><ul><li><p>OpenAI协议：<a href="https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key">GPT</a>，<a href="https://cloud.tencent.com/document/product/1729/111008">混元</a>，<a href="https://api-docs.deepseek.com/zh-cn/">DeepSeek</a>；</p></li><li><p>Azure协议：<a href="https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&amp;pivots=programming-language-studio#key-settings">Azure GPT</a>；</p></li><li><p>Minimax：<a href="https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2">Minimax</a></p></li></ul>
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set <p>模型API密钥，获取鉴权信息方式请参见各模型官网</p><ul><li><p>OpenAI协议：<a href="https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key">GPT</a>，<a href="https://cloud.tencent.com/document/product/1729/111008">混元</a>，<a href="https://api-docs.deepseek.com/zh-cn/">DeepSeek</a>；</p></li><li><p>Azure协议：<a href="https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&amp;pivots=programming-language-studio#key-settings">Azure GPT</a>；</p></li><li><p>Minimax：<a href="https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2">Minimax</a></p></li></ul>
     * @param APIKey <p>模型API密钥，获取鉴权信息方式请参见各模型官网</p><ul><li><p>OpenAI协议：<a href="https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key">GPT</a>，<a href="https://cloud.tencent.com/document/product/1729/111008">混元</a>，<a href="https://api-docs.deepseek.com/zh-cn/">DeepSeek</a>；</p></li><li><p>Azure协议：<a href="https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&amp;pivots=programming-language-studio#key-settings">Azure GPT</a>；</p></li><li><p>Minimax：<a href="https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2">Minimax</a></p></li></ul>
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>模型接口地址</p><ul><li><p>OpenAI协议<br>GPT：&quot;https://api.openai.com/v1/&quot;<br>混元：&quot;https://api.hunyuan.cloud.tencent.com/v1&quot;<br>Deepseek：&quot;https://api.deepseek.com/v1&quot;</p></li><li><p>Azure协议<br>&quot;https://{your-resource-name}.openai.azure.com?api-version={api-version}&quot;</p></li><li><p>Minimax协议<br>&quot;https://api.minimax.chat/v1&quot;</p></li></ul> 
     * @return APIUrl <p>模型接口地址</p><ul><li><p>OpenAI协议<br>GPT：&quot;https://api.openai.com/v1/&quot;<br>混元：&quot;https://api.hunyuan.cloud.tencent.com/v1&quot;<br>Deepseek：&quot;https://api.deepseek.com/v1&quot;</p></li><li><p>Azure协议<br>&quot;https://{your-resource-name}.openai.azure.com?api-version={api-version}&quot;</p></li><li><p>Minimax协议<br>&quot;https://api.minimax.chat/v1&quot;</p></li></ul>
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set <p>模型接口地址</p><ul><li><p>OpenAI协议<br>GPT：&quot;https://api.openai.com/v1/&quot;<br>混元：&quot;https://api.hunyuan.cloud.tencent.com/v1&quot;<br>Deepseek：&quot;https://api.deepseek.com/v1&quot;</p></li><li><p>Azure协议<br>&quot;https://{your-resource-name}.openai.azure.com?api-version={api-version}&quot;</p></li><li><p>Minimax协议<br>&quot;https://api.minimax.chat/v1&quot;</p></li></ul>
     * @param APIUrl <p>模型接口地址</p><ul><li><p>OpenAI协议<br>GPT：&quot;https://api.openai.com/v1/&quot;<br>混元：&quot;https://api.hunyuan.cloud.tencent.com/v1&quot;<br>Deepseek：&quot;https://api.deepseek.com/v1&quot;</p></li><li><p>Azure协议<br>&quot;https://{your-resource-name}.openai.azure.com?api-version={api-version}&quot;</p></li><li><p>Minimax协议<br>&quot;https://api.minimax.chat/v1&quot;</p></li></ul>
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get <p>用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。</p> 
     * @return SystemPrompt <p>用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。</p>
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set <p>用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。</p>
     * @param SystemPrompt <p>用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。</p>
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get <p>模型名称，如</p><ul><li><p>OpenAI协议<br>&quot;gpt-4o-mini&quot;,&quot;gpt-4o&quot;，&quot;hunyuan-standard&quot;, &quot;hunyuan-turbo&quot;，&quot;deepseek-chat&quot;；</p></li><li><p>Azure协议<br>&quot;gpt-4o-mini&quot;, &quot;gpt-4o&quot;；</p></li><li><p>Minmax协议<br>&quot;deepseek-chat&quot;.</p></li></ul> 
     * @return Model <p>模型名称，如</p><ul><li><p>OpenAI协议<br>&quot;gpt-4o-mini&quot;,&quot;gpt-4o&quot;，&quot;hunyuan-standard&quot;, &quot;hunyuan-turbo&quot;，&quot;deepseek-chat&quot;；</p></li><li><p>Azure协议<br>&quot;gpt-4o-mini&quot;, &quot;gpt-4o&quot;；</p></li><li><p>Minmax协议<br>&quot;deepseek-chat&quot;.</p></li></ul>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>模型名称，如</p><ul><li><p>OpenAI协议<br>&quot;gpt-4o-mini&quot;,&quot;gpt-4o&quot;，&quot;hunyuan-standard&quot;, &quot;hunyuan-turbo&quot;，&quot;deepseek-chat&quot;；</p></li><li><p>Azure协议<br>&quot;gpt-4o-mini&quot;, &quot;gpt-4o&quot;；</p></li><li><p>Minmax协议<br>&quot;deepseek-chat&quot;.</p></li></ul>
     * @param Model <p>模型名称，如</p><ul><li><p>OpenAI协议<br>&quot;gpt-4o-mini&quot;,&quot;gpt-4o&quot;，&quot;hunyuan-standard&quot;, &quot;hunyuan-turbo&quot;，&quot;deepseek-chat&quot;；</p></li><li><p>Azure协议<br>&quot;gpt-4o-mini&quot;, &quot;gpt-4o&quot;；</p></li><li><p>Minmax协议<br>&quot;deepseek-chat&quot;.</p></li></ul>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置</p><p>汉语：<br>ZhiMei：智美，客服女声<br>ZhiXi： 智希 通用女声<br>ZhiQi：智琪 客服女声<br>ZhiTian：智甜 女童声<br>AiXiaoJing：爱小静 对话女声</p><p>英语:<br>WeRose：英文女声<br>Monika：英文女声</p><p>日语：<br>Nanami</p><p>韩语：<br>SunHi</p><p>印度尼西亚语(印度尼西亚)：<br>Gadis</p><p>马来语（马来西亚）:<br>Yasmin</p><p> 泰米尔语（马来西亚）:<br>Kani</p><p>泰语（泰国）:<br>Achara</p><p>越南语(越南):<br>HoaiMy</p> 
     * @return VoiceType <p>默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置</p><p>汉语：<br>ZhiMei：智美，客服女声<br>ZhiXi： 智希 通用女声<br>ZhiQi：智琪 客服女声<br>ZhiTian：智甜 女童声<br>AiXiaoJing：爱小静 对话女声</p><p>英语:<br>WeRose：英文女声<br>Monika：英文女声</p><p>日语：<br>Nanami</p><p>韩语：<br>SunHi</p><p>印度尼西亚语(印度尼西亚)：<br>Gadis</p><p>马来语（马来西亚）:<br>Yasmin</p><p> 泰米尔语（马来西亚）:<br>Kani</p><p>泰语（泰国）:<br>Achara</p><p>越南语(越南):<br>HoaiMy</p>
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set <p>默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置</p><p>汉语：<br>ZhiMei：智美，客服女声<br>ZhiXi： 智希 通用女声<br>ZhiQi：智琪 客服女声<br>ZhiTian：智甜 女童声<br>AiXiaoJing：爱小静 对话女声</p><p>英语:<br>WeRose：英文女声<br>Monika：英文女声</p><p>日语：<br>Nanami</p><p>韩语：<br>SunHi</p><p>印度尼西亚语(印度尼西亚)：<br>Gadis</p><p>马来语（马来西亚）:<br>Yasmin</p><p> 泰米尔语（马来西亚）:<br>Kani</p><p>泰语（泰国）:<br>Achara</p><p>越南语(越南):<br>HoaiMy</p>
     * @param VoiceType <p>默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置</p><p>汉语：<br>ZhiMei：智美，客服女声<br>ZhiXi： 智希 通用女声<br>ZhiQi：智琪 客服女声<br>ZhiTian：智甜 女童声<br>AiXiaoJing：爱小静 对话女声</p><p>英语:<br>WeRose：英文女声<br>Monika：英文女声</p><p>日语：<br>Nanami</p><p>韩语：<br>SunHi</p><p>印度尼西亚语(印度尼西亚)：<br>Gadis</p><p>马来语（马来西亚）:<br>Yasmin</p><p> 泰米尔语（马来西亚）:<br>Kani</p><p>泰语（泰国）:<br>Achara</p><p>越南语(越南):<br>HoaiMy</p>
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get <p>主叫号码列表</p> 
     * @return Callers <p>主叫号码列表</p>
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set <p>主叫号码列表</p>
     * @param Callers <p>主叫号码列表</p>
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get <p>用于设定AI座席欢迎语。</p> 
     * @return WelcomeMessage <p>用于设定AI座席欢迎语。</p>
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set <p>用于设定AI座席欢迎语。</p>
     * @param WelcomeMessage <p>用于设定AI座席欢迎语。</p>
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get <p>0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)<br>1:   使用ai根据prompt自动生成welcomeMessage并先说话</p> 
     * @return WelcomeType <p>0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)<br>1:   使用ai根据prompt自动生成welcomeMessage并先说话</p>
     */
    public Long getWelcomeType() {
        return this.WelcomeType;
    }

    /**
     * Set <p>0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)<br>1:   使用ai根据prompt自动生成welcomeMessage并先说话</p>
     * @param WelcomeType <p>0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)<br>1:   使用ai根据prompt自动生成welcomeMessage并先说话</p>
     */
    public void setWelcomeType(Long WelcomeType) {
        this.WelcomeType = WelcomeType;
    }

    /**
     * Get <p>0: 默认可打断， 2：高优先不可打断</p> 
     * @return WelcomeMessagePriority <p>0: 默认可打断， 2：高优先不可打断</p>
     */
    public Long getWelcomeMessagePriority() {
        return this.WelcomeMessagePriority;
    }

    /**
     * Set <p>0: 默认可打断， 2：高优先不可打断</p>
     * @param WelcomeMessagePriority <p>0: 默认可打断， 2：高优先不可打断</p>
     */
    public void setWelcomeMessagePriority(Long WelcomeMessagePriority) {
        this.WelcomeMessagePriority = WelcomeMessagePriority;
    }

    /**
     * Get <p>最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断</p> 
     * @return MaxDuration <p>最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断</p>
     * @param MaxDuration <p>最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get <p>语音识别支持的语言, 默认是&quot;zh&quot; 中文,<br>填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，<br>注意:主要语言为中国方言时，可选语言无效<br>目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：</p><ol><li>Chinese = &quot;zh&quot; # 中文</li><li>Chinese_TW = &quot;zh-TW&quot; # 中国台湾</li><li>Chinese_DIALECT = &quot;zh-dialect&quot; # 中国方言</li><li>English = &quot;en&quot; # 英语</li><li>Vietnamese = &quot;vi&quot; # 越南语</li><li>Japanese = &quot;ja&quot; # 日语</li><li>Korean = &quot;ko&quot; # 汉语</li><li>Indonesia = &quot;id&quot; # 印度尼西亚语</li><li>Thai = &quot;th&quot; # 泰语</li><li>Portuguese = &quot;pt&quot; # 葡萄牙语</li><li>Turkish = &quot;tr&quot; # 土耳其语</li><li>Arabic = &quot;ar&quot; # 阿拉伯语</li><li>Spanish = &quot;es&quot; # 西班牙语</li><li>Hindi = &quot;hi&quot; # 印地语</li><li>French = &quot;fr&quot; # 法语</li><li>Malay = &quot;ms&quot; # 马来语</li><li>Filipino = &quot;fil&quot; # 菲律宾语</li><li>German = &quot;de&quot; # 德语</li><li>Italian = &quot;it&quot; # 意大利语</li><li>Russian = &quot;ru&quot; # 俄语</li></ol> 
     * @return Languages <p>语音识别支持的语言, 默认是&quot;zh&quot; 中文,<br>填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，<br>注意:主要语言为中国方言时，可选语言无效<br>目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：</p><ol><li>Chinese = &quot;zh&quot; # 中文</li><li>Chinese_TW = &quot;zh-TW&quot; # 中国台湾</li><li>Chinese_DIALECT = &quot;zh-dialect&quot; # 中国方言</li><li>English = &quot;en&quot; # 英语</li><li>Vietnamese = &quot;vi&quot; # 越南语</li><li>Japanese = &quot;ja&quot; # 日语</li><li>Korean = &quot;ko&quot; # 汉语</li><li>Indonesia = &quot;id&quot; # 印度尼西亚语</li><li>Thai = &quot;th&quot; # 泰语</li><li>Portuguese = &quot;pt&quot; # 葡萄牙语</li><li>Turkish = &quot;tr&quot; # 土耳其语</li><li>Arabic = &quot;ar&quot; # 阿拉伯语</li><li>Spanish = &quot;es&quot; # 西班牙语</li><li>Hindi = &quot;hi&quot; # 印地语</li><li>French = &quot;fr&quot; # 法语</li><li>Malay = &quot;ms&quot; # 马来语</li><li>Filipino = &quot;fil&quot; # 菲律宾语</li><li>German = &quot;de&quot; # 德语</li><li>Italian = &quot;it&quot; # 意大利语</li><li>Russian = &quot;ru&quot; # 俄语</li></ol>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>语音识别支持的语言, 默认是&quot;zh&quot; 中文,<br>填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，<br>注意:主要语言为中国方言时，可选语言无效<br>目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：</p><ol><li>Chinese = &quot;zh&quot; # 中文</li><li>Chinese_TW = &quot;zh-TW&quot; # 中国台湾</li><li>Chinese_DIALECT = &quot;zh-dialect&quot; # 中国方言</li><li>English = &quot;en&quot; # 英语</li><li>Vietnamese = &quot;vi&quot; # 越南语</li><li>Japanese = &quot;ja&quot; # 日语</li><li>Korean = &quot;ko&quot; # 汉语</li><li>Indonesia = &quot;id&quot; # 印度尼西亚语</li><li>Thai = &quot;th&quot; # 泰语</li><li>Portuguese = &quot;pt&quot; # 葡萄牙语</li><li>Turkish = &quot;tr&quot; # 土耳其语</li><li>Arabic = &quot;ar&quot; # 阿拉伯语</li><li>Spanish = &quot;es&quot; # 西班牙语</li><li>Hindi = &quot;hi&quot; # 印地语</li><li>French = &quot;fr&quot; # 法语</li><li>Malay = &quot;ms&quot; # 马来语</li><li>Filipino = &quot;fil&quot; # 菲律宾语</li><li>German = &quot;de&quot; # 德语</li><li>Italian = &quot;it&quot; # 意大利语</li><li>Russian = &quot;ru&quot; # 俄语</li></ol>
     * @param Languages <p>语音识别支持的语言, 默认是&quot;zh&quot; 中文,<br>填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，<br>注意:主要语言为中国方言时，可选语言无效<br>目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：</p><ol><li>Chinese = &quot;zh&quot; # 中文</li><li>Chinese_TW = &quot;zh-TW&quot; # 中国台湾</li><li>Chinese_DIALECT = &quot;zh-dialect&quot; # 中国方言</li><li>English = &quot;en&quot; # 英语</li><li>Vietnamese = &quot;vi&quot; # 越南语</li><li>Japanese = &quot;ja&quot; # 日语</li><li>Korean = &quot;ko&quot; # 汉语</li><li>Indonesia = &quot;id&quot; # 印度尼西亚语</li><li>Thai = &quot;th&quot; # 泰语</li><li>Portuguese = &quot;pt&quot; # 葡萄牙语</li><li>Turkish = &quot;tr&quot; # 土耳其语</li><li>Arabic = &quot;ar&quot; # 阿拉伯语</li><li>Spanish = &quot;es&quot; # 西班牙语</li><li>Hindi = &quot;hi&quot; # 印地语</li><li>French = &quot;fr&quot; # 法语</li><li>Malay = &quot;ms&quot; # 马来语</li><li>Filipino = &quot;fil&quot; # 菲律宾语</li><li>German = &quot;de&quot; # 德语</li><li>Italian = &quot;it&quot; # 意大利语</li><li>Russian = &quot;ru&quot; # 俄语</li></ol>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get <p>打断AI说话模式，默认为0，0表示自动打断，1表示不打断。</p> 
     * @return InterruptMode <p>打断AI说话模式，默认为0，0表示自动打断，1表示不打断。</p>
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set <p>打断AI说话模式，默认为0，0表示自动打断，1表示不打断。</p>
     * @param InterruptMode <p>打断AI说话模式，默认为0，0表示自动打断，1表示不打断。</p>
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get <p>InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。</p> 
     * @return InterruptSpeechDuration <p>InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。</p>
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set <p>InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。</p>
     * @param InterruptSpeechDuration <p>InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。</p>
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get <p>模型是否支持(或者开启)call_end function calling</p> 
     * @return EndFunctionEnable <p>模型是否支持(或者开启)call_end function calling</p>
     */
    public Boolean getEndFunctionEnable() {
        return this.EndFunctionEnable;
    }

    /**
     * Set <p>模型是否支持(或者开启)call_end function calling</p>
     * @param EndFunctionEnable <p>模型是否支持(或者开启)call_end function calling</p>
     */
    public void setEndFunctionEnable(Boolean EndFunctionEnable) {
        this.EndFunctionEnable = EndFunctionEnable;
    }

    /**
     * Get <p>EndFunctionEnable为true时生效；call_end function calling的desc，默认为 &quot;End the call when user has to leave (like says bye) or you are instructed to do so.&quot;</p> 
     * @return EndFunctionDesc <p>EndFunctionEnable为true时生效；call_end function calling的desc，默认为 &quot;End the call when user has to leave (like says bye) or you are instructed to do so.&quot;</p>
     */
    public String getEndFunctionDesc() {
        return this.EndFunctionDesc;
    }

    /**
     * Set <p>EndFunctionEnable为true时生效；call_end function calling的desc，默认为 &quot;End the call when user has to leave (like says bye) or you are instructed to do so.&quot;</p>
     * @param EndFunctionDesc <p>EndFunctionEnable为true时生效；call_end function calling的desc，默认为 &quot;End the call when user has to leave (like says bye) or you are instructed to do so.&quot;</p>
     */
    public void setEndFunctionDesc(String EndFunctionDesc) {
        this.EndFunctionDesc = EndFunctionDesc;
    }

    /**
     * Get <p>模型是否支持(或者开启)transfer_to_human function calling</p> 
     * @return TransferFunctionEnable <p>模型是否支持(或者开启)transfer_to_human function calling</p>
     */
    public Boolean getTransferFunctionEnable() {
        return this.TransferFunctionEnable;
    }

    /**
     * Set <p>模型是否支持(或者开启)transfer_to_human function calling</p>
     * @param TransferFunctionEnable <p>模型是否支持(或者开启)transfer_to_human function calling</p>
     */
    public void setTransferFunctionEnable(Boolean TransferFunctionEnable) {
        this.TransferFunctionEnable = TransferFunctionEnable;
    }

    /**
     * Get <p>TransferFunctionEnable为true的时候生效: 转人工配置</p> 
     * @return TransferItems <p>TransferFunctionEnable为true的时候生效: 转人工配置</p>
     */
    public AITransferItem [] getTransferItems() {
        return this.TransferItems;
    }

    /**
     * Set <p>TransferFunctionEnable为true的时候生效: 转人工配置</p>
     * @param TransferItems <p>TransferFunctionEnable为true的时候生效: 转人工配置</p>
     */
    public void setTransferItems(AITransferItem [] TransferItems) {
        this.TransferItems = TransferItems;
    }

    /**
     * Get <p>模型是否支持(或者开启)转智能体function calling</p> 
     * @return TransferToAgentEnable <p>模型是否支持(或者开启)转智能体function calling</p>
     */
    public Boolean getTransferToAgentEnable() {
        return this.TransferToAgentEnable;
    }

    /**
     * Set <p>模型是否支持(或者开启)转智能体function calling</p>
     * @param TransferToAgentEnable <p>模型是否支持(或者开启)转智能体function calling</p>
     */
    public void setTransferToAgentEnable(Boolean TransferToAgentEnable) {
        this.TransferToAgentEnable = TransferToAgentEnable;
    }

    /**
     * Get <p>TransferToAgentEnable为true的时候生效: 转智能体配置</p> 
     * @return TransferToAgentItems <p>TransferToAgentEnable为true的时候生效: 转智能体配置</p>
     */
    public TransferToAgentItem [] getTransferToAgentItems() {
        return this.TransferToAgentItems;
    }

    /**
     * Set <p>TransferToAgentEnable为true的时候生效: 转智能体配置</p>
     * @param TransferToAgentItems <p>TransferToAgentEnable为true的时候生效: 转智能体配置</p>
     */
    public void setTransferToAgentItems(TransferToAgentItem [] TransferToAgentItems) {
        this.TransferToAgentItems = TransferToAgentItems;
    }

    /**
     * Get <p>用户多久没说话提示时长,最小10秒,默认10秒</p> 
     * @return NotifyDuration <p>用户多久没说话提示时长,最小10秒,默认10秒</p>
     */
    public Long getNotifyDuration() {
        return this.NotifyDuration;
    }

    /**
     * Set <p>用户多久没说话提示时长,最小10秒,默认10秒</p>
     * @param NotifyDuration <p>用户多久没说话提示时长,最小10秒,默认10秒</p>
     */
    public void setNotifyDuration(Long NotifyDuration) {
        this.NotifyDuration = NotifyDuration;
    }

    /**
     * Get <p>用户NotifyDuration没说话，AI提示的语句，默认是&quot;抱歉，我没听清。您可以重复下吗？&quot;</p> 
     * @return NotifyMessage <p>用户NotifyDuration没说话，AI提示的语句，默认是&quot;抱歉，我没听清。您可以重复下吗？&quot;</p>
     */
    public String getNotifyMessage() {
        return this.NotifyMessage;
    }

    /**
     * Set <p>用户NotifyDuration没说话，AI提示的语句，默认是&quot;抱歉，我没听清。您可以重复下吗？&quot;</p>
     * @param NotifyMessage <p>用户NotifyDuration没说话，AI提示的语句，默认是&quot;抱歉，我没听清。您可以重复下吗？&quot;</p>
     */
    public void setNotifyMessage(String NotifyMessage) {
        this.NotifyMessage = NotifyMessage;
    }

    /**
     * Get <p>最大触发AI提示音次数，默认为不限制</p> 
     * @return NotifyMaxCount <p>最大触发AI提示音次数，默认为不限制</p>
     */
    public Long getNotifyMaxCount() {
        return this.NotifyMaxCount;
    }

    /**
     * Set <p>最大触发AI提示音次数，默认为不限制</p>
     * @param NotifyMaxCount <p>最大触发AI提示音次数，默认为不限制</p>
     */
    public void setNotifyMaxCount(Long NotifyMaxCount) {
        this.NotifyMaxCount = NotifyMaxCount;
    }

    /**
     * Get <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p><ul><li>Tencent TTS<br>配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中     u2003 "AppId": "您的应用ID", // String 必填     u2003 "SecretId": "您的密钥ID", // String 必填     u2003 "SecretKey":  "您的密钥Key", // String 必填     u2003 "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。     u2003 "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换     u2003 "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。     u2003 "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数  u2003}</code></pre> </div><ul><li>Minimax TTS<br>配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank"> Minimax TTS 文档链接</a>。注意 Minimax TTS 存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "minimax",  // String TTS类型,         "Model": "speech-01-turbo",        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",        "APIKey": "eyxxxx",        "GroupId": "181000000000000",        "VoiceType":"female-tianmei",        "Speed": 1.2}</code></pre></div><ul><li>火山 TTS</li></ul><p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>语音合成音色列表–语音技术-火山引擎<br>大模型语音合成音色列表–语音技术-火山引擎</p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "volcengine",  // 必填：String TTS类型    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token    "Speed" : 1.0,            // 可选参数 语速，默认为1.0    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。}</code></pre></div><ul><li>Azure TTS<br>配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "azure", // 必填：String TTS类型    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key    "Region": "chinanorth3",  // 必填：String 订阅的地区    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填    "Language": "zh-CN", // 必填：String 合成的语言      "Rate": 1 // 选填：float 语速  0.5～2 默认为 1}</code></pre></div><ul><li>自定义TTS</li></ul><p>具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{  "TTSType": "custom", // String 必填  "APIKey": "ApiKey", // String 必填 用来鉴权  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  }</code></pre></div> 
     * @return CustomTTSConfig <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p><ul><li>Tencent TTS<br>配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中     u2003 "AppId": "您的应用ID", // String 必填     u2003 "SecretId": "您的密钥ID", // String 必填     u2003 "SecretKey":  "您的密钥Key", // String 必填     u2003 "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。     u2003 "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换     u2003 "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。     u2003 "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数  u2003}</code></pre> </div><ul><li>Minimax TTS<br>配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank"> Minimax TTS 文档链接</a>。注意 Minimax TTS 存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "minimax",  // String TTS类型,         "Model": "speech-01-turbo",        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",        "APIKey": "eyxxxx",        "GroupId": "181000000000000",        "VoiceType":"female-tianmei",        "Speed": 1.2}</code></pre></div><ul><li>火山 TTS</li></ul><p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>语音合成音色列表–语音技术-火山引擎<br>大模型语音合成音色列表–语音技术-火山引擎</p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "volcengine",  // 必填：String TTS类型    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token    "Speed" : 1.0,            // 可选参数 语速，默认为1.0    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。}</code></pre></div><ul><li>Azure TTS<br>配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "azure", // 必填：String TTS类型    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key    "Region": "chinanorth3",  // 必填：String 订阅的地区    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填    "Language": "zh-CN", // 必填：String 合成的语言      "Rate": 1 // 选填：float 语速  0.5～2 默认为 1}</code></pre></div><ul><li>自定义TTS</li></ul><p>具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{  "TTSType": "custom", // String 必填  "APIKey": "ApiKey", // String 必填 用来鉴权  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  }</code></pre></div>
     */
    public String getCustomTTSConfig() {
        return this.CustomTTSConfig;
    }

    /**
     * Set <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p><ul><li>Tencent TTS<br>配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中     u2003 "AppId": "您的应用ID", // String 必填     u2003 "SecretId": "您的密钥ID", // String 必填     u2003 "SecretKey":  "您的密钥Key", // String 必填     u2003 "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。     u2003 "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换     u2003 "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。     u2003 "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数  u2003}</code></pre> </div><ul><li>Minimax TTS<br>配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank"> Minimax TTS 文档链接</a>。注意 Minimax TTS 存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "minimax",  // String TTS类型,         "Model": "speech-01-turbo",        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",        "APIKey": "eyxxxx",        "GroupId": "181000000000000",        "VoiceType":"female-tianmei",        "Speed": 1.2}</code></pre></div><ul><li>火山 TTS</li></ul><p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>语音合成音色列表–语音技术-火山引擎<br>大模型语音合成音色列表–语音技术-火山引擎</p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "volcengine",  // 必填：String TTS类型    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token    "Speed" : 1.0,            // 可选参数 语速，默认为1.0    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。}</code></pre></div><ul><li>Azure TTS<br>配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "azure", // 必填：String TTS类型    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key    "Region": "chinanorth3",  // 必填：String 订阅的地区    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填    "Language": "zh-CN", // 必填：String 合成的语言      "Rate": 1 // 选填：float 语速  0.5～2 默认为 1}</code></pre></div><ul><li>自定义TTS</li></ul><p>具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{  "TTSType": "custom", // String 必填  "APIKey": "ApiKey", // String 必填 用来鉴权  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  }</code></pre></div>
     * @param CustomTTSConfig <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p><ul><li>Tencent TTS<br>配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中     u2003 "AppId": "您的应用ID", // String 必填     u2003 "SecretId": "您的密钥ID", // String 必填     u2003 "SecretKey":  "您的密钥Key", // String 必填     u2003 "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。     u2003 "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换     u2003 "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。     u2003 "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数  u2003}</code></pre> </div><ul><li>Minimax TTS<br>配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank"> Minimax TTS 文档链接</a>。注意 Minimax TTS 存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{        "TTSType": "minimax",  // String TTS类型,         "Model": "speech-01-turbo",        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",        "APIKey": "eyxxxx",        "GroupId": "181000000000000",        "VoiceType":"female-tianmei",        "Speed": 1.2}</code></pre></div><ul><li>火山 TTS</li></ul><p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>语音合成音色列表–语音技术-火山引擎<br>大模型语音合成音色列表–语音技术-火山引擎</p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "volcengine",  // 必填：String TTS类型    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token    "Speed" : 1.0,            // 可选参数 语速，默认为1.0    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。}</code></pre></div><ul><li>Azure TTS<br>配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li></ul><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{    "TTSType": "azure", // 必填：String TTS类型    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key    "Region": "chinanorth3",  // 必填：String 订阅的地区    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填    "Language": "zh-CN", // 必填：String 合成的语言      "Rate": 1 // 选填：float 语速  0.5～2 默认为 1}</code></pre></div><ul><li>自定义TTS</li></ul><p>具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{  "TTSType": "custom", // String 必填  "APIKey": "ApiKey", // String 必填 用来鉴权  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  }</code></pre></div>
     */
    public void setCustomTTSConfig(String CustomTTSConfig) {
        this.CustomTTSConfig = CustomTTSConfig;
    }

    /**
     * Get <p>提示词变量</p> 
     * @return PromptVariables <p>提示词变量</p>
     * @deprecated
     */
    @Deprecated
    public Variable [] getPromptVariables() {
        return this.PromptVariables;
    }

    /**
     * Set <p>提示词变量</p>
     * @param PromptVariables <p>提示词变量</p>
     * @deprecated
     */
    @Deprecated
    public void setPromptVariables(Variable [] PromptVariables) {
        this.PromptVariables = PromptVariables;
    }

    /**
     * Get <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p> 
     * @return VadSilenceTime <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
     */
    public Long getVadSilenceTime() {
        return this.VadSilenceTime;
    }

    /**
     * Set <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
     * @param VadSilenceTime <p>语音识别vad的时间，范围为240-2000，默认为1000，单位为ms。更小的值会让语音识别分句更快。</p>
     */
    public void setVadSilenceTime(Long VadSilenceTime) {
        this.VadSilenceTime = VadSilenceTime;
    }

    /**
     * Get <p>通话内容提取配置</p> 
     * @return ExtractConfig <p>通话内容提取配置</p>
     */
    public AICallExtractConfigElement [] getExtractConfig() {
        return this.ExtractConfig;
    }

    /**
     * Set <p>通话内容提取配置</p>
     * @param ExtractConfig <p>通话内容提取配置</p>
     */
    public void setExtractConfig(AICallExtractConfigElement [] ExtractConfig) {
        this.ExtractConfig = ExtractConfig;
    }

    /**
     * Get <p>模型温度控制</p> 
     * @return Temperature <p>模型温度控制</p>
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set <p>模型温度控制</p>
     * @param Temperature <p>模型温度控制</p>
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol> 
     * @return Variables <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
     */
    public Variable [] getVariables() {
        return this.Variables;
    }

    /**
     * Set <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
     * @param Variables <p>通用变量： <p>提示词变量</p> <p>欢迎语变量</p> <p> 欢迎语延迟播放(秒级)：welcome-message-delay</p>  <p> dify变量</p>  </p><ol><li>dify-inputs-xxx 为dify的inputs变量</li><li>dify-inputs-user 为dify的user值</li><li>dify-inputs-conversation_id 为dify的conversation_id值</li></ol>
     */
    public void setVariables(Variable [] Variables) {
        this.Variables = Variables;
    }

    /**
     * Get <p>模型topP</p> 
     * @return TopP <p>模型topP</p>
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set <p>模型topP</p>
     * @param TopP <p>模型topP</p>
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。</p> 
     * @return VadLevel <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。</p>
     */
    public Long getVadLevel() {
        return this.VadLevel;
    }

    /**
     * Set <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。</p>
     * @param VadLevel <p>vad的远场人声抑制能力（不会对asr识别效果造成影响），范围为[0, 3]，默认为0。推荐设置为2，有较好的远场人声抑制能力。</p>
     */
    public void setVadLevel(Long VadLevel) {
        this.VadLevel = VadLevel;
    }

    /**
     * Get <p>衔接语</p> 
     * @return ToneWord <p>衔接语</p>
     */
    public ToneWordInfo getToneWord() {
        return this.ToneWord;
    }

    /**
     * Set <p>衔接语</p>
     * @param ToneWord <p>衔接语</p>
     */
    public void setToneWord(ToneWordInfo ToneWord) {
        this.ToneWord = ToneWord;
    }

    /**
     * Get <p>合规提示音，<br>该参数传true（默认）表示通话开始播放摩斯码，提示对话内容为 AI 生成。<br>该参数传false表示关闭合规提示音。该参数传false则代表您知晓并同意以下协议：<br>我方充分知悉和理解，根据<a href="https://www.cac.gov.cn/2016-11/07/c_1119867116.htm">《网络安全法》</a><a href="https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm">《互联网信息服务深度合成管理规定》</a><a href="https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm">《生成式人工智能服务管理暂行办法》</a><a href="https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm">《人工智能生成合成内容标识办法》</a>的法律法规的规定，对人工智能生成合成内容应当添加显式标识和隐式标识。我方基于业务需求，请腾讯云对生成合成内容不添加显式标识，我方承诺合法合规使用生成合成内容，避免造成混淆、误认；如果使用生成合成内容对公众提供服务的，或通过网络传播的，我方将自觉主动添加符合法律规定和国家标准要求的显式标识，承担人工智能生成合成内容标识的法律义务。我方未能恰当、合理地履行人工智能内容标识义务造成不良后果的，或遭受主管部门责罚的，相关责任由我方完全承担。</p> 
     * @return EnableComplianceAudio <p>合规提示音，<br>该参数传true（默认）表示通话开始播放摩斯码，提示对话内容为 AI 生成。<br>该参数传false表示关闭合规提示音。该参数传false则代表您知晓并同意以下协议：<br>我方充分知悉和理解，根据<a href="https://www.cac.gov.cn/2016-11/07/c_1119867116.htm">《网络安全法》</a><a href="https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm">《互联网信息服务深度合成管理规定》</a><a href="https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm">《生成式人工智能服务管理暂行办法》</a><a href="https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm">《人工智能生成合成内容标识办法》</a>的法律法规的规定，对人工智能生成合成内容应当添加显式标识和隐式标识。我方基于业务需求，请腾讯云对生成合成内容不添加显式标识，我方承诺合法合规使用生成合成内容，避免造成混淆、误认；如果使用生成合成内容对公众提供服务的，或通过网络传播的，我方将自觉主动添加符合法律规定和国家标准要求的显式标识，承担人工智能生成合成内容标识的法律义务。我方未能恰当、合理地履行人工智能内容标识义务造成不良后果的，或遭受主管部门责罚的，相关责任由我方完全承担。</p>
     */
    public Boolean getEnableComplianceAudio() {
        return this.EnableComplianceAudio;
    }

    /**
     * Set <p>合规提示音，<br>该参数传true（默认）表示通话开始播放摩斯码，提示对话内容为 AI 生成。<br>该参数传false表示关闭合规提示音。该参数传false则代表您知晓并同意以下协议：<br>我方充分知悉和理解，根据<a href="https://www.cac.gov.cn/2016-11/07/c_1119867116.htm">《网络安全法》</a><a href="https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm">《互联网信息服务深度合成管理规定》</a><a href="https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm">《生成式人工智能服务管理暂行办法》</a><a href="https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm">《人工智能生成合成内容标识办法》</a>的法律法规的规定，对人工智能生成合成内容应当添加显式标识和隐式标识。我方基于业务需求，请腾讯云对生成合成内容不添加显式标识，我方承诺合法合规使用生成合成内容，避免造成混淆、误认；如果使用生成合成内容对公众提供服务的，或通过网络传播的，我方将自觉主动添加符合法律规定和国家标准要求的显式标识，承担人工智能生成合成内容标识的法律义务。我方未能恰当、合理地履行人工智能内容标识义务造成不良后果的，或遭受主管部门责罚的，相关责任由我方完全承担。</p>
     * @param EnableComplianceAudio <p>合规提示音，<br>该参数传true（默认）表示通话开始播放摩斯码，提示对话内容为 AI 生成。<br>该参数传false表示关闭合规提示音。该参数传false则代表您知晓并同意以下协议：<br>我方充分知悉和理解，根据<a href="https://www.cac.gov.cn/2016-11/07/c_1119867116.htm">《网络安全法》</a><a href="https://www.gov.cn/zhengce/zhengceku/2022-12/12/content_5731431.htm">《互联网信息服务深度合成管理规定》</a><a href="https://www.gov.cn/zhengce/zhengceku/202307/content_6891752.htm">《生成式人工智能服务管理暂行办法》</a><a href="https://www.gov.cn/zhengce/zhengceku/202503/content_7014286.htm">《人工智能生成合成内容标识办法》</a>的法律法规的规定，对人工智能生成合成内容应当添加显式标识和隐式标识。我方基于业务需求，请腾讯云对生成合成内容不添加显式标识，我方承诺合法合规使用生成合成内容，避免造成混淆、误认；如果使用生成合成内容对公众提供服务的，或通过网络传播的，我方将自觉主动添加符合法律规定和国家标准要求的显式标识，承担人工智能生成合成内容标识的法律义务。我方未能恰当、合理地履行人工智能内容标识义务造成不良后果的，或遭受主管部门责罚的，相关责任由我方完全承担。</p>
     */
    public void setEnableComplianceAudio(Boolean EnableComplianceAudio) {
        this.EnableComplianceAudio = EnableComplianceAudio;
    }

    /**
     * Get <p>是否开启语音信箱识别</p> 
     * @return EnableVoicemailDetection <p>是否开启语音信箱识别</p>
     */
    public Boolean getEnableVoicemailDetection() {
        return this.EnableVoicemailDetection;
    }

    /**
     * Set <p>是否开启语音信箱识别</p>
     * @param EnableVoicemailDetection <p>是否开启语音信箱识别</p>
     */
    public void setEnableVoicemailDetection(Boolean EnableVoicemailDetection) {
        this.EnableVoicemailDetection = EnableVoicemailDetection;
    }

    /**
     * Get <p>识别到对端为语音信箱时的行为，当EnableVoicemailDetection为True时生效<br>0: 挂断电话（默认）</p> 
     * @return VoicemailAction <p>识别到对端为语音信箱时的行为，当EnableVoicemailDetection为True时生效<br>0: 挂断电话（默认）</p>
     */
    public Long getVoicemailAction() {
        return this.VoicemailAction;
    }

    /**
     * Set <p>识别到对端为语音信箱时的行为，当EnableVoicemailDetection为True时生效<br>0: 挂断电话（默认）</p>
     * @param VoicemailAction <p>识别到对端为语音信箱时的行为，当EnableVoicemailDetection为True时生效<br>0: 挂断电话（默认）</p>
     */
    public void setVoicemailAction(Long VoicemailAction) {
        this.VoicemailAction = VoicemailAction;
    }

    /**
     * Get <p>大模型拓展参数， 格式为json字符串</p> 
     * @return LLMExtraBody <p>大模型拓展参数， 格式为json字符串</p>
     */
    public String getLLMExtraBody() {
        return this.LLMExtraBody;
    }

    /**
     * Set <p>大模型拓展参数， 格式为json字符串</p>
     * @param LLMExtraBody <p>大模型拓展参数， 格式为json字符串</p>
     */
    public void setLLMExtraBody(String LLMExtraBody) {
        this.LLMExtraBody = LLMExtraBody;
    }

    /**
     * Get <p>最大通话时长， 默认不限制。单位毫秒(ms)</p> 
     * @return MaxCallDurationMs <p>最大通话时长， 默认不限制。单位毫秒(ms)</p>
     */
    public Long getMaxCallDurationMs() {
        return this.MaxCallDurationMs;
    }

    /**
     * Set <p>最大通话时长， 默认不限制。单位毫秒(ms)</p>
     * @param MaxCallDurationMs <p>最大通话时长， 默认不限制。单位毫秒(ms)</p>
     */
    public void setMaxCallDurationMs(Long MaxCallDurationMs) {
        this.MaxCallDurationMs = MaxCallDurationMs;
    }

    /**
     * Get <p>最大振铃时长，达到时长阈值自动挂断。 <strong>仅自携号码支持当前参数</strong></p> 
     * @return MaxRingTimeoutSecond <p>最大振铃时长，达到时长阈值自动挂断。 <strong>仅自携号码支持当前参数</strong></p>
     */
    public Long getMaxRingTimeoutSecond() {
        return this.MaxRingTimeoutSecond;
    }

    /**
     * Set <p>最大振铃时长，达到时长阈值自动挂断。 <strong>仅自携号码支持当前参数</strong></p>
     * @param MaxRingTimeoutSecond <p>最大振铃时长，达到时长阈值自动挂断。 <strong>仅自携号码支持当前参数</strong></p>
     */
    public void setMaxRingTimeoutSecond(Long MaxRingTimeoutSecond) {
        this.MaxRingTimeoutSecond = MaxRingTimeoutSecond;
    }

    /**
     * Get <p>环境音场景，没有的话不填。<br>coffee_shops：咖啡店氛围，背景中有人聊天<br>busy_office：客服中心</p> 
     * @return AmbientSoundType <p>环境音场景，没有的话不填。<br>coffee_shops：咖啡店氛围，背景中有人聊天<br>busy_office：客服中心</p>
     */
    public String getAmbientSoundType() {
        return this.AmbientSoundType;
    }

    /**
     * Set <p>环境音场景，没有的话不填。<br>coffee_shops：咖啡店氛围，背景中有人聊天<br>busy_office：客服中心</p>
     * @param AmbientSoundType <p>环境音场景，没有的话不填。<br>coffee_shops：咖啡店氛围，背景中有人聊天<br>busy_office：客服中心</p>
     */
    public void setAmbientSoundType(String AmbientSoundType) {
        this.AmbientSoundType = AmbientSoundType;
    }

    /**
     * Get <p>环境音音量。如果AmbientSoundType 为空，该字段不填。取值的范围是 [0,2]。值越低，环境音越小；值越高，环境音越响亮。如果未设置，则使用默认值 1。</p> 
     * @return AmbientSoundVolume <p>环境音音量。如果AmbientSoundType 为空，该字段不填。取值的范围是 [0,2]。值越低，环境音越小；值越高，环境音越响亮。如果未设置，则使用默认值 1。</p>
     */
    public Float getAmbientSoundVolume() {
        return this.AmbientSoundVolume;
    }

    /**
     * Set <p>环境音音量。如果AmbientSoundType 为空，该字段不填。取值的范围是 [0,2]。值越低，环境音越小；值越高，环境音越响亮。如果未设置，则使用默认值 1。</p>
     * @param AmbientSoundVolume <p>环境音音量。如果AmbientSoundType 为空，该字段不填。取值的范围是 [0,2]。值越低，环境音越小；值越高，环境音越响亮。如果未设置，则使用默认值 1。</p>
     */
    public void setAmbientSoundVolume(Float AmbientSoundVolume) {
        this.AmbientSoundVolume = AmbientSoundVolume;
    }

    /**
     * Get <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p> 
     * @return AcquireTimeoutSecond <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
     */
    public Long getAcquireTimeoutSecond() {
        return this.AcquireTimeoutSecond;
    }

    /**
     * Set <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
     * @param AcquireTimeoutSecond <p>智能体并发不足时，排队等待超时时间，单位秒</p><p>取值范围：[0, 5]</p><p>默认值：5</p>
     */
    public void setAcquireTimeoutSecond(Long AcquireTimeoutSecond) {
        this.AcquireTimeoutSecond = AcquireTimeoutSecond;
    }

    /**
     * Get <p>自定义STT配置，请联系产品/开发后使用</p> 
     * @return CustomSTTConfig <p>自定义STT配置，请联系产品/开发后使用</p>
     */
    public String getCustomSTTConfig() {
        return this.CustomSTTConfig;
    }

    /**
     * Set <p>自定义STT配置，请联系产品/开发后使用</p>
     * @param CustomSTTConfig <p>自定义STT配置，请联系产品/开发后使用</p>
     */
    public void setCustomSTTConfig(String CustomSTTConfig) {
        this.CustomSTTConfig = CustomSTTConfig;
    }

    public CreateAICallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAICallRequest(CreateAICallRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.APIUrl != null) {
            this.APIUrl = new String(source.APIUrl);
        }
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
        if (source.WelcomeType != null) {
            this.WelcomeType = new Long(source.WelcomeType);
        }
        if (source.WelcomeMessagePriority != null) {
            this.WelcomeMessagePriority = new Long(source.WelcomeMessagePriority);
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.InterruptMode != null) {
            this.InterruptMode = new Long(source.InterruptMode);
        }
        if (source.InterruptSpeechDuration != null) {
            this.InterruptSpeechDuration = new Long(source.InterruptSpeechDuration);
        }
        if (source.EndFunctionEnable != null) {
            this.EndFunctionEnable = new Boolean(source.EndFunctionEnable);
        }
        if (source.EndFunctionDesc != null) {
            this.EndFunctionDesc = new String(source.EndFunctionDesc);
        }
        if (source.TransferFunctionEnable != null) {
            this.TransferFunctionEnable = new Boolean(source.TransferFunctionEnable);
        }
        if (source.TransferItems != null) {
            this.TransferItems = new AITransferItem[source.TransferItems.length];
            for (int i = 0; i < source.TransferItems.length; i++) {
                this.TransferItems[i] = new AITransferItem(source.TransferItems[i]);
            }
        }
        if (source.TransferToAgentEnable != null) {
            this.TransferToAgentEnable = new Boolean(source.TransferToAgentEnable);
        }
        if (source.TransferToAgentItems != null) {
            this.TransferToAgentItems = new TransferToAgentItem[source.TransferToAgentItems.length];
            for (int i = 0; i < source.TransferToAgentItems.length; i++) {
                this.TransferToAgentItems[i] = new TransferToAgentItem(source.TransferToAgentItems[i]);
            }
        }
        if (source.NotifyDuration != null) {
            this.NotifyDuration = new Long(source.NotifyDuration);
        }
        if (source.NotifyMessage != null) {
            this.NotifyMessage = new String(source.NotifyMessage);
        }
        if (source.NotifyMaxCount != null) {
            this.NotifyMaxCount = new Long(source.NotifyMaxCount);
        }
        if (source.CustomTTSConfig != null) {
            this.CustomTTSConfig = new String(source.CustomTTSConfig);
        }
        if (source.PromptVariables != null) {
            this.PromptVariables = new Variable[source.PromptVariables.length];
            for (int i = 0; i < source.PromptVariables.length; i++) {
                this.PromptVariables[i] = new Variable(source.PromptVariables[i]);
            }
        }
        if (source.VadSilenceTime != null) {
            this.VadSilenceTime = new Long(source.VadSilenceTime);
        }
        if (source.ExtractConfig != null) {
            this.ExtractConfig = new AICallExtractConfigElement[source.ExtractConfig.length];
            for (int i = 0; i < source.ExtractConfig.length; i++) {
                this.ExtractConfig[i] = new AICallExtractConfigElement(source.ExtractConfig[i]);
            }
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.Variables != null) {
            this.Variables = new Variable[source.Variables.length];
            for (int i = 0; i < source.Variables.length; i++) {
                this.Variables[i] = new Variable(source.Variables[i]);
            }
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.VadLevel != null) {
            this.VadLevel = new Long(source.VadLevel);
        }
        if (source.ToneWord != null) {
            this.ToneWord = new ToneWordInfo(source.ToneWord);
        }
        if (source.EnableComplianceAudio != null) {
            this.EnableComplianceAudio = new Boolean(source.EnableComplianceAudio);
        }
        if (source.EnableVoicemailDetection != null) {
            this.EnableVoicemailDetection = new Boolean(source.EnableVoicemailDetection);
        }
        if (source.VoicemailAction != null) {
            this.VoicemailAction = new Long(source.VoicemailAction);
        }
        if (source.LLMExtraBody != null) {
            this.LLMExtraBody = new String(source.LLMExtraBody);
        }
        if (source.MaxCallDurationMs != null) {
            this.MaxCallDurationMs = new Long(source.MaxCallDurationMs);
        }
        if (source.MaxRingTimeoutSecond != null) {
            this.MaxRingTimeoutSecond = new Long(source.MaxRingTimeoutSecond);
        }
        if (source.AmbientSoundType != null) {
            this.AmbientSoundType = new String(source.AmbientSoundType);
        }
        if (source.AmbientSoundVolume != null) {
            this.AmbientSoundVolume = new Float(source.AmbientSoundVolume);
        }
        if (source.AcquireTimeoutSecond != null) {
            this.AcquireTimeoutSecond = new Long(source.AcquireTimeoutSecond);
        }
        if (source.CustomSTTConfig != null) {
            this.CustomSTTConfig = new String(source.CustomSTTConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "APIUrl", this.APIUrl);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "WelcomeType", this.WelcomeType);
        this.setParamSimple(map, prefix + "WelcomeMessagePriority", this.WelcomeMessagePriority);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "EndFunctionEnable", this.EndFunctionEnable);
        this.setParamSimple(map, prefix + "EndFunctionDesc", this.EndFunctionDesc);
        this.setParamSimple(map, prefix + "TransferFunctionEnable", this.TransferFunctionEnable);
        this.setParamArrayObj(map, prefix + "TransferItems.", this.TransferItems);
        this.setParamSimple(map, prefix + "TransferToAgentEnable", this.TransferToAgentEnable);
        this.setParamArrayObj(map, prefix + "TransferToAgentItems.", this.TransferToAgentItems);
        this.setParamSimple(map, prefix + "NotifyDuration", this.NotifyDuration);
        this.setParamSimple(map, prefix + "NotifyMessage", this.NotifyMessage);
        this.setParamSimple(map, prefix + "NotifyMaxCount", this.NotifyMaxCount);
        this.setParamSimple(map, prefix + "CustomTTSConfig", this.CustomTTSConfig);
        this.setParamArrayObj(map, prefix + "PromptVariables.", this.PromptVariables);
        this.setParamSimple(map, prefix + "VadSilenceTime", this.VadSilenceTime);
        this.setParamArrayObj(map, prefix + "ExtractConfig.", this.ExtractConfig);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamArrayObj(map, prefix + "Variables.", this.Variables);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "VadLevel", this.VadLevel);
        this.setParamObj(map, prefix + "ToneWord.", this.ToneWord);
        this.setParamSimple(map, prefix + "EnableComplianceAudio", this.EnableComplianceAudio);
        this.setParamSimple(map, prefix + "EnableVoicemailDetection", this.EnableVoicemailDetection);
        this.setParamSimple(map, prefix + "VoicemailAction", this.VoicemailAction);
        this.setParamSimple(map, prefix + "LLMExtraBody", this.LLMExtraBody);
        this.setParamSimple(map, prefix + "MaxCallDurationMs", this.MaxCallDurationMs);
        this.setParamSimple(map, prefix + "MaxRingTimeoutSecond", this.MaxRingTimeoutSecond);
        this.setParamSimple(map, prefix + "AmbientSoundType", this.AmbientSoundType);
        this.setParamSimple(map, prefix + "AmbientSoundVolume", this.AmbientSoundVolume);
        this.setParamSimple(map, prefix + "AcquireTimeoutSecond", this.AcquireTimeoutSecond);
        this.setParamSimple(map, prefix + "CustomSTTConfig", this.CustomSTTConfig);

    }
}

