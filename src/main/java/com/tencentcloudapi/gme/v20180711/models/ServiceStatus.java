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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceStatus extends AbstractModel{

    /**
    * 实时语音服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTimeSpeech")
    @Expose
    private StatusInfo RealTimeSpeech;

    /**
    * 语音消息服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceMessage")
    @Expose
    private StatusInfo VoiceMessage;

    /**
    * 语音内容安全服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Porn")
    @Expose
    private StatusInfo Porn;

    /**
    * 语音录制服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Live")
    @Expose
    private StatusInfo Live;

    /**
    * 语音转文本服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTimeAsr")
    @Expose
    private StatusInfo RealTimeAsr;

    /**
     * Get 实时语音服务开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTimeSpeech 实时语音服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusInfo getRealTimeSpeech() {
        return this.RealTimeSpeech;
    }

    /**
     * Set 实时语音服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTimeSpeech 实时语音服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTimeSpeech(StatusInfo RealTimeSpeech) {
        this.RealTimeSpeech = RealTimeSpeech;
    }

    /**
     * Get 语音消息服务开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceMessage 语音消息服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusInfo getVoiceMessage() {
        return this.VoiceMessage;
    }

    /**
     * Set 语音消息服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceMessage 语音消息服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceMessage(StatusInfo VoiceMessage) {
        this.VoiceMessage = VoiceMessage;
    }

    /**
     * Get 语音内容安全服务开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Porn 语音内容安全服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusInfo getPorn() {
        return this.Porn;
    }

    /**
     * Set 语音内容安全服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Porn 语音内容安全服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPorn(StatusInfo Porn) {
        this.Porn = Porn;
    }

    /**
     * Get 语音录制服务开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Live 语音录制服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusInfo getLive() {
        return this.Live;
    }

    /**
     * Set 语音录制服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Live 语音录制服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLive(StatusInfo Live) {
        this.Live = Live;
    }

    /**
     * Get 语音转文本服务开关状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTimeAsr 语音转文本服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusInfo getRealTimeAsr() {
        return this.RealTimeAsr;
    }

    /**
     * Set 语音转文本服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTimeAsr 语音转文本服务开关状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTimeAsr(StatusInfo RealTimeAsr) {
        this.RealTimeAsr = RealTimeAsr;
    }

    public ServiceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceStatus(ServiceStatus source) {
        if (source.RealTimeSpeech != null) {
            this.RealTimeSpeech = new StatusInfo(source.RealTimeSpeech);
        }
        if (source.VoiceMessage != null) {
            this.VoiceMessage = new StatusInfo(source.VoiceMessage);
        }
        if (source.Porn != null) {
            this.Porn = new StatusInfo(source.Porn);
        }
        if (source.Live != null) {
            this.Live = new StatusInfo(source.Live);
        }
        if (source.RealTimeAsr != null) {
            this.RealTimeAsr = new StatusInfo(source.RealTimeAsr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RealTimeSpeech.", this.RealTimeSpeech);
        this.setParamObj(map, prefix + "VoiceMessage.", this.VoiceMessage);
        this.setParamObj(map, prefix + "Porn.", this.Porn);
        this.setParamObj(map, prefix + "Live.", this.Live);
        this.setParamObj(map, prefix + "RealTimeAsr.", this.RealTimeAsr);

    }
}

