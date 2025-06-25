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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentPluginInfo extends AbstractModel {

    /**
    * 插件id
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 应用配置的插件header信息
    */
    @SerializedName("Headers")
    @Expose
    private AgentPluginHeader [] Headers;

    /**
    * 插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型
    */
    @SerializedName("Model")
    @Expose
    private AgentModelInfo Model;

    /**
    * 插件信息类型; 0: 未指定类型; 1: 知识库问答插件
    */
    @SerializedName("PluginInfoType")
    @Expose
    private Long PluginInfoType;

    /**
    * 知识库问答插件配置
    */
    @SerializedName("KnowledgeQa")
    @Expose
    private AgentKnowledgeQAPlugin KnowledgeQa;

    /**
     * Get 插件id 
     * @return PluginId 插件id
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件id
     * @param PluginId 插件id
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 应用配置的插件header信息 
     * @return Headers 应用配置的插件header信息
     */
    public AgentPluginHeader [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 应用配置的插件header信息
     * @param Headers 应用配置的插件header信息
     */
    public void setHeaders(AgentPluginHeader [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get 插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型 
     * @return Model 插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型
     */
    public AgentModelInfo getModel() {
        return this.Model;
    }

    /**
     * Set 插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型
     * @param Model 插件调用LLM时使用的模型配置，一般用于指定知识库问答插件的生成模型
     */
    public void setModel(AgentModelInfo Model) {
        this.Model = Model;
    }

    /**
     * Get 插件信息类型; 0: 未指定类型; 1: 知识库问答插件 
     * @return PluginInfoType 插件信息类型; 0: 未指定类型; 1: 知识库问答插件
     */
    public Long getPluginInfoType() {
        return this.PluginInfoType;
    }

    /**
     * Set 插件信息类型; 0: 未指定类型; 1: 知识库问答插件
     * @param PluginInfoType 插件信息类型; 0: 未指定类型; 1: 知识库问答插件
     */
    public void setPluginInfoType(Long PluginInfoType) {
        this.PluginInfoType = PluginInfoType;
    }

    /**
     * Get 知识库问答插件配置 
     * @return KnowledgeQa 知识库问答插件配置
     */
    public AgentKnowledgeQAPlugin getKnowledgeQa() {
        return this.KnowledgeQa;
    }

    /**
     * Set 知识库问答插件配置
     * @param KnowledgeQa 知识库问答插件配置
     */
    public void setKnowledgeQa(AgentKnowledgeQAPlugin KnowledgeQa) {
        this.KnowledgeQa = KnowledgeQa;
    }

    public AgentPluginInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentPluginInfo(AgentPluginInfo source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.Headers != null) {
            this.Headers = new AgentPluginHeader[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new AgentPluginHeader(source.Headers[i]);
            }
        }
        if (source.Model != null) {
            this.Model = new AgentModelInfo(source.Model);
        }
        if (source.PluginInfoType != null) {
            this.PluginInfoType = new Long(source.PluginInfoType);
        }
        if (source.KnowledgeQa != null) {
            this.KnowledgeQa = new AgentKnowledgeQAPlugin(source.KnowledgeQa);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamSimple(map, prefix + "PluginInfoType", this.PluginInfoType);
        this.setParamObj(map, prefix + "KnowledgeQa.", this.KnowledgeQa);

    }
}

