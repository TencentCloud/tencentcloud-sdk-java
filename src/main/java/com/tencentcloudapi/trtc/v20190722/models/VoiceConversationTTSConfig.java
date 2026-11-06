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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceConversationTTSConfig extends AbstractModel {

    /**
    * <p>TTS 提供厂商，例如trtc。</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>厂商专属参数，JSON 序列化后的字符串。</p>
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
     * Get <p>TTS 提供厂商，例如trtc。</p> 
     * @return Provider <p>TTS 提供厂商，例如trtc。</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>TTS 提供厂商，例如trtc。</p>
     * @param Provider <p>TTS 提供厂商，例如trtc。</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>厂商专属参数，JSON 序列化后的字符串。</p> 
     * @return Params <p>厂商专属参数，JSON 序列化后的字符串。</p>
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>厂商专属参数，JSON 序列化后的字符串。</p>
     * @param Params <p>厂商专属参数，JSON 序列化后的字符串。</p>
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    public VoiceConversationTTSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationTTSConfig(VoiceConversationTTSConfig source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Params", this.Params);

    }
}

