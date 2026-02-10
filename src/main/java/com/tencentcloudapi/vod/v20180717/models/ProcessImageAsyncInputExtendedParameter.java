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

public class ProcessImageAsyncInputExtendedParameter extends AbstractModel {

    /**
    * 输入模型的提示词。
    */
    @SerializedName("Prompts")
    @Expose
    private String [] Prompts;

    /**
     * Get 输入模型的提示词。 
     * @return Prompts 输入模型的提示词。
     */
    public String [] getPrompts() {
        return this.Prompts;
    }

    /**
     * Set 输入模型的提示词。
     * @param Prompts 输入模型的提示词。
     */
    public void setPrompts(String [] Prompts) {
        this.Prompts = Prompts;
    }

    public ProcessImageAsyncInputExtendedParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessImageAsyncInputExtendedParameter(ProcessImageAsyncInputExtendedParameter source) {
        if (source.Prompts != null) {
            this.Prompts = new String[source.Prompts.length];
            for (int i = 0; i < source.Prompts.length; i++) {
                this.Prompts[i] = new String(source.Prompts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Prompts.", this.Prompts);

    }
}

