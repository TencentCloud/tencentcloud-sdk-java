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

public class TextTranslationResponse extends AbstractModel {

    /**
    * <p>翻译后的文本</p>
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * <p>源语言，详见入参Source</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>目标语言，详见入参Target</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>翻译后的文本</p> 
     * @return TargetText <p>翻译后的文本</p>
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set <p>翻译后的文本</p>
     * @param TargetText <p>翻译后的文本</p>
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get <p>源语言，详见入参Source</p> 
     * @return Source <p>源语言，详见入参Source</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>源语言，详见入参Source</p>
     * @param Source <p>源语言，详见入参Source</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标语言，详见入参Target</p> 
     * @return Target <p>目标语言，详见入参Target</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>目标语言，详见入参Target</p>
     * @param Target <p>目标语言，详见入参Target</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public TextTranslationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTranslationResponse(TextTranslationResponse source) {
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetText", this.TargetText);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

