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

public class DeleteQualityRuleGroupRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 监控任务id
    */
    @SerializedName("RuleGroupIdList")
    @Expose
    private Long [] RuleGroupIdList;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 监控任务id 
     * @return RuleGroupIdList 监控任务id
     */
    public Long [] getRuleGroupIdList() {
        return this.RuleGroupIdList;
    }

    /**
     * Set 监控任务id
     * @param RuleGroupIdList 监控任务id
     */
    public void setRuleGroupIdList(Long [] RuleGroupIdList) {
        this.RuleGroupIdList = RuleGroupIdList;
    }

    public DeleteQualityRuleGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteQualityRuleGroupRequest(DeleteQualityRuleGroupRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.RuleGroupIdList != null) {
            this.RuleGroupIdList = new Long[source.RuleGroupIdList.length];
            for (int i = 0; i < source.RuleGroupIdList.length; i++) {
                this.RuleGroupIdList[i] = new Long(source.RuleGroupIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RuleGroupIdList.", this.RuleGroupIdList);

    }
}

