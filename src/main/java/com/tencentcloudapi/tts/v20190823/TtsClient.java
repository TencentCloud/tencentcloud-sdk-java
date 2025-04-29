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
package com.tencentcloudapi.tts.v20190823;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tts.v20190823.models.*;

public class TtsClient extends AbstractClient{
    private static String endpoint = "tts.tencentcloudapi.com";
    private static String service = "tts";
    private static String version = "2019-08-23";
    
    public TtsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TtsClient(Credential credential, String region, ClientProfile profile) {
        super(TtsClient.endpoint, TtsClient.version, credential, region, profile);
    }

    /**
     *本接口服务对10万字符以内的文本进行语音合成，异步返回音频结果。满足一次性合成较长文本的客户需求，如阅读播报、新闻媒体等场景。

<li>支持音频格式：mp3,wav,pcm</li>
<li>支持音频采样率：16000 Hz, 8000 Hz</li>
<li>支持中文普通话、英文、中英文混读、粤语合成</li>
<li>支持语速、音量设置</li>
<li>支持回调或轮询的方式获取结果，结果获取请参考 长文本语音合成结果查询。</li>
<li>提交长文本语音合成请求后，合成结果在3小时内完成。请注意：30分钟内提交任务超过 100 万字符或 200 条任务除外。</li>
<li>音频文件在服务端可保存24小时，请及时下载。</li>
<p></p>

长文本合成支持 SSML，语法详见 [SSML 标记语言](https://cloud.tencent.com/document/product/1073/49575)，使用时需满足如下使用规范：
<li>使用 SSML 标签，需置于 speak 闭合标签内部；</li>
<li>合成文本可包含多组 speak 闭合标签，且无数量限制；</li>
<li>每个 speak 闭合标签内部，字符数不超过 150 字（标签字符本身不计算在内）；</li>
<li>每个 speak 闭合标签内部，使用 break 标签数目最大为 10 个。如需要使用更多，可拆解到多个 speak 标签中；</li>

<p></p>
     * @param req CreateTtsTaskRequest
     * @return CreateTtsTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTtsTaskResponse CreateTtsTask(CreateTtsTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTtsTask", CreateTtsTaskResponse.class);
    }

    /**
     *在调用长文本语音合成请求接口后，有回调和轮询两种方式获取识别结果。

<li>当采用回调方式时，合成完毕后会将结果通过 POST 请求的形式通知到用户在请求时填写的回调 URL，具体请参见 长文本语音合成结果查询 。</li>
<li>当采用轮询方式时，需要主动提交任务ID来轮询识别结果，共有任务成功、等待、执行中和失败四种结果，具体信息请参见下文说明。</li>
     * @param req DescribeTtsTaskStatusRequest
     * @return DescribeTtsTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTtsTaskStatusResponse DescribeTtsTaskStatus(DescribeTtsTaskStatusRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTtsTaskStatus", DescribeTtsTaskStatusResponse.class);
    }

    /**
     *腾讯云语音合成技术（TTS）可以将任意文本转化为语音，实现让机器和应用张口说话。
腾讯TTS技术可以应用到很多场景，比如，移动APP语音播报新闻；智能设备语音提醒；依靠网上现有节目或少量录音，快速合成明星语音，降低邀约成本；支持车载导航语音合成的个性化语音播报。
基础合成支持 SSML，语法详见 [SSML 标记语言](https://cloud.tencent.com/document/product/1073/49575)。
默认接口请求频率限制：
精品音色和标准音色：默认20并发
大模型音色：默认10并发
一句话复刻音色：默认5并发
超自然大模型音色：暂不支持
     * @param req TextToVoiceRequest
     * @return TextToVoiceResponse
     * @throws TencentCloudSDKException
     */
    public TextToVoiceResponse TextToVoice(TextToVoiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "TextToVoice", TextToVoiceResponse.class);
    }

}
