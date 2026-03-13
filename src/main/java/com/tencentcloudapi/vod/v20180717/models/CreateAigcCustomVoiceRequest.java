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

public class CreateAigcCustomVoiceRequest extends AbstractModel {

    /**
    * <p><b>点播<a href="https://cloud.tencent.com/document/product/266/14574">应用</a> ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>音色名称，文本内容最大长度 20 个字符</p>
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * <p>音色数据文件获取链接，支持 .mp3 / .wav / .mp4 / .mov 格式的音视频文件。音频中人声需干净无杂音，有且只能有一种人声，时长不短于 5 秒且不长于 30 秒。</p>
    */
    @SerializedName("VoiceUrl")
    @Expose
    private String VoiceUrl;

    /**
    * <p>历史作品 ID，可通过引用历史作品提供音频素材。</p>
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
    * <p>用于去重的识别码，如果三天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
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
     * Get <p>音色名称，文本内容最大长度 20 个字符</p> 
     * @return VoiceName <p>音色名称，文本内容最大长度 20 个字符</p>
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set <p>音色名称，文本内容最大长度 20 个字符</p>
     * @param VoiceName <p>音色名称，文本内容最大长度 20 个字符</p>
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get <p>音色数据文件获取链接，支持 .mp3 / .wav / .mp4 / .mov 格式的音视频文件。音频中人声需干净无杂音，有且只能有一种人声，时长不短于 5 秒且不长于 30 秒。</p> 
     * @return VoiceUrl <p>音色数据文件获取链接，支持 .mp3 / .wav / .mp4 / .mov 格式的音视频文件。音频中人声需干净无杂音，有且只能有一种人声，时长不短于 5 秒且不长于 30 秒。</p>
     */
    public String getVoiceUrl() {
        return this.VoiceUrl;
    }

    /**
     * Set <p>音色数据文件获取链接，支持 .mp3 / .wav / .mp4 / .mov 格式的音视频文件。音频中人声需干净无杂音，有且只能有一种人声，时长不短于 5 秒且不长于 30 秒。</p>
     * @param VoiceUrl <p>音色数据文件获取链接，支持 .mp3 / .wav / .mp4 / .mov 格式的音视频文件。音频中人声需干净无杂音，有且只能有一种人声，时长不短于 5 秒且不长于 30 秒。</p>
     */
    public void setVoiceUrl(String VoiceUrl) {
        this.VoiceUrl = VoiceUrl;
    }

    /**
     * Get <p>历史作品 ID，可通过引用历史作品提供音频素材。</p> 
     * @return VideoId <p>历史作品 ID，可通过引用历史作品提供音频素材。</p>
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set <p>历史作品 ID，可通过引用历史作品提供音频素材。</p>
     * @param VideoId <p>历史作品 ID，可通过引用历史作品提供音频素材。</p>
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
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
     * Get <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p> 
     * @return SessionContext <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * Set <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
     * @param SessionContext <p>来源上下文，用于透传用户请求信息，任务完成回调将返回该字段值，最长 1000 个字符。</p>
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

    public CreateAigcCustomVoiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcCustomVoiceRequest(CreateAigcCustomVoiceRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceUrl != null) {
            this.VoiceUrl = new String(source.VoiceUrl);
        }
        if (source.VideoId != null) {
            this.VideoId = new String(source.VideoId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceUrl", this.VoiceUrl);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "TasksPriority", this.TasksPriority);

    }
}

