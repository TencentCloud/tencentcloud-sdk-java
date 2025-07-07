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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTranslateResponse extends AbstractModel {

    /**
    * 翻译后的文本
    */
    @SerializedName("TargetText")
    @Expose
    private String TargetText;

    /**
    * 源语言，详见入参Source
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言，详见入参Target
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 本次翻译消耗的字符数
    */
    @SerializedName("UsedAmount")
    @Expose
    private Long UsedAmount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 翻译后的文本 
     * @return TargetText 翻译后的文本
     */
    public String getTargetText() {
        return this.TargetText;
    }

    /**
     * Set 翻译后的文本
     * @param TargetText 翻译后的文本
     */
    public void setTargetText(String TargetText) {
        this.TargetText = TargetText;
    }

    /**
     * Get 源语言，详见入参Source 
     * @return Source 源语言，详见入参Source
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言，详见入参Source
     * @param Source 源语言，详见入参Source
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言，详见入参Target 
     * @return Target 目标语言，详见入参Target
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言，详见入参Target
     * @param Target 目标语言，详见入参Target
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 本次翻译消耗的字符数 
     * @return UsedAmount 本次翻译消耗的字符数
     */
    public Long getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 本次翻译消耗的字符数
     * @param UsedAmount 本次翻译消耗的字符数
     */
    public void setUsedAmount(Long UsedAmount) {
        this.UsedAmount = UsedAmount;
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

    public TextTranslateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextTranslateResponse(TextTranslateResponse source) {
        if (source.TargetText != null) {
            this.TargetText = new String(source.TargetText);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new Long(source.UsedAmount);
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
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

