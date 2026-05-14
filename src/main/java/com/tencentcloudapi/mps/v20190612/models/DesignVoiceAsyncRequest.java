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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DesignVoiceAsyncRequest extends AbstractModel {

    /**
    * <p>音色描述</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>音色属性</p>
    */
    @SerializedName("VoiceProfile")
    @Expose
    private VoiceProfile VoiceProfile;

    /**
    * <p>试听音频文本。长度不超过500</p>
    */
    @SerializedName("Text")
    @Expose
    private String Text;

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
     * Get <p>音色属性</p> 
     * @return VoiceProfile <p>音色属性</p>
     */
    public VoiceProfile getVoiceProfile() {
        return this.VoiceProfile;
    }

    /**
     * Set <p>音色属性</p>
     * @param VoiceProfile <p>音色属性</p>
     */
    public void setVoiceProfile(VoiceProfile VoiceProfile) {
        this.VoiceProfile = VoiceProfile;
    }

    /**
     * Get <p>试听音频文本。长度不超过500</p> 
     * @return Text <p>试听音频文本。长度不超过500</p>
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set <p>试听音频文本。长度不超过500</p>
     * @param Text <p>试听音频文本。长度不超过500</p>
     */
    public void setText(String Text) {
        this.Text = Text;
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

    public DesignVoiceAsyncRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesignVoiceAsyncRequest(DesignVoiceAsyncRequest source) {
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.VoiceProfile != null) {
            this.VoiceProfile = new VoiceProfile(source.VoiceProfile);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
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
        this.setParamObj(map, prefix + "VoiceProfile.", this.VoiceProfile);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

