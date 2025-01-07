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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAICallRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 被叫号码
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * 模型接口协议类型，目前兼容三种协议类型：

- OpenAI协议(包括GPT、混元、DeepSeek等)："openai"
- Azure协议："azure"
- Minimax协议："minimax"
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * 模型名称，如

- OpenAI协议
"gpt-4o-mini","gpt-4o"，"hunyuan-standard", "hunyuan-turbo"，"deepseek-chat"；

- Azure协议
"gpt-4o-mini", "gpt-4o"；

- Minmax协议
"deepseek-chat".
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 模型API密钥，获取鉴权信息方式请参见各模型官网

- OpenAI协议：[GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key)，[混元](https://cloud.tencent.com/document/product/1729/111008)，[DeepSeek](https://api-docs.deepseek.com/zh-cn/)；

- Azure协议：[Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings)；

- Minimax：[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * 模型接口地址

- OpenAI协议
GPT："https://api.openai.com/v1/"
混元："https://api.hunyuan.cloud.tencent.com/v1"
Deepseek："https://api.deepseek.com/v1"

- Azure协议
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax协议
"https://api.minimax.chat/v1"
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * 默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置

汉语：
ZhiMei：智美，客服女声
ZhiXi： 智希 通用女声
ZhiQi：智琪 客服女声
ZhiTian：智甜 女童声
AiXiaoJing：爱小静 对话女声

英语:
WeRose：英文女声
Monika：英文女声

日语：
Nanami

韩语：
SunHi

印度尼西亚语(印度尼西亚)：
Gadis

马来语（马来西亚）:
Yasmin

 泰米尔语（马来西亚）:
Kani

泰语（泰国）:
Achara

越南语(越南):
HoaiMy


    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * 主叫号码列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 用于设定AI座席欢迎语。
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
    * 0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)
1:   使用ai根据prompt自动生成welcomeMessage并先说话
    */
    @SerializedName("WelcomeType")
    @Expose
    private Long WelcomeType;

    /**
    * 最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * 语音识别支持的语言, 默认是"zh" 中文,
填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，
注意:主要语言为中国方言时，可选语言无效
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：
1. Chinese = "zh" # 中文
2. Chinese_TW = "zh-TW" # 中国台湾
3. Chinese_DIALECT = "zh-dialect" # 中国方言
4. English = "en" # 英语
5. Vietnamese = "vi" # 越南语
6. Japanese = "ja" # 日语
7. Korean = "ko" # 汉语
8. Indonesia = "id" # 印度尼西亚语
9. Thai = "th" # 泰语
10. Portuguese = "pt" # 葡萄牙语
11. Turkish = "tr" # 土耳其语
12. Arabic = "ar" # 阿拉伯语
13. Spanish = "es" # 西班牙语
14. Hindi = "hi" # 印地语
15. French = "fr" # 法语
16. Malay = "ms" # 马来语
17. Filipino = "fil" # 菲律宾语
18. German = "de" # 德语
19. Italian = "it" # 意大利语
20. Russian = "ru" # 俄语
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * 打断AI说话模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
    */
    @SerializedName("InterruptMode")
    @Expose
    private Long InterruptMode;

    /**
    * InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
    */
    @SerializedName("InterruptSpeechDuration")
    @Expose
    private Long InterruptSpeechDuration;

    /**
    * 模型是否支持(或者开启)call_end function calling
    */
    @SerializedName("EndFunctionEnable")
    @Expose
    private Boolean EndFunctionEnable;

    /**
    * EndFunctionEnable为true时生效；call_end function calling的desc，默认为 "End the call when user has to leave (like says bye) or you are instructed to do so."
    */
    @SerializedName("EndFunctionDesc")
    @Expose
    private String EndFunctionDesc;

    /**
    * 模型是否支持(或者开启)transfer_to_human function calling
    */
    @SerializedName("TransferFunctionEnable")
    @Expose
    private Boolean TransferFunctionEnable;

    /**
    * TransferFunctionEnable为true的时候生效: 转人工配置
    */
    @SerializedName("TransferItems")
    @Expose
    private AITransferItem [] TransferItems;

    /**
    * 用户多久没说话提示时长,最小10秒,默认10秒
    */
    @SerializedName("NotifyDuration")
    @Expose
    private Long NotifyDuration;

    /**
    * 用户NotifyDuration没说话，AI提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
    */
    @SerializedName("NotifyMessage")
    @Expose
    private String NotifyMessage;

    /**
    * 最大触发AI提示音次数，默认为不限制
    */
    @SerializedName("NotifyMaxCount")
    @Expose
    private Long NotifyMaxCount;

    /**
    * <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p>
<ul>
<li>Tencent TTS<br>
配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
       &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS类型, 目前支持&quot;tencent&quot; 和 “minixmax”， 其他的厂商支持中
       &quot;AppId&quot;: &quot;您的应用ID&quot;, // String 必填
       &quot;SecretId&quot;: &quot;您的密钥ID&quot;, // String 必填
       &quot;SecretKey&quot;:  &quot;您的密钥Key&quot;, // String 必填
       &quot;VoiceType&quot;: 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       &quot;Speed&quot;: 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       &quot;Volume&quot;: 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       &quot;PrimaryLanguage&quot;: 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       &quot;FastVoiceType&quot;: &quot;xxxx&quot;   //  可选参数， 快速声音复刻的参数 
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS文档链接</a>。注意Minimax TTS存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS类型, 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-jingpin&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>火山 TTS</li>
</ul>
<p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>
语音合成音色列表–语音技术-火山引擎<br>
大模型语音合成音色列表–语音技术-火山引擎</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // 必填：String TTS类型
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // 必填：String 火山引擎分配的Appid
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // 必填： String类型 火山引擎的访问token
    &quot;Speed&quot; : 1.0,            // 可选参数 语速，默认为1.0
    &quot;Volume&quot;: 1.0,            // 可选参数， 音量大小， 默认为1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // 可选参数，业务集群, 默认是 volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // 必填：String TTS类型
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // 必填：String 订阅的Key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // 必填：String 订阅的地区
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // 必填：String 音色名必填
    &quot;Language&quot;: &quot;zh-CN&quot;, // 必填：String 合成的语言  
    &quot;Rate&quot;: 1 // 选填：float 语速  0.5～2 默认为 1
}
</code></pre>

</div></div><ul>
<li>自定义</li>
</ul>
<p>TTS<br>
具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // String 必填
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // String 必填 用来鉴权
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // String，必填，TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  &quot;SampleRate&quot;: 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  &quot;AudioChannel&quot;: 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}
</code></pre>

</div></div>
    */
    @SerializedName("CustomTTSConfig")
    @Expose
    private String CustomTTSConfig;

    /**
    * 提示词变量
    */
    @SerializedName("PromptVariables")
    @Expose
    private Variable [] PromptVariables;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 被叫号码 
     * @return Callee 被叫号码
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码
     * @param Callee 被叫号码
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。 
     * @return SystemPrompt 用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set 用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。
     * @param SystemPrompt 用于设定AI人设、说话规则、任务等的全局提示词。示例：## 人设您是人民医院友善、和蔼的随访医生李医生，正在给患者小明的家长打电话，原因是医院要求小明2024-08-08回院复查手术恢复情况，但小明没有来。您需要按照任务流程对小明家长进行电话随访调查。## 要求简洁回复：使用简练语言，每次最多询问一个问题，不要在一个回复中询问多个问题。富有变化：尽量使表达富有变化，表达机械重复。自然亲切：使用日常语言，尽量显得专业并亲切。提到时间时使用口语表述，如下周三、6月18日。积极主动：尝试引导对话，每个回复通常以问题或下一步建议来结尾。询问清楚：如果对方部分回答了您的问题，或者回答很模糊，请通过追问来确保回答的完整明确。遵循任务：当对方的回答偏离了您的任务时，及时引导对方回到任务中。不要从头开始重复，从偏离的地方继续询问。诚实可靠：对于客户的提问，如果不确定请务必不要编造，礼貌告知对方不清楚。不要捏造患者未提及的症状史、用药史、治疗史。其他注意点：避免提到病情恶化、恢复不理想或疾病名称等使用会使患者感到紧张的表述。不要问患者已经直接或间接回答过的问题，例如患者已经说没有不适症状，那就不要再问手术部位是否有红肿疼痛症状的问题。##任务： 1.自我介绍您是人民医院负责随访的李医生，并说明致电的目的。2.询问被叫方是否是小明家长。 - 如果不是小明家长，请礼貌表达歉意，并使用 call_end 挂断电话。- 如果小明家长没空，请礼貌告诉对方稍后会重新致电，并使用 end_call 挂断电话。3.询问小明出院后水肿情况如何，较出院时是否有变化。- 如果水肿变严重，直接跳转步骤7。4.询问出院后是否给小朋友量过体温，是否出现过发烧情况。- 如果没有量过体温，请礼貌告诉家长出院后三个月内需要每天观察体温。- 如果出现过发烧，请直接跳转步骤7。5.询问出院后是否给小朋友按时服药。- 如果没有按时服药，请友善提醒家长严格按医嘱服用药物，避免影响手术效果。6.询问小朋友在饮食上是否做到低盐低脂，适量吃优质蛋白如鸡蛋、牛奶、瘦肉等。- 如果没有做到，请友善提醒家长低盐低脂和优质蛋白有助小朋友尽快恢复。7.告知家长医生要求6月18日回院复查，但没看到有相关复诊记录。提醒家长尽快前往医院体检复查血化验、尿常规。8.询问家长是否有问题需要咨询，如果没有请礼貌道别并用call_end挂断电话。
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get 模型接口协议类型，目前兼容三种协议类型：

- OpenAI协议(包括GPT、混元、DeepSeek等)："openai"
- Azure协议："azure"
- Minimax协议："minimax" 
     * @return LLMType 模型接口协议类型，目前兼容三种协议类型：

- OpenAI协议(包括GPT、混元、DeepSeek等)："openai"
- Azure协议："azure"
- Minimax协议："minimax"
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set 模型接口协议类型，目前兼容三种协议类型：

- OpenAI协议(包括GPT、混元、DeepSeek等)："openai"
- Azure协议："azure"
- Minimax协议："minimax"
     * @param LLMType 模型接口协议类型，目前兼容三种协议类型：

- OpenAI协议(包括GPT、混元、DeepSeek等)："openai"
- Azure协议："azure"
- Minimax协议："minimax"
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get 模型名称，如

- OpenAI协议
"gpt-4o-mini","gpt-4o"，"hunyuan-standard", "hunyuan-turbo"，"deepseek-chat"；

- Azure协议
"gpt-4o-mini", "gpt-4o"；

- Minmax协议
"deepseek-chat". 
     * @return Model 模型名称，如

- OpenAI协议
"gpt-4o-mini","gpt-4o"，"hunyuan-standard", "hunyuan-turbo"，"deepseek-chat"；

- Azure协议
"gpt-4o-mini", "gpt-4o"；

- Minmax协议
"deepseek-chat".
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称，如

- OpenAI协议
"gpt-4o-mini","gpt-4o"，"hunyuan-standard", "hunyuan-turbo"，"deepseek-chat"；

- Azure协议
"gpt-4o-mini", "gpt-4o"；

- Minmax协议
"deepseek-chat".
     * @param Model 模型名称，如

- OpenAI协议
"gpt-4o-mini","gpt-4o"，"hunyuan-standard", "hunyuan-turbo"，"deepseek-chat"；

- Azure协议
"gpt-4o-mini", "gpt-4o"；

- Minmax协议
"deepseek-chat".
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 模型API密钥，获取鉴权信息方式请参见各模型官网

- OpenAI协议：[GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key)，[混元](https://cloud.tencent.com/document/product/1729/111008)，[DeepSeek](https://api-docs.deepseek.com/zh-cn/)；

- Azure协议：[Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings)；

- Minimax：[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2) 
     * @return APIKey 模型API密钥，获取鉴权信息方式请参见各模型官网

- OpenAI协议：[GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key)，[混元](https://cloud.tencent.com/document/product/1729/111008)，[DeepSeek](https://api-docs.deepseek.com/zh-cn/)；

- Azure协议：[Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings)；

- Minimax：[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set 模型API密钥，获取鉴权信息方式请参见各模型官网

- OpenAI协议：[GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key)，[混元](https://cloud.tencent.com/document/product/1729/111008)，[DeepSeek](https://api-docs.deepseek.com/zh-cn/)；

- Azure协议：[Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings)；

- Minimax：[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     * @param APIKey 模型API密钥，获取鉴权信息方式请参见各模型官网

- OpenAI协议：[GPT](https://help.openai.com/en/articles/4936850-where-do-i-find-my-openai-api-key)，[混元](https://cloud.tencent.com/document/product/1729/111008)，[DeepSeek](https://api-docs.deepseek.com/zh-cn/)；

- Azure协议：[Azure GPT](https://learn.microsoft.com/en-us/azure/ai-services/openai/chatgpt-quickstart?tabs=command-line%2Ctypescript%2Cpython-new&pivots=programming-language-studio#key-settings)；

- Minimax：[Minimax](https://platform.minimaxi.com/document/Fast%20access?key=66701cf51d57f38758d581b2)
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get 模型接口地址

- OpenAI协议
GPT："https://api.openai.com/v1/"
混元："https://api.hunyuan.cloud.tencent.com/v1"
Deepseek："https://api.deepseek.com/v1"

- Azure协议
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax协议
"https://api.minimax.chat/v1" 
     * @return APIUrl 模型接口地址

- OpenAI协议
GPT："https://api.openai.com/v1/"
混元："https://api.hunyuan.cloud.tencent.com/v1"
Deepseek："https://api.deepseek.com/v1"

- Azure协议
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax协议
"https://api.minimax.chat/v1"
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set 模型接口地址

- OpenAI协议
GPT："https://api.openai.com/v1/"
混元："https://api.hunyuan.cloud.tencent.com/v1"
Deepseek："https://api.deepseek.com/v1"

- Azure协议
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax协议
"https://api.minimax.chat/v1"
     * @param APIUrl 模型接口地址

- OpenAI协议
GPT："https://api.openai.com/v1/"
混元："https://api.hunyuan.cloud.tencent.com/v1"
Deepseek："https://api.deepseek.com/v1"

- Azure协议
 "https://{your-resource-name}.openai.azure.com?api-version={api-version}"

- Minimax协议
"https://api.minimax.chat/v1"
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get 默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置

汉语：
ZhiMei：智美，客服女声
ZhiXi： 智希 通用女声
ZhiQi：智琪 客服女声
ZhiTian：智甜 女童声
AiXiaoJing：爱小静 对话女声

英语:
WeRose：英文女声
Monika：英文女声

日语：
Nanami

韩语：
SunHi

印度尼西亚语(印度尼西亚)：
Gadis

马来语（马来西亚）:
Yasmin

 泰米尔语（马来西亚）:
Kani

泰语（泰国）:
Achara

越南语(越南):
HoaiMy

 
     * @return VoiceType 默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置

汉语：
ZhiMei：智美，客服女声
ZhiXi： 智希 通用女声
ZhiQi：智琪 客服女声
ZhiTian：智甜 女童声
AiXiaoJing：爱小静 对话女声

英语:
WeRose：英文女声
Monika：英文女声

日语：
Nanami

韩语：
SunHi

印度尼西亚语(印度尼西亚)：
Gadis

马来语（马来西亚）:
Yasmin

 泰米尔语（马来西亚）:
Kani

泰语（泰国）:
Achara

越南语(越南):
HoaiMy


     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置

汉语：
ZhiMei：智美，客服女声
ZhiXi： 智希 通用女声
ZhiQi：智琪 客服女声
ZhiTian：智甜 女童声
AiXiaoJing：爱小静 对话女声

英语:
WeRose：英文女声
Monika：英文女声

日语：
Nanami

韩语：
SunHi

印度尼西亚语(印度尼西亚)：
Gadis

马来语（马来西亚）:
Yasmin

 泰米尔语（马来西亚）:
Kani

泰语（泰国）:
Achara

越南语(越南):
HoaiMy


     * @param VoiceType 默认提供以下音色参数值可选择，如需自定义音色VoiceType请留空并在参数CustomTTSConfig中配置

汉语：
ZhiMei：智美，客服女声
ZhiXi： 智希 通用女声
ZhiQi：智琪 客服女声
ZhiTian：智甜 女童声
AiXiaoJing：爱小静 对话女声

英语:
WeRose：英文女声
Monika：英文女声

日语：
Nanami

韩语：
SunHi

印度尼西亚语(印度尼西亚)：
Gadis

马来语（马来西亚）:
Yasmin

 泰米尔语（马来西亚）:
Kani

泰语（泰国）:
Achara

越南语(越南):
HoaiMy


     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 主叫号码列表 
     * @return Callers 主叫号码列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码列表
     * @param Callers 主叫号码列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 用于设定AI座席欢迎语。 
     * @return WelcomeMessage 用于设定AI座席欢迎语。
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set 用于设定AI座席欢迎语。
     * @param WelcomeMessage 用于设定AI座席欢迎语。
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    /**
     * Get 0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)
1:   使用ai根据prompt自动生成welcomeMessage并先说话 
     * @return WelcomeType 0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)
1:   使用ai根据prompt自动生成welcomeMessage并先说话
     */
    public Long getWelcomeType() {
        return this.WelcomeType;
    }

    /**
     * Set 0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)
1:   使用ai根据prompt自动生成welcomeMessage并先说话
     * @param WelcomeType 0：使用welcomeMessage(为空时，被叫先说话；不为空时，机器人先说话)
1:   使用ai根据prompt自动生成welcomeMessage并先说话
     */
    public void setWelcomeType(Long WelcomeType) {
        this.WelcomeType = WelcomeType;
    }

    /**
     * Get 最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断 
     * @return MaxDuration 最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set 最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断
     * @param MaxDuration 最大等待时长(毫秒)，默认60秒，超过这个时间用户没说话，自动挂断
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get 语音识别支持的语言, 默认是"zh" 中文,
填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，
注意:主要语言为中国方言时，可选语言无效
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：
1. Chinese = "zh" # 中文
2. Chinese_TW = "zh-TW" # 中国台湾
3. Chinese_DIALECT = "zh-dialect" # 中国方言
4. English = "en" # 英语
5. Vietnamese = "vi" # 越南语
6. Japanese = "ja" # 日语
7. Korean = "ko" # 汉语
8. Indonesia = "id" # 印度尼西亚语
9. Thai = "th" # 泰语
10. Portuguese = "pt" # 葡萄牙语
11. Turkish = "tr" # 土耳其语
12. Arabic = "ar" # 阿拉伯语
13. Spanish = "es" # 西班牙语
14. Hindi = "hi" # 印地语
15. French = "fr" # 法语
16. Malay = "ms" # 马来语
17. Filipino = "fil" # 菲律宾语
18. German = "de" # 德语
19. Italian = "it" # 意大利语
20. Russian = "ru" # 俄语 
     * @return Languages 语音识别支持的语言, 默认是"zh" 中文,
填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，
注意:主要语言为中国方言时，可选语言无效
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：
1. Chinese = "zh" # 中文
2. Chinese_TW = "zh-TW" # 中国台湾
3. Chinese_DIALECT = "zh-dialect" # 中国方言
4. English = "en" # 英语
5. Vietnamese = "vi" # 越南语
6. Japanese = "ja" # 日语
7. Korean = "ko" # 汉语
8. Indonesia = "id" # 印度尼西亚语
9. Thai = "th" # 泰语
10. Portuguese = "pt" # 葡萄牙语
11. Turkish = "tr" # 土耳其语
12. Arabic = "ar" # 阿拉伯语
13. Spanish = "es" # 西班牙语
14. Hindi = "hi" # 印地语
15. French = "fr" # 法语
16. Malay = "ms" # 马来语
17. Filipino = "fil" # 菲律宾语
18. German = "de" # 德语
19. Italian = "it" # 意大利语
20. Russian = "ru" # 俄语
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set 语音识别支持的语言, 默认是"zh" 中文,
填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，
注意:主要语言为中国方言时，可选语言无效
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：
1. Chinese = "zh" # 中文
2. Chinese_TW = "zh-TW" # 中国台湾
3. Chinese_DIALECT = "zh-dialect" # 中国方言
4. English = "en" # 英语
5. Vietnamese = "vi" # 越南语
6. Japanese = "ja" # 日语
7. Korean = "ko" # 汉语
8. Indonesia = "id" # 印度尼西亚语
9. Thai = "th" # 泰语
10. Portuguese = "pt" # 葡萄牙语
11. Turkish = "tr" # 土耳其语
12. Arabic = "ar" # 阿拉伯语
13. Spanish = "es" # 西班牙语
14. Hindi = "hi" # 印地语
15. French = "fr" # 法语
16. Malay = "ms" # 马来语
17. Filipino = "fil" # 菲律宾语
18. German = "de" # 德语
19. Italian = "it" # 意大利语
20. Russian = "ru" # 俄语
     * @param Languages 语音识别支持的语言, 默认是"zh" 中文,
填写数组,最长4个语言，第一个语言为主要识别语言，后面为可选语言，
注意:主要语言为中国方言时，可选语言无效
目前全量支持的语言如下，等号左面是语言英文名，右面是Language字段需要填写的值，该值遵循ISO639：
1. Chinese = "zh" # 中文
2. Chinese_TW = "zh-TW" # 中国台湾
3. Chinese_DIALECT = "zh-dialect" # 中国方言
4. English = "en" # 英语
5. Vietnamese = "vi" # 越南语
6. Japanese = "ja" # 日语
7. Korean = "ko" # 汉语
8. Indonesia = "id" # 印度尼西亚语
9. Thai = "th" # 泰语
10. Portuguese = "pt" # 葡萄牙语
11. Turkish = "tr" # 土耳其语
12. Arabic = "ar" # 阿拉伯语
13. Spanish = "es" # 西班牙语
14. Hindi = "hi" # 印地语
15. French = "fr" # 法语
16. Malay = "ms" # 马来语
17. Filipino = "fil" # 菲律宾语
18. German = "de" # 德语
19. Italian = "it" # 意大利语
20. Russian = "ru" # 俄语
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get 打断AI说话模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断 
     * @return InterruptMode 打断AI说话模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     */
    public Long getInterruptMode() {
        return this.InterruptMode;
    }

    /**
     * Set 打断AI说话模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     * @param InterruptMode 打断AI说话模式，默认为0，0表示服务端自动打断，1表示服务端不打断，由端上发送打断信令进行打断
     */
    public void setInterruptMode(Long InterruptMode) {
        this.InterruptMode = InterruptMode;
    }

    /**
     * Get InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。 
     * @return InterruptSpeechDuration InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
     */
    public Long getInterruptSpeechDuration() {
        return this.InterruptSpeechDuration;
    }

    /**
     * Set InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
     * @param InterruptSpeechDuration InterruptMode为0时使用，单位为毫秒，默认为500ms。表示服务端检测到持续InterruptSpeechDuration毫秒的人声则进行打断。
     */
    public void setInterruptSpeechDuration(Long InterruptSpeechDuration) {
        this.InterruptSpeechDuration = InterruptSpeechDuration;
    }

    /**
     * Get 模型是否支持(或者开启)call_end function calling 
     * @return EndFunctionEnable 模型是否支持(或者开启)call_end function calling
     */
    public Boolean getEndFunctionEnable() {
        return this.EndFunctionEnable;
    }

    /**
     * Set 模型是否支持(或者开启)call_end function calling
     * @param EndFunctionEnable 模型是否支持(或者开启)call_end function calling
     */
    public void setEndFunctionEnable(Boolean EndFunctionEnable) {
        this.EndFunctionEnable = EndFunctionEnable;
    }

    /**
     * Get EndFunctionEnable为true时生效；call_end function calling的desc，默认为 "End the call when user has to leave (like says bye) or you are instructed to do so." 
     * @return EndFunctionDesc EndFunctionEnable为true时生效；call_end function calling的desc，默认为 "End the call when user has to leave (like says bye) or you are instructed to do so."
     */
    public String getEndFunctionDesc() {
        return this.EndFunctionDesc;
    }

    /**
     * Set EndFunctionEnable为true时生效；call_end function calling的desc，默认为 "End the call when user has to leave (like says bye) or you are instructed to do so."
     * @param EndFunctionDesc EndFunctionEnable为true时生效；call_end function calling的desc，默认为 "End the call when user has to leave (like says bye) or you are instructed to do so."
     */
    public void setEndFunctionDesc(String EndFunctionDesc) {
        this.EndFunctionDesc = EndFunctionDesc;
    }

    /**
     * Get 模型是否支持(或者开启)transfer_to_human function calling 
     * @return TransferFunctionEnable 模型是否支持(或者开启)transfer_to_human function calling
     */
    public Boolean getTransferFunctionEnable() {
        return this.TransferFunctionEnable;
    }

    /**
     * Set 模型是否支持(或者开启)transfer_to_human function calling
     * @param TransferFunctionEnable 模型是否支持(或者开启)transfer_to_human function calling
     */
    public void setTransferFunctionEnable(Boolean TransferFunctionEnable) {
        this.TransferFunctionEnable = TransferFunctionEnable;
    }

    /**
     * Get TransferFunctionEnable为true的时候生效: 转人工配置 
     * @return TransferItems TransferFunctionEnable为true的时候生效: 转人工配置
     */
    public AITransferItem [] getTransferItems() {
        return this.TransferItems;
    }

    /**
     * Set TransferFunctionEnable为true的时候生效: 转人工配置
     * @param TransferItems TransferFunctionEnable为true的时候生效: 转人工配置
     */
    public void setTransferItems(AITransferItem [] TransferItems) {
        this.TransferItems = TransferItems;
    }

    /**
     * Get 用户多久没说话提示时长,最小10秒,默认10秒 
     * @return NotifyDuration 用户多久没说话提示时长,最小10秒,默认10秒
     */
    public Long getNotifyDuration() {
        return this.NotifyDuration;
    }

    /**
     * Set 用户多久没说话提示时长,最小10秒,默认10秒
     * @param NotifyDuration 用户多久没说话提示时长,最小10秒,默认10秒
     */
    public void setNotifyDuration(Long NotifyDuration) {
        this.NotifyDuration = NotifyDuration;
    }

    /**
     * Get 用户NotifyDuration没说话，AI提示的语句，默认是"抱歉，我没听清。您可以重复下吗？" 
     * @return NotifyMessage 用户NotifyDuration没说话，AI提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
     */
    public String getNotifyMessage() {
        return this.NotifyMessage;
    }

    /**
     * Set 用户NotifyDuration没说话，AI提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
     * @param NotifyMessage 用户NotifyDuration没说话，AI提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
     */
    public void setNotifyMessage(String NotifyMessage) {
        this.NotifyMessage = NotifyMessage;
    }

    /**
     * Get 最大触发AI提示音次数，默认为不限制 
     * @return NotifyMaxCount 最大触发AI提示音次数，默认为不限制
     */
    public Long getNotifyMaxCount() {
        return this.NotifyMaxCount;
    }

    /**
     * Set 最大触发AI提示音次数，默认为不限制
     * @param NotifyMaxCount 最大触发AI提示音次数，默认为不限制
     */
    public void setNotifyMaxCount(Long NotifyMaxCount) {
        this.NotifyMaxCount = NotifyMaxCount;
    }

    /**
     * Get <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p>
<ul>
<li>Tencent TTS<br>
配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
       &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS类型, 目前支持&quot;tencent&quot; 和 “minixmax”， 其他的厂商支持中
       &quot;AppId&quot;: &quot;您的应用ID&quot;, // String 必填
       &quot;SecretId&quot;: &quot;您的密钥ID&quot;, // String 必填
       &quot;SecretKey&quot;:  &quot;您的密钥Key&quot;, // String 必填
       &quot;VoiceType&quot;: 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       &quot;Speed&quot;: 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       &quot;Volume&quot;: 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       &quot;PrimaryLanguage&quot;: 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       &quot;FastVoiceType&quot;: &quot;xxxx&quot;   //  可选参数， 快速声音复刻的参数 
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS文档链接</a>。注意Minimax TTS存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS类型, 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-jingpin&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>火山 TTS</li>
</ul>
<p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>
语音合成音色列表–语音技术-火山引擎<br>
大模型语音合成音色列表–语音技术-火山引擎</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // 必填：String TTS类型
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // 必填：String 火山引擎分配的Appid
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // 必填： String类型 火山引擎的访问token
    &quot;Speed&quot; : 1.0,            // 可选参数 语速，默认为1.0
    &quot;Volume&quot;: 1.0,            // 可选参数， 音量大小， 默认为1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // 可选参数，业务集群, 默认是 volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // 必填：String TTS类型
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // 必填：String 订阅的Key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // 必填：String 订阅的地区
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // 必填：String 音色名必填
    &quot;Language&quot;: &quot;zh-CN&quot;, // 必填：String 合成的语言  
    &quot;Rate&quot;: 1 // 选填：float 语速  0.5～2 默认为 1
}
</code></pre>

</div></div><ul>
<li>自定义</li>
</ul>
<p>TTS<br>
具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // String 必填
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // String 必填 用来鉴权
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // String，必填，TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  &quot;SampleRate&quot;: 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  &quot;AudioChannel&quot;: 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}
</code></pre>

</div></div> 
     * @return CustomTTSConfig <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p>
<ul>
<li>Tencent TTS<br>
配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
       &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS类型, 目前支持&quot;tencent&quot; 和 “minixmax”， 其他的厂商支持中
       &quot;AppId&quot;: &quot;您的应用ID&quot;, // String 必填
       &quot;SecretId&quot;: &quot;您的密钥ID&quot;, // String 必填
       &quot;SecretKey&quot;:  &quot;您的密钥Key&quot;, // String 必填
       &quot;VoiceType&quot;: 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       &quot;Speed&quot;: 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       &quot;Volume&quot;: 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       &quot;PrimaryLanguage&quot;: 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       &quot;FastVoiceType&quot;: &quot;xxxx&quot;   //  可选参数， 快速声音复刻的参数 
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS文档链接</a>。注意Minimax TTS存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS类型, 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-jingpin&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>火山 TTS</li>
</ul>
<p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>
语音合成音色列表–语音技术-火山引擎<br>
大模型语音合成音色列表–语音技术-火山引擎</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // 必填：String TTS类型
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // 必填：String 火山引擎分配的Appid
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // 必填： String类型 火山引擎的访问token
    &quot;Speed&quot; : 1.0,            // 可选参数 语速，默认为1.0
    &quot;Volume&quot;: 1.0,            // 可选参数， 音量大小， 默认为1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // 可选参数，业务集群, 默认是 volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // 必填：String TTS类型
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // 必填：String 订阅的Key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // 必填：String 订阅的地区
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // 必填：String 音色名必填
    &quot;Language&quot;: &quot;zh-CN&quot;, // 必填：String 合成的语言  
    &quot;Rate&quot;: 1 // 选填：float 语速  0.5～2 默认为 1
}
</code></pre>

</div></div><ul>
<li>自定义</li>
</ul>
<p>TTS<br>
具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // String 必填
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // String 必填 用来鉴权
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // String，必填，TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  &quot;SampleRate&quot;: 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  &quot;AudioChannel&quot;: 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}
</code></pre>

</div></div>
     */
    public String getCustomTTSConfig() {
        return this.CustomTTSConfig;
    }

    /**
     * Set <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p>
<ul>
<li>Tencent TTS<br>
配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
       &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS类型, 目前支持&quot;tencent&quot; 和 “minixmax”， 其他的厂商支持中
       &quot;AppId&quot;: &quot;您的应用ID&quot;, // String 必填
       &quot;SecretId&quot;: &quot;您的密钥ID&quot;, // String 必填
       &quot;SecretKey&quot;:  &quot;您的密钥Key&quot;, // String 必填
       &quot;VoiceType&quot;: 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       &quot;Speed&quot;: 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       &quot;Volume&quot;: 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       &quot;PrimaryLanguage&quot;: 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       &quot;FastVoiceType&quot;: &quot;xxxx&quot;   //  可选参数， 快速声音复刻的参数 
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS文档链接</a>。注意Minimax TTS存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS类型, 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-jingpin&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>火山 TTS</li>
</ul>
<p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>
语音合成音色列表–语音技术-火山引擎<br>
大模型语音合成音色列表–语音技术-火山引擎</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // 必填：String TTS类型
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // 必填：String 火山引擎分配的Appid
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // 必填： String类型 火山引擎的访问token
    &quot;Speed&quot; : 1.0,            // 可选参数 语速，默认为1.0
    &quot;Volume&quot;: 1.0,            // 可选参数， 音量大小， 默认为1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // 可选参数，业务集群, 默认是 volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // 必填：String TTS类型
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // 必填：String 订阅的Key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // 必填：String 订阅的地区
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // 必填：String 音色名必填
    &quot;Language&quot;: &quot;zh-CN&quot;, // 必填：String 合成的语言  
    &quot;Rate&quot;: 1 // 选填：float 语速  0.5～2 默认为 1
}
</code></pre>

</div></div><ul>
<li>自定义</li>
</ul>
<p>TTS<br>
具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // String 必填
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // String 必填 用来鉴权
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // String，必填，TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  &quot;SampleRate&quot;: 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  &quot;AudioChannel&quot;: 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}
</code></pre>

</div></div>
     * @param CustomTTSConfig <p>和VoiceType字段需要选填一个，这里是使用自己自定义的TTS，VoiceType是系统内置的一些音色</p>
<ul>
<li>Tencent TTS<br>
配置请参考<a href="https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823" target="_blank">腾讯云TTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{ 
       &quot;TTSType&quot;: &quot;tencent&quot;, // String TTS类型, 目前支持&quot;tencent&quot; 和 “minixmax”， 其他的厂商支持中
       &quot;AppId&quot;: &quot;您的应用ID&quot;, // String 必填
       &quot;SecretId&quot;: &quot;您的密钥ID&quot;, // String 必填
       &quot;SecretKey&quot;:  &quot;您的密钥Key&quot;, // String 必填
       &quot;VoiceType&quot;: 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       &quot;Speed&quot;: 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       &quot;Volume&quot;: 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       &quot;PrimaryLanguage&quot;: 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       &quot;FastVoiceType&quot;: &quot;xxxx&quot;   //  可选参数， 快速声音复刻的参数 
  }
</code></pre>

  </div></div><ul>
<li>Minimax TTS<br>
配置请参考<a href="https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643" target="_blank">Minimax TTS文档链接</a>。注意Minimax TTS存在频率限制，超频可能会导致回答卡顿，<a href="https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572" target="_blank">Minimax TTS频率限制相关文档链接</a>。</li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
        &quot;TTSType&quot;: &quot;minimax&quot;,  // String TTS类型, 
        &quot;Model&quot;: &quot;speech-01-turbo&quot;,
        &quot;APIUrl&quot;: &quot;https://api.minimax.chat/v1/t2a_v2&quot;,
        &quot;APIKey&quot;: &quot;eyxxxx&quot;,
        &quot;GroupId&quot;: &quot;181000000000000&quot;,
        &quot;VoiceType&quot;:&quot;female-tianmei-jingpin&quot;,
        &quot;Speed&quot;: 1.2
}
</code></pre>
</div></div><ul>
<li>火山 TTS</li>
</ul>
<p>配置音色类型参考<a href="https://www.volcengine.com/docs/6561/162929" target="_blank">火山TTS文档链接</a><br>
语音合成音色列表–语音技术-火山引擎<br>
大模型语音合成音色列表–语音技术-火山引擎</p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;volcengine&quot;,  // 必填：String TTS类型
    &quot;AppId&quot; : &quot;xxxxxxxx&quot;,   // 必填：String 火山引擎分配的Appid
    &quot;Token&quot; : &quot;TY9d4sQXHxxxxxxx&quot;, // 必填： String类型 火山引擎的访问token
    &quot;Speed&quot; : 1.0,            // 可选参数 语速，默认为1.0
    &quot;Volume&quot;: 1.0,            // 可选参数， 音量大小， 默认为1.0
    &quot;Cluster&quot; : &quot;volcano_tts&quot;, // 可选参数，业务集群, 默认是 volcano_tts
    &quot;VoiceType&quot; : &quot;zh_male_aojiaobazong_moon_bigtts&quot;   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}
</code></pre>

</div></div><ul>
<li>Azure TTS<br>
配置请参考<a href="https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice" target="_blank">AzureTTS文档链接</a></li>
</ul>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
    &quot;TTSType&quot;: &quot;azure&quot;, // 必填：String TTS类型
    &quot;SubscriptionKey&quot;: &quot;xxxxxxxx&quot;, // 必填：String 订阅的Key
    &quot;Region&quot;: &quot;chinanorth3&quot;,  // 必填：String 订阅的地区
    &quot;VoiceName&quot;: &quot;zh-CN-XiaoxiaoNeural&quot;, // 必填：String 音色名必填
    &quot;Language&quot;: &quot;zh-CN&quot;, // 必填：String 合成的语言  
    &quot;Rate&quot;: 1 // 选填：float 语速  0.5～2 默认为 1
}
</code></pre>

</div></div><ul>
<li>自定义</li>
</ul>
<p>TTS<br>
具体协议规范请参考<a href="https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw" target="_blank">腾讯文档</a></p>
<div><div class="v-md-pre-wrapper copy-code-mode v-md-pre-wrapper- extra-class"><pre class="v-md-prism-"><code>{
  &quot;TTSType&quot;: &quot;custom&quot;, // String 必填
  &quot;APIKey&quot;: &quot;ApiKey&quot;, // String 必填 用来鉴权
  &quot;APIUrl&quot;: &quot;http://0.0.0.0:8080/stream-audio&quot; // String，必填，TTS API URL
  &quot;AudioFormat&quot;: &quot;wav&quot;, // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  &quot;SampleRate&quot;: 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  &quot;AudioChannel&quot;: 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}
</code></pre>

</div></div>
     */
    public void setCustomTTSConfig(String CustomTTSConfig) {
        this.CustomTTSConfig = CustomTTSConfig;
    }

    /**
     * Get 提示词变量 
     * @return PromptVariables 提示词变量
     */
    public Variable [] getPromptVariables() {
        return this.PromptVariables;
    }

    /**
     * Set 提示词变量
     * @param PromptVariables 提示词变量
     */
    public void setPromptVariables(Variable [] PromptVariables) {
        this.PromptVariables = PromptVariables;
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
        if (source.SystemPrompt != null) {
            this.SystemPrompt = new String(source.SystemPrompt);
        }
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.APIUrl != null) {
            this.APIUrl = new String(source.APIUrl);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "SystemPrompt", this.SystemPrompt);
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamSimple(map, prefix + "APIUrl", this.APIUrl);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);
        this.setParamSimple(map, prefix + "WelcomeType", this.WelcomeType);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamSimple(map, prefix + "InterruptMode", this.InterruptMode);
        this.setParamSimple(map, prefix + "InterruptSpeechDuration", this.InterruptSpeechDuration);
        this.setParamSimple(map, prefix + "EndFunctionEnable", this.EndFunctionEnable);
        this.setParamSimple(map, prefix + "EndFunctionDesc", this.EndFunctionDesc);
        this.setParamSimple(map, prefix + "TransferFunctionEnable", this.TransferFunctionEnable);
        this.setParamArrayObj(map, prefix + "TransferItems.", this.TransferItems);
        this.setParamSimple(map, prefix + "NotifyDuration", this.NotifyDuration);
        this.setParamSimple(map, prefix + "NotifyMessage", this.NotifyMessage);
        this.setParamSimple(map, prefix + "NotifyMaxCount", this.NotifyMaxCount);
        this.setParamSimple(map, prefix + "CustomTTSConfig", this.CustomTTSConfig);
        this.setParamArrayObj(map, prefix + "PromptVariables.", this.PromptVariables);

    }
}

