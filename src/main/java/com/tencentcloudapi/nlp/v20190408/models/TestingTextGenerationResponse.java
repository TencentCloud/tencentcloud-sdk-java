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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestingTextGenerationResponse extends AbstractModel{

    /**
    * 结果
    */
    @SerializedName("Choices")
    @Expose
    private TextGenerationChoices [] Choices;

    /**
    * unix时间戳的字符串
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * 会话id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 模型名
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * token数量
    */
    @SerializedName("Usage")
    @Expose
    private TextGenerationUsage Usage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果 
     * @return Choices 结果
     */
    public TextGenerationChoices [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 结果
     * @param Choices 结果
     */
    public void setChoices(TextGenerationChoices [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get unix时间戳的字符串 
     * @return Created unix时间戳的字符串
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set unix时间戳的字符串
     * @param Created unix时间戳的字符串
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get 会话id 
     * @return Id 会话id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 会话id
     * @param Id 会话id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 模型名 
     * @return Model 模型名
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名
     * @param Model 模型名
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get token数量 
     * @return Usage token数量
     */
    public TextGenerationUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set token数量
     * @param Usage token数量
     */
    public void setUsage(TextGenerationUsage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public TestingTextGenerationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestingTextGenerationResponse(TestingTextGenerationResponse source) {
        if (source.Choices != null) {
            this.Choices = new TextGenerationChoices[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new TextGenerationChoices(source.Choices[i]);
            }
        }
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Usage != null) {
            this.Usage = new TextGenerationUsage(source.Usage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

