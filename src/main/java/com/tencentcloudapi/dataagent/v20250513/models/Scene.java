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
    * 场景ID
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 场景名称
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）
    */
    @SerializedName("Skills")
    @Expose
    private String [] Skills;

    /**
    * 提示词文本
    */
    @SerializedName("Prompt")
    @Expose
    private String Prompt;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 检索配置
    */
    @SerializedName("SearchConfig")
    @Expose
    private SearchConfig SearchConfig;

    /**
    * 示例问答列表
    */
    @SerializedName("ExampleQAList")
    @Expose
    private ExampleQA [] ExampleQAList;

    /**
    * 记录的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 记录的最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 创建者Uin
    */
    @SerializedName("CreatorUin")
    @Expose
    private String CreatorUin;

    /**
     * Get 场景ID 
     * @return SceneId 场景ID
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID
     * @param SceneId 场景ID
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 场景名称 
     * @return SceneName 场景名称
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 场景名称
     * @param SceneName 场景名称
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测） 
     * @return Skills 技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）
     */
    public String [] getSkills() {
        return this.Skills;
    }

    /**
     * Set 技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）
     * @param Skills 技能列表，包含：rag（知识检索）、data_analytics（数据分析）、data_prediction（数据预测）
     */
    public void setSkills(String [] Skills) {
        this.Skills = Skills;
    }

    /**
     * Get 提示词文本 
     * @return Prompt 提示词文本
     */
    public String getPrompt() {
        return this.Prompt;
    }

    /**
     * Set 提示词文本
     * @param Prompt 提示词文本
     */
    public void setPrompt(String Prompt) {
        this.Prompt = Prompt;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 检索配置 
     * @return SearchConfig 检索配置
     */
    public SearchConfig getSearchConfig() {
        return this.SearchConfig;
    }

    /**
     * Set 检索配置
     * @param SearchConfig 检索配置
     */
    public void setSearchConfig(SearchConfig SearchConfig) {
        this.SearchConfig = SearchConfig;
    }

    /**
     * Get 示例问答列表 
     * @return ExampleQAList 示例问答列表
     */
    public ExampleQA [] getExampleQAList() {
        return this.ExampleQAList;
    }

    /**
     * Set 示例问答列表
     * @param ExampleQAList 示例问答列表
     */
    public void setExampleQAList(ExampleQA [] ExampleQAList) {
        this.ExampleQAList = ExampleQAList;
    }

    /**
     * Get 记录的创建时间 
     * @return CreateTime 记录的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 记录的创建时间
     * @param CreateTime 记录的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 记录的最后更新时间 
     * @return UpdateTime 记录的最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 记录的最后更新时间
     * @param UpdateTime 记录的最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 创建者Uin 
     * @return CreatorUin 创建者Uin
     */
    public String getCreatorUin() {
        return this.CreatorUin;
    }

    /**
     * Set 创建者Uin
     * @param CreatorUin 创建者Uin
     */
    public void setCreatorUin(String CreatorUin) {
        this.CreatorUin = CreatorUin;
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

    }
}

