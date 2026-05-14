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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAigcAudioCloneRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>原音频文件（需要确保可访问） 模型将以此参数中传入的音频音色为示例对音色进行复刻。  </p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应不低于 10 秒，最长应不超过 5 分钟； 注3：上传的音频文件大小需不超过20mb； 注4：音频内容免涉版权，否则会被下架或销毁。</p>
    */
    @SerializedName("AudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo AudioFileInfo;

    /**
    * <p>自定义的声音ID，示例：&quot;vidu01&quot;。</p><p>入参限制：</p><ul><li>自定义的 voice_id 长度范围[8,256];</li><li>首字符必须为英文字母;</li><li>允许数字、字母、横线、下划线;</li><li>末位字符不可为 -、_</li><li>voice_id 不可与已有 id 重复，否则会报错.</li></ul>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>复刻试听参数。</p><p>参数格式：限制 1000 字符以内，模型将使用复刻后的音色朗读本段文本内容，并返回试听音频链接。 注：试听将根据字符数正常收取语音合成费用。</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * <p>音色复刻示例音频。提供本参数将有助于增强语音合成的音色相似度和稳定性，若使用本参数，需同时上传一小段示例音频。</p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应小于 8 秒； 注3：上传的音频文件大小需不超过20mb。</p>
    */
    @SerializedName("PromptAudioFileInfo")
    @Expose
    private AigcAudioCloneInputFileInfo PromptAudioFileInfo;

    /**
    * <p>示例音频对应的文本内容 需确保和音频内容一致，句末需有标点符号做结尾。</p>
    */
    @SerializedName("PromptText")
    @Expose
    private String PromptText;

    /**
    * <p>透传参数。  入参限制：不做任何处理，仅数据传输 注：最多 1048576个字符</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
    */
    @SerializedName("TasksPriority")
    @Expose
    private Long TasksPriority;

    /**
    * <p>保留字段，特殊用途时使用。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p> 
     * @return SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     * @param SubAppId <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>原音频文件（需要确保可访问） 模型将以此参数中传入的音频音色为示例对音色进行复刻。  </p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应不低于 10 秒，最长应不超过 5 分钟； 注3：上传的音频文件大小需不超过20mb； 注4：音频内容免涉版权，否则会被下架或销毁。</p> 
     * @return AudioFileInfo <p>原音频文件（需要确保可访问） 模型将以此参数中传入的音频音色为示例对音色进行复刻。  </p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应不低于 10 秒，最长应不超过 5 分钟； 注3：上传的音频文件大小需不超过20mb； 注4：音频内容免涉版权，否则会被下架或销毁。</p>
     */
    public AigcAudioCloneInputFileInfo getAudioFileInfo() {
        return this.AudioFileInfo;
    }

    /**
     * Set <p>原音频文件（需要确保可访问） 模型将以此参数中传入的音频音色为示例对音色进行复刻。  </p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应不低于 10 秒，最长应不超过 5 分钟； 注3：上传的音频文件大小需不超过20mb； 注4：音频内容免涉版权，否则会被下架或销毁。</p>
     * @param AudioFileInfo <p>原音频文件（需要确保可访问） 模型将以此参数中传入的音频音色为示例对音色进行复刻。  </p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应不低于 10 秒，最长应不超过 5 分钟； 注3：上传的音频文件大小需不超过20mb； 注4：音频内容免涉版权，否则会被下架或销毁。</p>
     */
    public void setAudioFileInfo(AigcAudioCloneInputFileInfo AudioFileInfo) {
        this.AudioFileInfo = AudioFileInfo;
    }

    /**
     * Get <p>自定义的声音ID，示例：&quot;vidu01&quot;。</p><p>入参限制：</p><ul><li>自定义的 voice_id 长度范围[8,256];</li><li>首字符必须为英文字母;</li><li>允许数字、字母、横线、下划线;</li><li>末位字符不可为 -、_</li><li>voice_id 不可与已有 id 重复，否则会报错.</li></ul> 
     * @return VoiceId <p>自定义的声音ID，示例：&quot;vidu01&quot;。</p><p>入参限制：</p><ul><li>自定义的 voice_id 长度范围[8,256];</li><li>首字符必须为英文字母;</li><li>允许数字、字母、横线、下划线;</li><li>末位字符不可为 -、_</li><li>voice_id 不可与已有 id 重复，否则会报错.</li></ul>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>自定义的声音ID，示例：&quot;vidu01&quot;。</p><p>入参限制：</p><ul><li>自定义的 voice_id 长度范围[8,256];</li><li>首字符必须为英文字母;</li><li>允许数字、字母、横线、下划线;</li><li>末位字符不可为 -、_</li><li>voice_id 不可与已有 id 重复，否则会报错.</li></ul>
     * @param VoiceId <p>自定义的声音ID，示例：&quot;vidu01&quot;。</p><p>入参限制：</p><ul><li>自定义的 voice_id 长度范围[8,256];</li><li>首字符必须为英文字母;</li><li>允许数字、字母、横线、下划线;</li><li>末位字符不可为 -、_</li><li>voice_id 不可与已有 id 重复，否则会报错.</li></ul>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>复刻试听参数。</p><p>参数格式：限制 1000 字符以内，模型将使用复刻后的音色朗读本段文本内容，并返回试听音频链接。 注：试听将根据字符数正常收取语音合成费用。</p> 
     * @return Text <p>复刻试听参数。</p><p>参数格式：限制 1000 字符以内，模型将使用复刻后的音色朗读本段文本内容，并返回试听音频链接。 注：试听将根据字符数正常收取语音合成费用。</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>复刻试听参数。</p><p>参数格式：限制 1000 字符以内，模型将使用复刻后的音色朗读本段文本内容，并返回试听音频链接。 注：试听将根据字符数正常收取语音合成费用。</p>
     * @param Text <p>复刻试听参数。</p><p>参数格式：限制 1000 字符以内，模型将使用复刻后的音色朗读本段文本内容，并返回试听音频链接。 注：试听将根据字符数正常收取语音合成费用。</p>
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get <p>音色复刻示例音频。提供本参数将有助于增强语音合成的音色相似度和稳定性，若使用本参数，需同时上传一小段示例音频。</p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应小于 8 秒； 注3：上传的音频文件大小需不超过20mb。</p> 
     * @return PromptAudioFileInfo <p>音色复刻示例音频。提供本参数将有助于增强语音合成的音色相似度和稳定性，若使用本参数，需同时上传一小段示例音频。</p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应小于 8 秒； 注3：上传的音频文件大小需不超过20mb。</p>
     */
    public AigcAudioCloneInputFileInfo getPromptAudioFileInfo() {
        return this.PromptAudioFileInfo;
    }

    /**
     * Set <p>音色复刻示例音频。提供本参数将有助于增强语音合成的音色相似度和稳定性，若使用本参数，需同时上传一小段示例音频。</p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应小于 8 秒； 注3：上传的音频文件大小需不超过20mb。</p>
     * @param PromptAudioFileInfo <p>音色复刻示例音频。提供本参数将有助于增强语音合成的音色相似度和稳定性，若使用本参数，需同时上传一小段示例音频。</p><p>入参限制：注1：音频仅支持格式：mp3、m4a、wav； 注2：上传的音频文件的时长最少应小于 8 秒； 注3：上传的音频文件大小需不超过20mb。</p>
     */
    public void setPromptAudioFileInfo(AigcAudioCloneInputFileInfo PromptAudioFileInfo) {
        this.PromptAudioFileInfo = PromptAudioFileInfo;
    }

    /**
     * Get <p>示例音频对应的文本内容 需确保和音频内容一致，句末需有标点符号做结尾。</p> 
     * @return PromptText <p>示例音频对应的文本内容 需确保和音频内容一致，句末需有标点符号做结尾。</p>
     */
    public String getPromptText() {
        return this.PromptText;
    }

    /**
     * Set <p>示例音频对应的文本内容 需确保和音频内容一致，句末需有标点符号做结尾。</p>
     * @param PromptText <p>示例音频对应的文本内容 需确保和音频内容一致，句末需有标点符号做结尾。</p>
     */
    public void setPromptText(String PromptText) {
        this.PromptText = PromptText;
    }

    /**
     * Get <p>透传参数。  入参限制：不做任何处理，仅数据传输 注：最多 1048576个字符</p> 
     * @return Payload <p>透传参数。  入参限制：不做任何处理，仅数据传输 注：最多 1048576个字符</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>透传参数。  入参限制：不做任何处理，仅数据传输 注：最多 1048576个字符</p>
     * @param Payload <p>透传参数。  入参限制：不做任何处理，仅数据传输 注：最多 1048576个字符</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，音画质重生完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p> 
     * @return TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public Long getTasksPriority() {
        return this.TasksPriority;
    }

    /**
     * Set <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     * @param TasksPriority <p>任务的优先级，数值越大优先级越高，取值范围是 -10 到 10，不填代表 0。</p>
     */
    public void setTasksPriority(Long TasksPriority) {
        this.TasksPriority = TasksPriority;
    }

    /**
     * Get <p>保留字段，特殊用途时使用。</p> 
     * @return ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>保留字段，特殊用途时使用。</p>
     * @param ExtInfo <p>保留字段，特殊用途时使用。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CreateAigcAudioCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneRequest(CreateAigcAudioCloneRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.AudioFileInfo != null) {
            this.AudioFileInfo = new AigcAudioCloneInputFileInfo(source.AudioFileInfo);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.PromptAudioFileInfo != null) {
            this.PromptAudioFileInfo = new AigcAudioCloneInputFileInfo(source.PromptAudioFileInfo);
        }
        if (source.PromptText != null) {
            this.PromptText = new String(source.PromptText);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.TasksPriority != null) {
            this.TasksPriority = new Long(source.TasksPriority);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamObj(map, prefix + "AudioFileInfo.", this.AudioFileInfo);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamObj(map, prefix + "PromptAudioFileInfo.", this.PromptAudioFileInfo);
        this.setParamSimple(map, prefix + "PromptText", this.PromptText);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

