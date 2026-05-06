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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppRequest extends AbstractModel {

    /**
    * <p>应用类型；<code>&quot;knowledge_qa&quot;</code> 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）</p>
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * <p>应用基础配置</p>
    */
    @SerializedName("BaseConfig")
    @Expose
    private BaseConfig BaseConfig;

    /**
    * <p>应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式,ClawAgent:Claw模式</p>
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * <p>智能体类型，用于区分应用最终以何种智能体形态对外服务（对话(&quot;dialogue&quot;) / 公众号(&quot;wechat&quot;)）。当前 ADP 创建页面不区分对话/公众号智能体，ADP 创建页默认走对话智能体。</p>
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
     * Get <p>应用类型；<code>&quot;knowledge_qa&quot;</code> 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）</p> 
     * @return AppType <p>应用类型；<code>&quot;knowledge_qa&quot;</code> 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）</p>
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>应用类型；<code>&quot;knowledge_qa&quot;</code> 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）</p>
     * @param AppType <p>应用类型；<code>&quot;knowledge_qa&quot;</code> 知识问答应用（包含标准模式 单工作流 Multi-Agent 等模式）</p>
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>应用基础配置</p> 
     * @return BaseConfig <p>应用基础配置</p>
     */
    public BaseConfig getBaseConfig() {
        return this.BaseConfig;
    }

    /**
     * Set <p>应用基础配置</p>
     * @param BaseConfig <p>应用基础配置</p>
     */
    public void setBaseConfig(BaseConfig BaseConfig) {
        this.BaseConfig = BaseConfig;
    }

    /**
     * Get <p>应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式,ClawAgent:Claw模式</p> 
     * @return Pattern <p>应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式,ClawAgent:Claw模式</p>
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set <p>应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式,ClawAgent:Claw模式</p>
     * @param Pattern <p>应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式,ClawAgent:Claw模式</p>
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get <p>智能体类型，用于区分应用最终以何种智能体形态对外服务（对话(&quot;dialogue&quot;) / 公众号(&quot;wechat&quot;)）。当前 ADP 创建页面不区分对话/公众号智能体，ADP 创建页默认走对话智能体。</p> 
     * @return AgentType <p>智能体类型，用于区分应用最终以何种智能体形态对外服务（对话(&quot;dialogue&quot;) / 公众号(&quot;wechat&quot;)）。当前 ADP 创建页面不区分对话/公众号智能体，ADP 创建页默认走对话智能体。</p>
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set <p>智能体类型，用于区分应用最终以何种智能体形态对外服务（对话(&quot;dialogue&quot;) / 公众号(&quot;wechat&quot;)）。当前 ADP 创建页面不区分对话/公众号智能体，ADP 创建页默认走对话智能体。</p>
     * @param AgentType <p>智能体类型，用于区分应用最终以何种智能体形态对外服务（对话(&quot;dialogue&quot;) / 公众号(&quot;wechat&quot;)）。当前 ADP 创建页面不区分对话/公众号智能体，ADP 创建页默认走对话智能体。</p>
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    public CreateAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAppRequest(CreateAppRequest source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.BaseConfig != null) {
            this.BaseConfig = new BaseConfig(source.BaseConfig);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamObj(map, prefix + "BaseConfig.", this.BaseConfig);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);

    }
}

