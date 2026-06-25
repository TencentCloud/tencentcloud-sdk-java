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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayLLMModelFallbackRule extends AbstractModel {

    /**
    * 备选模型，主模型不可用时将依次按顺序尝试。
    */
    @SerializedName("FallbackModels")
    @Expose
    private String [] FallbackModels;

    /**
     * Get 备选模型，主模型不可用时将依次按顺序尝试。 
     * @return FallbackModels 备选模型，主模型不可用时将依次按顺序尝试。
     */
    public String [] getFallbackModels() {
        return this.FallbackModels;
    }

    /**
     * Set 备选模型，主模型不可用时将依次按顺序尝试。
     * @param FallbackModels 备选模型，主模型不可用时将依次按顺序尝试。
     */
    public void setFallbackModels(String [] FallbackModels) {
        this.FallbackModels = FallbackModels;
    }

    public CloudNativeAPIGatewayLLMModelFallbackRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayLLMModelFallbackRule(CloudNativeAPIGatewayLLMModelFallbackRule source) {
        if (source.FallbackModels != null) {
            this.FallbackModels = new String[source.FallbackModels.length];
            for (int i = 0; i < source.FallbackModels.length; i++) {
                this.FallbackModels[i] = new String(source.FallbackModels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FallbackModels.", this.FallbackModels);

    }
}

