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
    * AI通话配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiCall")
    @Expose
    private AICallConfig AiCall;

    /**
    * 背景图片配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BackgroundImage")
    @Expose
    private BackgroundImage BackgroundImage;

    /**
    * 兜底回复开关
    */
    @SerializedName("EnableFallbackReply")
    @Expose
    private Boolean EnableFallbackReply;

    /**
    * 是否使用推荐问
    */
    @SerializedName("EnableRecommended")
    @Expose
    private Boolean EnableRecommended;

    /**
    * 是否使用联网搜索
    */
    @SerializedName("EnableWebSearch")
    @Expose
    private Boolean EnableWebSearch;

    /**
    * 兜底回复语
    */
    @SerializedName("FallbackReply")
    @Expose
    private String FallbackReply;

    /**
    * 输入框配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputBoxConfig")
    @Expose
    private InputBoxConfig InputBoxConfig;

    /**
    * 输出方式。枚举值: 1:流式, 2:非流式
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt
    */
    @SerializedName("RecommendPromptMode")
    @Expose
    private Long RecommendPromptMode;

    /**
     * Get AI通话配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiCall AI通话配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallConfig getAiCall() {
        return this.AiCall;
    }

    /**
     * Set AI通话配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiCall AI通话配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiCall(AICallConfig AiCall) {
        this.AiCall = AiCall;
    }

    /**
     * Get 背景图片配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BackgroundImage 背景图片配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BackgroundImage getBackgroundImage() {
        return this.BackgroundImage;
    }

    /**
     * Set 背景图片配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param BackgroundImage 背景图片配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBackgroundImage(BackgroundImage BackgroundImage) {
        this.BackgroundImage = BackgroundImage;
    }

    /**
     * Get 兜底回复开关 
     * @return EnableFallbackReply 兜底回复开关
     */
    public Boolean getEnableFallbackReply() {
        return this.EnableFallbackReply;
    }

    /**
     * Set 兜底回复开关
     * @param EnableFallbackReply 兜底回复开关
     */
    public void setEnableFallbackReply(Boolean EnableFallbackReply) {
        this.EnableFallbackReply = EnableFallbackReply;
    }

    /**
     * Get 是否使用推荐问 
     * @return EnableRecommended 是否使用推荐问
     */
    public Boolean getEnableRecommended() {
        return this.EnableRecommended;
    }

    /**
     * Set 是否使用推荐问
     * @param EnableRecommended 是否使用推荐问
     */
    public void setEnableRecommended(Boolean EnableRecommended) {
        this.EnableRecommended = EnableRecommended;
    }

    /**
     * Get 是否使用联网搜索 
     * @return EnableWebSearch 是否使用联网搜索
     */
    public Boolean getEnableWebSearch() {
        return this.EnableWebSearch;
    }

    /**
     * Set 是否使用联网搜索
     * @param EnableWebSearch 是否使用联网搜索
     */
    public void setEnableWebSearch(Boolean EnableWebSearch) {
        this.EnableWebSearch = EnableWebSearch;
    }

    /**
     * Get 兜底回复语 
     * @return FallbackReply 兜底回复语
     */
    public String getFallbackReply() {
        return this.FallbackReply;
    }

    /**
     * Set 兜底回复语
     * @param FallbackReply 兜底回复语
     */
    public void setFallbackReply(String FallbackReply) {
        this.FallbackReply = FallbackReply;
    }

    /**
     * Get 输入框配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputBoxConfig 输入框配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InputBoxConfig getInputBoxConfig() {
        return this.InputBoxConfig;
    }

    /**
     * Set 输入框配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputBoxConfig 输入框配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputBoxConfig(InputBoxConfig InputBoxConfig) {
        this.InputBoxConfig = InputBoxConfig;
    }

    /**
     * Get 输出方式。枚举值: 1:流式, 2:非流式 
     * @return Method 输出方式。枚举值: 1:流式, 2:非流式
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 输出方式。枚举值: 1:流式, 2:非流式
     * @param Method 输出方式。枚举值: 1:流式, 2:非流式
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt 
     * @return RecommendPromptMode 推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt
     */
    public Long getRecommendPromptMode() {
        return this.RecommendPromptMode;
    }

    /**
     * Set 推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt
     * @param RecommendPromptMode 推荐问生成prompt模式。枚举值: 1:仅结合知识库输出推荐问的prompt
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

