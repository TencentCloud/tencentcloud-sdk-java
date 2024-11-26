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
    * 角色描述，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleDescription")
    @Expose
    private String RoleDescription;

    /**
    * 模型配置
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
     * Get 角色描述，300字符以内
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleDescription 角色描述，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleDescription() {
        return this.RoleDescription;
    }

    /**
     * Set 角色描述，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleDescription 角色描述，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleDescription(String RoleDescription) {
        this.RoleDescription = RoleDescription;
    }

    /**
     * Get 模型配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Model 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppModel getModel() {
        return this.Model;
    }

    /**
     * Set 模型配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Model 模型配置
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

    }
}

