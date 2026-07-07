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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TierItem extends AbstractModel {

    /**
    * <p>该分层下的模型显示名称列表。</p><p>至少包含一个模型，模型名称必须是已关联到该模型路由实例的模型。同一分层内不允许重复模型名称。</p>
    */
    @SerializedName("Models")
    @Expose
    private String [] Models;

    /**
    * <p>Tier 标识。<br>枚举值：</p><ul><li>复杂度分层（4 个固定值，需全部包含）：SIMPLE、MEDIUM、COMPLEX、REASONING</li><li>default：默认</li><li>general_chat：通用对话</li><li>transformation_rewrite：转换与改写</li><li>knowledge_qa：知识问答</li><li>summarization：摘要</li><li>extraction_structuring：抽取与结构化输出</li><li>content_generation：内容生成</li><li>coding_technical：编码与技术</li><li>data_math_analysis：数据、数学与分析</li><li>reasoning_planning：推理与规划</li><li>tool_agentic_workflow：工具与智能体工作流</li></ul>
    */
    @SerializedName("TierName")
    @Expose
    private String TierName;

    /**
     * Get <p>该分层下的模型显示名称列表。</p><p>至少包含一个模型，模型名称必须是已关联到该模型路由实例的模型。同一分层内不允许重复模型名称。</p> 
     * @return Models <p>该分层下的模型显示名称列表。</p><p>至少包含一个模型，模型名称必须是已关联到该模型路由实例的模型。同一分层内不允许重复模型名称。</p>
     */
    public String [] getModels() {
        return this.Models;
    }

    /**
     * Set <p>该分层下的模型显示名称列表。</p><p>至少包含一个模型，模型名称必须是已关联到该模型路由实例的模型。同一分层内不允许重复模型名称。</p>
     * @param Models <p>该分层下的模型显示名称列表。</p><p>至少包含一个模型，模型名称必须是已关联到该模型路由实例的模型。同一分层内不允许重复模型名称。</p>
     */
    public void setModels(String [] Models) {
        this.Models = Models;
    }

    /**
     * Get <p>Tier 标识。<br>枚举值：</p><ul><li>复杂度分层（4 个固定值，需全部包含）：SIMPLE、MEDIUM、COMPLEX、REASONING</li><li>default：默认</li><li>general_chat：通用对话</li><li>transformation_rewrite：转换与改写</li><li>knowledge_qa：知识问答</li><li>summarization：摘要</li><li>extraction_structuring：抽取与结构化输出</li><li>content_generation：内容生成</li><li>coding_technical：编码与技术</li><li>data_math_analysis：数据、数学与分析</li><li>reasoning_planning：推理与规划</li><li>tool_agentic_workflow：工具与智能体工作流</li></ul> 
     * @return TierName <p>Tier 标识。<br>枚举值：</p><ul><li>复杂度分层（4 个固定值，需全部包含）：SIMPLE、MEDIUM、COMPLEX、REASONING</li><li>default：默认</li><li>general_chat：通用对话</li><li>transformation_rewrite：转换与改写</li><li>knowledge_qa：知识问答</li><li>summarization：摘要</li><li>extraction_structuring：抽取与结构化输出</li><li>content_generation：内容生成</li><li>coding_technical：编码与技术</li><li>data_math_analysis：数据、数学与分析</li><li>reasoning_planning：推理与规划</li><li>tool_agentic_workflow：工具与智能体工作流</li></ul>
     */
    public String getTierName() {
        return this.TierName;
    }

    /**
     * Set <p>Tier 标识。<br>枚举值：</p><ul><li>复杂度分层（4 个固定值，需全部包含）：SIMPLE、MEDIUM、COMPLEX、REASONING</li><li>default：默认</li><li>general_chat：通用对话</li><li>transformation_rewrite：转换与改写</li><li>knowledge_qa：知识问答</li><li>summarization：摘要</li><li>extraction_structuring：抽取与结构化输出</li><li>content_generation：内容生成</li><li>coding_technical：编码与技术</li><li>data_math_analysis：数据、数学与分析</li><li>reasoning_planning：推理与规划</li><li>tool_agentic_workflow：工具与智能体工作流</li></ul>
     * @param TierName <p>Tier 标识。<br>枚举值：</p><ul><li>复杂度分层（4 个固定值，需全部包含）：SIMPLE、MEDIUM、COMPLEX、REASONING</li><li>default：默认</li><li>general_chat：通用对话</li><li>transformation_rewrite：转换与改写</li><li>knowledge_qa：知识问答</li><li>summarization：摘要</li><li>extraction_structuring：抽取与结构化输出</li><li>content_generation：内容生成</li><li>coding_technical：编码与技术</li><li>data_math_analysis：数据、数学与分析</li><li>reasoning_planning：推理与规划</li><li>tool_agentic_workflow：工具与智能体工作流</li></ul>
     */
    public void setTierName(String TierName) {
        this.TierName = TierName;
    }

    public TierItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TierItem(TierItem source) {
        if (source.Models != null) {
            this.Models = new String[source.Models.length];
            for (int i = 0; i < source.Models.length; i++) {
                this.Models[i] = new String(source.Models[i]);
            }
        }
        if (source.TierName != null) {
            this.TierName = new String(source.TierName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Models.", this.Models);
        this.setParamSimple(map, prefix + "TierName", this.TierName);

    }
}

