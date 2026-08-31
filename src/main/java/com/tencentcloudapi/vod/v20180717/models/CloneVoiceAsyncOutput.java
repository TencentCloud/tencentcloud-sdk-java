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

public class CloneVoiceAsyncOutput extends AbstractModel {

    /**
    * <p>音色ID</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>试听音频</p>
    */
    @SerializedName("DemoAudio")
    @Expose
    private String DemoAudio;

    /**
    * <p>扩展信息</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>音色ID</p> 
     * @return VoiceId <p>音色ID</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色ID</p>
     * @param VoiceId <p>音色ID</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>试听音频</p> 
     * @return DemoAudio <p>试听音频</p>
     */
    public String getDemoAudio() {
        return this.DemoAudio;
    }

    /**
     * Set <p>试听音频</p>
     * @param DemoAudio <p>试听音频</p>
     */
    public void setDemoAudio(String DemoAudio) {
        this.DemoAudio = DemoAudio;
    }

    /**
     * Get <p>扩展信息</p> 
     * @return ExtInfo <p>扩展信息</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>扩展信息</p>
     * @param ExtInfo <p>扩展信息</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public CloneVoiceAsyncOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneVoiceAsyncOutput(CloneVoiceAsyncOutput source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.DemoAudio != null) {
            this.DemoAudio = new String(source.DemoAudio);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "DemoAudio", this.DemoAudio);
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

