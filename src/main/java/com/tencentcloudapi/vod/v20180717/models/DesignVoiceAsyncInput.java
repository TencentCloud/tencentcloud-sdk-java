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

public class DesignVoiceAsyncInput extends AbstractModel {

    /**
    * <p>音色描述</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>音色信息</p>
    */
    @SerializedName("VoiceSettings")
    @Expose
    private VoiceSettings VoiceSettings;

    /**
    * <p>试听文本</p>
    */
    @SerializedName("PreviewText")
    @Expose
    private String PreviewText;

    /**
    * <p>扩展参数，json字符串</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>音色描述</p> 
     * @return Prompt <p>音色描述</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>音色描述</p>
     * @param Prompt <p>音色描述</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>音色信息</p> 
     * @return VoiceSettings <p>音色信息</p>
     */
    public VoiceSettings getVoiceSettings() {
        return this.VoiceSettings;
    }

    /**
     * Set <p>音色信息</p>
     * @param VoiceSettings <p>音色信息</p>
     */
    public void setVoiceSettings(VoiceSettings VoiceSettings) {
        this.VoiceSettings = VoiceSettings;
    }

    /**
     * Get <p>试听文本</p> 
     * @return PreviewText <p>试听文本</p>
     */
    public String getPreviewText() {
        return this.PreviewText;
    }

    /**
     * Set <p>试听文本</p>
     * @param PreviewText <p>试听文本</p>
     */
    public void setPreviewText(String PreviewText) {
        this.PreviewText = PreviewText;
    }

    /**
     * Get <p>扩展参数，json字符串</p> 
     * @return ExtParam <p>扩展参数，json字符串</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>扩展参数，json字符串</p>
     * @param ExtParam <p>扩展参数，json字符串</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DesignVoiceAsyncInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncInput(DesignVoiceAsyncInput source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.VoiceSettings != null) {
            this.VoiceSettings = new VoiceSettings(source.VoiceSettings);
        }
        if (source.PreviewText != null) {
            this.PreviewText = new String(source.PreviewText);
        }
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamObj(map, prefix + "VoiceSettings.", this.VoiceSettings);
        this.setParamSimple(map, prefix + "PreviewText", this.PreviewText);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

