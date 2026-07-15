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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkSTTTRTC extends AbstractModel {

    /**
    * <p>识别语言，只支持 <code>zh</code>、<code>16k_zh_large</code></p>
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * <p>VAD 静默检测时间，单位 ms，范围 240–2000</p>
    */
    @SerializedName("VADSilenceTime")
    @Expose
    private Long VADSilenceTime;

    /**
    * <p>远场人声抑制等级，范围 0–5</p>
    */
    @SerializedName("VADLevel")
    @Expose
    private Long VADLevel;

    /**
     * Get <p>识别语言，只支持 <code>zh</code>、<code>16k_zh_large</code></p> 
     * @return Language <p>识别语言，只支持 <code>zh</code>、<code>16k_zh_large</code></p>
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set <p>识别语言，只支持 <code>zh</code>、<code>16k_zh_large</code></p>
     * @param Language <p>识别语言，只支持 <code>zh</code>、<code>16k_zh_large</code></p>
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get <p>VAD 静默检测时间，单位 ms，范围 240–2000</p> 
     * @return VADSilenceTime <p>VAD 静默检测时间，单位 ms，范围 240–2000</p>
     */
    public Long getVADSilenceTime() {
        return this.VADSilenceTime;
    }

    /**
     * Set <p>VAD 静默检测时间，单位 ms，范围 240–2000</p>
     * @param VADSilenceTime <p>VAD 静默检测时间，单位 ms，范围 240–2000</p>
     */
    public void setVADSilenceTime(Long VADSilenceTime) {
        this.VADSilenceTime = VADSilenceTime;
    }

    /**
     * Get <p>远场人声抑制等级，范围 0–5</p> 
     * @return VADLevel <p>远场人声抑制等级，范围 0–5</p>
     */
    public Long getVADLevel() {
        return this.VADLevel;
    }

    /**
     * Set <p>远场人声抑制等级，范围 0–5</p>
     * @param VADLevel <p>远场人声抑制等级，范围 0–5</p>
     */
    public void setVADLevel(Long VADLevel) {
        this.VADLevel = VADLevel;
    }

    public TalkSTTTRTC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkSTTTRTC(TalkSTTTRTC source) {
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.VADSilenceTime != null) {
            this.VADSilenceTime = new Long(source.VADSilenceTime);
        }
        if (source.VADLevel != null) {
            this.VADLevel = new Long(source.VADLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "VADSilenceTime", this.VADSilenceTime);
        this.setParamSimple(map, prefix + "VADLevel", this.VADLevel);

    }
}

