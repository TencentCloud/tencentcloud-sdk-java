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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class History extends AbstractModel {

    /**
    * 对话的 ID，用于唯一标识一轮对话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 原始输入的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 扩写后的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RevisedPrompt")
    @Expose
    private String RevisedPrompt;

    /**
    * 生成图的随机种子
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Seed")
    @Expose
    private Long Seed;

    /**
     * Get 对话的 ID，用于唯一标识一轮对话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChatId 对话的 ID，用于唯一标识一轮对话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 对话的 ID，用于唯一标识一轮对话
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChatId 对话的 ID，用于唯一标识一轮对话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 原始输入的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prompt 原始输入的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 原始输入的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prompt 原始输入的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 扩写后的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RevisedPrompt 扩写后的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRevisedPrompt() {
        return this.RevisedPrompt;
    }

    /**
     * Set 扩写后的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param RevisedPrompt 扩写后的 Prompt 文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRevisedPrompt(String RevisedPrompt) {
        this.RevisedPrompt = RevisedPrompt;
    }

    /**
     * Get 生成图的随机种子
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Seed 生成图的随机种子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSeed() {
        return this.Seed;
    }

    /**
     * Set 生成图的随机种子
注意：此字段可能返回 null，表示取不到有效值。
     * @param Seed 生成图的随机种子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSeed(Long Seed) {
        this.Seed = Seed;
    }

    public History() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public History(History source) {
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.RevisedPrompt != null) {
            this.RevisedPrompt = new String(source.RevisedPrompt);
        }
        if (source.Seed != null) {
            this.Seed = new Long(source.Seed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "RevisedPrompt", this.RevisedPrompt);
        this.setParamSimple(map, prefix + "Seed", this.Seed);

    }
}

