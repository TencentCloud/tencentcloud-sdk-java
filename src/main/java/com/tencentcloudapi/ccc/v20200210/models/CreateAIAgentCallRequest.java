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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAIAgentCallRequest extends AbstractModel {

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * AI智能体ID
    */
    @SerializedName("AIAgentId")
    @Expose
    private Long AIAgentId;

    /**
    * 被叫号码
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 主叫号码列表
    */
    @SerializedName("Callers")
    @Expose
    private String [] Callers;

    /**
    * 提示词变量
    */
    @SerializedName("PromptVariables")
    @Expose
    private Variable [] PromptVariables;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get AI智能体ID 
     * @return AIAgentId AI智能体ID
     */
    public Long getAIAgentId() {
        return this.AIAgentId;
    }

    /**
     * Set AI智能体ID
     * @param AIAgentId AI智能体ID
     */
    public void setAIAgentId(Long AIAgentId) {
        this.AIAgentId = AIAgentId;
    }

    /**
     * Get 被叫号码 
     * @return Callee 被叫号码
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码
     * @param Callee 被叫号码
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 主叫号码列表 
     * @return Callers 主叫号码列表
     */
    public String [] getCallers() {
        return this.Callers;
    }

    /**
     * Set 主叫号码列表
     * @param Callers 主叫号码列表
     */
    public void setCallers(String [] Callers) {
        this.Callers = Callers;
    }

    /**
     * Get 提示词变量 
     * @return PromptVariables 提示词变量
     */
    public Variable [] getPromptVariables() {
        return this.PromptVariables;
    }

    /**
     * Set 提示词变量
     * @param PromptVariables 提示词变量
     */
    public void setPromptVariables(Variable [] PromptVariables) {
        this.PromptVariables = PromptVariables;
    }

    public CreateAIAgentCallRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAIAgentCallRequest(CreateAIAgentCallRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.AIAgentId != null) {
            this.AIAgentId = new Long(source.AIAgentId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Callers != null) {
            this.Callers = new String[source.Callers.length];
            for (int i = 0; i < source.Callers.length; i++) {
                this.Callers[i] = new String(source.Callers[i]);
            }
        }
        if (source.PromptVariables != null) {
            this.PromptVariables = new Variable[source.PromptVariables.length];
            for (int i = 0; i < source.PromptVariables.length; i++) {
                this.PromptVariables[i] = new Variable(source.PromptVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AIAgentId", this.AIAgentId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamArraySimple(map, prefix + "Callers.", this.Callers);
        this.setParamArrayObj(map, prefix + "PromptVariables.", this.PromptVariables);

    }
}

