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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionResponse extends AbstractModel{

    /**
    * 部署好的服务Id
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 本次问答的答案。
    */
    @SerializedName("Choices")
    @Expose
    private Choice [] Choices;

    /**
    * 会话Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * token统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Usage")
    @Expose
    private Usage Usage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 部署好的服务Id 
     * @return Model 部署好的服务Id
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 部署好的服务Id
     * @param Model 部署好的服务Id
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 本次问答的答案。 
     * @return Choices 本次问答的答案。
     */
    public Choice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 本次问答的答案。
     * @param Choices 本次问答的答案。
     */
    public void setChoices(Choice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get 会话Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 会话Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 会话Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 会话Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get token统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Usage token统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Usage getUsage() {
        return this.Usage;
    }

    /**
     * Set token统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Usage token统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsage(Usage Usage) {
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

    public ChatCompletionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionResponse(ChatCompletionResponse source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Choices != null) {
            this.Choices = new Choice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new Choice(source.Choices[i]);
            }
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Usage != null) {
            this.Usage = new Usage(source.Usage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

