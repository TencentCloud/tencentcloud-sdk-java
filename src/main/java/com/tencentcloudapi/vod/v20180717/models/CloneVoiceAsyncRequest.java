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

public class CloneVoiceAsyncRequest extends AbstractModel {

    /**
    * <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
    */
    @SerializedName("SubAppId")
    @Expose
    private String SubAppId;

    /**
    * <p>克隆音频base64编码。</p>
    */
    @SerializedName("AudioData")
    @Expose
    private String AudioData;

    /**
    * <p>克隆音频Url，AudioData为空时有效</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
    */
    @SerializedName("AudioFileId")
    @Expose
    private String AudioFileId;

    /**
    * <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
    */
    @SerializedName("LanguageBoost")
    @Expose
    private String LanguageBoost;

    /**
    * <p>音色克隆拓展参数。<code>ExtParam</code> 支持的字段： </p><ul><li><code>text</code> (string)：试听合成文本，最大 1000 字符；为空或不传时不返回试听音频。</li></ul>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
    * <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
     * Get <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p> 
     * @return SubAppId <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     */
    public String getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     * @param SubAppId <p>点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</p>
     */
    public void setSubAppId(String SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>克隆音频base64编码。</p> 
     * @return AudioData <p>克隆音频base64编码。</p>
     */
    public String getAudioData() {
        return this.AudioData;
    }

    /**
     * Set <p>克隆音频base64编码。</p>
     * @param AudioData <p>克隆音频base64编码。</p>
     */
    public void setAudioData(String AudioData) {
        this.AudioData = AudioData;
    }

    /**
     * Get <p>克隆音频Url，AudioData为空时有效</p> 
     * @return AudioUrl <p>克隆音频Url，AudioData为空时有效</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>克隆音频Url，AudioData为空时有效</p>
     * @param AudioUrl <p>克隆音频Url，AudioData为空时有效</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p> 
     * @return AudioFileId <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
     */
    public String getAudioFileId() {
        return this.AudioFileId;
    }

    /**
     * Set <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
     * @param AudioFileId <p>克隆文件FileID，AudioData及AudioUrl为空时有效</p>
     */
    public void setAudioFileId(String AudioFileId) {
        this.AudioFileId = AudioFileId;
    }

    /**
     * Get <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p> 
     * @return LanguageBoost <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
     */
    public String getLanguageBoost() {
        return this.LanguageBoost;
    }

    /**
     * Set <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
     * @param LanguageBoost <p>语言增强，如 "zh" "en" "auto"，默认 "auto"</p>
     */
    public void setLanguageBoost(String LanguageBoost) {
        this.LanguageBoost = LanguageBoost;
    }

    /**
     * Get <p>音色克隆拓展参数。<code>ExtParam</code> 支持的字段： </p><ul><li><code>text</code> (string)：试听合成文本，最大 1000 字符；为空或不传时不返回试听音频。</li></ul> 
     * @return ExtParam <p>音色克隆拓展参数。<code>ExtParam</code> 支持的字段： </p><ul><li><code>text</code> (string)：试听合成文本，最大 1000 字符；为空或不传时不返回试听音频。</li></ul>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>音色克隆拓展参数。<code>ExtParam</code> 支持的字段： </p><ul><li><code>text</code> (string)：试听合成文本，最大 1000 字符；为空或不传时不返回试听音频。</li></ul>
     * @param ExtParam <p>音色克隆拓展参数。<code>ExtParam</code> 支持的字段： </p><ul><li><code>text</code> (string)：试听合成文本，最大 1000 字符；为空或不传时不返回试听音频。</li></ul>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    /**
     * Get <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>标识来源上下文，用于透传用户请求信息，在回调和任务流状态变更回调将返回该字段值，最长 1000 个字符。</p>
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * Get <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p> 
     * @return SessionId <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     * @param SessionId <p>用于任务去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public CloneVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceAsyncRequest(CloneVoiceAsyncRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new String(source.SubAppId);
        }
        if (source.AudioData != null) {
            this.AudioData = new String(source.AudioData);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.AudioFileId != null) {
            this.AudioFileId = new String(source.AudioFileId);
        }
        if (source.LanguageBoost != null) {
            this.LanguageBoost = new String(source.LanguageBoost);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
        if (source.SessionContext != null) {
            this.SessionContext = new String(source.SessionContext);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "AudioData", this.AudioData);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "AudioFileId", this.AudioFileId);
        this.setParamSimple(map, prefix + "LanguageBoost", this.LanguageBoost);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

