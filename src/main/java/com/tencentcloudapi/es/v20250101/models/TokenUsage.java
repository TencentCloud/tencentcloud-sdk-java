/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenUsage extends AbstractModel {

    /**
    * 表示prompt的tokens数，多次返回中保持不变
    */
    @SerializedName("PromptTokens")
    @Expose
    private Long PromptTokens;

    /**
    * 回答的token总数，在流式返回中，表示到目前为止所有completion的tokens总数，多次返回中持续累加        
    */
    @SerializedName("CompletionTokens")
    @Expose
    private Long CompletionTokens;

    /**
    * 表示prompt_tokens和completion_tokens之和 
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
     * Get 表示prompt的tokens数，多次返回中保持不变 
     * @return PromptTokens 表示prompt的tokens数，多次返回中保持不变
     */
    public Long getPromptTokens() {
        return this.PromptTokens;
    }

    /**
     * Set 表示prompt的tokens数，多次返回中保持不变
     * @param PromptTokens 表示prompt的tokens数，多次返回中保持不变
     */
    public void setPromptTokens(Long PromptTokens) {
        this.PromptTokens = PromptTokens;
    }

    /**
     * Get 回答的token总数，在流式返回中，表示到目前为止所有completion的tokens总数，多次返回中持续累加         
     * @return CompletionTokens 回答的token总数，在流式返回中，表示到目前为止所有completion的tokens总数，多次返回中持续累加        
     */
    public Long getCompletionTokens() {
        return this.CompletionTokens;
    }

    /**
     * Set 回答的token总数，在流式返回中，表示到目前为止所有completion的tokens总数，多次返回中持续累加        
     * @param CompletionTokens 回答的token总数，在流式返回中，表示到目前为止所有completion的tokens总数，多次返回中持续累加        
     */
    public void setCompletionTokens(Long CompletionTokens) {
        this.CompletionTokens = CompletionTokens;
    }

    /**
     * Get 表示prompt_tokens和completion_tokens之和  
     * @return TotalTokens 表示prompt_tokens和completion_tokens之和 
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 表示prompt_tokens和completion_tokens之和 
     * @param TotalTokens 表示prompt_tokens和completion_tokens之和 
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    public TokenUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenUsage(TokenUsage source) {
        if (source.PromptTokens != null) {
            this.PromptTokens = new Long(source.PromptTokens);
        }
        if (source.CompletionTokens != null) {
            this.CompletionTokens = new Long(source.CompletionTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptTokens", this.PromptTokens);
        this.setParamSimple(map, prefix + "CompletionTokens", this.CompletionTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);

    }
}

