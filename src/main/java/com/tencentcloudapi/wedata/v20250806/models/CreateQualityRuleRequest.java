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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQualityRuleRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 规则创建场景
1：单表多规则
2：多表单规则
3：克隆创建规则
    */
    @SerializedName("CreateRuleScene")
    @Expose
    private Long CreateRuleScene;

    /**
    * 单条规则信息集合	
    */
    @SerializedName("RuleBOList")
    @Expose
    private QualityRuleInfo [] RuleBOList;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 规则创建场景
1：单表多规则
2：多表单规则
3：克隆创建规则 
     * @return CreateRuleScene 规则创建场景
1：单表多规则
2：多表单规则
3：克隆创建规则
     */
    public Long getCreateRuleScene() {
        return this.CreateRuleScene;
    }

    /**
     * Set 规则创建场景
1：单表多规则
2：多表单规则
3：克隆创建规则
     * @param CreateRuleScene 规则创建场景
1：单表多规则
2：多表单规则
3：克隆创建规则
     */
    public void setCreateRuleScene(Long CreateRuleScene) {
        this.CreateRuleScene = CreateRuleScene;
    }

    /**
     * Get 单条规则信息集合	 
     * @return RuleBOList 单条规则信息集合	
     */
    public QualityRuleInfo [] getRuleBOList() {
        return this.RuleBOList;
    }

    /**
     * Set 单条规则信息集合	
     * @param RuleBOList 单条规则信息集合	
     */
    public void setRuleBOList(QualityRuleInfo [] RuleBOList) {
        this.RuleBOList = RuleBOList;
    }

    public CreateQualityRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQualityRuleRequest(CreateQualityRuleRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.CreateRuleScene != null) {
            this.CreateRuleScene = new Long(source.CreateRuleScene);
        }
        if (source.RuleBOList != null) {
            this.RuleBOList = new QualityRuleInfo[source.RuleBOList.length];
            for (int i = 0; i < source.RuleBOList.length; i++) {
                this.RuleBOList[i] = new QualityRuleInfo(source.RuleBOList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateRuleScene", this.CreateRuleScene);
        this.setParamArrayObj(map, prefix + "RuleBOList.", this.RuleBOList);

    }
}

