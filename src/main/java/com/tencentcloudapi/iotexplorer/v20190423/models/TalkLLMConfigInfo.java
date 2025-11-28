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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkLLMConfigInfo extends AbstractModel {

    /**
    * 支持的LLM类型，openai-OPENAI格式。
    */
    @SerializedName("LLMType")
    @Expose
    private String LLMType;

    /**
    * 是否开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 模型
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 是否开启
    */
    @SerializedName("Streaming")
    @Expose
    private Boolean Streaming;

    /**
    * 配置信息JSON字符串，根据`LLMType`进行不同的值匹配。例如`LLMType`是`openai`，`Config`值是`{\"ApiKey\":\"sk-09***\",\"ApiUrl\":\"base_url\",\"SystemPrompt\":\"你是一个语音助手\",\"Timeout\":30,\"History\":0,\"MetaInfo\":{\"productID\":\"test\"}}`

## openai
```
{
   "ApiKey": "sk-XXXXXXXXXXXX",
   "ApiUrl": "https://api.openai.com/v1",
   "SystemPrompt": "一个小小助手",
  "Timeout":20,
  "History":10,
  "MetaInfo":{}
}
```
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 温度
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 最大token数
    */
    @SerializedName("MaxTokens")
    @Expose
    private Long MaxTokens;

    /**
    * topP
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 工具ID列表
    */
    @SerializedName("Tools")
    @Expose
    private String [] Tools;

    /**
     * Get 支持的LLM类型，openai-OPENAI格式。 
     * @return LLMType 支持的LLM类型，openai-OPENAI格式。
     */
    public String getLLMType() {
        return this.LLMType;
    }

    /**
     * Set 支持的LLM类型，openai-OPENAI格式。
     * @param LLMType 支持的LLM类型，openai-OPENAI格式。
     */
    public void setLLMType(String LLMType) {
        this.LLMType = LLMType;
    }

    /**
     * Get 是否开启 
     * @return Enabled 是否开启
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启
     * @param Enabled 是否开启
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 模型 
     * @return Model 模型
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型
     * @param Model 模型
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 是否开启 
     * @return Streaming 是否开启
     */
    public Boolean getStreaming() {
        return this.Streaming;
    }

    /**
     * Set 是否开启
     * @param Streaming 是否开启
     */
    public void setStreaming(Boolean Streaming) {
        this.Streaming = Streaming;
    }

    /**
     * Get 配置信息JSON字符串，根据`LLMType`进行不同的值匹配。例如`LLMType`是`openai`，`Config`值是`{\"ApiKey\":\"sk-09***\",\"ApiUrl\":\"base_url\",\"SystemPrompt\":\"你是一个语音助手\",\"Timeout\":30,\"History\":0,\"MetaInfo\":{\"productID\":\"test\"}}`

## openai
```
{
   "ApiKey": "sk-XXXXXXXXXXXX",
   "ApiUrl": "https://api.openai.com/v1",
   "SystemPrompt": "一个小小助手",
  "Timeout":20,
  "History":10,
  "MetaInfo":{}
}
``` 
     * @return Config 配置信息JSON字符串，根据`LLMType`进行不同的值匹配。例如`LLMType`是`openai`，`Config`值是`{\"ApiKey\":\"sk-09***\",\"ApiUrl\":\"base_url\",\"SystemPrompt\":\"你是一个语音助手\",\"Timeout\":30,\"History\":0,\"MetaInfo\":{\"productID\":\"test\"}}`

## openai
```
{
   "ApiKey": "sk-XXXXXXXXXXXX",
   "ApiUrl": "https://api.openai.com/v1",
   "SystemPrompt": "一个小小助手",
  "Timeout":20,
  "History":10,
  "MetaInfo":{}
}
```
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置信息JSON字符串，根据`LLMType`进行不同的值匹配。例如`LLMType`是`openai`，`Config`值是`{\"ApiKey\":\"sk-09***\",\"ApiUrl\":\"base_url\",\"SystemPrompt\":\"你是一个语音助手\",\"Timeout\":30,\"History\":0,\"MetaInfo\":{\"productID\":\"test\"}}`

## openai
```
{
   "ApiKey": "sk-XXXXXXXXXXXX",
   "ApiUrl": "https://api.openai.com/v1",
   "SystemPrompt": "一个小小助手",
  "Timeout":20,
  "History":10,
  "MetaInfo":{}
}
```
     * @param Config 配置信息JSON字符串，根据`LLMType`进行不同的值匹配。例如`LLMType`是`openai`，`Config`值是`{\"ApiKey\":\"sk-09***\",\"ApiUrl\":\"base_url\",\"SystemPrompt\":\"你是一个语音助手\",\"Timeout\":30,\"History\":0,\"MetaInfo\":{\"productID\":\"test\"}}`

## openai
```
{
   "ApiKey": "sk-XXXXXXXXXXXX",
   "ApiUrl": "https://api.openai.com/v1",
   "SystemPrompt": "一个小小助手",
  "Timeout":20,
  "History":10,
  "MetaInfo":{}
}
```
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 温度 
     * @return Temperature 温度
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 温度
     * @param Temperature 温度
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 最大token数 
     * @return MaxTokens 最大token数
     */
    public Long getMaxTokens() {
        return this.MaxTokens;
    }

    /**
     * Set 最大token数
     * @param MaxTokens 最大token数
     */
    public void setMaxTokens(Long MaxTokens) {
        this.MaxTokens = MaxTokens;
    }

    /**
     * Get topP 
     * @return TopP topP
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set topP
     * @param TopP topP
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 工具ID列表 
     * @return Tools 工具ID列表
     */
    public String [] getTools() {
        return this.Tools;
    }

    /**
     * Set 工具ID列表
     * @param Tools 工具ID列表
     */
    public void setTools(String [] Tools) {
        this.Tools = Tools;
    }

    public TalkLLMConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkLLMConfigInfo(TalkLLMConfigInfo source) {
        if (source.LLMType != null) {
            this.LLMType = new String(source.LLMType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Streaming != null) {
            this.Streaming = new Boolean(source.Streaming);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.MaxTokens != null) {
            this.MaxTokens = new Long(source.MaxTokens);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Tools != null) {
            this.Tools = new String[source.Tools.length];
            for (int i = 0; i < source.Tools.length; i++) {
                this.Tools[i] = new String(source.Tools[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LLMType", this.LLMType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Streaming", this.Streaming);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "MaxTokens", this.MaxTokens);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamArraySimple(map, prefix + "Tools.", this.Tools);

    }
}

