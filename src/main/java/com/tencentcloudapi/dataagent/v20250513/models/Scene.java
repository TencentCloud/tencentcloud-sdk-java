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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Scene extends AbstractModel {

    /**
    * <p>场景ID</p>
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * <p>场景名称</p>
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * <p>技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）</p>
    */
    @SerializedName("Skills")
    @Expose
    private String [] Skills;

    /**
    * <p>提示词文本</p>
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>检索配置</p>
    */
    @SerializedName("SearchConfig")
    @Expose
    private SearchConfig SearchConfig;

    /**
    * <p>示例问答列表</p>
    */
    @SerializedName("ExampleQAList")
    @Expose
    private ExampleQA [] ExampleQAList;

    /**
    * <p>记录的创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>记录的最后更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>创建者Uin</p>
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
    * <p>知识</p>
    */
    @SerializedName("Knowledge")
    @Expose
    private String Knowledge;

    /**
     * Get <p>场景ID</p> 
     * @return SceneId <p>场景ID</p>
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set <p>场景ID</p>
     * @param SceneId <p>场景ID</p>
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get <p>场景名称</p> 
     * @return SceneName <p>场景名称</p>
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set <p>场景名称</p>
     * @param SceneName <p>场景名称</p>
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get <p>技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）</p> 
     * @return Skills <p>技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）</p>
     */
    public String [] getSkills() {
        return this.Skills;
    }

    /**
     * Set <p>技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）</p>
     * @param Skills <p>技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）</p>
     */
    public void setSkills(String [] Skills) {
        this.Skills = Skills;
    }

    /**
     * Get <p>提示词文本</p> 
     * @return Prompt <p>提示词文本</p>
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set <p>提示词文本</p>
     * @param Prompt <p>提示词文本</p>
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>检索配置</p> 
     * @return SearchConfig <p>检索配置</p>
     */
    public SearchConfig getSearchConfig() {
        return this.SearchConfig;
    }

    /**
     * Set <p>检索配置</p>
     * @param SearchConfig <p>检索配置</p>
     */
    public void setSearchConfig(SearchConfig SearchConfig) {
        this.SearchConfig = SearchConfig;
    }

    /**
     * Get <p>示例问答列表</p> 
     * @return ExampleQAList <p>示例问答列表</p>
     */
    public ExampleQA [] getExampleQAList() {
        return this.ExampleQAList;
    }

    /**
     * Set <p>示例问答列表</p>
     * @param ExampleQAList <p>示例问答列表</p>
     */
    public void setExampleQAList(ExampleQA [] ExampleQAList) {
        this.ExampleQAList = ExampleQAList;
    }

    /**
     * Get <p>记录的创建时间</p> 
     * @return CreateTime <p>记录的创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>记录的创建时间</p>
     * @param CreateTime <p>记录的创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>记录的最后更新时间</p> 
     * @return UpdateTime <p>记录的最后更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>记录的最后更新时间</p>
     * @param UpdateTime <p>记录的最后更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>创建者Uin</p> 
     * @return CreatorUin <p>创建者Uin</p>
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set <p>创建者Uin</p>
     * @param CreatorUin <p>创建者Uin</p>
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
    }

    /**
     * Get <p>知识</p> 
     * @return Knowledge <p>知识</p>
     */
    public String getKnowledge() {
        return this.Knowledge;
    }

    /**
     * Set <p>知识</p>
     * @param Knowledge <p>知识</p>
     */
    public void setKnowledge(String Knowledge) {
        this.Knowledge = Knowledge;
    }

    public Scene() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Scene(Scene source) {
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.Skills != null) {
            this.Skills = new String[source.Skills.length];
            for (int i = 0; i < source.Skills.length; i++) {
                this.Skills[i] = new String(source.Skills[i]);
            }
        }
        if (source.Prompt != null) {
            this.Prompt = new String(source.Prompt);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SearchConfig != null) {
            this.SearchConfig = new SearchConfig(source.SearchConfig);
        }
        if (source.ExampleQAList != null) {
            this.ExampleQAList = new ExampleQA[source.ExampleQAList.length];
            for (int i = 0; i < source.ExampleQAList.length; i++) {
                this.ExampleQAList[i] = new ExampleQA(source.ExampleQAList[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreatorUin != null) {
            this.CreatorUin = new String(source.CreatorUin);
        }
        if (source.Knowledge != null) {
            this.Knowledge = new String(source.Knowledge);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamArraySimple(map, prefix + "Skills.", this.Skills);
        this.setParamSimple(map, prefix + "Prompt", this.Prompt);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "SearchConfig.", this.SearchConfig);
        this.setParamArrayObj(map, prefix + "ExampleQAList.", this.ExampleQAList);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreatorUin", this.CreatorUin);
        this.setParamSimple(map, prefix + "Knowledge", this.Knowledge);

    }
}

