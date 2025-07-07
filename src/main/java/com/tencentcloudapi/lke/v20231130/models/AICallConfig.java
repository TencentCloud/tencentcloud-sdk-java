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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallConfig extends AbstractModel {

    /**
    * 启用语音互动功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableVoiceInteract")
    @Expose
    private Boolean EnableVoiceInteract;

    /**
    * 启用语音通话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableVoiceCall")
    @Expose
    private Boolean EnableVoiceCall;

    /**
    * 启用数智人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableDigitalHuman")
    @Expose
    private Boolean EnableDigitalHuman;

    /**
    * 音色配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Voice")
    @Expose
    private VoiceConfig Voice;

    /**
    * 数智人配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DigitalHuman")
    @Expose
    private DigitalHumanConfig DigitalHuman;

    /**
     * Get 启用语音互动功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableVoiceInteract 启用语音互动功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableVoiceInteract() {
        return this.EnableVoiceInteract;
    }

    /**
     * Set 启用语音互动功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableVoiceInteract 启用语音互动功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableVoiceInteract(Boolean EnableVoiceInteract) {
        this.EnableVoiceInteract = EnableVoiceInteract;
    }

    /**
     * Get 启用语音通话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableVoiceCall 启用语音通话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableVoiceCall() {
        return this.EnableVoiceCall;
    }

    /**
     * Set 启用语音通话
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableVoiceCall 启用语音通话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableVoiceCall(Boolean EnableVoiceCall) {
        this.EnableVoiceCall = EnableVoiceCall;
    }

    /**
     * Get 启用数智人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableDigitalHuman 启用数智人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableDigitalHuman() {
        return this.EnableDigitalHuman;
    }

    /**
     * Set 启用数智人
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableDigitalHuman 启用数智人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableDigitalHuman(Boolean EnableDigitalHuman) {
        this.EnableDigitalHuman = EnableDigitalHuman;
    }

    /**
     * Get 音色配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Voice 音色配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceConfig getVoice() {
        return this.Voice;
    }

    /**
     * Set 音色配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Voice 音色配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoice(VoiceConfig Voice) {
        this.Voice = Voice;
    }

    /**
     * Get 数智人配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DigitalHuman 数智人配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DigitalHumanConfig getDigitalHuman() {
        return this.DigitalHuman;
    }

    /**
     * Set 数智人配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DigitalHuman 数智人配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDigitalHuman(DigitalHumanConfig DigitalHuman) {
        this.DigitalHuman = DigitalHuman;
    }

    public AICallConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallConfig(AICallConfig source) {
        if (source.EnableVoiceInteract != null) {
            this.EnableVoiceInteract = new Boolean(source.EnableVoiceInteract);
        }
        if (source.EnableVoiceCall != null) {
            this.EnableVoiceCall = new Boolean(source.EnableVoiceCall);
        }
        if (source.EnableDigitalHuman != null) {
            this.EnableDigitalHuman = new Boolean(source.EnableDigitalHuman);
        }
        if (source.Voice != null) {
            this.Voice = new VoiceConfig(source.Voice);
        }
        if (source.DigitalHuman != null) {
            this.DigitalHuman = new DigitalHumanConfig(source.DigitalHuman);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableVoiceInteract", this.EnableVoiceInteract);
        this.setParamSimple(map, prefix + "EnableVoiceCall", this.EnableVoiceCall);
        this.setParamSimple(map, prefix + "EnableDigitalHuman", this.EnableDigitalHuman);
        this.setParamObj(map, prefix + "Voice.", this.Voice);
        this.setParamObj(map, prefix + "DigitalHuman.", this.DigitalHuman);

    }
}

