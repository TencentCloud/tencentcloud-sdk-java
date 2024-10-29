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
    * 被叫
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 用于设定AI座席人设、说话规则、任务等的全局提示词。
    */
    @SerializedName("SystemPrompt")
    @Expose
    private String SystemPrompt;

    /**
    * LLM类型
目前有两种
openai(兼容openai协议的模型)
azure
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * 模型（当前仅支持openai协议的模型）
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * API密钥
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * API URL，仅支持兼容openai协议的模型，填写url时后缀不要带/chat/completions；
llmType为azure时,URL填写格式需为：https://{your-resource-name}.openai.azure.com?api-version={api-version},填写url时后缀不要带/openai/deployments/{deployment-id}/chat/completions，系统会自动帮您填充后缀
    */
    @SerializedName("APIUrl")
    @Expose
    private String APIUrl;

    /**
    * 音色，目前仅支持以下音色:
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
    * 用户多久没说话提示时长,最小10秒,默认10秒
    */
    @SerializedName("NotifyDuration")
    @Expose
    private Long NotifyDuration;

    /**
    * 用户NotifyDuration没说话，ai提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
    */
    @SerializedName("NotifyMessage")
    @Expose
    private String NotifyMessage;

    /**
    * 和voiceType字段需要选填一个，这里是使用自己自定义的TTS，voiceType是系统内置的一些音色

tencent TTS:
{ 
       "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中
       "AppId": "您的应用ID", // String 必填
       "SecretId": "您的密钥ID", // String 必填
       "SecretKey":  "您的密钥Key", // String 必填
       "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数 
  }

参考：https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823 

minimax TTS
{
        "TTSType": "minimax",  // String TTS类型, 
        "Model": "speech-01-turbo",
        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",
        "APIKey": "eyxxxx",
        "GroupId": "181000000000000",
        "VoiceType":"female-tianmei-jingpin",
        "Speed": 1.2
}

参考：https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643 
限频参考：https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572   可能会导致回答卡顿



volcengine TTS
{
    "TTSType": "volcengine",  // 必填：String TTS类型
    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid
    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token
    "Speed" : 1.0,            // 可选参数 语速，默认为1.0
    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0
    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts
    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}



火山引擎音色类型参考：
https://www.volcengine.com/docs/6561/162929 
语音合成音色列表--语音技术-火山引擎
大模型语音合成音色列表--语音技术-火山引擎


Azure TTS
{
    "TTSType": "azure", // 必填：String TTS类型
    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key
    "Region": "chinanorth3",  // 必填：String 订阅的地区
    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填
    "Language": "zh-CN", // 必填：String 合成的语言  
    "Rate": 1 // 选填：float 语速  0.5～2 默认为 1
}

参考：
https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice 


自定义 TTS 
{
  "TTSType": "custom", // String 必填
  "APIKey": "ApiKey", // String 必填 用来鉴权
  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL
  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}


具体协议规范： 
https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw 



    */
    @SerializedName("CustomTTSConfig")
    @Expose
    private String CustomTTSConfig;

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
     * Get 被叫 
     * @return Callee 被叫
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫
     * @param Callee 被叫
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 用于设定AI座席人设、说话规则、任务等的全局提示词。 
     * @return SystemPrompt 用于设定AI座席人设、说话规则、任务等的全局提示词。
     */
    public String getSystemPrompt() {
        return this.SystemPrompt;
    }

    /**
     * Set 用于设定AI座席人设、说话规则、任务等的全局提示词。
     * @param SystemPrompt 用于设定AI座席人设、说话规则、任务等的全局提示词。
     */
    public void setSystemPrompt(String SystemPrompt) {
        this.SystemPrompt = SystemPrompt;
    }

    /**
     * Get LLM类型
目前有两种
openai(兼容openai协议的模型)
azure 
     * @return LLMType LLM类型
目前有两种
openai(兼容openai协议的模型)
azure
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set LLM类型
目前有两种
openai(兼容openai协议的模型)
azure
     * @param LLMType LLM类型
目前有两种
openai(兼容openai协议的模型)
azure
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get 模型（当前仅支持openai协议的模型） 
     * @return Model 模型（当前仅支持openai协议的模型）
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型（当前仅支持openai协议的模型）
     * @param Model 模型（当前仅支持openai协议的模型）
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get API密钥 
     * @return APIKey API密钥
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set API密钥
     * @param APIKey API密钥
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get API URL，仅支持兼容openai协议的模型，填写url时后缀不要带/chat/completions；
llmType为azure时,URL填写格式需为：https://{your-resource-name}.openai.azure.com?api-version={api-version},填写url时后缀不要带/openai/deployments/{deployment-id}/chat/completions，系统会自动帮您填充后缀 
     * @return APIUrl API URL，仅支持兼容openai协议的模型，填写url时后缀不要带/chat/completions；
llmType为azure时,URL填写格式需为：https://{your-resource-name}.openai.azure.com?api-version={api-version},填写url时后缀不要带/openai/deployments/{deployment-id}/chat/completions，系统会自动帮您填充后缀
     */
    public String getAPIUrl() {
        return this.APIUrl;
    }

    /**
     * Set API URL，仅支持兼容openai协议的模型，填写url时后缀不要带/chat/completions；
llmType为azure时,URL填写格式需为：https://{your-resource-name}.openai.azure.com?api-version={api-version},填写url时后缀不要带/openai/deployments/{deployment-id}/chat/completions，系统会自动帮您填充后缀
     * @param APIUrl API URL，仅支持兼容openai协议的模型，填写url时后缀不要带/chat/completions；
llmType为azure时,URL填写格式需为：https://{your-resource-name}.openai.azure.com?api-version={api-version},填写url时后缀不要带/openai/deployments/{deployment-id}/chat/completions，系统会自动帮您填充后缀
     */
    public void setAPIUrl(String APIUrl) {
        this.APIUrl = APIUrl;
    }

    /**
     * Get 音色，目前仅支持以下音色:
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

 
     * @return VoiceType 音色，目前仅支持以下音色:
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
     * Set 音色，目前仅支持以下音色:
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


     * @param VoiceType 音色，目前仅支持以下音色:
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
     * Get 用户NotifyDuration没说话，ai提示的语句，默认是"抱歉，我没听清。您可以重复下吗？" 
     * @return NotifyMessage 用户NotifyDuration没说话，ai提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
     */
    public String getNotifyMessage() {
        return this.NotifyMessage;
    }

    /**
     * Set 用户NotifyDuration没说话，ai提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
     * @param NotifyMessage 用户NotifyDuration没说话，ai提示的语句，默认是"抱歉，我没听清。您可以重复下吗？"
     */
    public void setNotifyMessage(String NotifyMessage) {
        this.NotifyMessage = NotifyMessage;
    }

    /**
     * Get 和voiceType字段需要选填一个，这里是使用自己自定义的TTS，voiceType是系统内置的一些音色

tencent TTS:
{ 
       "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中
       "AppId": "您的应用ID", // String 必填
       "SecretId": "您的密钥ID", // String 必填
       "SecretKey":  "您的密钥Key", // String 必填
       "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数 
  }

参考：https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823 

minimax TTS
{
        "TTSType": "minimax",  // String TTS类型, 
        "Model": "speech-01-turbo",
        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",
        "APIKey": "eyxxxx",
        "GroupId": "181000000000000",
        "VoiceType":"female-tianmei-jingpin",
        "Speed": 1.2
}

参考：https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643 
限频参考：https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572   可能会导致回答卡顿



volcengine TTS
{
    "TTSType": "volcengine",  // 必填：String TTS类型
    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid
    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token
    "Speed" : 1.0,            // 可选参数 语速，默认为1.0
    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0
    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts
    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}



火山引擎音色类型参考：
https://www.volcengine.com/docs/6561/162929 
语音合成音色列表--语音技术-火山引擎
大模型语音合成音色列表--语音技术-火山引擎


Azure TTS
{
    "TTSType": "azure", // 必填：String TTS类型
    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key
    "Region": "chinanorth3",  // 必填：String 订阅的地区
    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填
    "Language": "zh-CN", // 必填：String 合成的语言  
    "Rate": 1 // 选填：float 语速  0.5～2 默认为 1
}

参考：
https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice 


自定义 TTS 
{
  "TTSType": "custom", // String 必填
  "APIKey": "ApiKey", // String 必填 用来鉴权
  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL
  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}


具体协议规范： 
https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw 


 
     * @return CustomTTSConfig 和voiceType字段需要选填一个，这里是使用自己自定义的TTS，voiceType是系统内置的一些音色

tencent TTS:
{ 
       "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中
       "AppId": "您的应用ID", // String 必填
       "SecretId": "您的密钥ID", // String 必填
       "SecretKey":  "您的密钥Key", // String 必填
       "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数 
  }

参考：https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823 

minimax TTS
{
        "TTSType": "minimax",  // String TTS类型, 
        "Model": "speech-01-turbo",
        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",
        "APIKey": "eyxxxx",
        "GroupId": "181000000000000",
        "VoiceType":"female-tianmei-jingpin",
        "Speed": 1.2
}

参考：https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643 
限频参考：https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572   可能会导致回答卡顿



volcengine TTS
{
    "TTSType": "volcengine",  // 必填：String TTS类型
    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid
    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token
    "Speed" : 1.0,            // 可选参数 语速，默认为1.0
    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0
    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts
    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}



火山引擎音色类型参考：
https://www.volcengine.com/docs/6561/162929 
语音合成音色列表--语音技术-火山引擎
大模型语音合成音色列表--语音技术-火山引擎


Azure TTS
{
    "TTSType": "azure", // 必填：String TTS类型
    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key
    "Region": "chinanorth3",  // 必填：String 订阅的地区
    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填
    "Language": "zh-CN", // 必填：String 合成的语言  
    "Rate": 1 // 选填：float 语速  0.5～2 默认为 1
}

参考：
https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice 


自定义 TTS 
{
  "TTSType": "custom", // String 必填
  "APIKey": "ApiKey", // String 必填 用来鉴权
  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL
  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}


具体协议规范： 
https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw 



     */
    public String getCustomTTSConfig() {
        return this.CustomTTSConfig;
    }

    /**
     * Set 和voiceType字段需要选填一个，这里是使用自己自定义的TTS，voiceType是系统内置的一些音色

tencent TTS:
{ 
       "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中
       "AppId": "您的应用ID", // String 必填
       "SecretId": "您的密钥ID", // String 必填
       "SecretKey":  "您的密钥Key", // String 必填
       "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数 
  }

参考：https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823 

minimax TTS
{
        "TTSType": "minimax",  // String TTS类型, 
        "Model": "speech-01-turbo",
        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",
        "APIKey": "eyxxxx",
        "GroupId": "181000000000000",
        "VoiceType":"female-tianmei-jingpin",
        "Speed": 1.2
}

参考：https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643 
限频参考：https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572   可能会导致回答卡顿



volcengine TTS
{
    "TTSType": "volcengine",  // 必填：String TTS类型
    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid
    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token
    "Speed" : 1.0,            // 可选参数 语速，默认为1.0
    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0
    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts
    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}



火山引擎音色类型参考：
https://www.volcengine.com/docs/6561/162929 
语音合成音色列表--语音技术-火山引擎
大模型语音合成音色列表--语音技术-火山引擎


Azure TTS
{
    "TTSType": "azure", // 必填：String TTS类型
    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key
    "Region": "chinanorth3",  // 必填：String 订阅的地区
    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填
    "Language": "zh-CN", // 必填：String 合成的语言  
    "Rate": 1 // 选填：float 语速  0.5～2 默认为 1
}

参考：
https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice 


自定义 TTS 
{
  "TTSType": "custom", // String 必填
  "APIKey": "ApiKey", // String 必填 用来鉴权
  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL
  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}


具体协议规范： 
https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw 



     * @param CustomTTSConfig 和voiceType字段需要选填一个，这里是使用自己自定义的TTS，voiceType是系统内置的一些音色

tencent TTS:
{ 
       "TTSType": "tencent", // String TTS类型, 目前支持"tencent" 和 “minixmax”， 其他的厂商支持中
       "AppId": "您的应用ID", // String 必填
       "SecretId": "您的密钥ID", // String 必填
       "SecretKey":  "您的密钥Key", // String 必填
       "VoiceType": 101001, // Integer  必填，音色 ID，包括标准音色与精品音色，精品音色拟真度更高，价格不同于标准音色，请参见语音合成计费概述。完整的音色 ID 列表请参见语音合成音色列表。
       "Speed": 1.25, // Integer 非必填，语速，范围：[-2，6]，分别对应不同语速： -2: 代表0.6倍 -1: 代表0.8倍 0: 代表1.0倍（默认） 1: 代表1.2倍 2: 代表1.5倍  6: 代表2.5倍  如果需要更细化的语速，可以保留小数点后 2 位，例如0.5/1.25/2.81等。 参数值与实际语速转换，可参考 语速转换
       "Volume": 5, // Integer 非必填，音量大小，范围：[0，10]，分别对应11个等级的音量，默认值为0，代表正常音量。
       "PrimaryLanguage": 1, // Integer 可选 主要语言 1-中文（默认） 2-英文 3-日文
       "FastVoiceType": "xxxx"   //  可选参数， 快速声音复刻的参数 
  }

参考：https://cloud.tencent.com/document/product/1073/92668#55924b56-1a73-4663-a7a1-a8dd82d6e823 

minimax TTS
{
        "TTSType": "minimax",  // String TTS类型, 
        "Model": "speech-01-turbo",
        "APIUrl": "https://api.minimax.chat/v1/t2a_v2",
        "APIKey": "eyxxxx",
        "GroupId": "181000000000000",
        "VoiceType":"female-tianmei-jingpin",
        "Speed": 1.2
}

参考：https://platform.minimaxi.com/document/T2A%20V2?key=66719005a427f0c8a5701643 
限频参考：https://platform.minimaxi.com/document/Rate%20limits?key=66b19417290299a26b234572   可能会导致回答卡顿



volcengine TTS
{
    "TTSType": "volcengine",  // 必填：String TTS类型
    "AppId" : "xxxxxxxx",   // 必填：String 火山引擎分配的Appid
    "Token" : "TY9d4sQXHxxxxxxx", // 必填： String类型 火山引擎的访问token
    "Speed" : 1.0,            // 可选参数 语速，默认为1.0
    "Volume": 1.0,            // 可选参数， 音量大小， 默认为1.0
    "Cluster" : "volcano_tts", // 可选参数，业务集群, 默认是 volcano_tts
    "VoiceType" : "zh_male_aojiaobazong_moon_bigtts"   // 音色类型， 默认为大模型语音合成的音色。 如果使用普通语音合成，则需要填写对应的音色类型。 音色类型填写错误会导致没有声音。
}



火山引擎音色类型参考：
https://www.volcengine.com/docs/6561/162929 
语音合成音色列表--语音技术-火山引擎
大模型语音合成音色列表--语音技术-火山引擎


Azure TTS
{
    "TTSType": "azure", // 必填：String TTS类型
    "SubscriptionKey": "xxxxxxxx", // 必填：String 订阅的Key
    "Region": "chinanorth3",  // 必填：String 订阅的地区
    "VoiceName": "zh-CN-XiaoxiaoNeural", // 必填：String 音色名必填
    "Language": "zh-CN", // 必填：String 合成的语言  
    "Rate": 1 // 选填：float 语速  0.5～2 默认为 1
}

参考：
https://docs.azure.cn/zh-cn/ai-services/speech-service/speech-synthesis-markup-voice 


自定义 TTS 
{
  "TTSType": "custom", // String 必填
  "APIKey": "ApiKey", // String 必填 用来鉴权
  "APIUrl": "http://0.0.0.0:8080/stream-audio" // String，必填，TTS API URL
  "AudioFormat": "wav", // String, 非必填，期望输出的音频格式，如mp3， ogg_opus，pcm，wav，默认为 wav，目前只支持pcm和wav，
  "SampleRate": 16000,  // Integer，非必填，音频采样率，默认为16000(16k)，推荐值为16000
  "AudioChannel": 1,    // Integer，非必填，音频通道数，取值：1 或 2  默认为1  
}


具体协议规范： 
https://doc.weixin.qq.com/doc/w3_ANQAiAbdAFwHILbJBmtSqSbV1WZ3L?scode=AJEAIQdfAAo5a1xajYANQAiAbdAFw 



     */
    public void setCustomTTSConfig(String CustomTTSConfig) {
        this.CustomTTSConfig = CustomTTSConfig;
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
        if (source.NotifyDuration != null) {
            this.NotifyDuration = new Long(source.NotifyDuration);
        }
        if (source.NotifyMessage != null) {
            this.NotifyMessage = new String(source.NotifyMessage);
        }
        if (source.CustomTTSConfig != null) {
            this.CustomTTSConfig = new String(source.CustomTTSConfig);
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
        this.setParamSimple(map, prefix + "NotifyDuration", this.NotifyDuration);
        this.setParamSimple(map, prefix + "NotifyMessage", this.NotifyMessage);
        this.setParamSimple(map, prefix + "CustomTTSConfig", this.CustomTTSConfig);

    }
}

