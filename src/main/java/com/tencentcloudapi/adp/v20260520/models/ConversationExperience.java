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

public class ConversationExperience extends AbstractModel {

    /**
    * <p>AI通话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiCall")
    @Expose
    private AICallConfig AiCall;

    /**
    * <p>背景图片配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackgroundImage")
    @Expose
    private BackgroundImage BackgroundImage;

    /**
    * <p>兜底回复开关</p>
    */
    @SerializedName("EnableFallbackReply")
    @Expose
    private Boolean EnableFallbackReply;

    /**
    * <p>是否使用推荐问</p>
    */
    @SerializedName("EnableRecommended")
    @Expose
    private Boolean EnableRecommended;

    /**
    * <p>是否使用联网搜索</p>
    */
    @SerializedName("EnableWebSearch")
    @Expose
    private Boolean EnableWebSearch;

    /**
    * <p>兜底回复语</p>
    */
    @SerializedName("FallbackReply")
    @Expose
    private String FallbackReply;

    /**
    * <p>输入框配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputBoxConfig")
    @Expose
    private InputBoxConfig InputBoxConfig;

    /**
    * <p>输出方式。枚举值: 1:流式, 2:非流式</p>
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * <p>推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt</p>
    */
    @SerializedName("RecommendPromptMode")
    @Expose
    private Long RecommendPromptMode;

    /**
     * Get <p>AI通话配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiCall <p>AI通话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallConfig getAiCall() {
        return this.AiCall;
    }

    /**
     * Set <p>AI通话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiCall <p>AI通话配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiCall(AICallConfig AiCall) {
        this.AiCall = AiCall;
    }

    /**
     * Get <p>背景图片配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackgroundImage <p>背景图片配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackgroundImage getBackgroundImage() {
        return this.BackgroundImage;
    }

    /**
     * Set <p>背景图片配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackgroundImage <p>背景图片配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackgroundImage(BackgroundImage BackgroundImage) {
        this.BackgroundImage = BackgroundImage;
    }

    /**
     * Get <p>兜底回复开关</p> 
     * @return EnableFallbackReply <p>兜底回复开关</p>
     */
    public Boolean getEnableFallbackReply() {
        return this.EnableFallbackReply;
    }

    /**
     * Set <p>兜底回复开关</p>
     * @param EnableFallbackReply <p>兜底回复开关</p>
     */
    public void setEnableFallbackReply(Boolean EnableFallbackReply) {
        this.EnableFallbackReply = EnableFallbackReply;
    }

    /**
     * Get <p>是否使用推荐问</p> 
     * @return EnableRecommended <p>是否使用推荐问</p>
     */
    public Boolean getEnableRecommended() {
        return this.EnableRecommended;
    }

    /**
     * Set <p>是否使用推荐问</p>
     * @param EnableRecommended <p>是否使用推荐问</p>
     */
    public void setEnableRecommended(Boolean EnableRecommended) {
        this.EnableRecommended = EnableRecommended;
    }

    /**
     * Get <p>是否使用联网搜索</p> 
     * @return EnableWebSearch <p>是否使用联网搜索</p>
     */
    public Boolean getEnableWebSearch() {
        return this.EnableWebSearch;
    }

    /**
     * Set <p>是否使用联网搜索</p>
     * @param EnableWebSearch <p>是否使用联网搜索</p>
     */
    public void setEnableWebSearch(Boolean EnableWebSearch) {
        this.EnableWebSearch = EnableWebSearch;
    }

    /**
     * Get <p>兜底回复语</p> 
     * @return FallbackReply <p>兜底回复语</p>
     */
    public String getFallbackReply() {
        return this.FallbackReply;
    }

    /**
     * Set <p>兜底回复语</p>
     * @param FallbackReply <p>兜底回复语</p>
     */
    public void setFallbackReply(String FallbackReply) {
        this.FallbackReply = FallbackReply;
    }

    /**
     * Get <p>输入框配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputBoxConfig <p>输入框配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputBoxConfig getInputBoxConfig() {
        return this.InputBoxConfig;
    }

    /**
     * Set <p>输入框配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputBoxConfig <p>输入框配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputBoxConfig(InputBoxConfig InputBoxConfig) {
        this.InputBoxConfig = InputBoxConfig;
    }

    /**
     * Get <p>输出方式。枚举值: 1:流式, 2:非流式</p> 
     * @return Method <p>输出方式。枚举值: 1:流式, 2:非流式</p>
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set <p>输出方式。枚举值: 1:流式, 2:非流式</p>
     * @param Method <p>输出方式。枚举值: 1:流式, 2:非流式</p>
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get <p>推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt</p> 
     * @return RecommendPromptMode <p>推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt</p>
     */
    public Long getRecommendPromptMode() {
        return this.RecommendPromptMode;
    }

    /**
     * Set <p>推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt</p>
     * @param RecommendPromptMode <p>推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt</p>
     */
    public void setRecommendPromptMode(Long RecommendPromptMode) {
        this.RecommendPromptMode = RecommendPromptMode;
    }

    public ConversationExperience() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationExperience(ConversationExperience source) {
        if (source.AiCall != null) {
            this.AiCall = new AICallConfig(source.AiCall);
        }
        if (source.BackgroundImage != null) {
            this.BackgroundImage = new BackgroundImage(source.BackgroundImage);
        }
        if (source.EnableFallbackReply != null) {
            this.EnableFallbackReply = new Boolean(source.EnableFallbackReply);
        }
        if (source.EnableRecommended != null) {
            this.EnableRecommended = new Boolean(source.EnableRecommended);
        }
        if (source.EnableWebSearch != null) {
            this.EnableWebSearch = new Boolean(source.EnableWebSearch);
        }
        if (source.FallbackReply != null) {
            this.FallbackReply = new String(source.FallbackReply);
        }
        if (source.InputBoxConfig != null) {
            this.InputBoxConfig = new InputBoxConfig(source.InputBoxConfig);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.RecommendPromptMode != null) {
            this.RecommendPromptMode = new Long(source.RecommendPromptMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AiCall.", this.AiCall);
        this.setParamObj(map, prefix + "BackgroundImage.", this.BackgroundImage);
        this.setParamSimple(map, prefix + "EnableFallbackReply", this.EnableFallbackReply);
        this.setParamSimple(map, prefix + "EnableRecommended", this.EnableRecommended);
        this.setParamSimple(map, prefix + "EnableWebSearch", this.EnableWebSearch);
        this.setParamSimple(map, prefix + "FallbackReply", this.FallbackReply);
        this.setParamObj(map, prefix + "InputBoxConfig.", this.InputBoxConfig);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "RecommendPromptMode", this.RecommendPromptMode);

    }
}

