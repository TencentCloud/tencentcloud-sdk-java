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

public class VoiceConfig extends AbstractModel {

    /**
    * 公有云音色id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
    * 音色key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * 音色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
     * Get 公有云音色id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceType 公有云音色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 公有云音色id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceType 公有云音色id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get 音色key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimbreKey 音色key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set 音色key
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimbreKey 音色key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get 音色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceName 音色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 音色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceName 音色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    public VoiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConfig(VoiceConfig source) {
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);

    }
}

