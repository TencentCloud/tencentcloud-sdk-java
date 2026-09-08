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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenMem0ServiceRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>AgenticBaseID，开启Mem0服务前请先开通AgenticBase套餐</p>
    */
    @SerializedName("AgenticBaseId")
    @Expose
    private String AgenticBaseId;

    /**
    * <p>Mem0服务使用的LLM模型</p><p>枚举值：</p><ul><li>auto： 自动选择合适的模型</li><li>deepseek-v4-flash： deepseek-v4-flash</li><li>deepseek-v4-pro： deepseek-v4-pro</li><li>glm-5： glm-5</li><li>glm-5-turbo： glm-5-turbo</li><li>glm-5.1： glm-5.1</li><li>kimi-k2.5： kimi-k2.5</li><li>kimi-k2.6： kimi-k2.6</li><li>minimax-m2.5： minimax-m2.5</li><li>minimax-m2.7： minimax-m2.7</li></ul>
    */
    @SerializedName("LLMModel")
    @Expose
    private String LLMModel;

    /**
    * <p>请前往腾讯云Tokenhub开通服务将ApiKey填入</p>
    */
    @SerializedName("EmbeddingApiKey")
    @Expose
    private String EmbeddingApiKey;

    /**
     * Get <p>实例ID</p> 
     * @return DBInstanceId <p>实例ID</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param DBInstanceId <p>实例ID</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>AgenticBaseID，开启Mem0服务前请先开通AgenticBase套餐</p> 
     * @return AgenticBaseId <p>AgenticBaseID，开启Mem0服务前请先开通AgenticBase套餐</p>
     */
    public String getAgenticBaseId() {
        return this.AgenticBaseId;
    }

    /**
     * Set <p>AgenticBaseID，开启Mem0服务前请先开通AgenticBase套餐</p>
     * @param AgenticBaseId <p>AgenticBaseID，开启Mem0服务前请先开通AgenticBase套餐</p>
     */
    public void setAgenticBaseId(String AgenticBaseId) {
        this.AgenticBaseId = AgenticBaseId;
    }

    /**
     * Get <p>Mem0服务使用的LLM模型</p><p>枚举值：</p><ul><li>auto： 自动选择合适的模型</li><li>deepseek-v4-flash： deepseek-v4-flash</li><li>deepseek-v4-pro： deepseek-v4-pro</li><li>glm-5： glm-5</li><li>glm-5-turbo： glm-5-turbo</li><li>glm-5.1： glm-5.1</li><li>kimi-k2.5： kimi-k2.5</li><li>kimi-k2.6： kimi-k2.6</li><li>minimax-m2.5： minimax-m2.5</li><li>minimax-m2.7： minimax-m2.7</li></ul> 
     * @return LLMModel <p>Mem0服务使用的LLM模型</p><p>枚举值：</p><ul><li>auto： 自动选择合适的模型</li><li>deepseek-v4-flash： deepseek-v4-flash</li><li>deepseek-v4-pro： deepseek-v4-pro</li><li>glm-5： glm-5</li><li>glm-5-turbo： glm-5-turbo</li><li>glm-5.1： glm-5.1</li><li>kimi-k2.5： kimi-k2.5</li><li>kimi-k2.6： kimi-k2.6</li><li>minimax-m2.5： minimax-m2.5</li><li>minimax-m2.7： minimax-m2.7</li></ul>
     */
    public String getLLMModel() {
        return this.LLMModel;
    }

    /**
     * Set <p>Mem0服务使用的LLM模型</p><p>枚举值：</p><ul><li>auto： 自动选择合适的模型</li><li>deepseek-v4-flash： deepseek-v4-flash</li><li>deepseek-v4-pro： deepseek-v4-pro</li><li>glm-5： glm-5</li><li>glm-5-turbo： glm-5-turbo</li><li>glm-5.1： glm-5.1</li><li>kimi-k2.5： kimi-k2.5</li><li>kimi-k2.6： kimi-k2.6</li><li>minimax-m2.5： minimax-m2.5</li><li>minimax-m2.7： minimax-m2.7</li></ul>
     * @param LLMModel <p>Mem0服务使用的LLM模型</p><p>枚举值：</p><ul><li>auto： 自动选择合适的模型</li><li>deepseek-v4-flash： deepseek-v4-flash</li><li>deepseek-v4-pro： deepseek-v4-pro</li><li>glm-5： glm-5</li><li>glm-5-turbo： glm-5-turbo</li><li>glm-5.1： glm-5.1</li><li>kimi-k2.5： kimi-k2.5</li><li>kimi-k2.6： kimi-k2.6</li><li>minimax-m2.5： minimax-m2.5</li><li>minimax-m2.7： minimax-m2.7</li></ul>
     */
    public void setLLMModel(String LLMModel) {
        this.LLMModel = LLMModel;
    }

    /**
     * Get <p>请前往腾讯云Tokenhub开通服务将ApiKey填入</p> 
     * @return EmbeddingApiKey <p>请前往腾讯云Tokenhub开通服务将ApiKey填入</p>
     */
    public String getEmbeddingApiKey() {
        return this.EmbeddingApiKey;
    }

    /**
     * Set <p>请前往腾讯云Tokenhub开通服务将ApiKey填入</p>
     * @param EmbeddingApiKey <p>请前往腾讯云Tokenhub开通服务将ApiKey填入</p>
     */
    public void setEmbeddingApiKey(String EmbeddingApiKey) {
        this.EmbeddingApiKey = EmbeddingApiKey;
    }

    public OpenMem0ServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenMem0ServiceRequest(OpenMem0ServiceRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.AgenticBaseId != null) {
            this.AgenticBaseId = new String(source.AgenticBaseId);
        }
        if (source.LLMModel != null) {
            this.LLMModel = new String(source.LLMModel);
        }
        if (source.EmbeddingApiKey != null) {
            this.EmbeddingApiKey = new String(source.EmbeddingApiKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "AgenticBaseId", this.AgenticBaseId);
        this.setParamSimple(map, prefix + "LLMModel", this.LLMModel);
        this.setParamSimple(map, prefix + "EmbeddingApiKey", this.EmbeddingApiKey);

    }
}

