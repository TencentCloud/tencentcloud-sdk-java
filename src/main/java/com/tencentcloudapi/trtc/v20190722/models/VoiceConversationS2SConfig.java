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

public class VoiceConversationS2SConfig extends AbstractModel {

    /**
    * <p>S2S 厂商标识，例如&quot;tencent&quot;。</p>
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
    * <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
    */
    @SerializedName("WelcomeMessage")
    @Expose
    private String WelcomeMessage;

    /**
     * Get <p>S2S 厂商标识，例如&quot;tencent&quot;。</p> 
     * @return Provider <p>S2S 厂商标识，例如&quot;tencent&quot;。</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>S2S 厂商标识，例如&quot;tencent&quot;。</p>
     * @param Provider <p>S2S 厂商标识，例如&quot;tencent&quot;。</p>
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

    /**
     * Get <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p> 
     * @return WelcomeMessage <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
     */
    public String getWelcomeMessage() {
        return this.WelcomeMessage;
    }

    /**
     * Set <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
     * @param WelcomeMessage <p>主播首次进房主动播报的欢迎语，主播退房后再次进房也会播报。</p>
     */
    public void setWelcomeMessage(String WelcomeMessage) {
        this.WelcomeMessage = WelcomeMessage;
    }

    public VoiceConversationS2SConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceConversationS2SConfig(VoiceConversationS2SConfig source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.WelcomeMessage != null) {
            this.WelcomeMessage = new String(source.WelcomeMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "WelcomeMessage", this.WelcomeMessage);

    }
}

