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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConfig extends AbstractModel {

    /**
    * 数智人音色key,需要和公有云音色id对齐
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * 音色名称
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * 公有云音色id
    */
    @SerializedName("VoiceType")
    @Expose
    private Long VoiceType;

    /**
     * Get 数智人音色key,需要和公有云音色id对齐 
     * @return TimbreKey 数智人音色key,需要和公有云音色id对齐
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set 数智人音色key,需要和公有云音色id对齐
     * @param TimbreKey 数智人音色key,需要和公有云音色id对齐
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get 音色名称 
     * @return VoiceName 音色名称
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set 音色名称
     * @param VoiceName 音色名称
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
    }

    /**
     * Get 公有云音色id 
     * @return VoiceType 公有云音色id
     */
    public Long getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set 公有云音色id
     * @param VoiceType 公有云音色id
     */
    public void setVoiceType(Long VoiceType) {
        this.VoiceType = VoiceType;
    }

    public VoiceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConfig(VoiceConfig source) {
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new Long(source.VoiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);

    }
}

