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
    * 应用类型；knowledge_qa-知识问答管理
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用基础配置
    */
    @SerializedName("BaseConfig")
    @Expose
    private BaseConfig BaseConfig;

    /**
    * 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 智能体类型 dialogue 对话式智能体，wechat 公众号智能体
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
     * Get 应用类型；knowledge_qa-知识问答管理 
     * @return AppType 应用类型；knowledge_qa-知识问答管理
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型；knowledge_qa-知识问答管理
     * @param AppType 应用类型；knowledge_qa-知识问答管理
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 应用基础配置 
     * @return BaseConfig 应用基础配置
     */
    public BaseConfig getBaseConfig() {
        return this.BaseConfig;
    }

    /**
     * Set 应用基础配置
     * @param BaseConfig 应用基础配置
     */
    public void setBaseConfig(BaseConfig BaseConfig) {
        this.BaseConfig = BaseConfig;
    }

    /**
     * Get 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式 
     * @return Pattern 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
     * @param Pattern 应用模式 standard:标准模式, agent: agent模式，single_workflow：单工作流模式
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 智能体类型 dialogue 对话式智能体，wechat 公众号智能体 
     * @return AgentType 智能体类型 dialogue 对话式智能体，wechat 公众号智能体
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 智能体类型 dialogue 对话式智能体，wechat 公众号智能体
     * @param AgentType 智能体类型 dialogue 对话式智能体，wechat 公众号智能体
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

