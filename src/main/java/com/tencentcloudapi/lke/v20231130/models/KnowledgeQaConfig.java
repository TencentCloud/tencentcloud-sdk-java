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

public class KnowledgeQaConfig extends AbstractModel {

    /**
    * 欢迎语，200字符以内
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Greeting")
    @Expose
    private String Greeting;

    /**
    * 角色描述，4000字符以内。通过填写描述，设定应用的 #角色名称、 #风格特点 及可达成的#意图。建议按照下面的模板填写，且自定义意图建议不超过5个。

#角色名称：
#风格特点：
#输出要求：
#能力限制：

能够达成以下用户意图
##意图名称：
##意图描述：
##意图示例：
##意图实现：

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleDescription")
    @Expose
    private String RoleDescription;

    /**
    * 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Model")
    @Expose
    private AppModel Model;

    /**
    * 知识搜索配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Search")
    @Expose
    private KnowledgeQaSearch [] Search;

    /**
    * 知识管理输出配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private KnowledgeQaOutput Output;

    /**
    * 工作流程配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workflow")
    @Expose
    private KnowledgeWorkflow Workflow;

    /**
    * 检索范围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchRange")
    @Expose
    private SearchRange SearchRange;

    /**
    * 应用模式，standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pattern")
    @Expose
    private String Pattern;

    /**
    * 检索策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchStrategy")
    @Expose
    private SearchStrategy SearchStrategy;

    /**
    * 单工作流ID，Pattern为single_workflow时传入
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SingleWorkflow")
    @Expose
    private KnowledgeQaSingleWorkflow SingleWorkflow;

    /**
    * 应用关联插件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Plugins")
    @Expose
    private KnowledgeQaPlugin [] Plugins;

    /**
    * 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ThoughtModel")
    @Expose
    private AppModel ThoughtModel;

    /**
    * 意图达成方式优先级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentAchievements")
    @Expose
    private IntentAchievement [] IntentAchievements;

    /**
    * 是否开启图文检索
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTextRetrieval")
    @Expose
    private Boolean ImageTextRetrieval;

    /**
    * 配置语音通话参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AiCall")
    @Expose
    private AICallConfig AiCall;

    /**
     * Get 欢迎语，200字符以内
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Greeting 欢迎语，200字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGreeting() {
        return this.Greeting;
    }

    /**
     * Set 欢迎语，200字符以内
注意：此字段可能返回 null，表示取不到有效值。
     * @param Greeting 欢迎语，200字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGreeting(String Greeting) {
        this.Greeting = Greeting;
    }

    /**
     * Get 角色描述，4000字符以内。通过填写描述，设定应用的 #角色名称、 #风格特点 及可达成的#意图。建议按照下面的模板填写，且自定义意图建议不超过5个。

#角色名称：
#风格特点：
#输出要求：
#能力限制：

能够达成以下用户意图
##意图名称：
##意图描述：
##意图示例：
##意图实现：

注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleDescription 角色描述，4000字符以内。通过填写描述，设定应用的 #角色名称、 #风格特点 及可达成的#意图。建议按照下面的模板填写，且自定义意图建议不超过5个。

#角色名称：
#风格特点：
#输出要求：
#能力限制：

能够达成以下用户意图
##意图名称：
##意图描述：
##意图示例：
##意图实现：

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleDescription() {
        return this.RoleDescription;
    }

    /**
     * Set 角色描述，4000字符以内。通过填写描述，设定应用的 #角色名称、 #风格特点 及可达成的#意图。建议按照下面的模板填写，且自定义意图建议不超过5个。

#角色名称：
#风格特点：
#输出要求：
#能力限制：

能够达成以下用户意图
##意图名称：
##意图描述：
##意图示例：
##意图实现：

注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleDescription 角色描述，4000字符以内。通过填写描述，设定应用的 #角色名称、 #风格特点 及可达成的#意图。建议按照下面的模板填写，且自定义意图建议不超过5个。

#角色名称：
#风格特点：
#输出要求：
#能力限制：

能够达成以下用户意图
##意图名称：
##意图描述：
##意图示例：
##意图实现：

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleDescription(String RoleDescription) {
        this.RoleDescription = RoleDescription;
    }

    /**
     * Get 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppModel getModel() {
        return this.Model;
    }

    /**
     * Set 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 生成模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModel(AppModel Model) {
        this.Model = Model;
    }

    /**
     * Get 知识搜索配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Search 知识搜索配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaSearch [] getSearch() {
        return this.Search;
    }

    /**
     * Set 知识搜索配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Search 知识搜索配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearch(KnowledgeQaSearch [] Search) {
        this.Search = Search;
    }

    /**
     * Get 知识管理输出配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output 知识管理输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaOutput getOutput() {
        return this.Output;
    }

    /**
     * Set 知识管理输出配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output 知识管理输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(KnowledgeQaOutput Output) {
        this.Output = Output;
    }

    /**
     * Get 工作流程配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workflow 工作流程配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeWorkflow getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set 工作流程配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workflow 工作流程配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflow(KnowledgeWorkflow Workflow) {
        this.Workflow = Workflow;
    }

    /**
     * Get 检索范围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchRange 检索范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchRange getSearchRange() {
        return this.SearchRange;
    }

    /**
     * Set 检索范围
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchRange 检索范围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchRange(SearchRange SearchRange) {
        this.SearchRange = SearchRange;
    }

    /**
     * Get 应用模式，standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pattern 应用模式，standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPattern() {
        return this.Pattern;
    }

    /**
     * Set 应用模式，standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pattern 应用模式，standard:标准模式, agent: agent模式，single_workflow：单工作流模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPattern(String Pattern) {
        this.Pattern = Pattern;
    }

    /**
     * Get 检索策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchStrategy 检索策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchStrategy getSearchStrategy() {
        return this.SearchStrategy;
    }

    /**
     * Set 检索策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchStrategy 检索策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchStrategy(SearchStrategy SearchStrategy) {
        this.SearchStrategy = SearchStrategy;
    }

    /**
     * Get 单工作流ID，Pattern为single_workflow时传入
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SingleWorkflow 单工作流ID，Pattern为single_workflow时传入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaSingleWorkflow getSingleWorkflow() {
        return this.SingleWorkflow;
    }

    /**
     * Set 单工作流ID，Pattern为single_workflow时传入
注意：此字段可能返回 null，表示取不到有效值。
     * @param SingleWorkflow 单工作流ID，Pattern为single_workflow时传入
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingleWorkflow(KnowledgeQaSingleWorkflow SingleWorkflow) {
        this.SingleWorkflow = SingleWorkflow;
    }

    /**
     * Get 应用关联插件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Plugins 应用关联插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeQaPlugin [] getPlugins() {
        return this.Plugins;
    }

    /**
     * Set 应用关联插件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Plugins 应用关联插件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlugins(KnowledgeQaPlugin [] Plugins) {
        this.Plugins = Plugins;
    }

    /**
     * Get 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ThoughtModel 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppModel getThoughtModel() {
        return this.ThoughtModel;
    }

    /**
     * Set 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ThoughtModel 思考模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThoughtModel(AppModel ThoughtModel) {
        this.ThoughtModel = ThoughtModel;
    }

    /**
     * Get 意图达成方式优先级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntentAchievements 意图达成方式优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IntentAchievement [] getIntentAchievements() {
        return this.IntentAchievements;
    }

    /**
     * Set 意图达成方式优先级
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentAchievements 意图达成方式优先级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentAchievements(IntentAchievement [] IntentAchievements) {
        this.IntentAchievements = IntentAchievements;
    }

    /**
     * Get 是否开启图文检索
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTextRetrieval 是否开启图文检索
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getImageTextRetrieval() {
        return this.ImageTextRetrieval;
    }

    /**
     * Set 是否开启图文检索
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTextRetrieval 是否开启图文检索
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTextRetrieval(Boolean ImageTextRetrieval) {
        this.ImageTextRetrieval = ImageTextRetrieval;
    }

    /**
     * Get 配置语音通话参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AiCall 配置语音通话参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AICallConfig getAiCall() {
        return this.AiCall;
    }

    /**
     * Set 配置语音通话参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AiCall 配置语音通话参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAiCall(AICallConfig AiCall) {
        this.AiCall = AiCall;
    }

    public KnowledgeQaConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaConfig(KnowledgeQaConfig source) {
        if (source.Greeting != null) {
            this.Greeting = new String(source.Greeting);
        }
        if (source.RoleDescription != null) {
            this.RoleDescription = new String(source.RoleDescription);
        }
        if (source.Model != null) {
            this.Model = new AppModel(source.Model);
        }
        if (source.Search != null) {
            this.Search = new KnowledgeQaSearch[source.Search.length];
            for (int i = 0; i < source.Search.length; i++) {
                this.Search[i] = new KnowledgeQaSearch(source.Search[i]);
            }
        }
        if (source.Output != null) {
            this.Output = new KnowledgeQaOutput(source.Output);
        }
        if (source.Workflow != null) {
            this.Workflow = new KnowledgeWorkflow(source.Workflow);
        }
        if (source.SearchRange != null) {
            this.SearchRange = new SearchRange(source.SearchRange);
        }
        if (source.Pattern != null) {
            this.Pattern = new String(source.Pattern);
        }
        if (source.SearchStrategy != null) {
            this.SearchStrategy = new SearchStrategy(source.SearchStrategy);
        }
        if (source.SingleWorkflow != null) {
            this.SingleWorkflow = new KnowledgeQaSingleWorkflow(source.SingleWorkflow);
        }
        if (source.Plugins != null) {
            this.Plugins = new KnowledgeQaPlugin[source.Plugins.length];
            for (int i = 0; i < source.Plugins.length; i++) {
                this.Plugins[i] = new KnowledgeQaPlugin(source.Plugins[i]);
            }
        }
        if (source.ThoughtModel != null) {
            this.ThoughtModel = new AppModel(source.ThoughtModel);
        }
        if (source.IntentAchievements != null) {
            this.IntentAchievements = new IntentAchievement[source.IntentAchievements.length];
            for (int i = 0; i < source.IntentAchievements.length; i++) {
                this.IntentAchievements[i] = new IntentAchievement(source.IntentAchievements[i]);
            }
        }
        if (source.ImageTextRetrieval != null) {
            this.ImageTextRetrieval = new Boolean(source.ImageTextRetrieval);
        }
        if (source.AiCall != null) {
            this.AiCall = new AICallConfig(source.AiCall);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Greeting", this.Greeting);
        this.setParamSimple(map, prefix + "RoleDescription", this.RoleDescription);
        this.setParamObj(map, prefix + "Model.", this.Model);
        this.setParamArrayObj(map, prefix + "Search.", this.Search);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamObj(map, prefix + "Workflow.", this.Workflow);
        this.setParamObj(map, prefix + "SearchRange.", this.SearchRange);
        this.setParamSimple(map, prefix + "Pattern", this.Pattern);
        this.setParamObj(map, prefix + "SearchStrategy.", this.SearchStrategy);
        this.setParamObj(map, prefix + "SingleWorkflow.", this.SingleWorkflow);
        this.setParamArrayObj(map, prefix + "Plugins.", this.Plugins);
        this.setParamObj(map, prefix + "ThoughtModel.", this.ThoughtModel);
        this.setParamArrayObj(map, prefix + "IntentAchievements.", this.IntentAchievements);
        this.setParamSimple(map, prefix + "ImageTextRetrieval", this.ImageTextRetrieval);
        this.setParamObj(map, prefix + "AiCall.", this.AiCall);

    }
}

