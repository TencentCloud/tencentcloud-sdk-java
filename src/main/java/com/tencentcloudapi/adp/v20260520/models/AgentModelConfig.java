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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentModelConfig extends AbstractModel {

    /**
    * <p>模型唯一id</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>模型别名</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>模型上下文长度字符限制</p>
    */
    @SerializedName("ContextWordsLimit")
    @Expose
    private Long ContextWordsLimit;

    /**
    * <p>指令长度字符限制</p>
    */
    @SerializedName("InstructionsWordsLimit")
    @Expose
    private Long InstructionsWordsLimit;

    /**
    * <p>模型参数</p>
    */
    @SerializedName("ModelParameters")
    @Expose
    private ModelParams ModelParameters;

    /**
     * Get <p>模型唯一id</p> 
     * @return ModelId <p>模型唯一id</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型唯一id</p>
     * @param ModelId <p>模型唯一id</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>模型别名</p> 
     * @return Alias <p>模型别名</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>模型别名</p>
     * @param Alias <p>模型别名</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>模型上下文长度字符限制</p> 
     * @return ContextWordsLimit <p>模型上下文长度字符限制</p>
     */
    public Long getContextWordsLimit() {
        return this.ContextWordsLimit;
    }

    /**
     * Set <p>模型上下文长度字符限制</p>
     * @param ContextWordsLimit <p>模型上下文长度字符限制</p>
     */
    public void setContextWordsLimit(Long ContextWordsLimit) {
        this.ContextWordsLimit = ContextWordsLimit;
    }

    /**
     * Get <p>指令长度字符限制</p> 
     * @return InstructionsWordsLimit <p>指令长度字符限制</p>
     */
    public Long getInstructionsWordsLimit() {
        return this.InstructionsWordsLimit;
    }

    /**
     * Set <p>指令长度字符限制</p>
     * @param InstructionsWordsLimit <p>指令长度字符限制</p>
     */
    public void setInstructionsWordsLimit(Long InstructionsWordsLimit) {
        this.InstructionsWordsLimit = InstructionsWordsLimit;
    }

    /**
     * Get <p>模型参数</p> 
     * @return ModelParameters <p>模型参数</p>
     */
    public ModelParams getModelParameters() {
        return this.ModelParameters;
    }

    /**
     * Set <p>模型参数</p>
     * @param ModelParameters <p>模型参数</p>
     */
    public void setModelParameters(ModelParams ModelParameters) {
        this.ModelParameters = ModelParameters;
    }

    public AgentModelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentModelConfig(AgentModelConfig source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.ContextWordsLimit != null) {
            this.ContextWordsLimit = new Long(source.ContextWordsLimit);
        }
        if (source.InstructionsWordsLimit != null) {
            this.InstructionsWordsLimit = new Long(source.InstructionsWordsLimit);
        }
        if (source.ModelParameters != null) {
            this.ModelParameters = new ModelParams(source.ModelParameters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "ContextWordsLimit", this.ContextWordsLimit);
        this.setParamSimple(map, prefix + "InstructionsWordsLimit", this.InstructionsWordsLimit);
        this.setParamObj(map, prefix + "ModelParameters.", this.ModelParameters);

    }
}

