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

public class CreateAigcAudioCloneOutput extends AbstractModel {

    /**
    * <p>任务ID。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>处理状态。</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>用户自定义的 voice_id，如果任务失败则不返回。</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>如果请求体中传入了试听文本 text，那么本参数将以链接形式返回试听音频，否则本参数为空值。</p>
    */
    @SerializedName("DemoAudio")
    @Expose
    private String DemoAudio;

    /**
    * <p>本次调用时传入的透传参数。</p>
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * <p>任务创建时间。</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
     * Get <p>任务ID。</p> 
     * @return TaskId <p>任务ID。</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID。</p>
     * @param TaskId <p>任务ID。</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>处理状态。</p> 
     * @return State <p>处理状态。</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>处理状态。</p>
     * @param State <p>处理状态。</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>用户自定义的 voice_id，如果任务失败则不返回。</p> 
     * @return VoiceId <p>用户自定义的 voice_id，如果任务失败则不返回。</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>用户自定义的 voice_id，如果任务失败则不返回。</p>
     * @param VoiceId <p>用户自定义的 voice_id，如果任务失败则不返回。</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>如果请求体中传入了试听文本 text，那么本参数将以链接形式返回试听音频，否则本参数为空值。</p> 
     * @return DemoAudio <p>如果请求体中传入了试听文本 text，那么本参数将以链接形式返回试听音频，否则本参数为空值。</p>
     */
    public String getDemoAudio() {
        return this.DemoAudio;
    }

    /**
     * Set <p>如果请求体中传入了试听文本 text，那么本参数将以链接形式返回试听音频，否则本参数为空值。</p>
     * @param DemoAudio <p>如果请求体中传入了试听文本 text，那么本参数将以链接形式返回试听音频，否则本参数为空值。</p>
     */
    public void setDemoAudio(String DemoAudio) {
        this.DemoAudio = DemoAudio;
    }

    /**
     * Get <p>本次调用时传入的透传参数。</p> 
     * @return Payload <p>本次调用时传入的透传参数。</p>
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set <p>本次调用时传入的透传参数。</p>
     * @param Payload <p>本次调用时传入的透传参数。</p>
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get <p>任务创建时间。</p> 
     * @return CreatedAt <p>任务创建时间。</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>任务创建时间。</p>
     * @param CreatedAt <p>任务创建时间。</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    public CreateAigcAudioCloneOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAigcAudioCloneOutput(CreateAigcAudioCloneOutput source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.DemoAudio != null) {
            this.DemoAudio = new String(source.DemoAudio);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "DemoAudio", this.DemoAudio);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);

    }
}

